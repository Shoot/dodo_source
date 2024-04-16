package defpackage;

import defpackage.na3;
import java.math.BigInteger;
import org.bouncycastle.util.encoders.b;
/* renamed from: lz9  reason: default package */
/* loaded from: classes3.dex */
public class lz9 extends na3.b {
    public static final BigInteger h = new BigInteger(1, b.b("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFFFFFFFFFF"));
    protected int[] g;

    public lz9() {
        this.g = ws6.h();
    }

    @Override // defpackage.na3
    public na3 a(na3 na3Var) {
        int[] h2 = ws6.h();
        kz9.a(this.g, ((lz9) na3Var).g, h2);
        return new lz9(h2);
    }

    @Override // defpackage.na3
    public na3 b() {
        int[] h2 = ws6.h();
        kz9.b(this.g, h2);
        return new lz9(h2);
    }

    @Override // defpackage.na3
    public na3 d(na3 na3Var) {
        int[] h2 = ws6.h();
        kz9.e(((lz9) na3Var).g, h2);
        kz9.g(h2, this.g, h2);
        return new lz9(h2);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof lz9)) {
            return false;
        }
        return ws6.m(this.g, ((lz9) obj).g);
    }

    @Override // defpackage.na3
    public int f() {
        return h.bitLength();
    }

    @Override // defpackage.na3
    public na3 g() {
        int[] h2 = ws6.h();
        kz9.e(this.g, h2);
        return new lz9(h2);
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
        kz9.g(this.g, ((lz9) na3Var).g, h2);
        return new lz9(h2);
    }

    @Override // defpackage.na3
    public na3 m() {
        int[] h2 = ws6.h();
        kz9.i(this.g, h2);
        return new lz9(h2);
    }

    @Override // defpackage.na3
    public na3 n() {
        int[] iArr = this.g;
        if (!ws6.u(iArr) && !ws6.s(iArr)) {
            int[] h2 = ws6.h();
            int[] h3 = ws6.h();
            kz9.n(iArr, h2);
            kz9.g(h2, iArr, h2);
            kz9.o(h2, 2, h3);
            kz9.g(h3, h2, h3);
            kz9.o(h3, 4, h2);
            kz9.g(h2, h3, h2);
            kz9.o(h2, 8, h3);
            kz9.g(h3, h2, h3);
            kz9.o(h3, 16, h2);
            kz9.g(h2, h3, h2);
            kz9.o(h2, 32, h3);
            kz9.g(h3, h2, h3);
            kz9.o(h3, 64, h2);
            kz9.g(h2, h3, h2);
            kz9.o(h2, 62, h2);
            kz9.n(h2, h3);
            if (ws6.m(iArr, h3)) {
                return new lz9(h2);
            }
            return null;
        }
        return this;
    }

    @Override // defpackage.na3
    public na3 o() {
        int[] h2 = ws6.h();
        kz9.n(this.g, h2);
        return new lz9(h2);
    }

    @Override // defpackage.na3
    public na3 r(na3 na3Var) {
        int[] h2 = ws6.h();
        kz9.q(this.g, ((lz9) na3Var).g, h2);
        return new lz9(h2);
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

    public lz9(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(h) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP192R1FieldElement");
        }
        this.g = kz9.d(bigInteger);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public lz9(int[] iArr) {
        this.g = iArr;
    }
}
