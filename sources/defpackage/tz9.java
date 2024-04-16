package defpackage;

import defpackage.na3;
import java.math.BigInteger;
import org.bouncycastle.util.encoders.b;
/* renamed from: tz9  reason: default package */
/* loaded from: classes3.dex */
public class tz9 extends na3.b {
    public static final BigInteger h = new BigInteger(1, b.b("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF000000000000000000000001"));
    protected int[] g;

    public tz9() {
        this.g = xs6.e();
    }

    private static void u(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5, int[] iArr6, int[] iArr7) {
        sz9.g(iArr5, iArr3, iArr7);
        sz9.g(iArr7, iArr, iArr7);
        sz9.g(iArr4, iArr2, iArr6);
        sz9.a(iArr6, iArr7, iArr6);
        sz9.g(iArr4, iArr3, iArr7);
        xs6.d(iArr6, iArr4);
        sz9.g(iArr5, iArr2, iArr5);
        sz9.a(iArr5, iArr7, iArr5);
        sz9.n(iArr5, iArr6);
        sz9.g(iArr6, iArr, iArr6);
    }

    private static void v(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5) {
        xs6.d(iArr, iArr4);
        int[] e = xs6.e();
        int[] e2 = xs6.e();
        for (int i = 0; i < 7; i++) {
            xs6.d(iArr2, e);
            xs6.d(iArr3, e2);
            int i2 = 1 << i;
            while (true) {
                i2--;
                if (i2 >= 0) {
                    w(iArr2, iArr3, iArr4, iArr5);
                }
            }
            u(iArr, e, e2, iArr2, iArr3, iArr4, iArr5);
        }
    }

    private static void w(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        sz9.g(iArr2, iArr, iArr2);
        sz9.r(iArr2, iArr2);
        sz9.n(iArr, iArr4);
        sz9.a(iArr3, iArr4, iArr);
        sz9.g(iArr3, iArr4, iArr3);
        sz9.m(et6.M(7, iArr3, 2, 0), iArr3);
    }

    private static boolean x(int[] iArr) {
        int[] e = xs6.e();
        int[] e2 = xs6.e();
        xs6.d(iArr, e);
        for (int i = 0; i < 7; i++) {
            xs6.d(e, e2);
            sz9.o(e, 1 << i, e);
            sz9.g(e, e2, e);
        }
        sz9.o(e, 95, e);
        return xs6.k(e);
    }

    private static boolean y(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] e = xs6.e();
        xs6.d(iArr2, e);
        int[] e2 = xs6.e();
        e2[0] = 1;
        int[] e3 = xs6.e();
        v(iArr, e, e2, e3, iArr3);
        int[] e4 = xs6.e();
        int[] e5 = xs6.e();
        for (int i = 1; i < 96; i++) {
            xs6.d(e, e4);
            xs6.d(e2, e5);
            w(e, e2, e3, iArr3);
            if (xs6.l(e)) {
                sz9.e(e5, iArr3);
                sz9.g(iArr3, e4, iArr3);
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.na3
    public na3 a(na3 na3Var) {
        int[] e = xs6.e();
        sz9.a(this.g, ((tz9) na3Var).g, e);
        return new tz9(e);
    }

    @Override // defpackage.na3
    public na3 b() {
        int[] e = xs6.e();
        sz9.b(this.g, e);
        return new tz9(e);
    }

    @Override // defpackage.na3
    public na3 d(na3 na3Var) {
        int[] e = xs6.e();
        sz9.e(((tz9) na3Var).g, e);
        sz9.g(e, this.g, e);
        return new tz9(e);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof tz9)) {
            return false;
        }
        return xs6.g(this.g, ((tz9) obj).g);
    }

    @Override // defpackage.na3
    public int f() {
        return h.bitLength();
    }

    @Override // defpackage.na3
    public na3 g() {
        int[] e = xs6.e();
        sz9.e(this.g, e);
        return new tz9(e);
    }

    @Override // defpackage.na3
    public boolean h() {
        return xs6.k(this.g);
    }

    public int hashCode() {
        return h.hashCode() ^ tr.J(this.g, 0, 7);
    }

    @Override // defpackage.na3
    public boolean i() {
        return xs6.l(this.g);
    }

    @Override // defpackage.na3
    public na3 j(na3 na3Var) {
        int[] e = xs6.e();
        sz9.g(this.g, ((tz9) na3Var).g, e);
        return new tz9(e);
    }

    @Override // defpackage.na3
    public na3 m() {
        int[] e = xs6.e();
        sz9.i(this.g, e);
        return new tz9(e);
    }

    @Override // defpackage.na3
    public na3 n() {
        int[] iArr = this.g;
        if (!xs6.l(iArr) && !xs6.k(iArr)) {
            int[] e = xs6.e();
            sz9.i(iArr, e);
            int[] n = jm6.n(sz9.a);
            int[] e2 = xs6.e();
            if (!x(iArr)) {
                return null;
            }
            while (!y(e, n, e2)) {
                sz9.b(n, n);
            }
            sz9.n(e2, n);
            if (!xs6.g(iArr, n)) {
                return null;
            }
            return new tz9(e2);
        }
        return this;
    }

    @Override // defpackage.na3
    public na3 o() {
        int[] e = xs6.e();
        sz9.n(this.g, e);
        return new tz9(e);
    }

    @Override // defpackage.na3
    public na3 r(na3 na3Var) {
        int[] e = xs6.e();
        sz9.q(this.g, ((tz9) na3Var).g, e);
        return new tz9(e);
    }

    @Override // defpackage.na3
    public boolean s() {
        if (xs6.i(this.g, 0) != 1) {
            return false;
        }
        return true;
    }

    @Override // defpackage.na3
    public BigInteger t() {
        return xs6.u(this.g);
    }

    public tz9(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(h) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP224R1FieldElement");
        }
        this.g = sz9.d(bigInteger);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public tz9(int[] iArr) {
        this.g = iArr;
    }
}
