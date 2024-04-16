package defpackage;

import ru.dodopizza.backend.domain.covid.CovidApi;
/* compiled from: CovidModule_ProvideServiceFactory.java */
/* renamed from: xz1  reason: default package */
/* loaded from: classes3.dex */
public final class xz1 implements no3<yz1> {
    private final as8<CovidApi> a;
    private final as8<dt5> b;
    private final as8<hq3> c;

    public xz1(as8<CovidApi> as8Var, as8<dt5> as8Var2, as8<hq3> as8Var3) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
    }

    public static xz1 a(as8<CovidApi> as8Var, as8<dt5> as8Var2, as8<hq3> as8Var3) {
        return new xz1(as8Var, as8Var2, as8Var3);
    }

    public static yz1 c(CovidApi covidApi, dt5 dt5Var, hq3 hq3Var) {
        return (yz1) jh8.e(vz1.a.b(covidApi, dt5Var, hq3Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public yz1 get() {
        return c(this.a.get(), this.b.get(), this.c.get());
    }
}
