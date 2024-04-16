package defpackage;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* renamed from: u8d  reason: default package */
/* loaded from: classes2.dex */
public final class u8d implements r8d {
    private static final izc<Boolean> a;
    private static final izc<Boolean> b;
    private static final izc<Boolean> c;
    private static final izc<Boolean> d;

    static {
        e0d e = new e0d(fzc.a("com.google.android.gms.measurement")).f().e();
        a = e.d("measurement.collection.enable_session_stitching_token.client.dev", true);
        b = e.d("measurement.collection.enable_session_stitching_token.first_open_fix", true);
        c = e.d("measurement.session_stitching_token_enabled", false);
        d = e.d("measurement.link_sst_to_sid", true);
    }

    @Override // defpackage.r8d
    public final boolean b() {
        return a.b().booleanValue();
    }

    @Override // defpackage.r8d
    public final boolean c() {
        return b.b().booleanValue();
    }

    @Override // defpackage.r8d
    public final boolean d() {
        return c.b().booleanValue();
    }

    @Override // defpackage.r8d
    public final boolean zza() {
        return true;
    }
}
