package defpackage;

import android.annotation.SuppressLint;
import android.os.Looper;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* compiled from: Utils.java */
/* renamed from: gvb  reason: default package */
/* loaded from: classes2.dex */
public final class gvb {
    private static final ExecutorService a = hm3.c("awaitEvenIfOnMainThread task continuation executor");

    public static <T> T f(y6b<T> y6bVar) throws InterruptedException, TimeoutException {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        y6bVar.j(a, new dv1() { // from class: zub
            @Override // defpackage.dv1
            public final Object a(y6b y6bVar2) {
                Object i;
                i = gvb.i(countDownLatch, y6bVar2);
                return i;
            }
        });
        if (Looper.getMainLooper() == Looper.myLooper()) {
            countDownLatch.await(3L, TimeUnit.SECONDS);
        } else {
            countDownLatch.await(4L, TimeUnit.SECONDS);
        }
        if (y6bVar.q()) {
            return y6bVar.m();
        }
        if (!y6bVar.o()) {
            if (y6bVar.p()) {
                throw new IllegalStateException(y6bVar.l());
            }
            throw new TimeoutException();
        }
        throw new CancellationException("Task is already canceled");
    }

    public static boolean g(CountDownLatch countDownLatch, long j, TimeUnit timeUnit) {
        boolean z = false;
        try {
            long nanos = timeUnit.toNanos(j);
            while (true) {
                try {
                    break;
                } catch (InterruptedException unused) {
                    z = true;
                    nanos = (System.nanoTime() + nanos) - System.nanoTime();
                }
            }
            return countDownLatch.await(nanos, TimeUnit.NANOSECONDS);
        } finally {
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static <T> y6b<T> h(final Executor executor, final Callable<y6b<T>> callable) {
        final a7b a7bVar = new a7b();
        executor.execute(new Runnable() { // from class: bvb
            @Override // java.lang.Runnable
            public final void run() {
                gvb.k(callable, executor, a7bVar);
            }
        });
        return a7bVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object i(CountDownLatch countDownLatch, y6b y6bVar) throws Exception {
        countDownLatch.countDown();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object j(a7b a7bVar, y6b y6bVar) throws Exception {
        if (y6bVar.q()) {
            a7bVar.c(y6bVar.m());
            return null;
        } else if (y6bVar.l() != null) {
            a7bVar.b(y6bVar.l());
            return null;
        } else {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void k(Callable callable, Executor executor, final a7b a7bVar) {
        try {
            ((y6b) callable.call()).j(executor, new dv1() { // from class: cvb
                @Override // defpackage.dv1
                public final Object a(y6b y6bVar) {
                    Object j;
                    j = gvb.j(a7b.this, y6bVar);
                    return j;
                }
            });
        } catch (Exception e) {
            a7bVar.b(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Void l(a7b a7bVar, y6b y6bVar) throws Exception {
        if (y6bVar.q()) {
            a7bVar.e(y6bVar.m());
            return null;
        } else if (y6bVar.l() != null) {
            a7bVar.d(y6bVar.l());
            return null;
        } else {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Void m(a7b a7bVar, y6b y6bVar) throws Exception {
        if (y6bVar.q()) {
            a7bVar.e(y6bVar.m());
            return null;
        } else if (y6bVar.l() != null) {
            a7bVar.d(y6bVar.l());
            return null;
        } else {
            return null;
        }
    }

    @SuppressLint({"TaskMainThread"})
    public static <T> y6b<T> n(y6b<T> y6bVar, y6b<T> y6bVar2) {
        final a7b a7bVar = new a7b();
        dv1<T, TContinuationResult> dv1Var = new dv1() { // from class: dvb
            @Override // defpackage.dv1
            public final Object a(y6b y6bVar3) {
                Void l;
                l = gvb.l(a7b.this, y6bVar3);
                return l;
            }
        };
        y6bVar.i(dv1Var);
        y6bVar2.i(dv1Var);
        return a7bVar.a();
    }

    public static <T> y6b<T> o(Executor executor, y6b<T> y6bVar, y6b<T> y6bVar2) {
        final a7b a7bVar = new a7b();
        dv1<T, TContinuationResult> dv1Var = new dv1() { // from class: avb
            @Override // defpackage.dv1
            public final Object a(y6b y6bVar3) {
                Void m;
                m = gvb.m(a7b.this, y6bVar3);
                return m;
            }
        };
        y6bVar.j(executor, dv1Var);
        y6bVar2.j(executor, dv1Var);
        return a7bVar.a();
    }
}
