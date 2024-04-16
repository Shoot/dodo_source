package defpackage;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* renamed from: i7d  reason: default package */
/* loaded from: classes2.dex */
public final class i7d implements j7d {
    private static final izc<Boolean> a;
    private static final izc<Long> b;

    static {
        e0d e = new e0d(fzc.a("com.google.android.gms.measurement")).f().e();
        a = e.d("measurement.increase_param_lengths", false);
        b = e.b("measurement.id.increase_param_lengths", 0L);
    }

    @Override // defpackage.j7d
    public final boolean b() {
        return a.b().booleanValue();
    }

    @Override // defpackage.j7d
    public final boolean zza() {
        return true;
    }
}
