package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/* compiled from: AbstractWebSocket.java */
/* renamed from: m2  reason: default package */
/* loaded from: classes3.dex */
public abstract class m2 extends p3c {
    private ScheduledFuture<?> connectionLostCheckerFuture;
    private ScheduledExecutorService connectionLostCheckerService;
    private boolean reuseAddr;
    private boolean tcpNoDelay;
    private final Logger log = LoggerFactory.getLogger(m2.class);
    private long connectionLostTimeout = TimeUnit.SECONDS.toNanos(60);
    private boolean websocketRunning = false;
    private final Object syncConnectionLost = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AbstractWebSocket.java */
    /* renamed from: m2$a */
    /* loaded from: classes3.dex */
    public class a implements Runnable {
        private ArrayList<n3c> a = new ArrayList<>();

        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            long nanoTime;
            this.a.clear();
            try {
                this.a.addAll(m2.this.getConnections());
                synchronized (m2.this.syncConnectionLost) {
                    nanoTime = (long) (System.nanoTime() - (m2.this.connectionLostTimeout * 1.5d));
                }
                Iterator<n3c> it = this.a.iterator();
                while (it.hasNext()) {
                    m2.this.executeConnectionLostDetection(it.next(), nanoTime);
                }
            } catch (Exception unused) {
            }
            this.a.clear();
        }
    }

    private void cancelConnectionLostTimer() {
        ScheduledExecutorService scheduledExecutorService = this.connectionLostCheckerService;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
            this.connectionLostCheckerService = null;
        }
        ScheduledFuture<?> scheduledFuture = this.connectionLostCheckerFuture;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            this.connectionLostCheckerFuture = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void executeConnectionLostDetection(n3c n3cVar, long j) {
        if (!(n3cVar instanceof s3c)) {
            return;
        }
        s3c s3cVar = (s3c) n3cVar;
        if (s3cVar.q() < j) {
            this.log.trace("Closing connection due to no pong received: {}", s3cVar);
            s3cVar.e(1006, "The connection was closed because the other endpoint did not respond with a pong in time. For more information check: https://github.com/TooTallNate/Java-WebSocket/wiki/Lost-connection-detection");
        } else if (s3cVar.A()) {
            s3cVar.I();
        } else {
            this.log.trace("Trying to ping a non open connection: {}", s3cVar);
        }
    }

    private void restartConnectionLostTimer() {
        cancelConnectionLostTimer();
        this.connectionLostCheckerService = Executors.newSingleThreadScheduledExecutor(new qs6("connectionLostChecker"));
        a aVar = new a();
        ScheduledExecutorService scheduledExecutorService = this.connectionLostCheckerService;
        long j = this.connectionLostTimeout;
        this.connectionLostCheckerFuture = scheduledExecutorService.scheduleAtFixedRate(aVar, j, j, TimeUnit.NANOSECONDS);
    }

    public int getConnectionLostTimeout() {
        int seconds;
        synchronized (this.syncConnectionLost) {
            seconds = (int) TimeUnit.NANOSECONDS.toSeconds(this.connectionLostTimeout);
        }
        return seconds;
    }

    protected abstract Collection<n3c> getConnections();

    public boolean isReuseAddr() {
        return this.reuseAddr;
    }

    public boolean isTcpNoDelay() {
        return this.tcpNoDelay;
    }

    public void setConnectionLostTimeout(int i) {
        synchronized (this.syncConnectionLost) {
            try {
                long nanos = TimeUnit.SECONDS.toNanos(i);
                this.connectionLostTimeout = nanos;
                if (nanos <= 0) {
                    this.log.trace("Connection lost timer stopped");
                    cancelConnectionLostTimer();
                    return;
                }
                if (this.websocketRunning) {
                    this.log.trace("Connection lost timer restarted");
                    try {
                        Iterator it = new ArrayList(getConnections()).iterator();
                        while (it.hasNext()) {
                            n3c n3cVar = (n3c) it.next();
                            if (n3cVar instanceof s3c) {
                                ((s3c) n3cVar).L();
                            }
                        }
                    } catch (Exception e) {
                        this.log.error("Exception during connection lost restart", (Throwable) e);
                    }
                    restartConnectionLostTimer();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void setReuseAddr(boolean z) {
        this.reuseAddr = z;
    }

    public void setTcpNoDelay(boolean z) {
        this.tcpNoDelay = z;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void startConnectionLostTimer() {
        synchronized (this.syncConnectionLost) {
            try {
                if (this.connectionLostTimeout <= 0) {
                    this.log.trace("Connection lost timer deactivated");
                    return;
                }
                this.log.trace("Connection lost timer started");
                this.websocketRunning = true;
                restartConnectionLostTimer();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void stopConnectionLostTimer() {
        synchronized (this.syncConnectionLost) {
            try {
                if (this.connectionLostCheckerService == null) {
                    if (this.connectionLostCheckerFuture != null) {
                    }
                }
                this.websocketRunning = false;
                this.log.trace("Connection lost timer stopped");
                cancelConnectionLostTimer();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
