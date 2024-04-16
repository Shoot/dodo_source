package defpackage;

import java.math.BigInteger;
/* renamed from: xs6  reason: default package */
/* loaded from: classes3.dex */
public abstract class xs6 {
    public static int a(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = (iArr[0] & 4294967295L) + (iArr2[0] & 4294967295L);
        iArr3[0] = (int) j;
        long j2 = (j >>> 32) + (iArr[1] & 4294967295L) + (iArr2[1] & 4294967295L);
        iArr3[1] = (int) j2;
        long j3 = (j2 >>> 32) + (iArr[2] & 4294967295L) + (iArr2[2] & 4294967295L);
        iArr3[2] = (int) j3;
        long j4 = (j3 >>> 32) + (iArr[3] & 4294967295L) + (iArr2[3] & 4294967295L);
        iArr3[3] = (int) j4;
        long j5 = (j4 >>> 32) + (iArr[4] & 4294967295L) + (iArr2[4] & 4294967295L);
        iArr3[4] = (int) j5;
        long j6 = (j5 >>> 32) + (iArr[5] & 4294967295L) + (iArr2[5] & 4294967295L);
        iArr3[5] = (int) j6;
        long j7 = (j6 >>> 32) + (iArr[6] & 4294967295L) + (iArr2[6] & 4294967295L);
        iArr3[6] = (int) j7;
        return (int) (j7 >>> 32);
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
        long j5 = (j4 >>> 32) + (iArr[4] & 4294967295L) + (iArr2[4] & 4294967295L) + (iArr3[4] & 4294967295L);
        iArr3[4] = (int) j5;
        long j6 = (j5 >>> 32) + (iArr[5] & 4294967295L) + (iArr2[5] & 4294967295L) + (iArr3[5] & 4294967295L);
        iArr3[5] = (int) j6;
        long j7 = (j6 >>> 32) + (iArr[6] & 4294967295L) + (iArr2[6] & 4294967295L) + (iArr3[6] & 4294967295L);
        iArr3[6] = (int) j7;
        return (int) (j7 >>> 32);
    }

    public static void c(int[] iArr, int i, int[] iArr2, int i2) {
        iArr2[i2] = iArr[i];
        iArr2[i2 + 1] = iArr[i + 1];
        iArr2[i2 + 2] = iArr[i + 2];
        iArr2[i2 + 3] = iArr[i + 3];
        iArr2[i2 + 4] = iArr[i + 4];
        iArr2[i2 + 5] = iArr[i + 5];
        iArr2[i2 + 6] = iArr[i + 6];
    }

    public static void d(int[] iArr, int[] iArr2) {
        iArr2[0] = iArr[0];
        iArr2[1] = iArr[1];
        iArr2[2] = iArr[2];
        iArr2[3] = iArr[3];
        iArr2[4] = iArr[4];
        iArr2[5] = iArr[5];
        iArr2[6] = iArr[6];
    }

    public static int[] e() {
        return new int[7];
    }

    public static int[] f() {
        return new int[14];
    }

    public static boolean g(int[] iArr, int[] iArr2) {
        for (int i = 6; i >= 0; i--) {
            if (iArr[i] != iArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static int[] h(BigInteger bigInteger) {
        if (bigInteger.signum() >= 0 && bigInteger.bitLength() <= 224) {
            int[] e = e();
            for (int i = 0; i < 7; i++) {
                e[i] = bigInteger.intValue();
                bigInteger = bigInteger.shiftRight(32);
            }
            return e;
        }
        throw new IllegalArgumentException();
    }

    public static int i(int[] iArr, int i) {
        int i2;
        if (i == 0) {
            i2 = iArr[0];
        } else {
            int i3 = i >> 5;
            if (i3 < 0 || i3 >= 7) {
                return 0;
            }
            i2 = iArr[i3] >>> (i & 31);
        }
        return i2 & 1;
    }

    public static boolean j(int[] iArr, int[] iArr2) {
        for (int i = 6; i >= 0; i--) {
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

    public static boolean k(int[] iArr) {
        if (iArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < 7; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean l(int[] iArr) {
        for (int i = 0; i < 7; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void m(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = iArr2[0] & 4294967295L;
        long j2 = iArr2[1] & 4294967295L;
        long j3 = iArr2[2] & 4294967295L;
        long j4 = iArr2[3] & 4294967295L;
        long j5 = iArr2[4] & 4294967295L;
        long j6 = iArr2[5] & 4294967295L;
        long j7 = iArr2[6] & 4294967295L;
        long j8 = iArr[0] & 4294967295L;
        long j9 = j8 * j;
        iArr3[0] = (int) j9;
        char c = ' ';
        long j10 = (j9 >>> 32) + (j8 * j2);
        iArr3[1] = (int) j10;
        long j11 = (j10 >>> 32) + (j8 * j3);
        iArr3[2] = (int) j11;
        long j12 = (j11 >>> 32) + (j8 * j4);
        iArr3[3] = (int) j12;
        long j13 = (j12 >>> 32) + (j8 * j5);
        iArr3[4] = (int) j13;
        long j14 = (j13 >>> 32) + (j8 * j6);
        iArr3[5] = (int) j14;
        long j15 = (j14 >>> 32) + (j8 * j7);
        iArr3[6] = (int) j15;
        int i = (int) (j15 >>> 32);
        iArr3[7] = i;
        int i2 = 1;
        for (int i3 = 7; i2 < i3; i3 = 7) {
            long j16 = iArr[i2] & 4294967295L;
            long j17 = (j16 * j) + (iArr3[i2] & 4294967295L);
            long j18 = j;
            iArr3[i2] = (int) j17;
            int i4 = i2 + 1;
            long j19 = j2;
            long j20 = (j17 >>> c) + (j16 * j2) + (iArr3[i4] & 4294967295L);
            iArr3[i4] = (int) j20;
            int i5 = i2 + 2;
            long j21 = (j20 >>> 32) + (j16 * j3) + (iArr3[i5] & 4294967295L);
            iArr3[i5] = (int) j21;
            int i6 = i2 + 3;
            long j22 = (j21 >>> 32) + (j16 * j4) + (iArr3[i6] & 4294967295L);
            iArr3[i6] = (int) j22;
            int i7 = i2 + 4;
            long j23 = (j22 >>> 32) + (j16 * j5) + (iArr3[i7] & 4294967295L);
            iArr3[i7] = (int) j23;
            int i8 = i2 + 5;
            long j24 = (j23 >>> 32) + (j16 * j6) + (iArr3[i8] & 4294967295L);
            iArr3[i8] = (int) j24;
            c = ' ';
            int i9 = i2 + 6;
            long j25 = (j24 >>> 32) + (j16 * j7) + (iArr3[i9] & 4294967295L);
            iArr3[i9] = (int) j25;
            iArr3[i2 + 7] = (int) (j25 >>> 32);
            j = j18;
            i2 = i4;
            j2 = j19;
        }
    }

    public static long n(int i, int[] iArr, int i2, int[] iArr2, int i3, int[] iArr3, int i4) {
        long j = i & 4294967295L;
        long j2 = iArr[i2] & 4294967295L;
        long j3 = (j * j2) + (iArr2[i3] & 4294967295L);
        iArr3[i4] = (int) j3;
        long j4 = iArr[i2 + 1] & 4294967295L;
        long j5 = (j3 >>> 32) + (j * j4) + j2 + (iArr2[i3 + 1] & 4294967295L);
        iArr3[i4 + 1] = (int) j5;
        long j6 = j5 >>> 32;
        long j7 = iArr[i2 + 2] & 4294967295L;
        long j8 = j6 + (j * j7) + j4 + (iArr2[i3 + 2] & 4294967295L);
        iArr3[i4 + 2] = (int) j8;
        long j9 = iArr[i2 + 3] & 4294967295L;
        long j10 = (j8 >>> 32) + (j * j9) + j7 + (iArr2[i3 + 3] & 4294967295L);
        iArr3[i4 + 3] = (int) j10;
        long j11 = iArr[i2 + 4] & 4294967295L;
        long j12 = (j10 >>> 32) + (j * j11) + j9 + (iArr2[i3 + 4] & 4294967295L);
        iArr3[i4 + 4] = (int) j12;
        long j13 = iArr[i2 + 5] & 4294967295L;
        long j14 = (j12 >>> 32) + (j * j13) + j11 + (iArr2[i3 + 5] & 4294967295L);
        iArr3[i4 + 5] = (int) j14;
        long j15 = iArr[i2 + 6] & 4294967295L;
        long j16 = (j14 >>> 32) + (j * j15) + j13 + (4294967295L & iArr2[i3 + 6]);
        iArr3[i4 + 6] = (int) j16;
        return (j16 >>> 32) + j15;
    }

    public static int o(int i, long j, int[] iArr, int i2) {
        long j2 = i & 4294967295L;
        long j3 = j & 4294967295L;
        long j4 = (j2 * j3) + (iArr[i2] & 4294967295L);
        iArr[i2] = (int) j4;
        long j5 = j >>> 32;
        long j6 = (j2 * j5) + j3;
        int i3 = i2 + 1;
        long j7 = (j4 >>> 32) + j6 + (iArr[i3] & 4294967295L);
        iArr[i3] = (int) j7;
        int i4 = i2 + 2;
        long j8 = (j7 >>> 32) + j5 + (iArr[i4] & 4294967295L);
        iArr[i4] = (int) j8;
        long j9 = j8 >>> 32;
        int i5 = i2 + 3;
        long j10 = j9 + (iArr[i5] & 4294967295L);
        iArr[i5] = (int) j10;
        if ((j10 >>> 32) == 0) {
            return 0;
        }
        return et6.y(7, iArr, i2, 4);
    }

    public static int p(int i, int i2, int[] iArr, int i3) {
        long j = i2 & 4294967295L;
        long j2 = ((i & 4294967295L) * j) + (iArr[i3] & 4294967295L);
        iArr[i3] = (int) j2;
        int i4 = i3 + 1;
        long j3 = (j2 >>> 32) + j + (iArr[i4] & 4294967295L);
        iArr[i4] = (int) j3;
        long j4 = j3 >>> 32;
        int i5 = i3 + 2;
        long j5 = j4 + (iArr[i5] & 4294967295L);
        iArr[i5] = (int) j5;
        if ((j5 >>> 32) == 0) {
            return 0;
        }
        return et6.y(7, iArr, i3, 3);
    }

    public static int q(int[] iArr, int[] iArr2, int[] iArr3) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        long j = iArr2[0] & 4294967295L;
        long j2 = iArr2[1] & 4294967295L;
        long j3 = iArr2[2] & 4294967295L;
        long j4 = iArr2[3] & 4294967295L;
        long j5 = iArr2[4] & 4294967295L;
        long j6 = iArr2[5] & 4294967295L;
        long j7 = iArr2[6] & 4294967295L;
        long j8 = 0;
        int i7 = 0;
        while (i7 < 7) {
            long j9 = j7;
            long j10 = iArr[i7] & 4294967295L;
            long j11 = j6;
            long j12 = (iArr3[i7] & 4294967295L) + (j10 * j);
            iArr3[i7] = (int) j12;
            int i8 = i7 + 1;
            long j13 = j2;
            long j14 = (j12 >>> 32) + (j10 * j2) + (iArr3[i8] & 4294967295L);
            iArr3[i8] = (int) j14;
            long j15 = (j14 >>> 32) + (j10 * j3) + (iArr3[i] & 4294967295L);
            iArr3[i7 + 2] = (int) j15;
            long j16 = (j15 >>> 32) + (j10 * j4) + (iArr3[i2] & 4294967295L);
            iArr3[i7 + 3] = (int) j16;
            long j17 = (j16 >>> 32) + (j10 * j5) + (iArr3[i3] & 4294967295L);
            iArr3[i7 + 4] = (int) j17;
            long j18 = (j17 >>> 32) + (j10 * j11) + (iArr3[i4] & 4294967295L);
            iArr3[i7 + 5] = (int) j18;
            long j19 = (j18 >>> 32) + (j10 * j9) + (iArr3[i5] & 4294967295L);
            iArr3[i7 + 6] = (int) j19;
            long j20 = (j19 >>> 32) + (iArr3[i6] & 4294967295L) + j8;
            iArr3[i7 + 7] = (int) j20;
            j8 = j20 >>> 32;
            i7 = i8;
            j7 = j9;
            j6 = j11;
            j2 = j13;
        }
        return (int) j8;
    }

    public static void r(int[] iArr, int[] iArr2) {
        long j = iArr[0] & 4294967295L;
        int i = 14;
        int i2 = 6;
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
                long j15 = j12 & 4294967295L;
                long j16 = (iArr2[6] & 4294967295L) + (j14 >>> 32);
                long j17 = (j11 & 4294967295L) + (j13 * j);
                int i8 = (int) j17;
                iArr2[3] = (i7 >>> 31) | (i8 << 1);
                int i9 = i8 >>> 31;
                long j18 = j15 + (j17 >>> 32) + (j13 * j6);
                long j19 = (j14 & 4294967295L) + (j18 >>> 32) + (j13 * j9);
                long j20 = j16 + (j19 >>> 32);
                long j21 = iArr[4] & 4294967295L;
                long j22 = (iArr2[7] & 4294967295L) + (j20 >>> 32);
                long j23 = j20 & 4294967295L;
                long j24 = (iArr2[8] & 4294967295L) + (j22 >>> 32);
                long j25 = (j18 & 4294967295L) + (j21 * j);
                int i10 = (int) j25;
                iArr2[4] = (i10 << 1) | i9;
                long j26 = (j19 & 4294967295L) + (j25 >>> 32) + (j21 * j6);
                long j27 = j23 + (j26 >>> 32) + (j21 * j9);
                long j28 = (j22 & 4294967295L) + (j27 >>> 32) + (j21 * j13);
                long j29 = j24 + (j28 >>> 32);
                long j30 = j28 & 4294967295L;
                long j31 = iArr[5] & 4294967295L;
                long j32 = (iArr2[9] & 4294967295L) + (j29 >>> 32);
                long j33 = j29 & 4294967295L;
                long j34 = (iArr2[10] & 4294967295L) + (j32 >>> 32);
                long j35 = (j26 & 4294967295L) + (j31 * j);
                int i11 = (int) j35;
                iArr2[5] = (i11 << 1) | (i10 >>> 31);
                long j36 = (j27 & 4294967295L) + (j35 >>> 32) + (j31 * j6);
                long j37 = j30 + (j36 >>> 32) + (j31 * j9);
                long j38 = j33 + (j37 >>> 32) + (j31 * j13);
                long j39 = (j32 & 4294967295L) + (j38 >>> 32) + (j31 * j21);
                long j40 = j34 + (j39 >>> 32);
                long j41 = j39 & 4294967295L;
                long j42 = iArr[6] & 4294967295L;
                long j43 = (iArr2[11] & 4294967295L) + (j40 >>> 32);
                long j44 = 4294967295L & j43;
                long j45 = (j36 & 4294967295L) + (j * j42);
                int i12 = (int) j45;
                iArr2[6] = (i11 >>> 31) | (i12 << 1);
                int i13 = i12 >>> 31;
                long j46 = (j37 & 4294967295L) + (j45 >>> 32) + (j42 * j6);
                long j47 = (j38 & 4294967295L) + (j46 >>> 32) + (j42 * j9);
                long j48 = j41 + (j47 >>> 32) + (j42 * j13);
                long j49 = (j40 & 4294967295L) + (j48 >>> 32) + (j42 * j21);
                long j50 = j44 + (j49 >>> 32) + (j42 * j31);
                long j51 = (iArr2[12] & 4294967295L) + (j43 >>> 32) + (j50 >>> 32);
                int i14 = (int) j46;
                iArr2[7] = i13 | (i14 << 1);
                int i15 = (int) j47;
                iArr2[8] = (i14 >>> 31) | (i15 << 1);
                int i16 = (int) j48;
                iArr2[9] = (i15 >>> 31) | (i16 << 1);
                int i17 = i16 >>> 31;
                int i18 = (int) j49;
                iArr2[10] = i17 | (i18 << 1);
                int i19 = i18 >>> 31;
                int i20 = (int) j50;
                iArr2[11] = i19 | (i20 << 1);
                int i21 = i20 >>> 31;
                int i22 = (int) j51;
                iArr2[12] = i21 | (i22 << 1);
                iArr2[13] = (i22 >>> 31) | ((iArr2[13] + ((int) (j51 >>> 32))) << 1);
                return;
            }
            i2 = i4;
        }
    }

    public static int s(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = (iArr[0] & 4294967295L) - (iArr2[0] & 4294967295L);
        iArr3[0] = (int) j;
        long j2 = (j >> 32) + ((iArr[1] & 4294967295L) - (iArr2[1] & 4294967295L));
        iArr3[1] = (int) j2;
        long j3 = (j2 >> 32) + ((iArr[2] & 4294967295L) - (iArr2[2] & 4294967295L));
        iArr3[2] = (int) j3;
        long j4 = (j3 >> 32) + ((iArr[3] & 4294967295L) - (iArr2[3] & 4294967295L));
        iArr3[3] = (int) j4;
        long j5 = (j4 >> 32) + ((iArr[4] & 4294967295L) - (iArr2[4] & 4294967295L));
        iArr3[4] = (int) j5;
        long j6 = (j5 >> 32) + ((iArr[5] & 4294967295L) - (iArr2[5] & 4294967295L));
        iArr3[5] = (int) j6;
        long j7 = (j6 >> 32) + ((iArr[6] & 4294967295L) - (iArr2[6] & 4294967295L));
        iArr3[6] = (int) j7;
        return (int) (j7 >> 32);
    }

    public static int t(int[] iArr, int[] iArr2) {
        long j = (iArr2[0] & 4294967295L) - (iArr[0] & 4294967295L);
        iArr2[0] = (int) j;
        long j2 = (j >> 32) + ((iArr2[1] & 4294967295L) - (iArr[1] & 4294967295L));
        iArr2[1] = (int) j2;
        long j3 = (j2 >> 32) + ((iArr2[2] & 4294967295L) - (iArr[2] & 4294967295L));
        iArr2[2] = (int) j3;
        long j4 = (j3 >> 32) + ((iArr2[3] & 4294967295L) - (iArr[3] & 4294967295L));
        iArr2[3] = (int) j4;
        long j5 = (j4 >> 32) + ((iArr2[4] & 4294967295L) - (iArr[4] & 4294967295L));
        iArr2[4] = (int) j5;
        long j6 = (j5 >> 32) + ((iArr2[5] & 4294967295L) - (iArr[5] & 4294967295L));
        iArr2[5] = (int) j6;
        long j7 = (j6 >> 32) + ((iArr2[6] & 4294967295L) - (4294967295L & iArr[6]));
        iArr2[6] = (int) j7;
        return (int) (j7 >> 32);
    }

    public static BigInteger u(int[] iArr) {
        byte[] bArr = new byte[28];
        for (int i = 0; i < 7; i++) {
            int i2 = iArr[i];
            if (i2 != 0) {
                mo7.f(i2, bArr, (6 - i) << 2);
            }
        }
        return new BigInteger(1, bArr);
    }
}
