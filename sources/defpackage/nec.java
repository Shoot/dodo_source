package defpackage;

import android.content.Context;
/* renamed from: nec  reason: default package */
/* loaded from: classes3.dex */
public class nec {
    private static Context a;

    public static Context a() {
        return a;
    }

    public static void b(Context context) {
        if (context != null && a == null) {
            a = context.getApplicationContext();
        }
    }
}
