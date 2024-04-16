package org.bouncycastle.asn1;

import java.io.IOException;
/* loaded from: classes3.dex */
public class j0 extends b {
    public j0(defpackage.h0 h0Var) throws IOException {
        super(h0Var.f().p("DER"), 0);
    }

    static j0 H(byte[] bArr) {
        if (bArr.length >= 1) {
            byte b = bArr[0];
            int length = bArr.length - 1;
            byte[] bArr2 = new byte[length];
            if (length != 0) {
                System.arraycopy(bArr, 1, bArr2, 0, bArr.length - 1);
            }
            return new j0(bArr2, b);
        }
        throw new IllegalArgumentException("truncated BIT STRING detected");
    }

    public static j0 I(Object obj) {
        if (obj != null && !(obj instanceof j0)) {
            if (obj instanceof f1) {
                f1 f1Var = (f1) obj;
                return new j0(f1Var.a, f1Var.b);
            } else if (obj instanceof byte[]) {
                try {
                    return (j0) n.z((byte[]) obj);
                } catch (Exception e) {
                    throw new IllegalArgumentException("encoding error in getInstance: " + e.toString());
                }
            } else {
                throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
            }
        }
        return (j0) obj;
    }

    public static j0 J(s sVar, boolean z) {
        n F = sVar.F();
        if (!z && !(F instanceof j0)) {
            return H(l.D(F).F());
        }
        return I(F);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public boolean A() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public void u(m mVar, boolean z) throws IOException {
        int i;
        byte[] bArr = this.a;
        int length = bArr.length;
        if (length != 0 && (i = this.b) != 0) {
            int i2 = length - 1;
            byte b = bArr[i2];
            if (b != ((byte) ((255 << i) & b))) {
                mVar.l(z, 3, (byte) i, bArr, 0, i2, (byte) (b & (255 << i)));
                return;
            }
        }
        mVar.k(z, 3, (byte) this.b, bArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public int v() {
        return v1.a(this.a.length + 1) + 1 + this.a.length + 1;
    }

    public j0(byte[] bArr) {
        this(bArr, 0);
    }

    public j0(byte[] bArr, int i) {
        super(bArr, i);
    }

    @Override // org.bouncycastle.asn1.b, org.bouncycastle.asn1.n
    n B() {
        return this;
    }

    @Override // org.bouncycastle.asn1.b, org.bouncycastle.asn1.n
    n C() {
        return this;
    }
}
