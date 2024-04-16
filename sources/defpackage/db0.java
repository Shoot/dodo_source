package defpackage;

import java.math.BigInteger;
import java.security.SecureRandom;
/* renamed from: db0  reason: default package */
/* loaded from: classes3.dex */
public final class db0 {
    public static final BigInteger a = BigInteger.valueOf(0);
    public static final BigInteger b = BigInteger.valueOf(1);
    public static final BigInteger c = BigInteger.valueOf(2);
    private static final BigInteger d = BigInteger.valueOf(3);
    private static final BigInteger e = new BigInteger("8138e8a0fcf3a4e84a771d40fd305d7f4aa59306d7251de54d98af8fe95729a1f73d893fa424cd2edc8636a6c3285e022b0e3866a565ae8108eed8591cd4fe8d2ce86165a978d719ebf647f362d33fca29cd179fb42401cbaf3df0c614056f9c8f3cfd51e474afb6bc6974f78db8aba8e9e517fded658591ab7502bd41849462f", 16);
    private static final int f = BigInteger.valueOf(743).bitLength();

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0012, code lost:
        if (r3.length != 1) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(java.math.BigInteger r3, byte[] r4, int r5, int r6) {
        /*
            byte[] r3 = r3.toByteArray()
            int r0 = r3.length
            r1 = 0
            if (r0 != r6) goto Lc
            java.lang.System.arraycopy(r3, r1, r4, r5, r6)
            return
        Lc:
            r0 = r3[r1]
            if (r0 != 0) goto L15
            int r0 = r3.length
            r2 = 1
            if (r0 == r2) goto L15
            goto L16
        L15:
            r2 = 0
        L16:
            int r0 = r3.length
            int r0 = r0 - r2
            if (r0 > r6) goto L23
            int r6 = r6 - r0
            int r6 = r6 + r5
            defpackage.tr.z(r4, r5, r6, r1)
            java.lang.System.arraycopy(r3, r2, r4, r6, r0)
            return
        L23:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "standard length exceeded for value"
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.db0.a(java.math.BigInteger, byte[], int, int):void");
    }

    public static byte[] b(int i, BigInteger bigInteger) {
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray.length == i) {
            return byteArray;
        }
        int i2 = 0;
        if (byteArray[0] == 0 && byteArray.length != 1) {
            i2 = 1;
        }
        int length = byteArray.length - i2;
        if (length <= i) {
            byte[] bArr = new byte[i];
            System.arraycopy(byteArray, i2, bArr, i - length, length);
            return bArr;
        }
        throw new IllegalArgumentException("standard length exceeded for value");
    }

    public static byte[] c(BigInteger bigInteger) {
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray[0] == 0 && byteArray.length != 1) {
            int length = byteArray.length - 1;
            byte[] bArr = new byte[length];
            System.arraycopy(byteArray, 1, bArr, 0, length);
            return bArr;
        }
        return byteArray;
    }

    private static byte[] d(int i, SecureRandom secureRandom) throws IllegalArgumentException {
        if (i >= 1) {
            int i2 = (i + 7) / 8;
            byte[] bArr = new byte[i2];
            secureRandom.nextBytes(bArr);
            bArr[0] = (byte) (bArr[0] & ((byte) (255 >>> ((i2 * 8) - i))));
            return bArr;
        }
        throw new IllegalArgumentException("bitLength must be at least 1");
    }

    public static BigInteger e(int i, SecureRandom secureRandom) {
        return new BigInteger(1, d(i, secureRandom));
    }

    public static BigInteger f(BigInteger bigInteger, BigInteger bigInteger2, SecureRandom secureRandom) {
        BigInteger e2;
        int compareTo = bigInteger.compareTo(bigInteger2);
        if (compareTo >= 0) {
            if (compareTo <= 0) {
                return bigInteger;
            }
            throw new IllegalArgumentException("'min' may not be greater than 'max'");
        }
        if (bigInteger.bitLength() > bigInteger2.bitLength() / 2) {
            e2 = f(a, bigInteger2.subtract(bigInteger), secureRandom);
        } else {
            for (int i = 0; i < 1000; i++) {
                BigInteger e3 = e(bigInteger2.bitLength(), secureRandom);
                if (e3.compareTo(bigInteger) >= 0 && e3.compareTo(bigInteger2) <= 0) {
                    return e3;
                }
            }
            e2 = e(bigInteger2.subtract(bigInteger).bitLength() - 1, secureRandom);
        }
        return e2.add(bigInteger);
    }

    public static BigInteger g(int i, int i2, SecureRandom secureRandom) {
        BigInteger bigInteger;
        if (i >= 2) {
            if (i == 2) {
                if (secureRandom.nextInt() < 0) {
                    return c;
                }
                return d;
            }
            do {
                byte[] d2 = d(i, secureRandom);
                d2[0] = (byte) (((byte) (1 << (7 - ((d2.length * 8) - i)))) | d2[0]);
                int length = d2.length - 1;
                d2[length] = (byte) (d2[length] | 1);
                bigInteger = new BigInteger(1, d2);
                if (i > f) {
                    while (!bigInteger.gcd(e).equals(b)) {
                        bigInteger = bigInteger.add(c);
                    }
                }
            } while (!bigInteger.isProbablePrime(i2));
            return bigInteger;
        }
        throw new IllegalArgumentException("bitLength < 2");
    }

    public static BigInteger h(byte[] bArr, int i, int i2) {
        if (i != 0 || i2 != bArr.length) {
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, i, bArr2, 0, i2);
            bArr = bArr2;
        }
        return new BigInteger(1, bArr);
    }

    public static int i(BigInteger bigInteger) {
        if (bigInteger.equals(a)) {
            return 1;
        }
        return (bigInteger.bitLength() + 7) / 8;
    }

    public static BigInteger j(BigInteger bigInteger, BigInteger bigInteger2) {
        if (bigInteger.testBit(0)) {
            if (bigInteger.signum() == 1) {
                if (bigInteger2.signum() < 0 || bigInteger2.compareTo(bigInteger) >= 0) {
                    bigInteger2 = bigInteger2.mod(bigInteger);
                }
                int bitLength = bigInteger.bitLength();
                int[] r = et6.r(bitLength, bigInteger);
                int[] r2 = et6.r(bitLength, bigInteger2);
                int length = r.length;
                int[] k = et6.k(length);
                if (jm6.k(r, r2, k) != 0) {
                    return et6.V(length, k);
                }
                throw new ArithmeticException("BigInteger not invertible.");
            }
            throw new ArithmeticException("BigInteger: modulus not positive");
        }
        throw new IllegalArgumentException("'M' must be odd");
    }

    public static BigInteger k(BigInteger bigInteger, BigInteger bigInteger2) {
        if (bigInteger.testBit(0)) {
            if (bigInteger.signum() == 1) {
                BigInteger bigInteger3 = b;
                if (bigInteger.equals(bigInteger3)) {
                    return a;
                }
                if (bigInteger2.signum() < 0 || bigInteger2.compareTo(bigInteger) >= 0) {
                    bigInteger2 = bigInteger2.mod(bigInteger);
                }
                if (bigInteger2.equals(bigInteger3)) {
                    return bigInteger3;
                }
                int bitLength = bigInteger.bitLength();
                int[] r = et6.r(bitLength, bigInteger);
                int[] r2 = et6.r(bitLength, bigInteger2);
                int length = r.length;
                int[] k = et6.k(length);
                if (jm6.l(r, r2, k)) {
                    return et6.V(length, k);
                }
                throw new ArithmeticException("BigInteger not invertible.");
            }
            throw new ArithmeticException("BigInteger: modulus not positive");
        }
        throw new IllegalArgumentException("'M' must be odd");
    }
}
