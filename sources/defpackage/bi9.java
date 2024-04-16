package defpackage;
/* compiled from: RepositoryModule_ProvideUpsaleItemsServiceFactory.java */
/* renamed from: bi9  reason: default package */
/* loaded from: classes3.dex */
public final class bi9 implements no3<tsb> {
    private final tg9 a;
    private final as8<ktb> b;

    public bi9(tg9 tg9Var, as8<ktb> as8Var) {
        this.a = tg9Var;
        this.b = as8Var;
    }

    public static bi9 a(tg9 tg9Var, as8<ktb> as8Var) {
        return new bi9(tg9Var, as8Var);
    }

    public static tsb c(tg9 tg9Var, ktb ktbVar) {
        return (tsb) jh8.e(tg9Var.H(ktbVar));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public tsb get() {
        return c(this.a, this.b.get());
    }
}
