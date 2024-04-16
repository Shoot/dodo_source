package defpackage;
/* compiled from: InfrastructureModule_ProvideAnalyticsFactoryFactory.java */
/* renamed from: o15  reason: default package */
/* loaded from: classes3.dex */
public final class o15 implements no3<wc> {
    private final m15 a;
    private final as8<xc> b;

    public o15(m15 m15Var, as8<xc> as8Var) {
        this.a = m15Var;
        this.b = as8Var;
    }

    public static o15 a(m15 m15Var, as8<xc> as8Var) {
        return new o15(m15Var, as8Var);
    }

    public static wc c(m15 m15Var, xc xcVar) {
        return (wc) jh8.e(m15Var.e(xcVar));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public wc get() {
        return c(this.a, this.b.get());
    }
}
