package defpackage;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
/* compiled from: Futures.java */
/* renamed from: t94  reason: default package */
/* loaded from: classes2.dex */
public final class t94 extends xi4 {

    /* compiled from: Futures.java */
    /* renamed from: t94$a */
    /* loaded from: classes2.dex */
    private static final class a<V> implements Runnable {
        final Future<V> a;
        final r94<? super V> b;

        a(Future<V> future, r94<? super V> r94Var) {
            this.a = future;
            this.b = r94Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            Throwable a;
            Future<V> future = this.a;
            if ((future instanceof s65) && (a = t65.a((s65) future)) != null) {
                this.b.onFailure(a);
                return;
            }
            try {
                this.b.onSuccess(t94.b(this.a));
            } catch (Error e) {
                e = e;
                this.b.onFailure(e);
            } catch (RuntimeException e2) {
                e = e2;
                this.b.onFailure(e);
            } catch (ExecutionException e3) {
                this.b.onFailure(e3.getCause());
            }
        }

        public String toString() {
            return ro6.b(this).h(this.b).toString();
        }
    }

    public static <V> void a(kr5<V> kr5Var, r94<? super V> r94Var, Executor executor) {
        hh8.i(r94Var);
        kr5Var.k(new a(kr5Var, r94Var), executor);
    }

    public static <V> V b(Future<V> future) throws ExecutionException {
        hh8.p(future.isDone(), "Future was expected to be done: %s", future);
        return (V) pqb.a(future);
    }
}
