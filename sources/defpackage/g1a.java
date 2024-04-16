package defpackage;

import defpackage.na3;
import java.math.BigInteger;
/* renamed from: g1a  reason: default package */
/* loaded from: classes3.dex */
public class g1a extends na3.a {
    protected long[] g;

    public g1a() {
        this.g = ys6.j();
    }

    @Override // defpackage.na3
    public na3 a(na3 na3Var) {
        long[] j = ys6.j();
        f1a.a(this.g, ((g1a) na3Var).g, j);
        return new g1a(j);
    }

    @Override // defpackage.na3
    public na3 b() {
        long[] j = ys6.j();
        f1a.c(this.g, j);
        return new g1a(j);
    }

    @Override // defpackage.na3
    public na3 d(na3 na3Var) {
        return j(na3Var.g());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g1a)) {
            return false;
        }
        return ys6.o(this.g, ((g1a) obj).g);
    }

    @Override // defpackage.na3
    public int f() {
        return 193;
    }

    @Override // defpackage.na3
    public na3 g() {
        long[] j = ys6.j();
        f1a.l(this.g, j);
        return new g1a(j);
    }

    @Override // defpackage.na3
    public boolean h() {
        return ys6.u(this.g);
    }

    public int hashCode() {
        return tr.K(this.g, 0, 4) ^ 1930015;
    }

    @Override // defpackage.na3
    public boolean i() {
        return ys6.w(this.g);
    }

    @Override // defpackage.na3
    public na3 j(na3 na3Var) {
        long[] j = ys6.j();
        f1a.m(this.g, ((g1a) na3Var).g, j);
        return new g1a(j);
    }

    @Override // defpackage.na3
    public na3 k(na3 na3Var, na3 na3Var2, na3 na3Var3) {
        return l(na3Var, na3Var2, na3Var3);
    }

    @Override // defpackage.na3
    public na3 l(na3 na3Var, na3 na3Var2, na3 na3Var3) {
        long[] jArr = this.g;
        long[] jArr2 = ((g1a) na3Var).g;
        long[] jArr3 = ((g1a) na3Var2).g;
        long[] jArr4 = ((g1a) na3Var3).g;
        long[] l = ys6.l();
        f1a.n(jArr, jArr2, l);
        f1a.n(jArr3, jArr4, l);
        long[] j = ys6.j();
        f1a.o(l, j);
        return new g1a(j);
    }

    @Override // defpackage.na3
    public na3 n() {
        long[] j = ys6.j();
        f1a.p(this.g, j);
        return new g1a(j);
    }

    @Override // defpackage.na3
    public na3 o() {
        long[] j = ys6.j();
        f1a.q(this.g, j);
        return new g1a(j);
    }

    @Override // defpackage.na3
    public na3 p(na3 na3Var, na3 na3Var2) {
        long[] jArr = this.g;
        long[] jArr2 = ((g1a) na3Var).g;
        long[] jArr3 = ((g1a) na3Var2).g;
        long[] l = ys6.l();
        f1a.r(jArr, l);
        f1a.n(jArr2, jArr3, l);
        long[] j = ys6.j();
        f1a.o(l, j);
        return new g1a(j);
    }

    @Override // defpackage.na3
    public na3 q(int i) {
        if (i < 1) {
            return this;
        }
        long[] j = ys6.j();
        f1a.s(this.g, i, j);
        return new g1a(j);
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
        f1a.f(this.g, j);
        return new g1a(j);
    }

    @Override // defpackage.na3.a
    public boolean v() {
        return true;
    }

    @Override // defpackage.na3.a
    public int w() {
        return f1a.t(this.g);
    }

    public g1a(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 193) {
            throw new IllegalArgumentException("x value invalid for SecT193FieldElement");
        }
        this.g = f1a.e(bigInteger);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public g1a(long[] jArr) {
        this.g = jArr;
    }

    @Override // defpackage.na3
    public na3 m() {
        return this;
    }
}
