package com.google.android.gms.internal.gtm;

import android.os.Handler;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-analytics-impl@@17.0.1 */
/* loaded from: classes2.dex */
public abstract class zzcw {
    private static volatile Handler zza;
    private final zzbv zzb;
    private final Runnable zzc;
    private volatile long zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcw(zzbv zzbvVar) {
        gh8.j(zzbvVar);
        this.zzb = zzbvVar;
        this.zzc = new zzcv(this);
    }

    private final Handler zzi() {
        Handler handler;
        if (zza != null) {
            return zza;
        }
        synchronized (zzcw.class) {
            try {
                if (zza == null) {
                    zza = new zzga(this.zzb.zza().getMainLooper());
                }
                handler = zza;
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    public abstract void zza();

    public final long zzb() {
        if (this.zzd == 0) {
            return 0L;
        }
        return Math.abs(this.zzb.zzr().currentTimeMillis() - this.zzd);
    }

    public final void zze(long j) {
        if (!zzh()) {
            return;
        }
        long j2 = 0;
        if (j < 0) {
            zzf();
            return;
        }
        long abs = j - Math.abs(this.zzb.zzr().currentTimeMillis() - this.zzd);
        if (abs >= 0) {
            j2 = abs;
        }
        zzi().removeCallbacks(this.zzc);
        if (!zzi().postDelayed(this.zzc, j2)) {
            this.zzb.zzm().zzK("Failed to adjust delayed post. time", Long.valueOf(j2));
        }
    }

    public final void zzf() {
        this.zzd = 0L;
        zzi().removeCallbacks(this.zzc);
    }

    public final void zzg(long j) {
        zzf();
        if (j >= 0) {
            this.zzd = this.zzb.zzr().currentTimeMillis();
            if (!zzi().postDelayed(this.zzc, j)) {
                this.zzb.zzm().zzK("Failed to schedule delayed post. time", Long.valueOf(j));
            }
        }
    }

    public final boolean zzh() {
        if (this.zzd != 0) {
            return true;
        }
        return false;
    }
}
