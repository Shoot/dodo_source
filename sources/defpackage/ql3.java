package defpackage;

import androidx.annotation.NonNull;
import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;
/* compiled from: ExceptionPassthroughInputStream.java */
/* renamed from: ql3  reason: default package */
/* loaded from: classes.dex */
public final class ql3 extends InputStream {
    private static final Queue<ql3> c = vub.g(0);
    private InputStream a;
    private IOException b;

    ql3() {
    }

    @NonNull
    public static ql3 b(@NonNull InputStream inputStream) {
        ql3 poll;
        Queue<ql3> queue = c;
        synchronized (queue) {
            poll = queue.poll();
        }
        if (poll == null) {
            poll = new ql3();
        }
        poll.e(inputStream);
        return poll;
    }

    public IOException a() {
        return this.b;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return this.a.available();
    }

    public void c() {
        this.b = null;
        this.a = null;
        Queue<ql3> queue = c;
        synchronized (queue) {
            queue.offer(this);
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.a.close();
    }

    void e(@NonNull InputStream inputStream) {
        this.a = inputStream;
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
            return this.a.read();
        } catch (IOException e) {
            this.b = e;
            throw e;
        }
    }

    @Override // java.io.InputStream
    public synchronized void reset() throws IOException {
        this.a.reset();
    }

    @Override // java.io.InputStream
    public long skip(long j) throws IOException {
        try {
            return this.a.skip(j);
        } catch (IOException e) {
            this.b = e;
            throw e;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        try {
            return this.a.read(bArr);
        } catch (IOException e) {
            this.b = e;
            throw e;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        try {
            return this.a.read(bArr, i, i2);
        } catch (IOException e) {
            this.b = e;
            throw e;
        }
    }
}
