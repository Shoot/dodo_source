package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.gtm.zzbe;
import com.google.android.gms.internal.gtm.zzbi;
import com.google.android.gms.internal.gtm.zzbv;
import java.util.ListIterator;
/* compiled from: com.google.android.gms:play-services-analytics-impl@@17.0.1 */
/* renamed from: hmc  reason: default package */
/* loaded from: classes2.dex */
public class hmc extends c3d<hmc> {
    private final zzbv d;
    private boolean e;

    public hmc(zzbv zzbvVar) {
        super(zzbvVar.zzd(), zzbvVar.zzr());
        this.d = zzbvVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.c3d
    public final void a(a0d a0dVar) {
        zzbe zzbeVar = (zzbe) a0dVar.b(zzbe.class);
        if (TextUtils.isEmpty(zzbeVar.zze())) {
            zzbeVar.zzj(this.d.zzi().zzb());
        }
        if (this.e && TextUtils.isEmpty(zzbeVar.zzd())) {
            zzbi zze = this.d.zze();
            zzbeVar.zzi(zze.zza());
            zzbeVar.zzh(zze.zzb());
        }
    }

    public final a0d d() {
        a0d a0dVar = new a0d(this.b);
        a0dVar.g(this.d.zzh().zza());
        a0dVar.g(this.d.zzk().zza());
        c(a0dVar);
        return a0dVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzbv e() {
        return this.d;
    }

    public final void f(String str) {
        gh8.f(str);
        Uri c = yqc.c(str);
        ListIterator<rad> listIterator = this.b.f().listIterator();
        while (listIterator.hasNext()) {
            if (c.equals(listIterator.next().b())) {
                listIterator.remove();
            }
        }
        this.b.f().add(new yqc(this.d, str));
    }

    public final void g(boolean z) {
        this.e = z;
    }
}
