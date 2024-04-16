package com.appsflyer.internal;

import android.support.annotation.Nullable;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class AFb1nSDK {
    public final AFb1tSDK valueOf;

    public AFb1nSDK() {
    }

    public AFb1nSDK(JSONObject jSONObject) {
        AFb1tSDK aFb1tSDK;
        if (jSONObject.has("exc_mngr")) {
            try {
                JSONObject optJSONObject = jSONObject.getJSONArray("exc_mngr").optJSONObject(0).optJSONObject("data");
                Objects.requireNonNull(optJSONObject);
                JSONObject optJSONObject2 = optJSONObject.optJSONObject("v1");
                aFb1tSDK = new AFb1tSDK(optJSONObject2.getString(HiAnalyticsConstant.BI_KEY_SDK_VER), optJSONObject2.optInt("min", -1), optJSONObject2.optInt("expire", -1));
            } catch (NullPointerException | JSONException unused) {
            }
            this.valueOf = aFb1tSDK;
        }
        aFb1tSDK = null;
        this.valueOf = aFb1tSDK;
    }

    public static boolean AFInAppEventParameterName(@Nullable String str) {
        if (str != null && str.length() != 0) {
            return false;
        }
        return true;
    }

    public static boolean valueOf(@Nullable String str) {
        if (str != null && str.trim().length() != 0) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        AFb1tSDK aFb1tSDK = this.valueOf;
        if (aFb1tSDK != null) {
            return aFb1tSDK.hashCode();
        }
        return 0;
    }
}
