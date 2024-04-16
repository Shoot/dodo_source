package com.appsflyer.internal;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.appsflyer.PurchaseHandler;
import java.util.Map;
/* loaded from: classes.dex */
public final class AFd1rSDK extends AFd1qSDK {
    public AFd1rSDK(@NonNull Map<String, Object> map, @Nullable PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback, @NonNull AFc1xSDK aFc1xSDK) {
        super(AFd1wSDK.ARS_VALIDATE, new AFd1wSDK[]{AFd1wSDK.RC_CDN}, aFc1xSDK, null, map, purchaseValidationCallback);
        this.AFInAppEventParameterName.add(AFd1wSDK.CONVERSION);
    }

    @Override // com.appsflyer.internal.AFd1kSDK
    protected final AFc1oSDK<String> AFInAppEventParameterName(@NonNull String str) {
        return this.afErrorLog.AFInAppEventType(afErrorLogForExcManagerOnly(), str);
    }
}
