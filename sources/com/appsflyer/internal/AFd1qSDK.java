package com.appsflyer.internal;

import android.content.Context;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.PurchaseHandler;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.AFc1vSDK;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import com.huawei.hms.framework.common.hianalytics.HianalyticsBaseData;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public abstract class AFd1qSDK extends AFd1kSDK<String> {
    private final AFb1fSDK AFLogger;
    @NonNull
    private final Map<String, Object> AFLogger$LogLevel;
    @Nullable
    private final PurchaseHandler.PurchaseValidationCallback AFVersionDeclaration;
    private final AFb1gSDK afErrorLogForExcManagerOnly;

    public AFd1qSDK(@NonNull AFd1wSDK aFd1wSDK, @NonNull AFd1wSDK[] aFd1wSDKArr, @NonNull AFc1xSDK aFc1xSDK, @Nullable String str, Map<String, Object> map, @Nullable PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback) {
        super(aFd1wSDK, aFd1wSDKArr, aFc1xSDK, str);
        String str2;
        String str3;
        AFb1fSDK values = aFc1xSDK.values();
        this.AFLogger = values;
        AFb1gSDK afErrorLog = aFc1xSDK.afErrorLog();
        this.afErrorLogForExcManagerOnly = afErrorLog;
        HashMap hashMap = new HashMap(new HashMap(map));
        hashMap.put(HiAnalyticsConstant.BI_KEY_APP_ID, values.valueOf.values.getPackageName());
        String AFInAppEventParameterName = AFb1fSDK.AFInAppEventParameterName();
        if (AFInAppEventParameterName != null) {
            hashMap.put("cuid", AFInAppEventParameterName);
        }
        Context context = values.valueOf.values;
        hashMap.put("app_version_name", AFa1dSDK.values(context, context.getPackageName()));
        HashMap hashMap2 = new HashMap();
        AFc1vSDK.AFa1wSDK AFKeystoreWrapper = AFa1bSDK.AFKeystoreWrapper(values.valueOf.values, new HashMap());
        if (AFKeystoreWrapper != null) {
            str2 = AFKeystoreWrapper.AFInAppEventType;
        } else {
            str2 = null;
        }
        if (!AFb1nSDK.AFInAppEventParameterName(str2)) {
            hashMap2.put("advertising_id", str2);
        }
        AFc1vSDK.AFa1wSDK values2 = AFa1bSDK.values(values.valueOf.values.getContentResolver());
        if (values2 != null) {
            str3 = values2.AFInAppEventType;
        } else {
            str3 = null;
        }
        if (!AFb1nSDK.AFInAppEventParameterName(str3)) {
            hashMap2.put("oaid", str3);
        }
        AFc1vSDK.AFa1wSDK values3 = AFa1bSDK.values(values.valueOf.values.getContentResolver());
        String str4 = values3 != null ? values3.AFInAppEventType : null;
        if (!AFb1nSDK.AFInAppEventParameterName(str4)) {
            hashMap2.put("amazon_aid", str4);
        }
        if (!AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, false)) {
            String AFInAppEventType = ((AFd1kSDK) this).afRDLog.AFInAppEventType(afErrorLog);
            if (!AFb1nSDK.AFInAppEventParameterName(AFInAppEventType)) {
                hashMap2.put("imei", AFInAppEventType);
            }
        }
        hashMap2.put("appsflyer_id", AFb1xSDK.AFInAppEventParameterName(new WeakReference(values.valueOf.values)));
        StringBuilder sb = new StringBuilder();
        sb.append(Build.VERSION.SDK_INT);
        hashMap2.put("os_version", sb.toString());
        hashMap2.put(HianalyticsBaseData.SDK_VERSION, AFb1zSDK.AFKeystoreWrapper);
        hashMap.put("device_data", hashMap2);
        this.AFLogger$LogLevel = hashMap;
        this.AFVersionDeclaration = purchaseValidationCallback;
    }

    @Override // com.appsflyer.internal.AFd1kSDK, com.appsflyer.internal.AFd1tSDK
    public final void AFKeystoreWrapper() {
        PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback;
        PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback2;
        super.AFKeystoreWrapper();
        Throwable afDebugLog = afDebugLog();
        if (afDebugLog != null && (purchaseValidationCallback2 = this.AFVersionDeclaration) != null) {
            purchaseValidationCallback2.onFailure(afDebugLog);
        }
        ResponseNetwork<String> responseNetwork = ((AFd1kSDK) this).afDebugLog;
        if (responseNetwork != null && (purchaseValidationCallback = this.AFVersionDeclaration) != null) {
            purchaseValidationCallback.onResponse(responseNetwork);
        }
    }

    @Override // com.appsflyer.internal.AFd1kSDK
    protected final boolean AFLogger() {
        return true;
    }

    @Override // com.appsflyer.internal.AFd1kSDK
    @Nullable
    protected final AppsFlyerRequestListener afErrorLog() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @NonNull
    public final Map<String, Object> afErrorLogForExcManagerOnly() {
        return this.AFLogger$LogLevel;
    }
}
