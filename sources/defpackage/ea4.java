package defpackage;
/* renamed from: ea4  reason: default package */
/* loaded from: classes3.dex */
public abstract class ea4 {
    public static byte a(byte[] bArr, byte[] bArr2) {
        int i = 0;
        for (int i2 = 0; i2 < 16; i2++) {
            i |= bArr[i2] ^ bArr2[i2];
        }
        return (byte) ((((i >>> 1) | (i & 1)) - 1) >> 31);
    }

    public static void b(long[] jArr, byte[] bArr) {
        mo7.t(jArr, 0, 2, bArr, 0);
    }

    public static void c(byte[] bArr, long[] jArr) {
        mo7.d(bArr, 0, jArr, 0, 2);
    }

    public static long[] d(byte[] bArr) {
        long[] jArr = new long[2];
        mo7.d(bArr, 0, jArr, 0, 2);
        return jArr;
    }

    public static void e(byte[] bArr, byte[] bArr2) {
        for (int i = 0; i < 16; i++) {
            bArr2[i] = bArr[i];
        }
    }

    public static void f(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0];
        jArr2[1] = jArr[1];
    }

    public static void g(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = j >> 63;
        jArr2[0] = ((j ^ ((-2233785415175766016L) & j3)) << 1) | (j2 >>> 63);
        jArr2[1] = (j2 << 1) | (-j3);
    }

    private static long h(long j, long j2) {
        long j3 = j & 1229782938247303441L;
        long j4 = j & 2459565876494606882L;
        long j5 = j & 4919131752989213764L;
        long j6 = j & (-8608480567731124088L);
        long j7 = j2 & 1229782938247303441L;
        long j8 = j2 & 2459565876494606882L;
        long j9 = j2 & 4919131752989213764L;
        long j10 = j2 & (-8608480567731124088L);
        return (((((j3 * j7) ^ (j4 * j10)) ^ (j5 * j9)) ^ (j6 * j8)) & 1229782938247303441L) | (((((j3 * j8) ^ (j4 * j7)) ^ (j5 * j10)) ^ (j6 * j9)) & 2459565876494606882L) | (((((j3 * j9) ^ (j4 * j8)) ^ (j5 * j7)) ^ (j6 * j10)) & 4919131752989213764L) | (((((j3 * j10) ^ (j4 * j9)) ^ (j5 * j8)) ^ (j6 * j7)) & (-8608480567731124088L));
    }

    public static void i(byte[] bArr, byte[] bArr2) {
        long[] d = d(bArr);
        j(d, d(bArr2));
        b(d, bArr);
    }

    public static void j(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr2[0];
        long j4 = jArr2[1];
        long a = qy5.a(j);
        long a2 = qy5.a(j2);
        long a3 = qy5.a(j3);
        long a4 = qy5.a(j4);
        long a5 = qy5.a(h(a, a3));
        long h = h(j, j3) << 1;
        long a6 = qy5.a(h(a2, a4));
        long h2 = h(j2, j4);
        long j5 = h2 << 1;
        long h3 = ((h(j ^ j2, j3 ^ j4) << 1) ^ ((a6 ^ h) ^ j5)) ^ ((h2 << 63) ^ (h2 << 58));
        long j6 = h3 >>> 2;
        long j7 = (h3 << 57) ^ ((h3 << 63) ^ (h3 << 62));
        jArr[0] = a5 ^ ((j6 ^ ((h3 >>> 1) ^ h3)) ^ (h3 >>> 7));
        jArr[1] = j7 ^ ((qy5.a(h(a ^ a2, a3 ^ a4)) ^ ((h ^ a5) ^ a6)) ^ (((j5 ^ (j5 >>> 1)) ^ (j5 >>> 2)) ^ (j5 >>> 7)));
    }

    public static void k(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = j2 << 57;
        jArr2[0] = (j3 >>> 7) ^ ((((j >>> 7) ^ j3) ^ (j3 >>> 1)) ^ (j3 >>> 2));
        jArr2[1] = (j << 57) | (j2 >>> 7);
    }

    public static long[] l() {
        return new long[]{Long.MIN_VALUE};
    }

    public static void m(long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[4];
        l65.d(jArr[0], jArr3, 0);
        l65.d(jArr[1], jArr3, 2);
        long j = jArr3[0];
        long j2 = jArr3[1];
        long j3 = jArr3[2];
        long j4 = jArr3[3];
        long j5 = j3 ^ ((j4 << 57) ^ ((j4 << 63) ^ (j4 << 62)));
        long j6 = j ^ ((((j5 >>> 1) ^ j5) ^ (j5 >>> 2)) ^ (j5 >>> 7));
        jArr2[0] = j6;
        jArr2[1] = (j2 ^ ((((j4 >>> 1) ^ j4) ^ (j4 >>> 2)) ^ (j4 >>> 7))) ^ ((j5 << 57) ^ ((j5 << 63) ^ (j5 << 62)));
    }

    public static void n(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        while (true) {
            i3--;
            if (i3 >= 0) {
                int i4 = i + i3;
                bArr[i4] = (byte) (bArr[i4] ^ bArr2[i2 + i3]);
            } else {
                return;
            }
        }
    }

    public static void o(byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3, int i3) {
        int i4 = 0;
        do {
            bArr3[i3 + i4] = (byte) (bArr[i + i4] ^ bArr2[i2 + i4]);
            int i5 = i4 + 1;
            bArr3[i3 + i5] = (byte) (bArr2[i5 + i2] ^ bArr[i + i5]);
            int i6 = i4 + 2;
            bArr3[i3 + i6] = (byte) (bArr2[i6 + i2] ^ bArr[i + i6]);
            int i7 = i4 + 3;
            bArr3[i3 + i7] = (byte) (bArr2[i7 + i2] ^ bArr[i + i7]);
            i4 += 4;
        } while (i4 < 16);
    }

    public static void p(byte[] bArr, byte[] bArr2) {
        int i = 0;
        do {
            bArr[i] = (byte) (bArr[i] ^ bArr2[i]);
            int i2 = i + 1;
            bArr[i2] = (byte) (bArr[i2] ^ bArr2[i2]);
            int i3 = i + 2;
            bArr[i3] = (byte) (bArr[i3] ^ bArr2[i3]);
            int i4 = i + 3;
            bArr[i4] = (byte) (bArr[i4] ^ bArr2[i4]);
            i += 4;
        } while (i < 16);
    }

    public static void q(byte[] bArr, byte[] bArr2, int i) {
        int i2 = 0;
        do {
            bArr[i2] = (byte) (bArr[i2] ^ bArr2[i + i2]);
            int i3 = i2 + 1;
            bArr[i3] = (byte) (bArr[i3] ^ bArr2[i + i3]);
            int i4 = i2 + 2;
            bArr[i4] = (byte) (bArr[i4] ^ bArr2[i + i4]);
            int i5 = i2 + 3;
            bArr[i5] = (byte) (bArr[i5] ^ bArr2[i + i5]);
            i2 += 4;
        } while (i2 < 16);
    }

    public static void r(byte[] bArr, byte[] bArr2, int i, int i2) {
        while (true) {
            i2--;
            if (i2 >= 0) {
                bArr[i2] = (byte) (bArr[i2] ^ bArr2[i + i2]);
            } else {
                return;
            }
        }
    }

    public static void s(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr2[1] ^ jArr[1];
    }
}
