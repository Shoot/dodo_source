package defpackage;

import android.content.Context;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.work.a;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import androidx.work.impl.background.systemalarm.f;
import androidx.work.impl.background.systemjob.SystemJobService;
import androidx.work.impl.model.WorkSpec;
import im.threads.ui.fragments.ChatFragment;
import java.util.List;
/* compiled from: Schedulers.java */
/* renamed from: ew9  reason: default package */
/* loaded from: classes.dex */
public class ew9 {
    private static final String a = nx5.f("Schedulers");

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public static yv9 a(@NonNull Context context, @NonNull j7c j7cVar) {
        if (Build.VERSION.SDK_INT >= 23) {
            w4b w4bVar = new w4b(context, j7cVar);
            so7.a(context, SystemJobService.class, true);
            nx5.c().a(a, "Created SystemJobScheduler and enabled SystemJobService", new Throwable[0]);
            return w4bVar;
        }
        yv9 c = c(context);
        if (c == null) {
            f fVar = new f(context);
            so7.a(context, SystemAlarmService.class, true);
            nx5.c().a(a, "Created SystemAlarmScheduler", new Throwable[0]);
            return fVar;
        }
        return c;
    }

    public static void b(@NonNull a aVar, @NonNull WorkDatabase workDatabase, List<yv9> list) {
        if (list != null && list.size() != 0) {
            androidx.work.impl.model.a M = workDatabase.M();
            workDatabase.e();
            try {
                List<WorkSpec> n = M.n(aVar.h());
                List<WorkSpec> j = M.j(ChatFragment.REQUEST_PERMISSION_BOTTOM_GALLERY_GALLERY);
                if (n != null && n.size() > 0) {
                    long currentTimeMillis = System.currentTimeMillis();
                    for (WorkSpec workSpec : n) {
                        M.l(workSpec.a, currentTimeMillis);
                    }
                }
                workDatabase.B();
                workDatabase.i();
                if (n != null && n.size() > 0) {
                    WorkSpec[] workSpecArr = (WorkSpec[]) n.toArray(new WorkSpec[n.size()]);
                    for (yv9 yv9Var : list) {
                        if (yv9Var.d()) {
                            yv9Var.c(workSpecArr);
                        }
                    }
                }
                if (j != null && j.size() > 0) {
                    WorkSpec[] workSpecArr2 = (WorkSpec[]) j.toArray(new WorkSpec[j.size()]);
                    for (yv9 yv9Var2 : list) {
                        if (!yv9Var2.d()) {
                            yv9Var2.c(workSpecArr2);
                        }
                    }
                }
            } catch (Throwable th) {
                workDatabase.i();
                throw th;
            }
        }
    }

    private static yv9 c(@NonNull Context context) {
        try {
            yv9 yv9Var = (yv9) Class.forName("androidx.work.impl.background.gcm.GcmScheduler").getConstructor(Context.class).newInstance(context);
            nx5.c().a(a, String.format("Created %s", "androidx.work.impl.background.gcm.GcmScheduler"), new Throwable[0]);
            return yv9Var;
        } catch (Throwable th) {
            nx5.c().a(a, "Unable to create GCM Scheduler", th);
            return null;
        }
    }
}
