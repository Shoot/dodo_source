package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import androidx.annotation.NonNull;
import com.google.android.gms.measurement.internal.y9;
/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* loaded from: classes2.dex */
public final class AppMeasurementService extends Service implements z3d {
    private y9<AppMeasurementService> a;

    private final y9<AppMeasurementService> b() {
        if (this.a == null) {
            this.a = new y9<>(this);
        }
        return this.a;
    }

    @Override // defpackage.z3d
    public final void a(@NonNull Intent intent) {
        y2c.b(intent);
    }

    @Override // defpackage.z3d
    public final boolean e(int i) {
        return stopSelfResult(i);
    }

    @Override // android.app.Service
    public final IBinder onBind(@NonNull Intent intent) {
        return b().b(intent);
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

    @Override // android.app.Service
    public final int onStartCommand(@NonNull Intent intent, int i, int i2) {
        return b().a(intent, i, i2);
    }

    @Override // android.app.Service
    public final boolean onUnbind(@NonNull Intent intent) {
        return b().k(intent);
    }

    @Override // defpackage.z3d
    public final void zza(@NonNull JobParameters jobParameters, boolean z) {
        throw new UnsupportedOperationException();
    }
}
