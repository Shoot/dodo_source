package org.bouncycastle.cms;
/* loaded from: classes3.dex */
public class CMSException extends Exception {
    Exception a;

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.a;
    }
}
