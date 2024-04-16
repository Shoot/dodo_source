package defpackage;

import java.math.BigInteger;
/* renamed from: c72  reason: default package */
/* loaded from: classes3.dex */
public class c72 implements tx {
    private a72 g;

    @Override // defpackage.tx
    public sx a() {
        b72 b72Var = b72.a;
        h72 c = this.g.c();
        BigInteger a = b72Var.a(c, this.g.a());
        return new sx(new l72(b72Var.b(c, a), c), new k72(a, c));
    }

    public void b(ff5 ff5Var) {
        this.g = (a72) ff5Var;
    }
}
