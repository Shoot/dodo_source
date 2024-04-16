package defpackage;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* renamed from: o8d  reason: default package */
/* loaded from: classes2.dex */
public final class o8d implements l8d {
    private static final izc<Boolean> a;
    private static final izc<Long> b;

    static {
        e0d e = new e0d(fzc.a("com.google.android.gms.measurement")).f().e();
        a = e.d("measurement.remove_app_background.client", false);
        b = e.b("measurement.id.remove_app_background.client", 0L);
    }

    @Override // defpackage.l8d
    public final boolean b() {
        return a.b().booleanValue();
    }

    @Override // defpackage.l8d
    public final boolean zza() {
        return true;
    }
}
