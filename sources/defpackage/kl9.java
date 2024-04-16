package defpackage;

import retrofit2.Retrofit;
import ru.dodopizza.backend.domain.country.CountryApi;
/* compiled from: RetrofitModule_ProvideCountryApiFactory.java */
/* renamed from: kl9  reason: default package */
/* loaded from: classes3.dex */
public final class kl9 implements no3<CountryApi> {
    private final gl9 a;
    private final as8<Retrofit> b;

    public kl9(gl9 gl9Var, as8<Retrofit> as8Var) {
        this.a = gl9Var;
        this.b = as8Var;
    }

    public static kl9 a(gl9 gl9Var, as8<Retrofit> as8Var) {
        return new kl9(gl9Var, as8Var);
    }

    public static CountryApi c(gl9 gl9Var, Retrofit retrofit) {
        return (CountryApi) jh8.e(gl9Var.d(retrofit));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public CountryApi get() {
        return c(this.a, this.b.get());
    }
}
