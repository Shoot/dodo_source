package org.bouncycastle.tsp;
/* loaded from: classes3.dex */
public class TSPException extends Exception {
    Throwable a;

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.a;
    }
}
