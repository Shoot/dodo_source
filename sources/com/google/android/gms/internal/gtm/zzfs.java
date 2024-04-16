package com.google.android.gms.internal.gtm;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import ch.qos.logback.classic.spi.CallerData;
import java.net.URI;
import java.net.URISyntaxException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-analytics-impl@@17.0.1 */
/* loaded from: classes2.dex */
public final class zzfs {
    public static long zza(String str) {
        if (str == null) {
            return 0L;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return 0L;
        }
    }

    public static zzaw zzb(zzfb zzfbVar, String str) {
        String str2;
        gh8.j(zzfbVar);
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        new HashMap();
        try {
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str2 = CallerData.NA.concat(valueOf);
            } else {
                str2 = new String(CallerData.NA);
            }
            Map<String, String> a = vq4.a(new URI(str2), "UTF-8");
            zzaw zzawVar = new zzaw();
            zzawVar.zzp(a.get("utm_content"));
            zzawVar.zzu(a.get("utm_medium"));
            zzawVar.zzv(a.get("utm_campaign"));
            zzawVar.zzw(a.get("utm_source"));
            zzawVar.zzt(a.get("utm_term"));
            zzawVar.zzs(a.get("utm_id"));
            zzawVar.zzo(a.get("anid"));
            zzawVar.zzr(a.get("gclid"));
            zzawVar.zzq(a.get("dclid"));
            zzawVar.zzn(a.get("aclid"));
            return zzawVar;
        } catch (URISyntaxException e) {
            zzfbVar.zzS("No valid campaign data found", e);
            return null;
        }
    }

    public static String zzd(Locale locale) {
        if (locale == null) {
            return null;
        }
        String language = locale.getLanguage();
        if (TextUtils.isEmpty(language)) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(language.toLowerCase(locale));
        if (!TextUtils.isEmpty(locale.getCountry())) {
            sb.append("-");
            sb.append(locale.getCountry().toLowerCase(locale));
        }
        return sb.toString();
    }

    public static MessageDigest zze(String str) {
        MessageDigest messageDigest;
        for (int i = 0; i < 2; i++) {
            try {
                messageDigest = MessageDigest.getInstance("MD5");
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                return messageDigest;
            }
        }
        return null;
    }

    public static void zzg(Map<String, String> map, String str, String str2) {
        if (str2 != null && !map.containsKey(str)) {
            map.put(str, str2);
        }
    }

    public static boolean zzi(Context context, String str, boolean z) {
        try {
            ActivityInfo receiverInfo = context.getPackageManager().getReceiverInfo(new ComponentName(context, str), 0);
            if (receiverInfo != null && receiverInfo.enabled) {
                if (z) {
                    if (receiverInfo.exported) {
                        return true;
                    }
                } else {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    public static boolean zzj(double d, String str) {
        int i;
        if (d > 0.0d && d < 100.0d) {
            if (!TextUtils.isEmpty(str)) {
                i = 0;
                for (int length = str.length() - 1; length >= 0; length--) {
                    char charAt = str.charAt(length);
                    i = ((i << 6) & 268435455) + charAt + (charAt << 14);
                    int i2 = i >> 21;
                    if ((266338304 & i) != 0) {
                        i ^= i2 & 127;
                    }
                }
            } else {
                i = 1;
            }
            if (i % 10000 >= d * 100.0d) {
                return true;
            }
        }
        return false;
    }
}
