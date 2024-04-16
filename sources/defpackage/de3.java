package defpackage;

import java.math.BigInteger;
/* renamed from: de3  reason: default package */
/* loaded from: classes3.dex */
public class de3 implements tx {
    private ce3 g;

    @Override // defpackage.tx
    public sx a() {
        b72 b72Var = b72.a;
        ie3 c = this.g.c();
        h72 h72Var = new h72(c.c(), c.a(), null, c.b());
        BigInteger a = b72Var.a(h72Var, this.g.a());
        return new sx(new oe3(b72Var.b(h72Var, a), c), new le3(a, c));
    }

    public void b(ff5 ff5Var) {
        this.g = (ce3) ff5Var;
    }
}
