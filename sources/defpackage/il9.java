package defpackage;

import retrofit2.Retrofit;
import ru.dodopizza.backend.domain.checkout.CheckoutAPI;
/* compiled from: RetrofitModule_ProvideCheckoutAPIFactory.java */
/* renamed from: il9  reason: default package */
/* loaded from: classes3.dex */
public final class il9 implements no3<CheckoutAPI> {
    private final gl9 a;
    private final as8<Retrofit> b;

    public il9(gl9 gl9Var, as8<Retrofit> as8Var) {
        this.a = gl9Var;
        this.b = as8Var;
    }

    public static il9 a(gl9 gl9Var, as8<Retrofit> as8Var) {
        return new il9(gl9Var, as8Var);
    }

    public static CheckoutAPI c(gl9 gl9Var, Retrofit retrofit) {
        return (CheckoutAPI) jh8.e(gl9Var.b(retrofit));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public CheckoutAPI get() {
        return c(this.a, this.b.get());
    }
}
