package defpackage;

import android.os.Looper;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
/* renamed from: fic  reason: default package */
/* loaded from: classes.dex */
public final class fic {

    /* renamed from: fic$a */
    /* loaded from: classes.dex */
    final class a implements Runnable {
        final /* synthetic */ z6b a;
        final /* synthetic */ Callable b;

        a(z6b z6bVar, Callable callable) {
            this.a = z6bVar;
            this.b = callable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                this.a.c(this.b.call());
            } catch (Exception e) {
                this.a.b(e);
            }
        }
    }

    /* renamed from: fic$b */
    /* loaded from: classes.dex */
    public static class b<TResult> implements c87, c97<TResult> {
        public final CountDownLatch a = new CountDownLatch(1);

        @Override // defpackage.c87
        public final void onFailure(Exception exc) {
            this.a.countDown();
        }

        @Override // defpackage.c97
        public final void onSuccess(TResult tresult) {
            this.a.countDown();
        }
    }

    public static <TResult> TResult b(v6b<TResult> v6bVar) throws ExecutionException {
        if (v6bVar.h()) {
            return v6bVar.e();
        }
        throw new ExecutionException(v6bVar.d());
    }

    public static void c(String str) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            return;
        }
        throw new IllegalStateException(str);
    }

    public final <TResult> v6b<TResult> a(Executor executor, Callable<TResult> callable) {
        z6b z6bVar = new z6b();
        try {
            executor.execute(new a(z6bVar, callable));
        } catch (Exception e) {
            z6bVar.b(e);
        }
        return z6bVar.a();
    }
}
