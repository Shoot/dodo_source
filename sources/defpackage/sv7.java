package defpackage;

import ru.dodopizza.backend.domain.payment.PaymentAPI;
/* compiled from: PaymentModule_ProvidePollingPaymentStatusServiceFactory.java */
/* renamed from: sv7  reason: default package */
/* loaded from: classes3.dex */
public final class sv7 implements no3<me8> {
    private final as8<PaymentAPI> a;
    private final as8<w65> b;

    public sv7(as8<PaymentAPI> as8Var, as8<w65> as8Var2) {
        this.a = as8Var;
        this.b = as8Var2;
    }

    public static sv7 a(as8<PaymentAPI> as8Var, as8<w65> as8Var2) {
        return new sv7(as8Var, as8Var2);
    }

    public static me8 c(PaymentAPI paymentAPI, w65 w65Var) {
        return (me8) jh8.e(gu7.a.L(paymentAPI, w65Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public me8 get() {
        return c(this.a.get(), this.b.get());
    }
}
