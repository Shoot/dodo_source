package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.AFLogger;
import java.lang.ref.WeakReference;
import java.util.Map;
/* loaded from: classes.dex */
public final class AFe1tSDK {
    public String AFInAppEventParameterName;
    public final WeakReference<Context> AFInAppEventType;

    public AFe1tSDK() {
    }

    public AFe1tSDK(Context context) {
        this.AFInAppEventType = new WeakReference<>(context);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void AFInAppEventParameterName(Map<String, Object> map) {
        if (AFb1zSDK.valueOf != null) {
            StringBuilder sb = new StringBuilder("[GCD-A02] Calling onConversionDataSuccess with:\n");
            sb.append(map.toString());
            AFLogger.afDebugLog(sb.toString());
            AFb1zSDK.valueOf.onConversionDataSuccess(map);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void AFInAppEventType(String str) {
        if (AFb1zSDK.valueOf != null) {
            AFLogger.afDebugLog("[GCD-A02] Calling onConversionFailure with:\n".concat(String.valueOf(str)));
            AFb1zSDK.valueOf.onConversionDataFail(str);
        }
    }
}
