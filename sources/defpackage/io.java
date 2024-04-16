package defpackage;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Binder;
import android.os.Build;
import androidx.annotation.NonNull;
/* compiled from: AppOpsManagerCompat.java */
/* renamed from: io  reason: default package */
/* loaded from: classes.dex */
public final class io {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppOpsManagerCompat.java */
    /* renamed from: io$a */
    /* loaded from: classes.dex */
    public static class a {
        static <T> T a(Context context, Class<T> cls) {
            return (T) context.getSystemService(cls);
        }

        static int b(AppOpsManager appOpsManager, String str, String str2) {
            return appOpsManager.noteProxyOp(str, str2);
        }

        static int c(AppOpsManager appOpsManager, String str, String str2) {
            return appOpsManager.noteProxyOpNoThrow(str, str2);
        }

        static String d(String str) {
            return AppOpsManager.permissionToOp(str);
        }
    }

    /* compiled from: AppOpsManagerCompat.java */
    /* renamed from: io$b */
    /* loaded from: classes.dex */
    static class b {
        static int a(AppOpsManager appOpsManager, @NonNull String str, int i, @NonNull String str2) {
            if (appOpsManager == null) {
                return 1;
            }
            return appOpsManager.checkOpNoThrow(str, i, str2);
        }

        @NonNull
        static String b(@NonNull Context context) {
            return context.getOpPackageName();
        }

        static AppOpsManager c(@NonNull Context context) {
            return (AppOpsManager) context.getSystemService(AppOpsManager.class);
        }
    }

    public static int a(@NonNull Context context, int i, @NonNull String str, @NonNull String str2) {
        if (Build.VERSION.SDK_INT >= 29) {
            AppOpsManager c = b.c(context);
            int a2 = b.a(c, str, Binder.getCallingUid(), str2);
            if (a2 != 0) {
                return a2;
            }
            return b.a(c, str, i, b.b(context));
        }
        return b(context, str, str2);
    }

    public static int b(@NonNull Context context, @NonNull String str, @NonNull String str2) {
        if (Build.VERSION.SDK_INT >= 23) {
            return a.c((AppOpsManager) a.a(context, AppOpsManager.class), str, str2);
        }
        return 1;
    }

    public static String c(@NonNull String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            return a.d(str);
        }
        return null;
    }
}
