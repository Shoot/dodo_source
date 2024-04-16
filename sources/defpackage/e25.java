package defpackage;
/* compiled from: InfrastructureModule_ProvideRemoteToggleServiceFactory.java */
/* renamed from: e25  reason: default package */
/* loaded from: classes3.dex */
public final class e25 implements no3<ld9> {
    private final m15 a;
    private final as8<zc9> b;
    private final as8<yjb> c;
    private final as8<mh0> d;

    public e25(m15 m15Var, as8<zc9> as8Var, as8<yjb> as8Var2, as8<mh0> as8Var3) {
        this.a = m15Var;
        this.b = as8Var;
        this.c = as8Var2;
        this.d = as8Var3;
    }

    public static e25 a(m15 m15Var, as8<zc9> as8Var, as8<yjb> as8Var2, as8<mh0> as8Var3) {
        return new e25(m15Var, as8Var, as8Var2, as8Var3);
    }

    public static ld9 c(m15 m15Var, zc9 zc9Var, yjb yjbVar, mh0 mh0Var) {
        return (ld9) jh8.e(m15Var.u(zc9Var, yjbVar, mh0Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public ld9 get() {
        return c(this.a, this.b.get(), this.c.get(), this.d.get());
    }
}
