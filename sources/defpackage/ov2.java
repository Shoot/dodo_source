package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.geo.feature.deliveryaddresslist.presentation.DeliveryAddressListPresenter;
import com.dodopizza.geo.feature.deliveryaddresslist.presentation.a;
import com.dodopizza.geo.feature.deliveryaddresslist.presentation.b;
import com.dodopizza.geo.feature.deliveryaddresslist.presentation.d;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
/* compiled from: DeliveryAddressListModule.kt */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b%\u0010&J0\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0007J@\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0007J\u0018\u0010\u001f\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0007J\u0018\u0010\"\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010!\u001a\u00020 H\u0007J\u0010\u0010#\u001a\u00020 2\u0006\u0010\u000b\u001a\u00020\nH\u0007J\b\u0010$\u001a\u00020\u001dH\u0007¨\u0006'"}, d2 = {"Lov2;", "", "Liv2;", "args", "Lcom/dodopizza/geo/feature/deliveryaddresslist/presentation/c;", "routingHandler", "Lcom/dodopizza/geo/feature/deliveryaddresslist/presentation/a;", "interactor", "Lgc;", "analytics", "Lhq3;", "featureService", "Lcom/dodopizza/geo/feature/deliveryaddresslist/presentation/DeliveryAddressListPresenter;", e.a, "Lk9a;", "selectedDeliveryAddressHandler", "Lx42;", "customerAddressService", "Lpu2;", "deliverablePlaceFormatter", "Lj9a;", "selectedAddressState", "Lk6a;", "selectLocationService", "Lcom/dodopizza/geo/feature/deliveryaddresslist/presentation/d;", "onDeliveryLocationSetToStateListener", DateTokenConverter.CONVERTER_KEY, "Lh8;", "addressFormatter", "Lly2;", "deliveryLocationFormatter", c.a, "Li8;", "addressFormatterFactory", "a", "b", "f", "<init>", "()V", "geo_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: ov2  reason: default package */
/* loaded from: classes2.dex */
public final class ov2 {
    public static final ov2 a = new ov2();

    private ov2() {
    }

    public final h8 a(iv2 iv2Var, i8 i8Var) {
        z65.h(iv2Var, "args");
        z65.h(i8Var, "addressFormatterFactory");
        return i8Var.a(iv2Var.b());
    }

    public final i8 b(hq3 hq3Var) {
        z65.h(hq3Var, "featureService");
        return new i8(hq3Var);
    }

    public final pu2 c(h8 h8Var, ly2 ly2Var) {
        z65.h(h8Var, "addressFormatter");
        z65.h(ly2Var, "deliveryLocationFormatter");
        return new qu2(h8Var, ly2Var);
    }

    public final a d(k9a k9aVar, iv2 iv2Var, x42 x42Var, pu2 pu2Var, j9a j9aVar, k6a k6aVar, d dVar) {
        z65.h(k9aVar, "selectedDeliveryAddressHandler");
        z65.h(iv2Var, "args");
        z65.h(x42Var, "customerAddressService");
        z65.h(pu2Var, "deliverablePlaceFormatter");
        z65.h(j9aVar, "selectedAddressState");
        z65.h(k6aVar, "selectLocationService");
        z65.h(dVar, "onDeliveryLocationSetToStateListener");
        return new b(k9aVar, iv2Var, x42Var, pu2Var, j9aVar, k6aVar, dVar);
    }

    public final DeliveryAddressListPresenter e(iv2 iv2Var, com.dodopizza.geo.feature.deliveryaddresslist.presentation.c cVar, a aVar, gc gcVar, hq3 hq3Var) {
        z65.h(iv2Var, "args");
        z65.h(cVar, "routingHandler");
        z65.h(aVar, "interactor");
        z65.h(gcVar, "analytics");
        z65.h(hq3Var, "featureService");
        return new DeliveryAddressListPresenter(iv2Var, aVar, gcVar, hq3Var, cVar);
    }

    public final ly2 f() {
        return new my2();
    }
}
