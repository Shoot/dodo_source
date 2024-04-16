package defpackage;
/* compiled from: InfrastructureModule_ProvideTracesFactory.java */
/* renamed from: k25  reason: default package */
/* loaded from: classes3.dex */
public final class k25 implements no3<yjb> {
    private final m15 a;
    private final as8<vjb> b;

    public k25(m15 m15Var, as8<vjb> as8Var) {
        this.a = m15Var;
        this.b = as8Var;
    }

    public static k25 a(m15 m15Var, as8<vjb> as8Var) {
        return new k25(m15Var, as8Var);
    }

    public static yjb c(m15 m15Var, vjb vjbVar) {
        return (yjb) jh8.e(m15Var.A(vjbVar));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public yjb get() {
        return c(this.a, this.b.get());
    }
}
