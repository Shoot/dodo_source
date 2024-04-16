package com.appsflyer.internal;

import android.support.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.deeplink.DeepLink;
import com.appsflyer.deeplink.DeepLinkResult;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class AFb1oSDK {
    private final boolean AFInAppEventParameterName;
    @NonNull
    public final String AFInAppEventType;
    @NonNull
    public final String AFKeystoreWrapper;
    public final AFb1nSDK valueOf;
    @NonNull
    public final AFf1wSDK values;

    public AFb1oSDK() {
    }

    public AFb1oSDK(String str) throws JSONException {
        AFf1wSDK aFf1wSDK;
        if (str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                String string = jSONObject.getString("ver");
                this.AFInAppEventType = string;
                this.AFInAppEventParameterName = jSONObject.optBoolean("test_mode");
                this.AFKeystoreWrapper = str;
                if (string.startsWith("default")) {
                    aFf1wSDK = AFf1wSDK.DEFAULT;
                } else {
                    aFf1wSDK = AFf1wSDK.CUSTOM;
                }
                this.values = aFf1wSDK;
                JSONObject optJSONObject = jSONObject.optJSONObject("features");
                this.valueOf = optJSONObject != null ? new AFb1nSDK(optJSONObject) : null;
                return;
            } catch (JSONException e) {
                AFLogger.afErrorLogForExcManagerOnly("Error in RC config parsing", e);
                throw new JSONException("Failed to parse remote configuration JSON");
            }
        }
        throw new JSONException("Failed to parse remote configuration JSON: originalJson is null");
    }

    public static void AFInAppEventParameterName(Map<String, String> map) {
        DeepLinkResult deepLinkResult;
        if (AFa1qSDK.AFInAppEventParameterName().AFInAppEventType != null) {
            try {
                try {
                    DeepLink AFInAppEventType = DeepLink.AFInAppEventType(map);
                    AFInAppEventType.AFInAppEventType.put("is_deferred", false);
                    deepLinkResult = new DeepLinkResult(AFInAppEventType, null);
                } catch (JSONException e) {
                    AFLogger.afErrorLog("[DDL] Error occurred", e, true);
                    deepLinkResult = new DeepLinkResult(null, DeepLinkResult.Error.UNEXPECTED);
                }
                AFInAppEventParameterName(deepLinkResult);
                return;
            } catch (Throwable th) {
                AFInAppEventParameterName(new DeepLinkResult(null, null));
                throw th;
            }
        }
        AFKeystoreWrapper(map);
    }

    public static void AFInAppEventType(String str, DeepLinkResult.Error error) {
        if (AFa1qSDK.AFInAppEventParameterName().AFInAppEventType != null) {
            AFLogger.afDebugLog("[DDL] Error occurred: ".concat(String.valueOf(str)));
            AFInAppEventParameterName(new DeepLinkResult(null, error));
            return;
        }
        AFInAppEventParameterName(str);
    }

    private static void AFKeystoreWrapper(Map<String, String> map) {
        if (AFb1zSDK.valueOf != null) {
            try {
                StringBuilder sb = new StringBuilder("Calling onAppOpenAttribution with:\n");
                sb.append(map.toString());
                AFLogger.afDebugLog(sb.toString());
                AFb1zSDK.valueOf.onAppOpenAttribution(map);
            } catch (Throwable th) {
                AFLogger.afErrorLog(th.getLocalizedMessage(), th);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AFb1oSDK.class != obj.getClass()) {
            return false;
        }
        AFb1oSDK aFb1oSDK = (AFb1oSDK) obj;
        if (this.AFInAppEventParameterName != aFb1oSDK.AFInAppEventParameterName || !this.AFInAppEventType.equals(aFb1oSDK.AFInAppEventType)) {
            return false;
        }
        return this.AFKeystoreWrapper.equals(aFb1oSDK.AFKeystoreWrapper);
    }

    public final int hashCode() {
        int hashCode = ((((this.AFInAppEventParameterName ? 1 : 0) * 31) + this.AFInAppEventType.hashCode()) * 31) + this.AFKeystoreWrapper.hashCode();
        AFb1nSDK aFb1nSDK = this.valueOf;
        if (aFb1nSDK != null) {
            return (hashCode * 31) + aFb1nSDK.hashCode();
        }
        return hashCode;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void AFInAppEventParameterName(DeepLinkResult deepLinkResult) {
        if (AFa1qSDK.AFInAppEventParameterName().AFInAppEventType != null) {
            StringBuilder sb = new StringBuilder("[DDL] Calling onDeepLinking with:\n");
            sb.append(deepLinkResult.toString());
            AFLogger.afDebugLog(sb.toString());
            try {
                AFa1qSDK.AFInAppEventParameterName().AFInAppEventType.onDeepLinking(deepLinkResult);
                return;
            } catch (Throwable th) {
                AFLogger.afErrorLog(th.getLocalizedMessage(), th);
                return;
            }
        }
        AFLogger.afDebugLog("[DDL] skipping, no callback registered");
    }

    private static void AFInAppEventParameterName(String str) {
        if (AFb1zSDK.valueOf != null) {
            try {
                AFLogger.afDebugLog("Calling onAppOpenAttributionFailure with: ".concat(String.valueOf(str)));
                AFb1zSDK.valueOf.onAttributionFailure(str);
            } catch (Throwable th) {
                AFLogger.afErrorLog(th.getLocalizedMessage(), th);
            }
        }
    }
}
