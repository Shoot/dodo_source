package org.bouncycastle.cms;
/* loaded from: classes3.dex */
public class CMSAttributeTableGenerationException extends CMSRuntimeException {
    Exception b;

    @Override // org.bouncycastle.cms.CMSRuntimeException, java.lang.Throwable
    public Throwable getCause() {
        return this.b;
    }
}
