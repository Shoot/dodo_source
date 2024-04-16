package defpackage;
/* compiled from: InfrastructureModule_ProvideSystemTimeProviderFactory.java */
/* renamed from: h25  reason: default package */
/* loaded from: classes3.dex */
public final class h25 implements no3<f5b> {
    private final m15 a;
    private final as8<sgb> b;
    private final as8<ida> c;

    public h25(m15 m15Var, as8<sgb> as8Var, as8<ida> as8Var2) {
        this.a = m15Var;
        this.b = as8Var;
        this.c = as8Var2;
    }

    public static h25 a(m15 m15Var, as8<sgb> as8Var, as8<ida> as8Var2) {
        return new h25(m15Var, as8Var, as8Var2);
    }

    public static f5b c(m15 m15Var, sgb sgbVar, ida idaVar) {
        return (f5b) jh8.e(m15Var.x(sgbVar, idaVar));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public f5b get() {
        return c(this.a, this.b.get(), this.c.get());
    }
}
