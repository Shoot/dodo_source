package defpackage;

import defpackage.na3;
import java.math.BigInteger;
/* renamed from: m0a  reason: default package */
/* loaded from: classes3.dex */
public class m0a extends na3.a {
    protected long[] g;

    public m0a() {
        this.g = us6.g();
    }

    @Override // defpackage.na3
    public na3 a(na3 na3Var) {
        long[] g = us6.g();
        l0a.a(this.g, ((m0a) na3Var).g, g);
        return new m0a(g);
    }

    @Override // defpackage.na3
    public na3 b() {
        long[] g = us6.g();
        l0a.c(this.g, g);
        return new m0a(g);
    }

    @Override // defpackage.na3
    public na3 d(na3 na3Var) {
        return j(na3Var.g());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m0a)) {
            return false;
        }
        return us6.k(this.g, ((m0a) obj).g);
    }

    @Override // defpackage.na3
    public int f() {
        return 113;
    }

    @Override // defpackage.na3
    public na3 g() {
        long[] g = us6.g();
        l0a.j(this.g, g);
        return new m0a(g);
    }

    @Override // defpackage.na3
    public boolean h() {
        return us6.p(this.g);
    }

    public int hashCode() {
        return tr.K(this.g, 0, 2) ^ 113009;
    }

    @Override // defpackage.na3
    public boolean i() {
        return us6.r(this.g);
    }

    @Override // defpackage.na3
    public na3 j(na3 na3Var) {
        long[] g = us6.g();
        l0a.k(this.g, ((m0a) na3Var).g, g);
        return new m0a(g);
    }

    @Override // defpackage.na3
    public na3 k(na3 na3Var, na3 na3Var2, na3 na3Var3) {
        return l(na3Var, na3Var2, na3Var3);
    }

    @Override // defpackage.na3
    public na3 l(na3 na3Var, na3 na3Var2, na3 na3Var3) {
        long[] jArr = this.g;
        long[] jArr2 = ((m0a) na3Var).g;
        long[] jArr3 = ((m0a) na3Var2).g;
        long[] jArr4 = ((m0a) na3Var3).g;
        long[] i = us6.i();
        l0a.l(jArr, jArr2, i);
        l0a.l(jArr3, jArr4, i);
        long[] g = us6.g();
        l0a.m(i, g);
        return new m0a(g);
    }

    @Override // defpackage.na3
    public na3 n() {
        long[] g = us6.g();
        l0a.n(this.g, g);
        return new m0a(g);
    }

    @Override // defpackage.na3
    public na3 o() {
        long[] g = us6.g();
        l0a.o(this.g, g);
        return new m0a(g);
    }

    @Override // defpackage.na3
    public na3 p(na3 na3Var, na3 na3Var2) {
        long[] jArr = this.g;
        long[] jArr2 = ((m0a) na3Var).g;
        long[] jArr3 = ((m0a) na3Var2).g;
        long[] i = us6.i();
        l0a.p(jArr, i);
        l0a.l(jArr2, jArr3, i);
        long[] g = us6.g();
        l0a.m(i, g);
        return new m0a(g);
    }

    @Override // defpackage.na3
    public na3 q(int i) {
        if (i < 1) {
            return this;
        }
        long[] g = us6.g();
        l0a.q(this.g, i, g);
        return new m0a(g);
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
        return us6.y(this.g);
    }

    @Override // defpackage.na3.a
    public na3 u() {
        long[] g = us6.g();
        l0a.f(this.g, g);
        return new m0a(g);
    }

    @Override // defpackage.na3.a
    public boolean v() {
        return true;
    }

    @Override // defpackage.na3.a
    public int w() {
        return l0a.r(this.g);
    }

    public m0a(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 113) {
            throw new IllegalArgumentException("x value invalid for SecT113FieldElement");
        }
        this.g = l0a.e(bigInteger);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public m0a(long[] jArr) {
        this.g = jArr;
    }

    @Override // defpackage.na3
    public na3 m() {
        return this;
    }
}
