package defpackage;

import ru.dodopizza.app.presentation.selectpizzeria.SelectPizzeriaPresenter;
/* compiled from: SelectPizzeriaModule_ProvidePresenterFactory.java */
/* renamed from: k8a  reason: default package */
/* loaded from: classes3.dex */
public final class k8a implements no3<SelectPizzeriaPresenter> {
    private final d8a a;
    private final as8<a8a> b;
    private final as8<hq3> c;
    private final as8<f63> d;
    private final as8<gc> e;
    private final as8<wv5> f;
    private final as8<ew5> g;
    private final as8<u88> h;
    private final as8<x7a> i;

    public k8a(d8a d8aVar, as8<a8a> as8Var, as8<hq3> as8Var2, as8<f63> as8Var3, as8<gc> as8Var4, as8<wv5> as8Var5, as8<ew5> as8Var6, as8<u88> as8Var7, as8<x7a> as8Var8) {
        this.a = d8aVar;
        this.b = as8Var;
        this.c = as8Var2;
        this.d = as8Var3;
        this.e = as8Var4;
        this.f = as8Var5;
        this.g = as8Var6;
        this.h = as8Var7;
        this.i = as8Var8;
    }

    public static k8a a(d8a d8aVar, as8<a8a> as8Var, as8<hq3> as8Var2, as8<f63> as8Var3, as8<gc> as8Var4, as8<wv5> as8Var5, as8<ew5> as8Var6, as8<u88> as8Var7, as8<x7a> as8Var8) {
        return new k8a(d8aVar, as8Var, as8Var2, as8Var3, as8Var4, as8Var5, as8Var6, as8Var7, as8Var8);
    }

    public static SelectPizzeriaPresenter c(d8a d8aVar, a8a a8aVar, hq3 hq3Var, f63 f63Var, gc gcVar, wv5 wv5Var, ew5 ew5Var, u88 u88Var, x7a x7aVar) {
        return (SelectPizzeriaPresenter) jh8.e(d8aVar.g(a8aVar, hq3Var, f63Var, gcVar, wv5Var, ew5Var, u88Var, x7aVar));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public SelectPizzeriaPresenter get() {
        return c(this.a, this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get(), this.i.get());
    }
}
