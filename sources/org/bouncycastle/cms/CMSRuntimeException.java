package org.bouncycastle.cms;
/* loaded from: classes3.dex */
public class CMSRuntimeException extends RuntimeException {
    Exception a;

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.a;
    }
}
