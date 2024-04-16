package com.google.android.gms.internal.gtm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-analytics-impl@@17.0.1 */
/* loaded from: classes2.dex */
public final class zzbb extends g2d<zzbb> {
    private final List<el8> zza = new ArrayList();
    private final List<kq8> zzb = new ArrayList();
    private final Map<String, List<el8>> zzc = new HashMap();

    public final String toString() {
        HashMap hashMap = new HashMap();
        if (!this.zza.isEmpty()) {
            hashMap.put("products", this.zza);
        }
        if (!this.zzb.isEmpty()) {
            hashMap.put("promotions", this.zzb);
        }
        if (!this.zzc.isEmpty()) {
            hashMap.put("impressions", this.zzc);
        }
        hashMap.put("productAction", null);
        return g2d.zza(hashMap);
    }

    @Override // defpackage.g2d
    public final /* bridge */ /* synthetic */ void zzc(zzbb zzbbVar) {
        String str;
        zzbb zzbbVar2 = zzbbVar;
        zzbbVar2.zza.addAll(this.zza);
        zzbbVar2.zzb.addAll(this.zzb);
        for (Map.Entry<String, List<el8>> entry : this.zzc.entrySet()) {
            String key = entry.getKey();
            for (el8 el8Var : entry.getValue()) {
                if (el8Var != null) {
                    if (key == null) {
                        str = "";
                    } else {
                        str = key;
                    }
                    if (!zzbbVar2.zzc.containsKey(str)) {
                        zzbbVar2.zzc.put(str, new ArrayList());
                    }
                    zzbbVar2.zzc.get(str).add(el8Var);
                }
            }
        }
    }

    public final List<el8> zzd() {
        return Collections.unmodifiableList(this.zza);
    }

    public final List<kq8> zze() {
        return Collections.unmodifiableList(this.zzb);
    }

    public final Map<String, List<el8>> zzf() {
        return this.zzc;
    }
}
