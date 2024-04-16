package defpackage;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* renamed from: v8d  reason: default package */
/* loaded from: classes2.dex */
public final class v8d implements w8d {
    private static final izc<Boolean> a;
    private static final izc<Boolean> b;
    private static final izc<Boolean> c;
    private static final izc<Boolean> d;
    private static final izc<Boolean> e;
    private static final izc<Long> f;

    static {
        e0d e2 = new e0d(fzc.a("com.google.android.gms.measurement")).f().e();
        a = e2.d("measurement.client.sessions.background_sessions_enabled", true);
        b = e2.d("measurement.client.sessions.enable_fix_background_engagement", false);
        c = e2.d("measurement.client.sessions.immediate_start_enabled_foreground", true);
        d = e2.d("measurement.client.sessions.remove_expired_session_properties_enabled", true);
        e = e2.d("measurement.client.sessions.session_id_enabled", true);
        f = e2.b("measurement.id.client.sessions.enable_fix_background_engagement", 0L);
    }

    @Override // defpackage.w8d
    public final boolean zza() {
        return b.b().booleanValue();
    }
}
