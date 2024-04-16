package org.bouncycastle.asn1;

import java.io.IOException;
import java.util.Date;
/* loaded from: classes3.dex */
public class n0 extends g {
    public n0(Date date) {
        super(date);
    }

    private byte[] T() {
        byte[] bArr = this.a;
        if (bArr[bArr.length - 1] == 90) {
            if (!O()) {
                byte[] bArr2 = this.a;
                byte[] bArr3 = new byte[bArr2.length + 4];
                System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length - 1);
                System.arraycopy(a0b.e("0000Z"), 0, bArr3, this.a.length - 1, 5);
                return bArr3;
            } else if (!P()) {
                byte[] bArr4 = this.a;
                byte[] bArr5 = new byte[bArr4.length + 2];
                System.arraycopy(bArr4, 0, bArr5, 0, bArr4.length - 1);
                System.arraycopy(a0b.e("00Z"), 0, bArr5, this.a.length - 1, 3);
                return bArr5;
            } else if (J()) {
                int length = this.a.length - 2;
                while (length > 0 && this.a[length] == 48) {
                    length--;
                }
                byte[] bArr6 = this.a;
                if (bArr6[length] == 46) {
                    byte[] bArr7 = new byte[length + 1];
                    System.arraycopy(bArr6, 0, bArr7, 0, length);
                    bArr7[length] = 90;
                    return bArr7;
                }
                byte[] bArr8 = new byte[length + 2];
                int i = length + 1;
                System.arraycopy(bArr6, 0, bArr8, 0, i);
                bArr8[i] = 90;
                return bArr8;
            } else {
                return this.a;
            }
        }
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.g, org.bouncycastle.asn1.n
    public void u(m mVar, boolean z) throws IOException {
        mVar.n(z, 24, T());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.g, org.bouncycastle.asn1.n
    public int v() {
        int length = T().length;
        return v1.a(length) + 1 + length;
    }

    public n0(byte[] bArr) {
        super(bArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.g, org.bouncycastle.asn1.n
    public n B() {
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.g, org.bouncycastle.asn1.n
    public n C() {
        return this;
    }
}
