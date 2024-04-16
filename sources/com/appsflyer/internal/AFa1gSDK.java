package com.appsflyer.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.telephony.TelephonyManager;
import com.appsflyer.AFLogger;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AFa1gSDK {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class AFa1vSDK {
        static final AFa1gSDK AFInAppEventType = new AFa1gSDK();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class AFa1xSDK {
        final String AFInAppEventType;
        final String AFKeystoreWrapper;
        final String values;

        AFa1xSDK(@NonNull String str, @Nullable String str2, @Nullable String str3) {
            this.AFKeystoreWrapper = str;
            this.values = str2;
            this.AFInAppEventType = str3;
        }
    }

    AFa1gSDK() {
    }

    private static boolean AFInAppEventParameterName(NetworkInfo networkInfo) {
        if (networkInfo != null && networkInfo.isConnectedOrConnecting()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static AFa1xSDK AFInAppEventType(@NonNull Context context) {
        String str;
        String str2;
        TelephonyManager telephonyManager;
        String str3 = "unknown";
        String str4 = null;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager != null) {
                Network[] allNetworks = connectivityManager.getAllNetworks();
                int length = allNetworks.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    NetworkInfo networkInfo = connectivityManager.getNetworkInfo(allNetworks[i]);
                    if (AFInAppEventParameterName(networkInfo)) {
                        if (1 == networkInfo.getType()) {
                            str3 = "WIFI";
                        } else if (networkInfo.getType() == 0) {
                            str3 = "MOBILE";
                        }
                    } else {
                        i++;
                    }
                }
            }
            telephonyManager = (TelephonyManager) context.getSystemService("phone");
            str2 = telephonyManager.getSimOperatorName();
            try {
                str4 = telephonyManager.getNetworkOperatorName();
            } catch (Throwable th) {
                th = th;
                str = str4;
                str4 = str2;
                AFLogger.afErrorLog("Exception while collecting network info. ", th);
                String str5 = str;
                str2 = str4;
                str4 = str5;
                return new AFa1xSDK(str3, str4, str2);
            }
        } catch (Throwable th2) {
            th = th2;
            str = null;
        }
        if (str4 != null) {
            if (str4.isEmpty()) {
            }
            return new AFa1xSDK(str3, str4, str2);
        }
        if (2 == telephonyManager.getPhoneType()) {
            str4 = "CDMA";
        }
        return new AFa1xSDK(str3, str4, str2);
    }
}
