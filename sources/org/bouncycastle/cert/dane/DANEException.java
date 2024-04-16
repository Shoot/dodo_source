package org.bouncycastle.cert.dane;
/* loaded from: classes3.dex */
public class DANEException extends Exception {
    private Throwable a;

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.a;
    }
}
