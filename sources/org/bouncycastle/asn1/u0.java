package org.bouncycastle.asn1;

import java.io.IOException;
import java.io.OutputStream;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class u0 extends m {
    /* JADX INFO: Access modifiers changed from: package-private */
    public u0(OutputStream outputStream) {
        super(outputStream);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.m
    public void u(n nVar, boolean z) throws IOException {
        nVar.B().u(this, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.m
    public u0 d() {
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.m
    public m e() {
        return this;
    }
}
