package defpackage;

import retrofit2.Retrofit;
import ru.dodopizza.backend.domain.covid.CovidApi;
/* compiled from: CovidModule_ProvideCovidApiFactory.java */
/* renamed from: wz1  reason: default package */
/* loaded from: classes3.dex */
public final class wz1 implements no3<CovidApi> {
    private final as8<Retrofit> a;

    public wz1(as8<Retrofit> as8Var) {
        this.a = as8Var;
    }

    public static wz1 a(as8<Retrofit> as8Var) {
        return new wz1(as8Var);
    }

    public static CovidApi c(Retrofit retrofit) {
        return (CovidApi) jh8.e(vz1.a.a(retrofit));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public CovidApi get() {
        return c(this.a.get());
    }
}
