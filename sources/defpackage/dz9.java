package defpackage;

import defpackage.na3;
import java.math.BigInteger;
import org.bouncycastle.util.encoders.b;
/* renamed from: dz9  reason: default package */
/* loaded from: classes3.dex */
public class dz9 extends na3.b {
    public static final BigInteger h = new BigInteger(1, b.b("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFAC73"));
    protected int[] g;

    public dz9() {
        this.g = vs6.d();
    }

    @Override // defpackage.na3
    public na3 a(na3 na3Var) {
        int[] d = vs6.d();
        cz9.a(this.g, ((dz9) na3Var).g, d);
        return new dz9(d);
    }

    @Override // defpackage.na3
    public na3 b() {
        int[] d = vs6.d();
        cz9.b(this.g, d);
        return new dz9(d);
    }

    @Override // defpackage.na3
    public na3 d(na3 na3Var) {
        int[] d = vs6.d();
        cz9.d(((dz9) na3Var).g, d);
        cz9.f(d, this.g, d);
        return new dz9(d);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof dz9)) {
            return false;
        }
        return vs6.f(this.g, ((dz9) obj).g);
    }

    @Override // defpackage.na3
    public int f() {
        return h.bitLength();
    }

    @Override // defpackage.na3
    public na3 g() {
        int[] d = vs6.d();
        cz9.d(this.g, d);
        return new dz9(d);
    }

    @Override // defpackage.na3
    public boolean h() {
        return vs6.j(this.g);
    }

    public int hashCode() {
        return h.hashCode() ^ tr.J(this.g, 0, 5);
    }

    @Override // defpackage.na3
    public boolean i() {
        return vs6.k(this.g);
    }

    @Override // defpackage.na3
    public na3 j(na3 na3Var) {
        int[] d = vs6.d();
        cz9.f(this.g, ((dz9) na3Var).g, d);
        return new dz9(d);
    }

    @Override // defpackage.na3
    public na3 m() {
        int[] d = vs6.d();
        cz9.h(this.g, d);
        return new dz9(d);
    }

    @Override // defpackage.na3
    public na3 n() {
        int[] iArr = this.g;
        if (!vs6.k(iArr) && !vs6.j(iArr)) {
            int[] d = vs6.d();
            cz9.m(iArr, d);
            cz9.f(d, iArr, d);
            int[] d2 = vs6.d();
            cz9.m(d, d2);
            cz9.f(d2, iArr, d2);
            int[] d3 = vs6.d();
            cz9.m(d2, d3);
            cz9.f(d3, iArr, d3);
            int[] d4 = vs6.d();
            cz9.n(d3, 3, d4);
            cz9.f(d4, d2, d4);
            cz9.n(d4, 7, d3);
            cz9.f(d3, d4, d3);
            cz9.n(d3, 3, d4);
            cz9.f(d4, d2, d4);
            int[] d5 = vs6.d();
            cz9.n(d4, 14, d5);
            cz9.f(d5, d3, d5);
            cz9.n(d5, 31, d3);
            cz9.f(d3, d5, d3);
            cz9.n(d3, 62, d5);
            cz9.f(d5, d3, d5);
            cz9.n(d5, 3, d3);
            cz9.f(d3, d2, d3);
            cz9.n(d3, 18, d3);
            cz9.f(d3, d4, d3);
            cz9.n(d3, 2, d3);
            cz9.f(d3, iArr, d3);
            cz9.n(d3, 3, d3);
            cz9.f(d3, d, d3);
            cz9.n(d3, 6, d3);
            cz9.f(d3, d2, d3);
            cz9.n(d3, 2, d3);
            cz9.f(d3, iArr, d3);
            cz9.m(d3, d);
            if (vs6.f(iArr, d)) {
                return new dz9(d3);
            }
            return null;
        }
        return this;
    }

    @Override // defpackage.na3
    public na3 o() {
        int[] d = vs6.d();
        cz9.m(this.g, d);
        return new dz9(d);
    }

    @Override // defpackage.na3
    public na3 r(na3 na3Var) {
        int[] d = vs6.d();
        cz9.o(this.g, ((dz9) na3Var).g, d);
        return new dz9(d);
    }

    @Override // defpackage.na3
    public boolean s() {
        if (vs6.h(this.g, 0) != 1) {
            return false;
        }
        return true;
    }

    @Override // defpackage.na3
    public BigInteger t() {
        return vs6.u(this.g);
    }

    public dz9(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(h) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP160R2FieldElement");
        }
        this.g = cz9.c(bigInteger);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public dz9(int[] iArr) {
        this.g = iArr;
    }
}
