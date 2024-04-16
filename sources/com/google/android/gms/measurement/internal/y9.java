package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import defpackage.z3d;
/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* loaded from: classes2.dex */
public final class y9<T extends Context & z3d> {
    private final T a;

    public y9(T t) {
        gh8.j(t);
        this.a = t;
    }

    private final void f(Runnable runnable) {
        va i = va.i(this.a);
        i.k().C(new ca(this, i, runnable));
    }

    private final k4 j() {
        return u5.a(this.a, null, null).n();
    }

    public final int a(final Intent intent, int i, final int i2) {
        final k4 n = u5.a(this.a, null, null).n();
        if (intent == null) {
            n.K().a("AppMeasurementService started with null intent");
            return 2;
        }
        String action = intent.getAction();
        n.J().c("Local AppMeasurementService called. startId, action", Integer.valueOf(i2), action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            f(new Runnable() { // from class: com.google.android.gms.measurement.internal.aa
                @Override // java.lang.Runnable
                public final void run() {
                    y9.this.d(i2, n, intent);
                }
            });
        }
        return 2;
    }

    public final IBinder b(Intent intent) {
        if (intent == null) {
            j().F().a("onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new y5(va.i(this.a));
        }
        j().K().b("onBind received unknown action", action);
        return null;
    }

    public final void c() {
        u5.a(this.a, null, null).n().J().a("Local AppMeasurementService is starting up");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void d(int i, k4 k4Var, Intent intent) {
        if (this.a.e(i)) {
            k4Var.J().b("Local AppMeasurementService processed last upload request. StartId", Integer.valueOf(i));
            j().J().a("Completed wakeful intent.");
            this.a.a(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void e(k4 k4Var, JobParameters jobParameters) {
        k4Var.J().a("AppMeasurementJobService processed last upload request.");
        this.a.zza(jobParameters, false);
    }

    @TargetApi(24)
    public final boolean g(final JobParameters jobParameters) {
        final k4 n = u5.a(this.a, null, null).n();
        String string = jobParameters.getExtras().getString("action");
        n.J().b("Local AppMeasurementJobService called. action", string);
        if ("com.google.android.gms.measurement.UPLOAD".equals(string)) {
            f(new Runnable() { // from class: com.google.android.gms.measurement.internal.ba
                @Override // java.lang.Runnable
                public final void run() {
                    y9.this.e(n, jobParameters);
                }
            });
            return true;
        }
        return true;
    }

    public final void h() {
        u5.a(this.a, null, null).n().J().a("Local AppMeasurementService is shutting down");
    }

    public final void i(Intent intent) {
        if (intent == null) {
            j().F().a("onRebind called with null intent");
            return;
        }
        j().J().b("onRebind called. action", intent.getAction());
    }

    public final boolean k(Intent intent) {
        if (intent == null) {
            j().F().a("onUnbind called with null intent");
            return true;
        }
        j().J().b("onUnbind called for intent. action", intent.getAction());
        return true;
    }
}
