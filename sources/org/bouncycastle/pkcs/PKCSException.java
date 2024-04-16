package org.bouncycastle.pkcs;
/* loaded from: classes3.dex */
public class PKCSException extends Exception {
    private Throwable a;

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.a;
    }
}
