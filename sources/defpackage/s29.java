package defpackage;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
/* renamed from: s29  reason: default package */
/* loaded from: classes3.dex */
public class s29 implements rya {
    private byte[] a = null;
    private int b = 0;
    private int c = 0;
    private byte[] d = null;

    private void a(byte[] bArr) {
        this.d = bArr;
        this.b = 0;
        this.c = 0;
        if (this.a == null) {
            this.a = new byte[256];
        }
        for (int i = 0; i < 256; i++) {
            this.a[i] = (byte) i;
        }
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < 256; i4++) {
            byte[] bArr2 = this.a;
            byte b = bArr2[i4];
            i3 = ((bArr[i2] & 255) + b + i3) & 255;
            bArr2[i4] = bArr2[i3];
            bArr2[i3] = b;
            i2 = (i2 + 1) % bArr.length;
        }
    }

    @Override // defpackage.rya
    public String getAlgorithmName() {
        return "RC4";
    }

    @Override // defpackage.rya
    public void init(boolean z, v71 v71Var) {
        if (v71Var instanceof lf5) {
            byte[] a = ((lf5) v71Var).a();
            this.d = a;
            a(a);
            return;
        }
        throw new IllegalArgumentException("invalid parameter passed to RC4 init - " + v71Var.getClass().getName());
    }

    @Override // defpackage.rya
    public int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        if (i + i2 <= bArr.length) {
            if (i3 + i2 <= bArr2.length) {
                for (int i4 = 0; i4 < i2; i4++) {
                    int i5 = (this.b + 1) & 255;
                    this.b = i5;
                    byte[] bArr3 = this.a;
                    byte b = bArr3[i5];
                    int i6 = (this.c + b) & 255;
                    this.c = i6;
                    bArr3[i5] = bArr3[i6];
                    bArr3[i6] = b;
                    bArr2[i4 + i3] = (byte) (bArr3[(bArr3[i5] + b) & 255] ^ bArr[i4 + i]);
                }
                return i2;
            }
            throw new OutputLengthException("output buffer too short");
        }
        throw new DataLengthException("input buffer too short");
    }

    @Override // defpackage.rya
    public void reset() {
        a(this.d);
    }
}
