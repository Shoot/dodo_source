package defpackage;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
/* renamed from: o62  reason: default package */
/* loaded from: classes3.dex */
public class o62 extends l62 {
    private int[] o = null;
    private int[] p = null;
    private int[] q = null;
    private boolean r;

    @Override // defpackage.l62, defpackage.xc0
    public int a() {
        return 8;
    }

    @Override // defpackage.l62, defpackage.xc0
    public int b(byte[] bArr, int i, byte[] bArr2, int i2) {
        int[] iArr = this.o;
        if (iArr != null) {
            if (i + 8 <= bArr.length) {
                if (i2 + 8 <= bArr2.length) {
                    byte[] bArr3 = new byte[8];
                    if (this.r) {
                        c(iArr, bArr, i, bArr3, 0);
                        c(this.p, bArr3, 0, bArr3, 0);
                        c(this.q, bArr3, 0, bArr2, i2);
                    } else {
                        c(this.q, bArr, i, bArr3, 0);
                        c(this.p, bArr3, 0, bArr3, 0);
                        c(this.o, bArr3, 0, bArr2, i2);
                    }
                    return 8;
                }
                throw new OutputLengthException("output buffer too short");
            }
            throw new DataLengthException("input buffer too short");
        }
        throw new IllegalStateException("DESede engine not initialised");
    }

    @Override // defpackage.l62, defpackage.xc0
    public String getAlgorithmName() {
        return "DESede";
    }

    @Override // defpackage.l62, defpackage.xc0
    public void init(boolean z, v71 v71Var) {
        if (v71Var instanceof lf5) {
            byte[] a = ((lf5) v71Var).a();
            if (a.length != 24 && a.length != 16) {
                throw new IllegalArgumentException("key size must be 16 or 24 bytes.");
            }
            this.r = z;
            byte[] bArr = new byte[8];
            System.arraycopy(a, 0, bArr, 0, 8);
            this.o = d(z, bArr);
            byte[] bArr2 = new byte[8];
            System.arraycopy(a, 8, bArr2, 0, 8);
            this.p = d(!z, bArr2);
            if (a.length == 24) {
                byte[] bArr3 = new byte[8];
                System.arraycopy(a, 16, bArr3, 0, 8);
                this.q = d(z, bArr3);
                return;
            }
            this.q = this.o;
            return;
        }
        throw new IllegalArgumentException("invalid parameter passed to DESede init - " + v71Var.getClass().getName());
    }

    @Override // defpackage.l62, defpackage.xc0
    public void reset() {
    }
}
