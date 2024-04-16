package defpackage;

import java.io.IOException;
import java.io.OutputStream;
/* renamed from: i23  reason: default package */
/* loaded from: classes3.dex */
public class i23 extends OutputStream {
    protected e23 a;

    public i23(e23 e23Var) {
        this.a = e23Var;
    }

    public byte[] a() {
        byte[] bArr = new byte[this.a.getDigestSize()];
        this.a.doFinal(bArr, 0);
        return bArr;
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        this.a.update((byte) i);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        this.a.update(bArr, i, i2);
    }
}
