package org.bouncycastle.asn1;

import java.io.IOException;
/* loaded from: classes3.dex */
public class e1 extends a {
    /* JADX INFO: Access modifiers changed from: package-private */
    public e1(boolean z, int i, byte[] bArr) {
        super(z, i, bArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.a, org.bouncycastle.asn1.n
    public void u(m mVar, boolean z) throws IOException {
        int i;
        if (this.a) {
            i = 96;
        } else {
            i = 64;
        }
        mVar.m(z, i, this.b, this.c);
    }
}
