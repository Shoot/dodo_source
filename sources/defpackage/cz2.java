package defpackage;

import ru.dodopizza.backend.domain.geo.GeoApi;
/* compiled from: DeliveryLocationSuggestionsModule_ProvideGeocodeServiceFactory.java */
/* renamed from: cz2  reason: default package */
/* loaded from: classes3.dex */
public final class cz2 implements no3<re4> {
    private final as8<GeoApi> a;

    public cz2(as8<GeoApi> as8Var) {
        this.a = as8Var;
    }

    public static cz2 a(as8<GeoApi> as8Var) {
        return new cz2(as8Var);
    }

    public static re4 c(GeoApi geoApi) {
        return (re4) jh8.e(uy2.a.a(geoApi));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public re4 get() {
        return c(this.a.get());
    }
}
