package ru.dodopizza.app.presentation.checkout.details.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.android.view.custom.badgebackgroundtextview.BadgeBackgroundTextView;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.bq0;
import defpackage.d41;
import defpackage.mv9;
import defpackage.nk9;
import defpackage.pt2;
import defpackage.uu2;
import kotlin.Metadata;
/* compiled from: OrderTypeView.kt */
@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010B\u001a\u00020A\u0012\b\u0010D\u001a\u0004\u0018\u00010C¢\u0006\u0004\bE\u0010FJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J \u0010\n\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002J\b\u0010\u000b\u001a\u00020\u0002H\u0002J\b\u0010\f\u001a\u00020\u0002H\u0002J(\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J \u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J\u0018\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J\u0010\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\rH\u0002J\u0018\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002J6\u0010\"\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010!\u001a\u00020 2\u0006\u0010\t\u001a\u00020\bJ\u0006\u0010#\u001a\u00020\u0002J\u0006\u0010$\u001a\u00020\u0002J\u000e\u0010&\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u001eJ\u0006\u0010'\u001a\u00020\u0002R\u001b\u0010,\u001a\u00020(8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010)\u001a\u0004\b*\u0010+R\u001b\u00100\u001a\u00020-8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010)\u001a\u0004\b.\u0010/R\u001b\u00104\u001a\u0002018FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010)\u001a\u0004\b2\u00103R\u001b\u00108\u001a\u0002058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010)\u001a\u0004\b6\u00107R\u001b\u0010<\u001a\u0002098BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010)\u001a\u0004\b:\u0010;R\u001b\u0010@\u001a\u00020=8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010)\u001a\u0004\b>\u0010?¨\u0006G"}, d2 = {"Lru/dodopizza/app/presentation/checkout/details/views/OrderTypeView;", "Landroid/widget/FrameLayout;", "", "g", "Lnk9$b$b;", "orderType", "Ly41;", "extraInfo", "Lpv9;", "scheduleHelper", DateTokenConverter.CONVERTER_KEY, Image.TYPE_MEDIUM, "j", "Lwk7;", "Lpt2;", "deferredTime", "Lvs2;", "timeFormatter", "", "expectedMinutesToReceiveForASAP", "i", Image.TYPE_HIGH, "Ld41;", "error", "a", c.a, "Ld88;", "pizzeria", "", "isShortStreetNameEnabled", "", "b", "Lpu2;", "deliverablePlaceFormatter", "k", e.a, "l", "discount", "n", "f", "Lru/dodopizza/app/presentation/checkout/details/views/AddressView;", "Lk79;", "getAddressView", "()Lru/dodopizza/app/presentation/checkout/details/views/AddressView;", "addressView", "Lru/dodopizza/app/presentation/checkout/details/views/PizzeriaView;", "getPizzeriaView", "()Lru/dodopizza/app/presentation/checkout/details/views/PizzeriaView;", "pizzeriaView", "Lru/dodopizza/app/presentation/checkout/details/views/DeferredTimeView;", "getDeferredTimeView", "()Lru/dodopizza/app/presentation/checkout/details/views/DeferredTimeView;", "deferredTimeView", "Lru/dodopizza/app/presentation/checkout/details/views/OrderTypeSwitcher;", "getOrderTypeSwitcher", "()Lru/dodopizza/app/presentation/checkout/details/views/OrderTypeSwitcher;", "orderTypeSwitcher", "Landroid/view/View;", "getOrderTypeSwitcherSection", "()Landroid/view/View;", "orderTypeSwitcherSection", "Lcom/dodopizza/android/view/custom/badgebackgroundtextview/BadgeBackgroundTextView;", "getRestaurantDiscount", "()Lcom/dodopizza/android/view/custom/badgebackgroundtextview/BadgeBackgroundTextView;", "restaurantDiscount", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class OrderTypeView extends FrameLayout {
    static final /* synthetic */ je5<Object>[] g = {bc9.f(new ar8(OrderTypeView.class, "addressView", "getAddressView()Lru/dodopizza/app/presentation/checkout/details/views/AddressView;", 0)), bc9.f(new ar8(OrderTypeView.class, "pizzeriaView", "getPizzeriaView()Lru/dodopizza/app/presentation/checkout/details/views/PizzeriaView;", 0)), bc9.f(new ar8(OrderTypeView.class, "deferredTimeView", "getDeferredTimeView()Lru/dodopizza/app/presentation/checkout/details/views/DeferredTimeView;", 0)), bc9.f(new ar8(OrderTypeView.class, "orderTypeSwitcher", "getOrderTypeSwitcher()Lru/dodopizza/app/presentation/checkout/details/views/OrderTypeSwitcher;", 0)), bc9.f(new ar8(OrderTypeView.class, "orderTypeSwitcherSection", "getOrderTypeSwitcherSection()Landroid/view/View;", 0)), bc9.f(new ar8(OrderTypeView.class, "restaurantDiscount", "getRestaurantDiscount()Lcom/dodopizza/android/view/custom/badgebackgroundtextview/BadgeBackgroundTextView;", 0))};
    public static final int h = 8;
    private final k79 a;
    private final k79 b;
    private final k79 c;
    private final k79 d;
    private final k79 e;
    private final k79 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderTypeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.a = kb0.d(this, gy8.address_view);
        this.b = kb0.d(this, gy8.pizzeria_view);
        this.c = kb0.d(this, gy8.deferred_time_view);
        this.d = kb0.d(this, gy8.order_type_switcher);
        this.e = kb0.d(this, gy8.order_type_switcher_section);
        this.f = kb0.d(this, gy8.restaurant_discount_view);
        g();
    }

    private final int a(wk7 wk7Var, d41 d41Var) {
        if (z65.c(d41Var, d41.l.c)) {
            return c(wk7Var);
        }
        if (z65.c(d41Var, d41.m.c)) {
            return r09.pizzeria_is_temporarily_closed;
        }
        if (z65.c(d41Var, d41.v.c)) {
            return r09.undeliverable_address_error_description;
        }
        if (z65.c(d41Var, d41.f.c)) {
            return r09.pizzeria_delivery_stop;
        }
        if (z65.c(d41Var, d41.a.c)) {
            return r09.address_delivery_stop_2;
        }
        return r09.undeliverable_address_error_description;
    }

    private final String b(d88 d88Var, boolean z) {
        return g88.a(d88Var, z);
    }

    private final int c(wk7 wk7Var) {
        if (wk7Var instanceof nk9.b.C0456b) {
            return r09.pizzeria_will_be_open_at;
        }
        return r09.pizzeria_closed_by_schedule_error_description;
    }

    private final void d(nk9.b.C0456b c0456b, y41 y41Var, pv9 pv9Var) {
        String b = b(c0456b.e(), y41Var.j());
        mv9.a e = pv9Var.e(c0456b.e().H());
        int a = a(c0456b, c0456b.f());
        if (c0456b.f() instanceof d41.l) {
            getPizzeriaView().j(b, e, a);
        } else {
            getPizzeriaView().h(b, e, a);
        }
    }

    private final void g() {
        addView(LayoutInflater.from(getContext()).inflate(gz8.view_order_type, (ViewGroup) this, false));
    }

    private final View getOrderTypeSwitcherSection() {
        return (View) this.e.a(this, g[4]);
    }

    private final BadgeBackgroundTextView getRestaurantDiscount() {
        return (BadgeBackgroundTextView) this.f.a(this, g[5]);
    }

    private final void h(wk7 wk7Var, pt2 pt2Var, int i) {
        if ((pt2Var instanceof pt2.a) && pt2Var.a() == null && wk7Var.a() && i != 0) {
            getDeferredTimeView().g(i, ((pt2.a) pt2Var).b());
        } else {
            getDeferredTimeView().c();
        }
    }

    private final void i(wk7 wk7Var, pt2 pt2Var, vs2 vs2Var, int i) {
        un3.e(getDeferredTimeView());
        if (pt2Var.a() == null) {
            getDeferredTimeView().d();
        } else if (wk7Var instanceof uu2) {
            getDeferredTimeView().setDeliveryDeferredTime(vs2Var.b(pt2Var.a().longValue(), pt2Var.a().longValue() + nt2.a.a()));
        } else if (wk7Var instanceof bq0) {
            getDeferredTimeView().setCarryoutDeferredTime(vs2Var.a(pt2Var.a().longValue()));
        } else if (wk7Var instanceof nk9) {
            getDeferredTimeView().setRestaurantDeferredTime(vs2Var.a(pt2Var.a().longValue()));
        }
        if (pt2Var instanceof pt2.d) {
            getDeferredTimeView().h();
        } else if (pt2Var instanceof pt2.b) {
            d41 b = ((pt2.b) pt2Var).b();
            if (b instanceof d41.h) {
                getDeferredTimeView().f(((d41.h) b).b());
            } else if (b instanceof d41.k) {
                getDeferredTimeView().f(((d41.k) b).b());
            }
        }
        h(wk7Var, pt2Var, i);
    }

    private final void j() {
        getOrderTypeSwitcher().c();
        un3.e(getPizzeriaView());
        un3.k(getAddressView());
    }

    private final void m() {
        getOrderTypeSwitcher().d();
        un3.e(getAddressView());
        un3.k(getPizzeriaView());
    }

    public final void e() {
        un3.e(getOrderTypeSwitcherSection());
    }

    public final void f() {
        un3.e(getRestaurantDiscount());
    }

    public final AddressView getAddressView() {
        return (AddressView) this.a.a(this, g[0]);
    }

    public final DeferredTimeView getDeferredTimeView() {
        return (DeferredTimeView) this.c.a(this, g[2]);
    }

    public final OrderTypeSwitcher getOrderTypeSwitcher() {
        return (OrderTypeSwitcher) this.d.a(this, g[3]);
    }

    public final PizzeriaView getPizzeriaView() {
        return (PizzeriaView) this.b.a(this, g[1]);
    }

    public final void k(wk7 wk7Var, pt2 pt2Var, y41 y41Var, vs2 vs2Var, pu2 pu2Var, pv9 pv9Var) {
        z65.h(wk7Var, "orderType");
        z65.h(pt2Var, "deferredTime");
        z65.h(y41Var, "extraInfo");
        z65.h(vs2Var, "timeFormatter");
        z65.h(pu2Var, "deliverablePlaceFormatter");
        z65.h(pv9Var, "scheduleHelper");
        i(wk7Var, pt2Var, vs2Var, y41Var.b());
        getOrderTypeSwitcher().setEnabled(!wk7Var.c());
        if (wk7Var instanceof uu2) {
            j();
            uu2 uu2Var = (uu2) wk7Var;
            if (uu2Var instanceof uu2.c) {
                getAddressView().j(y41Var.c());
            } else if (uu2Var instanceof uu2.b) {
                getAddressView().l();
            } else if (uu2Var instanceof uu2.a.c) {
                uu2.a.c cVar = (uu2.a.c) wk7Var;
                getAddressView().i(pu2Var.c(cVar.e()), pu2Var.d(cVar.e()));
            } else if (uu2Var instanceof uu2.a.C0694a) {
                uu2.a.C0694a c0694a = (uu2.a.C0694a) wk7Var;
                getAddressView().h(pu2Var.c(c0694a.e()), pu2Var.d(c0694a.e()));
            } else if (uu2Var instanceof uu2.a.b) {
                uu2.a.b bVar = (uu2.a.b) wk7Var;
                getAddressView().k(pu2Var.c(bVar.e()), pu2Var.d(bVar.e()), a(wk7Var, bVar.f()));
            }
        } else if (wk7Var instanceof bq0) {
            m();
            bq0 bq0Var = (bq0) wk7Var;
            if (bq0Var instanceof bq0.b) {
                getPizzeriaView().l();
            } else if (bq0Var instanceof bq0.a.c) {
                bq0.a.c cVar2 = (bq0.a.c) wk7Var;
                getPizzeriaView().k(b(cVar2.e(), y41Var.j()), pv9Var.e(cVar2.e().o()));
            } else if (bq0Var instanceof bq0.a.C0072a) {
                bq0.a.C0072a c0072a = (bq0.a.C0072a) wk7Var;
                getPizzeriaView().i(b(c0072a.e(), y41Var.j()), pv9Var.e(c0072a.e().o()));
            } else if (bq0Var instanceof bq0.a.b) {
                bq0.a.b bVar2 = (bq0.a.b) wk7Var;
                getPizzeriaView().h(b(bVar2.e(), y41Var.j()), pv9Var.e(bVar2.e().o()), a(wk7Var, bVar2.f()));
            }
        } else if (wk7Var instanceof nk9) {
            m();
            nk9 nk9Var = (nk9) wk7Var;
            if (nk9Var instanceof nk9.a) {
                getPizzeriaView().l();
            } else if (nk9Var instanceof nk9.b.c) {
                nk9.b.c cVar3 = (nk9.b.c) wk7Var;
                getPizzeriaView().k(b(cVar3.e(), y41Var.j()), pv9Var.e(cVar3.e().H()));
            } else if (nk9Var instanceof nk9.b.a) {
                nk9.b.a aVar = (nk9.b.a) wk7Var;
                getPizzeriaView().i(b(aVar.e(), y41Var.j()), pv9Var.e(aVar.e().H()));
            } else if (nk9Var instanceof nk9.b.C0456b) {
                d((nk9.b.C0456b) wk7Var, y41Var, pv9Var);
            }
        }
    }

    public final void l() {
        un3.k(getOrderTypeSwitcherSection());
    }

    public final void n(String str) {
        z65.h(str, "discount");
        un3.k(getRestaurantDiscount());
        getRestaurantDiscount().setText(str);
    }
}
