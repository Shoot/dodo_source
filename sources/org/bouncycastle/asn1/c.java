package org.bouncycastle.asn1;

import java.io.IOException;
/* loaded from: classes3.dex */
public class c extends n {
    public static final c b = new c((byte) 0);
    public static final c c = new c((byte) -1);
    private final byte a;

    private c(byte b2) {
        this.a = b2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static c D(byte[] bArr) {
        if (bArr.length == 1) {
            byte b2 = bArr[0];
            if (b2 != -1) {
                if (b2 != 0) {
                    return new c(b2);
                }
                return b;
            }
            return c;
        }
        throw new IllegalArgumentException("BOOLEAN value should have 1 byte in it");
    }

    public static c E(Object obj) {
        if (obj != null && !(obj instanceof c)) {
            if (obj instanceof byte[]) {
                try {
                    return (c) n.z((byte[]) obj);
                } catch (IOException e) {
                    throw new IllegalArgumentException("failed to construct boolean from byte[]: " + e.getMessage());
                }
            }
            throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
        }
        return (c) obj;
    }

    public static c F(s sVar, boolean z) {
        n F = sVar.F();
        if (!z && !(F instanceof c)) {
            return D(l.D(F).F());
        }
        return E(F);
    }

    public static c G(boolean z) {
        if (z) {
            return c;
        }
        return b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public boolean A() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public n B() {
        if (H()) {
            return c;
        }
        return b;
    }

    public boolean H() {
        if (this.a != 0) {
            return true;
        }
        return false;
    }

    @Override // org.bouncycastle.asn1.n, defpackage.i0
    public int hashCode() {
        return H() ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public boolean t(n nVar) {
        if (!(nVar instanceof c) || H() != ((c) nVar).H()) {
            return false;
        }
        return true;
    }

    public String toString() {
        if (H()) {
            return "TRUE";
        }
        return "FALSE";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public void u(m mVar, boolean z) throws IOException {
        mVar.j(z, 1, this.a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public int v() {
        return 3;
    }
}
