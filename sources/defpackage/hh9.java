package defpackage;
/* compiled from: RepositoryModule_ProvideHotAndReadyUpdaterFactory.java */
/* renamed from: hh9  reason: default package */
/* loaded from: classes3.dex */
public final class hh9 implements no3<ip4> {
    private final tg9 a;
    private final as8<xu8> b;

    public hh9(tg9 tg9Var, as8<xu8> as8Var) {
        this.a = tg9Var;
        this.b = as8Var;
    }

    public static hh9 a(tg9 tg9Var, as8<xu8> as8Var) {
        return new hh9(tg9Var, as8Var);
    }

    public static ip4 c(tg9 tg9Var, xu8 xu8Var) {
        return (ip4) jh8.e(tg9Var.n(xu8Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public ip4 get() {
        return c(this.a, this.b.get());
    }
}
