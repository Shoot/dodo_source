package org.bouncycastle.eac;

import java.io.IOException;
/* loaded from: classes3.dex */
public class EACIOException extends IOException {
    private Throwable a;

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.a;
    }
}
