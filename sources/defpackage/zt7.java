package defpackage;

import ru.dodopizza.app.presentation.payment.WebViewCardPaymentPresenter;
/* compiled from: PaymentMethodModule_ProvideWebViewCardPaymentPresenterFactory.java */
/* renamed from: zt7  reason: default package */
/* loaded from: classes3.dex */
public final class zt7 implements no3<WebViewCardPaymentPresenter> {
    private final as8<f63> a;
    private final as8<df4> b;
    private final as8<wg6> c;
    private final as8<j4c> d;
    private final as8<Long> e;

    public zt7(as8<f63> as8Var, as8<df4> as8Var2, as8<wg6> as8Var3, as8<j4c> as8Var4, as8<Long> as8Var5) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
        this.d = as8Var4;
        this.e = as8Var5;
    }

    public static zt7 a(as8<f63> as8Var, as8<df4> as8Var2, as8<wg6> as8Var3, as8<j4c> as8Var4, as8<Long> as8Var5) {
        return new zt7(as8Var, as8Var2, as8Var3, as8Var4, as8Var5);
    }

    public static WebViewCardPaymentPresenter c(f63 f63Var, df4 df4Var, wg6 wg6Var, j4c j4cVar, long j) {
        return (WebViewCardPaymentPresenter) jh8.e(yt7.a.a(f63Var, df4Var, wg6Var, j4cVar, j));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public WebViewCardPaymentPresenter get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get().longValue());
    }
}
