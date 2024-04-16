package com.appsflyer.internal;

import android.support.annotation.Nullable;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFd1xSDK;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class AFb1vSDK implements AFd1zSDK {
    private final Object AFInAppEventParameterName;
    private final AFe1zSDK AFInAppEventType;
    private final AFe1xSDK AFKeystoreWrapper;
    private final AFc1pSDK AFLogger;
    private final AFd1xSDK afDebugLog;
    @Nullable
    private AFd1aSDK afErrorLog;
    private final AFe1uSDK afInfoLog;
    @Nullable
    private AFb1kSDK afRDLog;
    public final AFe1wSDK valueOf;
    private final AFb1fSDK values;

    public AFb1vSDK() {
    }

    public AFb1vSDK(AFe1zSDK aFe1zSDK, AFb1fSDK aFb1fSDK, AFe1xSDK aFe1xSDK, AFe1wSDK aFe1wSDK, AFc1pSDK aFc1pSDK, AFe1uSDK aFe1uSDK, AFd1xSDK aFd1xSDK) {
        this.AFInAppEventParameterName = new Object();
        this.AFInAppEventType = aFe1zSDK;
        this.values = aFb1fSDK;
        this.AFKeystoreWrapper = aFe1xSDK;
        this.valueOf = aFe1wSDK;
        this.AFLogger = aFc1pSDK;
        this.afInfoLog = aFe1uSDK;
        this.afDebugLog = aFd1xSDK;
        aFd1xSDK.AFInAppEventParameterName.add(this);
    }

    public static Map<String, String> AFInAppEventParameterName(Map<String, String> map) {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            try {
                hashMap.put(URLEncoder.encode(entry.getKey(), "utf-8"), URLEncoder.encode(entry.getValue(), "utf-8"));
            } catch (UnsupportedEncodingException e) {
                AFLogger.afErrorLogForExcManagerOnly("failed to encode map", e);
            }
        }
        return hashMap;
    }

    public final void AFInAppEventType(AFd1dSDK aFd1dSDK) {
        AFd1cSDK aFd1cSDK = new AFd1cSDK(this.AFInAppEventType, this.values, this.AFKeystoreWrapper, this.valueOf, this.AFLogger, this.afInfoLog, "v1", aFd1dSDK);
        AFd1xSDK aFd1xSDK = this.afDebugLog;
        aFd1xSDK.AFKeystoreWrapper.execute(new AFd1xSDK.AnonymousClass2(aFd1cSDK));
    }

    @Nullable
    public final AFb1kSDK valueOf() {
        AFb1kSDK aFb1kSDK;
        synchronized (this.AFInAppEventParameterName) {
            aFb1kSDK = this.afRDLog;
            this.afRDLog = null;
        }
        return aFb1kSDK;
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    public final void AFInAppEventType(AFd1tSDK<?> aFd1tSDK, AFc1aSDK aFc1aSDK) {
        if (aFd1tSDK instanceof AFd1cSDK) {
            AFd1cSDK aFd1cSDK = (AFd1cSDK) aFd1tSDK;
            AFd1aSDK aFd1aSDK = aFd1cSDK.afRDLog;
            if (aFd1aSDK == null) {
                AFLogger.afWarnLog("CFG: update RC returned null result, something went wrong!");
                aFd1aSDK = AFd1aSDK.FAILURE;
            }
            if (aFd1aSDK != AFd1aSDK.USE_CACHED) {
                AFb1kSDK aFb1kSDK = aFd1cSDK.afDebugLog;
                synchronized (this.AFInAppEventParameterName) {
                    this.afRDLog = aFb1kSDK;
                }
            }
            valueOf(aFd1aSDK, aFd1cSDK.afErrorLog);
        }
    }

    private void valueOf(AFd1aSDK aFd1aSDK, AFd1dSDK aFd1dSDK) {
        synchronized (this.AFInAppEventParameterName) {
            this.afErrorLog = aFd1aSDK;
        }
        if (aFd1dSDK != null) {
            aFd1dSDK.onRemoteConfigUpdateFinished(aFd1aSDK);
        }
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    public final void valueOf(AFd1tSDK<?> aFd1tSDK) {
        if (aFd1tSDK instanceof AFd1cSDK) {
            AFd1cSDK aFd1cSDK = (AFd1cSDK) aFd1tSDK;
            synchronized (this.AFInAppEventParameterName) {
                this.afRDLog = null;
            }
            valueOf(AFd1aSDK.FAILURE, aFd1cSDK.afErrorLog);
        }
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    public final void AFKeystoreWrapper(AFd1tSDK<?> aFd1tSDK) {
    }
}
