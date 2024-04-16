package org.bouncycastle.crypto.io;

import java.io.IOException;
/* loaded from: classes3.dex */
public class CipherIOException extends IOException {
    private final Throwable a;

    public CipherIOException(String str, Throwable th) {
        super(str);
        this.a = th;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.a;
    }
}
