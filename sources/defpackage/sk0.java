package defpackage;
/* renamed from: sk0  reason: default package */
/* loaded from: classes3.dex */
public final class sk0 extends rk0 {
    protected int[] n = new int[48];
    protected int[] o = new int[48];
    protected int[] p = new int[192];
    protected int[] q = new int[192];
    private int[] r = new int[8];

    @Override // defpackage.rk0, defpackage.xc0
    public int a() {
        return 16;
    }

    @Override // defpackage.rk0, defpackage.xc0
    public String getAlgorithmName() {
        return "CAST6";
    }

    @Override // defpackage.rk0
    protected int l(byte[] bArr, int i, byte[] bArr2, int i2) {
        int[] iArr = new int[4];
        o(e(bArr, i), e(bArr, i + 4), e(bArr, i + 8), e(bArr, i + 12), iArr);
        c(iArr[0], bArr2, i2);
        c(iArr[1], bArr2, i2 + 4);
        c(iArr[2], bArr2, i2 + 8);
        c(iArr[3], bArr2, i2 + 12);
        return 16;
    }

    @Override // defpackage.rk0
    protected int m(byte[] bArr, int i, byte[] bArr2, int i2) {
        int[] iArr = new int[4];
        p(e(bArr, i), e(bArr, i + 4), e(bArr, i + 8), e(bArr, i + 12), iArr);
        c(iArr[0], bArr2, i2);
        c(iArr[1], bArr2, i2 + 4);
        c(iArr[2], bArr2, i2 + 8);
        c(iArr[3], bArr2, i2 + 12);
        return 16;
    }

    @Override // defpackage.rk0
    protected void n(byte[] bArr) {
        int i = 1518500249;
        int i2 = 19;
        for (int i3 = 0; i3 < 24; i3++) {
            for (int i4 = 0; i4 < 8; i4++) {
                int i5 = (i3 * 8) + i4;
                this.q[i5] = i;
                i += 1859775393;
                this.p[i5] = i2;
                i2 = (i2 + 17) & 31;
            }
        }
        byte[] bArr2 = new byte[64];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        for (int i6 = 0; i6 < 8; i6++) {
            this.r[i6] = e(bArr2, i6 * 4);
        }
        for (int i7 = 0; i7 < 12; i7++) {
            int i8 = i7 * 16;
            int[] iArr = this.r;
            iArr[6] = iArr[6] ^ h(iArr[7], this.q[i8], this.p[i8]);
            int[] iArr2 = this.r;
            int i9 = i8 + 1;
            iArr2[5] = iArr2[5] ^ i(iArr2[6], this.q[i9], this.p[i9]);
            int[] iArr3 = this.r;
            int i10 = i8 + 2;
            iArr3[4] = iArr3[4] ^ j(iArr3[5], this.q[i10], this.p[i10]);
            int[] iArr4 = this.r;
            int i11 = i8 + 3;
            iArr4[3] = h(iArr4[4], this.q[i11], this.p[i11]) ^ iArr4[3];
            int[] iArr5 = this.r;
            int i12 = i8 + 4;
            iArr5[2] = i(iArr5[3], this.q[i12], this.p[i12]) ^ iArr5[2];
            int[] iArr6 = this.r;
            int i13 = i8 + 5;
            iArr6[1] = j(iArr6[2], this.q[i13], this.p[i13]) ^ iArr6[1];
            int[] iArr7 = this.r;
            int i14 = i8 + 6;
            iArr7[0] = iArr7[0] ^ h(iArr7[1], this.q[i14], this.p[i14]);
            int[] iArr8 = this.r;
            int i15 = i8 + 7;
            iArr8[7] = i(iArr8[0], this.q[i15], this.p[i15]) ^ iArr8[7];
            int i16 = ((i7 * 2) + 1) * 8;
            int[] iArr9 = this.r;
            iArr9[6] = iArr9[6] ^ h(iArr9[7], this.q[i16], this.p[i16]);
            int[] iArr10 = this.r;
            int i17 = i16 + 1;
            iArr10[5] = iArr10[5] ^ i(iArr10[6], this.q[i17], this.p[i17]);
            int[] iArr11 = this.r;
            int i18 = i16 + 2;
            iArr11[4] = iArr11[4] ^ j(iArr11[5], this.q[i18], this.p[i18]);
            int[] iArr12 = this.r;
            int i19 = i16 + 3;
            iArr12[3] = h(iArr12[4], this.q[i19], this.p[i19]) ^ iArr12[3];
            int[] iArr13 = this.r;
            int i20 = i16 + 4;
            iArr13[2] = i(iArr13[3], this.q[i20], this.p[i20]) ^ iArr13[2];
            int[] iArr14 = this.r;
            int i21 = i16 + 5;
            iArr14[1] = j(iArr14[2], this.q[i21], this.p[i21]) ^ iArr14[1];
            int[] iArr15 = this.r;
            int i22 = i16 + 6;
            iArr15[0] = iArr15[0] ^ h(iArr15[1], this.q[i22], this.p[i22]);
            int[] iArr16 = this.r;
            int i23 = i16 + 7;
            iArr16[7] = i(iArr16[0], this.q[i23], this.p[i23]) ^ iArr16[7];
            int[] iArr17 = this.n;
            int i24 = i7 * 4;
            int[] iArr18 = this.r;
            iArr17[i24] = iArr18[0] & 31;
            int i25 = i24 + 1;
            iArr17[i25] = iArr18[2] & 31;
            int i26 = i24 + 2;
            iArr17[i26] = iArr18[4] & 31;
            int i27 = i24 + 3;
            iArr17[i27] = iArr18[6] & 31;
            int[] iArr19 = this.o;
            iArr19[i24] = iArr18[7];
            iArr19[i25] = iArr18[5];
            iArr19[i26] = iArr18[3];
            iArr19[i27] = iArr18[1];
        }
    }

    protected final void o(int i, int i2, int i3, int i4, int[] iArr) {
        int i5;
        int i6 = 0;
        while (true) {
            if (i6 >= 6) {
                break;
            }
            int i7 = (11 - i6) * 4;
            i3 ^= h(i4, this.o[i7], this.n[i7]);
            int i8 = i7 + 1;
            i2 ^= i(i3, this.o[i8], this.n[i8]);
            int i9 = i7 + 2;
            i ^= j(i2, this.o[i9], this.n[i9]);
            int i10 = i7 + 3;
            i4 ^= h(i, this.o[i10], this.n[i10]);
            i6++;
        }
        for (i5 = 6; i5 < 12; i5++) {
            int i11 = (11 - i5) * 4;
            int i12 = i11 + 3;
            i4 ^= h(i, this.o[i12], this.n[i12]);
            int i13 = i11 + 2;
            i ^= j(i2, this.o[i13], this.n[i13]);
            int i14 = i11 + 1;
            i2 ^= i(i3, this.o[i14], this.n[i14]);
            i3 ^= h(i4, this.o[i11], this.n[i11]);
        }
        iArr[0] = i;
        iArr[1] = i2;
        iArr[2] = i3;
        iArr[3] = i4;
    }

    protected final void p(int i, int i2, int i3, int i4, int[] iArr) {
        int i5;
        int i6 = 0;
        while (true) {
            if (i6 >= 6) {
                break;
            }
            int i7 = i6 * 4;
            i3 ^= h(i4, this.o[i7], this.n[i7]);
            int i8 = i7 + 1;
            i2 ^= i(i3, this.o[i8], this.n[i8]);
            int i9 = i7 + 2;
            i ^= j(i2, this.o[i9], this.n[i9]);
            int i10 = i7 + 3;
            i4 ^= h(i, this.o[i10], this.n[i10]);
            i6++;
        }
        for (i5 = 6; i5 < 12; i5++) {
            int i11 = i5 * 4;
            int i12 = i11 + 3;
            i4 ^= h(i, this.o[i12], this.n[i12]);
            int i13 = i11 + 2;
            i ^= j(i2, this.o[i13], this.n[i13]);
            int i14 = i11 + 1;
            i2 ^= i(i3, this.o[i14], this.n[i14]);
            i3 ^= h(i4, this.o[i11], this.n[i11]);
        }
        iArr[0] = i;
        iArr[1] = i2;
        iArr[2] = i3;
        iArr[3] = i4;
    }

    @Override // defpackage.rk0, defpackage.xc0
    public void reset() {
    }
}
