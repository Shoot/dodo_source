package com.appsflyer.share;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFb1zSDK;
import com.appsflyer.internal.AFc1xSDK;
import com.appsflyer.internal.AFd1sSDK;
import com.appsflyer.internal.AFd1xSDK;
import com.appsflyer.internal.AFe1tSDK;
import com.appsflyer.internal.AFf1lSDK;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class CrossPromotionHelper {
    private static String values = "https://%simpression.%s";

    public static void logAndOpenStore(@NonNull Context context, String str, String str2) {
        logAndOpenStore(context, str, str2, null);
    }

    public static void logCrossPromoteImpression(@NonNull Context context, String str, String str2) {
        logCrossPromoteImpression(context, str, str2, null);
    }

    public static void setUrl(Map<String, String> map) {
        char c;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String value = entry.getValue();
            String key = entry.getKey();
            int hashCode = key.hashCode();
            if (hashCode != 96801) {
                if (hashCode == 120623625 && key.equals("impression")) {
                    c = 1;
                }
                c = 65535;
            } else {
                if (key.equals("app")) {
                    c = 0;
                }
                c = 65535;
            }
            if (c != 0) {
                if (c == 1) {
                    values = value;
                }
            } else {
                AFf1lSDK.values = value;
            }
        }
    }

    private static void valueOf(@NonNull String str, @NonNull Context context, @Nullable AFe1tSDK aFe1tSDK) {
        AFb1zSDK AFInAppEventType = AFb1zSDK.AFInAppEventType();
        AFInAppEventType.AFKeystoreWrapper(context);
        AFc1xSDK AFInAppEventParameterName = AFInAppEventType.AFInAppEventParameterName();
        AFd1sSDK aFd1sSDK = new AFd1sSDK(AFInAppEventParameterName, str, aFe1tSDK);
        AFd1xSDK afDebugLog = AFInAppEventParameterName.afDebugLog();
        afDebugLog.AFKeystoreWrapper.execute(new AFd1xSDK.AnonymousClass2(aFd1sSDK));
    }

    public static void logAndOpenStore(@NonNull Context context, String str, String str2, Map<String, String> map) {
        LinkGenerator valueOf = valueOf(context, str, str2, map, String.format(AFf1lSDK.values, AppsFlyerLib.getInstance().getHostPrefix(), AFb1zSDK.AFInAppEventType().getHostName()));
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false)) {
            AFLogger.afInfoLog("CustomerUserId not set, track And Open Store is disabled", true);
        } else if (AppsFlyerLib.getInstance().isStopped()) {
            AFLogger.afInfoLog("SDK is stopped, track And Open Store is disabled", true);
        } else {
            if (map == null) {
                map = new HashMap<>();
            }
            map.put("af_campaign", str2);
            AppsFlyerLib.getInstance().logEvent(context, "af_cross_promotion", map);
            valueOf(valueOf.generateLink(), context, new AFe1tSDK(context));
        }
    }

    public static void logCrossPromoteImpression(@NonNull Context context, String str, String str2, Map<String, String> map) {
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false)) {
            AFLogger.afInfoLog("CustomerUserId not set, Promote Impression is disabled", true);
        } else if (AppsFlyerLib.getInstance().isStopped()) {
            AFLogger.afInfoLog("SDK is stopped, Promote Impression is disabled", true);
        } else {
            valueOf(valueOf(context, str, str2, map, String.format(values, AppsFlyerLib.getInstance().getHostPrefix(), AFb1zSDK.AFInAppEventType().getHostName())).generateLink(), context, null);
        }
    }

    @NonNull
    private static LinkGenerator valueOf(@NonNull Context context, String str, String str2, Map<String, String> map, String str3) {
        LinkGenerator linkGenerator = new LinkGenerator("af_cross_promotion");
        linkGenerator.values = str3;
        linkGenerator.AFInAppEventType = str;
        linkGenerator.addParameter("af_siteid", context.getPackageName());
        if (str2 != null) {
            linkGenerator.setCampaign(str2);
        }
        if (map != null) {
            linkGenerator.addParameters(map);
        }
        String string = AppsFlyerProperties.getInstance().getString("advertiserId");
        if (string != null) {
            linkGenerator.addParameter("advertising_id", string);
        }
        return linkGenerator;
    }
}
