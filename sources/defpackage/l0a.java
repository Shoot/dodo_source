package defpackage;

import java.math.BigInteger;
/* renamed from: l0a  reason: default package */
/* loaded from: classes3.dex */
public class l0a {
    public static void a(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr2[1] ^ jArr[1];
    }

    public static void b(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr2[3] ^ jArr[3];
    }

    public static void c(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0] ^ 1;
        jArr2[1] = jArr[1];
    }

    private static void d(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr2[0] ^ jArr[0];
        jArr2[1] = jArr2[1] ^ jArr[1];
    }

    public static long[] e(BigInteger bigInteger) {
        return et6.s(113, bigInteger);
    }

    public static void f(long[] jArr, long[] jArr2) {
        long[] i = us6.i();
        us6.e(jArr, jArr2);
        for (int i2 = 1; i2 < 113; i2 += 2) {
            i(jArr2, i);
            m(i, jArr2);
            i(jArr2, i);
            m(i, jArr2);
            d(jArr, jArr2);
        }
    }

    protected static void g(long[] jArr, long[] jArr2, long[] jArr3) {
        long j = jArr[0];
        long j2 = ((jArr[1] << 7) ^ (j >>> 57)) & 144115188075855871L;
        long j3 = j & 144115188075855871L;
        long j4 = jArr2[0];
        long j5 = ((jArr2[1] << 7) ^ (j4 >>> 57)) & 144115188075855871L;
        long j6 = j4 & 144115188075855871L;
        long[] jArr4 = new long[6];
        h(jArr3, j3, j6, jArr4, 0);
        h(jArr3, j2, j5, jArr4, 2);
        h(jArr3, j3 ^ j2, j6 ^ j5, jArr4, 4);
        long j7 = jArr4[1] ^ jArr4[2];
        long j8 = jArr4[0];
        long j9 = jArr4[3];
        long j10 = (jArr4[4] ^ j8) ^ j7;
        long j11 = j7 ^ (jArr4[5] ^ j9);
        jArr3[0] = j8 ^ (j10 << 57);
        jArr3[1] = (j10 >>> 7) ^ (j11 << 50);
        jArr3[2] = (j11 >>> 14) ^ (j9 << 43);
        jArr3[3] = j9 >>> 21;
    }

    protected static void h(long[] jArr, long j, long j2, long[] jArr2, int i) {
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
        long j7 = jArr[((int) j) & 7];
        long j8 = 0;
        int i2 = 48;
        do {
            int i3 = (int) (j >>> i2);
            long j9 = (jArr[(i3 >>> 6) & 7] << 6) ^ (jArr[i3 & 7] ^ (jArr[(i3 >>> 3) & 7] << 3));
            j7 ^= j9 << i2;
            j8 ^= j9 >>> (-i2);
            i2 -= 9;
        } while (i2 > 0);
        jArr2[i] = 144115188075855871L & j7;
        jArr2[i + 1] = (((((j & 72198606942111744L) & ((j2 << 7) >> 63)) >>> 8) ^ j8) << 7) ^ (j7 >>> 57);
    }

    protected static void i(long[] jArr, long[] jArr2) {
        l65.c(jArr, 0, 2, jArr2, 0);
    }

    public static void j(long[] jArr, long[] jArr2) {
        if (!us6.r(jArr)) {
            long[] g = us6.g();
            long[] g2 = us6.g();
            o(jArr, g);
            k(g, jArr, g);
            o(g, g);
            k(g, jArr, g);
            q(g, 3, g2);
            k(g2, g, g2);
            o(g2, g2);
            k(g2, jArr, g2);
            q(g2, 7, g);
            k(g, g2, g);
            q(g, 14, g2);
            k(g2, g, g2);
            q(g2, 28, g);
            k(g, g2, g);
            q(g, 56, g2);
            k(g2, g, g2);
            o(g2, jArr2);
            return;
        }
        throw new IllegalStateException();
    }

    public static void k(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[8];
        g(jArr, jArr2, jArr4);
        m(jArr4, jArr3);
    }

    public static void l(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[8];
        g(jArr, jArr2, jArr4);
        b(jArr3, jArr4, jArr3);
    }

    public static void m(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = j3 ^ ((j4 >>> 40) ^ (j4 >>> 49));
        long j6 = j ^ ((j5 << 15) ^ (j5 << 24));
        long j7 = (j2 ^ ((j4 << 15) ^ (j4 << 24))) ^ ((j5 >>> 40) ^ (j5 >>> 49));
        long j8 = j7 >>> 49;
        jArr2[0] = (j6 ^ j8) ^ (j8 << 9);
        jArr2[1] = 562949953421311L & j7;
    }

    public static void n(long[] jArr, long[] jArr2) {
        long g = l65.g(jArr[0]);
        long g2 = l65.g(jArr[1]);
        long j = (g >>> 32) | (g2 & (-4294967296L));
        jArr2[0] = ((j << 57) ^ ((4294967295L & g) | (g2 << 32))) ^ (j << 5);
        jArr2[1] = (j >>> 59) ^ (j >>> 7);
    }

    public static void o(long[] jArr, long[] jArr2) {
        long[] i = us6.i();
        i(jArr, i);
        m(i, jArr2);
    }

    public static void p(long[] jArr, long[] jArr2) {
        long[] i = us6.i();
        i(jArr, i);
        b(jArr2, i, jArr2);
    }

    public static void q(long[] jArr, int i, long[] jArr2) {
        long[] i2 = us6.i();
        i(jArr, i2);
        while (true) {
            m(i2, jArr2);
            i--;
            if (i > 0) {
                i(jArr2, i2);
            } else {
                return;
            }
        }
    }

    public static int r(long[] jArr) {
        return ((int) jArr[0]) & 1;
    }
}
