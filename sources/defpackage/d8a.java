package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import ru.dodopizza.app.presentation.selectpizzeria.SelectPizzeriaPresenter;
import ru.dodopizza.app.presentation.selectpizzeria.combined.SelectPizzeriaCombinedViewPresenter;
import ru.dodopizza.app.presentation.selectpizzeria.combined.SelectPizzeriaWithGoogleMapsPresenter;
/* compiled from: SelectPizzeriaModule.kt */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b-\u0010.JH\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0007JP\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0007JP\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0007J0\u0010\"\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 H\u0007J \u0010'\u001a\u00020 2\u0006\u0010$\u001a\u00020#2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010&\u001a\u00020%H\u0007J\u0010\u0010(\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0016H\u0007J\u0010\u0010+\u001a\u00020\u00142\u0006\u0010*\u001a\u00020)H\u0007J\b\u0010,\u001a\u00020)H\u0007¨\u0006/"}, d2 = {"Ld8a;", "", "La8a;", "interactor", "Lhq3;", "featureService", "Lf63;", "router", "Lgc;", "analytics", "Lwv5;", "locationPermissionChecker", "Lew5;", "locationSettingsChecker", "Lu88;", "pizzeriaMapHelper", "Lx7a;", "data", "Lru/dodopizza/app/presentation/selectpizzeria/SelectPizzeriaPresenter;", "g", "Lka8;", "pizzeriasFilterService", "Lr43;", "distanceMeasurer", "Lru/dodopizza/app/presentation/selectpizzeria/combined/SelectPizzeriaCombinedViewPresenter;", "a", "Lru/dodopizza/app/presentation/selectpizzeria/combined/SelectPizzeriaWithGoogleMapsPresenter;", Image.TYPE_HIGH, "Le98;", "pizzeriaService", "Lvg7;", "orderPizzeriaStateService", "Lx88;", "pizzeriaMapper", "b", "Lpv9;", "scheduleHelper", "Ln43;", "distanceFormatter", c.a, e.a, "Lfa8;", "pizzeriasFiltersRepository", DateTokenConverter.CONVERTER_KEY, "f", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: d8a  reason: default package */
/* loaded from: classes3.dex */
public final class d8a {
    public final SelectPizzeriaCombinedViewPresenter a(a8a a8aVar, hq3 hq3Var, f63 f63Var, gc gcVar, wv5 wv5Var, u88 u88Var, x7a x7aVar, ka8 ka8Var, r43 r43Var) {
        z65.h(a8aVar, "interactor");
        z65.h(hq3Var, "featureService");
        z65.h(f63Var, "router");
        z65.h(gcVar, "analytics");
        z65.h(wv5Var, "locationPermissionChecker");
        z65.h(u88Var, "pizzeriaMapHelper");
        z65.h(x7aVar, "data");
        z65.h(ka8Var, "pizzeriasFilterService");
        z65.h(r43Var, "distanceMeasurer");
        return new SelectPizzeriaCombinedViewPresenter(a8aVar, hq3Var, f63Var, gcVar, wv5Var, u88Var, x7aVar, ka8Var, r43Var);
    }

    public final a8a b(x7a x7aVar, e98 e98Var, gc gcVar, vg7 vg7Var, x88 x88Var) {
        z65.h(x7aVar, "data");
        z65.h(e98Var, "pizzeriaService");
        z65.h(gcVar, "analytics");
        z65.h(vg7Var, "orderPizzeriaStateService");
        z65.h(x88Var, "pizzeriaMapper");
        return new b8a(x7aVar, e98Var, gcVar, vg7Var, x88Var);
    }

    public final x88 c(pv9 pv9Var, r43 r43Var, n43 n43Var) {
        z65.h(pv9Var, "scheduleHelper");
        z65.h(r43Var, "distanceMeasurer");
        z65.h(n43Var, "distanceFormatter");
        return new y88(pv9Var, r43Var, n43Var);
    }

    public final ka8 d(fa8 fa8Var) {
        z65.h(fa8Var, "pizzeriasFiltersRepository");
        return new ma8(fa8Var);
    }

    public final u88 e(r43 r43Var) {
        z65.h(r43Var, "distanceMeasurer");
        return new w88(r43Var);
    }

    public final fa8 f() {
        return new ha8();
    }

    public final SelectPizzeriaPresenter g(a8a a8aVar, hq3 hq3Var, f63 f63Var, gc gcVar, wv5 wv5Var, ew5 ew5Var, u88 u88Var, x7a x7aVar) {
        z65.h(a8aVar, "interactor");
        z65.h(hq3Var, "featureService");
        z65.h(f63Var, "router");
        z65.h(gcVar, "analytics");
        z65.h(wv5Var, "locationPermissionChecker");
        z65.h(ew5Var, "locationSettingsChecker");
        z65.h(u88Var, "pizzeriaMapHelper");
        z65.h(x7aVar, "data");
        return new SelectPizzeriaPresenter(a8aVar, hq3Var, f63Var, gcVar, wv5Var, ew5Var, u88Var, x7aVar);
    }

    public final SelectPizzeriaWithGoogleMapsPresenter h(a8a a8aVar, hq3 hq3Var, f63 f63Var, gc gcVar, wv5 wv5Var, u88 u88Var, x7a x7aVar, ka8 ka8Var, r43 r43Var) {
        z65.h(a8aVar, "interactor");
        z65.h(hq3Var, "featureService");
        z65.h(f63Var, "router");
        z65.h(gcVar, "analytics");
        z65.h(wv5Var, "locationPermissionChecker");
        z65.h(u88Var, "pizzeriaMapHelper");
        z65.h(x7aVar, "data");
        z65.h(ka8Var, "pizzeriasFilterService");
        z65.h(r43Var, "distanceMeasurer");
        return new SelectPizzeriaWithGoogleMapsPresenter(a8aVar, hq3Var, f63Var, gcVar, wv5Var, u88Var, x7aVar, ka8Var, r43Var);
    }
}
