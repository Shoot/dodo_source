package defpackage;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* renamed from: ttc  reason: default package */
/* loaded from: classes2.dex */
final class ttc extends qtc {
    @Override // defpackage.qtc
    public final URLConnection a(URL url, String str) throws IOException {
        return url.openConnection();
    }

    private ttc() {
    }
}
