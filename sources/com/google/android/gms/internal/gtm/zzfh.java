package com.google.android.gms.internal.gtm;

import android.content.SharedPreferences;
import android.text.TextUtils;
/* compiled from: com.google.android.gms:play-services-analytics-impl@@17.0.1 */
/* loaded from: classes2.dex */
public final class zzfh extends zzbs {
    private SharedPreferences zza;
    private long zzb;
    private long zzc;
    private final zzfg zzd;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzfh(zzbv zzbvVar) {
        super(zzbvVar);
        this.zzc = -1L;
        zzw();
        this.zzd = new zzfg(this, "monitoring", zzeu.zzP.zzb().longValue(), null);
    }

    public final long zza() {
        bad.h();
        zzW();
        long j = this.zzb;
        if (j == 0) {
            long j2 = this.zza.getLong("first_run", 0L);
            if (j2 != 0) {
                this.zzb = j2;
                return j2;
            }
            long currentTimeMillis = zzC().currentTimeMillis();
            SharedPreferences.Editor edit = this.zza.edit();
            edit.putLong("first_run", currentTimeMillis);
            if (!edit.commit()) {
                zzR("Failed to commit first run time");
            }
            this.zzb = currentTimeMillis;
            return currentTimeMillis;
        }
        return j;
    }

    public final long zzb() {
        bad.h();
        zzW();
        long j = this.zzc;
        if (j == -1) {
            long j2 = this.zza.getLong("last_dispatch", 0L);
            this.zzc = j2;
            return j2;
        }
        return j;
    }

    @Override // com.google.android.gms.internal.gtm.zzbs
    protected final void zzd() {
        this.zza = zzo().getSharedPreferences("com.google.android.gms.analytics.prefs", 0);
    }

    public final zzfg zze() {
        return this.zzd;
    }

    public final zzfo zzf() {
        return new zzfo(zzC(), zza());
    }

    public final String zzg() {
        bad.h();
        zzW();
        String string = this.zza.getString("installation_campaign", null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return string;
    }

    public final void zzh(String str) {
        bad.h();
        zzW();
        SharedPreferences.Editor edit = this.zza.edit();
        if (TextUtils.isEmpty(str)) {
            edit.remove("installation_campaign");
        } else {
            edit.putString("installation_campaign", str);
        }
        if (!edit.commit()) {
            zzR("Failed to commit campaign data");
        }
    }

    public final void zzi() {
        bad.h();
        zzW();
        long currentTimeMillis = zzC().currentTimeMillis();
        SharedPreferences.Editor edit = this.zza.edit();
        edit.putLong("last_dispatch", currentTimeMillis);
        edit.apply();
        this.zzc = currentTimeMillis;
    }
}
