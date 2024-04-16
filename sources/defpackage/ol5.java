package defpackage;

import ru.dodopizza.backend.domain.landing.LandingApi;
/* compiled from: LandingServiceImpl_Factory.java */
/* renamed from: ol5  reason: default package */
/* loaded from: classes4.dex */
public final class ol5 implements no3<nl5> {
    private final as8<LandingApi> a;
    private final as8<jj5> b;
    private final as8<uk5> c;
    private final as8<ml0> d;

    public ol5(as8<LandingApi> as8Var, as8<jj5> as8Var2, as8<uk5> as8Var3, as8<ml0> as8Var4) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
        this.d = as8Var4;
    }

    public static ol5 a(as8<LandingApi> as8Var, as8<jj5> as8Var2, as8<uk5> as8Var3, as8<ml0> as8Var4) {
        return new ol5(as8Var, as8Var2, as8Var3, as8Var4);
    }

    public static nl5 c(LandingApi landingApi, jj5 jj5Var, uk5 uk5Var, ml0 ml0Var) {
        return new nl5(landingApi, jj5Var, uk5Var, ml0Var);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public nl5 get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
