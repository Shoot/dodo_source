package defpackage;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
/* renamed from: rvb  reason: default package */
/* loaded from: classes3.dex */
public class rvb implements rya {
    protected byte a = 0;
    protected byte[] b = null;
    protected byte c = 0;
    protected byte[] d;
    protected byte[] e;

    protected void a(byte[] bArr, byte[] bArr2) {
        this.c = (byte) 0;
        this.b = new byte[256];
        for (int i = 0; i < 256; i++) {
            this.b[i] = (byte) i;
        }
        for (int i2 = 0; i2 < 768; i2++) {
            byte[] bArr3 = this.b;
            byte b = this.c;
            int i3 = i2 & 255;
            byte b2 = bArr3[i3];
            byte b3 = bArr3[(b + b2 + bArr[i2 % bArr.length]) & 255];
            this.c = b3;
            bArr3[i3] = bArr3[b3 & 255];
            bArr3[b3 & 255] = b2;
        }
        for (int i4 = 0; i4 < 768; i4++) {
            byte[] bArr4 = this.b;
            byte b4 = this.c;
            int i5 = i4 & 255;
            byte b5 = bArr4[i5];
            byte b6 = bArr4[(b4 + b5 + bArr2[i4 % bArr2.length]) & 255];
            this.c = b6;
            bArr4[i5] = bArr4[b6 & 255];
            bArr4[b6 & 255] = b5;
        }
        this.a = (byte) 0;
    }

    @Override // defpackage.rya
    public String getAlgorithmName() {
        return "VMPC";
    }

    @Override // defpackage.rya
    public void init(boolean z, v71 v71Var) {
        if (v71Var instanceof pq7) {
            pq7 pq7Var = (pq7) v71Var;
            if (pq7Var.b() instanceof lf5) {
                lf5 lf5Var = (lf5) pq7Var.b();
                byte[] a = pq7Var.a();
                this.d = a;
                if (a != null && a.length >= 1 && a.length <= 768) {
                    byte[] a2 = lf5Var.a();
                    this.e = a2;
                    a(a2, this.d);
                    return;
                }
                throw new IllegalArgumentException("VMPC requires 1 to 768 bytes of IV");
            }
            throw new IllegalArgumentException("VMPC init parameters must include a key");
        }
        throw new IllegalArgumentException("VMPC init parameters must include an IV");
    }

    @Override // defpackage.rya
    public int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        if (i + i2 <= bArr.length) {
            if (i3 + i2 <= bArr2.length) {
                for (int i4 = 0; i4 < i2; i4++) {
                    byte[] bArr3 = this.b;
                    byte b = this.c;
                    byte b2 = this.a;
                    byte b3 = bArr3[(b + bArr3[b2 & 255]) & 255];
                    this.c = b3;
                    byte b4 = bArr3[(bArr3[bArr3[b3 & 255] & 255] + 1) & 255];
                    byte b5 = bArr3[b2 & 255];
                    bArr3[b2 & 255] = bArr3[b3 & 255];
                    bArr3[b3 & 255] = b5;
                    this.a = (byte) ((b2 + 1) & 255);
                    bArr2[i4 + i3] = (byte) (bArr[i4 + i] ^ b4);
                }
                return i2;
            }
            throw new OutputLengthException("output buffer too short");
        }
        throw new DataLengthException("input buffer too short");
    }

    @Override // defpackage.rya
    public void reset() {
        a(this.e, this.d);
    }
}
