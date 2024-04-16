package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.URI;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import org.java_websocket.exceptions.InvalidHandshakeException;
/* compiled from: WebSocketClient.java */
/* renamed from: q3c  reason: default package */
/* loaded from: classes3.dex */
public abstract class q3c extends m2 implements Runnable, n3c {
    private CountDownLatch closeLatch;
    private CountDownLatch connectLatch;
    private Thread connectReadThread;
    private int connectTimeout;
    private g53 dnsResolver;
    private m73 draft;
    private s3c engine;
    private Map<String, String> headers;
    private OutputStream ostream;
    private Proxy proxy;
    private Socket socket;
    private SocketFactory socketFactory;
    protected URI uri;
    private Thread writeThread;

    /* compiled from: WebSocketClient.java */
    /* renamed from: q3c$a */
    /* loaded from: classes3.dex */
    class a implements g53 {
        a() {
        }

        @Override // defpackage.g53
        public InetAddress a(URI uri) throws UnknownHostException {
            return InetAddress.getByName(uri.getHost());
        }
    }

    /* compiled from: WebSocketClient.java */
    /* renamed from: q3c$b */
    /* loaded from: classes3.dex */
    private class b implements Runnable {
        private final q3c a;

        b(q3c q3cVar) {
            this.a = q3cVar;
        }

        private void a() {
            try {
                if (q3c.this.socket != null) {
                    q3c.this.socket.close();
                }
            } catch (IOException e) {
                q3c.this.onWebsocketError(this.a, e);
            }
        }

        private void b() throws IOException {
            while (!Thread.interrupted()) {
                try {
                    ByteBuffer take = q3c.this.engine.b.take();
                    q3c.this.ostream.write(take.array(), 0, take.limit());
                    q3c.this.ostream.flush();
                } catch (InterruptedException unused) {
                    for (ByteBuffer byteBuffer : q3c.this.engine.b) {
                        q3c.this.ostream.write(byteBuffer.array(), 0, byteBuffer.limit());
                        q3c.this.ostream.flush();
                    }
                    Thread.currentThread().interrupt();
                    return;
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            Thread currentThread = Thread.currentThread();
            currentThread.setName("WebSocketWriteThread-" + Thread.currentThread().getId());
            try {
                try {
                    b();
                } catch (IOException e) {
                    q3c.this.handleIOException(e);
                }
            } finally {
                a();
                q3c.this.writeThread = null;
            }
        }
    }

    public q3c(URI uri) {
        this(uri, new n73());
    }

    private int getPort() {
        int port = this.uri.getPort();
        String scheme = this.uri.getScheme();
        if ("wss".equals(scheme)) {
            if (port == -1) {
                return 443;
            }
            return port;
        } else if ("ws".equals(scheme)) {
            if (port == -1) {
                return 80;
            }
            return port;
        } else {
            throw new IllegalArgumentException("unknown scheme: " + scheme);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleIOException(IOException iOException) {
        if (iOException instanceof SSLException) {
            onError(iOException);
        }
        this.engine.m();
    }

    private boolean prepareSocket() throws IOException {
        if (this.proxy != Proxy.NO_PROXY) {
            this.socket = new Socket(this.proxy);
            return true;
        }
        SocketFactory socketFactory = this.socketFactory;
        if (socketFactory != null) {
            this.socket = socketFactory.createSocket();
        } else {
            Socket socket = this.socket;
            if (socket == null) {
                this.socket = new Socket(this.proxy);
                return true;
            } else if (socket.isClosed()) {
                throw new IOException();
            }
        }
        return false;
    }

    private void reset() {
        Thread currentThread = Thread.currentThread();
        if (currentThread != this.writeThread && currentThread != this.connectReadThread) {
            try {
                closeBlocking();
                Thread thread = this.writeThread;
                if (thread != null) {
                    thread.interrupt();
                    this.writeThread = null;
                }
                Thread thread2 = this.connectReadThread;
                if (thread2 != null) {
                    thread2.interrupt();
                    this.connectReadThread = null;
                }
                this.draft.s();
                Socket socket = this.socket;
                if (socket != null) {
                    socket.close();
                    this.socket = null;
                }
                this.connectLatch = new CountDownLatch(1);
                this.closeLatch = new CountDownLatch(1);
                this.engine = new s3c(this, this.draft);
                return;
            } catch (Exception e) {
                onError(e);
                this.engine.e(1006, e.getMessage());
                return;
            }
        }
        throw new IllegalStateException("You cannot initialize a reconnect out of the websocket thread. Use reconnect in another thread to ensure a successful cleanup.");
    }

    private void sendHandshake() throws InvalidHandshakeException {
        String str;
        String rawPath = this.uri.getRawPath();
        String rawQuery = this.uri.getRawQuery();
        rawPath = (rawPath == null || rawPath.length() == 0) ? "/" : "/";
        if (rawQuery != null) {
            rawPath = rawPath + '?' + rawQuery;
        }
        int port = getPort();
        StringBuilder sb = new StringBuilder();
        sb.append(this.uri.getHost());
        if (port != 80 && port != 443) {
            str = ":" + port;
        } else {
            str = "";
        }
        sb.append(str);
        String sb2 = sb.toString();
        nm4 nm4Var = new nm4();
        nm4Var.g(rawPath);
        nm4Var.put("Host", sb2);
        Map<String, String> map = this.headers;
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                nm4Var.put(entry.getKey(), entry.getValue());
            }
        }
        this.engine.K(nm4Var);
    }

    private void upgradeSocketToSSL() throws NoSuchAlgorithmException, KeyManagementException, IOException {
        SSLSocketFactory socketFactory;
        SocketFactory socketFactory2 = this.socketFactory;
        if (socketFactory2 instanceof SSLSocketFactory) {
            socketFactory = (SSLSocketFactory) socketFactory2;
        } else {
            SSLContext sSLContext = SSLContext.getInstance("TLSv1.2");
            sSLContext.init(null, null, null);
            socketFactory = sSLContext.getSocketFactory();
        }
        this.socket = socketFactory.createSocket(this.socket, this.uri.getHost(), getPort(), true);
    }

    public void addHeader(String str, String str2) {
        if (this.headers == null) {
            this.headers = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        }
        this.headers.put(str, str2);
    }

    public void clearHeaders() {
        this.headers = null;
    }

    public void close() {
        if (this.writeThread != null) {
            this.engine.a(1000);
        }
    }

    public void closeBlocking() throws InterruptedException {
        close();
        this.closeLatch.await();
    }

    public void closeConnection(int i, String str) {
        this.engine.e(i, str);
    }

    public void connect() {
        if (this.connectReadThread == null) {
            Thread thread = new Thread(this);
            this.connectReadThread = thread;
            thread.setName("WebSocketConnectReadThread-" + this.connectReadThread.getId());
            this.connectReadThread.start();
            return;
        }
        throw new IllegalStateException("WebSocketClient objects are not reuseable");
    }

    public boolean connectBlocking() throws InterruptedException {
        connect();
        this.connectLatch.await();
        return this.engine.A();
    }

    public <T> T getAttachment() {
        return (T) this.engine.p();
    }

    public n3c getConnection() {
        return this.engine;
    }

    @Override // defpackage.m2
    protected Collection<n3c> getConnections() {
        return Collections.singletonList(this.engine);
    }

    public m73 getDraft() {
        return this.draft;
    }

    @Override // defpackage.t3c
    public InetSocketAddress getLocalSocketAddress(n3c n3cVar) {
        Socket socket = this.socket;
        if (socket != null) {
            return (InetSocketAddress) socket.getLocalSocketAddress();
        }
        return null;
    }

    public qs4 getProtocol() {
        return this.engine.s();
    }

    public q79 getReadyState() {
        return this.engine.t();
    }

    @Override // defpackage.t3c
    public InetSocketAddress getRemoteSocketAddress(n3c n3cVar) {
        Socket socket = this.socket;
        if (socket != null) {
            return (InetSocketAddress) socket.getRemoteSocketAddress();
        }
        return null;
    }

    public String getResourceDescriptor() {
        return this.uri.getPath();
    }

    public SSLSession getSSLSession() {
        if (hasSSLSupport()) {
            return ((SSLSocket) this.socket).getSession();
        }
        throw new IllegalArgumentException("This websocket uses ws instead of wss. No SSLSession available.");
    }

    public Socket getSocket() {
        return this.socket;
    }

    public URI getURI() {
        return this.uri;
    }

    public boolean hasBufferedData() {
        return this.engine.w();
    }

    public boolean hasSSLSupport() {
        return this.socket instanceof SSLSocket;
    }

    public boolean isClosed() {
        return this.engine.x();
    }

    public boolean isClosing() {
        return this.engine.y();
    }

    public boolean isFlushAndClose() {
        return this.engine.z();
    }

    public boolean isOpen() {
        return this.engine.A();
    }

    public abstract void onClose(int i, String str, boolean z);

    public abstract void onError(Exception exc);

    public abstract void onMessage(String str);

    public void onMessage(ByteBuffer byteBuffer) {
    }

    public abstract void onOpen(kda kdaVar);

    protected void onSetSSLParameters(SSLParameters sSLParameters) {
        sSLParameters.setEndpointIdentificationAlgorithm("HTTPS");
    }

    @Override // defpackage.t3c
    public final void onWebsocketClose(n3c n3cVar, int i, String str, boolean z) {
        stopConnectionLostTimer();
        Thread thread = this.writeThread;
        if (thread != null) {
            thread.interrupt();
        }
        onClose(i, str, z);
        this.connectLatch.countDown();
        this.closeLatch.countDown();
    }

    @Override // defpackage.t3c
    public void onWebsocketCloseInitiated(n3c n3cVar, int i, String str) {
        onCloseInitiated(i, str);
    }

    @Override // defpackage.t3c
    public void onWebsocketClosing(n3c n3cVar, int i, String str, boolean z) {
        onClosing(i, str, z);
    }

    @Override // defpackage.t3c
    public final void onWebsocketError(n3c n3cVar, Exception exc) {
        onError(exc);
    }

    @Override // defpackage.t3c
    public final void onWebsocketMessage(n3c n3cVar, String str) {
        onMessage(str);
    }

    @Override // defpackage.t3c
    public final void onWebsocketOpen(n3c n3cVar, qm4 qm4Var) {
        startConnectionLostTimer();
        onOpen((kda) qm4Var);
        this.connectLatch.countDown();
    }

    public void reconnect() {
        reset();
        connect();
    }

    public boolean reconnectBlocking() throws InterruptedException {
        reset();
        return connectBlocking();
    }

    public String removeHeader(String str) {
        Map<String, String> map = this.headers;
        if (map == null) {
            return null;
        }
        return map.remove(str);
    }

    @Override // java.lang.Runnable
    public void run() {
        int read;
        InetSocketAddress inetSocketAddress;
        try {
            boolean prepareSocket = prepareSocket();
            this.socket.setTcpNoDelay(isTcpNoDelay());
            this.socket.setReuseAddress(isReuseAddr());
            if (!this.socket.isConnected()) {
                if (this.dnsResolver == null) {
                    inetSocketAddress = InetSocketAddress.createUnresolved(this.uri.getHost(), getPort());
                } else {
                    inetSocketAddress = new InetSocketAddress(this.dnsResolver.a(this.uri), getPort());
                }
                this.socket.connect(inetSocketAddress, this.connectTimeout);
            }
            if (prepareSocket && "wss".equals(this.uri.getScheme())) {
                upgradeSocketToSSL();
            }
            Socket socket = this.socket;
            if (socket instanceof SSLSocket) {
                SSLSocket sSLSocket = (SSLSocket) socket;
                SSLParameters sSLParameters = sSLSocket.getSSLParameters();
                onSetSSLParameters(sSLParameters);
                sSLSocket.setSSLParameters(sSLParameters);
            }
            InputStream inputStream = this.socket.getInputStream();
            this.ostream = this.socket.getOutputStream();
            sendHandshake();
            Thread thread = new Thread(new b(this));
            this.writeThread = thread;
            thread.start();
            byte[] bArr = new byte[16384];
            while (!isClosing() && !isClosed() && (read = inputStream.read(bArr)) != -1) {
                try {
                    this.engine.j(ByteBuffer.wrap(bArr, 0, read));
                } catch (IOException e) {
                    handleIOException(e);
                } catch (RuntimeException e2) {
                    onError(e2);
                    this.engine.e(1006, e2.getMessage());
                }
            }
            this.engine.m();
            this.connectReadThread = null;
        } catch (Exception e3) {
            onWebsocketError(this.engine, e3);
            this.engine.e(-1, e3.getMessage());
        } catch (InternalError e4) {
            if ((e4.getCause() instanceof InvocationTargetException) && (e4.getCause().getCause() instanceof IOException)) {
                IOException iOException = (IOException) e4.getCause().getCause();
                onWebsocketError(this.engine, iOException);
                this.engine.e(-1, iOException.getMessage());
                return;
            }
            throw e4;
        }
    }

    public void send(String str) {
        this.engine.C(str);
    }

    public void sendFragmentedFrame(ga7 ga7Var, ByteBuffer byteBuffer, boolean z) {
        this.engine.G(ga7Var, byteBuffer, z);
    }

    @Override // defpackage.n3c
    public void sendFrame(i74 i74Var) {
        this.engine.sendFrame(i74Var);
    }

    public void sendPing() {
        this.engine.I();
    }

    public <T> void setAttachment(T t) {
        this.engine.J(t);
    }

    public void setDnsResolver(g53 g53Var) {
        this.dnsResolver = g53Var;
    }

    public void setProxy(Proxy proxy) {
        if (proxy != null) {
            this.proxy = proxy;
            return;
        }
        throw new IllegalArgumentException();
    }

    @Deprecated
    public void setSocket(Socket socket) {
        if (this.socket == null) {
            this.socket = socket;
            return;
        }
        throw new IllegalStateException("socket has already been set");
    }

    public void setSocketFactory(SocketFactory socketFactory) {
        this.socketFactory = socketFactory;
    }

    public q3c(URI uri, m73 m73Var) {
        this(uri, m73Var, null, 0);
    }

    public void close(int i) {
        this.engine.a(i);
    }

    public InetSocketAddress getLocalSocketAddress() {
        return this.engine.r();
    }

    public InetSocketAddress getRemoteSocketAddress() {
        return this.engine.u();
    }

    @Override // defpackage.t3c
    public final void onWebsocketMessage(n3c n3cVar, ByteBuffer byteBuffer) {
        onMessage(byteBuffer);
    }

    public void send(byte[] bArr) {
        this.engine.F(bArr);
    }

    public void sendFrame(Collection<i74> collection) {
        this.engine.H(collection);
    }

    public q3c(URI uri, Map<String, String> map) {
        this(uri, new n73(), map);
    }

    public void close(int i, String str) {
        this.engine.b(i, str);
    }

    public void send(ByteBuffer byteBuffer) {
        this.engine.D(byteBuffer);
    }

    public q3c(URI uri, m73 m73Var, Map<String, String> map) {
        this(uri, m73Var, map, 0);
    }

    public boolean connectBlocking(long j, TimeUnit timeUnit) throws InterruptedException {
        connect();
        return this.connectLatch.await(j, timeUnit) && this.engine.A();
    }

    public q3c(URI uri, m73 m73Var, Map<String, String> map, int i) {
        this.uri = null;
        this.engine = null;
        this.socket = null;
        this.socketFactory = null;
        this.proxy = Proxy.NO_PROXY;
        this.connectLatch = new CountDownLatch(1);
        this.closeLatch = new CountDownLatch(1);
        this.connectTimeout = 0;
        this.dnsResolver = null;
        if (uri == null) {
            throw new IllegalArgumentException();
        }
        if (m73Var != null) {
            this.uri = uri;
            this.draft = m73Var;
            this.dnsResolver = new a();
            if (map != null) {
                TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
                this.headers = treeMap;
                treeMap.putAll(map);
            }
            this.connectTimeout = i;
            setTcpNoDelay(false);
            setReuseAddr(false);
            this.engine = new s3c(this, m73Var);
            return;
        }
        throw new IllegalArgumentException("null as draft is permitted for `WebSocketServer` only!");
    }

    @Override // defpackage.t3c
    public final void onWriteDemand(n3c n3cVar) {
    }

    public void onCloseInitiated(int i, String str) {
    }

    public void onClosing(int i, String str, boolean z) {
    }
}
