package defpackage;

import java.math.BigInteger;
/* renamed from: ma4  reason: default package */
/* loaded from: classes3.dex */
public class ma4 extends h1 {
    protected final ea3 a;
    protected final la4 b;

    public ma4(ea3 ea3Var, la4 la4Var) {
        if (ea3Var != null && ea3Var.w() != null) {
            this.a = ea3Var;
            this.b = la4Var;
            return;
        }
        throw new IllegalArgumentException("Need curve with known group order");
    }

    @Override // defpackage.h1
    protected jb3 c(jb3 jb3Var, BigInteger bigInteger) {
        if (this.a.l(jb3Var.i())) {
            BigInteger[] c = this.b.c(bigInteger.mod(jb3Var.i().w()));
            BigInteger bigInteger2 = c[0];
            BigInteger bigInteger3 = c[1];
            if (this.b.a()) {
                return ca3.d(this.b, jb3Var, bigInteger2, bigInteger3);
            }
            return ca3.e(jb3Var, bigInteger2, xh3.c(this.b, jb3Var), bigInteger3);
        }
        throw new IllegalStateException();
    }
}
