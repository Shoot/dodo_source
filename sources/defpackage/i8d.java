package defpackage;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* renamed from: i8d  reason: default package */
/* loaded from: classes2.dex */
public final class i8d implements f8d {
    private static final izc<Boolean> a;
    private static final izc<Boolean> b;
    private static final izc<Boolean> c;
    private static final izc<Boolean> d;
    private static final izc<Boolean> e;
    private static final izc<Boolean> f;
    private static final izc<Long> g;

    static {
        e0d e2 = new e0d(fzc.a("com.google.android.gms.measurement")).f().e();
        a = e2.d("measurement.rb.attribution.client2", true);
        b = e2.d("measurement.rb.attribution.dma_fix", false);
        c = e2.d("measurement.rb.attribution.followup1.service", false);
        d = e2.d("measurement.rb.attribution.service", true);
        e = e2.d("measurement.rb.attribution.enable_trigger_redaction", true);
        f = e2.d("measurement.rb.attribution.uuid_generation", true);
        g = e2.b("measurement.id.rb.attribution.dma_fix", 0L);
    }

    @Override // defpackage.f8d
    public final boolean a() {
        return f.b().booleanValue();
    }

    @Override // defpackage.f8d
    public final boolean b() {
        return a.b().booleanValue();
    }

    @Override // defpackage.f8d
    public final boolean c() {
        return b.b().booleanValue();
    }

    @Override // defpackage.f8d
    public final boolean d() {
        return c.b().booleanValue();
    }

    @Override // defpackage.f8d
    public final boolean f() {
        return d.b().booleanValue();
    }

    @Override // defpackage.f8d
    public final boolean g() {
        return e.b().booleanValue();
    }

    @Override // defpackage.f8d
    public final boolean zza() {
        return true;
    }
}
