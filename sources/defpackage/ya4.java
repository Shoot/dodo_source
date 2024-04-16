package defpackage;

import org.bouncycastle.crypto.InvalidCipherTextException;
/* renamed from: ya4  reason: default package */
/* loaded from: classes3.dex */
public class ya4 implements l8c {
    private ua4 a = new ua4();
    private va4 b = new va4();

    @Override // defpackage.l8c
    public byte[] a(byte[] bArr, int i, int i2) {
        this.b.update(bArr, i, i2);
        byte[] bArr2 = new byte[this.b.getMacSize() + i2];
        this.a.b(bArr, i, bArr2, 0);
        this.a.b(bArr, i + 8, bArr2, 8);
        this.a.b(bArr, i + 16, bArr2, 16);
        this.a.b(bArr, i + 24, bArr2, 24);
        this.b.doFinal(bArr2, i2);
        return bArr2;
    }

    @Override // defpackage.l8c
    public byte[] b(byte[] bArr, int i, int i2) throws InvalidCipherTextException {
        int macSize = i2 - this.b.getMacSize();
        byte[] bArr2 = new byte[macSize];
        this.a.b(bArr, i, bArr2, 0);
        this.a.b(bArr, i + 8, bArr2, 8);
        this.a.b(bArr, i + 16, bArr2, 16);
        this.a.b(bArr, i + 24, bArr2, 24);
        byte[] bArr3 = new byte[this.b.getMacSize()];
        this.b.update(bArr2, 0, macSize);
        this.b.doFinal(bArr3, 0);
        byte[] bArr4 = new byte[this.b.getMacSize()];
        System.arraycopy(bArr, (i + i2) - 4, bArr4, 0, this.b.getMacSize());
        if (tr.u(bArr3, bArr4)) {
            return bArr2;
        }
        throw new IllegalStateException("mac mismatch");
    }

    @Override // defpackage.l8c
    public String getAlgorithmName() {
        return "GOST28147Wrap";
    }

    @Override // defpackage.l8c
    public void init(boolean z, v71 v71Var) {
        if (v71Var instanceof qq7) {
            v71Var = ((qq7) v71Var).a();
        }
        sq7 sq7Var = (sq7) v71Var;
        this.a.init(z, sq7Var.a());
        this.b.init(new pq7(sq7Var.a(), sq7Var.b()));
    }
}
