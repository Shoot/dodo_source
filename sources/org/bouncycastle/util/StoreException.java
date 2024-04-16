package org.bouncycastle.util;
/* loaded from: classes3.dex */
public class StoreException extends RuntimeException {
    private Throwable a;

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.a;
    }
}
