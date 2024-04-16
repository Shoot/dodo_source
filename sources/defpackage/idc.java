package defpackage;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
/* renamed from: idc  reason: default package */
/* loaded from: classes3.dex */
public class idc implements rya, sc6 {
    private static final byte[] h = {62, 114, 91, 71, -54, -32, 0, 51, 4, -47, 84, -104, 9, -71, 109, -53, 123, 27, -7, 50, -81, -99, 106, -91, -72, 45, -4, 29, 8, 83, 3, -112, 77, 78, -124, -103, -28, -50, -39, -111, -35, -74, -123, 72, -117, 41, 110, -84, -51, -63, -8, 30, 115, 67, 105, -58, -75, -67, -3, 57, 99, 32, -44, 56, 118, 125, -78, -89, -49, -19, 87, -59, -13, 44, -69, 20, 33, 6, 85, -101, -29, -17, 94, 49, 79, Byte.MAX_VALUE, 90, -92, 13, -126, 81, 73, 95, -70, 88, 28, 74, 22, -43, 23, -88, -110, 36, 31, -116, -1, -40, -82, 46, 1, -45, -83, 59, 75, -38, 70, -21, -55, -34, -102, -113, -121, -41, 58, Byte.MIN_VALUE, 111, 47, -56, -79, -76, 55, -9, 10, 34, 19, 40, 124, -52, 60, -119, -57, -61, -106, 86, 7, -65, 126, -16, 11, 43, -105, 82, 53, 65, 121, 97, -90, 76, 16, -2, -68, 38, -107, -120, -118, -80, -93, -5, -64, 24, -108, -14, -31, -27, -23, 93, -48, -36, 17, 102, 100, 92, -20, 89, 66, 117, 18, -11, 116, -100, -86, 35, 14, -122, -85, -66, 42, 2, -25, 103, -26, 68, -94, 108, -62, -109, -97, -15, -10, -6, 54, -46, 80, 104, -98, 98, 113, 21, 61, -42, 64, -60, -30, 15, -114, -125, 119, 107, 37, 5, 63, 12, 48, -22, 112, -73, -95, -24, -87, 101, -115, 39, 26, -37, -127, -77, -96, -12, 69, 122, 25, -33, -18, 120, 52, 96};
    private static final byte[] i = {85, -62, 99, 113, 59, -56, 71, -122, -97, 60, -38, 91, 41, -86, -3, 119, -116, -59, -108, 12, -90, 26, 19, 0, -29, -88, 22, 114, 64, -7, -8, 66, 68, 38, 104, -106, -127, -39, 69, 62, 16, 118, -58, -89, -117, 57, 67, -31, 58, -75, 86, 42, -64, 109, -77, 5, 34, 102, -65, -36, 11, -6, 98, 72, -35, 32, 17, 6, 54, -55, -63, -49, -10, 39, 82, -69, 105, -11, -44, -121, Byte.MAX_VALUE, -124, 76, -46, -100, 87, -92, -68, 79, -102, -33, -2, -42, -115, 122, -21, 43, 83, -40, 92, -95, 20, 23, -5, 35, -43, 125, 48, 103, 115, 8, 9, -18, -73, 112, 63, 97, -78, 25, -114, 78, -27, 75, -109, -113, 93, -37, -87, -83, -15, -82, 46, -53, 13, -4, -12, 45, 70, 110, 29, -105, -24, -47, -23, 77, 55, -91, 117, 94, -125, -98, -85, -126, -99, -71, 28, -32, -51, 73, -119, 1, -74, -67, 88, 36, -94, 95, 56, 120, -103, 21, -112, 80, -72, -107, -28, -48, -111, -57, -50, -19, 15, -76, 111, -96, -52, -16, 2, 74, 121, -61, -34, -93, -17, -22, 81, -26, 107, 24, -20, 27, 44, Byte.MIN_VALUE, -9, 116, -25, -1, 33, 90, 106, 84, 30, 65, 49, -110, 53, -60, 51, 7, 10, -70, 126, 14, 52, -120, -79, -104, 124, -13, 61, 96, 108, 123, -54, -45, 31, 50, 101, 4, 40, 100, -66, -123, -101, 47, 89, -118, -41, -80, 37, -84, -81, 18, 3, -30, -14};
    private static final short[] j = {17623, 9916, 25195, 4958, 22409, 13794, 28981, 2479, 19832, 12051, 27588, 6897, 24102, 15437, 30874, 18348};
    private final int[] a;
    private final int[] b;
    private final int[] c;
    private int d;
    private final byte[] e;
    private int f;
    private idc g;

    /* JADX INFO: Access modifiers changed from: protected */
    public idc() {
        this.a = new int[16];
        this.b = new int[2];
        this.c = new int[4];
        this.e = new byte[4];
    }

    private int c(int i2, int i3) {
        int i4 = i2 + i3;
        return (Integer.MAX_VALUE & i4) + (i4 >>> 31);
    }

    private void d() {
        int[] iArr = this.c;
        int[] iArr2 = this.a;
        iArr[0] = ((iArr2[15] & 2147450880) << 1) | (iArr2[14] & 65535);
        iArr[1] = ((iArr2[11] & 65535) << 16) | (iArr2[9] >>> 15);
        iArr[2] = ((iArr2[7] & 65535) << 16) | (iArr2[5] >>> 15);
        iArr[3] = (iArr2[0] >>> 15) | ((iArr2[2] & 65535) << 16);
    }

    private static int f(int i2) {
        return m(i2, 24) ^ (((m(i2, 2) ^ i2) ^ m(i2, 10)) ^ m(i2, 18));
    }

    private static int g(int i2) {
        return m(i2, 30) ^ (((m(i2, 8) ^ i2) ^ m(i2, 14)) ^ m(i2, 22));
    }

    private void h(int i2) {
        int i3 = this.a[0];
        int c = c(c(c(c(c(c(i3, l(i3, 8)), l(this.a[4], 20)), l(this.a[10], 21)), l(this.a[13], 17)), l(this.a[15], 15)), i2);
        int[] iArr = this.a;
        iArr[0] = iArr[1];
        iArr[1] = iArr[2];
        iArr[2] = iArr[3];
        iArr[3] = iArr[4];
        iArr[4] = iArr[5];
        iArr[5] = iArr[6];
        iArr[6] = iArr[7];
        iArr[7] = iArr[8];
        iArr[8] = iArr[9];
        iArr[9] = iArr[10];
        iArr[10] = iArr[11];
        iArr[11] = iArr[12];
        iArr[12] = iArr[13];
        iArr[13] = iArr[14];
        iArr[14] = iArr[15];
        iArr[15] = c;
    }

    private void i() {
        int i2 = this.a[0];
        int c = c(c(c(c(c(i2, l(i2, 8)), l(this.a[4], 20)), l(this.a[10], 21)), l(this.a[13], 17)), l(this.a[15], 15));
        int[] iArr = this.a;
        iArr[0] = iArr[1];
        iArr[1] = iArr[2];
        iArr[2] = iArr[3];
        iArr[3] = iArr[4];
        iArr[4] = iArr[5];
        iArr[5] = iArr[6];
        iArr[6] = iArr[7];
        iArr[7] = iArr[8];
        iArr[8] = iArr[9];
        iArr[9] = iArr[10];
        iArr[10] = iArr[11];
        iArr[11] = iArr[12];
        iArr[12] = iArr[13];
        iArr[13] = iArr[14];
        iArr[14] = iArr[15];
        iArr[15] = c;
    }

    private static int j(byte b, short s, byte b2) {
        return ((b & 255) << 23) | ((s & 65535) << 8) | (b2 & 255);
    }

    private static int k(byte b, byte b2, byte b3, byte b4) {
        return ((b & 255) << 24) | ((b2 & 255) << 16) | ((b3 & 255) << 8) | (b4 & 255);
    }

    private static int l(int i2, int i3) {
        return ((i2 >>> (31 - i3)) | (i2 << i3)) & Integer.MAX_VALUE;
    }

    static int m(int i2, int i3) {
        return (i2 >>> (32 - i3)) | (i2 << i3);
    }

    public static void n(int i2, byte[] bArr, int i3) {
        bArr[i3] = (byte) (i2 >> 24);
        bArr[i3 + 1] = (byte) (i2 >> 16);
        bArr[i3 + 2] = (byte) (i2 >> 8);
        bArr[i3 + 3] = (byte) i2;
    }

    private void p() {
        n(q(), this.e, 0);
    }

    private void s(byte[] bArr, byte[] bArr2) {
        t(this.a, bArr, bArr2);
        int[] iArr = this.b;
        iArr[0] = 0;
        iArr[1] = 0;
        int i2 = 32;
        while (true) {
            d();
            if (i2 > 0) {
                h(e() >>> 1);
                i2--;
            } else {
                e();
                i();
                return;
            }
        }
    }

    @Override // defpackage.sc6
    public sc6 a() {
        return new idc(this);
    }

    @Override // defpackage.sc6
    public void b(sc6 sc6Var) {
        idc idcVar = (idc) sc6Var;
        int[] iArr = idcVar.a;
        int[] iArr2 = this.a;
        System.arraycopy(iArr, 0, iArr2, 0, iArr2.length);
        int[] iArr3 = idcVar.b;
        int[] iArr4 = this.b;
        System.arraycopy(iArr3, 0, iArr4, 0, iArr4.length);
        int[] iArr5 = idcVar.c;
        int[] iArr6 = this.c;
        System.arraycopy(iArr5, 0, iArr6, 0, iArr6.length);
        byte[] bArr = idcVar.e;
        byte[] bArr2 = this.e;
        System.arraycopy(bArr, 0, bArr2, 0, bArr2.length);
        this.d = idcVar.d;
        this.f = idcVar.f;
        this.g = idcVar;
    }

    int e() {
        int[] iArr = this.c;
        int i2 = iArr[0];
        int[] iArr2 = this.b;
        int i3 = iArr2[0];
        int i4 = iArr2[1];
        int i5 = (i2 ^ i3) + i4;
        int i6 = i3 + iArr[1];
        int i7 = iArr[2] ^ i4;
        int f = f((i6 << 16) | (i7 >>> 16));
        int g = g((i7 << 16) | (i6 >>> 16));
        int[] iArr3 = this.b;
        byte[] bArr = h;
        byte b = bArr[f >>> 24];
        byte[] bArr2 = i;
        iArr3[0] = k(b, bArr2[(f >>> 16) & 255], bArr[(f >>> 8) & 255], bArr2[f & 255]);
        this.b[1] = k(bArr[g >>> 24], bArr2[(g >>> 16) & 255], bArr[(g >>> 8) & 255], bArr2[g & 255]);
        return i5;
    }

    @Override // defpackage.rya
    public String getAlgorithmName() {
        return "Zuc-128";
    }

    @Override // defpackage.rya
    public void init(boolean z, v71 v71Var) {
        byte[] bArr;
        byte[] bArr2 = null;
        if (v71Var instanceof pq7) {
            pq7 pq7Var = (pq7) v71Var;
            bArr = pq7Var.a();
            v71Var = pq7Var.b();
        } else {
            bArr = null;
        }
        if (v71Var instanceof lf5) {
            bArr2 = ((lf5) v71Var).a();
        }
        this.d = 0;
        this.f = 0;
        s(bArr2, bArr);
        this.g = (idc) a();
    }

    protected int o() {
        return 2047;
    }

    @Override // defpackage.rya
    public int processBytes(byte[] bArr, int i2, int i3, byte[] bArr2, int i4) {
        if (this.g != null) {
            if (i2 + i3 <= bArr.length) {
                if (i4 + i3 <= bArr2.length) {
                    for (int i5 = 0; i5 < i3; i5++) {
                        bArr2[i5 + i4] = r(bArr[i5 + i2]);
                    }
                    return i3;
                }
                throw new OutputLengthException("output buffer too short");
            }
            throw new DataLengthException("input buffer too short");
        }
        throw new IllegalStateException(getAlgorithmName() + " not initialised");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int q() {
        int i2 = this.f;
        this.f = i2 + 1;
        if (i2 < o()) {
            d();
            int e = e() ^ this.c[3];
            i();
            return e;
        }
        throw new IllegalStateException("Too much data processed by singleKey/IV");
    }

    public byte r(byte b) {
        if (this.d == 0) {
            p();
        }
        byte[] bArr = this.e;
        int i2 = this.d;
        byte b2 = (byte) (b ^ bArr[i2]);
        this.d = (i2 + 1) % 4;
        return b2;
    }

    @Override // defpackage.rya
    public void reset() {
        idc idcVar = this.g;
        if (idcVar != null) {
            b(idcVar);
        }
    }

    protected void t(int[] iArr, byte[] bArr, byte[] bArr2) {
        if (bArr != null && bArr.length == 16) {
            if (bArr2 != null && bArr2.length == 16) {
                int[] iArr2 = this.a;
                byte b = bArr[0];
                short[] sArr = j;
                iArr2[0] = j(b, sArr[0], bArr2[0]);
                this.a[1] = j(bArr[1], sArr[1], bArr2[1]);
                this.a[2] = j(bArr[2], sArr[2], bArr2[2]);
                this.a[3] = j(bArr[3], sArr[3], bArr2[3]);
                this.a[4] = j(bArr[4], sArr[4], bArr2[4]);
                this.a[5] = j(bArr[5], sArr[5], bArr2[5]);
                this.a[6] = j(bArr[6], sArr[6], bArr2[6]);
                this.a[7] = j(bArr[7], sArr[7], bArr2[7]);
                this.a[8] = j(bArr[8], sArr[8], bArr2[8]);
                this.a[9] = j(bArr[9], sArr[9], bArr2[9]);
                this.a[10] = j(bArr[10], sArr[10], bArr2[10]);
                this.a[11] = j(bArr[11], sArr[11], bArr2[11]);
                this.a[12] = j(bArr[12], sArr[12], bArr2[12]);
                this.a[13] = j(bArr[13], sArr[13], bArr2[13]);
                this.a[14] = j(bArr[14], sArr[14], bArr2[14]);
                this.a[15] = j(bArr[15], sArr[15], bArr2[15]);
                return;
            }
            throw new IllegalArgumentException("An IV of 16 bytes is needed");
        }
        throw new IllegalArgumentException("A key of 16 bytes is needed");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public idc(idc idcVar) {
        this.a = new int[16];
        this.b = new int[2];
        this.c = new int[4];
        this.e = new byte[4];
        b(idcVar);
    }
}
