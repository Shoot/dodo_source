package defpackage;
/* renamed from: tbc  reason: default package */
/* loaded from: classes3.dex */
public class tbc extends ct9 {
    @Override // defpackage.ct9
    protected int c() {
        return 24;
    }

    @Override // defpackage.ct9, defpackage.rya
    public String getAlgorithmName() {
        return "XSalsa20";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ct9
    public void i(byte[] bArr, byte[] bArr2) {
        if (bArr != null) {
            if (bArr.length == 32) {
                super.i(bArr, bArr2);
                mo7.n(bArr2, 8, this.c, 8, 2);
                int[] iArr = this.c;
                int[] iArr2 = new int[iArr.length];
                ct9.h(20, iArr, iArr2);
                int[] iArr3 = this.c;
                iArr3[1] = iArr2[0] - iArr3[0];
                iArr3[2] = iArr2[5] - iArr3[5];
                iArr3[3] = iArr2[10] - iArr3[10];
                iArr3[4] = iArr2[15] - iArr3[15];
                iArr3[11] = iArr2[6] - iArr3[6];
                iArr3[12] = iArr2[7] - iArr3[7];
                iArr3[13] = iArr2[8] - iArr3[8];
                iArr3[14] = iArr2[9] - iArr3[9];
                mo7.n(bArr2, 16, iArr3, 6, 2);
                return;
            }
            throw new IllegalArgumentException(getAlgorithmName() + " requires a 256 bit key");
        }
        throw new IllegalArgumentException(getAlgorithmName() + " doesn't support re-init with null key");
    }
}
