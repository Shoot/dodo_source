package defpackage;

import ru.dodopizza.app.presentation.paymentbrokendialog.PaymentWorkflowBrokenPresenter;
/* compiled from: PaymentWorkflowBrokenModule_ProvidePresenterFactory.java */
/* renamed from: bx7  reason: default package */
/* loaded from: classes3.dex */
public final class bx7 implements no3<PaymentWorkflowBrokenPresenter> {
    private final as8<xw7> a;

    public bx7(as8<xw7> as8Var) {
        this.a = as8Var;
    }

    public static bx7 a(as8<xw7> as8Var) {
        return new bx7(as8Var);
    }

    public static PaymentWorkflowBrokenPresenter c(xw7 xw7Var) {
        return (PaymentWorkflowBrokenPresenter) jh8.e(zw7.a.b(xw7Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public PaymentWorkflowBrokenPresenter get() {
        return c(this.a.get());
    }
}
