package com.appsflyer.internal;

import android.content.pm.PackageItemInfo;
import android.os.Bundle;
import android.support.annotation.Nullable;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
/* loaded from: classes.dex */
public final class AFb1fSDK {
    private static String AFInAppEventType = "228";
    private Bundle AFKeystoreWrapper = null;
    public final AFc1ySDK valueOf;
    public final AFb1gSDK values;

    public AFb1fSDK(AFc1ySDK aFc1ySDK, AFb1gSDK aFb1gSDK) {
        this.valueOf = aFc1ySDK;
        this.values = aFb1gSDK;
    }

    public static String AFInAppEventParameterName() {
        return AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.APP_USER_ID);
    }

    @Nullable
    public static String valueOf() {
        StringBuilder sb = new StringBuilder("version: 6.10.0 (build ");
        sb.append(AFInAppEventType);
        sb.append(")");
        return sb.toString();
    }

    @Nullable
    public final String AFKeystoreWrapper(String str) {
        Object obj;
        try {
            if (this.AFKeystoreWrapper == null) {
                this.AFKeystoreWrapper = ((PackageItemInfo) this.valueOf.values.getPackageManager().getApplicationInfo(this.valueOf.values.getPackageName(), 128)).metaData;
            }
            Bundle bundle = this.AFKeystoreWrapper;
            if (bundle == null || (obj = bundle.get(str)) == null) {
                return null;
            }
            return obj.toString();
        } catch (Throwable th) {
            StringBuilder sb = new StringBuilder("Could not load manifest metadata!");
            sb.append(th.getMessage());
            AFLogger.afErrorLog(sb.toString(), th);
            return null;
        }
    }

    public final String values() {
        String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.CHANNEL);
        if (string == null) {
            string = AFKeystoreWrapper("CHANNEL");
        }
        if (string != null && string.equals("")) {
            return null;
        }
        return string;
    }
}
