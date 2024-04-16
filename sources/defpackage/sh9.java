package defpackage;
/* compiled from: RepositoryModule_ProvidePromoActionProviderFactory.java */
/* renamed from: sh9  reason: default package */
/* loaded from: classes3.dex */
public final class sh9 implements no3<bq> {
    private final tg9 a;
    private final as8<k63> b;
    private final as8<o63> c;

    public sh9(tg9 tg9Var, as8<k63> as8Var, as8<o63> as8Var2) {
        this.a = tg9Var;
        this.b = as8Var;
        this.c = as8Var2;
    }

    public static sh9 a(tg9 tg9Var, as8<k63> as8Var, as8<o63> as8Var2) {
        return new sh9(tg9Var, as8Var, as8Var2);
    }

    public static bq c(tg9 tg9Var, k63 k63Var, o63 o63Var) {
        return (bq) jh8.e(tg9Var.y(k63Var, o63Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public bq get() {
        return c(this.a, this.b.get(), this.c.get());
    }
}
