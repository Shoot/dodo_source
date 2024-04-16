package org.bouncycastle.x509.util;
/* loaded from: classes3.dex */
public class StreamParsingException extends Exception {
    Throwable a;

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.a;
    }
}
