package defpackage;

import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import java.io.OutputStream;
/* compiled from: InstrHttpOutputStream.java */
/* renamed from: m55  reason: default package */
/* loaded from: classes2.dex */
public final class m55 extends OutputStream {
    private final OutputStream a;
    private final Timer b;
    gw6 c;
    long d = -1;

    public m55(OutputStream outputStream, gw6 gw6Var, Timer timer) {
        this.a = outputStream;
        this.c = gw6Var;
        this.b = timer;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        long j = this.d;
        if (j != -1) {
            this.c.m(j);
        }
        this.c.q(this.b.c());
        try {
            this.a.close();
        } catch (IOException e) {
            this.c.r(this.b.c());
            hw6.d(this.c);
            throw e;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        try {
            this.a.flush();
        } catch (IOException e) {
            this.c.r(this.b.c());
            hw6.d(this.c);
            throw e;
        }
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        try {
            this.a.write(i);
            long j = this.d + 1;
            this.d = j;
            this.c.m(j);
        } catch (IOException e) {
            this.c.r(this.b.c());
            hw6.d(this.c);
            throw e;
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        try {
            this.a.write(bArr);
            long length = this.d + bArr.length;
            this.d = length;
            this.c.m(length);
        } catch (IOException e) {
            this.c.r(this.b.c());
            hw6.d(this.c);
            throw e;
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        try {
            this.a.write(bArr, i, i2);
            long j = this.d + i2;
            this.d = j;
            this.c.m(j);
        } catch (IOException e) {
            this.c.r(this.b.c());
            hw6.d(this.c);
            throw e;
        }
    }
}
