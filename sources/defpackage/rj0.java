package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
/* compiled from: ByteBufferBackedInputStream.java */
/* renamed from: rj0  reason: default package */
/* loaded from: classes2.dex */
public class rj0 extends InputStream {
    protected final ByteBuffer a;

    public rj0(ByteBuffer byteBuffer) {
        this.a = byteBuffer;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.a.remaining();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (this.a.hasRemaining()) {
            return this.a.get() & 255;
        }
        return -1;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.a.hasRemaining()) {
            int min = Math.min(i2, this.a.remaining());
            this.a.get(bArr, i, min);
            return min;
        }
        return -1;
    }
}
