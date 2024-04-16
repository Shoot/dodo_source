package defpackage;

import defpackage.na3;
import java.math.BigInteger;
/* renamed from: s0a  reason: default package */
/* loaded from: classes3.dex */
public class s0a extends na3.a {
    protected long[] g;

    public s0a() {
        this.g = ws6.i();
    }

    @Override // defpackage.na3
    public na3 a(na3 na3Var) {
        long[] i = ws6.i();
        r0a.a(this.g, ((s0a) na3Var).g, i);
        return new s0a(i);
    }

    @Override // defpackage.na3
    public na3 b() {
        long[] i = ws6.i();
        r0a.c(this.g, i);
        return new s0a(i);
    }

    @Override // defpackage.na3
    public na3 d(na3 na3Var) {
        return j(na3Var.g());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s0a)) {
            return false;
        }
        return ws6.n(this.g, ((s0a) obj).g);
    }

    @Override // defpackage.na3
    public int f() {
        return 131;
    }

    @Override // defpackage.na3
    public na3 g() {
        long[] i = ws6.i();
        r0a.k(this.g, i);
        return new s0a(i);
    }

    @Override // defpackage.na3
    public boolean h() {
        return ws6.t(this.g);
    }

    public int hashCode() {
        return tr.K(this.g, 0, 3) ^ 131832;
    }

    @Override // defpackage.na3
    public boolean i() {
        return ws6.v(this.g);
    }

    @Override // defpackage.na3
    public na3 j(na3 na3Var) {
        long[] i = ws6.i();
        r0a.l(this.g, ((s0a) na3Var).g, i);
        return new s0a(i);
    }

    @Override // defpackage.na3
    public na3 k(na3 na3Var, na3 na3Var2, na3 na3Var3) {
        return l(na3Var, na3Var2, na3Var3);
    }

    @Override // defpackage.na3
    public na3 l(na3 na3Var, na3 na3Var2, na3 na3Var3) {
        long[] jArr = this.g;
        long[] jArr2 = ((s0a) na3Var).g;
        long[] jArr3 = ((s0a) na3Var2).g;
        long[] jArr4 = ((s0a) na3Var3).g;
        long[] l = et6.l(5);
        r0a.m(jArr, jArr2, l);
        r0a.m(jArr3, jArr4, l);
        long[] i = ws6.i();
        r0a.n(l, i);
        return new s0a(i);
    }

    @Override // defpackage.na3
    public na3 n() {
        long[] i = ws6.i();
        r0a.o(this.g, i);
        return new s0a(i);
    }

    @Override // defpackage.na3
    public na3 o() {
        long[] i = ws6.i();
        r0a.p(this.g, i);
        return new s0a(i);
    }

    @Override // defpackage.na3
    public na3 p(na3 na3Var, na3 na3Var2) {
        long[] jArr = this.g;
        long[] jArr2 = ((s0a) na3Var).g;
        long[] jArr3 = ((s0a) na3Var2).g;
        long[] l = et6.l(5);
        r0a.q(jArr, l);
        r0a.m(jArr2, jArr3, l);
        long[] i = ws6.i();
        r0a.n(l, i);
        return new s0a(i);
    }

    @Override // defpackage.na3
    public na3 q(int i) {
        if (i < 1) {
            return this;
        }
        long[] i2 = ws6.i();
        r0a.r(this.g, i, i2);
        return new s0a(i2);
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
        r0a.f(this.g, i);
        return new s0a(i);
    }

    @Override // defpackage.na3.a
    public boolean v() {
        return true;
    }

    @Override // defpackage.na3.a
    public int w() {
        return r0a.s(this.g);
    }

    public s0a(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 131) {
            throw new IllegalArgumentException("x value invalid for SecT131FieldElement");
        }
        this.g = r0a.e(bigInteger);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public s0a(long[] jArr) {
        this.g = jArr;
    }

    @Override // defpackage.na3
    public na3 m() {
        return this;
    }
}
