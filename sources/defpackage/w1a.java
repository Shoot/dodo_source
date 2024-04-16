package defpackage;

import defpackage.na3;
import java.math.BigInteger;
/* renamed from: w1a  reason: default package */
/* loaded from: classes3.dex */
public class w1a extends na3.a {
    protected long[] g;

    public w1a() {
        this.g = zs6.c();
    }

    @Override // defpackage.na3
    public na3 a(na3 na3Var) {
        long[] c = zs6.c();
        v1a.a(this.g, ((w1a) na3Var).g, c);
        return new w1a(c);
    }

    @Override // defpackage.na3
    public na3 b() {
        long[] c = zs6.c();
        v1a.c(this.g, c);
        return new w1a(c);
    }

    @Override // defpackage.na3
    public na3 d(na3 na3Var) {
        return j(na3Var.g());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof w1a)) {
            return false;
        }
        return zs6.e(this.g, ((w1a) obj).g);
    }

    @Override // defpackage.na3
    public int f() {
        return 283;
    }

    @Override // defpackage.na3
    public na3 g() {
        long[] c = zs6.c();
        v1a.l(this.g, c);
        return new w1a(c);
    }

    @Override // defpackage.na3
    public boolean h() {
        return zs6.f(this.g);
    }

    public int hashCode() {
        return tr.K(this.g, 0, 5) ^ 2831275;
    }

    @Override // defpackage.na3
    public boolean i() {
        return zs6.g(this.g);
    }

    @Override // defpackage.na3
    public na3 j(na3 na3Var) {
        long[] c = zs6.c();
        v1a.m(this.g, ((w1a) na3Var).g, c);
        return new w1a(c);
    }

    @Override // defpackage.na3
    public na3 k(na3 na3Var, na3 na3Var2, na3 na3Var3) {
        return l(na3Var, na3Var2, na3Var3);
    }

    @Override // defpackage.na3
    public na3 l(na3 na3Var, na3 na3Var2, na3 na3Var3) {
        long[] jArr = this.g;
        long[] jArr2 = ((w1a) na3Var).g;
        long[] jArr3 = ((w1a) na3Var2).g;
        long[] jArr4 = ((w1a) na3Var3).g;
        long[] l = et6.l(9);
        v1a.n(jArr, jArr2, l);
        v1a.n(jArr3, jArr4, l);
        long[] c = zs6.c();
        v1a.o(l, c);
        return new w1a(c);
    }

    @Override // defpackage.na3
    public na3 n() {
        long[] c = zs6.c();
        v1a.p(this.g, c);
        return new w1a(c);
    }

    @Override // defpackage.na3
    public na3 o() {
        long[] c = zs6.c();
        v1a.q(this.g, c);
        return new w1a(c);
    }

    @Override // defpackage.na3
    public na3 p(na3 na3Var, na3 na3Var2) {
        long[] jArr = this.g;
        long[] jArr2 = ((w1a) na3Var).g;
        long[] jArr3 = ((w1a) na3Var2).g;
        long[] l = et6.l(9);
        v1a.r(jArr, l);
        v1a.n(jArr2, jArr3, l);
        long[] c = zs6.c();
        v1a.o(l, c);
        return new w1a(c);
    }

    @Override // defpackage.na3
    public na3 q(int i) {
        if (i < 1) {
            return this;
        }
        long[] c = zs6.c();
        v1a.s(this.g, i, c);
        return new w1a(c);
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
        return zs6.h(this.g);
    }

    @Override // defpackage.na3.a
    public na3 u() {
        long[] c = zs6.c();
        v1a.f(this.g, c);
        return new w1a(c);
    }

    @Override // defpackage.na3.a
    public boolean v() {
        return true;
    }

    @Override // defpackage.na3.a
    public int w() {
        return v1a.t(this.g);
    }

    public w1a(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 283) {
            throw new IllegalArgumentException("x value invalid for SecT283FieldElement");
        }
        this.g = v1a.e(bigInteger);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public w1a(long[] jArr) {
        this.g = jArr;
    }

    @Override // defpackage.na3
    public na3 m() {
        return this;
    }
}
