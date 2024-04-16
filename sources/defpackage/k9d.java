package defpackage;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* renamed from: k9d  reason: default package */
/* loaded from: classes2.dex */
public final class k9d implements l9d {
    private static final izc<Boolean> a;
    private static final izc<Boolean> b;
    private static final izc<Boolean> c;

    static {
        e0d e = new e0d(fzc.a("com.google.android.gms.measurement")).f().e();
        a = e.d("measurement.sgtm.client.dev", false);
        b = e.d("measurement.sgtm.preview_mode_enabled.dev", false);
        c = e.d("measurement.sgtm.service", false);
    }

    @Override // defpackage.l9d
    public final boolean b() {
        return a.b().booleanValue();
    }

    @Override // defpackage.l9d
    public final boolean c() {
        return b.b().booleanValue();
    }

    @Override // defpackage.l9d
    public final boolean d() {
        return c.b().booleanValue();
    }

    @Override // defpackage.l9d
    public final boolean zza() {
        return true;
    }
}
