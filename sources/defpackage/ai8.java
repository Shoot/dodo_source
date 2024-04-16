package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.Preference;
/* compiled from: PreferenceUtils.java */
/* renamed from: ai8  reason: default package */
/* loaded from: classes.dex */
public class ai8 {
    private final WorkDatabase a;

    public ai8(@NonNull WorkDatabase workDatabase) {
        this.a = workDatabase;
    }

    public static void b(@NonNull Context context, @NonNull y2b y2bVar) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
        if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
            long j = 0;
            long j2 = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
            if (sharedPreferences.getBoolean("reschedule_needed", false)) {
                j = 1;
            }
            y2bVar.beginTransaction();
            try {
                y2bVar.Y("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"last_cancel_all_time_ms", Long.valueOf(j2)});
                y2bVar.Y("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", Long.valueOf(j)});
                sharedPreferences.edit().clear().apply();
                y2bVar.X();
            } finally {
                y2bVar.g0();
            }
        }
    }

    public boolean a() {
        Long b = this.a.I().b("reschedule_needed");
        if (b != null && b.longValue() == 1) {
            return true;
        }
        return false;
    }

    public void c(boolean z) {
        this.a.I().a(new Preference("reschedule_needed", z));
    }
}
