package com.appsflyer.internal;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.VisibleForTesting;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.internal.AFc1vSDK;
import com.appsflyer.internal.AFf1uSDK;
import com.dodopizza.kustoworker.KustoStorage;
import com.huawei.hms.framework.common.hianalytics.HianalyticsBaseData;
import im.threads.business.transport.MessageAttributes;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;
import java.util.TimeZone;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final class AFb1pSDK extends AFe1jSDK {
    @VisibleForTesting
    private static String AFLogger$LogLevel = "https://%sdlsdk.%s/v1.0/android/";
    public static long getLevel;
    private final AFe1nSDK AppsFlyer2dXConversionCallback;
    private final List<AFf1uSDK> afErrorLogForExcManagerOnly;
    private final CountDownLatch afWarnLog;
    private final AFf1sSDK init;
    private final AFe1xSDK onAppOpenAttributionNative;
    private boolean onAttributionFailureNative;
    private int onDeepLinkingNative;
    private final AFb1fSDK onInstallConversionDataLoadedNative;
    private final ExecutorService onInstallConversionFailureNative;
    private int onResponseErrorNative;
    private int onResponseNative;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.appsflyer.internal.AFb1pSDK$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] values;

        static {
            int[] iArr = new int[AFf1uSDK.AFa1ySDK.values().length];
            values = iArr;
            try {
                iArr[AFf1uSDK.AFa1ySDK.FINISHED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                values[AFf1uSDK.AFa1ySDK.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public AFb1pSDK(Context context, AFc1xSDK aFc1xSDK) {
        super(null, AFLogger$LogLevel, Boolean.FALSE, Boolean.TRUE, null, context);
        this.afErrorLogForExcManagerOnly = new ArrayList();
        this.afWarnLog = new CountDownLatch(1);
        this.AppsFlyer2dXConversionCallback = aFc1xSDK.afRDLog();
        this.onInstallConversionDataLoadedNative = aFc1xSDK.values();
        this.onAppOpenAttributionNative = aFc1xSDK.AFVersionDeclaration();
        this.init = aFc1xSDK.getLevel();
        this.onInstallConversionFailureNative = aFc1xSDK.AFInAppEventParameterName();
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x016a, code lost:
        return new com.appsflyer.deeplink.DeepLinkResult(null, null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ com.appsflyer.deeplink.DeepLinkResult AFKeystoreWrapper(com.appsflyer.internal.AFb1pSDK r12, android.content.Context r13) throws java.io.IOException, org.json.JSONException, java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1pSDK.AFKeystoreWrapper(com.appsflyer.internal.AFb1pSDK, android.content.Context):com.appsflyer.deeplink.DeepLinkResult");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void AFLogger$LogLevel() {
        String[] strArr;
        boolean z = true;
        this.onResponseErrorNative++;
        StringBuilder sb = new StringBuilder("[DDL] Preparing request ");
        sb.append(this.onResponseErrorNative);
        AFLogger.afDebugLog(sb.toString());
        if (this.onResponseErrorNative == 1) {
            AFb1zSDK AFInAppEventType = AFb1zSDK.AFInAppEventType();
            Map<String, Object> map = this.valueOf;
            if (this.onInstallConversionDataLoadedNative.values.AFInAppEventType("appsFlyerCount", 0) != 0) {
                z = false;
            }
            map.put("is_first", Boolean.valueOf(z));
            Map<String, Object> map2 = this.valueOf;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Locale.getDefault().getLanguage());
            sb2.append("-");
            sb2.append(Locale.getDefault().getCountry());
            map2.put("lang", sb2.toString());
            this.valueOf.put("os", Build.VERSION.RELEASE);
            this.valueOf.put(MessageAttributes.TYPE, Build.MODEL);
            this.valueOf.put("request_id", AFb1xSDK.AFInAppEventParameterName(new WeakReference(this.onInstallConversionDataLoadedNative.valueOf.values)));
            AFa1fSDK aFa1fSDK = AFInAppEventType.afRDLog;
            if (aFa1fSDK != null && (strArr = aFa1fSDK.valueOf) != null) {
                this.valueOf.put("sharing_filter", strArr);
            }
            Map<String, Object> AFInAppEventParameterName = AFInAppEventParameterName(AFa1bSDK.AFKeystoreWrapper(this.onInstallConversionDataLoadedNative.valueOf.values, new HashMap()));
            Map<String, Object> AFInAppEventParameterName2 = AFInAppEventParameterName(AFa1bSDK.values(this.onInstallConversionDataLoadedNative.valueOf.values));
            if (AFInAppEventParameterName != null) {
                this.valueOf.put("gaid", AFInAppEventParameterName);
            }
            if (AFInAppEventParameterName2 != null) {
                this.valueOf.put("oaid", AFInAppEventParameterName2);
            }
        }
        Map<String, Object> map3 = this.valueOf;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS", Locale.US);
        long currentTimeMillis = System.currentTimeMillis();
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        map3.put("timestamp", simpleDateFormat.format(new Date(currentTimeMillis)));
        this.valueOf.put("request_count", Integer.valueOf(this.onResponseErrorNative));
        ArrayList arrayList = new ArrayList();
        for (AFf1uSDK aFf1uSDK : this.afErrorLogForExcManagerOnly) {
            Map<String, String> values = values(aFf1uSDK);
            if (values != null) {
                arrayList.add(values);
            }
        }
        if (!arrayList.isEmpty()) {
            this.valueOf.put("referrers", arrayList);
        }
        AFInAppEventType(onAppOpenAttributionNative());
    }

    private boolean getLevel() {
        int i;
        List list = (List) this.valueOf.get("referrers");
        if (list != null) {
            i = list.size();
        } else {
            i = 0;
        }
        if (i >= this.onDeepLinkingNative || this.valueOf.containsKey("referrers")) {
            return false;
        }
        return true;
    }

    @VisibleForTesting
    private String onAppOpenAttributionNative() {
        String str;
        String str2 = this.onAppOpenAttributionNative.AFInAppEventType;
        String packageName = this.onInstallConversionDataLoadedNative.valueOf.values.getPackageName();
        String values = this.onInstallConversionDataLoadedNative.values();
        if (values != null && !values.trim().isEmpty()) {
            str = "-".concat(values);
        } else {
            str = "";
        }
        Uri.Builder buildUpon = Uri.parse(String.format(AFLogger$LogLevel, AppsFlyerLib.getInstance().getHostPrefix(), AFb1zSDK.AFInAppEventType().getHostName())).buildUpon();
        StringBuilder sb = new StringBuilder();
        sb.append(packageName);
        sb.append(str);
        Uri.Builder appendPath = buildUpon.appendPath(sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.valueOf.get("timestamp"));
        sb2.append(str2);
        return appendPath.appendQueryParameter("af_sig", AFa1aSDK.values(sb2.toString(), str2)).appendQueryParameter(HianalyticsBaseData.SDK_VERSION, AFb1zSDK.AFKeystoreWrapper).build().toString();
    }

    private static boolean valueOf(AFf1uSDK aFf1uSDK) {
        Long l = (Long) aFf1uSDK.values.get("click_ts");
        return l != null && System.currentTimeMillis() - TimeUnit.SECONDS.toMillis(l.longValue()) < TimeUnit.DAYS.toMillis(1L);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.appsflyer.deeplink.DeepLinkResult AFLogger() {
        /*
            r5 = this;
            java.lang.String r0 = "[DDL] start"
            com.appsflyer.AFLogger.afDebugLog(r0)
            java.util.concurrent.FutureTask r0 = new java.util.concurrent.FutureTask
            com.appsflyer.internal.AFb1pSDK$4 r1 = new com.appsflyer.internal.AFb1pSDK$4
            r1.<init>()
            r0.<init>(r1)
            java.util.concurrent.ExecutorService r1 = r5.onInstallConversionFailureNative
            r1.execute(r0)
            r1 = 0
            long r2 = com.appsflyer.internal.AFb1pSDK.getLevel     // Catch: java.util.concurrent.TimeoutException -> L2a java.lang.InterruptedException -> L2c java.util.concurrent.ExecutionException -> L2e
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.util.concurrent.TimeoutException -> L2a java.lang.InterruptedException -> L2c java.util.concurrent.ExecutionException -> L2e
            java.lang.Object r0 = r0.get(r2, r4)     // Catch: java.util.concurrent.TimeoutException -> L2a java.lang.InterruptedException -> L2c java.util.concurrent.ExecutionException -> L2e
            com.appsflyer.deeplink.DeepLinkResult r0 = (com.appsflyer.deeplink.DeepLinkResult) r0     // Catch: java.util.concurrent.TimeoutException -> L2a java.lang.InterruptedException -> L2c java.util.concurrent.ExecutionException -> L2e
            com.appsflyer.internal.AFe1nSDK r2 = r5.AppsFlyer2dXConversionCallback     // Catch: java.util.concurrent.TimeoutException -> L2a java.lang.InterruptedException -> L2c java.util.concurrent.ExecutionException -> L2e
            long r3 = com.appsflyer.internal.AFb1pSDK.getLevel     // Catch: java.util.concurrent.TimeoutException -> L2a java.lang.InterruptedException -> L2c java.util.concurrent.ExecutionException -> L2e
            r2.AFKeystoreWrapper(r0, r3)     // Catch: java.util.concurrent.TimeoutException -> L2a java.lang.InterruptedException -> L2c java.util.concurrent.ExecutionException -> L2e
            com.appsflyer.internal.AFb1oSDK.AFInAppEventParameterName(r0)     // Catch: java.util.concurrent.TimeoutException -> L2a java.lang.InterruptedException -> L2c java.util.concurrent.ExecutionException -> L2e
            return r0
        L2a:
            r0 = move-exception
            goto L30
        L2c:
            r0 = move-exception
            goto L69
        L2e:
            r0 = move-exception
            goto L69
        L30:
            java.lang.String r2 = "[DDL] Timeout"
            com.appsflyer.AFLogger.afErrorLogForExcManagerOnly(r2, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "[DDL] Timeout, didn't manage to find deferred deep link after "
            r0.<init>(r2)
            int r2 = r5.onResponseErrorNative
            r0.append(r2)
            java.lang.String r2 = " attempt(s) within "
            r0.append(r2)
            long r2 = com.appsflyer.internal.AFb1pSDK.getLevel
            r0.append(r2)
            java.lang.String r2 = " milliseconds"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.appsflyer.AFLogger.afDebugLog(r0)
            com.appsflyer.deeplink.DeepLinkResult r0 = new com.appsflyer.deeplink.DeepLinkResult
            com.appsflyer.deeplink.DeepLinkResult$Error r2 = com.appsflyer.deeplink.DeepLinkResult.Error.TIMEOUT
            r0.<init>(r1, r2)
            com.appsflyer.internal.AFe1nSDK r1 = r5.AppsFlyer2dXConversionCallback
            long r2 = com.appsflyer.internal.AFb1pSDK.getLevel
            r1.AFKeystoreWrapper(r0, r2)
            com.appsflyer.internal.AFb1oSDK.AFInAppEventParameterName(r0)
            goto L8c
        L69:
            java.lang.String r2 = "[DDL] Error occurred"
            r3 = 1
            com.appsflyer.AFLogger.afErrorLog(r2, r0, r3)
            com.appsflyer.deeplink.DeepLinkResult r2 = new com.appsflyer.deeplink.DeepLinkResult
            java.lang.Throwable r0 = r0.getCause()
            boolean r0 = r0 instanceof java.io.IOException
            if (r0 == 0) goto L7c
            com.appsflyer.deeplink.DeepLinkResult$Error r0 = com.appsflyer.deeplink.DeepLinkResult.Error.NETWORK
            goto L7e
        L7c:
            com.appsflyer.deeplink.DeepLinkResult$Error r0 = com.appsflyer.deeplink.DeepLinkResult.Error.UNEXPECTED
        L7e:
            r2.<init>(r1, r0)
            com.appsflyer.internal.AFe1nSDK r0 = r5.AppsFlyer2dXConversionCallback
            long r3 = com.appsflyer.internal.AFb1pSDK.getLevel
            r0.AFKeystoreWrapper(r2, r3)
            com.appsflyer.internal.AFb1oSDK.AFInAppEventParameterName(r2)
            r0 = r2
        L8c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1pSDK.AFLogger():com.appsflyer.deeplink.DeepLinkResult");
    }

    @Override // com.appsflyer.internal.AFa1sSDK
    public final AFd1wSDK values() {
        return AFd1wSDK.DLSDK;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void AFInAppEventParameterName(AFf1uSDK aFf1uSDK) {
        if (valueOf(aFf1uSDK)) {
            this.afErrorLogForExcManagerOnly.add(aFf1uSDK);
            this.afWarnLog.countDown();
            StringBuilder sb = new StringBuilder("[DDL] Added non-organic ");
            sb.append(aFf1uSDK.getClass().getSimpleName());
            AFLogger.afDebugLog(sb.toString());
            return;
        }
        int i = this.onResponseNative + 1;
        this.onResponseNative = i;
        if (i == this.onDeepLinkingNative) {
            this.afWarnLog.countDown();
        }
    }

    private static Map<String, String> values(AFf1uSDK aFf1uSDK) {
        if (aFf1uSDK.afDebugLog == AFf1uSDK.AFa1ySDK.FINISHED) {
            HashMap hashMap = new HashMap();
            String str = (String) aFf1uSDK.values.get("referrer");
            if (str != null) {
                hashMap.put(KustoStorage.KustoTable.COLUMN_SOURCE, (String) aFf1uSDK.values.get(KustoStorage.KustoTable.COLUMN_SOURCE));
                hashMap.put("value", str);
                return hashMap;
            }
            return null;
        }
        return null;
    }

    @Nullable
    private Map<String, Object> AFInAppEventParameterName(final AFc1vSDK.AFa1wSDK aFa1wSDK) {
        if (aFa1wSDK == null || aFa1wSDK.AFInAppEventType == null) {
            return null;
        }
        Boolean bool = aFa1wSDK.valueOf;
        if (bool == null || !bool.booleanValue()) {
            return new HashMap<String, Object>() { // from class: com.appsflyer.internal.AFb1pSDK.5
                {
                    put(MessageAttributes.TYPE, "unhashed");
                    put("value", aFa1wSDK.AFInAppEventType);
                }
            };
        }
        return null;
    }

    static /* synthetic */ void AFInAppEventParameterName(AFb1pSDK aFb1pSDK) {
        AFf1uSDK[] values;
        ArrayList<AFf1uSDK> arrayList = new ArrayList();
        for (AFf1uSDK aFf1uSDK : aFb1pSDK.init.values()) {
            if (aFf1uSDK != null && aFf1uSDK.afDebugLog != AFf1uSDK.AFa1ySDK.NOT_STARTED) {
                arrayList.add(aFf1uSDK);
            }
        }
        aFb1pSDK.onDeepLinkingNative = arrayList.size();
        for (final AFf1uSDK aFf1uSDK2 : arrayList) {
            int i = AnonymousClass1.values[aFf1uSDK2.afDebugLog.ordinal()];
            if (i == 1) {
                StringBuilder sb = new StringBuilder("[DDL] ");
                sb.append(aFf1uSDK2.values.get(KustoStorage.KustoTable.COLUMN_SOURCE));
                sb.append(" referrer collected earlier");
                AFLogger.afDebugLog(sb.toString());
                aFb1pSDK.AFInAppEventParameterName(aFf1uSDK2);
            } else if (i == 2) {
                aFf1uSDK2.addObserver(new Observer() { // from class: com.appsflyer.internal.AFb1pSDK.3
                    @Override // java.util.Observer
                    public final void update(Observable observable, Object obj) {
                        StringBuilder sb2 = new StringBuilder("[DDL] ");
                        sb2.append(aFf1uSDK2.values.get(KustoStorage.KustoTable.COLUMN_SOURCE));
                        sb2.append(" referrer collected via observer");
                        AFLogger.afDebugLog(sb2.toString());
                        AFb1pSDK.this.AFInAppEventParameterName((AFf1uSDK) observable);
                    }
                });
            }
        }
    }
}
