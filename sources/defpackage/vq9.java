package defpackage;

import java.math.BigInteger;
/* renamed from: vq9  reason: default package */
/* loaded from: classes3.dex */
class vq9 {
    protected static final double a = Math.log(2.0d);
    protected static final double b = Math.pow(2.0d, 96.0d);

    protected static short[] A(xc0 xc0Var, int i, byte[] bArr, short[] sArr, int i2, int i3) {
        int i4 = i3 / 2;
        int i5 = i3 - i4;
        short[] sArr2 = new short[i5];
        short[] sArr3 = new short[i4];
        System.arraycopy(sArr, i2, sArr2, 0, i5);
        System.arraycopy(sArr, i2 + i5, sArr3, 0, i4);
        return m(xc0Var, i, bArr, i3, i4, i5, sArr2, sArr3);
    }

    protected static byte[] B(xc0 xc0Var, int i, byte[] bArr, byte[] bArr2, int i2, int i3) {
        int i4 = i3 / 2;
        int i5 = i3 - i4;
        return J(s(xc0Var, i, bArr, i3, i4, i5, K(bArr2, i2, i5), K(bArr2, i2 + i5, i4)));
    }

    protected static short[] C(xc0 xc0Var, int i, byte[] bArr, short[] sArr, int i2, int i3) {
        int i4 = i3 / 2;
        int i5 = i3 - i4;
        short[] sArr2 = new short[i5];
        short[] sArr3 = new short[i4];
        System.arraycopy(sArr, i2, sArr2, 0, i5);
        System.arraycopy(sArr, i2 + i5, sArr3, 0, i4);
        return s(xc0Var, i, bArr, i3, i4, i5, sArr2, sArr3);
    }

    protected static BigInteger D(BigInteger bigInteger, short[] sArr) {
        BigInteger bigInteger2 = db0.a;
        for (short s : sArr) {
            bigInteger2 = bigInteger2.multiply(bigInteger).add(BigInteger.valueOf(s & 65535));
        }
        return bigInteger2;
    }

    protected static BigInteger E(byte[] bArr, int i, int i2) {
        return new BigInteger(1, tr.w(bArr, i, i2 + i));
    }

    protected static byte[] F(xc0 xc0Var, byte[] bArr) {
        if (bArr.length % 16 == 0) {
            int length = bArr.length / 16;
            byte[] bArr2 = new byte[16];
            for (int i = 0; i < length; i++) {
                L(bArr, i * 16, bArr2, 0, 16);
                xc0Var.b(bArr2, 0, bArr2, 0);
            }
            return bArr2;
        }
        throw new IllegalArgumentException();
    }

    protected static void G(byte[] bArr) {
        int length = bArr.length / 2;
        int length2 = bArr.length - 1;
        for (int i = 0; i < length; i++) {
            byte b2 = bArr[i];
            int i2 = length2 - i;
            bArr[i] = bArr[i2];
            bArr[i2] = b2;
        }
    }

    protected static void H(short[] sArr) {
        int length = sArr.length / 2;
        int length2 = sArr.length - 1;
        for (int i = 0; i < length; i++) {
            short s = sArr[i];
            int i2 = length2 - i;
            sArr[i] = sArr[i2];
            sArr[i2] = s;
        }
    }

    protected static void I(BigInteger bigInteger, BigInteger bigInteger2, int i, short[] sArr, int i2) {
        if (bigInteger2.signum() >= 0) {
            for (int i3 = 1; i3 <= i; i3++) {
                BigInteger[] divideAndRemainder = bigInteger2.divideAndRemainder(bigInteger);
                sArr[(i2 + i) - i3] = (short) divideAndRemainder[1].intValue();
                bigInteger2 = divideAndRemainder[0];
            }
            if (bigInteger2.signum() == 0) {
                return;
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException();
    }

    private static byte[] J(short[] sArr) {
        int length = sArr.length;
        byte[] bArr = new byte[length];
        for (int i = 0; i != length; i++) {
            bArr[i] = (byte) sArr[i];
        }
        return bArr;
    }

    private static short[] K(byte[] bArr, int i, int i2) {
        short[] sArr = new short[i2];
        for (int i3 = 0; i3 != i2; i3++) {
            sArr[i3] = (short) (bArr[i + i3] & 255);
        }
        return sArr;
    }

    protected static void L(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = i2 + i4;
            bArr2[i5] = (byte) (bArr2[i5] ^ bArr[i + i4]);
        }
    }

    protected static BigInteger[] a(BigInteger bigInteger, int i, int i2) {
        BigInteger pow = bigInteger.pow(i);
        BigInteger[] bigIntegerArr = {pow, pow};
        if (i2 != i) {
            bigIntegerArr[1] = pow.multiply(bigInteger);
        }
        return bigIntegerArr;
    }

    protected static byte[] b(int i, byte b2, int i2, int i3) {
        byte[] bArr = {1, 2, 1, 0, (byte) (i >> 8), (byte) i, 10, b2};
        mo7.f(i2, bArr, 8);
        mo7.f(i3, bArr, 12);
        return bArr;
    }

    protected static byte[] c(byte[] bArr) {
        return new byte[]{bArr[0], bArr[1], bArr[2], (byte) (bArr[3] & 240), bArr[4], bArr[5], bArr[6], (byte) (bArr[3] << 4)};
    }

    protected static BigInteger d(xc0 xc0Var, BigInteger bigInteger, byte[] bArr, int i, int i2, int i3, byte[] bArr2, short[] sArr) {
        int length = bArr.length;
        byte[] c = db0.c(D(bigInteger, sArr));
        int i4 = ((-(length + i + 1)) & 15) + length;
        int i5 = i4 + 1 + i;
        byte[] bArr3 = new byte[i5];
        System.arraycopy(bArr, 0, bArr3, 0, length);
        bArr3[i4] = (byte) i3;
        System.arraycopy(c, 0, bArr3, i5 - c.length, c.length);
        byte[] F = F(xc0Var, tr.p(bArr2, bArr3));
        if (i2 > 16) {
            int i6 = (i2 + 15) / 16;
            byte[] bArr4 = new byte[i6 * 16];
            System.arraycopy(F, 0, bArr4, 0, 16);
            byte[] bArr5 = new byte[4];
            for (int i7 = 1; i7 < i6; i7++) {
                int i8 = i7 * 16;
                System.arraycopy(F, 0, bArr4, i8, 16);
                mo7.f(i7, bArr5, 0);
                L(bArr5, 0, bArr4, i8 + 12, 4);
                xc0Var.b(bArr4, i8, bArr4, i8);
            }
            F = bArr4;
        }
        return E(F, 0, i2);
    }

    protected static BigInteger e(xc0 xc0Var, BigInteger bigInteger, byte[] bArr, int i, int i2, short[] sArr) {
        byte[] bArr2 = new byte[16];
        mo7.f(i2, bArr2, 0);
        L(bArr, i, bArr2, 0, 4);
        byte[] c = db0.c(D(bigInteger, sArr));
        if (16 - c.length >= 4) {
            System.arraycopy(c, 0, bArr2, 16 - c.length, c.length);
            G(bArr2);
            xc0Var.b(bArr2, 0, bArr2, 0);
            G(bArr2);
            return E(bArr2, 0, 16);
        }
        throw new IllegalStateException("input out of range");
    }

    protected static void f(xc0 xc0Var, boolean z, int i, byte[] bArr, int i2, int i3) {
        h(xc0Var);
        if (i >= 2 && i <= 256) {
            i(z, i, bArr, i2, i3);
            return;
        }
        throw new IllegalArgumentException();
    }

    protected static void g(xc0 xc0Var, boolean z, int i, short[] sArr, int i2, int i3) {
        h(xc0Var);
        if (i >= 2 && i <= 65536) {
            j(z, i, sArr, i2, i3);
            return;
        }
        throw new IllegalArgumentException();
    }

    protected static void h(xc0 xc0Var) {
        if (16 == xc0Var.a()) {
            return;
        }
        throw new IllegalArgumentException();
    }

    protected static void i(boolean z, int i, byte[] bArr, int i2, int i3) {
        k(z, i, i3);
        for (int i4 = 0; i4 < i3; i4++) {
            if ((bArr[i2 + i4] & 255) >= i) {
                throw new IllegalArgumentException("input data outside of radix");
            }
        }
    }

    protected static void j(boolean z, int i, short[] sArr, int i2, int i3) {
        k(z, i, i3);
        for (int i4 = 0; i4 < i3; i4++) {
            if ((sArr[i2 + i4] & 65535) >= i) {
                throw new IllegalArgumentException("input data outside of radix");
            }
        }
    }

    private static void k(boolean z, int i, int i2) {
        int floor;
        if (i2 >= 2) {
            double d = i;
            if (Math.pow(d, i2) >= 1000000.0d) {
                if (!z && i2 > (floor = ((int) Math.floor(Math.log(b) / Math.log(d))) * 2)) {
                    throw new IllegalArgumentException("maximum input length is " + floor);
                }
                return;
            }
        }
        throw new IllegalArgumentException("input too short");
    }

    static short[] l(xc0 xc0Var, int i, byte[] bArr, int i2, int i3, int i4, short[] sArr, short[] sArr2) {
        int length = bArr.length;
        int ceil = (((int) Math.ceil((Math.log(i) * i4) / a)) + 7) / 8;
        int i5 = (((ceil + 3) / 4) * 4) + 4;
        byte[] b2 = b(i, (byte) i3, i2, length);
        BigInteger valueOf = BigInteger.valueOf(i);
        BigInteger[] a2 = a(valueOf, i3, i4);
        short[] sArr3 = sArr;
        short[] sArr4 = sArr2;
        int i6 = i3;
        int i7 = 9;
        while (i7 >= 0) {
            short[] sArr5 = sArr4;
            sArr4 = sArr3;
            i6 = i2 - i6;
            I(valueOf, D(valueOf, sArr5).subtract(d(xc0Var, valueOf, bArr, ceil, i5, i7, b2, sArr4)).mod(a2[i7 & 1]), i6, sArr5, 0);
            i7--;
            sArr3 = sArr5;
        }
        return tr.s(sArr3, sArr4);
    }

    private static short[] m(xc0 xc0Var, int i, byte[] bArr, int i2, int i3, int i4, short[] sArr, short[] sArr2) {
        BigInteger valueOf = BigInteger.valueOf(i);
        int i5 = i4;
        BigInteger[] a2 = a(valueOf, i3, i5);
        H(sArr);
        H(sArr2);
        short[] sArr3 = sArr;
        short[] sArr4 = sArr2;
        int i6 = 7;
        while (i6 >= 0) {
            int i7 = i2 - i5;
            int i8 = i6 & 1;
            I(valueOf, D(valueOf, sArr4).subtract(e(xc0Var, valueOf, bArr, 4 - (i8 * 4), i6, sArr3)).mod(a2[1 - i8]), i7, sArr4, 0);
            i6--;
            i5 = i7;
            short[] sArr5 = sArr4;
            sArr4 = sArr3;
            sArr3 = sArr5;
        }
        H(sArr3);
        H(sArr4);
        return tr.s(sArr3, sArr4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] n(xc0 xc0Var, int i, byte[] bArr, byte[] bArr2, int i2, int i3) {
        f(xc0Var, true, i, bArr2, i2, i3);
        int i4 = i3 / 2;
        int i5 = i3 - i4;
        return J(l(xc0Var, i, bArr, i3, i4, i5, K(bArr2, i2, i4), K(bArr2, i2 + i4, i5)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static short[] o(xc0 xc0Var, int i, byte[] bArr, short[] sArr, int i2, int i3) {
        g(xc0Var, true, i, sArr, i2, i3);
        int i4 = i3 / 2;
        int i5 = i3 - i4;
        short[] sArr2 = new short[i4];
        short[] sArr3 = new short[i5];
        System.arraycopy(sArr, i2, sArr2, 0, i4);
        System.arraycopy(sArr, i2 + i4, sArr3, 0, i5);
        return l(xc0Var, i, bArr, i3, i4, i5, sArr2, sArr3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] p(xc0 xc0Var, int i, byte[] bArr, byte[] bArr2, int i2, int i3) {
        f(xc0Var, false, i, bArr2, i2, i3);
        if (bArr.length == 7) {
            return z(xc0Var, i, c(bArr), bArr2, i2, i3);
        }
        throw new IllegalArgumentException("tweak should be 56 bits");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static short[] q(xc0 xc0Var, int i, byte[] bArr, short[] sArr, int i2, int i3) {
        g(xc0Var, false, i, sArr, i2, i3);
        if (bArr.length == 7) {
            return A(xc0Var, i, c(bArr), sArr, i2, i3);
        }
        throw new IllegalArgumentException("tweak should be 56 bits");
    }

    private static short[] r(xc0 xc0Var, int i, byte[] bArr, int i2, int i3, int i4, short[] sArr, short[] sArr2) {
        int length = bArr.length;
        int ceil = (((int) Math.ceil((Math.log(i) * i4) / a)) + 7) / 8;
        int i5 = (((ceil + 3) / 4) * 4) + 4;
        byte[] b2 = b(i, (byte) i3, i2, length);
        BigInteger valueOf = BigInteger.valueOf(i);
        BigInteger[] a2 = a(valueOf, i3, i4);
        short[] sArr3 = sArr;
        short[] sArr4 = sArr2;
        int i6 = i4;
        int i7 = 0;
        while (i7 < 10) {
            int i8 = i7;
            short[] sArr5 = sArr3;
            sArr3 = sArr4;
            BigInteger d = d(xc0Var, valueOf, bArr, ceil, i5, i7, b2, sArr3);
            int i9 = i2 - i6;
            I(valueOf, D(valueOf, sArr5).add(d).mod(a2[i8 & 1]), i9, sArr5, 0);
            i7 = i8 + 1;
            i6 = i9;
            sArr4 = sArr5;
        }
        return tr.s(sArr3, sArr4);
    }

    private static short[] s(xc0 xc0Var, int i, byte[] bArr, int i2, int i3, int i4, short[] sArr, short[] sArr2) {
        BigInteger valueOf = BigInteger.valueOf(i);
        int i5 = i3;
        BigInteger[] a2 = a(valueOf, i5, i4);
        H(sArr);
        H(sArr2);
        short[] sArr3 = sArr;
        short[] sArr4 = sArr2;
        int i6 = 0;
        while (i6 < 8) {
            i5 = i2 - i5;
            int i7 = i6 & 1;
            I(valueOf, D(valueOf, sArr3).add(e(xc0Var, valueOf, bArr, 4 - (i7 * 4), i6, sArr4)).mod(a2[1 - i7]), i5, sArr3, 0);
            i6++;
            short[] sArr5 = sArr4;
            sArr4 = sArr3;
            sArr3 = sArr5;
        }
        H(sArr3);
        H(sArr4);
        return tr.s(sArr3, sArr4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] t(xc0 xc0Var, int i, byte[] bArr, byte[] bArr2, int i2, int i3) {
        f(xc0Var, true, i, bArr2, i2, i3);
        int i4 = i3 / 2;
        int i5 = i3 - i4;
        return J(r(xc0Var, i, bArr, i3, i4, i5, K(bArr2, i2, i4), K(bArr2, i2 + i4, i5)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static short[] u(xc0 xc0Var, int i, byte[] bArr, short[] sArr, int i2, int i3) {
        g(xc0Var, true, i, sArr, i2, i3);
        int i4 = i3 / 2;
        int i5 = i3 - i4;
        short[] sArr2 = new short[i4];
        short[] sArr3 = new short[i5];
        System.arraycopy(sArr, i2, sArr2, 0, i4);
        System.arraycopy(sArr, i2 + i4, sArr3, 0, i5);
        return r(xc0Var, i, bArr, i3, i4, i5, sArr2, sArr3);
    }

    static byte[] v(xc0 xc0Var, int i, byte[] bArr, byte[] bArr2, int i2, int i3) {
        f(xc0Var, false, i, bArr2, i2, i3);
        if (bArr.length == 8) {
            return B(xc0Var, i, bArr, bArr2, i2, i3);
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] w(xc0 xc0Var, int i, byte[] bArr, byte[] bArr2, int i2, int i3) {
        f(xc0Var, false, i, bArr2, i2, i3);
        if (bArr.length == 7) {
            return v(xc0Var, i, c(bArr), bArr2, i2, i3);
        }
        throw new IllegalArgumentException("tweak should be 56 bits");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static short[] x(xc0 xc0Var, int i, byte[] bArr, short[] sArr, int i2, int i3) {
        g(xc0Var, false, i, sArr, i2, i3);
        if (bArr.length == 7) {
            return y(xc0Var, i, c(bArr), sArr, i2, i3);
        }
        throw new IllegalArgumentException("tweak should be 56 bits");
    }

    static short[] y(xc0 xc0Var, int i, byte[] bArr, short[] sArr, int i2, int i3) {
        g(xc0Var, false, i, sArr, i2, i3);
        if (bArr.length == 8) {
            return C(xc0Var, i, bArr, sArr, i2, i3);
        }
        throw new IllegalArgumentException();
    }

    protected static byte[] z(xc0 xc0Var, int i, byte[] bArr, byte[] bArr2, int i2, int i3) {
        int i4 = i3 / 2;
        int i5 = i3 - i4;
        return J(m(xc0Var, i, bArr, i3, i4, i5, K(bArr2, i2, i5), K(bArr2, i2 + i5, i4)));
    }
}
