package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final class AFe1uSDK {
    private static final long AFInAppEventParameterName = TimeUnit.HOURS.toSeconds(24);
    private final AFe1wSDK AFKeystoreWrapper;
    private final AFb1fSDK values;

    public AFe1uSDK(AFb1fSDK aFb1fSDK, AFe1wSDK aFe1wSDK) {
        this.values = aFb1fSDK;
        this.AFKeystoreWrapper = aFe1wSDK;
    }

    public final boolean AFInAppEventType() {
        return Boolean.parseBoolean(this.values.AFKeystoreWrapper("com.appsflyer.rc.staging"));
    }

    public final boolean AFKeystoreWrapper() {
        return Boolean.parseBoolean(this.values.AFKeystoreWrapper("com.appsflyer.rc.sandbox"));
    }

    public final boolean valueOf() {
        if (this.AFKeystoreWrapper.AFInAppEventParameterName == null) {
            AFLogger.afInfoLog("CFG: active config is missing - fetching from CDN");
            return true;
        }
        long currentTimeMillis = System.currentTimeMillis();
        AFe1wSDK aFe1wSDK = this.AFKeystoreWrapper;
        if (currentTimeMillis - aFe1wSDK.AFKeystoreWrapper > TimeUnit.SECONDS.toMillis(aFe1wSDK.values)) {
            return true;
        }
        return false;
    }

    public final long values() {
        String AFKeystoreWrapper = this.values.AFKeystoreWrapper("com.appsflyer.rc.cache.max-age-fallback");
        if (AFKeystoreWrapper != null) {
            try {
                return Long.parseLong(AFKeystoreWrapper);
            } catch (NumberFormatException e) {
                StringBuilder sb = new StringBuilder("Can't read maxAgeFallback from Manifest: ");
                sb.append(e.getMessage());
                AFLogger.afErrorLog(sb.toString(), e);
                return AFInAppEventParameterName;
            }
        }
        return AFInAppEventParameterName;
    }
}
