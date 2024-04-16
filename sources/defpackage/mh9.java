package defpackage;
/* compiled from: RepositoryModule_ProvideMenuUpdaterFactory.java */
/* renamed from: mh9  reason: default package */
/* loaded from: classes3.dex */
public final class mh9 implements no3<ih6> {
    private final tg9 a;
    private final as8<xu8> b;

    public mh9(tg9 tg9Var, as8<xu8> as8Var) {
        this.a = tg9Var;
        this.b = as8Var;
    }

    public static mh9 a(tg9 tg9Var, as8<xu8> as8Var) {
        return new mh9(tg9Var, as8Var);
    }

    public static ih6 c(tg9 tg9Var, xu8 xu8Var) {
        return (ih6) jh8.e(tg9Var.s(xu8Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public ih6 get() {
        return c(this.a, this.b.get());
    }
}
