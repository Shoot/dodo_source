package org.bouncycastle.asn1;

import java.io.IOException;
import java.io.InputStream;
/* loaded from: classes3.dex */
public class y implements defpackage.j0 {
    private r a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public y(r rVar) {
        this.a = rVar;
    }

    @Override // defpackage.j0
    public InputStream a() {
        return new h0(this.a);
    }

    @Override // defpackage.yz4
    public n d() throws IOException {
        return new x(aza.b(a()));
    }

    @Override // defpackage.h0
    public n f() {
        try {
            return d();
        } catch (IOException e) {
            throw new ASN1ParsingException("IOException converting stream to byte array: " + e.getMessage(), e);
        }
    }
}
