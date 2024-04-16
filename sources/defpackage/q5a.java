package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.geo.feature.selectdeliveryaddress.a;
import com.huawei.hms.opendevice.c;
import defpackage.v51;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import ru.dodopizza.app.presentation.checkout.details.CheckoutDetailsPresenter;
import ru.dodopizza.app.presentation.checkout.details.b;
/* compiled from: SelectDeliveryAddressResultListener.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B!\u0012\u0006\u0010\u0013\u001a\u00020\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0014\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002J\f\u0010\f\u001a\u00020\u000b*\u00020\nH\u0002J\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0002H\u0016R\u0017\u0010\u0013\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0018\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0019¨\u0006\u001d"}, d2 = {"Lq5a;", "Lwk9;", "Lcom/dodopizza/geo/feature/selectdeliveryaddress/a$a;", "Le91;", "clientDeliveryLocation", "", c.a, "Lru/dodopizza/app/presentation/checkout/details/b;", "result", "b", "Lcom/dodopizza/geo/feature/selectdeliveryaddress/a$b;", "Lv51;", DateTokenConverter.CONVERTER_KEY, "resultData", "a", "Lf63;", "Lf63;", "getRouter", "()Lf63;", "router", "Lru/dodopizza/app/presentation/checkout/details/CheckoutDetailsPresenter;", "Lru/dodopizza/app/presentation/checkout/details/CheckoutDetailsPresenter;", "getPresenter", "()Lru/dodopizza/app/presentation/checkout/details/CheckoutDetailsPresenter;", "presenter", "Le91;", "oldClientDeliveryLocation", "<init>", "(Lf63;Lru/dodopizza/app/presentation/checkout/details/CheckoutDetailsPresenter;Le91;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: q5a  reason: default package */
/* loaded from: classes4.dex */
public final class q5a implements wk9<a.AbstractC0149a> {
    private final f63 a;
    private final CheckoutDetailsPresenter b;
    private final e91 c;

    public q5a(f63 f63Var, CheckoutDetailsPresenter checkoutDetailsPresenter, e91 e91Var) {
        z65.h(f63Var, "router");
        z65.h(checkoutDetailsPresenter, "presenter");
        this.a = f63Var;
        this.b = checkoutDetailsPresenter;
        this.c = e91Var;
    }

    private final void b(b bVar) {
        this.b.w(bVar);
    }

    private final void c(e91 e91Var) {
        b(new b.u0(ru2.c(e91Var), false));
    }

    private final v51 d(a.b bVar) {
        if (z65.c(bVar, a.b.C0152b.a)) {
            return v51.b.a;
        }
        if (z65.c(bVar, a.b.c.a)) {
            return v51.c.a;
        }
        if (z65.c(bVar, a.b.C0151a.a)) {
            return v51.a.a;
        }
        if (z65.c(bVar, a.b.d.a)) {
            return v51.d.a;
        }
        if (z65.c(bVar, a.b.e.a)) {
            return v51.e.a;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // defpackage.wk9
    /* renamed from: a */
    public void onResult(a.AbstractC0149a abstractC0149a) {
        z65.h(abstractC0149a, "resultData");
        if (abstractC0149a instanceof a.AbstractC0149a.e) {
            b(b.y.a);
        } else if (abstractC0149a instanceof a.AbstractC0149a.d) {
            b(b.w.a);
        } else if (abstractC0149a instanceof a.AbstractC0149a.C0150a) {
            a.AbstractC0149a.C0150a c0150a = (a.AbstractC0149a.C0150a) abstractC0149a;
            if (c0150a.b() instanceof a.b.C0152b) {
                c(c0150a.a());
            } else {
                b(new b.v0(d(c0150a.b())));
            }
        } else if (abstractC0149a instanceof a.AbstractC0149a.f) {
            a.AbstractC0149a.f fVar = (a.AbstractC0149a.f) abstractC0149a;
            if (fVar.b() instanceof a.b.C0152b) {
                c(fVar.a());
            } else {
                b(new b.v0(d(fVar.b())));
            }
        } else if (abstractC0149a instanceof a.AbstractC0149a.c) {
            a.AbstractC0149a.c cVar = (a.AbstractC0149a.c) abstractC0149a;
            if (cVar.b() instanceof a.b.C0152b) {
                CheckoutDetailsPresenter checkoutDetailsPresenter = this.b;
                e91 a = cVar.a();
                e91 e91Var = this.c;
                if (e91Var == null) {
                    e91Var = cVar.a();
                }
                checkoutDetailsPresenter.w(new b.p(a, e91Var));
                return;
            }
            b(new b.v0(d(cVar.b())));
        } else if (abstractC0149a instanceof a.AbstractC0149a.b) {
            this.b.w(b.y.a);
        }
    }
}
