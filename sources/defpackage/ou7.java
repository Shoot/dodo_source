package defpackage;

import com.dodopizza.checkout.CheckoutApi;
/* compiled from: PaymentModule_ProvideCheckoutApiFactory.java */
/* renamed from: ou7  reason: default package */
/* loaded from: classes3.dex */
public final class ou7 implements no3<CheckoutApi> {
    private final as8<b77> a;

    public ou7(as8<b77> as8Var) {
        this.a = as8Var;
    }

    public static ou7 a(as8<b77> as8Var) {
        return new ou7(as8Var);
    }

    public static CheckoutApi c(b77 b77Var) {
        return (CheckoutApi) jh8.e(gu7.a.h(b77Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public CheckoutApi get() {
        return c(this.a.get());
    }
}
