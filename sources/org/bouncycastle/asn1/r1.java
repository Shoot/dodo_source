package org.bouncycastle.asn1;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class r1 extends u1 {
    private int c;
    private int d;
    private boolean e;
    private boolean f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public r1(InputStream inputStream, int i) throws IOException {
        super(inputStream, i);
        this.e = false;
        this.f = true;
        this.c = inputStream.read();
        int read = inputStream.read();
        this.d = read;
        if (read >= 0) {
            c();
            return;
        }
        throw new EOFException();
    }

    private boolean c() {
        if (!this.e && this.f && this.c == 0 && this.d == 0) {
            this.e = true;
            b(true);
        }
        return this.e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(boolean z) {
        this.f = z;
        c();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (c()) {
            return -1;
        }
        int read = this.a.read();
        if (read >= 0) {
            int i = this.c;
            this.c = this.d;
            this.d = read;
            return i;
        }
        throw new EOFException();
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.f || i2 < 3) {
            return super.read(bArr, i, i2);
        }
        if (this.e) {
            return -1;
        }
        int read = this.a.read(bArr, i + 2, i2 - 2);
        if (read >= 0) {
            bArr[i] = (byte) this.c;
            bArr[i + 1] = (byte) this.d;
            this.c = this.a.read();
            int read2 = this.a.read();
            this.d = read2;
            if (read2 >= 0) {
                return read + 2;
            }
            throw new EOFException();
        }
        throw new EOFException();
    }
}
