package defpackage;

import java.math.BigInteger;
import java.security.SecureRandom;
/* renamed from: yy9  reason: default package */
/* loaded from: classes3.dex */
public class yy9 {
    static final int[] a = {Integer.MAX_VALUE, -1, -1, -1, -1};
    private static final int[] b = {1, 1073741825, 0, 0, 0, -2, -2, -1, -1, -1};
    private static final int[] c = {-1, -1073741826, -1, -1, -1, 1, 1};

    public static void a(int[] iArr, int[] iArr2, int[] iArr3) {
        if (vs6.a(iArr, iArr2, iArr3) != 0 || (iArr3[4] == -1 && vs6.i(iArr3, a))) {
            et6.g(5, -2147483647, iArr3);
        }
    }

    public static void b(int[] iArr, int[] iArr2) {
        if (et6.w(5, iArr, iArr2) != 0 || (iArr2[4] == -1 && vs6.i(iArr2, a))) {
            et6.g(5, -2147483647, iArr2);
        }
    }

    public static int[] c(BigInteger bigInteger) {
        int[] g = vs6.g(bigInteger);
        if (g[4] == -1) {
            int[] iArr = a;
            if (vs6.i(g, iArr)) {
                vs6.t(iArr, g);
            }
        }
        return g;
    }

    public static void d(int[] iArr, int[] iArr2) {
        jm6.b(a, iArr, iArr2);
    }

    public static int e(int[] iArr) {
        int i = 0;
        for (int i2 = 0; i2 < 5; i2++) {
            i |= iArr[i2];
        }
        return (((i >>> 1) | (i & 1)) - 1) >> 31;
    }

    public static void f(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] e = vs6.e();
        vs6.l(iArr, iArr2, e);
        k(e, iArr3);
    }

    public static void g(int[] iArr, int[] iArr2, int[] iArr3) {
        if (vs6.p(iArr, iArr2, iArr3) != 0 || (iArr3[9] == -1 && et6.u(10, iArr3, b))) {
            int[] iArr4 = c;
            if (et6.e(iArr4.length, iArr4, iArr3) != 0) {
                et6.x(10, iArr3, iArr4.length);
            }
        }
    }

    public static void h(int[] iArr, int[] iArr2) {
        if (e(iArr) != 0) {
            int[] iArr3 = a;
            vs6.s(iArr3, iArr3, iArr2);
            return;
        }
        vs6.s(a, iArr, iArr2);
    }

    public static void i(SecureRandom secureRandom, int[] iArr) {
        byte[] bArr = new byte[20];
        do {
            secureRandom.nextBytes(bArr);
            mo7.n(bArr, 0, iArr, 0, 5);
        } while (et6.B(5, iArr, a) == 0);
    }

    public static void j(SecureRandom secureRandom, int[] iArr) {
        do {
            i(secureRandom, iArr);
        } while (e(iArr) != 0);
    }

    public static void k(int[] iArr, int[] iArr2) {
        long j = iArr[5] & 4294967295L;
        long j2 = iArr[6] & 4294967295L;
        long j3 = iArr[7] & 4294967295L;
        long j4 = iArr[8] & 4294967295L;
        long j5 = iArr[9] & 4294967295L;
        long j6 = (iArr[0] & 4294967295L) + j + (j << 31);
        iArr2[0] = (int) j6;
        long j7 = (j6 >>> 32) + (iArr[1] & 4294967295L) + j2 + (j2 << 31);
        iArr2[1] = (int) j7;
        long j8 = (j7 >>> 32) + (iArr[2] & 4294967295L) + j3 + (j3 << 31);
        iArr2[2] = (int) j8;
        long j9 = (j8 >>> 32) + (iArr[3] & 4294967295L) + j4 + (j4 << 31);
        iArr2[3] = (int) j9;
        long j10 = (j9 >>> 32) + (4294967295L & iArr[4]) + j5 + (j5 << 31);
        iArr2[4] = (int) j10;
        l((int) (j10 >>> 32), iArr2);
    }

    public static void l(int i, int[] iArr) {
        if ((i != 0 && vs6.q(-2147483647, i, iArr, 0) != 0) || (iArr[4] == -1 && vs6.i(iArr, a))) {
            et6.g(5, -2147483647, iArr);
        }
    }

    public static void m(int[] iArr, int[] iArr2) {
        int[] e = vs6.e();
        vs6.r(iArr, e);
        k(e, iArr2);
    }

    public static void n(int[] iArr, int i, int[] iArr2) {
        int[] e = vs6.e();
        vs6.r(iArr, e);
        while (true) {
            k(e, iArr2);
            i--;
            if (i > 0) {
                vs6.r(iArr2, e);
            } else {
                return;
            }
        }
    }

    public static void o(int[] iArr, int[] iArr2, int[] iArr3) {
        if (vs6.s(iArr, iArr2, iArr3) != 0) {
            et6.U(5, -2147483647, iArr3);
        }
    }

    public static void p(int[] iArr, int[] iArr2) {
        if (et6.K(5, iArr, 0, iArr2) != 0 || (iArr2[4] == -1 && vs6.i(iArr2, a))) {
            et6.g(5, -2147483647, iArr2);
        }
    }
}
