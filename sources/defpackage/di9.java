package defpackage;
/* compiled from: RepositoryModule_ProvideUpsaleServiceFactory.java */
/* renamed from: di9  reason: default package */
/* loaded from: classes3.dex */
public final class di9 implements no3<ktb> {
    private final tg9 a;
    private final as8<htb> b;
    private final as8<btb> c;

    public di9(tg9 tg9Var, as8<htb> as8Var, as8<btb> as8Var2) {
        this.a = tg9Var;
        this.b = as8Var;
        this.c = as8Var2;
    }

    public static di9 a(tg9 tg9Var, as8<htb> as8Var, as8<btb> as8Var2) {
        return new di9(tg9Var, as8Var, as8Var2);
    }

    public static ktb c(tg9 tg9Var, htb htbVar, btb btbVar) {
        return (ktb) jh8.e(tg9Var.J(htbVar, btbVar));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public ktb get() {
        return c(this.a, this.b.get(), this.c.get());
    }
}
