package defpackage;
/* renamed from: sq9  reason: default package */
/* loaded from: classes3.dex */
public class sq9 extends ed4 {
    private static final int[] h = new int[64];
    private int[] d;
    private int[] e;
    private int f;
    private int[] g;

    static {
        int i;
        int i2 = 0;
        while (true) {
            if (i2 >= 16) {
                break;
            }
            h[i2] = (2043430169 >>> (32 - i2)) | (2043430169 << i2);
            i2++;
        }
        for (i = 16; i < 64; i++) {
            int i3 = i % 32;
            h[i] = (2055708042 >>> (32 - i3)) | (2055708042 << i3);
        }
    }

    public sq9() {
        this.d = new int[8];
        this.e = new int[16];
        this.g = new int[68];
        reset();
    }

    private int i(int i, int i2, int i3) {
        return (i ^ i2) ^ i3;
    }

    private int j(int i, int i2, int i3) {
        return (i & i3) | (i & i2) | (i2 & i3);
    }

    private int k(int i, int i2, int i3) {
        return (i ^ i2) ^ i3;
    }

    private int l(int i, int i2, int i3) {
        return ((~i) & i3) | (i2 & i);
    }

    private int m(int i) {
        return (i ^ ((i << 9) | (i >>> 23))) ^ ((i << 17) | (i >>> 15));
    }

    private int n(int i) {
        return (i ^ ((i << 15) | (i >>> 17))) ^ ((i << 23) | (i >>> 9));
    }

    private void o(sq9 sq9Var) {
        int[] iArr = sq9Var.d;
        int[] iArr2 = this.d;
        System.arraycopy(iArr, 0, iArr2, 0, iArr2.length);
        int[] iArr3 = sq9Var.e;
        int[] iArr4 = this.e;
        System.arraycopy(iArr3, 0, iArr4, 0, iArr4.length);
        this.f = sq9Var.f;
    }

    @Override // defpackage.sc6
    public sc6 a() {
        return new sq9(this);
    }

    @Override // defpackage.sc6
    public void b(sc6 sc6Var) {
        sq9 sq9Var = (sq9) sc6Var;
        super.d(sq9Var);
        o(sq9Var);
    }

    @Override // defpackage.e23
    public int doFinal(byte[] bArr, int i) {
        e();
        mo7.g(this.d, bArr, i);
        reset();
        return 32;
    }

    @Override // defpackage.ed4
    protected void f() {
        int i;
        int i2 = 0;
        while (true) {
            if (i2 >= 16) {
                break;
            }
            this.g[i2] = this.e[i2];
            i2++;
        }
        for (int i3 = 16; i3 < 68; i3++) {
            int[] iArr = this.g;
            int i4 = iArr[i3 - 3];
            int i5 = (i4 >>> 17) | (i4 << 15);
            int i6 = iArr[i3 - 13];
            iArr[i3] = (n(i5 ^ (iArr[i3 - 16] ^ iArr[i3 - 9])) ^ ((i6 >>> 25) | (i6 << 7))) ^ this.g[i3 - 6];
        }
        int[] iArr2 = this.d;
        int i7 = iArr2[0];
        int i8 = iArr2[1];
        int i9 = iArr2[2];
        int i10 = iArr2[3];
        int i11 = iArr2[4];
        int i12 = iArr2[5];
        int i13 = iArr2[6];
        int i14 = iArr2[7];
        int i15 = i13;
        int i16 = 0;
        for (i = 16; i16 < i; i = 16) {
            int i17 = (i7 << 12) | (i7 >>> 20);
            int i18 = i17 + i11 + h[i16];
            int i19 = (i18 << 7) | (i18 >>> 25);
            int[] iArr3 = this.g;
            int i20 = iArr3[i16];
            int i21 = (i8 << 9) | (i8 >>> 23);
            int i22 = (i12 << 19) | (i12 >>> 13);
            i16++;
            i12 = i11;
            i11 = m(k(i11, i12, i15) + i14 + i19 + i20);
            i10 = i9;
            i9 = i21;
            i14 = i15;
            i15 = i22;
            i8 = i7;
            i7 = i(i7, i8, i9) + i10 + (i19 ^ i17) + (i20 ^ iArr3[i16 + 4]);
        }
        int i23 = i14;
        int i24 = i11;
        int i25 = i15;
        int i26 = i10;
        int i27 = i9;
        int i28 = i8;
        int i29 = i7;
        int i30 = 16;
        while (i30 < 64) {
            int i31 = (i29 << 12) | (i29 >>> 20);
            int i32 = i31 + i24 + h[i30];
            int i33 = (i32 << 7) | (i32 >>> 25);
            int[] iArr4 = this.g;
            int i34 = iArr4[i30];
            int i35 = (i28 >>> 23) | (i28 << 9);
            int i36 = (i12 << 19) | (i12 >>> 13);
            i30++;
            i12 = i24;
            i24 = m(l(i24, i12, i25) + i23 + i33 + i34);
            i26 = i27;
            i27 = i35;
            i28 = i29;
            i29 = j(i29, i28, i27) + i26 + (i33 ^ i31) + (i34 ^ iArr4[i30 + 4]);
            i23 = i25;
            i25 = i36;
        }
        int[] iArr5 = this.d;
        iArr5[0] = i29 ^ iArr5[0];
        iArr5[1] = iArr5[1] ^ i28;
        iArr5[2] = iArr5[2] ^ i27;
        iArr5[3] = iArr5[3] ^ i26;
        iArr5[4] = iArr5[4] ^ i24;
        iArr5[5] = iArr5[5] ^ i12;
        iArr5[6] = i25 ^ iArr5[6];
        iArr5[7] = iArr5[7] ^ i23;
        this.f = 0;
    }

    @Override // defpackage.ed4
    protected void g(long j) {
        int i = this.f;
        if (i > 14) {
            this.e[i] = 0;
            this.f = i + 1;
            f();
        }
        while (true) {
            int i2 = this.f;
            if (i2 < 14) {
                this.e[i2] = 0;
                this.f = i2 + 1;
            } else {
                int[] iArr = this.e;
                iArr[i2] = (int) (j >>> 32);
                this.f = i2 + 2;
                iArr[i2 + 1] = (int) j;
                return;
            }
        }
    }

    @Override // defpackage.e23
    public String getAlgorithmName() {
        return "SM3";
    }

    @Override // defpackage.e23
    public int getDigestSize() {
        return 32;
    }

    @Override // defpackage.ed4
    protected void h(byte[] bArr, int i) {
        int i2 = (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
        int[] iArr = this.e;
        int i3 = this.f;
        iArr[i3] = i2;
        int i4 = i3 + 1;
        this.f = i4;
        if (i4 >= 16) {
            f();
        }
    }

    @Override // defpackage.ed4, defpackage.e23
    public void reset() {
        super.reset();
        int[] iArr = this.d;
        iArr[0] = 1937774191;
        iArr[1] = 1226093241;
        iArr[2] = 388252375;
        iArr[3] = -628488704;
        iArr[4] = -1452330820;
        iArr[5] = 372324522;
        iArr[6] = -477237683;
        iArr[7] = -1325724082;
        this.f = 0;
    }

    public sq9(sq9 sq9Var) {
        super(sq9Var);
        this.d = new int[8];
        this.e = new int[16];
        this.g = new int[68];
        o(sq9Var);
    }
}
