package defpackage;

import ru.dodopizza.app.presentation.selectlocation.SelectLocationPresenter;
/* compiled from: SelectLocationPresenter_Factory.java */
/* renamed from: i6a  reason: default package */
/* loaded from: classes4.dex */
public final class i6a implements no3<SelectLocationPresenter> {
    private final as8<yo9> a;
    private final as8<gc> b;
    private final as8<c6a> c;
    private final as8<h97> d;
    private final as8<Integer> e;
    private final as8<bo> f;
    private final as8<nh5> g;
    private final as8<Cdo> h;

    public i6a(as8<yo9> as8Var, as8<gc> as8Var2, as8<c6a> as8Var3, as8<h97> as8Var4, as8<Integer> as8Var5, as8<bo> as8Var6, as8<nh5> as8Var7, as8<Cdo> as8Var8) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
        this.d = as8Var4;
        this.e = as8Var5;
        this.f = as8Var6;
        this.g = as8Var7;
        this.h = as8Var8;
    }

    public static i6a a(as8<yo9> as8Var, as8<gc> as8Var2, as8<c6a> as8Var3, as8<h97> as8Var4, as8<Integer> as8Var5, as8<bo> as8Var6, as8<nh5> as8Var7, as8<Cdo> as8Var8) {
        return new i6a(as8Var, as8Var2, as8Var3, as8Var4, as8Var5, as8Var6, as8Var7, as8Var8);
    }

    public static SelectLocationPresenter c(yo9 yo9Var, gc gcVar, c6a c6aVar, h97 h97Var, Integer num, bo boVar, nh5 nh5Var, Cdo cdo) {
        return new SelectLocationPresenter(yo9Var, gcVar, c6aVar, h97Var, num, boVar, nh5Var, cdo);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public SelectLocationPresenter get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get());
    }
}
