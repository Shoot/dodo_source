package defpackage;

import java.math.BigInteger;
/* renamed from: f1a  reason: default package */
/* loaded from: classes3.dex */
public class f1a {
    public static void a(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr2[3] ^ jArr[3];
    }

    public static void b(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr[4] ^ jArr2[4];
        jArr3[5] = jArr[5] ^ jArr2[5];
        jArr3[6] = jArr2[6] ^ jArr[6];
    }

    public static void c(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0] ^ 1;
        jArr2[1] = jArr[1];
        jArr2[2] = jArr[2];
        jArr2[3] = jArr[3];
    }

    private static void d(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr2[0] ^ jArr[0];
        jArr2[1] = jArr2[1] ^ jArr[1];
        jArr2[2] = jArr2[2] ^ jArr[2];
        jArr2[3] = jArr2[3] ^ jArr[3];
    }

    public static long[] e(BigInteger bigInteger) {
        return et6.s(193, bigInteger);
    }

    public static void f(long[] jArr, long[] jArr2) {
        long[] l = ys6.l();
        ys6.h(jArr, jArr2);
        for (int i = 1; i < 193; i += 2) {
            k(jArr2, l);
            o(l, jArr2);
            k(jArr2, l);
            o(l, jArr2);
            d(jArr, jArr2);
        }
    }

    protected static void g(long[] jArr) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        long j6 = jArr[5];
        long j7 = jArr[6];
        long j8 = jArr[7];
        jArr[0] = j ^ (j2 << 49);
        jArr[1] = (j2 >>> 15) ^ (j3 << 34);
        jArr[2] = (j3 >>> 30) ^ (j4 << 19);
        jArr[3] = ((j4 >>> 45) ^ (j5 << 4)) ^ (j6 << 53);
        jArr[4] = ((j5 >>> 60) ^ (j7 << 38)) ^ (j6 >>> 11);
        jArr[5] = (j7 >>> 26) ^ (j8 << 23);
        jArr[6] = j8 >>> 41;
        jArr[7] = 0;
    }

    protected static void h(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        jArr2[0] = j & 562949953421311L;
        jArr2[1] = ((j >>> 49) ^ (j2 << 15)) & 562949953421311L;
        jArr2[2] = ((j2 >>> 34) ^ (j3 << 30)) & 562949953421311L;
        jArr2[3] = (j3 >>> 19) ^ (j4 << 45);
    }

    protected static void i(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[4];
        long[] jArr5 = new long[4];
        h(jArr, jArr4);
        h(jArr2, jArr5);
        long[] jArr6 = new long[8];
        j(jArr6, jArr4[0], jArr5[0], jArr3, 0);
        j(jArr6, jArr4[1], jArr5[1], jArr3, 1);
        j(jArr6, jArr4[2], jArr5[2], jArr3, 2);
        j(jArr6, jArr4[3], jArr5[3], jArr3, 3);
        for (int i = 5; i > 0; i--) {
            jArr3[i] = jArr3[i] ^ jArr3[i - 1];
        }
        j(jArr6, jArr4[0] ^ jArr4[1], jArr5[0] ^ jArr5[1], jArr3, 1);
        j(jArr6, jArr4[2] ^ jArr4[3], jArr5[2] ^ jArr5[3], jArr3, 3);
        for (int i2 = 7; i2 > 1; i2--) {
            jArr3[i2] = jArr3[i2] ^ jArr3[i2 - 2];
        }
        long j = jArr4[0] ^ jArr4[2];
        long j2 = jArr4[1] ^ jArr4[3];
        long j3 = jArr5[0] ^ jArr5[2];
        long j4 = jArr5[1] ^ jArr5[3];
        j(jArr6, j ^ j2, j3 ^ j4, jArr3, 3);
        long[] jArr7 = new long[3];
        j(jArr6, j, j3, jArr7, 0);
        j(jArr6, j2, j4, jArr7, 1);
        long j5 = jArr7[0];
        long j6 = jArr7[1];
        long j7 = jArr7[2];
        jArr3[2] = jArr3[2] ^ j5;
        jArr3[3] = jArr3[3] ^ (j5 ^ j6);
        jArr3[4] = jArr3[4] ^ (j7 ^ j6);
        jArr3[5] = jArr3[5] ^ j7;
        g(jArr3);
    }

    protected static void j(long[] jArr, long j, long j2, long[] jArr2, int i) {
        jArr[1] = j2;
        long j3 = j2 << 1;
        jArr[2] = j3;
        long j4 = j3 ^ j2;
        jArr[3] = j4;
        long j5 = j2 << 2;
        jArr[4] = j5;
        jArr[5] = j5 ^ j2;
        long j6 = j4 << 1;
        jArr[6] = j6;
        jArr[7] = j6 ^ j2;
        int i2 = (int) j;
        long j7 = (jArr[(i2 >>> 3) & 7] << 3) ^ jArr[i2 & 7];
        long j8 = 0;
        int i3 = 36;
        do {
            int i4 = (int) (j >>> i3);
            long j9 = (jArr[(i4 >>> 12) & 7] << 12) ^ (((jArr[i4 & 7] ^ (jArr[(i4 >>> 3) & 7] << 3)) ^ (jArr[(i4 >>> 6) & 7] << 6)) ^ (jArr[(i4 >>> 9) & 7] << 9));
            j7 ^= j9 << i3;
            j8 ^= j9 >>> (-i3);
            i3 -= 15;
        } while (i3 > 0);
        jArr2[i] = jArr2[i] ^ (562949953421311L & j7);
        int i5 = i + 1;
        jArr2[i5] = jArr2[i5] ^ ((j7 >>> 49) ^ (j8 << 15));
    }

    protected static void k(long[] jArr, long[] jArr2) {
        l65.c(jArr, 0, 3, jArr2, 0);
        jArr2[6] = jArr[3] & 1;
    }

    public static void l(long[] jArr, long[] jArr2) {
        if (!ys6.w(jArr)) {
            long[] j = ys6.j();
            long[] j2 = ys6.j();
            q(jArr, j);
            s(j, 1, j2);
            m(j, j2, j);
            s(j2, 1, j2);
            m(j, j2, j);
            s(j, 3, j2);
            m(j, j2, j);
            s(j, 6, j2);
            m(j, j2, j);
            s(j, 12, j2);
            m(j, j2, j);
            s(j, 24, j2);
            m(j, j2, j);
            s(j, 48, j2);
            m(j, j2, j);
            s(j, 96, j2);
            m(j, j2, jArr2);
            return;
        }
        throw new IllegalStateException();
    }

    public static void m(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] l = ys6.l();
        i(jArr, jArr2, l);
        o(l, jArr3);
    }

    public static void n(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] l = ys6.l();
        i(jArr, jArr2, l);
        b(jArr3, l, jArr3);
    }

    public static void o(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        long j6 = jArr[5];
        long j7 = jArr[6];
        long j8 = j5 ^ (j7 >>> 50);
        long j9 = (j4 ^ ((j7 >>> 1) ^ (j7 << 14))) ^ (j6 >>> 50);
        long j10 = j ^ (j8 << 63);
        long j11 = ((j3 ^ (j7 << 63)) ^ ((j6 >>> 1) ^ (j6 << 14))) ^ (j8 >>> 50);
        long j12 = j9 >>> 1;
        jArr2[0] = (j10 ^ j12) ^ (j12 << 15);
        long j13 = j9 >>> 50;
        jArr2[1] = j13 ^ ((j2 ^ (j6 << 63)) ^ ((j8 >>> 1) ^ (j8 << 14)));
        jArr2[2] = j11;
        jArr2[3] = 1 & j9;
    }

    public static void p(long[] jArr, long[] jArr2) {
        long g = l65.g(jArr[0]);
        long g2 = l65.g(jArr[1]);
        long j = (g & 4294967295L) | (g2 << 32);
        long j2 = (g >>> 32) | (g2 & (-4294967296L));
        long g3 = l65.g(jArr[2]);
        long j3 = (g3 & 4294967295L) ^ (jArr[3] << 32);
        long j4 = g3 >>> 32;
        jArr2[0] = j ^ (j2 << 8);
        jArr2[1] = ((j3 ^ (j4 << 8)) ^ (j2 >>> 56)) ^ (j2 << 33);
        jArr2[2] = (j2 >>> 31) ^ ((g3 >>> 88) ^ (j4 << 33));
        jArr2[3] = g3 >>> 63;
    }

    public static void q(long[] jArr, long[] jArr2) {
        long[] l = ys6.l();
        k(jArr, l);
        o(l, jArr2);
    }

    public static void r(long[] jArr, long[] jArr2) {
        long[] l = ys6.l();
        k(jArr, l);
        b(jArr2, l, jArr2);
    }

    public static void s(long[] jArr, int i, long[] jArr2) {
        long[] l = ys6.l();
        k(jArr, l);
        while (true) {
            o(l, jArr2);
            i--;
            if (i > 0) {
                k(jArr2, l);
            } else {
                return;
            }
        }
    }

    public static int t(long[] jArr) {
        return ((int) jArr[0]) & 1;
    }
}
