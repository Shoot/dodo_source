package defpackage;
/* compiled from: RepositoryModule_ProvideReferralSystemRepositoryFactory.java */
/* renamed from: th9  reason: default package */
/* loaded from: classes3.dex */
public final class th9 implements no3<tb9> {
    private final tg9 a;
    private final as8<ml0> b;

    public th9(tg9 tg9Var, as8<ml0> as8Var) {
        this.a = tg9Var;
        this.b = as8Var;
    }

    public static th9 a(tg9 tg9Var, as8<ml0> as8Var) {
        return new th9(tg9Var, as8Var);
    }

    public static tb9 c(tg9 tg9Var, ml0 ml0Var) {
        return (tb9) jh8.e(tg9Var.z(ml0Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public tb9 get() {
        return c(this.a, this.b.get());
    }
}
