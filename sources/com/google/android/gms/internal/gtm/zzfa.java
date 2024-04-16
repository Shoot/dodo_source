package com.google.android.gms.internal.gtm;

import android.annotation.SuppressLint;
import android.util.Log;
/* compiled from: com.google.android.gms:play-services-analytics-impl@@17.0.1 */
@Deprecated
/* loaded from: classes2.dex */
public final class zzfa {
    private static volatile px5 zza = new zzcu();

    @SuppressLint({"LogTagMismatch"})
    public static void zzb(String str, Object obj) {
        String str2;
        zzfb zza2 = zzfb.zza();
        if (zza2 != null) {
            zza2.zzK(str, obj);
        } else if (zzf(3)) {
            if (obj != null) {
                String str3 = (String) obj;
                StringBuilder sb = new StringBuilder(str.length() + 1 + str3.length());
                sb.append(str);
                sb.append(":");
                sb.append(str3);
                str2 = sb.toString();
            } else {
                str2 = str;
            }
            Log.e(zzeu.zzc.zzb(), str2);
        }
        px5 px5Var = zza;
        if (px5Var != null) {
            px5Var.error(str);
        }
    }

    public static boolean zzf(int i) {
        if (zza == null || zza.getLogLevel() > i) {
            return false;
        }
        return true;
    }
}
