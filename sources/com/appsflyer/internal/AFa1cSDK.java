package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerInAppPurchaseValidatorListener;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.attribution.RequestError;
import com.appsflyer.internal.AFd1xSDK;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class AFa1cSDK implements Runnable {
    private static String valueOf = "https://%ssdk-services.%s/validate-android-signature";
    private static String values;
    private String AFInAppEventParameterName;
    private WeakReference<Context> AFInAppEventType;
    private final Intent AFKeystoreWrapper;
    private String AFLogger;
    private Map<String, String> AFVersionDeclaration;
    private String afDebugLog;
    private String afErrorLog;
    private String afInfoLog;
    private String afRDLog;

    static {
        StringBuilder sb = new StringBuilder("https://%svalidate.%s/api/v");
        sb.append(AFb1zSDK.AFKeystoreWrapper);
        sb.append("/androidevent?buildnumber=6.10.0&app_id=");
        values = sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AFa1cSDK(Context context, String str, String str2, String str3, String str4, String str5, String str6, Map<String, String> map, @Nullable Intent intent) {
        this.AFInAppEventType = new WeakReference<>(context);
        this.AFInAppEventParameterName = str;
        this.afDebugLog = str2;
        this.afRDLog = str4;
        this.afInfoLog = str5;
        this.afErrorLog = str6;
        this.AFVersionDeclaration = map;
        this.AFLogger = str3;
        this.AFKeystoreWrapper = intent;
    }

    private static AFd1eSDK valueOf(Context context, @NonNull AFe1aSDK aFe1aSDK) {
        AFb1zSDK.AFInAppEventType().AFKeystoreWrapper(context);
        AFc1xSDK AFInAppEventParameterName = AFb1zSDK.AFInAppEventType().AFInAppEventParameterName();
        aFe1aSDK.AFInAppEventParameterName(AFInAppEventParameterName.values().values.AFInAppEventType("appsFlyerCount", 0));
        AFd1eSDK aFd1eSDK = new AFd1eSDK(aFe1aSDK, AFInAppEventParameterName);
        AFd1xSDK afDebugLog = AFInAppEventParameterName.afDebugLog();
        afDebugLog.AFKeystoreWrapper.execute(new AFd1xSDK.AnonymousClass2(aFd1eSDK));
        return aFd1eSDK;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void values(boolean z, String str, String str2, String str3, String str4) {
        if (AFb1zSDK.values != null) {
            StringBuilder sb = new StringBuilder("Validate callback parameters: ");
            sb.append(str);
            sb.append(" ");
            sb.append(str2);
            sb.append(" ");
            sb.append(str3);
            AFLogger.afDebugLog(sb.toString());
            if (z) {
                AFLogger.afDebugLog("Validate in app purchase success: ".concat(String.valueOf(str4)));
                AFb1zSDK.values.onValidateInApp();
                return;
            }
            AFLogger.afDebugLog("Validate in app purchase failed: ".concat(String.valueOf(str4)));
            AppsFlyerInAppPurchaseValidatorListener appsFlyerInAppPurchaseValidatorListener = AFb1zSDK.values;
            if (str4 == null) {
                str4 = "Failed validating";
            }
            appsFlyerInAppPurchaseValidatorListener.onValidateInAppFailure(str4);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = this.AFInAppEventParameterName;
        if (str == null || str.length() == 0 || AppsFlyerLib.getInstance().isStopped()) {
            return;
        }
        try {
            Context context = this.AFInAppEventType.get();
            if (context == null) {
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("public-key", this.afDebugLog);
            hashMap.put("sig-data", this.afRDLog);
            hashMap.put("signature", this.AFLogger);
            Object hashMap2 = new HashMap(hashMap);
            Object obj = this.AFVersionDeclaration;
            StringBuilder sb = new StringBuilder();
            sb.append(String.format(values, AppsFlyerLib.getInstance().getHostPrefix(), AFb1zSDK.AFInAppEventType().getHostName()));
            sb.append(context.getPackageName());
            String obj2 = sb.toString();
            String string = AFb1zSDK.AFInAppEventType(context).getString("referrer", "");
            AFa1sSDK aFe1dSDK = new AFe1dSDK(context);
            aFe1dSDK.afInfoLog = string;
            AFb1zSDK AFInAppEventType = AFb1zSDK.AFInAppEventType();
            Map<String, Object> AFInAppEventType2 = AFInAppEventType.AFInAppEventType(aFe1dSDK);
            AFInAppEventType2.put("price", this.afInfoLog);
            AFInAppEventType2.put("currency", this.afErrorLog);
            AFInAppEventType2.put("receipt_data", hashMap2);
            if (obj != null) {
                AFInAppEventType2.put("extra_prms", obj);
            }
            AFInAppEventType2.putAll(AFInAppEventType.AFInAppEventParameterName().AFVersionDeclaration().values());
            valueOf(context, (AFe1dSDK) aFe1dSDK.AFInAppEventType(AFInAppEventType2).AFInAppEventType(obj2));
            hashMap.put("dev_key", this.AFInAppEventParameterName);
            hashMap.put(HiAnalyticsConstant.BI_KEY_APP_ID, context.getPackageName());
            hashMap.put("uid", AppsFlyerLib.getInstance().getAppsFlyerUID(context));
            String string2 = AppsFlyerProperties.getInstance().getString("advertiserId");
            if (string2 != null) {
                hashMap.put("advertiserId", string2);
            }
            AFe1cSDK aFe1cSDK = (AFe1cSDK) new AFe1cSDK().AFInAppEventType(hashMap).AFInAppEventType(String.format(valueOf, AppsFlyerLib.getInstance().getHostPrefix(), AFb1zSDK.AFInAppEventType().getHostName()));
            final AFd1eSDK valueOf2 = valueOf(context, aFe1cSDK);
            aFe1cSDK.AFInAppEventType = new AppsFlyerRequestListener() { // from class: com.appsflyer.internal.AFa1cSDK.3
                @Override // com.appsflyer.attribution.AppsFlyerRequestListener
                public final void onError(int i, @NonNull String str2) {
                    ResponseNetwork responseNetwork;
                    if (i == RequestError.RESPONSE_CODE_FAILURE && (responseNetwork = ((AFd1kSDK) valueOf2).afDebugLog) != null) {
                        str2 = responseNetwork.toString();
                    }
                    AFa1cSDK.values(false, AFa1cSDK.this.afRDLog, AFa1cSDK.this.afInfoLog, AFa1cSDK.this.afErrorLog, str2);
                }

                @Override // com.appsflyer.attribution.AppsFlyerRequestListener
                public final void onSuccess() {
                    try {
                        JSONObject jSONObject = new JSONObject((String) ((AFd1kSDK) valueOf2).afDebugLog.getBody());
                        AFLogger.afInfoLog("Validate response ok: ".concat(String.valueOf(jSONObject)));
                        AFa1cSDK.values(jSONObject.optBoolean("result"), AFa1cSDK.this.afRDLog, AFa1cSDK.this.afInfoLog, AFa1cSDK.this.afErrorLog, jSONObject.toString());
                    } catch (Exception e) {
                        AFLogger.afErrorLog("Failed Validate request: ".concat(String.valueOf(e)), e);
                        AFa1cSDK.values(false, AFa1cSDK.this.afRDLog, AFa1cSDK.this.afInfoLog, AFa1cSDK.this.afErrorLog, e.getMessage());
                    }
                }
            };
        } catch (Throwable th) {
            if (AFb1zSDK.values != null) {
                AFLogger.afErrorLog("Failed Validate request + ex", th);
                values(false, this.afRDLog, this.afInfoLog, this.afErrorLog, th.getMessage());
            }
            AFLogger.afErrorLog(th.getMessage(), th);
        }
    }
}
