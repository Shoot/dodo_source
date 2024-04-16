package org.bouncycastle.asn1;

import java.io.IOException;
/* loaded from: classes3.dex */
public class l0 implements defpackage.h0, yz4 {
    private r a;

    public l0(r rVar) {
        this.a = rVar;
    }

    @Override // defpackage.yz4
    public n d() throws IOException {
        try {
            return new g1(this.a.d());
        } catch (IllegalArgumentException e) {
            throw new ASN1Exception(e.getMessage(), e);
        }
    }

    @Override // defpackage.h0
    public n f() {
        try {
            return d();
        } catch (IOException e) {
            throw new ASN1ParsingException("unable to get DER object", e);
        } catch (IllegalArgumentException e2) {
            throw new ASN1ParsingException("unable to get DER object", e2);
        }
    }
}
