package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.auth.api.credentials.HintRequest;
import defpackage.kz;
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
/* renamed from: w9d  reason: default package */
/* loaded from: classes2.dex */
public final class w9d {
    public static PendingIntent a(Context context, kz.a aVar, HintRequest hintRequest, String str) {
        String d;
        String str2;
        gh8.k(context, "context must not be null");
        gh8.k(hintRequest, "request must not be null");
        if (aVar == null) {
            d = null;
        } else {
            d = aVar.d();
        }
        if (TextUtils.isEmpty(str)) {
            str2 = brc.a();
        } else {
            str2 = (String) gh8.j(str);
        }
        Intent putExtra = new Intent("com.google.android.gms.auth.api.credentials.PICKER").putExtra("claimedCallingPackage", d);
        putExtra.putExtra("logSessionId", str2);
        zs9.d(hintRequest, putExtra, "com.google.android.gms.credentials.HintRequest");
        return PendingIntent.getActivity(context, 2000, putExtra, 134217728);
    }
}
