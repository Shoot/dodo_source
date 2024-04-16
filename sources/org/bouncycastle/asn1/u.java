package org.bouncycastle.asn1;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
/* loaded from: classes3.dex */
public class u extends a {
    public u(int i, d dVar) {
        super(true, i, I(dVar));
    }

    private static byte[] I(d dVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (int i = 0; i != dVar.f(); i++) {
            try {
                byteArrayOutputStream.write(((defpackage.i0) dVar.d(i)).p("BER"));
            } catch (IOException e) {
                throw new ASN1ParsingException("malformed object: " + e, e);
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.a, org.bouncycastle.asn1.n
    public void u(m mVar, boolean z) throws IOException {
        int i;
        if (this.a) {
            i = 96;
        } else {
            i = 64;
        }
        mVar.o(z, i, this.b, this.c);
    }
}
