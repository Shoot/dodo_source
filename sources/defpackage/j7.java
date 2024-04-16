package defpackage;

import defpackage.sl5;
import ru.dodopizza.backend.domain.country.CountryApi;
/* compiled from: AddressDetailsFieldDesignServiceImpl_Factory.java */
/* renamed from: j7  reason: default package */
/* loaded from: classes4.dex */
public final class j7 implements no3<i7> {
    private final as8<CountryApi> a;
    private final as8<sl5.a> b;
    private final as8<ml0> c;
    private final as8<i32> d;

    public j7(as8<CountryApi> as8Var, as8<sl5.a> as8Var2, as8<ml0> as8Var3, as8<i32> as8Var4) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
        this.d = as8Var4;
    }

    public static j7 a(as8<CountryApi> as8Var, as8<sl5.a> as8Var2, as8<ml0> as8Var3, as8<i32> as8Var4) {
        return new j7(as8Var, as8Var2, as8Var3, as8Var4);
    }

    public static i7 c(CountryApi countryApi, sl5.a aVar, ml0 ml0Var, i32 i32Var) {
        return new i7(countryApi, aVar, ml0Var, i32Var);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public i7 get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
