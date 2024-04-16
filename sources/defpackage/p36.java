package defpackage;
/* renamed from: p36  reason: default package */
/* loaded from: classes3.dex */
public class p36 extends ed4 {
    private int d;
    private int e;
    private int f;
    private int g;
    private int[] h;
    private int i;

    public p36() {
        this.h = new int[16];
        reset();
    }

    private int i(int i, int i2, int i3) {
        return ((~i) & i3) | (i2 & i);
    }

    private int j(int i, int i2, int i3) {
        return (i & i3) | (i & i2) | (i2 & i3);
    }

    private int k(int i, int i2, int i3) {
        return (i ^ i2) ^ i3;
    }

    private void l(p36 p36Var) {
        super.d(p36Var);
        this.d = p36Var.d;
        this.e = p36Var.e;
        this.f = p36Var.f;
        this.g = p36Var.g;
        int[] iArr = p36Var.h;
        System.arraycopy(iArr, 0, this.h, 0, iArr.length);
        this.i = p36Var.i;
    }

    private int m(int i, int i2) {
        return (i >>> (32 - i2)) | (i << i2);
    }

    private void n(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >>> 8);
        bArr[i2 + 2] = (byte) (i >>> 16);
        bArr[i2 + 3] = (byte) (i >>> 24);
    }

    @Override // defpackage.sc6
    public sc6 a() {
        return new p36(this);
    }

    @Override // defpackage.sc6
    public void b(sc6 sc6Var) {
        l((p36) sc6Var);
    }

    @Override // defpackage.e23
    public int doFinal(byte[] bArr, int i) {
        e();
        n(this.d, bArr, i);
        n(this.e, bArr, i + 4);
        n(this.f, bArr, i + 8);
        n(this.g, bArr, i + 12);
        reset();
        return 16;
    }

    @Override // defpackage.ed4
    protected void f() {
        int i = this.d;
        int i2 = this.e;
        int i3 = this.f;
        int i4 = this.g;
        int m = m(i + i(i2, i3, i4) + this.h[0], 3);
        int m2 = m(i4 + i(m, i2, i3) + this.h[1], 7);
        int m3 = m(i3 + i(m2, m, i2) + this.h[2], 11);
        int m4 = m(i2 + i(m3, m2, m) + this.h[3], 19);
        int m5 = m(m + i(m4, m3, m2) + this.h[4], 3);
        int m6 = m(m2 + i(m5, m4, m3) + this.h[5], 7);
        int m7 = m(m3 + i(m6, m5, m4) + this.h[6], 11);
        int m8 = m(m4 + i(m7, m6, m5) + this.h[7], 19);
        int m9 = m(m5 + i(m8, m7, m6) + this.h[8], 3);
        int m10 = m(m6 + i(m9, m8, m7) + this.h[9], 7);
        int m11 = m(m7 + i(m10, m9, m8) + this.h[10], 11);
        int m12 = m(m8 + i(m11, m10, m9) + this.h[11], 19);
        int m13 = m(m9 + i(m12, m11, m10) + this.h[12], 3);
        int m14 = m(m10 + i(m13, m12, m11) + this.h[13], 7);
        int m15 = m(m11 + i(m14, m13, m12) + this.h[14], 11);
        int m16 = m(m12 + i(m15, m14, m13) + this.h[15], 19);
        int m17 = m(m13 + j(m16, m15, m14) + this.h[0] + 1518500249, 3);
        int m18 = m(m14 + j(m17, m16, m15) + this.h[4] + 1518500249, 5);
        int m19 = m(m15 + j(m18, m17, m16) + this.h[8] + 1518500249, 9);
        int m20 = m(m16 + j(m19, m18, m17) + this.h[12] + 1518500249, 13);
        int m21 = m(m17 + j(m20, m19, m18) + this.h[1] + 1518500249, 3);
        int m22 = m(m18 + j(m21, m20, m19) + this.h[5] + 1518500249, 5);
        int m23 = m(m19 + j(m22, m21, m20) + this.h[9] + 1518500249, 9);
        int m24 = m(m20 + j(m23, m22, m21) + this.h[13] + 1518500249, 13);
        int m25 = m(m21 + j(m24, m23, m22) + this.h[2] + 1518500249, 3);
        int m26 = m(m22 + j(m25, m24, m23) + this.h[6] + 1518500249, 5);
        int m27 = m(m23 + j(m26, m25, m24) + this.h[10] + 1518500249, 9);
        int m28 = m(m24 + j(m27, m26, m25) + this.h[14] + 1518500249, 13);
        int m29 = m(m25 + j(m28, m27, m26) + this.h[3] + 1518500249, 3);
        int m30 = m(m26 + j(m29, m28, m27) + this.h[7] + 1518500249, 5);
        int m31 = m(m27 + j(m30, m29, m28) + this.h[11] + 1518500249, 9);
        int m32 = m(m28 + j(m31, m30, m29) + this.h[15] + 1518500249, 13);
        int m33 = m(m29 + k(m32, m31, m30) + this.h[0] + 1859775393, 3);
        int m34 = m(m30 + k(m33, m32, m31) + this.h[8] + 1859775393, 9);
        int m35 = m(m31 + k(m34, m33, m32) + this.h[4] + 1859775393, 11);
        int m36 = m(m32 + k(m35, m34, m33) + this.h[12] + 1859775393, 15);
        int m37 = m(m33 + k(m36, m35, m34) + this.h[2] + 1859775393, 3);
        int m38 = m(m34 + k(m37, m36, m35) + this.h[10] + 1859775393, 9);
        int m39 = m(m35 + k(m38, m37, m36) + this.h[6] + 1859775393, 11);
        int m40 = m(m36 + k(m39, m38, m37) + this.h[14] + 1859775393, 15);
        int m41 = m(m37 + k(m40, m39, m38) + this.h[1] + 1859775393, 3);
        int m42 = m(m38 + k(m41, m40, m39) + this.h[9] + 1859775393, 9);
        int m43 = m(m39 + k(m42, m41, m40) + this.h[5] + 1859775393, 11);
        int m44 = m(m40 + k(m43, m42, m41) + this.h[13] + 1859775393, 15);
        int m45 = m(m41 + k(m44, m43, m42) + this.h[3] + 1859775393, 3);
        int m46 = m(m42 + k(m45, m44, m43) + this.h[11] + 1859775393, 9);
        int m47 = m(m43 + k(m46, m45, m44) + this.h[7] + 1859775393, 11);
        int m48 = m(m44 + k(m47, m46, m45) + this.h[15] + 1859775393, 15);
        this.d += m45;
        this.e += m48;
        this.f += m47;
        this.g += m46;
        this.i = 0;
        int i5 = 0;
        while (true) {
            int[] iArr = this.h;
            if (i5 != iArr.length) {
                iArr[i5] = 0;
                i5++;
            } else {
                return;
            }
        }
    }

    @Override // defpackage.ed4
    protected void g(long j) {
        if (this.i > 14) {
            f();
        }
        int[] iArr = this.h;
        iArr[14] = (int) j;
        iArr[15] = (int) (j >>> 32);
    }

    @Override // defpackage.e23
    public String getAlgorithmName() {
        return "MD4";
    }

    @Override // defpackage.e23
    public int getDigestSize() {
        return 16;
    }

    @Override // defpackage.ed4
    protected void h(byte[] bArr, int i) {
        int[] iArr = this.h;
        int i2 = this.i;
        int i3 = i2 + 1;
        this.i = i3;
        iArr[i2] = ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        if (i3 == 16) {
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
        this.i = 0;
        int i = 0;
        while (true) {
            int[] iArr = this.h;
            if (i != iArr.length) {
                iArr[i] = 0;
                i++;
            } else {
                return;
            }
        }
    }

    public p36(p36 p36Var) {
        super(p36Var);
        this.h = new int[16];
        l(p36Var);
    }
}
