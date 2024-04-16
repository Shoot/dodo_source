package com.appsflyer.internal;

import android.support.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFf1uSDK;
import com.dodopizza.kustoworker.KustoStorage;
import im.threads.business.transport.MessageAttributes;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class AFd1iSDK extends AFd1eSDK {
    public Map<String, Object> AFVersionDeclaration;
    @NonNull
    private final AFb1vSDK AppsFlyer2dXConversionCallback;
    @NonNull
    private final AFf1sSDK afErrorLogForExcManagerOnly;
    @NonNull
    private final AFe1nSDK afWarnLog;
    @NonNull
    private final AFb1gSDK getLevel;
    @NonNull
    private final AppsFlyerProperties init;

    /* renamed from: com.appsflyer.internal.AFd1iSDK$2  reason: invalid class name */
    /* loaded from: classes.dex */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] AFKeystoreWrapper;

        static {
            int[] iArr = new int[AFf1uSDK.AFa1ySDK.values().length];
            AFKeystoreWrapper = iArr;
            try {
                iArr[AFf1uSDK.AFa1ySDK.FINISHED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                AFKeystoreWrapper[AFf1uSDK.AFa1ySDK.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public AFd1iSDK(@NonNull AFa1sSDK aFa1sSDK, @NonNull AFc1xSDK aFc1xSDK) {
        super(aFa1sSDK, aFc1xSDK);
        this.afErrorLogForExcManagerOnly = aFc1xSDK.getLevel();
        this.getLevel = aFc1xSDK.afErrorLog();
        this.afWarnLog = aFc1xSDK.afRDLog();
        this.AppsFlyer2dXConversionCallback = aFc1xSDK.afInfoLog();
        this.init = AppsFlyerProperties.getInstance();
        this.AFInAppEventParameterName.add(AFd1wSDK.RESOLVE_ESP);
        this.AFInAppEventParameterName.add(AFd1wSDK.DLSDK);
    }

    @Override // com.appsflyer.internal.AFd1kSDK, com.appsflyer.internal.AFd1tSDK
    public final void AFKeystoreWrapper() {
        super.AFKeystoreWrapper();
        AFe1nSDK aFe1nSDK = this.afWarnLog;
        int i = ((AFd1eSDK) this).AFLogger.afDebugLog;
        long currentTimeMillis = System.currentTimeMillis();
        if (i == 1) {
            long j = aFe1nSDK.afRDLog;
            if (j != 0) {
                aFe1nSDK.values.put("net", Long.valueOf(currentTimeMillis - j));
                aFe1nSDK.AFInAppEventParameterName.AFInAppEventParameterName("first_launch", new JSONObject(aFe1nSDK.values).toString());
                return;
            }
            AFLogger.afInfoLog("Metrics: launch start ts is missing");
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.appsflyer.internal.AFd1eSDK
    public final void values(AFa1sSDK aFa1sSDK) {
        AFf1uSDK[] values;
        super.values(aFa1sSDK);
        int i = aFa1sSDK.afDebugLog;
        this.afWarnLog.AFInAppEventParameterName(i);
        Map map = (Map) aFa1sSDK.AFInAppEventType().get("meta");
        if (map == null) {
            map = new HashMap();
            aFa1sSDK.AFInAppEventType().put("meta", map);
        }
        AFb1kSDK valueOf = this.AppsFlyer2dXConversionCallback.valueOf();
        if (valueOf != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("cdn_token", valueOf.valueOf);
            String str = valueOf.AFInAppEventType;
            if (str != null) {
                hashMap.put("c_ver", str);
            }
            long j = valueOf.values;
            if (j > 0) {
                hashMap.put("latency", Long.valueOf(j));
            }
            long j2 = valueOf.AFKeystoreWrapper;
            if (j2 > 0) {
                hashMap.put("delay", Long.valueOf(j2));
            }
            int i2 = valueOf.AFInAppEventParameterName;
            if (i2 > 0) {
                hashMap.put("res_code", Integer.valueOf(i2));
            }
            if (valueOf.afInfoLog != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(valueOf.afInfoLog.getClass().getSimpleName());
                sb.append(": ");
                sb.append(valueOf.afInfoLog.getMessage());
                hashMap.put("error", sb.toString());
            }
            AFf1xSDK aFf1xSDK = valueOf.afRDLog;
            if (aFf1xSDK != null) {
                hashMap.put("sig", aFf1xSDK.toString());
            }
            String str2 = valueOf.afErrorLog;
            if (str2 != null) {
                hashMap.put("cdn_cache_status", str2);
            }
            map.put("rc", hashMap);
        }
        if (i != 1) {
            if (i == 2) {
                HashMap hashMap2 = new HashMap(this.afWarnLog.values);
                if (!hashMap2.isEmpty()) {
                    map.put("first_launch", hashMap2);
                }
                this.afWarnLog.AFInAppEventParameterName.AFKeystoreWrapper("first_launch");
            }
        } else {
            if (this.init.getBoolean(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false)) {
                aFa1sSDK.AFInAppEventType().put("wait_cid", Boolean.toString(true));
            }
            HashMap hashMap3 = new HashMap(this.afWarnLog.AFKeystoreWrapper);
            this.afWarnLog.AFInAppEventParameterName.AFKeystoreWrapper("ddl");
            if (!hashMap3.isEmpty()) {
                map.put("ddl", hashMap3);
            }
            HashMap hashMap4 = new HashMap(this.afWarnLog.values);
            if (!hashMap4.isEmpty()) {
                map.put("first_launch", hashMap4);
            }
        }
        if (map.isEmpty()) {
            aFa1sSDK.AFInAppEventType().remove("meta");
        }
        if (i <= 2) {
            ArrayList arrayList = new ArrayList();
            for (AFf1uSDK aFf1uSDK : this.afErrorLogForExcManagerOnly.values()) {
                boolean z = aFf1uSDK instanceof AFf1ySDK;
                int i3 = AnonymousClass2.AFKeystoreWrapper[aFf1uSDK.afDebugLog.ordinal()];
                if (i3 != 1) {
                    if (i3 == 2 && i == 2 && !z) {
                        HashMap hashMap5 = new HashMap();
                        hashMap5.put(KustoStorage.KustoTable.COLUMN_SOURCE, aFf1uSDK.AFKeystoreWrapper);
                        hashMap5.put("response", "TIMEOUT");
                        hashMap5.put(MessageAttributes.TYPE, aFf1uSDK.afInfoLog);
                        arrayList.add(hashMap5);
                    }
                } else {
                    if (z) {
                        aFa1sSDK.valueOf("rfr", ((AFf1ySDK) aFf1uSDK).AFInAppEventParameterName);
                        this.getLevel.valueOf(AppsFlyerProperties.NEW_REFERRER_SENT, true);
                    }
                    arrayList.add(aFf1uSDK.values);
                }
            }
            if (!arrayList.isEmpty()) {
                aFa1sSDK.valueOf("referrers", arrayList);
            }
            Object obj = this.AFVersionDeclaration;
            if (obj != null) {
                aFa1sSDK.valueOf("fb_ddl", obj);
            }
        }
    }
}
