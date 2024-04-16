package defpackage;

import java.math.BigInteger;
import java.security.SecureRandom;
/* renamed from: j72  reason: default package */
/* loaded from: classes3.dex */
class j72 {
    private static final BigInteger a = BigInteger.valueOf(1);
    private static final BigInteger b = BigInteger.valueOf(2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static BigInteger[] a(int i, int i2, SecureRandom secureRandom) {
        int i3 = i - 1;
        int i4 = i >>> 2;
        while (true) {
            BigInteger g = db0.g(i3, 2, secureRandom);
            BigInteger add = g.shiftLeft(1).add(a);
            if (add.isProbablePrime(i2) && (i2 <= 2 || g.isProbablePrime(i2 - 2))) {
                if (n2c.h(add) >= i4) {
                    return new BigInteger[]{add, g};
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static BigInteger b(BigInteger bigInteger, BigInteger bigInteger2, SecureRandom secureRandom) {
        BigInteger modPow;
        BigInteger subtract = bigInteger.subtract(b);
        do {
            BigInteger bigInteger3 = b;
            modPow = db0.f(bigInteger3, subtract, secureRandom).modPow(bigInteger3, bigInteger);
        } while (modPow.equals(a));
        return modPow;
    }
}
