package defpackage;

import androidx.annotation.NonNull;
import java.io.IOException;
import java.io.OutputStream;
/* compiled from: BufferedOutputStream.java */
/* renamed from: dh0  reason: default package */
/* loaded from: classes.dex */
public final class dh0 extends OutputStream {
    @NonNull
    private final OutputStream a;
    private byte[] b;
    private mr c;
    private int d;

    public dh0(@NonNull OutputStream outputStream, @NonNull mr mrVar) {
        this(outputStream, mrVar, 65536);
    }

    private void a() throws IOException {
        int i = this.d;
        if (i > 0) {
            this.a.write(this.b, 0, i);
            this.d = 0;
        }
    }

    private void b() throws IOException {
        if (this.d == this.b.length) {
            a();
        }
    }

    private void c() {
        byte[] bArr = this.b;
        if (bArr != null) {
            this.c.put(bArr);
            this.b = null;
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            flush();
            this.a.close();
            c();
        } catch (Throwable th) {
            this.a.close();
            throw th;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        a();
        this.a.flush();
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        byte[] bArr = this.b;
        int i2 = this.d;
        this.d = i2 + 1;
        bArr[i2] = (byte) i;
        b();
    }

    dh0(@NonNull OutputStream outputStream, mr mrVar, int i) {
        this.a = outputStream;
        this.c = mrVar;
        this.b = (byte[]) mrVar.c(i, byte[].class);
    }

    @Override // java.io.OutputStream
    public void write(@NonNull byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(@NonNull byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        do {
            int i4 = i2 - i3;
            int i5 = i + i3;
            int i6 = this.d;
            if (i6 == 0 && i4 >= this.b.length) {
                this.a.write(bArr, i5, i4);
                return;
            }
            int min = Math.min(i4, this.b.length - i6);
            System.arraycopy(bArr, i5, this.b, this.d, min);
            this.d += min;
            i3 += min;
            b();
        } while (i3 < i2);
    }
}
