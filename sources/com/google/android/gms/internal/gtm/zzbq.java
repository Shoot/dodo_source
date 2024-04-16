package com.google.android.gms.internal.gtm;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
/* compiled from: com.google.android.gms:play-services-analytics-impl@@17.0.1 */
/* loaded from: classes2.dex */
public final class zzbq extends zzbs {
    private final zzck zza;

    public zzbq(zzbv zzbvVar, zzbw zzbwVar) {
        super(zzbvVar);
        gh8.j(zzbwVar);
        this.zza = new zzck(zzbvVar, zzbwVar);
    }

    public final long zza(zzbx zzbxVar) {
        zzW();
        gh8.j(zzbxVar);
        bad.h();
        long zzb = this.zza.zzb(zzbxVar, true);
        if (zzb == 0) {
            this.zza.zzk(zzbxVar);
        }
        return zzb;
    }

    public final void zzc() {
        zzW();
        Context zzo = zzo();
        if (zzfi.zza(zzo) && zzfn.zzh(zzo)) {
            Intent intent = new Intent("com.google.android.gms.analytics.ANALYTICS_DISPATCH");
            intent.setComponent(new ComponentName(zzo, "com.google.android.gms.analytics.AnalyticsService"));
            zzo.startService(intent);
            return;
        }
        zze(null);
    }

    @Override // com.google.android.gms.internal.gtm.zzbs
    protected final void zzd() {
        this.zza.zzX();
    }

    public final void zze(zzcz zzczVar) {
        zzW();
        zzq().i(new zzbo(this, zzczVar));
    }

    public final void zzf(String str, Runnable runnable) {
        gh8.g(str, "campaign param can't be empty");
        zzq().i(new zzbk(this, str, runnable));
    }

    public final void zzh(zzex zzexVar) {
        gh8.j(zzexVar);
        zzW();
        zzG("Hit delivery requested", zzexVar);
        zzq().i(new zzbm(this, zzexVar));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzi() {
        bad.h();
        this.zza.zzl();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzj() {
        bad.h();
        this.zza.zzm();
    }

    public final void zzk() {
        zzW();
        bad.h();
        zzck zzckVar = this.zza;
        bad.h();
        zzckVar.zzW();
        zzckVar.zzO("Service disconnected");
    }

    public final void zzm() {
        this.zza.zzaa();
    }
}
