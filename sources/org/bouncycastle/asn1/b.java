package org.bouncycastle.asn1;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
/* loaded from: classes3.dex */
public abstract class b extends n implements defpackage.m0 {
    private static final char[] c = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    protected final byte[] a;
    protected final int b;

    public b(byte[] bArr, int i) {
        if (bArr != null) {
            if (bArr.length == 0 && i != 0) {
                throw new IllegalArgumentException("zero length data with non-zero pad bits");
            }
            if (i <= 7 && i >= 0) {
                this.a = tr.h(bArr);
                this.b = i;
                return;
            }
            throw new IllegalArgumentException("pad bits cannot be greater than 7 or less than 0");
        }
        throw new NullPointerException("'data' cannot be null");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static b D(int i, InputStream inputStream) throws IOException {
        if (i >= 1) {
            int read = inputStream.read();
            int i2 = i - 1;
            byte[] bArr = new byte[i2];
            if (i2 != 0) {
                if (aza.c(inputStream, bArr) == i2) {
                    if (read > 0 && read < 8) {
                        byte b = bArr[i - 2];
                        if (b != ((byte) ((255 << read) & b))) {
                            return new f1(bArr, read);
                        }
                    }
                } else {
                    throw new EOFException("EOF encountered in middle of BIT STRING");
                }
            }
            return new j0(bArr, read);
        }
        throw new IllegalArgumentException("truncated BIT STRING detected");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public n B() {
        return new j0(this.a, this.b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public n C() {
        return new f1(this.a, this.b);
    }

    public byte[] E() {
        byte[] bArr = this.a;
        if (bArr.length == 0) {
            return bArr;
        }
        byte[] h = tr.h(bArr);
        int length = this.a.length - 1;
        h[length] = (byte) (h[length] & (255 << this.b));
        return h;
    }

    public byte[] F() {
        if (this.b == 0) {
            return tr.h(this.a);
        }
        throw new IllegalStateException("attempt to get non-octet aligned data from BIT STRING");
    }

    public int G() {
        return this.b;
    }

    @Override // defpackage.m0
    public String g() {
        StringBuffer stringBuffer = new StringBuffer("#");
        try {
            byte[] encoded = getEncoded();
            for (int i = 0; i != encoded.length; i++) {
                char[] cArr = c;
                stringBuffer.append(cArr[(encoded[i] >>> 4) & 15]);
                stringBuffer.append(cArr[encoded[i] & 15]);
            }
            return stringBuffer.toString();
        } catch (IOException e) {
            throw new ASN1ParsingException("Internal error encoding BitString: " + e.getMessage(), e);
        }
    }

    @Override // org.bouncycastle.asn1.n, defpackage.i0
    public int hashCode() {
        byte[] bArr = this.a;
        int length = bArr.length - 1;
        if (length < 0) {
            return 1;
        }
        return ((tr.G(bArr, 0, length) * 257) ^ ((byte) (bArr[length] & (255 << this.b)))) ^ this.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public boolean t(n nVar) {
        if (!(nVar instanceof b)) {
            return false;
        }
        b bVar = (b) nVar;
        if (this.b != bVar.b) {
            return false;
        }
        byte[] bArr = this.a;
        byte[] bArr2 = bVar.a;
        int length = bArr.length;
        if (length != bArr2.length) {
            return false;
        }
        int i = length - 1;
        if (i < 0) {
            return true;
        }
        for (int i2 = 0; i2 < i; i2++) {
            if (bArr[i2] != bArr2[i2]) {
                return false;
            }
        }
        byte b = bArr[i];
        int i3 = this.b;
        if (((byte) (b & (255 << i3))) != ((byte) (bArr2[i] & (255 << i3)))) {
            return false;
        }
        return true;
    }

    public String toString() {
        return g();
    }
}
