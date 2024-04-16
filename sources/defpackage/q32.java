package defpackage;

import defpackage.na3;
import java.math.BigInteger;
/* renamed from: q32  reason: default package */
/* loaded from: classes3.dex */
public class q32 extends na3.b {
    public static final BigInteger h = ys6.J(p32.a);
    private static final int[] i = {1242472624, -991028441, -1389370248, 792926214, 1039914919, 726466713, 1338105611, 730014848};
    protected int[] g;

    public q32() {
        this.g = ys6.i();
    }

    @Override // defpackage.na3
    public na3 a(na3 na3Var) {
        int[] i2 = ys6.i();
        p32.a(this.g, ((q32) na3Var).g, i2);
        return new q32(i2);
    }

    @Override // defpackage.na3
    public na3 b() {
        int[] i2 = ys6.i();
        p32.b(this.g, i2);
        return new q32(i2);
    }

    @Override // defpackage.na3
    public na3 d(na3 na3Var) {
        int[] i2 = ys6.i();
        p32.e(((q32) na3Var).g, i2);
        p32.g(i2, this.g, i2);
        return new q32(i2);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q32)) {
            return false;
        }
        return ys6.n(this.g, ((q32) obj).g);
    }

    @Override // defpackage.na3
    public int f() {
        return h.bitLength();
    }

    @Override // defpackage.na3
    public na3 g() {
        int[] i2 = ys6.i();
        p32.e(this.g, i2);
        return new q32(i2);
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
        int[] i2 = ys6.i();
        p32.g(this.g, ((q32) na3Var).g, i2);
        return new q32(i2);
    }

    @Override // defpackage.na3
    public na3 m() {
        int[] i2 = ys6.i();
        p32.i(this.g, i2);
        return new q32(i2);
    }

    @Override // defpackage.na3
    public na3 n() {
        int[] iArr = this.g;
        if (!ys6.v(iArr) && !ys6.t(iArr)) {
            int[] i2 = ys6.i();
            p32.n(iArr, i2);
            p32.g(i2, iArr, i2);
            p32.n(i2, i2);
            p32.g(i2, iArr, i2);
            int[] i3 = ys6.i();
            p32.n(i2, i3);
            p32.g(i3, iArr, i3);
            int[] i4 = ys6.i();
            p32.o(i3, 3, i4);
            p32.g(i4, i2, i4);
            p32.o(i4, 4, i2);
            p32.g(i2, i3, i2);
            p32.o(i2, 4, i4);
            p32.g(i4, i3, i4);
            p32.o(i4, 15, i3);
            p32.g(i3, i4, i3);
            p32.o(i3, 30, i4);
            p32.g(i4, i3, i4);
            p32.o(i4, 60, i3);
            p32.g(i3, i4, i3);
            p32.o(i3, 11, i4);
            p32.g(i4, i2, i4);
            p32.o(i4, 120, i2);
            p32.g(i2, i3, i2);
            p32.n(i2, i2);
            p32.n(i2, i3);
            if (ys6.n(iArr, i3)) {
                return new q32(i2);
            }
            p32.g(i2, i, i2);
            p32.n(i2, i3);
            if (ys6.n(iArr, i3)) {
                return new q32(i2);
            }
            return null;
        }
        return this;
    }

    @Override // defpackage.na3
    public na3 o() {
        int[] i2 = ys6.i();
        p32.n(this.g, i2);
        return new q32(i2);
    }

    @Override // defpackage.na3
    public na3 r(na3 na3Var) {
        int[] i2 = ys6.i();
        p32.r(this.g, ((q32) na3Var).g, i2);
        return new q32(i2);
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

    public q32(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(h) >= 0) {
            throw new IllegalArgumentException("x value invalid for Curve25519FieldElement");
        }
        this.g = p32.d(bigInteger);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public q32(int[] iArr) {
        this.g = iArr;
    }
}
