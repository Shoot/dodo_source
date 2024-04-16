package defpackage;

import java.math.BigInteger;
/* renamed from: us6  reason: default package */
/* loaded from: classes3.dex */
public abstract class us6 {
    public static int a(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = (iArr[0] & 4294967295L) + (iArr2[0] & 4294967295L);
        iArr3[0] = (int) j;
        long j2 = (j >>> 32) + (iArr[1] & 4294967295L) + (iArr2[1] & 4294967295L);
        iArr3[1] = (int) j2;
        long j3 = (j2 >>> 32) + (iArr[2] & 4294967295L) + (iArr2[2] & 4294967295L);
        iArr3[2] = (int) j3;
        long j4 = (j3 >>> 32) + (iArr[3] & 4294967295L) + (iArr2[3] & 4294967295L);
        iArr3[3] = (int) j4;
        return (int) (j4 >>> 32);
    }

    public static int b(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = (iArr[0] & 4294967295L) + (iArr2[0] & 4294967295L) + (iArr3[0] & 4294967295L);
        iArr3[0] = (int) j;
        long j2 = (j >>> 32) + (iArr[1] & 4294967295L) + (iArr2[1] & 4294967295L) + (iArr3[1] & 4294967295L);
        iArr3[1] = (int) j2;
        long j3 = (j2 >>> 32) + (iArr[2] & 4294967295L) + (iArr2[2] & 4294967295L) + (iArr3[2] & 4294967295L);
        iArr3[2] = (int) j3;
        long j4 = (j3 >>> 32) + (iArr[3] & 4294967295L) + (iArr2[3] & 4294967295L) + (iArr3[3] & 4294967295L);
        iArr3[3] = (int) j4;
        return (int) (j4 >>> 32);
    }

    public static void c(int[] iArr, int i, int[] iArr2, int i2) {
        iArr2[i2] = iArr[i];
        iArr2[i2 + 1] = iArr[i + 1];
        iArr2[i2 + 2] = iArr[i + 2];
        iArr2[i2 + 3] = iArr[i + 3];
    }

    public static void d(long[] jArr, int i, long[] jArr2, int i2) {
        jArr2[i2] = jArr[i];
        jArr2[i2 + 1] = jArr[i + 1];
    }

    public static void e(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0];
        jArr2[1] = jArr[1];
    }

    public static int[] f() {
        return new int[4];
    }

    public static long[] g() {
        return new long[2];
    }

    public static int[] h() {
        return new int[8];
    }

    public static long[] i() {
        return new long[4];
    }

    public static boolean j(int[] iArr, int[] iArr2) {
        for (int i = 3; i >= 0; i--) {
            if (iArr[i] != iArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean k(long[] jArr, long[] jArr2) {
        for (int i = 1; i >= 0; i--) {
            if (jArr[i] != jArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static int[] l(BigInteger bigInteger) {
        if (bigInteger.signum() >= 0 && bigInteger.bitLength() <= 128) {
            int[] f = f();
            for (int i = 0; i < 4; i++) {
                f[i] = bigInteger.intValue();
                bigInteger = bigInteger.shiftRight(32);
            }
            return f;
        }
        throw new IllegalArgumentException();
    }

    public static int m(int[] iArr, int i) {
        int i2;
        if (i == 0) {
            i2 = iArr[0];
        } else {
            int i3 = i >> 5;
            if (i3 < 0 || i3 >= 4) {
                return 0;
            }
            i2 = iArr[i3] >>> (i & 31);
        }
        return i2 & 1;
    }

    public static boolean n(int[] iArr, int[] iArr2) {
        for (int i = 3; i >= 0; i--) {
            int i2 = iArr[i] ^ Integer.MIN_VALUE;
            int i3 = Integer.MIN_VALUE ^ iArr2[i];
            if (i2 < i3) {
                return false;
            }
            if (i2 > i3) {
                return true;
            }
        }
        return true;
    }

    public static boolean o(int[] iArr) {
        if (iArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < 4; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean p(long[] jArr) {
        if (jArr[0] != 1 || jArr[1] != 0) {
            return false;
        }
        return true;
    }

    public static boolean q(int[] iArr) {
        for (int i = 0; i < 4; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean r(long[] jArr) {
        for (int i = 0; i < 2; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void s(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = iArr2[0] & 4294967295L;
        int i = 1;
        long j2 = iArr2[1] & 4294967295L;
        long j3 = iArr2[2] & 4294967295L;
        long j4 = iArr2[3] & 4294967295L;
        long j5 = iArr[0] & 4294967295L;
        long j6 = j5 * j;
        iArr3[0] = (int) j6;
        char c = ' ';
        long j7 = (j6 >>> 32) + (j5 * j2);
        iArr3[1] = (int) j7;
        long j8 = (j7 >>> 32) + (j5 * j3);
        iArr3[2] = (int) j8;
        long j9 = (j8 >>> 32) + (j5 * j4);
        iArr3[3] = (int) j9;
        int i2 = (int) (j9 >>> 32);
        iArr3[4] = i2;
        for (int i3 = 4; i < i3; i3 = 4) {
            long j10 = iArr[i] & 4294967295L;
            long j11 = (j10 * j) + (iArr3[i] & 4294967295L);
            iArr3[i] = (int) j11;
            int i4 = i + 1;
            long j12 = j;
            long j13 = (j11 >>> c) + (j10 * j2) + (iArr3[i4] & 4294967295L);
            iArr3[i4] = (int) j13;
            int i5 = i + 2;
            long j14 = (j13 >>> 32) + (j10 * j3) + (iArr3[i5] & 4294967295L);
            iArr3[i5] = (int) j14;
            c = ' ';
            int i6 = i + 3;
            long j15 = (j14 >>> 32) + (j10 * j4) + (iArr3[i6] & 4294967295L);
            iArr3[i6] = (int) j15;
            iArr3[i + 4] = (int) (j15 >>> 32);
            i = i4;
            j = j12;
            j2 = j2;
        }
    }

    public static int t(int[] iArr, int[] iArr2, int[] iArr3) {
        int i = 0;
        long j = iArr2[0] & 4294967295L;
        long j2 = iArr2[1] & 4294967295L;
        long j3 = iArr2[2] & 4294967295L;
        long j4 = iArr2[3] & 4294967295L;
        long j5 = 0;
        while (i < 4) {
            long j6 = iArr[i] & 4294967295L;
            long j7 = j;
            long j8 = (iArr3[i] & 4294967295L) + (j6 * j);
            iArr3[i] = (int) j8;
            int i2 = i + 1;
            long j9 = (j8 >>> 32) + (j6 * j2) + (iArr3[i2] & 4294967295L);
            iArr3[i2] = (int) j9;
            int i3 = i + 2;
            long j10 = (j9 >>> 32) + (j6 * j3) + (iArr3[i3] & 4294967295L);
            iArr3[i3] = (int) j10;
            int i4 = i + 3;
            long j11 = (j10 >>> 32) + (j6 * j4) + (iArr3[i4] & 4294967295L);
            iArr3[i4] = (int) j11;
            int i5 = i + 4;
            long j12 = j5 + (j11 >>> 32) + (iArr3[i5] & 4294967295L);
            iArr3[i5] = (int) j12;
            j5 = j12 >>> 32;
            i = i2;
            j = j7;
            j2 = j2;
        }
        return (int) j5;
    }

    public static void u(int[] iArr, int[] iArr2) {
        long j = iArr[0] & 4294967295L;
        int i = 8;
        int i2 = 3;
        int i3 = 0;
        while (true) {
            int i4 = i2 - 1;
            long j2 = iArr[i2] & 4294967295L;
            long j3 = j2 * j2;
            iArr2[i - 1] = (i3 << 31) | ((int) (j3 >>> 33));
            i -= 2;
            iArr2[i] = (int) (j3 >>> 1);
            i3 = (int) j3;
            if (i4 <= 0) {
                long j4 = j * j;
                long j5 = (j4 >>> 33) | ((i3 << 31) & 4294967295L);
                iArr2[0] = (int) j4;
                long j6 = iArr[1] & 4294967295L;
                long j7 = j5 + (j6 * j);
                int i5 = (int) j7;
                iArr2[1] = (i5 << 1) | (((int) (j4 >>> 32)) & 1);
                int i6 = i5 >>> 31;
                long j8 = (iArr2[2] & 4294967295L) + (j7 >>> 32);
                long j9 = iArr[2] & 4294967295L;
                long j10 = j8 + (j9 * j);
                int i7 = (int) j10;
                iArr2[2] = (i7 << 1) | i6;
                long j11 = (iArr2[3] & 4294967295L) + (j10 >>> 32) + (j9 * j6);
                long j12 = (iArr2[4] & 4294967295L) + (j11 >>> 32);
                long j13 = iArr[3] & 4294967295L;
                long j14 = (iArr2[5] & 4294967295L) + (j12 >>> 32);
                long j15 = (j11 & 4294967295L) + (j * j13);
                int i8 = (int) j15;
                iArr2[3] = (i8 << 1) | (i7 >>> 31);
                long j16 = (j12 & 4294967295L) + (j15 >>> 32) + (j6 * j13);
                long j17 = (j14 & 4294967295L) + (j16 >>> 32) + (j13 * j9);
                long j18 = (iArr2[6] & 4294967295L) + (j14 >>> 32) + (j17 >>> 32);
                int i9 = (int) j16;
                iArr2[4] = (i8 >>> 31) | (i9 << 1);
                int i10 = (int) (j17 & 4294967295L);
                iArr2[5] = (i9 >>> 31) | (i10 << 1);
                int i11 = (int) j18;
                iArr2[6] = (i10 >>> 31) | (i11 << 1);
                iArr2[7] = ((iArr2[7] + ((int) (j18 >>> 32))) << 1) | (i11 >>> 31);
                return;
            }
            i2 = i4;
        }
    }

    public static int v(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = (iArr[0] & 4294967295L) - (iArr2[0] & 4294967295L);
        iArr3[0] = (int) j;
        long j2 = (j >> 32) + ((iArr[1] & 4294967295L) - (iArr2[1] & 4294967295L));
        iArr3[1] = (int) j2;
        long j3 = (j2 >> 32) + ((iArr[2] & 4294967295L) - (iArr2[2] & 4294967295L));
        iArr3[2] = (int) j3;
        long j4 = (j3 >> 32) + ((iArr[3] & 4294967295L) - (iArr2[3] & 4294967295L));
        iArr3[3] = (int) j4;
        return (int) (j4 >> 32);
    }

    public static int w(int[] iArr, int[] iArr2) {
        long j = (iArr2[0] & 4294967295L) - (iArr[0] & 4294967295L);
        iArr2[0] = (int) j;
        long j2 = (j >> 32) + ((iArr2[1] & 4294967295L) - (iArr[1] & 4294967295L));
        iArr2[1] = (int) j2;
        long j3 = (j2 >> 32) + ((iArr2[2] & 4294967295L) - (iArr[2] & 4294967295L));
        iArr2[2] = (int) j3;
        long j4 = (j3 >> 32) + ((iArr2[3] & 4294967295L) - (4294967295L & iArr[3]));
        iArr2[3] = (int) j4;
        return (int) (j4 >> 32);
    }

    public static BigInteger x(int[] iArr) {
        byte[] bArr = new byte[16];
        for (int i = 0; i < 4; i++) {
            int i2 = iArr[i];
            if (i2 != 0) {
                mo7.f(i2, bArr, (3 - i) << 2);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static BigInteger y(long[] jArr) {
        byte[] bArr = new byte[16];
        for (int i = 0; i < 2; i++) {
            long j = jArr[i];
            if (j != 0) {
                mo7.s(j, bArr, (1 - i) << 3);
            }
        }
        return new BigInteger(1, bArr);
    }
}
