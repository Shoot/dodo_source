package defpackage;

import ru.dodopizza.app.presentation.selectpizzeria.combined.SelectPizzeriaCombinedViewPresenter;
/* compiled from: SelectPizzeriaModule_ProvideCombinedViewPresenterFactory.java */
/* renamed from: e8a  reason: default package */
/* loaded from: classes3.dex */
public final class e8a implements no3<SelectPizzeriaCombinedViewPresenter> {
    private final d8a a;
    private final as8<a8a> b;
    private final as8<hq3> c;
    private final as8<f63> d;
    private final as8<gc> e;
    private final as8<wv5> f;
    private final as8<u88> g;
    private final as8<x7a> h;
    private final as8<ka8> i;
    private final as8<r43> j;

    public e8a(d8a d8aVar, as8<a8a> as8Var, as8<hq3> as8Var2, as8<f63> as8Var3, as8<gc> as8Var4, as8<wv5> as8Var5, as8<u88> as8Var6, as8<x7a> as8Var7, as8<ka8> as8Var8, as8<r43> as8Var9) {
        this.a = d8aVar;
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

    public static e8a a(d8a d8aVar, as8<a8a> as8Var, as8<hq3> as8Var2, as8<f63> as8Var3, as8<gc> as8Var4, as8<wv5> as8Var5, as8<u88> as8Var6, as8<x7a> as8Var7, as8<ka8> as8Var8, as8<r43> as8Var9) {
        return new e8a(d8aVar, as8Var, as8Var2, as8Var3, as8Var4, as8Var5, as8Var6, as8Var7, as8Var8, as8Var9);
    }

    public static SelectPizzeriaCombinedViewPresenter c(d8a d8aVar, a8a a8aVar, hq3 hq3Var, f63 f63Var, gc gcVar, wv5 wv5Var, u88 u88Var, x7a x7aVar, ka8 ka8Var, r43 r43Var) {
        return (SelectPizzeriaCombinedViewPresenter) jh8.e(d8aVar.a(a8aVar, hq3Var, f63Var, gcVar, wv5Var, u88Var, x7aVar, ka8Var, r43Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public SelectPizzeriaCombinedViewPresenter get() {
        return c(this.a, this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get(), this.i.get(), this.j.get());
    }
}
