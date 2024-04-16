package com.google.android.gms.measurement;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import androidx.annotation.NonNull;
import com.google.android.gms.measurement.internal.y9;
/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
@TargetApi(24)
/* loaded from: classes2.dex */
public final class AppMeasurementJobService extends JobService implements z3d {
    private y9<AppMeasurementJobService> a;

    private final y9<AppMeasurementJobService> b() {
        if (this.a == null) {
            this.a = new y9<>(this);
        }
        return this.a;
    }

    @Override // defpackage.z3d
    public final boolean e(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        b().c();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        b().h();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onRebind(@NonNull Intent intent) {
        b().i(intent);
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(@NonNull JobParameters jobParameters) {
        return b().g(jobParameters);
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(@NonNull JobParameters jobParameters) {
        return false;
    }

    @Override // android.app.Service
    public final boolean onUnbind(@NonNull Intent intent) {
        return b().k(intent);
    }

    @Override // defpackage.z3d
    @TargetApi(24)
    public final void zza(@NonNull JobParameters jobParameters, boolean z) {
        jobFinished(jobParameters, false);
    }

    @Override // defpackage.z3d
    public final void a(@NonNull Intent intent) {
    }
}
