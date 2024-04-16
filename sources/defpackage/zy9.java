package defpackage;

import defpackage.na3;
import java.math.BigInteger;
import org.bouncycastle.util.encoders.b;
/* renamed from: zy9  reason: default package */
/* loaded from: classes3.dex */
public class zy9 extends na3.b {
    public static final BigInteger h = new BigInteger(1, b.b("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF7FFFFFFF"));
    protected int[] g;

    public zy9() {
        this.g = vs6.d();
    }

    @Override // defpackage.na3
    public na3 a(na3 na3Var) {
        int[] d = vs6.d();
        yy9.a(this.g, ((zy9) na3Var).g, d);
        return new zy9(d);
    }

    @Override // defpackage.na3
    public na3 b() {
        int[] d = vs6.d();
        yy9.b(this.g, d);
        return new zy9(d);
    }

    @Override // defpackage.na3
    public na3 d(na3 na3Var) {
        int[] d = vs6.d();
        yy9.d(((zy9) na3Var).g, d);
        yy9.f(d, this.g, d);
        return new zy9(d);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zy9)) {
            return false;
        }
        return vs6.f(this.g, ((zy9) obj).g);
    }

    @Override // defpackage.na3
    public int f() {
        return h.bitLength();
    }

    @Override // defpackage.na3
    public na3 g() {
        int[] d = vs6.d();
        yy9.d(this.g, d);
        return new zy9(d);
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
        yy9.f(this.g, ((zy9) na3Var).g, d);
        return new zy9(d);
    }

    @Override // defpackage.na3
    public na3 m() {
        int[] d = vs6.d();
        yy9.h(this.g, d);
        return new zy9(d);
    }

    @Override // defpackage.na3
    public na3 n() {
        int[] iArr = this.g;
        if (!vs6.k(iArr) && !vs6.j(iArr)) {
            int[] d = vs6.d();
            yy9.m(iArr, d);
            yy9.f(d, iArr, d);
            int[] d2 = vs6.d();
            yy9.n(d, 2, d2);
            yy9.f(d2, d, d2);
            yy9.n(d2, 4, d);
            yy9.f(d, d2, d);
            yy9.n(d, 8, d2);
            yy9.f(d2, d, d2);
            yy9.n(d2, 16, d);
            yy9.f(d, d2, d);
            yy9.n(d, 32, d2);
            yy9.f(d2, d, d2);
            yy9.n(d2, 64, d);
            yy9.f(d, d2, d);
            yy9.m(d, d2);
            yy9.f(d2, iArr, d2);
            yy9.n(d2, 29, d2);
            yy9.m(d2, d);
            if (vs6.f(iArr, d)) {
                return new zy9(d2);
            }
            return null;
        }
        return this;
    }

    @Override // defpackage.na3
    public na3 o() {
        int[] d = vs6.d();
        yy9.m(this.g, d);
        return new zy9(d);
    }

    @Override // defpackage.na3
    public na3 r(na3 na3Var) {
        int[] d = vs6.d();
        yy9.o(this.g, ((zy9) na3Var).g, d);
        return new zy9(d);
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

    public zy9(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(h) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP160R1FieldElement");
        }
        this.g = yy9.c(bigInteger);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public zy9(int[] iArr) {
        this.g = iArr;
    }
}
