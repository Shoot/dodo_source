package defpackage;
/* compiled from: InfrastructureModule_ProvideTraceFactoryFactory.java */
/* renamed from: j25  reason: default package */
/* loaded from: classes3.dex */
public final class j25 implements no3<vjb> {
    private final m15 a;
    private final as8<oh5> b;

    public j25(m15 m15Var, as8<oh5> as8Var) {
        this.a = m15Var;
        this.b = as8Var;
    }

    public static j25 a(m15 m15Var, as8<oh5> as8Var) {
        return new j25(m15Var, as8Var);
    }

    public static vjb c(m15 m15Var, oh5 oh5Var) {
        return (vjb) jh8.e(m15Var.z(oh5Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public vjb get() {
        return c(this.a, this.b.get());
    }
}
