package com.appsflyer.internal;

import android.support.annotation.Nullable;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class AFb1tSDK {
    public final String AFInAppEventType;
    public final int valueOf;
    public final int values;

    public AFb1tSDK() {
    }

    public AFb1tSDK(String str, int i, int i2) {
        this.AFInAppEventType = str;
        this.values = i;
        this.valueOf = i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    public static JSONObject AFKeystoreWrapper(String str) {
        JSONObject jSONObject;
        JSONObject jSONObject2 = null;
        try {
            jSONObject = new JSONObject(str);
        } catch (Throwable th) {
            th = th;
        }
        try {
            boolean z = AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DPM, false);
            if (jSONObject.optBoolean("monitor", false) && !z) {
                AFb1uSDK.AFInAppEventType().valueOf();
            } else {
                AFb1uSDK.AFInAppEventType().values();
                AFb1uSDK.AFInAppEventType().AFInAppEventParameterName();
            }
            if (jSONObject.has("ol_id")) {
                String optString = jSONObject.optString("ol_scheme", null);
                String optString2 = jSONObject.optString("ol_domain", null);
                String optString3 = jSONObject.optString("ol_ver", null);
                if (optString != null) {
                    AppsFlyerProperties.getInstance().set(AppsFlyerProperties.ONELINK_SCHEME, optString);
                }
                if (optString2 != null) {
                    AppsFlyerProperties.getInstance().set(AppsFlyerProperties.ONELINK_DOMAIN, optString2);
                }
                if (optString3 != null) {
                    AppsFlyerProperties.getInstance().set("onelinkVersion", optString3);
                    return jSONObject;
                }
                return jSONObject;
            }
            return jSONObject;
        } catch (Throwable th2) {
            th = th2;
            jSONObject2 = jSONObject;
            AFLogger.afErrorLog(th.getMessage(), th);
            AFb1uSDK.AFInAppEventType().values();
            AFb1uSDK.AFInAppEventType().AFInAppEventParameterName();
            return jSONObject2;
        }
    }

    public final String AFInAppEventType() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(HiAnalyticsConstant.BI_KEY_SDK_VER, this.AFInAppEventType);
            jSONObject.put("min", this.values);
            jSONObject.put("expire", this.valueOf);
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }

    public final int hashCode() {
        int i;
        String str = this.AFInAppEventType;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return (((i * 31) + this.values) * 31) + this.valueOf;
    }
}
