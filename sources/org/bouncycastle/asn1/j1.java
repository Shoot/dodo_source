package org.bouncycastle.asn1;

import java.io.IOException;
/* loaded from: classes3.dex */
public class j1 extends o {
    /* JADX INFO: Access modifiers changed from: package-private */
    public j1(boolean z, int i, byte[] bArr) {
        super(z, i, bArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.o, org.bouncycastle.asn1.n
    public void u(m mVar, boolean z) throws IOException {
        int i;
        if (this.a) {
            i = 224;
        } else {
            i = 192;
        }
        mVar.m(z, i, this.b, this.c);
    }
}
