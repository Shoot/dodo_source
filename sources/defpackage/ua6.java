package defpackage;

import java.util.concurrent.Callable;
/* compiled from: MaybeFromCallable.java */
/* renamed from: ua6  reason: default package */
/* loaded from: classes3.dex */
public final class ua6<T> extends sa6<T> implements Callable<T> {
    final Callable<? extends T> a;

    public ua6(Callable<? extends T> callable) {
        this.a = callable;
    }

    @Override // java.util.concurrent.Callable
    public T call() throws Exception {
        return this.a.call();
    }

    @Override // defpackage.sa6
    protected void f(wa6<? super T> wa6Var) {
        z33 b = j43.b();
        wa6Var.c(b);
        if (!b.i()) {
            try {
                Object obj = (T) this.a.call();
                if (!b.i()) {
                    if (obj == null) {
                        wa6Var.b();
                    } else {
                        wa6Var.onSuccess(obj);
                    }
                }
            } catch (Throwable th) {
                rl3.b(th);
                if (!b.i()) {
                    wa6Var.onError(th);
                } else {
                    tp9.q(th);
                }
            }
        }
    }
}
