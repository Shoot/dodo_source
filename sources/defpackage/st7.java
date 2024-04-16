package defpackage;

import ru.dodopizza.app.presentation.checkout.paymentwaylist.PaymentMethodListPresenter;
/* compiled from: PaymentMethodListModule_ProvidePaymentMethodListPresenterFactory.java */
/* renamed from: st7  reason: default package */
/* loaded from: classes3.dex */
public final class st7 implements no3<PaymentMethodListPresenter> {
    private final as8<cl2<et7>> a;
    private final as8<ot7> b;
    private final as8<ut7> c;
    private final as8<Boolean> d;

    public st7(as8<cl2<et7>> as8Var, as8<ot7> as8Var2, as8<ut7> as8Var3, as8<Boolean> as8Var4) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
        this.d = as8Var4;
    }

    public static st7 a(as8<cl2<et7>> as8Var, as8<ot7> as8Var2, as8<ut7> as8Var3, as8<Boolean> as8Var4) {
        return new st7(as8Var, as8Var2, as8Var3, as8Var4);
    }

    public static PaymentMethodListPresenter c(cl2<et7> cl2Var, ot7 ot7Var, ut7 ut7Var, boolean z) {
        return (PaymentMethodListPresenter) jh8.e(qt7.a.b(cl2Var, ot7Var, ut7Var, z));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public PaymentMethodListPresenter get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get().booleanValue());
    }
}
