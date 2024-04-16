package org.bouncycastle.cert;

import java.io.IOException;
/* loaded from: classes3.dex */
public class CertIOException extends IOException {
    private Throwable a;

    public CertIOException(String str, Throwable th) {
        super(str);
        this.a = th;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.a;
    }
}
