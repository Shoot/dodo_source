package defpackage;

import java.math.BigInteger;
import java.security.SecureRandom;
/* renamed from: i0a  reason: default package */
/* loaded from: classes3.dex */
public class i0a {
    static final int[] a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 511};

    public static void a(int[] iArr, int[] iArr2, int[] iArr3) {
        int a2 = et6.a(16, iArr, iArr2, iArr3) + iArr[16] + iArr2[16];
        if (a2 > 511 || (a2 == 511 && et6.o(16, iArr3, a))) {
            a2 = (a2 + et6.v(16, iArr3)) & 511;
        }
        iArr3[16] = a2;
    }

    public static void b(int[] iArr, int[] iArr2) {
        int w = et6.w(16, iArr, iArr2) + iArr[16];
        if (w > 511 || (w == 511 && et6.o(16, iArr2, a))) {
            w = (w + et6.v(16, iArr2)) & 511;
        }
        iArr2[16] = w;
    }

    public static int[] c(BigInteger bigInteger) {
        int[] r = et6.r(521, bigInteger);
        if (et6.o(17, r, a)) {
            et6.W(17, r);
        }
        return r;
    }

    protected static void d(int[] iArr, int[] iArr2, int[] iArr3) {
        ct6.a(iArr, iArr2, iArr3);
        int i = iArr[16];
        int i2 = iArr2[16];
        iArr3[32] = et6.C(16, i, iArr2, i2, iArr, iArr3, 16) + (i * i2);
    }

    protected static void e(int[] iArr, int[] iArr2) {
        ct6.b(iArr, iArr2);
        int i = iArr[16];
        iArr2[32] = et6.E(16, i << 1, iArr, 0, iArr2, 16) + (i * i);
    }

    public static void f(int[] iArr, int[] iArr2) {
        jm6.b(a, iArr, iArr2);
    }

    public static int g(int[] iArr) {
        int i = 0;
        for (int i2 = 0; i2 < 17; i2++) {
            i |= iArr[i2];
        }
        return (((i >>> 1) | (i & 1)) - 1) >> 31;
    }

    public static void h(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] k = et6.k(33);
        d(iArr, iArr2, k);
        l(k, iArr3);
    }

    public static void i(int[] iArr, int[] iArr2) {
        if (g(iArr) != 0) {
            int[] iArr3 = a;
            et6.Q(17, iArr3, iArr3, iArr2);
            return;
        }
        et6.Q(17, a, iArr, iArr2);
    }

    public static void j(SecureRandom secureRandom, int[] iArr) {
        byte[] bArr = new byte[68];
        do {
            secureRandom.nextBytes(bArr);
            mo7.n(bArr, 0, iArr, 0, 17);
            iArr[16] = iArr[16] & 511;
        } while (et6.B(17, iArr, a) == 0);
    }

    public static void k(SecureRandom secureRandom, int[] iArr) {
        do {
            j(secureRandom, iArr);
        } while (g(iArr) != 0);
    }

    public static void l(int[] iArr, int[] iArr2) {
        int i = iArr[32];
        int H = (et6.H(16, iArr, 16, 9, i, iArr2, 0) >>> 23) + (i >>> 9) + et6.e(16, iArr, iArr2);
        if (H > 511 || (H == 511 && et6.o(16, iArr2, a))) {
            H = (H + et6.v(16, iArr2)) & 511;
        }
        iArr2[16] = H;
    }

    public static void m(int[] iArr) {
        int i = iArr[16];
        int g = et6.g(16, i >>> 9, iArr) + (i & 511);
        if (g > 511 || (g == 511 && et6.o(16, iArr, a))) {
            g = (g + et6.v(16, iArr)) & 511;
        }
        iArr[16] = g;
    }

    public static void n(int[] iArr, int[] iArr2) {
        int[] k = et6.k(33);
        e(iArr, k);
        l(k, iArr2);
    }

    public static void o(int[] iArr, int i, int[] iArr2) {
        int[] k = et6.k(33);
        e(iArr, k);
        while (true) {
            l(k, iArr2);
            i--;
            if (i > 0) {
                e(iArr2, k);
            } else {
                return;
            }
        }
    }

    public static void p(int[] iArr, int[] iArr2, int[] iArr3) {
        int Q = (et6.Q(16, iArr, iArr2, iArr3) + iArr[16]) - iArr2[16];
        if (Q < 0) {
            Q = (Q + et6.m(16, iArr3)) & 511;
        }
        iArr3[16] = Q;
    }

    public static void q(int[] iArr, int[] iArr2) {
        int i = iArr[16];
        iArr2[16] = (et6.K(16, iArr, i << 23, iArr2) | (i << 1)) & 511;
    }
}
