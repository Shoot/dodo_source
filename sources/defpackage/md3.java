package defpackage;

import com.dodopizza.geo.feature.deliveryaddresslist.presentation.d;
import com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.a;
import com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.e;
import ru.dodopizza.app.domain.country.CountryService;
/* compiled from: EditDeliveryAddressMapModule_ProvideInteractorFactory.java */
/* renamed from: md3  reason: default package */
/* loaded from: classes2.dex */
public final class md3 implements no3<e> {
    private final as8<re4> a;
    private final as8<CountryService> b;
    private final as8<h7> c;
    private final as8<a> d;
    private final as8<x42> e;
    private final as8<k6a> f;
    private final as8<d> g;
    private final as8<k9a> h;
    private final as8<i00> i;
    private final as8<b7> j;

    public md3(as8<re4> as8Var, as8<CountryService> as8Var2, as8<h7> as8Var3, as8<a> as8Var4, as8<x42> as8Var5, as8<k6a> as8Var6, as8<d> as8Var7, as8<k9a> as8Var8, as8<i00> as8Var9, as8<b7> as8Var10) {
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

    public static md3 a(as8<re4> as8Var, as8<CountryService> as8Var2, as8<h7> as8Var3, as8<a> as8Var4, as8<x42> as8Var5, as8<k6a> as8Var6, as8<d> as8Var7, as8<k9a> as8Var8, as8<i00> as8Var9, as8<b7> as8Var10) {
        return new md3(as8Var, as8Var2, as8Var3, as8Var4, as8Var5, as8Var6, as8Var7, as8Var8, as8Var9, as8Var10);
    }

    public static e c(re4 re4Var, CountryService countryService, h7 h7Var, a aVar, x42 x42Var, k6a k6aVar, d dVar, k9a k9aVar, i00 i00Var, b7 b7Var) {
        return (e) jh8.e(ld3.a.a(re4Var, countryService, h7Var, aVar, x42Var, k6aVar, dVar, k9aVar, i00Var, b7Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public e get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get(), this.i.get(), this.j.get());
    }
}
