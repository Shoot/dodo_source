package defpackage;

import ru.dodopizza.backend.domain.geo.GeoApi;
/* compiled from: GeoDependenciesModule_ProvideGeocodeServiceFactory.java */
/* renamed from: de4  reason: default package */
/* loaded from: classes3.dex */
public final class de4 implements no3<re4> {
    private final as8<GeoApi> a;

    public de4(as8<GeoApi> as8Var) {
        this.a = as8Var;
    }

    public static de4 a(as8<GeoApi> as8Var) {
        return new de4(as8Var);
    }

    public static re4 c(GeoApi geoApi) {
        return (re4) jh8.e(yd4.a.e(geoApi));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public re4 get() {
        return c(this.a.get());
    }
}
