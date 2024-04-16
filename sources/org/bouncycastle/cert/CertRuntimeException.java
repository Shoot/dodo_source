package org.bouncycastle.cert;
/* loaded from: classes3.dex */
public class CertRuntimeException extends RuntimeException {
    private Throwable a;

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.a;
    }
}
