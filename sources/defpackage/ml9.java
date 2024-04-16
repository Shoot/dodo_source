package defpackage;

import retrofit2.Retrofit;
import ru.dodopizza.backend.domain.customer.CustomerAPI;
/* compiled from: RetrofitModule_ProvideCustomerAPIFactory.java */
/* renamed from: ml9  reason: default package */
/* loaded from: classes3.dex */
public final class ml9 implements no3<CustomerAPI> {
    private final gl9 a;
    private final as8<Retrofit> b;

    public ml9(gl9 gl9Var, as8<Retrofit> as8Var) {
        this.a = gl9Var;
        this.b = as8Var;
    }

    public static ml9 a(gl9 gl9Var, as8<Retrofit> as8Var) {
        return new ml9(gl9Var, as8Var);
    }

    public static CustomerAPI c(gl9 gl9Var, Retrofit retrofit) {
        return (CustomerAPI) jh8.e(gl9Var.f(retrofit));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public CustomerAPI get() {
        return c(this.a, this.b.get());
    }
}
