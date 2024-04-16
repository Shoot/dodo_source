package org.bouncycastle.util.encoders;
/* loaded from: classes3.dex */
public class DecoderException extends IllegalStateException {
    private Throwable a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public DecoderException(String str, Throwable th) {
        super(str);
        this.a = th;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.a;
    }
}
