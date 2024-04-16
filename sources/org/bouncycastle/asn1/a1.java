package org.bouncycastle.asn1;

import java.io.IOException;
/* loaded from: classes3.dex */
public class a1 extends n implements defpackage.m0 {
    private final byte[] a;

    public a1(String str) {
        this.a = a0b.h(str);
    }

    public static a1 D(Object obj) {
        if (obj != null && !(obj instanceof a1)) {
            if (obj instanceof byte[]) {
                try {
                    return (a1) n.z((byte[]) obj);
                } catch (Exception e) {
                    throw new IllegalArgumentException("encoding error in getInstance: " + e.toString());
                }
            }
            throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
        }
        return (a1) obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public boolean A() {
        return false;
    }

    @Override // defpackage.m0
    public String g() {
        return a0b.c(this.a);
    }

    @Override // org.bouncycastle.asn1.n, defpackage.i0
    public int hashCode() {
        return tr.F(this.a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public boolean t(n nVar) {
        if (!(nVar instanceof a1)) {
            return false;
        }
        return tr.c(this.a, ((a1) nVar).a);
    }

    public String toString() {
        return g();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public void u(m mVar, boolean z) throws IOException {
        mVar.n(z, 12, this.a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public int v() throws IOException {
        return v1.a(this.a.length) + 1 + this.a.length;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a1(byte[] bArr) {
        this.a = bArr;
    }
}
