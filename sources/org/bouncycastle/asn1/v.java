package org.bouncycastle.asn1;

import java.io.IOException;
/* loaded from: classes3.dex */
public class v implements defpackage.h0, yz4 {
    private final int a;
    private final r b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public v(int i, r rVar) {
        this.a = i;
        this.b = rVar;
    }

    @Override // defpackage.yz4
    public n d() throws IOException {
        return new u(this.a, this.b.d());
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
