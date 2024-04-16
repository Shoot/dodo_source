package org.bouncycastle.operator;

import java.io.IOException;
/* loaded from: classes3.dex */
public class OperatorStreamException extends IOException {
    private Throwable a;

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.a;
    }
}
