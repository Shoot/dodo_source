package defpackage;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* renamed from: a6d  reason: default package */
/* loaded from: classes2.dex */
public final class a6d implements b6d {
    private static final izc<Boolean> a;
    private static final izc<Boolean> b;
    private static final izc<Boolean> c;
    private static final izc<Boolean> d;
    private static final izc<Boolean> e;
    private static final izc<Boolean> f;
    private static final izc<Long> g;

    static {
        e0d e2 = new e0d(fzc.a("com.google.android.gms.measurement")).f().e();
        a = e2.d("measurement.dma_consent.client", true);
        b = e2.d("measurement.dma_consent.client_bow_check2", false);
        c = e2.d("measurement.dma_consent.service", true);
        d = e2.d("measurement.dma_consent.service_gcs_v2", false);
        e = e2.d("measurement.dma_consent.service_npa_remote_default", false);
        f = e2.d("measurement.dma_consent.service_split_batch_on_consent", true);
        g = e2.b("measurement.id.dma_consent.service", 0L);
    }

    @Override // defpackage.b6d
    public final boolean a() {
        return f.b().booleanValue();
    }

    @Override // defpackage.b6d
    public final boolean b() {
        return a.b().booleanValue();
    }

    @Override // defpackage.b6d
    public final boolean c() {
        return b.b().booleanValue();
    }

    @Override // defpackage.b6d
    public final boolean d() {
        return c.b().booleanValue();
    }

    @Override // defpackage.b6d
    public final boolean f() {
        return d.b().booleanValue();
    }

    @Override // defpackage.b6d
    public final boolean g() {
        return e.b().booleanValue();
    }

    @Override // defpackage.b6d
    public final boolean zza() {
        return true;
    }
}
