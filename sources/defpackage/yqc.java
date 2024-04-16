package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.gtm.zzav;
import com.google.android.gms.internal.gtm.zzbe;
import com.google.android.gms.internal.gtm.zzbr;
import com.google.android.gms.internal.gtm.zzbt;
import com.google.android.gms.internal.gtm.zzbv;
import com.google.android.gms.internal.gtm.zzbx;
import com.google.android.gms.internal.gtm.zzex;
import com.google.android.gms.internal.gtm.zzfs;
import com.huawei.hms.framework.common.ContainerUtils;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-analytics-impl@@17.0.1 */
/* renamed from: yqc  reason: default package */
/* loaded from: classes2.dex */
public final class yqc extends zzbr implements rad {
    private static DecimalFormat d;
    private final zzbv a;
    private final String b;
    private final Uri c;

    public yqc(zzbv zzbvVar, String str) {
        super(zzbvVar);
        gh8.f(str);
        this.a = zzbvVar;
        this.b = str;
        this.c = c(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Uri c(String str) {
        gh8.f(str);
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("uri");
        builder.authority("google-analytics.com");
        builder.path(str);
        return builder.build();
    }

    static String e(double d2) {
        if (d == null) {
            d = new DecimalFormat("0.######");
        }
        return d.format(d2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003c, code lost:
        if (android.text.TextUtils.isEmpty(r6) != false) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0067 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x001e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Map<java.lang.String, java.lang.String> i(defpackage.a0d r12) {
        /*
            Method dump skipped, instructions count: 851
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yqc.i(a0d):java.util.Map");
    }

    private static void j(Map<String, String> map, String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            map.put(str, str2);
        }
    }

    private static void k(Map<String, String> map, String str, boolean z) {
        if (z) {
            map.put(str, "1");
        }
    }

    @Override // defpackage.rad
    public final void a(a0d a0dVar) {
        gh8.j(a0dVar);
        gh8.b(a0dVar.m(), "Can't deliver not submitted measurement");
        gh8.i("deliver should be called on worker thread");
        a0d a0dVar2 = new a0d(a0dVar);
        zzbe zzbeVar = (zzbe) a0dVar2.b(zzbe.class);
        if (TextUtils.isEmpty(zzbeVar.zzf())) {
            zzz().zzc(i(a0dVar2), "Ignoring measurement without type");
        } else if (TextUtils.isEmpty(zzbeVar.zze())) {
            zzz().zzc(i(a0dVar2), "Ignoring measurement without client id");
        } else if (!this.a.zzc().h()) {
            if (zzfs.zzj(0.0d, zzbeVar.zze())) {
                zzG("Sampling enabled. Hit sampled out. sampling rate", Double.valueOf(0.0d));
                return;
            }
            Map<String, String> i = i(a0dVar2);
            i.put("v", "1");
            i.put("_v", zzbt.zzb);
            i.put("tid", this.b);
            if (this.a.zzc().i()) {
                StringBuilder sb = new StringBuilder();
                for (Map.Entry<String, String> entry : i.entrySet()) {
                    if (sb.length() != 0) {
                        sb.append(", ");
                    }
                    sb.append(entry.getKey());
                    sb.append(ContainerUtils.KEY_VALUE_DELIMITER);
                    sb.append(entry.getValue());
                }
                zzN("Dry run is enabled. GoogleAnalytics would have sent", sb.toString());
                return;
            }
            HashMap hashMap = new HashMap();
            zzfs.zzg(hashMap, "uid", zzbeVar.zzg());
            zzav zzavVar = (zzav) a0dVar.c(zzav.class);
            if (zzavVar != null) {
                zzfs.zzg(hashMap, "an", zzavVar.zzf());
                zzfs.zzg(hashMap, "aid", zzavVar.zzd());
                zzfs.zzg(hashMap, "av", zzavVar.zzg());
                zzfs.zzg(hashMap, "aiid", zzavVar.zze());
            }
            i.put("_s", String.valueOf(zzs().zza(new zzbx(0L, zzbeVar.zze(), this.b, !TextUtils.isEmpty(zzbeVar.zzd()), 0L, hashMap))));
            zzs().zzh(new zzex(zzz(), i, a0dVar.a(), true));
        }
    }

    @Override // defpackage.rad
    public final Uri b() {
        return this.c;
    }
}
