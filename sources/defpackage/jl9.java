package defpackage;

import retrofit2.Retrofit;
import ru.dodopizza.backend.domain.clientcard.ClientCardAPI;
/* compiled from: RetrofitModule_ProvideClientCardAPIFactory.java */
/* renamed from: jl9  reason: default package */
/* loaded from: classes3.dex */
public final class jl9 implements no3<ClientCardAPI> {
    private final gl9 a;
    private final as8<Retrofit> b;

    public jl9(gl9 gl9Var, as8<Retrofit> as8Var) {
        this.a = gl9Var;
        this.b = as8Var;
    }

    public static jl9 a(gl9 gl9Var, as8<Retrofit> as8Var) {
        return new jl9(gl9Var, as8Var);
    }

    public static ClientCardAPI c(gl9 gl9Var, Retrofit retrofit) {
        return (ClientCardAPI) jh8.e(gl9Var.c(retrofit));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public ClientCardAPI get() {
        return c(this.a, this.b.get());
    }
}
