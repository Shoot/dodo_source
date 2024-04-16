package defpackage;

import java.io.IOException;
import java.io.OutputStream;
import java.security.Signature;
import java.security.SignatureException;
/* renamed from: lka  reason: default package */
/* loaded from: classes3.dex */
class lka extends OutputStream {
    private Signature a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public lka(Signature signature) {
        this.a = signature;
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        try {
            this.a.update((byte) i);
        } catch (SignatureException e) {
            throw new IOException(e.getMessage());
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        try {
            this.a.update(bArr);
        } catch (SignatureException e) {
            throw new IOException(e.getMessage());
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        try {
            this.a.update(bArr, i, i2);
        } catch (SignatureException e) {
            throw new IOException(e.getMessage());
        }
    }
}
