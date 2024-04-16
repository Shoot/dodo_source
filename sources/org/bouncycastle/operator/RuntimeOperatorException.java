package org.bouncycastle.operator;
/* loaded from: classes3.dex */
public class RuntimeOperatorException extends RuntimeException {
    private Throwable a;

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.a;
    }
}
