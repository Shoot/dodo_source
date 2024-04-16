package androidx.work.impl.background.systemalarm;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.SystemIdInfo;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Alarms.java */
/* loaded from: classes.dex */
public class a {
    private static final String a = nx5.f("Alarms");

    public static void a(@NonNull Context context, @NonNull j7c j7cVar, @NonNull String str) {
        i4b J = j7cVar.t().J();
        SystemIdInfo a2 = J.a(str);
        if (a2 != null) {
            b(context, str, a2.b);
            nx5.c().a(a, String.format("Removing SystemIdInfo for workSpecId (%s)", str), new Throwable[0]);
            J.d(str);
        }
    }

    private static void b(@NonNull Context context, @NonNull String str, int i) {
        int i2;
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        Intent b = b.b(context, str);
        if (Build.VERSION.SDK_INT >= 23) {
            i2 = 603979776;
        } else {
            i2 = 536870912;
        }
        PendingIntent service = PendingIntent.getService(context, i, b, i2);
        if (service != null && alarmManager != null) {
            nx5.c().a(a, String.format("Cancelling existing alarm with (workSpecId, systemId) (%s, %s)", str, Integer.valueOf(i)), new Throwable[0]);
            alarmManager.cancel(service);
        }
    }

    public static void c(@NonNull Context context, @NonNull j7c j7cVar, @NonNull String str, long j) {
        WorkDatabase t = j7cVar.t();
        i4b J = t.J();
        SystemIdInfo a2 = J.a(str);
        if (a2 != null) {
            b(context, str, a2.b);
            d(context, str, a2.b, j);
            return;
        }
        int b = new ft4(t).b();
        J.c(new SystemIdInfo(str, b));
        d(context, str, b, j);
    }

    private static void d(@NonNull Context context, @NonNull String str, int i, long j) {
        int i2;
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        if (Build.VERSION.SDK_INT >= 23) {
            i2 = 201326592;
        } else {
            i2 = 134217728;
        }
        PendingIntent service = PendingIntent.getService(context, i, b.b(context, str), i2);
        if (alarmManager != null) {
            alarmManager.setExact(0, j, service);
        }
    }
}
