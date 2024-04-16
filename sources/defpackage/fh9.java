package defpackage;
/* compiled from: RepositoryModule_ProvideFavoriteProductRepositoryFactory.java */
/* renamed from: fh9  reason: default package */
/* loaded from: classes3.dex */
public final class fh9 implements no3<jp3> {
    private final tg9 a;
    private final as8<ml0> b;

    public fh9(tg9 tg9Var, as8<ml0> as8Var) {
        this.a = tg9Var;
        this.b = as8Var;
    }

    public static fh9 a(tg9 tg9Var, as8<ml0> as8Var) {
        return new fh9(tg9Var, as8Var);
    }

    public static jp3 c(tg9 tg9Var, ml0 ml0Var) {
        return (jp3) jh8.e(tg9Var.l(ml0Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public jp3 get() {
        return c(this.a, this.b.get());
    }
}
