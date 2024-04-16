package defpackage;
/* renamed from: o36  reason: default package */
/* loaded from: classes3.dex */
public class o36 implements nn3, sc6 {
    private static final byte[] g = {41, 46, 67, -55, -94, -40, 124, 1, 61, 54, 84, -95, -20, -16, 6, 19, 98, -89, 5, -13, -64, -57, 115, -116, -104, -109, 43, -39, -68, 76, -126, -54, 30, -101, 87, 60, -3, -44, -32, 22, 103, 66, 111, 24, -118, 23, -27, 18, -66, 78, -60, -42, -38, -98, -34, 73, -96, -5, -11, -114, -69, 47, -18, 122, -87, 104, 121, -111, 21, -78, 7, 63, -108, -62, 16, -119, 11, 34, 95, 33, Byte.MIN_VALUE, Byte.MAX_VALUE, 93, -102, 90, -112, 50, 39, 53, 62, -52, -25, -65, -9, -105, 3, -1, 25, 48, -77, 72, -91, -75, -47, -41, 94, -110, 42, -84, 86, -86, -58, 79, -72, 56, -46, -106, -92, 125, -74, 118, -4, 107, -30, -100, 116, 4, -15, 69, -99, 112, 89, 100, 113, -121, 32, -122, 91, -49, 101, -26, 45, -88, 2, 27, 96, 37, -83, -82, -80, -71, -10, 28, 70, 97, 105, 52, 64, 126, 15, 85, 71, -93, 35, -35, 81, -81, 58, -61, 92, -7, -50, -70, -59, -22, 38, 44, 83, 13, 110, -123, 40, -124, 9, -45, -33, -51, -12, 65, -127, 77, 82, 106, -36, 55, -56, 108, -63, -85, -6, 36, -31, 123, 8, 12, -67, -79, 74, 120, -120, -107, -117, -29, 99, -24, 109, -23, -53, -43, -2, 59, 0, 29, 57, -14, -17, -73, 14, 102, 88, -48, -28, -90, 119, 114, -8, -21, 117, 75, 10, 49, 68, 80, -76, -113, -19, 31, 26, -37, -103, -115, 51, -97, 17, -125, 20};
    private byte[] a;
    private int b;
    private byte[] c;
    private int d;
    private byte[] e;
    private int f;

    public o36() {
        this.a = new byte[48];
        this.c = new byte[16];
        this.e = new byte[16];
        reset();
    }

    private void d(o36 o36Var) {
        byte[] bArr = o36Var.a;
        System.arraycopy(bArr, 0, this.a, 0, bArr.length);
        this.b = o36Var.b;
        byte[] bArr2 = o36Var.c;
        System.arraycopy(bArr2, 0, this.c, 0, bArr2.length);
        this.d = o36Var.d;
        byte[] bArr3 = o36Var.e;
        System.arraycopy(bArr3, 0, this.e, 0, bArr3.length);
        this.f = o36Var.f;
    }

    @Override // defpackage.sc6
    public sc6 a() {
        return new o36(this);
    }

    @Override // defpackage.sc6
    public void b(sc6 sc6Var) {
        d((o36) sc6Var);
    }

    @Override // defpackage.e23
    public int doFinal(byte[] bArr, int i) {
        int length = this.c.length;
        int i2 = this.d;
        byte b = (byte) (length - i2);
        while (true) {
            byte[] bArr2 = this.c;
            if (i2 < bArr2.length) {
                bArr2[i2] = b;
                i2++;
            } else {
                f(bArr2);
                e(this.c);
                e(this.e);
                System.arraycopy(this.a, this.b, bArr, i, 16);
                reset();
                return 16;
            }
        }
    }

    protected void e(byte[] bArr) {
        for (int i = 0; i < 16; i++) {
            byte[] bArr2 = this.a;
            bArr2[i + 16] = bArr[i];
            bArr2[i + 32] = (byte) (bArr[i] ^ bArr2[i]);
        }
        int i2 = 0;
        for (int i3 = 0; i3 < 18; i3++) {
            for (int i4 = 0; i4 < 48; i4++) {
                byte[] bArr3 = this.a;
                byte b = (byte) (g[i2] ^ bArr3[i4]);
                bArr3[i4] = b;
                i2 = b & 255;
            }
            i2 = (i2 + i3) % 256;
        }
    }

    protected void f(byte[] bArr) {
        byte b = this.e[15];
        for (int i = 0; i < 16; i++) {
            byte[] bArr2 = this.e;
            b = (byte) (g[(b ^ bArr[i]) & 255] ^ bArr2[i]);
            bArr2[i] = b;
        }
    }

    @Override // defpackage.e23
    public String getAlgorithmName() {
        return "MD2";
    }

    @Override // defpackage.nn3
    public int getByteLength() {
        return 16;
    }

    @Override // defpackage.e23
    public int getDigestSize() {
        return 16;
    }

    @Override // defpackage.e23
    public void reset() {
        this.b = 0;
        int i = 0;
        while (true) {
            byte[] bArr = this.a;
            if (i == bArr.length) {
                break;
            }
            bArr[i] = 0;
            i++;
        }
        this.d = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr2 = this.c;
            if (i2 == bArr2.length) {
                break;
            }
            bArr2[i2] = 0;
            i2++;
        }
        this.f = 0;
        int i3 = 0;
        while (true) {
            byte[] bArr3 = this.e;
            if (i3 != bArr3.length) {
                bArr3[i3] = 0;
                i3++;
            } else {
                return;
            }
        }
    }

    @Override // defpackage.e23
    public void update(byte b) {
        byte[] bArr = this.c;
        int i = this.d;
        int i2 = i + 1;
        this.d = i2;
        bArr[i] = b;
        if (i2 == 16) {
            f(bArr);
            e(this.c);
            this.d = 0;
        }
    }

    public o36(o36 o36Var) {
        this.a = new byte[48];
        this.c = new byte[16];
        this.e = new byte[16];
        d(o36Var);
    }

    @Override // defpackage.e23
    public void update(byte[] bArr, int i, int i2) {
        while (this.d != 0 && i2 > 0) {
            update(bArr[i]);
            i++;
            i2--;
        }
        while (i2 > 16) {
            System.arraycopy(bArr, i, this.c, 0, 16);
            f(this.c);
            e(this.c);
            i2 -= 16;
            i += 16;
        }
        while (i2 > 0) {
            update(bArr[i]);
            i++;
            i2--;
        }
    }
}
