package org.bouncycastle.cms;

import java.io.IOException;
/* loaded from: classes3.dex */
public class CMSStreamException extends IOException {
    private final Throwable a;

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.a;
    }
}
