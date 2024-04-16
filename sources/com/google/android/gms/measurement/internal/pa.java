package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.PersistableBundle;
/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* loaded from: classes2.dex */
public final class pa extends ua {
    private final AlarmManager d;
    private r e;
    private Integer f;

    /* JADX INFO: Access modifiers changed from: protected */
    public pa(va vaVar) {
        super(vaVar);
        this.d = (AlarmManager) zza().getSystemService("alarm");
    }

    private final PendingIntent A() {
        Context zza = zza();
        return ptc.a(zza, 0, new Intent().setClassName(zza, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), ptc.b);
    }

    private final r B() {
        if (this.e == null) {
            this.e = new sa(this, this.b.i0());
        }
        return this.e;
    }

    @TargetApi(24)
    private final void C() {
        JobScheduler jobScheduler = (JobScheduler) zza().getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(z());
        }
    }

    private final int z() {
        if (this.f == null) {
            String packageName = zza().getPackageName();
            this.f = Integer.valueOf(("measurement" + packageName).hashCode());
        }
        return this.f.intValue();
    }

    @Override // com.google.android.gms.measurement.internal.t6
    public final /* bridge */ /* synthetic */ g a() {
        return super.a();
    }

    @Override // com.google.android.gms.measurement.internal.t6, com.google.android.gms.measurement.internal.u6
    public final /* bridge */ /* synthetic */ t91 b() {
        return super.b();
    }

    @Override // com.google.android.gms.measurement.internal.t6, com.google.android.gms.measurement.internal.u6
    public final /* bridge */ /* synthetic */ c d() {
        return super.d();
    }

    @Override // com.google.android.gms.measurement.internal.t6
    public final /* bridge */ /* synthetic */ w e() {
        return super.e();
    }

    @Override // com.google.android.gms.measurement.internal.t6
    public final /* bridge */ /* synthetic */ j4 f() {
        return super.f();
    }

    @Override // com.google.android.gms.measurement.internal.t6
    public final /* bridge */ /* synthetic */ w4 g() {
        return super.g();
    }

    @Override // com.google.android.gms.measurement.internal.t6
    public final /* bridge */ /* synthetic */ jb h() {
        return super.h();
    }

    @Override // com.google.android.gms.measurement.internal.t6
    public final /* bridge */ /* synthetic */ void i() {
        super.i();
    }

    @Override // com.google.android.gms.measurement.internal.t6
    public final /* bridge */ /* synthetic */ void j() {
        super.j();
    }

    @Override // com.google.android.gms.measurement.internal.t6, com.google.android.gms.measurement.internal.u6
    public final /* bridge */ /* synthetic */ o5 k() {
        return super.k();
    }

    @Override // com.google.android.gms.measurement.internal.t6
    public final /* bridge */ /* synthetic */ void l() {
        super.l();
    }

    @Override // com.google.android.gms.measurement.internal.ra
    public final /* bridge */ /* synthetic */ db m() {
        return super.m();
    }

    @Override // com.google.android.gms.measurement.internal.t6, com.google.android.gms.measurement.internal.u6
    public final /* bridge */ /* synthetic */ k4 n() {
        return super.n();
    }

    @Override // com.google.android.gms.measurement.internal.ra
    public final /* bridge */ /* synthetic */ ob o() {
        return super.o();
    }

    @Override // com.google.android.gms.measurement.internal.ra
    public final /* bridge */ /* synthetic */ k p() {
        return super.p();
    }

    @Override // com.google.android.gms.measurement.internal.ra
    public final /* bridge */ /* synthetic */ g5 q() {
        return super.q();
    }

    @Override // com.google.android.gms.measurement.internal.ra
    public final /* bridge */ /* synthetic */ w9 r() {
        return super.r();
    }

    @Override // com.google.android.gms.measurement.internal.ra
    public final /* bridge */ /* synthetic */ ta s() {
        return super.s();
    }

    @Override // com.google.android.gms.measurement.internal.ua
    protected final boolean w() {
        AlarmManager alarmManager = this.d;
        if (alarmManager != null) {
            alarmManager.cancel(A());
        }
        if (Build.VERSION.SDK_INT >= 24) {
            C();
            return false;
        }
        return false;
    }

    public final void x(long j) {
        t();
        Context zza = zza();
        if (!jb.c0(zza)) {
            n().E().a("Receiver not registered/enabled");
        }
        if (!jb.d0(zza, false)) {
            n().E().a("Service not registered/enabled");
        }
        y();
        n().J().b("Scheduling upload, millis", Long.valueOf(j));
        long b = b().b() + j;
        if (j < Math.max(0L, b0.z.a(null).longValue()) && !B().e()) {
            B().b(j);
        }
        if (Build.VERSION.SDK_INT >= 24) {
            Context zza2 = zza();
            ComponentName componentName = new ComponentName(zza2, "com.google.android.gms.measurement.AppMeasurementJobService");
            int z = z();
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putString("action", "com.google.android.gms.measurement.UPLOAD");
            rtc.c(zza2, new JobInfo.Builder(z, componentName).setMinimumLatency(j).setOverrideDeadline(j << 1).setExtras(persistableBundle).build(), "com.google.android.gms", "UploadAlarm");
            return;
        }
        AlarmManager alarmManager = this.d;
        if (alarmManager != null) {
            alarmManager.setInexactRepeating(2, b, Math.max(b0.u.a(null).longValue(), j), A());
        }
    }

    public final void y() {
        t();
        n().J().a("Unscheduling upload");
        AlarmManager alarmManager = this.d;
        if (alarmManager != null) {
            alarmManager.cancel(A());
        }
        B().a();
        if (Build.VERSION.SDK_INT >= 24) {
            C();
        }
    }

    @Override // com.google.android.gms.measurement.internal.t6, com.google.android.gms.measurement.internal.u6
    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }
}
