package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.zip.Adler32;
/* compiled from: JobInfoScheduler.java */
/* renamed from: o95  reason: default package */
/* loaded from: classes2.dex */
public class o95 implements t7c {
    private final Context a;
    private final el3 b;
    private final zv9 c;

    public o95(Context context, el3 el3Var, zv9 zv9Var) {
        this.a = context;
        this.b = el3Var;
        this.c = zv9Var;
    }

    private boolean d(JobScheduler jobScheduler, int i, int i2) {
        for (JobInfo jobInfo : jobScheduler.getAllPendingJobs()) {
            int i3 = jobInfo.getExtras().getInt("attemptNumber");
            if (jobInfo.getId() == i) {
                if (i3 < i2) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.t7c
    public void a(wlb wlbVar, int i) {
        b(wlbVar, i, false);
    }

    @Override // defpackage.t7c
    public void b(wlb wlbVar, int i, boolean z) {
        ComponentName componentName = new ComponentName(this.a, JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) this.a.getSystemService("jobscheduler");
        int c = c(wlbVar);
        if (!z && d(jobScheduler, c, i)) {
            wx5.b("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", wlbVar);
            return;
        }
        long X0 = this.b.X0(wlbVar);
        JobInfo.Builder c2 = this.c.c(new JobInfo.Builder(c, componentName), wlbVar.d(), X0, i);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt("attemptNumber", i);
        persistableBundle.putString("backendName", wlbVar.b());
        persistableBundle.putInt("priority", ak8.a(wlbVar.d()));
        if (wlbVar.c() != null) {
            persistableBundle.putString("extras", Base64.encodeToString(wlbVar.c(), 0));
        }
        c2.setExtras(persistableBundle);
        wx5.c("JobInfoScheduler", "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", wlbVar, Integer.valueOf(c), Long.valueOf(this.c.g(wlbVar.d(), X0, i)), Long.valueOf(X0), Integer.valueOf(i));
        jobScheduler.schedule(c2.build());
    }

    int c(wlb wlbVar) {
        Adler32 adler32 = new Adler32();
        adler32.update(this.a.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(wlbVar.b().getBytes(Charset.forName("UTF-8")));
        adler32.update(ByteBuffer.allocate(4).putInt(ak8.a(wlbVar.d())).array());
        if (wlbVar.c() != null) {
            adler32.update(wlbVar.c());
        }
        return (int) adler32.getValue();
    }
}
