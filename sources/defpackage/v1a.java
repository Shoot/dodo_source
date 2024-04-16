package defpackage;

import java.math.BigInteger;
/* renamed from: v1a  reason: default package */
/* loaded from: classes3.dex */
public class v1a {
    private static final long[] a = {878416384462358536L, 3513665537849438403L, -9076969306111048948L, 585610922974906400L, 34087042};

    public static void a(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr2[4] ^ jArr[4];
    }

    public static void b(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr[4] ^ jArr2[4];
        jArr3[5] = jArr[5] ^ jArr2[5];
        jArr3[6] = jArr[6] ^ jArr2[6];
        jArr3[7] = jArr[7] ^ jArr2[7];
        jArr3[8] = jArr2[8] ^ jArr[8];
    }

    public static void c(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0] ^ 1;
        jArr2[1] = jArr[1];
        jArr2[2] = jArr[2];
        jArr2[3] = jArr[3];
        jArr2[4] = jArr[4];
    }

    private static void d(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr2[0] ^ jArr[0];
        jArr2[1] = jArr2[1] ^ jArr[1];
        jArr2[2] = jArr2[2] ^ jArr[2];
        jArr2[3] = jArr2[3] ^ jArr[3];
        jArr2[4] = jArr2[4] ^ jArr[4];
    }

    public static long[] e(BigInteger bigInteger) {
        return et6.s(283, bigInteger);
    }

    public static void f(long[] jArr, long[] jArr2) {
        long[] l = et6.l(9);
        zs6.b(jArr, jArr2);
        for (int i = 1; i < 283; i += 2) {
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
        long j9 = jArr[8];
        long j10 = jArr[9];
        jArr[0] = j ^ (j2 << 57);
        jArr[1] = (j2 >>> 7) ^ (j3 << 50);
        jArr[2] = (j3 >>> 14) ^ (j4 << 43);
        jArr[3] = (j4 >>> 21) ^ (j5 << 36);
        jArr[4] = (j5 >>> 28) ^ (j6 << 29);
        jArr[5] = (j6 >>> 35) ^ (j7 << 22);
        jArr[6] = (j7 >>> 42) ^ (j8 << 15);
        jArr[7] = (j8 >>> 49) ^ (j9 << 8);
        jArr[8] = (j9 >>> 56) ^ (j10 << 1);
        jArr[9] = j10 >>> 63;
    }

    protected static void h(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        jArr2[0] = j & 144115188075855871L;
        jArr2[1] = ((j >>> 57) ^ (j2 << 7)) & 144115188075855871L;
        jArr2[2] = ((j2 >>> 50) ^ (j3 << 14)) & 144115188075855871L;
        jArr2[3] = ((j3 >>> 43) ^ (j4 << 21)) & 144115188075855871L;
        jArr2[4] = (j4 >>> 36) ^ (j5 << 28);
    }

    protected static void i(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[5];
        long[] jArr5 = new long[5];
        h(jArr, jArr4);
        h(jArr2, jArr5);
        long[] jArr6 = new long[26];
        j(jArr3, jArr4[0], jArr5[0], jArr6, 0);
        j(jArr3, jArr4[1], jArr5[1], jArr6, 2);
        j(jArr3, jArr4[2], jArr5[2], jArr6, 4);
        j(jArr3, jArr4[3], jArr5[3], jArr6, 6);
        j(jArr3, jArr4[4], jArr5[4], jArr6, 8);
        long j = jArr4[0];
        long j2 = j ^ jArr4[1];
        long j3 = jArr5[0];
        long j4 = j3 ^ jArr5[1];
        long j5 = jArr4[2];
        long j6 = j ^ j5;
        long j7 = jArr5[2];
        long j8 = j3 ^ j7;
        long j9 = jArr4[4];
        long j10 = j5 ^ j9;
        long j11 = jArr5[4];
        long j12 = j7 ^ j11;
        long j13 = jArr4[3];
        long j14 = j13 ^ j9;
        long j15 = jArr5[3];
        long j16 = j15 ^ j11;
        j(jArr3, j6 ^ j13, j8 ^ j15, jArr6, 18);
        j(jArr3, j10 ^ jArr4[1], j12 ^ jArr5[1], jArr6, 20);
        long j17 = j2 ^ j14;
        long j18 = j4 ^ j16;
        j(jArr3, j17, j18, jArr6, 22);
        j(jArr3, j17 ^ jArr4[2], j18 ^ jArr5[2], jArr6, 24);
        j(jArr3, j2, j4, jArr6, 10);
        j(jArr3, j6, j8, jArr6, 12);
        j(jArr3, j10, j12, jArr6, 14);
        j(jArr3, j14, j16, jArr6, 16);
        jArr3[0] = jArr6[0];
        jArr3[9] = jArr6[9];
        long j19 = jArr6[0];
        long j20 = jArr6[1] ^ j19;
        long j21 = jArr6[2] ^ j20;
        long j22 = jArr6[10] ^ j21;
        jArr3[1] = j22;
        long j23 = jArr6[3] ^ jArr6[4];
        long j24 = j21 ^ (j23 ^ (jArr6[11] ^ jArr6[12]));
        jArr3[2] = j24;
        long j25 = j20 ^ j23;
        long j26 = jArr6[5] ^ jArr6[6];
        long j27 = jArr6[8];
        long j28 = (j25 ^ j26) ^ j27;
        long j29 = jArr6[13] ^ jArr6[14];
        long j30 = jArr6[18];
        long j31 = jArr6[22];
        long j32 = jArr6[24];
        jArr3[3] = (j28 ^ j29) ^ ((j30 ^ j31) ^ j32);
        long j33 = jArr6[7] ^ j27;
        long j34 = jArr6[9];
        long j35 = j33 ^ j34;
        long j36 = j35 ^ jArr6[17];
        jArr3[8] = j36;
        long j37 = (j35 ^ j26) ^ (jArr6[15] ^ jArr6[16]);
        jArr3[7] = j37;
        long j38 = j22 ^ j37;
        long j39 = jArr6[19] ^ jArr6[20];
        long j40 = jArr6[25];
        long j41 = jArr6[23];
        long j42 = j39 ^ (j40 ^ j32);
        jArr3[4] = (j42 ^ (j30 ^ j41)) ^ j38;
        long j43 = jArr6[21];
        jArr3[5] = ((j24 ^ j36) ^ j42) ^ (j43 ^ j31);
        jArr3[6] = (((((j28 ^ j19) ^ j34) ^ j29) ^ j43) ^ j41) ^ j40;
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

    protected static void k(long[] jArr, long[] jArr2) {
        l65.c(jArr, 0, 4, jArr2, 0);
        jArr2[8] = l65.a((int) jArr[4]);
    }

    public static void l(long[] jArr, long[] jArr2) {
        if (!zs6.g(jArr)) {
            long[] c = zs6.c();
            long[] c2 = zs6.c();
            q(jArr, c);
            m(c, jArr, c);
            s(c, 2, c2);
            m(c2, c, c2);
            s(c2, 4, c);
            m(c, c2, c);
            s(c, 8, c2);
            m(c2, c, c2);
            q(c2, c2);
            m(c2, jArr, c2);
            s(c2, 17, c);
            m(c, c2, c);
            q(c, c);
            m(c, jArr, c);
            s(c, 35, c2);
            m(c2, c, c2);
            s(c2, 70, c);
            m(c, c2, c);
            q(c, c);
            m(c, jArr, c);
            s(c, 141, c2);
            m(c2, c, c2);
            q(c2, jArr2);
            return;
        }
        throw new IllegalStateException();
    }

    public static void m(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] d = zs6.d();
        i(jArr, jArr2, d);
        o(d, jArr3);
    }

    public static void n(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] d = zs6.d();
        i(jArr, jArr2, d);
        b(jArr3, d, jArr3);
    }

    public static void o(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        long j6 = jArr[5];
        long j7 = jArr[6];
        long j8 = jArr[7];
        long j9 = jArr[8];
        long j10 = j5 ^ ((((j9 >>> 27) ^ (j9 >>> 22)) ^ (j9 >>> 20)) ^ (j9 >>> 15));
        long j11 = j ^ ((((j6 << 37) ^ (j6 << 42)) ^ (j6 << 44)) ^ (j6 << 49));
        long j12 = (j2 ^ ((((j7 << 37) ^ (j7 << 42)) ^ (j7 << 44)) ^ (j7 << 49))) ^ ((((j6 >>> 27) ^ (j6 >>> 22)) ^ (j6 >>> 20)) ^ (j6 >>> 15));
        long j13 = j10 >>> 27;
        jArr2[0] = (((j11 ^ j13) ^ (j13 << 5)) ^ (j13 << 7)) ^ (j13 << 12);
        jArr2[1] = j12;
        jArr2[2] = (j3 ^ ((((j8 << 37) ^ (j8 << 42)) ^ (j8 << 44)) ^ (j8 << 49))) ^ ((((j7 >>> 27) ^ (j7 >>> 22)) ^ (j7 >>> 20)) ^ (j7 >>> 15));
        jArr2[3] = (j4 ^ ((((j9 << 37) ^ (j9 << 42)) ^ (j9 << 44)) ^ (j9 << 49))) ^ ((((j8 >>> 27) ^ (j8 >>> 22)) ^ (j8 >>> 20)) ^ (j8 >>> 15));
        jArr2[4] = 134217727 & j10;
    }

    public static void p(long[] jArr, long[] jArr2) {
        long[] c = zs6.c();
        long g = l65.g(jArr[0]);
        long g2 = l65.g(jArr[1]);
        long j = (g & 4294967295L) | (g2 << 32);
        c[0] = (g >>> 32) | (g2 & (-4294967296L));
        long g3 = l65.g(jArr[2]);
        long g4 = l65.g(jArr[3]);
        c[1] = (g3 >>> 32) | ((-4294967296L) & g4);
        long g5 = l65.g(jArr[4]);
        c[2] = g5 >>> 32;
        m(c, a, jArr2);
        jArr2[0] = jArr2[0] ^ j;
        jArr2[1] = jArr2[1] ^ ((g3 & 4294967295L) | (g4 << 32));
        jArr2[2] = jArr2[2] ^ (4294967295L & g5);
    }

    public static void q(long[] jArr, long[] jArr2) {
        long[] l = et6.l(9);
        k(jArr, l);
        o(l, jArr2);
    }

    public static void r(long[] jArr, long[] jArr2) {
        long[] l = et6.l(9);
        k(jArr, l);
        b(jArr2, l, jArr2);
    }

    public static void s(long[] jArr, int i, long[] jArr2) {
        long[] l = et6.l(9);
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
        return ((int) (jArr[0] ^ (jArr[4] >>> 15))) & 1;
    }
}
