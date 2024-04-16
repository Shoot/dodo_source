package defpackage;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.SocketTimeoutException;
import java.nio.ByteBuffer;
/* compiled from: ConstrainableInputStream.java */
/* renamed from: fr1  reason: default package */
/* loaded from: classes3.dex */
public final class fr1 extends BufferedInputStream {
    private final boolean a;
    private final int b;
    private long c;
    private long d;
    private int e;
    private boolean f;

    private fr1(InputStream inputStream, int i, int i2) {
        super(inputStream, i);
        boolean z;
        this.d = 0L;
        if (i2 >= 0) {
            z = true;
        } else {
            z = false;
        }
        vvb.d(z);
        this.b = i2;
        this.e = i2;
        this.a = i2 != 0;
        this.c = System.nanoTime();
    }

    private boolean a() {
        if (this.d == 0 || System.nanoTime() - this.c <= this.d) {
            return false;
        }
        return true;
    }

    public static fr1 e(InputStream inputStream, int i, int i2) {
        if (inputStream instanceof fr1) {
            return (fr1) inputStream;
        }
        return new fr1(inputStream, i, i2);
    }

    public ByteBuffer b(int i) throws IOException {
        boolean z;
        boolean z2 = true;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        vvb.e(z, "maxSize must be 0 (unlimited) or larger");
        if (i <= 0) {
            z2 = false;
        }
        int i2 = 32768;
        if (z2 && i < 32768) {
            i2 = i;
        }
        byte[] bArr = new byte[i2];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i2);
        while (true) {
            int read = read(bArr, 0, i2);
            if (read == -1) {
                break;
            } else if (z2 && read >= i) {
                byteArrayOutputStream.write(bArr, 0, i);
                break;
            } else {
                byteArrayOutputStream.write(bArr, 0, read);
            }
        }
        return ByteBuffer.wrap(byteArrayOutputStream.toByteArray());
    }

    public fr1 c(long j, long j2) {
        this.c = j;
        this.d = j2 * 1000000;
        return this;
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        if (this.f || (this.a && this.e <= 0)) {
            return -1;
        }
        if (Thread.interrupted()) {
            this.f = true;
            return -1;
        } else if (!a()) {
            if (this.a && i2 > (i3 = this.e)) {
                i2 = i3;
            }
            try {
                int read = super.read(bArr, i, i2);
                this.e -= read;
                return read;
            } catch (SocketTimeoutException unused) {
                return 0;
            }
        } else {
            throw new SocketTimeoutException("Read timeout");
        }
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public void reset() throws IOException {
        super.reset();
        this.e = this.b - ((BufferedInputStream) this).markpos;
    }
}
