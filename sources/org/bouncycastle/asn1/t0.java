package org.bouncycastle.asn1;

import java.io.IOException;
import java.io.InputStream;
/* loaded from: classes3.dex */
public class t0 implements defpackage.j0 {
    private q1 a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public t0(q1 q1Var) {
        this.a = q1Var;
    }

    @Override // defpackage.j0
    public InputStream a() {
        return this.a;
    }

    @Override // defpackage.yz4
    public n d() throws IOException {
        return new s0(this.a.i());
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
