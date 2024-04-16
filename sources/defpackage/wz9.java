package defpackage;

import java.math.BigInteger;
import java.security.SecureRandom;
/* renamed from: wz9  reason: default package */
/* loaded from: classes3.dex */
public class wz9 {
    static final int[] a = {-977, -2, -1, -1, -1, -1, -1, -1};
    private static final int[] b = {954529, 1954, 1, 0, 0, 0, 0, 0, -1954, -3, -1, -1, -1, -1, -1, -1};
    private static final int[] c = {-954529, -1955, -2, -1, -1, -1, -1, -1, 1953, 2};

    public static void a(int[] iArr, int[] iArr2, int[] iArr3) {
        if (ys6.a(iArr, iArr2, iArr3) != 0 || (iArr3[7] == -1 && ys6.s(iArr3, a))) {
            et6.b(8, 977, iArr3);
        }
    }

    public static void b(int[] iArr, int[] iArr2) {
        if (et6.w(8, iArr, iArr2) != 0 || (iArr2[7] == -1 && ys6.s(iArr2, a))) {
            et6.b(8, 977, iArr2);
        }
    }

    public static int[] c(BigInteger bigInteger) {
        int[] p = ys6.p(bigInteger);
        if (p[7] == -1) {
            int[] iArr = a;
            if (ys6.s(p, iArr)) {
                ys6.I(iArr, p);
            }
        }
        return p;
    }

    public static void d(int[] iArr, int[] iArr2) {
        jm6.b(a, iArr, iArr2);
    }

    public static int e(int[] iArr) {
        int i = 0;
        for (int i2 = 0; i2 < 8; i2++) {
            i |= iArr[i2];
        }
        return (((i >>> 1) | (i & 1)) - 1) >> 31;
    }

    public static void f(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] k = ys6.k();
        ys6.y(iArr, iArr2, k);
        k(k, iArr3);
    }

    public static void g(int[] iArr, int[] iArr2, int[] iArr3) {
        if (ys6.C(iArr, iArr2, iArr3) != 0 || (iArr3[15] == -1 && et6.u(16, iArr3, b))) {
            int[] iArr4 = c;
            if (et6.e(iArr4.length, iArr4, iArr3) != 0) {
                et6.x(16, iArr3, iArr4.length);
            }
        }
    }

    public static void h(int[] iArr, int[] iArr2) {
        if (e(iArr) != 0) {
            int[] iArr3 = a;
            ys6.H(iArr3, iArr3, iArr2);
            return;
        }
        ys6.H(a, iArr, iArr2);
    }

    public static void i(SecureRandom secureRandom, int[] iArr) {
        byte[] bArr = new byte[32];
        do {
            secureRandom.nextBytes(bArr);
            mo7.n(bArr, 0, iArr, 0, 8);
        } while (et6.B(8, iArr, a) == 0);
    }

    public static void j(SecureRandom secureRandom, int[] iArr) {
        do {
            i(secureRandom, iArr);
        } while (e(iArr) != 0);
    }

    public static void k(int[] iArr, int[] iArr2) {
        if (ys6.A(977, ys6.z(977, iArr, 8, iArr, 0, iArr2, 0), iArr2, 0) != 0 || (iArr2[7] == -1 && ys6.s(iArr2, a))) {
            et6.b(8, 977, iArr2);
        }
    }

    public static void l(int i, int[] iArr) {
        if ((i != 0 && ys6.B(977, i, iArr, 0) != 0) || (iArr[7] == -1 && ys6.s(iArr, a))) {
            et6.b(8, 977, iArr);
        }
    }

    public static void m(int[] iArr, int[] iArr2) {
        int[] k = ys6.k();
        ys6.F(iArr, k);
        k(k, iArr2);
    }

    public static void n(int[] iArr, int i, int[] iArr2) {
        int[] k = ys6.k();
        ys6.F(iArr, k);
        while (true) {
            k(k, iArr2);
            i--;
            if (i > 0) {
                ys6.F(iArr2, k);
            } else {
                return;
            }
        }
    }

    public static void o(int[] iArr, int[] iArr2, int[] iArr3) {
        if (ys6.H(iArr, iArr2, iArr3) != 0) {
            et6.R(8, 977, iArr3);
        }
    }

    public static void p(int[] iArr, int[] iArr2) {
        if (et6.K(8, iArr, 0, iArr2) != 0 || (iArr2[7] == -1 && ys6.s(iArr2, a))) {
            et6.b(8, 977, iArr2);
        }
    }
}
