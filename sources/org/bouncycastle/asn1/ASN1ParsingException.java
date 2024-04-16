package org.bouncycastle.asn1;
/* loaded from: classes3.dex */
public class ASN1ParsingException extends IllegalStateException {
    private Throwable a;

    public ASN1ParsingException(String str) {
        super(str);
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.a;
    }

    public ASN1ParsingException(String str, Throwable th) {
        super(str);
        this.a = th;
    }
}
