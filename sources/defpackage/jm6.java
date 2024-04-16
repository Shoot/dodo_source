package defpackage;

import java.util.Random;
/* renamed from: jm6  reason: default package */
/* loaded from: classes3.dex */
public abstract class jm6 {
    private static int a(int i, int[] iArr, int[] iArr2) {
        int i2 = i - 1;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            int i5 = i3 + iArr[i4] + iArr2[i4];
            iArr[i4] = 1073741823 & i5;
            i3 = i5 >> 30;
        }
        int i6 = i3 + iArr[i2] + iArr2[i2];
        iArr[i2] = i6;
        return i6 >> 30;
    }

    public static void b(int[] iArr, int[] iArr2, int[] iArr3) {
        if (k(iArr, iArr2, iArr3) != 0) {
            return;
        }
        throw new ArithmeticException("Inverse does not exist.");
    }

    private static void c(int i, int i2, int[] iArr) {
        int i3 = i - 1;
        int i4 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            int i6 = i4 + ((iArr[i5] ^ i2) - i2);
            iArr[i5] = 1073741823 & i6;
            i4 = i6 >> 30;
        }
        iArr[i3] = i4 + ((iArr[i3] ^ i2) - i2);
    }

    private static void d(int i, int i2, int[] iArr, int[] iArr2) {
        int i3 = i - 1;
        int i4 = iArr[i3] >> 31;
        int i5 = 0;
        for (int i6 = 0; i6 < i3; i6++) {
            int i7 = i5 + (((iArr[i6] + (iArr2[i6] & i4)) ^ i2) - i2);
            iArr[i6] = 1073741823 & i7;
            i5 = i7 >> 30;
        }
        int i8 = i5 + (((iArr[i3] + (i4 & iArr2[i3])) ^ i2) - i2);
        iArr[i3] = i8;
        int i9 = i8 >> 31;
        int i10 = 0;
        for (int i11 = 0; i11 < i3; i11++) {
            int i12 = i10 + iArr[i11] + (iArr2[i11] & i9);
            iArr[i11] = i12 & 1073741823;
            i10 = i12 >> 30;
        }
        iArr[i3] = i10 + iArr[i3] + (i9 & iArr2[i3]);
    }

    private static void e(int i, int[] iArr, int i2, int[] iArr2, int i3) {
        int i4 = 0;
        long j = 0;
        while (i > 0) {
            while (i4 < Math.min(32, i)) {
                j |= iArr[i2] << i4;
                i4 += 30;
                i2++;
            }
            iArr2[i3] = (int) j;
            j >>>= 32;
            i4 -= 32;
            i -= 32;
            i3++;
        }
    }

    private static int f(int i, int i2, int i3, int[] iArr) {
        int i4 = 1;
        int i5 = 0;
        int i6 = 0;
        int i7 = 1;
        for (int i8 = 0; i8 < 30; i8++) {
            int i9 = i >> 31;
            int i10 = -(i3 & 1);
            int i11 = i3 + (((i2 ^ i9) - i9) & i10);
            i6 += ((i4 ^ i9) - i9) & i10;
            i7 += ((i5 ^ i9) - i9) & i10;
            int i12 = i9 & i10;
            i = (i ^ i12) - (i12 + 1);
            i2 += i11 & i12;
            i3 = i11 >> 1;
            i4 = (i4 + (i6 & i12)) << 1;
            i5 = (i5 + (i12 & i7)) << 1;
        }
        iArr[0] = i4;
        iArr[1] = i5;
        iArr[2] = i6;
        iArr[3] = i7;
        return i;
    }

    private static int g(int i, int i2, int i3, int[] iArr) {
        int i4;
        int i5 = i;
        int i6 = i2;
        int i7 = i3;
        int i8 = 30;
        int i9 = 1;
        int i10 = 0;
        int i11 = 0;
        int i12 = 1;
        while (true) {
            int b = g65.b(((-1) << i8) | i7);
            int i13 = i7 >> b;
            i9 <<= b;
            i10 <<= b;
            i5 -= b;
            i8 -= b;
            if (i8 <= 0) {
                iArr[0] = i9;
                iArr[1] = i10;
                iArr[2] = i11;
                iArr[3] = i12;
                return i5;
            }
            if (i5 < 0) {
                i5 = -i5;
                int i14 = -i6;
                int i15 = -i9;
                int i16 = -i10;
                int i17 = i5 + 1;
                if (i17 > i8) {
                    i17 = i8;
                }
                i4 = ((-1) >>> (32 - i17)) & 63 & (i13 * i14 * ((i13 * i13) - 2));
                i13 = i14;
                i6 = i13;
                int i18 = i11;
                i11 = i15;
                i9 = i18;
                int i19 = i12;
                i12 = i16;
                i10 = i19;
            } else {
                int i20 = i5 + 1;
                if (i20 > i8) {
                    i20 = i8;
                }
                i4 = ((-1) >>> (32 - i20)) & 15 & ((-((((i6 + 1) & 4) << 1) + i6)) * i13);
            }
            i7 = i13 + (i6 * i4);
            i11 += i9 * i4;
            i12 += i4 * i10;
        }
    }

    private static void h(int i, int[] iArr, int i2, int[] iArr2, int i3) {
        int i4 = 0;
        long j = 0;
        while (i > 0) {
            if (i4 < Math.min(30, i)) {
                j |= (iArr[i2] & 4294967295L) << i4;
                i4 += 32;
                i2++;
            }
            iArr2[i3] = ((int) j) & 1073741823;
            j >>>= 30;
            i4 -= 30;
            i -= 30;
            i3++;
        }
    }

    private static int i(int i) {
        int i2;
        int i3 = i * 49;
        if (i < 46) {
            i2 = 80;
        } else {
            i2 = 47;
        }
        return (i3 + i2) / 17;
    }

    public static int j(int i) {
        int i2 = (2 - (i * i)) * i;
        int i3 = i2 * (2 - (i * i2));
        int i4 = i3 * (2 - (i * i3));
        return i4 * (2 - (i * i4));
    }

    public static int k(int[] iArr, int[] iArr2, int[] iArr3) {
        int length = iArr.length;
        int a = (length << 5) - g65.a(iArr[length - 1]);
        int i = (a + 29) / 30;
        int[] iArr4 = new int[4];
        int[] iArr5 = new int[i];
        int[] iArr6 = new int[i];
        int[] iArr7 = new int[i];
        int[] iArr8 = new int[i];
        int[] iArr9 = new int[i];
        char c = 0;
        iArr6[0] = 1;
        h(a, iArr2, 0, iArr8, 0);
        h(a, iArr, 0, iArr9, 0);
        System.arraycopy(iArr9, 0, iArr7, 0, i);
        int j = j(iArr9[0]);
        int i2 = i(a);
        int i3 = -1;
        int i4 = 0;
        while (i4 < i2) {
            int f = f(i3, iArr7[c], iArr8[c], iArr4);
            o(i, iArr5, iArr6, iArr4, j, iArr9);
            p(i, iArr7, iArr8, iArr4);
            i4 += 30;
            i3 = f;
            i2 = i2;
            c = 0;
        }
        int i5 = iArr7[i - 1] >> 31;
        c(i, i5, iArr7);
        d(i, i5, iArr5, iArr9);
        e(a, iArr5, 0, iArr3, 0);
        return et6.p(i, iArr7, 1) & et6.q(i, iArr8);
    }

    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v3 */
    public static boolean l(int[] iArr, int[] iArr2, int[] iArr3) {
        int length = iArr.length;
        int a = (length << 5) - g65.a(iArr[length - 1]);
        int i = (a + 29) / 30;
        int[] iArr4 = new int[4];
        int[] iArr5 = new int[i];
        int[] iArr6 = new int[i];
        int[] iArr7 = new int[i];
        int[] iArr8 = new int[i];
        int[] iArr9 = new int[i];
        ?? r9 = 0;
        iArr6[0] = 1;
        h(a, iArr2, 0, iArr8, 0);
        h(a, iArr, 0, iArr9, 0);
        System.arraycopy(iArr9, 0, iArr7, 0, i);
        int i2 = i - 1;
        int a2 = (-1) - (g65.a(iArr8[i2] | 1) - (((i * 30) + 2) - a));
        int j = j(iArr9[0]);
        int i3 = i(a);
        int i4 = i;
        int i5 = 0;
        while (!et6.A(i4, iArr8)) {
            if (i5 >= i3) {
                return r9;
            }
            int i6 = i5 + 30;
            int g = g(a2, iArr7[r9], iArr8[r9], iArr4);
            int i7 = i4;
            int i8 = i3;
            int[] iArr10 = iArr6;
            o(i, iArr5, iArr6, iArr4, j, iArr9);
            p(i7, iArr7, iArr8, iArr4);
            int i9 = i7 - 1;
            int i10 = iArr7[i9];
            int i11 = iArr8[i9];
            int i12 = i7 - 2;
            if (((i12 >> 31) | ((i10 >> 31) ^ i10) | ((i11 >> 31) ^ i11)) == 0) {
                iArr7[i12] = (i10 << 30) | iArr7[i12];
                iArr8[i12] = iArr8[i12] | (i11 << 30);
                i4 = i7 - 1;
            } else {
                i4 = i7;
            }
            i5 = i6;
            a2 = g;
            i3 = i8;
            iArr6 = iArr10;
            r9 = 0;
        }
        int i13 = i4;
        int i14 = iArr7[i13 - 1] >> 31;
        int i15 = iArr5[i2] >> 31;
        if (i15 < 0) {
            i15 = a(i, iArr5, iArr9);
        }
        if (i14 < 0) {
            i15 = m(i, iArr5);
            m(i13, iArr7);
        }
        if (!et6.z(i13, iArr7)) {
            return false;
        }
        if (i15 < 0) {
            a(i, iArr5, iArr9);
        }
        e(a, iArr5, 0, iArr3, 0);
        return true;
    }

    private static int m(int i, int[] iArr) {
        int i2 = i - 1;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            int i5 = i3 - iArr[i4];
            iArr[i4] = 1073741823 & i5;
            i3 = i5 >> 30;
        }
        int i6 = i3 - iArr[i2];
        iArr[i2] = i6;
        return i6 >> 30;
    }

    public static int[] n(int[] iArr) {
        int length = iArr.length;
        Random random = new Random();
        int[] k = et6.k(length);
        int i = length - 1;
        int i2 = iArr[i];
        int i3 = i2 | (i2 >>> 1);
        int i4 = i3 | (i3 >>> 2);
        int i5 = i4 | (i4 >>> 4);
        int i6 = i5 | (i5 >>> 8);
        int i7 = i6 | (i6 >>> 16);
        do {
            for (int i8 = 0; i8 != length; i8++) {
                k[i8] = random.nextInt();
            }
            k[i] = k[i] & i7;
        } while (et6.u(length, k, iArr));
        return k;
    }

    private static void o(int i, int[] iArr, int[] iArr2, int[] iArr3, int i2, int[] iArr4) {
        int i3 = i;
        int i4 = iArr3[0];
        int i5 = iArr3[1];
        int i6 = iArr3[2];
        int i7 = iArr3[3];
        int i8 = i3 - 1;
        int i9 = iArr[i8] >> 31;
        int i10 = iArr2[i8] >> 31;
        int i11 = (i4 & i9) + (i5 & i10);
        int i12 = (i9 & i6) + (i10 & i7);
        int i13 = iArr4[0];
        long j = i4;
        long j2 = iArr[0];
        long j3 = i5;
        long j4 = iArr2[0];
        long j5 = (j * j2) + (j3 * j4);
        long j6 = i6;
        long j7 = i7;
        long j8 = (j2 * j6) + (j4 * j7);
        long j9 = i13;
        long j10 = i11 - (((((int) j5) * i2) + i11) & 1073741823);
        int i14 = i8;
        long j11 = i12 - (((((int) j8) * i2) + i12) & 1073741823);
        long j12 = (j8 + (j9 * j11)) >> 30;
        long j13 = (j5 + (j9 * j10)) >> 30;
        int i15 = 1;
        while (i15 < i3) {
            int i16 = iArr4[i15];
            long j14 = j12;
            long j15 = iArr[i15];
            int i17 = i15;
            long j16 = iArr2[i15];
            long j17 = j11;
            long j18 = i16;
            long j19 = j13 + (j * j15) + (j3 * j16) + (j18 * j10);
            long j20 = j14 + (j15 * j6) + (j16 * j7) + (j18 * j17);
            int i18 = i17 - 1;
            iArr[i18] = ((int) j19) & 1073741823;
            j13 = j19 >> 30;
            iArr2[i18] = ((int) j20) & 1073741823;
            j12 = j20 >> 30;
            i15 = i17 + 1;
            i3 = i;
            i14 = i14;
            j11 = j17;
        }
        int i19 = i14;
        iArr[i19] = (int) j13;
        iArr2[i19] = (int) j12;
    }

    private static void p(int i, int[] iArr, int[] iArr2, int[] iArr3) {
        int i2 = iArr3[0];
        int i3 = iArr3[1];
        int i4 = iArr3[2];
        int i5 = iArr3[3];
        long j = i2;
        long j2 = iArr[0];
        long j3 = i3;
        long j4 = iArr2[0];
        long j5 = i4;
        long j6 = i5;
        long j7 = ((j * j2) + (j3 * j4)) >> 30;
        long j8 = ((j2 * j5) + (j4 * j6)) >> 30;
        int i6 = 1;
        while (i6 < i) {
            int i7 = iArr[i6];
            int i8 = iArr2[i6];
            int i9 = i6;
            long j9 = i7;
            long j10 = j * j9;
            long j11 = j;
            long j12 = i8;
            long j13 = j7 + j10 + (j3 * j12);
            long j14 = j8 + (j9 * j5) + (j12 * j6);
            int i10 = i9 - 1;
            iArr[i10] = ((int) j13) & 1073741823;
            j7 = j13 >> 30;
            iArr2[i10] = 1073741823 & ((int) j14);
            j8 = j14 >> 30;
            i6 = i9 + 1;
            j = j11;
        }
        int i11 = i - 1;
        iArr[i11] = (int) j7;
        iArr2[i11] = (int) j8;
    }
}
