package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.deeplink.DeepLinkResult;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class AFe1nSDK {
    public final AFb1gSDK AFInAppEventParameterName;
    public long AFInAppEventType;
    public final Map<String, Object> AFKeystoreWrapper;
    public final long[] AFLogger;
    public long AFLogger$LogLevel;
    public long afDebugLog;
    public final long[] afErrorLog;
    public final long[] afInfoLog;
    public long afRDLog;
    public long afWarnLog;
    public final Map<String, Object> valueOf;
    public final Map<String, Object> values;

    public AFe1nSDK(AFb1gSDK aFb1gSDK) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.values = concurrentHashMap;
        ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
        this.AFKeystoreWrapper = concurrentHashMap2;
        ConcurrentHashMap concurrentHashMap3 = new ConcurrentHashMap();
        this.valueOf = concurrentHashMap3;
        this.AFInAppEventType = 0L;
        this.afDebugLog = 0L;
        this.afInfoLog = new long[2];
        this.AFLogger = new long[2];
        this.afErrorLog = new long[2];
        this.afRDLog = 0L;
        this.afWarnLog = 0L;
        this.AFInAppEventParameterName = aFb1gSDK;
        concurrentHashMap.putAll(AFInAppEventParameterName("first_launch"));
        concurrentHashMap2.putAll(AFInAppEventParameterName("ddl"));
        concurrentHashMap3.putAll(AFInAppEventParameterName("gcd"));
        this.AFLogger$LogLevel = aFb1gSDK.valueOf("prev_session_dur", 0L);
    }

    public final void AFInAppEventParameterName(AFe1oSDK aFe1oSDK) {
        if (AFInAppEventParameterName()) {
            this.values.put("start_with", aFe1oSDK.toString());
            this.AFInAppEventParameterName.AFInAppEventParameterName("first_launch", new JSONObject(this.values).toString());
        }
    }

    public final void AFKeystoreWrapper() {
        this.afDebugLog = System.currentTimeMillis();
        if (AFInAppEventParameterName()) {
            long j = this.AFInAppEventType;
            if (j != 0) {
                this.values.put("init_to_fg", Long.valueOf(this.afDebugLog - j));
                this.AFInAppEventParameterName.AFInAppEventParameterName("first_launch", new JSONObject(this.values).toString());
                return;
            }
            AFLogger.afInfoLog("Metrics: init ts is missing");
        }
    }

    public final void AFInAppEventParameterName(int i) {
        long currentTimeMillis = System.currentTimeMillis();
        this.afRDLog = currentTimeMillis;
        if (i == 1) {
            long j = this.afDebugLog;
            if (j != 0) {
                this.values.put("from_fg", Long.valueOf(currentTimeMillis - j));
                this.AFInAppEventParameterName.AFInAppEventParameterName("first_launch", new JSONObject(this.values).toString());
                return;
            }
            AFLogger.afInfoLog("Metrics: fg ts is missing");
        }
    }

    public final void AFKeystoreWrapper(DeepLinkResult deepLinkResult, long j) {
        this.AFKeystoreWrapper.put("status", deepLinkResult.getStatus().toString());
        this.AFKeystoreWrapper.put("timeout_value", Long.valueOf(j));
        this.AFInAppEventParameterName.AFInAppEventParameterName("ddl", new JSONObject(this.AFKeystoreWrapper).toString());
    }

    private Map<String, Object> AFInAppEventParameterName(String str) {
        Map<String, Object> emptyMap = Collections.emptyMap();
        String valueOf = this.AFInAppEventParameterName.valueOf(str, (String) null);
        if (valueOf != null) {
            try {
                return AFa1lSDK.AFInAppEventType(new JSONObject(valueOf));
            } catch (Exception e) {
                AFLogger.afErrorLog("Error while parsing cached json data", e, true);
                return emptyMap;
            }
        }
        return emptyMap;
    }

    public final void AFKeystoreWrapper(int i) {
        long currentTimeMillis = System.currentTimeMillis();
        long j = this.afWarnLog;
        if (j != 0) {
            this.valueOf.put("net", Long.valueOf(currentTimeMillis - j));
        } else {
            AFLogger.afInfoLog("Metrics: gcdStart ts is missing");
        }
        this.valueOf.put("retries", Integer.valueOf(i));
        this.AFInAppEventParameterName.AFInAppEventParameterName("gcd", new JSONObject(this.valueOf).toString());
    }

    public final boolean AFInAppEventParameterName() {
        return this.AFInAppEventParameterName.AFInAppEventType("appsFlyerCount", 0) == 0;
    }
}
