package org.bouncycastle.jce.provider;
/* loaded from: classes3.dex */
public class AnnotatedException extends Exception {
    private Throwable a;

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.a;
    }
}
