package defpackage;

import retrofit2.Retrofit;
import ru.dodopizza.backend.domain.authorization.AuthorizationAPI;
/* compiled from: RetrofitModule_ProvideAuthorizationApiFactory.java */
/* renamed from: hl9  reason: default package */
/* loaded from: classes3.dex */
public final class hl9 implements no3<AuthorizationAPI> {
    private final gl9 a;
    private final as8<Retrofit> b;

    public hl9(gl9 gl9Var, as8<Retrofit> as8Var) {
        this.a = gl9Var;
        this.b = as8Var;
    }

    public static hl9 a(gl9 gl9Var, as8<Retrofit> as8Var) {
        return new hl9(gl9Var, as8Var);
    }

    public static AuthorizationAPI c(gl9 gl9Var, Retrofit retrofit) {
        return (AuthorizationAPI) jh8.e(gl9Var.a(retrofit));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public AuthorizationAPI get() {
        return c(this.a, this.b.get());
    }
}
