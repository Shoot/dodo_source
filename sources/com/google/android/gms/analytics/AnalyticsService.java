package com.google.android.gms.analytics;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.internal.gtm.zzfm;
import com.google.android.gms.internal.gtm.zzfn;
/* compiled from: com.google.android.gms:play-services-analytics@@17.0.1 */
/* loaded from: classes2.dex */
public final class AnalyticsService extends Service implements zzfm {
    private zzfn<AnalyticsService> a;

    private final zzfn<AnalyticsService> a() {
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
    @RecentlyNonNull
    public IBinder onBind(@RecentlyNonNull Intent intent) {
        a();
        return null;
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

    @Override // com.google.android.gms.internal.gtm.zzfm
    public final void zza(@RecentlyNonNull JobParameters jobParameters, boolean z) {
        throw new UnsupportedOperationException();
    }
}
