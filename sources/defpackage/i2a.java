package defpackage;

import defpackage.na3;
import java.math.BigInteger;
/* renamed from: i2a  reason: default package */
/* loaded from: classes3.dex */
public class i2a extends na3.a {
    protected long[] g;

    public i2a() {
        this.g = dt6.c();
    }

    @Override // defpackage.na3
    public na3 a(na3 na3Var) {
        long[] c = dt6.c();
        h2a.b(this.g, ((i2a) na3Var).g, c);
        return new i2a(c);
    }

    @Override // defpackage.na3
    public na3 b() {
        long[] c = dt6.c();
        h2a.f(this.g, c);
        return new i2a(c);
    }

    @Override // defpackage.na3
    public na3 d(na3 na3Var) {
        return j(na3Var.g());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i2a)) {
            return false;
        }
        return dt6.e(this.g, ((i2a) obj).g);
    }

    @Override // defpackage.na3
    public int f() {
        return 571;
    }

    @Override // defpackage.na3
    public na3 g() {
        long[] c = dt6.c();
        h2a.n(this.g, c);
        return new i2a(c);
    }

    @Override // defpackage.na3
    public boolean h() {
        return dt6.f(this.g);
    }

    public int hashCode() {
        return tr.K(this.g, 0, 9) ^ 5711052;
    }

    @Override // defpackage.na3
    public boolean i() {
        return dt6.g(this.g);
    }

    @Override // defpackage.na3
    public na3 j(na3 na3Var) {
        long[] c = dt6.c();
        h2a.o(this.g, ((i2a) na3Var).g, c);
        return new i2a(c);
    }

    @Override // defpackage.na3
    public na3 k(na3 na3Var, na3 na3Var2, na3 na3Var3) {
        return l(na3Var, na3Var2, na3Var3);
    }

    @Override // defpackage.na3
    public na3 l(na3 na3Var, na3 na3Var2, na3 na3Var3) {
        long[] jArr = this.g;
        long[] jArr2 = ((i2a) na3Var).g;
        long[] jArr3 = ((i2a) na3Var2).g;
        long[] jArr4 = ((i2a) na3Var3).g;
        long[] d = dt6.d();
        h2a.p(jArr, jArr2, d);
        h2a.p(jArr3, jArr4, d);
        long[] c = dt6.c();
        h2a.t(d, c);
        return new i2a(c);
    }

    @Override // defpackage.na3
    public na3 n() {
        long[] c = dt6.c();
        h2a.v(this.g, c);
        return new i2a(c);
    }

    @Override // defpackage.na3
    public na3 o() {
        long[] c = dt6.c();
        h2a.w(this.g, c);
        return new i2a(c);
    }

    @Override // defpackage.na3
    public na3 p(na3 na3Var, na3 na3Var2) {
        long[] jArr = this.g;
        long[] jArr2 = ((i2a) na3Var).g;
        long[] jArr3 = ((i2a) na3Var2).g;
        long[] d = dt6.d();
        h2a.x(jArr, d);
        h2a.p(jArr2, jArr3, d);
        long[] c = dt6.c();
        h2a.t(d, c);
        return new i2a(c);
    }

    @Override // defpackage.na3
    public na3 q(int i) {
        if (i < 1) {
            return this;
        }
        long[] c = dt6.c();
        h2a.y(this.g, i, c);
        return new i2a(c);
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
        return dt6.h(this.g);
    }

    @Override // defpackage.na3.a
    public na3 u() {
        long[] c = dt6.c();
        h2a.i(this.g, c);
        return new i2a(c);
    }

    @Override // defpackage.na3.a
    public boolean v() {
        return true;
    }

    @Override // defpackage.na3.a
    public int w() {
        return h2a.z(this.g);
    }

    public i2a(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 571) {
            throw new IllegalArgumentException("x value invalid for SecT571FieldElement");
        }
        this.g = h2a.h(bigInteger);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public i2a(long[] jArr) {
        this.g = jArr;
    }

    @Override // defpackage.na3
    public na3 m() {
        return this;
    }
}
