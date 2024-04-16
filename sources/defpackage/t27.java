package defpackage;

import android.app.AppOpsManager;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import androidx.annotation.NonNull;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;
import java.util.Set;
/* compiled from: NotificationManagerCompat.java */
/* renamed from: t27  reason: default package */
/* loaded from: classes.dex */
public final class t27 {
    private static final Object c = new Object();
    private static Set<String> d = new HashSet();
    private static final Object e = new Object();
    private final Context a;
    private final NotificationManager b;

    private t27(Context context) {
        this.a = context;
        this.b = (NotificationManager) context.getSystemService(RemoteMessageConst.NOTIFICATION);
    }

    @NonNull
    public static t27 d(@NonNull Context context) {
        return new t27(context);
    }

    public boolean a() {
        boolean areNotificationsEnabled;
        if (Build.VERSION.SDK_INT >= 24) {
            areNotificationsEnabled = this.b.areNotificationsEnabled();
            return areNotificationsEnabled;
        }
        AppOpsManager appOpsManager = (AppOpsManager) this.a.getSystemService("appops");
        ApplicationInfo applicationInfo = this.a.getApplicationInfo();
        String packageName = this.a.getApplicationContext().getPackageName();
        int i = applicationInfo.uid;
        try {
            Class<?> cls = Class.forName(AppOpsManager.class.getName());
            Class<?> cls2 = Integer.TYPE;
            if (((Integer) cls.getMethod("checkOpNoThrow", cls2, cls2, String.class).invoke(appOpsManager, Integer.valueOf(((Integer) cls.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class)).intValue()), Integer.valueOf(i), packageName)).intValue() == 0) {
                return true;
            }
            return false;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
            return true;
        }
    }

    public void b(int i) {
        c(null, i);
    }

    public void c(String str, int i) {
        this.b.cancel(str, i);
    }

    public NotificationChannel e(@NonNull String str) {
        NotificationChannel notificationChannel;
        if (Build.VERSION.SDK_INT >= 26) {
            notificationChannel = this.b.getNotificationChannel(str);
            return notificationChannel;
        }
        return null;
    }

    public h17 f(@NonNull String str) {
        NotificationChannel e2;
        if (Build.VERSION.SDK_INT >= 26 && (e2 = e(str)) != null) {
            return new h17(e2);
        }
        return null;
    }
}
