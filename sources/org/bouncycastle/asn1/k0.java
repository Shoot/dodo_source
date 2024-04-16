package org.bouncycastle.asn1;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
/* loaded from: classes3.dex */
public class k0 extends f {
    public k0(k kVar, i iVar, n nVar, int i, n nVar2) {
        super(kVar, iVar, nVar, i, nVar2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public void u(m mVar, boolean z) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        k kVar = this.a;
        if (kVar != null) {
            byteArrayOutputStream.write(kVar.p("DER"));
        }
        i iVar = this.b;
        if (iVar != null) {
            byteArrayOutputStream.write(iVar.p("DER"));
        }
        n nVar = this.c;
        if (nVar != null) {
            byteArrayOutputStream.write(nVar.p("DER"));
        }
        byteArrayOutputStream.write(new z0(true, this.d, this.e).p("DER"));
        mVar.m(z, 32, 8, byteArrayOutputStream.toByteArray());
    }

    @Override // org.bouncycastle.asn1.f, org.bouncycastle.asn1.n
    int v() throws IOException {
        return getEncoded().length;
    }

    @Override // org.bouncycastle.asn1.f, org.bouncycastle.asn1.n
    n B() {
        return this;
    }

    @Override // org.bouncycastle.asn1.f, org.bouncycastle.asn1.n
    n C() {
        return this;
    }
}
