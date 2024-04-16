package defpackage;
/* renamed from: mo7  reason: default package */
/* loaded from: classes3.dex */
public abstract class mo7 {
    public static void A(short s, byte[] bArr, int i) {
        bArr[i] = (byte) (s >>> 8);
        bArr[i + 1] = (byte) s;
    }

    public static void B(short s, byte[] bArr, int i) {
        bArr[i] = (byte) s;
        bArr[i + 1] = (byte) (s >>> 8);
    }

    public static int a(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | (bArr[i] << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    public static void b(byte[] bArr, int i, int[] iArr, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            iArr[i2 + i4] = a(bArr, i);
            i += 4;
        }
    }

    public static long c(byte[] bArr, int i) {
        int a = a(bArr, i);
        return (a(bArr, i + 4) & 4294967295L) | ((a & 4294967295L) << 32);
    }

    public static void d(byte[] bArr, int i, long[] jArr, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            jArr[i2 + i4] = c(bArr, i);
            i += 8;
        }
    }

    public static short e(byte[] bArr, int i) {
        return (short) ((bArr[i + 1] & 255) | ((bArr[i] & 255) << 8));
    }

    public static void f(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) (i >>> 24);
        bArr[i2 + 1] = (byte) (i >>> 16);
        bArr[i2 + 2] = (byte) (i >>> 8);
        bArr[i2 + 3] = (byte) i;
    }

    public static void g(int[] iArr, byte[] bArr, int i) {
        for (int i2 : iArr) {
            f(i2, bArr, i);
            i += 4;
        }
    }

    public static byte[] h(int i) {
        byte[] bArr = new byte[4];
        f(i, bArr, 0);
        return bArr;
    }

    public static void i(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >>> 8);
        bArr[i2 + 2] = (byte) (i >>> 16);
        bArr[i2 + 3] = (byte) (i >>> 24);
    }

    public static void j(int[] iArr, byte[] bArr, int i) {
        for (int i2 : iArr) {
            i(i2, bArr, i);
            i += 4;
        }
    }

    public static byte[] k(int i) {
        byte[] bArr = new byte[4];
        i(i, bArr, 0);
        return bArr;
    }

    public static int l(byte[] bArr, int i) {
        return (bArr[i + 3] << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public static void m(byte[] bArr, int i, int[] iArr) {
        for (int i2 = 0; i2 < iArr.length; i2++) {
            iArr[i2] = l(bArr, i);
            i += 4;
        }
    }

    public static void n(byte[] bArr, int i, int[] iArr, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            iArr[i2 + i4] = l(bArr, i);
            i += 4;
        }
    }

    public static int[] o(byte[] bArr, int i, int i2) {
        int[] iArr = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            iArr[i3] = l(bArr, i);
            i += 4;
        }
        return iArr;
    }

    public static long p(byte[] bArr, int i) {
        return ((l(bArr, i + 4) & 4294967295L) << 32) | (l(bArr, i) & 4294967295L);
    }

    public static void q(byte[] bArr, int i, long[] jArr) {
        for (int i2 = 0; i2 < jArr.length; i2++) {
            jArr[i2] = p(bArr, i);
            i += 8;
        }
    }

    public static short r(byte[] bArr, int i) {
        return (short) (((bArr[i + 1] & 255) << 8) | (bArr[i] & 255));
    }

    public static void s(long j, byte[] bArr, int i) {
        f((int) (j >>> 32), bArr, i);
        f((int) (j & 4294967295L), bArr, i + 4);
    }

    public static void t(long[] jArr, int i, int i2, byte[] bArr, int i3) {
        for (int i4 = 0; i4 < i2; i4++) {
            s(jArr[i + i4], bArr, i3);
            i3 += 8;
        }
    }

    public static byte[] u(long j) {
        byte[] bArr = new byte[8];
        s(j, bArr, 0);
        return bArr;
    }

    public static void v(long j, byte[] bArr, int i) {
        i((int) (4294967295L & j), bArr, i);
        i((int) (j >>> 32), bArr, i + 4);
    }

    public static void w(long[] jArr, int i, int i2, byte[] bArr, int i3) {
        for (int i4 = 0; i4 < i2; i4++) {
            v(jArr[i + i4], bArr, i3);
            i3 += 8;
        }
    }

    public static void x(long[] jArr, byte[] bArr, int i) {
        for (long j : jArr) {
            v(j, bArr, i);
            i += 8;
        }
    }

    public static byte[] y(long j) {
        byte[] bArr = new byte[8];
        v(j, bArr, 0);
        return bArr;
    }

    public static byte[] z(long[] jArr) {
        byte[] bArr = new byte[jArr.length * 8];
        x(jArr, bArr, 0);
        return bArr;
    }
}
