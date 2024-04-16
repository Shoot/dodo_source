package org.bouncycastle.crypto;
/* loaded from: classes3.dex */
public class CryptoException extends Exception {
    private Throwable a;

    public CryptoException() {
    }

    public CryptoException(String str) {
        super(str);
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.a;
    }

    public CryptoException(String str, Throwable th) {
        super(str);
        this.a = th;
    }
}
