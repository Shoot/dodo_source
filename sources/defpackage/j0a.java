package defpackage;

import defpackage.na3;
import java.math.BigInteger;
import org.bouncycastle.util.encoders.b;
/* renamed from: j0a  reason: default package */
/* loaded from: classes3.dex */
public class j0a extends na3.b {
    public static final BigInteger h = new BigInteger(1, b.b("01FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF"));
    protected int[] g;

    public j0a() {
        this.g = et6.k(17);
    }

    @Override // defpackage.na3
    public na3 a(na3 na3Var) {
        int[] k = et6.k(17);
        i0a.a(this.g, ((j0a) na3Var).g, k);
        return new j0a(k);
    }

    @Override // defpackage.na3
    public na3 b() {
        int[] k = et6.k(17);
        i0a.b(this.g, k);
        return new j0a(k);
    }

    @Override // defpackage.na3
    public na3 d(na3 na3Var) {
        int[] k = et6.k(17);
        i0a.f(((j0a) na3Var).g, k);
        i0a.h(k, this.g, k);
        return new j0a(k);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j0a)) {
            return false;
        }
        return et6.o(17, this.g, ((j0a) obj).g);
    }

    @Override // defpackage.na3
    public int f() {
        return h.bitLength();
    }

    @Override // defpackage.na3
    public na3 g() {
        int[] k = et6.k(17);
        i0a.f(this.g, k);
        return new j0a(k);
    }

    @Override // defpackage.na3
    public boolean h() {
        return et6.z(17, this.g);
    }

    public int hashCode() {
        return h.hashCode() ^ tr.J(this.g, 0, 17);
    }

    @Override // defpackage.na3
    public boolean i() {
        return et6.A(17, this.g);
    }

    @Override // defpackage.na3
    public na3 j(na3 na3Var) {
        int[] k = et6.k(17);
        i0a.h(this.g, ((j0a) na3Var).g, k);
        return new j0a(k);
    }

    @Override // defpackage.na3
    public na3 m() {
        int[] k = et6.k(17);
        i0a.i(this.g, k);
        return new j0a(k);
    }

    @Override // defpackage.na3
    public na3 n() {
        int[] iArr = this.g;
        if (!et6.A(17, iArr) && !et6.z(17, iArr)) {
            int[] k = et6.k(17);
            int[] k2 = et6.k(17);
            i0a.o(iArr, 519, k);
            i0a.n(k, k2);
            if (et6.o(17, iArr, k2)) {
                return new j0a(k);
            }
            return null;
        }
        return this;
    }

    @Override // defpackage.na3
    public na3 o() {
        int[] k = et6.k(17);
        i0a.n(this.g, k);
        return new j0a(k);
    }

    @Override // defpackage.na3
    public na3 r(na3 na3Var) {
        int[] k = et6.k(17);
        i0a.p(this.g, ((j0a) na3Var).g, k);
        return new j0a(k);
    }

    @Override // defpackage.na3
    public boolean s() {
        if (et6.t(this.g, 0) != 1) {
            return false;
        }
        return true;
    }

    @Override // defpackage.na3
    public BigInteger t() {
        return et6.V(17, this.g);
    }

    public j0a(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(h) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP521R1FieldElement");
        }
        this.g = i0a.c(bigInteger);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public j0a(int[] iArr) {
        this.g = iArr;
    }
}
