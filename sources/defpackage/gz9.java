package defpackage;

import java.math.BigInteger;
import java.security.SecureRandom;
/* renamed from: gz9  reason: default package */
/* loaded from: classes3.dex */
public class gz9 {
    static final int[] a = {-4553, -2, -1, -1, -1, -1};
    private static final int[] b = {20729809, 9106, 1, 0, 0, 0, -9106, -3, -1, -1, -1, -1};
    private static final int[] c = {-20729809, -9107, -2, -1, -1, -1, 9105, 2};

    public static void a(int[] iArr, int[] iArr2, int[] iArr3) {
        if (ws6.a(iArr, iArr2, iArr3) != 0 || (iArr3[5] == -1 && ws6.r(iArr3, a))) {
            et6.b(6, 4553, iArr3);
        }
    }

    public static void b(int[] iArr, int[] iArr2) {
        if (et6.w(6, iArr, iArr2) != 0 || (iArr2[5] == -1 && ws6.r(iArr2, a))) {
            et6.b(6, 4553, iArr2);
        }
    }

    public static int[] c(BigInteger bigInteger) {
        int[] o = ws6.o(bigInteger);
        if (o[5] == -1) {
            int[] iArr = a;
            if (ws6.r(o, iArr)) {
                ws6.G(iArr, o);
            }
        }
        return o;
    }

    public static void d(int[] iArr, int[] iArr2) {
        jm6.b(a, iArr, iArr2);
    }

    public static int e(int[] iArr) {
        int i = 0;
        for (int i2 = 0; i2 < 6; i2++) {
            i |= iArr[i2];
        }
        return (((i >>> 1) | (i & 1)) - 1) >> 31;
    }

    public static void f(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] j = ws6.j();
        ws6.x(iArr, iArr2, j);
        k(j, iArr3);
    }

    public static void g(int[] iArr, int[] iArr2, int[] iArr3) {
        if (ws6.B(iArr, iArr2, iArr3) != 0 || (iArr3[11] == -1 && et6.u(12, iArr3, b))) {
            int[] iArr4 = c;
            if (et6.e(iArr4.length, iArr4, iArr3) != 0) {
                et6.x(12, iArr3, iArr4.length);
            }
        }
    }

    public static void h(int[] iArr, int[] iArr2) {
        if (e(iArr) != 0) {
            int[] iArr3 = a;
            ws6.F(iArr3, iArr3, iArr2);
            return;
        }
        ws6.F(a, iArr, iArr2);
    }

    public static void i(SecureRandom secureRandom, int[] iArr) {
        byte[] bArr = new byte[24];
        do {
            secureRandom.nextBytes(bArr);
            mo7.n(bArr, 0, iArr, 0, 6);
        } while (et6.B(6, iArr, a) == 0);
    }

    public static void j(SecureRandom secureRandom, int[] iArr) {
        do {
            i(secureRandom, iArr);
        } while (e(iArr) != 0);
    }

    public static void k(int[] iArr, int[] iArr2) {
        if (ws6.z(4553, ws6.y(4553, iArr, 6, iArr, 0, iArr2, 0), iArr2, 0) != 0 || (iArr2[5] == -1 && ws6.r(iArr2, a))) {
            et6.b(6, 4553, iArr2);
        }
    }

    public static void l(int i, int[] iArr) {
        if ((i != 0 && ws6.A(4553, i, iArr, 0) != 0) || (iArr[5] == -1 && ws6.r(iArr, a))) {
            et6.b(6, 4553, iArr);
        }
    }

    public static void m(int[] iArr, int[] iArr2) {
        int[] j = ws6.j();
        ws6.D(iArr, j);
        k(j, iArr2);
    }

    public static void n(int[] iArr, int i, int[] iArr2) {
        int[] j = ws6.j();
        ws6.D(iArr, j);
        while (true) {
            k(j, iArr2);
            i--;
            if (i > 0) {
                ws6.D(iArr2, j);
            } else {
                return;
            }
        }
    }

    public static void o(int[] iArr, int[] iArr2, int[] iArr3) {
        if (ws6.F(iArr, iArr2, iArr3) != 0) {
            et6.R(6, 4553, iArr3);
        }
    }

    public static void p(int[] iArr, int[] iArr2) {
        if (et6.K(6, iArr, 0, iArr2) != 0 || (iArr2[5] == -1 && ws6.r(iArr2, a))) {
            et6.b(6, 4553, iArr2);
        }
    }
}
