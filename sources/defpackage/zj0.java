package defpackage;

import java.io.IOException;
import java.nio.ByteBuffer;
/* compiled from: ByteBufferReader.java */
/* renamed from: zj0  reason: default package */
/* loaded from: classes2.dex */
public class zj0 implements m79 {
    protected final ByteBuffer a;

    public zj0(ByteBuffer byteBuffer) {
        this.a = byteBuffer;
        byteBuffer.position(0);
    }

    @Override // defpackage.m79
    public int available() throws IOException {
        return this.a.limit() - this.a.position();
    }

    @Override // defpackage.m79, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        this.a.get(bArr, i, i2);
        return i2;
    }

    @Override // defpackage.m79, java.io.InputStream
    public void reset() throws IOException {
        this.a.position(0);
    }

    @Override // defpackage.m79
    public void close() throws IOException {
    }
}
