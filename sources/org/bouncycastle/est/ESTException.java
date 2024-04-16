package org.bouncycastle.est;

import java.io.IOException;
/* loaded from: classes3.dex */
public class ESTException extends IOException {
    private Throwable a;
    private int b;

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.a;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return super.getMessage() + " HTTP Status Code: " + this.b;
    }
}
