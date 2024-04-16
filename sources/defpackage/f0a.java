package defpackage;

import defpackage.na3;
import java.math.BigInteger;
import org.bouncycastle.util.encoders.b;
/* renamed from: f0a  reason: default package */
/* loaded from: classes3.dex */
public class f0a extends na3.b {
    public static final BigInteger h = new BigInteger(1, b.b("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFF0000000000000000FFFFFFFF"));
    protected int[] g;

    public f0a() {
        this.g = et6.k(12);
    }

    @Override // defpackage.na3
    public na3 a(na3 na3Var) {
        int[] k = et6.k(12);
        e0a.a(this.g, ((f0a) na3Var).g, k);
        return new f0a(k);
    }

    @Override // defpackage.na3
    public na3 b() {
        int[] k = et6.k(12);
        e0a.c(this.g, k);
        return new f0a(k);
    }

    @Override // defpackage.na3
    public na3 d(na3 na3Var) {
        int[] k = et6.k(12);
        e0a.f(((f0a) na3Var).g, k);
        e0a.h(k, this.g, k);
        return new f0a(k);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0a)) {
            return false;
        }
        return et6.o(12, this.g, ((f0a) obj).g);
    }

    @Override // defpackage.na3
    public int f() {
        return h.bitLength();
    }

    @Override // defpackage.na3
    public na3 g() {
        int[] k = et6.k(12);
        e0a.f(this.g, k);
        return new f0a(k);
    }

    @Override // defpackage.na3
    public boolean h() {
        return et6.z(12, this.g);
    }

    public int hashCode() {
        return h.hashCode() ^ tr.J(this.g, 0, 12);
    }

    @Override // defpackage.na3
    public boolean i() {
        return et6.A(12, this.g);
    }

    @Override // defpackage.na3
    public na3 j(na3 na3Var) {
        int[] k = et6.k(12);
        e0a.h(this.g, ((f0a) na3Var).g, k);
        return new f0a(k);
    }

    @Override // defpackage.na3
    public na3 m() {
        int[] k = et6.k(12);
        e0a.i(this.g, k);
        return new f0a(k);
    }

    @Override // defpackage.na3
    public na3 n() {
        int[] iArr = this.g;
        if (!et6.A(12, iArr) && !et6.z(12, iArr)) {
            int[] k = et6.k(12);
            int[] k2 = et6.k(12);
            int[] k3 = et6.k(12);
            int[] k4 = et6.k(12);
            e0a.n(iArr, k);
            e0a.h(k, iArr, k);
            e0a.o(k, 2, k2);
            e0a.h(k2, k, k2);
            e0a.n(k2, k2);
            e0a.h(k2, iArr, k2);
            e0a.o(k2, 5, k3);
            e0a.h(k3, k2, k3);
            e0a.o(k3, 5, k4);
            e0a.h(k4, k2, k4);
            e0a.o(k4, 15, k2);
            e0a.h(k2, k4, k2);
            e0a.o(k2, 2, k3);
            e0a.h(k, k3, k);
            e0a.o(k3, 28, k3);
            e0a.h(k2, k3, k2);
            e0a.o(k2, 60, k3);
            e0a.h(k3, k2, k3);
            e0a.o(k3, 120, k2);
            e0a.h(k2, k3, k2);
            e0a.o(k2, 15, k2);
            e0a.h(k2, k4, k2);
            e0a.o(k2, 33, k2);
            e0a.h(k2, k, k2);
            e0a.o(k2, 64, k2);
            e0a.h(k2, iArr, k2);
            e0a.o(k2, 30, k);
            e0a.n(k, k2);
            if (et6.o(12, iArr, k2)) {
                return new f0a(k);
            }
            return null;
        }
        return this;
    }

    @Override // defpackage.na3
    public na3 o() {
        int[] k = et6.k(12);
        e0a.n(this.g, k);
        return new f0a(k);
    }

    @Override // defpackage.na3
    public na3 r(na3 na3Var) {
        int[] k = et6.k(12);
        e0a.q(this.g, ((f0a) na3Var).g, k);
        return new f0a(k);
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
        return et6.V(12, this.g);
    }

    public f0a(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(h) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP384R1FieldElement");
        }
        this.g = e0a.e(bigInteger);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public f0a(int[] iArr) {
        this.g = iArr;
    }
}
