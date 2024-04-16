package defpackage;
/* renamed from: cq9  reason: default package */
/* loaded from: classes3.dex */
public class cq9 extends ed4 {
    static final int[] n = {1116352408, 1899447441, -1245643825, -373957723, 961987163, 1508970993, -1841331548, -1424204075, -670586216, 310598401, 607225278, 1426881987, 1925078388, -2132889090, -1680079193, -1046744716, -459576895, -272742522, 264347078, 604807628, 770255983, 1249150122, 1555081692, 1996064986, -1740746414, -1473132947, -1341970488, -1084653625, -958395405, -710438585, 113926993, 338241895, 666307205, 773529912, 1294757372, 1396182291, 1695183700, 1986661051, -2117940946, -1838011259, -1564481375, -1474664885, -1035236496, -949202525, -778901479, -694614492, -200395387, 275423344, 430227734, 506948616, 659060556, 883997877, 958139571, 1322822218, 1537002063, 1747873779, 1955562222, 2024104815, -2067236844, -1933114872, -1866530822, -1538233109, -1090935817, -965641998};
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int[] l;
    private int m;

    public cq9() {
        this.l = new int[64];
        reset();
    }

    private int i(int i, int i2, int i3) {
        return ((~i) & i3) ^ (i2 & i);
    }

    private int j(int i, int i2, int i3) {
        return ((i & i3) ^ (i & i2)) ^ (i2 & i3);
    }

    private int k(int i) {
        return ((i << 10) | (i >>> 22)) ^ (((i >>> 2) | (i << 30)) ^ ((i >>> 13) | (i << 19)));
    }

    private int l(int i) {
        return ((i << 7) | (i >>> 25)) ^ (((i >>> 6) | (i << 26)) ^ ((i >>> 11) | (i << 21)));
    }

    private int m(int i) {
        return (i >>> 3) ^ (((i >>> 7) | (i << 25)) ^ ((i >>> 18) | (i << 14)));
    }

    private int n(int i) {
        return (i >>> 10) ^ (((i >>> 17) | (i << 15)) ^ ((i >>> 19) | (i << 13)));
    }

    private void o(cq9 cq9Var) {
        super.d(cq9Var);
        this.d = cq9Var.d;
        this.e = cq9Var.e;
        this.f = cq9Var.f;
        this.g = cq9Var.g;
        this.h = cq9Var.h;
        this.i = cq9Var.i;
        this.j = cq9Var.j;
        this.k = cq9Var.k;
        int[] iArr = cq9Var.l;
        System.arraycopy(iArr, 0, this.l, 0, iArr.length);
        this.m = cq9Var.m;
    }

    @Override // defpackage.sc6
    public sc6 a() {
        return new cq9(this);
    }

    @Override // defpackage.sc6
    public void b(sc6 sc6Var) {
        o((cq9) sc6Var);
    }

    @Override // defpackage.e23
    public int doFinal(byte[] bArr, int i) {
        e();
        mo7.f(this.d, bArr, i);
        mo7.f(this.e, bArr, i + 4);
        mo7.f(this.f, bArr, i + 8);
        mo7.f(this.g, bArr, i + 12);
        mo7.f(this.h, bArr, i + 16);
        mo7.f(this.i, bArr, i + 20);
        mo7.f(this.j, bArr, i + 24);
        reset();
        return 28;
    }

    @Override // defpackage.ed4
    protected void f() {
        for (int i = 16; i <= 63; i++) {
            int[] iArr = this.l;
            int n2 = n(iArr[i - 2]);
            int[] iArr2 = this.l;
            iArr[i] = n2 + iArr2[i - 7] + m(iArr2[i - 15]) + this.l[i - 16];
        }
        int i2 = this.d;
        int i3 = this.e;
        int i4 = this.f;
        int i5 = this.g;
        int i6 = this.h;
        int i7 = this.i;
        int i8 = this.j;
        int i9 = this.k;
        int i10 = 0;
        for (int i11 = 0; i11 < 8; i11++) {
            int l = l(i6) + i(i6, i7, i8);
            int[] iArr3 = n;
            int i12 = i9 + l + iArr3[i10] + this.l[i10];
            int i13 = i5 + i12;
            int k = i12 + k(i2) + j(i2, i3, i4);
            int i14 = i10 + 1;
            int l2 = i8 + l(i13) + i(i13, i6, i7) + iArr3[i14] + this.l[i14];
            int i15 = i4 + l2;
            int k2 = l2 + k(k) + j(k, i2, i3);
            int i16 = i10 + 2;
            int l3 = i7 + l(i15) + i(i15, i13, i6) + iArr3[i16] + this.l[i16];
            int i17 = i3 + l3;
            int k3 = l3 + k(k2) + j(k2, k, i2);
            int i18 = i10 + 3;
            int l4 = i6 + l(i17) + i(i17, i15, i13) + iArr3[i18] + this.l[i18];
            int i19 = i2 + l4;
            int k4 = l4 + k(k3) + j(k3, k2, k);
            int i20 = i10 + 4;
            int l5 = i13 + l(i19) + i(i19, i17, i15) + iArr3[i20] + this.l[i20];
            i9 = k + l5;
            i5 = l5 + k(k4) + j(k4, k3, k2);
            int i21 = i10 + 5;
            int l6 = i15 + l(i9) + i(i9, i19, i17) + iArr3[i21] + this.l[i21];
            i8 = k2 + l6;
            i4 = l6 + k(i5) + j(i5, k4, k3);
            int i22 = i10 + 6;
            int l7 = i17 + l(i8) + i(i8, i9, i19) + iArr3[i22] + this.l[i22];
            i7 = k3 + l7;
            i3 = l7 + k(i4) + j(i4, i5, k4);
            int i23 = i10 + 7;
            int l8 = i19 + l(i7) + i(i7, i8, i9) + iArr3[i23] + this.l[i23];
            i6 = k4 + l8;
            i2 = l8 + k(i3) + j(i3, i4, i5);
            i10 += 8;
        }
        this.d += i2;
        this.e += i3;
        this.f += i4;
        this.g += i5;
        this.h += i6;
        this.i += i7;
        this.j += i8;
        this.k += i9;
        this.m = 0;
        for (int i24 = 0; i24 < 16; i24++) {
            this.l[i24] = 0;
        }
    }

    @Override // defpackage.ed4
    protected void g(long j) {
        if (this.m > 14) {
            f();
        }
        int[] iArr = this.l;
        iArr[14] = (int) (j >>> 32);
        iArr[15] = (int) j;
    }

    @Override // defpackage.e23
    public String getAlgorithmName() {
        return "SHA-224";
    }

    @Override // defpackage.e23
    public int getDigestSize() {
        return 28;
    }

    @Override // defpackage.ed4
    protected void h(byte[] bArr, int i) {
        int i2 = (bArr[i + 3] & 255) | (bArr[i] << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
        int[] iArr = this.l;
        int i3 = this.m;
        iArr[i3] = i2;
        int i4 = i3 + 1;
        this.m = i4;
        if (i4 == 16) {
            f();
        }
    }

    @Override // defpackage.ed4, defpackage.e23
    public void reset() {
        super.reset();
        this.d = -1056596264;
        this.e = 914150663;
        this.f = 812702999;
        this.g = -150054599;
        this.h = -4191439;
        this.i = 1750603025;
        this.j = 1694076839;
        this.k = -1090891868;
        this.m = 0;
        int i = 0;
        while (true) {
            int[] iArr = this.l;
            if (i != iArr.length) {
                iArr[i] = 0;
                i++;
            } else {
                return;
            }
        }
    }

    public cq9(cq9 cq9Var) {
        super(cq9Var);
        this.l = new int[64];
        o(cq9Var);
    }
}
