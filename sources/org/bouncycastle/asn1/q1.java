package org.bouncycastle.asn1;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
/* loaded from: classes3.dex */
class q1 extends u1 {
    private static final byte[] e = new byte[0];
    private final int c;
    private int d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public q1(InputStream inputStream, int i, int i2) {
        super(inputStream, i2);
        if (i >= 0) {
            this.c = i;
            this.d = i;
            if (i == 0) {
                b(true);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("negative lengths not allowed");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int c() {
        return this.d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(byte[] bArr) throws IOException {
        int i = this.d;
        if (i == bArr.length) {
            if (i == 0) {
                return;
            }
            int a = a();
            int i2 = this.d;
            if (i2 < a) {
                int c = i2 - aza.c(this.a, bArr);
                this.d = c;
                if (c == 0) {
                    b(true);
                    return;
                }
                throw new EOFException("DEF length " + this.c + " object truncated by " + this.d);
            }
            throw new IOException("corrupted stream - out of bounds length found: " + this.d + " >= " + a);
        }
        throw new IllegalArgumentException("buffer length not right for data");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public byte[] i() throws IOException {
        if (this.d == 0) {
            return e;
        }
        int a = a();
        int i = this.d;
        if (i < a) {
            byte[] bArr = new byte[i];
            int c = i - aza.c(this.a, bArr);
            this.d = c;
            if (c == 0) {
                b(true);
                return bArr;
            }
            throw new EOFException("DEF length " + this.c + " object truncated by " + this.d);
        }
        throw new IOException("corrupted stream - out of bounds length found: " + this.d + " >= " + a);
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (this.d == 0) {
            return -1;
        }
        int read = this.a.read();
        if (read >= 0) {
            int i = this.d - 1;
            this.d = i;
            if (i == 0) {
                b(true);
            }
            return read;
        }
        throw new EOFException("DEF length " + this.c + " object truncated by " + this.d);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.d;
        if (i3 == 0) {
            return -1;
        }
        int read = this.a.read(bArr, i, Math.min(i2, i3));
        if (read >= 0) {
            int i4 = this.d - read;
            this.d = i4;
            if (i4 == 0) {
                b(true);
            }
            return read;
        }
        throw new EOFException("DEF length " + this.c + " object truncated by " + this.d);
    }
}
