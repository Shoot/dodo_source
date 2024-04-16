package org.bouncycastle.asn1;

import java.io.IOException;
/* loaded from: classes3.dex */
public abstract class a extends n {
    protected final boolean a;
    protected final int b;
    protected final byte[] c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(boolean z, int i, byte[] bArr) {
        this.a = z;
        this.b = i;
        this.c = tr.h(bArr);
    }

    public static a F(Object obj) {
        if (obj != null && !(obj instanceof a)) {
            if (obj instanceof byte[]) {
                try {
                    return F(n.z((byte[]) obj));
                } catch (IOException e) {
                    throw new IllegalArgumentException("Failed to construct object from byte[]: " + e.getMessage());
                }
            }
            throw new IllegalArgumentException("unknown object in getInstance: " + obj.getClass().getName());
        }
        return (a) obj;
    }

    private byte[] H(int i, byte[] bArr) throws IOException {
        int i2;
        if ((bArr[0] & 31) == 31) {
            byte b = bArr[1];
            int i3 = b & 255;
            if ((b & Byte.MAX_VALUE) != 0) {
                i2 = 2;
                while ((i3 & 128) != 0) {
                    i3 = bArr[i2] & 255;
                    i2++;
                }
            } else {
                throw new IOException("corrupted stream - invalid high tag number found");
            }
        } else {
            i2 = 1;
        }
        int length = bArr.length - i2;
        byte[] bArr2 = new byte[length + 1];
        System.arraycopy(bArr, i2, bArr2, 1, length);
        bArr2[0] = (byte) i;
        return bArr2;
    }

    @Override // org.bouncycastle.asn1.n
    public boolean A() {
        return this.a;
    }

    public int D() {
        return this.b;
    }

    public byte[] E() {
        return tr.h(this.c);
    }

    public n G(int i) throws IOException {
        if (i < 31) {
            byte[] encoded = getEncoded();
            byte[] H = H(i, encoded);
            if ((encoded[0] & 32) != 0) {
                H[0] = (byte) (H[0] | 32);
            }
            return n.z(H);
        }
        throw new IOException("unsupported tag number");
    }

    @Override // org.bouncycastle.asn1.n, defpackage.i0
    public int hashCode() {
        boolean z = this.a;
        return ((z ? 1 : 0) ^ this.b) ^ tr.F(this.c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public boolean t(n nVar) {
        if (!(nVar instanceof a)) {
            return false;
        }
        a aVar = (a) nVar;
        if (this.a != aVar.a || this.b != aVar.b || !tr.c(this.c, aVar.c)) {
            return false;
        }
        return true;
    }

    public String toString() {
        String str;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[");
        if (A()) {
            stringBuffer.append("CONSTRUCTED ");
        }
        stringBuffer.append("APPLICATION ");
        stringBuffer.append(Integer.toString(D()));
        stringBuffer.append("]");
        if (this.c != null) {
            stringBuffer.append(" #");
            str = org.bouncycastle.util.encoders.b.f(this.c);
        } else {
            str = " #null";
        }
        stringBuffer.append(str);
        stringBuffer.append(" ");
        return stringBuffer.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public void u(m mVar, boolean z) throws IOException {
        int i;
        if (this.a) {
            i = 96;
        } else {
            i = 64;
        }
        mVar.m(z, i, this.b, this.c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public int v() throws IOException {
        return v1.b(this.b) + v1.a(this.c.length) + this.c.length;
    }
}
