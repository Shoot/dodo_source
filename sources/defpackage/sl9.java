package defpackage;

import retrofit2.Retrofit;
import ru.dodopizza.backend.domain.payment.PaymentAPI;
/* compiled from: RetrofitModule_ProvidePaymentAPIV2Factory.java */
/* renamed from: sl9  reason: default package */
/* loaded from: classes3.dex */
public final class sl9 implements no3<PaymentAPI> {
    private final gl9 a;
    private final as8<Retrofit> b;

    public sl9(gl9 gl9Var, as8<Retrofit> as8Var) {
        this.a = gl9Var;
        this.b = as8Var;
    }

    public static sl9 a(gl9 gl9Var, as8<Retrofit> as8Var) {
        return new sl9(gl9Var, as8Var);
    }

    public static PaymentAPI c(gl9 gl9Var, Retrofit retrofit) {
        return (PaymentAPI) jh8.e(gl9Var.l(retrofit));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public PaymentAPI get() {
        return c(this.a, this.b.get());
    }
}
