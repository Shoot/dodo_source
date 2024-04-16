package defpackage;

import com.dodopizza.checkout.CheckoutApi;
import com.dodopizza.ospayments.PaymentsOSApi;
import defpackage.xb;
/* compiled from: PaymentModule_ProvideAcquirerRegistryFactory.java */
/* renamed from: iu7  reason: default package */
/* loaded from: classes3.dex */
public final class iu7 implements no3<q4> {
    private final as8<PaymentsOSApi> a;
    private final as8<ub3> b;
    private final as8<CheckoutApi> c;
    private final as8<xb.a> d;

    public iu7(as8<PaymentsOSApi> as8Var, as8<ub3> as8Var2, as8<CheckoutApi> as8Var3, as8<xb.a> as8Var4) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
        this.d = as8Var4;
    }

    public static iu7 a(as8<PaymentsOSApi> as8Var, as8<ub3> as8Var2, as8<CheckoutApi> as8Var3, as8<xb.a> as8Var4) {
        return new iu7(as8Var, as8Var2, as8Var3, as8Var4);
    }

    public static q4 c(PaymentsOSApi paymentsOSApi, ub3 ub3Var, CheckoutApi checkoutApi, xb.a aVar) {
        return (q4) jh8.e(gu7.a.b(paymentsOSApi, ub3Var, checkoutApi, aVar));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public q4 get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
