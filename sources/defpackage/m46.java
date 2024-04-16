package defpackage;

import ru.dodopizza.app.domain.DodopizzaApi;
import ru.dodopizza.app.domain.country.CountryService;
/* compiled from: MainActivityInteractor_Factory.java */
/* renamed from: m46  reason: default package */
/* loaded from: classes4.dex */
public final class m46 implements no3<l46> {
    private final as8<jv5> a;
    private final as8<CountryService> b;
    private final as8<xu8> c;
    private final as8<DodopizzaApi> d;
    private final as8<ava> e;
    private final as8<gc> f;
    private final as8<xda> g;
    private final as8<tda> h;
    private final as8<a98> i;
    private final as8<v52> j;
    private final as8<fm> k;
    private final as8<bo> l;
    private final as8<kx1> m;

    public m46(as8<jv5> as8Var, as8<CountryService> as8Var2, as8<xu8> as8Var3, as8<DodopizzaApi> as8Var4, as8<ava> as8Var5, as8<gc> as8Var6, as8<xda> as8Var7, as8<tda> as8Var8, as8<a98> as8Var9, as8<v52> as8Var10, as8<fm> as8Var11, as8<bo> as8Var12, as8<kx1> as8Var13) {
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
        this.k = as8Var11;
        this.l = as8Var12;
        this.m = as8Var13;
    }

    public static m46 a(as8<jv5> as8Var, as8<CountryService> as8Var2, as8<xu8> as8Var3, as8<DodopizzaApi> as8Var4, as8<ava> as8Var5, as8<gc> as8Var6, as8<xda> as8Var7, as8<tda> as8Var8, as8<a98> as8Var9, as8<v52> as8Var10, as8<fm> as8Var11, as8<bo> as8Var12, as8<kx1> as8Var13) {
        return new m46(as8Var, as8Var2, as8Var3, as8Var4, as8Var5, as8Var6, as8Var7, as8Var8, as8Var9, as8Var10, as8Var11, as8Var12, as8Var13);
    }

    public static l46 c(jv5 jv5Var, CountryService countryService, xu8 xu8Var, as8<DodopizzaApi> as8Var, ava avaVar, gc gcVar, xda xdaVar, tda tdaVar, a98 a98Var, v52 v52Var, fm fmVar, bo boVar, kx1 kx1Var) {
        return new l46(jv5Var, countryService, xu8Var, as8Var, avaVar, gcVar, xdaVar, tdaVar, a98Var, v52Var, fmVar, boVar, kx1Var);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public l46 get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d, this.e.get(), this.f.get(), this.g.get(), this.h.get(), this.i.get(), this.j.get(), this.k.get(), this.l.get(), this.m.get());
    }
}
