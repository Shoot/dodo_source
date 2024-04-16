package org.bouncycastle.cert.ocsp;
/* loaded from: classes3.dex */
public class OCSPException extends Exception {
    private Throwable a;

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.a;
    }
}
