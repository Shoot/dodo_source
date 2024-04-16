package org.bouncycastle.operator;
/* loaded from: classes3.dex */
public class OperatorException extends Exception {
    private Throwable a;

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.a;
    }
}
