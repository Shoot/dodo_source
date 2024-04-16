package defpackage;

import java.math.BigInteger;
/* renamed from: l72  reason: default package */
/* loaded from: classes3.dex */
public class l72 extends d72 {
    private static final BigInteger d = BigInteger.valueOf(1);
    private static final BigInteger e = BigInteger.valueOf(2);
    private BigInteger c;

    public l72(BigInteger bigInteger, h72 h72Var) {
        super(false, h72Var);
        this.c = e(bigInteger, h72Var);
    }

    private static int d(BigInteger bigInteger, BigInteger bigInteger2) {
        int bitLength = bigInteger2.bitLength();
        int[] r = et6.r(bitLength, bigInteger);
        int[] r2 = et6.r(bitLength, bigInteger2);
        int length = r2.length;
        int i = 0;
        while (true) {
            int i2 = r[0];
            if (i2 == 0) {
                et6.I(length, r, 0);
            } else {
                int b = g65.b(i2);
                if (b > 0) {
                    et6.G(length, r, b, 0);
                    int i3 = r2[0];
                    i ^= (b << 1) & (i3 ^ (i3 >>> 1));
                }
                int i4 = et6.i(length, r, r2);
                if (i4 == 0) {
                    break;
                }
                if (i4 < 0) {
                    i ^= r[0] & r2[0];
                    int[] iArr = r2;
                    r2 = r;
                    r = iArr;
                }
                while (true) {
                    int i5 = length - 1;
                    if (r[i5] != 0) {
                        break;
                    }
                    length = i5;
                }
                et6.Q(length, r, r2, r);
            }
        }
        if (!et6.z(length, r2)) {
            return 0;
        }
        return 1 - (i & 2);
    }

    private BigInteger e(BigInteger bigInteger, h72 h72Var) {
        if (bigInteger != null) {
            BigInteger f = h72Var.f();
            BigInteger bigInteger2 = e;
            if (bigInteger.compareTo(bigInteger2) >= 0 && bigInteger.compareTo(f.subtract(bigInteger2)) <= 0) {
                BigInteger g = h72Var.g();
                if (g == null) {
                    return bigInteger;
                }
                if (f.testBit(0) && f.bitLength() - 1 == g.bitLength() && f.shiftRight(1).equals(g)) {
                    if (1 == d(bigInteger, f)) {
                        return bigInteger;
                    }
                } else if (d.equals(bigInteger.modPow(g, f))) {
                    return bigInteger;
                }
                throw new IllegalArgumentException("Y value does not appear to be in correct group");
            }
            throw new IllegalArgumentException("invalid DH public key");
        }
        throw new NullPointerException("y value cannot be null");
    }

    public BigInteger c() {
        return this.c;
    }

    @Override // defpackage.d72
    public boolean equals(Object obj) {
        if (!(obj instanceof l72) || !((l72) obj).c().equals(this.c) || !super.equals(obj)) {
            return false;
        }
        return true;
    }

    @Override // defpackage.d72
    public int hashCode() {
        return this.c.hashCode() ^ super.hashCode();
    }
}
