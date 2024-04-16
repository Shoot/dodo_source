package defpackage;
/* compiled from: CheckoutStateModule_ProvideCheckoutStateServiceFactory.java */
/* renamed from: q61  reason: default package */
/* loaded from: classes3.dex */
public final class q61 implements no3<v61> {
    private final l61 a;
    private final as8<c61> b;
    private final as8<t61> c;
    private final as8<ad> d;
    private final as8<qi8> e;
    private final as8<h61> f;
    private final as8<i00> g;
    private final as8<hq3> h;

    public q61(l61 l61Var, as8<c61> as8Var, as8<t61> as8Var2, as8<ad> as8Var3, as8<qi8> as8Var4, as8<h61> as8Var5, as8<i00> as8Var6, as8<hq3> as8Var7) {
        this.a = l61Var;
        this.b = as8Var;
        this.c = as8Var2;
        this.d = as8Var3;
        this.e = as8Var4;
        this.f = as8Var5;
        this.g = as8Var6;
        this.h = as8Var7;
    }

    public static q61 a(l61 l61Var, as8<c61> as8Var, as8<t61> as8Var2, as8<ad> as8Var3, as8<qi8> as8Var4, as8<h61> as8Var5, as8<i00> as8Var6, as8<hq3> as8Var7) {
        return new q61(l61Var, as8Var, as8Var2, as8Var3, as8Var4, as8Var5, as8Var6, as8Var7);
    }

    public static v61 c(l61 l61Var, c61 c61Var, t61 t61Var, ad adVar, qi8 qi8Var, h61 h61Var, i00 i00Var, hq3 hq3Var) {
        return (v61) jh8.e(l61Var.e(c61Var, t61Var, adVar, qi8Var, h61Var, i00Var, hq3Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public v61 get() {
        return c(this.a, this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get());
    }
}
