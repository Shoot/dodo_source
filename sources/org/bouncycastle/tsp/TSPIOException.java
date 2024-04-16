package org.bouncycastle.tsp;

import java.io.IOException;
/* loaded from: classes3.dex */
public class TSPIOException extends IOException {
    Throwable a;

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.a;
    }
}
