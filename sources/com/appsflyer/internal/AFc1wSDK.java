package com.appsflyer.internal;

import android.os.Build;
import android.text.TextUtils;
import com.appsflyer.internal.AFc1vSDK;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
/* loaded from: classes.dex */
public final class AFc1wSDK implements AFc1uSDK {
    private static int AFLogger$LogLevel = 0;
    private static int[] afDebugLog = {-1738095187, 1834906142, 1827906695, 1955966352, -937538432, -1634077668, -1526616300, 642933902, 1185377755, 1528790409, -1756558490, -77919810, -775634893, 192278897, -106703006, -2126434171, 582203754, 1763923543};
    private static int getLevel = 1;
    private final rn5 AFInAppEventParameterName;
    private AFc1xSDK AFInAppEventType;
    private final rn5 AFKeystoreWrapper;
    private final rn5 AFLogger;
    private final rn5 afErrorLog;
    private final rn5 afInfoLog;
    private final String afRDLog;
    private final rn5 valueOf;
    private final rn5 values;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/appsflyer/internal/AFe1ySDK;", "values", "()Lcom/appsflyer/internal/AFb1vSDK;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFc1wSDK$1  reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends ej5 implements Function0<AFb1vSDK> {
        AnonymousClass1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: values */
        public final AFb1vSDK invoke() {
            AFb1vSDK afInfoLog = AFc1wSDK.AFInAppEventParameterName(AFc1wSDK.this).afInfoLog();
            z65.g(afInfoLog, "");
            return afInfoLog;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/appsflyer/internal/AFc1sSDK;", "AFKeystoreWrapper", "()Lcom/appsflyer/internal/AFa1bSDK;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFc1wSDK$2  reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass2 extends ej5 implements Function0<AFa1bSDK> {
        AnonymousClass2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: AFKeystoreWrapper */
        public final AFa1bSDK invoke() {
            AFc1ySDK afErrorLogForExcManagerOnly = AFc1wSDK.AFInAppEventParameterName(AFc1wSDK.this).afErrorLogForExcManagerOnly();
            z65.g(afErrorLogForExcManagerOnly, "");
            return new AFa1bSDK(afErrorLogForExcManagerOnly);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/appsflyer/internal/AFb1fSDK;", "AFInAppEventParameterName", "()Lcom/appsflyer/internal/AFb1fSDK;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFc1wSDK$3  reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass3 extends ej5 implements Function0<AFb1fSDK> {
        AnonymousClass3() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: AFInAppEventParameterName */
        public final AFb1fSDK invoke() {
            AFb1fSDK values = AFc1wSDK.AFInAppEventParameterName(AFc1wSDK.this).values();
            z65.g(values, "");
            return values;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/appsflyer/internal/AFb1gSDK;", "AFKeystoreWrapper", "()Lcom/appsflyer/internal/AFb1gSDK;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFc1wSDK$4  reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass4 extends ej5 implements Function0<AFb1gSDK> {
        AnonymousClass4() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: AFKeystoreWrapper */
        public final AFb1gSDK invoke() {
            AFb1gSDK afErrorLog = AFc1wSDK.AFInAppEventParameterName(AFc1wSDK.this).afErrorLog();
            z65.g(afErrorLog, "");
            return afErrorLog;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljava/util/concurrent/ExecutorService;", "AFInAppEventParameterName", "()Ljava/util/concurrent/ExecutorService;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFc1wSDK$5  reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass5 extends ej5 implements Function0<ExecutorService> {
        AnonymousClass5() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: AFInAppEventParameterName */
        public final ExecutorService invoke() {
            ExecutorService AFInAppEventParameterName = AFc1wSDK.AFInAppEventParameterName(AFc1wSDK.this).AFInAppEventParameterName();
            z65.g(AFInAppEventParameterName, "");
            return AFInAppEventParameterName;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/appsflyer/internal/AFc1tSDK;", "AFInAppEventParameterName", "()Lcom/appsflyer/internal/AFa1dSDK;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFc1wSDK$7  reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass7 extends ej5 implements Function0<AFa1dSDK> {
        AnonymousClass7() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: AFInAppEventParameterName */
        public final AFa1dSDK invoke() {
            return new AFa1dSDK(AFc1wSDK.this.AFKeystoreWrapper());
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/appsflyer/internal/AFe1xSDK;", "AFInAppEventParameterName", "()Lcom/appsflyer/internal/AFe1xSDK;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFc1wSDK$9  reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass9 extends ej5 implements Function0<AFe1xSDK> {
        AnonymousClass9() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: AFInAppEventParameterName */
        public final AFe1xSDK invoke() {
            AFe1xSDK AFVersionDeclaration = AFc1wSDK.AFInAppEventParameterName(AFc1wSDK.this).AFVersionDeclaration();
            z65.g(AFVersionDeclaration, "");
            return AFVersionDeclaration;
        }
    }

    public AFc1wSDK(AFc1xSDK aFc1xSDK) {
        rn5 b;
        rn5 b2;
        rn5 b3;
        rn5 b4;
        rn5 b5;
        rn5 b6;
        rn5 b7;
        z65.h(aFc1xSDK, "");
        this.AFInAppEventType = aFc1xSDK;
        b = yn5.b(new AnonymousClass1());
        this.values = b;
        b2 = yn5.b(new AnonymousClass3());
        this.valueOf = b2;
        b3 = yn5.b(new AnonymousClass4());
        this.AFKeystoreWrapper = b3;
        b4 = yn5.b(new AnonymousClass9());
        this.AFInAppEventParameterName = b4;
        b5 = yn5.b(new AnonymousClass5());
        this.afInfoLog = b5;
        this.afRDLog = "6.10.0";
        b6 = yn5.b(new AnonymousClass2());
        this.AFLogger = b6;
        b7 = yn5.b(new AnonymousClass7());
        this.afErrorLog = b7;
    }

    public static final /* synthetic */ AFc1xSDK AFInAppEventParameterName(AFc1wSDK aFc1wSDK) {
        int i = getLevel;
        int i2 = i + 125;
        AFLogger$LogLevel = i2 % 128;
        int i3 = i2 % 2;
        AFc1xSDK aFc1xSDK = aFc1wSDK.AFInAppEventType;
        int i4 = i + 105;
        AFLogger$LogLevel = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 77 / 0;
        }
        return aFc1xSDK;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AFInAppEventType(AFc1wSDK aFc1wSDK, Throwable th, String str) {
        int i = getLevel + 7;
        AFLogger$LogLevel = i % 128;
        if (i % 2 == 0) {
            z65.h(aFc1wSDK, "");
            z65.h(th, "");
            z65.h(str, "");
            aFc1wSDK.AFKeystoreWrapper().values(th, str);
            return;
        }
        z65.h(aFc1wSDK, "");
        z65.h(th, "");
        z65.h(str, "");
        aFc1wSDK.AFKeystoreWrapper().values(th, str);
        throw null;
    }

    private String AFLogger() {
        int i = getLevel + 47;
        int i2 = i % 128;
        AFLogger$LogLevel = i2;
        int i3 = i % 2;
        String str = this.afRDLog;
        int i4 = i2 + 11;
        getLevel = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
        if (AFInAppEventParameterName(r0) == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0025, code lost:
        r1 = com.appsflyer.internal.AFc1wSDK.AFLogger$LogLevel + 57;
        com.appsflyer.internal.AFc1wSDK.getLevel = r1 % 128;
        r1 = r1 % 2;
        r1 = afDebugLog().AFInAppEventType;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0035, code lost:
        if (r1 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
        r0 = new org.json.JSONObject(AFInAppEventParameterName(AFKeystoreWrapper(r0), AFKeystoreWrapper().AFKeystoreWrapper())).toString();
        defpackage.z65.g(r0, "");
        defpackage.z65.g(r1, "");
        values(r0, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0059, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005a, code lost:
        defpackage.z65.h("skipping", "");
        com.appsflyer.AFLogger.afRDLog("[Exception Manager]: ".concat("skipping"));
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0068, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0069, code lost:
        r0 = com.appsflyer.internal.AFc1wSDK.AFLogger$LogLevel + 67;
        com.appsflyer.internal.AFc1wSDK.getLevel = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0073, code lost:
        if ((r0 % 2) == 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0075, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0077, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
        if (r0 != null) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
        if (r0 != null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void AFLogger$LogLevel() {
        /*
            r4 = this;
            int r0 = com.appsflyer.internal.AFc1wSDK.AFLogger$LogLevel
            int r0 = r0 + 55
            int r1 = r0 % 128
            com.appsflyer.internal.AFc1wSDK.getLevel = r1
            int r0 = r0 % 2
            if (r0 != 0) goto L17
            com.appsflyer.internal.AFb1tSDK r0 = r4.afErrorLogForExcManagerOnly()
            r1 = 35
            int r1 = r1 / 0
            if (r0 == 0) goto L69
            goto L1d
        L17:
            com.appsflyer.internal.AFb1tSDK r0 = r4.afErrorLogForExcManagerOnly()
            if (r0 == 0) goto L69
        L1d:
            boolean r1 = r4.AFInAppEventParameterName(r0)
            java.lang.String r2 = ""
            if (r1 == 0) goto L5a
            int r1 = com.appsflyer.internal.AFc1wSDK.AFLogger$LogLevel
            int r1 = r1 + 57
            int r3 = r1 % 128
            com.appsflyer.internal.AFc1wSDK.getLevel = r3
            int r1 = r1 % 2
            com.appsflyer.internal.AFe1xSDK r1 = r4.afDebugLog()
            java.lang.String r1 = r1.AFInAppEventType
            if (r1 == 0) goto L59
            java.util.Map r0 = r4.AFKeystoreWrapper(r0)
            com.appsflyer.internal.AFc1zSDK r3 = r4.AFKeystoreWrapper()
            java.util.List r3 = r3.AFKeystoreWrapper()
            java.util.Map r0 = AFInAppEventParameterName(r0, r3)
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>(r0)
            java.lang.String r0 = r3.toString()
            defpackage.z65.g(r0, r2)
            defpackage.z65.g(r1, r2)
            r4.values(r0, r1)
        L59:
            return
        L5a:
            java.lang.String r0 = "skipping"
            defpackage.z65.h(r0, r2)
            java.lang.String r1 = "[Exception Manager]: "
            java.lang.String r0 = r1.concat(r0)
            com.appsflyer.AFLogger.afRDLog(r0)
            return
        L69:
            int r0 = com.appsflyer.internal.AFc1wSDK.AFLogger$LogLevel
            int r0 = r0 + 67
            int r1 = r0 % 128
            com.appsflyer.internal.AFc1wSDK.getLevel = r1
            int r0 = r0 % 2
            if (r0 == 0) goto L76
            return
        L76:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFc1wSDK.AFLogger$LogLevel():void");
    }

    private final synchronized void AFVersionDeclaration() {
        AFb1tSDK afErrorLogForExcManagerOnly = afErrorLogForExcManagerOnly();
        if (afErrorLogForExcManagerOnly != null) {
            if (afErrorLogForExcManagerOnly.valueOf == -1) {
                int i = getLevel + 7;
                AFLogger$LogLevel = i % 128;
                if (i % 2 == 0) {
                    afErrorLog().AFKeystoreWrapper("af_send_exc_to_server_window");
                    return;
                } else {
                    afErrorLog().AFKeystoreWrapper("af_send_exc_to_server_window");
                    throw null;
                }
            }
            if (afErrorLog().valueOf("af_send_exc_to_server_window", -1L) == -1) {
                int i2 = AFLogger$LogLevel + 123;
                getLevel = i2 % 128;
                int i3 = i2 % 2;
                int i4 = afErrorLogForExcManagerOnly.values;
                int i5 = afErrorLogForExcManagerOnly.valueOf;
                AFb1gSDK afErrorLog = afErrorLog();
                afErrorLog.AFInAppEventType("af_send_exc_to_server_window", System.currentTimeMillis() + TimeUnit.DAYS.toMillis(i5));
                afErrorLog.AFInAppEventParameterName("af_send_exc_min", i4);
            }
            return;
        }
        int i6 = getLevel + 27;
        AFLogger$LogLevel = i6 % 128;
        if (i6 % 2 == 0) {
            return;
        }
        throw null;
    }

    private final AFe1xSDK afDebugLog() {
        int i = getLevel + 77;
        AFLogger$LogLevel = i % 128;
        int i2 = i % 2;
        AFe1xSDK aFe1xSDK = (AFe1xSDK) this.AFInAppEventParameterName.getValue();
        int i3 = getLevel + 97;
        AFLogger$LogLevel = i3 % 128;
        int i4 = i3 % 2;
        return aFe1xSDK;
    }

    private final AFb1gSDK afErrorLog() {
        AFb1gSDK aFb1gSDK;
        int i = AFLogger$LogLevel + 79;
        getLevel = i % 128;
        if (i % 2 == 0) {
            aFb1gSDK = (AFb1gSDK) this.AFKeystoreWrapper.getValue();
            int i2 = 31 / 0;
        } else {
            aFb1gSDK = (AFb1gSDK) this.AFKeystoreWrapper.getValue();
        }
        int i3 = getLevel + 35;
        AFLogger$LogLevel = i3 % 128;
        int i4 = i3 % 2;
        return aFb1gSDK;
    }

    private final AFb1tSDK afErrorLogForExcManagerOnly() {
        AFb1oSDK aFb1oSDK = values().valueOf.AFInAppEventParameterName;
        if (aFb1oSDK != null) {
            int i = AFLogger$LogLevel + 85;
            getLevel = i % 128;
            if (i % 2 != 0) {
                AFb1nSDK aFb1nSDK = aFb1oSDK.valueOf;
                if (aFb1nSDK != null) {
                    return aFb1nSDK.valueOf;
                }
            } else {
                AFb1nSDK aFb1nSDK2 = aFb1oSDK.valueOf;
                throw null;
            }
        }
        int i2 = AFLogger$LogLevel + 57;
        getLevel = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 5 / 0;
        }
        return null;
    }

    private final AFb1fSDK afInfoLog() {
        int i = AFLogger$LogLevel + 81;
        getLevel = i % 128;
        int i2 = i % 2;
        AFb1fSDK aFb1fSDK = (AFb1fSDK) this.valueOf.getValue();
        int i3 = getLevel + 33;
        AFLogger$LogLevel = i3 % 128;
        if (i3 % 2 == 0) {
            return aFb1fSDK;
        }
        throw null;
    }

    private final ExecutorService afRDLog() {
        int i = AFLogger$LogLevel + 73;
        getLevel = i % 128;
        if (i % 2 != 0) {
            return (ExecutorService) this.afInfoLog.getValue();
        }
        ExecutorService executorService = (ExecutorService) this.afInfoLog.getValue();
        throw null;
    }

    private final synchronized void afWarnLog() {
        String str;
        try {
            try {
                AFb1tSDK afErrorLogForExcManagerOnly = afErrorLogForExcManagerOnly();
                if (afErrorLogForExcManagerOnly != null) {
                    str = afErrorLogForExcManagerOnly.AFInAppEventType;
                    int i = getLevel + 117;
                    AFLogger$LogLevel = i % 128;
                    int i2 = i % 2;
                } else {
                    int i3 = AFLogger$LogLevel + 29;
                    getLevel = i3 % 128;
                    int i4 = i3 % 2;
                    str = null;
                }
                if (str == null) {
                    str = "";
                }
                int i5 = getLevel + 61;
                AFLogger$LogLevel = i5 % 128;
                int i6 = i5 % 2;
            } catch (Throwable th) {
                throw th;
            }
        } catch (NullPointerException unused) {
            str = "NOT_DETECTED";
        }
        if (AFc1vSDK.AFa1wSDK.valueOf(str) != -1 && AFc1vSDK.AFa1wSDK.valueOf(str) <= AFc1vSDK.AFa1wSDK.valueOf(AFLogger())) {
            AFKeystoreWrapper().AFInAppEventType(AFLogger());
            return;
        }
        afErrorLog().AFKeystoreWrapper("af_send_exc_to_server_window");
        AFKeystoreWrapper().AFInAppEventParameterName();
    }

    private AFc1vSDK getLevel() {
        int i = getLevel + 55;
        AFLogger$LogLevel = i % 128;
        if (i % 2 == 0) {
            AFc1vSDK aFc1vSDK = (AFc1vSDK) this.afErrorLog.getValue();
            int i2 = getLevel + 51;
            AFLogger$LogLevel = i2 % 128;
            if (i2 % 2 == 0) {
                return aFc1vSDK;
            }
            throw null;
        }
        AFc1vSDK aFc1vSDK2 = (AFc1vSDK) this.afErrorLog.getValue();
        throw null;
    }

    private final AFb1vSDK values() {
        int i = getLevel + 85;
        AFLogger$LogLevel = i % 128;
        int i2 = i % 2;
        AFb1vSDK aFb1vSDK = (AFb1vSDK) this.values.getValue();
        int i3 = AFLogger$LogLevel + 49;
        getLevel = i3 % 128;
        if (i3 % 2 != 0) {
            return aFb1vSDK;
        }
        throw null;
    }

    public final AFc1zSDK AFKeystoreWrapper() {
        int i = AFLogger$LogLevel + 17;
        getLevel = i % 128;
        if (i % 2 != 0) {
            return (AFc1zSDK) this.AFLogger.getValue();
        }
        AFc1zSDK aFc1zSDK = (AFc1zSDK) this.AFLogger.getValue();
        throw null;
    }

    @Override // com.appsflyer.internal.AFc1uSDK
    public final void valueOf() {
        int i = AFLogger$LogLevel + 1;
        getLevel = i % 128;
        int i2 = i % 2;
        afRDLog().execute(new Runnable() { // from class: com.appsflyer.internal.h
            @Override // java.lang.Runnable
            public final void run() {
                AFc1wSDK.values(AFc1wSDK.this);
            }
        });
        int i3 = AFLogger$LogLevel + 89;
        getLevel = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 86 / 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AFKeystoreWrapper(AFc1wSDK aFc1wSDK) {
        int i = AFLogger$LogLevel + 113;
        getLevel = i % 128;
        if (i % 2 != 0) {
            z65.h(aFc1wSDK, "");
            aFc1wSDK.AFVersionDeclaration();
            return;
        }
        z65.h(aFc1wSDK, "");
        aFc1wSDK.AFVersionDeclaration();
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void valueOf(AFc1wSDK aFc1wSDK) {
        int i = AFLogger$LogLevel + 13;
        getLevel = i % 128;
        if (i % 2 != 0) {
            z65.h(aFc1wSDK, "");
            aFc1wSDK.AFLogger$LogLevel();
            return;
        }
        z65.h(aFc1wSDK, "");
        aFc1wSDK.AFLogger$LogLevel();
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void values(AFc1wSDK aFc1wSDK) {
        int i = getLevel + 21;
        AFLogger$LogLevel = i % 128;
        int i2 = i % 2;
        z65.h(aFc1wSDK, "");
        aFc1wSDK.afWarnLog();
        int i3 = AFLogger$LogLevel + 77;
        getLevel = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.internal.AFc1uSDK
    public final void AFInAppEventParameterName(final Throwable th, final String str) {
        int i = getLevel + 13;
        AFLogger$LogLevel = i % 128;
        int i2 = i % 2;
        z65.h(th, "");
        z65.h(str, "");
        afRDLog().execute(new Runnable() { // from class: com.appsflyer.internal.i
            @Override // java.lang.Runnable
            public final void run() {
                AFc1wSDK.AFInAppEventType(AFc1wSDK.this, th, str);
            }
        });
        int i3 = getLevel + 105;
        AFLogger$LogLevel = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // com.appsflyer.internal.AFc1uSDK
    public final void AFInAppEventType() {
        int i = getLevel + 69;
        AFLogger$LogLevel = i % 128;
        if (i % 2 != 0) {
            afRDLog().execute(new Runnable() { // from class: com.appsflyer.internal.j
                @Override // java.lang.Runnable
                public final void run() {
                    AFc1wSDK.valueOf(AFc1wSDK.this);
                }
            });
            throw null;
        }
        afRDLog().execute(new Runnable() { // from class: com.appsflyer.internal.j
            @Override // java.lang.Runnable
            public final void run() {
                AFc1wSDK.valueOf(AFc1wSDK.this);
            }
        });
        int i2 = AFLogger$LogLevel + 113;
        getLevel = i2 % 128;
        int i3 = i2 % 2;
    }

    private final Map<String, String> AFKeystoreWrapper(AFb1tSDK aFb1tSDK) {
        Map<String, String> k;
        Object[] objArr = new Object[1];
        AFKeystoreWrapper(new int[]{904326648, -1151615226, 559669833, 422288252}, 5 - TextUtils.indexOf("", "", 0), objArr);
        k = g86.k(lnb.a(((String) objArr[0]).intern(), Build.BRAND), lnb.a("model", Build.MODEL), lnb.a(HiAnalyticsConstant.BI_KEY_APP_ID, afInfoLog().valueOf.values.getPackageName()), lnb.a("p_ex", new AFb1rSDK().values()), lnb.a("api", String.valueOf(Build.VERSION.SDK_INT)), lnb.a("sdk", AFLogger()), lnb.a("uid", AFb1xSDK.AFInAppEventParameterName(new WeakReference(afInfoLog().valueOf.values))), lnb.a("exc_config", aFb1tSDK.AFInAppEventType()));
        int i = getLevel + 23;
        AFLogger$LogLevel = i % 128;
        int i2 = i % 2;
        return k;
    }

    private final void values(String str, String str2) {
        Map<String, String> f;
        int i = getLevel + 99;
        AFLogger$LogLevel = i % 128;
        int i2 = i % 2;
        byte[] bytes = str.getBytes(rw0.b);
        z65.g(bytes, "");
        f = f86.f(lnb.a("Authorization", AFa1aSDK.values(str, str2)));
        getLevel().values(bytes, f, 2000);
        int i3 = AFLogger$LogLevel + 101;
        getLevel = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // com.appsflyer.internal.AFc1uSDK
    public final void AFInAppEventParameterName() {
        int i = getLevel + 25;
        AFLogger$LogLevel = i % 128;
        int i2 = i % 2;
        afRDLog().execute(new Runnable() { // from class: com.appsflyer.internal.g
            @Override // java.lang.Runnable
            public final void run() {
                AFc1wSDK.AFKeystoreWrapper(AFc1wSDK.this);
            }
        });
        int i3 = AFLogger$LogLevel + 89;
        getLevel = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 5 / 0;
        }
    }

    private static Map<String, Object> AFInAppEventParameterName(Map<String, ? extends Object> map, List<AFb1aSDK> list) {
        Map<String, Object> k;
        int i = getLevel + 5;
        AFLogger$LogLevel = i % 128;
        if (i % 2 != 0) {
            Pair[] pairArr = new Pair[4];
            pairArr[1] = lnb.a("deviceInfo", map);
            pairArr[1] = lnb.a("excs", AFc1vSDK.AFa1wSDK.valueOf(list));
            k = g86.k(pairArr);
        } else {
            k = g86.k(lnb.a("deviceInfo", map), lnb.a("excs", AFc1vSDK.AFa1wSDK.valueOf(list)));
        }
        int i2 = getLevel + 9;
        AFLogger$LogLevel = i2 % 128;
        int i3 = i2 % 2;
        return k;
    }

    private final boolean AFInAppEventParameterName(AFb1tSDK aFb1tSDK) {
        int AFInAppEventType;
        long valueOf = afErrorLog().valueOf("af_send_exc_to_server_window", -1L);
        if (valueOf != -1 && valueOf >= System.currentTimeMillis() && (AFInAppEventType = afErrorLog().AFInAppEventType("af_send_exc_min", -1)) != -1) {
            int i = AFLogger$LogLevel + 99;
            getLevel = i % 128;
            if (i % 2 == 0) {
                AFKeystoreWrapper().valueOf();
                throw null;
            } else if (AFKeystoreWrapper().valueOf() >= AFInAppEventType) {
                String str = aFb1tSDK.AFInAppEventType;
                z65.g(str, "");
                if (AFc1vSDK.AFa1wSDK.valueOf(str) == AFc1vSDK.AFa1wSDK.valueOf(AFLogger())) {
                    return true;
                }
                int i2 = getLevel + 69;
                AFLogger$LogLevel = i2 % 128;
                if (i2 % 2 == 0) {
                    return false;
                }
                throw null;
            }
        }
        return false;
    }

    private static void AFKeystoreWrapper(int[] iArr, int i, Object[] objArr) {
        String str;
        synchronized (AFg1zSDK.AFInAppEventParameterName) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) afDebugLog.clone();
                AFg1zSDK.AFInAppEventType = 0;
                while (true) {
                    int i2 = AFg1zSDK.AFInAppEventType;
                    if (i2 < iArr.length) {
                        int i3 = iArr[i2];
                        char c = (char) (i3 >> 16);
                        cArr[0] = c;
                        char c2 = (char) i3;
                        cArr[1] = c2;
                        char c3 = (char) (iArr[i2 + 1] >> 16);
                        cArr[2] = c3;
                        char c4 = (char) iArr[i2 + 1];
                        cArr[3] = c4;
                        AFg1zSDK.valueOf = (c << 16) + c2;
                        AFg1zSDK.values = (c3 << 16) + c4;
                        AFg1zSDK.AFInAppEventParameterName(iArr2);
                        for (int i4 = 0; i4 < 16; i4++) {
                            int i5 = AFg1zSDK.valueOf ^ iArr2[i4];
                            AFg1zSDK.valueOf = i5;
                            AFg1zSDK.values = AFg1zSDK.values(i5) ^ AFg1zSDK.values;
                            int i6 = AFg1zSDK.valueOf;
                            AFg1zSDK.valueOf = AFg1zSDK.values;
                            AFg1zSDK.values = i6;
                        }
                        int i7 = AFg1zSDK.valueOf;
                        AFg1zSDK.valueOf = AFg1zSDK.values;
                        AFg1zSDK.values = i7;
                        AFg1zSDK.values = i7 ^ iArr2[16];
                        AFg1zSDK.valueOf ^= iArr2[17];
                        int i8 = AFg1zSDK.AFInAppEventType;
                        int i9 = AFg1zSDK.valueOf;
                        cArr[0] = (char) (i9 >>> 16);
                        cArr[1] = (char) i9;
                        int i10 = AFg1zSDK.values;
                        cArr[2] = (char) (i10 >>> 16);
                        cArr[3] = (char) i10;
                        AFg1zSDK.AFInAppEventParameterName(iArr2);
                        int i11 = AFg1zSDK.AFInAppEventType;
                        cArr2[i11 << 1] = cArr[0];
                        cArr2[(i11 << 1) + 1] = cArr[1];
                        cArr2[(i11 << 1) + 2] = cArr[2];
                        cArr2[(i11 << 1) + 3] = cArr[3];
                        AFg1zSDK.AFInAppEventType = i11 + 2;
                    } else {
                        str = new String(cArr2, 0, i);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        objArr[0] = str;
    }
}
