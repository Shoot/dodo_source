package org.bouncycastle.asn1;

import java.io.IOException;
import java.io.OutputStream;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class i1 extends m {
    /* JADX INFO: Access modifiers changed from: package-private */
    public i1(OutputStream outputStream) {
        super(outputStream);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.m
    public void u(n nVar, boolean z) throws IOException {
        nVar.C().u(this, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.m
    public m e() {
        return this;
    }
}
