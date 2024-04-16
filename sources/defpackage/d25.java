package defpackage;
/* compiled from: InfrastructureModule_ProvideRemoteConfigFactory.java */
/* renamed from: d25  reason: default package */
/* loaded from: classes3.dex */
public final class d25 implements no3<zc9> {
    private final m15 a;
    private final as8<mh0> b;

    public d25(m15 m15Var, as8<mh0> as8Var) {
        this.a = m15Var;
        this.b = as8Var;
    }

    public static d25 a(m15 m15Var, as8<mh0> as8Var) {
        return new d25(m15Var, as8Var);
    }

    public static zc9 c(m15 m15Var, mh0 mh0Var) {
        return (zc9) jh8.e(m15Var.t(mh0Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public zc9 get() {
        return c(this.a, this.b.get());
    }
}
