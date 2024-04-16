package com.google.android.gms.internal.gtm;

import android.annotation.SuppressLint;
import android.content.Context;
/* compiled from: com.google.android.gms:play-services-analytics-impl@@17.0.1 */
@SuppressLint({"StaticFieldLeak"})
/* loaded from: classes2.dex */
public final class zzbv {
    private static volatile zzbv zza;
    private final Context zzb;
    private final Context zzc;
    private final t91 zzd;
    private final zzct zze;
    private final zzfb zzf;
    private final bad zzg;
    private final zzbq zzh;
    private final zzcy zzi;
    private final zzft zzj;
    private final zzfh zzk;
    private final og4 zzl;
    private final zzcn zzm;
    private final zzbi zzn;
    private final zzcf zzo;
    private final zzcx zzp;

    protected zzbv(zzbw zzbwVar) {
        Context zza2 = zzbwVar.zza();
        gh8.k(zza2, "Application context can't be null");
        Context zzb = zzbwVar.zzb();
        gh8.j(zzb);
        this.zzb = zza2;
        this.zzc = zzb;
        this.zzd = jp2.c();
        this.zze = new zzct(this);
        zzfb zzfbVar = new zzfb(this);
        zzfbVar.zzX();
        this.zzf = zzfbVar;
        zzfb zzm = zzm();
        String str = zzbt.zza;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 134);
        sb.append("Google Analytics ");
        sb.append(str);
        sb.append(" is starting up. To enable debug logging on a device run:\n  adb shell setprop log.tag.GAv4 DEBUG\n  adb logcat -s GAv4");
        zzm.zzM(sb.toString());
        zzfh zzfhVar = new zzfh(this);
        zzfhVar.zzX();
        this.zzk = zzfhVar;
        zzft zzftVar = new zzft(this);
        zzftVar.zzX();
        this.zzj = zzftVar;
        zzbq zzbqVar = new zzbq(this, zzbwVar);
        zzcn zzcnVar = new zzcn(this);
        zzbi zzbiVar = new zzbi(this);
        zzcf zzcfVar = new zzcf(this);
        zzcx zzcxVar = new zzcx(this);
        bad b = bad.b(zza2);
        b.j(new zzbu(this));
        this.zzg = b;
        og4 og4Var = new og4(this);
        zzcnVar.zzX();
        this.zzm = zzcnVar;
        zzbiVar.zzX();
        this.zzn = zzbiVar;
        zzcfVar.zzX();
        this.zzo = zzcfVar;
        zzcxVar.zzX();
        this.zzp = zzcxVar;
        zzcy zzcyVar = new zzcy(this);
        zzcyVar.zzX();
        this.zzi = zzcyVar;
        zzbqVar.zzX();
        this.zzh = zzbqVar;
        og4Var.l();
        this.zzl = og4Var;
        zzbqVar.zzm();
    }

    public static zzbv zzg(Context context) {
        gh8.j(context);
        if (zza == null) {
            synchronized (zzbv.class) {
                try {
                    if (zza == null) {
                        t91 c = jp2.c();
                        long b = c.b();
                        zzbv zzbvVar = new zzbv(new zzbw(context));
                        zza = zzbvVar;
                        og4.k();
                        long b2 = c.b() - b;
                        long longValue = zzeu.zzQ.zzb().longValue();
                        if (b2 > longValue) {
                            zzbvVar.zzm().zzT("Slow initialization (ms)", Long.valueOf(b2), Long.valueOf(longValue));
                        }
                    }
                } finally {
                }
            }
        }
        return zza;
    }

    private static final void zzs(zzbs zzbsVar) {
        gh8.k(zzbsVar, "Analytics service not created/initialized");
        gh8.b(zzbsVar.zzY(), "Analytics service not initialized");
    }

    public final Context zza() {
        return this.zzb;
    }

    public final Context zzb() {
        return this.zzc;
    }

    public final og4 zzc() {
        gh8.j(this.zzl);
        gh8.b(this.zzl.m(), "Analytics instance not initialized");
        return this.zzl;
    }

    public final bad zzd() {
        gh8.j(this.zzg);
        return this.zzg;
    }

    public final zzbi zze() {
        zzs(this.zzn);
        return this.zzn;
    }

    public final zzbq zzf() {
        zzs(this.zzh);
        return this.zzh;
    }

    public final zzcf zzh() {
        zzs(this.zzo);
        return this.zzo;
    }

    public final zzcn zzi() {
        zzs(this.zzm);
        return this.zzm;
    }

    public final zzct zzj() {
        return this.zze;
    }

    public final zzcx zzk() {
        return this.zzp;
    }

    public final zzcy zzl() {
        zzs(this.zzi);
        return this.zzi;
    }

    public final zzfb zzm() {
        zzs(this.zzf);
        return this.zzf;
    }

    public final zzfb zzn() {
        return this.zzf;
    }

    public final zzfh zzo() {
        zzs(this.zzk);
        return this.zzk;
    }

    public final zzfh zzp() {
        zzfh zzfhVar = this.zzk;
        if (zzfhVar != null && zzfhVar.zzY()) {
            return this.zzk;
        }
        return null;
    }

    public final zzft zzq() {
        zzs(this.zzj);
        return this.zzj;
    }

    public final t91 zzr() {
        return this.zzd;
    }
}
