package defpackage;

import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: InstrHttpInputStream.java */
/* renamed from: l55  reason: default package */
/* loaded from: classes2.dex */
public final class l55 extends InputStream {
    private final InputStream a;
    private final gw6 b;
    private final Timer c;
    private long e;
    private long d = -1;
    private long f = -1;

    public l55(InputStream inputStream, gw6 gw6Var, Timer timer) {
        this.c = timer;
        this.a = inputStream;
        this.b = gw6Var;
        this.e = gw6Var.e();
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        try {
            return this.a.available();
        } catch (IOException e) {
            this.b.r(this.c.c());
            hw6.d(this.b);
            throw e;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        long c = this.c.c();
        if (this.f == -1) {
            this.f = c;
        }
        try {
            this.a.close();
            long j = this.d;
            if (j != -1) {
                this.b.p(j);
            }
            long j2 = this.e;
            if (j2 != -1) {
                this.b.s(j2);
            }
            this.b.r(this.f);
            this.b.b();
        } catch (IOException e) {
            this.b.r(this.c.c());
            hw6.d(this.b);
            throw e;
        }
    }

    @Override // java.io.InputStream
    public void mark(int i) {
        this.a.mark(i);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.a.markSupported();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        try {
            int read = this.a.read();
            long c = this.c.c();
            if (this.e == -1) {
                this.e = c;
            }
            if (read == -1 && this.f == -1) {
                this.f = c;
                this.b.r(c);
                this.b.b();
            } else {
                long j = this.d + 1;
                this.d = j;
                this.b.p(j);
            }
            return read;
        } catch (IOException e) {
            this.b.r(this.c.c());
            hw6.d(this.b);
            throw e;
        }
    }

    @Override // java.io.InputStream
    public void reset() throws IOException {
        try {
            this.a.reset();
        } catch (IOException e) {
            this.b.r(this.c.c());
            hw6.d(this.b);
            throw e;
        }
    }

    @Override // java.io.InputStream
    public long skip(long j) throws IOException {
        try {
            long skip = this.a.skip(j);
            long c = this.c.c();
            if (this.e == -1) {
                this.e = c;
            }
            if (skip == -1 && this.f == -1) {
                this.f = c;
                this.b.r(c);
            } else {
                long j2 = this.d + skip;
                this.d = j2;
                this.b.p(j2);
            }
            return skip;
        } catch (IOException e) {
            this.b.r(this.c.c());
            hw6.d(this.b);
            throw e;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        try {
            int read = this.a.read(bArr, i, i2);
            long c = this.c.c();
            if (this.e == -1) {
                this.e = c;
            }
            if (read == -1 && this.f == -1) {
                this.f = c;
                this.b.r(c);
                this.b.b();
            } else {
                long j = this.d + read;
                this.d = j;
                this.b.p(j);
            }
            return read;
        } catch (IOException e) {
            this.b.r(this.c.c());
            hw6.d(this.b);
            throw e;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        try {
            int read = this.a.read(bArr);
            long c = this.c.c();
            if (this.e == -1) {
                this.e = c;
            }
            if (read == -1 && this.f == -1) {
                this.f = c;
                this.b.r(c);
                this.b.b();
            } else {
                long j = this.d + read;
                this.d = j;
                this.b.p(j);
            }
            return read;
        } catch (IOException e) {
            this.b.r(this.c.c());
            hw6.d(this.b);
            throw e;
        }
    }
}
