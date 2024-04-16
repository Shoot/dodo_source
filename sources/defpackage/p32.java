package defpackage;

import java.math.BigInteger;
import java.security.SecureRandom;
/* renamed from: p32  reason: default package */
/* loaded from: classes3.dex */
public class p32 {
    static final int[] a = {-19, -1, -1, -1, -1, -1, -1, Integer.MAX_VALUE};
    private static final int[] b = {361, 0, 0, 0, 0, 0, 0, 0, -19, -1, -1, -1, -1, -1, -1, 1073741823};

    public static void a(int[] iArr, int[] iArr2, int[] iArr3) {
        ys6.a(iArr, iArr2, iArr3);
        if (ys6.s(iArr3, a)) {
            q(iArr3);
        }
    }

    public static void b(int[] iArr, int[] iArr2) {
        et6.w(8, iArr, iArr2);
        if (ys6.s(iArr2, a)) {
            q(iArr2);
        }
    }

    private static int c(int[] iArr) {
        long j = (iArr[0] & 4294967295L) - 19;
        iArr[0] = (int) j;
        long j2 = j >> 32;
        if (j2 != 0) {
            j2 = et6.n(7, iArr, 1);
        }
        long j3 = j2 + (4294967295L & iArr[7]) + 2147483648L;
        iArr[7] = (int) j3;
        return (int) (j3 >> 32);
    }

    public static int[] d(BigInteger bigInteger) {
        int[] p = ys6.p(bigInteger);
        while (true) {
            int[] iArr = a;
            if (ys6.s(p, iArr)) {
                ys6.I(iArr, p);
            } else {
                return p;
            }
        }
    }

    public static void e(int[] iArr, int[] iArr2) {
        jm6.b(a, iArr, iArr2);
    }

    public static int f(int[] iArr) {
        int i = 0;
        for (int i2 = 0; i2 < 8; i2++) {
            i |= iArr[i2];
        }
        return (((i >>> 1) | (i & 1)) - 1) >> 31;
    }

    public static void g(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] k = ys6.k();
        ys6.y(iArr, iArr2, k);
        l(k, iArr3);
    }

    public static void h(int[] iArr, int[] iArr2, int[] iArr3) {
        ys6.C(iArr, iArr2, iArr3);
        if (et6.u(16, iArr3, b)) {
            p(iArr3);
        }
    }

    public static void i(int[] iArr, int[] iArr2) {
        if (f(iArr) != 0) {
            int[] iArr3 = a;
            ys6.H(iArr3, iArr3, iArr2);
            return;
        }
        ys6.H(a, iArr, iArr2);
    }

    public static void j(SecureRandom secureRandom, int[] iArr) {
        byte[] bArr = new byte[32];
        do {
            secureRandom.nextBytes(bArr);
            mo7.n(bArr, 0, iArr, 0, 8);
            iArr[7] = iArr[7] & Integer.MAX_VALUE;
        } while (et6.B(8, iArr, a) == 0);
    }

    public static void k(SecureRandom secureRandom, int[] iArr) {
        do {
            j(secureRandom, iArr);
        } while (f(iArr) != 0);
    }

    public static void l(int[] iArr, int[] iArr2) {
        int i = iArr[7];
        et6.J(8, iArr, 8, i, iArr2, 0);
        int i2 = iArr2[7];
        iArr2[7] = (i2 & Integer.MAX_VALUE) + et6.g(7, ((ys6.D(19, iArr, iArr2) << 1) + ((i2 >>> 31) - (i >>> 31))) * 19, iArr2);
        if (ys6.s(iArr2, a)) {
            q(iArr2);
        }
    }

    public static void m(int i, int[] iArr) {
        int i2 = iArr[7];
        iArr[7] = (i2 & Integer.MAX_VALUE) + et6.g(7, ((i << 1) | (i2 >>> 31)) * 19, iArr);
        if (ys6.s(iArr, a)) {
            q(iArr);
        }
    }

    public static void n(int[] iArr, int[] iArr2) {
        int[] k = ys6.k();
        ys6.F(iArr, k);
        l(k, iArr2);
    }

    public static void o(int[] iArr, int i, int[] iArr2) {
        int[] k = ys6.k();
        ys6.F(iArr, k);
        while (true) {
            l(k, iArr2);
            i--;
            if (i > 0) {
                ys6.F(iArr2, k);
            } else {
                return;
            }
        }
    }

    private static int p(int[] iArr) {
        int[] iArr2 = b;
        long j = (iArr[0] & 4294967295L) - (iArr2[0] & 4294967295L);
        iArr[0] = (int) j;
        long j2 = j >> 32;
        if (j2 != 0) {
            j2 = et6.n(8, iArr, 1);
        }
        long j3 = j2 + (iArr[8] & 4294967295L) + 19;
        iArr[8] = (int) j3;
        long j4 = j3 >> 32;
        if (j4 != 0) {
            j4 = et6.x(15, iArr, 9);
        }
        long j5 = j4 + ((iArr[15] & 4294967295L) - (4294967295L & (iArr2[15] + 1)));
        iArr[15] = (int) j5;
        return (int) (j5 >> 32);
    }

    private static int q(int[] iArr) {
        long j = (iArr[0] & 4294967295L) + 19;
        iArr[0] = (int) j;
        long j2 = j >> 32;
        if (j2 != 0) {
            j2 = et6.x(7, iArr, 1);
        }
        long j3 = j2 + ((4294967295L & iArr[7]) - 2147483648L);
        iArr[7] = (int) j3;
        return (int) (j3 >> 32);
    }

    public static void r(int[] iArr, int[] iArr2, int[] iArr3) {
        if (ys6.H(iArr, iArr2, iArr3) != 0) {
            c(iArr3);
        }
    }

    public static void s(int[] iArr, int[] iArr2) {
        et6.K(8, iArr, 0, iArr2);
        if (ys6.s(iArr2, a)) {
            q(iArr2);
        }
    }
}
