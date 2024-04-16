package defpackage;

import defpackage.na3;
import java.math.BigInteger;
import org.bouncycastle.util.encoders.b;
/* renamed from: b0a  reason: default package */
/* loaded from: classes3.dex */
public class b0a extends na3.b {
    public static final BigInteger h = new BigInteger(1, b.b("FFFFFFFF00000001000000000000000000000000FFFFFFFFFFFFFFFFFFFFFFFF"));
    protected int[] g;

    public b0a() {
        this.g = ys6.i();
    }

    @Override // defpackage.na3
    public na3 a(na3 na3Var) {
        int[] i = ys6.i();
        a0a.a(this.g, ((b0a) na3Var).g, i);
        return new b0a(i);
    }

    @Override // defpackage.na3
    public na3 b() {
        int[] i = ys6.i();
        a0a.b(this.g, i);
        return new b0a(i);
    }

    @Override // defpackage.na3
    public na3 d(na3 na3Var) {
        int[] i = ys6.i();
        a0a.e(((b0a) na3Var).g, i);
        a0a.g(i, this.g, i);
        return new b0a(i);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b0a)) {
            return false;
        }
        return ys6.n(this.g, ((b0a) obj).g);
    }

    @Override // defpackage.na3
    public int f() {
        return h.bitLength();
    }

    @Override // defpackage.na3
    public na3 g() {
        int[] i = ys6.i();
        a0a.e(this.g, i);
        return new b0a(i);
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
        a0a.g(this.g, ((b0a) na3Var).g, i);
        return new b0a(i);
    }

    @Override // defpackage.na3
    public na3 m() {
        int[] i = ys6.i();
        a0a.i(this.g, i);
        return new b0a(i);
    }

    @Override // defpackage.na3
    public na3 n() {
        int[] iArr = this.g;
        if (!ys6.v(iArr) && !ys6.t(iArr)) {
            int[] i = ys6.i();
            int[] i2 = ys6.i();
            a0a.n(iArr, i);
            a0a.g(i, iArr, i);
            a0a.o(i, 2, i2);
            a0a.g(i2, i, i2);
            a0a.o(i2, 4, i);
            a0a.g(i, i2, i);
            a0a.o(i, 8, i2);
            a0a.g(i2, i, i2);
            a0a.o(i2, 16, i);
            a0a.g(i, i2, i);
            a0a.o(i, 32, i);
            a0a.g(i, iArr, i);
            a0a.o(i, 96, i);
            a0a.g(i, iArr, i);
            a0a.o(i, 94, i);
            a0a.n(i, i2);
            if (ys6.n(iArr, i2)) {
                return new b0a(i);
            }
            return null;
        }
        return this;
    }

    @Override // defpackage.na3
    public na3 o() {
        int[] i = ys6.i();
        a0a.n(this.g, i);
        return new b0a(i);
    }

    @Override // defpackage.na3
    public na3 r(na3 na3Var) {
        int[] i = ys6.i();
        a0a.q(this.g, ((b0a) na3Var).g, i);
        return new b0a(i);
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

    public b0a(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(h) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP256R1FieldElement");
        }
        this.g = a0a.d(bigInteger);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public b0a(int[] iArr) {
        this.g = iArr;
    }
}
