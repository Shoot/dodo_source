package defpackage;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* renamed from: c7d  reason: default package */
/* loaded from: classes2.dex */
public final class c7d implements d7d {
    private static final izc<Boolean> a;
    private static final izc<Boolean> b;
    private static final izc<Long> c;

    static {
        e0d e = new e0d(fzc.a("com.google.android.gms.measurement")).f().e();
        a = e.d("measurement.gbraid_campaign.gbraid.client.dev", false);
        b = e.d("measurement.gbraid_campaign.gbraid.service", false);
        c = e.b("measurement.id.gbraid_campaign.service", 0L);
    }

    @Override // defpackage.d7d
    public final boolean b() {
        return a.b().booleanValue();
    }

    @Override // defpackage.d7d
    public final boolean c() {
        return b.b().booleanValue();
    }

    @Override // defpackage.d7d
    public final boolean zza() {
        return true;
    }
}
