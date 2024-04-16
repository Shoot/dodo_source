package defpackage;

import ru.dodopizza.app.domain.country.CountryService;
import ru.dodopizza.backend.domain.pizzeria.PizzeriaAPI;
/* compiled from: PizzeriaServiceImpl_Factory.java */
/* renamed from: g98  reason: default package */
/* loaded from: classes4.dex */
public final class g98 implements no3<f98> {
    private final as8<a98> a;
    private final as8<pa8> b;
    private final as8<CountryService> c;
    private final as8<jv5> d;
    private final as8<PizzeriaAPI> e;
    private final as8<ava> f;
    private final as8<bia> g;

    public g98(as8<a98> as8Var, as8<pa8> as8Var2, as8<CountryService> as8Var3, as8<jv5> as8Var4, as8<PizzeriaAPI> as8Var5, as8<ava> as8Var6, as8<bia> as8Var7) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
        this.d = as8Var4;
        this.e = as8Var5;
        this.f = as8Var6;
        this.g = as8Var7;
    }

    public static g98 a(as8<a98> as8Var, as8<pa8> as8Var2, as8<CountryService> as8Var3, as8<jv5> as8Var4, as8<PizzeriaAPI> as8Var5, as8<ava> as8Var6, as8<bia> as8Var7) {
        return new g98(as8Var, as8Var2, as8Var3, as8Var4, as8Var5, as8Var6, as8Var7);
    }

    public static f98 c(a98 a98Var, pa8 pa8Var, CountryService countryService, jv5 jv5Var, PizzeriaAPI pizzeriaAPI, ava avaVar, bia biaVar) {
        return new f98(a98Var, pa8Var, countryService, jv5Var, pizzeriaAPI, avaVar, biaVar);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public f98 get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get());
    }
}
