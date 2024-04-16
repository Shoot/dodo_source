package defpackage;

import defpackage.na3;
import java.math.BigInteger;
import org.bouncycastle.util.encoders.b;
/* renamed from: hz9  reason: default package */
/* loaded from: classes3.dex */
public class hz9 extends na3.b {
    public static final BigInteger h = new BigInteger(1, b.b("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFEE37"));
    protected int[] g;

    public hz9() {
        this.g = ws6.h();
    }

    @Override // defpackage.na3
    public na3 a(na3 na3Var) {
        int[] h2 = ws6.h();
        gz9.a(this.g, ((hz9) na3Var).g, h2);
        return new hz9(h2);
    }

    @Override // defpackage.na3
    public na3 b() {
        int[] h2 = ws6.h();
        gz9.b(this.g, h2);
        return new hz9(h2);
    }

    @Override // defpackage.na3
    public na3 d(na3 na3Var) {
        int[] h2 = ws6.h();
        gz9.d(((hz9) na3Var).g, h2);
        gz9.f(h2, this.g, h2);
        return new hz9(h2);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof hz9)) {
            return false;
        }
        return ws6.m(this.g, ((hz9) obj).g);
    }

    @Override // defpackage.na3
    public int f() {
        return h.bitLength();
    }

    @Override // defpackage.na3
    public na3 g() {
        int[] h2 = ws6.h();
        gz9.d(this.g, h2);
        return new hz9(h2);
    }

    @Override // defpackage.na3
    public boolean h() {
        return ws6.s(this.g);
    }

    public int hashCode() {
        return h.hashCode() ^ tr.J(this.g, 0, 6);
    }

    @Override // defpackage.na3
    public boolean i() {
        return ws6.u(this.g);
    }

    @Override // defpackage.na3
    public na3 j(na3 na3Var) {
        int[] h2 = ws6.h();
        gz9.f(this.g, ((hz9) na3Var).g, h2);
        return new hz9(h2);
    }

    @Override // defpackage.na3
    public na3 m() {
        int[] h2 = ws6.h();
        gz9.h(this.g, h2);
        return new hz9(h2);
    }

    @Override // defpackage.na3
    public na3 n() {
        int[] iArr = this.g;
        if (!ws6.u(iArr) && !ws6.s(iArr)) {
            int[] h2 = ws6.h();
            gz9.m(iArr, h2);
            gz9.f(h2, iArr, h2);
            int[] h3 = ws6.h();
            gz9.m(h2, h3);
            gz9.f(h3, iArr, h3);
            int[] h4 = ws6.h();
            gz9.n(h3, 3, h4);
            gz9.f(h4, h3, h4);
            gz9.n(h4, 2, h4);
            gz9.f(h4, h2, h4);
            gz9.n(h4, 8, h2);
            gz9.f(h2, h4, h2);
            gz9.n(h2, 3, h4);
            gz9.f(h4, h3, h4);
            int[] h5 = ws6.h();
            gz9.n(h4, 16, h5);
            gz9.f(h5, h2, h5);
            gz9.n(h5, 35, h2);
            gz9.f(h2, h5, h2);
            gz9.n(h2, 70, h5);
            gz9.f(h5, h2, h5);
            gz9.n(h5, 19, h2);
            gz9.f(h2, h4, h2);
            gz9.n(h2, 20, h2);
            gz9.f(h2, h4, h2);
            gz9.n(h2, 4, h2);
            gz9.f(h2, h3, h2);
            gz9.n(h2, 6, h2);
            gz9.f(h2, h3, h2);
            gz9.m(h2, h2);
            gz9.m(h2, h3);
            if (ws6.m(iArr, h3)) {
                return new hz9(h2);
            }
            return null;
        }
        return this;
    }

    @Override // defpackage.na3
    public na3 o() {
        int[] h2 = ws6.h();
        gz9.m(this.g, h2);
        return new hz9(h2);
    }

    @Override // defpackage.na3
    public na3 r(na3 na3Var) {
        int[] h2 = ws6.h();
        gz9.o(this.g, ((hz9) na3Var).g, h2);
        return new hz9(h2);
    }

    @Override // defpackage.na3
    public boolean s() {
        if (ws6.p(this.g, 0) != 1) {
            return false;
        }
        return true;
    }

    @Override // defpackage.na3
    public BigInteger t() {
        return ws6.H(this.g);
    }

    public hz9(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(h) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP192K1FieldElement");
        }
        this.g = gz9.c(bigInteger);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public hz9(int[] iArr) {
        this.g = iArr;
    }
}
