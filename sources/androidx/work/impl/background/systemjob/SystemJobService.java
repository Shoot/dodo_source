package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.net.Network;
import android.net.Uri;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.work.WorkerParameters;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class SystemJobService extends JobService implements bm3 {
    private static final String c = nx5.f("SystemJobService");
    private j7c a;
    private final Map<String, JobParameters> b = new HashMap();

    private static String a(@NonNull JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras != null && extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return extras.getString("EXTRA_WORK_SPEC_ID");
            }
            return null;
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // defpackage.bm3
    public void e(@NonNull String str, boolean z) {
        JobParameters remove;
        nx5.c().a(c, String.format("%s executed on JobScheduler", str), new Throwable[0]);
        synchronized (this.b) {
            remove = this.b.remove(str);
        }
        if (remove != null) {
            jobFinished(remove, z);
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        try {
            j7c p = j7c.p(getApplicationContext());
            this.a = p;
            p.r().c(this);
        } catch (IllegalStateException unused) {
            if (Application.class.equals(getApplication().getClass())) {
                nx5.c().h(c, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.", new Throwable[0]);
                return;
            }
            throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        j7c j7cVar = this.a;
        if (j7cVar != null) {
            j7cVar.r().i(this);
        }
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(@NonNull JobParameters jobParameters) {
        WorkerParameters.a aVar;
        Uri[] triggeredContentUris;
        String[] triggeredContentAuthorities;
        Network network;
        String[] triggeredContentAuthorities2;
        Uri[] triggeredContentUris2;
        if (this.a == null) {
            nx5.c().a(c, "WorkManager is not initialized; requesting retry.", new Throwable[0]);
            jobFinished(jobParameters, true);
            return false;
        }
        String a = a(jobParameters);
        if (TextUtils.isEmpty(a)) {
            nx5.c().b(c, "WorkSpec id not found!", new Throwable[0]);
            return false;
        }
        synchronized (this.b) {
            try {
                if (this.b.containsKey(a)) {
                    nx5.c().a(c, String.format("Job is already being executed by SystemJobService: %s", a), new Throwable[0]);
                    return false;
                }
                nx5.c().a(c, String.format("onStartJob for %s", a), new Throwable[0]);
                this.b.put(a, jobParameters);
                int i = Build.VERSION.SDK_INT;
                if (i >= 24) {
                    aVar = new WorkerParameters.a();
                    triggeredContentUris = jobParameters.getTriggeredContentUris();
                    if (triggeredContentUris != null) {
                        triggeredContentUris2 = jobParameters.getTriggeredContentUris();
                        aVar.b = Arrays.asList(triggeredContentUris2);
                    }
                    triggeredContentAuthorities = jobParameters.getTriggeredContentAuthorities();
                    if (triggeredContentAuthorities != null) {
                        triggeredContentAuthorities2 = jobParameters.getTriggeredContentAuthorities();
                        aVar.a = Arrays.asList(triggeredContentAuthorities2);
                    }
                    if (i >= 28) {
                        network = jobParameters.getNetwork();
                        aVar.c = network;
                    }
                } else {
                    aVar = null;
                }
                this.a.A(a, aVar);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(@NonNull JobParameters jobParameters) {
        if (this.a == null) {
            nx5.c().a(c, "WorkManager is not initialized; requesting retry.", new Throwable[0]);
            return true;
        }
        String a = a(jobParameters);
        if (TextUtils.isEmpty(a)) {
            nx5.c().b(c, "WorkSpec id not found!", new Throwable[0]);
            return false;
        }
        nx5.c().a(c, String.format("onStopJob for %s", a), new Throwable[0]);
        synchronized (this.b) {
            this.b.remove(a);
        }
        this.a.C(a);
        return !this.a.r().f(a);
    }
}
