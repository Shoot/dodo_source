package defpackage;
/* compiled from: RepositoryModule_ProvideCoinsExpirationsRepositoryFactory.java */
/* renamed from: yg9  reason: default package */
/* loaded from: classes3.dex */
public final class yg9 implements no3<bb1> {
    private final tg9 a;
    private final as8<ml0> b;

    public yg9(tg9 tg9Var, as8<ml0> as8Var) {
        this.a = tg9Var;
        this.b = as8Var;
    }

    public static yg9 a(tg9 tg9Var, as8<ml0> as8Var) {
        return new yg9(tg9Var, as8Var);
    }

    public static bb1 c(tg9 tg9Var, ml0 ml0Var) {
        return (bb1) jh8.e(tg9Var.e(ml0Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public bb1 get() {
        return c(this.a, this.b.get());
    }
}
