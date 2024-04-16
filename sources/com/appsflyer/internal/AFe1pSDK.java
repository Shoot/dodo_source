package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.VisibleForTesting;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.FirebaseMessagingServiceListener;
import com.appsflyer.internal.AFd1xSDK;
import com.google.firebase.messaging.FirebaseMessagingService;
/* loaded from: classes.dex */
public final class AFe1pSDK {
    @VisibleForTesting
    public static String AFInAppEventParameterName;
    public final AFb1gSDK AFInAppEventType;

    static {
        StringBuilder sb = new StringBuilder("https://%sregister.%s/api/v");
        sb.append(AFb1zSDK.AFInAppEventParameterName);
        AFInAppEventParameterName = sb.toString();
    }

    public AFe1pSDK(@NonNull Context context) {
        this.AFInAppEventType = AFb1zSDK.AFInAppEventType().AFInAppEventParameterName(context);
    }

    public static boolean AFInAppEventParameterName(@NonNull SharedPreferences sharedPreferences) {
        return sharedPreferences.getBoolean("sentRegisterRequestToAF", false);
    }

    public static boolean valueOf(Context context) {
        if (AppsFlyerLib.getInstance().isStopped()) {
            return false;
        }
        try {
            String str = FirebaseMessagingService.ACTION_DIRECT_BOOT_REMOTE_INTENT;
        } catch (ClassNotFoundException unused) {
        } catch (Throwable th) {
            AFLogger.afErrorLog("An error occurred while trying to verify manifest declarations: ", th);
        }
        return AFa1dSDK.AFInAppEventType(context, new Intent("com.google.firebase.MESSAGING_EVENT", null, context, FirebaseMessagingServiceListener.class));
    }

    public static void valueOf(String str) {
        AFc1xSDK AFInAppEventParameterName2 = AFb1zSDK.AFInAppEventType().AFInAppEventParameterName();
        AFd1gSDK aFd1gSDK = new AFd1gSDK(str, AFInAppEventParameterName2);
        AFd1xSDK afDebugLog = AFInAppEventParameterName2.afDebugLog();
        afDebugLog.AFKeystoreWrapper.execute(new AFd1xSDK.AnonymousClass2(aFd1gSDK));
    }

    @Nullable
    public final AFb1sSDK valueOf() {
        String string;
        String string2;
        String valueOf = this.AFInAppEventType.valueOf("afUninstallToken", (String) null);
        long valueOf2 = this.AFInAppEventType.valueOf("afUninstallToken_received_time", 0L);
        boolean valueOf3 = this.AFInAppEventType.valueOf("afUninstallToken_queued");
        this.AFInAppEventType.valueOf("afUninstallToken_queued", false);
        if (valueOf == null && (string2 = AppsFlyerProperties.getInstance().getString("afUninstallToken")) != null) {
            String[] split = string2.split(",");
            valueOf = split[split.length - 1];
        }
        if (valueOf2 == 0 && (string = AppsFlyerProperties.getInstance().getString("afUninstallToken")) != null) {
            String[] split2 = string.split(",");
            if (split2.length >= 2) {
                try {
                    valueOf2 = Long.parseLong(split2[split2.length - 2]);
                } catch (NumberFormatException unused) {
                }
            }
        }
        if (valueOf != null) {
            return new AFb1sSDK(valueOf, valueOf2, valueOf3);
        }
        return null;
    }
}
