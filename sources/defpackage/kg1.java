package defpackage;

import ru.dodopizza.app.domain.country.CountryService;
/* compiled from: CombinedSelectionMapInteractor_Factory.java */
/* renamed from: kg1  reason: default package */
/* loaded from: classes2.dex */
public final class kg1 implements no3<jg1> {
    private final as8<CountryService> a;

    public kg1(as8<CountryService> as8Var) {
        this.a = as8Var;
    }

    public static kg1 a(as8<CountryService> as8Var) {
        return new kg1(as8Var);
    }

    public static jg1 c(CountryService countryService) {
        return new jg1(countryService);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public jg1 get() {
        return c(this.a.get());
    }
}
