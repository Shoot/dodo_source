package org.bouncycastle.tsp.ers;
/* loaded from: classes3.dex */
public class ERSException extends Exception {
    private final Throwable a;

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.a;
    }
}
