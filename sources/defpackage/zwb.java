package defpackage;

import defpackage.ym;
import ru.dodopizza.app.presentation.product.card.variable.VariableProductCardPresenter;
/* compiled from: VariableProductCardModule_ProvideVariableProductCardPresenterFactory.java */
/* renamed from: zwb  reason: default package */
/* loaded from: classes3.dex */
public final class zwb implements no3<VariableProductCardPresenter> {
    private final as8<wwb> a;
    private final as8<String> b;
    private final as8<String> c;
    private final as8<ym.d> d;
    private final as8<f63> e;
    private final as8<hq3> f;
    private final as8<f5b> g;
    private final as8<jn6> h;
    private final as8<t18> i;
    private final as8<gc> j;

    public zwb(as8<wwb> as8Var, as8<String> as8Var2, as8<String> as8Var3, as8<ym.d> as8Var4, as8<f63> as8Var5, as8<hq3> as8Var6, as8<f5b> as8Var7, as8<jn6> as8Var8, as8<t18> as8Var9, as8<gc> as8Var10) {
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

    public static zwb a(as8<wwb> as8Var, as8<String> as8Var2, as8<String> as8Var3, as8<ym.d> as8Var4, as8<f63> as8Var5, as8<hq3> as8Var6, as8<f5b> as8Var7, as8<jn6> as8Var8, as8<t18> as8Var9, as8<gc> as8Var10) {
        return new zwb(as8Var, as8Var2, as8Var3, as8Var4, as8Var5, as8Var6, as8Var7, as8Var8, as8Var9, as8Var10);
    }

    public static VariableProductCardPresenter c(wwb wwbVar, String str, String str2, ym.d dVar, f63 f63Var, hq3 hq3Var, f5b f5bVar, jn6 jn6Var, t18 t18Var, gc gcVar) {
        return (VariableProductCardPresenter) jh8.e(xwb.a.b(wwbVar, str, str2, dVar, f63Var, hq3Var, f5bVar, jn6Var, t18Var, gcVar));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public VariableProductCardPresenter get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get(), this.i.get(), this.j.get());
    }
}
