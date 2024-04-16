package defpackage;

import android.util.Log;
import java.util.Locale;
/* renamed from: hj4  reason: default package */
/* loaded from: classes.dex */
public final class hj4 {
    public static boolean a = false;

    public static void a(String str) {
        if (a) {
            Log.d("hcaptcha", str);
        }
    }

    public static void b(String str, Object... objArr) {
        if (a) {
            Log.d("hcaptcha", String.format(Locale.getDefault(), str, objArr));
        }
    }

    public static void c(String str) {
        Log.w("hcaptcha", str);
    }
}
