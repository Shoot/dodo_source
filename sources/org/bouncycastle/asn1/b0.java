package org.bouncycastle.asn1;

import java.io.IOException;
/* loaded from: classes3.dex */
public class b0 extends p {
    public b0() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public void u(m mVar, boolean z) throws IOException {
        mVar.q(z, 48, this.a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public int v() throws IOException {
        int length = this.a.length;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            i += this.a[i2].f().v();
        }
        return i + 4;
    }

    public b0(defpackage.h0 h0Var) {
        super(h0Var);
    }

    public b0(d dVar) {
        super(dVar);
    }

    public b0(defpackage.h0[] h0VarArr) {
        super(h0VarArr);
    }
}
