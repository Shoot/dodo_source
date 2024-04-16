package defpackage;
/* compiled from: InfrastructureModule_ProvideKustoAnalyticLocalityResolverFactory.java */
/* renamed from: z15  reason: default package */
/* loaded from: classes3.dex */
public final class z15 implements no3<nh5> {
    private final m15 a;
    private final as8<jv5> b;

    public z15(m15 m15Var, as8<jv5> as8Var) {
        this.a = m15Var;
        this.b = as8Var;
    }

    public static z15 a(m15 m15Var, as8<jv5> as8Var) {
        return new z15(m15Var, as8Var);
    }

    public static nh5 c(m15 m15Var, jv5 jv5Var) {
        return (nh5) jh8.e(m15Var.p(jv5Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public nh5 get() {
        return c(this.a, this.b.get());
    }
}
