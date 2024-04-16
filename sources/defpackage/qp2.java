package defpackage;

import ch.qos.logback.core.CoreConstants;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.zk3;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.ranges.i;
/* compiled from: DefaultExecutor.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\f\bÀ\u0002\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003B\t\b\u0002¢\u0006\u0004\b,\u0010 J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\t\u001a\u00020\bH\u0002J\b\u0010\n\u001a\u00020\u0004H\u0002J\u0014\u0010\f\u001a\u00020\u00042\n\u0010\u000b\u001a\u00060\u0002j\u0002`\u0003H\u0016J\u0018\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0014J\b\u0010\u0012\u001a\u00020\u0004H\u0016J$\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\r2\n\u0010\u0014\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\u0016\u001a\u00020\u0015H\u0016J\b\u0010\u0019\u001a\u00020\u0004H\u0016R\u0014\u0010\u001c\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001e\u0010\u001d\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u0012\u0004\b\u001f\u0010 R\u0016\u0010\"\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0014\u0010(\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b'\u0010%R\u0014\u0010+\u001a\u00020\u00068TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u0006-"}, d2 = {"Lqp2;", "Lzk3;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "", "H1", "Ljava/lang/Thread;", "D1", "", "G1", "A1", "task", "g1", "", "now", "Lzk3$c;", "delayedTask", "S0", "shutdown", "timeMillis", "block", "Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lf43;", Image.TYPE_SMALL, "run", "i", "J", "KEEP_ALIVE_NANOS", "_thread", "Ljava/lang/Thread;", "get_thread$annotations", "()V", "", "debugStatus", "I", "E1", "()Z", "isShutDown", "F1", "isShutdownRequested", "Q0", "()Ljava/lang/Thread;", "thread", "<init>", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* renamed from: qp2  reason: default package */
/* loaded from: classes3.dex */
public final class qp2 extends zk3 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;
    public static final qp2 h;
    private static final long i;

    static {
        Long l;
        qp2 qp2Var = new qp2();
        h = qp2Var;
        yk3.F0(qp2Var, false, 1, null);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        i = timeUnit.toNanos(l.longValue());
    }

    private qp2() {
    }

    private final synchronized void A1() {
        if (!F1()) {
            return;
        }
        debugStatus = 3;
        q1();
        notifyAll();
    }

    private final synchronized Thread D1() {
        Thread thread;
        thread = _thread;
        if (thread == null) {
            thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
            _thread = thread;
            thread.setDaemon(true);
            thread.start();
        }
        return thread;
    }

    private final boolean E1() {
        if (debugStatus == 4) {
            return true;
        }
        return false;
    }

    private final boolean F1() {
        int i2 = debugStatus;
        if (i2 != 2 && i2 != 3) {
            return false;
        }
        return true;
    }

    private final synchronized boolean G1() {
        if (F1()) {
            return false;
        }
        debugStatus = 1;
        notifyAll();
        return true;
    }

    private final void H1() {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // defpackage.al3
    protected Thread Q0() {
        Thread thread = _thread;
        if (thread == null) {
            return D1();
        }
        return thread;
    }

    @Override // defpackage.al3
    protected void S0(long j, zk3.c cVar) {
        H1();
    }

    @Override // defpackage.zk3
    public void g1(Runnable runnable) {
        if (E1()) {
            H1();
        }
        super.g1(runnable);
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean j1;
        zdb.a.d(this);
        k2.a();
        try {
            if (!G1()) {
                if (!j1) {
                    return;
                }
                return;
            }
            long j = Long.MAX_VALUE;
            while (true) {
                Thread.interrupted();
                long M0 = M0();
                if (M0 == Long.MAX_VALUE) {
                    k2.a();
                    long nanoTime = System.nanoTime();
                    if (j == Long.MAX_VALUE) {
                        j = i + nanoTime;
                    }
                    long j2 = j - nanoTime;
                    if (j2 > 0) {
                        M0 = i.i(M0, j2);
                    } else {
                        _thread = null;
                        A1();
                        k2.a();
                        if (!j1()) {
                            Q0();
                            return;
                        }
                        return;
                    }
                } else {
                    j = Long.MAX_VALUE;
                }
                if (M0 > 0) {
                    if (F1()) {
                        _thread = null;
                        A1();
                        k2.a();
                        if (!j1()) {
                            Q0();
                            return;
                        }
                        return;
                    }
                    k2.a();
                    LockSupport.parkNanos(this, M0);
                }
            }
        } finally {
            _thread = null;
            A1();
            k2.a();
            if (!j1()) {
                Q0();
            }
        }
    }

    @Override // defpackage.zk3, defpackage.vt2
    public f43 s(long j, Runnable runnable, CoroutineContext coroutineContext) {
        return w1(j, runnable);
    }

    @Override // defpackage.zk3, defpackage.yk3
    public void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }
}
