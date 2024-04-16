package com.dodopizza.geo.feature.deliveryaddressmap;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
import ru.dodopizza.app.domain.country.CountryService;
/* compiled from: DeliveryAddressMapFeatureDependencies.kt */
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8&X¦\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0014\u0010)\u001a\u00020&8&X¦\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0014\u0010-\u001a\u00020*8&X¦\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0014\u00101\u001a\u00020.8&X¦\u0004¢\u0006\u0006\u001a\u0004\b/\u00100R\u0014\u00105\u001a\u0002028&X¦\u0004¢\u0006\u0006\u001a\u0004\b3\u00104R\u0014\u00109\u001a\u0002068&X¦\u0004¢\u0006\u0006\u001a\u0004\b7\u00108R\u0014\u0010=\u001a\u00020:8&X¦\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<R\u0014\u0010A\u001a\u00020>8&X¦\u0004¢\u0006\u0006\u001a\u0004\b?\u0010@R\u0014\u0010E\u001a\u00020B8&X¦\u0004¢\u0006\u0006\u001a\u0004\bC\u0010DR\u0014\u0010I\u001a\u00020F8&X¦\u0004¢\u0006\u0006\u001a\u0004\bG\u0010H¨\u0006J"}, d2 = {"Lcom/dodopizza/geo/feature/deliveryaddressmap/DeliveryAddressMapFeatureDependencies;", "Ljm1;", "Lkx1;", DateTokenConverter.CONVERTER_KEY, "()Lkx1;", "ioDispatcher", "Lqx1;", "a4", "()Lqx1;", "coroutineProcessScope", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lf63;", "b", "()Lf63;", "router", "Lgc;", "a", "()Lgc;", "analytics", "Lwv5;", "p", "()Lwv5;", "locationPermissionChecker", "Lht4;", "T3", "()Lht4;", "identifierGenerator", "Lhq3;", c.a, "()Lhq3;", "featureService", "Lre4;", "R", "()Lre4;", "geocodeService", "Lru/dodopizza/app/domain/country/CountryService;", e.a, "()Lru/dodopizza/app/domain/country/CountryService;", "countryService", "Ljv5;", "f", "()Ljv5;", "localityService", "Lje4;", "k", "()Lje4;", "geoLocationProviderFactory", "Li00;", "g", "()Li00;", "authorizationState", "Lx42;", "n", "()Lx42;", "customerAddressService", "Ley7;", "O3", "()Ley7;", "notificationPermissionChecker", "Lci8;", "G", "()Lci8;", "preferencesAssetsDataSource", "Lm52;", "r0", "()Lm52;", "customerPhoneNumberService", "Lb7;", "p0", "()Lb7;", "addressCatcherSubscriptionService", "geo_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public interface DeliveryAddressMapFeatureDependencies extends jm1 {
    ci8 G();

    ey7 O3();

    re4 R();

    ht4 T3();

    gc a();

    qx1 a4();

    f63 b();

    hq3 c();

    kx1 d();

    CountryService e();

    jv5 f();

    i00 g();

    Context getContext();

    je4 k();

    x42 n();

    wv5 p();

    b7 p0();

    m52 r0();
}
