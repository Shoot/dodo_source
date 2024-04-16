package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.order.feature.menu.ordertypeswitcher.d;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
import ru.dodopizza.app.presentation.main.a;
/* compiled from: OrderTypeSwitcherModule.kt */
@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b4\u00105J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007Jx\u0010'\u001a\u00020&2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$H\u0007J&\u0010/\u001a\u00020.2\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020\u00162\f\u0010-\u001a\b\u0012\u0004\u0012\u00020,0+H\u0007J\u0010\u00103\u001a\u0002022\u0006\u00101\u001a\u000200H\u0007¨\u00066"}, d2 = {"Lll7;", "", "Lpu2;", "deliverablePlaceFormatter", "Lhq3;", "featureService", "Lpv9;", "scheduleHelper", "Lul7;", e.a, "Lx1b;", DateTokenConverter.CONVERTER_KEY, "Lgy3;", "firebaseToggleService", "Lv61;", "checkoutStateService", "Lx42;", "customerAddressService", "Li00;", "authorizationState", "Lv52;", "customerSettingsService", "Ldt5;", "locality", "Le98;", "pizzeriaService", "Lok7;", "orderTypeDiscountFormatter", "Ltk7;", "orderTypeDiscountService", "Lava;", "stateProvider", "Lld9;", "remoteConfigService", "Lbo;", "appInitializationStateProvider", "Ldua;", "stateAnalyzer", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/d;", "a", "Lf63;", "router", "currentLocality", "Las8;", "Lay1;", "countryProvider", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/c;", c.a, "Lru/dodopizza/app/presentation/main/a;", "impl", "Lr75;", "b", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: ll7  reason: default package */
/* loaded from: classes3.dex */
public final class ll7 {
    public static final ll7 a = new ll7();

    private ll7() {
    }

    public final d a(gy3 gy3Var, v61 v61Var, x42 x42Var, i00 i00Var, hq3 hq3Var, v52 v52Var, dt5 dt5Var, e98 e98Var, ok7 ok7Var, tk7 tk7Var, ava avaVar, ld9 ld9Var, bo boVar, dua duaVar) {
        z65.h(gy3Var, "firebaseToggleService");
        z65.h(v61Var, "checkoutStateService");
        z65.h(x42Var, "customerAddressService");
        z65.h(i00Var, "authorizationState");
        z65.h(hq3Var, "featureService");
        z65.h(v52Var, "customerSettingsService");
        z65.h(dt5Var, "locality");
        z65.h(e98Var, "pizzeriaService");
        z65.h(ok7Var, "orderTypeDiscountFormatter");
        z65.h(tk7Var, "orderTypeDiscountService");
        z65.h(avaVar, "stateProvider");
        z65.h(ld9Var, "remoteConfigService");
        z65.h(boVar, "appInitializationStateProvider");
        z65.h(duaVar, "stateAnalyzer");
        return new com.dodopizza.order.feature.menu.ordertypeswitcher.e(gy3Var, v61Var, x42Var, i00Var, ck1.e, hq3Var, v52Var, dt5Var, e98Var, ok7Var, tk7Var, avaVar, ld9Var, boVar, duaVar);
    }

    public final r75 b(a aVar) {
        z65.h(aVar, "impl");
        return aVar;
    }

    public final com.dodopizza.order.feature.menu.ordertypeswitcher.c c(f63 f63Var, dt5 dt5Var, as8<ay1> as8Var) {
        z65.h(f63Var, "router");
        z65.h(dt5Var, "currentLocality");
        z65.h(as8Var, "countryProvider");
        return new gl7(f63Var, dt5Var, as8Var);
    }

    public final x1b d(pu2 pu2Var) {
        z65.h(pu2Var, "deliverablePlaceFormatter");
        return new x1b(pu2Var);
    }

    public final ul7 e(pu2 pu2Var, hq3 hq3Var, pv9 pv9Var) {
        z65.h(pu2Var, "deliverablePlaceFormatter");
        z65.h(hq3Var, "featureService");
        z65.h(pv9Var, "scheduleHelper");
        return new ul7(pu2Var, hq3Var, pv9Var);
    }
}
