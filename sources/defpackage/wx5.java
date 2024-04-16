package defpackage;

import android.os.Build;
import android.util.Log;
/* compiled from: Logging.java */
/* renamed from: wx5  reason: default package */
/* loaded from: classes2.dex */
public final class wx5 {
    private static String a(String str, String str2) {
        String str3 = str + str2;
        if (str3.length() > 23) {
            return str3.substring(0, 23);
        }
        return str3;
    }

    public static void b(String str, String str2, Object obj) {
        String e = e(str);
        if (Log.isLoggable(e, 3)) {
            Log.d(e, String.format(str2, obj));
        }
    }

    public static void c(String str, String str2, Object... objArr) {
        String e = e(str);
        if (Log.isLoggable(e, 3)) {
            Log.d(e, String.format(str2, objArr));
        }
    }

    public static void d(String str, String str2, Throwable th) {
        String e = e(str);
        if (Log.isLoggable(e, 6)) {
            Log.e(e, str2, th);
        }
    }

    private static String e(String str) {
        if (Build.VERSION.SDK_INT < 26) {
            return a("TRuntime.", str);
        }
        return "TRuntime." + str;
    }

    public static void f(String str, String str2, Object obj) {
        String e = e(str);
        if (Log.isLoggable(e, 4)) {
            Log.i(e, String.format(str2, obj));
        }
    }

    public static void g(String str, String str2, Object obj) {
        String e = e(str);
        if (Log.isLoggable(e, 5)) {
            Log.w(e, String.format(str2, obj));
        }
    }
}
