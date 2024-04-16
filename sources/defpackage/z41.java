package defpackage;

import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
import ru.dodopizza.app.presentation.checkout.details.CheckoutDetailsPresenter;
import ru.dodopizza.app.presentation.checkout.details.b;
/* compiled from: CheckoutGooglePayListener.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lz41;", "Lbh4;", "", "paymentId", "paymentToken", "", "b", "a", c.a, "Lru/dodopizza/app/presentation/checkout/details/CheckoutDetailsPresenter;", "Lru/dodopizza/app/presentation/checkout/details/CheckoutDetailsPresenter;", "getPresenter", "()Lru/dodopizza/app/presentation/checkout/details/CheckoutDetailsPresenter;", "presenter", "<init>", "(Lru/dodopizza/app/presentation/checkout/details/CheckoutDetailsPresenter;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: z41  reason: default package */
/* loaded from: classes4.dex */
public final class z41 implements bh4 {
    private final CheckoutDetailsPresenter a;

    public z41(CheckoutDetailsPresenter checkoutDetailsPresenter) {
        z65.h(checkoutDetailsPresenter, "presenter");
        this.a = checkoutDetailsPresenter;
    }

    @Override // defpackage.bh4
    public void a(String str) {
        z65.h(str, "paymentId");
        this.a.w(b.u.a);
    }

    @Override // defpackage.bh4
    public void b(String str, String str2) {
        z65.h(str, "paymentId");
        z65.h(str2, "paymentToken");
        this.a.w(new b.v(str, str2));
    }

    @Override // defpackage.bh4
    public void c(String str) {
        z65.h(str, "paymentId");
        this.a.w(b.t.a);
    }
}
