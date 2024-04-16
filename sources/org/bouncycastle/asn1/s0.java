package org.bouncycastle.asn1;

import java.io.IOException;
/* loaded from: classes3.dex */
public class s0 extends l {
    public s0(defpackage.h0 h0Var) throws IOException {
        super(h0Var.f().p("DER"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public boolean A() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public void u(m mVar, boolean z) throws IOException {
        mVar.n(z, 4, this.a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public int v() {
        return v1.a(this.a.length) + 1 + this.a.length;
    }

    public s0(byte[] bArr) {
        super(bArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.l, org.bouncycastle.asn1.n
    public n B() {
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.l, org.bouncycastle.asn1.n
    public n C() {
        return this;
    }
}
