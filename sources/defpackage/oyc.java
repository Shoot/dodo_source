package defpackage;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.os.UserManager;
import android.util.Log;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* renamed from: oyc  reason: default package */
/* loaded from: classes2.dex */
public class oyc {
    private static UserManager a;
    private static volatile boolean b = !a();
    private static boolean c = false;

    private oyc() {
    }

    public static boolean a() {
        if (Build.VERSION.SDK_INT >= 24) {
            return true;
        }
        return false;
    }

    public static boolean b(Context context) {
        if (a() && !d(context)) {
            return true;
        }
        return false;
    }

    public static boolean c(Context context) {
        if (a() && !d(context)) {
            return false;
        }
        return true;
    }

    @TargetApi(24)
    private static boolean d(Context context) {
        if (b) {
            return true;
        }
        synchronized (oyc.class) {
            try {
                if (b) {
                    return true;
                }
                boolean e = e(context);
                if (e) {
                    b = e;
                }
                return e;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @TargetApi(24)
    private static boolean e(Context context) {
        boolean z;
        boolean isUserUnlocked;
        Object systemService;
        boolean z2 = true;
        int i = 1;
        while (true) {
            z = false;
            if (i > 2) {
                break;
            }
            if (a == null) {
                systemService = context.getSystemService(UserManager.class);
                a = (UserManager) systemService;
            }
            UserManager userManager = a;
            if (userManager == null) {
                return true;
            }
            try {
                isUserUnlocked = userManager.isUserUnlocked();
                if (isUserUnlocked) {
                    break;
                } else if (userManager.isUserRunning(Process.myUserHandle())) {
                    z2 = false;
                }
            } catch (NullPointerException e) {
                Log.w("DirectBootUtils", "Failed to check if user is unlocked.", e);
                a = null;
                i++;
            }
        }
        z = z2;
        if (z) {
            a = null;
        }
        return z;
    }
}
