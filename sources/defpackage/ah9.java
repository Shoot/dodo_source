package defpackage;
/* compiled from: RepositoryModule_ProvideCustomerSettingsFactory.java */
/* renamed from: ah9  reason: default package */
/* loaded from: classes3.dex */
public final class ah9 implements no3<v52> {
    private final tg9 a;
    private final as8<ci8> b;

    public ah9(tg9 tg9Var, as8<ci8> as8Var) {
        this.a = tg9Var;
        this.b = as8Var;
    }

    public static ah9 a(tg9 tg9Var, as8<ci8> as8Var) {
        return new ah9(tg9Var, as8Var);
    }

    public static v52 c(tg9 tg9Var, ci8 ci8Var) {
        return (v52) jh8.e(tg9Var.g(ci8Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public v52 get() {
        return c(this.a, this.b.get());
    }
}
