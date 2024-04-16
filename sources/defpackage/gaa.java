package defpackage;

import com.dodopizza.order.feature.selectionmap.presentation.f;
import com.dodopizza.order.feature.selectionmap.presentation.g;
import com.dodopizza.order.feature.selectionmap.presentation.h;
import kotlin.Metadata;
import ru.dodopizza.app.domain.country.CountryService;
/* compiled from: SelectionMapModule.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001b\u0010\u001cJH\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0007J \u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0007¨\u0006\u001d"}, d2 = {"Lgaa;", "", "Lcom/dodopizza/order/feature/selectionmap/presentation/f;", "data", "Le98;", "pizzeriaService", "Lx88;", "pizzeriaMapper", "Lre4;", "geocodeService", "Lru/dodopizza/app/domain/country/CountryService;", "countryService", "Lgc;", "analytics", "Lvg7;", "orderPizzeriaStateService", "Lhq3;", "featureService", "Lcom/dodopizza/order/feature/selectionmap/presentation/g;", "b", "Lpv9;", "scheduleHelper", "Lr43;", "distanceMeasurer", "Ln43;", "distanceFormatter", "a", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: gaa  reason: default package */
/* loaded from: classes2.dex */
public final class gaa {
    public static final gaa a = new gaa();

    private gaa() {
    }

    public final x88 a(pv9 pv9Var, r43 r43Var, n43 n43Var) {
        z65.h(pv9Var, "scheduleHelper");
        z65.h(r43Var, "distanceMeasurer");
        z65.h(n43Var, "distanceFormatter");
        return new y88(pv9Var, r43Var, n43Var);
    }

    public final g b(f fVar, e98 e98Var, x88 x88Var, re4 re4Var, CountryService countryService, gc gcVar, vg7 vg7Var, hq3 hq3Var) {
        z65.h(fVar, "data");
        z65.h(e98Var, "pizzeriaService");
        z65.h(x88Var, "pizzeriaMapper");
        z65.h(re4Var, "geocodeService");
        z65.h(countryService, "countryService");
        z65.h(gcVar, "analytics");
        z65.h(vg7Var, "orderPizzeriaStateService");
        z65.h(hq3Var, "featureService");
        return new h(fVar, e98Var, x88Var, re4Var, countryService, gcVar, vg7Var, hq3Var);
    }
}
