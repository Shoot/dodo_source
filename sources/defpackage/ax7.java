package defpackage;

import ru.dodopizza.app.domain.country.CountryService;
/* compiled from: PaymentWorkflowBrokenModule_ProvideInteractorFactory.java */
/* renamed from: ax7  reason: default package */
/* loaded from: classes3.dex */
public final class ax7 implements no3<xw7> {
    private final as8<CountryService> a;
    private final as8<jv5> b;
    private final as8<rt5> c;
    private final as8<e98> d;

    public ax7(as8<CountryService> as8Var, as8<jv5> as8Var2, as8<rt5> as8Var3, as8<e98> as8Var4) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
        this.d = as8Var4;
    }

    public static ax7 a(as8<CountryService> as8Var, as8<jv5> as8Var2, as8<rt5> as8Var3, as8<e98> as8Var4) {
        return new ax7(as8Var, as8Var2, as8Var3, as8Var4);
    }

    public static xw7 c(CountryService countryService, jv5 jv5Var, rt5 rt5Var, e98 e98Var) {
        return (xw7) jh8.e(zw7.a.a(countryService, jv5Var, rt5Var, e98Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public xw7 get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
