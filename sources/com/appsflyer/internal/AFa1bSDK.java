package com.appsflyer.internal;

import android.content.ContentResolver;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.support.annotation.Nullable;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFb1aSDK;
import com.appsflyer.internal.AFc1rSDK;
import com.appsflyer.internal.AFc1vSDK;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class AFa1bSDK implements AFc1zSDK {
    @Nullable
    static Boolean AFInAppEventParameterName;
    static String valueOf;
    private final AFc1ySDK AFKeystoreWrapper;

    public AFa1bSDK() {
    }

    public AFa1bSDK(AFc1ySDK aFc1ySDK) {
        z65.h(aFc1ySDK, "");
        this.AFKeystoreWrapper = aFc1ySDK;
    }

    private File AFInAppEventType() {
        Context context = this.AFKeystoreWrapper.values;
        if (context != null) {
            File file = new File(context.getFilesDir(), "AFExceptionsCache");
            if (!file.exists()) {
                file.mkdirs();
            }
            return file;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0145 A[ADDED_TO_REGION] */
    @android.support.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.appsflyer.internal.AFc1vSDK.AFa1wSDK AFKeystoreWrapper(android.content.Context r13, java.util.Map<java.lang.String, java.lang.Object> r14) {
        /*
            Method dump skipped, instructions count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1bSDK.AFKeystoreWrapper(android.content.Context, java.util.Map):com.appsflyer.internal.AFc1vSDK$AFa1wSDK");
    }

    private File afRDLog() {
        File AFInAppEventType = AFInAppEventType();
        if (AFInAppEventType != null) {
            File file = new File(AFInAppEventType, "6.10.0");
            if (!file.exists()) {
                file.mkdirs();
            }
            return file;
        }
        return null;
    }

    @Nullable
    public static AFc1vSDK.AFa1wSDK values(ContentResolver contentResolver) {
        String str;
        if (values() && contentResolver != null && AppsFlyerProperties.getInstance().getString("amazon_aid") == null && "Amazon".equals(Build.MANUFACTURER)) {
            int i = Settings.Secure.getInt(contentResolver, "limit_ad_tracking", 2);
            if (i == 0) {
                return new AFc1vSDK.AFa1wSDK(Settings.Secure.getString(contentResolver, "advertising_id"), Boolean.FALSE);
            }
            if (i == 2) {
                return null;
            }
            try {
                str = Settings.Secure.getString(contentResolver, "advertising_id");
            } catch (Throwable th) {
                AFLogger.afErrorLog("Couldn't fetch Amazon Advertising ID (Ad-Tracking is limited!)", th);
                str = "";
            }
            return new AFc1vSDK.AFa1wSDK(str, Boolean.TRUE);
        }
        return null;
    }

    @Override // com.appsflyer.internal.AFc1zSDK
    public final boolean AFInAppEventParameterName() {
        return AFInAppEventType(new String[0]);
    }

    @Override // com.appsflyer.internal.AFc1zSDK
    public final int valueOf() {
        int i = 0;
        for (AFb1aSDK aFb1aSDK : AFKeystoreWrapper()) {
            i += aFb1aSDK.AFInAppEventParameterName;
        }
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00d1, code lost:
        if (((java.lang.Boolean) r14).booleanValue() != false) goto L33;
     */
    @Override // com.appsflyer.internal.AFc1zSDK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean AFInAppEventType(java.lang.String... r14) {
        /*
            r13 = this;
            java.lang.String r0 = ""
            defpackage.z65.h(r14, r0)
            monitor-enter(r13)
            java.io.File r0 = r13.AFInAppEventType()     // Catch: java.lang.Throwable -> L26
            r1 = 1
            if (r0 == 0) goto Ld5
            int r2 = r14.length     // Catch: java.lang.Throwable -> L26
            if (r2 != 0) goto L29
            java.lang.String r14 = "delete all exceptions"
            java.lang.String r1 = ""
            defpackage.z65.h(r14, r1)     // Catch: java.lang.Throwable -> L26
            java.lang.String r1 = "[Exception Manager]: "
            java.lang.String r14 = r1.concat(r14)     // Catch: java.lang.Throwable -> L26
            com.appsflyer.AFLogger.afRDLog(r14)     // Catch: java.lang.Throwable -> L26
            boolean r1 = defpackage.pu3.h(r0)     // Catch: java.lang.Throwable -> L26
            goto Ld5
        L26:
            r14 = move-exception
            goto Ld7
        L29:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L26
            java.lang.String r3 = "delete all exceptions except for: "
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L26
            java.lang.String r5 = ", "
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 62
            r12 = 0
            r4 = r14
            java.lang.String r3 = defpackage.ur.O(r4, r5, r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L26
            r2.append(r3)     // Catch: java.lang.Throwable -> L26
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L26
            java.lang.String r3 = ""
            defpackage.z65.h(r2, r3)     // Catch: java.lang.Throwable -> L26
            java.lang.String r3 = "[Exception Manager]: "
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch: java.lang.Throwable -> L26
            java.lang.String r2 = r3.concat(r2)     // Catch: java.lang.Throwable -> L26
            com.appsflyer.AFLogger.afRDLog(r2)     // Catch: java.lang.Throwable -> L26
            java.io.File[] r0 = r0.listFiles()     // Catch: java.lang.Throwable -> L26
            if (r0 == 0) goto Ld5
            java.lang.String r2 = ""
            defpackage.z65.g(r0, r2)     // Catch: java.lang.Throwable -> L26
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L26
            r2.<init>()     // Catch: java.lang.Throwable -> L26
            int r3 = r0.length     // Catch: java.lang.Throwable -> L26
            r4 = 0
            r5 = 0
        L6b:
            if (r5 >= r3) goto L7f
            r6 = r0[r5]     // Catch: java.lang.Throwable -> L26
            java.lang.String r7 = r6.getName()     // Catch: java.lang.Throwable -> L26
            boolean r7 = defpackage.ur.A(r14, r7)     // Catch: java.lang.Throwable -> L26
            if (r7 != 0) goto L7c
            r2.add(r6)     // Catch: java.lang.Throwable -> L26
        L7c:
            int r5 = r5 + 1
            goto L6b
        L7f:
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L26
            r0 = 10
            int r0 = defpackage.ic1.w(r2, r0)     // Catch: java.lang.Throwable -> L26
            r14.<init>(r0)     // Catch: java.lang.Throwable -> L26
            java.util.Iterator r0 = r2.iterator()     // Catch: java.lang.Throwable -> L26
        L8e:
            boolean r2 = r0.hasNext()     // Catch: java.lang.Throwable -> L26
            if (r2 == 0) goto Lab
            java.lang.Object r2 = r0.next()     // Catch: java.lang.Throwable -> L26
            java.io.File r2 = (java.io.File) r2     // Catch: java.lang.Throwable -> L26
            java.lang.String r3 = ""
            defpackage.z65.g(r2, r3)     // Catch: java.lang.Throwable -> L26
            boolean r2 = defpackage.pu3.h(r2)     // Catch: java.lang.Throwable -> L26
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Throwable -> L26
            r14.add(r2)     // Catch: java.lang.Throwable -> L26
            goto L8e
        Lab:
            java.util.Set r14 = defpackage.ic1.K0(r14)     // Catch: java.lang.Throwable -> L26
            java.util.Collection r14 = (java.util.Collection) r14     // Catch: java.lang.Throwable -> L26
            boolean r0 = r14.isEmpty()     // Catch: java.lang.Throwable -> L26
            if (r0 == 0) goto Lbd
            java.lang.Boolean r14 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L26
            java.util.Set r14 = defpackage.qfa.d(r14)     // Catch: java.lang.Throwable -> L26
        Lbd:
            java.util.Set r14 = (java.util.Set) r14     // Catch: java.lang.Throwable -> L26
            int r0 = r14.size()     // Catch: java.lang.Throwable -> L26
            if (r0 != r1) goto Ld4
            java.lang.Iterable r14 = (java.lang.Iterable) r14     // Catch: java.lang.Throwable -> L26
            java.lang.Object r14 = defpackage.ic1.Y(r14)     // Catch: java.lang.Throwable -> L26
            java.lang.Boolean r14 = (java.lang.Boolean) r14     // Catch: java.lang.Throwable -> L26
            boolean r14 = r14.booleanValue()     // Catch: java.lang.Throwable -> L26
            if (r14 == 0) goto Ld4
            goto Ld5
        Ld4:
            r1 = 0
        Ld5:
            monitor-exit(r13)
            return r1
        Ld7:
            monitor-exit(r13)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1bSDK.AFInAppEventType(java.lang.String[]):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0061 A[RETURN] */
    @android.support.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.appsflyer.internal.AFc1vSDK.AFa1wSDK values(android.content.Context r5) {
        /*
            com.appsflyer.AppsFlyerProperties r0 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r1 = com.appsflyer.internal.AFa1bSDK.valueOf
            r2 = 1
            if (r1 == 0) goto Lb
            r3 = 1
            goto Lc
        Lb:
            r3 = 0
        Lc:
            r4 = 0
            if (r3 == 0) goto L11
        Lf:
            r5 = r4
            goto L53
        L11:
            java.lang.Boolean r1 = com.appsflyer.internal.AFa1bSDK.AFInAppEventParameterName
            if (r1 == 0) goto L1b
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L27
        L1b:
            java.lang.Boolean r1 = com.appsflyer.internal.AFa1bSDK.AFInAppEventParameterName
            if (r1 != 0) goto L51
            java.lang.String r1 = "collectOAID"
            boolean r1 = r0.getBoolean(r1, r2)
            if (r1 == 0) goto L51
        L27:
            com.appsflyer.oaid.OaidClient r1 = new com.appsflyer.oaid.OaidClient     // Catch: java.lang.Throwable -> L46
            r1.<init>(r5)     // Catch: java.lang.Throwable -> L46
            boolean r5 = r0.isEnableLog()     // Catch: java.lang.Throwable -> L46
            r1.setLogging(r5)     // Catch: java.lang.Throwable -> L46
            com.appsflyer.oaid.OaidClient$Info r5 = r1.fetch()     // Catch: java.lang.Throwable -> L46
            if (r5 == 0) goto L51
            java.lang.String r0 = r5.getId()     // Catch: java.lang.Throwable -> L46
            java.lang.Boolean r5 = r5.getLat()     // Catch: java.lang.Throwable -> L43
            r1 = r0
            goto L53
        L43:
            r5 = move-exception
            r1 = r0
            goto L48
        L46:
            r5 = move-exception
            r1 = r4
        L48:
            java.lang.String r0 = "No OAID library"
            com.appsflyer.AFLogger.afErrorLogForExcManagerOnly(r0, r5)
            com.appsflyer.AFLogger.afDebugLog(r0)
            goto Lf
        L51:
            r5 = r4
            r1 = r5
        L53:
            if (r1 == 0) goto L61
            com.appsflyer.internal.AFc1vSDK$AFa1wSDK r0 = new com.appsflyer.internal.AFc1vSDK$AFa1wSDK
            r0.<init>(r1, r5)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            r0.values = r5
            return r0
        L61:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1bSDK.values(android.content.Context):com.appsflyer.internal.AFc1vSDK$AFa1wSDK");
    }

    private static boolean values() {
        Boolean bool = AFInAppEventParameterName;
        return bool == null || bool.booleanValue();
    }

    @Override // com.appsflyer.internal.AFc1zSDK
    public final String values(Throwable th, String str) {
        String str2;
        String i0;
        String b;
        String b2;
        z65.h(th, "");
        z65.h(str, "");
        synchronized (this) {
            try {
                File afRDLog = afRDLog();
                str2 = null;
                if (afRDLog != null) {
                    try {
                        z65.h(th, "");
                        z65.h(str, "");
                        StringBuilder sb = new StringBuilder();
                        z65.h(th, "");
                        String name = th.getClass().getName();
                        z65.g(name, "");
                        sb.append(name);
                        sb.append(": ");
                        sb.append(str);
                        String obj = sb.toString();
                        z65.h(th, "");
                        z65.h(th, "");
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(th);
                        sb2.append('\n');
                        i0 = sc1.i0(AFc1rSDK.values(th), "\n", null, null, 0, null, AFc1rSDK.AnonymousClass5.AFKeystoreWrapper, 30, null);
                        sb2.append(i0);
                        String AFKeystoreWrapper = AFc1vSDK.AFa1wSDK.AFKeystoreWrapper(sb2.toString());
                        b = vl3.b(th);
                        AFb1aSDK aFb1aSDK = new AFb1aSDK(obj, AFKeystoreWrapper, b, 0, 8, null);
                        String str3 = aFb1aSDK.valueOf;
                        File file = new File(afRDLog, str3);
                        if (file.exists()) {
                            b2 = ru3.b(file, null, 1, null);
                            AFb1aSDK values = AFb1aSDK.AFa1zSDK.values(b2);
                            if (values != null) {
                                values.AFInAppEventParameterName++;
                                aFb1aSDK = values;
                            }
                        }
                        StringBuilder sb3 = new StringBuilder("label=");
                        sb3.append(AFc1vSDK.AFa1wSDK.AFInAppEventType(aFb1aSDK.AFInAppEventType));
                        sb3.append("\nhashName=");
                        sb3.append(AFc1vSDK.AFa1wSDK.AFInAppEventType(aFb1aSDK.valueOf));
                        sb3.append("\nstackTrace=");
                        sb3.append(AFc1vSDK.AFa1wSDK.AFInAppEventType(aFb1aSDK.AFKeystoreWrapper));
                        sb3.append("\nc=");
                        sb3.append(aFb1aSDK.AFInAppEventParameterName);
                        ru3.e(file, sb3.toString(), null, 2, null);
                        str2 = str3;
                    } catch (Exception e) {
                        StringBuilder sb4 = new StringBuilder("Could not cache exception\n");
                        StringBuilder sb5 = new StringBuilder(" ");
                        sb5.append(e.getMessage());
                        String obj2 = sb5.toString();
                        z65.h(obj2, "");
                        sb4.append("[Exception Manager]: ".concat(String.valueOf(obj2)));
                        AFLogger.afRDLog(sb4.toString());
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }

    @Override // com.appsflyer.internal.AFc1zSDK
    public final List<AFb1aSDK> AFKeystoreWrapper() {
        List<AFb1aSDK> list;
        File[] listFiles;
        String b;
        synchronized (this) {
            try {
                File afRDLog = afRDLog();
                list = null;
                if (afRDLog != null && (listFiles = afRDLog.listFiles()) != null) {
                    z65.g(listFiles, "");
                    ArrayList arrayList = new ArrayList();
                    for (File file : listFiles) {
                        AFb1aSDK.AFa1zSDK aFa1zSDK = AFb1aSDK.AFa1zSDK;
                        z65.g(file, "");
                        b = ru3.b(file, null, 1, null);
                        AFb1aSDK values = AFb1aSDK.AFa1zSDK.values(b);
                        if (values != null) {
                            arrayList.add(values);
                        }
                    }
                    list = arrayList;
                }
                if (list == null) {
                    list = kc1.l();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return list;
    }
}
