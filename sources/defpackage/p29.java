package defpackage;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
/* renamed from: p29  reason: default package */
/* loaded from: classes3.dex */
public class p29 implements xc0 {
    private static byte[] c = {-39, 120, -7, -60, 25, -35, -75, -19, 40, -23, -3, 121, 74, -96, -40, -99, -58, 126, 55, -125, 43, 118, 83, -114, 98, 76, 100, -120, 68, -117, -5, -94, 23, -102, 89, -11, -121, -77, 79, 19, 97, 69, 109, -115, 9, -127, 125, 50, -67, -113, 64, -21, -122, -73, 123, 11, -16, -107, 33, 34, 92, 107, 78, -126, 84, -42, 101, -109, -50, 96, -78, 28, 115, 86, -64, 20, -89, -116, -15, -36, 18, 117, -54, 31, 59, -66, -28, -47, 66, 61, -44, 48, -93, 60, -74, 38, 111, -65, 14, -38, 70, 105, 7, 87, 39, -14, 29, -101, -68, -108, 67, 3, -8, 17, -57, -10, -112, -17, 62, -25, 6, -61, -43, 47, -56, 102, 30, -41, 8, -24, -22, -34, Byte.MIN_VALUE, 82, -18, -9, -124, -86, 114, -84, 53, 77, 106, 42, -106, 26, -46, 113, 90, 21, 73, 116, 75, -97, -48, 94, 4, 24, -92, -20, -62, -32, 65, 110, 15, 81, -53, -52, 36, -111, -81, 80, -95, -12, 112, 57, -103, 124, 58, -123, 35, -72, -76, 122, -4, 2, 54, 91, 37, 85, -105, 49, 45, 93, -6, -104, -29, -118, -110, -82, 5, -33, 41, 16, 103, 108, -70, -55, -45, 0, -26, -49, -31, -98, -88, 44, 99, 22, 1, 63, 88, -30, -119, -87, 13, 56, 52, 27, -85, 51, -1, -80, -69, 72, 12, 95, -71, -79, -51, 46, -59, -13, -37, 71, -27, -91, -100, 119, 10, -90, 32, 104, -2, Byte.MAX_VALUE, -63, -83};
    private int[] a;
    private boolean b;

    private void c(byte[] bArr, int i, byte[] bArr2, int i2) {
        int i3 = ((bArr[i + 7] & 255) << 8) + (bArr[i + 6] & 255);
        int i4 = ((bArr[i + 5] & 255) << 8) + (bArr[i + 4] & 255);
        int i5 = ((bArr[i + 3] & 255) << 8) + (bArr[i + 2] & 255);
        int i6 = ((bArr[i + 1] & 255) << 8) + (bArr[i] & 255);
        for (int i7 = 60; i7 >= 44; i7 -= 4) {
            i3 = f(i3, 11) - ((((~i4) & i6) + (i5 & i4)) + this.a[i7 + 3]);
            i4 = f(i4, 13) - ((((~i5) & i3) + (i6 & i5)) + this.a[i7 + 2]);
            i5 = f(i5, 14) - ((((~i6) & i4) + (i3 & i6)) + this.a[i7 + 1]);
            i6 = f(i6, 15) - ((((~i3) & i5) + (i4 & i3)) + this.a[i7]);
        }
        int[] iArr = this.a;
        int i8 = i3 - iArr[i4 & 63];
        int i9 = i4 - iArr[i5 & 63];
        int i10 = i5 - iArr[i6 & 63];
        int i11 = i6 - iArr[i8 & 63];
        for (int i12 = 40; i12 >= 20; i12 -= 4) {
            i8 = f(i8, 11) - ((((~i9) & i11) + (i10 & i9)) + this.a[i12 + 3]);
            i9 = f(i9, 13) - ((((~i10) & i8) + (i11 & i10)) + this.a[i12 + 2]);
            i10 = f(i10, 14) - ((((~i11) & i9) + (i8 & i11)) + this.a[i12 + 1]);
            i11 = f(i11, 15) - ((((~i8) & i10) + (i9 & i8)) + this.a[i12]);
        }
        int[] iArr2 = this.a;
        int i13 = i8 - iArr2[i9 & 63];
        int i14 = i9 - iArr2[i10 & 63];
        int i15 = i10 - iArr2[i11 & 63];
        int i16 = i11 - iArr2[i13 & 63];
        for (int i17 = 16; i17 >= 0; i17 -= 4) {
            i13 = f(i13, 11) - ((((~i14) & i16) + (i15 & i14)) + this.a[i17 + 3]);
            i14 = f(i14, 13) - ((((~i15) & i13) + (i16 & i15)) + this.a[i17 + 2]);
            i15 = f(i15, 14) - ((((~i16) & i14) + (i13 & i16)) + this.a[i17 + 1]);
            i16 = f(i16, 15) - ((((~i13) & i15) + (i14 & i13)) + this.a[i17]);
        }
        bArr2[i2] = (byte) i16;
        bArr2[i2 + 1] = (byte) (i16 >> 8);
        bArr2[i2 + 2] = (byte) i15;
        bArr2[i2 + 3] = (byte) (i15 >> 8);
        bArr2[i2 + 4] = (byte) i14;
        bArr2[i2 + 5] = (byte) (i14 >> 8);
        bArr2[i2 + 6] = (byte) i13;
        bArr2[i2 + 7] = (byte) (i13 >> 8);
    }

    private void d(byte[] bArr, int i, byte[] bArr2, int i2) {
        int i3 = ((bArr[i + 7] & 255) << 8) + (bArr[i + 6] & 255);
        int i4 = ((bArr[i + 5] & 255) << 8) + (bArr[i + 4] & 255);
        int i5 = ((bArr[i + 3] & 255) << 8) + (bArr[i + 2] & 255);
        int i6 = ((bArr[i + 1] & 255) << 8) + (bArr[i] & 255);
        for (int i7 = 0; i7 <= 16; i7 += 4) {
            i6 = f(i6 + ((~i3) & i5) + (i4 & i3) + this.a[i7], 1);
            i5 = f(i5 + ((~i6) & i4) + (i3 & i6) + this.a[i7 + 1], 2);
            i4 = f(i4 + ((~i5) & i3) + (i6 & i5) + this.a[i7 + 2], 3);
            i3 = f(i3 + ((~i4) & i6) + (i5 & i4) + this.a[i7 + 3], 5);
        }
        int[] iArr = this.a;
        int i8 = i6 + iArr[i3 & 63];
        int i9 = i5 + iArr[i8 & 63];
        int i10 = i4 + iArr[i9 & 63];
        int i11 = i3 + iArr[i10 & 63];
        for (int i12 = 20; i12 <= 40; i12 += 4) {
            i8 = f(i8 + ((~i11) & i9) + (i10 & i11) + this.a[i12], 1);
            i9 = f(i9 + ((~i8) & i10) + (i11 & i8) + this.a[i12 + 1], 2);
            i10 = f(i10 + ((~i9) & i11) + (i8 & i9) + this.a[i12 + 2], 3);
            i11 = f(i11 + ((~i10) & i8) + (i9 & i10) + this.a[i12 + 3], 5);
        }
        int[] iArr2 = this.a;
        int i13 = i8 + iArr2[i11 & 63];
        int i14 = i9 + iArr2[i13 & 63];
        int i15 = i10 + iArr2[i14 & 63];
        int i16 = i11 + iArr2[i15 & 63];
        for (int i17 = 44; i17 < 64; i17 += 4) {
            i13 = f(i13 + ((~i16) & i14) + (i15 & i16) + this.a[i17], 1);
            i14 = f(i14 + ((~i13) & i15) + (i16 & i13) + this.a[i17 + 1], 2);
            i15 = f(i15 + ((~i14) & i16) + (i13 & i14) + this.a[i17 + 2], 3);
            i16 = f(i16 + ((~i15) & i13) + (i14 & i15) + this.a[i17 + 3], 5);
        }
        bArr2[i2] = (byte) i13;
        bArr2[i2 + 1] = (byte) (i13 >> 8);
        bArr2[i2 + 2] = (byte) i14;
        bArr2[i2 + 3] = (byte) (i14 >> 8);
        bArr2[i2 + 4] = (byte) i15;
        bArr2[i2 + 5] = (byte) (i15 >> 8);
        bArr2[i2 + 6] = (byte) i16;
        bArr2[i2 + 7] = (byte) (i16 >> 8);
    }

    private int[] e(byte[] bArr, int i) {
        int[] iArr = new int[128];
        for (int i2 = 0; i2 != bArr.length; i2++) {
            iArr[i2] = bArr[i2] & 255;
        }
        int length = bArr.length;
        if (length < 128) {
            int i3 = iArr[length - 1];
            int i4 = 0;
            while (true) {
                int i5 = i4 + 1;
                i3 = c[(i3 + iArr[i4]) & 255] & 255;
                int i6 = length + 1;
                iArr[length] = i3;
                if (i6 >= 128) {
                    break;
                }
                length = i6;
                i4 = i5;
            }
        }
        int i7 = (i + 7) >> 3;
        int i8 = 128 - i7;
        int i9 = c[(255 >> ((-i) & 7)) & iArr[i8]] & 255;
        iArr[i8] = i9;
        for (int i10 = 127 - i7; i10 >= 0; i10--) {
            i9 = c[i9 ^ iArr[i10 + i7]] & 255;
            iArr[i10] = i9;
        }
        int[] iArr2 = new int[64];
        for (int i11 = 0; i11 != 64; i11++) {
            int i12 = i11 * 2;
            iArr2[i11] = iArr[i12] + (iArr[i12 + 1] << 8);
        }
        return iArr2;
    }

    private int f(int i, int i2) {
        int i3 = i & 65535;
        return (i3 >> (16 - i2)) | (i3 << i2);
    }

    @Override // defpackage.xc0
    public int a() {
        return 8;
    }

    @Override // defpackage.xc0
    public final int b(byte[] bArr, int i, byte[] bArr2, int i2) {
        if (this.a != null) {
            if (i + 8 <= bArr.length) {
                if (i2 + 8 <= bArr2.length) {
                    if (this.b) {
                        d(bArr, i, bArr2, i2);
                        return 8;
                    }
                    c(bArr, i, bArr2, i2);
                    return 8;
                }
                throw new OutputLengthException("output buffer too short");
            }
            throw new DataLengthException("input buffer too short");
        }
        throw new IllegalStateException("RC2 engine not initialised");
    }

    @Override // defpackage.xc0
    public String getAlgorithmName() {
        return "RC2";
    }

    @Override // defpackage.xc0
    public void init(boolean z, v71 v71Var) {
        this.b = z;
        if (v71Var instanceof q29) {
            q29 q29Var = (q29) v71Var;
            this.a = e(q29Var.a(), q29Var.b());
        } else if (v71Var instanceof lf5) {
            byte[] a = ((lf5) v71Var).a();
            this.a = e(a, a.length * 8);
        } else {
            throw new IllegalArgumentException("invalid parameter passed to RC2 init - " + v71Var.getClass().getName());
        }
    }

    @Override // defpackage.xc0
    public void reset() {
    }
}
