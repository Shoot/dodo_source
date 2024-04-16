package org.bouncycastle.asn1;

import java.io.IOException;
/* loaded from: classes3.dex */
public class n1 implements defpackage.l0 {
    private r a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public n1(r rVar) {
        this.a = rVar;
    }

    @Override // defpackage.yz4
    public n d() throws IOException {
        return new m1(this.a.d());
    }

    @Override // defpackage.h0
    public n f() {
        try {
            return d();
        } catch (IOException e) {
            throw new ASN1ParsingException(e.getMessage(), e);
        }
    }
}
