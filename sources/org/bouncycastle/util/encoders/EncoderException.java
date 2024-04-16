package org.bouncycastle.util.encoders;
/* loaded from: classes3.dex */
public class EncoderException extends IllegalStateException {
    private Throwable a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public EncoderException(String str, Throwable th) {
        super(str);
        this.a = th;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.a;
    }
}
