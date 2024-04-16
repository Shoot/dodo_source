package defpackage;

import defpackage.na3;
import java.math.BigInteger;
import org.bouncycastle.util.encoders.b;
/* renamed from: xz9  reason: default package */
/* loaded from: classes3.dex */
public class xz9 extends na3.b {
    public static final BigInteger h = new BigInteger(1, b.b("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFC2F"));
    protected int[] g;

    public xz9() {
        this.g = ys6.i();
    }

    @Override // defpackage.na3
    public na3 a(na3 na3Var) {
        int[] i = ys6.i();
        wz9.a(this.g, ((xz9) na3Var).g, i);
        return new xz9(i);
    }

    @Override // defpackage.na3
    public na3 b() {
        int[] i = ys6.i();
        wz9.b(this.g, i);
        return new xz9(i);
    }

    @Override // defpackage.na3
    public na3 d(na3 na3Var) {
        int[] i = ys6.i();
        wz9.d(((xz9) na3Var).g, i);
        wz9.f(i, this.g, i);
        return new xz9(i);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof xz9)) {
            return false;
        }
        return ys6.n(this.g, ((xz9) obj).g);
    }

    @Override // defpackage.na3
    public int f() {
        return h.bitLength();
    }

    @Override // defpackage.na3
    public na3 g() {
        int[] i = ys6.i();
        wz9.d(this.g, i);
        return new xz9(i);
    }

    @Override // defpackage.na3
    public boolean h() {
        return ys6.t(this.g);
    }

    public int hashCode() {
        return h.hashCode() ^ tr.J(this.g, 0, 8);
    }

    @Override // defpackage.na3
    public boolean i() {
        return ys6.v(this.g);
    }

    @Override // defpackage.na3
    public na3 j(na3 na3Var) {
        int[] i = ys6.i();
        wz9.f(this.g, ((xz9) na3Var).g, i);
        return new xz9(i);
    }

    @Override // defpackage.na3
    public na3 m() {
        int[] i = ys6.i();
        wz9.h(this.g, i);
        return new xz9(i);
    }

    @Override // defpackage.na3
    public na3 n() {
        int[] iArr = this.g;
        if (!ys6.v(iArr) && !ys6.t(iArr)) {
            int[] i = ys6.i();
            wz9.m(iArr, i);
            wz9.f(i, iArr, i);
            int[] i2 = ys6.i();
            wz9.m(i, i2);
            wz9.f(i2, iArr, i2);
            int[] i3 = ys6.i();
            wz9.n(i2, 3, i3);
            wz9.f(i3, i2, i3);
            wz9.n(i3, 3, i3);
            wz9.f(i3, i2, i3);
            wz9.n(i3, 2, i3);
            wz9.f(i3, i, i3);
            int[] i4 = ys6.i();
            wz9.n(i3, 11, i4);
            wz9.f(i4, i3, i4);
            wz9.n(i4, 22, i3);
            wz9.f(i3, i4, i3);
            int[] i5 = ys6.i();
            wz9.n(i3, 44, i5);
            wz9.f(i5, i3, i5);
            int[] i6 = ys6.i();
            wz9.n(i5, 88, i6);
            wz9.f(i6, i5, i6);
            wz9.n(i6, 44, i5);
            wz9.f(i5, i3, i5);
            wz9.n(i5, 3, i3);
            wz9.f(i3, i2, i3);
            wz9.n(i3, 23, i3);
            wz9.f(i3, i4, i3);
            wz9.n(i3, 6, i3);
            wz9.f(i3, i, i3);
            wz9.n(i3, 2, i3);
            wz9.m(i3, i);
            if (ys6.n(iArr, i)) {
                return new xz9(i3);
            }
            return null;
        }
        return this;
    }

    @Override // defpackage.na3
    public na3 o() {
        int[] i = ys6.i();
        wz9.m(this.g, i);
        return new xz9(i);
    }

    @Override // defpackage.na3
    public na3 r(na3 na3Var) {
        int[] i = ys6.i();
        wz9.o(this.g, ((xz9) na3Var).g, i);
        return new xz9(i);
    }

    @Override // defpackage.na3
    public boolean s() {
        if (ys6.q(this.g, 0) != 1) {
            return false;
        }
        return true;
    }

    @Override // defpackage.na3
    public BigInteger t() {
        return ys6.J(this.g);
    }

    public xz9(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(h) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP256K1FieldElement");
        }
        this.g = wz9.c(bigInteger);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public xz9(int[] iArr) {
        this.g = iArr;
    }
}
