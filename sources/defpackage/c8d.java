package defpackage;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* renamed from: c8d  reason: default package */
/* loaded from: classes2.dex */
public final class c8d implements z7d {
    private static final izc<Boolean> a;
    private static final izc<Double> b;
    private static final izc<Long> c;
    private static final izc<Long> d;
    private static final izc<String> e;

    static {
        e0d e2 = new e0d(fzc.a("com.google.android.gms.measurement")).f().e();
        a = e2.d("measurement.test.boolean_flag", false);
        b = e2.a("measurement.test.double_flag", -3.0d);
        c = e2.b("measurement.test.int_flag", -2L);
        d = e2.b("measurement.test.long_flag", -1L);
        e = e2.c("measurement.test.string_flag", "---");
    }

    @Override // defpackage.z7d
    public final long b() {
        return c.b().longValue();
    }

    @Override // defpackage.z7d
    public final long c() {
        return d.b().longValue();
    }

    @Override // defpackage.z7d
    public final String d() {
        return e.b();
    }

    @Override // defpackage.z7d
    public final boolean f() {
        return a.b().booleanValue();
    }

    @Override // defpackage.z7d
    public final double zza() {
        return b.b().doubleValue();
    }
}
