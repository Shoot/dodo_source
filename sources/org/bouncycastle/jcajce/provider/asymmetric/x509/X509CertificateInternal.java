package org.bouncycastle.jcajce.provider.asymmetric.x509;

import java.security.cert.CertificateEncodingException;
/* loaded from: classes3.dex */
class X509CertificateInternal extends X509CertificateImpl {
    private final byte[] encoding;
    private final CertificateEncodingException exception;

    /* JADX INFO: Access modifiers changed from: package-private */
    public X509CertificateInternal(d95 d95Var, bu0 bu0Var, b90 b90Var, boolean[] zArr, String str, byte[] bArr, byte[] bArr2, CertificateEncodingException certificateEncodingException) {
        super(d95Var, bu0Var, b90Var, zArr, str, bArr);
        this.encoding = bArr2;
        this.exception = certificateEncodingException;
    }

    @Override // java.security.cert.Certificate
    public byte[] getEncoded() throws CertificateEncodingException {
        CertificateEncodingException certificateEncodingException = this.exception;
        if (certificateEncodingException == null) {
            byte[] bArr = this.encoding;
            if (bArr != null) {
                return bArr;
            }
            throw new CertificateEncodingException();
        }
        throw certificateEncodingException;
    }
}
