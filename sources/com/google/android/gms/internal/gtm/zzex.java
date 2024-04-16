package com.google.android.gms.internal.gtm;

import android.text.TextUtils;
import com.huawei.hms.framework.common.ContainerUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-analytics-impl@@17.0.1 */
/* loaded from: classes2.dex */
public final class zzex {
    private final Map<String, String> zza;
    private final List<zzcp> zzb;
    private final long zzc;
    private final long zzd;
    private final int zze;
    private final boolean zzf;
    private final String zzg;

    public zzex(zzbr zzbrVar, Map<String, String> map, long j, boolean z) {
        this(zzbrVar, map, j, z, 0L, 0, null);
    }

    public static zzex zze(zzbr zzbrVar, zzex zzexVar, Map<String, String> map) {
        return new zzex(zzbrVar, map, zzexVar.zzd, zzexVar.zzf, zzexVar.zzc, zzexVar.zze, zzexVar.zzb);
    }

    private final String zzi(String str, String str2) {
        gh8.f(str);
        gh8.b(!str.startsWith(ContainerUtils.FIELD_DELIMITER), "Short param name required");
        String str3 = this.zza.get(str);
        if (str3 != null) {
            return str3;
        }
        return str2;
    }

    private static String zzj(zzbr zzbrVar, Object obj) {
        if (obj == null) {
            return null;
        }
        String obj2 = obj.toString();
        if (obj2.startsWith(ContainerUtils.FIELD_DELIMITER)) {
            obj2 = obj2.substring(1);
        }
        int length = obj2.length();
        if (length > 256) {
            obj2 = obj2.substring(0, 256);
            zzbrVar.zzT("Hit param name is too long and will be trimmed", Integer.valueOf(length), obj2);
        }
        if (TextUtils.isEmpty(obj2)) {
            return null;
        }
        return obj2;
    }

    private static String zzk(zzbr zzbrVar, Object obj) {
        String obj2;
        if (obj == null) {
            obj2 = "";
        } else {
            obj2 = obj.toString();
        }
        int length = obj2.length();
        if (length > 8192) {
            String substring = obj2.substring(0, 8192);
            zzbrVar.zzT("Hit param value is too long and will be trimmed", Integer.valueOf(length), substring);
            return substring;
        }
        return obj2;
    }

    private static boolean zzl(Object obj) {
        if (obj == null) {
            return false;
        }
        return obj.toString().startsWith(ContainerUtils.FIELD_DELIMITER);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ht=");
        sb.append(this.zzd);
        if (this.zzc != 0) {
            sb.append(", dbId=");
            sb.append(this.zzc);
        }
        if (this.zze != 0) {
            sb.append(", appUID=");
            sb.append(this.zze);
        }
        ArrayList arrayList = new ArrayList(this.zza.keySet());
        Collections.sort(arrayList);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            String str = (String) arrayList.get(i);
            sb.append(", ");
            sb.append(str);
            sb.append(ContainerUtils.KEY_VALUE_DELIMITER);
            sb.append(this.zza.get(str));
        }
        return sb.toString();
    }

    public final int zza() {
        return this.zze;
    }

    public final long zzb() {
        return this.zzc;
    }

    public final long zzc() {
        return zzfs.zza(zzi("_s", "0"));
    }

    public final long zzd() {
        return this.zzd;
    }

    public final String zzf() {
        return zzi("_m", "");
    }

    public final Map<String, String> zzg() {
        return this.zza;
    }

    public final boolean zzh() {
        return this.zzf;
    }

    public zzex(zzbr zzbrVar, Map<String, String> map, long j, boolean z, long j2, int i, List<zzcp> list) {
        String str;
        String zzj;
        String zzj2;
        gh8.j(zzbrVar);
        gh8.j(map);
        this.zzd = j;
        this.zzf = z;
        this.zzc = j2;
        this.zze = i;
        this.zzb = list != null ? list : Collections.emptyList();
        if (list != null) {
            for (zzcp zzcpVar : list) {
                if ("appendVersion".equals(zzcpVar.zza())) {
                    str = zzcpVar.zzb();
                    break;
                }
            }
        }
        str = null;
        this.zzg = true != TextUtils.isEmpty(str) ? str : null;
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (zzl(entry.getKey()) && (zzj2 = zzj(zzbrVar, entry.getKey())) != null) {
                hashMap.put(zzj2, zzk(zzbrVar, entry.getValue()));
            }
        }
        for (Map.Entry<String, String> entry2 : map.entrySet()) {
            if (!zzl(entry2.getKey()) && (zzj = zzj(zzbrVar, entry2.getKey())) != null) {
                hashMap.put(zzj, zzk(zzbrVar, entry2.getValue()));
            }
        }
        if (!TextUtils.isEmpty(this.zzg)) {
            zzfs.zzg(hashMap, "_v", this.zzg);
            if (this.zzg.equals("ma4.0.0") || this.zzg.equals("ma4.0.1")) {
                hashMap.remove("adid");
            }
        }
        this.zza = Collections.unmodifiableMap(hashMap);
    }
}
