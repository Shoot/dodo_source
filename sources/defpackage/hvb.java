package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import androidx.annotation.NonNull;
/* compiled from: Utils.java */
/* renamed from: hvb  reason: default package */
/* loaded from: classes2.dex */
public class hvb {
    private static Boolean a;

    public static void a(boolean z, String str) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException(str);
    }

    public static boolean b(@NonNull Context context) {
        Boolean bool = a;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            Boolean valueOf = Boolean.valueOf(context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getBoolean("firebase_performance_logcat_enabled", false));
            a = valueOf;
            return valueOf.booleanValue();
        } catch (PackageManager.NameNotFoundException | NullPointerException e) {
            sh e2 = sh.e();
            e2.a("No perf logcat meta data found " + e.getMessage());
            return false;
        }
    }

    public static int c(long j) {
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }

    public static String d(@NonNull String str) {
        sq4 o = sq4.o(str);
        if (o != null) {
            return o.m().B("").p("").r(null).e(null).toString();
        }
        return str;
    }

    public static String e(String str, int i) {
        int lastIndexOf;
        if (str.length() <= i) {
            return str;
        }
        if (str.charAt(i) == '/') {
            return str.substring(0, i);
        }
        sq4 o = sq4.o(str);
        if (o == null) {
            return str.substring(0, i);
        }
        if (o.c().lastIndexOf(47) >= 0 && (lastIndexOf = str.lastIndexOf(47, i - 1)) >= 0) {
            return str.substring(0, lastIndexOf);
        }
        return str.substring(0, i);
    }
}
