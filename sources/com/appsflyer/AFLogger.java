package com.appsflyer;

import android.app.Application;
import android.content.SharedPreferences;
import android.support.annotation.NonNull;
import android.util.Log;
import com.appsflyer.internal.AFb1iSDK;
import com.appsflyer.internal.AFb1uSDK;
import com.appsflyer.internal.AFb1zSDK;
/* loaded from: classes.dex */
public class AFLogger {
    private static final long valueOf = System.currentTimeMillis();

    /* loaded from: classes.dex */
    public enum LogLevel {
        NONE(0),
        ERROR(1),
        WARNING(2),
        INFO(3),
        DEBUG(4),
        VERBOSE(5);
        
        private int AFKeystoreWrapper;

        LogLevel(int i) {
            this.AFKeystoreWrapper = i;
        }

        public final int getLevel() {
            return this.AFKeystoreWrapper;
        }
    }

    private static boolean AFInAppEventType(LogLevel logLevel) {
        if (logLevel.getLevel() <= AppsFlyerProperties.getInstance().getInt("logLevel", LogLevel.NONE.getLevel())) {
            return true;
        }
        return false;
    }

    @NonNull
    private static String AFKeystoreWrapper(String str, boolean z) {
        if (str == null) {
            str = "null";
        }
        if (!z && LogLevel.VERBOSE.getLevel() > AppsFlyerProperties.getInstance().getInt("logLevel", LogLevel.NONE.getLevel())) {
            return str;
        }
        StringBuilder sb = new StringBuilder("(");
        sb.append(System.currentTimeMillis() - valueOf);
        sb.append(") [");
        sb.append(Thread.currentThread().getName());
        sb.append("] ");
        sb.append(str);
        return sb.toString();
    }

    public static void afDebugLog(String str) {
        if (AFInAppEventType(LogLevel.DEBUG)) {
            Log.d("AppsFlyer_6.10.0", AFKeystoreWrapper(str, false));
        }
        AFb1uSDK.AFInAppEventType().values("D", AFKeystoreWrapper(str, true));
    }

    public static void afErrorLog(String str, Throwable th, boolean z, boolean z2, boolean z3) {
        if (str == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(th.getClass().getSimpleName());
            sb.append(" at ");
            sb.append(th.getStackTrace()[0].toString());
            str = sb.toString();
        }
        if (AFInAppEventType(LogLevel.ERROR)) {
            String AFKeystoreWrapper = AFKeystoreWrapper(str, false);
            if (z2) {
                Log.e("AppsFlyer_6.10.0", AFKeystoreWrapper, th);
            } else if (z) {
                Log.d("AppsFlyer_6.10.0", AFKeystoreWrapper);
            }
        }
        AFb1uSDK.AFInAppEventType().values(th);
        Application application = AFb1iSDK.AFKeystoreWrapper;
        if (application != null) {
            SharedPreferences.Editor edit = AFb1zSDK.AFInAppEventType(application).edit();
            Application application2 = AFb1iSDK.AFKeystoreWrapper;
            edit.putLong("exception_number", (application2 == null ? -1L : AFb1zSDK.AFInAppEventType(application2).getLong("exception_number", 0L)) + 1).apply();
        }
        if (z3) {
            AFb1zSDK.AFInAppEventType().AFInAppEventParameterName().onInstallConversionDataLoadedNative().AFInAppEventParameterName(th, str);
        }
    }

    public static void afErrorLogForExcManagerOnly(String str, Throwable th) {
        afErrorLogForExcManagerOnly(str, th, false);
    }

    public static void afInfoLog(String str, boolean z) {
        if (AFInAppEventType(LogLevel.INFO)) {
            Log.i("AppsFlyer_6.10.0", AFKeystoreWrapper(str, false));
        }
        if (z) {
            AFb1uSDK.AFInAppEventType().values("I", AFKeystoreWrapper(str, true));
        }
    }

    public static void afRDLog(String str) {
        if (AFInAppEventType(LogLevel.VERBOSE)) {
            Log.v("AppsFlyer_6.10.0", AFKeystoreWrapper(str, false));
        }
        AFb1uSDK.AFInAppEventType().values("V", AFKeystoreWrapper(str, true));
    }

    public static void afWarnLog(String str) {
        values(str);
    }

    public static void valueOf(String str) {
        if (!valueOf()) {
            Log.d("AppsFlyer_6.10.0", AFKeystoreWrapper(str, false));
        }
        AFb1uSDK.AFInAppEventType().values("F", str);
    }

    public static void values(String str) {
        if (AFInAppEventType(LogLevel.WARNING)) {
            Log.w("AppsFlyer_6.10.0", AFKeystoreWrapper(str, false));
        }
        AFb1uSDK.AFInAppEventType().values("W", AFKeystoreWrapper(str, true));
    }

    public static void afErrorLogForExcManagerOnly(String str, Throwable th, boolean z) {
        afErrorLog(str, th, false, false, !z);
    }

    public static void afInfoLog(String str) {
        afInfoLog(str, true);
    }

    private static boolean valueOf() {
        return AppsFlyerProperties.getInstance().isLogsDisabledCompletely();
    }

    public static void afErrorLog(String str, Throwable th) {
        afErrorLog(str, th, true, false, true);
    }

    public static void afErrorLog(String str, Throwable th, boolean z) {
        afErrorLog(str, th, true, z, true);
    }

    public static void afErrorLog(String str, Throwable th, boolean z, boolean z2) {
        afErrorLog(str, th, true, z, z2);
    }

    @Deprecated
    public static void afErrorLog(Throwable th) {
        afErrorLogForExcManagerOnly("Unknown", th);
    }
}
