package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.Preference;
/* compiled from: IdGenerator.java */
/* renamed from: ft4  reason: default package */
/* loaded from: classes.dex */
public class ft4 {
    private final WorkDatabase a;

    public ft4(@NonNull WorkDatabase workDatabase) {
        this.a = workDatabase;
    }

    public static void a(@NonNull Context context, @NonNull y2b y2bVar) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.id", 0);
        if (sharedPreferences.contains("next_job_scheduler_id") || sharedPreferences.contains("next_job_scheduler_id")) {
            int i = sharedPreferences.getInt("next_job_scheduler_id", 0);
            int i2 = sharedPreferences.getInt("next_alarm_manager_id", 0);
            y2bVar.beginTransaction();
            try {
                y2bVar.Y("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_job_scheduler_id", Integer.valueOf(i)});
                y2bVar.Y("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_alarm_manager_id", Integer.valueOf(i2)});
                sharedPreferences.edit().clear().apply();
                y2bVar.X();
            } finally {
                y2bVar.g0();
            }
        }
    }

    private int c(String str) {
        int i;
        this.a.e();
        try {
            Long b = this.a.I().b(str);
            int i2 = 0;
            if (b != null) {
                i = b.intValue();
            } else {
                i = 0;
            }
            if (i != Integer.MAX_VALUE) {
                i2 = i + 1;
            }
            e(str, i2);
            this.a.B();
            this.a.i();
            return i;
        } catch (Throwable th) {
            this.a.i();
            throw th;
        }
    }

    private void e(String str, int i) {
        this.a.I().a(new Preference(str, i));
    }

    public int b() {
        int c;
        synchronized (ft4.class) {
            c = c("next_alarm_manager_id");
        }
        return c;
    }

    public int d(int i, int i2) {
        synchronized (ft4.class) {
            int c = c("next_job_scheduler_id");
            if (c >= i && c <= i2) {
                i = c;
            }
            e("next_job_scheduler_id", i + 1);
        }
        return i;
    }
}
