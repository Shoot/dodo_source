package defpackage;
/* compiled from: InfrastructureModule_ProvideAnalyticsFactory.java */
/* renamed from: n15  reason: default package */
/* loaded from: classes3.dex */
public final class n15 implements no3<gc> {
    private final m15 a;
    private final as8<wc> b;
    private final as8<hq3> c;

    public n15(m15 m15Var, as8<wc> as8Var, as8<hq3> as8Var2) {
        this.a = m15Var;
        this.b = as8Var;
        this.c = as8Var2;
    }

    public static n15 a(m15 m15Var, as8<wc> as8Var, as8<hq3> as8Var2) {
        return new n15(m15Var, as8Var, as8Var2);
    }

    public static gc c(m15 m15Var, wc wcVar, hq3 hq3Var) {
        return (gc) jh8.e(m15Var.d(wcVar, hq3Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public gc get() {
        return c(this.a, this.b.get(), this.c.get());
    }
}
