package com.appsflyer.internal;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public final class AFe1sSDK extends AFd1kSDK<Map<String, Object>> {
    private static final List<String> AFLogger = Arrays.asList("googleplay", "playstore", "googleplaystore");
    private final AFc1pSDK AFLogger$LogLevel;
    private final AFe1nSDK AFVersionDeclaration;
    private final AFb1gSDK afErrorLogForExcManagerOnly;
    @Nullable
    private Map<String, Object> afWarnLog;
    private final AFb1fSDK getLevel;
    @Nullable
    private String onAppOpenAttributionNative;

    public AFe1sSDK(@NonNull AFc1xSDK aFc1xSDK) {
        super(AFd1wSDK.GCDSDK, new AFd1wSDK[]{AFd1wSDK.RC_CDN}, aFc1xSDK, "GCD-FETCH");
        this.AFLogger$LogLevel = aFc1xSDK.AFKeystoreWrapper();
        this.afErrorLogForExcManagerOnly = aFc1xSDK.afErrorLog();
        this.AFVersionDeclaration = aFc1xSDK.afRDLog();
        this.getLevel = aFc1xSDK.values();
        this.AFInAppEventParameterName.add(AFd1wSDK.CONVERSION);
        this.AFInAppEventParameterName.add(AFd1wSDK.LAUNCH);
    }

    @Override // com.appsflyer.internal.AFd1kSDK
    public final AFc1oSDK<Map<String, Object>> AFInAppEventParameterName(@NonNull String str) {
        String str2;
        String AFKeystoreWrapper = AFb1zSDK.AFKeystoreWrapper(this.afErrorLogForExcManagerOnly, this.getLevel.values());
        if (AFKeystoreWrapper != null && !AFKeystoreWrapper.trim().isEmpty()) {
            if (!AFLogger.contains(AFKeystoreWrapper.toLowerCase())) {
                str2 = "-".concat(AFKeystoreWrapper);
                AFc1oSDK<Map<String, Object>> valueOf = this.AFLogger$LogLevel.valueOf(str2, str);
                StringBuilder sb = new StringBuilder("[GCD-B01] URL: ");
                sb.append(valueOf.AFKeystoreWrapper.values());
                AFc1sSDK.valueOf(sb.toString());
                return valueOf;
            }
            AFLogger.afWarnLog(String.format("[GCD] AF detected using redundant Google-Play channel for attribution - %s. Using without channel postfix.", AFKeystoreWrapper));
        }
        str2 = "";
        AFc1oSDK<Map<String, Object>> valueOf2 = this.AFLogger$LogLevel.valueOf(str2, str);
        StringBuilder sb2 = new StringBuilder("[GCD-B01] URL: ");
        sb2.append(valueOf2.AFKeystoreWrapper.values());
        AFc1sSDK.valueOf(sb2.toString());
        return valueOf2;
    }

    @Override // com.appsflyer.internal.AFd1kSDK, com.appsflyer.internal.AFd1tSDK
    public final void AFKeystoreWrapper() {
        super.AFKeystoreWrapper();
        Map<String, Object> map = this.afWarnLog;
        String str = this.onAppOpenAttributionNative;
        if (map != null) {
            AFe1tSDK.AFInAppEventParameterName(map);
        } else if (str != null && !str.isEmpty()) {
            AFe1tSDK.AFInAppEventType(str);
        } else {
            AFe1tSDK.AFInAppEventType("Unknown error");
        }
    }

    @Override // com.appsflyer.internal.AFd1kSDK
    public final boolean AFLogger() {
        return false;
    }

    @Override // com.appsflyer.internal.AFd1kSDK
    @Nullable
    public final AppsFlyerRequestListener afErrorLog() {
        return null;
    }

    @Override // com.appsflyer.internal.AFd1kSDK, com.appsflyer.internal.AFd1tSDK
    public final boolean valueOf() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0086 A[Catch: all -> 0x0069, Exception -> 0x006c, AFd1uSDK -> 0x006f, TryCatch #3 {AFd1uSDK -> 0x006f, Exception -> 0x006c, blocks: (B:12:0x0025, B:15:0x002f, B:22:0x003f, B:30:0x0052, B:39:0x0072, B:41:0x0086, B:43:0x00a0, B:45:0x00a6, B:46:0x00b1, B:48:0x00b7, B:50:0x00bd, B:51:0x00d3, B:52:0x00e4, B:54:0x0103, B:55:0x0108), top: B:70:0x0025, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b7 A[Catch: all -> 0x0069, Exception -> 0x006c, AFd1uSDK -> 0x006f, TryCatch #3 {AFd1uSDK -> 0x006f, Exception -> 0x006c, blocks: (B:12:0x0025, B:15:0x002f, B:22:0x003f, B:30:0x0052, B:39:0x0072, B:41:0x0086, B:43:0x00a0, B:45:0x00a6, B:46:0x00b1, B:48:0x00b7, B:50:0x00bd, B:51:0x00d3, B:52:0x00e4, B:54:0x0103, B:55:0x0108), top: B:70:0x0025, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0103 A[Catch: all -> 0x0069, Exception -> 0x006c, AFd1uSDK -> 0x006f, TryCatch #3 {AFd1uSDK -> 0x006f, Exception -> 0x006c, blocks: (B:12:0x0025, B:15:0x002f, B:22:0x003f, B:30:0x0052, B:39:0x0072, B:41:0x0086, B:43:0x00a0, B:45:0x00a6, B:46:0x00b1, B:48:0x00b7, B:50:0x00bd, B:51:0x00d3, B:52:0x00e4, B:54:0x0103, B:55:0x0108), top: B:70:0x0025, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0052 A[SYNTHETIC] */
    @Override // com.appsflyer.internal.AFd1kSDK, com.appsflyer.internal.AFd1tSDK
    @android.support.annotation.NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.appsflyer.internal.AFc1aSDK AFInAppEventParameterName() throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 351
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFe1sSDK.AFInAppEventParameterName():com.appsflyer.internal.AFc1aSDK");
    }
}
