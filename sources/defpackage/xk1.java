package defpackage;

import java.util.concurrent.Callable;
/* compiled from: CompletableFromCallable.java */
/* renamed from: xk1  reason: default package */
/* loaded from: classes3.dex */
public final class xk1 extends sk1 {
    final Callable<?> a;

    public xk1(Callable<?> callable) {
        this.a = callable;
    }

    @Override // defpackage.sk1
    protected void f(dl1 dl1Var) {
        z33 b = j43.b();
        dl1Var.c(b);
        try {
            this.a.call();
            if (!b.i()) {
                dl1Var.b();
            }
        } catch (Throwable th) {
            rl3.b(th);
            if (!b.i()) {
                dl1Var.onError(th);
            } else {
                tp9.q(th);
            }
        }
    }
}
