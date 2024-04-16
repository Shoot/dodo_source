package defpackage;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* renamed from: f6d  reason: default package */
/* loaded from: classes2.dex */
public final class f6d implements c6d {
    private static final izc<Boolean> a;
    private static final izc<Boolean> b;
    private static final izc<Boolean> c;

    static {
        e0d e = new e0d(fzc.a("com.google.android.gms.measurement")).f().e();
        a = e.d("measurement.collection.event_safelist", true);
        b = e.d("measurement.service.store_null_safelist", true);
        c = e.d("measurement.service.store_safelist", true);
    }

    @Override // defpackage.c6d
    public final boolean b() {
        return b.b().booleanValue();
    }

    @Override // defpackage.c6d
    public final boolean c() {
        return c.b().booleanValue();
    }

    @Override // defpackage.c6d
    public final boolean zza() {
        return true;
    }
}
