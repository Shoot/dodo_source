package defpackage;
/* compiled from: CompletableFromAction.java */
/* renamed from: wk1  reason: default package */
/* loaded from: classes3.dex */
public final class wk1 extends sk1 {
    final t4 a;

    public wk1(t4 t4Var) {
        this.a = t4Var;
    }

    @Override // defpackage.sk1
    protected void f(dl1 dl1Var) {
        z33 b = j43.b();
        dl1Var.c(b);
        try {
            this.a.run();
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
