package org.bouncycastle.cert.path;
/* loaded from: classes3.dex */
public class CertPathValidationException extends Exception {
    private final Exception a;

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.a;
    }
}
