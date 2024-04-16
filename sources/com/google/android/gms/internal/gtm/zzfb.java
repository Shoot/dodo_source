package com.google.android.gms.internal.gtm;

import ch.qos.logback.core.CoreConstants;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-analytics-impl@@17.0.1 */
/* loaded from: classes2.dex */
public final class zzfb extends zzbs {
    private static zzfb zza;

    public zzfb(zzbv zzbvVar) {
        super(zzbvVar);
    }

    public static zzfb zza() {
        return zza;
    }

    protected static final String zzf(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        String str = "-";
        if (obj instanceof Long) {
            Long l = (Long) obj;
            if (Math.abs(l.longValue()) < 100) {
                return String.valueOf(obj);
            }
            if (String.valueOf(obj).charAt(0) != '-') {
                str = "";
            }
            String valueOf = String.valueOf(Math.abs(l.longValue()));
            return str + Math.round(Math.pow(10.0d, valueOf.length() - 1)) + "..." + str + Math.round(Math.pow(10.0d, valueOf.length()) - 1.0d);
        } else if (obj instanceof Boolean) {
            return String.valueOf(obj);
        } else {
            if (!(obj instanceof Throwable)) {
                return "-";
            }
            return obj.getClass().getCanonicalName();
        }
    }

    public final void zzb(zzex zzexVar, String str) {
        String str2;
        String str3;
        if (zzexVar != null) {
            str2 = zzexVar.toString();
        } else {
            str2 = "no hit data";
        }
        if (str.length() != 0) {
            str3 = "Discarding hit. ".concat(str);
        } else {
            str3 = new String("Discarding hit. ");
        }
        zzS(str3, str2);
    }

    public final void zzc(Map<String, String> map, String str) {
        String str2;
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (sb.length() > 0) {
                sb.append(CoreConstants.COMMA_CHAR);
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
        }
        String sb2 = sb.toString();
        if (str.length() != 0) {
            str2 = "Discarding hit. ".concat(str);
        } else {
            str2 = new String("Discarding hit. ");
        }
        zzS(str2, sb2);
    }

    @Override // com.google.android.gms.internal.gtm.zzbs
    protected final void zzd() {
        synchronized (zzfb.class) {
            zza = this;
        }
    }

    public final synchronized void zze(int i, String str, Object obj, Object obj2, Object obj3) {
        char c;
        try {
            gh8.j(str);
            if (zzw().zzb()) {
                zzw();
                c = 'C';
            } else {
                zzw();
                c = 'c';
            }
            char charAt = "01VDIWEA?".charAt(i);
            String str2 = zzbt.zza;
            String zzD = zzbr.zzD(str, zzf(obj), zzf(obj2), zzf(obj3));
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 4 + String.valueOf(zzD).length());
            sb.append("3");
            sb.append(charAt);
            sb.append(c);
            sb.append(str2);
            sb.append(":");
            sb.append(zzD);
            String sb2 = sb.toString();
            if (sb2.length() > 1024) {
                sb2 = sb2.substring(0, 1024);
            }
            zzfh zzp = zzt().zzp();
            if (zzp != null) {
                zzp.zze().zzc(sb2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
