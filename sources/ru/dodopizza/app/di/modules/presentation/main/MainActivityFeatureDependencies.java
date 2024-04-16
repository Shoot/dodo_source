package ru.dodopizza.app.di.modules.presentation.main;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import ru.dodopizza.app.domain.DodopizzaApi;
import ru.dodopizza.app.domain.country.CountryService;
import ru.dodopizza.app.presentation.main.a;
/* compiled from: MainActivityFeatureDependencies.kt */
@Metadata(d1 = {"\u0000\u0098\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8&X¦\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0014\u0010)\u001a\u00020&8&X¦\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0014\u0010-\u001a\u00020*8&X¦\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0014\u00101\u001a\u00020.8&X¦\u0004¢\u0006\u0006\u001a\u0004\b/\u00100R\u0014\u00105\u001a\u0002028&X¦\u0004¢\u0006\u0006\u001a\u0004\b3\u00104R\u0014\u00109\u001a\u0002068&X¦\u0004¢\u0006\u0006\u001a\u0004\b7\u00108R\u0014\u0010=\u001a\u00020:8&X¦\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<R\u0014\u0010A\u001a\u00020>8&X¦\u0004¢\u0006\u0006\u001a\u0004\b?\u0010@R\u0014\u0010E\u001a\u00020B8&X¦\u0004¢\u0006\u0006\u001a\u0004\bC\u0010DR\u0014\u0010I\u001a\u00020F8&X¦\u0004¢\u0006\u0006\u001a\u0004\bG\u0010HR\u0014\u0010M\u001a\u00020J8&X¦\u0004¢\u0006\u0006\u001a\u0004\bK\u0010LR\u0014\u0010Q\u001a\u00020N8&X¦\u0004¢\u0006\u0006\u001a\u0004\bO\u0010PR\u0014\u0010U\u001a\u00020R8&X¦\u0004¢\u0006\u0006\u001a\u0004\bS\u0010TR\u0014\u0010Y\u001a\u00020V8&X¦\u0004¢\u0006\u0006\u001a\u0004\bW\u0010XR\u0014\u0010]\u001a\u00020Z8&X¦\u0004¢\u0006\u0006\u001a\u0004\b[\u0010\\R\u0014\u0010a\u001a\u00020^8&X¦\u0004¢\u0006\u0006\u001a\u0004\b_\u0010`R\u0014\u0010e\u001a\u00020b8&X¦\u0004¢\u0006\u0006\u001a\u0004\bc\u0010dR\u0014\u0010i\u001a\u00020f8&X¦\u0004¢\u0006\u0006\u001a\u0004\bg\u0010hR\u0014\u0010m\u001a\u00020j8&X¦\u0004¢\u0006\u0006\u001a\u0004\bk\u0010lR\u0014\u0010q\u001a\u00020n8&X¦\u0004¢\u0006\u0006\u001a\u0004\bo\u0010pR\u0014\u0010u\u001a\u00020r8&X¦\u0004¢\u0006\u0006\u001a\u0004\bs\u0010tR\u0014\u0010y\u001a\u00020v8&X¦\u0004¢\u0006\u0006\u001a\u0004\bw\u0010xR\u0014\u0010}\u001a\u00020z8&X¦\u0004¢\u0006\u0006\u001a\u0004\b{\u0010|R\u0016\u0010\u0081\u0001\u001a\u00020~8&X¦\u0004¢\u0006\u0007\u001a\u0005\b\u007f\u0010\u0080\u0001R\u0018\u0010\u0085\u0001\u001a\u00030\u0082\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001R\u0018\u0010\u0089\u0001\u001a\u00030\u0086\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001¨\u0006\u008a\u0001"}, d2 = {"Lru/dodopizza/app/di/modules/presentation/main/MainActivityFeatureDependencies;", "Ljm1;", "Lkx1;", DateTokenConverter.CONVERTER_KEY, "()Lkx1;", "ioDispatcher", "Lqx1;", "q", "()Lqx1;", "processScope", "Lf63;", "b", "()Lf63;", "router", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Ldo;", "j", "()Ldo;", "appInitializer", "Ldv6;", "K0", "()Ldv6;", "navigatorHolder", "Lxr0;", "G1", "()Lxr0;", "cartQueueProcessService", "Lug4;", "q3", "()Lug4;", "googlePayHandler", "Lmy7;", "Y2", "()Lmy7;", "permissionHandler", "Lci8;", "G", "()Lci8;", "preferencesAssetsDataSource", "Lgc;", "a", "()Lgc;", "analytics", "Lhp;", "P", "()Lhp;", "appStateProvider", "Lvc6;", "g0", "()Lvc6;", "memoryDataSource", "Lb79;", "n2", "()Lb79;", "rawDeepLinkDataBuilder", "Lru/dodopizza/app/presentation/main/a;", "N3", "()Lru/dodopizza/app/presentation/main/a;", "rawDeepLinksProcessor", "Lk63;", "I", "()Lk63;", "domainEvents", "Lfz4;", "m1", "()Lfz4;", "inAppStoryEvents", "Ljv5;", "f", "()Ljv5;", "localityService", "Lru/dodopizza/app/domain/country/CountryService;", e.a, "()Lru/dodopizza/app/domain/country/CountryService;", "countryService", "Lxu8;", "I2", "()Lxu8;", "queryHandler", "Lru/dodopizza/app/domain/DodopizzaApi;", "w0", "()Lru/dodopizza/app/domain/DodopizzaApi;", "dodoPizzaApi", "Lava;", Image.TYPE_HIGH, "()Lava;", "stateProvider", "Lxda;", "W", "()Lxda;", "servicePushService", "Ltda;", "H2", "()Ltda;", "serverTimeService", "La98;", "s0", "()La98;", "pizzeriaRepository", "Lv52;", "c0", "()Lv52;", "customerSettingsService", "Lmh0;", "i", "()Lmh0;", "buildInfo", "Lsg4;", "a2", "()Lsg4;", "googlePay", "Lt28;", "A3", "()Lt28;", "phoneHintHelper", "Lbo;", "x", "()Lbo;", "appInitializationStateProvider", "Lhq3;", c.a, "()Lhq3;", "featureService", "Ldq3;", "U", "()Ldq3;", "featureInteractor", "Ley7;", "C0", "()Ley7;", "corePermissionChecker", "Lmqb;", "v1", "()Lmqb;", "unexpectedLogoutInteractor", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public interface MainActivityFeatureDependencies extends jm1 {
    t28 A3();

    ey7 C0();

    ci8 G();

    xr0 G1();

    tda H2();

    k63 I();

    xu8 I2();

    dv6 K0();

    a N3();

    hp P();

    dq3 U();

    xda W();

    my7 Y2();

    gc a();

    sg4 a2();

    f63 b();

    hq3 c();

    v52 c0();

    kx1 d();

    CountryService e();

    jv5 f();

    vc6 g0();

    Context getContext();

    ava h();

    mh0 i();

    Cdo j();

    fz4 m1();

    b79 n2();

    qx1 q();

    ug4 q3();

    a98 s0();

    mqb v1();

    DodopizzaApi w0();

    bo x();
}
