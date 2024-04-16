package org.jsoup;

import java.io.IOException;
/* loaded from: classes3.dex */
public class HttpStatusException extends IOException {
    private final int a;
    private final String b;

    public HttpStatusException(String str, int i, String str2) {
        super(str + ". Status=" + i + ", URL=[" + str2 + "]");
        this.a = i;
        this.b = str2;
    }
}
