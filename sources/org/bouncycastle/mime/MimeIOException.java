package org.bouncycastle.mime;

import java.io.IOException;
/* loaded from: classes3.dex */
public class MimeIOException extends IOException {
    private Throwable a;

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.a;
    }
}
