package defpackage;

import com.dodopizza.order.feature.selectionmap.presentation.f;
import com.dodopizza.order.feature.selectionmap.presentation.g;
import ru.dodopizza.app.domain.country.CountryService;
/* compiled from: SelectionMapModule_ProvideSelectionMapInteractorFactory.java */
/* renamed from: iaa  reason: default package */
/* loaded from: classes2.dex */
public final class iaa implements no3<g> {
    private final as8<f> a;
    private final as8<e98> b;
    private final as8<x88> c;
    private final as8<re4> d;
    private final as8<CountryService> e;
    private final as8<gc> f;
    private final as8<vg7> g;
    private final as8<hq3> h;

    public iaa(as8<f> as8Var, as8<e98> as8Var2, as8<x88> as8Var3, as8<re4> as8Var4, as8<CountryService> as8Var5, as8<gc> as8Var6, as8<vg7> as8Var7, as8<hq3> as8Var8) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
        this.d = as8Var4;
        this.e = as8Var5;
        this.f = as8Var6;
        this.g = as8Var7;
        this.h = as8Var8;
    }

    public static iaa a(as8<f> as8Var, as8<e98> as8Var2, as8<x88> as8Var3, as8<re4> as8Var4, as8<CountryService> as8Var5, as8<gc> as8Var6, as8<vg7> as8Var7, as8<hq3> as8Var8) {
        return new iaa(as8Var, as8Var2, as8Var3, as8Var4, as8Var5, as8Var6, as8Var7, as8Var8);
    }

    public static g c(f fVar, e98 e98Var, x88 x88Var, re4 re4Var, CountryService countryService, gc gcVar, vg7 vg7Var, hq3 hq3Var) {
        return (g) jh8.e(gaa.a.b(fVar, e98Var, x88Var, re4Var, countryService, gcVar, vg7Var, hq3Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public g get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get());
    }
}
