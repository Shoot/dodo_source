package com.dodopizza.order.feature.selectionmap;

import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
import ru.dodopizza.app.domain.country.CountryService;
/* compiled from: SelectionMapFeatureDependencies.kt */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8&X¦\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0014\u0010)\u001a\u00020&8&X¦\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0014\u0010-\u001a\u00020*8&X¦\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0014\u00101\u001a\u00020.8&X¦\u0004¢\u0006\u0006\u001a\u0004\b/\u00100R\u0014\u00105\u001a\u0002028&X¦\u0004¢\u0006\u0006\u001a\u0004\b3\u00104¨\u00066"}, d2 = {"Lcom/dodopizza/order/feature/selectionmap/SelectionMapFeatureDependencies;", "Ljm1;", "Lgc;", "a", "()Lgc;", "analytics", "Lf63;", "b", "()Lf63;", "router", "Lje4;", "k", "()Lje4;", "geoLocationProviderFactory", "Lhq3;", c.a, "()Lhq3;", "featureService", "Lr43;", "L", "()Lr43;", "distanceMeasurer", "Lwv5;", "p", "()Lwv5;", "locationPermissionChecker", "Le98;", "z", "()Le98;", "pizzeriaService", "Lpv9;", "H", "()Lpv9;", "scheduleHelper", "Ln43;", "v", "()Ln43;", "distanceFormatter", "Lre4;", "R", "()Lre4;", "geocodeService", "Lru/dodopizza/app/domain/country/CountryService;", e.a, "()Lru/dodopizza/app/domain/country/CountryService;", "countryService", "Lla8;", "a0", "()Lla8;", "pizzeriasFiltersService", "Lvg7;", "B", "()Lvg7;", "orderPizzeriaStateService", "order_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public interface SelectionMapFeatureDependencies extends jm1 {
    vg7 B();

    pv9 H();

    r43 L();

    re4 R();

    gc a();

    la8 a0();

    f63 b();

    hq3 c();

    CountryService e();

    je4 k();

    wv5 p();

    n43 v();

    e98 z();
}
