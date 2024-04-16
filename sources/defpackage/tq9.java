package defpackage;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
/* renamed from: tq9  reason: default package */
/* loaded from: classes3.dex */
public class tq9 implements xc0 {
    private static final byte[] c = {-42, -112, -23, -2, -52, -31, 61, -73, 22, -74, 20, -62, 40, -5, 44, 5, 43, 103, -102, 118, 42, -66, 4, -61, -86, 68, 19, 38, 73, -122, 6, -103, -100, 66, 80, -12, -111, -17, -104, 122, 51, 84, 11, 67, -19, -49, -84, 98, -28, -77, 28, -87, -55, 8, -24, -107, Byte.MIN_VALUE, -33, -108, -6, 117, -113, 63, -90, 71, 7, -89, -4, -13, 115, 23, -70, -125, 89, 60, 25, -26, -123, 79, -88, 104, 107, -127, -78, 113, 100, -38, -117, -8, -21, 15, 75, 112, 86, -99, 53, 30, 36, 14, 94, 99, 88, -47, -94, 37, 34, 124, 59, 1, 33, 120, -121, -44, 0, 70, 87, -97, -45, 39, 82, 76, 54, 2, -25, -96, -60, -56, -98, -22, -65, -118, -46, 64, -57, 56, -75, -93, -9, -14, -50, -7, 97, 21, -95, -32, -82, 93, -92, -101, 52, 26, 85, -83, -109, 50, 48, -11, -116, -79, -29, 29, -10, -30, 46, -126, 102, -54, 96, -64, 41, 35, -85, 13, 83, 78, 111, -43, -37, 55, 69, -34, -3, -114, 47, 3, -1, 106, 114, 109, 108, 91, 81, -115, 27, -81, -110, -69, -35, -68, Byte.MAX_VALUE, 17, -39, 92, 65, 31, 16, 90, -40, 10, -63, 49, -120, -91, -51, 123, -67, 45, 116, -48, 18, -72, -27, -76, -80, -119, 105, -105, 74, 12, -106, 119, 126, 101, -71, -15, 9, -59, 110, -58, -124, 24, -16, 125, -20, 58, -36, 77, 32, 121, -18, 95, 62, -41, -53, 57, 72};
    private static final int[] d = {462357, 472066609, 943670861, 1415275113, 1886879365, -1936483679, -1464879427, -993275175, -521670923, -66909679, 404694573, 876298825, 1347903077, 1819507329, -2003855715, -1532251463, -1060647211, -589042959, -117504499, 337322537, 808926789, 1280531041, 1752135293, -2071227751, -1599623499, -1128019247, -656414995, -184876535, 269950501, 741554753, 1213159005, 1684763257};
    private static final int[] e = {-1548633402, 1453994832, 1736282519, -1301273892};
    private final int[] a = new int[4];
    private int[] b;

    private int c(int[] iArr, int i) {
        return i((iArr[3] ^ (iArr[1] ^ iArr[2])) ^ i) ^ iArr[0];
    }

    private int d(int[] iArr, int i) {
        return i((iArr[0] ^ (iArr[2] ^ iArr[3])) ^ i) ^ iArr[1];
    }

    private int e(int[] iArr, int i) {
        return i((iArr[1] ^ (iArr[3] ^ iArr[0])) ^ i) ^ iArr[2];
    }

    private int f(int[] iArr, int i) {
        return i((iArr[2] ^ (iArr[0] ^ iArr[1])) ^ i) ^ iArr[3];
    }

    private int g(int i) {
        return l(i, 24) ^ (((l(i, 2) ^ i) ^ l(i, 10)) ^ l(i, 18));
    }

    private int h(int i) {
        return l(i, 23) ^ (l(i, 13) ^ i);
    }

    private int i(int i) {
        return g(m(i));
    }

    private int j(int i) {
        return h(m(i));
    }

    private int[] k(boolean z, byte[] bArr) {
        int[] iArr = new int[32];
        int[] iArr2 = {mo7.a(bArr, 0), mo7.a(bArr, 4), mo7.a(bArr, 8), mo7.a(bArr, 12)};
        int i = iArr2[0];
        int[] iArr3 = e;
        int[] iArr4 = {i ^ iArr3[0], iArr2[1] ^ iArr3[1], iArr2[2] ^ iArr3[2], iArr2[3] ^ iArr3[3]};
        if (z) {
            int i2 = iArr4[0];
            int i3 = (iArr4[1] ^ iArr4[2]) ^ iArr4[3];
            int[] iArr5 = d;
            int j = i2 ^ j(i3 ^ iArr5[0]);
            iArr[0] = j;
            int j2 = j((j ^ (iArr4[2] ^ iArr4[3])) ^ iArr5[1]) ^ iArr4[1];
            iArr[1] = j2;
            int j3 = j((j2 ^ (iArr4[3] ^ iArr[0])) ^ iArr5[2]) ^ iArr4[2];
            iArr[2] = j3;
            iArr[3] = j((j3 ^ (iArr[0] ^ iArr[1])) ^ iArr5[3]) ^ iArr4[3];
            for (int i4 = 4; i4 < 32; i4++) {
                iArr[i4] = iArr[i4 - 4] ^ j(((iArr[i4 - 3] ^ iArr[i4 - 2]) ^ iArr[i4 - 1]) ^ d[i4]);
            }
        } else {
            int i5 = iArr4[0];
            int i6 = (iArr4[1] ^ iArr4[2]) ^ iArr4[3];
            int[] iArr6 = d;
            int j4 = i5 ^ j(i6 ^ iArr6[0]);
            iArr[31] = j4;
            int j5 = j((j4 ^ (iArr4[2] ^ iArr4[3])) ^ iArr6[1]) ^ iArr4[1];
            iArr[30] = j5;
            int j6 = j((j5 ^ (iArr4[3] ^ iArr[31])) ^ iArr6[2]) ^ iArr4[2];
            iArr[29] = j6;
            iArr[28] = j((j6 ^ (iArr[31] ^ iArr[30])) ^ iArr6[3]) ^ iArr4[3];
            for (int i7 = 27; i7 >= 0; i7--) {
                iArr[i7] = iArr[i7 + 4] ^ j(((iArr[i7 + 3] ^ iArr[i7 + 2]) ^ iArr[i7 + 1]) ^ d[31 - i7]);
            }
        }
        return iArr;
    }

    private int l(int i, int i2) {
        return (i >>> (-i2)) | (i << i2);
    }

    private int m(int i) {
        byte[] bArr = c;
        return (bArr[i & 255] & 255) | ((bArr[(i >> 24) & 255] & 255) << 24) | ((bArr[(i >> 16) & 255] & 255) << 16) | ((bArr[(i >> 8) & 255] & 255) << 8);
    }

    @Override // defpackage.xc0
    public int a() {
        return 16;
    }

    @Override // defpackage.xc0
    public int b(byte[] bArr, int i, byte[] bArr2, int i2) throws DataLengthException, IllegalStateException {
        if (this.b != null) {
            if (i + 16 <= bArr.length) {
                if (i2 + 16 <= bArr2.length) {
                    this.a[0] = mo7.a(bArr, i);
                    this.a[1] = mo7.a(bArr, i + 4);
                    this.a[2] = mo7.a(bArr, i + 8);
                    this.a[3] = mo7.a(bArr, i + 12);
                    for (int i3 = 0; i3 < 32; i3 += 4) {
                        int[] iArr = this.a;
                        iArr[0] = c(iArr, this.b[i3]);
                        int[] iArr2 = this.a;
                        iArr2[1] = d(iArr2, this.b[i3 + 1]);
                        int[] iArr3 = this.a;
                        iArr3[2] = e(iArr3, this.b[i3 + 2]);
                        int[] iArr4 = this.a;
                        iArr4[3] = f(iArr4, this.b[i3 + 3]);
                    }
                    mo7.f(this.a[3], bArr2, i2);
                    mo7.f(this.a[2], bArr2, i2 + 4);
                    mo7.f(this.a[1], bArr2, i2 + 8);
                    mo7.f(this.a[0], bArr2, i2 + 12);
                    return 16;
                }
                throw new OutputLengthException("output buffer too short");
            }
            throw new DataLengthException("input buffer too short");
        }
        throw new IllegalStateException("SM4 not initialised");
    }

    @Override // defpackage.xc0
    public String getAlgorithmName() {
        return "SM4";
    }

    @Override // defpackage.xc0
    public void init(boolean z, v71 v71Var) throws IllegalArgumentException {
        if (v71Var instanceof lf5) {
            byte[] a = ((lf5) v71Var).a();
            if (a.length == 16) {
                this.b = k(z, a);
                return;
            }
            throw new IllegalArgumentException("SM4 requires a 128 bit key");
        }
        throw new IllegalArgumentException("invalid parameter passed to SM4 init - " + v71Var.getClass().getName());
    }

    @Override // defpackage.xc0
    public void reset() {
    }
}
