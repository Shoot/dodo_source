package com.appsflyer.internal;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.PurchaseHandler;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.util.Map;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class AFd1jSDK extends AFd1qSDK {
    private final AFb1fSDK AFLogger;

    public AFd1jSDK(@NonNull Map<String, Object> map, @Nullable PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback, @NonNull AFc1xSDK aFc1xSDK) {
        super(AFd1wSDK.PURCHASE_VALIDATE, new AFd1wSDK[]{AFd1wSDK.RC_CDN}, aFc1xSDK, null, map, purchaseValidationCallback);
        this.AFLogger = aFc1xSDK.values();
        this.AFInAppEventParameterName.add(AFd1wSDK.CONVERSION);
    }

    @Override // com.appsflyer.internal.AFd1kSDK
    protected final AFc1oSDK<String> AFInAppEventParameterName(@NonNull String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("https://%sviap.%s/api/v1/android/validate_purchase?app_id=", AppsFlyerLib.getInstance().getHostPrefix(), AFb1zSDK.AFInAppEventType().getHostName()));
        sb.append(this.AFLogger.valueOf.values.getPackageName());
        String obj = sb.toString();
        String jSONObject = new JSONObject(afErrorLogForExcManagerOnly()).toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this);
        sb2.append(": preparing data: ");
        sb2.append(jSONObject);
        AFc1sSDK.valueOf(sb2.toString());
        ((AFd1kSDK) this).afInfoLog.valueOf(obj, jSONObject);
        return this.afErrorLog.valueOf(afErrorLogForExcManagerOnly(), str);
    }

    @Override // com.appsflyer.internal.AFd1kSDK, com.appsflyer.internal.AFd1tSDK
    public final boolean valueOf() {
        ResponseNetwork responseNetwork = ((AFd1kSDK) this).afDebugLog;
        if (responseNetwork != null && responseNetwork.getStatusCode() == 503) {
            return true;
        }
        return super.valueOf();
    }
}
