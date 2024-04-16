package defpackage;

import java.io.IOException;
import java.io.OutputStream;
/* renamed from: e46  reason: default package */
/* loaded from: classes3.dex */
public class e46 extends OutputStream {
    protected x36 a;

    public e46(x36 x36Var) {
        this.a = x36Var;
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
