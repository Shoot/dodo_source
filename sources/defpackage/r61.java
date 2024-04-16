package defpackage;
/* compiled from: CheckoutStateModule_ProvideVOFactoryFactory.java */
/* renamed from: r61  reason: default package */
/* loaded from: classes3.dex */
public final class r61 implements no3<e61> {
    private final l61 a;
    private final as8<f61> b;

    public r61(l61 l61Var, as8<f61> as8Var) {
        this.a = l61Var;
        this.b = as8Var;
    }

    public static r61 a(l61 l61Var, as8<f61> as8Var) {
        return new r61(l61Var, as8Var);
    }

    public static e61 c(l61 l61Var, f61 f61Var) {
        return (e61) jh8.e(l61Var.f(f61Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public e61 get() {
        return c(this.a, this.b.get());
    }
}
