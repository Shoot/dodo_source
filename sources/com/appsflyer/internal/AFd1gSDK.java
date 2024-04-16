package com.appsflyer.internal;

import android.support.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
/* loaded from: classes.dex */
public final class AFd1gSDK extends AFd1eSDK {
    private static char AFVersionDeclaration = 28758;
    private static int AppsFlyer2dXConversionCallback = 0;
    private static char afWarnLog = 45353;
    private static char init = 34378;
    private static int onAppOpenAttributionNative = 1;
    private static char onInstallConversionDataLoadedNative = 62777;
    private final String afErrorLogForExcManagerOnly;
    private final AFc1ySDK getLevel;

    public AFd1gSDK(@NonNull String str, @NonNull AFc1xSDK aFc1xSDK) {
        super(new AFe1rSDK(aFc1xSDK.afErrorLogForExcManagerOnly().values), aFc1xSDK, str);
        this.getLevel = aFc1xSDK.afErrorLogForExcManagerOnly();
        this.afErrorLogForExcManagerOnly = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r12 = r12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void AFInAppEventType(java.lang.String r12, int r13, java.lang.Object[] r14) {
        /*
            if (r12 == 0) goto L6
            char[] r12 = r12.toCharArray()
        L6:
            char[] r12 = (char[]) r12
            java.lang.Object r0 = com.appsflyer.internal.AFf1dSDK.values
            monitor-enter(r0)
            int r1 = r12.length     // Catch: java.lang.Throwable -> L5b
            char[] r1 = new char[r1]     // Catch: java.lang.Throwable -> L5b
            r2 = 0
            com.appsflyer.internal.AFf1dSDK.AFKeystoreWrapper = r2     // Catch: java.lang.Throwable -> L5b
            r3 = 2
            char[] r3 = new char[r3]     // Catch: java.lang.Throwable -> L5b
        L14:
            int r4 = com.appsflyer.internal.AFf1dSDK.AFKeystoreWrapper     // Catch: java.lang.Throwable -> L5b
            int r5 = r12.length     // Catch: java.lang.Throwable -> L5b
            if (r4 >= r5) goto L6e
            char r5 = r12[r4]     // Catch: java.lang.Throwable -> L5b
            r3[r2] = r5     // Catch: java.lang.Throwable -> L5b
            int r4 = r4 + 1
            char r4 = r12[r4]     // Catch: java.lang.Throwable -> L5b
            r5 = 1
            r3[r5] = r4     // Catch: java.lang.Throwable -> L5b
            r4 = 58224(0xe370, float:8.1589E-41)
            r6 = 0
        L28:
            r7 = 16
            if (r6 >= r7) goto L5d
            char r7 = r3[r5]     // Catch: java.lang.Throwable -> L5b
            char r8 = r3[r2]     // Catch: java.lang.Throwable -> L5b
            int r9 = r8 + r4
            int r10 = r8 << 4
            char r11 = com.appsflyer.internal.AFd1gSDK.onInstallConversionDataLoadedNative     // Catch: java.lang.Throwable -> L5b
            int r10 = r10 + r11
            r9 = r9 ^ r10
            int r10 = r8 >>> 5
            char r11 = com.appsflyer.internal.AFd1gSDK.init     // Catch: java.lang.Throwable -> L5b
            int r10 = r10 + r11
            r9 = r9 ^ r10
            int r7 = r7 - r9
            char r7 = (char) r7     // Catch: java.lang.Throwable -> L5b
            r3[r5] = r7     // Catch: java.lang.Throwable -> L5b
            int r9 = r7 + r4
            int r10 = r7 << 4
            char r11 = com.appsflyer.internal.AFd1gSDK.afWarnLog     // Catch: java.lang.Throwable -> L5b
            int r10 = r10 + r11
            r9 = r9 ^ r10
            int r7 = r7 >>> 5
            char r10 = com.appsflyer.internal.AFd1gSDK.AFVersionDeclaration     // Catch: java.lang.Throwable -> L5b
            int r7 = r7 + r10
            r7 = r7 ^ r9
            int r8 = r8 - r7
            char r7 = (char) r8     // Catch: java.lang.Throwable -> L5b
            r3[r2] = r7     // Catch: java.lang.Throwable -> L5b
            r7 = 40503(0x9e37, float:5.6757E-41)
            int r4 = r4 - r7
            int r6 = r6 + 1
            goto L28
        L5b:
            r12 = move-exception
            goto L77
        L5d:
            int r4 = com.appsflyer.internal.AFf1dSDK.AFKeystoreWrapper     // Catch: java.lang.Throwable -> L5b
            char r6 = r3[r2]     // Catch: java.lang.Throwable -> L5b
            r1[r4] = r6     // Catch: java.lang.Throwable -> L5b
            int r6 = r4 + 1
            char r5 = r3[r5]     // Catch: java.lang.Throwable -> L5b
            r1[r6] = r5     // Catch: java.lang.Throwable -> L5b
            int r4 = r4 + 2
            com.appsflyer.internal.AFf1dSDK.AFKeystoreWrapper = r4     // Catch: java.lang.Throwable -> L5b
            goto L14
        L6e:
            java.lang.String r12 = new java.lang.String     // Catch: java.lang.Throwable -> L5b
            r12.<init>(r1, r2, r13)     // Catch: java.lang.Throwable -> L5b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5b
            r14[r2] = r12
            return
        L77:
            monitor-exit(r0)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFd1gSDK.AFInAppEventType(java.lang.String, int, java.lang.Object[]):void");
    }

    private void AFLogger$LogLevel() {
        int i = AppsFlyer2dXConversionCallback + 39;
        onAppOpenAttributionNative = i % 128;
        int i2 = i % 2;
        this.AFLogger$LogLevel.valueOf("sentRegisterRequestToAF", true);
        AFLogger.afDebugLog("[register] Successfully registered for Uninstall Tracking");
        int i3 = AppsFlyer2dXConversionCallback + 25;
        onAppOpenAttributionNative = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // com.appsflyer.internal.AFd1kSDK, com.appsflyer.internal.AFd1tSDK
    public final void AFKeystoreWrapper() {
        int i = AppsFlyer2dXConversionCallback + 123;
        onAppOpenAttributionNative = i % 128;
        if (i % 2 != 0) {
            super.AFKeystoreWrapper();
            ResponseNetwork responseNetwork = ((AFd1kSDK) this).afDebugLog;
            if (responseNetwork != null && responseNetwork.isSuccessful()) {
                AFLogger$LogLevel();
            }
            int i2 = AppsFlyer2dXConversionCallback + 65;
            onAppOpenAttributionNative = i2 % 128;
            int i3 = i2 % 2;
            return;
        }
        super.AFKeystoreWrapper();
        throw null;
    }

    @Override // com.appsflyer.internal.AFd1eSDK, com.appsflyer.internal.AFd1kSDK
    protected final boolean AFLogger() {
        int i = AppsFlyer2dXConversionCallback;
        int i2 = i + 85;
        onAppOpenAttributionNative = i2 % 128;
        int i3 = i2 % 2;
        int i4 = i + 17;
        onAppOpenAttributionNative = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
        if (r2.values() != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
        r3 = r0.getPackageManager();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003a, code lost:
        r5 = r3.getPackageInfo(r0.getPackageName(), 0);
        r10.valueOf("app_version_code", java.lang.Integer.toString(r5.versionCode));
        r10.valueOf("app_version_name", r5.versionName);
        r10.valueOf("app_name", r3.getApplicationLabel(r5.applicationInfo).toString());
        r10.valueOf("installDate", com.appsflyer.internal.AFb1zSDK.AFKeystoreWrapper(new java.text.SimpleDateFormat("yyyy-MM-dd_HHmmssZ", java.util.Locale.US), r5.firstInstallTime));
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0074, code lost:
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0075, code lost:
        com.appsflyer.AFLogger.afErrorLog("Exception while collecting application version info.", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0153, code lost:
        com.appsflyer.AFLogger.afInfoLog("CustomerUserId not set, Tracking is disabled", true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x015f, code lost:
        throw new java.lang.IllegalStateException("CustomerUserId not set, register is not sent");
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0167, code lost:
        throw new java.lang.IllegalStateException("Context is not provided, can't send register request");
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001b, code lost:
        if (r0 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0029, code lost:
        if (r0 != null) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    @Override // com.appsflyer.internal.AFd1eSDK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void values(com.appsflyer.internal.AFa1sSDK r10) {
        /*
            Method dump skipped, instructions count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFd1gSDK.values(com.appsflyer.internal.AFa1sSDK):void");
    }
}
