package com.google.android.gms.internal.gtm;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-analytics-impl@@17.0.1 */
/* loaded from: classes2.dex */
public final class zzfo {
    private final t91 zza;
    private long zzb;

    public zzfo(t91 t91Var) {
        gh8.j(t91Var);
        this.zza = t91Var;
    }

    public final void zza() {
        this.zzb = 0L;
    }

    public final void zzb() {
        this.zzb = this.zza.b();
    }

    public final boolean zzc(long j) {
        if (this.zzb == 0 || this.zza.b() - this.zzb > j) {
            return true;
        }
        return false;
    }

    public zzfo(t91 t91Var, long j) {
        gh8.j(t91Var);
        this.zza = t91Var;
        this.zzb = j;
    }
}
