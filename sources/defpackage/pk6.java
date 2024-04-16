package defpackage;

import ru.dodopizza.app.domain.country.CountryService;
/* compiled from: MindboxPushInteractor_Factory.java */
/* renamed from: pk6  reason: default package */
/* loaded from: classes4.dex */
public final class pk6 implements no3<ok6> {
    private final as8<dl6> a;
    private final as8<jv5> b;
    private final as8<CountryService> c;
    private final as8<kx1> d;

    public pk6(as8<dl6> as8Var, as8<jv5> as8Var2, as8<CountryService> as8Var3, as8<kx1> as8Var4) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
        this.d = as8Var4;
    }

    public static pk6 a(as8<dl6> as8Var, as8<jv5> as8Var2, as8<CountryService> as8Var3, as8<kx1> as8Var4) {
        return new pk6(as8Var, as8Var2, as8Var3, as8Var4);
    }

    public static ok6 c(dl6 dl6Var, jv5 jv5Var, CountryService countryService, kx1 kx1Var) {
        return new ok6(dl6Var, jv5Var, countryService, kx1Var);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public ok6 get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
