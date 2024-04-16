package org.jsoup;

import java.io.IOException;
/* loaded from: classes3.dex */
public class UnsupportedMimeTypeException extends IOException {
    private final String a;
    private final String b;

    public UnsupportedMimeTypeException(String str, String str2, String str3) {
        super(str);
        this.a = str2;
        this.b = str3;
    }

    @Override // java.lang.Throwable
    public String toString() {
        return super.toString() + ". Mimetype=" + this.a + ", URL=" + this.b;
    }
}
