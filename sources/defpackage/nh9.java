package defpackage;
/* compiled from: RepositoryModule_ProvideOrderRepositoryFactory.java */
/* renamed from: nh9  reason: default package */
/* loaded from: classes3.dex */
public final class nh9 implements no3<fi7> {
    private final tg9 a;
    private final as8<ml0> b;

    public nh9(tg9 tg9Var, as8<ml0> as8Var) {
        this.a = tg9Var;
        this.b = as8Var;
    }

    public static nh9 a(tg9 tg9Var, as8<ml0> as8Var) {
        return new nh9(tg9Var, as8Var);
    }

    public static fi7 c(tg9 tg9Var, ml0 ml0Var) {
        return (fi7) jh8.e(tg9Var.t(ml0Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public fi7 get() {
        return c(this.a, this.b.get());
    }
}
