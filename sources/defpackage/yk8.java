package defpackage;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.work.a;
import java.lang.reflect.Method;
import java.util.List;
/* compiled from: ProcessUtils.java */
/* renamed from: yk8  reason: default package */
/* loaded from: classes.dex */
public class yk8 {
    private static final String a = nx5.f("ProcessUtils");

    private yk8() {
    }

    @SuppressLint({"PrivateApi", "DiscouragedPrivateApi"})
    public static String a(@NonNull Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        String processName;
        if (Build.VERSION.SDK_INT >= 28) {
            processName = Application.getProcessName();
            return processName;
        }
        try {
            Method declaredMethod = Class.forName("android.app.ActivityThread", false, yk8.class.getClassLoader()).getDeclaredMethod("currentProcessName", new Class[0]);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(null, new Object[0]);
            if (invoke instanceof String) {
                return (String) invoke;
            }
        } catch (Throwable th) {
            nx5.c().a(a, "Unable to check ActivityThread for processName", th);
        }
        int myPid = Process.myPid();
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null && !runningAppProcesses.isEmpty()) {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.pid == myPid) {
                    return runningAppProcessInfo.processName;
                }
            }
        }
        return null;
    }

    public static boolean b(@NonNull Context context, @NonNull a aVar) {
        String a2 = a(context);
        if (!TextUtils.isEmpty(aVar.c())) {
            return TextUtils.equals(a2, aVar.c());
        }
        return TextUtils.equals(a2, context.getApplicationInfo().processName);
    }
}
