package org.bouncycastle.cert.cmp;
/* loaded from: classes3.dex */
public class CMPException extends Exception {
    private Throwable a;

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.a;
    }
}
