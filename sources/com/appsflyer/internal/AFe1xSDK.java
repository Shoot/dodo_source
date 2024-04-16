package com.appsflyer.internal;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.telephony.TelephonyManager;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFe1vSDK;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes.dex */
public final class AFe1xSDK {
    public volatile String AFInAppEventType;
    @NonNull
    public final AFc1ySDK AFKeystoreWrapper;
    @NonNull
    private final AFe1vSDK afDebugLog;
    @Nullable
    public volatile String valueOf;
    Map<String, Object> values;
    private boolean afErrorLog = false;
    public volatile boolean AFInAppEventParameterName = false;

    public AFe1xSDK(@NonNull AFc1ySDK aFc1ySDK, @NonNull AFe1vSDK aFe1vSDK) {
        this.AFKeystoreWrapper = aFc1ySDK;
        this.afDebugLog = aFe1vSDK;
    }

    private boolean AFInAppEventParameterName() {
        Map<String, Object> map = this.values;
        if (map != null && !map.isEmpty()) {
            return true;
        }
        return false;
    }

    @Nullable
    public final String AFInAppEventType(AFb1gSDK aFb1gSDK) {
        String str;
        boolean z = AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_IMEI, false);
        String valueOf = aFb1gSDK.valueOf("imeiCached", (String) null);
        if (z && AFb1nSDK.AFInAppEventParameterName(this.valueOf)) {
            Context context = this.AFKeystoreWrapper.values;
            if (context != null && valueOf(context)) {
                try {
                    TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                    str = (String) telephonyManager.getClass().getMethod("getDeviceId", new Class[0]).invoke(telephonyManager, new Object[0]);
                } catch (InvocationTargetException e) {
                    if (valueOf != null) {
                        AFLogger.afDebugLog("use cached IMEI: ".concat(valueOf));
                    } else {
                        valueOf = null;
                    }
                    StringBuilder sb = new StringBuilder("WARNING: Can't collect IMEI because of missing permissions: ");
                    sb.append(e.getMessage());
                    AFLogger.afErrorLog(sb.toString(), e);
                } catch (Exception e2) {
                    if (valueOf != null) {
                        AFLogger.afDebugLog("use cached IMEI: ".concat(valueOf));
                    } else {
                        valueOf = null;
                    }
                    StringBuilder sb2 = new StringBuilder("WARNING: Can't collect IMEI: other reason: ");
                    sb2.append(e2.getMessage());
                    AFLogger.afErrorLog(sb2.toString(), e2);
                }
                if (str == null) {
                    if (valueOf != null) {
                        AFLogger.afDebugLog("use cached IMEI: ".concat(valueOf));
                    } else {
                        valueOf = null;
                    }
                    str = valueOf;
                }
            }
            str = null;
        } else {
            if (this.valueOf != null) {
                str = this.valueOf;
            }
            str = null;
        }
        if (!AFb1nSDK.AFInAppEventParameterName(str)) {
            aFb1gSDK.AFInAppEventParameterName("imeiCached", str);
            return str;
        }
        AFLogger.afInfoLog("IMEI was not collected.");
        return null;
    }

    public final boolean AFKeystoreWrapper() {
        return this.AFInAppEventParameterName;
    }

    public final boolean valueOf() {
        try {
            Class.forName("com.appsflyer.lvl.AppsFlyerLVL");
            final long currentTimeMillis = System.currentTimeMillis();
            final AFe1vSDK aFe1vSDK = this.afDebugLog;
            Context context = this.AFKeystoreWrapper.values;
            final AFe1vSDK.AFa1zSDK aFa1zSDK = new AFe1vSDK.AFa1zSDK() { // from class: com.appsflyer.internal.AFe1xSDK.5
                @Override // com.appsflyer.internal.AFe1vSDK.AFa1zSDK
                public final void AFKeystoreWrapper(String str, Exception exc) {
                    AFe1xSDK.this.values = new ConcurrentHashMap();
                    String message = exc.getMessage();
                    if (message == null) {
                        message = "unknown";
                    }
                    AFe1xSDK.this.values.put("error", message);
                    AFLogger.afErrorLog(str, exc, true, true, false);
                }

                @Override // com.appsflyer.internal.AFe1vSDK.AFa1zSDK
                public final void valueOf(@NonNull String str, @NonNull String str2) {
                    AFe1xSDK.this.values = new ConcurrentHashMap();
                    AFe1xSDK.this.values.put("signedData", str);
                    AFe1xSDK.this.values.put("signature", str2);
                    AFe1xSDK.this.values.put("ttr", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                    AFLogger.afInfoLog("Successfully retrieved Google LVL data.");
                }
            };
            try {
                try {
                    try {
                        Class<?> cls = Class.forName("com.appsflyer.lvl.AppsFlyerLVL");
                        Class<?> cls2 = Class.forName("com.appsflyer.lvl.AppsFlyerLVL$resultListener");
                        cls.getMethod("checkLicense", Long.TYPE, Context.class, cls2).invoke(null, Long.valueOf(currentTimeMillis), context, Proxy.newProxyInstance(cls2.getClassLoader(), new Class[]{cls2}, new InvocationHandler() { // from class: com.appsflyer.internal.AFe1vSDK.5
                            @Override // java.lang.reflect.InvocationHandler
                            public final Object invoke(Object obj, Method method, Object[] objArr) {
                                String str;
                                String str2;
                                if (method.getName().equals("onLvlResult")) {
                                    Object obj2 = objArr[0];
                                    if (obj2 != null) {
                                        str = (String) obj2;
                                    } else {
                                        str = null;
                                    }
                                    Object obj3 = objArr[1];
                                    if (obj3 != null) {
                                        str2 = (String) obj3;
                                    } else {
                                        str2 = null;
                                    }
                                    AFa1zSDK aFa1zSDK2 = aFa1zSDK;
                                    if (aFa1zSDK2 != null) {
                                        if (str != null && str2 != null) {
                                            aFa1zSDK2.valueOf(str, str2);
                                        } else if (str2 == null) {
                                            aFa1zSDK2.AFKeystoreWrapper("onLvlResult with error", new Exception("AFLVL Invalid signature"));
                                        } else {
                                            aFa1zSDK2.AFKeystoreWrapper("onLvlResult with error", new Exception("AFLVL Invalid signedData"));
                                        }
                                    } else {
                                        AFLogger.afDebugLog("onLvlResult invocation succeeded, but listener is null");
                                    }
                                } else if (method.getName().equals("onLvlFailure")) {
                                    AFa1zSDK aFa1zSDK3 = aFa1zSDK;
                                    if (aFa1zSDK3 != null) {
                                        Object obj4 = objArr[0];
                                        if (obj4 != null) {
                                            aFa1zSDK3.AFKeystoreWrapper("onLvlFailure with exception", (Exception) obj4);
                                        } else {
                                            aFa1zSDK3.AFKeystoreWrapper("onLvlFailure", new Exception("unknown"));
                                        }
                                    } else {
                                        AFLogger.afDebugLog("onLvlFailure: listener is null");
                                    }
                                } else {
                                    AFa1zSDK aFa1zSDK4 = aFa1zSDK;
                                    if (aFa1zSDK4 != null) {
                                        aFa1zSDK4.AFKeystoreWrapper("lvlInvocation failed", new Exception("com.appsflyer.lvl.AppsFlyerLVL$resultListener invocation failed"));
                                    }
                                }
                                return null;
                            }
                        }));
                    } catch (IllegalAccessException e) {
                        aFa1zSDK.AFKeystoreWrapper(e.getClass().getSimpleName(), e);
                    }
                } catch (ClassNotFoundException e2) {
                    aFa1zSDK.AFKeystoreWrapper(e2.getClass().getSimpleName(), e2);
                }
            } catch (NoSuchMethodException e3) {
                aFa1zSDK.AFKeystoreWrapper(e3.getClass().getSimpleName(), e3);
            } catch (InvocationTargetException e4) {
                aFa1zSDK.AFKeystoreWrapper(e4.getClass().getSimpleName(), e4);
            }
            this.afErrorLog = true;
        } catch (ClassNotFoundException unused) {
            this.afErrorLog = false;
        }
        return this.afErrorLog;
    }

    @NonNull
    public final Map<String, Object> values() {
        HashMap hashMap = new HashMap();
        if (AFInAppEventParameterName()) {
            hashMap.put("lvl", this.values);
        } else if (this.afErrorLog) {
            HashMap hashMap2 = new HashMap();
            this.values = hashMap2;
            hashMap2.put("error", "operation timed out.");
            hashMap.put("lvl", this.values);
        }
        return hashMap;
    }

    private static boolean valueOf(Context context) {
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, false) || AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, false)) {
            return true;
        }
        AFb1zSDK.AFInAppEventType();
        return !AFb1zSDK.values(context);
    }

    public final boolean AFInAppEventType() {
        return this.afErrorLog && !AFInAppEventParameterName();
    }
}
