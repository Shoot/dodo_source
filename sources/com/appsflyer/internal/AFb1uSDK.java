package com.appsflyer.internal;

import android.content.pm.PackageManager;
import android.os.Build;
import android.support.annotation.NonNull;
import android.view.ViewConfiguration;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFd1xSDK;
import com.huawei.hms.framework.common.hianalytics.HianalyticsBaseData;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class AFb1uSDK {
    private static int AFLogger$LogLevel = 1;
    private static boolean afWarnLog = true;
    private static int getLevel;
    private static AFb1uSDK valueOf;
    private static char[] afRDLog = {127, 143, '~', 139, 129};
    private static boolean AFVersionDeclaration = true;
    private static int afErrorLogForExcManagerOnly = 29;
    private final String values = "yyyy-MM-dd HH:mm:ssZ";
    private List<String> AFKeystoreWrapper = new ArrayList();
    private boolean AFInAppEventParameterName = true;
    @NonNull
    private final Map<String, Object> AFInAppEventType = new HashMap();
    private String AFLogger = "-1";
    private boolean afInfoLog = true ^ AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DPM, false);
    private int afDebugLog = 0;
    private boolean afErrorLog = false;

    private AFb1uSDK() {
    }

    @Deprecated
    public static AFb1uSDK AFInAppEventType() {
        int i = getLevel + 15;
        AFLogger$LogLevel = i % 128;
        int i2 = i % 2;
        if (valueOf == null) {
            valueOf = new AFb1uSDK();
        }
        AFb1uSDK aFb1uSDK = valueOf;
        int i3 = getLevel + 69;
        AFLogger$LogLevel = i3 % 128;
        if (i3 % 2 != 0) {
            return aFb1uSDK;
        }
        throw null;
    }

    private boolean AFLogger() {
        int i = getLevel + 71;
        int i2 = i % 128;
        AFLogger$LogLevel = i2;
        int i3 = i % 2;
        if (this.afInfoLog) {
            int i4 = i2 + 97;
            getLevel = i4 % 128;
            int i5 = i4 % 2;
            if (!this.AFInAppEventParameterName) {
                int i6 = i2 + 119;
                getLevel = i6 % 128;
                int i7 = i6 % 2;
                if (this.afErrorLog) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    @NonNull
    private synchronized Map<String, Object> afErrorLog() {
        int i = AFLogger$LogLevel + 61;
        getLevel = i % 128;
        int i2 = i % 2;
        this.AFInAppEventType.put("data", this.AFKeystoreWrapper);
        afInfoLog();
        Map<String, Object> map = this.AFInAppEventType;
        int i3 = getLevel + 99;
        AFLogger$LogLevel = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 30 / 0;
            return map;
        }
        return map;
    }

    private synchronized void afInfoLog() {
        this.AFKeystoreWrapper = new ArrayList();
        this.afDebugLog = 0;
        int i = AFLogger$LogLevel + 1;
        getLevel = i % 128;
        if (i % 2 != 0) {
            int i2 = 61 / 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void AFInAppEventParameterName() {
        values("r_debugging_off", new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ", Locale.ENGLISH).format(Long.valueOf(System.currentTimeMillis())), new String[0]);
        this.afErrorLog = false;
        this.AFInAppEventParameterName = false;
        int i = getLevel + 47;
        AFLogger$LogLevel = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void AFKeystoreWrapper() {
        int i = AFLogger$LogLevel + 55;
        getLevel = i % 128;
        int i2 = i % 2;
        this.AFInAppEventType.clear();
        valueOf = null;
        int i3 = AFLogger$LogLevel + 115;
        getLevel = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean afDebugLog() {
        int i = getLevel + 101;
        AFLogger$LogLevel = i % 128;
        if (i % 2 != 0) {
            return this.afErrorLog;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void afRDLog() {
        int i = AFLogger$LogLevel;
        int i2 = i + 93;
        getLevel = i2 % 128;
        int i3 = i2 % 2;
        this.afInfoLog = false;
        int i4 = i + 43;
        getLevel = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void valueOf() {
        this.afErrorLog = true;
        values("r_debugging_on", new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ", Locale.ENGLISH).format(Long.valueOf(System.currentTimeMillis())), new String[0]);
        int i = getLevel + 7;
        AFLogger$LogLevel = i % 128;
        int i2 = i % 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void values(String str) {
        int i = getLevel + 77;
        int i2 = i % 128;
        AFLogger$LogLevel = i2;
        int i3 = i % 2;
        this.AFLogger = str;
        int i4 = i2 + 81;
        getLevel = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void valueOf(String str, PackageManager packageManager, AFc1xSDK aFc1xSDK) {
        try {
            valueOf(str, packageManager, aFc1xSDK.AFVersionDeclaration());
            AFd1bSDK aFd1bSDK = new AFd1bSDK(afErrorLog(), aFc1xSDK);
            AFd1xSDK afDebugLog = aFc1xSDK.afDebugLog();
            afDebugLog.AFKeystoreWrapper.execute(new AFd1xSDK.AnonymousClass2(aFd1bSDK));
            int i = AFLogger$LogLevel + 53;
            getLevel = i % 128;
            int i2 = i % 2;
        } catch (Throwable th) {
            AFLogger.afErrorLogForExcManagerOnly("could not send proxy data", th);
        }
    }

    public final void values(Throwable th) {
        String message;
        int i = AFLogger$LogLevel + 37;
        getLevel = i % 128;
        int i2 = i % 2;
        Throwable cause = th.getCause();
        String simpleName = th.getClass().getSimpleName();
        if (cause == null) {
            int i3 = getLevel + 59;
            AFLogger$LogLevel = i3 % 128;
            int i4 = i3 % 2;
            message = th.getMessage();
        } else {
            message = cause.getMessage();
        }
        values("exception", simpleName, valueOf(message, cause == null ? th.getStackTrace() : cause.getStackTrace()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r7 = r7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void AFInAppEventParameterName(java.lang.String r6, java.lang.String r7, int[] r8, int r9, java.lang.Object[] r10) {
        /*
            if (r7 == 0) goto L8
            java.lang.String r0 = "ISO-8859-1"
            byte[] r7 = r7.getBytes(r0)
        L8:
            byte[] r7 = (byte[]) r7
            if (r6 == 0) goto L10
            char[] r6 = r6.toCharArray()
        L10:
            char[] r6 = (char[]) r6
            java.lang.Object r0 = com.appsflyer.internal.AFf1eSDK.AFInAppEventParameterName
            monitor-enter(r0)
            char[] r1 = com.appsflyer.internal.AFb1uSDK.afRDLog     // Catch: java.lang.Throwable -> L42
            int r2 = com.appsflyer.internal.AFb1uSDK.afErrorLogForExcManagerOnly     // Catch: java.lang.Throwable -> L42
            boolean r3 = com.appsflyer.internal.AFb1uSDK.AFVersionDeclaration     // Catch: java.lang.Throwable -> L42
            r4 = 0
            if (r3 == 0) goto L4d
            int r6 = r7.length     // Catch: java.lang.Throwable -> L42
            com.appsflyer.internal.AFf1eSDK.values = r6     // Catch: java.lang.Throwable -> L42
            char[] r6 = new char[r6]     // Catch: java.lang.Throwable -> L42
            com.appsflyer.internal.AFf1eSDK.AFKeystoreWrapper = r4     // Catch: java.lang.Throwable -> L42
        L25:
            int r8 = com.appsflyer.internal.AFf1eSDK.AFKeystoreWrapper     // Catch: java.lang.Throwable -> L42
            int r3 = com.appsflyer.internal.AFf1eSDK.values     // Catch: java.lang.Throwable -> L42
            if (r8 >= r3) goto L44
            int r8 = com.appsflyer.internal.AFf1eSDK.AFKeystoreWrapper     // Catch: java.lang.Throwable -> L42
            int r3 = com.appsflyer.internal.AFf1eSDK.values     // Catch: java.lang.Throwable -> L42
            int r3 = r3 + (-1)
            int r5 = com.appsflyer.internal.AFf1eSDK.AFKeystoreWrapper     // Catch: java.lang.Throwable -> L42
            int r3 = r3 - r5
            r3 = r7[r3]     // Catch: java.lang.Throwable -> L42
            int r3 = r3 + r9
            char r3 = r1[r3]     // Catch: java.lang.Throwable -> L42
            int r3 = r3 - r2
            char r3 = (char) r3     // Catch: java.lang.Throwable -> L42
            r6[r8] = r3     // Catch: java.lang.Throwable -> L42
            int r5 = r5 + 1
            com.appsflyer.internal.AFf1eSDK.AFKeystoreWrapper = r5     // Catch: java.lang.Throwable -> L42
            goto L25
        L42:
            r6 = move-exception
            goto Lab
        L44:
            java.lang.String r7 = new java.lang.String     // Catch: java.lang.Throwable -> L42
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L42
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L42
            r10[r4] = r7
            return
        L4d:
            boolean r7 = com.appsflyer.internal.AFb1uSDK.afWarnLog     // Catch: java.lang.Throwable -> L42
            if (r7 == 0) goto L7e
            int r7 = r6.length     // Catch: java.lang.Throwable -> L42
            com.appsflyer.internal.AFf1eSDK.values = r7     // Catch: java.lang.Throwable -> L42
            char[] r7 = new char[r7]     // Catch: java.lang.Throwable -> L42
            com.appsflyer.internal.AFf1eSDK.AFKeystoreWrapper = r4     // Catch: java.lang.Throwable -> L42
        L58:
            int r8 = com.appsflyer.internal.AFf1eSDK.AFKeystoreWrapper     // Catch: java.lang.Throwable -> L42
            int r3 = com.appsflyer.internal.AFf1eSDK.values     // Catch: java.lang.Throwable -> L42
            if (r8 >= r3) goto L75
            int r8 = com.appsflyer.internal.AFf1eSDK.AFKeystoreWrapper     // Catch: java.lang.Throwable -> L42
            int r3 = com.appsflyer.internal.AFf1eSDK.values     // Catch: java.lang.Throwable -> L42
            int r3 = r3 + (-1)
            int r5 = com.appsflyer.internal.AFf1eSDK.AFKeystoreWrapper     // Catch: java.lang.Throwable -> L42
            int r3 = r3 - r5
            char r3 = r6[r3]     // Catch: java.lang.Throwable -> L42
            int r3 = r3 - r9
            char r3 = r1[r3]     // Catch: java.lang.Throwable -> L42
            int r3 = r3 - r2
            char r3 = (char) r3     // Catch: java.lang.Throwable -> L42
            r7[r8] = r3     // Catch: java.lang.Throwable -> L42
            int r5 = r5 + 1
            com.appsflyer.internal.AFf1eSDK.AFKeystoreWrapper = r5     // Catch: java.lang.Throwable -> L42
            goto L58
        L75:
            java.lang.String r6 = new java.lang.String     // Catch: java.lang.Throwable -> L42
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L42
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L42
            r10[r4] = r6
            return
        L7e:
            int r6 = r8.length     // Catch: java.lang.Throwable -> L42
            com.appsflyer.internal.AFf1eSDK.values = r6     // Catch: java.lang.Throwable -> L42
            char[] r6 = new char[r6]     // Catch: java.lang.Throwable -> L42
            com.appsflyer.internal.AFf1eSDK.AFKeystoreWrapper = r4     // Catch: java.lang.Throwable -> L42
        L85:
            int r7 = com.appsflyer.internal.AFf1eSDK.AFKeystoreWrapper     // Catch: java.lang.Throwable -> L42
            int r3 = com.appsflyer.internal.AFf1eSDK.values     // Catch: java.lang.Throwable -> L42
            if (r7 >= r3) goto La2
            int r7 = com.appsflyer.internal.AFf1eSDK.AFKeystoreWrapper     // Catch: java.lang.Throwable -> L42
            int r3 = com.appsflyer.internal.AFf1eSDK.values     // Catch: java.lang.Throwable -> L42
            int r3 = r3 + (-1)
            int r5 = com.appsflyer.internal.AFf1eSDK.AFKeystoreWrapper     // Catch: java.lang.Throwable -> L42
            int r3 = r3 - r5
            r3 = r8[r3]     // Catch: java.lang.Throwable -> L42
            int r3 = r3 - r9
            char r3 = r1[r3]     // Catch: java.lang.Throwable -> L42
            int r3 = r3 - r2
            char r3 = (char) r3     // Catch: java.lang.Throwable -> L42
            r6[r7] = r3     // Catch: java.lang.Throwable -> L42
            int r5 = r5 + 1
            com.appsflyer.internal.AFf1eSDK.AFKeystoreWrapper = r5     // Catch: java.lang.Throwable -> L42
            goto L85
        La2:
            java.lang.String r7 = new java.lang.String     // Catch: java.lang.Throwable -> L42
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L42
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L42
            r10[r4] = r7
            return
        Lab:
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1uSDK.AFInAppEventParameterName(java.lang.String, java.lang.String, int[], int, java.lang.Object[]):void");
    }

    private synchronized void AFKeystoreWrapper(String str, String str2, String str3) {
        try {
            Map<String, Object> map = this.AFInAppEventType;
            Object[] objArr = new Object[1];
            AFInAppEventParameterName(null, "\u0085\u0084\u0083\u0082\u0081", null, (ViewConfiguration.getPressedStateDuration() >> 16) + 127, objArr);
            map.put(((String) objArr[0]).intern(), Build.BRAND);
            this.AFInAppEventType.put("model", Build.MODEL);
            this.AFInAppEventType.put("platform", "Android");
            this.AFInAppEventType.put("platform_version", Build.VERSION.RELEASE);
            if (str != null) {
                int i = AFLogger$LogLevel + 109;
                getLevel = i % 128;
                int i2 = i % 2;
                if (str.length() > 0) {
                    int i3 = AFLogger$LogLevel + 3;
                    getLevel = i3 % 128;
                    int i4 = i3 % 2;
                    this.AFInAppEventType.put("advertiserId", str);
                    int i5 = AFLogger$LogLevel + 67;
                    getLevel = i5 % 128;
                    int i6 = i5 % 2;
                }
            }
            if (str2 != null && str2.length() > 0) {
                this.AFInAppEventType.put("imei", str2);
            }
            if (str3 != null && str3.length() > 0) {
                this.AFInAppEventType.put("android_id", str3);
            }
        } catch (Throwable unused) {
        }
    }

    public final void AFInAppEventType(String str, int i, String str2) {
        int i2 = AFLogger$LogLevel + 87;
        getLevel = i2 % 128;
        int i3 = i2 % 2;
        values("server_response", str, String.valueOf(i), str2);
        int i4 = getLevel + 63;
        AFLogger$LogLevel = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private synchronized void valueOf(String str, String str2, String str3, String str4) {
        try {
            int i = getLevel + 101;
            AFLogger$LogLevel = i % 128;
            try {
                if (i % 2 != 0) {
                    this.AFInAppEventType.put(HianalyticsBaseData.SDK_VERSION, str);
                    if (str2 != null && str2.length() > 0) {
                        this.AFInAppEventType.put("devkey", str2);
                    }
                    if (str3 != null && str3.length() > 0) {
                        this.AFInAppEventType.put("originalAppsFlyerId", str3);
                        int i2 = getLevel + 109;
                        AFLogger$LogLevel = i2 % 128;
                        int i3 = i2 % 2;
                    }
                    if (str4 != null) {
                        int i4 = getLevel + 123;
                        AFLogger$LogLevel = i4 % 128;
                        int i5 = i4 % 2;
                        if (str4.length() > 0) {
                            this.AFInAppEventType.put("uid", str4);
                        }
                    }
                } else {
                    this.AFInAppEventType.put(HianalyticsBaseData.SDK_VERSION, str);
                    throw null;
                }
            } catch (Throwable unused) {
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void values(String str, String str2) {
        int i = AFLogger$LogLevel + 39;
        getLevel = i % 128;
        int i2 = i % 2;
        values(null, str, str2);
        int i3 = AFLogger$LogLevel + 35;
        getLevel = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001f, code lost:
        if (r3.afDebugLog >= 98304) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0029, code lost:
        if (r3.afDebugLog >= 98304) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x002d, code lost:
        r0 = java.lang.System.currentTimeMillis();
        r6 = android.text.TextUtils.join(", ", r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0037, code lost:
        if (r4 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0039, code lost:
        r2 = new java.lang.StringBuilder();
        r2.append(r0);
        r2.append(" ");
        r2.append(java.lang.Thread.currentThread().getId());
        r2.append(" _/AppsFlyer_6.10.0 [");
        r2.append(r4);
        r2.append("] ");
        r2.append(r5);
        r2.append(" ");
        r2.append(r6);
        r4 = r2.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006e, code lost:
        r4 = new java.lang.StringBuilder();
        r4.append(r0);
        r4.append(" ");
        r4.append(java.lang.Thread.currentThread().getId());
        r4.append(" ");
        r4.append(r5);
        r4.append("/AppsFlyer_6.10.0 ");
        r4.append(r6);
        r4 = r4.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x009a, code lost:
        r3.AFKeystoreWrapper.add(r4);
        r3.afDebugLog += r4.length() << 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00aa, code lost:
        r4 = com.appsflyer.internal.AFb1uSDK.AFLogger$LogLevel + 93;
        com.appsflyer.internal.AFb1uSDK.getLevel = r4 % 128;
        r4 = r4 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b5, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b7, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private synchronized void values(java.lang.String r4, java.lang.String r5, java.lang.String... r6) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.AFLogger()     // Catch: java.lang.Throwable -> L24
            r0 = r0 ^ 1
            if (r0 == 0) goto La
            goto L2b
        La:
            int r0 = com.appsflyer.internal.AFb1uSDK.AFLogger$LogLevel     // Catch: java.lang.Throwable -> L24
            int r0 = r0 + 71
            int r1 = r0 % 128
            com.appsflyer.internal.AFb1uSDK.getLevel = r1     // Catch: java.lang.Throwable -> L24
            int r0 = r0 % 2
            r1 = 98304(0x18000, float:1.37753E-40)
            if (r0 == 0) goto L27
            int r0 = r3.afDebugLog     // Catch: java.lang.Throwable -> L24
            r2 = 47
            int r2 = r2 / 0
            if (r0 < r1) goto L2d
            goto L2b
        L22:
            r4 = move-exception
            throw r4     // Catch: java.lang.Throwable -> L24
        L24:
            r4 = move-exception
            goto Lb8
        L27:
            int r0 = r3.afDebugLog     // Catch: java.lang.Throwable -> L24
            if (r0 < r1) goto L2d
        L2b:
            monitor-exit(r3)
            return
        L2d:
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Lb6
            java.lang.String r2 = ", "
            java.lang.String r6 = android.text.TextUtils.join(r2, r6)     // Catch: java.lang.Throwable -> Lb6
            if (r4 == 0) goto L6e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb6
            r2.<init>()     // Catch: java.lang.Throwable -> Lb6
            r2.append(r0)     // Catch: java.lang.Throwable -> Lb6
            java.lang.String r0 = " "
            r2.append(r0)     // Catch: java.lang.Throwable -> Lb6
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> Lb6
            long r0 = r0.getId()     // Catch: java.lang.Throwable -> Lb6
            r2.append(r0)     // Catch: java.lang.Throwable -> Lb6
            java.lang.String r0 = " _/AppsFlyer_6.10.0 ["
            r2.append(r0)     // Catch: java.lang.Throwable -> Lb6
            r2.append(r4)     // Catch: java.lang.Throwable -> Lb6
            java.lang.String r4 = "] "
            r2.append(r4)     // Catch: java.lang.Throwable -> Lb6
            r2.append(r5)     // Catch: java.lang.Throwable -> Lb6
            java.lang.String r4 = " "
            r2.append(r4)     // Catch: java.lang.Throwable -> Lb6
            r2.append(r6)     // Catch: java.lang.Throwable -> Lb6
            java.lang.String r4 = r2.toString()     // Catch: java.lang.Throwable -> Lb6
            goto L9a
        L6e:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb6
            r4.<init>()     // Catch: java.lang.Throwable -> Lb6
            r4.append(r0)     // Catch: java.lang.Throwable -> Lb6
            java.lang.String r0 = " "
            r4.append(r0)     // Catch: java.lang.Throwable -> Lb6
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> Lb6
            long r0 = r0.getId()     // Catch: java.lang.Throwable -> Lb6
            r4.append(r0)     // Catch: java.lang.Throwable -> Lb6
            java.lang.String r0 = " "
            r4.append(r0)     // Catch: java.lang.Throwable -> Lb6
            r4.append(r5)     // Catch: java.lang.Throwable -> Lb6
            java.lang.String r5 = "/AppsFlyer_6.10.0 "
            r4.append(r5)     // Catch: java.lang.Throwable -> Lb6
            r4.append(r6)     // Catch: java.lang.Throwable -> Lb6
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> Lb6
        L9a:
            java.util.List<java.lang.String> r5 = r3.AFKeystoreWrapper     // Catch: java.lang.Throwable -> Lb6
            r5.add(r4)     // Catch: java.lang.Throwable -> Lb6
            int r5 = r3.afDebugLog     // Catch: java.lang.Throwable -> Lb6
            int r4 = r4.length()     // Catch: java.lang.Throwable -> Lb6
            int r4 = r4 << 1
            int r5 = r5 + r4
            r3.afDebugLog = r5     // Catch: java.lang.Throwable -> Lb6
            int r4 = com.appsflyer.internal.AFb1uSDK.AFLogger$LogLevel     // Catch: java.lang.Throwable -> L24
            int r4 = r4 + 93
            int r5 = r4 % 128
            com.appsflyer.internal.AFb1uSDK.getLevel = r5     // Catch: java.lang.Throwable -> L24
            int r4 = r4 % 2
            monitor-exit(r3)
            return
        Lb6:
            monitor-exit(r3)
            return
        Lb8:
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1uSDK.values(java.lang.String, java.lang.String, java.lang.String[]):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x006c, code lost:
        if (r6.length() > 0) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private synchronized void AFKeystoreWrapper(java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6) {
        /*
            r2 = this;
            monitor-enter(r2)
            if (r3 == 0) goto L10
            int r0 = r3.length()     // Catch: java.lang.Throwable -> L76
            if (r0 <= 0) goto L10
            java.util.Map<java.lang.String, java.lang.Object> r0 = r2.AFInAppEventType     // Catch: java.lang.Throwable -> L76
            java.lang.String r1 = "app_id"
            r0.put(r1, r3)     // Catch: java.lang.Throwable -> L76
        L10:
            if (r4 == 0) goto L36
            int r3 = com.appsflyer.internal.AFb1uSDK.getLevel     // Catch: java.lang.Throwable -> L34
            int r3 = r3 + 3
            int r0 = r3 % 128
            com.appsflyer.internal.AFb1uSDK.AFLogger$LogLevel = r0     // Catch: java.lang.Throwable -> L34
            int r3 = r3 % 2
            int r3 = r4.length()     // Catch: java.lang.Throwable -> L76
            if (r3 <= 0) goto L36
            int r3 = com.appsflyer.internal.AFb1uSDK.getLevel     // Catch: java.lang.Throwable -> L34
            int r3 = r3 + 91
            int r0 = r3 % 128
            com.appsflyer.internal.AFb1uSDK.AFLogger$LogLevel = r0     // Catch: java.lang.Throwable -> L34
            int r3 = r3 % 2
            java.util.Map<java.lang.String, java.lang.Object> r3 = r2.AFInAppEventType     // Catch: java.lang.Throwable -> L76
            java.lang.String r0 = "app_version"
            r3.put(r0, r4)     // Catch: java.lang.Throwable -> L76
            goto L36
        L34:
            r3 = move-exception
            goto L78
        L36:
            if (r5 == 0) goto L4f
            int r3 = r5.length()     // Catch: java.lang.Throwable -> L76
            if (r3 <= 0) goto L4f
            java.util.Map<java.lang.String, java.lang.Object> r3 = r2.AFInAppEventType     // Catch: java.lang.Throwable -> L76
            java.lang.String r4 = "channel"
            r3.put(r4, r5)     // Catch: java.lang.Throwable -> L76
            int r3 = com.appsflyer.internal.AFb1uSDK.AFLogger$LogLevel     // Catch: java.lang.Throwable -> L34
            int r3 = r3 + 9
            int r4 = r3 % 128
            com.appsflyer.internal.AFb1uSDK.getLevel = r4     // Catch: java.lang.Throwable -> L34
            int r3 = r3 % 2
        L4f:
            if (r6 == 0) goto L7a
            int r3 = com.appsflyer.internal.AFb1uSDK.getLevel     // Catch: java.lang.Throwable -> L34
            int r3 = r3 + 23
            int r4 = r3 % 128
            com.appsflyer.internal.AFb1uSDK.AFLogger$LogLevel = r4     // Catch: java.lang.Throwable -> L34
            int r3 = r3 % 2
            if (r3 != 0) goto L68
            int r3 = r6.length()     // Catch: java.lang.Throwable -> L76
            r4 = 99
            int r4 = r4 / 0
            if (r3 <= 0) goto L7a
            goto L6e
        L68:
            int r3 = r6.length()     // Catch: java.lang.Throwable -> L76
            if (r3 <= 0) goto L7a
        L6e:
            java.util.Map<java.lang.String, java.lang.Object> r3 = r2.AFInAppEventType     // Catch: java.lang.Throwable -> L76
            java.lang.String r4 = "preInstall"
            r3.put(r4, r6)     // Catch: java.lang.Throwable -> L76
            goto L7a
        L76:
            monitor-exit(r2)
            return
        L78:
            monitor-exit(r2)
            throw r3
        L7a:
            monitor-exit(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1uSDK.AFKeystoreWrapper(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    public final void valueOf(String str, String str2) {
        int i = AFLogger$LogLevel + 37;
        getLevel = i % 128;
        String[] strArr = {str2};
        if (i % 2 != 0) {
            values("server_request", str, strArr);
        } else {
            values("server_request", str, strArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void values() {
        try {
            int i = AFLogger$LogLevel + 71;
            getLevel = i % 128;
            if (i % 2 != 0) {
                this.AFInAppEventParameterName = true;
            } else {
                this.AFInAppEventParameterName = false;
            }
            afInfoLog();
            int i2 = AFLogger$LogLevel + 95;
            getLevel = i2 % 128;
            int i3 = i2 % 2;
        } catch (Throwable th) {
            throw th;
        }
    }

    private synchronized void valueOf(String str, PackageManager packageManager, AFe1xSDK aFe1xSDK) {
        try {
            int i = AFLogger$LogLevel + 3;
            getLevel = i % 128;
            int i2 = i % 2;
            AppsFlyerProperties appsFlyerProperties = AppsFlyerProperties.getInstance();
            String string = appsFlyerProperties.getString("remote_debug_static_data");
            this.AFInAppEventType.clear();
            if (string != null) {
                try {
                    this.AFInAppEventType.putAll(AFa1lSDK.AFInAppEventType(new JSONObject(string)));
                    int i3 = AFLogger$LogLevel + 55;
                    getLevel = i3 % 128;
                    int i4 = i3 % 2;
                } catch (Throwable unused) {
                }
            } else {
                AFb1zSDK AFInAppEventType = AFb1zSDK.AFInAppEventType();
                AFKeystoreWrapper(appsFlyerProperties.getString("advertiserId"), aFe1xSDK.valueOf, AFInAppEventType.afDebugLog);
                StringBuilder sb = new StringBuilder("6.10.0.");
                sb.append(AFb1zSDK.AFInAppEventType);
                valueOf(sb.toString(), AFInAppEventType.AFInAppEventParameterName().AFVersionDeclaration().AFInAppEventType, appsFlyerProperties.getString("KSAppsFlyerId"), appsFlyerProperties.getString("uid"));
                try {
                    int i5 = packageManager.getPackageInfo(str, 0).versionCode;
                    AFKeystoreWrapper(str, String.valueOf(i5), appsFlyerProperties.getString(AppsFlyerProperties.CHANNEL), appsFlyerProperties.getString("preInstallName"));
                } catch (Throwable unused2) {
                }
                appsFlyerProperties.set("remote_debug_static_data", new JSONObject(this.AFInAppEventType).toString());
            }
            this.AFInAppEventType.put("launch_counter", this.AFLogger);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void AFKeystoreWrapper(String str, String... strArr) {
        int i = getLevel + 99;
        AFLogger$LogLevel = i % 128;
        int i2 = i % 2;
        values("public_api_call", str, strArr);
        int i3 = AFLogger$LogLevel + 31;
        getLevel = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 65 / 0;
        }
    }

    private static String[] valueOf(String str, StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr == null) {
            int i = AFLogger$LogLevel + 19;
            getLevel = i % 128;
            int i2 = i % 2;
            return new String[]{str};
        }
        int i3 = 1;
        String[] strArr = new String[stackTraceElementArr.length + 1];
        strArr[0] = str;
        while (i3 < stackTraceElementArr.length) {
            int i4 = getLevel + 117;
            AFLogger$LogLevel = i4 % 128;
            int i5 = i4 % 2;
            strArr[i3] = stackTraceElementArr[i3].toString();
            i3++;
            int i6 = AFLogger$LogLevel + 89;
            getLevel = i6 % 128;
            int i7 = i6 % 2;
        }
        return strArr;
    }
}
