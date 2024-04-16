package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
/* renamed from: kzc  reason: default package */
/* loaded from: classes2.dex */
public final class kzc {
    private final Resources a;
    private final String b;

    public kzc(Context context, String str) {
        gh8.j(context);
        this.a = context.getResources();
        if (!TextUtils.isEmpty(str)) {
            this.b = str;
        } else {
            this.b = a(context);
        }
    }

    public static String a(Context context) {
        try {
            return context.getResources().getResourcePackageName(v09.a);
        } catch (Resources.NotFoundException unused) {
            return context.getPackageName();
        }
    }

    public final String b(String str) {
        int identifier = this.a.getIdentifier(str, "string", this.b);
        if (identifier == 0) {
            return null;
        }
        try {
            return this.a.getString(identifier);
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }
}
