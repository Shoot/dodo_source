package defpackage;
/* compiled from: InfrastructureModule_ProvideAppResourceLocalesFactoryFactory.java */
/* renamed from: q15  reason: default package */
/* loaded from: classes3.dex */
public final class q15 implements no3<jo> {
    private final m15 a;
    private final as8<ko> b;

    public q15(m15 m15Var, as8<ko> as8Var) {
        this.a = m15Var;
        this.b = as8Var;
    }

    public static q15 a(m15 m15Var, as8<ko> as8Var) {
        return new q15(m15Var, as8Var);
    }

    public static jo c(m15 m15Var, ko koVar) {
        return (jo) jh8.e(m15Var.g(koVar));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public jo get() {
        return c(this.a, this.b.get());
    }
}
