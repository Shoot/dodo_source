package org.bouncycastle.asn1;

import java.io.IOException;
/* loaded from: classes3.dex */
public class f1 extends b {
    public f1(byte[] bArr, int i) {
        super(bArr, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public boolean A() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public void u(m mVar, boolean z) throws IOException {
        mVar.k(z, 3, (byte) this.b, this.a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public int v() {
        return v1.a(this.a.length + 1) + 1 + this.a.length + 1;
    }

    @Override // org.bouncycastle.asn1.b, org.bouncycastle.asn1.n
    n C() {
        return this;
    }
}
