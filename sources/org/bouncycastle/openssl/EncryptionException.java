package org.bouncycastle.openssl;
/* loaded from: classes3.dex */
public class EncryptionException extends PEMException {
    private Throwable b;

    public EncryptionException(String str) {
        super(str);
    }

    @Override // org.bouncycastle.openssl.PEMException, java.lang.Throwable
    public Throwable getCause() {
        return this.b;
    }

    public EncryptionException(String str, Throwable th) {
        super(str);
        this.b = th;
    }
}
