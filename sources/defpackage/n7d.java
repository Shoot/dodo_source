package defpackage;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* renamed from: n7d  reason: default package */
/* loaded from: classes2.dex */
public final class n7d implements k7d {
    private static final izc<Boolean> a;
    private static final izc<Boolean> b;
    private static final izc<Long> c;

    static {
        e0d e = new e0d(fzc.a("com.google.android.gms.measurement")).f().e();
        a = e.d("measurement.item_scoped_custom_parameters.client", true);
        b = e.d("measurement.item_scoped_custom_parameters.service", false);
        c = e.b("measurement.id.item_scoped_custom_parameters.service", 0L);
    }

    @Override // defpackage.k7d
    public final boolean b() {
        return a.b().booleanValue();
    }

    @Override // defpackage.k7d
    public final boolean c() {
        return b.b().booleanValue();
    }

    @Override // defpackage.k7d
    public final boolean zza() {
        return true;
    }
}
