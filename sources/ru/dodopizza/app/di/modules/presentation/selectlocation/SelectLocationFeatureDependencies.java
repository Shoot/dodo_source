package ru.dodopizza.app.di.modules.presentation.selectlocation;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
import ru.dodopizza.app.domain.country.CountryService;
/* compiled from: SelectLocationFeatureDependencies.kt */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8&X¦\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0014\u0010)\u001a\u00020&8&X¦\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0014\u0010-\u001a\u00020*8&X¦\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0014\u00101\u001a\u00020.8&X¦\u0004¢\u0006\u0006\u001a\u0004\b/\u00100R\u0014\u00105\u001a\u0002028&X¦\u0004¢\u0006\u0006\u001a\u0004\b3\u00104R\u0014\u00109\u001a\u0002068&X¦\u0004¢\u0006\u0006\u001a\u0004\b7\u00108R\u0014\u0010=\u001a\u00020:8&X¦\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<R\u0014\u0010A\u001a\u00020>8&X¦\u0004¢\u0006\u0006\u001a\u0004\b?\u0010@¨\u0006B"}, d2 = {"Lru/dodopizza/app/di/modules/presentation/selectlocation/SelectLocationFeatureDependencies;", "Ljm1;", "Lkx1;", DateTokenConverter.CONVERTER_KEY, "()Lkx1;", "ioDispatcher", "Lgc;", "a", "()Lgc;", "analytics", "Lf63;", "b", "()Lf63;", "router", "Lh97;", "i0", "()Lh97;", "onboardingData", "Lhq3;", c.a, "()Lhq3;", "featureService", "Lyo9;", "G0", "()Lyo9;", "routersContainer", "Lru/dodopizza/app/domain/country/CountryService;", e.a, "()Lru/dodopizza/app/domain/country/CountryService;", "countryService", "Ljv5;", "f", "()Ljv5;", "localityService", "Ls80;", "T", "()Ls80;", "baseUrlService", "Lv97;", "U2", "()Lv97;", "selectedCountryService", "Lk6a;", "K", "()Lk6a;", "selectLocationService", "Lmh0;", "i", "()Lmh0;", "buildInfo", "Ldv6;", "K0", "()Ldv6;", "navigatorHolder", "Ldo;", "j", "()Ldo;", "appInitializer", "Lbo;", "x", "()Lbo;", "appInitializationStateProvider", "Lnh5;", "S1", "()Lnh5;", "kustoAnalyticLocalityResolver", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public interface SelectLocationFeatureDependencies extends jm1 {
    yo9 G0();

    k6a K();

    dv6 K0();

    nh5 S1();

    s80 T();

    v97 U2();

    gc a();

    f63 b();

    hq3 c();

    kx1 d();

    CountryService e();

    jv5 f();

    mh0 i();

    h97 i0();

    Cdo j();

    bo x();
}
