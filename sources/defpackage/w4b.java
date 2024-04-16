package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import androidx.work.impl.model.SystemIdInfo;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.a;
import defpackage.b7c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
/* compiled from: SystemJobScheduler.java */
/* renamed from: w4b  reason: default package */
/* loaded from: classes.dex */
public class w4b implements yv9 {
    private static final String e = nx5.f("SystemJobScheduler");
    private final Context a;
    private final JobScheduler b;
    private final j7c c;
    private final v4b d;

    public w4b(@NonNull Context context, @NonNull j7c j7cVar) {
        this(context, j7cVar, (JobScheduler) context.getSystemService("jobscheduler"), new v4b(context));
    }

    public static void b(@NonNull Context context) {
        List<JobInfo> g;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler != null && (g = g(context, jobScheduler)) != null && !g.isEmpty()) {
            for (JobInfo jobInfo : g) {
                e(jobScheduler, jobInfo.getId());
            }
        }
    }

    private static void e(@NonNull JobScheduler jobScheduler, int i) {
        try {
            jobScheduler.cancel(i);
        } catch (Throwable th) {
            nx5.c().b(e, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i)), th);
        }
    }

    private static List<Integer> f(@NonNull Context context, @NonNull JobScheduler jobScheduler, @NonNull String str) {
        List<JobInfo> g = g(context, jobScheduler);
        if (g == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(2);
        for (JobInfo jobInfo : g) {
            if (str.equals(h(jobInfo))) {
                arrayList.add(Integer.valueOf(jobInfo.getId()));
            }
        }
        return arrayList;
    }

    private static List<JobInfo> g(@NonNull Context context, @NonNull JobScheduler jobScheduler) {
        List<JobInfo> list;
        try {
            list = jobScheduler.getAllPendingJobs();
        } catch (Throwable th) {
            nx5.c().b(e, "getAllPendingJobs() is not reliable on this device.", th);
            list = null;
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        ComponentName componentName = new ComponentName(context, SystemJobService.class);
        for (JobInfo jobInfo : list) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    private static String h(@NonNull JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras != null) {
            try {
                if (extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                    return extras.getString("EXTRA_WORK_SPEC_ID");
                }
                return null;
            } catch (NullPointerException unused) {
                return null;
            }
        }
        return null;
    }

    public static boolean i(@NonNull Context context, @NonNull j7c j7cVar) {
        int i;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        List<JobInfo> g = g(context, jobScheduler);
        List<String> b = j7cVar.t().J().b();
        boolean z = false;
        if (g != null) {
            i = g.size();
        } else {
            i = 0;
        }
        HashSet hashSet = new HashSet(i);
        if (g != null && !g.isEmpty()) {
            for (JobInfo jobInfo : g) {
                String h = h(jobInfo);
                if (!TextUtils.isEmpty(h)) {
                    hashSet.add(h);
                } else {
                    e(jobScheduler, jobInfo.getId());
                }
            }
        }
        Iterator<String> it = b.iterator();
        while (true) {
            if (it.hasNext()) {
                if (!hashSet.contains(it.next())) {
                    nx5.c().a(e, "Reconciling jobs", new Throwable[0]);
                    z = true;
                    break;
                }
            } else {
                break;
            }
        }
        if (z) {
            WorkDatabase t = j7cVar.t();
            t.e();
            try {
                a M = t.M();
                for (String str : b) {
                    M.l(str, -1L);
                }
                t.B();
                t.i();
            } catch (Throwable th) {
                t.i();
                throw th;
            }
        }
        return z;
    }

    @Override // defpackage.yv9
    public void a(@NonNull String str) {
        List<Integer> f = f(this.a, this.b, str);
        if (f != null && !f.isEmpty()) {
            for (Integer num : f) {
                e(this.b, num.intValue());
            }
            this.c.t().J().d(str);
        }
    }

    @Override // defpackage.yv9
    public void c(@NonNull WorkSpec... workSpecArr) {
        int d;
        List<Integer> f;
        int d2;
        WorkDatabase t = this.c.t();
        ft4 ft4Var = new ft4(t);
        for (WorkSpec workSpec : workSpecArr) {
            t.e();
            try {
                WorkSpec g = t.M().g(workSpec.a);
                if (g == null) {
                    nx5.c().h(e, "Skipping scheduling " + workSpec.a + " because it's no longer in the DB", new Throwable[0]);
                    t.B();
                } else if (g.b != b7c.a.ENQUEUED) {
                    nx5.c().h(e, "Skipping scheduling " + workSpec.a + " because it is no longer enqueued", new Throwable[0]);
                    t.B();
                } else {
                    SystemIdInfo a = t.J().a(workSpec.a);
                    if (a != null) {
                        d = a.b;
                    } else {
                        d = ft4Var.d(this.c.n().i(), this.c.n().g());
                    }
                    if (a == null) {
                        this.c.t().J().c(new SystemIdInfo(workSpec.a, d));
                    }
                    j(workSpec, d);
                    if (Build.VERSION.SDK_INT == 23 && (f = f(this.a, this.b, workSpec.a)) != null) {
                        int indexOf = f.indexOf(Integer.valueOf(d));
                        if (indexOf >= 0) {
                            f.remove(indexOf);
                        }
                        if (!f.isEmpty()) {
                            d2 = f.get(0).intValue();
                        } else {
                            d2 = ft4Var.d(this.c.n().i(), this.c.n().g());
                        }
                        j(workSpec, d2);
                    }
                    t.B();
                }
            } finally {
                t.i();
            }
        }
    }

    @Override // defpackage.yv9
    public boolean d() {
        return true;
    }

    public void j(WorkSpec workSpec, int i) {
        int i2;
        JobInfo a = this.d.a(workSpec, i);
        nx5 c = nx5.c();
        String str = e;
        c.a(str, String.format("Scheduling work ID %s Job ID %s", workSpec.a, Integer.valueOf(i)), new Throwable[0]);
        try {
            if (this.b.schedule(a) == 0) {
                nx5.c().h(str, String.format("Unable to schedule work ID %s", workSpec.a), new Throwable[0]);
                if (workSpec.q && workSpec.r == gm7.RUN_AS_NON_EXPEDITED_WORK_REQUEST) {
                    workSpec.q = false;
                    nx5.c().a(str, String.format("Scheduling a non-expedited job (work ID %s)", workSpec.a), new Throwable[0]);
                    j(workSpec, i);
                }
            }
        } catch (IllegalStateException e2) {
            List<JobInfo> g = g(this.a, this.b);
            if (g != null) {
                i2 = g.size();
            } else {
                i2 = 0;
            }
            String format = String.format(Locale.getDefault(), "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", Integer.valueOf(i2), Integer.valueOf(this.c.t().M().d().size()), Integer.valueOf(this.c.n().h()));
            nx5.c().b(e, format, new Throwable[0]);
            throw new IllegalStateException(format, e2);
        } catch (Throwable th) {
            nx5.c().b(e, String.format("Unable to schedule %s", workSpec), th);
        }
    }

    public w4b(Context context, j7c j7cVar, JobScheduler jobScheduler, v4b v4bVar) {
        this.a = context;
        this.c = j7cVar;
        this.b = jobScheduler;
        this.d = v4bVar;
    }
}
