package defpackage;

import defpackage.na3;
import java.math.BigInteger;
import org.bouncycastle.util.encoders.b;
/* renamed from: oq9  reason: default package */
/* loaded from: classes3.dex */
public class oq9 extends na3.b {
    public static final BigInteger h = new BigInteger(1, b.b("FFFFFFFEFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF00000000FFFFFFFFFFFFFFFF"));
    protected int[] g;

    public oq9() {
        this.g = ys6.i();
    }

    @Override // defpackage.na3
    public na3 a(na3 na3Var) {
        int[] i = ys6.i();
        nq9.a(this.g, ((oq9) na3Var).g, i);
        return new oq9(i);
    }

    @Override // defpackage.na3
    public na3 b() {
        int[] i = ys6.i();
        nq9.b(this.g, i);
        return new oq9(i);
    }

    @Override // defpackage.na3
    public na3 d(na3 na3Var) {
        int[] i = ys6.i();
        nq9.e(((oq9) na3Var).g, i);
        nq9.g(i, this.g, i);
        return new oq9(i);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof oq9)) {
            return false;
        }
        return ys6.n(this.g, ((oq9) obj).g);
    }

    @Override // defpackage.na3
    public int f() {
        return h.bitLength();
    }

    @Override // defpackage.na3
    public na3 g() {
        int[] i = ys6.i();
        nq9.e(this.g, i);
        return new oq9(i);
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
        nq9.g(this.g, ((oq9) na3Var).g, i);
        return new oq9(i);
    }

    @Override // defpackage.na3
    public na3 m() {
        int[] i = ys6.i();
        nq9.i(this.g, i);
        return new oq9(i);
    }

    @Override // defpackage.na3
    public na3 n() {
        int[] iArr = this.g;
        if (!ys6.v(iArr) && !ys6.t(iArr)) {
            int[] i = ys6.i();
            nq9.n(iArr, i);
            nq9.g(i, iArr, i);
            int[] i2 = ys6.i();
            nq9.o(i, 2, i2);
            nq9.g(i2, i, i2);
            int[] i3 = ys6.i();
            nq9.o(i2, 2, i3);
            nq9.g(i3, i, i3);
            nq9.o(i3, 6, i);
            nq9.g(i, i3, i);
            int[] i4 = ys6.i();
            nq9.o(i, 12, i4);
            nq9.g(i4, i, i4);
            nq9.o(i4, 6, i);
            nq9.g(i, i3, i);
            nq9.n(i, i3);
            nq9.g(i3, iArr, i3);
            nq9.o(i3, 31, i4);
            nq9.g(i4, i3, i);
            nq9.o(i4, 32, i4);
            nq9.g(i4, i, i4);
            nq9.o(i4, 62, i4);
            nq9.g(i4, i, i4);
            nq9.o(i4, 4, i4);
            nq9.g(i4, i2, i4);
            nq9.o(i4, 32, i4);
            nq9.g(i4, iArr, i4);
            nq9.o(i4, 62, i4);
            nq9.n(i4, i2);
            if (ys6.n(iArr, i2)) {
                return new oq9(i4);
            }
            return null;
        }
        return this;
    }

    @Override // defpackage.na3
    public na3 o() {
        int[] i = ys6.i();
        nq9.n(this.g, i);
        return new oq9(i);
    }

    @Override // defpackage.na3
    public na3 r(na3 na3Var) {
        int[] i = ys6.i();
        nq9.q(this.g, ((oq9) na3Var).g, i);
        return new oq9(i);
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

    public oq9(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(h) >= 0) {
            throw new IllegalArgumentException("x value invalid for SM2P256V1FieldElement");
        }
        this.g = nq9.d(bigInteger);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public oq9(int[] iArr) {
        this.g = iArr;
    }
}
