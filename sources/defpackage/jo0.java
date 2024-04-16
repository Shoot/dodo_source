package defpackage;
/* compiled from: CaptchaDomainModule_Companion_ProvideCaptchaInterceptorFactory.java */
/* renamed from: jo0  reason: default package */
/* loaded from: classes.dex */
public final class jo0 implements no3<no0> {
    private final as8<qo0> a;
    private final as8<do0> b;
    private final as8<oo0> c;

    public jo0(as8<qo0> as8Var, as8<do0> as8Var2, as8<oo0> as8Var3) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
    }

    public static jo0 a(as8<qo0> as8Var, as8<do0> as8Var2, as8<oo0> as8Var3) {
        return new jo0(as8Var, as8Var2, as8Var3);
    }

    public static no0 c(qo0 qo0Var, do0 do0Var, oo0 oo0Var) {
        return (no0) jh8.e(go0.a.c(qo0Var, do0Var, oo0Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public no0 get() {
        return c(this.a.get(), this.b.get(), this.c.get());
    }
}
