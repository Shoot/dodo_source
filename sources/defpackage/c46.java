package defpackage;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
/* renamed from: c46  reason: default package */
/* loaded from: classes3.dex */
public class c46 extends FilterInputStream {
    protected x36 a;

    public c46(InputStream inputStream, x36 x36Var) {
        super(inputStream);
        this.a = x36Var;
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
        if (read >= 0) {
            this.a.update(bArr, i, read);
        }
        return read;
    }
}
