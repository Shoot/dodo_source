package defpackage;

import java.math.BigInteger;
import java.security.SecureRandom;
/* renamed from: sz9  reason: default package */
/* loaded from: classes3.dex */
public class sz9 {
    static final int[] a = {1, 0, 0, -1, -1, -1, -1};
    private static final int[] b = {1, 0, 0, -2, -1, -1, 0, 2, 0, 0, -2, -1, -1, -1};
    private static final int[] c = {-1, -1, -1, 1, 0, 0, -1, -3, -1, -1, 1};

    public static void a(int[] iArr, int[] iArr2, int[] iArr3) {
        if (xs6.a(iArr, iArr2, iArr3) != 0 || (iArr3[6] == -1 && xs6.j(iArr3, a))) {
            c(iArr3);
        }
    }

    public static void b(int[] iArr, int[] iArr2) {
        if (et6.w(7, iArr, iArr2) != 0 || (iArr2[6] == -1 && xs6.j(iArr2, a))) {
            c(iArr2);
        }
    }

    private static void c(int[] iArr) {
        long j = (iArr[0] & 4294967295L) - 1;
        iArr[0] = (int) j;
        long j2 = j >> 32;
        if (j2 != 0) {
            long j3 = j2 + (iArr[1] & 4294967295L);
            iArr[1] = (int) j3;
            long j4 = (j3 >> 32) + (iArr[2] & 4294967295L);
            iArr[2] = (int) j4;
            j2 = j4 >> 32;
        }
        long j5 = j2 + (4294967295L & iArr[3]) + 1;
        iArr[3] = (int) j5;
        if ((j5 >> 32) != 0) {
            et6.x(7, iArr, 4);
        }
    }

    public static int[] d(BigInteger bigInteger) {
        int[] h = xs6.h(bigInteger);
        if (h[6] == -1) {
            int[] iArr = a;
            if (xs6.j(h, iArr)) {
                xs6.t(iArr, h);
            }
        }
        return h;
    }

    public static void e(int[] iArr, int[] iArr2) {
        jm6.b(a, iArr, iArr2);
    }

    public static int f(int[] iArr) {
        int i = 0;
        for (int i2 = 0; i2 < 7; i2++) {
            i |= iArr[i2];
        }
        return (((i >>> 1) | (i & 1)) - 1) >> 31;
    }

    public static void g(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] f = xs6.f();
        xs6.m(iArr, iArr2, f);
        l(f, iArr3);
    }

    public static void h(int[] iArr, int[] iArr2, int[] iArr3) {
        if (xs6.q(iArr, iArr2, iArr3) != 0 || (iArr3[13] == -1 && et6.u(14, iArr3, b))) {
            int[] iArr4 = c;
            if (et6.e(iArr4.length, iArr4, iArr3) != 0) {
                et6.x(14, iArr3, iArr4.length);
            }
        }
    }

    public static void i(int[] iArr, int[] iArr2) {
        if (f(iArr) != 0) {
            int[] iArr3 = a;
            xs6.s(iArr3, iArr3, iArr2);
            return;
        }
        xs6.s(a, iArr, iArr2);
    }

    public static void j(SecureRandom secureRandom, int[] iArr) {
        byte[] bArr = new byte[28];
        do {
            secureRandom.nextBytes(bArr);
            mo7.n(bArr, 0, iArr, 0, 7);
        } while (et6.B(7, iArr, a) == 0);
    }

    public static void k(SecureRandom secureRandom, int[] iArr) {
        do {
            j(secureRandom, iArr);
        } while (f(iArr) != 0);
    }

    public static void l(int[] iArr, int[] iArr2) {
        long j = iArr[10] & 4294967295L;
        long j2 = iArr[11] & 4294967295L;
        long j3 = iArr[12] & 4294967295L;
        long j4 = iArr[13] & 4294967295L;
        long j5 = ((iArr[7] & 4294967295L) + j2) - 1;
        long j6 = (iArr[8] & 4294967295L) + j3;
        long j7 = (iArr[9] & 4294967295L) + j4;
        long j8 = (iArr[0] & 4294967295L) - j5;
        long j9 = j8 & 4294967295L;
        long j10 = (j8 >> 32) + ((iArr[1] & 4294967295L) - j6);
        int i = (int) j10;
        iArr2[1] = i;
        long j11 = (j10 >> 32) + ((iArr[2] & 4294967295L) - j7);
        int i2 = (int) j11;
        iArr2[2] = i2;
        long j12 = (j11 >> 32) + (((iArr[3] & 4294967295L) + j5) - j);
        long j13 = j12 & 4294967295L;
        long j14 = (j12 >> 32) + (((iArr[4] & 4294967295L) + j6) - j2);
        iArr2[4] = (int) j14;
        long j15 = (j14 >> 32) + (((iArr[5] & 4294967295L) + j7) - j3);
        iArr2[5] = (int) j15;
        long j16 = (j15 >> 32) + (((iArr[6] & 4294967295L) + j) - j4);
        iArr2[6] = (int) j16;
        long j17 = (j16 >> 32) + 1;
        long j18 = j13 + j17;
        long j19 = j9 - j17;
        iArr2[0] = (int) j19;
        long j20 = j19 >> 32;
        if (j20 != 0) {
            long j21 = j20 + (i & 4294967295L);
            iArr2[1] = (int) j21;
            long j22 = (j21 >> 32) + (4294967295L & i2);
            iArr2[2] = (int) j22;
            j18 += j22 >> 32;
        }
        iArr2[3] = (int) j18;
        if (((j18 >> 32) != 0 && et6.x(7, iArr2, 4) != 0) || (iArr2[6] == -1 && xs6.j(iArr2, a))) {
            c(iArr2);
        }
    }

    public static void m(int i, int[] iArr) {
        long j;
        if (i != 0) {
            long j2 = i & 4294967295L;
            long j3 = (iArr[0] & 4294967295L) - j2;
            iArr[0] = (int) j3;
            long j4 = j3 >> 32;
            if (j4 != 0) {
                long j5 = j4 + (iArr[1] & 4294967295L);
                iArr[1] = (int) j5;
                long j6 = (j5 >> 32) + (iArr[2] & 4294967295L);
                iArr[2] = (int) j6;
                j4 = j6 >> 32;
            }
            long j7 = j4 + (4294967295L & iArr[3]) + j2;
            iArr[3] = (int) j7;
            j = j7 >> 32;
        } else {
            j = 0;
        }
        if ((j != 0 && et6.x(7, iArr, 4) != 0) || (iArr[6] == -1 && xs6.j(iArr, a))) {
            c(iArr);
        }
    }

    public static void n(int[] iArr, int[] iArr2) {
        int[] f = xs6.f();
        xs6.r(iArr, f);
        l(f, iArr2);
    }

    public static void o(int[] iArr, int i, int[] iArr2) {
        int[] f = xs6.f();
        xs6.r(iArr, f);
        while (true) {
            l(f, iArr2);
            i--;
            if (i > 0) {
                xs6.r(iArr2, f);
            } else {
                return;
            }
        }
    }

    private static void p(int[] iArr) {
        long j = (iArr[0] & 4294967295L) + 1;
        iArr[0] = (int) j;
        long j2 = j >> 32;
        if (j2 != 0) {
            long j3 = j2 + (iArr[1] & 4294967295L);
            iArr[1] = (int) j3;
            long j4 = (j3 >> 32) + (iArr[2] & 4294967295L);
            iArr[2] = (int) j4;
            j2 = j4 >> 32;
        }
        long j5 = j2 + ((4294967295L & iArr[3]) - 1);
        iArr[3] = (int) j5;
        if ((j5 >> 32) != 0) {
            et6.n(7, iArr, 4);
        }
    }

    public static void q(int[] iArr, int[] iArr2, int[] iArr3) {
        if (xs6.s(iArr, iArr2, iArr3) != 0) {
            p(iArr3);
        }
    }

    public static void r(int[] iArr, int[] iArr2) {
        if (et6.K(7, iArr, 0, iArr2) != 0 || (iArr2[6] == -1 && xs6.j(iArr2, a))) {
            c(iArr2);
        }
    }
}
