package defpackage;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: StreamReader.java */
/* renamed from: wya  reason: default package */
/* loaded from: classes2.dex */
public class wya extends FilterInputStream implements m79 {
    private int a;

    public wya(InputStream inputStream) {
        super(inputStream);
        try {
            inputStream.reset();
        } catch (IOException unused) {
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, defpackage.m79
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int read = super.read(bArr, i, i2);
        this.a += Math.max(0, read);
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, defpackage.m79
    public synchronized void reset() throws IOException {
        super.reset();
        this.a = 0;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) throws IOException {
        long j2 = j;
        while (j2 > 0) {
            long skip = super.skip(j2);
            if (skip > 0) {
                j2 -= skip;
            } else if (super.read() == -1) {
                break;
            } else {
                j2--;
            }
        }
        long j3 = j - j2;
        this.a = (int) (this.a + j3);
        return j3;
    }
}
