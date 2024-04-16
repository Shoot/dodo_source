package defpackage;

import ru.dodopizza.backend.domain.geo.GeoApi;
/* compiled from: DeliveryLocationDetailsModule_ProvideDeliveryLocationDetailsServiceFactory.java */
/* renamed from: ay2  reason: default package */
/* loaded from: classes3.dex */
public final class ay2 implements no3<cy2> {
    private final as8<GeoApi> a;
    private final as8<ml0> b;
    private final as8<jy2> c;

    public ay2(as8<GeoApi> as8Var, as8<ml0> as8Var2, as8<jy2> as8Var3) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
    }

    public static ay2 a(as8<GeoApi> as8Var, as8<ml0> as8Var2, as8<jy2> as8Var3) {
        return new ay2(as8Var, as8Var2, as8Var3);
    }

    public static cy2 c(GeoApi geoApi, ml0 ml0Var, jy2 jy2Var) {
        return (cy2) jh8.e(wx2.a.b(geoApi, ml0Var, jy2Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public cy2 get() {
        return c(this.a.get(), this.b.get(), this.c.get());
    }
}
