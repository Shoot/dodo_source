package defpackage;
/* compiled from: RepositoryModule_ProvideCartRepoFactory.java */
/* renamed from: wg9  reason: default package */
/* loaded from: classes3.dex */
public final class wg9 implements no3<cs0> {
    private final tg9 a;
    private final as8<v53> b;

    public wg9(tg9 tg9Var, as8<v53> as8Var) {
        this.a = tg9Var;
        this.b = as8Var;
    }

    public static wg9 a(tg9 tg9Var, as8<v53> as8Var) {
        return new wg9(tg9Var, as8Var);
    }

    public static cs0 c(tg9 tg9Var, v53 v53Var) {
        return (cs0) jh8.e(tg9Var.c(v53Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public cs0 get() {
        return c(this.a, this.b.get());
    }
}
