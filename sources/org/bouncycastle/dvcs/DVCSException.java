package org.bouncycastle.dvcs;
/* loaded from: classes3.dex */
public class DVCSException extends Exception {
    private Throwable a;

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.a;
    }
}
