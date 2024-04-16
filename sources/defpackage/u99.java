package defpackage;

import androidx.annotation.NonNull;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: RecyclableBufferedInputStream.java */
/* renamed from: u99  reason: default package */
/* loaded from: classes.dex */
public class u99 extends FilterInputStream {
    private volatile byte[] a;
    private int b;
    private int c;
    private int d;
    private int e;
    private final mr f;

    /* compiled from: RecyclableBufferedInputStream.java */
    /* renamed from: u99$a */
    /* loaded from: classes.dex */
    static class a extends IOException {
        a(String str) {
            super(str);
        }
    }

    public u99(@NonNull InputStream inputStream, @NonNull mr mrVar) {
        this(inputStream, mrVar, 65536);
    }

    private int a(InputStream inputStream, byte[] bArr) throws IOException {
        int i = this.d;
        if (i != -1) {
            int i2 = this.e - i;
            int i3 = this.c;
            if (i2 < i3) {
                if (i == 0 && i3 > bArr.length && this.b == bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i3) {
                        i3 = length;
                    }
                    byte[] bArr2 = (byte[]) this.f.c(i3, byte[].class);
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.a = bArr2;
                    this.f.put(bArr);
                    bArr = bArr2;
                } else if (i > 0) {
                    System.arraycopy(bArr, i, bArr, 0, bArr.length - i);
                }
                int i4 = this.e - this.d;
                this.e = i4;
                this.d = 0;
                this.b = 0;
                int read = inputStream.read(bArr, i4, bArr.length - i4);
                int i5 = this.e;
                if (read > 0) {
                    i5 += read;
                }
                this.b = i5;
                return read;
            }
        }
        int read2 = inputStream.read(bArr);
        if (read2 > 0) {
            this.d = -1;
            this.e = 0;
            this.b = read2;
        }
        return read2;
    }

    private static IOException e() throws IOException {
        throw new IOException("BufferedInputStream is closed");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() throws IOException {
        InputStream inputStream;
        inputStream = ((FilterInputStream) this).in;
        if (this.a != null && inputStream != null) {
        } else {
            throw e();
        }
        return (this.b - this.e) + inputStream.available();
    }

    public synchronized void b() {
        this.c = this.a.length;
    }

    public synchronized void c() {
        if (this.a != null) {
            this.f.put(this.a);
            this.a = null;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.a != null) {
            this.f.put(this.a);
            this.a = null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        ((FilterInputStream) this).in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i) {
        this.c = Math.max(this.c, i);
        this.d = this.e;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() throws IOException {
        byte[] bArr = this.a;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (bArr != null && inputStream != null) {
            if (this.e < this.b || a(inputStream, bArr) != -1) {
                if (bArr != this.a && (bArr = this.a) == null) {
                    throw e();
                }
                int i = this.b;
                int i2 = this.e;
                if (i - i2 > 0) {
                    this.e = i2 + 1;
                    return bArr[i2] & 255;
                }
                return -1;
            }
            return -1;
        }
        throw e();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
        if (this.a != null) {
            int i = this.d;
            if (-1 != i) {
                this.e = i;
            } else {
                throw new a("Mark has been invalidated, pos: " + this.e + " markLimit: " + this.c);
            }
        } else {
            throw new IOException("Stream is closed");
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized long skip(long j) throws IOException {
        if (j < 1) {
            return 0L;
        }
        byte[] bArr = this.a;
        if (bArr != null) {
            InputStream inputStream = ((FilterInputStream) this).in;
            if (inputStream != null) {
                int i = this.b;
                int i2 = this.e;
                if (i - i2 >= j) {
                    this.e = (int) (i2 + j);
                    return j;
                }
                long j2 = i - i2;
                this.e = i;
                if (this.d != -1 && j <= this.c) {
                    if (a(inputStream, bArr) == -1) {
                        return j2;
                    }
                    int i3 = this.b;
                    int i4 = this.e;
                    if (i3 - i4 >= j - j2) {
                        this.e = (int) ((i4 + j) - j2);
                        return j;
                    }
                    long j3 = (j2 + i3) - i4;
                    this.e = i3;
                    return j3;
                }
                long skip = inputStream.skip(j - j2);
                if (skip > 0) {
                    this.d = -1;
                }
                return j2 + skip;
            }
            throw e();
        }
        throw e();
    }

    u99(@NonNull InputStream inputStream, @NonNull mr mrVar, int i) {
        super(inputStream);
        this.d = -1;
        this.f = mrVar;
        this.a = (byte[]) mrVar.c(i, byte[].class);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(@NonNull byte[] bArr, int i, int i2) throws IOException {
        int i3;
        int i4;
        byte[] bArr2 = this.a;
        if (bArr2 == null) {
            throw e();
        }
        if (i2 == 0) {
            return 0;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream == null) {
            throw e();
        }
        int i5 = this.e;
        int i6 = this.b;
        if (i5 < i6) {
            int i7 = i6 - i5 >= i2 ? i2 : i6 - i5;
            System.arraycopy(bArr2, i5, bArr, i, i7);
            this.e += i7;
            if (i7 == i2 || inputStream.available() == 0) {
                return i7;
            }
            i += i7;
            i3 = i2 - i7;
        } else {
            i3 = i2;
        }
        while (true) {
            if (this.d == -1 && i3 >= bArr2.length) {
                i4 = inputStream.read(bArr, i, i3);
                if (i4 == -1) {
                    return i3 != i2 ? i2 - i3 : -1;
                }
            } else if (a(inputStream, bArr2) == -1) {
                return i3 != i2 ? i2 - i3 : -1;
            } else {
                if (bArr2 != this.a && (bArr2 = this.a) == null) {
                    throw e();
                }
                int i8 = this.b;
                int i9 = this.e;
                i4 = i8 - i9 >= i3 ? i3 : i8 - i9;
                System.arraycopy(bArr2, i9, bArr, i, i4);
                this.e += i4;
            }
            i3 -= i4;
            if (i3 == 0) {
                return i2;
            }
            if (inputStream.available() == 0) {
                return i2 - i3;
            }
            i += i4;
        }
    }
}
