package org.bouncycastle.asn1;

import java.io.IOException;
/* loaded from: classes3.dex */
public class g0 implements defpackage.h0, yz4 {
    private boolean a;
    private int b;
    private r c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g0(boolean z, int i, r rVar) {
        this.a = z;
        this.b = i;
        this.c = rVar;
    }

    @Override // defpackage.yz4
    public n d() throws IOException {
        return this.c.c(this.a, this.b);
    }

    @Override // defpackage.h0
    public n f() {
        try {
            return d();
        } catch (IOException e) {
            throw new ASN1ParsingException(e.getMessage());
        }
    }
}
