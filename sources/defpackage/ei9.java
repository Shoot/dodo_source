package defpackage;
/* compiled from: RepositoryModule_ProvideUpsaleStateRepositoryFactory.java */
/* renamed from: ei9  reason: default package */
/* loaded from: classes3.dex */
public final class ei9 implements no3<htb> {
    private final tg9 a;
    private final as8<jk2> b;

    public ei9(tg9 tg9Var, as8<jk2> as8Var) {
        this.a = tg9Var;
        this.b = as8Var;
    }

    public static ei9 a(tg9 tg9Var, as8<jk2> as8Var) {
        return new ei9(tg9Var, as8Var);
    }

    public static htb c(tg9 tg9Var, jk2 jk2Var) {
        return (htb) jh8.e(tg9Var.K(jk2Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public htb get() {
        return c(this.a, this.b.get());
    }
}
