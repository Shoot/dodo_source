package defpackage;
/* renamed from: bq9  reason: default package */
/* loaded from: classes3.dex */
public class bq9 extends ed4 {
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int[] i;
    private int j;

    public bq9() {
        this.i = new int[80];
        reset();
    }

    private void i(bq9 bq9Var) {
        this.d = bq9Var.d;
        this.e = bq9Var.e;
        this.f = bq9Var.f;
        this.g = bq9Var.g;
        this.h = bq9Var.h;
        int[] iArr = bq9Var.i;
        System.arraycopy(iArr, 0, this.i, 0, iArr.length);
        this.j = bq9Var.j;
    }

    private int j(int i, int i2, int i3) {
        return ((~i) & i3) | (i2 & i);
    }

    private int k(int i, int i2, int i3) {
        return (i & i3) | (i & i2) | (i2 & i3);
    }

    private int l(int i, int i2, int i3) {
        return (i ^ i2) ^ i3;
    }

    @Override // defpackage.sc6
    public sc6 a() {
        return new bq9(this);
    }

    @Override // defpackage.sc6
    public void b(sc6 sc6Var) {
        bq9 bq9Var = (bq9) sc6Var;
        super.d(bq9Var);
        i(bq9Var);
    }

    @Override // defpackage.e23
    public int doFinal(byte[] bArr, int i) {
        e();
        mo7.f(this.d, bArr, i);
        mo7.f(this.e, bArr, i + 4);
        mo7.f(this.f, bArr, i + 8);
        mo7.f(this.g, bArr, i + 12);
        mo7.f(this.h, bArr, i + 16);
        reset();
        return 20;
    }

    @Override // defpackage.ed4
    protected void f() {
        int i;
        int i2;
        int i3;
        int i4;
        for (int i5 = 16; i5 < 80; i5++) {
            int[] iArr = this.i;
            int i6 = ((iArr[i5 - 3] ^ iArr[i5 - 8]) ^ iArr[i5 - 14]) ^ iArr[i5 - 16];
            iArr[i5] = (i6 >>> 31) | (i6 << 1);
        }
        int i7 = this.d;
        int i8 = this.e;
        int i9 = this.f;
        int i10 = this.g;
        int i11 = this.h;
        int i12 = 0;
        for (int i13 = 0; i13 < 4; i13++) {
            int j = i11 + ((i7 << 5) | (i7 >>> 27)) + j(i8, i9, i10) + this.i[i12] + 1518500249;
            int i14 = (i8 >>> 2) | (i8 << 30);
            int j2 = i10 + ((j << 5) | (j >>> 27)) + j(i7, i14, i9) + this.i[i12 + 1] + 1518500249;
            int i15 = (i7 >>> 2) | (i7 << 30);
            int j3 = i9 + ((j2 << 5) | (j2 >>> 27)) + j(j, i15, i14) + this.i[i12 + 2] + 1518500249;
            i11 = (j >>> 2) | (j << 30);
            int i16 = i12 + 4;
            i8 = i14 + ((j3 << 5) | (j3 >>> 27)) + j(j2, i11, i15) + this.i[i12 + 3] + 1518500249;
            i10 = (j2 >>> 2) | (j2 << 30);
            i12 += 5;
            i7 = i15 + ((i8 << 5) | (i8 >>> 27)) + j(j3, i10, i11) + this.i[i16] + 1518500249;
            i9 = (j3 >>> 2) | (j3 << 30);
        }
        for (int i17 = 0; i17 < 4; i17++) {
            int l = i11 + ((i7 << 5) | (i7 >>> 27)) + l(i8, i9, i10) + this.i[i12] + 1859775393;
            int i18 = (i8 >>> 2) | (i8 << 30);
            int l2 = i10 + ((l << 5) | (l >>> 27)) + l(i7, i18, i9) + this.i[i12 + 1] + 1859775393;
            int i19 = (i7 >>> 2) | (i7 << 30);
            int l3 = i9 + ((l2 << 5) | (l2 >>> 27)) + l(l, i19, i18) + this.i[i12 + 2] + 1859775393;
            i11 = (l >>> 2) | (l << 30);
            int i20 = i12 + 4;
            i8 = i18 + ((l3 << 5) | (l3 >>> 27)) + l(l2, i11, i19) + this.i[i12 + 3] + 1859775393;
            i10 = (l2 >>> 2) | (l2 << 30);
            i12 += 5;
            i7 = i19 + ((i8 << 5) | (i8 >>> 27)) + l(l3, i10, i11) + this.i[i20] + 1859775393;
            i9 = (l3 >>> 2) | (l3 << 30);
        }
        for (int i21 = 0; i21 < 4; i21++) {
            int k = i11 + (((((i7 << 5) | (i7 >>> 27)) + k(i8, i9, i10)) + this.i[i12]) - 1894007588);
            int k2 = i10 + (((((k << 5) | (k >>> 27)) + k(i7, i3, i9)) + this.i[i12 + 1]) - 1894007588);
            int k3 = i9 + (((((k2 << 5) | (k2 >>> 27)) + k(k, i4, i3)) + this.i[i12 + 2]) - 1894007588);
            i11 = (k >>> 2) | (k << 30);
            int i22 = i12 + 4;
            i8 = ((i8 >>> 2) | (i8 << 30)) + (((((k3 << 5) | (k3 >>> 27)) + k(k2, i11, i4)) + this.i[i12 + 3]) - 1894007588);
            i10 = (k2 >>> 2) | (k2 << 30);
            i12 += 5;
            i7 = ((i7 >>> 2) | (i7 << 30)) + (((((i8 << 5) | (i8 >>> 27)) + k(k3, i10, i11)) + this.i[i22]) - 1894007588);
            i9 = (k3 >>> 2) | (k3 << 30);
        }
        for (int i23 = 0; i23 <= 3; i23++) {
            int l4 = i11 + (((((i7 << 5) | (i7 >>> 27)) + l(i8, i9, i10)) + this.i[i12]) - 899497514);
            int l5 = i10 + (((((l4 << 5) | (l4 >>> 27)) + l(i7, i, i9)) + this.i[i12 + 1]) - 899497514);
            int l6 = i9 + (((((l5 << 5) | (l5 >>> 27)) + l(l4, i2, i)) + this.i[i12 + 2]) - 899497514);
            i11 = (l4 >>> 2) | (l4 << 30);
            int i24 = i12 + 4;
            i8 = ((i8 >>> 2) | (i8 << 30)) + (((((l6 << 5) | (l6 >>> 27)) + l(l5, i11, i2)) + this.i[i12 + 3]) - 899497514);
            i10 = (l5 >>> 2) | (l5 << 30);
            i12 += 5;
            i7 = ((i7 >>> 2) | (i7 << 30)) + (((((i8 << 5) | (i8 >>> 27)) + l(l6, i10, i11)) + this.i[i24]) - 899497514);
            i9 = (l6 >>> 2) | (l6 << 30);
        }
        this.d += i7;
        this.e += i8;
        this.f += i9;
        this.g += i10;
        this.h += i11;
        this.j = 0;
        for (int i25 = 0; i25 < 16; i25++) {
            this.i[i25] = 0;
        }
    }

    @Override // defpackage.ed4
    protected void g(long j) {
        if (this.j > 14) {
            f();
        }
        int[] iArr = this.i;
        iArr[14] = (int) (j >>> 32);
        iArr[15] = (int) j;
    }

    @Override // defpackage.e23
    public String getAlgorithmName() {
        return "SHA-1";
    }

    @Override // defpackage.e23
    public int getDigestSize() {
        return 20;
    }

    @Override // defpackage.ed4
    protected void h(byte[] bArr, int i) {
        int i2 = (bArr[i + 3] & 255) | (bArr[i] << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
        int[] iArr = this.i;
        int i3 = this.j;
        iArr[i3] = i2;
        int i4 = i3 + 1;
        this.j = i4;
        if (i4 == 16) {
            f();
        }
    }

    @Override // defpackage.ed4, defpackage.e23
    public void reset() {
        super.reset();
        this.d = 1732584193;
        this.e = -271733879;
        this.f = -1732584194;
        this.g = 271733878;
        this.h = -1009589776;
        this.j = 0;
        int i = 0;
        while (true) {
            int[] iArr = this.i;
            if (i != iArr.length) {
                iArr[i] = 0;
                i++;
            } else {
                return;
            }
        }
    }

    public bq9(bq9 bq9Var) {
        super(bq9Var);
        this.i = new int[80];
        i(bq9Var);
    }
}
