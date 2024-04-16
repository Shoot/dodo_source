package org.bouncycastle.eac;
/* loaded from: classes3.dex */
public class EACException extends Exception {
    private Throwable a;

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.a;
    }
}
