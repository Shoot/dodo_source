package defpackage;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
/* renamed from: h23  reason: default package */
/* loaded from: classes3.dex */
public class h23 extends FilterInputStream {
    protected e23 a;

    public h23(InputStream inputStream, e23 e23Var) {
        super(inputStream);
        this.a = e23Var;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int read = ((FilterInputStream) this).in.read();
        if (read >= 0) {
            this.a.update((byte) read);
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int read = ((FilterInputStream) this).in.read(bArr, i, i2);
        if (read > 0) {
            this.a.update(bArr, i, read);
        }
        return read;
    }
}
