package defpackage;

import java.io.IOException;
import java.io.InputStream;
/* compiled from: BrotliInputStream.java */
/* renamed from: hg0  reason: default package */
/* loaded from: classes3.dex */
public class hg0 extends InputStream {
    private byte[] a;
    private int b;
    private int c;
    private final aua d;

    public hg0(InputStream inputStream) throws IOException {
        this(inputStream, 16384, null);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        aua.a(this.d);
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (this.c >= this.b) {
            byte[] bArr = this.a;
            int read = read(bArr, 0, bArr.length);
            this.b = read;
            this.c = 0;
            if (read == -1) {
                return -1;
            }
        }
        byte[] bArr2 = this.a;
        int i = this.c;
        this.c = i + 1;
        return bArr2[i] & 255;
    }

    public hg0(InputStream inputStream, int i, byte[] bArr) throws IOException {
        aua auaVar = new aua();
        this.d = auaVar;
        if (i <= 0) {
            throw new IllegalArgumentException("Bad buffer size:" + i);
        } else if (inputStream != null) {
            this.a = new byte[i];
            this.b = 0;
            this.c = 0;
            try {
                aua.c(auaVar, inputStream);
                if (bArr != null) {
                    po2.s(auaVar, bArr);
                }
            } catch (kg0 e) {
                throw new IOException("Brotli decoder initialization failed", e);
            }
        } else {
            throw new IllegalArgumentException("source is null");
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (i < 0) {
            throw new IllegalArgumentException("Bad offset: " + i);
        } else if (i2 >= 0) {
            int i3 = i + i2;
            if (i3 > bArr.length) {
                throw new IllegalArgumentException("Buffer overflow: " + i3 + " > " + bArr.length);
            } else if (i2 == 0) {
                return 0;
            } else {
                int max = Math.max(this.b - this.c, 0);
                if (max != 0) {
                    max = Math.min(max, i2);
                    System.arraycopy(this.a, this.c, bArr, i, max);
                    this.c += max;
                    i += max;
                    i2 -= max;
                    if (i2 == 0) {
                        return max;
                    }
                }
                try {
                    aua auaVar = this.d;
                    auaVar.Z = bArr;
                    auaVar.U = i;
                    auaVar.V = i2;
                    auaVar.W = 0;
                    po2.i(auaVar);
                    int i4 = this.d.W;
                    if (i4 == 0) {
                        return -1;
                    }
                    return i4 + max;
                } catch (kg0 e) {
                    throw new IOException("Brotli stream decoding failed", e);
                }
            }
        } else {
            throw new IllegalArgumentException("Bad length: " + i2);
        }
    }
}
