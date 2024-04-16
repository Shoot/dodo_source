package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
/* compiled from: StrictLineReader.java */
/* renamed from: hza  reason: default package */
/* loaded from: classes.dex */
class hza implements Closeable {
    private final InputStream a;
    private final Charset b;
    private byte[] c;
    private int d;
    private int e;

    /* compiled from: StrictLineReader.java */
    /* renamed from: hza$a */
    /* loaded from: classes.dex */
    class a extends ByteArrayOutputStream {
        a(int i) {
            super(i);
        }

        @Override // java.io.ByteArrayOutputStream
        public String toString() {
            int i = ((ByteArrayOutputStream) this).count;
            if (i > 0 && ((ByteArrayOutputStream) this).buf[i - 1] == 13) {
                i--;
            }
            try {
                return new String(((ByteArrayOutputStream) this).buf, 0, i, hza.this.b.name());
            } catch (UnsupportedEncodingException e) {
                throw new AssertionError(e);
            }
        }
    }

    public hza(InputStream inputStream, Charset charset) {
        this(inputStream, 8192, charset);
    }

    private void b() throws IOException {
        InputStream inputStream = this.a;
        byte[] bArr = this.c;
        int read = inputStream.read(bArr, 0, bArr.length);
        if (read != -1) {
            this.d = 0;
            this.e = read;
            return;
        }
        throw new EOFException();
    }

    public boolean c() {
        if (this.e == -1) {
            return true;
        }
        return false;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        synchronized (this.a) {
            try {
                if (this.c != null) {
                    this.c = null;
                    this.a.close();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String e() throws IOException {
        int i;
        byte[] bArr;
        int i2;
        synchronized (this.a) {
            try {
                if (this.c != null) {
                    if (this.d >= this.e) {
                        b();
                    }
                    for (int i3 = this.d; i3 != this.e; i3++) {
                        byte[] bArr2 = this.c;
                        if (bArr2[i3] == 10) {
                            int i4 = this.d;
                            if (i3 != i4) {
                                i2 = i3 - 1;
                                if (bArr2[i2] == 13) {
                                    String str = new String(bArr2, i4, i2 - i4, this.b.name());
                                    this.d = i3 + 1;
                                    return str;
                                }
                            }
                            i2 = i3;
                            String str2 = new String(bArr2, i4, i2 - i4, this.b.name());
                            this.d = i3 + 1;
                            return str2;
                        }
                    }
                    a aVar = new a((this.e - this.d) + 80);
                    loop1: while (true) {
                        byte[] bArr3 = this.c;
                        int i5 = this.d;
                        aVar.write(bArr3, i5, this.e - i5);
                        this.e = -1;
                        b();
                        i = this.d;
                        while (i != this.e) {
                            bArr = this.c;
                            if (bArr[i] == 10) {
                                break loop1;
                            }
                            i++;
                        }
                    }
                    int i6 = this.d;
                    if (i != i6) {
                        aVar.write(bArr, i6, i - i6);
                    }
                    this.d = i + 1;
                    return aVar.toString();
                }
                throw new IOException("LineReader is closed");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public hza(InputStream inputStream, int i, Charset charset) {
        if (inputStream == null || charset == null) {
            throw null;
        }
        if (i >= 0) {
            if (charset.equals(yub.a)) {
                this.a = inputStream;
                this.b = charset;
                this.c = new byte[i];
                return;
            }
            throw new IllegalArgumentException("Unsupported encoding");
        }
        throw new IllegalArgumentException("capacity <= 0");
    }
}
