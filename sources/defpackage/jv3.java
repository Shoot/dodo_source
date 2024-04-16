package defpackage;

import java.math.BigInteger;
/* renamed from: jv3  reason: default package */
/* loaded from: classes3.dex */
public abstract class jv3 {
    static final iv3 a = new oj8(BigInteger.valueOf(2));
    static final iv3 b = new oj8(BigInteger.valueOf(3));

    public static ve8 a(int[] iArr) {
        if (iArr[0] == 0) {
            for (int i = 1; i < iArr.length; i++) {
                if (iArr[i] <= iArr[i - 1]) {
                    throw new IllegalArgumentException("Polynomial exponents must be monotonically increasing");
                }
            }
            return new kd4(a, new ja4(iArr));
        }
        throw new IllegalArgumentException("Irreducible polynomials in GF(2) must have constant term");
    }

    public static iv3 b(BigInteger bigInteger) {
        int bitLength = bigInteger.bitLength();
        if (bigInteger.signum() > 0 && bitLength >= 2) {
            if (bitLength < 3) {
                int intValue = bigInteger.intValue();
                if (intValue != 2) {
                    if (intValue == 3) {
                        return b;
                    }
                } else {
                    return a;
                }
            }
            return new oj8(bigInteger);
        }
        throw new IllegalArgumentException("'characteristic' must be >= 2");
    }
}
