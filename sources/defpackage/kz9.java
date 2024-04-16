package defpackage;

import java.math.BigInteger;
import java.security.SecureRandom;
/* renamed from: kz9  reason: default package */
/* loaded from: classes3.dex */
public class kz9 {
    static final int[] a = {-1, -1, -2, -1, -1, -1};
    private static final int[] b = {1, 0, 2, 0, 1, 0, -2, -1, -3, -1, -1, -1};
    private static final int[] c = {-1, -1, -3, -1, -2, -1, 1, 0, 2};

    public static void a(int[] iArr, int[] iArr2, int[] iArr3) {
        if (ws6.a(iArr, iArr2, iArr3) != 0 || (iArr3[5] == -1 && ws6.r(iArr3, a))) {
            c(iArr3);
        }
    }

    public static void b(int[] iArr, int[] iArr2) {
        if (et6.w(6, iArr, iArr2) != 0 || (iArr2[5] == -1 && ws6.r(iArr2, a))) {
            c(iArr2);
        }
    }

    private static void c(int[] iArr) {
        long j = (iArr[0] & 4294967295L) + 1;
        iArr[0] = (int) j;
        long j2 = j >> 32;
        if (j2 != 0) {
            long j3 = j2 + (iArr[1] & 4294967295L);
            iArr[1] = (int) j3;
            j2 = j3 >> 32;
        }
        long j4 = j2 + (4294967295L & iArr[2]) + 1;
        iArr[2] = (int) j4;
        if ((j4 >> 32) != 0) {
            et6.x(6, iArr, 3);
        }
    }

    public static int[] d(BigInteger bigInteger) {
        int[] o = ws6.o(bigInteger);
        if (o[5] == -1) {
            int[] iArr = a;
            if (ws6.r(o, iArr)) {
                ws6.G(iArr, o);
            }
        }
        return o;
    }

    public static void e(int[] iArr, int[] iArr2) {
        jm6.b(a, iArr, iArr2);
    }

    public static int f(int[] iArr) {
        int i = 0;
        for (int i2 = 0; i2 < 6; i2++) {
            i |= iArr[i2];
        }
        return (((i >>> 1) | (i & 1)) - 1) >> 31;
    }

    public static void g(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] j = ws6.j();
        ws6.x(iArr, iArr2, j);
        l(j, iArr3);
    }

    public static void h(int[] iArr, int[] iArr2, int[] iArr3) {
        if (ws6.B(iArr, iArr2, iArr3) != 0 || (iArr3[11] == -1 && et6.u(12, iArr3, b))) {
            int[] iArr4 = c;
            if (et6.e(iArr4.length, iArr4, iArr3) != 0) {
                et6.x(12, iArr3, iArr4.length);
            }
        }
    }

    public static void i(int[] iArr, int[] iArr2) {
        if (f(iArr) != 0) {
            int[] iArr3 = a;
            ws6.F(iArr3, iArr3, iArr2);
            return;
        }
        ws6.F(a, iArr, iArr2);
    }

    public static void j(SecureRandom secureRandom, int[] iArr) {
        byte[] bArr = new byte[24];
        do {
            secureRandom.nextBytes(bArr);
            mo7.n(bArr, 0, iArr, 0, 6);
        } while (et6.B(6, iArr, a) == 0);
    }

    public static void k(SecureRandom secureRandom, int[] iArr) {
        do {
            j(secureRandom, iArr);
        } while (f(iArr) != 0);
    }

    public static void l(int[] iArr, int[] iArr2) {
        long j = iArr[6] & 4294967295L;
        long j2 = iArr[7] & 4294967295L;
        long j3 = (iArr[10] & 4294967295L) + j;
        long j4 = (iArr[11] & 4294967295L) + j2;
        long j5 = (iArr[0] & 4294967295L) + j3;
        int i = (int) j5;
        long j6 = (j5 >> 32) + (iArr[1] & 4294967295L) + j4;
        int i2 = (int) j6;
        iArr2[1] = i2;
        long j7 = j3 + (iArr[8] & 4294967295L);
        long j8 = j4 + (iArr[9] & 4294967295L);
        long j9 = (j6 >> 32) + (iArr[2] & 4294967295L) + j7;
        long j10 = j9 & 4294967295L;
        long j11 = (j9 >> 32) + (iArr[3] & 4294967295L) + j8;
        iArr2[3] = (int) j11;
        long j12 = j8 - j2;
        long j13 = (j11 >> 32) + (iArr[4] & 4294967295L) + (j7 - j);
        iArr2[4] = (int) j13;
        long j14 = (j13 >> 32) + (iArr[5] & 4294967295L) + j12;
        iArr2[5] = (int) j14;
        long j15 = j14 >> 32;
        long j16 = j10 + j15;
        long j17 = j15 + (i & 4294967295L);
        iArr2[0] = (int) j17;
        long j18 = j17 >> 32;
        if (j18 != 0) {
            long j19 = j18 + (4294967295L & i2);
            iArr2[1] = (int) j19;
            j16 += j19 >> 32;
        }
        iArr2[2] = (int) j16;
        if (((j16 >> 32) != 0 && et6.x(6, iArr2, 3) != 0) || (iArr2[5] == -1 && ws6.r(iArr2, a))) {
            c(iArr2);
        }
    }

    public static void m(int i, int[] iArr) {
        long j;
        if (i != 0) {
            long j2 = i & 4294967295L;
            long j3 = (iArr[0] & 4294967295L) + j2;
            iArr[0] = (int) j3;
            long j4 = j3 >> 32;
            if (j4 != 0) {
                long j5 = j4 + (iArr[1] & 4294967295L);
                iArr[1] = (int) j5;
                j4 = j5 >> 32;
            }
            long j6 = j4 + (4294967295L & iArr[2]) + j2;
            iArr[2] = (int) j6;
            j = j6 >> 32;
        } else {
            j = 0;
        }
        if ((j != 0 && et6.x(6, iArr, 3) != 0) || (iArr[5] == -1 && ws6.r(iArr, a))) {
            c(iArr);
        }
    }

    public static void n(int[] iArr, int[] iArr2) {
        int[] j = ws6.j();
        ws6.D(iArr, j);
        l(j, iArr2);
    }

    public static void o(int[] iArr, int i, int[] iArr2) {
        int[] j = ws6.j();
        ws6.D(iArr, j);
        while (true) {
            l(j, iArr2);
            i--;
            if (i > 0) {
                ws6.D(iArr2, j);
            } else {
                return;
            }
        }
    }

    private static void p(int[] iArr) {
        long j = (iArr[0] & 4294967295L) - 1;
        iArr[0] = (int) j;
        long j2 = j >> 32;
        if (j2 != 0) {
            long j3 = j2 + (iArr[1] & 4294967295L);
            iArr[1] = (int) j3;
            j2 = j3 >> 32;
        }
        long j4 = j2 + ((4294967295L & iArr[2]) - 1);
        iArr[2] = (int) j4;
        if ((j4 >> 32) != 0) {
            et6.n(6, iArr, 3);
        }
    }

    public static void q(int[] iArr, int[] iArr2, int[] iArr3) {
        if (ws6.F(iArr, iArr2, iArr3) != 0) {
            p(iArr3);
        }
    }

    public static void r(int[] iArr, int[] iArr2) {
        if (et6.K(6, iArr, 0, iArr2) != 0 || (iArr2[5] == -1 && ws6.r(iArr2, a))) {
            c(iArr2);
        }
    }
}
