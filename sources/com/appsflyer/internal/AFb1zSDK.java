package com.appsflyer.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.graphics.PointF;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.provider.Settings;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.VisibleForTesting;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.appsflyer.AFInAppEventParameterName;
import com.appsflyer.AFInAppEventType;
import com.appsflyer.AFKeystoreWrapper;
import com.appsflyer.AFLogger;
import com.appsflyer.AFVersionDeclaration;
import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.AppsFlyerInAppPurchaseValidatorListener;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.PurchaseHandler;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.attribution.RequestError;
import com.appsflyer.deeplink.DeepLinkListener;
import com.appsflyer.deeplink.DeepLinkResult;
import com.appsflyer.internal.AFa1gSDK;
import com.appsflyer.internal.AFa1rSDK;
import com.appsflyer.internal.AFa1zSDK;
import com.appsflyer.internal.AFb1wSDK;
import com.appsflyer.internal.AFb1zSDK;
import com.appsflyer.internal.AFc1vSDK;
import com.appsflyer.internal.AFd1hSDK;
import com.appsflyer.internal.AFd1xSDK;
import com.appsflyer.internal.AFf1uSDK;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.inappstory.sdk.stories.ui.widgets.readerscreen.generated.ElementGenerator;
import defpackage.tmb;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.net.HttpURLConnection;
import java.net.URI;
import java.security.KeyStoreException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class AFb1zSDK extends AppsFlyerLib {
    public static final String AFInAppEventParameterName;
    static final String AFInAppEventType;
    public static final String AFKeystoreWrapper;
    private static String AFLogger = null;
    private static String AFLogger$LogLevel = null;
    private static String AFVersionDeclaration = null;
    private static char[] AppsFlyerConversionListener = null;
    private static String afErrorLog = null;
    @VisibleForTesting
    private static AFb1zSDK afErrorLogForExcManagerOnly = null;
    private static final String afInfoLog;
    @VisibleForTesting
    private static String afWarnLog = null;
    private static String getLevel = null;
    private static int getSdkVersion = 1;
    private static int onPause;
    private static long onValidateInAppFailure;
    public static volatile AppsFlyerConversionListener valueOf;
    static AppsFlyerInAppPurchaseValidatorListener values;
    private AFb1cSDK AppsFlyerInAppPurchaseValidatorListener;
    String afDebugLog;
    public AFa1fSDK afRDLog;
    private SharedPreferences onAppOpenAttribution;
    private String onAppOpenAttributionNative;
    private Map<String, Object> onAttributionFailure;
    private boolean onAttributionFailureNative;
    private Application onDeepLinking;
    private Map<Long, String> onDeepLinkingNative;
    private String onResponse;
    @NonNull
    private final AFb1bSDK onResponseError;
    private boolean onResponseNative;
    private long onInstallConversionFailureNative = -1;
    private long init = -1;
    private long onInstallConversionDataLoadedNative = TimeUnit.SECONDS.toMillis(5);
    private boolean AppsFlyer2dXConversionCallback = false;
    private final AFb1rSDK onResponseErrorNative = new AFb1rSDK();
    private boolean onConversionDataSuccess = false;
    private boolean onConversionDataFail = false;
    private final Executor onValidateInApp = Executors.newSingleThreadExecutor();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.appsflyer.internal.AFb1zSDK$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass1 implements Runnable {
        AnonymousClass1() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void AFInAppEventParameterName() {
            try {
                AFe1hSDK aFe1hSDK = new AFe1hSDK();
                Application values = AFb1zSDK.values(AFb1zSDK.this);
                if (values != null) {
                    aFe1hSDK.AFKeystoreWrapper = (Application) values.getApplicationContext();
                }
                AFb1zSDK aFb1zSDK = AFb1zSDK.this;
                if (AFb1zSDK.AFInAppEventParameterName(aFb1zSDK, aFe1hSDK, AFb1zSDK.AFInAppEventType(AFb1zSDK.values(aFb1zSDK)))) {
                    AFb1zSDK.AFInAppEventType(AFb1zSDK.this, aFe1hSDK);
                }
            } catch (Throwable th) {
                AFLogger.afErrorLog(th.getMessage(), th);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            AFb1zSDK.AFInAppEventType(AFb1zSDK.valueOf(AFb1zSDK.this).AFInAppEventType(), new Runnable() { // from class: com.appsflyer.internal.f
                @Override // java.lang.Runnable
                public final void run() {
                    AFb1zSDK.AnonymousClass1.this.AFInAppEventParameterName();
                }
            }, TimeUnit.MILLISECONDS);
        }
    }

    /* renamed from: com.appsflyer.internal.AFb1zSDK$10  reason: invalid class name */
    /* loaded from: classes.dex */
    static /* synthetic */ class AnonymousClass10 {
        static final /* synthetic */ int[] values;

        static {
            int[] iArr = new int[AppsFlyerProperties.EmailsCryptType.values().length];
            values = iArr;
            try {
                iArr[AppsFlyerProperties.EmailsCryptType.SHA256.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                values[AppsFlyerProperties.EmailsCryptType.NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* loaded from: classes.dex */
    class AFa1vSDK implements AFd1zSDK {
        private AFa1vSDK() {
        }

        private static boolean AFInAppEventParameterName() {
            if (AFb1zSDK.valueOf != null) {
                return true;
            }
            return false;
        }

        @Override // com.appsflyer.internal.AFd1zSDK
        public final void AFInAppEventType(AFd1tSDK<?> aFd1tSDK, AFc1aSDK aFc1aSDK) {
            JSONObject AFKeystoreWrapper;
            AFb1sSDK valueOf;
            if (aFd1tSDK instanceof AFd1eSDK) {
                AFd1eSDK aFd1eSDK = (AFd1eSDK) aFd1tSDK;
                boolean z = aFd1tSDK instanceof AFd1iSDK;
                if (z && AFInAppEventParameterName()) {
                    AFd1iSDK aFd1iSDK = (AFd1iSDK) aFd1tSDK;
                    if (aFd1iSDK.AFInAppEventType == AFc1aSDK.SUCCESS || aFd1iSDK.valueOf == 1) {
                        Context context = AFb1zSDK.valueOf(AFb1zSDK.this).valueOf.values;
                        if (context != null) {
                            AFe1qSDK aFe1qSDK = new AFe1qSDK(aFd1iSDK, new AFb1eSDK(AFb1zSDK.AFInAppEventType(context)));
                            AFd1xSDK afDebugLog = AFb1zSDK.valueOf(AFb1zSDK.this).afDebugLog();
                            afDebugLog.AFKeystoreWrapper.execute(new AFd1xSDK.AnonymousClass2(aFe1qSDK));
                        } else {
                            throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
                        }
                    }
                }
                if (aFc1aSDK == AFc1aSDK.SUCCESS) {
                    AFb1zSDK aFb1zSDK = AFb1zSDK.this;
                    aFb1zSDK.AFInAppEventParameterName(AFb1zSDK.values(aFb1zSDK)).AFInAppEventParameterName("sentSuccessfully", tmb.h.TRUE_JSON_NAME);
                    if (!(aFd1tSDK instanceof AFd1gSDK) && (valueOf = new AFe1pSDK(AFb1zSDK.values(AFb1zSDK.this)).valueOf()) != null && valueOf.AFInAppEventType()) {
                        String str = valueOf.AFInAppEventParameterName;
                        AFLogger.afDebugLog("Resending Uninstall token to AF servers: ".concat(String.valueOf(str)));
                        AFe1pSDK.valueOf(str);
                    }
                    ResponseNetwork responseNetwork = ((AFd1kSDK) aFd1eSDK).afDebugLog;
                    if (responseNetwork != null && (AFKeystoreWrapper = AFb1tSDK.AFKeystoreWrapper((String) responseNetwork.getBody())) != null) {
                        AFb1zSDK.valueOf(AFb1zSDK.this, AFKeystoreWrapper.optBoolean("send_background", false));
                    }
                    if (z) {
                        AFb1zSDK.AFInAppEventType(AFb1zSDK.this, System.currentTimeMillis());
                    }
                }
            } else if ((aFd1tSDK instanceof AFe1qSDK) && aFc1aSDK != AFc1aSDK.SUCCESS) {
                AFe1sSDK aFe1sSDK = new AFe1sSDK(AFb1zSDK.valueOf(AFb1zSDK.this));
                AFd1xSDK afDebugLog2 = AFb1zSDK.valueOf(AFb1zSDK.this).afDebugLog();
                afDebugLog2.AFKeystoreWrapper.execute(new AFd1xSDK.AnonymousClass2(aFe1sSDK));
            }
        }

        @Override // com.appsflyer.internal.AFd1zSDK
        public final void AFKeystoreWrapper(AFd1tSDK<?> aFd1tSDK) {
            if (aFd1tSDK instanceof AFd1iSDK) {
                AFb1zSDK.this.AFInAppEventParameterName().afRDLog().AFInAppEventParameterName(((AFd1eSDK) aFd1tSDK).AFLogger.afDebugLog);
            }
        }

        /* synthetic */ AFa1vSDK(AFb1zSDK aFb1zSDK, byte b) {
            this();
        }

        @Override // com.appsflyer.internal.AFd1zSDK
        public final void valueOf(AFd1tSDK<?> aFd1tSDK) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class AFa1xSDK implements Runnable {
        private final AFa1sSDK valueOf;

        /* synthetic */ AFa1xSDK(AFb1zSDK aFb1zSDK, AFa1sSDK aFa1sSDK, byte b) {
            this(aFa1sSDK);
        }

        @Override // java.lang.Runnable
        public final void run() {
            AFb1zSDK.AFInAppEventType(AFb1zSDK.this, this.valueOf);
        }

        private AFa1xSDK(AFa1sSDK aFa1sSDK) {
            this.valueOf = aFa1sSDK;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class AFa1zSDK implements Runnable {
        private final AFa1sSDK values;

        /* synthetic */ AFa1zSDK(AFb1zSDK aFb1zSDK, AFa1sSDK aFa1sSDK, byte b) {
            this(aFa1sSDK);
        }

        @Override // java.lang.Runnable
        public final void run() {
            AFd1iSDK aFd1iSDK;
            if (this.values.AFKeystoreWrapper()) {
                AFd1iSDK aFd1iSDK2 = new AFd1iSDK(this.values, AFb1zSDK.this.AFInAppEventParameterName());
                aFd1iSDK2.AFVersionDeclaration = AFb1zSDK.AFInAppEventParameterName(AFb1zSDK.this);
                aFd1iSDK = aFd1iSDK2;
            } else {
                aFd1iSDK = new AFd1eSDK(this.values, AFb1zSDK.this.AFInAppEventParameterName());
            }
            AFd1xSDK afDebugLog = AFb1zSDK.this.AFInAppEventParameterName().afDebugLog();
            afDebugLog.AFKeystoreWrapper.execute(new AFd1xSDK.AnonymousClass2(aFd1iSDK));
        }

        private AFa1zSDK(AFa1sSDK aFa1sSDK) {
            this.values = aFa1sSDK;
        }
    }

    static {
        valueOf();
        AFInAppEventType = "228";
        Object[] objArr = new Object[1];
        AFInAppEventParameterName((char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 36816), 1 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 33 - ((Process.getThreadPriority(0) + 20) >> 6), objArr);
        String substring = "6.10.0".substring(0, "6.10.0".lastIndexOf(((String) objArr[0]).intern()));
        AFKeystoreWrapper = substring;
        AFLogger = "https://%sstats.%s/stats";
        StringBuilder sb = new StringBuilder();
        sb.append(substring);
        sb.append("/androidevent?buildnumber=6.10.0&app_id=");
        AFInAppEventParameterName = sb.toString();
        afErrorLog = "https://%sadrevenue.%s/api/v2/generic/v6.10.0/android?app_id=";
        StringBuilder sb2 = new StringBuilder();
        sb2.append(substring);
        sb2.append("/androidevent?app_id=");
        String obj = sb2.toString();
        afInfoLog = obj;
        StringBuilder sb3 = new StringBuilder("https://%sconversions.%s/api/v");
        sb3.append(obj);
        AFVersionDeclaration = sb3.toString();
        StringBuilder sb4 = new StringBuilder("https://%slaunches.%s/api/v");
        sb4.append(obj);
        AFLogger$LogLevel = sb4.toString();
        StringBuilder sb5 = new StringBuilder("https://%sinapps.%s/api/v");
        sb5.append(obj);
        getLevel = sb5.toString();
        StringBuilder sb6 = new StringBuilder("https://%sattr.%s/api/v");
        sb6.append(obj);
        afWarnLog = sb6.toString();
        values = null;
        valueOf = null;
        afErrorLogForExcManagerOnly = new AFb1zSDK();
        int i = getSdkVersion + 43;
        onPause = i % 128;
        if (i % 2 == 0) {
            return;
        }
        throw null;
    }

    @VisibleForTesting
    public AFb1zSDK() {
        AFVersionDeclaration.init();
        AFb1bSDK aFb1bSDK = new AFb1bSDK();
        this.onResponseError = aFb1bSDK;
        AFd1xSDK afDebugLog = aFb1bSDK.afDebugLog();
        afDebugLog.AFInAppEventParameterName.add(new AFa1vSDK(this, (byte) 0));
    }

    static /* synthetic */ Map AFInAppEventParameterName(AFb1zSDK aFb1zSDK) {
        int i = onPause + 7;
        getSdkVersion = i % 128;
        int i2 = i % 2;
        Map<String, Object> map = aFb1zSDK.onAttributionFailure;
        if (i2 != 0) {
            return map;
        }
        throw null;
    }

    static /* synthetic */ long AFInAppEventType(AFb1zSDK aFb1zSDK, long j) {
        int i = onPause;
        int i2 = i + 35;
        getSdkVersion = i2 % 128;
        int i3 = i2 % 2;
        aFb1zSDK.init = j;
        if (i3 == 0) {
            int i4 = 20 / 0;
        }
        int i5 = i + 49;
        getSdkVersion = i5 % 128;
        if (i5 % 2 != 0) {
            return j;
        }
        throw null;
    }

    static /* synthetic */ void AFKeystoreWrapper(AFb1zSDK aFb1zSDK) {
        int i = onPause + 45;
        getSdkVersion = i % 128;
        int i2 = i % 2;
        aFb1zSDK.afInfoLog();
        if (i2 == 0) {
            int i3 = 39 / 0;
        }
    }

    private void AFLogger(Context context) {
        this.onAttributionFailure = new HashMap();
        final long currentTimeMillis = System.currentTimeMillis();
        final AFa1rSDK.AFa1vSDK aFa1vSDK = new AFa1rSDK.AFa1vSDK() { // from class: com.appsflyer.internal.AFb1zSDK.3
            @Override // com.appsflyer.internal.AFa1rSDK.AFa1vSDK
            public final void AFKeystoreWrapper(String str) {
                AFb1zSDK.AFInAppEventParameterName(AFb1zSDK.this).put("error", str);
            }

            @Override // com.appsflyer.internal.AFa1rSDK.AFa1vSDK
            public final void values(String str, String str2, String str3) {
                if (str != null) {
                    AFLogger.afInfoLog("Facebook Deferred AppLink data received: ".concat(str));
                    AFb1zSDK.AFInAppEventParameterName(AFb1zSDK.this).put(ElementGenerator.TYPE_LINK, str);
                    if (str2 != null) {
                        AFb1zSDK.AFInAppEventParameterName(AFb1zSDK.this).put("target_url", str2);
                    }
                    if (str3 != null) {
                        HashMap hashMap = new HashMap();
                        HashMap hashMap2 = new HashMap();
                        hashMap2.put("promo_code", str3);
                        hashMap.put("deeplink_context", hashMap2);
                        AFb1zSDK.AFInAppEventParameterName(AFb1zSDK.this).put("extras", hashMap);
                    }
                } else {
                    AFb1zSDK.AFInAppEventParameterName(AFb1zSDK.this).put(ElementGenerator.TYPE_LINK, "");
                }
                AFb1zSDK.AFInAppEventParameterName(AFb1zSDK.this).put("ttr", String.valueOf(System.currentTimeMillis() - currentTimeMillis));
            }
        };
        try {
            Class.forName("com.facebook.FacebookSdk").getMethod("sdkInitialize", Context.class).invoke(null, context);
            final Class<?> cls = Class.forName("com.facebook.applinks.AppLinkData");
            Class<?> cls2 = Class.forName("com.facebook.applinks.AppLinkData$CompletionHandler");
            Method method = cls.getMethod("fetchDeferredAppLinkData", Context.class, String.class, cls2);
            Object newProxyInstance = Proxy.newProxyInstance(cls2.getClassLoader(), new Class[]{cls2}, new InvocationHandler() { // from class: com.appsflyer.internal.AFa1rSDK.2
                @Override // java.lang.reflect.InvocationHandler
                public final Object invoke(Object obj, Method method2, Object[] objArr) throws Throwable {
                    String str;
                    String str2;
                    String str3;
                    Bundle bundle;
                    if (method2.getName().equals("onDeferredAppLinkDataFetched")) {
                        Object obj2 = objArr[0];
                        if (obj2 != null) {
                            Bundle bundle2 = (Bundle) Bundle.class.cast(cls.getMethod("getArgumentBundle", new Class[0]).invoke(cls.cast(obj2), new Object[0]));
                            if (bundle2 != null) {
                                str2 = bundle2.getString("com.facebook.platform.APPLINK_NATIVE_URL");
                                str3 = bundle2.getString("target_url");
                                Bundle bundle3 = bundle2.getBundle("extras");
                                if (bundle3 != null && (bundle = bundle3.getBundle("deeplink_context")) != null) {
                                    str = bundle.getString("promo_code");
                                } else {
                                    str = null;
                                }
                            } else {
                                str = null;
                                str2 = null;
                                str3 = null;
                            }
                            AFa1vSDK aFa1vSDK2 = aFa1vSDK;
                            if (aFa1vSDK2 != null) {
                                aFa1vSDK2.values(str2, str3, str);
                            }
                        } else {
                            AFa1vSDK aFa1vSDK3 = aFa1vSDK;
                            if (aFa1vSDK3 != null) {
                                aFa1vSDK3.values(null, null, null);
                            }
                        }
                        return null;
                    }
                    AFa1vSDK aFa1vSDK4 = aFa1vSDK;
                    if (aFa1vSDK4 != null) {
                        aFa1vSDK4.AFKeystoreWrapper("onDeferredAppLinkDataFetched invocation failed");
                    }
                    return null;
                }
            });
            String string = context.getString(context.getResources().getIdentifier("facebook_app_id", "string", context.getPackageName()));
            if (TextUtils.isEmpty(string)) {
                int i = onPause + 89;
                getSdkVersion = i % 128;
                if (i % 2 == 0) {
                    aFa1vSDK.AFKeystoreWrapper("Facebook app id not defined in resources");
                    int i2 = 67 / 0;
                    return;
                }
                aFa1vSDK.AFKeystoreWrapper("Facebook app id not defined in resources");
                return;
            }
            method.invoke(null, context, string, newProxyInstance);
            int i3 = getSdkVersion + 55;
            onPause = i3 % 128;
            int i4 = i3 % 2;
        } catch (ClassNotFoundException e) {
            AFLogger.afErrorLogForExcManagerOnly("FB class missing error", e);
            aFa1vSDK.AFKeystoreWrapper(e.toString());
        } catch (IllegalAccessException e2) {
            AFLogger.afErrorLogForExcManagerOnly("FB illegal access", e2);
            aFa1vSDK.AFKeystoreWrapper(e2.toString());
        } catch (NoSuchMethodException e3) {
            AFLogger.afErrorLogForExcManagerOnly("FB method missing error", e3);
            aFa1vSDK.AFKeystoreWrapper(e3.toString());
        } catch (InvocationTargetException e4) {
            AFLogger.afErrorLogForExcManagerOnly("FB invocation error", e4);
            aFa1vSDK.AFKeystoreWrapper(e4.toString());
        }
    }

    private String AFLogger$LogLevel(Context context) {
        SharedPreferences AFInAppEventType2 = AFInAppEventType(context);
        String str = null;
        if (AFInAppEventType2.contains("INSTALL_STORE")) {
            int i = getSdkVersion + 93;
            onPause = i % 128;
            int i2 = i % 2;
            return AFInAppEventType2.getString("INSTALL_STORE", null);
        }
        if (afRDLog(context)) {
            int i3 = getSdkVersion + 89;
            onPause = i3 % 128;
            int i4 = i3 % 2;
            str = AFVersionDeclaration(context);
        }
        AFInAppEventParameterName(context).AFInAppEventParameterName("INSTALL_STORE", str);
        return str;
    }

    private String AFVersionDeclaration(Context context) {
        int i = getSdkVersion + 99;
        onPause = i % 128;
        int i2 = i % 2;
        String string = AppsFlyerProperties.getInstance().getString("api_store_value");
        if (string != null) {
            int i3 = getSdkVersion + 59;
            onPause = i3 % 128;
            if (i3 % 2 == 0) {
                return string;
            }
            throw null;
        }
        String AFInAppEventType2 = AFInAppEventType(context, "AF_STORE");
        int i4 = getSdkVersion + 59;
        onPause = i4 % 128;
        int i5 = i4 % 2;
        return AFInAppEventType2;
    }

    private static void afDebugLog(Context context) {
        int i;
        if (AFa1dSDK.values()) {
            AFLogger.afRDLog("OPPO device found");
            i = 23;
        } else {
            i = 18;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= i && !AFInAppEventParameterName(AppsFlyerProperties.DISABLE_KEYSTORE, true)) {
            StringBuilder sb = new StringBuilder("OS SDK is=");
            sb.append(i2);
            sb.append("; use KeyStore");
            AFLogger.afRDLog(sb.toString());
            AFKeystoreWrapper aFKeystoreWrapper = new AFKeystoreWrapper(context);
            if (!aFKeystoreWrapper.AFKeystoreWrapper()) {
                aFKeystoreWrapper.AFInAppEventParameterName = AFb1xSDK.AFInAppEventParameterName(new WeakReference(context));
                aFKeystoreWrapper.AFKeystoreWrapper = 0;
                aFKeystoreWrapper.AFKeystoreWrapper(aFKeystoreWrapper.AFInAppEventParameterName());
            } else {
                String AFInAppEventParameterName2 = aFKeystoreWrapper.AFInAppEventParameterName();
                synchronized (aFKeystoreWrapper.valueOf) {
                    aFKeystoreWrapper.AFKeystoreWrapper++;
                    AFLogger.afInfoLog("Deleting key with alias: ".concat(String.valueOf(AFInAppEventParameterName2)));
                    try {
                        synchronized (aFKeystoreWrapper.valueOf) {
                            aFKeystoreWrapper.AFInAppEventType.deleteEntry(AFInAppEventParameterName2);
                        }
                    } catch (KeyStoreException e) {
                        StringBuilder sb2 = new StringBuilder("Exception ");
                        sb2.append(e.getMessage());
                        sb2.append(" occurred");
                        AFLogger.afErrorLog(sb2.toString(), e);
                    }
                }
                aFKeystoreWrapper.AFKeystoreWrapper(aFKeystoreWrapper.AFInAppEventParameterName());
            }
            AFKeystoreWrapper("KSAppsFlyerId", aFKeystoreWrapper.valueOf());
            AFKeystoreWrapper("KSAppsFlyerRICounter", String.valueOf(aFKeystoreWrapper.AFInAppEventType()));
            return;
        }
        StringBuilder sb3 = new StringBuilder("OS SDK is=");
        sb3.append(i2);
        sb3.append("; no KeyStore usage");
        AFLogger.afRDLog(sb3.toString());
    }

    private static void afErrorLog(Context context) {
        int i = onPause + 71;
        getSdkVersion = i % 128;
        int i2 = i % 2;
        try {
            if ((context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo.flags & 32768) != 0) {
                if (context.getResources().getIdentifier("appsflyer_backup_rules", "xml", context.getPackageName()) != 0) {
                    int i3 = onPause + 111;
                    getSdkVersion = i3 % 128;
                    int i4 = i3 % 2;
                    AFLogger.afInfoLog("appsflyer_backup_rules.xml detected, using AppsFlyer defined backup rules for AppsFlyer SDK data", true);
                    return;
                }
                AFLogger.values("'allowBackup' is set to true; appsflyer_backup_rules.xml not detected.\nAppsFlyer shared preferences should be excluded from auto backup by adding: <exclude domain=\"sharedpref\" path=\"appsflyer-data\"/> to the Application's <full-backup-content> rules");
            }
            int i5 = getSdkVersion + 73;
            onPause = i5 % 128;
            int i6 = i5 % 2;
        } catch (Exception e) {
            AFLogger.afErrorLogForExcManagerOnly("checkBackupRules Exception", e);
            AFLogger.afRDLog("checkBackupRules Exception: ".concat(String.valueOf(e)));
        }
    }

    private String afErrorLogForExcManagerOnly(Context context) {
        File afDebugLog = afDebugLog(AFKeystoreWrapper("ro.appsflyer.preinstall.path"));
        if (!(!AFInAppEventParameterName(afDebugLog))) {
            afDebugLog = afDebugLog(AFInAppEventType(context, "AF_PRE_INSTALL_PATH"));
        }
        if (AFInAppEventParameterName(afDebugLog)) {
            afDebugLog = afDebugLog("/data/local/tmp/pre_install.appsflyer");
            int i = onPause + 79;
            getSdkVersion = i % 128;
            int i2 = i % 2;
        }
        if (AFInAppEventParameterName(afDebugLog)) {
            int i3 = onPause + 17;
            getSdkVersion = i3 % 128;
            if (i3 % 2 != 0) {
                afDebugLog = afDebugLog("/etc/pre_install.appsflyer");
            } else {
                afDebugLog("/etc/pre_install.appsflyer");
                throw null;
            }
        }
        if (AFInAppEventParameterName(afDebugLog)) {
            int i4 = onPause + 61;
            getSdkVersion = i4 % 128;
            int i5 = i4 % 2;
            return null;
        }
        return AFKeystoreWrapper(afDebugLog, context.getPackageName());
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0055 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean afInfoLog(android.content.Context r4) {
        /*
            int r0 = com.appsflyer.internal.AFb1zSDK.onPause
            int r0 = r0 + 19
            int r1 = r0 % 128
            com.appsflyer.internal.AFb1zSDK.getSdkVersion = r1
            int r0 = r0 % 2
            java.lang.String r1 = "collectAndroidIdForceByUser"
            r2 = 0
            r3 = 1
            if (r0 != 0) goto L1b
            com.appsflyer.AppsFlyerProperties r0 = com.appsflyer.AppsFlyerProperties.getInstance()
            boolean r0 = r0.getBoolean(r1, r3)
            if (r0 != 0) goto L3e
            goto L25
        L1b:
            com.appsflyer.AppsFlyerProperties r0 = com.appsflyer.AppsFlyerProperties.getInstance()
            boolean r0 = r0.getBoolean(r1, r2)
            if (r0 != 0) goto L3e
        L25:
            int r0 = com.appsflyer.internal.AFb1zSDK.onPause
            int r0 = r0 + 103
            int r1 = r0 % 128
            com.appsflyer.internal.AFb1zSDK.getSdkVersion = r1
            int r0 = r0 % 2
            com.appsflyer.AppsFlyerProperties r0 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r1 = "collectIMEIForceByUser"
            boolean r0 = r0.getBoolean(r1, r2)
            if (r0 == 0) goto L3c
            goto L3e
        L3c:
            r0 = 0
            goto L3f
        L3e:
            r0 = 1
        L3f:
            r0 = r0 ^ r3
            if (r0 == 0) goto L4a
            boolean r4 = values(r4)
            if (r4 != 0) goto L49
            goto L4a
        L49:
            return r2
        L4a:
            int r4 = com.appsflyer.internal.AFb1zSDK.onPause
            int r4 = r4 + r3
            int r0 = r4 % 128
            com.appsflyer.internal.AFb1zSDK.getSdkVersion = r0
            int r4 = r4 % 2
            if (r4 == 0) goto L56
            return r3
        L56:
            r4 = 0
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1zSDK.afInfoLog(android.content.Context):boolean");
    }

    private static boolean afRDLog(Context context) {
        if (!AFInAppEventType(context).contains("appsFlyerCount")) {
            int i = getSdkVersion;
            int i2 = i + 67;
            onPause = i2 % 128;
            int i3 = i2 % 2;
            int i4 = i + 55;
            onPause = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 30 / 0;
            }
            return true;
        }
        return false;
    }

    private String afWarnLog(Context context) {
        String str;
        SharedPreferences AFInAppEventType2 = AFInAppEventType(context);
        String AFInAppEventParameterName2 = AFInAppEventParameterName("preInstallName");
        if (AFInAppEventParameterName2 != null) {
            return AFInAppEventParameterName2;
        }
        if (AFInAppEventType2.contains("preInstallName")) {
            str = AFInAppEventType2.getString("preInstallName", null);
        } else {
            if (!(!afRDLog(context))) {
                int i = onPause + 119;
                getSdkVersion = i % 128;
                int i2 = i % 2;
                AFInAppEventParameterName2 = afErrorLogForExcManagerOnly(context);
                if (AFInAppEventParameterName2 == null) {
                    AFInAppEventParameterName2 = AFInAppEventType(context, "AF_PRE_INSTALL_NAME");
                    int i3 = onPause + 61;
                    getSdkVersion = i3 % 128;
                    int i4 = i3 % 2;
                }
            }
            if (AFInAppEventParameterName2 != null) {
                int i5 = onPause + 81;
                getSdkVersion = i5 % 128;
                int i6 = i5 % 2;
                AFInAppEventParameterName(context).AFInAppEventParameterName("preInstallName", AFInAppEventParameterName2);
            }
            str = AFInAppEventParameterName2;
        }
        if (str != null) {
            int i7 = onPause + 45;
            getSdkVersion = i7 % 128;
            if (i7 % 2 != 0) {
                AFKeystoreWrapper("preInstallName", str);
            } else {
                AFKeystoreWrapper("preInstallName", str);
                throw null;
            }
        }
        return str;
    }

    private long getLevel(Context context) {
        int i = onPause + 89;
        getSdkVersion = i % 128;
        int i2 = i % 2;
        long j = AFInAppEventType(context).getLong("AppsFlyerTimePassedSincePrevLaunch", 0L);
        long currentTimeMillis = System.currentTimeMillis();
        AFInAppEventParameterName(context).AFInAppEventType("AppsFlyerTimePassedSincePrevLaunch", currentTimeMillis);
        if (j > 0) {
            long j2 = currentTimeMillis - j;
            int i3 = onPause + 101;
            getSdkVersion = i3 % 128;
            if (i3 % 2 == 0) {
                return j2 * 1000;
            }
            return j2 / 1000;
        }
        return -1L;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0070 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x007b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean onInstallConversionDataLoadedNative(android.content.Context r8) {
        /*
            r0 = 0
            if (r8 == 0) goto Lc6
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 23
            java.lang.String r3 = "Failed collecting ivc data"
            r4 = 1
            if (r1 < r2) goto L83
            int r1 = com.appsflyer.internal.AFb1zSDK.getSdkVersion
            int r1 = r1 + 59
            int r2 = r1 % 128
            com.appsflyer.internal.AFb1zSDK.onPause = r2
            int r1 = r1 % 2
            java.lang.String r2 = "connectivity"
            if (r1 == 0) goto L29
            java.lang.Object r8 = r8.getSystemService(r2)     // Catch: java.lang.Exception -> L27
            android.net.ConnectivityManager r8 = (android.net.ConnectivityManager) r8     // Catch: java.lang.Exception -> L27
            android.net.Network[] r1 = r8.getAllNetworks()     // Catch: java.lang.Exception -> L27
            int r2 = r1.length     // Catch: java.lang.Exception -> L27
            r5 = 1
            goto L35
        L27:
            r8 = move-exception
            goto L7f
        L29:
            java.lang.Object r8 = r8.getSystemService(r2)     // Catch: java.lang.Exception -> L27
            android.net.ConnectivityManager r8 = (android.net.ConnectivityManager) r8     // Catch: java.lang.Exception -> L27
            android.net.Network[] r1 = r8.getAllNetworks()     // Catch: java.lang.Exception -> L27
            int r2 = r1.length     // Catch: java.lang.Exception -> L27
            r5 = 0
        L35:
            int r6 = com.appsflyer.internal.AFb1zSDK.getSdkVersion
            int r6 = r6 + 101
            int r7 = r6 % 128
            com.appsflyer.internal.AFb1zSDK.onPause = r7
            int r6 = r6 % 2
        L3f:
            if (r5 >= r2) goto L7e
            int r6 = com.appsflyer.internal.AFb1zSDK.getSdkVersion
            int r6 = r6 + 91
            int r7 = r6 % 128
            com.appsflyer.internal.AFb1zSDK.onPause = r7
            int r6 = r6 % 2
            if (r6 == 0) goto L5b
            r6 = r1[r5]     // Catch: java.lang.Exception -> L27
            android.net.NetworkCapabilities r6 = r8.getNetworkCapabilities(r6)     // Catch: java.lang.Exception -> L27
            r7 = 3
            boolean r7 = r6.hasTransport(r7)     // Catch: java.lang.Exception -> L27
            if (r7 == 0) goto L7b
            goto L68
        L5b:
            r6 = r1[r5]     // Catch: java.lang.Exception -> L27
            android.net.NetworkCapabilities r6 = r8.getNetworkCapabilities(r6)     // Catch: java.lang.Exception -> L27
            r7 = 4
            boolean r7 = r6.hasTransport(r7)     // Catch: java.lang.Exception -> L27
            if (r7 == 0) goto L7b
        L68:
            r7 = 15
            boolean r6 = r6.hasCapability(r7)     // Catch: java.lang.Exception -> L27
            if (r6 != 0) goto L7b
            int r8 = com.appsflyer.internal.AFb1zSDK.onPause
            int r8 = r8 + 5
            int r0 = r8 % 128
            com.appsflyer.internal.AFb1zSDK.getSdkVersion = r0
            int r8 = r8 % 2
            return r4
        L7b:
            int r5 = r5 + 1
            goto L3f
        L7e:
            return r0
        L7f:
            com.appsflyer.AFLogger.afErrorLog(r3, r8)
            goto Lc6
        L83:
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Enumeration r1 = java.net.NetworkInterface.getNetworkInterfaces()     // Catch: java.lang.Exception -> Lba
            java.util.ArrayList r1 = java.util.Collections.list(r1)     // Catch: java.lang.Exception -> Lba
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Exception -> Lba
            int r2 = com.appsflyer.internal.AFb1zSDK.onPause
            int r2 = r2 + 75
            int r5 = r2 % 128
            com.appsflyer.internal.AFb1zSDK.getSdkVersion = r5
            int r2 = r2 % 2
        L9e:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Exception -> Lba
            if (r2 == 0) goto Lbc
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Exception -> Lba
            java.net.NetworkInterface r2 = (java.net.NetworkInterface) r2     // Catch: java.lang.Exception -> Lba
            boolean r5 = r2.isUp()     // Catch: java.lang.Exception -> Lba
            r5 = r5 ^ r4
            if (r5 == 0) goto Lb2
            goto L9e
        Lb2:
            java.lang.String r2 = r2.getName()     // Catch: java.lang.Exception -> Lba
            r8.add(r2)     // Catch: java.lang.Exception -> Lba
            goto L9e
        Lba:
            r8 = move-exception
            goto Lc3
        Lbc:
            java.lang.String r1 = "tun0"
            boolean r8 = r8.contains(r1)     // Catch: java.lang.Exception -> Lba
            return r8
        Lc3:
            com.appsflyer.AFLogger.afErrorLog(r3, r8)
        Lc6:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1zSDK.onInstallConversionDataLoadedNative(android.content.Context):boolean");
    }

    private static float onInstallConversionFailureNative(Context context) {
        try {
            Intent registerReceiver = context.getApplicationContext().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            int intExtra = registerReceiver.getIntExtra("level", -1);
            int intExtra2 = registerReceiver.getIntExtra("scale", -1);
            if (intExtra != -1) {
                int i = onPause + 73;
                int i2 = i % 128;
                getSdkVersion = i2;
                int i3 = i % 2;
                if (intExtra2 != -1) {
                    float f = (intExtra / intExtra2) * 100.0f;
                    int i4 = i2 + 67;
                    onPause = i4 % 128;
                    int i5 = i4 % 2;
                    return f;
                }
                return 50.0f;
            }
            return 50.0f;
        } catch (Throwable th) {
            AFLogger.afErrorLog(th.getMessage(), th);
            return 1.0f;
        }
    }

    static void valueOf() {
        AppsFlyerConversionListener = new char[]{'a', 23681, 47505, 5825, 29685, 53486, 11535, 35362, 59212, 17534, 41323, 64925, '1', 'b', 23701, 47535, 5851, 29688, 3581, 20757, 46119, 7005, 32371, 56660, 8336, 34751, 60109, 18919, 44277, 61490, 22318, 47700, 6492, 36862};
        onValidateInAppFailure = 1358861828806499559L;
    }

    static /* synthetic */ Application values(AFb1zSDK aFb1zSDK) {
        int i = getSdkVersion + 71;
        onPause = i % 128;
        int i2 = i % 2;
        Application application = aFb1zSDK.onDeepLinking;
        if (i2 == 0) {
            return application;
        }
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void addPushNotificationDeepLinkPath(String... strArr) {
        int i = onPause + 107;
        getSdkVersion = i % 128;
        if (i % 2 != 0) {
            List<String> asList = Arrays.asList(strArr);
            List<List<String>> list = AFa1qSDK.AFInAppEventParameterName().afDebugLog;
            if (!list.contains(asList)) {
                list.add(asList);
                int i2 = getSdkVersion + 109;
                onPause = i2 % 128;
                int i3 = i2 % 2;
                return;
            }
            return;
        }
        AFa1qSDK.AFInAppEventParameterName().afDebugLog.contains(Arrays.asList(strArr));
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void anonymizeUser(boolean z) {
        int i = onPause + 69;
        getSdkVersion = i % 128;
        if (i % 2 == 0) {
            AFb1uSDK AFInAppEventType2 = AFb1uSDK.AFInAppEventType();
            String[] strArr = new String[0];
            strArr[1] = String.valueOf(z);
            AFInAppEventType2.AFKeystoreWrapper("anonymizeUser", strArr);
        } else {
            AFb1uSDK.AFInAppEventType().AFKeystoreWrapper("anonymizeUser", String.valueOf(z));
        }
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, z);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void appendParametersToDeepLinkingURL(String str, Map<String, String> map) {
        int i = getSdkVersion + 93;
        onPause = i % 128;
        if (i % 2 != 0) {
            AFa1qSDK AFInAppEventParameterName2 = AFa1qSDK.AFInAppEventParameterName();
            AFInAppEventParameterName2.valueOf = str;
            AFInAppEventParameterName2.afErrorLog = map;
            int i2 = 61 / 0;
        } else {
            AFa1qSDK AFInAppEventParameterName3 = AFa1qSDK.AFInAppEventParameterName();
            AFInAppEventParameterName3.valueOf = str;
            AFInAppEventParameterName3.afErrorLog = map;
        }
        int i3 = onPause + 39;
        getSdkVersion = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void enableFacebookDeferredApplinks(boolean z) {
        int i = onPause + 45;
        getSdkVersion = i % 128;
        int i2 = i % 2;
        this.onConversionDataFail = z;
        if (i2 != 0) {
            return;
        }
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Nullable
    public final String getAppsFlyerUID(@NonNull Context context) {
        int i = onPause + 5;
        getSdkVersion = i % 128;
        int i2 = i % 2;
        AFb1uSDK.AFInAppEventType().AFKeystoreWrapper("getAppsFlyerUID", new String[0]);
        if (context == null) {
            int i3 = onPause + 119;
            getSdkVersion = i3 % 128;
            int i4 = i3 % 2;
            return null;
        }
        AFb1bSDK aFb1bSDK = this.onResponseError;
        if (context != null) {
            AFc1ySDK aFc1ySDK = aFb1bSDK.valueOf;
            if (context != null) {
                aFc1ySDK.values = context.getApplicationContext();
            }
        }
        return AFb1xSDK.AFInAppEventParameterName(new WeakReference(this.onResponseError.values().valueOf.values));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getAttributionId(Context context) {
        try {
            String AFInAppEventParameterName2 = new AFb1ySDK(context, AFInAppEventParameterName()).AFInAppEventParameterName();
            int i = getSdkVersion + 103;
            onPause = i % 128;
            int i2 = i % 2;
            return AFInAppEventParameterName2;
        } catch (Throwable th) {
            AFLogger.afErrorLog("Could not collect facebook attribution id. ", th);
            return null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getHostName() {
        int i = getSdkVersion + 91;
        onPause = i % 128;
        if (i % 2 == 0) {
            return AFInAppEventParameterName().AppsFlyer2dXConversionCallback().AFKeystoreWrapper();
        }
        AFInAppEventParameterName().AppsFlyer2dXConversionCallback().AFKeystoreWrapper();
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getHostPrefix() {
        int i = onPause + 53;
        getSdkVersion = i % 128;
        if (i % 2 != 0) {
            String AFInAppEventParameterName2 = AFInAppEventParameterName().AppsFlyer2dXConversionCallback().AFInAppEventParameterName();
            int i2 = onPause + 83;
            getSdkVersion = i2 % 128;
            if (i2 % 2 != 0) {
                return AFInAppEventParameterName2;
            }
            throw null;
        }
        AFInAppEventParameterName().AppsFlyer2dXConversionCallback().AFInAppEventParameterName();
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getOutOfStore(Context context) {
        int i = onPause + 25;
        getSdkVersion = i % 128;
        if (i % 2 != 0) {
            String string = AppsFlyerProperties.getInstance().getString("api_store_value");
            if (string != null) {
                int i2 = getSdkVersion + 43;
                int i3 = i2 % 128;
                onPause = i3;
                if (i2 % 2 == 0) {
                    int i4 = i3 + 61;
                    getSdkVersion = i4 % 128;
                    int i5 = i4 % 2;
                    return string;
                }
                throw null;
            }
            String AFInAppEventType2 = AFInAppEventType(context, "AF_STORE");
            if (AFInAppEventType2 != null) {
                return AFInAppEventType2;
            }
            AFLogger.afInfoLog("No out-of-store value set");
            return null;
        }
        AppsFlyerProperties.getInstance().getString("api_store_value");
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getSdkVersion() {
        AFc1xSDK AFInAppEventParameterName2;
        int i = getSdkVersion + 45;
        onPause = i % 128;
        if (i % 2 != 0) {
            AFInAppEventParameterName2 = AFInAppEventParameterName();
            AFInAppEventParameterName2.AFLogger$LogLevel().AFKeystoreWrapper("getSdkVersion", new String[1]);
        } else {
            AFInAppEventParameterName2 = AFInAppEventParameterName();
            AFInAppEventParameterName2.AFLogger$LogLevel().AFKeystoreWrapper("getSdkVersion", new String[0]);
        }
        AFInAppEventParameterName2.values();
        return AFb1fSDK.valueOf();
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final AppsFlyerLib init(@NonNull String str, AppsFlyerConversionListener appsFlyerConversionListener, @NonNull Context context) {
        String str2;
        if (this.onAttributionFailureNative) {
            return this;
        }
        this.onAttributionFailureNative = true;
        this.onResponseError.AFVersionDeclaration().AFInAppEventType = str;
        AFc1sSDK.values(str);
        if (context != null) {
            this.onDeepLinking = (Application) context.getApplicationContext();
            AFb1bSDK aFb1bSDK = this.onResponseError;
            int i = getSdkVersion + 103;
            onPause = i % 128;
            int i2 = i % 2;
            aFb1bSDK.valueOf.values = context.getApplicationContext();
            AFInAppEventParameterName().afRDLog().AFInAppEventType = System.currentTimeMillis();
            AFInAppEventParameterName().onInstallConversionDataLoadedNative().valueOf();
            AFInAppEventParameterName().afInfoLog().AFInAppEventType(new AFd1dSDK() { // from class: com.appsflyer.internal.e
                @Override // com.appsflyer.internal.AFd1dSDK
                public final void onRemoteConfigUpdateFinished(AFd1aSDK aFd1aSDK) {
                    AFb1zSDK.this.AFInAppEventType(aFd1aSDK);
                }
            });
            AFf1sSDK level = AFInAppEventParameterName().getLevel();
            final AFf1ySDK aFf1ySDK = new AFf1ySDK(new AnonymousClass1());
            Runnable runnable = new Runnable() { // from class: com.appsflyer.internal.AFb1zSDK.2
                @Override // java.lang.Runnable
                public final void run() {
                    SharedPreferences AFInAppEventType2 = AFb1zSDK.AFInAppEventType(AFb1zSDK.values(AFb1zSDK.this));
                    boolean z = false;
                    int AFInAppEventParameterName2 = AFb1zSDK.AFInAppEventParameterName(AFInAppEventType2, false);
                    boolean z2 = AFInAppEventType2.getBoolean(AppsFlyerProperties.NEW_REFERRER_SENT, false);
                    if (aFf1ySDK.afDebugLog == AFf1uSDK.AFa1ySDK.NOT_STARTED) {
                        z = true;
                    }
                    if (AFInAppEventParameterName2 == 1) {
                        if (z || z2) {
                            AFb1zSDK aFb1zSDK = AFb1zSDK.this;
                            AFe1hSDK aFe1hSDK = new AFe1hSDK();
                            Application values2 = AFb1zSDK.values(AFb1zSDK.this);
                            if (values2 != null) {
                                aFe1hSDK.AFKeystoreWrapper = (Application) values2.getApplicationContext();
                            }
                            AFb1zSDK.AFInAppEventType(aFb1zSDK, aFe1hSDK);
                        }
                    }
                }
            };
            level.AFKeystoreWrapper(aFf1ySDK);
            level.AFKeystoreWrapper(new AFf1oSDK(runnable));
            level.AFKeystoreWrapper(new AFf1tSDK(runnable, AFInAppEventParameterName()));
            level.AFKeystoreWrapper(new AFf1qSDK(runnable, AFInAppEventParameterName()));
            Application application = this.onDeepLinking;
            AFc1xSDK AFInAppEventParameterName2 = AFInAppEventParameterName();
            List<ResolveInfo> queryIntentContentProviders = application.getPackageManager().queryIntentContentProviders(new Intent("com.appsflyer.referrer.INSTALL_PROVIDER"), 0);
            if (queryIntentContentProviders != null && !queryIntentContentProviders.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                for (ResolveInfo resolveInfo : queryIntentContentProviders) {
                    ProviderInfo providerInfo = resolveInfo.providerInfo;
                    if (providerInfo != null) {
                        arrayList.add(new AFf1rSDK(providerInfo, runnable, AFInAppEventParameterName2));
                    } else {
                        AFLogger.afWarnLog("[Preinstall]: com.appsflyer.referrer.INSTALL_PROVIDER Action is set for non ContentProvider component");
                    }
                }
                if (!arrayList.isEmpty()) {
                    level.values.addAll(arrayList);
                    StringBuilder sb = new StringBuilder("[Preinstall]: Detected ");
                    sb.append(arrayList.size());
                    sb.append(" valid preinstall provider(s)");
                    AFLogger.afDebugLog(sb.toString());
                }
            } else {
                int i3 = onPause + 69;
                getSdkVersion = i3 % 128;
                int i4 = i3 % 2;
            }
            for (AFf1uSDK aFf1uSDK : level.values()) {
                aFf1uSDK.AFInAppEventType(this.onDeepLinking);
            }
            this.onResponseError.AFVersionDeclaration().valueOf();
            AFb1iSDK.AFKeystoreWrapper = this.onDeepLinking;
        } else {
            AFLogger.afWarnLog("context is null, Google Install Referrer will be not initialized");
        }
        AFb1uSDK AFInAppEventType2 = AFb1uSDK.AFInAppEventType();
        String[] strArr = new String[2];
        strArr[0] = str;
        if (appsFlyerConversionListener == null) {
            int i5 = onPause + 93;
            getSdkVersion = i5 % 128;
            int i6 = i5 % 2;
            str2 = "null";
        } else {
            str2 = "conversionDataListener";
        }
        strArr[1] = str2;
        AFInAppEventType2.AFKeystoreWrapper("init", strArr);
        AFLogger.valueOf(String.format("Initializing AppsFlyer SDK: (v%s.%s)", "6.10.0", AFInAppEventType));
        valueOf = appsFlyerConversionListener;
        int i7 = onPause + 77;
        getSdkVersion = i7 % 128;
        int i8 = i7 % 2;
        return this;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final boolean isPreInstalledApp(Context context) {
        int i = getSdkVersion + 91;
        onPause = i % 128;
        int i2 = i % 2;
        try {
        } catch (PackageManager.NameNotFoundException e) {
            AFLogger.afErrorLog("Could not check if app is pre installed", e);
        }
        if ((context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).flags & 1) != 0) {
            return true;
        }
        int i3 = getSdkVersion + 29;
        onPause = i3 % 128;
        int i4 = i3 % 2;
        int i5 = onPause + 29;
        getSdkVersion = i5 % 128;
        if (i5 % 2 != 0) {
            return false;
        }
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final boolean isStopped() {
        int i = getSdkVersion + 69;
        onPause = i % 128;
        int i2 = i % 2;
        boolean AFKeystoreWrapper2 = this.onResponseError.AFVersionDeclaration().AFKeystoreWrapper();
        int i3 = onPause + 63;
        getSdkVersion = i3 % 128;
        int i4 = i3 % 2;
        return AFKeystoreWrapper2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logEvent(Context context, String str, Map<String, Object> map) {
        int i = getSdkVersion + 11;
        onPause = i % 128;
        int i2 = i % 2;
        logEvent(context, str, map, null);
        if (i2 != 0) {
            int i3 = 46 / 0;
        }
        int i4 = onPause + 71;
        getSdkVersion = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logLocation(Context context, double d, double d2) {
        AFb1uSDK.AFInAppEventType().AFKeystoreWrapper("logLocation", String.valueOf(d), String.valueOf(d2));
        HashMap hashMap = new HashMap();
        hashMap.put(AFInAppEventParameterName.LONGTITUDE, Double.toString(d2));
        hashMap.put(AFInAppEventParameterName.LATITUDE, Double.toString(d));
        values(context, AFInAppEventType.LOCATION_COORDINATES, hashMap);
        int i = onPause + 85;
        getSdkVersion = i % 128;
        if (i % 2 == 0) {
            int i2 = 86 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logSession(Context context) {
        int i = onPause + 121;
        getSdkVersion = i % 128;
        if (i % 2 == 0) {
            AFb1uSDK.AFInAppEventType().AFKeystoreWrapper("logSession", new String[0]);
        } else {
            AFb1uSDK.AFInAppEventType().AFKeystoreWrapper("logSession", new String[0]);
        }
        AFb1uSDK.AFInAppEventType().afRDLog();
        AFKeystoreWrapper(context, AFe1lSDK.logSession);
        values(context, null, null);
        int i2 = onPause + 87;
        getSdkVersion = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void onPause(Context context) {
        int i = onPause + 5;
        getSdkVersion = i % 128;
        int i2 = i % 2;
        AFb1wSDK.AFa1xSDK aFa1xSDK = AFb1wSDK.values;
        if (aFa1xSDK != null) {
            int i3 = getSdkVersion + 5;
            onPause = i3 % 128;
            int i4 = i3 % 2;
            aFa1xSDK.values(context);
            if (i4 != 0) {
                throw null;
            }
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final void performOnAppAttribution(@NonNull Context context, @NonNull URI uri) {
        int i = onPause + 107;
        int i2 = i % 128;
        getSdkVersion = i2;
        int i3 = i % 2;
        if (uri != null) {
            int i4 = i2 + 19;
            onPause = i4 % 128;
            int i5 = i4 % 2;
            if (!uri.toString().isEmpty()) {
                if (context == null) {
                    StringBuilder sb = new StringBuilder("Context is \"");
                    sb.append(context);
                    sb.append("\"");
                    AFb1oSDK.AFInAppEventType(sb.toString(), DeepLinkResult.Error.NETWORK);
                    return;
                }
                AFa1qSDK.AFInAppEventParameterName();
                AFa1qSDK.valueOf(context, new HashMap(), Uri.parse(uri.toString()));
                int i6 = getSdkVersion + 117;
                onPause = i6 % 128;
                int i7 = i6 % 2;
                return;
            }
        }
        StringBuilder sb2 = new StringBuilder("Link is \"");
        sb2.append(uri);
        sb2.append("\"");
        AFb1oSDK.AFInAppEventType(sb2.toString(), DeepLinkResult.Error.NETWORK);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0042, code lost:
        if (r5 != null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0047, code lost:
        if (r5 != null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0049, code lost:
        r0.values = r5.getApplicationContext();
     */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void performOnDeepLinking(@android.support.annotation.NonNull final android.content.Intent r4, @android.support.annotation.NonNull android.content.Context r5) {
        /*
            r3 = this;
            int r0 = com.appsflyer.internal.AFb1zSDK.onPause
            int r1 = r0 + 37
            int r2 = r1 % 128
            com.appsflyer.internal.AFb1zSDK.getSdkVersion = r2
            int r1 = r1 % 2
            if (r1 == 0) goto L5e
            if (r4 != 0) goto L16
            java.lang.String r4 = "performOnDeepLinking was called with null intent"
            com.appsflyer.deeplink.DeepLinkResult$Error r5 = com.appsflyer.deeplink.DeepLinkResult.Error.DEVELOPER_ERROR
            com.appsflyer.internal.AFb1oSDK.AFInAppEventType(r4, r5)
            return
        L16:
            if (r5 != 0) goto L28
            int r0 = r0 + 117
            int r4 = r0 % 128
            com.appsflyer.internal.AFb1zSDK.getSdkVersion = r4
            int r0 = r0 % 2
            java.lang.String r4 = "performOnDeepLinking was called with null context"
            com.appsflyer.deeplink.DeepLinkResult$Error r5 = com.appsflyer.deeplink.DeepLinkResult.Error.DEVELOPER_ERROR
            com.appsflyer.internal.AFb1oSDK.AFInAppEventType(r4, r5)
            return
        L28:
            android.content.Context r5 = r5.getApplicationContext()
            com.appsflyer.internal.AFb1bSDK r0 = r3.onResponseError
            if (r5 == 0) goto L4f
            int r1 = com.appsflyer.internal.AFb1zSDK.onPause
            int r1 = r1 + 105
            int r2 = r1 % 128
            com.appsflyer.internal.AFb1zSDK.getSdkVersion = r2
            int r1 = r1 % 2
            if (r1 != 0) goto L45
            com.appsflyer.internal.AFc1ySDK r0 = r0.valueOf
            r1 = 42
            int r1 = r1 / 0
            if (r5 == 0) goto L4f
            goto L49
        L45:
            com.appsflyer.internal.AFc1ySDK r0 = r0.valueOf
            if (r5 == 0) goto L4f
        L49:
            android.content.Context r1 = r5.getApplicationContext()
            r0.values = r1
        L4f:
            com.appsflyer.internal.AFb1bSDK r0 = r3.onResponseError
            java.util.concurrent.ExecutorService r0 = r0.AFInAppEventParameterName()
            com.appsflyer.internal.d r1 = new com.appsflyer.internal.d
            r1.<init>()
            r0.execute(r1)
            return
        L5e:
            r4 = 0
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1zSDK.performOnDeepLinking(android.content.Intent, android.content.Context):void");
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void registerConversionListener(Context context, AppsFlyerConversionListener appsFlyerConversionListener) {
        int i = getSdkVersion + 53;
        onPause = i % 128;
        if (i % 2 != 0) {
            AFb1uSDK.AFInAppEventType().AFKeystoreWrapper("registerConversionListener", new String[1]);
        } else {
            AFb1uSDK.AFInAppEventType().AFKeystoreWrapper("registerConversionListener", new String[0]);
        }
        AFInAppEventType(appsFlyerConversionListener);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void registerValidatorListener(Context context, AppsFlyerInAppPurchaseValidatorListener appsFlyerInAppPurchaseValidatorListener) {
        AFb1uSDK.AFInAppEventType().AFKeystoreWrapper("registerValidatorListener", new String[0]);
        AFLogger.afDebugLog("registerValidatorListener called");
        if (appsFlyerInAppPurchaseValidatorListener == null) {
            int i = getSdkVersion + 7;
            onPause = i % 128;
            int i2 = i % 2;
            AFLogger.afDebugLog("registerValidatorListener null listener");
            int i3 = onPause + 19;
            getSdkVersion = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        values = appsFlyerInAppPurchaseValidatorListener;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void sendAdRevenue(Context context, Map<String, Object> map) {
        int i = getSdkVersion + 51;
        onPause = i % 128;
        Activity activity = null;
        if (i % 2 == 0) {
            AFb1bSDK aFb1bSDK = this.onResponseError;
            if (context != null) {
                AFc1ySDK aFc1ySDK = aFb1bSDK.valueOf;
                if (context != null) {
                    aFc1ySDK.values = context.getApplicationContext();
                    int i2 = onPause + 65;
                    getSdkVersion = i2 % 128;
                    int i3 = i2 % 2;
                }
            }
            AFe1kSDK aFe1kSDK = new AFe1kSDK();
            if (context != null) {
                int i4 = getSdkVersion + 15;
                onPause = i4 % 128;
                int i5 = i4 % 2;
                aFe1kSDK.AFKeystoreWrapper = (Application) context.getApplicationContext();
            }
            int AFInAppEventParameterName2 = AFInAppEventParameterName(AFInAppEventType(context));
            aFe1kSDK.AFInAppEventType().put("ad_network", map);
            aFe1kSDK.AFInAppEventType().put("adrevenue_counter", Integer.valueOf(AFInAppEventParameterName2));
            if (context instanceof Activity) {
                activity = (Activity) context;
            }
            values(aFe1kSDK, activity);
            return;
        }
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void sendInAppPurchaseData(Context context, Map<String, Object> map, PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback) {
        AFc1ySDK aFc1ySDK;
        int i = getSdkVersion + 3;
        onPause = i % 128;
        int i2 = i % 2;
        AFb1bSDK aFb1bSDK = this.onResponseError;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            int i3 = onPause;
            int i4 = i3 + 85;
            getSdkVersion = i4 % 128;
            if (i4 % 2 == 0) {
                aFc1ySDK = aFb1bSDK.valueOf;
                int i5 = 35 / 0;
            } else {
                aFc1ySDK = aFb1bSDK.valueOf;
            }
            int i6 = i3 + 43;
            getSdkVersion = i6 % 128;
            if (i6 % 2 != 0) {
                aFc1ySDK.values = applicationContext.getApplicationContext();
            } else {
                aFc1ySDK.values = applicationContext.getApplicationContext();
                throw null;
            }
        }
        PurchaseHandler AFLogger2 = AFInAppEventParameterName().AFLogger();
        if (AFLogger2.valueOf(map, purchaseValidationCallback, "purchases")) {
            AFd1jSDK aFd1jSDK = new AFd1jSDK(map, purchaseValidationCallback, AFLogger2.AFInAppEventType);
            AFd1xSDK aFd1xSDK = AFLogger2.values;
            aFd1xSDK.AFKeystoreWrapper.execute(new AFd1xSDK.AnonymousClass2(aFd1jSDK));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0029, code lost:
        if (r4 != null) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002b, code lost:
        r0.values = r4.getApplicationContext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0024, code lost:
        if (r4 != null) goto L7;
     */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void sendPurchaseData(android.content.Context r4, java.util.Map<java.lang.String, java.lang.Object> r5, com.appsflyer.PurchaseHandler.PurchaseValidationCallback r6) {
        /*
            r3 = this;
            int r0 = com.appsflyer.internal.AFb1zSDK.getSdkVersion
            int r0 = r0 + 59
            int r1 = r0 % 128
            com.appsflyer.internal.AFb1zSDK.onPause = r1
            int r0 = r0 % 2
            com.appsflyer.internal.AFb1bSDK r0 = r3.onResponseError
            android.content.Context r4 = r4.getApplicationContext()
            if (r4 == 0) goto L31
            int r1 = com.appsflyer.internal.AFb1zSDK.getSdkVersion
            int r1 = r1 + 21
            int r2 = r1 % 128
            com.appsflyer.internal.AFb1zSDK.onPause = r2
            int r1 = r1 % 2
            if (r1 == 0) goto L27
            com.appsflyer.internal.AFc1ySDK r0 = r0.valueOf
            r1 = 48
            int r1 = r1 / 0
            if (r4 == 0) goto L31
            goto L2b
        L27:
            com.appsflyer.internal.AFc1ySDK r0 = r0.valueOf
            if (r4 == 0) goto L31
        L2b:
            android.content.Context r4 = r4.getApplicationContext()
            r0.values = r4
        L31:
            com.appsflyer.internal.AFc1xSDK r4 = r3.AFInAppEventParameterName()
            com.appsflyer.PurchaseHandler r4 = r4.AFLogger()
            java.lang.String r0 = "subscriptions"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            boolean r0 = r4.valueOf(r5, r6, r0)
            if (r0 == 0) goto L58
            com.appsflyer.internal.AFd1rSDK r0 = new com.appsflyer.internal.AFd1rSDK
            com.appsflyer.internal.AFc1xSDK r1 = r4.AFInAppEventType
            r0.<init>(r5, r6, r1)
            com.appsflyer.internal.AFd1xSDK r4 = r4.values
            java.util.concurrent.Executor r5 = r4.AFKeystoreWrapper
            com.appsflyer.internal.AFd1xSDK$2 r6 = new com.appsflyer.internal.AFd1xSDK$2
            r6.<init>(r0)
            r5.execute(r6)
        L58:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1zSDK.sendPurchaseData(android.content.Context, java.util.Map, com.appsflyer.PurchaseHandler$PurchaseValidationCallback):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0174  */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void sendPushNotificationData(@android.support.annotation.NonNull android.app.Activity r17) {
        /*
            Method dump skipped, instructions count: 428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1zSDK.sendPushNotificationData(android.app.Activity):void");
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setAdditionalData(Map<String, Object> map) {
        int i = getSdkVersion + 103;
        onPause = i % 128;
        int i2 = i % 2;
        if (map != null) {
            AFb1uSDK.AFInAppEventType().AFKeystoreWrapper("setAdditionalData", map.toString());
            AppsFlyerProperties.getInstance().setCustomData(new JSONObject(map).toString());
        }
        int i3 = getSdkVersion + 31;
        onPause = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 76 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setAndroidIdData(String str) {
        int i = onPause + 23;
        getSdkVersion = i % 128;
        if (i % 2 == 0) {
            AFb1uSDK.AFInAppEventType().AFKeystoreWrapper("setAndroidIdData", str);
        } else {
            AFb1uSDK.AFInAppEventType().AFKeystoreWrapper("setAndroidIdData", str);
        }
        this.afDebugLog = str;
        int i2 = onPause + 105;
        getSdkVersion = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setAppId(String str) {
        int i = onPause + 93;
        getSdkVersion = i % 128;
        if (i % 2 == 0) {
            AFb1uSDK AFInAppEventType2 = AFb1uSDK.AFInAppEventType();
            String[] strArr = new String[0];
            strArr[0] = str;
            AFInAppEventType2.AFKeystoreWrapper("setAppId", strArr);
        } else {
            AFb1uSDK.AFInAppEventType().AFKeystoreWrapper("setAppId", str);
        }
        AFKeystoreWrapper("appid", str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0051, code lost:
        if (r7.equals(com.appsflyer.AppsFlyerProperties.getInstance().getString(com.appsflyer.AppsFlyerProperties.ONELINK_ID)) == false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0054, code lost:
        com.appsflyer.AppsFlyerProperties.getInstance().remove(com.appsflyer.AppsFlyerProperties.ONELINK_DOMAIN);
        com.appsflyer.AppsFlyerProperties.getInstance().remove("onelinkVersion");
        com.appsflyer.AppsFlyerProperties.getInstance().remove(com.appsflyer.AppsFlyerProperties.ONELINK_SCHEME);
        r0 = com.appsflyer.internal.AFb1zSDK.onPause + 113;
        com.appsflyer.internal.AFb1zSDK.getSdkVersion = r0 % 128;
        r0 = r0 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x002a, code lost:
        if (r7 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0043, code lost:
        if (r7 != null) goto L9;
     */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setAppInviteOneLink(java.lang.String r7) {
        /*
            r6 = this;
            int r0 = com.appsflyer.internal.AFb1zSDK.getSdkVersion
            int r0 = r0 + 113
            int r1 = r0 % 128
            com.appsflyer.internal.AFb1zSDK.onPause = r1
            int r0 = r0 % 2
            java.lang.String r1 = "oneLinkSlug"
            java.lang.String r2 = "setAppInviteOneLink = "
            java.lang.String r3 = "setAppInviteOneLink"
            if (r0 == 0) goto L2d
            com.appsflyer.internal.AFb1uSDK r0 = com.appsflyer.internal.AFb1uSDK.AFInAppEventType()
            r4 = 0
            java.lang.String[] r4 = new java.lang.String[r4]
            r5 = 1
            r4[r5] = r7
            r0.AFKeystoreWrapper(r3, r4)
            java.lang.String r0 = java.lang.String.valueOf(r7)
            java.lang.String r0 = r2.concat(r0)
            com.appsflyer.AFLogger.afInfoLog(r0)
            if (r7 == 0) goto L54
            goto L45
        L2d:
            com.appsflyer.internal.AFb1uSDK r0 = com.appsflyer.internal.AFb1uSDK.AFInAppEventType()
            java.lang.String[] r4 = new java.lang.String[]{r7}
            r0.AFKeystoreWrapper(r3, r4)
            java.lang.String r0 = java.lang.String.valueOf(r7)
            java.lang.String r0 = r2.concat(r0)
            com.appsflyer.AFLogger.afInfoLog(r0)
            if (r7 == 0) goto L54
        L45:
            com.appsflyer.AppsFlyerProperties r0 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r0 = r0.getString(r1)
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L54
            goto L79
        L54:
            com.appsflyer.AppsFlyerProperties r0 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r2 = "onelinkDomain"
            r0.remove(r2)
            com.appsflyer.AppsFlyerProperties r0 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r2 = "onelinkVersion"
            r0.remove(r2)
            com.appsflyer.AppsFlyerProperties r0 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r2 = "onelinkScheme"
            r0.remove(r2)
            int r0 = com.appsflyer.internal.AFb1zSDK.onPause
            int r0 = r0 + 113
            int r2 = r0 % 128
            com.appsflyer.internal.AFb1zSDK.getSdkVersion = r2
            int r0 = r0 % 2
        L79:
            AFKeystoreWrapper(r1, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1zSDK.setAppInviteOneLink(java.lang.String):void");
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCollectAndroidID(boolean z) {
        int i = getSdkVersion + 17;
        onPause = i % 128;
        int i2 = i % 2;
        AFb1uSDK.AFInAppEventType().AFKeystoreWrapper("setCollectAndroidID", String.valueOf(z));
        AFKeystoreWrapper(AppsFlyerProperties.COLLECT_ANDROID_ID, Boolean.toString(z));
        AFKeystoreWrapper(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, Boolean.toString(z));
        int i3 = getSdkVersion + 49;
        onPause = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCollectIMEI(boolean z) {
        int i = getSdkVersion + 33;
        onPause = i % 128;
        if (i % 2 != 0) {
            AFb1uSDK.AFInAppEventType().AFKeystoreWrapper("setCollectIMEI", String.valueOf(z));
        } else {
            AFb1uSDK.AFInAppEventType().AFKeystoreWrapper("setCollectIMEI", String.valueOf(z));
        }
        AFKeystoreWrapper(AppsFlyerProperties.COLLECT_IMEI, Boolean.toString(z));
        AFKeystoreWrapper(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, Boolean.toString(z));
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final void setCollectOaid(boolean z) {
        int i = getSdkVersion + 77;
        onPause = i % 128;
        if (i % 2 != 0) {
            AFb1uSDK AFInAppEventType2 = AFb1uSDK.AFInAppEventType();
            String[] strArr = new String[1];
            strArr[1] = String.valueOf(z);
            AFInAppEventType2.AFKeystoreWrapper("setCollectOaid", strArr);
        } else {
            AFb1uSDK.AFInAppEventType().AFKeystoreWrapper("setCollectOaid", String.valueOf(z));
        }
        AFKeystoreWrapper(AppsFlyerProperties.COLLECT_OAID, Boolean.toString(z));
        int i2 = onPause + 125;
        getSdkVersion = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 26 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCurrencyCode(String str) {
        int i = getSdkVersion + 13;
        onPause = i % 128;
        int i2 = i % 2;
        AFb1uSDK.AFInAppEventType().AFKeystoreWrapper("setCurrencyCode", str);
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.CURRENCY_CODE, str);
        int i3 = getSdkVersion + 31;
        onPause = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 91 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCustomerIdAndLogSession(String str, @NonNull Context context) {
        if (context != null) {
            int i = onPause + 73;
            getSdkVersion = i % 128;
            if (i % 2 != 0) {
                if (values()) {
                    setCustomerUserId(str);
                    StringBuilder sb = new StringBuilder("CustomerUserId set: ");
                    sb.append(str);
                    sb.append(" - Initializing AppsFlyer Tacking");
                    AFLogger.afInfoLog(sb.toString(), true);
                    String referrer = AppsFlyerProperties.getInstance().getReferrer(context);
                    AFKeystoreWrapper(context, AFe1lSDK.setCustomerIdAndLogSession);
                    String str2 = this.onResponseError.AFVersionDeclaration().AFInAppEventType;
                    if (referrer == null) {
                        referrer = "";
                    } else {
                        int i2 = onPause + 53;
                        getSdkVersion = i2 % 128;
                        int i3 = i2 % 2;
                    }
                    String str3 = referrer;
                    if (context instanceof Activity) {
                        int i4 = onPause + 73;
                        getSdkVersion = i4 % 128;
                        int i5 = i4 % 2;
                        ((Activity) context).getIntent();
                    }
                    AFKeystoreWrapper(context, null, null, str3, null);
                    return;
                }
                setCustomerUserId(str);
                AFLogger.afInfoLog("waitForCustomerUserId is false; setting CustomerUserID: ".concat(String.valueOf(str)), true);
                return;
            }
            values();
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCustomerUserId(String str) {
        int i = onPause + 7;
        getSdkVersion = i % 128;
        int i2 = i % 2;
        AFb1uSDK.AFInAppEventType().AFKeystoreWrapper("setCustomerUserId", str);
        AFLogger.afInfoLog("setCustomerUserId = ".concat(String.valueOf(str)));
        AFKeystoreWrapper(AppsFlyerProperties.APP_USER_ID, str);
        AFKeystoreWrapper(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false);
        int i3 = onPause + 123;
        getSdkVersion = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setDebugLog(boolean z) {
        AFLogger.LogLevel logLevel;
        int i = onPause + 103;
        int i2 = i % 128;
        getSdkVersion = i2;
        int i3 = i % 2;
        if (z) {
            int i4 = i2 + 79;
            onPause = i4 % 128;
            int i5 = i4 % 2;
            logLevel = AFLogger.LogLevel.DEBUG;
            if (i5 != 0) {
                int i6 = 7 / 0;
            }
        } else {
            logLevel = AFLogger.LogLevel.NONE;
            int i7 = onPause + 31;
            getSdkVersion = i7 % 128;
            int i8 = i7 % 2;
        }
        setLogLevel(logLevel);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setDisableAdvertisingIdentifiers(boolean z) {
        boolean z2;
        int i = getSdkVersion + 27;
        onPause = i % 128;
        int i2 = i % 2;
        AFLogger.afDebugLog("setDisableAdvertisingIdentifiers: ".concat(String.valueOf(z)));
        if (z) {
            z2 = false;
        } else {
            int i3 = getSdkVersion + 125;
            onPause = i3 % 128;
            int i4 = i3 % 2;
            z2 = true;
        }
        AFa1bSDK.AFInAppEventParameterName = Boolean.valueOf(z2);
        AppsFlyerProperties.getInstance().remove("advertiserIdEnabled");
        AppsFlyerProperties.getInstance().remove("advertiserId");
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setDisableNetworkData(boolean z) {
        int i = onPause + 35;
        getSdkVersion = i % 128;
        if (i % 2 == 0) {
            AFLogger.afDebugLog("setDisableNetworkData: ".concat(String.valueOf(z)));
            AFKeystoreWrapper(AppsFlyerProperties.DISABLE_NETWORK_DATA, z);
            int i2 = 62 / 0;
            return;
        }
        AFLogger.afDebugLog("setDisableNetworkData: ".concat(String.valueOf(z)));
        AFKeystoreWrapper(AppsFlyerProperties.DISABLE_NETWORK_DATA, z);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setExtension(String str) {
        int i = onPause + 21;
        getSdkVersion = i % 128;
        int i2 = i % 2;
        AFb1uSDK.AFInAppEventType().AFKeystoreWrapper("setExtension", str);
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.EXTENSION, str);
        int i3 = onPause + 15;
        getSdkVersion = i3 % 128;
        int i4 = i3 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
        r0 = com.appsflyer.internal.AFb1zSDK.getSdkVersion + 91;
        com.appsflyer.internal.AFb1zSDK.onPause = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002b, code lost:
        if ((r0 % 2) != 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002d, code lost:
        r4 = r4.trim();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0033, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0034, code lost:
        r4 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0036, code lost:
        com.appsflyer.internal.AFc1cSDK.values(new com.appsflyer.internal.AFc1eSDK(r4, r5.trim()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0042, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0043, code lost:
        com.appsflyer.AFLogger.afWarnLog("hostname was empty or null - call for setHost is skipped");
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0015, code lost:
        if (com.appsflyer.internal.AFb1nSDK.valueOf(r5) != true) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
        if ((!com.appsflyer.internal.AFb1nSDK.valueOf(r5)) != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
        if (r4 == null) goto L16;
     */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setHost(@android.support.annotation.Nullable java.lang.String r4, @android.support.annotation.NonNull java.lang.String r5) {
        /*
            r3 = this;
            int r0 = com.appsflyer.internal.AFb1zSDK.getSdkVersion
            int r0 = r0 + 103
            int r1 = r0 % 128
            com.appsflyer.internal.AFb1zSDK.onPause = r1
            int r0 = r0 % 2
            r1 = 1
            if (r0 == 0) goto L18
            boolean r0 = com.appsflyer.internal.AFb1nSDK.valueOf(r5)
            r2 = 77
            int r2 = r2 / 0
            if (r0 == r1) goto L43
            goto L1f
        L18:
            boolean r0 = com.appsflyer.internal.AFb1nSDK.valueOf(r5)
            r0 = r0 ^ r1
            if (r0 == 0) goto L43
        L1f:
            if (r4 == 0) goto L34
            int r0 = com.appsflyer.internal.AFb1zSDK.getSdkVersion
            int r0 = r0 + 91
            int r1 = r0 % 128
            com.appsflyer.internal.AFb1zSDK.onPause = r1
            int r0 = r0 % 2
            if (r0 != 0) goto L32
            java.lang.String r4 = r4.trim()
            goto L36
        L32:
            r4 = 0
            throw r4
        L34:
            java.lang.String r4 = ""
        L36:
            com.appsflyer.internal.AFc1eSDK r0 = new com.appsflyer.internal.AFc1eSDK
            java.lang.String r5 = r5.trim()
            r0.<init>(r4, r5)
            com.appsflyer.internal.AFc1cSDK.values(r0)
            return
        L43:
            java.lang.String r4 = "hostname was empty or null - call for setHost is skipped"
            com.appsflyer.AFLogger.afWarnLog(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1zSDK.setHost(java.lang.String, java.lang.String):void");
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setImeiData(String str) {
        int i = getSdkVersion + 1;
        onPause = i % 128;
        if (i % 2 != 0) {
            AFb1uSDK AFInAppEventType2 = AFb1uSDK.AFInAppEventType();
            String[] strArr = new String[1];
            strArr[1] = str;
            AFInAppEventType2.AFKeystoreWrapper("setImeiData", strArr);
        } else {
            AFb1uSDK.AFInAppEventType().AFKeystoreWrapper("setImeiData", str);
        }
        this.onResponseError.AFVersionDeclaration().valueOf = str;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setIsUpdate(boolean z) {
        int i = getSdkVersion + 59;
        onPause = i % 128;
        if (i % 2 != 0) {
            AFb1uSDK AFInAppEventType2 = AFb1uSDK.AFInAppEventType();
            String[] strArr = new String[1];
            strArr[1] = String.valueOf(z);
            AFInAppEventType2.AFKeystoreWrapper("setIsUpdate", strArr);
        } else {
            AFb1uSDK.AFInAppEventType().AFKeystoreWrapper("setIsUpdate", String.valueOf(z));
        }
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.IS_UPDATE, z);
        int i2 = getSdkVersion + 41;
        onPause = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 26 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setLogLevel(@NonNull AFLogger.LogLevel logLevel) {
        boolean z;
        if (logLevel.getLevel() > AFLogger.LogLevel.NONE.getLevel()) {
            int i = getSdkVersion + 107;
            onPause = i % 128;
            int i2 = i % 2;
            z = true;
        } else {
            int i3 = getSdkVersion + 71;
            onPause = i3 % 128;
            int i4 = i3 % 2;
            z = false;
        }
        this.onResponseError.AFLogger$LogLevel().AFKeystoreWrapper("log", String.valueOf(z));
        AppsFlyerProperties.getInstance().set("logLevel", logLevel.getLevel());
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setMinTimeBetweenSessions(int i) {
        int i2 = getSdkVersion + 23;
        onPause = i2 % 128;
        int i3 = i2 % 2;
        this.onInstallConversionDataLoadedNative = TimeUnit.SECONDS.toMillis(i);
        int i4 = onPause + 9;
        getSdkVersion = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setOaidData(String str) {
        int i = getSdkVersion + 47;
        onPause = i % 128;
        int i2 = i % 2;
        AFb1uSDK.AFInAppEventType().AFKeystoreWrapper("setOaidData", str);
        AFa1bSDK.valueOf = str;
        int i3 = getSdkVersion + 25;
        onPause = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setOneLinkCustomDomain(String... strArr) {
        int i = getSdkVersion + 87;
        onPause = i % 128;
        int i2 = i % 2;
        AFLogger.afDebugLog(String.format("setOneLinkCustomDomain %s", Arrays.toString(strArr)));
        AFa1qSDK.AFKeystoreWrapper = strArr;
        int i3 = getSdkVersion + 19;
        onPause = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setOutOfStore(String str) {
        int i = onPause;
        int i2 = i + 115;
        getSdkVersion = i2 % 128;
        int i3 = i2 % 2;
        if (str != null) {
            int i4 = i + 85;
            getSdkVersion = i4 % 128;
            int i5 = i4 % 2;
            String lowerCase = str.toLowerCase();
            AppsFlyerProperties.getInstance().set("api_store_value", lowerCase);
            AFLogger.afInfoLog("Store API set with value: ".concat(String.valueOf(lowerCase)), true);
            int i6 = onPause + 29;
            getSdkVersion = i6 % 128;
            int i7 = i6 % 2;
            return;
        }
        AFLogger.values("Cannot set setOutOfStore with null");
        int i8 = onPause + 19;
        getSdkVersion = i8 % 128;
        int i9 = i8 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setPartnerData(@NonNull String str, Map<String, Object> map) {
        String concat;
        int i = getSdkVersion + 77;
        onPause = i % 128;
        if (i % 2 == 0) {
            if (this.AppsFlyerInAppPurchaseValidatorListener == null) {
                this.AppsFlyerInAppPurchaseValidatorListener = new AFb1cSDK();
                int i2 = getSdkVersion + 119;
                onPause = i2 % 128;
                int i3 = i2 % 2;
            }
            AFb1cSDK aFb1cSDK = this.AppsFlyerInAppPurchaseValidatorListener;
            if (str != null) {
                int i4 = getSdkVersion + 87;
                onPause = i4 % 128;
                int i5 = i4 % 2;
                if (!str.isEmpty()) {
                    if (map != null) {
                        int i6 = getSdkVersion + 43;
                        onPause = i6 % 128;
                        if (i6 % 2 == 0) {
                            if (!map.isEmpty()) {
                                StringBuilder sb = new StringBuilder("Setting partner data for ");
                                sb.append(str);
                                sb.append(": ");
                                sb.append(map);
                                AFLogger.afDebugLog(sb.toString());
                                int length = new JSONObject(map).toString().length();
                                if (length > 1000) {
                                    AFLogger.afWarnLog("Partner data 1000 characters limit exceeded");
                                    HashMap hashMap = new HashMap();
                                    hashMap.put("error", "limit exceeded: ".concat(String.valueOf(length)));
                                    aFb1cSDK.AFInAppEventParameterName.put(str, hashMap);
                                    return;
                                }
                                aFb1cSDK.values.put(str, map);
                                aFb1cSDK.AFInAppEventParameterName.remove(str);
                                return;
                            }
                        } else {
                            map.isEmpty();
                            throw null;
                        }
                    }
                    if (aFb1cSDK.values.remove(str) == null) {
                        int i7 = getSdkVersion + 19;
                        onPause = i7 % 128;
                        int i8 = i7 % 2;
                        concat = "Partner data is missing or `null`";
                    } else {
                        concat = "Cleared partner data for ".concat(str);
                    }
                    AFLogger.afWarnLog(concat);
                    return;
                }
            }
            AFLogger.afWarnLog("Partner ID is missing or `null`");
            return;
        }
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setPhoneNumber(String str) {
        int i = onPause + 29;
        getSdkVersion = i % 128;
        int i2 = i % 2;
        this.onResponse = AFa1aSDK.values(str);
        int i3 = getSdkVersion + 83;
        onPause = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setPreinstallAttribution(String str, String str2, String str3) {
        AFLogger.afDebugLog("setPreinstallAttribution API called");
        JSONObject jSONObject = new JSONObject();
        if (str != null) {
            try {
                jSONObject.put("pid", str);
            } catch (JSONException e) {
                AFLogger.afErrorLog(e.getMessage(), e);
            }
        }
        if (str2 != null) {
            int i = onPause + 63;
            getSdkVersion = i % 128;
            if (i % 2 == 0) {
                jSONObject.put(com.huawei.hms.opendevice.c.a, str2);
                int i2 = 70 / 0;
            } else {
                jSONObject.put(com.huawei.hms.opendevice.c.a, str2);
            }
        }
        if (str3 != null) {
            jSONObject.put("af_siteid", str3);
        }
        if (jSONObject.has("pid")) {
            int i3 = getSdkVersion + 47;
            onPause = i3 % 128;
            int i4 = i3 % 2;
            AFKeystoreWrapper("preInstallName", jSONObject.toString());
            int i5 = getSdkVersion + 35;
            onPause = i5 % 128;
            int i6 = i5 % 2;
            return;
        }
        AFLogger.afWarnLog("Cannot set preinstall attribution data without a media source");
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setResolveDeepLinkURLs(String... strArr) {
        String format;
        int i = getSdkVersion + 111;
        onPause = i % 128;
        if (i % 2 != 0) {
            format = String.format("setResolveDeepLinkURLs %s", Arrays.toString(strArr));
        } else {
            format = String.format("setResolveDeepLinkURLs %s", Arrays.toString(strArr));
        }
        AFLogger.afDebugLog(format);
        List<String> list = AFa1qSDK.AFInAppEventParameterName;
        list.clear();
        list.addAll(Arrays.asList(strArr));
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final void setSharingFilter(@NonNull String... strArr) {
        int i = getSdkVersion + 73;
        onPause = i % 128;
        int i2 = i % 2;
        setSharingFilterForPartners(strArr);
        int i3 = getSdkVersion + 11;
        onPause = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final void setSharingFilterForAllPartners() {
        int i = getSdkVersion + 125;
        onPause = i % 128;
        int i2 = i % 2;
        setSharingFilterForPartners("all");
        int i3 = getSdkVersion + 79;
        onPause = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setSharingFilterForPartners(String... strArr) {
        this.afRDLog = new AFa1fSDK(strArr);
        int i = onPause + 121;
        getSdkVersion = i % 128;
        if (i % 2 != 0) {
            return;
        }
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setUserEmails(String... strArr) {
        int i = getSdkVersion + 47;
        onPause = i % 128;
        if (i % 2 == 0) {
            AFb1uSDK.AFInAppEventType().AFKeystoreWrapper("setUserEmails", strArr);
            setUserEmails(AppsFlyerProperties.EmailsCryptType.NONE, strArr);
            return;
        }
        AFb1uSDK.AFInAppEventType().AFKeystoreWrapper("setUserEmails", strArr);
        setUserEmails(AppsFlyerProperties.EmailsCryptType.NONE, strArr);
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void start(@NonNull Context context) {
        int i = onPause + 39;
        getSdkVersion = i % 128;
        int i2 = i % 2;
        start(context, null);
        int i3 = getSdkVersion + 123;
        onPause = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void stop(boolean z, Context context) {
        int i = onPause;
        int i2 = i + 81;
        getSdkVersion = i2 % 128;
        if (i2 % 2 != 0) {
            AFb1bSDK aFb1bSDK = this.onResponseError;
            if (context != null) {
                AFc1ySDK aFc1ySDK = aFb1bSDK.valueOf;
                if (context != null) {
                    int i3 = i + 87;
                    getSdkVersion = i3 % 128;
                    int i4 = i3 % 2;
                    aFc1ySDK.values = context.getApplicationContext();
                }
            }
            this.onResponseError.AFVersionDeclaration().AFInAppEventParameterName = z;
            try {
                File file = new File(this.onResponseError.afWarnLog().AFInAppEventType.values.getFilesDir(), "AFRequestCache");
                if (!file.exists()) {
                    file.mkdir();
                } else {
                    File[] listFiles = file.listFiles();
                    if (listFiles != null) {
                        int length = listFiles.length;
                        int i5 = onPause + 115;
                        getSdkVersion = i5 % 128;
                        int i6 = i5 % 2;
                        int i7 = 0;
                        while (i7 < length) {
                            File file2 = listFiles[i7];
                            StringBuilder sb = new StringBuilder("CACHE: Found cached request");
                            sb.append(file2.getName());
                            AFLogger.afInfoLog(sb.toString());
                            StringBuilder sb2 = new StringBuilder("CACHE: Deleting ");
                            sb2.append(file2.getName());
                            sb2.append(" from cache");
                            AFLogger.afInfoLog(sb2.toString());
                            file2.delete();
                            i7++;
                            int i8 = getSdkVersion + 33;
                            onPause = i8 % 128;
                            int i9 = i8 % 2;
                        }
                    }
                }
            } catch (Exception e) {
                AFLogger.afErrorLog("CACHE: Could not cache request", e);
            }
            if (z) {
                AFInAppEventParameterName(context).valueOf("is_stop_tracking_used", true);
                return;
            }
            return;
        }
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void subscribeForDeepLink(@NonNull DeepLinkListener deepLinkListener) {
        int i = onPause + 71;
        getSdkVersion = i % 128;
        int i2 = i % 2;
        subscribeForDeepLink(deepLinkListener, TimeUnit.SECONDS.toMillis(3L));
        int i3 = onPause + 95;
        getSdkVersion = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void unregisterConversionListener() {
        int i = getSdkVersion + 79;
        onPause = i % 128;
        int i2 = i % 2;
        AFb1uSDK.AFInAppEventType().AFKeystoreWrapper("unregisterConversionListener", new String[0]);
        valueOf = null;
        int i3 = onPause + 121;
        getSdkVersion = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void updateServerUninstallToken(Context context, String str) {
        boolean z;
        AFb1bSDK aFb1bSDK = this.onResponseError;
        if (context != null) {
            aFb1bSDK.valueOf.values = context.getApplicationContext();
        }
        AFe1pSDK aFe1pSDK = new AFe1pSDK(context);
        if (str != null && !str.trim().isEmpty()) {
            AFLogger.afInfoLog("[register] Firebase Refreshed Token = ".concat(str));
            AFb1sSDK valueOf2 = aFe1pSDK.valueOf();
            if (valueOf2 == null || !str.equals(valueOf2.AFInAppEventParameterName)) {
                long currentTimeMillis = System.currentTimeMillis();
                if (valueOf2 != null && currentTimeMillis - valueOf2.values <= TimeUnit.SECONDS.toMillis(2L)) {
                    z = false;
                } else {
                    z = true;
                }
                AFb1sSDK aFb1sSDK = new AFb1sSDK(str, currentTimeMillis, !z);
                aFe1pSDK.AFInAppEventType.AFInAppEventParameterName("afUninstallToken", aFb1sSDK.AFInAppEventParameterName);
                aFe1pSDK.AFInAppEventType.AFInAppEventType("afUninstallToken_received_time", aFb1sSDK.values);
                aFe1pSDK.AFInAppEventType.valueOf("afUninstallToken_queued", aFb1sSDK.AFInAppEventType());
                if (z) {
                    AFe1pSDK.valueOf(str);
                    return;
                }
                return;
            }
            return;
        }
        AFLogger.afWarnLog("[register] Firebase Token is either empty or null and was not registered.");
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void validateAndLogInAppPurchase(Context context, String str, String str2, String str3, String str4, String str5, Map<String, String> map) {
        String obj;
        Intent intent;
        AFb1uSDK AFInAppEventType2 = AFb1uSDK.AFInAppEventType();
        String[] strArr = new String[6];
        strArr[0] = str;
        strArr[1] = str2;
        strArr[2] = str3;
        strArr[3] = str4;
        strArr[4] = str5;
        if (map == null) {
            obj = "";
        } else {
            obj = map.toString();
        }
        strArr[5] = obj;
        AFInAppEventType2.AFKeystoreWrapper("validateAndTrackInAppPurchase", strArr);
        if (!isStopped()) {
            StringBuilder sb = new StringBuilder("Validate in app called with parameters: ");
            sb.append(str3);
            sb.append(" ");
            sb.append(str4);
            sb.append(" ");
            sb.append(str5);
            AFLogger.afInfoLog(sb.toString());
        }
        if (str != null && str4 != null && str2 != null && str5 != null && str3 != null) {
            Context applicationContext = context.getApplicationContext();
            String str6 = this.onResponseError.AFVersionDeclaration().AFInAppEventType;
            if (context instanceof Activity) {
                intent = ((Activity) context).getIntent();
            } else {
                intent = null;
            }
            new Thread(new AFa1cSDK(applicationContext, str6, str, str2, str3, str4, str5, map, intent)).start();
            return;
        }
        AppsFlyerInAppPurchaseValidatorListener appsFlyerInAppPurchaseValidatorListener = values;
        if (appsFlyerInAppPurchaseValidatorListener != null) {
            appsFlyerInAppPurchaseValidatorListener.onValidateInAppFailure("Please provide purchase parameters");
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void waitForCustomerUserId(boolean z) {
        String concat;
        boolean z2;
        int i = getSdkVersion + 69;
        onPause = i % 128;
        if (i % 2 != 0) {
            concat = "initAfterCustomerUserID: ".concat(String.valueOf(z));
            z2 = false;
        } else {
            concat = "initAfterCustomerUserID: ".concat(String.valueOf(z));
            z2 = true;
        }
        AFLogger.afInfoLog(concat, z2);
        AFKeystoreWrapper(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, z);
        int i2 = getSdkVersion + 85;
        onPause = i2 % 128;
        int i3 = i2 % 2;
    }

    static /* synthetic */ boolean AFInAppEventParameterName(AFb1zSDK aFb1zSDK, AFa1sSDK aFa1sSDK, SharedPreferences sharedPreferences) {
        int i = onPause + 77;
        getSdkVersion = i % 128;
        int i2 = i % 2;
        boolean AFKeystoreWrapper2 = aFb1zSDK.AFKeystoreWrapper(aFa1sSDK, sharedPreferences);
        int i3 = getSdkVersion + 9;
        onPause = i3 % 128;
        int i4 = i3 % 2;
        return AFKeystoreWrapper2;
    }

    static /* synthetic */ void AFInAppEventType(AFb1zSDK aFb1zSDK, AFa1sSDK aFa1sSDK) {
        int i = onPause + 47;
        getSdkVersion = i % 128;
        int i2 = i % 2;
        aFb1zSDK.AFInAppEventParameterName(aFa1sSDK);
        int i3 = getSdkVersion + 105;
        onPause = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 28 / 0;
        }
    }

    private static void AFKeystoreWrapper(JSONObject jSONObject) {
        String str;
        ArrayList arrayList = new ArrayList();
        Iterator<String> keys = jSONObject.keys();
        while (true) {
            if (!keys.hasNext()) {
                break;
            }
            try {
                JSONArray jSONArray = new JSONArray((String) jSONObject.get(keys.next()));
                for (int i = 0; i < jSONArray.length(); i++) {
                    arrayList.add(Long.valueOf(jSONArray.getLong(i)));
                }
            } catch (JSONException e) {
                AFLogger.afErrorLogForExcManagerOnly("error at timeStampArr", e);
            }
        }
        Collections.sort(arrayList);
        Iterator<String> keys2 = jSONObject.keys();
        loop2: while (true) {
            str = null;
            while (!(!keys2.hasNext()) && str == null) {
                String next = keys2.next();
                try {
                    JSONArray jSONArray2 = new JSONArray((String) jSONObject.get(next));
                    int i2 = 0;
                    while (i2 < jSONArray2.length()) {
                        int i3 = onPause + 99;
                        getSdkVersion = i3 % 128;
                        if (i3 % 2 == 0) {
                            if (jSONArray2.getLong(i2) != ((Long) arrayList.get(1)).longValue()) {
                                int i4 = onPause + 115;
                                getSdkVersion = i4 % 128;
                                int i5 = i4 % 2;
                                if (jSONArray2.getLong(i2) == ((Long) arrayList.get(1)).longValue() && jSONArray2.getLong(i2) != ((Long) arrayList.get(arrayList.size() - 1)).longValue()) {
                                    i2++;
                                    int i6 = onPause + 77;
                                    getSdkVersion = i6 % 128;
                                    int i7 = i6 % 2;
                                    str = next;
                                }
                            }
                        } else {
                            if (jSONArray2.getLong(i2) == ((Long) arrayList.get(0)).longValue()) {
                                break;
                            }
                            int i42 = onPause + 115;
                            getSdkVersion = i42 % 128;
                            int i52 = i42 % 2;
                            if (jSONArray2.getLong(i2) == ((Long) arrayList.get(1)).longValue()) {
                                break;
                            }
                            i2++;
                            int i62 = onPause + 77;
                            getSdkVersion = i62 % 128;
                            int i72 = i62 % 2;
                            str = next;
                        }
                    }
                    continue;
                } catch (JSONException e2) {
                    AFLogger.afErrorLogForExcManagerOnly("error at manageExtraReferrers", e2);
                }
            }
        }
        if (str != null) {
            int i8 = onPause + 65;
            getSdkVersion = i8 % 128;
            int i9 = i8 % 2;
            jSONObject.remove(str);
            if (i9 == 0) {
                int i10 = 10 / 0;
            }
        }
    }

    static /* synthetic */ AFb1bSDK valueOf(AFb1zSDK aFb1zSDK) {
        int i = getSdkVersion;
        int i2 = i + 11;
        onPause = i2 % 128;
        int i3 = i2 % 2;
        AFb1bSDK aFb1bSDK = aFb1zSDK.onResponseError;
        if (i3 == 0) {
            int i4 = i + 101;
            onPause = i4 % 128;
            int i5 = i4 % 2;
            return aFb1bSDK;
        }
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logEvent(@NonNull Context context, String str, Map<String, Object> map, AppsFlyerRequestListener appsFlyerRequestListener) {
        HashMap hashMap = map == null ? null : new HashMap(map);
        AFb1bSDK aFb1bSDK = this.onResponseError;
        if (context != null) {
            aFb1bSDK.valueOf.values = context.getApplicationContext();
        }
        AFe1iSDK aFe1iSDK = new AFe1iSDK();
        if (context != null) {
            aFe1iSDK.AFKeystoreWrapper = (Application) context.getApplicationContext();
        }
        aFe1iSDK.afRDLog = str;
        aFe1iSDK.AFInAppEventType = appsFlyerRequestListener;
        if (hashMap != null && hashMap.containsKey(AFInAppEventParameterName.TOUCH_OBJ)) {
            HashMap hashMap2 = new HashMap();
            Object obj = hashMap.get(AFInAppEventParameterName.TOUCH_OBJ);
            if (obj instanceof MotionEvent) {
                MotionEvent motionEvent = (MotionEvent) obj;
                HashMap hashMap3 = new HashMap();
                hashMap3.put("x", Float.valueOf(motionEvent.getX()));
                hashMap3.put("y", Float.valueOf(motionEvent.getY()));
                hashMap2.put("loc", hashMap3);
                hashMap2.put("pf", Float.valueOf(motionEvent.getPressure()));
                hashMap2.put("rad", Float.valueOf(motionEvent.getTouchMajor() / 2.0f));
            } else {
                hashMap2.put("error", "Parsing failed due to invalid input in 'af_touch_obj'.");
                AFLogger.values("Parsing failed due to invalid input in 'af_touch_obj'.");
            }
            Map<String, ?> singletonMap = Collections.singletonMap("tch_data", hashMap2);
            hashMap.remove(AFInAppEventParameterName.TOUCH_OBJ);
            aFe1iSDK.AFInAppEventType(singletonMap);
        }
        aFe1iSDK.values = hashMap;
        AFb1uSDK AFLogger$LogLevel2 = AFInAppEventParameterName().AFLogger$LogLevel();
        String[] strArr = new String[2];
        strArr[0] = str;
        Map map2 = aFe1iSDK.values;
        if (map2 == null) {
            map2 = new HashMap();
        }
        strArr[1] = new JSONObject(map2).toString();
        AFLogger$LogLevel2.AFKeystoreWrapper("logEvent", strArr);
        if (str == null) {
            AFKeystoreWrapper(context, AFe1lSDK.logEvent);
        }
        values(aFe1iSDK, context instanceof Activity ? (Activity) context : null);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void start(@NonNull Context context, String str) {
        int i = getSdkVersion + 125;
        onPause = i % 128;
        int i2 = i % 2;
        start(context, str, null);
        int i3 = onPause + 67;
        getSdkVersion = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void subscribeForDeepLink(@NonNull DeepLinkListener deepLinkListener, long j) {
        int i = onPause + 67;
        getSdkVersion = i % 128;
        if (i % 2 == 0) {
            AFa1qSDK.AFInAppEventParameterName().AFInAppEventType = deepLinkListener;
            AFb1pSDK.getLevel = j;
            int i2 = 54 / 0;
        } else {
            AFa1qSDK.AFInAppEventParameterName().AFInAppEventType = deepLinkListener;
            AFb1pSDK.getLevel = j;
        }
        int i3 = onPause + 55;
        getSdkVersion = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 48 / 0;
        }
    }

    public final void values(Context context, Intent intent) {
        int i = getSdkVersion + 63;
        onPause = i % 128;
        int i2 = i % 2;
        if (intent.getStringExtra("appsflyer_preinstall") != null) {
            AFInAppEventType(intent.getStringExtra("appsflyer_preinstall"));
        }
        AFLogger.afInfoLog("****** onReceive called *******");
        AppsFlyerProperties.getInstance();
        String stringExtra = intent.getStringExtra("referrer");
        AFLogger.afInfoLog("Play store referrer: ".concat(String.valueOf(stringExtra)));
        if (stringExtra != null) {
            int i3 = onPause + 67;
            getSdkVersion = i3 % 128;
            if (i3 % 2 != 0) {
                AFInAppEventParameterName(context).AFInAppEventParameterName("referrer", stringExtra);
                AppsFlyerProperties appsFlyerProperties = AppsFlyerProperties.getInstance();
                appsFlyerProperties.set("AF_REFERRER", stringExtra);
                appsFlyerProperties.AFKeystoreWrapper = stringExtra;
                if (AppsFlyerProperties.getInstance().AFKeystoreWrapper()) {
                    AFLogger.afInfoLog("onReceive: isLaunchCalled");
                    AFKeystoreWrapper(context, AFe1lSDK.onReceive);
                    values(context, stringExtra);
                    return;
                }
                return;
            }
            AFInAppEventParameterName(context).AFInAppEventParameterName("referrer", stringExtra);
            AppsFlyerProperties appsFlyerProperties2 = AppsFlyerProperties.getInstance();
            appsFlyerProperties2.set("AF_REFERRER", stringExtra);
            appsFlyerProperties2.AFKeystoreWrapper = stringExtra;
            AppsFlyerProperties.getInstance().AFKeystoreWrapper();
            throw null;
        }
    }

    static /* synthetic */ void AFInAppEventType(ScheduledExecutorService scheduledExecutorService, Runnable runnable, TimeUnit timeUnit) {
        int i = onPause + 53;
        getSdkVersion = i % 128;
        int i2 = i % 2;
        AFInAppEventParameterName(scheduledExecutorService, runnable, 0L, timeUnit);
        int i3 = onPause + 57;
        getSdkVersion = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 39 / 0;
        }
    }

    @NonNull
    private AFf1uSDK[] afRDLog() {
        int i = onPause + 1;
        getSdkVersion = i % 128;
        if (i % 2 == 0) {
            AFInAppEventParameterName().getLevel().values();
            throw null;
        }
        AFf1uSDK[] values2 = AFInAppEventParameterName().getLevel().values();
        int i2 = onPause + 29;
        getSdkVersion = i2 % 128;
        if (i2 % 2 != 0) {
            return values2;
        }
        throw null;
    }

    static /* synthetic */ boolean valueOf(AFb1zSDK aFb1zSDK, boolean z) {
        int i = getSdkVersion + 97;
        onPause = i % 128;
        int i2 = i % 2;
        aFb1zSDK.onConversionDataSuccess = z;
        if (i2 != 0) {
            int i3 = 77 / 0;
        }
        return z;
    }

    public final AFc1xSDK AFInAppEventParameterName() {
        int i = onPause + 57;
        int i2 = i % 128;
        getSdkVersion = i2;
        int i3 = i % 2;
        AFb1bSDK aFb1bSDK = this.onResponseError;
        int i4 = i2 + 73;
        onPause = i4 % 128;
        int i5 = i4 % 2;
        return aFb1bSDK;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void start(@NonNull Context context, String str, final AppsFlyerRequestListener appsFlyerRequestListener) {
        int i = onPause + 89;
        getSdkVersion = i % 128;
        if (i % 2 != 0) {
            if (AFb1wSDK.values != null) {
                return;
            }
            if (!this.onAttributionFailureNative) {
                int i2 = getSdkVersion + 71;
                onPause = i2 % 128;
                int i3 = i2 % 2;
                AFLogger.afWarnLog("ERROR: AppsFlyer SDK is not initialized! The API call 'start()' must be called after the 'init(String, AppsFlyerConversionListener)' API method, which should be called on the Application's onCreate.");
                if (str == null) {
                    if (appsFlyerRequestListener != null) {
                        appsFlyerRequestListener.onError(RequestError.NO_DEV_KEY, AFb1dSDK.AFKeystoreWrapper);
                        int i4 = getSdkVersion + 119;
                        onPause = i4 % 128;
                        int i5 = i4 % 2;
                        return;
                    }
                    return;
                }
            }
            AFb1bSDK aFb1bSDK = this.onResponseError;
            if (context != null) {
                aFb1bSDK.valueOf.values = context.getApplicationContext();
                int i6 = onPause + 95;
                getSdkVersion = i6 % 128;
                int i7 = i6 % 2;
            }
            final AFe1nSDK afRDLog = AFInAppEventParameterName().afRDLog();
            afRDLog.AFInAppEventParameterName(AFa1lSDK.AFInAppEventParameterName(context));
            this.onDeepLinking = (Application) context.getApplicationContext();
            AFb1uSDK.AFInAppEventType().AFKeystoreWrapper("start", str);
            String str2 = AFInAppEventType;
            AFLogger.afInfoLog(String.format("Starting AppsFlyer: (v%s.%s)", "6.10.0", str2));
            StringBuilder sb = new StringBuilder("Build Number: ");
            sb.append(str2);
            AFLogger.afInfoLog(sb.toString());
            AppsFlyerProperties.getInstance().loadProperties(this.onDeepLinking.getApplicationContext());
            if (!TextUtils.isEmpty(str)) {
                int i8 = getSdkVersion + 109;
                onPause = i8 % 128;
                int i9 = i8 % 2;
                this.onResponseError.AFVersionDeclaration().AFInAppEventType = str;
                AFc1sSDK.values(str);
            } else if (TextUtils.isEmpty(this.onResponseError.AFVersionDeclaration().AFInAppEventType)) {
                AFLogger.afWarnLog("ERROR: AppsFlyer SDK is not initialized! You must provide AppsFlyer Dev-Key either in the 'init' API method (should be called on Application's onCreate),or in the start() API (should be called on Activity's onCreate).");
                if (appsFlyerRequestListener != null) {
                    appsFlyerRequestListener.onError(RequestError.NO_DEV_KEY, AFb1dSDK.AFKeystoreWrapper);
                    return;
                }
                return;
            }
            AFInAppEventParameterName().afInfoLog().AFInAppEventType(null);
            afInfoLog();
            afErrorLog(this.onDeepLinking.getBaseContext());
            if (this.onConversionDataFail) {
                int i10 = onPause + 95;
                getSdkVersion = i10 % 128;
                int i11 = i10 % 2;
                AFLogger(this.onDeepLinking.getApplicationContext());
            }
            AFb1wSDK.values(context, new AFb1wSDK.AFa1xSDK() { // from class: com.appsflyer.internal.AFb1zSDK.5
                @Override // com.appsflyer.internal.AFb1wSDK.AFa1xSDK
                public final void valueOf(Activity activity) {
                    afRDLog.AFKeystoreWrapper();
                    AFb1zSDK.this.AFInAppEventParameterName().afInfoLog().AFInAppEventType(null);
                    AFb1zSDK.AFKeystoreWrapper(AFb1zSDK.this);
                    int AFInAppEventParameterName2 = AFb1zSDK.AFInAppEventParameterName(AFb1zSDK.AFInAppEventType(activity), false);
                    AFLogger.afInfoLog("onBecameForeground");
                    if (AFInAppEventParameterName2 < 2) {
                        AFa1eSDK valueOf2 = AFa1eSDK.valueOf(activity);
                        valueOf2.AFKeystoreWrapper.post(valueOf2.afInfoLog);
                        valueOf2.AFKeystoreWrapper.post(valueOf2.AFInAppEventParameterName);
                    }
                    AFe1bSDK aFe1bSDK = new AFe1bSDK();
                    AFa1qSDK.AFInAppEventParameterName().AFInAppEventType(aFe1bSDK.AFInAppEventType(), activity.getIntent(), activity.getApplication());
                    AFb1zSDK aFb1zSDK = AFb1zSDK.this;
                    aFe1bSDK.AFKeystoreWrapper = (Application) activity.getApplicationContext();
                    aFe1bSDK.AFInAppEventType = appsFlyerRequestListener;
                    aFb1zSDK.values(aFe1bSDK, activity);
                }

                @Override // com.appsflyer.internal.AFb1wSDK.AFa1xSDK
                public final void values(Context context2) {
                    AFLogger.afInfoLog("onBecameBackground");
                    AFe1nSDK aFe1nSDK = afRDLog;
                    long currentTimeMillis = System.currentTimeMillis();
                    long j = aFe1nSDK.afDebugLog;
                    if (j != 0) {
                        long j2 = currentTimeMillis - j;
                        if (j2 > 0 && j2 < 1000) {
                            j2 = 1000;
                        }
                        long seconds = TimeUnit.MILLISECONDS.toSeconds(j2);
                        aFe1nSDK.AFLogger$LogLevel = seconds;
                        aFe1nSDK.AFInAppEventParameterName.AFInAppEventType("prev_session_dur", seconds);
                    } else {
                        AFLogger.afInfoLog("Metrics: fg ts is missing");
                    }
                    AFLogger.afInfoLog("callStatsBackground background call");
                    AFb1zSDK.this.valueOf(new WeakReference<>(context2));
                    AFb1zSDK.this.AFInAppEventParameterName().onInstallConversionDataLoadedNative().AFInAppEventType();
                    AFb1uSDK AFInAppEventType2 = AFb1uSDK.AFInAppEventType();
                    if (AFInAppEventType2.afDebugLog()) {
                        AFInAppEventType2.AFInAppEventParameterName();
                        if (context2 != null && !AppsFlyerLib.getInstance().isStopped()) {
                            AFInAppEventType2.valueOf(context2.getPackageName(), context2.getPackageManager(), AFb1zSDK.valueOf(AFb1zSDK.this));
                        }
                        AFInAppEventType2.AFKeystoreWrapper();
                    } else {
                        AFLogger.afDebugLog("RD status is OFF");
                    }
                    AFa1eSDK.valueOf(context2).AFKeystoreWrapper();
                }
            }, this.onResponseError.valueOf());
            return;
        }
        AFb1wSDK.AFa1xSDK aFa1xSDK = AFb1wSDK.values;
        throw null;
    }

    public static AFb1zSDK AFInAppEventType() {
        int i = onPause + 21;
        int i2 = i % 128;
        getSdkVersion = i2;
        int i3 = i % 2;
        AFb1zSDK aFb1zSDK = afErrorLogForExcManagerOnly;
        int i4 = i2 + 25;
        onPause = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 97 / 0;
        }
        return aFb1zSDK;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004c, code lost:
        if (r0 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004e, code lost:
        r0 = new org.json.JSONObject();
        r1 = new org.json.JSONArray();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0059, code lost:
        r1 = new org.json.JSONObject(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0062, code lost:
        if (r1.has(r13) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0064, code lost:
        r0 = new org.json.JSONArray((java.lang.String) r1.get(r13));
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006f, code lost:
        r1 = r0;
        r0 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0073, code lost:
        r0 = new org.json.JSONArray();
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x002c, code lost:
        if (r0 == null) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void AFInAppEventParameterName(android.content.Context r12, java.lang.String r13) {
        /*
            r11 = this;
            int r0 = com.appsflyer.internal.AFb1zSDK.getSdkVersion
            int r0 = r0 + 15
            int r1 = r0 % 128
            com.appsflyer.internal.AFb1zSDK.onPause = r1
            int r0 = r0 % 2
            r1 = 0
            java.lang.String r2 = "received a new (extra) referrer: "
            java.lang.String r3 = "extraReferrers"
            if (r0 == 0) goto L35
            java.lang.String r0 = java.lang.String.valueOf(r13)
            java.lang.String r0 = r2.concat(r0)
            com.appsflyer.AFLogger.afDebugLog(r0)
            long r4 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L2f org.json.JSONException -> L32
            android.content.SharedPreferences r0 = AFInAppEventType(r12)     // Catch: java.lang.Throwable -> L2f org.json.JSONException -> L32
            java.lang.String r0 = r0.getString(r3, r1)     // Catch: java.lang.Throwable -> L2f org.json.JSONException -> L32
            r1 = 70
            int r1 = r1 / 0
            if (r0 != 0) goto L59
            goto L4e
        L2f:
            r12 = move-exception
            goto Lbc
        L32:
            r12 = move-exception
            goto Ld3
        L35:
            java.lang.String r0 = java.lang.String.valueOf(r13)
            java.lang.String r0 = r2.concat(r0)
            com.appsflyer.AFLogger.afDebugLog(r0)
            long r4 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L2f org.json.JSONException -> L32
            android.content.SharedPreferences r0 = AFInAppEventType(r12)     // Catch: java.lang.Throwable -> L2f org.json.JSONException -> L32
            java.lang.String r0 = r0.getString(r3, r1)     // Catch: java.lang.Throwable -> L2f org.json.JSONException -> L32
            if (r0 != 0) goto L59
        L4e:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L2f org.json.JSONException -> L32
            r0.<init>()     // Catch: java.lang.Throwable -> L2f org.json.JSONException -> L32
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L2f org.json.JSONException -> L32
            r1.<init>()     // Catch: java.lang.Throwable -> L2f org.json.JSONException -> L32
            goto L79
        L59:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L2f org.json.JSONException -> L32
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L2f org.json.JSONException -> L32
            boolean r0 = r1.has(r13)     // Catch: java.lang.Throwable -> L2f org.json.JSONException -> L32
            if (r0 == 0) goto L73
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L2f org.json.JSONException -> L32
            java.lang.Object r2 = r1.get(r13)     // Catch: java.lang.Throwable -> L2f org.json.JSONException -> L32
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L2f org.json.JSONException -> L32
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L2f org.json.JSONException -> L32
        L6f:
            r10 = r1
            r1 = r0
            r0 = r10
            goto L79
        L73:
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L2f org.json.JSONException -> L32
            r0.<init>()     // Catch: java.lang.Throwable -> L2f org.json.JSONException -> L32
            goto L6f
        L79:
            int r2 = r1.length()     // Catch: java.lang.Throwable -> L2f org.json.JSONException -> L32
            long r6 = (long) r2
            r8 = 5
            int r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r2 >= 0) goto L91
            int r2 = com.appsflyer.internal.AFb1zSDK.onPause
            int r2 = r2 + 117
            int r6 = r2 % 128
            com.appsflyer.internal.AFb1zSDK.getSdkVersion = r6
            int r2 = r2 % 2
            r1.put(r4)     // Catch: java.lang.Throwable -> L2f org.json.JSONException -> L32
        L91:
            int r2 = r0.length()     // Catch: java.lang.Throwable -> L2f org.json.JSONException -> L32
            long r4 = (long) r2     // Catch: java.lang.Throwable -> L2f org.json.JSONException -> L32
            r6 = 4
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 < 0) goto La9
            AFKeystoreWrapper(r0)     // Catch: java.lang.Throwable -> L2f org.json.JSONException -> L32
            int r2 = com.appsflyer.internal.AFb1zSDK.getSdkVersion
            int r2 = r2 + 107
            int r4 = r2 % 128
            com.appsflyer.internal.AFb1zSDK.onPause = r4
            int r2 = r2 % 2
        La9:
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L2f org.json.JSONException -> L32
            r0.put(r13, r1)     // Catch: java.lang.Throwable -> L2f org.json.JSONException -> L32
            com.appsflyer.internal.AFb1gSDK r12 = r11.AFInAppEventParameterName(r12)     // Catch: java.lang.Throwable -> L2f org.json.JSONException -> L32
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L2f org.json.JSONException -> L32
            r12.AFInAppEventParameterName(r3, r0)     // Catch: java.lang.Throwable -> L2f org.json.JSONException -> L32
            return
        Lbc:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Couldn't save referrer - "
            r0.<init>(r1)
            r0.append(r13)
            java.lang.String r13 = ": "
            r0.append(r13)
            java.lang.String r13 = r0.toString()
            com.appsflyer.AFLogger.afErrorLog(r13, r12)
            return
        Ld3:
            java.lang.String r13 = "error at addReferrer"
            com.appsflyer.AFLogger.afErrorLogForExcManagerOnly(r13, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1zSDK.AFInAppEventParameterName(android.content.Context, java.lang.String):void");
    }

    final void valueOf(WeakReference<Context> weakReference) {
        int i = onPause + 91;
        getSdkVersion = i % 128;
        int i2 = i % 2;
        if (weakReference.get() == null) {
            return;
        }
        AFLogger.afInfoLog("app went to background");
        SharedPreferences AFInAppEventType2 = AFInAppEventType(weakReference.get());
        AppsFlyerProperties.getInstance().saveProperties(AFInAppEventType2);
        long j = AFInAppEventParameterName().afRDLog().AFLogger$LogLevel;
        HashMap hashMap = new HashMap();
        String str = this.onResponseError.AFVersionDeclaration().AFInAppEventType;
        if (str == null) {
            int i3 = getSdkVersion + 35;
            onPause = i3 % 128;
            if (i3 % 2 == 0) {
                AFLogger.afWarnLog("[callStats] AppsFlyer's SDK cannot send any event without providing DevKey.");
                return;
            } else {
                AFLogger.afWarnLog("[callStats] AppsFlyer's SDK cannot send any event without providing DevKey.");
                throw null;
            }
        }
        String AFInAppEventParameterName2 = AFInAppEventParameterName("KSAppsFlyerId");
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, false)) {
            hashMap.put(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, tmb.h.TRUE_JSON_NAME);
        }
        AFc1vSDK.AFa1wSDK values2 = AFa1bSDK.values(weakReference.get().getContentResolver());
        if (values2 != null) {
            int i4 = onPause + 89;
            getSdkVersion = i4 % 128;
            int i5 = i4 % 2;
            hashMap.put("amazon_aid", values2.AFInAppEventType);
            hashMap.put("amazon_aid_limit", String.valueOf(values2.valueOf));
        }
        String string = AppsFlyerProperties.getInstance().getString("advertiserId");
        if (string != null) {
            hashMap.put("advertiserId", string);
        }
        hashMap.put(HiAnalyticsConstant.BI_KEY_APP_ID, weakReference.get().getPackageName());
        hashMap.put("devkey", str);
        hashMap.put("uid", AFb1xSDK.AFInAppEventParameterName(weakReference));
        hashMap.put("time_in_app", String.valueOf(j));
        hashMap.put("statType", "user_closed_app");
        hashMap.put("platform", "Android");
        hashMap.put("launch_counter", Integer.toString(AFInAppEventParameterName(AFInAppEventType2, false)));
        hashMap.put(AppsFlyerProperties.CHANNEL, valueOf(weakReference.get()));
        if (AFInAppEventParameterName2 == null) {
            AFInAppEventParameterName2 = "";
        }
        hashMap.put("originalAppsflyerId", AFInAppEventParameterName2);
        if (this.onConversionDataSuccess) {
            AFe1eSDK aFe1eSDK = new AFe1eSDK();
            aFe1eSDK.AFVersionDeclaration = isStopped();
            AFd1eSDK aFd1eSDK = new AFd1eSDK((AFe1eSDK) aFe1eSDK.AFInAppEventParameterName(this.onResponseError.values().values.AFInAppEventType("appsFlyerCount", 0)).AFInAppEventType(hashMap).AFInAppEventType(String.format(AFLogger, AppsFlyerLib.getInstance().getHostPrefix(), AFInAppEventType().getHostName())), this.onResponseError);
            AFd1xSDK afDebugLog = this.onResponseError.afDebugLog();
            afDebugLog.AFKeystoreWrapper.execute(new AFd1xSDK.AnonymousClass2(aFd1eSDK));
            return;
        }
        AFLogger.afDebugLog("Stats call is disabled, ignore ...");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void AFInAppEventType(AFd1aSDK aFd1aSDK) {
        int i = onPause + 13;
        getSdkVersion = i % 128;
        int i2 = i % 2;
        if (aFd1aSDK == AFd1aSDK.SUCCESS) {
            int i3 = getSdkVersion + 1;
            onPause = i3 % 128;
            int i4 = i3 % 2;
            AFInAppEventParameterName().onInstallConversionDataLoadedNative().AFInAppEventParameterName();
        }
        int i5 = getSdkVersion + 51;
        onPause = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 51 / 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0076, code lost:
        if (com.appsflyer.internal.AFb1zSDK.AnonymousClass10.values[r10.ordinal()] != 2) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0078, code lost:
        r1.add(com.appsflyer.internal.AFa1aSDK.values(r5));
        r5 = "sha256_el_arr";
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0082, code lost:
        r1.add(r5);
        r5 = "plain_el_arr";
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0069, code lost:
        if (com.appsflyer.internal.AFb1zSDK.AnonymousClass10.values[r10.ordinal()] != 2) goto L10;
     */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setUserEmails(com.appsflyer.AppsFlyerProperties.EmailsCryptType r10, java.lang.String... r11) {
        /*
            r9 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r11.length
            int r1 = r1 + 1
            r0.<init>(r1)
            java.lang.String r1 = r10.toString()
            r0.add(r1)
            java.util.List r1 = java.util.Arrays.asList(r11)
            r0.addAll(r1)
            com.appsflyer.internal.AFb1uSDK r1 = com.appsflyer.internal.AFb1uSDK.AFInAppEventType()
            int r2 = r11.length
            int r2 = r2 + 1
            java.lang.String[] r2 = new java.lang.String[r2]
            java.lang.Object[] r0 = r0.toArray(r2)
            java.lang.String[] r0 = (java.lang.String[]) r0
            java.lang.String r2 = "setUserEmails"
            r1.AFKeystoreWrapper(r2, r0)
            com.appsflyer.AppsFlyerProperties r0 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r1 = "userEmailsCryptType"
            int r2 = r10.getValue()
            r0.set(r1, r2)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r2 = r11.length
            int r3 = com.appsflyer.internal.AFb1zSDK.onPause
            int r3 = r3 + 117
            int r4 = r3 % 128
            com.appsflyer.internal.AFb1zSDK.getSdkVersion = r4
            r4 = 2
            int r3 = r3 % r4
            r3 = 0
            r5 = 0
            r6 = 0
        L4f:
            if (r6 >= r2) goto L93
            int r5 = com.appsflyer.internal.AFb1zSDK.onPause
            int r5 = r5 + 5
            int r7 = r5 % 128
            com.appsflyer.internal.AFb1zSDK.getSdkVersion = r7
            int r5 = r5 % r4
            if (r5 != 0) goto L6c
            r5 = r11[r6]
            int[] r7 = com.appsflyer.internal.AFb1zSDK.AnonymousClass10.values
            int r8 = r10.ordinal()
            r7 = r7[r8]
            r8 = 22
            int r8 = r8 / r3
            if (r7 == r4) goto L82
            goto L78
        L6c:
            r5 = r11[r6]
            int[] r7 = com.appsflyer.internal.AFb1zSDK.AnonymousClass10.values
            int r8 = r10.ordinal()
            r7 = r7[r8]
            if (r7 == r4) goto L82
        L78:
            java.lang.String r5 = com.appsflyer.internal.AFa1aSDK.values(r5)
            r1.add(r5)
            java.lang.String r5 = "sha256_el_arr"
            goto L87
        L82:
            r1.add(r5)
            java.lang.String r5 = "plain_el_arr"
        L87:
            int r6 = r6 + 1
            int r7 = com.appsflyer.internal.AFb1zSDK.getSdkVersion
            int r7 = r7 + 111
            int r8 = r7 % 128
            com.appsflyer.internal.AFb1zSDK.onPause = r8
            int r7 = r7 % r4
            goto L4f
        L93:
            r0.put(r5, r1)
            org.json.JSONObject r10 = new org.json.JSONObject
            r10.<init>(r0)
            com.appsflyer.AppsFlyerProperties r11 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r10 = r10.toString()
            r11.setUserEmails(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1zSDK.setUserEmails(com.appsflyer.AppsFlyerProperties$EmailsCryptType, java.lang.String[]):void");
    }

    private static void AFInAppEventType(AppsFlyerConversionListener appsFlyerConversionListener) {
        int i = onPause + 107;
        int i2 = i % 128;
        getSdkVersion = i2;
        int i3 = i % 2;
        if (appsFlyerConversionListener != null) {
            valueOf = appsFlyerConversionListener;
            return;
        }
        int i4 = i2 + 15;
        onPause = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private static boolean AFInAppEventType(@NonNull SharedPreferences sharedPreferences) {
        int i = getSdkVersion + 53;
        onPause = i % 128;
        int i2 = i % 2;
        String string = sharedPreferences.getString("sentSuccessfully", null);
        if (i2 != 0) {
            Boolean.parseBoolean(string);
            throw null;
        }
        boolean parseBoolean = Boolean.parseBoolean(string);
        int i3 = getSdkVersion + 117;
        onPause = i3 % 128;
        int i4 = i3 % 2;
        return parseBoolean;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0027, code lost:
        if ((r0 % 2) != 0) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0029, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002c, code lost:
        r0 = AFInAppEventParameterName();
        r1 = r0.afDebugLog();
        r1.AFKeystoreWrapper.execute(new com.appsflyer.internal.AFd1xSDK.AnonymousClass2(r1, new com.appsflyer.internal.AFd1nSDK(r0)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0043, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
        if (com.appsflyer.internal.AFd1nSDK.AFLogger() != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
        if (com.appsflyer.internal.AFd1nSDK.AFLogger() != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
        r0 = com.appsflyer.internal.AFb1zSDK.getSdkVersion + 7;
        com.appsflyer.internal.AFb1zSDK.onPause = r0 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void afInfoLog() {
        /*
            r4 = this;
            int r0 = com.appsflyer.internal.AFb1zSDK.getSdkVersion
            int r0 = r0 + 107
            int r1 = r0 % 128
            com.appsflyer.internal.AFb1zSDK.onPause = r1
            int r0 = r0 % 2
            if (r0 == 0) goto L17
            boolean r0 = com.appsflyer.internal.AFd1nSDK.AFLogger()
            r1 = 31
            int r1 = r1 / 0
            if (r0 == 0) goto L2c
            goto L1d
        L17:
            boolean r0 = com.appsflyer.internal.AFd1nSDK.AFLogger()
            if (r0 == 0) goto L2c
        L1d:
            int r0 = com.appsflyer.internal.AFb1zSDK.getSdkVersion
            int r0 = r0 + 7
            int r1 = r0 % 128
            com.appsflyer.internal.AFb1zSDK.onPause = r1
            int r0 = r0 % 2
            if (r0 != 0) goto L2a
            return
        L2a:
            r0 = 0
            throw r0
        L2c:
            com.appsflyer.internal.AFc1xSDK r0 = r4.AFInAppEventParameterName()
            com.appsflyer.internal.AFd1xSDK r1 = r0.afDebugLog()
            com.appsflyer.internal.AFd1nSDK r2 = new com.appsflyer.internal.AFd1nSDK
            r2.<init>(r0)
            java.util.concurrent.Executor r0 = r1.AFKeystoreWrapper
            com.appsflyer.internal.AFd1xSDK$2 r3 = new com.appsflyer.internal.AFd1xSDK$2
            r3.<init>(r2)
            r0.execute(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1zSDK.afInfoLog():void");
    }

    private static void AFInAppEventType(Context context, Map<String, Object> map, String str) {
        int i = onPause + 65;
        getSdkVersion = i % 128;
        try {
            if (i % 2 != 0) {
                SharedPreferences AFInAppEventType2 = AFInAppEventType(context);
                SharedPreferences.Editor edit = AFInAppEventType2.edit();
                String string = AFInAppEventType2.getString("prev_event_name", null);
                if (string != null) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("prev_event_timestamp", AFInAppEventType2.getLong("prev_event_timestamp", -1L));
                    jSONObject.put("prev_event_name", string);
                    map.put("prev_event", jSONObject);
                }
                edit.putString("prev_event_name", str).putLong("prev_event_timestamp", System.currentTimeMillis()).apply();
                int i2 = getSdkVersion + 99;
                onPause = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 21 / 0;
                    return;
                }
                return;
            }
            SharedPreferences AFInAppEventType3 = AFInAppEventType(context);
            AFInAppEventType3.edit();
            AFInAppEventType3.getString("prev_event_name", null);
            throw null;
        } catch (Exception e) {
            AFLogger.afErrorLog("Error while processing previous event.", e);
        }
    }

    private boolean afErrorLog() {
        int i = onPause + 119;
        getSdkVersion = i % 128;
        if (i % 2 != 0) {
            Map<String, Object> map = this.onAttributionFailure;
            if (map != null && !map.isEmpty()) {
                int i2 = getSdkVersion + 83;
                onPause = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            int i4 = onPause + 9;
            getSdkVersion = i4 % 128;
            if (i4 % 2 != 0) {
                return false;
            }
            throw null;
        }
        throw null;
    }

    private boolean afDebugLog() {
        if (this.onInstallConversionFailureNative > 0) {
            long currentTimeMillis = System.currentTimeMillis() - this.onInstallConversionFailureNative;
            Locale locale = Locale.US;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS Z", locale);
            String AFKeystoreWrapper2 = AFKeystoreWrapper(simpleDateFormat, this.onInstallConversionFailureNative);
            String AFKeystoreWrapper3 = AFKeystoreWrapper(simpleDateFormat, this.init);
            if (currentTimeMillis < this.onInstallConversionDataLoadedNative) {
                int i = getSdkVersion + 23;
                onPause = i % 128;
                int i2 = i % 2;
                if (!isStopped()) {
                    int i3 = getSdkVersion + 61;
                    onPause = i3 % 128;
                    int i4 = i3 % 2;
                    AFLogger.afInfoLog(String.format(locale, "Last Launch attempt: %s;\nLast successful Launch event: %s;\nThis launch is blocked: %s ms < %s ms", AFKeystoreWrapper2, AFKeystoreWrapper3, Long.valueOf(currentTimeMillis), Long.valueOf(this.onInstallConversionDataLoadedNative)));
                    return true;
                }
            }
            if (!isStopped()) {
                AFLogger.afInfoLog(String.format(locale, "Last Launch attempt: %s;\nLast successful Launch event: %s;\nSending launch (+%s ms)", AFKeystoreWrapper2, AFKeystoreWrapper3, Long.valueOf(currentTimeMillis)));
            }
        } else if (!isStopped()) {
            int i5 = getSdkVersion + 115;
            onPause = i5 % 128;
            if (i5 % 2 == 0) {
                AFLogger.afInfoLog("Sending first launch for this session!");
            } else {
                AFLogger.afInfoLog("Sending first launch for this session!");
                throw null;
            }
        }
        int i6 = getSdkVersion + 51;
        onPause = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public final boolean values() {
        int i = onPause + 65;
        getSdkVersion = i % 128;
        int i2 = i % 2;
        if (AFInAppEventParameterName(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false) && AFKeystoreWrapper() == null) {
            int i3 = onPause + 5;
            getSdkVersion = i3 % 128;
            int i4 = i3 % 2;
            return true;
        }
        return false;
    }

    private static void AFKeystoreWrapper(String str, String str2) {
        int i = onPause + 13;
        getSdkVersion = i % 128;
        int i2 = i % 2;
        AppsFlyerProperties.getInstance().set(str, str2);
        int i3 = getSdkVersion + 57;
        onPause = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    private void values(Context context, String str, Map<String, Object> map) {
        Activity activity;
        AFe1iSDK aFe1iSDK = new AFe1iSDK();
        if (context != null) {
            aFe1iSDK.AFKeystoreWrapper = (Application) context.getApplicationContext();
            int i = onPause + 45;
            getSdkVersion = i % 128;
            int i2 = i % 2;
        }
        aFe1iSDK.afRDLog = str;
        aFe1iSDK.values = map;
        if (context instanceof Activity) {
            int i3 = onPause;
            int i4 = i3 + 59;
            getSdkVersion = i4 % 128;
            int i5 = i4 % 2;
            activity = (Activity) context;
            int i6 = i3 + 111;
            getSdkVersion = i6 % 128;
            int i7 = i6 % 2;
        } else {
            activity = null;
        }
        values(aFe1iSDK, activity);
    }

    private static void AFKeystoreWrapper(String str, boolean z) {
        int i = getSdkVersion + 17;
        onPause = i % 128;
        int i2 = i % 2;
        AppsFlyerProperties.getInstance().set(str, z);
        int i3 = onPause + 115;
        getSdkVersion = i3 % 128;
        int i4 = i3 % 2;
    }

    public static String AFKeystoreWrapper() {
        int i = getSdkVersion + 123;
        onPause = i % 128;
        int i2 = i % 2;
        String AFInAppEventParameterName2 = AFInAppEventParameterName(AppsFlyerProperties.APP_USER_ID);
        int i3 = getSdkVersion + 123;
        onPause = i3 % 128;
        int i4 = i3 % 2;
        return AFInAppEventParameterName2;
    }

    @VisibleForTesting
    @Nullable
    private String AFInAppEventType(Context context, String str) {
        int i = getSdkVersion;
        int i2 = i + 51;
        onPause = i2 % 128;
        int i3 = i2 % 2;
        if (context == null) {
            int i4 = i + 9;
            onPause = i4 % 128;
            int i5 = i4 % 2;
            return null;
        }
        AFb1bSDK aFb1bSDK = this.onResponseError;
        if (context != null) {
            int i6 = i + 5;
            onPause = i6 % 128;
            if (i6 % 2 == 0) {
                AFc1ySDK aFc1ySDK = aFb1bSDK.valueOf;
                if (context != null) {
                    aFc1ySDK.values = context.getApplicationContext();
                }
            } else {
                AFc1ySDK aFc1ySDK2 = aFb1bSDK.valueOf;
                throw null;
            }
        }
        return AFInAppEventParameterName().values().AFKeystoreWrapper(str);
    }

    private void AFKeystoreWrapper(Context context, AFe1lSDK aFe1lSDK) {
        int i = onPause + 9;
        getSdkVersion = i % 128;
        int i2 = i % 2;
        AFb1bSDK aFb1bSDK = this.onResponseError;
        if (context != null) {
            aFb1bSDK.valueOf.values = context.getApplicationContext();
        }
        AFe1nSDK afRDLog = AFInAppEventParameterName().afRDLog();
        AFe1oSDK AFInAppEventParameterName2 = AFa1lSDK.AFInAppEventParameterName(context);
        if (afRDLog.AFInAppEventParameterName()) {
            int i3 = onPause + 7;
            getSdkVersion = i3 % 128;
            if (i3 % 2 != 0) {
                afRDLog.values.put("api_name", aFe1lSDK.toString());
                afRDLog.AFInAppEventParameterName(AFInAppEventParameterName2);
                int i4 = onPause + 73;
                getSdkVersion = i4 % 128;
                int i5 = i4 % 2;
            } else {
                afRDLog.values.put("api_name", aFe1lSDK.toString());
                afRDLog.AFInAppEventParameterName(AFInAppEventParameterName2);
                throw null;
            }
        }
        afRDLog.AFKeystoreWrapper();
    }

    private static String AFLogger() {
        int i = onPause + 103;
        getSdkVersion = i % 128;
        int i2 = i % 2;
        String AFInAppEventParameterName2 = AFInAppEventParameterName("appid");
        int i3 = getSdkVersion + 119;
        onPause = i3 % 128;
        int i4 = i3 % 2;
        return AFInAppEventParameterName2;
    }

    private static String AFInAppEventParameterName(String str) {
        int i = getSdkVersion + 15;
        onPause = i % 128;
        if (i % 2 != 0) {
            int i2 = 83 / 0;
            return AppsFlyerProperties.getInstance().getString(str);
        }
        return AppsFlyerProperties.getInstance().getString(str);
    }

    private static boolean AFInAppEventParameterName(String str, boolean z) {
        int i = getSdkVersion + 21;
        onPause = i % 128;
        if (i % 2 == 0) {
            return AppsFlyerProperties.getInstance().getBoolean(str, z);
        }
        AppsFlyerProperties.getInstance().getBoolean(str, z);
        throw null;
    }

    private void values(Context context, String str) {
        AFe1gSDK aFe1gSDK = new AFe1gSDK();
        if (context != null) {
            int i = onPause + 51;
            getSdkVersion = i % 128;
            int i2 = i % 2;
            aFe1gSDK.AFKeystoreWrapper = (Application) context.getApplicationContext();
        }
        AFa1sSDK AFInAppEventParameterName2 = aFe1gSDK.AFInAppEventParameterName(this.onResponseError.values().values.AFInAppEventType("appsFlyerCount", 0));
        AFInAppEventParameterName2.afInfoLog = str;
        if (str != null && str.length() > 5) {
            int i3 = getSdkVersion + 81;
            onPause = i3 % 128;
            int i4 = i3 % 2;
            if (AFKeystoreWrapper(AFInAppEventParameterName2, AFInAppEventType(context))) {
                AFInAppEventParameterName(this.onResponseError.AFInAppEventType(), new AFa1xSDK(this, AFInAppEventParameterName2, (byte) 0), 5L, TimeUnit.MILLISECONDS);
            }
        }
        int i5 = getSdkVersion + 21;
        onPause = i5 % 128;
        int i6 = i5 % 2;
    }

    private void AFInAppEventParameterName(Map<String, Object> map) {
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, false) || AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, false)) {
            return;
        }
        int i = getSdkVersion + 115;
        onPause = i % 128;
        int i2 = i % 2;
        if (map.get("advertiserId") != null) {
            try {
                if (AFb1nSDK.AFInAppEventParameterName(this.afDebugLog) && map.remove("android_id") != null) {
                    AFLogger.afInfoLog("validateGaidAndIMEI :: removing: android_id");
                }
                if (AFb1nSDK.AFInAppEventParameterName(this.onResponseError.AFVersionDeclaration().valueOf)) {
                    int i3 = getSdkVersion + 99;
                    onPause = i3 % 128;
                    if (i3 % 2 != 0) {
                        int i4 = 55 / 0;
                        if (map.remove("imei") == null) {
                            return;
                        }
                    } else if (map.remove("imei") == null) {
                        return;
                    }
                    int i5 = onPause + 119;
                    getSdkVersion = i5 % 128;
                    if (i5 % 2 != 0) {
                        AFLogger.afInfoLog("validateGaidAndIMEI :: removing: imei");
                    } else {
                        AFLogger.afInfoLog("validateGaidAndIMEI :: removing: imei");
                        throw null;
                    }
                }
            } catch (Exception e) {
                AFLogger.afErrorLog("failed to remove IMEI or AndroidID key from params; ", e);
            }
        }
    }

    private static void AFInAppEventType(String str) {
        try {
            if (new JSONObject(str).has("pid")) {
                int i = getSdkVersion + 81;
                onPause = i % 128;
                int i2 = i % 2;
                AFKeystoreWrapper("preInstallName", str);
                int i3 = onPause + 99;
                getSdkVersion = i3 % 128;
                int i4 = i3 % 2;
                return;
            }
            AFLogger.afWarnLog("Cannot set preinstall attribution data without a media source");
        } catch (JSONException e) {
            AFLogger.afErrorLog("Error parsing JSON for preinstall", e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0015, code lost:
        if (r2 != null) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0017, code lost:
        r1 = r1 + 77;
        com.appsflyer.internal.AFb1zSDK.getSdkVersion = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0027, code lost:
        if (r2.trim().length() <= 0) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
        return new java.io.File(r2.trim());
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003b, code lost:
        r2 = com.appsflyer.internal.AFb1zSDK.onPause + 59;
        com.appsflyer.internal.AFb1zSDK.getSdkVersion = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0010, code lost:
        if (r2 != null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.io.File afDebugLog(java.lang.String r2) {
        /*
            int r0 = com.appsflyer.internal.AFb1zSDK.getSdkVersion
            int r0 = r0 + 75
            int r1 = r0 % 128
            com.appsflyer.internal.AFb1zSDK.onPause = r1
            int r0 = r0 % 2
            if (r0 == 0) goto L15
            r0 = 36
            int r0 = r0 / 0
            if (r2 == 0) goto L3b
            goto L17
        L13:
            r2 = move-exception
            goto L33
        L15:
            if (r2 == 0) goto L3b
        L17:
            int r1 = r1 + 77
            int r0 = r1 % 128
            com.appsflyer.internal.AFb1zSDK.getSdkVersion = r0
            int r1 = r1 % 2
            java.lang.String r0 = r2.trim()     // Catch: java.lang.Throwable -> L13
            int r0 = r0.length()     // Catch: java.lang.Throwable -> L13
            if (r0 <= 0) goto L3b
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> L13
            java.lang.String r2 = r2.trim()     // Catch: java.lang.Throwable -> L13
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L13
            return r0
        L33:
            java.lang.String r0 = r2.getMessage()
            com.appsflyer.AFLogger.afErrorLog(r0, r2)
            goto L45
        L3b:
            int r2 = com.appsflyer.internal.AFb1zSDK.onPause
            int r2 = r2 + 59
            int r0 = r2 % 128
            com.appsflyer.internal.AFb1zSDK.getSdkVersion = r0
            int r2 = r2 % 2
        L45:
            int r2 = com.appsflyer.internal.AFb1zSDK.getSdkVersion
            int r2 = r2 + 97
            int r0 = r2 % 128
            com.appsflyer.internal.AFb1zSDK.onPause = r0
            int r2 = r2 % 2
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1zSDK.afDebugLog(java.lang.String):java.io.File");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0026, code lost:
        if (AFInAppEventType().onAppOpenAttribution == null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0028, code lost:
        AFInAppEventType().onAppOpenAttribution = r4.getApplicationContext().getSharedPreferences("appsflyer-data", 0);
        r4 = com.appsflyer.internal.AFb1zSDK.onPause + 1;
        com.appsflyer.internal.AFb1zSDK.getSdkVersion = r4 % 128;
        r4 = r4 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0042, code lost:
        r4 = AFInAppEventType().onAppOpenAttribution;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0019, code lost:
        if (AFInAppEventType().onAppOpenAttribution == null) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized android.content.SharedPreferences AFInAppEventType(android.content.Context r4) {
        /*
            java.lang.Class<com.appsflyer.internal.AFb1zSDK> r0 = com.appsflyer.internal.AFb1zSDK.class
            monitor-enter(r0)
            int r1 = com.appsflyer.internal.AFb1zSDK.onPause     // Catch: java.lang.Throwable -> L1e
            int r1 = r1 + 119
            int r2 = r1 % 128
            com.appsflyer.internal.AFb1zSDK.getSdkVersion = r2     // Catch: java.lang.Throwable -> L1e
            int r1 = r1 % 2
            r2 = 0
            if (r1 != 0) goto L20
            com.appsflyer.internal.AFb1zSDK r1 = AFInAppEventType()     // Catch: java.lang.Throwable -> L1e
            android.content.SharedPreferences r1 = r1.onAppOpenAttribution     // Catch: java.lang.Throwable -> L1e
            r3 = 94
            int r3 = r3 / r2
            if (r1 != 0) goto L42
            goto L28
        L1c:
            r4 = move-exception
            throw r4     // Catch: java.lang.Throwable -> L1e
        L1e:
            r4 = move-exception
            goto L4a
        L20:
            com.appsflyer.internal.AFb1zSDK r1 = AFInAppEventType()     // Catch: java.lang.Throwable -> L1e
            android.content.SharedPreferences r1 = r1.onAppOpenAttribution     // Catch: java.lang.Throwable -> L1e
            if (r1 != 0) goto L42
        L28:
            com.appsflyer.internal.AFb1zSDK r1 = AFInAppEventType()     // Catch: java.lang.Throwable -> L1e
            android.content.Context r4 = r4.getApplicationContext()     // Catch: java.lang.Throwable -> L1e
            java.lang.String r3 = "appsflyer-data"
            android.content.SharedPreferences r4 = r4.getSharedPreferences(r3, r2)     // Catch: java.lang.Throwable -> L1e
            r1.onAppOpenAttribution = r4     // Catch: java.lang.Throwable -> L1e
            int r4 = com.appsflyer.internal.AFb1zSDK.onPause     // Catch: java.lang.Throwable -> L1e
            int r4 = r4 + 1
            int r1 = r4 % 128
            com.appsflyer.internal.AFb1zSDK.getSdkVersion = r1     // Catch: java.lang.Throwable -> L1e
            int r4 = r4 % 2
        L42:
            com.appsflyer.internal.AFb1zSDK r4 = AFInAppEventType()     // Catch: java.lang.Throwable -> L1e
            android.content.SharedPreferences r4 = r4.onAppOpenAttribution     // Catch: java.lang.Throwable -> L1e
            monitor-exit(r0)
            return r4
        L4a:
            monitor-exit(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1zSDK.AFInAppEventType(android.content.Context):android.content.SharedPreferences");
    }

    public static String AFKeystoreWrapper(SimpleDateFormat simpleDateFormat, long j) {
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        String format = simpleDateFormat.format(new Date(j));
        int i = onPause + 67;
        getSdkVersion = i % 128;
        int i2 = i % 2;
        return format;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
        r0 = new com.appsflyer.internal.AFe1iSDK();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0026, code lost:
        r0 = new com.appsflyer.internal.AFe1bSDK();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0010, code lost:
        if (r5 != null) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0013, code lost:
        if (r5 != null) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
        if (r5.trim().isEmpty() == false) goto L13;
     */
    @android.support.annotation.VisibleForTesting
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void AFKeystoreWrapper(android.content.Context r4, java.lang.String r5, java.util.Map<java.lang.String, java.lang.Object> r6, java.lang.String r7, java.lang.String r8) {
        /*
            r3 = this;
            int r0 = com.appsflyer.internal.AFb1zSDK.getSdkVersion
            int r0 = r0 + 9
            int r1 = r0 % 128
            com.appsflyer.internal.AFb1zSDK.onPause = r1
            int r0 = r0 % 2
            if (r0 == 0) goto L13
            r0 = 23
            int r0 = r0 / 0
            if (r5 == 0) goto L26
            goto L15
        L13:
            if (r5 == 0) goto L26
        L15:
            java.lang.String r0 = r5.trim()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L20
            goto L26
        L20:
            com.appsflyer.internal.AFe1iSDK r0 = new com.appsflyer.internal.AFe1iSDK
            r0.<init>()
            goto L2b
        L26:
            com.appsflyer.internal.AFe1bSDK r0 = new com.appsflyer.internal.AFe1bSDK
            r0.<init>()
        L2b:
            if (r4 == 0) goto L3f
            int r1 = com.appsflyer.internal.AFb1zSDK.onPause
            int r1 = r1 + 99
            int r2 = r1 % 128
            com.appsflyer.internal.AFb1zSDK.getSdkVersion = r2
            int r1 = r1 % 2
            android.content.Context r4 = r4.getApplicationContext()
            android.app.Application r4 = (android.app.Application) r4
            r0.AFKeystoreWrapper = r4
        L3f:
            r0.afRDLog = r5
            r0.values = r6
            r0.afInfoLog = r7
            r0.AFInAppEventParameterName = r8
            r3.valueOf(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1zSDK.AFKeystoreWrapper(android.content.Context, java.lang.String, java.util.Map, java.lang.String, java.lang.String):void");
    }

    private static void values(Map<String, Object> map) {
        String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.ONELINK_ID);
        String string2 = AppsFlyerProperties.getInstance().getString("onelinkVersion");
        if (string != null) {
            int i = onPause + 113;
            getSdkVersion = i % 128;
            if (i % 2 == 0) {
                map.put("onelink_id", string);
                int i2 = 13 / 0;
            } else {
                map.put("onelink_id", string);
            }
            int i3 = onPause + 81;
            getSdkVersion = i3 % 128;
            int i4 = i3 % 2;
        }
        if (string2 != null) {
            map.put("onelink_ver", string2);
            int i5 = onPause + 7;
            getSdkVersion = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    private static int AFInAppEventType(SharedPreferences sharedPreferences, boolean z) {
        int i = getSdkVersion + 29;
        onPause = i % 128;
        int i2 = i % 2;
        int AFInAppEventParameterName2 = AFInAppEventParameterName(sharedPreferences, "appsFlyerInAppEventCount", z);
        int i3 = onPause + 65;
        getSdkVersion = i3 % 128;
        int i4 = i3 % 2;
        return AFInAppEventParameterName2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0035, code lost:
        if (r5 != 3) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0046, code lost:
        if (r5 != 3) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0049, code lost:
        r4 = "lr";
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void valueOf(android.content.Context r5, java.util.Map<java.lang.String, java.lang.Object> r6) {
        /*
            int r0 = com.appsflyer.internal.AFb1zSDK.getSdkVersion
            int r0 = r0 + 85
            int r1 = r0 % 128
            com.appsflyer.internal.AFb1zSDK.onPause = r1
            r1 = 2
            int r0 = r0 % r1
            java.lang.String r0 = "window"
            java.lang.Object r5 = r5.getSystemService(r0)
            android.view.WindowManager r5 = (android.view.WindowManager) r5
            if (r5 == 0) goto L59
            int r0 = com.appsflyer.internal.AFb1zSDK.onPause
            int r0 = r0 + 51
            int r2 = r0 % 128
            com.appsflyer.internal.AFb1zSDK.getSdkVersion = r2
            int r0 = r0 % r1
            r2 = 3
            r3 = 1
            java.lang.String r4 = ""
            if (r0 != 0) goto L38
            android.view.Display r5 = r5.getDefaultDisplay()
            int r5 = r5.getRotation()
            r0 = 22
            int r0 = r0 / 0
            if (r5 == 0) goto L52
            if (r5 == r3) goto L4f
            if (r5 == r1) goto L4c
            if (r5 == r2) goto L49
            goto L54
        L38:
            android.view.Display r5 = r5.getDefaultDisplay()
            int r5 = r5.getRotation()
            if (r5 == 0) goto L52
            if (r5 == r3) goto L4f
            if (r5 == r1) goto L4c
            if (r5 == r2) goto L49
            goto L54
        L49:
            java.lang.String r4 = "lr"
            goto L54
        L4c:
            java.lang.String r4 = "pr"
            goto L54
        L4f:
            java.lang.String r4 = "l"
            goto L54
        L52:
            java.lang.String r4 = "p"
        L54:
            java.lang.String r5 = "sc_o"
            r6.put(r5, r4)
        L59:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1zSDK.valueOf(android.content.Context, java.util.Map):void");
    }

    private boolean AFKeystoreWrapper(AFa1sSDK aFa1sSDK, SharedPreferences sharedPreferences) {
        boolean z;
        int i = getSdkVersion + 15;
        onPause = i % 128;
        int i2 = i % 2;
        int AFInAppEventParameterName2 = AFInAppEventParameterName(sharedPreferences, false);
        if (AFInAppEventParameterName2 != 1 || (aFa1sSDK instanceof AFe1hSDK)) {
            z = false;
        } else {
            int i3 = onPause + 111;
            getSdkVersion = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        }
        if (!sharedPreferences.getBoolean(AppsFlyerProperties.NEW_REFERRER_SENT, false)) {
            int i5 = onPause + 47;
            getSdkVersion = i5 % 128;
            if (i5 % 2 != 0) {
            }
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0041, code lost:
        if (r2.length() == 0) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
        if (r2.length() == 0) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004e, code lost:
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004f, code lost:
        r3 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005a, code lost:
        if (r2.contains(com.huawei.hms.framework.common.ContainerUtils.FIELD_DELIMITER) == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005c, code lost:
        r3 = new java.util.ArrayList(java.util.Arrays.asList(r2.split(com.huawei.hms.framework.common.ContainerUtils.FIELD_DELIMITER)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006a, code lost:
        r3.add(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006d, code lost:
        r5 = new java.lang.StringBuilder();
        r3 = r3.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007a, code lost:
        if (r3.hasNext() == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007c, code lost:
        r6 = com.appsflyer.internal.AFb1zSDK.getSdkVersion + 113;
        com.appsflyer.internal.AFb1zSDK.onPause = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0086, code lost:
        if ((r6 % 2) != 0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0088, code lost:
        r6 = (java.lang.String) r3.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0092, code lost:
        if (r6.contains("access_token") == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0094, code lost:
        r3.remove();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x009c, code lost:
        if (r5.length() == 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x009e, code lost:
        r5.append(com.huawei.hms.framework.common.ContainerUtils.FIELD_DELIMITER);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a8, code lost:
        if (r6.startsWith(ch.qos.logback.classic.spi.CallerData.NA) != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00aa, code lost:
        r8 = com.appsflyer.internal.AFb1zSDK.getSdkVersion + 103;
        com.appsflyer.internal.AFb1zSDK.onPause = r8 % 128;
        r8 = r8 % 2;
        r5.append(ch.qos.logback.classic.spi.CallerData.NA);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b7, code lost:
        r5.append(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00bb, code lost:
        ((java.lang.String) r3.next()).contains("access_token");
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c4, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00cd, code lost:
        return r10.replace(r2, r5.toString());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String values(@android.support.annotation.Nullable java.lang.String r10) {
        /*
            int r0 = com.appsflyer.internal.AFb1zSDK.onPause
            int r0 = r0 + 45
            int r1 = r0 % 128
            com.appsflyer.internal.AFb1zSDK.getSdkVersion = r1
            int r0 = r0 % 2
            r1 = 0
            if (r0 == 0) goto Lce
            if (r10 != 0) goto L10
            return r1
        L10:
            java.lang.String r0 = "fb\\d*?://authorize.*"
            boolean r0 = r10.matches(r0)
            if (r0 == 0) goto Lcd
            int r0 = com.appsflyer.internal.AFb1zSDK.getSdkVersion
            int r0 = r0 + 23
            int r2 = r0 % 128
            com.appsflyer.internal.AFb1zSDK.onPause = r2
            int r0 = r0 % 2
            java.lang.String r0 = "access_token"
            boolean r2 = r10.contains(r0)
            if (r2 == 0) goto Lcd
            int r2 = com.appsflyer.internal.AFb1zSDK.onPause
            int r2 = r2 + 43
            int r3 = r2 % 128
            com.appsflyer.internal.AFb1zSDK.getSdkVersion = r3
            int r2 = r2 % 2
            if (r2 != 0) goto L44
            java.lang.String r2 = valueOf(r10)
            int r3 = r2.length()
            r4 = 7
            int r4 = r4 / 0
            if (r3 != 0) goto L4f
            goto L4e
        L44:
            java.lang.String r2 = valueOf(r10)
            int r3 = r2.length()
            if (r3 != 0) goto L4f
        L4e:
            return r10
        L4f:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.lang.String r4 = "&"
            boolean r5 = r2.contains(r4)
            if (r5 == 0) goto L6a
            java.util.ArrayList r3 = new java.util.ArrayList
            java.lang.String[] r5 = r2.split(r4)
            java.util.List r5 = java.util.Arrays.asList(r5)
            r3.<init>(r5)
            goto L6d
        L6a:
            r3.add(r2)
        L6d:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.util.Iterator r3 = r3.iterator()
        L76:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto Lc5
            int r6 = com.appsflyer.internal.AFb1zSDK.getSdkVersion
            int r6 = r6 + 113
            int r7 = r6 % 128
            com.appsflyer.internal.AFb1zSDK.onPause = r7
            int r6 = r6 % 2
            if (r6 != 0) goto Lbb
            java.lang.Object r6 = r3.next()
            java.lang.String r6 = (java.lang.String) r6
            boolean r7 = r6.contains(r0)
            if (r7 == 0) goto L98
            r3.remove()
            goto L76
        L98:
            int r7 = r5.length()
            if (r7 == 0) goto La2
            r5.append(r4)
            goto Lb7
        La2:
            java.lang.String r7 = "?"
            boolean r8 = r6.startsWith(r7)
            if (r8 != 0) goto Lb7
            int r8 = com.appsflyer.internal.AFb1zSDK.getSdkVersion
            int r8 = r8 + 103
            int r9 = r8 % 128
            com.appsflyer.internal.AFb1zSDK.onPause = r9
            int r8 = r8 % 2
            r5.append(r7)
        Lb7:
            r5.append(r6)
            goto L76
        Lbb:
            java.lang.Object r10 = r3.next()
            java.lang.String r10 = (java.lang.String) r10
            r10.contains(r0)
            throw r1
        Lc5:
            java.lang.String r0 = r5.toString()
            java.lang.String r10 = r10.replace(r2, r0)
        Lcd:
            return r10
        Lce:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1zSDK.values(java.lang.String):java.lang.String");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:191:0x046d A[Catch: all -> 0x00c7, TRY_LEAVE, TryCatch #22 {all -> 0x00c7, blocks: (B:16:0x00bb, B:22:0x00d2, B:26:0x00ea, B:28:0x00fd, B:33:0x0115, B:35:0x0131, B:38:0x013a, B:40:0x0142, B:41:0x0147, B:43:0x014d, B:45:0x0155, B:51:0x01ee, B:53:0x01f4, B:55:0x01fa, B:56:0x0207, B:58:0x020e, B:61:0x0221, B:63:0x0227, B:64:0x022e, B:66:0x0234, B:59:0x0217, B:67:0x023b, B:69:0x0252, B:70:0x0257, B:73:0x025f, B:74:0x0262, B:76:0x026a, B:77:0x026d, B:79:0x0277, B:81:0x027d, B:82:0x0280, B:84:0x0288, B:85:0x0291, B:90:0x02a4, B:92:0x02af, B:95:0x02b9, B:96:0x02be, B:98:0x02c6, B:105:0x02ee, B:107:0x02f8, B:110:0x030a, B:111:0x030f, B:113:0x031d, B:121:0x0335, B:123:0x033b, B:126:0x034c, B:130:0x0356, B:133:0x0361, B:136:0x0370, B:139:0x037f, B:142:0x038c, B:144:0x0392, B:153:0x03b1, B:156:0x03be, B:162:0x03d7, B:165:0x03e9, B:169:0x03fb, B:171:0x0401, B:172:0x0417, B:175:0x0424, B:191:0x046d, B:189:0x0461, B:193:0x0475, B:195:0x0480, B:200:0x049d, B:205:0x04b2, B:210:0x04c7, B:216:0x04f3, B:249:0x05eb, B:251:0x05f4, B:253:0x05f8, B:255:0x0600, B:257:0x0607, B:258:0x061f, B:275:0x067e, B:287:0x06a9, B:292:0x06d1, B:280:0x068c, B:160:0x03cc, B:89:0x029a, B:178:0x043f, B:179:0x0443), top: B:422:0x00bb }] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0480 A[Catch: all -> 0x00c7, Exception -> 0x0486, TRY_LEAVE, TryCatch #22 {all -> 0x00c7, blocks: (B:16:0x00bb, B:22:0x00d2, B:26:0x00ea, B:28:0x00fd, B:33:0x0115, B:35:0x0131, B:38:0x013a, B:40:0x0142, B:41:0x0147, B:43:0x014d, B:45:0x0155, B:51:0x01ee, B:53:0x01f4, B:55:0x01fa, B:56:0x0207, B:58:0x020e, B:61:0x0221, B:63:0x0227, B:64:0x022e, B:66:0x0234, B:59:0x0217, B:67:0x023b, B:69:0x0252, B:70:0x0257, B:73:0x025f, B:74:0x0262, B:76:0x026a, B:77:0x026d, B:79:0x0277, B:81:0x027d, B:82:0x0280, B:84:0x0288, B:85:0x0291, B:90:0x02a4, B:92:0x02af, B:95:0x02b9, B:96:0x02be, B:98:0x02c6, B:105:0x02ee, B:107:0x02f8, B:110:0x030a, B:111:0x030f, B:113:0x031d, B:121:0x0335, B:123:0x033b, B:126:0x034c, B:130:0x0356, B:133:0x0361, B:136:0x0370, B:139:0x037f, B:142:0x038c, B:144:0x0392, B:153:0x03b1, B:156:0x03be, B:162:0x03d7, B:165:0x03e9, B:169:0x03fb, B:171:0x0401, B:172:0x0417, B:175:0x0424, B:191:0x046d, B:189:0x0461, B:193:0x0475, B:195:0x0480, B:200:0x049d, B:205:0x04b2, B:210:0x04c7, B:216:0x04f3, B:249:0x05eb, B:251:0x05f4, B:253:0x05f8, B:255:0x0600, B:257:0x0607, B:258:0x061f, B:275:0x067e, B:287:0x06a9, B:292:0x06d1, B:280:0x068c, B:160:0x03cc, B:89:0x029a, B:178:0x043f, B:179:0x0443), top: B:422:0x00bb }] */
    /* JADX WARN: Removed duplicated region for block: B:223:0x052a A[Catch: all -> 0x0534, TryCatch #8 {all -> 0x0534, blocks: (B:221:0x0513, B:223:0x052a, B:227:0x0540), top: B:396:0x0513 }] */
    /* JADX WARN: Removed duplicated region for block: B:249:0x05eb A[Catch: all -> 0x00c7, TRY_ENTER, TryCatch #22 {all -> 0x00c7, blocks: (B:16:0x00bb, B:22:0x00d2, B:26:0x00ea, B:28:0x00fd, B:33:0x0115, B:35:0x0131, B:38:0x013a, B:40:0x0142, B:41:0x0147, B:43:0x014d, B:45:0x0155, B:51:0x01ee, B:53:0x01f4, B:55:0x01fa, B:56:0x0207, B:58:0x020e, B:61:0x0221, B:63:0x0227, B:64:0x022e, B:66:0x0234, B:59:0x0217, B:67:0x023b, B:69:0x0252, B:70:0x0257, B:73:0x025f, B:74:0x0262, B:76:0x026a, B:77:0x026d, B:79:0x0277, B:81:0x027d, B:82:0x0280, B:84:0x0288, B:85:0x0291, B:90:0x02a4, B:92:0x02af, B:95:0x02b9, B:96:0x02be, B:98:0x02c6, B:105:0x02ee, B:107:0x02f8, B:110:0x030a, B:111:0x030f, B:113:0x031d, B:121:0x0335, B:123:0x033b, B:126:0x034c, B:130:0x0356, B:133:0x0361, B:136:0x0370, B:139:0x037f, B:142:0x038c, B:144:0x0392, B:153:0x03b1, B:156:0x03be, B:162:0x03d7, B:165:0x03e9, B:169:0x03fb, B:171:0x0401, B:172:0x0417, B:175:0x0424, B:191:0x046d, B:189:0x0461, B:193:0x0475, B:195:0x0480, B:200:0x049d, B:205:0x04b2, B:210:0x04c7, B:216:0x04f3, B:249:0x05eb, B:251:0x05f4, B:253:0x05f8, B:255:0x0600, B:257:0x0607, B:258:0x061f, B:275:0x067e, B:287:0x06a9, B:292:0x06d1, B:280:0x068c, B:160:0x03cc, B:89:0x029a, B:178:0x043f, B:179:0x0443), top: B:422:0x00bb }] */
    /* JADX WARN: Removed duplicated region for block: B:251:0x05f4 A[Catch: all -> 0x00c7, TryCatch #22 {all -> 0x00c7, blocks: (B:16:0x00bb, B:22:0x00d2, B:26:0x00ea, B:28:0x00fd, B:33:0x0115, B:35:0x0131, B:38:0x013a, B:40:0x0142, B:41:0x0147, B:43:0x014d, B:45:0x0155, B:51:0x01ee, B:53:0x01f4, B:55:0x01fa, B:56:0x0207, B:58:0x020e, B:61:0x0221, B:63:0x0227, B:64:0x022e, B:66:0x0234, B:59:0x0217, B:67:0x023b, B:69:0x0252, B:70:0x0257, B:73:0x025f, B:74:0x0262, B:76:0x026a, B:77:0x026d, B:79:0x0277, B:81:0x027d, B:82:0x0280, B:84:0x0288, B:85:0x0291, B:90:0x02a4, B:92:0x02af, B:95:0x02b9, B:96:0x02be, B:98:0x02c6, B:105:0x02ee, B:107:0x02f8, B:110:0x030a, B:111:0x030f, B:113:0x031d, B:121:0x0335, B:123:0x033b, B:126:0x034c, B:130:0x0356, B:133:0x0361, B:136:0x0370, B:139:0x037f, B:142:0x038c, B:144:0x0392, B:153:0x03b1, B:156:0x03be, B:162:0x03d7, B:165:0x03e9, B:169:0x03fb, B:171:0x0401, B:172:0x0417, B:175:0x0424, B:191:0x046d, B:189:0x0461, B:193:0x0475, B:195:0x0480, B:200:0x049d, B:205:0x04b2, B:210:0x04c7, B:216:0x04f3, B:249:0x05eb, B:251:0x05f4, B:253:0x05f8, B:255:0x0600, B:257:0x0607, B:258:0x061f, B:275:0x067e, B:287:0x06a9, B:292:0x06d1, B:280:0x068c, B:160:0x03cc, B:89:0x029a, B:178:0x043f, B:179:0x0443), top: B:422:0x00bb }] */
    /* JADX WARN: Removed duplicated region for block: B:349:0x098c  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x0999 A[Catch: all -> 0x095c, TryCatch #29 {all -> 0x095c, blocks: (B:348:0x0971, B:350:0x0991, B:352:0x0999, B:356:0x09ab, B:358:0x09b5, B:360:0x09bf, B:361:0x09d1, B:365:0x09f6, B:368:0x0a06, B:369:0x0a0a, B:371:0x0a4c, B:372:0x0a5c, B:335:0x0958), top: B:412:0x0958 }] */
    /* JADX WARN: Removed duplicated region for block: B:357:0x09b3  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x09bf A[Catch: all -> 0x095c, TryCatch #29 {all -> 0x095c, blocks: (B:348:0x0971, B:350:0x0991, B:352:0x0999, B:356:0x09ab, B:358:0x09b5, B:360:0x09bf, B:361:0x09d1, B:365:0x09f6, B:368:0x0a06, B:369:0x0a0a, B:371:0x0a4c, B:372:0x0a5c, B:335:0x0958), top: B:412:0x0958 }] */
    /* JADX WARN: Removed duplicated region for block: B:363:0x09f3  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x09f5  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x0a04 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:371:0x0a4c A[Catch: all -> 0x095c, TryCatch #29 {all -> 0x095c, blocks: (B:348:0x0971, B:350:0x0991, B:352:0x0999, B:356:0x09ab, B:358:0x09b5, B:360:0x09bf, B:361:0x09d1, B:365:0x09f6, B:368:0x0a06, B:369:0x0a0a, B:371:0x0a4c, B:372:0x0a5c, B:335:0x0958), top: B:412:0x0958 }] */
    /* JADX WARN: Removed duplicated region for block: B:376:0x0aff A[Catch: all -> 0x0b09, TryCatch #23 {all -> 0x0b09, blocks: (B:374:0x0afb, B:376:0x0aff, B:378:0x0b03, B:383:0x0b14), top: B:424:0x038a }] */
    /* JADX WARN: Removed duplicated region for block: B:394:0x062a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v49 */
    /* JADX WARN: Type inference failed for: r1v56 */
    @android.support.annotation.WorkerThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map<java.lang.String, java.lang.Object> AFInAppEventType(com.appsflyer.internal.AFa1sSDK r34) {
        /*
            Method dump skipped, instructions count: 2862
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1zSDK.AFInAppEventType(com.appsflyer.internal.AFa1sSDK):java.util.Map");
    }

    private static int AFInAppEventParameterName(SharedPreferences sharedPreferences) {
        int i = onPause + 103;
        getSdkVersion = i % 128;
        int i2 = i % 2;
        int AFInAppEventParameterName2 = AFInAppEventParameterName(sharedPreferences, "appsFlyerAdRevenueCount", true);
        int i3 = onPause + 31;
        getSdkVersion = i3 % 128;
        int i4 = i3 % 2;
        return AFInAppEventParameterName2;
    }

    private static boolean AFInAppEventParameterName(File file) {
        int i = getSdkVersion + 15;
        onPause = i % 128;
        if (i % 2 == 0) {
            if (file == null || !file.exists()) {
                int i2 = onPause + 23;
                getSdkVersion = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            return false;
        }
        throw null;
    }

    public static int AFInAppEventParameterName(SharedPreferences sharedPreferences, boolean z) {
        int i = getSdkVersion + 117;
        onPause = i % 128;
        int i2 = i % 2;
        int AFInAppEventParameterName2 = AFInAppEventParameterName(sharedPreferences, "appsFlyerCount", z);
        if (i2 != 0) {
            int i3 = 9 / 0;
        }
        return AFInAppEventParameterName2;
    }

    public static Map<String, Object> AFKeystoreWrapper(Map<String, Object> map) {
        Map<String, Object> map2;
        int i = onPause + 47;
        getSdkVersion = i % 128;
        int i2 = i % 2;
        if (!(!map.containsKey("meta"))) {
            int i3 = onPause + 53;
            getSdkVersion = i3 % 128;
            int i4 = i3 % 2;
            map2 = (Map) map.get("meta");
        } else {
            HashMap hashMap = new HashMap();
            map.put("meta", hashMap);
            map2 = hashMap;
        }
        int i5 = getSdkVersion + 27;
        onPause = i5 % 128;
        int i6 = i5 % 2;
        return map2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
        if (r5 != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
        if (r5 != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
        r0 = r0 + 1;
        r3.edit().putInt(r4, r0).apply();
        r3 = com.appsflyer.internal.AFb1zSDK.onPause + 45;
        com.appsflyer.internal.AFb1zSDK.getSdkVersion = r3 % 128;
        r3 = r3 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int AFInAppEventParameterName(android.content.SharedPreferences r3, java.lang.String r4, boolean r5) {
        /*
            int r0 = com.appsflyer.internal.AFb1zSDK.getSdkVersion
            int r0 = r0 + 43
            int r1 = r0 % 128
            com.appsflyer.internal.AFb1zSDK.onPause = r1
            int r0 = r0 % 2
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L15
            int r0 = r3.getInt(r4, r2)
            if (r5 == 0) goto L31
            goto L1b
        L15:
            int r0 = r3.getInt(r4, r1)
            if (r5 == 0) goto L31
        L1b:
            int r0 = r0 + r2
            android.content.SharedPreferences$Editor r3 = r3.edit()
            android.content.SharedPreferences$Editor r3 = r3.putInt(r4, r0)
            r3.apply()
            int r3 = com.appsflyer.internal.AFb1zSDK.onPause
            int r3 = r3 + 45
            int r4 = r3 % 128
            com.appsflyer.internal.AFb1zSDK.getSdkVersion = r4
            int r3 = r3 % 2
        L31:
            com.appsflyer.internal.AFb1uSDK r3 = com.appsflyer.internal.AFb1uSDK.AFInAppEventType()
            boolean r3 = r3.afDebugLog()
            if (r3 == 0) goto L60
            int r3 = com.appsflyer.internal.AFb1zSDK.getSdkVersion
            int r3 = r3 + r2
            int r4 = r3 % 128
            com.appsflyer.internal.AFb1zSDK.onPause = r4
            int r3 = r3 % 2
            if (r3 == 0) goto L55
            com.appsflyer.internal.AFb1uSDK r3 = com.appsflyer.internal.AFb1uSDK.AFInAppEventType()
            java.lang.String r4 = java.lang.String.valueOf(r0)
            r3.values(r4)
            r3 = 10
            int r3 = r3 / r1
            goto L60
        L55:
            com.appsflyer.internal.AFb1uSDK r3 = com.appsflyer.internal.AFb1uSDK.AFInAppEventType()
            java.lang.String r4 = java.lang.String.valueOf(r0)
            r3.values(r4)
        L60:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1zSDK.AFInAppEventParameterName(android.content.SharedPreferences, java.lang.String, boolean):int");
    }

    private static void valueOf(Context context, boolean z, Map<String, Object> map, int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("cpu_abi", AFKeystoreWrapper("ro.product.cpu.abi"));
        hashMap.put("cpu_abi2", AFKeystoreWrapper("ro.product.cpu.abi2"));
        hashMap.put("arch", AFKeystoreWrapper("os.arch"));
        hashMap.put("build_display_id", AFKeystoreWrapper("ro.build.display.id"));
        if (z) {
            int i2 = onPause + 93;
            getSdkVersion = i2 % 128;
            int i3 = i2 % 2;
            AFInAppEventParameterName(context, hashMap);
            if (i <= 2) {
                hashMap.putAll(AFa1eSDK.valueOf(context).AFInAppEventParameterName());
                int i4 = onPause + 85;
                getSdkVersion = i4 % 128;
                int i5 = i4 % 2;
            }
        }
        hashMap.put("dim", AFc1rSDK.values(context));
        map.put("deviceData", hashMap);
    }

    public static void AFKeystoreWrapper(Context context, Map<String, ? super String> map) {
        String str;
        int i = getSdkVersion + 121;
        onPause = i % 128;
        int i2 = i % 2;
        boolean AFInAppEventParameterName2 = AFInAppEventParameterName(AppsFlyerProperties.DISABLE_NETWORK_DATA, false);
        AFa1gSDK aFa1gSDK = AFa1gSDK.AFa1vSDK.AFInAppEventType;
        AFa1gSDK.AFa1xSDK AFInAppEventType2 = AFa1gSDK.AFInAppEventType(context);
        map.put("network", AFInAppEventType2.AFKeystoreWrapper);
        if (!AFInAppEventParameterName2) {
            int i3 = onPause + 27;
            getSdkVersion = i3 % 128;
            if (i3 % 2 != 0) {
                String str2 = AFInAppEventType2.AFInAppEventType;
                if (str2 != null) {
                    map.put("operator", str2);
                }
            } else {
                throw null;
            }
        }
        if (!AFInAppEventParameterName2 && (str = AFInAppEventType2.values) != null) {
            map.put("carrier", str);
        }
        int i4 = getSdkVersion + 83;
        onPause = i4 % 128;
        int i5 = i4 % 2;
    }

    private static void AFInAppEventParameterName(@NonNull ScheduledExecutorService scheduledExecutorService, Runnable runnable, long j, TimeUnit timeUnit) {
        int i = onPause + 69;
        getSdkVersion = i % 128;
        int i2 = i % 2;
        try {
            scheduledExecutorService.schedule(runnable, j, timeUnit);
            int i3 = getSdkVersion + 123;
            onPause = i3 % 128;
            int i4 = i3 % 2;
        } catch (RejectedExecutionException e) {
            AFLogger.afErrorLog("scheduleJob failed with RejectedExecutionException Exception", e);
        } catch (Throwable th) {
            AFLogger.afErrorLog("scheduleJob failed with Exception", th);
        }
    }

    @NonNull
    @Deprecated
    public static String AFInAppEventParameterName(HttpURLConnection httpURLConnection) {
        InputStreamReader inputStreamReader;
        String obj;
        char c;
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader = null;
        try {
            try {
                InputStream errorStream = httpURLConnection.getErrorStream();
                if (errorStream == null) {
                    errorStream = httpURLConnection.getInputStream();
                }
                inputStreamReader = new InputStreamReader(errorStream);
                try {
                    BufferedReader bufferedReader2 = new BufferedReader(inputStreamReader);
                    boolean z = false;
                    while (true) {
                        try {
                            String readLine = bufferedReader2.readLine();
                            if (readLine == null) {
                                break;
                            }
                            if (z) {
                                c = '\n';
                                int i = onPause + 123;
                                getSdkVersion = i % 128;
                                int i2 = i % 2;
                            } else {
                                c = "";
                            }
                            sb.append(c);
                            sb.append(readLine);
                            z = true;
                        } catch (Throwable th) {
                            th = th;
                            bufferedReader = bufferedReader2;
                            try {
                                StringBuilder sb2 = new StringBuilder("Could not read connection response from: ");
                                sb2.append(httpURLConnection.getURL().toString());
                                AFLogger.afErrorLog(sb2.toString(), th);
                                if (bufferedReader != null) {
                                    bufferedReader.close();
                                }
                                if (inputStreamReader != null) {
                                    int i3 = getSdkVersion + 101;
                                    onPause = i3 % 128;
                                    if (i3 % 2 != 0) {
                                        inputStreamReader.close();
                                        int i4 = 7 / 0;
                                    } else {
                                        inputStreamReader.close();
                                    }
                                }
                                obj = sb.toString();
                                new JSONObject(obj);
                                return obj;
                            } catch (Throwable th2) {
                                if (bufferedReader != null) {
                                    try {
                                        bufferedReader.close();
                                    } catch (Throwable th3) {
                                        AFLogger.afErrorLogForExcManagerOnly("readServerResponse error", th3);
                                        throw th2;
                                    }
                                }
                                if (inputStreamReader != null) {
                                    inputStreamReader.close();
                                    int i5 = getSdkVersion + 53;
                                    onPause = i5 % 128;
                                    int i6 = i5 % 2;
                                }
                                throw th2;
                            }
                        }
                    }
                    bufferedReader2.close();
                    inputStreamReader.close();
                } catch (Throwable th4) {
                    th = th4;
                }
            } catch (Throwable th5) {
                AFLogger.afErrorLogForExcManagerOnly("readServerResponse error", th5);
            }
        } catch (Throwable th6) {
            th = th6;
            inputStreamReader = null;
        }
        obj = sb.toString();
        try {
            new JSONObject(obj);
            return obj;
        } catch (JSONException e) {
            AFLogger.afErrorLogForExcManagerOnly("error while parsing readServerResponse", e);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("string_response", obj);
                return jSONObject.toString();
            } catch (JSONException e2) {
                AFLogger.afErrorLogForExcManagerOnly("RESPONSE_NOT_JSON error", e2);
                return new JSONObject().toString();
            }
        }
    }

    private static String valueOf(Activity activity) {
        String str = null;
        if (activity != null) {
            int i = onPause + 79;
            getSdkVersion = i % 128;
            if (i % 2 != 0) {
                Intent intent = activity.getIntent();
                if (intent != null) {
                    try {
                        Bundle extras = intent.getExtras();
                        if (extras != null) {
                            String string = extras.getString("af");
                            if (string != null) {
                                int i2 = getSdkVersion + 87;
                                onPause = i2 % 128;
                                try {
                                    if (i2 % 2 == 0) {
                                        AFLogger.afInfoLog("Push Notification received af payload = ".concat(string));
                                        extras.remove("af");
                                        activity.setIntent(intent.putExtras(extras));
                                    } else {
                                        AFLogger.afInfoLog("Push Notification received af payload = ".concat(string));
                                        extras.remove("af");
                                        activity.setIntent(intent.putExtras(extras));
                                        throw null;
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    str = string;
                                    AFLogger.afErrorLog(th.getMessage(), th);
                                    int i3 = getSdkVersion + 119;
                                    onPause = i3 % 128;
                                    int i4 = i3 % 2;
                                    return str;
                                }
                            }
                            str = string;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
            } else {
                activity.getIntent();
                throw null;
            }
        }
        int i32 = getSdkVersion + 119;
        onPause = i32 % 128;
        int i42 = i32 % 2;
        return str;
    }

    private static String AFKeystoreWrapper(String str) {
        Object invoke;
        int i = onPause + 105;
        getSdkVersion = i % 128;
        String str2 = null;
        try {
            if (i % 2 == 0) {
                Class<?> cls = Class.forName("android.os.SystemProperties");
                Class<?>[] clsArr = new Class[0];
                clsArr[0] = String.class;
                Method method = cls.getMethod("get", clsArr);
                Object[] objArr = new Object[0];
                objArr[1] = str;
                invoke = method.invoke(null, objArr);
            } else {
                invoke = Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, str);
            }
            str2 = (String) invoke;
            return str2;
        } catch (Throwable th) {
            AFLogger.afErrorLog(th.getMessage(), th);
            return str2;
        }
    }

    private static String AFKeystoreWrapper(File file, String str) {
        FileReader fileReader;
        int i;
        try {
            try {
                try {
                    Properties properties = new Properties();
                    fileReader = new FileReader(file);
                    try {
                        properties.load(fileReader);
                        AFLogger.afInfoLog("Found PreInstall property!");
                        String property = properties.getProperty(str);
                        try {
                            fileReader.close();
                        } catch (Throwable th) {
                            AFLogger.afErrorLog(th.getMessage(), th);
                        }
                        int i2 = getSdkVersion + 27;
                        onPause = i2 % 128;
                        if (i2 % 2 != 0) {
                            int i3 = 60 / 0;
                        }
                        return property;
                    } catch (FileNotFoundException unused) {
                        StringBuilder sb = new StringBuilder("PreInstall file wasn't found: ");
                        sb.append(file.getAbsolutePath());
                        AFLogger.afDebugLog(sb.toString());
                        if (fileReader != null) {
                            fileReader.close();
                            i = getSdkVersion + 119;
                            onPause = i % 128;
                            int i4 = i % 2;
                        }
                        return null;
                    } catch (Throwable th2) {
                        th = th2;
                        AFLogger.afErrorLog(th.getMessage(), th);
                        if (fileReader != null) {
                            fileReader.close();
                            i = onPause + 101;
                            getSdkVersion = i % 128;
                            int i42 = i % 2;
                        }
                        return null;
                    }
                } catch (Throwable th3) {
                    if (fileReader != null) {
                        try {
                            fileReader.close();
                        } catch (Throwable th4) {
                            AFLogger.afErrorLog(th4.getMessage(), th4);
                        }
                    }
                    throw th3;
                }
            } catch (FileNotFoundException unused2) {
                fileReader = null;
            } catch (Throwable th5) {
                th = th5;
                fileReader = null;
            }
        } catch (Throwable th6) {
            AFLogger.afErrorLog(th6.getMessage(), th6);
        }
    }

    public static boolean values(Context context) {
        try {
        } catch (Throwable th) {
            AFLogger.afErrorLog("WARNING:  Google play services is unavailable. ", th);
        }
        if (com.google.android.gms.common.a.m().g(context) == 0) {
            int i = onPause + 77;
            getSdkVersion = i % 128;
            int i2 = i % 2;
            return true;
        }
        int i3 = getSdkVersion + 47;
        onPause = i3 % 128;
        int i4 = i3 % 2;
        try {
            context.getPackageManager().getPackageInfo("com.google.android.gms", 0);
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            AFLogger.afErrorLog("WARNING:  Google Play Services is unavailable. ", e);
            return false;
        }
    }

    private static String valueOf(String str) {
        int indexOf = str.indexOf(63);
        if (indexOf == -1) {
            int i = onPause + 111;
            getSdkVersion = i % 128;
            if (i % 2 != 0) {
                return "";
            }
            throw null;
        }
        String substring = str.substring(indexOf);
        int i2 = getSdkVersion + 83;
        onPause = i2 % 128;
        if (i2 % 2 == 0) {
            return substring;
        }
        throw null;
    }

    private void values(Context context, Map<String, Object> map) {
        AppsFlyerProperties appsFlyerProperties = AppsFlyerProperties.getInstance();
        if (appsFlyerProperties.getBoolean(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, false)) {
            map.put(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, tmb.h.TRUE_JSON_NAME);
            return;
        }
        Context context2 = this.onResponseError.valueOf.values;
        if (context2 != null) {
            AFb1eSDK aFb1eSDK = new AFb1eSDK(AFInAppEventType(context2));
            String AFInAppEventType2 = this.onResponseError.AFVersionDeclaration().AFInAppEventType(aFb1eSDK);
            if (!AFb1nSDK.AFInAppEventParameterName(AFInAppEventType2)) {
                map.put("imei", AFInAppEventType2);
            }
            boolean z = appsFlyerProperties.getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID, false);
            String str = null;
            String valueOf2 = aFb1eSDK.valueOf("androidIdCached", (String) null);
            if (!z || !AFb1nSDK.AFInAppEventParameterName(this.afDebugLog)) {
                String str2 = this.afDebugLog;
                if (str2 != null) {
                    str = str2;
                }
            } else if (afInfoLog(context)) {
                try {
                    String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
                    if (string != null) {
                        str = string;
                    } else if (valueOf2 != null) {
                        AFLogger.afDebugLog("use cached AndroidId: ".concat(valueOf2));
                        str = valueOf2;
                    }
                } catch (Exception e) {
                    if (valueOf2 != null) {
                        AFLogger.afDebugLog("use cached AndroidId: ".concat(valueOf2));
                        str = valueOf2;
                    }
                    AFLogger.afErrorLog(e.getMessage(), e);
                }
            }
            if (str != null) {
                aFb1eSDK.AFInAppEventParameterName("androidIdCached", str);
                map.put("android_id", str);
            } else {
                AFLogger.afInfoLog("Android ID was not collected.");
            }
            AFc1vSDK.AFa1wSDK values2 = AFa1bSDK.values(context);
            if (values2 != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("isManual", values2.values);
                hashMap.put("val", values2.AFInAppEventType);
                Boolean bool = values2.valueOf;
                if (bool != null) {
                    hashMap.put("isLat", bool);
                }
                map.put("oaid", hashMap);
                return;
            }
            return;
        }
        throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
    }

    private AFd1hSDK.AFa1zSDK valueOf(final Map<String, String> map) {
        AFd1hSDK.AFa1zSDK aFa1zSDK = new AFd1hSDK.AFa1zSDK() { // from class: com.appsflyer.internal.AFb1zSDK.4
            @Override // com.appsflyer.internal.AFd1hSDK.AFa1zSDK
            public final void AFInAppEventParameterName(String str) {
                AFb1oSDK.AFInAppEventType(str, DeepLinkResult.Error.NETWORK);
            }

            @Override // com.appsflyer.internal.AFd1hSDK.AFa1zSDK
            public final void AFInAppEventType(Map<String, String> map2) {
                for (String str : map2.keySet()) {
                    map.put(str, map2.get(str));
                }
                AFb1oSDK.AFInAppEventParameterName(map);
            }
        };
        int i = onPause + 95;
        getSdkVersion = i % 128;
        if (i % 2 == 0) {
            int i2 = 42 / 0;
        }
        return aFa1zSDK;
    }

    private void valueOf(AFa1sSDK aFa1sSDK) {
        boolean z;
        if (aFa1sSDK.afRDLog == null) {
            int i = onPause + 85;
            int i2 = i % 128;
            getSdkVersion = i2;
            int i3 = i % 2;
            int i4 = i2 + 37;
            onPause = i4 % 128;
            int i5 = i4 % 2;
            z = true;
        } else {
            z = false;
        }
        if (values()) {
            int i6 = onPause + 35;
            getSdkVersion = i6 % 128;
            int i7 = i6 % 2;
            AFLogger.afInfoLog("CustomerUserId not set, reporting is disabled", true);
            return;
        }
        if (z) {
            if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.LAUNCH_PROTECT_ENABLED, true)) {
                int i8 = onPause + 15;
                getSdkVersion = i8 % 128;
                int i9 = i8 % 2;
                if (afDebugLog()) {
                    int i10 = onPause + 71;
                    getSdkVersion = i10 % 128;
                    if (i10 % 2 != 0) {
                        AppsFlyerRequestListener appsFlyerRequestListener = aFa1sSDK.AFInAppEventType;
                        if (appsFlyerRequestListener != null) {
                            appsFlyerRequestListener.onError(RequestError.EVENT_TIMEOUT, AFb1dSDK.valueOf);
                            return;
                        }
                        return;
                    }
                    throw null;
                }
            } else {
                AFLogger.afInfoLog("Allowing multiple launches within a 5 second time window.");
            }
            this.onInstallConversionFailureNative = System.currentTimeMillis();
        }
        AFInAppEventParameterName(this.onResponseError.AFInAppEventType(), new AFa1xSDK(this, aFa1sSDK, (byte) 0), 0L, TimeUnit.MILLISECONDS);
    }

    public static String AFKeystoreWrapper(AFb1gSDK aFb1gSDK, String str) {
        int i = onPause + 43;
        getSdkVersion = i % 128;
        int i2 = i % 2;
        String valueOf2 = aFb1gSDK.valueOf("CACHED_CHANNEL", (String) null);
        if (valueOf2 != null) {
            int i3 = getSdkVersion + 69;
            onPause = i3 % 128;
            int i4 = i3 % 2;
            return valueOf2;
        }
        aFb1gSDK.AFInAppEventParameterName("CACHED_CHANNEL", str);
        int i5 = onPause + 105;
        getSdkVersion = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void AFInAppEventParameterName(com.appsflyer.internal.AFa1sSDK r12) {
        /*
            Method dump skipped, instructions count: 524
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1zSDK.AFInAppEventParameterName(com.appsflyer.internal.AFa1sSDK):void");
    }

    public final void AFKeystoreWrapper(@NonNull Context context) {
        AFb1bSDK aFb1bSDK = this.onResponseError;
        if (context != null) {
            int i = onPause + 85;
            int i2 = i % 128;
            getSdkVersion = i2;
            if (i % 2 != 0) {
                AFc1ySDK aFc1ySDK = aFb1bSDK.valueOf;
                if (context != null) {
                    int i3 = i2 + 61;
                    onPause = i3 % 128;
                    int i4 = i3 % 2;
                    aFc1ySDK.values = context.getApplicationContext();
                    if (i4 != 0) {
                        throw null;
                    }
                }
            } else {
                AFc1ySDK aFc1ySDK2 = aFb1bSDK.valueOf;
                throw null;
            }
        }
        int i5 = onPause + 21;
        getSdkVersion = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void valueOf(Context context, Map<String, Object> map, Uri uri) {
        AFb1bSDK aFb1bSDK = this.onResponseError;
        if (context != null) {
            AFc1ySDK aFc1ySDK = aFb1bSDK.valueOf;
            if (context != null) {
                int i = onPause + 81;
                getSdkVersion = i % 128;
                if (i % 2 == 0) {
                    aFc1ySDK.values = context.getApplicationContext();
                    int i2 = 87 / 0;
                } else {
                    aFc1ySDK.values = context.getApplicationContext();
                }
            }
        }
        if (!map.containsKey("af_deeplink")) {
            int i3 = onPause + 75;
            getSdkVersion = i3 % 128;
            int i4 = i3 % 2;
            String values2 = values(uri.toString());
            AFa1qSDK AFInAppEventParameterName2 = AFa1qSDK.AFInAppEventParameterName();
            String str = AFInAppEventParameterName2.valueOf;
            if (str != null && AFInAppEventParameterName2.afErrorLog != null && !(!values2.contains(str))) {
                Uri.Builder buildUpon = Uri.parse(values2).buildUpon();
                Uri.Builder buildUpon2 = Uri.EMPTY.buildUpon();
                Iterator<Map.Entry<String, String>> it = AFInAppEventParameterName2.afErrorLog.entrySet().iterator();
                while (!(!it.hasNext())) {
                    int i5 = getSdkVersion + 97;
                    onPause = i5 % 128;
                    int i6 = i5 % 2;
                    Map.Entry<String, String> next = it.next();
                    buildUpon.appendQueryParameter(next.getKey(), next.getValue());
                    buildUpon2.appendQueryParameter(next.getKey(), next.getValue());
                }
                values2 = buildUpon.build().toString();
                map.put("appended_query_params", buildUpon2.build().getEncodedQuery());
            }
            map.put("af_deeplink", values2);
            int i7 = onPause + 81;
            getSdkVersion = i7 % 128;
            int i8 = i7 % 2;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(ElementGenerator.TYPE_LINK, uri.toString());
        AFd1hSDK aFd1hSDK = new AFd1hSDK(AFInAppEventParameterName(), UUID.randomUUID(), uri);
        if (aFd1hSDK.AFLogger$LogLevel()) {
            map.put("isBrandedDomain", Boolean.TRUE);
        }
        AFa1dSDK.AFKeystoreWrapper(context, hashMap, uri);
        if (aFd1hSDK.afWarnLog()) {
            aFd1hSDK.AFLogger = valueOf(hashMap);
            AFd1xSDK afDebugLog = this.onResponseError.afDebugLog();
            afDebugLog.AFKeystoreWrapper.execute(new AFd1xSDK.AnonymousClass2(aFd1hSDK));
            return;
        }
        AFb1oSDK.AFInAppEventParameterName(hashMap);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0032, code lost:
        if (afRDLog(r5) != false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0034, code lost:
        com.appsflyer.AFLogger.afDebugLog("AppsFlyer: first launch detected");
        r4 = r4.format(new java.util.Date());
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0044, code lost:
        r4 = com.appsflyer.internal.AFb1zSDK.getSdkVersion + 99;
        com.appsflyer.internal.AFb1zSDK.onPause = r4 % 128;
        r4 = r4 % 2;
        r4 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x002b, code lost:
        if (afRDLog(r5) != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String values(java.text.SimpleDateFormat r4, android.content.Context r5) {
        /*
            r3 = this;
            int r0 = com.appsflyer.internal.AFb1zSDK.onPause
            int r0 = r0 + 119
            int r1 = r0 % 128
            com.appsflyer.internal.AFb1zSDK.getSdkVersion = r1
            int r0 = r0 % 2
            android.content.SharedPreferences r0 = AFInAppEventType(r5)
            r1 = 0
            java.lang.String r2 = "appsFlyerFirstInstall"
            java.lang.String r0 = r0.getString(r2, r1)
            if (r0 != 0) goto L58
            int r0 = com.appsflyer.internal.AFb1zSDK.getSdkVersion
            int r0 = r0 + 21
            int r1 = r0 % 128
            com.appsflyer.internal.AFb1zSDK.onPause = r1
            int r0 = r0 % 2
            if (r0 == 0) goto L2e
            boolean r0 = afRDLog(r5)
            r1 = 87
            int r1 = r1 / 0
            if (r0 == 0) goto L44
            goto L34
        L2e:
            boolean r0 = afRDLog(r5)
            if (r0 == 0) goto L44
        L34:
            java.lang.String r0 = "AppsFlyer: first launch detected"
            com.appsflyer.AFLogger.afDebugLog(r0)
            java.util.Date r0 = new java.util.Date
            r0.<init>()
            java.lang.String r4 = r4.format(r0)
        L42:
            r0 = r4
            goto L51
        L44:
            int r4 = com.appsflyer.internal.AFb1zSDK.getSdkVersion
            int r4 = r4 + 99
            int r0 = r4 % 128
            com.appsflyer.internal.AFb1zSDK.onPause = r0
            int r4 = r4 % 2
            java.lang.String r4 = ""
            goto L42
        L51:
            com.appsflyer.internal.AFb1gSDK r4 = r3.AFInAppEventParameterName(r5)
            r4.AFInAppEventParameterName(r2, r0)
        L58:
            java.lang.String r4 = java.lang.String.valueOf(r0)
            java.lang.String r5 = "AppsFlyer: first launch date: "
            java.lang.String r4 = r5.concat(r4)
            com.appsflyer.AFLogger.afInfoLog(r4)
            int r4 = com.appsflyer.internal.AFb1zSDK.getSdkVersion
            int r4 = r4 + 37
            int r5 = r4 % 128
            com.appsflyer.internal.AFb1zSDK.onPause = r5
            int r4 = r4 % 2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1zSDK.values(java.text.SimpleDateFormat, android.content.Context):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    @android.support.annotation.VisibleForTesting
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final void values(@android.support.annotation.NonNull com.appsflyer.internal.AFa1sSDK r5, @android.support.annotation.Nullable android.app.Activity r6) {
        /*
            r4 = this;
            android.app.Application r0 = r5.AFKeystoreWrapper
            java.lang.String r1 = ""
            if (r6 == 0) goto L21
            android.content.Intent r2 = r6.getIntent()
            if (r2 == 0) goto L21
            int r2 = com.appsflyer.internal.AFb1zSDK.getSdkVersion
            int r2 = r2 + 103
            int r3 = r2 % 128
            com.appsflyer.internal.AFb1zSDK.onPause = r3
            int r2 = r2 % 2
            android.net.Uri r6 = com.appsflyer.internal.AFb1kSDK.values(r6)
            if (r6 == 0) goto L21
            java.lang.String r6 = r6.toString()
            goto L22
        L21:
            r6 = r1
        L22:
            com.appsflyer.internal.AFb1bSDK r2 = r4.onResponseError
            com.appsflyer.internal.AFe1xSDK r2 = r2.AFVersionDeclaration()
            java.lang.String r2 = r2.AFInAppEventType
            if (r2 != 0) goto L53
            java.lang.String r6 = "[LogEvent/Launch] AppsFlyer's SDK cannot send any event without providing DevKey."
            com.appsflyer.AFLogger.afWarnLog(r6)
            com.appsflyer.attribution.AppsFlyerRequestListener r5 = r5.AFInAppEventType
            if (r5 == 0) goto L52
            int r6 = com.appsflyer.internal.AFb1zSDK.getSdkVersion
            int r6 = r6 + 27
            int r0 = r6 % 128
            com.appsflyer.internal.AFb1zSDK.onPause = r0
            int r6 = r6 % 2
            if (r6 != 0) goto L49
            int r6 = com.appsflyer.attribution.RequestError.NO_DEV_KEY
            java.lang.String r0 = com.appsflyer.internal.AFb1dSDK.AFKeystoreWrapper
            r5.onError(r6, r0)
            goto L52
        L49:
            int r6 = com.appsflyer.attribution.RequestError.NO_DEV_KEY
            java.lang.String r0 = com.appsflyer.internal.AFb1dSDK.AFKeystoreWrapper
            r5.onError(r6, r0)
            r5 = 0
            throw r5
        L52:
            return
        L53:
            com.appsflyer.AppsFlyerProperties r2 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r0 = r2.getReferrer(r0)
            if (r0 != 0) goto L5e
            goto L5f
        L5e:
            r1 = r0
        L5f:
            r5.afInfoLog = r1
            r5.AFInAppEventParameterName = r6
            r4.valueOf(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1zSDK.values(com.appsflyer.internal.AFa1sSDK, android.app.Activity):void");
    }

    @Nullable
    @Deprecated
    public final String valueOf(Context context) {
        int i = onPause + 11;
        int i2 = i % 128;
        getSdkVersion = i2;
        int i3 = i % 2;
        AFb1bSDK aFb1bSDK = this.onResponseError;
        if (context != null) {
            AFc1ySDK aFc1ySDK = aFb1bSDK.valueOf;
            int i4 = i2 + 63;
            onPause = i4 % 128;
            if (i4 % 2 != 0) {
                aFc1ySDK.values = context.getApplicationContext();
                throw null;
            }
            aFc1ySDK.values = context.getApplicationContext();
        }
        return this.onResponseError.values().values();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void valueOf(Context context, Intent intent) {
        AFb1bSDK aFb1bSDK = this.onResponseError;
        if (context != null) {
            aFb1bSDK.valueOf.values = context.getApplicationContext();
        }
        AFa1qSDK.AFInAppEventParameterName();
        Context context2 = this.onResponseError.valueOf.values;
        if (context2 != null) {
            AFb1eSDK aFb1eSDK = new AFb1eSDK(AFInAppEventType(context2));
            Uri valueOf2 = AFa1qSDK.valueOf(intent);
            boolean z = (valueOf2 == null || valueOf2.toString().isEmpty()) ? false : true;
            if (aFb1eSDK.valueOf("ddl_sent") && !z) {
                AFb1oSDK.AFInAppEventType("No direct deep link", null);
                return;
            } else {
                AFa1qSDK.AFInAppEventParameterName().AFInAppEventType(new HashMap(), intent, context);
                return;
            }
        }
        throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
    }

    private static void values(Map<String, Object> map, AFe1nSDK aFe1nSDK) {
        HashMap hashMap = new HashMap(aFe1nSDK.valueOf);
        aFe1nSDK.valueOf.clear();
        aFe1nSDK.AFInAppEventParameterName.AFKeystoreWrapper("gcd");
        if (!hashMap.isEmpty()) {
            int i = getSdkVersion + 95;
            onPause = i % 128;
            int i2 = i % 2;
            AFKeystoreWrapper(map).put("gcd", hashMap);
        }
        int i3 = onPause + 91;
        getSdkVersion = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    private static void AFInAppEventParameterName(Context context, Map<String, Object> map) {
        AFa1zSDK.AFa1wSDK values2 = AFa1zSDK.AFa1vSDK.AFKeystoreWrapper.values(context);
        map.put("btl", Float.toString(values2.AFInAppEventParameterName));
        String str = values2.AFInAppEventType;
        if (str != null) {
            int i = onPause + 19;
            getSdkVersion = i % 128;
            int i2 = i % 2;
            map.put("btch", str);
            if (i2 == 0) {
                throw null;
            }
        }
        int i3 = onPause + 73;
        getSdkVersion = i3 % 128;
        int i4 = i3 % 2;
    }

    public final AFb1gSDK AFInAppEventParameterName(Context context) {
        AFb1bSDK aFb1bSDK = this.onResponseError;
        if (context != null) {
            aFb1bSDK.valueOf.values = context.getApplicationContext();
        }
        Context context2 = this.onResponseError.valueOf.values;
        if (context2 != null) {
            return new AFb1eSDK(AFInAppEventType(context2));
        }
        throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
    }

    private static void AFInAppEventParameterName(char c, int i, int i2, Object[] objArr) {
        String str;
        synchronized (AFg1wSDK.AFInAppEventParameterName) {
            try {
                char[] cArr = new char[i];
                AFg1wSDK.AFKeystoreWrapper = 0;
                while (true) {
                    int i3 = AFg1wSDK.AFKeystoreWrapper;
                    if (i3 < i) {
                        cArr[i3] = (char) ((AppsFlyerConversionListener[i2 + i3] ^ (i3 * onValidateInAppFailure)) ^ c);
                        AFg1wSDK.AFKeystoreWrapper = i3 + 1;
                    } else {
                        str = new String(cArr);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        objArr[0] = str;
    }
}
