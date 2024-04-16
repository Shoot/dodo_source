package org.bouncycastle.jce.exception;

import java.security.cert.CertPathValidatorException;
/* loaded from: classes3.dex */
public class ExtCertPathValidatorException extends CertPathValidatorException {
    private Throwable a;

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.a;
    }
}
