package org.bouncycastle.cert.crmf;
/* loaded from: classes3.dex */
public class CRMFException extends Exception {
    private Throwable a;

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.a;
    }
}
