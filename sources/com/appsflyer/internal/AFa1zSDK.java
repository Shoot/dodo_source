package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.annotation.NonNull;
import com.appsflyer.AFLogger;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AFa1zSDK {
    private IntentFilter AFInAppEventType = new IntentFilter("android.intent.action.BATTERY_CHANGED");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class AFa1vSDK {
        static final AFa1zSDK AFKeystoreWrapper = new AFa1zSDK();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class AFa1wSDK {
        final float AFInAppEventParameterName;
        final String AFInAppEventType;

        AFa1wSDK(float f, String str) {
            this.AFInAppEventParameterName = f;
            this.AFInAppEventType = str;
        }
    }

    AFa1zSDK() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public final AFa1wSDK values(Context context) {
        String str = null;
        float f = 0.0f;
        try {
            Intent registerReceiver = context.registerReceiver(null, this.AFInAppEventType);
            if (registerReceiver != null) {
                if (2 == registerReceiver.getIntExtra("status", -1)) {
                    int intExtra = registerReceiver.getIntExtra("plugged", -1);
                    if (intExtra != 1) {
                        if (intExtra != 2) {
                            if (intExtra != 4) {
                                str = "other";
                            } else {
                                str = "wireless";
                            }
                        } else {
                            str = "usb";
                        }
                    } else {
                        str = "ac";
                    }
                } else {
                    str = "no";
                }
                int intExtra2 = registerReceiver.getIntExtra("level", -1);
                int intExtra3 = registerReceiver.getIntExtra("scale", -1);
                if (-1 != intExtra2 && -1 != intExtra3) {
                    f = (intExtra2 * 100.0f) / intExtra3;
                }
            }
        } catch (Throwable th) {
            AFLogger.afErrorLogForExcManagerOnly("Device that failed to register receiver", th);
        }
        return new AFa1wSDK(f, str);
    }
}
