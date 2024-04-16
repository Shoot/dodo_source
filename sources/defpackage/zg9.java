package defpackage;
/* compiled from: RepositoryModule_ProvideCustomerRepositoryFactory.java */
/* renamed from: zg9  reason: default package */
/* loaded from: classes3.dex */
public final class zg9 implements no3<n52> {
    private final tg9 a;
    private final as8<ci8> b;

    public zg9(tg9 tg9Var, as8<ci8> as8Var) {
        this.a = tg9Var;
        this.b = as8Var;
    }

    public static zg9 a(tg9 tg9Var, as8<ci8> as8Var) {
        return new zg9(tg9Var, as8Var);
    }

    public static n52 c(tg9 tg9Var, ci8 ci8Var) {
        return (n52) jh8.e(tg9Var.f(ci8Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public n52 get() {
        return c(this.a, this.b.get());
    }
}
