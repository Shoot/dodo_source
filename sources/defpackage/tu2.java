package defpackage;

import defpackage.su2;
import kotlin.Metadata;
import ru.dodopizza.app.presentation.checkout.details.CheckoutDetailsPresenter;
import ru.dodopizza.app.presentation.checkout.details.b;
/* compiled from: DeliverablePlaceSelectionResultListener.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0010\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Ltu2;", "Lwk9;", "Lsu2;", "resultData", "", "a", "Lf63;", "Lf63;", "getRouter", "()Lf63;", "router", "Lru/dodopizza/app/presentation/checkout/details/CheckoutDetailsPresenter;", "b", "Lru/dodopizza/app/presentation/checkout/details/CheckoutDetailsPresenter;", "getPresenter", "()Lru/dodopizza/app/presentation/checkout/details/CheckoutDetailsPresenter;", "presenter", "<init>", "(Lf63;Lru/dodopizza/app/presentation/checkout/details/CheckoutDetailsPresenter;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: tu2  reason: default package */
/* loaded from: classes4.dex */
public final class tu2 implements wk9<su2> {
    private final f63 a;
    private final CheckoutDetailsPresenter b;

    public tu2(f63 f63Var, CheckoutDetailsPresenter checkoutDetailsPresenter) {
        z65.h(f63Var, "router");
        z65.h(checkoutDetailsPresenter, "presenter");
        this.a = f63Var;
        this.b = checkoutDetailsPresenter;
    }

    @Override // defpackage.wk9
    /* renamed from: a */
    public void onResult(su2 su2Var) {
        z65.h(su2Var, "resultData");
        if (z65.c(su2Var, su2.c.a)) {
            this.b.w(b.y.a);
        } else if (su2Var instanceof su2.b) {
            this.b.w(new b.o(((su2.b) su2Var).a(), true));
        }
    }
}
