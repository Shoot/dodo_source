package com.github.hiteshsondhi88.libffmpeg;

import android.util.Log;
/* compiled from: Log.java */
/* loaded from: classes2.dex */
class j {
    private static String a = d.class.getSimpleName();
    private static boolean b = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Object obj) {
        String str;
        if (b) {
            String str2 = a;
            if (obj != null) {
                str = obj.toString();
            } else {
                str = ((Object) null) + "";
            }
            Log.d(str2, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(Object obj, Throwable th) {
        String str;
        if (b) {
            String str2 = a;
            if (obj != null) {
                str = obj.toString();
            } else {
                str = ((Object) null) + "";
            }
            Log.e(str2, str, th);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(Throwable th) {
        if (b) {
            Log.e(a, "", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void d(Object obj) {
        String str;
        if (b) {
            String str2 = a;
            if (obj != null) {
                str = obj.toString();
            } else {
                str = ((Object) null) + "";
            }
            Log.i(str2, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void e(boolean z) {
        b = z;
    }
}
