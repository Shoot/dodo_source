package org.bouncycastle.asn1;

import java.io.IOException;
/* loaded from: classes3.dex */
public class l1 implements defpackage.k0 {
    private r a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public l1(r rVar) {
        this.a = rVar;
    }

    @Override // defpackage.yz4
    public n d() throws IOException {
        return new k1(this.a.d());
    }

    @Override // defpackage.h0
    public n f() {
        try {
            return d();
        } catch (IOException e) {
            throw new IllegalStateException(e.getMessage());
        }
    }
}
