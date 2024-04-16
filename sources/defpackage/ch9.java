package defpackage;
/* compiled from: RepositoryModule_ProvideDodoDomainStateFactory.java */
/* renamed from: ch9  reason: default package */
/* loaded from: classes3.dex */
public final class ch9 implements no3<v53> {
    private final tg9 a;
    private final as8<jv5> b;
    private final as8<g00> c;

    public ch9(tg9 tg9Var, as8<jv5> as8Var, as8<g00> as8Var2) {
        this.a = tg9Var;
        this.b = as8Var;
        this.c = as8Var2;
    }

    public static ch9 a(tg9 tg9Var, as8<jv5> as8Var, as8<g00> as8Var2) {
        return new ch9(tg9Var, as8Var, as8Var2);
    }

    public static v53 c(tg9 tg9Var, jv5 jv5Var, g00 g00Var) {
        return (v53) jh8.e(tg9Var.i(jv5Var, g00Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public v53 get() {
        return c(this.a, this.b.get(), this.c.get());
    }
}
