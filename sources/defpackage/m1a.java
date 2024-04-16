package defpackage;

import defpackage.na3;
import java.math.BigInteger;
/* renamed from: m1a  reason: default package */
/* loaded from: classes3.dex */
public class m1a extends na3.a {
    protected long[] g;

    public m1a() {
        this.g = ys6.j();
    }

    @Override // defpackage.na3
    public na3 a(na3 na3Var) {
        long[] j = ys6.j();
        l1a.a(this.g, ((m1a) na3Var).g, j);
        return new m1a(j);
    }

    @Override // defpackage.na3
    public na3 b() {
        long[] j = ys6.j();
        l1a.c(this.g, j);
        return new m1a(j);
    }

    @Override // defpackage.na3
    public na3 d(na3 na3Var) {
        return j(na3Var.g());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m1a)) {
            return false;
        }
        return ys6.o(this.g, ((m1a) obj).g);
    }

    @Override // defpackage.na3
    public int f() {
        return 233;
    }

    @Override // defpackage.na3
    public na3 g() {
        long[] j = ys6.j();
        l1a.l(this.g, j);
        return new m1a(j);
    }

    @Override // defpackage.na3
    public boolean h() {
        return ys6.u(this.g);
    }

    public int hashCode() {
        return tr.K(this.g, 0, 4) ^ 2330074;
    }

    @Override // defpackage.na3
    public boolean i() {
        return ys6.w(this.g);
    }

    @Override // defpackage.na3
    public na3 j(na3 na3Var) {
        long[] j = ys6.j();
        l1a.m(this.g, ((m1a) na3Var).g, j);
        return new m1a(j);
    }

    @Override // defpackage.na3
    public na3 k(na3 na3Var, na3 na3Var2, na3 na3Var3) {
        return l(na3Var, na3Var2, na3Var3);
    }

    @Override // defpackage.na3
    public na3 l(na3 na3Var, na3 na3Var2, na3 na3Var3) {
        long[] jArr = this.g;
        long[] jArr2 = ((m1a) na3Var).g;
        long[] jArr3 = ((m1a) na3Var2).g;
        long[] jArr4 = ((m1a) na3Var3).g;
        long[] l = ys6.l();
        l1a.n(jArr, jArr2, l);
        l1a.n(jArr3, jArr4, l);
        long[] j = ys6.j();
        l1a.o(l, j);
        return new m1a(j);
    }

    @Override // defpackage.na3
    public na3 n() {
        long[] j = ys6.j();
        l1a.p(this.g, j);
        return new m1a(j);
    }

    @Override // defpackage.na3
    public na3 o() {
        long[] j = ys6.j();
        l1a.q(this.g, j);
        return new m1a(j);
    }

    @Override // defpackage.na3
    public na3 p(na3 na3Var, na3 na3Var2) {
        long[] jArr = this.g;
        long[] jArr2 = ((m1a) na3Var).g;
        long[] jArr3 = ((m1a) na3Var2).g;
        long[] l = ys6.l();
        l1a.r(jArr, l);
        l1a.n(jArr2, jArr3, l);
        long[] j = ys6.j();
        l1a.o(l, j);
        return new m1a(j);
    }

    @Override // defpackage.na3
    public na3 q(int i) {
        if (i < 1) {
            return this;
        }
        long[] j = ys6.j();
        l1a.s(this.g, i, j);
        return new m1a(j);
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
        return ys6.K(this.g);
    }

    @Override // defpackage.na3.a
    public na3 u() {
        long[] j = ys6.j();
        l1a.f(this.g, j);
        return new m1a(j);
    }

    @Override // defpackage.na3.a
    public boolean v() {
        return true;
    }

    @Override // defpackage.na3.a
    public int w() {
        return l1a.t(this.g);
    }

    public m1a(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 233) {
            throw new IllegalArgumentException("x value invalid for SecT233FieldElement");
        }
        this.g = l1a.e(bigInteger);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public m1a(long[] jArr) {
        this.g = jArr;
    }

    @Override // defpackage.na3
    public na3 m() {
        return this;
    }
}
