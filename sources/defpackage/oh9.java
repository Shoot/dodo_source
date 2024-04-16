package defpackage;
/* compiled from: RepositoryModule_ProvidePersonalOfferRepositoryFactory.java */
/* renamed from: oh9  reason: default package */
/* loaded from: classes3.dex */
public final class oh9 implements no3<h08> {
    private final tg9 a;
    private final as8<ml0> b;

    public oh9(tg9 tg9Var, as8<ml0> as8Var) {
        this.a = tg9Var;
        this.b = as8Var;
    }

    public static oh9 a(tg9 tg9Var, as8<ml0> as8Var) {
        return new oh9(tg9Var, as8Var);
    }

    public static h08 c(tg9 tg9Var, ml0 ml0Var) {
        return (h08) jh8.e(tg9Var.u(ml0Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public h08 get() {
        return c(this.a, this.b.get());
    }
}
