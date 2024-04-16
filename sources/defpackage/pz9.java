package defpackage;

import defpackage.na3;
import java.math.BigInteger;
import org.bouncycastle.util.encoders.b;
/* renamed from: pz9  reason: default package */
/* loaded from: classes3.dex */
public class pz9 extends na3.b {
    public static final BigInteger h = new BigInteger(1, b.b("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFE56D"));
    private static final int[] i = {868209154, -587542221, 579297866, -1014948952, -1470801668, 514782679, -1897982644};
    protected int[] g;

    public pz9() {
        this.g = xs6.e();
    }

    @Override // defpackage.na3
    public na3 a(na3 na3Var) {
        int[] e = xs6.e();
        oz9.a(this.g, ((pz9) na3Var).g, e);
        return new pz9(e);
    }

    @Override // defpackage.na3
    public na3 b() {
        int[] e = xs6.e();
        oz9.b(this.g, e);
        return new pz9(e);
    }

    @Override // defpackage.na3
    public na3 d(na3 na3Var) {
        int[] e = xs6.e();
        oz9.d(((pz9) na3Var).g, e);
        oz9.f(e, this.g, e);
        return new pz9(e);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof pz9)) {
            return false;
        }
        return xs6.g(this.g, ((pz9) obj).g);
    }

    @Override // defpackage.na3
    public int f() {
        return h.bitLength();
    }

    @Override // defpackage.na3
    public na3 g() {
        int[] e = xs6.e();
        oz9.d(this.g, e);
        return new pz9(e);
    }

    @Override // defpackage.na3
    public boolean h() {
        return xs6.k(this.g);
    }

    public int hashCode() {
        return h.hashCode() ^ tr.J(this.g, 0, 7);
    }

    @Override // defpackage.na3
    public boolean i() {
        return xs6.l(this.g);
    }

    @Override // defpackage.na3
    public na3 j(na3 na3Var) {
        int[] e = xs6.e();
        oz9.f(this.g, ((pz9) na3Var).g, e);
        return new pz9(e);
    }

    @Override // defpackage.na3
    public na3 m() {
        int[] e = xs6.e();
        oz9.h(this.g, e);
        return new pz9(e);
    }

    @Override // defpackage.na3
    public na3 n() {
        int[] iArr = this.g;
        if (!xs6.l(iArr) && !xs6.k(iArr)) {
            int[] e = xs6.e();
            oz9.m(iArr, e);
            oz9.f(e, iArr, e);
            oz9.m(e, e);
            oz9.f(e, iArr, e);
            int[] e2 = xs6.e();
            oz9.m(e, e2);
            oz9.f(e2, iArr, e2);
            int[] e3 = xs6.e();
            oz9.n(e2, 4, e3);
            oz9.f(e3, e2, e3);
            int[] e4 = xs6.e();
            oz9.n(e3, 3, e4);
            oz9.f(e4, e, e4);
            oz9.n(e4, 8, e4);
            oz9.f(e4, e3, e4);
            oz9.n(e4, 4, e3);
            oz9.f(e3, e2, e3);
            oz9.n(e3, 19, e2);
            oz9.f(e2, e4, e2);
            int[] e5 = xs6.e();
            oz9.n(e2, 42, e5);
            oz9.f(e5, e2, e5);
            oz9.n(e5, 23, e2);
            oz9.f(e2, e3, e2);
            oz9.n(e2, 84, e3);
            oz9.f(e3, e5, e3);
            oz9.n(e3, 20, e3);
            oz9.f(e3, e4, e3);
            oz9.n(e3, 3, e3);
            oz9.f(e3, iArr, e3);
            oz9.n(e3, 2, e3);
            oz9.f(e3, iArr, e3);
            oz9.n(e3, 4, e3);
            oz9.f(e3, e, e3);
            oz9.m(e3, e3);
            oz9.m(e3, e5);
            if (xs6.g(iArr, e5)) {
                return new pz9(e3);
            }
            oz9.f(e3, i, e3);
            oz9.m(e3, e5);
            if (xs6.g(iArr, e5)) {
                return new pz9(e3);
            }
            return null;
        }
        return this;
    }

    @Override // defpackage.na3
    public na3 o() {
        int[] e = xs6.e();
        oz9.m(this.g, e);
        return new pz9(e);
    }

    @Override // defpackage.na3
    public na3 r(na3 na3Var) {
        int[] e = xs6.e();
        oz9.o(this.g, ((pz9) na3Var).g, e);
        return new pz9(e);
    }

    @Override // defpackage.na3
    public boolean s() {
        if (xs6.i(this.g, 0) != 1) {
            return false;
        }
        return true;
    }

    @Override // defpackage.na3
    public BigInteger t() {
        return xs6.u(this.g);
    }

    public pz9(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(h) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP224K1FieldElement");
        }
        this.g = oz9.c(bigInteger);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public pz9(int[] iArr) {
        this.g = iArr;
    }
}
