package defpackage;

import com.dodopizza.order.feature.selectionmap.presentation.SelectionMapPresenter;
import com.dodopizza.order.feature.selectionmap.presentation.f;
import com.dodopizza.order.feature.selectionmap.presentation.g;
/* compiled from: SelectionMapPresenter_Factory.java */
/* renamed from: laa  reason: default package */
/* loaded from: classes2.dex */
public final class laa implements no3<SelectionMapPresenter> {
    private final as8<f> a;
    private final as8<f63> b;
    private final as8<gc> c;
    private final as8<hq3> d;
    private final as8<r43> e;
    private final as8<la8> f;
    private final as8<g> g;
    private final as8<wv5> h;

    public laa(as8<f> as8Var, as8<f63> as8Var2, as8<gc> as8Var3, as8<hq3> as8Var4, as8<r43> as8Var5, as8<la8> as8Var6, as8<g> as8Var7, as8<wv5> as8Var8) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
        this.d = as8Var4;
        this.e = as8Var5;
        this.f = as8Var6;
        this.g = as8Var7;
        this.h = as8Var8;
    }

    public static laa a(as8<f> as8Var, as8<f63> as8Var2, as8<gc> as8Var3, as8<hq3> as8Var4, as8<r43> as8Var5, as8<la8> as8Var6, as8<g> as8Var7, as8<wv5> as8Var8) {
        return new laa(as8Var, as8Var2, as8Var3, as8Var4, as8Var5, as8Var6, as8Var7, as8Var8);
    }

    public static SelectionMapPresenter c(f fVar, f63 f63Var, gc gcVar, hq3 hq3Var, r43 r43Var, la8 la8Var, g gVar, wv5 wv5Var) {
        return new SelectionMapPresenter(fVar, f63Var, gcVar, hq3Var, r43Var, la8Var, gVar, wv5Var);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public SelectionMapPresenter get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get());
    }
}
