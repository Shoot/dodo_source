package defpackage;

import retrofit2.Retrofit;
import ru.dodopizza.backend.domain.geo.GeoApi;
/* compiled from: GeoDependenciesModule_ProvideGeoApiFactory.java */
/* renamed from: ce4  reason: default package */
/* loaded from: classes3.dex */
public final class ce4 implements no3<GeoApi> {
    private final as8<Retrofit> a;

    public ce4(as8<Retrofit> as8Var) {
        this.a = as8Var;
    }

    public static ce4 a(as8<Retrofit> as8Var) {
        return new ce4(as8Var);
    }

    public static GeoApi c(Retrofit retrofit) {
        return (GeoApi) jh8.e(yd4.a.d(retrofit));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public GeoApi get() {
        return c(this.a.get());
    }
}
