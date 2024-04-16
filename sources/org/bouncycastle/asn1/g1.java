package org.bouncycastle.asn1;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
/* loaded from: classes3.dex */
public class g1 extends f {
    public g1(d dVar) {
        super(dVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public void u(m mVar, boolean z) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        k kVar = this.a;
        if (kVar != null) {
            byteArrayOutputStream.write(kVar.p("DL"));
        }
        i iVar = this.b;
        if (iVar != null) {
            byteArrayOutputStream.write(iVar.p("DL"));
        }
        n nVar = this.c;
        if (nVar != null) {
            byteArrayOutputStream.write(nVar.p("DL"));
        }
        byteArrayOutputStream.write(new o1(true, this.d, this.e).p("DL"));
        mVar.m(z, 32, 8, byteArrayOutputStream.toByteArray());
    }

    @Override // org.bouncycastle.asn1.f, org.bouncycastle.asn1.n
    int v() throws IOException {
        return getEncoded().length;
    }

    public g1(k kVar, i iVar, n nVar, int i, n nVar2) {
        super(kVar, iVar, nVar, i, nVar2);
    }

    @Override // org.bouncycastle.asn1.f, org.bouncycastle.asn1.n
    n C() {
        return this;
    }
}
