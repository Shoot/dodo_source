package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.e;
import androidx.work.impl.model.WorkSpec;
import java.util.HashMap;
import java.util.Map;
/* compiled from: CommandHandler.java */
/* loaded from: classes.dex */
public class b implements bm3 {
    private static final String d = nx5.f("CommandHandler");
    private final Context a;
    private final Map<String, bm3> b = new HashMap();
    private final Object c = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(@NonNull Context context) {
        this.a = context;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Intent a(@NonNull Context context) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_CONSTRAINTS_CHANGED");
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Intent b(@NonNull Context context, @NonNull String str) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Intent c(@NonNull Context context, @NonNull String str, boolean z) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Intent d(@NonNull Context context) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_RESCHEDULE");
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Intent f(@NonNull Context context, @NonNull String str) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_SCHEDULE_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Intent g(@NonNull Context context, @NonNull String str) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    private void h(@NonNull Intent intent, int i, @NonNull e eVar) {
        nx5.c().a(d, String.format("Handling constraints changed %s", intent), new Throwable[0]);
        new c(this.a, i, eVar).a();
    }

    private void i(@NonNull Intent intent, int i, @NonNull e eVar) {
        Bundle extras = intent.getExtras();
        synchronized (this.c) {
            try {
                String string = extras.getString("KEY_WORKSPEC_ID");
                nx5 c = nx5.c();
                String str = d;
                c.a(str, String.format("Handing delay met for %s", string), new Throwable[0]);
                if (!this.b.containsKey(string)) {
                    d dVar = new d(this.a, i, string, eVar);
                    this.b.put(string, dVar);
                    dVar.d();
                } else {
                    nx5.c().a(str, String.format("WorkSpec %s is already being handled for ACTION_DELAY_MET", string), new Throwable[0]);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void j(@NonNull Intent intent, int i) {
        Bundle extras = intent.getExtras();
        String string = extras.getString("KEY_WORKSPEC_ID");
        boolean z = extras.getBoolean("KEY_NEEDS_RESCHEDULE");
        nx5.c().a(d, String.format("Handling onExecutionCompleted %s, %s", intent, Integer.valueOf(i)), new Throwable[0]);
        e(string, z);
    }

    private void k(@NonNull Intent intent, int i, @NonNull e eVar) {
        nx5.c().a(d, String.format("Handling reschedule %s, %s", intent, Integer.valueOf(i)), new Throwable[0]);
        eVar.g().x();
    }

    private void l(@NonNull Intent intent, int i, @NonNull e eVar) {
        String string = intent.getExtras().getString("KEY_WORKSPEC_ID");
        nx5 c = nx5.c();
        String str = d;
        c.a(str, String.format("Handling schedule work for %s", string), new Throwable[0]);
        WorkDatabase t = eVar.g().t();
        t.e();
        try {
            WorkSpec g = t.M().g(string);
            if (g == null) {
                nx5 c2 = nx5.c();
                c2.h(str, "Skipping scheduling " + string + " because it's no longer in the DB", new Throwable[0]);
            } else if (g.b.a()) {
                nx5 c3 = nx5.c();
                c3.h(str, "Skipping scheduling " + string + "because it is finished.", new Throwable[0]);
            } else {
                long a = g.a();
                if (!g.b()) {
                    nx5.c().a(str, String.format("Setting up Alarms for %s at %s", string, Long.valueOf(a)), new Throwable[0]);
                    a.c(this.a, eVar.g(), string, a);
                } else {
                    nx5.c().a(str, String.format("Opportunistically setting an alarm for %s at %s", string, Long.valueOf(a)), new Throwable[0]);
                    a.c(this.a, eVar.g(), string, a);
                    eVar.k(new e.b(eVar, a(this.a), i));
                }
                t.B();
            }
        } finally {
            t.i();
        }
    }

    private void m(@NonNull Intent intent, @NonNull e eVar) {
        String string = intent.getExtras().getString("KEY_WORKSPEC_ID");
        nx5.c().a(d, String.format("Handing stopWork work for %s", string), new Throwable[0]);
        eVar.g().C(string);
        a.a(this.a, eVar.g(), string);
        eVar.e(string, false);
    }

    private static boolean n(Bundle bundle, @NonNull String... strArr) {
        if (bundle == null || bundle.isEmpty()) {
            return false;
        }
        for (String str : strArr) {
            if (bundle.get(str) == null) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.bm3
    public void e(@NonNull String str, boolean z) {
        synchronized (this.c) {
            try {
                bm3 remove = this.b.remove(str);
                if (remove != null) {
                    remove.e(str, z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean o() {
        boolean z;
        synchronized (this.c) {
            z = !this.b.isEmpty();
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void p(@NonNull Intent intent, int i, @NonNull e eVar) {
        String action = intent.getAction();
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            h(intent, i, eVar);
        } else if ("ACTION_RESCHEDULE".equals(action)) {
            k(intent, i, eVar);
        } else if (!n(intent.getExtras(), "KEY_WORKSPEC_ID")) {
            nx5.c().b(d, String.format("Invalid request for %s, requires %s.", action, "KEY_WORKSPEC_ID"), new Throwable[0]);
        } else if ("ACTION_SCHEDULE_WORK".equals(action)) {
            l(intent, i, eVar);
        } else if ("ACTION_DELAY_MET".equals(action)) {
            i(intent, i, eVar);
        } else if ("ACTION_STOP_WORK".equals(action)) {
            m(intent, eVar);
        } else if ("ACTION_EXECUTION_COMPLETED".equals(action)) {
            j(intent, i);
        } else {
            nx5.c().h(d, String.format("Ignoring intent %s", intent), new Throwable[0]);
        }
    }
}
