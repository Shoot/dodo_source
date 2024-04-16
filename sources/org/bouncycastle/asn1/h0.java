package org.bouncycastle.asn1;

import java.io.IOException;
import java.io.InputStream;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class h0 extends InputStream {
    private final r a;
    private boolean b = true;
    private InputStream c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h0(r rVar) {
        this.a = rVar;
    }

    private defpackage.j0 a() throws IOException {
        defpackage.h0 b = this.a.b();
        if (b == null) {
            return null;
        }
        if (b instanceof defpackage.j0) {
            return (defpackage.j0) b;
        }
        throw new IOException("unknown object encountered: " + b.getClass());
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        defpackage.j0 a;
        if (this.c == null) {
            if (!this.b || (a = a()) == null) {
                return -1;
            }
            this.b = false;
            this.c = a.a();
        }
        while (true) {
            int read = this.c.read();
            if (read >= 0) {
                return read;
            }
            defpackage.j0 a2 = a();
            if (a2 == null) {
                this.c = null;
                return -1;
            }
            this.c = a2.a();
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        defpackage.j0 a;
        int i3 = 0;
        if (this.c == null) {
            if (!this.b || (a = a()) == null) {
                return -1;
            }
            this.b = false;
            this.c = a.a();
        }
        while (true) {
            int read = this.c.read(bArr, i + i3, i2 - i3);
            if (read >= 0) {
                i3 += read;
                if (i3 == i2) {
                    return i3;
                }
            } else {
                defpackage.j0 a2 = a();
                if (a2 == null) {
                    this.c = null;
                    if (i3 < 1) {
                        return -1;
                    }
                    return i3;
                }
                this.c = a2.a();
            }
        }
    }
}
