package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Builders.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B!\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\f\u001a\u00020\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0014J\r\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0019"}, d2 = {"Ltd0;", "T", "Le1;", "", "state", "", "D", "g1", "()Ljava/lang/Object;", "Ljava/lang/Thread;", c.a, "Ljava/lang/Thread;", "blockedThread", "Lyk3;", DateTokenConverter.CONVERTER_KEY, "Lyk3;", "eventLoop", "", "y0", "()Z", "isScopedCoroutine", "Lkotlin/coroutines/CoroutineContext;", "parentContext", "<init>", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Thread;Lyk3;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* renamed from: td0  reason: default package */
/* loaded from: classes3.dex */
public final class td0<T> extends e1<T> {
    private final Thread c;
    private final yk3 d;

    public td0(CoroutineContext coroutineContext, Thread thread, yk3 yk3Var) {
        super(coroutineContext, true, true);
        this.c = thread;
        this.d = yk3Var;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.v95
    public void D(Object obj) {
        if (!z65.c(Thread.currentThread(), this.c)) {
            Thread thread = this.c;
            k2.a();
            LockSupport.unpark(thread);
        }
    }

    public final T g1() {
        long j;
        k2.a();
        try {
            yk3 yk3Var = this.d;
            il1 il1Var = null;
            if (yk3Var != null) {
                yk3.F0(yk3Var, false, 1, null);
            }
            while (!Thread.interrupted()) {
                yk3 yk3Var2 = this.d;
                if (yk3Var2 != null) {
                    j = yk3Var2.M0();
                } else {
                    j = Long.MAX_VALUE;
                }
                if (!e()) {
                    k2.a();
                    LockSupport.parkNanos(this, j);
                } else {
                    yk3 yk3Var3 = this.d;
                    if (yk3Var3 != null) {
                        yk3.q0(yk3Var3, false, 1, null);
                    }
                    k2.a();
                    T t = (T) w95.h(t0());
                    if (t instanceof il1) {
                        il1Var = (il1) t;
                    }
                    if (il1Var == null) {
                        return t;
                    }
                    throw il1Var.a;
                }
            }
            InterruptedException interruptedException = new InterruptedException();
            J(interruptedException);
            throw interruptedException;
        } catch (Throwable th) {
            k2.a();
            throw th;
        }
    }

    @Override // defpackage.v95
    protected boolean y0() {
        return true;
    }
}
