package com.appsflyer.internal;

import android.content.Context;
import android.net.Uri;
import android.support.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final class AFd1mSDK extends AFd1tSDK<Map<String, Object>> {
    private static final int afInfoLog = (int) TimeUnit.SECONDS.toMillis(2);
    private final Uri AFLogger;
    private final Context afDebugLog;
    private final Map<String, Object> afErrorLog;
    private Map<String, Object> afRDLog;
    private final List<String> afWarnLog;

    public AFd1mSDK(@NonNull Context context, @NonNull Map<String, Object> map, @NonNull Uri uri, @NonNull List<String> list) {
        super(AFd1wSDK.RESOLVE_ESP, new AFd1wSDK[]{AFd1wSDK.RC_CDN}, "ResolveEsp");
        this.afDebugLog = context;
        this.afErrorLog = map;
        this.AFLogger = uri;
        this.afWarnLog = list;
    }

    private boolean AFKeystoreWrapper(String str) {
        if (str.contains("af_tranid=")) {
            return false;
        }
        StringBuilder sb = new StringBuilder("Validate if link ");
        sb.append(str);
        sb.append(" belongs to ESP domains: ");
        sb.append(this.afWarnLog);
        AFLogger.afRDLog(sb.toString());
        try {
            return this.afWarnLog.contains(new URL(str).getHost());
        } catch (MalformedURLException e) {
            AFLogger.afErrorLogForExcManagerOnly("MalformedURLException ESP link", e);
            return false;
        }
    }

    @Override // com.appsflyer.internal.AFd1tSDK
    @NonNull
    public final AFc1aSDK AFInAppEventParameterName() throws Exception {
        String str;
        int i;
        Uri uri;
        if (!AFKeystoreWrapper(this.AFLogger.toString())) {
            AFb1zSDK.AFInAppEventType().valueOf(this.afDebugLog, this.afErrorLog, this.AFLogger);
            return AFc1aSDK.SUCCESS;
        }
        long currentTimeMillis = System.currentTimeMillis();
        String obj = this.AFLogger.toString();
        ArrayList arrayList = new ArrayList();
        Integer num = null;
        String str2 = null;
        int i2 = 0;
        while (i2 < 5) {
            Map<String, Object> valueOf = valueOf(Uri.parse(obj));
            String str3 = (String) valueOf.get("res");
            Integer num2 = (Integer) valueOf.get("status");
            String str4 = (String) valueOf.get("error");
            if (str3 != null && AFKeystoreWrapper(str3)) {
                if (i2 < 4) {
                    arrayList.add(str3);
                }
                i2++;
                str2 = str4;
                obj = str3;
                num = num2;
            } else {
                str2 = str4;
                obj = str3;
                num = num2;
                break;
            }
        }
        HashMap hashMap = new HashMap();
        if (obj != null) {
            str = obj;
        } else {
            str = "";
        }
        hashMap.put("res", str);
        if (num != null) {
            i = num.intValue();
        } else {
            i = -1;
        }
        hashMap.put("status", Integer.valueOf(i));
        if (str2 != null) {
            hashMap.put("error", str2);
        }
        if (!arrayList.isEmpty()) {
            hashMap.put("redirects", arrayList);
        }
        hashMap.put("latency", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        synchronized (this.afErrorLog) {
            this.afErrorLog.put("af_deeplink_r", hashMap);
            this.afErrorLog.put("af_deeplink", this.AFLogger.toString());
        }
        AFb1zSDK AFInAppEventType = AFb1zSDK.AFInAppEventType();
        Context context = this.afDebugLog;
        Map<String, Object> map = this.afErrorLog;
        if (obj != null) {
            uri = Uri.parse(obj);
        } else {
            uri = this.AFLogger;
        }
        AFInAppEventType.valueOf(context, map, uri);
        this.afRDLog = hashMap;
        return AFc1aSDK.SUCCESS;
    }

    @Override // com.appsflyer.internal.AFd1tSDK
    public final long AFInAppEventType() {
        return 60000L;
    }

    @Override // com.appsflyer.internal.AFd1tSDK
    public final boolean valueOf() {
        return false;
    }

    private static Map<String, Object> valueOf(Uri uri) {
        HashMap hashMap = new HashMap();
        try {
            StringBuilder sb = new StringBuilder("ESP deeplink resolving is started: ");
            sb.append(uri.toString());
            AFLogger.afDebugLog(sb.toString());
            HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(uri.toString()).openConnection()));
            httpURLConnection.setInstanceFollowRedirects(false);
            int i = afInfoLog;
            httpURLConnection.setReadTimeout(i);
            httpURLConnection.setConnectTimeout(i);
            httpURLConnection.setRequestProperty("User-agent", "Dalvik/2.1.0 (Linux; U; Android 6.0.1; Nexus 5 Build/M4B30Z)");
            httpURLConnection.setRequestProperty("af-esp", "6.10.0");
            int responseCode = httpURLConnection.getResponseCode();
            hashMap.put("status", Integer.valueOf(responseCode));
            if (300 <= responseCode && responseCode <= 305) {
                hashMap.put("res", httpURLConnection.getHeaderField("Location"));
            }
            httpURLConnection.disconnect();
            AFLogger.afDebugLog("ESP deeplink resolving is finished");
        } catch (Throwable th) {
            hashMap.put("error", th.getLocalizedMessage());
            AFLogger.afErrorLog(th.getMessage(), th);
        }
        return hashMap;
    }
}
