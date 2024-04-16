package com.facebook.flipper.android.utils;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Process;
import java.util.List;
/* loaded from: classes2.dex */
public final class FlipperUtils {
    private FlipperUtils() {
    }

    private static boolean isEndToEndTest() {
        String str = System.getenv("BUDDY_SONAR_DISABLED");
        if (str != null && str.length() != 0) {
            try {
                return Boolean.parseBoolean(str);
            } catch (NumberFormatException unused) {
            }
        }
        return false;
    }

    private static boolean isMainProcess(Context context) {
        String str;
        int myPid = Process.myPid();
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.pid == myPid) {
                    str = runningAppProcessInfo.processName;
                    break;
                }
            }
        }
        str = null;
        return context.getPackageName().equals(str);
    }

    public static boolean shouldEnableFlipper(Context context) {
        if (!isEndToEndTest() && isMainProcess(context)) {
            return true;
        }
        return false;
    }
}
