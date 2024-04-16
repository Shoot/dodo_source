package androidx.work.impl.background.systemalarm;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.work.impl.model.WorkSpec;
/* compiled from: SystemAlarmScheduler.java */
/* loaded from: classes.dex */
public class f implements yv9 {
    private static final String b = nx5.f("SystemAlarmScheduler");
    private final Context a;

    public f(@NonNull Context context) {
        this.a = context.getApplicationContext();
    }

    private void b(@NonNull WorkSpec workSpec) {
        nx5.c().a(b, String.format("Scheduling work with workSpecId %s", workSpec.a), new Throwable[0]);
        this.a.startService(b.f(this.a, workSpec.a));
    }

    @Override // defpackage.yv9
    public void a(@NonNull String str) {
        this.a.startService(b.g(this.a, str));
    }

    @Override // defpackage.yv9
    public void c(@NonNull WorkSpec... workSpecArr) {
        for (WorkSpec workSpec : workSpecArr) {
            b(workSpec);
        }
    }

    @Override // defpackage.yv9
    public boolean d() {
        return true;
    }
}
