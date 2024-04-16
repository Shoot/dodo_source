package defpackage;

import java.math.BigInteger;
/* renamed from: r1a  reason: default package */
/* loaded from: classes3.dex */
public class r1a {
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
        jArr3[6] = jArr[6] ^ jArr2[6];
        jArr3[7] = jArr2[7] ^ jArr[7];
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
        return et6.s(239, bigInteger);
    }

    public static void f(long[] jArr, long[] jArr2) {
        long[] l = ys6.l();
        ys6.h(jArr, jArr2);
        for (int i = 1; i < 239; i += 2) {
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
        jArr[0] = j ^ (j2 << 60);
        jArr[1] = (j2 >>> 4) ^ (j3 << 56);
        jArr[2] = (j3 >>> 8) ^ (j4 << 52);
        jArr[3] = (j4 >>> 12) ^ (j5 << 48);
        jArr[4] = (j5 >>> 16) ^ (j6 << 44);
        jArr[5] = (j6 >>> 20) ^ (j7 << 40);
        jArr[6] = (j7 >>> 24) ^ (j8 << 36);
        jArr[7] = j8 >>> 28;
    }

    protected static void h(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        jArr2[0] = j & 1152921504606846975L;
        jArr2[1] = ((j >>> 60) ^ (j2 << 4)) & 1152921504606846975L;
        jArr2[2] = ((j2 >>> 56) ^ (j3 << 8)) & 1152921504606846975L;
        jArr2[3] = (j3 >>> 52) ^ (j4 << 12);
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
        int i3 = 54;
        do {
            int i4 = (int) (j >>> i3);
            long j9 = (jArr[(i4 >>> 3) & 7] << 3) ^ jArr[i4 & 7];
            j7 ^= j9 << i3;
            j8 ^= j9 >>> (-i3);
            i3 -= 6;
        } while (i3 > 0);
        jArr2[i] = jArr2[i] ^ (1152921504606846975L & j7);
        int i5 = i + 1;
        jArr2[i5] = ((((((j & 585610922974906400L) & ((j2 << 4) >> 63)) >>> 5) ^ j8) << 4) ^ (j7 >>> 60)) ^ jArr2[i5];
    }

    protected static void k(long[] jArr, long[] jArr2) {
        l65.c(jArr, 0, 4, jArr2, 0);
    }

    public static void l(long[] jArr, long[] jArr2) {
        if (!ys6.w(jArr)) {
            long[] j = ys6.j();
            long[] j2 = ys6.j();
            q(jArr, j);
            m(j, jArr, j);
            q(j, j);
            m(j, jArr, j);
            s(j, 3, j2);
            m(j2, j, j2);
            q(j2, j2);
            m(j2, jArr, j2);
            s(j2, 7, j);
            m(j, j2, j);
            s(j, 14, j2);
            m(j2, j, j2);
            q(j2, j2);
            m(j2, jArr, j2);
            s(j2, 29, j);
            m(j, j2, j);
            q(j, j);
            m(j, jArr, j);
            s(j, 59, j2);
            m(j2, j, j2);
            q(j2, j2);
            m(j2, jArr, j2);
            s(j2, 119, j);
            m(j, j2, j);
            q(j, jArr2);
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
        long j8 = jArr[7];
        long j9 = j7 ^ (j8 >>> 17);
        long j10 = (j6 ^ (j8 << 47)) ^ (j9 >>> 17);
        long j11 = ((j5 ^ (j8 >>> 47)) ^ (j9 << 47)) ^ (j10 >>> 17);
        long j12 = j ^ (j11 << 17);
        long j13 = (j2 ^ (j10 << 17)) ^ (j11 >>> 47);
        long j14 = (((j4 ^ (j8 << 17)) ^ (j9 >>> 47)) ^ (j10 << 47)) ^ (j11 >>> 17);
        long j15 = j14 >>> 47;
        jArr2[0] = j12 ^ j15;
        jArr2[1] = j13;
        long j16 = j15 << 30;
        jArr2[2] = j16 ^ (((j3 ^ (j9 << 17)) ^ (j10 >>> 47)) ^ (j11 << 47));
        jArr2[3] = 140737488355327L & j14;
    }

    public static void p(long[] jArr, long[] jArr2) {
        long g = l65.g(jArr[0]);
        long g2 = l65.g(jArr[1]);
        long j = (g & 4294967295L) | (g2 << 32);
        long j2 = (g >>> 32) | (g2 & (-4294967296L));
        int i = 2;
        long g3 = l65.g(jArr[2]);
        long g4 = l65.g(jArr[3]);
        long j3 = (g3 & 4294967295L) | (g4 << 32);
        long j4 = (g4 & (-4294967296L)) | (g3 >>> 32);
        long j5 = j4 >>> 49;
        long j6 = (j2 >>> 49) | (j4 << 15);
        long j7 = j4 ^ (j2 << 15);
        long[] l = ys6.l();
        int[] iArr = {39, 120};
        int i2 = 0;
        while (i2 < i) {
            int i3 = iArr[i2];
            int i4 = i3 >>> 6;
            int i5 = i3 & 63;
            l[i4] = l[i4] ^ (j2 << i5);
            int i6 = i4 + 1;
            int[] iArr2 = iArr;
            int i7 = -i5;
            l[i6] = l[i6] ^ ((j7 << i5) | (j2 >>> i7));
            int i8 = i4 + 2;
            l[i8] = l[i8] ^ ((j6 << i5) | (j7 >>> i7));
            int i9 = i4 + 3;
            l[i9] = l[i9] ^ ((j5 << i5) | (j6 >>> i7));
            int i10 = i4 + 4;
            l[i10] = l[i10] ^ (j5 >>> i7);
            i2++;
            i = 2;
            iArr = iArr2;
        }
        o(l, jArr2);
        jArr2[0] = jArr2[0] ^ j;
        jArr2[1] = jArr2[1] ^ j3;
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
        return ((int) ((jArr[0] ^ (jArr[1] >>> 17)) ^ (jArr[2] >>> 34))) & 1;
    }
}
