package defpackage;
/* renamed from: oc0  reason: default package */
/* loaded from: classes3.dex */
public class oc0 implements nn3 {
    private static final int[] s = {1779033703, -1150833019, 1013904242, -1521486534, 1359893119, -1694144372, 528734635, 1541459225};
    private static final byte[][] t = {new byte[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}, new byte[]{14, 10, 4, 8, 9, 15, 13, 6, 1, 12, 0, 2, 11, 7, 5, 3}, new byte[]{11, 8, 12, 0, 5, 2, 15, 13, 10, 14, 3, 6, 7, 1, 9, 4}, new byte[]{7, 9, 3, 1, 13, 12, 11, 14, 2, 6, 5, 10, 4, 0, 15, 8}, new byte[]{9, 0, 5, 7, 2, 4, 10, 15, 14, 1, 11, 12, 6, 8, 3, 13}, new byte[]{2, 12, 6, 10, 0, 11, 8, 3, 4, 13, 7, 5, 15, 14, 1, 9}, new byte[]{12, 5, 1, 15, 14, 13, 4, 10, 0, 7, 6, 3, 9, 2, 8, 11}, new byte[]{13, 11, 7, 14, 12, 1, 3, 9, 5, 0, 15, 4, 8, 6, 2, 10}, new byte[]{6, 15, 14, 9, 11, 3, 0, 8, 12, 2, 13, 7, 1, 4, 10, 5}, new byte[]{10, 2, 8, 4, 7, 6, 1, 5, 15, 11, 9, 14, 3, 12, 13, 0}};
    private int a;
    private int b;
    private byte[] c;
    private byte[] d;
    private byte[] e;
    private int f;
    private int g;
    private int h;
    private long i;
    private int j;
    private int k;
    private byte[] l;
    private int m;
    private int[] n;
    private int[] o;
    private int p;
    private int q;
    private int r;

    public oc0() {
        this(256);
    }

    private void a(int i, int i2, int i3, int i4, int i5, int i6) {
        int[] iArr = this.n;
        int i7 = iArr[i3] + iArr[i4] + i;
        iArr[i3] = i7;
        iArr[i6] = f(iArr[i6] ^ i7, 16);
        int[] iArr2 = this.n;
        int i8 = iArr2[i5] + iArr2[i6];
        iArr2[i5] = i8;
        iArr2[i4] = f(i8 ^ iArr2[i4], 12);
        int[] iArr3 = this.n;
        int i9 = iArr3[i3] + iArr3[i4] + i2;
        iArr3[i3] = i9;
        iArr3[i6] = f(iArr3[i6] ^ i9, 8);
        int[] iArr4 = this.n;
        int i10 = iArr4[i5] + iArr4[i6];
        iArr4[i5] = i10;
        iArr4[i4] = f(i10 ^ iArr4[i4], 7);
    }

    private void b(byte[] bArr, int i) {
        e();
        int[] iArr = new int[16];
        int i2 = 0;
        for (int i3 = 0; i3 < 16; i3++) {
            iArr[i3] = mo7.l(bArr, (i3 * 4) + i);
        }
        for (int i4 = 0; i4 < 10; i4++) {
            byte[][] bArr2 = t;
            byte[] bArr3 = bArr2[i4];
            a(iArr[bArr3[0]], iArr[bArr3[1]], 0, 4, 8, 12);
            byte[] bArr4 = bArr2[i4];
            a(iArr[bArr4[2]], iArr[bArr4[3]], 1, 5, 9, 13);
            byte[] bArr5 = bArr2[i4];
            a(iArr[bArr5[4]], iArr[bArr5[5]], 2, 6, 10, 14);
            byte[] bArr6 = bArr2[i4];
            a(iArr[bArr6[6]], iArr[bArr6[7]], 3, 7, 11, 15);
            byte[] bArr7 = bArr2[i4];
            a(iArr[bArr7[8]], iArr[bArr7[9]], 0, 5, 10, 15);
            byte[] bArr8 = bArr2[i4];
            a(iArr[bArr8[10]], iArr[bArr8[11]], 1, 6, 11, 12);
            byte[] bArr9 = bArr2[i4];
            a(iArr[bArr9[12]], iArr[bArr9[13]], 2, 7, 8, 13);
            byte[] bArr10 = bArr2[i4];
            a(iArr[bArr10[14]], iArr[bArr10[15]], 3, 4, 9, 14);
        }
        while (true) {
            int[] iArr2 = this.o;
            if (i2 < iArr2.length) {
                int i5 = iArr2[i2];
                int[] iArr3 = this.n;
                iArr2[i2] = (i5 ^ iArr3[i2]) ^ iArr3[i2 + 8];
                i2++;
            } else {
                return;
            }
        }
    }

    private void d(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.l = new byte[64];
        if (bArr3 != null && bArr3.length > 0) {
            if (bArr3.length <= 32) {
                byte[] bArr4 = new byte[bArr3.length];
                this.e = bArr4;
                System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
                this.b = bArr3.length;
                System.arraycopy(bArr3, 0, this.l, 0, bArr3.length);
                this.m = 64;
            } else {
                throw new IllegalArgumentException("Keys > 32 bytes are not supported");
            }
        }
        if (this.o == null) {
            this.o = r0;
            int[] iArr = s;
            long j = this.i;
            int[] iArr2 = {iArr[0] ^ ((this.a | (this.b << 8)) | ((this.f << 16) | (this.g << 24))), iArr[1] ^ this.h, ((int) j) ^ iArr[2], ((((int) (j >> 32)) | (this.j << 16)) | (this.k << 24)) ^ iArr[3], iArr[4], iArr[5]};
            if (bArr != null) {
                if (bArr.length == 8) {
                    byte[] bArr5 = new byte[8];
                    this.c = bArr5;
                    System.arraycopy(bArr, 0, bArr5, 0, bArr.length);
                    int[] iArr3 = this.o;
                    iArr3[4] = iArr3[4] ^ mo7.l(bArr, 0);
                    int[] iArr4 = this.o;
                    iArr4[5] = mo7.l(bArr, 4) ^ iArr4[5];
                } else {
                    throw new IllegalArgumentException("Salt length must be exactly 8 bytes");
                }
            }
            int[] iArr5 = this.o;
            iArr5[6] = iArr[6];
            iArr5[7] = iArr[7];
            if (bArr2 != null) {
                if (bArr2.length == 8) {
                    byte[] bArr6 = new byte[8];
                    this.d = bArr6;
                    System.arraycopy(bArr2, 0, bArr6, 0, bArr2.length);
                    int[] iArr6 = this.o;
                    iArr6[6] = iArr6[6] ^ mo7.l(bArr2, 0);
                    int[] iArr7 = this.o;
                    iArr7[7] = mo7.l(bArr2, 4) ^ iArr7[7];
                    return;
                }
                throw new IllegalArgumentException("Personalization length must be exactly 8 bytes");
            }
        }
    }

    private void e() {
        int[] iArr = this.o;
        System.arraycopy(iArr, 0, this.n, 0, iArr.length);
        int[] iArr2 = s;
        System.arraycopy(iArr2, 0, this.n, this.o.length, 4);
        int[] iArr3 = this.n;
        iArr3[12] = this.p ^ iArr2[4];
        iArr3[13] = this.q ^ iArr2[5];
        iArr3[14] = this.r ^ iArr2[6];
        iArr3[15] = iArr2[7];
    }

    private int f(int i, int i2) {
        return (i << (32 - i2)) | (i >>> i2);
    }

    @Override // defpackage.e23
    public int doFinal(byte[] bArr, int i) {
        int[] iArr;
        int i2;
        this.r = -1;
        int i3 = this.p;
        int i4 = this.m;
        int i5 = i3 + i4;
        this.p = i5;
        if (i5 < 0 && i4 > (-i5)) {
            this.q++;
        }
        b(this.l, 0);
        tr.y(this.l, (byte) 0);
        tr.B(this.n, 0);
        int i6 = 0;
        while (true) {
            iArr = this.o;
            if (i6 >= iArr.length || (i2 = i6 * 4) >= this.a) {
                break;
            }
            byte[] k = mo7.k(iArr[i6]);
            int i7 = this.a;
            if (i2 < i7 - 4) {
                System.arraycopy(k, 0, bArr, i2 + i, 4);
            } else {
                System.arraycopy(k, 0, bArr, i + i2, i7 - i2);
            }
            i6++;
        }
        tr.B(iArr, 0);
        reset();
        return this.a;
    }

    @Override // defpackage.e23
    public String getAlgorithmName() {
        return "BLAKE2s";
    }

    @Override // defpackage.nn3
    public int getByteLength() {
        return 64;
    }

    @Override // defpackage.e23
    public int getDigestSize() {
        return this.a;
    }

    @Override // defpackage.e23
    public void reset() {
        this.m = 0;
        this.r = 0;
        this.p = 0;
        this.q = 0;
        this.o = null;
        tr.y(this.l, (byte) 0);
        byte[] bArr = this.e;
        if (bArr != null) {
            System.arraycopy(bArr, 0, this.l, 0, bArr.length);
            this.m = 64;
        }
        d(this.c, this.d, this.e);
    }

    @Override // defpackage.e23
    public void update(byte b) {
        int i = this.m;
        if (64 - i != 0) {
            this.l[i] = b;
            this.m = i + 1;
            return;
        }
        int i2 = this.p + 64;
        this.p = i2;
        if (i2 == 0) {
            this.q++;
        }
        b(this.l, 0);
        tr.y(this.l, (byte) 0);
        this.l[0] = b;
        this.m = 1;
    }

    public oc0(int i) {
        this.a = 32;
        this.b = 0;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = 1;
        this.g = 1;
        this.h = 0;
        this.i = 0L;
        this.j = 0;
        this.k = 0;
        this.l = null;
        this.m = 0;
        this.n = new int[16];
        this.o = null;
        this.p = 0;
        this.q = 0;
        this.r = 0;
        if (i < 8 || i > 256 || i % 8 != 0) {
            throw new IllegalArgumentException("BLAKE2s digest bit length must be a multiple of 8 and not greater than 256");
        }
        this.a = i / 8;
        d(null, null, null);
    }

    @Override // defpackage.e23
    public void update(byte[] bArr, int i, int i2) {
        int i3;
        if (bArr == null || i2 == 0) {
            return;
        }
        int i4 = this.m;
        if (i4 != 0) {
            i3 = 64 - i4;
            if (i3 >= i2) {
                System.arraycopy(bArr, i, this.l, i4, i2);
                this.m += i2;
            }
            System.arraycopy(bArr, i, this.l, i4, i3);
            int i5 = this.p + 64;
            this.p = i5;
            if (i5 == 0) {
                this.q++;
            }
            b(this.l, 0);
            this.m = 0;
            tr.y(this.l, (byte) 0);
        } else {
            i3 = 0;
        }
        int i6 = i2 + i;
        int i7 = i6 - 64;
        int i8 = i + i3;
        while (i8 < i7) {
            int i9 = this.p + 64;
            this.p = i9;
            if (i9 == 0) {
                this.q++;
            }
            b(bArr, i8);
            i8 += 64;
        }
        i2 = i6 - i8;
        System.arraycopy(bArr, i8, this.l, 0, i2);
        this.m += i2;
    }

    public oc0(oc0 oc0Var) {
        this.a = 32;
        this.b = 0;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = 1;
        this.g = 1;
        this.h = 0;
        this.i = 0L;
        this.j = 0;
        this.k = 0;
        this.l = null;
        this.m = 0;
        this.n = new int[16];
        this.o = null;
        this.p = 0;
        this.q = 0;
        this.r = 0;
        this.m = oc0Var.m;
        this.l = tr.h(oc0Var.l);
        this.b = oc0Var.b;
        this.e = tr.h(oc0Var.e);
        this.a = oc0Var.a;
        this.n = tr.k(this.n);
        this.o = tr.k(oc0Var.o);
        this.p = oc0Var.p;
        this.q = oc0Var.q;
        this.r = oc0Var.r;
        this.c = tr.h(oc0Var.c);
        this.d = tr.h(oc0Var.d);
        this.f = oc0Var.f;
        this.g = oc0Var.g;
        this.h = oc0Var.h;
        this.i = oc0Var.i;
        this.j = oc0Var.j;
        this.k = oc0Var.k;
    }
}
