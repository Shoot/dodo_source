package com.google.android.gms.ads.identifier;

import android.net.Uri;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads-identifier@@17.1.0 */
/* loaded from: classes2.dex */
final class a extends Thread {
    final /* synthetic */ Map a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(AdvertisingIdClient advertisingIdClient, Map map) {
        this.a = map;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Map map = this.a;
        Uri.Builder buildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
        for (String str : map.keySet()) {
            buildUpon.appendQueryParameter(str, (String) map.get(str));
        }
        ktc.a(buildUpon.build().toString());
    }
}
