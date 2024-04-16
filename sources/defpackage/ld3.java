package defpackage;

import com.dodopizza.geo.feature.deliveryaddresslist.presentation.d;
import com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.a;
import com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.e;
import com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.f;
import kotlin.Metadata;
import ru.dodopizza.app.domain.country.CountryService;
/* compiled from: EditDeliveryAddressMapModule.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0018\u0010\u0019JX\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¨\u0006\u001a"}, d2 = {"Lld3;", "", "Lre4;", "geocodeService", "Lru/dodopizza/app/domain/country/CountryService;", "countryService", "Lh7;", "addressDetailsFieldDesignService", "Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/a;", "data", "Lx42;", "customerAddressService", "Lk6a;", "selectLocationService", "Lcom/dodopizza/geo/feature/deliveryaddresslist/presentation/d;", "onDeliveryLocationSetToStateListener", "Lk9a;", "selectedDeliveryAddressHandler", "Li00;", "authorizationState", "Lb7;", "addressCatcherSubscriptionService", "Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/e;", "a", "<init>", "()V", "geo_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: ld3  reason: default package */
/* loaded from: classes2.dex */
public final class ld3 {
    public static final ld3 a = new ld3();

    private ld3() {
    }

    public final e a(re4 re4Var, CountryService countryService, h7 h7Var, a aVar, x42 x42Var, k6a k6aVar, d dVar, k9a k9aVar, i00 i00Var, b7 b7Var) {
        z65.h(re4Var, "geocodeService");
        z65.h(countryService, "countryService");
        z65.h(h7Var, "addressDetailsFieldDesignService");
        z65.h(aVar, "data");
        z65.h(x42Var, "customerAddressService");
        z65.h(k6aVar, "selectLocationService");
        z65.h(dVar, "onDeliveryLocationSetToStateListener");
        z65.h(k9aVar, "selectedDeliveryAddressHandler");
        z65.h(i00Var, "authorizationState");
        z65.h(b7Var, "addressCatcherSubscriptionService");
        return new f(re4Var, countryService, h7Var, x42Var, k6aVar, dVar, k9aVar, aVar, i00Var, b7Var);
    }
}
