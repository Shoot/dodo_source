package defpackage;

import retrofit2.Retrofit;
import ru.dodopizza.app.domain.DodopizzaApi;
/* compiled from: RetrofitModule_ProvideDodopizzaApiFactory.java */
/* renamed from: nl9  reason: default package */
/* loaded from: classes3.dex */
public final class nl9 implements no3<DodopizzaApi> {
    private final gl9 a;
    private final as8<Retrofit> b;

    public nl9(gl9 gl9Var, as8<Retrofit> as8Var) {
        this.a = gl9Var;
        this.b = as8Var;
    }

    public static nl9 a(gl9 gl9Var, as8<Retrofit> as8Var) {
        return new nl9(gl9Var, as8Var);
    }

    public static DodopizzaApi c(gl9 gl9Var, Retrofit retrofit) {
        return (DodopizzaApi) jh8.e(gl9Var.g(retrofit));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public DodopizzaApi get() {
        return c(this.a, this.b.get());
    }
}
