package io.realm.log;

import android.util.Log;
import java.util.Locale;
/* loaded from: classes3.dex */
public final class RealmLog {
    private static String a = "REALM_JAVA";

    public static void a(String str, Object... objArr) {
        b(null, str, objArr);
    }

    public static void b(Throwable th, String str, Object... objArr) {
        f(6, th, str, objArr);
    }

    public static void c(String str, Object... objArr) {
        d(null, str, objArr);
    }

    public static void d(Throwable th, String str, Object... objArr) {
        f(7, th, str, objArr);
    }

    public static int e() {
        return nativeGetLogLevel();
    }

    private static void f(int i, Throwable th, String str, Object... objArr) {
        if (i < e()) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        if (str != null && objArr != null && objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        if (th != null) {
            sb.append(Log.getStackTraceString(th));
        }
        if (str != null) {
            if (th != null) {
                sb.append("\n");
            }
            sb.append(str);
        }
        nativeLog(i, a, th, sb.toString());
    }

    public static void g(String str, Object... objArr) {
        h(null, str, objArr);
    }

    public static void h(Throwable th, String str, Object... objArr) {
        f(5, th, str, objArr);
    }

    private static native int nativeGetLogLevel();

    private static native void nativeLog(int i, String str, Throwable th, String str2);
}
