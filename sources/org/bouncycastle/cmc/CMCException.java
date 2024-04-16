package org.bouncycastle.cmc;
/* loaded from: classes3.dex */
public class CMCException extends Exception {
    private final Throwable a;

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.a;
    }
}
