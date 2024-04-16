package defpackage;

import com.dodopizza.geo.feature.deliveryaddresslist.presentation.c;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import ru.dodopizza.app.presentation.checkout.details.CheckoutDetailsPresenter;
import ru.dodopizza.app.presentation.checkout.details.b;
/* compiled from: DeliveryLocationDetailsListener.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u0010\u001a\u00020\u000b\u0012\u0006\u0010\u0016\u001a\u00020\u0011¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0010\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0016\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Lux2;", "Lwk9;", "Lcom/dodopizza/geo/feature/deliveryaddresslist/presentation/c$a;", "resultData", "", "a", "Lf63;", "Lf63;", "getRouter", "()Lf63;", "router", "Lru/dodopizza/app/presentation/checkout/details/CheckoutDetailsPresenter;", "b", "Lru/dodopizza/app/presentation/checkout/details/CheckoutDetailsPresenter;", "getPresenter", "()Lru/dodopizza/app/presentation/checkout/details/CheckoutDetailsPresenter;", "presenter", "Le91;", c.a, "Le91;", "getOldClientDeliveryLocation", "()Le91;", "oldClientDeliveryLocation", "<init>", "(Lf63;Lru/dodopizza/app/presentation/checkout/details/CheckoutDetailsPresenter;Le91;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: ux2  reason: default package */
/* loaded from: classes4.dex */
public final class ux2 implements wk9<c.a> {
    private final f63 a;
    private final CheckoutDetailsPresenter b;
    private final e91 c;

    public ux2(f63 f63Var, CheckoutDetailsPresenter checkoutDetailsPresenter, e91 e91Var) {
        z65.h(f63Var, "router");
        z65.h(checkoutDetailsPresenter, "presenter");
        z65.h(e91Var, "oldClientDeliveryLocation");
        this.a = f63Var;
        this.b = checkoutDetailsPresenter;
        this.c = e91Var;
    }

    @Override // defpackage.wk9
    /* renamed from: a */
    public void onResult(c.a aVar) {
        z65.h(aVar, "resultData");
        if (aVar instanceof c.a.C0132c) {
            this.b.w(b.y.a);
        } else if (aVar instanceof c.a.C0131a) {
            this.b.w(new b.p(((c.a.C0131a) aVar).a(), this.c));
        } else if (aVar instanceof c.a.b) {
            this.b.w(b.y.a);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        mh5.a(Unit.a);
    }
}
