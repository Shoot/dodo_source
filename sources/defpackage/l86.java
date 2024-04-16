package defpackage;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: MarkableInputStream.java */
/* renamed from: l86  reason: default package */
/* loaded from: classes3.dex */
final class l86 extends InputStream {
    private final InputStream a;
    private long b;
    private long c;
    private long d;
    private long e;
    private boolean f;
    private int g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public l86(InputStream inputStream) {
        this(inputStream, 4096);
    }

    private void e(long j) {
        try {
            long j2 = this.c;
            long j3 = this.b;
            if (j2 < j3 && j3 <= this.d) {
                this.a.reset();
                this.a.mark((int) (j - this.c));
                i(this.c, this.b);
            } else {
                this.c = j3;
                this.a.mark((int) (j - j3));
            }
            this.d = j;
        } catch (IOException e) {
            throw new IllegalStateException("Unable to mark: " + e);
        }
    }

    private void i(long j, long j2) throws IOException {
        while (j < j2) {
            long skip = this.a.skip(j2 - j);
            if (skip == 0) {
                if (read() != -1) {
                    skip = 1;
                } else {
                    return;
                }
            }
            j += skip;
        }
    }

    public void a(boolean z) {
        this.f = z;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return this.a.available();
    }

    public void b(long j) throws IOException {
        if (this.b <= this.d && j >= this.c) {
            this.a.reset();
            i(this.c, j);
            this.b = j;
            return;
        }
        throw new IOException("Cannot reset");
    }

    public long c(int i) {
        long j = this.b + i;
        if (this.d < j) {
            e(j);
        }
        return this.b;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.a.close();
    }

    @Override // java.io.InputStream
    public void mark(int i) {
        this.e = c(i);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.a.markSupported();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (!this.f) {
            long j = this.d;
            if (this.b + 1 > j) {
                e(j + this.g);
            }
        }
        int read = this.a.read();
        if (read != -1) {
            this.b++;
        }
        return read;
    }

    @Override // java.io.InputStream
    public void reset() throws IOException {
        b(this.e);
    }

    @Override // java.io.InputStream
    public long skip(long j) throws IOException {
        if (!this.f) {
            long j2 = this.b;
            if (j2 + j > this.d) {
                e(j2 + j + this.g);
            }
        }
        long skip = this.a.skip(j);
        this.b += skip;
        return skip;
    }

    l86(InputStream inputStream, int i) {
        this(inputStream, i, 1024);
    }

    private l86(InputStream inputStream, int i, int i2) {
        this.e = -1L;
        this.f = true;
        this.g = -1;
        this.a = inputStream.markSupported() ? inputStream : new BufferedInputStream(inputStream, i);
        this.g = i2;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        if (!this.f) {
            long j = this.b;
            if (bArr.length + j > this.d) {
                e(j + bArr.length + this.g);
            }
        }
        int read = this.a.read(bArr);
        if (read != -1) {
            this.b += read;
        }
        return read;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (!this.f) {
            long j = this.b;
            long j2 = i2;
            if (j + j2 > this.d) {
                e(j + j2 + this.g);
            }
        }
        int read = this.a.read(bArr, i, i2);
        if (read != -1) {
            this.b += read;
        }
        return read;
    }
}
