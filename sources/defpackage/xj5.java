package defpackage;

import retrofit2.Retrofit;
import ru.dodopizza.backend.domain.landing.LandingApi;
/* compiled from: LandingModule_ProvideLandingApiFactory.java */
/* renamed from: xj5  reason: default package */
/* loaded from: classes3.dex */
public final class xj5 implements no3<LandingApi> {
    private final as8<Retrofit> a;

    public xj5(as8<Retrofit> as8Var) {
        this.a = as8Var;
    }

    public static xj5 a(as8<Retrofit> as8Var) {
        return new xj5(as8Var);
    }

    public static LandingApi c(Retrofit retrofit) {
        return (LandingApi) jh8.e(wj5.a.a(retrofit));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public LandingApi get() {
        return c(this.a.get());
    }
}
