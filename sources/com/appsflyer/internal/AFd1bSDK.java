package com.appsflyer.internal;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class AFd1bSDK extends AFd1kSDK<String> {
    private final Map<String, Object> AFLogger;

    public AFd1bSDK(@NonNull Map<String, Object> map, @NonNull AFc1xSDK aFc1xSDK) {
        super(AFd1wSDK.MONITORSDK, new AFd1wSDK[]{AFd1wSDK.RC_CDN}, aFc1xSDK, String.valueOf(map.hashCode()));
        this.AFLogger = new HashMap(map);
    }

    @Override // com.appsflyer.internal.AFd1kSDK
    protected final AFc1oSDK<String> AFInAppEventParameterName(@NonNull String str) {
        return this.afErrorLog.valueOf(this.AFLogger);
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
}
