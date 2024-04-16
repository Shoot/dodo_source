package defpackage;

import ru.dodopizza.app.domain.country.CountryService;
/* compiled from: LocalityListInteractorImpl_Factory.java */
/* renamed from: cu5  reason: default package */
/* loaded from: classes4.dex */
public final class cu5 implements no3<bu5> {
    private final as8<jv5> a;
    private final as8<CountryService> b;
    private final as8<ny1> c;
    private final as8<py1> d;

    public cu5(as8<jv5> as8Var, as8<CountryService> as8Var2, as8<ny1> as8Var3, as8<py1> as8Var4) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
        this.d = as8Var4;
    }

    public static cu5 a(as8<jv5> as8Var, as8<CountryService> as8Var2, as8<ny1> as8Var3, as8<py1> as8Var4) {
        return new cu5(as8Var, as8Var2, as8Var3, as8Var4);
    }

    public static bu5 c(jv5 jv5Var, CountryService countryService, ny1 ny1Var, py1 py1Var) {
        return new bu5(jv5Var, countryService, ny1Var, py1Var);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public bu5 get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
