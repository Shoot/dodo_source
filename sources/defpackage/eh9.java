package defpackage;
/* compiled from: RepositoryModule_ProvideDomainFactory.java */
/* renamed from: eh9  reason: default package */
/* loaded from: classes3.dex */
public final class eh9 implements no3<o63> {
    private final tg9 a;
    private final as8<v53> b;

    public eh9(tg9 tg9Var, as8<v53> as8Var) {
        this.a = tg9Var;
        this.b = as8Var;
    }

    public static eh9 a(tg9 tg9Var, as8<v53> as8Var) {
        return new eh9(tg9Var, as8Var);
    }

    public static o63 c(tg9 tg9Var, v53 v53Var) {
        return (o63) jh8.e(tg9Var.j(v53Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public o63 get() {
        return c(this.a, this.b.get());
    }
}
