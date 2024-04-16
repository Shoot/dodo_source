package defpackage;
/* renamed from: vn7  reason: default package */
/* loaded from: classes3.dex */
public class vn7 extends ym7 {
    private e23 d;
    private int e;
    private int f;

    public vn7(e23 e23Var) {
        this.d = e23Var;
        if (e23Var instanceof nn3) {
            this.e = e23Var.getDigestSize();
            this.f = ((nn3) e23Var).getByteLength();
            return;
        }
        throw new IllegalArgumentException("Digest " + e23Var.getAlgorithmName() + " unsupported");
    }

    private void h(byte[] bArr, int i, byte[] bArr2) {
        int i2 = (bArr2[bArr2.length - 1] & 255) + (bArr[(bArr2.length + i) - 1] & 255) + 1;
        bArr[(bArr2.length + i) - 1] = (byte) i2;
        int i3 = i2 >>> 8;
        for (int length = bArr2.length - 2; length >= 0; length--) {
            int i4 = i + length;
            int i5 = i3 + (bArr2[length] & 255) + (bArr[i4] & 255);
            bArr[i4] = (byte) i5;
            i3 = i5 >>> 8;
        }
    }

    private byte[] i(int i, int i2) {
        byte[] bArr;
        byte[] bArr2;
        int i3 = this.f;
        byte[] bArr3 = new byte[i3];
        byte[] bArr4 = new byte[i2];
        int i4 = 0;
        for (int i5 = 0; i5 != i3; i5++) {
            bArr3[i5] = (byte) i;
        }
        byte[] bArr5 = this.b;
        if (bArr5 != null && bArr5.length != 0) {
            int i6 = this.f;
            int length = i6 * (((bArr5.length + i6) - 1) / i6);
            bArr = new byte[length];
            for (int i7 = 0; i7 != length; i7++) {
                byte[] bArr6 = this.b;
                bArr[i7] = bArr6[i7 % bArr6.length];
            }
        } else {
            bArr = new byte[0];
        }
        byte[] bArr7 = this.a;
        if (bArr7 != null && bArr7.length != 0) {
            int i8 = this.f;
            int length2 = i8 * (((bArr7.length + i8) - 1) / i8);
            bArr2 = new byte[length2];
            for (int i9 = 0; i9 != length2; i9++) {
                byte[] bArr8 = this.a;
                bArr2[i9] = bArr8[i9 % bArr8.length];
            }
        } else {
            bArr2 = new byte[0];
        }
        int length3 = bArr.length + bArr2.length;
        byte[] bArr9 = new byte[length3];
        System.arraycopy(bArr, 0, bArr9, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr9, bArr.length, bArr2.length);
        int i10 = this.f;
        byte[] bArr10 = new byte[i10];
        int i11 = this.e;
        int i12 = ((i2 + i11) - 1) / i11;
        byte[] bArr11 = new byte[i11];
        int i13 = 1;
        while (i13 <= i12) {
            this.d.update(bArr3, i4, i3);
            this.d.update(bArr9, i4, length3);
            this.d.doFinal(bArr11, i4);
            for (int i14 = 1; i14 < this.c; i14++) {
                this.d.update(bArr11, i4, i11);
                this.d.doFinal(bArr11, i4);
            }
            for (int i15 = 0; i15 != i10; i15++) {
                bArr10[i15] = bArr11[i15 % i11];
            }
            int i16 = 0;
            while (true) {
                int i17 = this.f;
                if (i16 == length3 / i17) {
                    break;
                }
                h(bArr9, i17 * i16, bArr10);
                i16++;
            }
            if (i13 == i12) {
                int i18 = i13 - 1;
                int i19 = this.e;
                System.arraycopy(bArr11, 0, bArr4, i18 * i19, i2 - (i18 * i19));
            } else {
                System.arraycopy(bArr11, 0, bArr4, (i13 - 1) * this.e, i11);
            }
            i13++;
            i4 = 0;
        }
        return bArr4;
    }

    @Override // defpackage.ym7
    public v71 d(int i) {
        int i2 = i / 8;
        return new lf5(i(3, i2), 0, i2);
    }

    @Override // defpackage.ym7
    public v71 e(int i) {
        int i2 = i / 8;
        return new lf5(i(1, i2), 0, i2);
    }

    @Override // defpackage.ym7
    public v71 f(int i, int i2) {
        int i3 = i / 8;
        int i4 = i2 / 8;
        byte[] i5 = i(1, i3);
        return new pq7(new lf5(i5, 0, i3), i(2, i4), 0, i4);
    }
}
