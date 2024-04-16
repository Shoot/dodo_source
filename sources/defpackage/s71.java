package defpackage;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import org.bouncycastle.crypto.io.InvalidCipherTextIOException;
/* renamed from: s71  reason: default package */
/* loaded from: classes3.dex */
public class s71 extends FilterInputStream {
    private final Cipher a;
    private final byte[] b;
    private boolean c;
    private byte[] d;
    private int e;
    private int f;

    public s71(InputStream inputStream, Cipher cipher) {
        super(inputStream);
        this.b = new byte[512];
        this.c = false;
        this.a = cipher;
    }

    private byte[] a() throws InvalidCipherTextIOException {
        try {
            if (!this.c) {
                this.c = true;
                return this.a.doFinal();
            }
            return null;
        } catch (GeneralSecurityException e) {
            throw new InvalidCipherTextIOException("Error finalising cipher", e);
        }
    }

    private int b() throws IOException {
        if (this.c) {
            return -1;
        }
        this.f = 0;
        this.e = 0;
        while (true) {
            int i = this.e;
            if (i == 0) {
                int read = ((FilterInputStream) this).in.read(this.b);
                if (read == -1) {
                    byte[] a = a();
                    this.d = a;
                    if (a == null || a.length == 0) {
                        return -1;
                    }
                    int length = a.length;
                    this.e = length;
                    return length;
                }
                byte[] update = this.a.update(this.b, 0, read);
                this.d = update;
                if (update != null) {
                    this.e = update.length;
                }
            } else {
                return i;
            }
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() throws IOException {
        return this.e - this.f;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            ((FilterInputStream) this).in.close();
            this.f = 0;
            this.e = 0;
        } finally {
            if (!this.c) {
                a();
            }
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        if (this.f < this.e || b() >= 0) {
            byte[] bArr = this.d;
            int i = this.f;
            this.f = i + 1;
            return bArr[i] & 255;
        }
        return -1;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) throws IOException {
        if (j <= 0) {
            return 0L;
        }
        int min = (int) Math.min(j, available());
        this.f += min;
        return min;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.f < this.e || b() >= 0) {
            int min = Math.min(i2, available());
            System.arraycopy(this.d, this.f, bArr, i, min);
            this.f += min;
            return min;
        }
        return -1;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() throws IOException {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i) {
    }
}
