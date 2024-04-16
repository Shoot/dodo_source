package com.google.android.gms.analytics;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.internal.gtm.zzfm;
import com.google.android.gms.internal.gtm.zzfn;
/* compiled from: com.google.android.gms:play-services-analytics@@17.0.1 */
@TargetApi(24)
/* loaded from: classes2.dex */
public final class AnalyticsJobService extends JobService implements zzfm {
    private zzfn<AnalyticsJobService> a;

    private final zzfn<AnalyticsJobService> a() {
        if (this.a == null) {
            this.a = new zzfn<>(this);
        }
        return this.a;
    }

    @Override // com.google.android.gms.internal.gtm.zzfm
    public boolean callServiceStopSelfResult(int i) {
        return stopSelfResult(i);
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        a().zze();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        a().zzf();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(@RecentlyNonNull Intent intent, int i, int i2) {
        a().zza(intent, i, i2);
        return 2;
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(@RecentlyNonNull JobParameters jobParameters) {
        a().zzi(jobParameters);
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(@RecentlyNonNull JobParameters jobParameters) {
        return false;
    }

    @Override // com.google.android.gms.internal.gtm.zzfm
    @TargetApi(24)
    public final void zza(@RecentlyNonNull JobParameters jobParameters, boolean z) {
        jobFinished(jobParameters, false);
    }
}
