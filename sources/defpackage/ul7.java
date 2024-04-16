package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.bq0;
import defpackage.cj6;
import defpackage.d41;
import defpackage.fx2;
import defpackage.nk9;
import defpackage.uu2;
import kotlin.Metadata;
/* compiled from: OrderTypeViewBinder.kt */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u001d\u001a\u00020\u001b\u0012\u0006\u0010 \u001a\u00020\u001e\u0012\u0006\u0010#\u001a\u00020!¢\u0006\u0004\b$\u0010%J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0018\u0010\n\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\r\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0018\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J \u0010\u0012\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0002J\u0014\u0010\u0017\u001a\u0004\u0018\u00010\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002J&\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0018R\u0014\u0010\u001d\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001cR\u0014\u0010 \u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001fR\u0014\u0010#\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\"¨\u0006&"}, d2 = {"Lul7;", "", "Lbo3;", "extraInfo", "Ltl7;", "viewState", "Lb61;", "state", "", DateTokenConverter.CONVERTER_KEY, "f", "Lfx2$a;", "deliveryFee", "g", "Lcj6$b;", "dynamicMinDeliveryPriceInfo", Image.TYPE_HIGH, "checkoutState", e.a, "Ld88;", "pizzeria", "", "b", c.a, "", "handleErrors", "a", "Lpu2;", "Lpu2;", "deliverablePlaceFormatter", "Lhq3;", "Lhq3;", "featureService", "Lpv9;", "Lpv9;", "scheduleHelper", "<init>", "(Lpu2;Lhq3;Lpv9;)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: ul7  reason: default package */
/* loaded from: classes2.dex */
public final class ul7 {
    private final pu2 a;
    private final hq3 b;
    private final pv9 c;

    public ul7(pu2 pu2Var, hq3 hq3Var, pv9 pv9Var) {
        z65.h(pu2Var, "deliverablePlaceFormatter");
        z65.h(hq3Var, "featureService");
        z65.h(pv9Var, "scheduleHelper");
        this.a = pu2Var;
        this.b = hq3Var;
        this.c = pv9Var;
    }

    private final String b(d88 d88Var) {
        return g88.a(d88Var, this.b.a(bq3.q));
    }

    private final String c(d88 d88Var) {
        mv9 H;
        if (d88Var != null && (H = d88Var.H()) != null) {
            return this.c.e(H).b();
        }
        return null;
    }

    private final void d(bo3 bo3Var, tl7 tl7Var, b61 b61Var) {
        if (this.b.a(bq3.a5)) {
            f(bo3Var, tl7Var);
            if (b61Var.i().c() instanceof fx2.b) {
                if (this.b.a(bq3.g6) && (b61Var.i().f() instanceof cj6.b) && ((cj6.b) b61Var.i().f()).f().e()) {
                    h(tl7Var, (cj6.b) b61Var.i().f());
                } else {
                    tl7Var.j3();
                }
            }
        }
        if (this.b.a(bq3.b5)) {
            f(bo3Var, tl7Var);
            if (b61Var.i().c() instanceof fx2.a) {
                g(tl7Var, (fx2.a) b61Var.i().c());
            }
        }
    }

    private final void e(tl7 tl7Var, b61 b61Var, bo3 bo3Var) {
        d41 d41Var;
        if (bo3Var.c() != null) {
            tl7Var.N3();
            tl7Var.c7(bo3Var.c());
            return;
        }
        wk7 k = b61Var.k();
        if (k instanceof bq0.a.b) {
            d41Var = ((bq0.a.b) k).f();
        } else if (k instanceof nk9.b.C0456b) {
            d41Var = ((nk9.b.C0456b) k).f();
        } else if (k instanceof uu2.a.b) {
            d41Var = ((uu2.a.b) k).f();
        } else {
            d41Var = null;
        }
        if (d41Var instanceof d41.a) {
            tl7Var.W1();
            tl7Var.N3();
        } else if (d41Var instanceof d41.v) {
            tl7Var.wb();
            tl7Var.N3();
        } else if (d41Var instanceof d41.f) {
            tl7Var.Mf();
            tl7Var.N3();
        } else if (d41Var instanceof d41.m) {
            tl7Var.z9();
            tl7Var.N3();
        } else if (d41Var instanceof d41.l) {
            tl7Var.S1(c(yk7.a(b61Var.k())));
            tl7Var.N3();
        } else {
            tl7Var.n8();
        }
    }

    private final void f(bo3 bo3Var, tl7 tl7Var) {
        if (bo3Var.a() != 0) {
            tl7Var.j8(bo3Var.a());
        }
    }

    private final void g(tl7 tl7Var, fx2.a aVar) {
        if (z65.c(aVar.a().c(), aVar.a().d())) {
            tl7Var.bh(un6.b(aVar.a().c()));
            return;
        }
        String a = un6.a(aVar.a().c());
        String b = un6.b(aVar.a().d());
        tl7Var.bh(a + " - " + b);
    }

    private final void h(tl7 tl7Var, cj6.b bVar) {
        int i;
        int i2;
        hn6 f = bVar.f();
        hn6 j = bVar.j();
        boolean a = this.b.a(bq3.h6);
        if (a) {
            i = ew8.A;
        } else {
            i = ew8.C;
        }
        if (!a && f.a() < j.a()) {
            i2 = r09.min_delivery_price_message_order_from_decreased_value;
        } else {
            i2 = r09.min_delivery_price_message_order_from;
        }
        if (bVar.l()) {
            tl7Var.P4(j, f, i, i2);
        } else {
            tl7Var.Ia(f);
        }
    }

    public final void a(tl7 tl7Var, b61 b61Var, bo3 bo3Var, boolean z) {
        z65.h(tl7Var, "viewState");
        z65.h(b61Var, "state");
        z65.h(bo3Var, "extraInfo");
        tl7Var.c4();
        tl7Var.fg();
        wk7 k = b61Var.k();
        if (k instanceof uu2.c) {
            tl7Var.e9();
            tl7Var.Mg();
            tl7Var.r1(true);
            tl7Var.r6();
            tl7Var.z7();
        } else if (k instanceof uu2.b) {
            tl7Var.showLoader();
            tl7Var.Jb();
            tl7Var.r1(false);
            tl7Var.r6();
            tl7Var.z7();
        } else if (k instanceof uu2.a.c) {
            tl7Var.showLoader();
            tl7Var.Jb();
            tl7Var.r1(false);
            tl7Var.r6();
            tl7Var.A0(this.a.b(((uu2.a.c) k).e()));
        } else if (k instanceof uu2.a.C0694a) {
            tl7Var.c9();
            tl7Var.ge();
            tl7Var.r1(true);
            tl7Var.r6();
            d(bo3Var, tl7Var, b61Var);
            tl7Var.A0(this.a.b(((uu2.a.C0694a) k).e()));
        } else if (k instanceof uu2.a.b) {
            tl7Var.c9();
            tl7Var.ge();
            tl7Var.r1(true);
            tl7Var.r6();
            tl7Var.A0(this.a.b(((uu2.a.b) k).e()));
        } else if (k instanceof bq0.b) {
            tl7Var.e9();
            tl7Var.Mg();
            tl7Var.r1(true);
            tl7Var.N9();
            tl7Var.t4();
        } else if (k instanceof bq0.a.c) {
            tl7Var.showLoader();
            tl7Var.Jb();
            tl7Var.r1(false);
            tl7Var.N9();
            tl7Var.A0(b(((bq0.a.c) k).e()));
        } else if (k instanceof bq0.a.C0072a) {
            tl7Var.af();
            tl7Var.ge();
            tl7Var.r1(true);
            tl7Var.N9();
            tl7Var.A0(b(((bq0.a.C0072a) k).e()));
        } else if (k instanceof bq0.a.b) {
            tl7Var.af();
            tl7Var.ge();
            tl7Var.r1(true);
            tl7Var.N9();
            tl7Var.A0(b(((bq0.a.b) k).e()));
        } else if (k instanceof nk9.a) {
            tl7Var.e9();
            tl7Var.Mg();
            tl7Var.r1(true);
            tl7Var.N9();
            tl7Var.x7();
        } else if (k instanceof nk9.b.c) {
            tl7Var.showLoader();
            tl7Var.Jb();
            tl7Var.r1(false);
            tl7Var.N9();
            tl7Var.A0(b(((nk9.b.c) k).e()));
        } else if (k instanceof nk9.b.a) {
            tl7Var.K3();
            tl7Var.ge();
            tl7Var.r1(true);
            tl7Var.N9();
            tl7Var.A0(b(((nk9.b.a) k).e()));
        } else if (k instanceof nk9.b.C0456b) {
            tl7Var.K3();
            tl7Var.ge();
            tl7Var.r1(true);
            tl7Var.N9();
            tl7Var.A0(b(((nk9.b.C0456b) k).e()));
        }
        if (z) {
            e(tl7Var, b61Var, bo3Var);
        }
    }
}
