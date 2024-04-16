package defpackage;

import java.security.SecureRandom;
/* renamed from: m9c  reason: default package */
/* loaded from: classes3.dex */
public abstract class m9c {

    /* renamed from: m9c$a */
    /* loaded from: classes3.dex */
    public static class a {
        private static final a a = new a();

        private a() {
        }
    }

    public static boolean a(byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3, int i3) {
        g(bArr, i, bArr2, i2, bArr3, i3);
        return !tr.a(bArr3, i3, 56);
    }

    private static int b(byte[] bArr, int i) {
        return (bArr[i + 3] << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    private static void c(byte[] bArr, int i, int[] iArr) {
        for (int i2 = 0; i2 < 14; i2++) {
            iArr[i2] = b(bArr, (i2 * 4) + i);
        }
        iArr[0] = iArr[0] & (-4);
        iArr[13] = iArr[13] | Integer.MIN_VALUE;
    }

    public static void d(SecureRandom secureRandom, byte[] bArr) {
        secureRandom.nextBytes(bArr);
        bArr[0] = (byte) (bArr[0] & 252);
        bArr[55] = (byte) (bArr[55] | 128);
    }

    public static void e(byte[] bArr, int i, byte[] bArr2, int i2) {
        h(bArr, i, bArr2, i2);
    }

    private static void f(int[] iArr, int[] iArr2) {
        int[] g = o9c.g();
        int[] g2 = o9c.g();
        o9c.a(iArr, iArr2, g);
        o9c.J(iArr, iArr2, g2);
        o9c.H(g, g);
        o9c.H(g2, g2);
        o9c.A(g, g2, iArr);
        o9c.J(g, g2, g);
        o9c.z(g, 39082, iArr2);
        o9c.a(iArr2, g2, iArr2);
        o9c.A(iArr2, g, iArr2);
    }

    public static void g(byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3, int i3) {
        int[] iArr = new int[14];
        c(bArr, i, iArr);
        int[] g = o9c.g();
        o9c.j(bArr2, i2, g);
        int[] g2 = o9c.g();
        o9c.f(g, 0, g2, 0);
        int[] g3 = o9c.g();
        g3[0] = 1;
        int[] g4 = o9c.g();
        g4[0] = 1;
        int[] g5 = o9c.g();
        int[] g6 = o9c.g();
        int[] g7 = o9c.g();
        int i4 = 447;
        int i5 = 1;
        while (true) {
            o9c.a(g4, g5, g6);
            o9c.J(g4, g5, g4);
            o9c.a(g2, g3, g5);
            o9c.J(g2, g3, g2);
            o9c.A(g6, g2, g6);
            o9c.A(g4, g5, g4);
            o9c.H(g5, g5);
            o9c.H(g2, g2);
            o9c.J(g5, g2, g7);
            o9c.z(g7, 39082, g3);
            o9c.a(g3, g2, g3);
            o9c.A(g3, g7, g3);
            o9c.A(g2, g5, g2);
            o9c.J(g6, g4, g5);
            o9c.a(g6, g4, g4);
            o9c.H(g4, g4);
            o9c.H(g5, g5);
            o9c.A(g5, g, g5);
            i4--;
            int i6 = (iArr[i4 >>> 5] >>> (i4 & 31)) & 1;
            int i7 = i5 ^ i6;
            o9c.i(i7, g2, g4);
            o9c.i(i7, g3, g5);
            if (i4 < 2) {
                break;
            }
            i5 = i6;
        }
        for (int i8 = 0; i8 < 2; i8++) {
            f(g2, g3);
        }
        o9c.v(g3, g3);
        o9c.A(g2, g3, g2);
        o9c.C(g2);
        o9c.p(g2, bArr3, i3);
    }

    public static void h(byte[] bArr, int i, byte[] bArr2, int i2) {
        int[] g = o9c.g();
        int[] g2 = o9c.g();
        oc3.N(a.a, bArr, i, g, g2);
        o9c.v(g, g);
        o9c.A(g, g2, g);
        o9c.H(g, g);
        o9c.C(g);
        o9c.p(g, bArr2, i2);
    }
}
