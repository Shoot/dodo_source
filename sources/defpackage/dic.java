package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
/* renamed from: dic  reason: default package */
/* loaded from: classes3.dex */
public class dic {
    private static SharedPreferences a;

    public static String a(String str, String str2, Context context) {
        return b(context).getString(str, str2);
    }

    public static synchronized SharedPreferences b(Context context) {
        SharedPreferences sharedPreferences;
        Context createDeviceProtectedStorageContext;
        synchronized (dic.class) {
            try {
                if (a == null) {
                    if (Build.VERSION.SDK_INT >= 24) {
                        createDeviceProtectedStorageContext = context.createDeviceProtectedStorageContext();
                        a = createDeviceProtectedStorageContext.getSharedPreferences("aegis", 0);
                    } else {
                        a = context.getApplicationContext().getSharedPreferences("aegis", 0);
                    }
                }
                sharedPreferences = a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return sharedPreferences;
    }

    public static void c(String str, String str2, Context context) {
        b(context).edit().putString(str, str2).apply();
    }
}
