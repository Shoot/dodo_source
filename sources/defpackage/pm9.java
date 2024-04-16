package defpackage;

import java.lang.reflect.Array;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
/* renamed from: pm9  reason: default package */
/* loaded from: classes3.dex */
public class pm9 implements xc0 {
    private static final byte[] m = {0, 0, 25, 1, 50, 2, 26, -58, 75, -57, 27, 104, 51, -18, -33, 3, 100, 4, -32, 14, 52, -115, -127, -17, 76, 113, 8, -56, -8, 105, 28, -63, 125, -62, 29, -75, -7, -71, 39, 106, 77, -28, -90, 114, -102, -55, 9, 120, 101, 47, -118, 5, 33, 15, -31, 36, 18, -16, -126, 69, 53, -109, -38, -114, -106, -113, -37, -67, 54, -48, -50, -108, 19, 92, -46, -15, 64, 70, -125, 56, 102, -35, -3, 48, -65, 6, -117, 98, -77, 37, -30, -104, 34, -120, -111, 16, 126, 110, 72, -61, -93, -74, 30, 66, 58, 107, 40, 84, -6, -123, 61, -70, 43, 121, 10, 21, -101, -97, 94, -54, 78, -44, -84, -27, -13, 115, -89, 87, -81, 88, -88, 80, -12, -22, -42, 116, 79, -82, -23, -43, -25, -26, -83, -24, 44, -41, 117, 122, -21, 22, 11, -11, 89, -53, 95, -80, -100, -87, 81, -96, Byte.MAX_VALUE, 12, -10, 111, 23, -60, 73, -20, -40, 67, 31, 45, -92, 118, 123, -73, -52, -69, 62, 90, -5, 96, -79, -122, 59, 82, -95, 108, -86, 85, 41, -99, -105, -78, -121, -112, 97, -66, -36, -4, -68, -107, -49, -51, 55, 63, 91, -47, 83, 57, -124, 60, 65, -94, 109, 71, 20, 42, -98, 93, 86, -14, -45, -85, 68, 17, -110, -39, 35, 32, 46, -119, -76, 124, -72, 38, 119, -103, -29, -91, 103, 74, -19, -34, -59, 49, -2, 24, 13, 99, -116, Byte.MIN_VALUE, -64, -9, 112, 7};
    private static final byte[] n = {0, 3, 5, 15, 17, 51, 85, -1, 26, 46, 114, -106, -95, -8, 19, 53, 95, -31, 56, 72, -40, 115, -107, -92, -9, 2, 6, 10, 30, 34, 102, -86, -27, 52, 92, -28, 55, 89, -21, 38, 106, -66, -39, 112, -112, -85, -26, 49, 83, -11, 4, 12, 20, 60, 68, -52, 79, -47, 104, -72, -45, 110, -78, -51, 76, -44, 103, -87, -32, 59, 77, -41, 98, -90, -15, 8, 24, 40, 120, -120, -125, -98, -71, -48, 107, -67, -36, Byte.MAX_VALUE, -127, -104, -77, -50, 73, -37, 118, -102, -75, -60, 87, -7, 16, 48, 80, -16, 11, 29, 39, 105, -69, -42, 97, -93, -2, 25, 43, 125, -121, -110, -83, -20, 47, 113, -109, -82, -23, 32, 96, -96, -5, 22, 58, 78, -46, 109, -73, -62, 93, -25, 50, 86, -6, 21, 63, 65, -61, 94, -30, 61, 71, -55, 64, -64, 91, -19, 44, 116, -100, -65, -38, 117, -97, -70, -43, 100, -84, -17, 42, 126, -126, -99, -68, -33, 122, -114, -119, Byte.MIN_VALUE, -101, -74, -63, 88, -24, 35, 101, -81, -22, 37, 111, -79, -56, 67, -59, 84, -4, 31, 33, 99, -91, -12, 7, 9, 27, 45, 119, -103, -80, -53, 70, -54, 69, -49, 74, -34, 121, -117, -122, -111, -88, -29, 62, 66, -58, 81, -13, 14, 18, 54, 90, -18, 41, 123, -115, -116, -113, -118, -123, -108, -89, -14, 13, 23, 57, 75, -35, 124, -124, -105, -94, -3, 28, 36, 108, -76, -57, 82, -10, 1, 3, 5, 15, 17, 51, 85, -1, 26, 46, 114, -106, -95, -8, 19, 53, 95, -31, 56, 72, -40, 115, -107, -92, -9, 2, 6, 10, 30, 34, 102, -86, -27, 52, 92, -28, 55, 89, -21, 38, 106, -66, -39, 112, -112, -85, -26, 49, 83, -11, 4, 12, 20, 60, 68, -52, 79, -47, 104, -72, -45, 110, -78, -51, 76, -44, 103, -87, -32, 59, 77, -41, 98, -90, -15, 8, 24, 40, 120, -120, -125, -98, -71, -48, 107, -67, -36, Byte.MAX_VALUE, -127, -104, -77, -50, 73, -37, 118, -102, -75, -60, 87, -7, 16, 48, 80, -16, 11, 29, 39, 105, -69, -42, 97, -93, -2, 25, 43, 125, -121, -110, -83, -20, 47, 113, -109, -82, -23, 32, 96, -96, -5, 22, 58, 78, -46, 109, -73, -62, 93, -25, 50, 86, -6, 21, 63, 65, -61, 94, -30, 61, 71, -55, 64, -64, 91, -19, 44, 116, -100, -65, -38, 117, -97, -70, -43, 100, -84, -17, 42, 126, -126, -99, -68, -33, 122, -114, -119, Byte.MIN_VALUE, -101, -74, -63, 88, -24, 35, 101, -81, -22, 37, 111, -79, -56, 67, -59, 84, -4, 31, 33, 99, -91, -12, 7, 9, 27, 45, 119, -103, -80, -53, 70, -54, 69, -49, 74, -34, 121, -117, -122, -111, -88, -29, 62, 66, -58, 81, -13, 14, 18, 54, 90, -18, 41, 123, -115, -116, -113, -118, -123, -108, -89, -14, 13, 23, 57, 75, -35, 124, -124, -105, -94, -3, 28, 36, 108, -76, -57, 82, -10, 1};
    private static final byte[] o = {99, 124, 119, 123, -14, 107, 111, -59, 48, 1, 103, 43, -2, -41, -85, 118, -54, -126, -55, 125, -6, 89, 71, -16, -83, -44, -94, -81, -100, -92, 114, -64, -73, -3, -109, 38, 54, 63, -9, -52, 52, -91, -27, -15, 113, -40, 49, 21, 4, -57, 35, -61, 24, -106, 5, -102, 7, 18, Byte.MIN_VALUE, -30, -21, 39, -78, 117, 9, -125, 44, 26, 27, 110, 90, -96, 82, 59, -42, -77, 41, -29, 47, -124, 83, -47, 0, -19, 32, -4, -79, 91, 106, -53, -66, 57, 74, 76, 88, -49, -48, -17, -86, -5, 67, 77, 51, -123, 69, -7, 2, Byte.MAX_VALUE, 80, 60, -97, -88, 81, -93, 64, -113, -110, -99, 56, -11, -68, -74, -38, 33, 16, -1, -13, -46, -51, 12, 19, -20, 95, -105, 68, 23, -60, -89, 126, 61, 100, 93, 25, 115, 96, -127, 79, -36, 34, 42, -112, -120, 70, -18, -72, 20, -34, 94, 11, -37, -32, 50, 58, 10, 73, 6, 36, 92, -62, -45, -84, 98, -111, -107, -28, 121, -25, -56, 55, 109, -115, -43, 78, -87, 108, 86, -12, -22, 101, 122, -82, 8, -70, 120, 37, 46, 28, -90, -76, -58, -24, -35, 116, 31, 75, -67, -117, -118, 112, 62, -75, 102, 72, 3, -10, 14, 97, 53, 87, -71, -122, -63, 29, -98, -31, -8, -104, 17, 105, -39, -114, -108, -101, 30, -121, -23, -50, 85, 40, -33, -116, -95, -119, 13, -65, -26, 66, 104, 65, -103, 45, 15, -80, 84, -69, 22};
    private static final byte[] p = {82, 9, 106, -43, 48, 54, -91, 56, -65, 64, -93, -98, -127, -13, -41, -5, 124, -29, 57, -126, -101, 47, -1, -121, 52, -114, 67, 68, -60, -34, -23, -53, 84, 123, -108, 50, -90, -62, 35, 61, -18, 76, -107, 11, 66, -6, -61, 78, 8, 46, -95, 102, 40, -39, 36, -78, 118, 91, -94, 73, 109, -117, -47, 37, 114, -8, -10, 100, -122, 104, -104, 22, -44, -92, 92, -52, 93, 101, -74, -110, 108, 112, 72, 80, -3, -19, -71, -38, 94, 21, 70, 87, -89, -115, -99, -124, -112, -40, -85, 0, -116, -68, -45, 10, -9, -28, 88, 5, -72, -77, 69, 6, -48, 44, 30, -113, -54, 63, 15, 2, -63, -81, -67, 3, 1, 19, -118, 107, 58, -111, 17, 65, 79, 103, -36, -22, -105, -14, -49, -50, -16, -76, -26, 115, -106, -84, 116, 34, -25, -83, 53, -123, -30, -7, 55, -24, 28, 117, -33, 110, 71, -15, 26, 113, 29, 41, -59, -119, 111, -73, 98, 14, -86, 24, -66, 27, -4, 86, 62, 75, -58, -46, 121, 32, -102, -37, -64, -2, 120, -51, 90, -12, 31, -35, -88, 51, -120, 7, -57, 49, -79, 18, 16, 89, 39, Byte.MIN_VALUE, -20, 95, 96, 81, Byte.MAX_VALUE, -87, 25, -75, 74, 13, 45, -27, 122, -97, -109, -55, -100, -17, -96, -32, 59, 77, -82, 42, -11, -80, -56, -21, -69, 60, -125, 83, -103, 97, 23, 43, 4, 126, -70, 119, -42, 38, -31, 105, 20, 99, 85, 33, 12, 125};
    private static final int[] q = {1, 2, 4, 8, 16, 32, 64, 128, 27, 54, 108, 216, 171, 77, 154, 47, 94, 188, 99, 198, 151, 53, 106, 212, 179, 125, 250, 239, 197, 145};
    static byte[][] r = {new byte[]{0, 8, 16, 24}, new byte[]{0, 8, 16, 24}, new byte[]{0, 8, 16, 24}, new byte[]{0, 8, 16, 32}, new byte[]{0, 8, 24, 32}};
    static byte[][] s = {new byte[]{0, 24, 16, 8}, new byte[]{0, 32, 24, 16}, new byte[]{0, 40, 32, 24}, new byte[]{0, 48, 40, 24}, new byte[]{0, 56, 40, 32}};
    private int a;
    private long b;
    private int c;
    private int d;
    private long[][] e;
    private long f;
    private long g;
    private long h;
    private long i;
    private boolean j;
    private byte[] k;
    private byte[] l;

    public pm9() {
        this(128);
    }

    private void c() {
        int i;
        int i2;
        int i3;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        for (int i4 = 0; i4 < this.a; i4 += 8) {
            int i5 = (int) ((this.f >> i4) & 255);
            int i6 = (int) ((this.g >> i4) & 255);
            int i7 = (int) ((this.h >> i4) & 255);
            long j5 = j4;
            int i8 = (int) ((this.i >> i4) & 255);
            int i9 = -1;
            if (i5 != 0) {
                i = m[i5 & 255] & 255;
            } else {
                i = -1;
            }
            if (i6 != 0) {
                i2 = m[i6 & 255] & 255;
            } else {
                i2 = -1;
            }
            if (i7 != 0) {
                i3 = m[i7 & 255] & 255;
            } else {
                i3 = -1;
            }
            if (i8 != 0) {
                i9 = m[i8 & 255] & 255;
            }
            j |= ((((q(i) ^ o(i2)) ^ p(i3)) ^ n(i9)) & 255) << i4;
            j2 |= ((((q(i2) ^ o(i3)) ^ p(i9)) ^ n(i)) & 255) << i4;
            j3 |= ((((q(i3) ^ o(i9)) ^ p(i)) ^ n(i2)) & 255) << i4;
            j4 = j5 | (((((q(i9) ^ o(i)) ^ p(i2)) ^ n(i3)) & 255) << i4);
        }
        this.f = j;
        this.g = j2;
        this.h = j3;
        this.i = j4;
    }

    private void d(long[] jArr) {
        this.f ^= jArr[0];
        this.g ^= jArr[1];
        this.h ^= jArr[2];
        this.i ^= jArr[3];
    }

    private void e() {
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        for (int i = 0; i < this.a; i += 8) {
            int i2 = (int) ((this.f >> i) & 255);
            int i3 = (int) ((this.g >> i) & 255);
            int i4 = (int) ((this.h >> i) & 255);
            int i5 = (int) ((this.i >> i) & 255);
            j |= ((((l(i2) ^ m(i3)) ^ i4) ^ i5) & 255) << i;
            j2 |= ((((l(i3) ^ m(i4)) ^ i5) ^ i2) & 255) << i;
            j3 |= ((((l(i4) ^ m(i5)) ^ i2) ^ i3) & 255) << i;
            j4 |= ((((l(i5) ^ m(i2)) ^ i3) ^ i4) & 255) << i;
        }
        this.f = j;
        this.g = j2;
        this.h = j3;
        this.i = j4;
    }

    private void f(byte[] bArr) {
        this.g = s(this.g, bArr[1]);
        this.h = s(this.h, bArr[2]);
        this.i = s(this.i, bArr[3]);
    }

    private void g(byte[] bArr) {
        this.f = h(this.f, bArr);
        this.g = h(this.g, bArr);
        this.h = h(this.h, bArr);
        this.i = h(this.i, bArr);
    }

    private long h(long j, byte[] bArr) {
        long j2 = 0;
        for (int i = 0; i < this.a; i += 8) {
            j2 |= (bArr[(int) ((j >> i) & 255)] & 255) << i;
        }
        return j2;
    }

    private void i(long[][] jArr) {
        d(jArr[this.c]);
        g(p);
        f(this.l);
        for (int i = this.c - 1; i > 0; i--) {
            d(jArr[i]);
            c();
            g(p);
            f(this.l);
        }
        d(jArr[0]);
    }

    private void j(long[][] jArr) {
        d(jArr[0]);
        for (int i = 1; i < this.c; i++) {
            g(o);
            f(this.k);
            e();
            d(jArr[i]);
        }
        g(o);
        f(this.k);
        d(jArr[this.c]);
    }

    private long[][] k(byte[] bArr) {
        int i;
        int i2;
        int i3 = 8;
        int length = bArr.length * 8;
        int i4 = 4;
        byte[][] bArr2 = (byte[][]) Array.newInstance(Byte.TYPE, 4, 64);
        long[][] jArr = (long[][]) Array.newInstance(Long.TYPE, 15, 4);
        if (length != 128) {
            if (length != 160) {
                if (length != 192) {
                    if (length != 224) {
                        if (length == 256) {
                            i = 8;
                        } else {
                            throw new IllegalArgumentException("Key length not 128/160/192/224/256 bits.");
                        }
                    } else {
                        i = 7;
                    }
                } else {
                    i = 6;
                }
            } else {
                i = 5;
            }
        } else {
            i = 4;
        }
        if (length >= this.d) {
            i2 = i + 6;
        } else {
            i2 = (this.a / 8) + 6;
        }
        this.c = i2;
        char c = 0;
        int i5 = 0;
        int i6 = 0;
        while (i5 < bArr.length) {
            bArr2[i5 % 4][i5 / 4] = bArr[i6];
            i5++;
            i6++;
        }
        int i7 = 0;
        int i8 = 0;
        while (i7 < i && i8 < (this.c + 1) * (this.a / 8)) {
            int i9 = 0;
            while (i9 < i4) {
                int i10 = this.a;
                long[] jArr2 = jArr[i8 / (i10 / 8)];
                jArr2[i9] = ((bArr2[i9][i7] & 255) << ((i8 * 8) % i10)) | jArr2[i9];
                i9++;
                jArr = jArr;
                i4 = 4;
            }
            i7++;
            i8++;
            i4 = 4;
        }
        long[][] jArr3 = jArr;
        int i11 = 0;
        while (i8 < (this.c + 1) * (this.a / i3)) {
            int i12 = 0;
            for (int i13 = 4; i12 < i13; i13 = 4) {
                byte[] bArr3 = bArr2[i12];
                i12++;
                bArr3[c] = (byte) (bArr3[c] ^ o[bArr2[i12 % 4][i - 1] & 255]);
            }
            byte[] bArr4 = bArr2[c];
            int i14 = i11 + 1;
            bArr4[c] = (byte) (q[i11] ^ bArr4[c]);
            if (i <= 6) {
                for (int i15 = 1; i15 < i; i15++) {
                    int i16 = 0;
                    for (int i17 = 4; i16 < i17; i17 = 4) {
                        byte[] bArr5 = bArr2[i16];
                        bArr5[i15] = (byte) (bArr5[i15] ^ bArr5[i15 - 1]);
                        i16++;
                    }
                }
            } else {
                int i18 = 4;
                int i19 = 1;
                while (i19 < i18) {
                    int i20 = 0;
                    while (i20 < i18) {
                        byte[] bArr6 = bArr2[i20];
                        bArr6[i19] = (byte) (bArr6[i19] ^ bArr6[i19 - 1]);
                        i20++;
                        i18 = 4;
                    }
                    i19++;
                    i18 = 4;
                }
                for (int i21 = 0; i21 < i18; i21++) {
                    byte[] bArr7 = bArr2[i21];
                    bArr7[i18] = (byte) (bArr7[i18] ^ o[bArr7[3] & 255]);
                }
                int i22 = 5;
                while (i22 < i) {
                    int i23 = 0;
                    while (i23 < i18) {
                        byte[] bArr8 = bArr2[i23];
                        bArr8[i22] = (byte) (bArr8[i22] ^ bArr8[i22 - 1]);
                        i23++;
                        i18 = 4;
                    }
                    i22++;
                    i18 = 4;
                }
            }
            int i24 = 0;
            while (i24 < i && i8 < (this.c + 1) * (this.a / i3)) {
                int i25 = 0;
                while (i25 < 4) {
                    int i26 = this.a;
                    long[] jArr4 = jArr3[i8 / (i26 / 8)];
                    jArr4[i25] = ((bArr2[i25][i24] & 255) << ((i8 * 8) % i26)) | jArr4[i25];
                    i25++;
                    bArr2 = bArr2;
                }
                i24++;
                i8++;
                i3 = 8;
            }
            i11 = i14;
            bArr2 = bArr2;
            c = 0;
            i3 = 8;
        }
        return jArr3;
    }

    private byte l(int i) {
        if (i != 0) {
            return n[(m[i] & 255) + 25];
        }
        return (byte) 0;
    }

    private byte m(int i) {
        if (i != 0) {
            return n[(m[i] & 255) + 1];
        }
        return (byte) 0;
    }

    private byte n(int i) {
        if (i >= 0) {
            return n[i + 199];
        }
        return (byte) 0;
    }

    private byte o(int i) {
        if (i >= 0) {
            return n[i + 104];
        }
        return (byte) 0;
    }

    private byte p(int i) {
        if (i >= 0) {
            return n[i + 238];
        }
        return (byte) 0;
    }

    private byte q(int i) {
        if (i >= 0) {
            return n[i + 223];
        }
        return (byte) 0;
    }

    private void r(byte[] bArr, int i) {
        for (int i2 = 0; i2 != this.a; i2 += 8) {
            bArr[i] = (byte) (this.f >> i2);
            bArr[i + 1] = (byte) (this.g >> i2);
            int i3 = i + 3;
            bArr[i + 2] = (byte) (this.h >> i2);
            i += 4;
            bArr[i3] = (byte) (this.i >> i2);
        }
    }

    private long s(long j, int i) {
        return ((j << (this.a - i)) | (j >>> i)) & this.b;
    }

    private void t(byte[] bArr, int i) {
        this.f = bArr[i] & 255;
        this.g = bArr[i + 1] & 255;
        int i2 = i + 3;
        this.h = bArr[i + 2] & 255;
        int i3 = i + 4;
        this.i = bArr[i2] & 255;
        for (int i4 = 8; i4 != this.a; i4 += 8) {
            this.f |= (bArr[i3] & 255) << i4;
            this.g |= (bArr[i3 + 1] & 255) << i4;
            int i5 = i3 + 3;
            this.h |= (bArr[i3 + 2] & 255) << i4;
            i3 += 4;
            this.i |= (bArr[i5] & 255) << i4;
        }
    }

    @Override // defpackage.xc0
    public int a() {
        return this.a / 2;
    }

    @Override // defpackage.xc0
    public int b(byte[] bArr, int i, byte[] bArr2, int i2) {
        if (this.e != null) {
            int i3 = this.a;
            if ((i3 / 2) + i <= bArr.length) {
                if ((i3 / 2) + i2 <= bArr2.length) {
                    boolean z = this.j;
                    t(bArr, i);
                    long[][] jArr = this.e;
                    if (z) {
                        j(jArr);
                    } else {
                        i(jArr);
                    }
                    r(bArr2, i2);
                    return this.a / 2;
                }
                throw new OutputLengthException("output buffer too short");
            }
            throw new DataLengthException("input buffer too short");
        }
        throw new IllegalStateException("Rijndael engine not initialised");
    }

    @Override // defpackage.xc0
    public String getAlgorithmName() {
        return "Rijndael";
    }

    @Override // defpackage.xc0
    public void init(boolean z, v71 v71Var) {
        if (v71Var instanceof lf5) {
            this.e = k(((lf5) v71Var).a());
            this.j = z;
            return;
        }
        throw new IllegalArgumentException("invalid parameter passed to Rijndael init - " + v71Var.getClass().getName());
    }

    public pm9(int i) {
        if (i == 128) {
            this.a = 32;
            this.b = 4294967295L;
            this.k = r[0];
            this.l = s[0];
        } else if (i == 160) {
            this.a = 40;
            this.b = 1099511627775L;
            this.k = r[1];
            this.l = s[1];
        } else if (i == 192) {
            this.a = 48;
            this.b = 281474976710655L;
            this.k = r[2];
            this.l = s[2];
        } else if (i == 224) {
            this.a = 56;
            this.b = 72057594037927935L;
            this.k = r[3];
            this.l = s[3];
        } else if (i != 256) {
            throw new IllegalArgumentException("unknown blocksize to Rijndael");
        } else {
            this.a = 64;
            this.b = -1L;
            this.k = r[4];
            this.l = s[4];
        }
        this.d = i;
    }

    @Override // defpackage.xc0
    public void reset() {
    }
}
