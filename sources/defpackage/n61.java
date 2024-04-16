package defpackage;
/* compiled from: CheckoutStateModule_ProvideCheckoutOrderProcessingServiceFactory.java */
/* renamed from: n61  reason: default package */
/* loaded from: classes3.dex */
public final class n61 implements no3<q51> {
    private final l61 a;
    private final as8<x51> b;
    private final as8<t61> c;
    private final as8<f8c> d;
    private final as8<t52> e;
    private final as8<ad> f;
    private final as8<li7> g;
    private final as8<ew7> h;
    private final as8<dh4> i;
    private final as8<h61> j;

    public n61(l61 l61Var, as8<x51> as8Var, as8<t61> as8Var2, as8<f8c> as8Var3, as8<t52> as8Var4, as8<ad> as8Var5, as8<li7> as8Var6, as8<ew7> as8Var7, as8<dh4> as8Var8, as8<h61> as8Var9) {
        this.a = l61Var;
        this.b = as8Var;
        this.c = as8Var2;
        this.d = as8Var3;
        this.e = as8Var4;
        this.f = as8Var5;
        this.g = as8Var6;
        this.h = as8Var7;
        this.i = as8Var8;
        this.j = as8Var9;
    }

    public static n61 a(l61 l61Var, as8<x51> as8Var, as8<t61> as8Var2, as8<f8c> as8Var3, as8<t52> as8Var4, as8<ad> as8Var5, as8<li7> as8Var6, as8<ew7> as8Var7, as8<dh4> as8Var8, as8<h61> as8Var9) {
        return new n61(l61Var, as8Var, as8Var2, as8Var3, as8Var4, as8Var5, as8Var6, as8Var7, as8Var8, as8Var9);
    }

    public static q51 c(l61 l61Var, x51 x51Var, t61 t61Var, f8c f8cVar, t52 t52Var, ad adVar, li7 li7Var, ew7 ew7Var, dh4 dh4Var, h61 h61Var) {
        return (q51) jh8.e(l61Var.b(x51Var, t61Var, f8cVar, t52Var, adVar, li7Var, ew7Var, dh4Var, h61Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public q51 get() {
        return c(this.a, this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get(), this.i.get(), this.j.get());
    }
}
