package defpackage;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
/* renamed from: nnb  reason: default package */
/* loaded from: classes3.dex */
public final class nnb implements xc0 {
    private static final byte[][] j = {new byte[]{-87, 103, -77, -24, 4, -3, -93, 118, -102, -110, Byte.MIN_VALUE, 120, -28, -35, -47, 56, 13, -58, 53, -104, 24, -9, -20, 108, 67, 117, 55, 38, -6, 19, -108, 72, -14, -48, -117, 48, -124, 84, -33, 35, 25, 91, 61, 89, -13, -82, -94, -126, 99, 1, -125, 46, -39, 81, -101, 124, -90, -21, -91, -66, 22, 12, -29, 97, -64, -116, 58, -11, 115, 44, 37, 11, -69, 78, -119, 107, 83, 106, -76, -15, -31, -26, -67, 69, -30, -12, -74, 102, -52, -107, 3, 86, -44, 28, 30, -41, -5, -61, -114, -75, -23, -49, -65, -70, -22, 119, 57, -81, 51, -55, 98, 113, -127, 121, 9, -83, 36, -51, -7, -40, -27, -59, -71, 77, 68, 8, -122, -25, -95, 29, -86, -19, 6, 112, -78, -46, 65, 123, -96, 17, 49, -62, 39, -112, 32, -10, 96, -1, -106, 92, -79, -85, -98, -100, 82, 27, 95, -109, 10, -17, -111, -123, 73, -18, 45, 79, -113, 59, 71, -121, 109, 70, -42, 62, 105, 100, 42, -50, -53, 47, -4, -105, 5, 122, -84, Byte.MAX_VALUE, -43, 26, 75, 14, -89, 90, 40, 20, 63, 41, -120, 60, 76, 2, -72, -38, -80, 23, 85, 31, -118, 125, 87, -57, -115, 116, -73, -60, -97, 114, 126, 21, 34, 18, 88, 7, -103, 52, 110, 80, -34, 104, 101, -68, -37, -8, -56, -88, 43, 64, -36, -2, 50, -92, -54, 16, 33, -16, -45, 93, 15, 0, 111, -99, 54, 66, 74, 94, -63, -32}, new byte[]{117, -13, -58, -12, -37, 123, -5, -56, 74, -45, -26, 107, 69, 125, -24, 75, -42, 50, -40, -3, 55, 113, -15, -31, 48, 15, -8, 27, -121, -6, 6, 63, 94, -70, -82, 91, -118, 0, -68, -99, 109, -63, -79, 14, Byte.MIN_VALUE, 93, -46, -43, -96, -124, 7, 20, -75, -112, 44, -93, -78, 115, 76, 84, -110, 116, 54, 81, 56, -80, -67, 90, -4, 96, 98, -106, 108, 66, -9, 16, 124, 40, 39, -116, 19, -107, -100, -57, 36, 70, 59, 112, -54, -29, -123, -53, 17, -48, -109, -72, -90, -125, 32, -1, -97, 119, -61, -52, 3, 111, 8, -65, 64, -25, 43, -30, 121, 12, -86, -126, 65, 58, -22, -71, -28, -102, -92, -105, 126, -38, 122, 23, 102, -108, -95, 29, 61, -16, -34, -77, 11, 114, -89, 28, -17, -47, 83, 62, -113, 51, 38, 95, -20, 118, 42, 73, -127, -120, -18, 33, -60, 26, -21, -39, -59, 57, -103, -51, -83, 49, -117, 1, 24, 35, -35, 31, 78, 45, -7, 72, 79, -14, 101, -114, 120, 92, 88, 25, -115, -27, -104, 87, 103, Byte.MAX_VALUE, 5, 100, -81, 99, -74, -2, -11, -73, 60, -91, -50, -23, 104, 68, -32, 77, 67, 105, 41, 46, -84, 21, 89, -88, 10, -98, 110, 71, -33, 52, 53, 106, -49, -36, 34, -55, -64, -101, -119, -44, -19, -85, 18, -94, 13, 82, -69, 2, 47, -87, -41, 97, 30, -76, 80, 4, -10, -62, 22, 37, -122, 86, 85, 9, -66, -111}};
    private int[] f;
    private int[] g;
    private boolean a = false;
    private int[] b = new int[256];
    private int[] c = new int[256];
    private int[] d = new int[256];
    private int[] e = new int[256];
    private int h = 0;
    private byte[] i = null;

    public nnb() {
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        int[] iArr3 = new int[2];
        for (int i = 0; i < 256; i++) {
            byte[][] bArr = j;
            int i2 = bArr[0][i] & 255;
            iArr[0] = i2;
            iArr2[0] = j(i2) & 255;
            iArr3[0] = k(i2) & 255;
            int i3 = bArr[1][i] & 255;
            iArr[1] = i3;
            iArr2[1] = j(i3) & 255;
            int k = k(i3) & 255;
            iArr3[1] = k;
            this.b[i] = (k << 24) | iArr[1] | (iArr2[1] << 8) | (k << 16);
            int[] iArr4 = this.c;
            int i4 = iArr3[0];
            iArr4[i] = i4 | (i4 << 8) | (iArr2[0] << 16) | (iArr[0] << 24);
            int[] iArr5 = this.d;
            int i5 = iArr2[1];
            int i6 = iArr3[1];
            iArr5[i] = (iArr[1] << 16) | i5 | (i6 << 8) | (i6 << 24);
            int[] iArr6 = this.e;
            int i7 = iArr2[0];
            iArr6[i] = (i7 << 24) | (iArr[0] << 8) | i7 | (iArr3[0] << 16);
        }
    }

    private void c(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >> 8);
        bArr[i2 + 2] = (byte) (i >> 16);
        bArr[i2 + 3] = (byte) (i >> 24);
    }

    private int d(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    private int e(int i, int[] iArr) {
        int i2;
        int i3;
        int n = n(i);
        int o = o(i);
        int p = p(i);
        int q = q(i);
        int i4 = iArr[0];
        int i5 = iArr[1];
        int i6 = iArr[2];
        int i7 = iArr[3];
        int i8 = this.h & 3;
        if (i8 != 0) {
            if (i8 != 1) {
                if (i8 != 2) {
                    if (i8 != 3) {
                        return 0;
                    }
                }
                int[] iArr2 = this.b;
                byte[][] bArr = j;
                byte[] bArr2 = bArr[0];
                i2 = (iArr2[(bArr2[(bArr2[n] & 255) ^ n(i5)] & 255) ^ n(i4)] ^ this.c[(bArr[0][(bArr[1][o] & 255) ^ o(i5)] & 255) ^ o(i4)]) ^ this.d[(bArr[1][(bArr[0][p] & 255) ^ p(i5)] & 255) ^ p(i4)];
                int[] iArr3 = this.e;
                byte[] bArr3 = bArr[1];
                i3 = iArr3[(bArr3[(bArr3[q] & 255) ^ q(i5)] & 255) ^ q(i4)];
                return i2 ^ i3;
            }
            int[] iArr4 = this.b;
            byte[][] bArr4 = j;
            i2 = (iArr4[(bArr4[0][n] & 255) ^ n(i4)] ^ this.c[(bArr4[0][o] & 255) ^ o(i4)]) ^ this.d[(bArr4[1][p] & 255) ^ p(i4)];
            i3 = this.e[(bArr4[1][q] & 255) ^ q(i4)];
            return i2 ^ i3;
        }
        byte[][] bArr5 = j;
        n = (bArr5[1][n] & 255) ^ n(i7);
        o = (bArr5[0][o] & 255) ^ o(i7);
        p = (bArr5[0][p] & 255) ^ p(i7);
        q = (bArr5[1][q] & 255) ^ q(i7);
        byte[][] bArr6 = j;
        n = (bArr6[1][n] & 255) ^ n(i6);
        o = (bArr6[1][o] & 255) ^ o(i6);
        p = (bArr6[0][p] & 255) ^ p(i6);
        q = (bArr6[0][q] & 255) ^ q(i6);
        int[] iArr22 = this.b;
        byte[][] bArr7 = j;
        byte[] bArr22 = bArr7[0];
        i2 = (iArr22[(bArr22[(bArr22[n] & 255) ^ n(i5)] & 255) ^ n(i4)] ^ this.c[(bArr7[0][(bArr7[1][o] & 255) ^ o(i5)] & 255) ^ o(i4)]) ^ this.d[(bArr7[1][(bArr7[0][p] & 255) ^ p(i5)] & 255) ^ p(i4)];
        int[] iArr32 = this.e;
        byte[] bArr32 = bArr7[1];
        i3 = iArr32[(bArr32[(bArr32[q] & 255) ^ q(i5)] & 255) ^ q(i4)];
        return i2 ^ i3;
    }

    private int f(int i) {
        int[] iArr = this.g;
        return iArr[(((i >>> 24) & 255) * 2) + 513] ^ ((iArr[(i & 255) * 2] ^ iArr[(((i >>> 8) & 255) * 2) + 1]) ^ iArr[(((i >>> 16) & 255) * 2) + 512]);
    }

    private int g(int i) {
        int[] iArr = this.g;
        return iArr[(((i >>> 16) & 255) * 2) + 513] ^ ((iArr[((i >>> 24) & 255) * 2] ^ iArr[((i & 255) * 2) + 1]) ^ iArr[(((i >>> 8) & 255) * 2) + 512]);
    }

    private int h(int i) {
        int i2;
        int i3 = i >> 1;
        if ((i & 1) != 0) {
            i2 = 180;
        } else {
            i2 = 0;
        }
        return i2 ^ i3;
    }

    private int i(int i) {
        int i2;
        int i3 = i >> 2;
        int i4 = 0;
        if ((i & 2) != 0) {
            i2 = 180;
        } else {
            i2 = 0;
        }
        int i5 = i3 ^ i2;
        if ((i & 1) != 0) {
            i4 = 90;
        }
        return i5 ^ i4;
    }

    private int j(int i) {
        return i ^ i(i);
    }

    private int k(int i) {
        return i(i) ^ (h(i) ^ i);
    }

    private int l(int i, int i2) {
        for (int i3 = 0; i3 < 4; i3++) {
            i2 = m(i2);
        }
        int i4 = i ^ i2;
        for (int i5 = 0; i5 < 4; i5++) {
            i4 = m(i4);
        }
        return i4;
    }

    private int m(int i) {
        int i2;
        int i3 = i >>> 24;
        int i4 = i3 & 255;
        int i5 = i4 << 1;
        int i6 = 0;
        if ((i3 & 128) != 0) {
            i2 = 333;
        } else {
            i2 = 0;
        }
        int i7 = (i5 ^ i2) & 255;
        int i8 = i4 >>> 1;
        if ((i3 & 1) != 0) {
            i6 = 166;
        }
        int i9 = (i8 ^ i6) ^ i7;
        return ((((i << 8) ^ (i9 << 24)) ^ (i7 << 16)) ^ (i9 << 8)) ^ i4;
    }

    private int n(int i) {
        return i & 255;
    }

    private int o(int i) {
        return (i >>> 8) & 255;
    }

    private int p(int i) {
        return (i >>> 16) & 255;
    }

    private int q(int i) {
        return (i >>> 24) & 255;
    }

    private void r(byte[] bArr, int i, byte[] bArr2, int i2) {
        int d = d(bArr, i) ^ this.f[4];
        int d2 = d(bArr, i + 4) ^ this.f[5];
        int d3 = d(bArr, i + 8) ^ this.f[6];
        int d4 = d(bArr, i + 12) ^ this.f[7];
        int i3 = 39;
        for (int i4 = 0; i4 < 16; i4 += 2) {
            int f = f(d);
            int g = g(d2);
            int[] iArr = this.f;
            int i5 = d4 ^ (((g * 2) + f) + iArr[i3]);
            d3 = ((d3 >>> 31) | (d3 << 1)) ^ ((f + g) + iArr[i3 - 1]);
            d4 = (i5 << 31) | (i5 >>> 1);
            int f2 = f(d3);
            int g2 = g(d4);
            int[] iArr2 = this.f;
            int i6 = i3 - 3;
            int i7 = d2 ^ (((g2 * 2) + f2) + iArr2[i3 - 2]);
            i3 -= 4;
            d = ((d >>> 31) | (d << 1)) ^ ((f2 + g2) + iArr2[i6]);
            d2 = (i7 << 31) | (i7 >>> 1);
        }
        c(this.f[0] ^ d3, bArr2, i2);
        c(d4 ^ this.f[1], bArr2, i2 + 4);
        c(this.f[2] ^ d, bArr2, i2 + 8);
        c(this.f[3] ^ d2, bArr2, i2 + 12);
    }

    private void s(byte[] bArr, int i, byte[] bArr2, int i2) {
        int d = d(bArr, i) ^ this.f[0];
        int d2 = d(bArr, i + 4) ^ this.f[1];
        int d3 = d(bArr, i + 8) ^ this.f[2];
        int d4 = d(bArr, i + 12) ^ this.f[3];
        int i3 = 8;
        for (int i4 = 0; i4 < 16; i4 += 2) {
            int f = f(d);
            int g = g(d2);
            int[] iArr = this.f;
            int i5 = d3 ^ ((f + g) + iArr[i3]);
            d3 = (i5 << 31) | (i5 >>> 1);
            d4 = ((d4 >>> 31) | (d4 << 1)) ^ ((f + (g * 2)) + iArr[i3 + 1]);
            int f2 = f(d3);
            int g2 = g(d4);
            int[] iArr2 = this.f;
            int i6 = i3 + 3;
            int i7 = d ^ ((f2 + g2) + iArr2[i3 + 2]);
            d = (i7 << 31) | (i7 >>> 1);
            i3 += 4;
            d2 = ((d2 >>> 31) | (d2 << 1)) ^ ((f2 + (g2 * 2)) + iArr2[i6]);
        }
        c(this.f[4] ^ d3, bArr2, i2);
        c(d4 ^ this.f[5], bArr2, i2 + 4);
        c(this.f[6] ^ d, bArr2, i2 + 8);
        c(this.f[7] ^ d2, bArr2, i2 + 12);
    }

    private void t(byte[] bArr) {
        int n;
        int o;
        int p;
        int q;
        int i;
        int i2;
        int i3;
        int i4;
        int[] iArr = new int[4];
        int[] iArr2 = new int[4];
        int[] iArr3 = new int[4];
        this.f = new int[40];
        int i5 = this.h;
        if (i5 >= 1) {
            if (i5 <= 4) {
                for (int i6 = 0; i6 < this.h; i6++) {
                    int i7 = i6 * 8;
                    iArr[i6] = d(bArr, i7);
                    int d = d(bArr, i7 + 4);
                    iArr2[i6] = d;
                    iArr3[(this.h - 1) - i6] = l(iArr[i6], d);
                }
                for (int i8 = 0; i8 < 20; i8++) {
                    int i9 = 33686018 * i8;
                    int e = e(i9, iArr);
                    int e2 = e(i9 + 16843009, iArr2);
                    int i10 = (e2 >>> 24) | (e2 << 8);
                    int i11 = e + i10;
                    int[] iArr4 = this.f;
                    int i12 = i8 * 2;
                    iArr4[i12] = i11;
                    int i13 = i11 + i10;
                    iArr4[i12 + 1] = (i13 << 9) | (i13 >>> 23);
                }
                int i14 = iArr3[0];
                int i15 = iArr3[1];
                int i16 = 2;
                int i17 = iArr3[2];
                int i18 = iArr3[3];
                this.g = new int[1024];
                int i19 = 0;
                while (i19 < 256) {
                    int i20 = this.h & 3;
                    if (i20 != 0) {
                        if (i20 != 1) {
                            if (i20 != i16) {
                                if (i20 == 3) {
                                    q = i19;
                                    n = q;
                                    o = n;
                                    p = o;
                                }
                            } else {
                                i4 = i19;
                                i3 = i4;
                                i2 = i3;
                                i = i2;
                                int[] iArr5 = this.g;
                                int i21 = i19 * 2;
                                int[] iArr6 = this.b;
                                byte[][] bArr2 = j;
                                byte[] bArr3 = bArr2[0];
                                iArr5[i21] = iArr6[(bArr3[(bArr3[i3] & 255) ^ n(i15)] & 255) ^ n(i14)];
                                this.g[i21 + 1] = this.c[(bArr2[0][(bArr2[1][i2] & 255) ^ o(i15)] & 255) ^ o(i14)];
                                this.g[i21 + 512] = this.d[(bArr2[1][(bArr2[0][i] & 255) ^ p(i15)] & 255) ^ p(i14)];
                                int[] iArr7 = this.e;
                                byte[] bArr4 = bArr2[1];
                                this.g[i21 + 513] = iArr7[(bArr4[(bArr4[i4] & 255) ^ q(i15)] & 255) ^ q(i14)];
                            }
                        } else {
                            int[] iArr8 = this.g;
                            int i22 = i19 * 2;
                            int[] iArr9 = this.b;
                            byte[][] bArr5 = j;
                            iArr8[i22] = iArr9[(bArr5[0][i19] & 255) ^ n(i14)];
                            this.g[i22 + 1] = this.c[(bArr5[0][i19] & 255) ^ o(i14)];
                            this.g[i22 + 512] = this.d[(bArr5[1][i19] & 255) ^ p(i14)];
                            this.g[i22 + 513] = this.e[(bArr5[1][i19] & 255) ^ q(i14)];
                        }
                        i19++;
                        i16 = 2;
                    } else {
                        byte[][] bArr6 = j;
                        n = (bArr6[1][i19] & 255) ^ n(i18);
                        o = (bArr6[0][i19] & 255) ^ o(i18);
                        p = (bArr6[0][i19] & 255) ^ p(i18);
                        q = (bArr6[1][i19] & 255) ^ q(i18);
                    }
                    byte[][] bArr7 = j;
                    i3 = (bArr7[1][n] & 255) ^ n(i17);
                    i2 = (bArr7[1][o] & 255) ^ o(i17);
                    i = (bArr7[0][p] & 255) ^ p(i17);
                    i4 = (bArr7[0][q] & 255) ^ q(i17);
                    int[] iArr52 = this.g;
                    int i212 = i19 * 2;
                    int[] iArr62 = this.b;
                    byte[][] bArr22 = j;
                    byte[] bArr32 = bArr22[0];
                    iArr52[i212] = iArr62[(bArr32[(bArr32[i3] & 255) ^ n(i15)] & 255) ^ n(i14)];
                    this.g[i212 + 1] = this.c[(bArr22[0][(bArr22[1][i2] & 255) ^ o(i15)] & 255) ^ o(i14)];
                    this.g[i212 + 512] = this.d[(bArr22[1][(bArr22[0][i] & 255) ^ p(i15)] & 255) ^ p(i14)];
                    int[] iArr72 = this.e;
                    byte[] bArr42 = bArr22[1];
                    this.g[i212 + 513] = iArr72[(bArr42[(bArr42[i4] & 255) ^ q(i15)] & 255) ^ q(i14)];
                    i19++;
                    i16 = 2;
                }
                return;
            }
            throw new IllegalArgumentException("Key size larger than 256 bits");
        }
        throw new IllegalArgumentException("Key size less than 64 bits");
    }

    @Override // defpackage.xc0
    public int a() {
        return 16;
    }

    @Override // defpackage.xc0
    public int b(byte[] bArr, int i, byte[] bArr2, int i2) {
        if (this.i != null) {
            if (i + 16 <= bArr.length) {
                if (i2 + 16 <= bArr2.length) {
                    if (this.a) {
                        s(bArr, i, bArr2, i2);
                        return 16;
                    }
                    r(bArr, i, bArr2, i2);
                    return 16;
                }
                throw new OutputLengthException("output buffer too short");
            }
            throw new DataLengthException("input buffer too short");
        }
        throw new IllegalStateException("Twofish not initialised");
    }

    @Override // defpackage.xc0
    public String getAlgorithmName() {
        return "Twofish";
    }

    @Override // defpackage.xc0
    public void init(boolean z, v71 v71Var) {
        if (v71Var instanceof lf5) {
            this.a = z;
            byte[] a = ((lf5) v71Var).a();
            this.i = a;
            this.h = a.length / 8;
            t(a);
            return;
        }
        throw new IllegalArgumentException("invalid parameter passed to Twofish init - " + v71Var.getClass().getName());
    }

    @Override // defpackage.xc0
    public void reset() {
        byte[] bArr = this.i;
        if (bArr != null) {
            t(bArr);
        }
    }
}
