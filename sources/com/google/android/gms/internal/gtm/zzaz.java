package com.google.android.gms.internal.gtm;

import com.huawei.hms.framework.common.ContainerUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-analytics-impl@@17.0.1 */
/* loaded from: classes2.dex */
public final class zzaz extends g2d<zzaz> {
    private final Map<String, Object> zza = new HashMap();

    public final String toString() {
        return g2d.zza(this.zza);
    }

    @Override // defpackage.g2d
    public final /* bridge */ /* synthetic */ void zzc(zzaz zzazVar) {
        zzaz zzazVar2 = zzazVar;
        gh8.j(zzazVar2);
        zzazVar2.zza.putAll(this.zza);
    }

    public final Map<String, Object> zzd() {
        return Collections.unmodifiableMap(this.zza);
    }

    public final void zze(String str, String str2) {
        gh8.f(str);
        if (str != null && str.startsWith(ContainerUtils.FIELD_DELIMITER)) {
            str = str.substring(1);
        }
        gh8.g(str, "Name can not be empty or \"&\"");
        this.zza.put(str, str2);
    }
}
