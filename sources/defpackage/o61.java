package defpackage;
/* compiled from: CheckoutStateModule_ProvideCheckoutStateEditServiceFactory.java */
/* renamed from: o61  reason: default package */
/* loaded from: classes3.dex */
public final class o61 implements no3<c61> {
    private final l61 a;
    private final as8<t41> b;
    private final as8<e61> c;
    private final as8<h61> d;

    public o61(l61 l61Var, as8<t41> as8Var, as8<e61> as8Var2, as8<h61> as8Var3) {
        this.a = l61Var;
        this.b = as8Var;
        this.c = as8Var2;
        this.d = as8Var3;
    }

    public static o61 a(l61 l61Var, as8<t41> as8Var, as8<e61> as8Var2, as8<h61> as8Var3) {
        return new o61(l61Var, as8Var, as8Var2, as8Var3);
    }

    public static c61 c(l61 l61Var, t41 t41Var, e61 e61Var, h61 h61Var) {
        return (c61) jh8.e(l61Var.c(t41Var, e61Var, h61Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public c61 get() {
        return c(this.a, this.b.get(), this.c.get(), this.d.get());
    }
}
