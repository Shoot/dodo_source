package defpackage;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
/* renamed from: s82  reason: default package */
/* loaded from: classes3.dex */
public class s82 implements xc0 {
    private static final byte[] h = {-88, 67, 95, 6, 107, 117, 108, 89, 113, -33, -121, -107, 23, -16, -40, 9, 109, -13, 29, -53, -55, 77, 44, -81, 121, -32, -105, -3, 111, 75, 69, 57, 62, -35, -93, 79, -76, -74, -102, 14, 31, -65, 21, -31, 73, -46, -109, -58, -110, 114, -98, 97, -47, 99, -6, -18, -12, 25, -43, -83, 88, -92, -69, -95, -36, -14, -125, 55, 66, -28, 122, 50, -100, -52, -85, 74, -113, 110, 4, 39, 46, -25, -30, 90, -106, 22, 35, 43, -62, 101, 102, 15, -68, -87, 71, 65, 52, 72, -4, -73, 106, -120, -91, 83, -122, -7, 91, -37, 56, 123, -61, 30, 34, 51, 36, 40, 54, -57, -78, 59, -114, 119, -70, -11, 20, -97, 8, 85, -101, 76, -2, 96, 92, -38, 24, 70, -51, 125, 33, -80, 63, 27, -119, -1, -21, -124, 105, 58, -99, -41, -45, 112, 103, 64, -75, -34, 93, 48, -111, -79, 120, 17, 1, -27, 0, 104, -104, -96, -59, 2, -90, 116, 45, 11, -94, 118, -77, -66, -50, -67, -82, -23, -118, 49, 28, -20, -15, -103, -108, -86, -10, 38, 47, -17, -24, -116, 53, 3, -44, Byte.MAX_VALUE, -5, 5, -63, 94, -112, 32, 61, -126, -9, -22, 10, 13, 126, -8, 80, 26, -60, 7, 87, -72, 60, 98, -29, -56, -84, 82, 100, 16, -48, -39, 19, 12, 18, 41, 81, -71, -49, -42, 115, -115, -127, 84, -64, -19, 78, 68, -89, 42, -123, 37, -26, -54, 124, -117, 86, Byte.MIN_VALUE};
    private static final byte[] i = {-50, -69, -21, -110, -22, -53, 19, -63, -23, 58, -42, -78, -46, -112, 23, -8, 66, 21, 86, -76, 101, 28, -120, 67, -59, 92, 54, -70, -11, 87, 103, -115, 49, -10, 100, 88, -98, -12, 34, -86, 117, 15, 2, -79, -33, 109, 115, 77, 124, 38, 46, -9, 8, 93, 68, 62, -97, 20, -56, -82, 84, 16, -40, -68, 26, 107, 105, -13, -67, 51, -85, -6, -47, -101, 104, 78, 22, -107, -111, -18, 76, 99, -114, 91, -52, 60, 25, -95, -127, 73, 123, -39, 111, 55, 96, -54, -25, 43, 72, -3, -106, 69, -4, 65, 18, 13, 121, -27, -119, -116, -29, 32, 48, -36, -73, 108, 74, -75, 63, -105, -44, 98, 45, 6, -92, -91, -125, 95, 42, -38, -55, 0, 126, -94, 85, -65, 17, -43, -100, -49, 14, 10, 61, 81, 125, -109, 27, -2, -60, 71, 9, -122, 11, -113, -99, 106, 7, -71, -80, -104, 24, 50, 113, 75, -17, 59, 112, -96, -28, 64, -1, -61, -87, -26, 120, -7, -117, 70, Byte.MIN_VALUE, 30, 56, -31, -72, -88, -32, 12, 35, 118, 29, 37, 36, 5, -15, 110, -108, 40, -102, -124, -24, -93, 79, 119, -45, -123, -30, 82, -14, -126, 80, 122, 47, 116, 83, -77, 97, -81, 57, 53, -34, -51, 31, -103, -84, -83, 114, 44, -35, -48, -121, -66, 94, -90, -20, 4, -58, 3, 52, -5, -37, 89, -74, -62, 1, -16, 90, -19, -89, 102, 33, Byte.MAX_VALUE, -118, 39, -57, -64, 41, -41};
    private static final byte[] j = {-109, -39, -102, -75, -104, 34, 69, -4, -70, 106, -33, 2, -97, -36, 81, 89, 74, 23, 43, -62, -108, -12, -69, -93, 98, -28, 113, -44, -51, 112, 22, -31, 73, 60, -64, -40, 92, -101, -83, -123, 83, -95, 122, -56, 45, -32, -47, 114, -90, 44, -60, -29, 118, 120, -73, -76, 9, 59, 14, 65, 76, -34, -78, -112, 37, -91, -41, 3, 17, 0, -61, 46, -110, -17, 78, 18, -99, 125, -53, 53, 16, -43, 79, -98, 77, -87, 85, -58, -48, 123, 24, -105, -45, 54, -26, 72, 86, -127, -113, 119, -52, -100, -71, -30, -84, -72, 47, 21, -92, 124, -38, 56, 30, 11, 5, -42, 20, 110, 108, 126, 102, -3, -79, -27, 96, -81, 94, 51, -121, -55, -16, 93, 109, 63, -120, -115, -57, -9, 29, -23, -20, -19, Byte.MIN_VALUE, 41, 39, -49, -103, -88, 80, 15, 55, 36, 40, 48, -107, -46, 62, 91, 64, -125, -77, 105, 87, 31, 7, 28, -118, -68, 32, -21, -50, -114, -85, -18, 49, -94, 115, -7, -54, 58, 26, -5, 13, -63, -2, -6, -14, 111, -67, -106, -35, 67, 82, -74, 8, -13, -82, -66, 25, -119, 50, 38, -80, -22, 75, 100, -124, -126, 107, -11, 121, -65, 1, 95, 117, 99, 27, 35, 61, 104, 42, 101, -24, -111, -10, -1, 19, 88, -15, 71, 10, Byte.MAX_VALUE, -59, -89, -25, 97, 90, 6, 70, 68, 66, 4, -96, -37, 57, -122, 84, -86, -116, 52, 33, -117, -8, 12, 116, 103};
    private static final byte[] k = {104, -115, -54, 77, 115, 75, 78, 42, -44, 82, 38, -77, 84, 30, 25, 31, 34, 3, 70, 61, 45, 74, 83, -125, 19, -118, -73, -43, 37, 121, -11, -67, 88, 47, 13, 2, -19, 81, -98, 17, -14, 62, 85, 94, -47, 22, 60, 102, 112, 93, -13, 69, 64, -52, -24, -108, 86, 8, -50, 26, 58, -46, -31, -33, -75, 56, 110, 14, -27, -12, -7, -122, -23, 79, -42, -123, 35, -49, 50, -103, 49, 20, -82, -18, -56, 72, -45, 48, -95, -110, 65, -79, 24, -60, 44, 113, 114, 68, 21, -3, 55, -66, 95, -86, -101, -120, -40, -85, -119, -100, -6, 96, -22, -68, 98, 12, 36, -90, -88, -20, 103, 32, -37, 124, 40, -35, -84, 91, 52, 126, 16, -15, 123, -113, 99, -96, 5, -102, 67, 119, 33, -65, 39, 9, -61, -97, -74, -41, 41, -62, -21, -64, -92, -117, -116, 29, -5, -1, -63, -78, -105, 46, -8, 101, -10, 117, 7, 4, 73, 51, -28, -39, -71, -48, 66, -57, 108, -112, 0, -114, 111, 80, 1, -59, -38, 71, 63, -51, 105, -94, -30, 122, -89, -58, -109, 15, 10, 6, -26, 43, -106, -93, 28, -81, 106, 18, -124, 57, -25, -80, -126, -9, -2, -99, -121, 92, -127, 53, -34, -76, -91, -4, Byte.MIN_VALUE, -17, -53, -69, 107, 118, -70, 90, 125, 120, 11, -107, -29, -83, 116, -104, 59, 54, 100, 109, -36, -16, 89, -87, 76, 23, Byte.MAX_VALUE, -111, -72, -55, 87, 27, -32, 97};
    private static final byte[] l = {-92, -94, -87, -59, 78, -55, 3, -39, 126, 15, -46, -83, -25, -45, 39, 91, -29, -95, -24, -26, 124, 42, 85, 12, -122, 57, -41, -115, -72, 18, 111, 40, -51, -118, 112, 86, 114, -7, -65, 79, 115, -23, -9, 87, 22, -84, 80, -64, -99, -73, 71, 113, 96, -60, 116, 67, 108, 31, -109, 119, -36, -50, 32, -116, -103, 95, 68, 1, -11, 30, -121, 94, 97, 44, 75, 29, -127, 21, -12, 35, -42, -22, -31, 103, -15, Byte.MAX_VALUE, -2, -38, 60, 7, 83, 106, -124, -100, -53, 2, -125, 51, -35, 53, -30, 89, 90, -104, -91, -110, 100, 4, 6, 16, 77, 28, -105, 8, 49, -18, -85, 5, -81, 121, -96, 24, 70, 109, -4, -119, -44, -57, -1, -16, -49, 66, -111, -8, 104, 10, 101, -114, -74, -3, -61, -17, 120, 76, -52, -98, 48, 46, -68, 11, 84, 26, -90, -69, 38, Byte.MIN_VALUE, 72, -108, 50, 125, -89, 63, -82, 34, 61, 102, -86, -10, 0, 93, -67, 74, -32, 59, -76, 23, -117, -97, 118, -80, 36, -102, 37, 99, -37, -21, 122, 62, 92, -77, -79, 41, -14, -54, 88, 110, -40, -88, 47, 117, -33, 20, -5, 19, 73, -120, -78, -20, -28, 52, 45, -106, -58, 58, -19, -107, 14, -27, -123, 107, 64, 33, -101, 9, 25, 43, 82, -34, 69, -93, -6, 81, -62, -75, -47, -112, -71, -13, 55, -63, 13, -70, 65, 17, 56, 123, -66, -48, -43, 105, 54, -56, 98, 27, -126, -113};
    private static final byte[] m = {-125, -14, 42, -21, -23, -65, 123, -100, 52, -106, -115, -104, -71, 105, -116, 41, 61, -120, 104, 6, 57, 17, 76, 14, -96, 86, 64, -110, 21, -68, -77, -36, 111, -8, 38, -70, -66, -67, 49, -5, -61, -2, Byte.MIN_VALUE, 97, -31, 122, 50, -46, 112, 32, -95, 69, -20, -39, 26, 93, -76, -40, 9, -91, 85, -114, 55, 118, -87, 103, 16, 23, 54, 101, -79, -107, 98, 89, 116, -93, 80, 47, 75, -56, -48, -113, -51, -44, 60, -122, 18, 29, 35, -17, -12, 83, 25, 53, -26, Byte.MAX_VALUE, 94, -42, 121, 81, 34, 20, -9, 30, 74, 66, -101, 65, 115, 45, -63, 92, -90, -94, -32, 46, -45, 40, -69, -55, -82, 106, -47, 90, 48, -112, -124, -7, -78, 88, -49, 126, -59, -53, -105, -28, 22, 108, -6, -80, 109, 31, 82, -103, 13, 78, 3, -111, -62, 77, 100, 119, -97, -35, -60, 73, -118, -102, 36, 56, -89, 87, -123, -57, 124, 125, -25, -10, -73, -84, 39, 70, -34, -33, 59, -41, -98, 43, 11, -43, 19, 117, -16, 114, -74, -99, 27, 1, 63, 68, -27, -121, -3, 7, -15, -85, -108, 24, -22, -4, 58, -126, 95, 5, 84, -37, 0, -117, -29, 72, 12, -54, 120, -119, 10, -1, 62, 91, -127, -18, 113, -30, -38, 44, -72, -75, -52, 110, -88, 107, -83, 96, -58, 8, 4, 2, -24, -11, 79, -92, -13, -64, -50, 67, 37, 28, 33, 51, 15, -81, 71, -19, 102, 99, -109, -86};
    private static final byte[] n = {69, -44, 11, 67, -15, 114, -19, -92, -62, 56, -26, 113, -3, -74, 58, -107, 80, 68, 75, -30, 116, 107, 30, 17, 90, -58, -76, -40, -91, -118, 112, -93, -88, -6, 5, -39, -105, 64, -55, -112, -104, -113, -36, 18, 49, 44, 71, 106, -103, -82, -56, Byte.MAX_VALUE, -7, 79, 93, -106, 111, -12, -77, 57, 33, -38, -100, -123, -98, 59, -16, -65, -17, 6, -18, -27, 95, 32, 16, -52, 60, 84, 74, 82, -108, 14, -64, 40, -10, 86, 96, -94, -29, 15, -20, -99, 36, -125, 126, -43, 124, -21, 24, -41, -51, -35, 120, -1, -37, -95, 9, -48, 118, -124, 117, -69, 29, 26, 47, -80, -2, -42, 52, 99, 53, -46, 42, 89, 109, 77, 119, -25, -114, 97, -49, -97, -50, 39, -11, Byte.MIN_VALUE, -122, -57, -90, -5, -8, -121, -85, 98, 63, -33, 72, 0, 20, -102, -67, 91, 4, -110, 2, 37, 101, 76, 83, 12, -14, 41, -81, 23, 108, 65, 48, -23, -109, 85, -9, -84, 104, 38, -60, 125, -54, 122, 62, -96, 55, 3, -63, 54, 105, 102, 8, 22, -89, -68, -59, -45, 34, -73, 19, 70, 50, -24, 87, -120, 43, -127, -78, 78, 100, 28, -86, -111, 88, 46, -101, 92, 27, 81, 115, 66, 35, 1, 110, -13, 13, -66, 61, 10, 45, 31, 103, 51, 25, 123, 94, -22, -34, -117, -53, -87, -116, -115, -83, 73, -126, -28, -70, -61, 21, -47, -32, -119, -4, -79, -71, -75, 7, 121, -72, -31};
    private static final byte[] o = {-78, -74, 35, 17, -89, -120, -59, -90, 57, -113, -60, -24, 115, 34, 67, -61, -126, 39, -51, 24, 81, 98, 45, -9, 92, 14, 59, -3, -54, -101, 13, 15, 121, -116, 16, 76, 116, 28, 10, -114, 124, -108, 7, -57, 94, 20, -95, 33, 87, 80, 78, -87, Byte.MIN_VALUE, -39, -17, 100, 65, -49, 60, -18, 46, 19, 41, -70, 52, 90, -82, -118, 97, 51, 18, -71, 85, -88, 21, 5, -10, 3, 6, 73, -75, 37, 9, 22, 12, 42, 56, -4, 32, -12, -27, Byte.MAX_VALUE, -41, 49, 43, 102, 111, -1, 114, -122, -16, -93, 47, 120, 0, -68, -52, -30, -80, -15, 66, -76, 48, 95, 96, 4, -20, -91, -29, -117, -25, 29, -65, -124, 123, -26, -127, -8, -34, -40, -46, 23, -50, 75, 71, -42, 105, 108, 25, -103, -102, 1, -77, -123, -79, -7, 89, -62, 55, -23, -56, -96, -19, 79, -119, 104, 109, -43, 38, -111, -121, 88, -67, -55, -104, -36, 117, -64, 118, -11, 103, 107, 126, -21, 82, -53, -47, 91, -97, 11, -37, 64, -110, 26, -6, -84, -28, -31, 113, 31, 101, -115, -105, -98, -107, -112, 93, -73, -63, -81, 84, -5, 2, -32, 53, -69, 58, 77, -83, 44, 61, 86, 8, 27, 74, -109, 106, -85, -72, 122, -14, 125, -38, 63, -2, 62, -66, -22, -86, 68, -58, -48, 54, 72, 112, -106, 119, 36, 83, -33, -13, -125, 40, 50, 69, 30, -92, -45, -94, 70, 110, -100, -35, 99, -44, -99};
    private long[] a;
    private long[] b;
    private long[][] c;
    private int d;
    private int e;
    private int f;
    private boolean g;

    public s82(int i2) throws IllegalArgumentException {
        if (i2 != 128 && i2 != 256 && i2 != 512) {
            throw new IllegalArgumentException("unsupported block length: only 128/256/512 are allowed");
        }
        int i3 = i2 >>> 6;
        this.d = i3;
        this.a = new long[i3];
    }

    private void c(int i2) {
        long[] jArr = this.c[i2];
        for (int i3 = 0; i3 < this.d; i3++) {
            long[] jArr2 = this.a;
            jArr2[i3] = jArr2[i3] + jArr[i3];
        }
    }

    private void d(byte[] bArr, int i2, byte[] bArr2, int i3) {
        long p = mo7.p(bArr, i2);
        long p2 = mo7.p(bArr, i2 + 8);
        long[][] jArr = this.c;
        int i4 = this.f;
        long[] jArr2 = jArr[i4];
        long j2 = p - jArr2[0];
        long j3 = p2 - jArr2[1];
        while (true) {
            long i5 = i(j2);
            long i6 = i(j3);
            int i7 = (int) i5;
            int i8 = (int) (i5 >>> 32);
            int i9 = (int) i6;
            int i10 = (int) (i6 >>> 32);
            byte[] bArr3 = l;
            byte b = bArr3[i7 & 255];
            byte[] bArr4 = m;
            byte b2 = bArr4[(i7 >>> 8) & 255];
            byte[] bArr5 = n;
            byte b3 = bArr5[(i7 >>> 16) & 255];
            byte[] bArr6 = o;
            int i11 = (bArr6[i7 >>> 24] << 24) | ((b3 & 255) << 16) | (b & 255) | ((b2 & 255) << 8);
            byte b4 = bArr3[i10 & 255];
            byte b5 = bArr4[(i10 >>> 8) & 255];
            byte b6 = bArr5[(i10 >>> 16) & 255];
            long j4 = (((bArr6[i10 >>> 24] << 24) | (((b4 & 255) | ((b5 & 255) << 8)) | ((b6 & 255) << 16))) << 32) | (i11 & 4294967295L);
            int i12 = (bArr6[i9 >>> 24] << 24) | (bArr3[i9 & 255] & 255) | ((bArr4[(i9 >>> 8) & 255] & 255) << 8) | ((bArr5[(i9 >>> 16) & 255] & 255) << 16);
            byte b7 = bArr3[i8 & 255];
            byte b8 = bArr4[(i8 >>> 8) & 255];
            byte b9 = bArr5[(i8 >>> 16) & 255];
            long j5 = (((bArr6[i8 >>> 24] << 24) | (((b7 & 255) | ((b8 & 255) << 8)) | ((b9 & 255) << 16))) << 32) | (i12 & 4294967295L);
            i4--;
            if (i4 == 0) {
                long[] jArr3 = this.c[0];
                mo7.v(j4 - jArr3[0], bArr2, i3);
                mo7.v(j5 - jArr3[1], bArr2, i3 + 8);
                return;
            }
            long[] jArr4 = this.c[i4];
            long j6 = j4 ^ jArr4[0];
            long j7 = j5 ^ jArr4[1];
            j2 = j6;
            j3 = j7;
        }
    }

    private void e(byte[] bArr, int i2, byte[] bArr2, int i3) {
        long p = mo7.p(bArr, i2);
        long p2 = mo7.p(bArr, i2 + 8);
        long[] jArr = this.c[0];
        long j2 = p + jArr[0];
        long j3 = p2 + jArr[1];
        int i4 = 0;
        while (true) {
            int i5 = (int) j2;
            int i6 = (int) (j2 >>> 32);
            int i7 = (int) j3;
            int i8 = (int) (j3 >>> 32);
            byte[] bArr3 = h;
            byte b = bArr3[i5 & 255];
            byte[] bArr4 = i;
            byte b2 = bArr4[(i5 >>> 8) & 255];
            byte[] bArr5 = j;
            byte b3 = bArr5[(i5 >>> 16) & 255];
            byte[] bArr6 = k;
            int i9 = ((b3 & 255) << 16) | (b & 255) | ((b2 & 255) << 8) | (bArr6[i5 >>> 24] << 24);
            byte b4 = bArr3[i8 & 255];
            byte b5 = bArr4[(i8 >>> 8) & 255];
            byte b6 = bArr5[(i8 >>> 16) & 255];
            long j4 = (((bArr6[i8 >>> 24] << 24) | (((b4 & 255) | ((b5 & 255) << 8)) | ((b6 & 255) << 16))) << 32) | (i9 & 4294967295L);
            byte b7 = bArr3[i7 & 255];
            byte b8 = bArr4[(i7 >>> 8) & 255];
            byte b9 = bArr5[(i7 >>> 16) & 255];
            int i10 = (bArr6[i7 >>> 24] << 24) | (b7 & 255) | ((b8 & 255) << 8) | ((b9 & 255) << 16);
            byte b10 = bArr3[i6 & 255];
            byte b11 = bArr4[(i6 >>> 8) & 255];
            byte b12 = bArr5[(i6 >>> 16) & 255];
            long h2 = h(j4);
            long h3 = h((((bArr6[i6 >>> 24] << 24) | (((b10 & 255) | ((b11 & 255) << 8)) | ((b12 & 255) << 16))) << 32) | (i10 & 4294967295L));
            i4++;
            int i11 = this.f;
            if (i4 == i11) {
                long[] jArr2 = this.c[i11];
                mo7.v(h2 + jArr2[0], bArr2, i3);
                mo7.v(h3 + jArr2[1], bArr2, i3 + 8);
                return;
            }
            long[] jArr3 = this.c[i4];
            long j5 = h2 ^ jArr3[0];
            j3 = h3 ^ jArr3[1];
            j2 = j5;
        }
    }

    private void f() {
        int i2 = this.d;
        if (i2 != 2) {
            if (i2 != 4) {
                if (i2 == 8) {
                    long[] jArr = this.a;
                    long j2 = jArr[0];
                    long j3 = jArr[1];
                    long j4 = jArr[2];
                    long j5 = jArr[3];
                    long j6 = jArr[4];
                    long j7 = jArr[5];
                    long j8 = jArr[6];
                    long j9 = jArr[7];
                    long j10 = (j2 ^ j3) & (-71777214294589696L);
                    long j11 = j2 ^ j10;
                    long j12 = j3 ^ j10;
                    long j13 = (j4 ^ j5) & (-71777214294589696L);
                    long j14 = j4 ^ j13;
                    long j15 = j5 ^ j13;
                    long j16 = (j6 ^ j7) & (-71777214294589696L);
                    long j17 = j6 ^ j16;
                    long j18 = j7 ^ j16;
                    long j19 = (j8 ^ j9) & (-71777214294589696L);
                    long j20 = j8 ^ j19;
                    long j21 = j9 ^ j19;
                    long j22 = (j11 ^ j14) & (-281470681808896L);
                    long j23 = j11 ^ j22;
                    long j24 = j14 ^ j22;
                    long j25 = (j12 ^ j15) & 72056494543077120L;
                    long j26 = j12 ^ j25;
                    long j27 = j15 ^ j25;
                    long j28 = (j17 ^ j20) & (-281470681808896L);
                    long j29 = j17 ^ j28;
                    long j30 = j20 ^ j28;
                    long j31 = (j18 ^ j21) & 72056494543077120L;
                    long j32 = j18 ^ j31;
                    long j33 = j21 ^ j31;
                    long j34 = (j23 ^ j29) & (-4294967296L);
                    long j35 = j23 ^ j34;
                    long j36 = j29 ^ j34;
                    long j37 = (j26 ^ j32) & 72057594021150720L;
                    long j38 = j26 ^ j37;
                    long j39 = (j24 ^ j30) & 281474976645120L;
                    long j40 = j24 ^ j39;
                    long j41 = j39 ^ j30;
                    long j42 = (j27 ^ j33) & 1099511627520L;
                    jArr[0] = j35;
                    jArr[1] = j38;
                    jArr[2] = j40;
                    jArr[3] = j27 ^ j42;
                    jArr[4] = j36;
                    jArr[5] = j32 ^ j37;
                    jArr[6] = j41;
                    jArr[7] = j33 ^ j42;
                    return;
                }
                throw new IllegalStateException("unsupported block length: only 128/256/512 are allowed");
            }
            long[] jArr2 = this.a;
            long j43 = jArr2[0];
            long j44 = jArr2[1];
            long j45 = jArr2[2];
            long j46 = jArr2[3];
            long j47 = (j43 ^ j44) & (-281470681808896L);
            long j48 = j43 ^ j47;
            long j49 = j44 ^ j47;
            long j50 = (j45 ^ j46) & (-281470681808896L);
            long j51 = j45 ^ j50;
            long j52 = j46 ^ j50;
            long j53 = (j48 ^ j51) & (-4294967296L);
            long j54 = j48 ^ j53;
            long j55 = (j49 ^ j52) & 281474976645120L;
            jArr2[0] = j54;
            jArr2[1] = j49 ^ j55;
            jArr2[2] = j51 ^ j53;
            jArr2[3] = j55 ^ j52;
            return;
        }
        long[] jArr3 = this.a;
        long j56 = jArr3[0];
        long j57 = jArr3[1];
        long j58 = (-4294967296L) & (j56 ^ j57);
        jArr3[0] = j56 ^ j58;
        jArr3[1] = j58 ^ j57;
    }

    private void g() {
        for (int i2 = 0; i2 < this.d; i2++) {
            long[] jArr = this.a;
            long j2 = jArr[i2];
            int i3 = (int) j2;
            int i4 = (int) (j2 >>> 32);
            byte[] bArr = l;
            byte b = bArr[i3 & 255];
            byte[] bArr2 = m;
            byte b2 = bArr2[(i3 >>> 8) & 255];
            byte[] bArr3 = n;
            byte b3 = bArr3[(i3 >>> 16) & 255];
            byte[] bArr4 = o;
            jArr[i2] = (((bArr4[i3 >>> 24] << 24) | (b & 255) | ((b2 & 255) << 8) | ((b3 & 255) << 16)) & 4294967295L) | (((((bArr[i4 & 255] & 255) | ((bArr2[(i4 >>> 8) & 255] & 255) << 8)) | ((bArr3[(i4 >>> 16) & 255] & 255) << 16)) | (bArr4[i4 >>> 24] << 24)) << 32);
        }
    }

    private static long h(long j2) {
        long l2 = l(j2);
        long n2 = n(8, j2) ^ j2;
        long n3 = (n2 ^ n(16, n2)) ^ n(48, j2);
        return ((n(32, m((j2 ^ n3) ^ l2)) ^ n3) ^ n(40, l2)) ^ n(48, l2);
    }

    private static long i(long j2) {
        long n2 = n(8, j2) ^ j2;
        long n3 = (n2 ^ n(32, n2)) ^ n(48, j2);
        long j3 = n3 ^ j2;
        long n4 = n(48, j2);
        long n5 = n(56, j2);
        long n6 = n(16, n3);
        return l(n(40, ((j2 ^ n(32, j3)) ^ n5) ^ l(((n4 ^ (n(24, j2) ^ j3)) ^ n5) ^ l(l(l(n(40, l(l(j3 ^ n5) ^ n(56, j3)) ^ j2) ^ (n(16, j3) ^ j2)) ^ (j3 ^ n4)) ^ n6)))) ^ n3;
    }

    private void j() {
        for (int i2 = 0; i2 < this.d; i2++) {
            long[] jArr = this.a;
            jArr[i2] = h(jArr[i2]);
        }
    }

    private void k() {
        for (int i2 = 0; i2 < this.d; i2++) {
            long[] jArr = this.a;
            jArr[i2] = i(jArr[i2]);
        }
    }

    private static long l(long j2) {
        return (((j2 & (-9187201950435737472L)) >>> 7) * 29) ^ ((9187201950435737471L & j2) << 1);
    }

    private static long m(long j2) {
        return (((j2 & 4629771061636907072L) >>> 6) * 29) ^ (((4557430888798830399L & j2) << 2) ^ ((((-9187201950435737472L) & j2) >>> 6) * 29));
    }

    private static long n(int i2, long j2) {
        return (j2 << (-i2)) | (j2 >>> i2);
    }

    private void o(long[] jArr, long[] jArr2) {
        int i2 = this.d;
        if (i2 != 2) {
            if (i2 != 4) {
                if (i2 == 8) {
                    long j2 = jArr[0];
                    long j3 = jArr[1];
                    long j4 = jArr[2];
                    long j5 = jArr[3];
                    long j6 = jArr[4];
                    long j7 = jArr[5];
                    long j8 = jArr[6];
                    long j9 = jArr[7];
                    jArr2[0] = (j4 >>> 24) | (j5 << 40);
                    jArr2[1] = (j5 >>> 24) | (j6 << 40);
                    jArr2[2] = (j6 >>> 24) | (j7 << 40);
                    jArr2[3] = (j7 >>> 24) | (j8 << 40);
                    jArr2[4] = (j8 >>> 24) | (j9 << 40);
                    jArr2[5] = (j9 >>> 24) | (j2 << 40);
                    jArr2[6] = (j2 >>> 24) | (j3 << 40);
                    jArr2[7] = (j3 >>> 24) | (j4 << 40);
                    return;
                }
                throw new IllegalStateException("unsupported block length: only 128/256/512 are allowed");
            }
            long j10 = jArr[0];
            long j11 = jArr[1];
            long j12 = jArr[2];
            long j13 = jArr[3];
            jArr2[0] = (j11 >>> 24) | (j12 << 40);
            jArr2[1] = (j12 >>> 24) | (j13 << 40);
            jArr2[2] = (j13 >>> 24) | (j10 << 40);
            jArr2[3] = (j10 >>> 24) | (j11 << 40);
            return;
        }
        long j14 = jArr[0];
        long j15 = jArr[1];
        jArr2[0] = (j14 >>> 56) | (j15 << 8);
        jArr2[1] = (j14 << 8) | (j15 >>> 56);
    }

    private void p() {
        int i2 = this.d;
        if (i2 != 2) {
            if (i2 != 4) {
                if (i2 == 8) {
                    long[] jArr = this.a;
                    long j2 = jArr[0];
                    long j3 = jArr[1];
                    long j4 = jArr[2];
                    long j5 = jArr[3];
                    long j6 = jArr[4];
                    long j7 = jArr[5];
                    long j8 = jArr[6];
                    long j9 = jArr[7];
                    long j10 = (j2 ^ j6) & (-4294967296L);
                    long j11 = j2 ^ j10;
                    long j12 = j6 ^ j10;
                    long j13 = (j3 ^ j7) & 72057594021150720L;
                    long j14 = j3 ^ j13;
                    long j15 = j7 ^ j13;
                    long j16 = (j4 ^ j8) & 281474976645120L;
                    long j17 = j4 ^ j16;
                    long j18 = j8 ^ j16;
                    long j19 = (j5 ^ j9) & 1099511627520L;
                    long j20 = j5 ^ j19;
                    long j21 = j9 ^ j19;
                    long j22 = (j11 ^ j17) & (-281470681808896L);
                    long j23 = j11 ^ j22;
                    long j24 = j17 ^ j22;
                    long j25 = (j14 ^ j20) & 72056494543077120L;
                    long j26 = j14 ^ j25;
                    long j27 = j20 ^ j25;
                    long j28 = (j12 ^ j18) & (-281470681808896L);
                    long j29 = j12 ^ j28;
                    long j30 = j18 ^ j28;
                    long j31 = (j15 ^ j21) & 72056494543077120L;
                    long j32 = j15 ^ j31;
                    long j33 = j21 ^ j31;
                    long j34 = (j23 ^ j26) & (-71777214294589696L);
                    long j35 = j23 ^ j34;
                    long j36 = j26 ^ j34;
                    long j37 = (j24 ^ j27) & (-71777214294589696L);
                    long j38 = j24 ^ j37;
                    long j39 = j27 ^ j37;
                    long j40 = (j29 ^ j32) & (-71777214294589696L);
                    long j41 = j29 ^ j40;
                    long j42 = j32 ^ j40;
                    long j43 = (j30 ^ j33) & (-71777214294589696L);
                    jArr[0] = j35;
                    jArr[1] = j36;
                    jArr[2] = j38;
                    jArr[3] = j39;
                    jArr[4] = j41;
                    jArr[5] = j42;
                    jArr[6] = j30 ^ j43;
                    jArr[7] = j33 ^ j43;
                    return;
                }
                throw new IllegalStateException("unsupported block length: only 128/256/512 are allowed");
            }
            long[] jArr2 = this.a;
            long j44 = jArr2[0];
            long j45 = jArr2[1];
            long j46 = jArr2[2];
            long j47 = jArr2[3];
            long j48 = (j44 ^ j46) & (-4294967296L);
            long j49 = j44 ^ j48;
            long j50 = j46 ^ j48;
            long j51 = (j45 ^ j47) & 281474976645120L;
            long j52 = j45 ^ j51;
            long j53 = j47 ^ j51;
            long j54 = (j49 ^ j52) & (-281470681808896L);
            long j55 = (j50 ^ j53) & (-281470681808896L);
            jArr2[0] = j49 ^ j54;
            jArr2[1] = j52 ^ j54;
            jArr2[2] = j50 ^ j55;
            jArr2[3] = j53 ^ j55;
            return;
        }
        long[] jArr3 = this.a;
        long j56 = jArr3[0];
        long j57 = jArr3[1];
        long j58 = (-4294967296L) & (j56 ^ j57);
        jArr3[0] = j56 ^ j58;
        jArr3[1] = j58 ^ j57;
    }

    private void q() {
        for (int i2 = 0; i2 < this.d; i2++) {
            long[] jArr = this.a;
            long j2 = jArr[i2];
            int i3 = (int) j2;
            int i4 = (int) (j2 >>> 32);
            byte[] bArr = h;
            byte b = bArr[i3 & 255];
            byte[] bArr2 = i;
            byte b2 = bArr2[(i3 >>> 8) & 255];
            byte[] bArr3 = j;
            byte b3 = bArr3[(i3 >>> 16) & 255];
            byte[] bArr4 = k;
            jArr[i2] = (((bArr4[i3 >>> 24] << 24) | (b & 255) | ((b2 & 255) << 8) | ((b3 & 255) << 16)) & 4294967295L) | (((((bArr[i4 & 255] & 255) | ((bArr2[(i4 >>> 8) & 255] & 255) << 8)) | ((bArr3[(i4 >>> 16) & 255] & 255) << 16)) | (bArr4[i4 >>> 24] << 24)) << 32);
        }
    }

    private void r(int i2) {
        long[] jArr = this.c[i2];
        for (int i3 = 0; i3 < this.d; i3++) {
            long[] jArr2 = this.a;
            jArr2[i3] = jArr2[i3] - jArr[i3];
        }
    }

    private void s(long[] jArr, long[] jArr2) {
        int i2;
        int i3;
        int i4 = this.e;
        long[] jArr3 = new long[i4];
        long[] jArr4 = new long[this.d];
        System.arraycopy(jArr, 0, jArr3, 0, i4);
        long j2 = 281479271743489L;
        int i5 = 0;
        while (true) {
            for (int i6 = 0; i6 < this.d; i6++) {
                jArr4[i6] = jArr2[i6] + j2;
            }
            for (int i7 = 0; i7 < this.d; i7++) {
                this.a[i7] = jArr3[i7] + jArr4[i7];
            }
            q();
            p();
            j();
            for (int i8 = 0; i8 < this.d; i8++) {
                long[] jArr5 = this.a;
                jArr5[i8] = jArr5[i8] ^ jArr4[i8];
            }
            q();
            p();
            j();
            int i9 = 0;
            while (true) {
                i2 = this.d;
                if (i9 >= i2) {
                    break;
                }
                long[] jArr6 = this.a;
                jArr6[i9] = jArr6[i9] + jArr4[i9];
                i9++;
            }
            System.arraycopy(this.a, 0, this.c[i5], 0, i2);
            if (this.f != i5) {
                if (this.d != this.e) {
                    i5 += 2;
                    j2 <<= 1;
                    for (int i10 = 0; i10 < this.d; i10++) {
                        jArr4[i10] = jArr2[i10] + j2;
                    }
                    int i11 = 0;
                    while (true) {
                        int i12 = this.d;
                        if (i11 >= i12) {
                            break;
                        }
                        this.a[i11] = jArr3[i12 + i11] + jArr4[i11];
                        i11++;
                    }
                    q();
                    p();
                    j();
                    for (int i13 = 0; i13 < this.d; i13++) {
                        long[] jArr7 = this.a;
                        jArr7[i13] = jArr7[i13] ^ jArr4[i13];
                    }
                    q();
                    p();
                    j();
                    int i14 = 0;
                    while (true) {
                        i3 = this.d;
                        if (i14 >= i3) {
                            break;
                        }
                        long[] jArr8 = this.a;
                        jArr8[i14] = jArr8[i14] + jArr4[i14];
                        i14++;
                    }
                    System.arraycopy(this.a, 0, this.c[i5], 0, i3);
                    if (this.f == i5) {
                        return;
                    }
                }
                i5 += 2;
                j2 <<= 1;
                long j3 = jArr3[0];
                for (int i15 = 1; i15 < i4; i15++) {
                    jArr3[i15 - 1] = jArr3[i15];
                }
                jArr3[i4 - 1] = j3;
            } else {
                return;
            }
        }
    }

    private void t(long[] jArr, long[] jArr2) {
        int i2 = this.d;
        long[] jArr3 = new long[i2];
        long[] jArr4 = new long[i2];
        long[] jArr5 = new long[i2];
        this.a = jArr5;
        long j2 = jArr5[0];
        int i3 = this.e;
        jArr5[0] = j2 + i2 + i3 + 1;
        System.arraycopy(jArr, 0, jArr3, 0, i2);
        if (i2 == i3) {
            System.arraycopy(jArr, 0, jArr4, 0, i2);
        } else {
            int i4 = this.d;
            System.arraycopy(jArr, i4, jArr4, 0, i4);
        }
        int i5 = 0;
        while (true) {
            long[] jArr6 = this.a;
            if (i5 >= jArr6.length) {
                break;
            }
            jArr6[i5] = jArr6[i5] + jArr3[i5];
            i5++;
        }
        q();
        p();
        j();
        int i6 = 0;
        while (true) {
            long[] jArr7 = this.a;
            if (i6 >= jArr7.length) {
                break;
            }
            jArr7[i6] = jArr7[i6] ^ jArr4[i6];
            i6++;
        }
        q();
        p();
        j();
        int i7 = 0;
        while (true) {
            long[] jArr8 = this.a;
            if (i7 < jArr8.length) {
                jArr8[i7] = jArr8[i7] + jArr3[i7];
                i7++;
            } else {
                q();
                p();
                j();
                System.arraycopy(this.a, 0, jArr2, 0, this.d);
                return;
            }
        }
    }

    private void u() {
        for (int i2 = 1; i2 < this.f; i2 += 2) {
            long[][] jArr = this.c;
            o(jArr[i2 - 1], jArr[i2]);
        }
    }

    private void v(int i2) {
        long[] jArr = this.c[i2];
        for (int i3 = 0; i3 < this.d; i3++) {
            long[] jArr2 = this.a;
            jArr2[i3] = jArr2[i3] ^ jArr[i3];
        }
    }

    @Override // defpackage.xc0
    public int a() {
        return this.d << 3;
    }

    @Override // defpackage.xc0
    public int b(byte[] bArr, int i2, byte[] bArr2, int i3) throws DataLengthException, IllegalStateException {
        int i4;
        if (this.b != null) {
            if (a() + i2 <= bArr.length) {
                if (a() + i3 <= bArr2.length) {
                    int i5 = 0;
                    if (this.g) {
                        if (this.d != 2) {
                            mo7.q(bArr, i2, this.a);
                            c(0);
                            while (true) {
                                q();
                                p();
                                j();
                                i5++;
                                i4 = this.f;
                                if (i5 == i4) {
                                    break;
                                }
                                v(i5);
                            }
                            c(i4);
                            mo7.x(this.a, bArr2, i3);
                        } else {
                            e(bArr, i2, bArr2, i3);
                        }
                    } else if (this.d != 2) {
                        mo7.q(bArr, i2, this.a);
                        r(this.f);
                        int i6 = this.f;
                        while (true) {
                            k();
                            f();
                            g();
                            i6--;
                            if (i6 == 0) {
                                break;
                            }
                            v(i6);
                        }
                        r(0);
                        mo7.x(this.a, bArr2, i3);
                    } else {
                        d(bArr, i2, bArr2, i3);
                    }
                    return a();
                }
                throw new OutputLengthException("Output buffer too short");
            }
            throw new DataLengthException("Input buffer too short");
        }
        throw new IllegalStateException("DSTU7624Engine not initialised");
    }

    @Override // defpackage.xc0
    public String getAlgorithmName() {
        return "DSTU7624";
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x005c A[LOOP:0: B:26:0x0057->B:28:0x005c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065 A[EDGE_INSN: B:37:0x0065->B:29:0x0065 ?: BREAK  , SYNTHETIC] */
    @Override // defpackage.xc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void init(boolean r5, defpackage.v71 r6) throws java.lang.IllegalArgumentException {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.lf5
            if (r0 == 0) goto L8d
            r4.g = r5
            lf5 r6 = (defpackage.lf5) r6
            byte[] r5 = r6.a()
            int r6 = r5.length
            int r6 = r6 << 3
            int r0 = r4.d
            int r0 = r0 << 6
            r1 = 512(0x200, float:7.17E-43)
            r2 = 256(0x100, float:3.59E-43)
            r3 = 128(0x80, float:1.8E-43)
            if (r6 == r3) goto L28
            if (r6 == r2) goto L28
            if (r6 != r1) goto L20
            goto L28
        L20:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "unsupported key length: only 128/256/512 are allowed"
            r5.<init>(r6)
            throw r5
        L28:
            if (r6 == r0) goto L37
            int r0 = r0 * 2
            if (r6 != r0) goto L2f
            goto L37
        L2f:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Unsupported key length"
            r5.<init>(r6)
            throw r5
        L37:
            if (r6 == r3) goto L46
            if (r6 == r2) goto L43
            if (r6 == r1) goto L3e
            goto L49
        L3e:
            r0 = 18
        L40:
            r4.f = r0
            goto L49
        L43:
            r0 = 14
            goto L40
        L46:
            r0 = 10
            goto L40
        L49:
            int r0 = r6 >>> 6
            r4.e = r0
            int r0 = r4.f
            int r0 = r0 + 1
            long[][] r0 = new long[r0]
            r4.c = r0
            r0 = 0
            r1 = 0
        L57:
            long[][] r2 = r4.c
            int r3 = r2.length
            if (r1 >= r3) goto L65
            int r3 = r4.d
            long[] r3 = new long[r3]
            r2[r1] = r3
            int r1 = r1 + 1
            goto L57
        L65:
            int r1 = r4.e
            long[] r1 = new long[r1]
            r4.b = r1
            int r2 = r5.length
            int r6 = r6 >>> 3
            if (r2 != r6) goto L85
            defpackage.mo7.q(r5, r0, r1)
            int r5 = r4.d
            long[] r5 = new long[r5]
            long[] r6 = r4.b
            r4.t(r6, r5)
            long[] r6 = r4.b
            r4.s(r6, r5)
            r4.u()
            return
        L85:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Invalid key parameter passed to DSTU7624Engine init"
            r5.<init>(r6)
            throw r5
        L8d:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Invalid parameter passed to DSTU7624Engine init"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s82.init(boolean, v71):void");
    }

    @Override // defpackage.xc0
    public void reset() {
        tr.C(this.a, 0L);
    }
}
