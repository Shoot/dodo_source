package org.bouncycastle.jce.exception;

import java.security.cert.CertificateEncodingException;
/* loaded from: classes3.dex */
public class ExtCertificateEncodingException extends CertificateEncodingException {
    private Throwable a;

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.a;
    }
}
