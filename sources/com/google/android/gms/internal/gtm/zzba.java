package com.google.android.gms.internal.gtm;

import android.text.TextUtils;
import java.util.HashMap;
/* compiled from: com.google.android.gms:play-services-analytics-impl@@17.0.1 */
/* loaded from: classes2.dex */
public final class zzba extends g2d<zzba> {
    public int zza;
    public int zzb;
    private String zzc;

    public final String toString() {
        HashMap hashMap = new HashMap();
        hashMap.put("language", this.zzc);
        hashMap.put("screenColors", 0);
        hashMap.put("screenWidth", Integer.valueOf(this.zza));
        hashMap.put("screenHeight", Integer.valueOf(this.zzb));
        hashMap.put("viewportWidth", 0);
        hashMap.put("viewportHeight", 0);
        return g2d.zza(hashMap);
    }

    @Override // defpackage.g2d
    public final /* bridge */ /* synthetic */ void zzc(zzba zzbaVar) {
        zzba zzbaVar2 = zzbaVar;
        int i = this.zza;
        if (i != 0) {
            zzbaVar2.zza = i;
        }
        int i2 = this.zzb;
        if (i2 != 0) {
            zzbaVar2.zzb = i2;
        }
        if (!TextUtils.isEmpty(this.zzc)) {
            zzbaVar2.zzc = this.zzc;
        }
    }

    public final String zzd() {
        return this.zzc;
    }

    public final void zze(String str) {
        this.zzc = str;
    }
}
