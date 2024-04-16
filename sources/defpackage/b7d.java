package defpackage;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* renamed from: b7d  reason: default package */
/* loaded from: classes2.dex */
public final class b7d implements y6d {
    private static final izc<Boolean> a;
    private static final izc<Boolean> b;
    private static final izc<Boolean> c;

    static {
        e0d e = new e0d(fzc.a("com.google.android.gms.measurement")).f().e();
        a = e.d("measurement.client.sessions.check_on_reset_and_enable2", true);
        b = e.d("measurement.client.sessions.check_on_startup", true);
        c = e.d("measurement.client.sessions.start_session_before_view_screen", true);
    }

    @Override // defpackage.y6d
    public final boolean b() {
        return a.b().booleanValue();
    }

    @Override // defpackage.y6d
    public final boolean zza() {
        return true;
    }
}
