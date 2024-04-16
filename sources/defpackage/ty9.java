package defpackage;

import defpackage.na3;
import java.math.BigInteger;
import org.bouncycastle.util.encoders.b;
/* renamed from: ty9  reason: default package */
/* loaded from: classes3.dex */
public class ty9 extends na3.b {
    public static final BigInteger h = new BigInteger(1, b.b("FFFFFFFDFFFFFFFFFFFFFFFFFFFFFFFF"));
    protected int[] g;

    public ty9() {
        this.g = us6.f();
    }

    @Override // defpackage.na3
    public na3 a(na3 na3Var) {
        int[] f = us6.f();
        sy9.a(this.g, ((ty9) na3Var).g, f);
        return new ty9(f);
    }

    @Override // defpackage.na3
    public na3 b() {
        int[] f = us6.f();
        sy9.b(this.g, f);
        return new ty9(f);
    }

    @Override // defpackage.na3
    public na3 d(na3 na3Var) {
        int[] f = us6.f();
        sy9.e(((ty9) na3Var).g, f);
        sy9.g(f, this.g, f);
        return new ty9(f);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ty9)) {
            return false;
        }
        return us6.j(this.g, ((ty9) obj).g);
    }

    @Override // defpackage.na3
    public int f() {
        return h.bitLength();
    }

    @Override // defpackage.na3
    public na3 g() {
        int[] f = us6.f();
        sy9.e(this.g, f);
        return new ty9(f);
    }

    @Override // defpackage.na3
    public boolean h() {
        return us6.o(this.g);
    }

    public int hashCode() {
        return h.hashCode() ^ tr.J(this.g, 0, 4);
    }

    @Override // defpackage.na3
    public boolean i() {
        return us6.q(this.g);
    }

    @Override // defpackage.na3
    public na3 j(na3 na3Var) {
        int[] f = us6.f();
        sy9.g(this.g, ((ty9) na3Var).g, f);
        return new ty9(f);
    }

    @Override // defpackage.na3
    public na3 m() {
        int[] f = us6.f();
        sy9.i(this.g, f);
        return new ty9(f);
    }

    @Override // defpackage.na3
    public na3 n() {
        int[] iArr = this.g;
        if (!us6.q(iArr) && !us6.o(iArr)) {
            int[] f = us6.f();
            sy9.n(iArr, f);
            sy9.g(f, iArr, f);
            int[] f2 = us6.f();
            sy9.o(f, 2, f2);
            sy9.g(f2, f, f2);
            int[] f3 = us6.f();
            sy9.o(f2, 4, f3);
            sy9.g(f3, f2, f3);
            sy9.o(f3, 2, f2);
            sy9.g(f2, f, f2);
            sy9.o(f2, 10, f);
            sy9.g(f, f2, f);
            sy9.o(f, 10, f3);
            sy9.g(f3, f2, f3);
            sy9.n(f3, f2);
            sy9.g(f2, iArr, f2);
            sy9.o(f2, 95, f2);
            sy9.n(f2, f3);
            if (us6.j(iArr, f3)) {
                return new ty9(f2);
            }
            return null;
        }
        return this;
    }

    @Override // defpackage.na3
    public na3 o() {
        int[] f = us6.f();
        sy9.n(this.g, f);
        return new ty9(f);
    }

    @Override // defpackage.na3
    public na3 r(na3 na3Var) {
        int[] f = us6.f();
        sy9.q(this.g, ((ty9) na3Var).g, f);
        return new ty9(f);
    }

    @Override // defpackage.na3
    public boolean s() {
        if (us6.m(this.g, 0) != 1) {
            return false;
        }
        return true;
    }

    @Override // defpackage.na3
    public BigInteger t() {
        return us6.x(this.g);
    }

    public ty9(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(h) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP128R1FieldElement");
        }
        this.g = sy9.d(bigInteger);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ty9(int[] iArr) {
        this.g = iArr;
    }
}
