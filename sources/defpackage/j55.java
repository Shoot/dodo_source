package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: InstantPeriodicTask.java */
/* renamed from: j55  reason: default package */
/* loaded from: classes3.dex */
public final class j55 implements Callable<Void>, z33 {
    static final FutureTask<Void> f = new FutureTask<>(n94.b, null);
    final Runnable a;
    final ExecutorService d;
    Thread e;
    final AtomicReference<Future<?>> c = new AtomicReference<>();
    final AtomicReference<Future<?>> b = new AtomicReference<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    public j55(Runnable runnable, ExecutorService executorService) {
        this.a = runnable;
        this.d = executorService;
    }

    @Override // defpackage.z33
    public void a() {
        boolean z;
        AtomicReference<Future<?>> atomicReference = this.c;
        FutureTask<Void> futureTask = f;
        Future<?> andSet = atomicReference.getAndSet(futureTask);
        boolean z2 = false;
        if (andSet != null && andSet != futureTask) {
            if (this.e != Thread.currentThread()) {
                z = true;
            } else {
                z = false;
            }
            andSet.cancel(z);
        }
        Future<?> andSet2 = this.b.getAndSet(futureTask);
        if (andSet2 != null && andSet2 != futureTask) {
            if (this.e != Thread.currentThread()) {
                z2 = true;
            }
            andSet2.cancel(z2);
        }
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: b */
    public Void call() throws Exception {
        this.e = Thread.currentThread();
        try {
            this.a.run();
            d(this.d.submit(this));
            this.e = null;
        } catch (Throwable th) {
            this.e = null;
            tp9.q(th);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(Future<?> future) {
        Future<?> future2;
        boolean z;
        do {
            future2 = this.c.get();
            if (future2 == f) {
                if (this.e != Thread.currentThread()) {
                    z = true;
                } else {
                    z = false;
                }
                future.cancel(z);
                return;
            }
        } while (!ho1.a(this.c, future2, future));
    }

    void d(Future<?> future) {
        Future<?> future2;
        boolean z;
        do {
            future2 = this.b.get();
            if (future2 == f) {
                if (this.e != Thread.currentThread()) {
                    z = true;
                } else {
                    z = false;
                }
                future.cancel(z);
                return;
            }
        } while (!ho1.a(this.b, future2, future));
    }

    @Override // defpackage.z33
    public boolean i() {
        if (this.c.get() == f) {
            return true;
        }
        return false;
    }
}
