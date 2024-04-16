package defpackage;

import java.math.BigInteger;
import java.security.SecureRandom;
/* renamed from: oz9  reason: default package */
/* loaded from: classes3.dex */
public class oz9 {
    static final int[] a = {-6803, -2, -1, -1, -1, -1, -1};
    private static final int[] b = {46280809, 13606, 1, 0, 0, 0, 0, -13606, -3, -1, -1, -1, -1, -1};
    private static final int[] c = {-46280809, -13607, -2, -1, -1, -1, -1, 13605, 2};

    public static void a(int[] iArr, int[] iArr2, int[] iArr3) {
        if (xs6.a(iArr, iArr2, iArr3) != 0 || (iArr3[6] == -1 && xs6.j(iArr3, a))) {
            et6.b(7, 6803, iArr3);
        }
    }

    public static void b(int[] iArr, int[] iArr2) {
        if (et6.w(7, iArr, iArr2) != 0 || (iArr2[6] == -1 && xs6.j(iArr2, a))) {
            et6.b(7, 6803, iArr2);
        }
    }

    public static int[] c(BigInteger bigInteger) {
        int[] h = xs6.h(bigInteger);
        if (h[6] == -1 && xs6.j(h, a)) {
            et6.b(7, 6803, h);
        }
        return h;
    }

    public static void d(int[] iArr, int[] iArr2) {
        jm6.b(a, iArr, iArr2);
    }

    public static int e(int[] iArr) {
        int i = 0;
        for (int i2 = 0; i2 < 7; i2++) {
            i |= iArr[i2];
        }
        return (((i >>> 1) | (i & 1)) - 1) >> 31;
    }

    public static void f(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] f = xs6.f();
        xs6.m(iArr, iArr2, f);
        k(f, iArr3);
    }

    public static void g(int[] iArr, int[] iArr2, int[] iArr3) {
        if (xs6.q(iArr, iArr2, iArr3) != 0 || (iArr3[13] == -1 && et6.u(14, iArr3, b))) {
            int[] iArr4 = c;
            if (et6.e(iArr4.length, iArr4, iArr3) != 0) {
                et6.x(14, iArr3, iArr4.length);
            }
        }
    }

    public static void h(int[] iArr, int[] iArr2) {
        if (e(iArr) != 0) {
            int[] iArr3 = a;
            xs6.s(iArr3, iArr3, iArr2);
            return;
        }
        xs6.s(a, iArr, iArr2);
    }

    public static void i(SecureRandom secureRandom, int[] iArr) {
        byte[] bArr = new byte[28];
        do {
            secureRandom.nextBytes(bArr);
            mo7.n(bArr, 0, iArr, 0, 7);
        } while (et6.B(7, iArr, a) == 0);
    }

    public static void j(SecureRandom secureRandom, int[] iArr) {
        do {
            i(secureRandom, iArr);
        } while (e(iArr) != 0);
    }

    public static void k(int[] iArr, int[] iArr2) {
        if (xs6.o(6803, xs6.n(6803, iArr, 7, iArr, 0, iArr2, 0), iArr2, 0) != 0 || (iArr2[6] == -1 && xs6.j(iArr2, a))) {
            et6.b(7, 6803, iArr2);
        }
    }

    public static void l(int i, int[] iArr) {
        if ((i != 0 && xs6.p(6803, i, iArr, 0) != 0) || (iArr[6] == -1 && xs6.j(iArr, a))) {
            et6.b(7, 6803, iArr);
        }
    }

    public static void m(int[] iArr, int[] iArr2) {
        int[] f = xs6.f();
        xs6.r(iArr, f);
        k(f, iArr2);
    }

    public static void n(int[] iArr, int i, int[] iArr2) {
        int[] f = xs6.f();
        xs6.r(iArr, f);
        while (true) {
            k(f, iArr2);
            i--;
            if (i > 0) {
                xs6.r(iArr2, f);
            } else {
                return;
            }
        }
    }

    public static void o(int[] iArr, int[] iArr2, int[] iArr3) {
        if (xs6.s(iArr, iArr2, iArr3) != 0) {
            et6.R(7, 6803, iArr3);
        }
    }

    public static void p(int[] iArr, int[] iArr2) {
        if (et6.K(7, iArr, 0, iArr2) != 0 || (iArr2[6] == -1 && xs6.j(iArr2, a))) {
            et6.b(7, 6803, iArr2);
        }
    }
}
