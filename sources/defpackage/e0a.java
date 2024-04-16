package defpackage;

import java.math.BigInteger;
import java.security.SecureRandom;
/* renamed from: e0a  reason: default package */
/* loaded from: classes3.dex */
public class e0a {
    static final int[] a = {-1, 0, 0, -1, -2, -1, -1, -1, -1, -1, -1, -1};
    private static final int[] b = {1, -2, 0, 2, 0, -2, 0, 2, 1, 0, 0, 0, -2, 1, 0, -2, -3, -1, -1, -1, -1, -1, -1, -1};
    private static final int[] c = {-1, 1, -1, -3, -1, 1, -1, -3, -2, -1, -1, -1, 1, -2, -1, 1, 2};

    public static void a(int[] iArr, int[] iArr2, int[] iArr3) {
        if (et6.a(12, iArr, iArr2, iArr3) != 0 || (iArr3[11] == -1 && et6.u(12, iArr3, a))) {
            d(iArr3);
        }
    }

    public static void b(int[] iArr, int[] iArr2, int[] iArr3) {
        if (et6.a(24, iArr, iArr2, iArr3) != 0 || (iArr3[23] == -1 && et6.u(24, iArr3, b))) {
            int[] iArr4 = c;
            if (et6.e(iArr4.length, iArr4, iArr3) != 0) {
                et6.x(24, iArr3, iArr4.length);
            }
        }
    }

    public static void c(int[] iArr, int[] iArr2) {
        if (et6.w(12, iArr, iArr2) != 0 || (iArr2[11] == -1 && et6.u(12, iArr2, a))) {
            d(iArr2);
        }
    }

    private static void d(int[] iArr) {
        long j = (iArr[0] & 4294967295L) + 1;
        iArr[0] = (int) j;
        long j2 = (j >> 32) + ((iArr[1] & 4294967295L) - 1);
        iArr[1] = (int) j2;
        long j3 = j2 >> 32;
        if (j3 != 0) {
            long j4 = j3 + (iArr[2] & 4294967295L);
            iArr[2] = (int) j4;
            j3 = j4 >> 32;
        }
        long j5 = j3 + (iArr[3] & 4294967295L) + 1;
        iArr[3] = (int) j5;
        long j6 = (j5 >> 32) + (4294967295L & iArr[4]) + 1;
        iArr[4] = (int) j6;
        if ((j6 >> 32) != 0) {
            et6.x(12, iArr, 5);
        }
    }

    public static int[] e(BigInteger bigInteger) {
        int[] r = et6.r(384, bigInteger);
        if (r[11] == -1) {
            int[] iArr = a;
            if (et6.u(12, r, iArr)) {
                et6.T(12, iArr, r);
            }
        }
        return r;
    }

    public static void f(int[] iArr, int[] iArr2) {
        jm6.b(a, iArr, iArr2);
    }

    public static int g(int[] iArr) {
        int i = 0;
        for (int i2 = 0; i2 < 12; i2++) {
            i |= iArr[i2];
        }
        return (((i >>> 1) | (i & 1)) - 1) >> 31;
    }

    public static void h(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] k = et6.k(24);
        at6.a(iArr, iArr2, k);
        l(k, iArr3);
    }

    public static void i(int[] iArr, int[] iArr2) {
        if (g(iArr) != 0) {
            int[] iArr3 = a;
            et6.Q(12, iArr3, iArr3, iArr2);
            return;
        }
        et6.Q(12, a, iArr, iArr2);
    }

    public static void j(SecureRandom secureRandom, int[] iArr) {
        byte[] bArr = new byte[48];
        do {
            secureRandom.nextBytes(bArr);
            mo7.n(bArr, 0, iArr, 0, 12);
        } while (et6.B(12, iArr, a) == 0);
    }

    public static void k(SecureRandom secureRandom, int[] iArr) {
        do {
            j(secureRandom, iArr);
        } while (g(iArr) != 0);
    }

    public static void l(int[] iArr, int[] iArr2) {
        long j = iArr[16] & 4294967295L;
        long j2 = iArr[17] & 4294967295L;
        long j3 = iArr[18] & 4294967295L;
        long j4 = iArr[19] & 4294967295L;
        long j5 = iArr[20] & 4294967295L;
        long j6 = iArr[21] & 4294967295L;
        long j7 = iArr[22] & 4294967295L;
        long j8 = iArr[23] & 4294967295L;
        long j9 = ((iArr[12] & 4294967295L) + j5) - 1;
        long j10 = (iArr[13] & 4294967295L) + j7;
        long j11 = (iArr[14] & 4294967295L) + j7 + j8;
        long j12 = (iArr[15] & 4294967295L) + j8;
        long j13 = j2 + j6;
        long j14 = j6 - j8;
        long j15 = j7 - j8;
        long j16 = j9 + j14;
        long j17 = (iArr[0] & 4294967295L) + j16;
        iArr2[0] = (int) j17;
        long j18 = (j17 >> 32) + (((iArr[1] & 4294967295L) + j8) - j9) + j10;
        iArr2[1] = (int) j18;
        long j19 = (j18 >> 32) + (((iArr[2] & 4294967295L) - j6) - j10) + j11;
        iArr2[2] = (int) j19;
        long j20 = (j19 >> 32) + ((iArr[3] & 4294967295L) - j11) + j12 + j16;
        iArr2[3] = (int) j20;
        long j21 = (j20 >> 32) + (((((iArr[4] & 4294967295L) + j) + j6) + j10) - j12) + j16;
        iArr2[4] = (int) j21;
        long j22 = (j21 >> 32) + ((iArr[5] & 4294967295L) - j) + j10 + j11 + j13;
        iArr2[5] = (int) j22;
        long j23 = (j22 >> 32) + (((iArr[6] & 4294967295L) + j3) - j2) + j11 + j12;
        iArr2[6] = (int) j23;
        long j24 = (j23 >> 32) + ((((iArr[7] & 4294967295L) + j) + j4) - j3) + j12;
        iArr2[7] = (int) j24;
        long j25 = (j24 >> 32) + (((((iArr[8] & 4294967295L) + j) + j2) + j5) - j4);
        iArr2[8] = (int) j25;
        long j26 = (j25 >> 32) + (((iArr[9] & 4294967295L) + j3) - j5) + j13;
        iArr2[9] = (int) j26;
        long j27 = (j26 >> 32) + ((((iArr[10] & 4294967295L) + j3) + j4) - j14) + j15;
        iArr2[10] = (int) j27;
        long j28 = (j27 >> 32) + ((((iArr[11] & 4294967295L) + j4) + j5) - j15);
        iArr2[11] = (int) j28;
        m((int) ((j28 >> 32) + 1), iArr2);
    }

    public static void m(int i, int[] iArr) {
        long j;
        if (i != 0) {
            long j2 = i & 4294967295L;
            long j3 = (iArr[0] & 4294967295L) + j2;
            iArr[0] = (int) j3;
            long j4 = (j3 >> 32) + ((iArr[1] & 4294967295L) - j2);
            iArr[1] = (int) j4;
            long j5 = j4 >> 32;
            if (j5 != 0) {
                long j6 = j5 + (iArr[2] & 4294967295L);
                iArr[2] = (int) j6;
                j5 = j6 >> 32;
            }
            long j7 = j5 + (iArr[3] & 4294967295L) + j2;
            iArr[3] = (int) j7;
            long j8 = (j7 >> 32) + (4294967295L & iArr[4]) + j2;
            iArr[4] = (int) j8;
            j = j8 >> 32;
        } else {
            j = 0;
        }
        if ((j != 0 && et6.x(12, iArr, 5) != 0) || (iArr[11] == -1 && et6.u(12, iArr, a))) {
            d(iArr);
        }
    }

    public static void n(int[] iArr, int[] iArr2) {
        int[] k = et6.k(24);
        at6.b(iArr, k);
        l(k, iArr2);
    }

    public static void o(int[] iArr, int i, int[] iArr2) {
        int[] k = et6.k(24);
        at6.b(iArr, k);
        while (true) {
            l(k, iArr2);
            i--;
            if (i > 0) {
                at6.b(iArr2, k);
            } else {
                return;
            }
        }
    }

    private static void p(int[] iArr) {
        long j = (iArr[0] & 4294967295L) - 1;
        iArr[0] = (int) j;
        long j2 = (j >> 32) + (iArr[1] & 4294967295L) + 1;
        iArr[1] = (int) j2;
        long j3 = j2 >> 32;
        if (j3 != 0) {
            long j4 = j3 + (iArr[2] & 4294967295L);
            iArr[2] = (int) j4;
            j3 = j4 >> 32;
        }
        long j5 = j3 + ((iArr[3] & 4294967295L) - 1);
        iArr[3] = (int) j5;
        long j6 = (j5 >> 32) + ((4294967295L & iArr[4]) - 1);
        iArr[4] = (int) j6;
        if ((j6 >> 32) != 0) {
            et6.n(12, iArr, 5);
        }
    }

    public static void q(int[] iArr, int[] iArr2, int[] iArr3) {
        if (et6.Q(12, iArr, iArr2, iArr3) != 0) {
            p(iArr3);
        }
    }

    public static void r(int[] iArr, int[] iArr2) {
        if (et6.K(12, iArr, 0, iArr2) != 0 || (iArr2[11] == -1 && et6.u(12, iArr2, a))) {
            d(iArr2);
        }
    }
}
