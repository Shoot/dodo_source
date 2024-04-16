package com.huawei.hms.ads.identifier;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.util.Log;
import com.huawei.hms.common.PackageConstants;
/* loaded from: classes.dex */
public class b {
    public static String a(Context context) {
        if (a(context, "com.huawei.hwid")) {
            return "com.huawei.hwid";
        }
        return a(context, PackageConstants.SERVICES_PACKAGE_ALL_SCENE) ? PackageConstants.SERVICES_PACKAGE_ALL_SCENE : a(context, "com.huawei.hwid.tv") ? "com.huawei.hwid.tv" : "com.huawei.hwid";
    }

    public static PackageInfo b(Context context, String str) {
        String str2;
        if (TextUtils.isEmpty(str) || context == null) {
            return null;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return null;
            }
            return packageManager.getPackageInfo(str, 128);
        } catch (PackageManager.NameNotFoundException unused) {
            str2 = "getPackageInfo NameNotFoundException";
            Log.w("ApkUtil", str2);
            return null;
        } catch (Exception unused2) {
            str2 = "getPackageInfo Exception";
            Log.w("ApkUtil", str2);
            return null;
        }
    }

    public static boolean a(Context context, String str) {
        return b(context, str) != null;
    }
}
