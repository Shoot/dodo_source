package defpackage;

import defpackage.na3;
import java.math.BigInteger;
/* renamed from: y0a  reason: default package */
/* loaded from: classes3.dex */
public class y0a extends na3.a {
    protected long[] g;

    public y0a() {
        this.g = ws6.i();
    }

    @Override // defpackage.na3
    public na3 a(na3 na3Var) {
        long[] i = ws6.i();
        x0a.a(this.g, ((y0a) na3Var).g, i);
        return new y0a(i);
    }

    @Override // defpackage.na3
    public na3 b() {
        long[] i = ws6.i();
        x0a.c(this.g, i);
        return new y0a(i);
    }

    @Override // defpackage.na3
    public na3 d(na3 na3Var) {
        return j(na3Var.g());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof y0a)) {
            return false;
        }
        return ws6.n(this.g, ((y0a) obj).g);
    }

    @Override // defpackage.na3
    public int f() {
        return 163;
    }

    @Override // defpackage.na3
    public na3 g() {
        long[] i = ws6.i();
        x0a.k(this.g, i);
        return new y0a(i);
    }

    @Override // defpackage.na3
    public boolean h() {
        return ws6.t(this.g);
    }

    public int hashCode() {
        return tr.K(this.g, 0, 3) ^ 163763;
    }

    @Override // defpackage.na3
    public boolean i() {
        return ws6.v(this.g);
    }

    @Override // defpackage.na3
    public na3 j(na3 na3Var) {
        long[] i = ws6.i();
        x0a.l(this.g, ((y0a) na3Var).g, i);
        return new y0a(i);
    }

    @Override // defpackage.na3
    public na3 k(na3 na3Var, na3 na3Var2, na3 na3Var3) {
        return l(na3Var, na3Var2, na3Var3);
    }

    @Override // defpackage.na3
    public na3 l(na3 na3Var, na3 na3Var2, na3 na3Var3) {
        long[] jArr = this.g;
        long[] jArr2 = ((y0a) na3Var).g;
        long[] jArr3 = ((y0a) na3Var2).g;
        long[] jArr4 = ((y0a) na3Var3).g;
        long[] k = ws6.k();
        x0a.m(jArr, jArr2, k);
        x0a.m(jArr3, jArr4, k);
        long[] i = ws6.i();
        x0a.n(k, i);
        return new y0a(i);
    }

    @Override // defpackage.na3
    public na3 n() {
        long[] i = ws6.i();
        x0a.o(this.g, i);
        return new y0a(i);
    }

    @Override // defpackage.na3
    public na3 o() {
        long[] i = ws6.i();
        x0a.p(this.g, i);
        return new y0a(i);
    }

    @Override // defpackage.na3
    public na3 p(na3 na3Var, na3 na3Var2) {
        long[] jArr = this.g;
        long[] jArr2 = ((y0a) na3Var).g;
        long[] jArr3 = ((y0a) na3Var2).g;
        long[] k = ws6.k();
        x0a.q(jArr, k);
        x0a.m(jArr2, jArr3, k);
        long[] i = ws6.i();
        x0a.n(k, i);
        return new y0a(i);
    }

    @Override // defpackage.na3
    public na3 q(int i) {
        if (i < 1) {
            return this;
        }
        long[] i2 = ws6.i();
        x0a.r(this.g, i, i2);
        return new y0a(i2);
    }

    @Override // defpackage.na3
    public na3 r(na3 na3Var) {
        return a(na3Var);
    }

    @Override // defpackage.na3
    public boolean s() {
        if ((this.g[0] & 1) == 0) {
            return false;
        }
        return true;
    }

    @Override // defpackage.na3
    public BigInteger t() {
        return ws6.I(this.g);
    }

    @Override // defpackage.na3.a
    public na3 u() {
        long[] i = ws6.i();
        x0a.f(this.g, i);
        return new y0a(i);
    }

    @Override // defpackage.na3.a
    public boolean v() {
        return true;
    }

    @Override // defpackage.na3.a
    public int w() {
        return x0a.s(this.g);
    }

    public y0a(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 163) {
            throw new IllegalArgumentException("x value invalid for SecT163FieldElement");
        }
        this.g = x0a.e(bigInteger);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public y0a(long[] jArr) {
        this.g = jArr;
    }

    @Override // defpackage.na3
    public na3 m() {
        return this;
    }
}
