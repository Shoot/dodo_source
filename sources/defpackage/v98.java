package defpackage;

import com.dodopizza.order.feature.pizzeriasuggestions.presentation.PizzeriaSuggestionsPresenter;
/* compiled from: PizzeriaSuggestionsPresenter_Factory.java */
/* renamed from: v98  reason: default package */
/* loaded from: classes2.dex */
public final class v98 implements no3<PizzeriaSuggestionsPresenter> {
    private final as8<m98> a;
    private final as8<f63> b;
    private final as8<wv5> c;
    private final as8<ew5> d;
    private final as8<i98> e;
    private final as8<gc> f;
    private final as8<hq3> g;

    public v98(as8<m98> as8Var, as8<f63> as8Var2, as8<wv5> as8Var3, as8<ew5> as8Var4, as8<i98> as8Var5, as8<gc> as8Var6, as8<hq3> as8Var7) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
        this.d = as8Var4;
        this.e = as8Var5;
        this.f = as8Var6;
        this.g = as8Var7;
    }

    public static v98 a(as8<m98> as8Var, as8<f63> as8Var2, as8<wv5> as8Var3, as8<ew5> as8Var4, as8<i98> as8Var5, as8<gc> as8Var6, as8<hq3> as8Var7) {
        return new v98(as8Var, as8Var2, as8Var3, as8Var4, as8Var5, as8Var6, as8Var7);
    }

    public static PizzeriaSuggestionsPresenter c(m98 m98Var, f63 f63Var, wv5 wv5Var, ew5 ew5Var, i98 i98Var, gc gcVar, hq3 hq3Var) {
        return new PizzeriaSuggestionsPresenter(m98Var, f63Var, wv5Var, ew5Var, i98Var, gcVar, hq3Var);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public PizzeriaSuggestionsPresenter get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get());
    }
}
