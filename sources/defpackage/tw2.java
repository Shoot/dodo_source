package defpackage;

import ru.dodopizza.app.domain.country.CountryService;
/* compiled from: DeliveryAddressMapVOServiceImpl_Factory.java */
/* renamed from: tw2  reason: default package */
/* loaded from: classes.dex */
public final class tw2 implements no3<sw2> {
    private final as8<re4> a;
    private final as8<CountryService> b;
    private final as8<jv5> c;
    private final as8<String> d;
    private final as8<ht4> e;

    public tw2(as8<re4> as8Var, as8<CountryService> as8Var2, as8<jv5> as8Var3, as8<String> as8Var4, as8<ht4> as8Var5) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
        this.d = as8Var4;
        this.e = as8Var5;
    }

    public static tw2 a(as8<re4> as8Var, as8<CountryService> as8Var2, as8<jv5> as8Var3, as8<String> as8Var4, as8<ht4> as8Var5) {
        return new tw2(as8Var, as8Var2, as8Var3, as8Var4, as8Var5);
    }

    public static sw2 c(re4 re4Var, CountryService countryService, jv5 jv5Var, String str, ht4 ht4Var) {
        return new sw2(re4Var, countryService, jv5Var, str, ht4Var);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public sw2 get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
