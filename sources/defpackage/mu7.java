package defpackage;

import ru.dodopizza.backend.domain.payment.PaymentAPI;
/* compiled from: PaymentModule_ProvideCardChargeServiceFactory.java */
/* renamed from: mu7  reason: default package */
/* loaded from: classes3.dex */
public final class mu7 implements no3<vo0> {
    private final as8<xv7> a;
    private final as8<PaymentAPI> b;
    private final as8<q4> c;
    private final as8<at7> d;
    private final as8<sh3> e;
    private final as8<s56> f;

    public mu7(as8<xv7> as8Var, as8<PaymentAPI> as8Var2, as8<q4> as8Var3, as8<at7> as8Var4, as8<sh3> as8Var5, as8<s56> as8Var6) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
        this.d = as8Var4;
        this.e = as8Var5;
        this.f = as8Var6;
    }

    public static mu7 a(as8<xv7> as8Var, as8<PaymentAPI> as8Var2, as8<q4> as8Var3, as8<at7> as8Var4, as8<sh3> as8Var5, as8<s56> as8Var6) {
        return new mu7(as8Var, as8Var2, as8Var3, as8Var4, as8Var5, as8Var6);
    }

    public static vo0 c(xv7 xv7Var, PaymentAPI paymentAPI, q4 q4Var, at7 at7Var, sh3 sh3Var, s56 s56Var) {
        return (vo0) jh8.e(gu7.a.f(xv7Var, paymentAPI, q4Var, at7Var, sh3Var, s56Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public vo0 get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get());
    }
}
