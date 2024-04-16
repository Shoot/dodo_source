package defpackage;

import java.security.SecureRandom;
/* renamed from: f9c  reason: default package */
/* loaded from: classes3.dex */
public abstract class f9c {

    /* renamed from: f9c$a */
    /* loaded from: classes3.dex */
    public static class a {
        private static final a a = new a();

        private a() {
        }
    }

    public static boolean a(byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3, int i3) {
        g(bArr, i, bArr2, i2, bArr3, i3);
        return !tr.a(bArr3, i3, 32);
    }

    private static int b(byte[] bArr, int i) {
        return (bArr[i + 3] << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    private static void c(byte[] bArr, int i, int[] iArr) {
        for (int i2 = 0; i2 < 8; i2++) {
            iArr[i2] = b(bArr, (i2 * 4) + i);
        }
        iArr[0] = iArr[0] & (-8);
        int i3 = iArr[7] & Integer.MAX_VALUE;
        iArr[7] = i3;
        iArr[7] = i3 | 1073741824;
    }

    public static void d(SecureRandom secureRandom, byte[] bArr) {
        secureRandom.nextBytes(bArr);
        bArr[0] = (byte) (bArr[0] & 248);
        byte b = (byte) (bArr[31] & Byte.MAX_VALUE);
        bArr[31] = b;
        bArr[31] = (byte) (b | 64);
    }

    public static void e(byte[] bArr, int i, byte[] bArr2, int i2) {
        h(bArr, i, bArr2, i2);
    }

    private static void f(int[] iArr, int[] iArr2) {
        int[] h = h9c.h();
        int[] h2 = h9c.h();
        h9c.c(iArr, iArr2, h, h2);
        h9c.G(h, h);
        h9c.G(h2, h2);
        h9c.z(h, h2, iArr);
        h9c.I(h, h2, h);
        h9c.y(h, 121666, iArr2);
        h9c.a(iArr2, h2, iArr2);
        h9c.z(iArr2, h, iArr2);
    }

    public static void g(byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3, int i3) {
        int[] iArr = new int[8];
        c(bArr, i, iArr);
        int[] h = h9c.h();
        h9c.k(bArr2, i2, h);
        int[] h2 = h9c.h();
        h9c.g(h, 0, h2, 0);
        int[] h3 = h9c.h();
        h3[0] = 1;
        int[] h4 = h9c.h();
        h4[0] = 1;
        int[] h5 = h9c.h();
        int[] h6 = h9c.h();
        int[] h7 = h9c.h();
        int i4 = 254;
        int i5 = 1;
        while (true) {
            h9c.c(h4, h5, h6, h4);
            h9c.c(h2, h3, h5, h2);
            h9c.z(h6, h2, h6);
            h9c.z(h4, h5, h4);
            h9c.G(h5, h5);
            h9c.G(h2, h2);
            h9c.I(h5, h2, h7);
            h9c.y(h7, 121666, h3);
            h9c.a(h3, h2, h3);
            h9c.z(h3, h7, h3);
            h9c.z(h2, h5, h2);
            h9c.c(h6, h4, h4, h5);
            h9c.G(h4, h4);
            h9c.G(h5, h5);
            h9c.z(h5, h, h5);
            i4--;
            int i6 = (iArr[i4 >>> 5] >>> (i4 & 31)) & 1;
            int i7 = i5 ^ i6;
            h9c.j(i7, h2, h4);
            h9c.j(i7, h3, h5);
            if (i4 < 3) {
                break;
            }
            i5 = i6;
        }
        for (int i8 = 0; i8 < 3; i8++) {
            f(h2, h3);
        }
        h9c.u(h3, h3);
        h9c.z(h2, h3, h2);
        h9c.B(h2);
        h9c.p(h2, bArr3, i3);
    }

    public static void h(byte[] bArr, int i, byte[] bArr2, int i2) {
        int[] h = h9c.h();
        int[] h2 = h9c.h();
        ic3.R(a.a, bArr, i, h, h2);
        h9c.c(h2, h, h, h2);
        h9c.u(h2, h2);
        h9c.z(h, h2, h);
        h9c.B(h);
        h9c.p(h, bArr2, i2);
    }
}
