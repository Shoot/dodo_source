package defpackage;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* renamed from: qtc  reason: default package */
/* loaded from: classes2.dex */
public abstract class qtc {
    private static qtc a = new ttc();

    public static synchronized qtc b() {
        qtc qtcVar;
        synchronized (qtc.class) {
            qtcVar = a;
        }
        return qtcVar;
    }

    public abstract URLConnection a(URL url, String str) throws IOException;
}
