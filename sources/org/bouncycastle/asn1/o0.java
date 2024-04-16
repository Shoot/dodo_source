package org.bouncycastle.asn1;

import java.io.IOException;
/* loaded from: classes3.dex */
public class o0 extends n implements defpackage.m0 {
    private final byte[] a;

    public o0(byte[] bArr) {
        this.a = tr.h(bArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public boolean A() {
        return false;
    }

    @Override // defpackage.m0
    public String g() {
        return a0b.b(this.a);
    }

    @Override // org.bouncycastle.asn1.n, defpackage.i0
    public int hashCode() {
        return tr.F(this.a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public boolean t(n nVar) {
        if (!(nVar instanceof o0)) {
            return false;
        }
        return tr.c(this.a, ((o0) nVar).a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public void u(m mVar, boolean z) throws IOException {
        mVar.n(z, 25, this.a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public int v() {
        return v1.a(this.a.length) + 1 + this.a.length;
    }
}
