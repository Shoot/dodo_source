package defpackage;

import defpackage.na3;
import java.math.BigInteger;
/* renamed from: c2a  reason: default package */
/* loaded from: classes3.dex */
public class c2a extends na3.a {
    protected long[] g;

    public c2a() {
        this.g = bt6.c();
    }

    @Override // defpackage.na3
    public na3 a(na3 na3Var) {
        long[] c = bt6.c();
        b2a.a(this.g, ((c2a) na3Var).g, c);
        return new c2a(c);
    }

    @Override // defpackage.na3
    public na3 b() {
        long[] c = bt6.c();
        b2a.c(this.g, c);
        return new c2a(c);
    }

    @Override // defpackage.na3
    public na3 d(na3 na3Var) {
        return j(na3Var.g());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c2a)) {
            return false;
        }
        return bt6.e(this.g, ((c2a) obj).g);
    }

    @Override // defpackage.na3
    public int f() {
        return 409;
    }

    @Override // defpackage.na3
    public na3 g() {
        long[] c = bt6.c();
        b2a.l(this.g, c);
        return new c2a(c);
    }

    @Override // defpackage.na3
    public boolean h() {
        return bt6.f(this.g);
    }

    public int hashCode() {
        return tr.K(this.g, 0, 7) ^ 4090087;
    }

    @Override // defpackage.na3
    public boolean i() {
        return bt6.g(this.g);
    }

    @Override // defpackage.na3
    public na3 j(na3 na3Var) {
        long[] c = bt6.c();
        b2a.m(this.g, ((c2a) na3Var).g, c);
        return new c2a(c);
    }

    @Override // defpackage.na3
    public na3 k(na3 na3Var, na3 na3Var2, na3 na3Var3) {
        return l(na3Var, na3Var2, na3Var3);
    }

    @Override // defpackage.na3
    public na3 l(na3 na3Var, na3 na3Var2, na3 na3Var3) {
        long[] jArr = this.g;
        long[] jArr2 = ((c2a) na3Var).g;
        long[] jArr3 = ((c2a) na3Var2).g;
        long[] jArr4 = ((c2a) na3Var3).g;
        long[] l = et6.l(13);
        b2a.n(jArr, jArr2, l);
        b2a.n(jArr3, jArr4, l);
        long[] c = bt6.c();
        b2a.o(l, c);
        return new c2a(c);
    }

    @Override // defpackage.na3
    public na3 n() {
        long[] c = bt6.c();
        b2a.p(this.g, c);
        return new c2a(c);
    }

    @Override // defpackage.na3
    public na3 o() {
        long[] c = bt6.c();
        b2a.q(this.g, c);
        return new c2a(c);
    }

    @Override // defpackage.na3
    public na3 p(na3 na3Var, na3 na3Var2) {
        long[] jArr = this.g;
        long[] jArr2 = ((c2a) na3Var).g;
        long[] jArr3 = ((c2a) na3Var2).g;
        long[] l = et6.l(13);
        b2a.r(jArr, l);
        b2a.n(jArr2, jArr3, l);
        long[] c = bt6.c();
        b2a.o(l, c);
        return new c2a(c);
    }

    @Override // defpackage.na3
    public na3 q(int i) {
        if (i < 1) {
            return this;
        }
        long[] c = bt6.c();
        b2a.s(this.g, i, c);
        return new c2a(c);
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
        return bt6.h(this.g);
    }

    @Override // defpackage.na3.a
    public na3 u() {
        long[] c = bt6.c();
        b2a.f(this.g, c);
        return new c2a(c);
    }

    @Override // defpackage.na3.a
    public boolean v() {
        return true;
    }

    @Override // defpackage.na3.a
    public int w() {
        return b2a.t(this.g);
    }

    public c2a(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 409) {
            throw new IllegalArgumentException("x value invalid for SecT409FieldElement");
        }
        this.g = b2a.e(bigInteger);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public c2a(long[] jArr) {
        this.g = jArr;
    }

    @Override // defpackage.na3
    public na3 m() {
        return this;
    }
}
