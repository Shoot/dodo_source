package com.huawei.hms.android;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import com.huawei.hms.android.HwBuildEx;
import com.huawei.hms.support.log.HMSLog;
import java.lang.reflect.InvocationTargetException;
import java.util.Locale;
/* loaded from: classes.dex */
public class SystemUtils {
    public static String a() {
        return getSystemProperties("ro.product.locale", "");
    }

    public static String b() {
        return getSystemProperties("ro.product.locale.region", "");
    }

    public static String getLocalCountry() {
        Locale locale = Locale.getDefault();
        if (locale != null) {
            return locale.getCountry();
        }
        return "";
    }

    public static String getNetType(Context context) {
        ConnectivityManager connectivityManager;
        NetworkInfo activeNetworkInfo;
        if (context != null && (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) != null && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null && activeNetworkInfo.isAvailable()) {
            return activeNetworkInfo.getTypeName();
        }
        return "";
    }

    public static String getSystemProperties(String str, String str2) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getDeclaredMethod("get", String.class, String.class).invoke(cls, str, str2);
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException unused) {
            HMSLog.e("SystemUtils", "An exception occurred while reading: getSystemProperties:" + str);
            return str2;
        }
    }

    public static boolean isChinaROM() {
        String b = b();
        if (!TextUtils.isEmpty(b)) {
            return "cn".equalsIgnoreCase(b);
        }
        String a = a();
        if (!TextUtils.isEmpty(a)) {
            return a.toLowerCase(Locale.US).contains("cn");
        }
        String localCountry = getLocalCountry();
        if (!TextUtils.isEmpty(localCountry)) {
            return "cn".equalsIgnoreCase(localCountry);
        }
        return false;
    }

    public static boolean isEMUI() {
        StringBuilder sb = new StringBuilder();
        sb.append("is Emui :");
        int i = HwBuildEx.VERSION.EMUI_SDK_INT;
        sb.append(i);
        HMSLog.i("SystemUtils", sb.toString());
        if (i > 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean isSystemApp(android.content.Context r2, java.lang.String r3) {
        /*
            java.lang.String r0 = "SystemUtils"
            android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch: java.lang.RuntimeException -> Ld android.content.pm.PackageManager.NameNotFoundException -> Lf
            r1 = 16384(0x4000, float:2.2959E-41)
            android.content.pm.PackageInfo r2 = r2.getPackageInfo(r3, r1)     // Catch: java.lang.RuntimeException -> Ld android.content.pm.PackageManager.NameNotFoundException -> Lf
            goto L3b
        Ld:
            r2 = move-exception
            goto L11
        Lf:
            r2 = move-exception
            goto L26
        L11:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r1 = "isSystemApp RuntimeException:"
            r3.append(r1)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            com.huawei.hms.support.log.HMSLog.e(r0, r2)
            goto L3a
        L26:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r1 = "isSystemApp Exception: "
            r3.append(r1)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            com.huawei.hms.support.log.HMSLog.e(r0, r2)
        L3a:
            r2 = 0
        L3b:
            if (r2 == 0) goto L46
            android.content.pm.ApplicationInfo r2 = r2.applicationInfo
            int r2 = r2.flags
            r3 = 1
            r2 = r2 & r3
            if (r2 <= 0) goto L46
            goto L47
        L46:
            r3 = 0
        L47:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.android.SystemUtils.isSystemApp(android.content.Context, java.lang.String):boolean");
    }

    public static boolean isTVDevice() {
        return getSystemProperties("ro.build.characteristics", "default").equalsIgnoreCase("tv");
    }
}
