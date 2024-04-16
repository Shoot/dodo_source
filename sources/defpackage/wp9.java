package defpackage;
/* renamed from: wp9  reason: default package */
/* loaded from: classes3.dex */
public class wp9 {
    private static void a(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int i) {
        System.arraycopy(iArr, iArr.length - 16, iArr2, 0, 16);
        int length = iArr.length >>> 1;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = i * 2; i4 > 0; i4--) {
            h(iArr2, iArr, i2, iArr3);
            ct9.h(8, iArr3, iArr2);
            System.arraycopy(iArr2, 0, iArr4, i3, 16);
            i3 = (length + i2) - i3;
            i2 += 16;
        }
    }

    private static void b(byte[] bArr) {
        if (bArr != null) {
            tr.y(bArr, (byte) 0);
        }
    }

    private static void c(int[] iArr) {
        if (iArr != null) {
            tr.B(iArr, 0);
        }
    }

    private static void d(int[][] iArr) {
        for (int[] iArr2 : iArr) {
            c(iArr2);
        }
    }

    private static byte[] e(byte[] bArr, byte[] bArr2, int i, int i2, int i3, int i4) {
        int i5 = i2 * 128;
        byte[] g = g(bArr, bArr2, i3 * i5);
        int[] iArr = null;
        try {
            int length = g.length >>> 2;
            iArr = new int[length];
            mo7.m(g, 0, iArr);
            int i6 = 0;
            for (int i7 = i * i2; i - i6 > 2 && i7 > 1024; i7 >>>= 1) {
                i6++;
            }
            int i8 = i5 >>> 2;
            for (int i9 = 0; i9 < length; i9 += i8) {
                f(iArr, i9, i, i6, i2);
            }
            mo7.j(iArr, g, 0);
            byte[] g2 = g(bArr, g, i4);
            b(g);
            c(iArr);
            return g2;
        } catch (Throwable th) {
            b(g);
            c(iArr);
            throw th;
        }
    }

    private static void f(int[] iArr, int i, int i2, int i3, int i4) {
        int i5 = i2 >>> i3;
        int i6 = 1 << i3;
        int i7 = i5 - 1;
        int b = g65.b(i2) - i3;
        int i8 = i4 * 32;
        int[] iArr2 = new int[16];
        int[] iArr3 = new int[16];
        int[] iArr4 = new int[i8];
        int[] iArr5 = new int[i8];
        int[][] iArr6 = new int[i6];
        try {
            System.arraycopy(iArr, i, iArr5, 0, i8);
            int i9 = 0;
            while (i9 < i6) {
                int[] iArr7 = new int[i5 * i8];
                iArr6[i9] = iArr7;
                int i10 = i6;
                int i11 = 0;
                int i12 = 0;
                while (i12 < i5) {
                    System.arraycopy(iArr5, 0, iArr7, i11, i8);
                    int i13 = i11 + i8;
                    a(iArr5, iArr2, iArr3, iArr4, i4);
                    System.arraycopy(iArr4, 0, iArr7, i13, i8);
                    i11 = i13 + i8;
                    a(iArr4, iArr2, iArr3, iArr5, i4);
                    i12 += 2;
                    i5 = i5;
                }
                i9++;
                i6 = i10;
            }
            int i14 = i2 - 1;
            for (int i15 = 0; i15 < i2; i15++) {
                int i16 = iArr5[i8 - 16] & i14;
                System.arraycopy(iArr6[i16 >>> b], (i16 & i7) * i8, iArr4, 0, i8);
                h(iArr4, iArr5, 0, iArr4);
                a(iArr4, iArr2, iArr3, iArr5, i4);
            }
            System.arraycopy(iArr5, 0, iArr, i, i8);
            d(iArr6);
            d(new int[][]{iArr5, iArr2, iArr3, iArr4});
        } catch (Throwable th) {
            d(iArr6);
            d(new int[][]{iArr5, iArr2, iArr3, iArr4});
            throw th;
        }
    }

    private static byte[] g(byte[] bArr, byte[] bArr2, int i) {
        zn7 zn7Var = new zn7(new dq9());
        zn7Var.g(bArr, bArr2, 1);
        return ((lf5) zn7Var.d(i * 8)).a();
    }

    private static void h(int[] iArr, int[] iArr2, int i, int[] iArr3) {
        for (int length = iArr3.length - 1; length >= 0; length--) {
            iArr3[length] = iArr[length] ^ iArr2[i + length];
        }
    }

    public static byte[] i(byte[] bArr, byte[] bArr2, int i, int i2, int i3, int i4) {
        if (bArr != null) {
            if (bArr2 != null) {
                if (i > 1 && j(i)) {
                    if (i2 == 1 && i >= 65536) {
                        throw new IllegalArgumentException("Cost parameter N must be > 1 and < 65536.");
                    }
                    if (i2 >= 1) {
                        int i5 = Integer.MAX_VALUE / (i2 * 1024);
                        if (i3 >= 1 && i3 <= i5) {
                            if (i4 >= 1) {
                                return e(bArr, bArr2, i, i2, i3, i4);
                            }
                            throw new IllegalArgumentException("Generated key length dkLen must be >= 1.");
                        }
                        throw new IllegalArgumentException("Parallelisation parameter p must be >= 1 and <= " + i5 + " (based on block size r of " + i2 + ")");
                    }
                    throw new IllegalArgumentException("Block size r must be >= 1.");
                }
                throw new IllegalArgumentException("Cost parameter N must be > 1 and a power of 2");
            }
            throw new IllegalArgumentException("Salt S must be provided.");
        }
        throw new IllegalArgumentException("Passphrase P must be provided.");
    }

    private static boolean j(int i) {
        if ((i & (i - 1)) == 0) {
            return true;
        }
        return false;
    }
}
