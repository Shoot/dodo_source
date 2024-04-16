package org.bouncycastle.jcajce.provider.asymmetric.x509;

import java.security.cert.CRLException;
/* loaded from: classes3.dex */
class X509CRLInternal extends X509CRLImpl {
    private final byte[] encoding;
    private final CRLException exception;

    /* JADX INFO: Access modifiers changed from: package-private */
    public X509CRLInternal(d95 d95Var, fu0 fu0Var, String str, byte[] bArr, boolean z, byte[] bArr2, CRLException cRLException) {
        super(d95Var, fu0Var, str, bArr, z);
        this.encoding = bArr2;
        this.exception = cRLException;
    }

    @Override // java.security.cert.X509CRL
    public byte[] getEncoded() throws CRLException {
        CRLException cRLException = this.exception;
        if (cRLException == null) {
            byte[] bArr = this.encoding;
            if (bArr != null) {
                return bArr;
            }
            throw new CRLException();
        }
        throw cRLException;
    }
}
