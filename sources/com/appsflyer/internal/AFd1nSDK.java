package com.appsflyer.internal;

import android.net.Uri;
import android.support.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFd1xSDK;
import defpackage.tmb;
/* loaded from: classes.dex */
public final class AFd1nSDK extends AFd1tSDK<Boolean> {
    private static volatile boolean afRDLog = false;
    private final AFc1xSDK AFLogger;
    private Boolean afDebugLog;
    private final AFa1lSDK afErrorLog;
    private final AFd1xSDK afInfoLog;

    public AFd1nSDK(@NonNull AFc1xSDK aFc1xSDK) {
        super(AFd1wSDK.LOAD_CACHE, new AFd1wSDK[0], "LoadCachedRequests");
        this.afErrorLog = aFc1xSDK.afWarnLog();
        this.afInfoLog = aFc1xSDK.afDebugLog();
        this.AFLogger = aFc1xSDK;
    }

    public static boolean AFLogger() {
        return afRDLog;
    }

    @Override // com.appsflyer.internal.AFd1tSDK
    @NonNull
    public final AFc1aSDK AFInAppEventParameterName() throws Exception {
        for (AFc1rSDK aFc1rSDK : this.afErrorLog.AFKeystoreWrapper()) {
            StringBuilder sb = new StringBuilder("CACHE: resending request: ");
            sb.append(aFc1rSDK.AFKeystoreWrapper);
            AFLogger.afInfoLog(sb.toString());
            try {
                AFe1fSDK aFe1fSDK = new AFe1fSDK(AFInAppEventType(aFc1rSDK), aFc1rSDK.AFInAppEventParameterName(), aFc1rSDK.values, aFc1rSDK.valueOf);
                AFd1xSDK aFd1xSDK = this.afInfoLog;
                aFd1xSDK.AFKeystoreWrapper.execute(new AFd1xSDK.AnonymousClass2(new AFd1fSDK(aFe1fSDK, this.AFLogger)));
            } catch (Exception e) {
                AFLogger.afErrorLog("QUEUE: Failed to resend cached request", e);
            }
        }
        this.afDebugLog = Boolean.TRUE;
        afRDLog = true;
        return AFc1aSDK.SUCCESS;
    }

    @Override // com.appsflyer.internal.AFd1tSDK
    public final long AFInAppEventType() {
        return 30000L;
    }

    @Override // com.appsflyer.internal.AFd1tSDK
    public final boolean valueOf() {
        return false;
    }

    private static String AFInAppEventType(AFc1rSDK aFc1rSDK) {
        long currentTimeMillis = System.currentTimeMillis();
        long parseLong = Long.parseLong(aFc1rSDK.values, 10);
        String str = aFc1rSDK.AFKeystoreWrapper;
        try {
            return Uri.parse(str).buildUpon().appendQueryParameter("isCachedRequest", tmb.h.TRUE_JSON_NAME).appendQueryParameter("timeincache", String.valueOf((currentTimeMillis - parseLong) / 1000)).toString();
        } catch (Exception e) {
            AFLogger.afErrorLogForExcManagerOnly("Couldn't parse the uri", e);
            return str;
        }
    }
}
