package defpackage;

import com.dodopizza.ospayments.PaymentsOSApi;
/* compiled from: PaymentModule_ProvidePaymentsOsApiFactory.java */
/* renamed from: rv7  reason: default package */
/* loaded from: classes3.dex */
public final class rv7 implements no3<PaymentsOSApi> {
    private final as8<b77> a;

    public rv7(as8<b77> as8Var) {
        this.a = as8Var;
    }

    public static rv7 a(as8<b77> as8Var) {
        return new rv7(as8Var);
    }

    public static PaymentsOSApi c(b77 b77Var) {
        return (PaymentsOSApi) jh8.e(gu7.a.K(b77Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public PaymentsOSApi get() {
        return c(this.a.get());
    }
}
