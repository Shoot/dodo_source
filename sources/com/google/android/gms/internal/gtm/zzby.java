package com.google.android.gms.internal.gtm;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-analytics-impl@@17.0.1 */
/* loaded from: classes2.dex */
public final class zzby extends zzcw {
    final /* synthetic */ zzcc zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzby(zzcc zzccVar, zzbv zzbvVar) {
        super(zzbvVar);
        this.zza = zzccVar;
    }

    @Override // com.google.android.gms.internal.gtm.zzcw
    public final void zza() {
        zzcc zzccVar = this.zza;
        bad.h();
        if (!zzccVar.zzg()) {
            return;
        }
        zzccVar.zzO("Inactivity, disconnecting from device AnalyticsService");
        zzccVar.zzc();
    }
}
