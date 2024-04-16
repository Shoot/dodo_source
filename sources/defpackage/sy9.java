package defpackage;

import java.math.BigInteger;
import java.security.SecureRandom;
/* renamed from: sy9  reason: default package */
/* loaded from: classes3.dex */
public class sy9 {
    static final int[] a = {-1, -1, -1, -3};
    private static final int[] b = {1, 0, 0, 4, -2, -1, 3, -4};
    private static final int[] c = {-1, -1, -1, -5, 1, 0, -4, 3};

    public static void a(int[] iArr, int[] iArr2, int[] iArr3) {
        if (us6.a(iArr, iArr2, iArr3) != 0 || ((iArr3[3] >>> 1) >= 2147483646 && us6.n(iArr3, a))) {
            c(iArr3);
        }
    }

    public static void b(int[] iArr, int[] iArr2) {
        if (et6.w(4, iArr, iArr2) != 0 || ((iArr2[3] >>> 1) >= 2147483646 && us6.n(iArr2, a))) {
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
            long j4 = (j3 >> 32) + (iArr[2] & 4294967295L);
            iArr[2] = (int) j4;
            j2 = j4 >> 32;
        }
        iArr[3] = (int) (j2 + (4294967295L & iArr[3]) + 2);
    }

    public static int[] d(BigInteger bigInteger) {
        int[] l = us6.l(bigInteger);
        if ((l[3] >>> 1) >= 2147483646) {
            int[] iArr = a;
            if (us6.n(l, iArr)) {
                us6.w(iArr, l);
            }
        }
        return l;
    }

    public static void e(int[] iArr, int[] iArr2) {
        jm6.b(a, iArr, iArr2);
    }

    public static int f(int[] iArr) {
        int i = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            i |= iArr[i2];
        }
        return (((i >>> 1) | (i & 1)) - 1) >> 31;
    }

    public static void g(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] h = us6.h();
        us6.s(iArr, iArr2, h);
        l(h, iArr3);
    }

    public static void h(int[] iArr, int[] iArr2, int[] iArr3) {
        if (us6.t(iArr, iArr2, iArr3) != 0 || ((iArr3[7] >>> 1) >= 2147483646 && ys6.s(iArr3, b))) {
            int[] iArr4 = c;
            et6.e(iArr4.length, iArr4, iArr3);
        }
    }

    public static void i(int[] iArr, int[] iArr2) {
        if (f(iArr) != 0) {
            int[] iArr3 = a;
            us6.v(iArr3, iArr3, iArr2);
            return;
        }
        us6.v(a, iArr, iArr2);
    }

    public static void j(SecureRandom secureRandom, int[] iArr) {
        byte[] bArr = new byte[16];
        do {
            secureRandom.nextBytes(bArr);
            mo7.n(bArr, 0, iArr, 0, 4);
        } while (et6.B(4, iArr, a) == 0);
    }

    public static void k(SecureRandom secureRandom, int[] iArr) {
        do {
            j(secureRandom, iArr);
        } while (f(iArr) != 0);
    }

    public static void l(int[] iArr, int[] iArr2) {
        long j = iArr[7] & 4294967295L;
        long j2 = (iArr[3] & 4294967295L) + j;
        long j3 = (iArr[6] & 4294967295L) + (j << 1);
        long j4 = (iArr[2] & 4294967295L) + j3;
        long j5 = (iArr[5] & 4294967295L) + (j3 << 1);
        long j6 = (iArr[1] & 4294967295L) + j5;
        long j7 = (iArr[4] & 4294967295L) + (j5 << 1);
        long j8 = (iArr[0] & 4294967295L) + j7;
        iArr2[0] = (int) j8;
        long j9 = j6 + (j8 >>> 32);
        iArr2[1] = (int) j9;
        long j10 = j4 + (j9 >>> 32);
        iArr2[2] = (int) j10;
        long j11 = j2 + (j7 << 1) + (j10 >>> 32);
        iArr2[3] = (int) j11;
        m((int) (j11 >>> 32), iArr2);
    }

    public static void m(int i, int[] iArr) {
        while (i != 0) {
            long j = i & 4294967295L;
            long j2 = (iArr[0] & 4294967295L) + j;
            iArr[0] = (int) j2;
            long j3 = j2 >> 32;
            if (j3 != 0) {
                long j4 = j3 + (iArr[1] & 4294967295L);
                iArr[1] = (int) j4;
                long j5 = (j4 >> 32) + (iArr[2] & 4294967295L);
                iArr[2] = (int) j5;
                j3 = j5 >> 32;
            }
            long j6 = j3 + (4294967295L & iArr[3]) + (j << 1);
            iArr[3] = (int) j6;
            i = (int) (j6 >> 32);
        }
        if ((iArr[3] >>> 1) >= 2147483646 && us6.n(iArr, a)) {
            c(iArr);
        }
    }

    public static void n(int[] iArr, int[] iArr2) {
        int[] h = us6.h();
        us6.u(iArr, h);
        l(h, iArr2);
    }

    public static void o(int[] iArr, int i, int[] iArr2) {
        int[] h = us6.h();
        us6.u(iArr, h);
        while (true) {
            l(h, iArr2);
            i--;
            if (i > 0) {
                us6.u(iArr2, h);
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
            long j4 = (j3 >> 32) + (iArr[2] & 4294967295L);
            iArr[2] = (int) j4;
            j2 = j4 >> 32;
        }
        iArr[3] = (int) (j2 + ((4294967295L & iArr[3]) - 2));
    }

    public static void q(int[] iArr, int[] iArr2, int[] iArr3) {
        if (us6.v(iArr, iArr2, iArr3) != 0) {
            p(iArr3);
        }
    }

    public static void r(int[] iArr, int[] iArr2) {
        if (et6.K(4, iArr, 0, iArr2) != 0 || ((iArr2[3] >>> 1) >= 2147483646 && us6.n(iArr2, a))) {
            c(iArr2);
        }
    }
}
