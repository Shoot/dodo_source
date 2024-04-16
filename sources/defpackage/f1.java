package defpackage;

import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: AbstractDirectTask.java */
/* renamed from: f1  reason: default package */
/* loaded from: classes3.dex */
abstract class f1 extends AtomicReference<Future<?>> implements z33 {
    protected static final FutureTask<Void> c;
    protected static final FutureTask<Void> d;
    protected final Runnable a;
    protected Thread b;

    static {
        Runnable runnable = n94.b;
        c = new FutureTask<>(runnable, null);
        d = new FutureTask<>(runnable, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f1(Runnable runnable) {
        this.a = runnable;
    }

    @Override // defpackage.z33
    public final void a() {
        FutureTask<Void> futureTask;
        boolean z;
        Future<?> future = get();
        if (future != c && future != (futureTask = d) && compareAndSet(future, futureTask) && future != null) {
            if (this.b != Thread.currentThread()) {
                z = true;
            } else {
                z = false;
            }
            future.cancel(z);
        }
    }

    public final void b(Future<?> future) {
        Future<?> future2;
        boolean z;
        do {
            future2 = get();
            if (future2 != c) {
                if (future2 == d) {
                    if (this.b != Thread.currentThread()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    future.cancel(z);
                    return;
                }
            } else {
                return;
            }
        } while (!compareAndSet(future2, future));
    }

    @Override // defpackage.z33
    public final boolean i() {
        Future<?> future = get();
        if (future != c && future != d) {
            return false;
        }
        return true;
    }
}
