package defpackage;

import java.io.IOException;
import java.io.OutputStream;
/* renamed from: h8b  reason: default package */
/* loaded from: classes3.dex */
public class h8b extends OutputStream {
    private OutputStream a;
    private OutputStream b;

    public h8b(OutputStream outputStream, OutputStream outputStream2) {
        this.a = outputStream;
        this.b = outputStream2;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.a.close();
        this.b.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        this.a.flush();
        this.b.flush();
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        this.a.write(i);
        this.b.write(i);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        this.a.write(bArr);
        this.b.write(bArr);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        this.a.write(bArr, i, i2);
        this.b.write(bArr, i, i2);
    }
}
