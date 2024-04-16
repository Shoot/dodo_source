package org.bouncycastle.cert;
/* loaded from: classes3.dex */
public class CertException extends Exception {
    private Throwable a;

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.a;
    }
}
