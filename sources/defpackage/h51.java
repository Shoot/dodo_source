package defpackage;

import ru.dodopizza.backend.domain.checkout.CheckoutAPI;
/* compiled from: CheckoutModule_ProvideCheckoutServiceFactory.java */
/* renamed from: h51  reason: default package */
/* loaded from: classes3.dex */
public final class h51 implements no3<x51> {
    private final as8<li7> a;
    private final as8<vi7> b;
    private final as8<ew7> c;
    private final as8<dua> d;
    private final as8<pv0> e;
    private final as8<fq0> f;
    private final as8<t52> g;
    private final as8<CheckoutAPI> h;
    private final as8<b51> i;
    private final as8<ml0> j;

    public h51(as8<li7> as8Var, as8<vi7> as8Var2, as8<ew7> as8Var3, as8<dua> as8Var4, as8<pv0> as8Var5, as8<fq0> as8Var6, as8<t52> as8Var7, as8<CheckoutAPI> as8Var8, as8<b51> as8Var9, as8<ml0> as8Var10) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
        this.d = as8Var4;
        this.e = as8Var5;
        this.f = as8Var6;
        this.g = as8Var7;
        this.h = as8Var8;
        this.i = as8Var9;
        this.j = as8Var10;
    }

    public static h51 a(as8<li7> as8Var, as8<vi7> as8Var2, as8<ew7> as8Var3, as8<dua> as8Var4, as8<pv0> as8Var5, as8<fq0> as8Var6, as8<t52> as8Var7, as8<CheckoutAPI> as8Var8, as8<b51> as8Var9, as8<ml0> as8Var10) {
        return new h51(as8Var, as8Var2, as8Var3, as8Var4, as8Var5, as8Var6, as8Var7, as8Var8, as8Var9, as8Var10);
    }

    public static x51 c(li7 li7Var, vi7 vi7Var, ew7 ew7Var, dua duaVar, pv0 pv0Var, fq0 fq0Var, t52 t52Var, CheckoutAPI checkoutAPI, b51 b51Var, ml0 ml0Var) {
        return (x51) jh8.e(d51.a.d(li7Var, vi7Var, ew7Var, duaVar, pv0Var, fq0Var, t52Var, checkoutAPI, b51Var, ml0Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public x51 get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get(), this.i.get(), this.j.get());
    }
}
