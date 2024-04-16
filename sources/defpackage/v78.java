package defpackage;

import com.dodopizza.order.feature.product.card.presentation.pizza.PizzaProductCardPresenter;
import defpackage.ym;
/* compiled from: PizzaProductCardPresenter_Factory.java */
/* renamed from: v78  reason: default package */
/* loaded from: classes2.dex */
public final class v78 implements no3<PizzaProductCardPresenter> {
    private final as8<String> a;
    private final as8<q78> b;
    private final as8<String> c;
    private final as8<ym.d> d;
    private final as8<f63> e;
    private final as8<f5b> f;
    private final as8<t18> g;

    public v78(as8<String> as8Var, as8<q78> as8Var2, as8<String> as8Var3, as8<ym.d> as8Var4, as8<f63> as8Var5, as8<f5b> as8Var6, as8<t18> as8Var7) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
        this.d = as8Var4;
        this.e = as8Var5;
        this.f = as8Var6;
        this.g = as8Var7;
    }

    public static v78 a(as8<String> as8Var, as8<q78> as8Var2, as8<String> as8Var3, as8<ym.d> as8Var4, as8<f63> as8Var5, as8<f5b> as8Var6, as8<t18> as8Var7) {
        return new v78(as8Var, as8Var2, as8Var3, as8Var4, as8Var5, as8Var6, as8Var7);
    }

    public static PizzaProductCardPresenter c(String str, q78 q78Var, String str2, ym.d dVar, f63 f63Var, f5b f5bVar, t18 t18Var) {
        return new PizzaProductCardPresenter(str, q78Var, str2, dVar, f63Var, f5bVar, t18Var);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public PizzaProductCardPresenter get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get());
    }
}
