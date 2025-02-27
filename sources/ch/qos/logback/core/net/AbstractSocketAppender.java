package ch.qos.logback.core.net;

import ch.qos.logback.core.AppenderBase;
import ch.qos.logback.core.net.SocketConnector;
import ch.qos.logback.core.spi.PreSerializationTransformer;
import ch.qos.logback.core.util.CloseUtil;
import ch.qos.logback.core.util.Duration;
import java.io.IOException;
import java.net.ConnectException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.SSLHandshakeException;
/* loaded from: classes.dex */
public abstract class AbstractSocketAppender<E> extends AppenderBase<E> implements SocketConnector.ExceptionHandler {
    private static final int DEFAULT_ACCEPT_CONNECTION_DELAY = 5000;
    private static final int DEFAULT_EVENT_DELAY_TIMEOUT = 100;
    public static final int DEFAULT_PORT = 4560;
    public static final int DEFAULT_QUEUE_SIZE = 128;
    public static final int DEFAULT_RECONNECTION_DELAY = 30000;
    private int acceptConnectionTimeout;
    private InetAddress address;
    private SocketConnector connector;
    private BlockingDeque<E> deque;
    private Duration eventDelayLimit;
    private final ObjectWriterFactory objectWriterFactory;
    private String peerId;
    private int port;
    private final QueueFactory queueFactory;
    private int queueSize;
    private Duration reconnectionDelay;
    private String remoteHost;
    private volatile Socket socket;
    private Future<?> task;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractSocketAppender() {
        this(new QueueFactory(), new ObjectWriterFactory());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void connectSocketAndDispatchEvents() {
        StringBuilder sb;
        while (socketConnectionCouldBeEstablished()) {
            try {
                try {
                    try {
                        ObjectWriter createObjectWriterForSocket = createObjectWriterForSocket();
                        addInfo(this.peerId + "connection established");
                        dispatchEvents(createObjectWriterForSocket);
                        CloseUtil.closeQuietly(this.socket);
                        this.socket = null;
                        sb = new StringBuilder();
                        sb.append(this.peerId);
                        sb.append("connection closed");
                    } catch (IOException e) {
                        addInfo(this.peerId + "connection failed: " + e);
                        CloseUtil.closeQuietly(this.socket);
                        this.socket = null;
                        sb = new StringBuilder();
                        sb.append(this.peerId);
                        sb.append("connection closed");
                    }
                } catch (SSLHandshakeException unused) {
                    Thread.sleep(30000L);
                    CloseUtil.closeQuietly(this.socket);
                    this.socket = null;
                    sb = new StringBuilder();
                    sb.append(this.peerId);
                    sb.append("connection closed");
                }
                addInfo(sb.toString());
            } catch (InterruptedException unused2) {
            }
        }
        addInfo("shutting down");
    }

    private SocketConnector createConnector(InetAddress inetAddress, int i, int i2, long j) {
        SocketConnector newConnector = newConnector(inetAddress, i, i2, j);
        newConnector.setExceptionHandler(this);
        newConnector.setSocketFactory(getSocketFactory());
        return newConnector;
    }

    private ObjectWriter createObjectWriterForSocket() throws IOException {
        this.socket.setSoTimeout(this.acceptConnectionTimeout);
        AutoFlushingObjectWriter newAutoFlushingObjectWriter = this.objectWriterFactory.newAutoFlushingObjectWriter(this.socket.getOutputStream());
        this.socket.setSoTimeout(0);
        return newAutoFlushingObjectWriter;
    }

    private void dispatchEvents(ObjectWriter objectWriter) throws InterruptedException, IOException {
        while (true) {
            E takeFirst = this.deque.takeFirst();
            postProcessEvent(takeFirst);
            try {
                objectWriter.write(getPST().transform(takeFirst));
            } catch (IOException e) {
                tryReAddingEventToFrontOfQueue(takeFirst);
                throw e;
            }
        }
    }

    private boolean socketConnectionCouldBeEstablished() throws InterruptedException {
        Socket call = this.connector.call();
        this.socket = call;
        if (call != null) {
            return true;
        }
        return false;
    }

    private void tryReAddingEventToFrontOfQueue(E e) {
        if (!this.deque.offerFirst(e)) {
            addInfo("Dropping event due to socket connection error and maxed out deque capacity");
        }
    }

    @Override // ch.qos.logback.core.AppenderBase
    protected void append(E e) {
        if (e != null && isStarted()) {
            try {
                if (!this.deque.offer(e, this.eventDelayLimit.getMilliseconds(), TimeUnit.MILLISECONDS)) {
                    addInfo("Dropping event due to timeout limit of [" + this.eventDelayLimit + "] being exceeded");
                }
            } catch (InterruptedException e2) {
                addError("Interrupted while appending event to SocketAppender", e2);
            }
        }
    }

    @Override // ch.qos.logback.core.net.SocketConnector.ExceptionHandler
    public void connectionFailed(SocketConnector socketConnector, Exception exc) {
        StringBuilder sb;
        String sb2;
        if (exc instanceof InterruptedException) {
            sb2 = "connector interrupted";
        } else {
            if (exc instanceof ConnectException) {
                sb = new StringBuilder();
                sb.append(this.peerId);
                sb.append("connection refused");
            } else {
                sb = new StringBuilder();
                sb.append(this.peerId);
                sb.append(exc);
            }
            sb2 = sb.toString();
        }
        addInfo(sb2);
    }

    public Duration getEventDelayLimit() {
        return this.eventDelayLimit;
    }

    protected abstract PreSerializationTransformer<E> getPST();

    public int getPort() {
        return this.port;
    }

    public int getQueueSize() {
        return this.queueSize;
    }

    public Duration getReconnectionDelay() {
        return this.reconnectionDelay;
    }

    public String getRemoteHost() {
        return this.remoteHost;
    }

    protected SocketFactory getSocketFactory() {
        return SocketFactory.getDefault();
    }

    protected SocketConnector newConnector(InetAddress inetAddress, int i, long j, long j2) {
        return new DefaultSocketConnector(inetAddress, i, j, j2);
    }

    protected abstract void postProcessEvent(E e);

    void setAcceptConnectionTimeout(int i) {
        this.acceptConnectionTimeout = i;
    }

    public void setEventDelayLimit(Duration duration) {
        this.eventDelayLimit = duration;
    }

    public void setPort(int i) {
        this.port = i;
    }

    public void setQueueSize(int i) {
        this.queueSize = i;
    }

    public void setReconnectionDelay(Duration duration) {
        this.reconnectionDelay = duration;
    }

    public void setRemoteHost(String str) {
        this.remoteHost = str;
    }

    @Override // ch.qos.logback.core.AppenderBase, ch.qos.logback.core.spi.LifeCycle
    public void start() {
        int i;
        if (isStarted()) {
            return;
        }
        if (this.port <= 0) {
            addError("No port was configured for appender" + this.name + " For more information, please visit http://logback.qos.ch/codes.html#socket_no_port");
            i = 1;
        } else {
            i = 0;
        }
        if (this.remoteHost == null) {
            i++;
            addError("No remote host was configured for appender" + this.name + " For more information, please visit http://logback.qos.ch/codes.html#socket_no_host");
        }
        if (this.queueSize == 0) {
            addWarn("Queue size of zero is deprecated, use a size of one to indicate synchronous processing");
        }
        if (this.queueSize < 0) {
            i++;
            addError("Queue size must be greater than zero");
        }
        if (i == 0) {
            try {
                this.address = InetAddress.getByName(this.remoteHost);
            } catch (UnknownHostException unused) {
                addError("unknown host: " + this.remoteHost);
                i++;
            }
        }
        if (i == 0) {
            this.deque = this.queueFactory.newLinkedBlockingDeque(this.queueSize);
            this.peerId = "remote peer " + this.remoteHost + ":" + this.port + ": ";
            this.connector = createConnector(this.address, this.port, 0, this.reconnectionDelay.getMilliseconds());
            this.task = getContext().getScheduledExecutorService().submit(new Runnable() { // from class: ch.qos.logback.core.net.AbstractSocketAppender.1
                @Override // java.lang.Runnable
                public void run() {
                    AbstractSocketAppender.this.connectSocketAndDispatchEvents();
                }
            });
            super.start();
        }
    }

    @Override // ch.qos.logback.core.AppenderBase, ch.qos.logback.core.spi.LifeCycle
    public void stop() {
        if (!isStarted()) {
            return;
        }
        CloseUtil.closeQuietly(this.socket);
        this.task.cancel(true);
        super.stop();
    }

    AbstractSocketAppender(QueueFactory queueFactory, ObjectWriterFactory objectWriterFactory) {
        this.port = DEFAULT_PORT;
        this.reconnectionDelay = new Duration(30000L);
        this.queueSize = 128;
        this.acceptConnectionTimeout = 5000;
        this.eventDelayLimit = new Duration(100L);
        this.objectWriterFactory = objectWriterFactory;
        this.queueFactory = queueFactory;
    }
}
