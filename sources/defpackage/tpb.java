package defpackage;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
/* compiled from: URLWrapper.java */
/* renamed from: tpb  reason: default package */
/* loaded from: classes2.dex */
public class tpb {
    private final URL a;

    public tpb(URL url) {
        this.a = url;
    }

    public URLConnection a() throws IOException {
        return this.a.openConnection();
    }

    public String toString() {
        return this.a.toString();
    }
}
