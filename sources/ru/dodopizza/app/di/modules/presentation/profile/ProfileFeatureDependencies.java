package ru.dodopizza.app.di.modules.presentation.profile;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.tmb;
import kotlin.Metadata;
/* compiled from: ProfileFeatureDependencies.kt */
@Metadata(d1 = {"\u0000ð\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8&X¦\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0014\u0010)\u001a\u00020&8&X¦\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0014\u0010-\u001a\u00020*8&X¦\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0014\u00101\u001a\u00020.8&X¦\u0004¢\u0006\u0006\u001a\u0004\b/\u00100R\u0014\u00105\u001a\u0002028&X¦\u0004¢\u0006\u0006\u001a\u0004\b3\u00104R\u0014\u00109\u001a\u0002068&X¦\u0004¢\u0006\u0006\u001a\u0004\b7\u00108R\u0014\u0010=\u001a\u00020:8&X¦\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<R\u0014\u0010A\u001a\u00020>8&X¦\u0004¢\u0006\u0006\u001a\u0004\b?\u0010@R\u0014\u0010E\u001a\u00020B8&X¦\u0004¢\u0006\u0006\u001a\u0004\bC\u0010DR\u0014\u0010I\u001a\u00020F8&X¦\u0004¢\u0006\u0006\u001a\u0004\bG\u0010HR\u0014\u0010M\u001a\u00020J8&X¦\u0004¢\u0006\u0006\u001a\u0004\bK\u0010LR\u0014\u0010Q\u001a\u00020N8&X¦\u0004¢\u0006\u0006\u001a\u0004\bO\u0010PR\u0014\u0010U\u001a\u00020R8&X¦\u0004¢\u0006\u0006\u001a\u0004\bS\u0010TR\u0014\u0010Y\u001a\u00020V8&X¦\u0004¢\u0006\u0006\u001a\u0004\bW\u0010XR\u0014\u0010]\u001a\u00020Z8&X¦\u0004¢\u0006\u0006\u001a\u0004\b[\u0010\\R\u0014\u0010a\u001a\u00020^8&X¦\u0004¢\u0006\u0006\u001a\u0004\b_\u0010`R\u0014\u0010e\u001a\u00020b8&X¦\u0004¢\u0006\u0006\u001a\u0004\bc\u0010dR\u0014\u0010i\u001a\u00020f8&X¦\u0004¢\u0006\u0006\u001a\u0004\bg\u0010hR\u0014\u0010m\u001a\u00020j8&X¦\u0004¢\u0006\u0006\u001a\u0004\bk\u0010lR\u0014\u0010q\u001a\u00020n8&X¦\u0004¢\u0006\u0006\u001a\u0004\bo\u0010pR\u0014\u0010u\u001a\u00020r8&X¦\u0004¢\u0006\u0006\u001a\u0004\bs\u0010t¨\u0006v"}, d2 = {"Lru/dodopizza/app/di/modules/presentation/profile/ProfileFeatureDependencies;", "Ljm1;", "Lkx1;", DateTokenConverter.CONVERTER_KEY, "()Lkx1;", "ioDispatcher", "Lt52;", Image.TYPE_MEDIUM, "()Lt52;", "customerService", "Lli7;", "r", "()Lli7;", "orderService", "Lhq3;", c.a, "()Lhq3;", "featureService", "Lf5b;", "t", "()Lf5b;", "systemTimeProvider", "Lfda;", "j0", "()Lfda;", "serverDateTimeParser", "Li00;", "g", "()Li00;", "authorizationState", "Lgc;", "a", "()Lgc;", "analytics", "Lih4;", "A", "()Lih4;", "googlePlayServicesHelper", "Lld9;", "b2", "()Lld9;", "remoteToggleService", "Lx26;", "y", "()Lx26;", "loyaltyService", "Lf63;", "b", "()Lf63;", "router", "Lwg6;", "M0", "()Lwg6;", "menuRefreshInteractor", "Lk63;", "I", "()Lk63;", "domainEvents", "Lzxa;", "X0", "()Lzxa;", "storiesInteractor", "Lx42;", "n", "()Lx42;", "customerAddressService", "Lv52;", "c0", "()Lv52;", "customerSettingsService", "Ldf4;", "I0", "()Ldf4;", "getDataAvailabilityInteractor", "Lvc6;", "g0", "()Lvc6;", "memoryDataSource", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Ljgb;", "J", "()Ljgb;", "timeFormatter", "Lmh0;", "i", "()Lmh0;", "buildInfo", "Lps1;", "H0", "()Lps1;", "contactsInteractor", "Lfq0;", "h0", "()Lfq0;", "cartContentService", "Lay1;", "S", "()Lay1;", tmb.c.COUNTRY_JSON_NAME, "Lava;", Image.TYPE_HIGH, "()Lava;", "stateProvider", "Ljv5;", "f", "()Ljv5;", "localityService", "Lwt6;", "v0", "()Lwt6;", "nativeChatStateChecker", "Lzt6;", "J2", "()Lzt6;", "nativeChatUnreadMessagesCount", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public interface ProfileFeatureDependencies extends jm1 {
    ih4 A();

    ps1 H0();

    k63 I();

    df4 I0();

    jgb J();

    zt6 J2();

    wg6 M0();

    ay1 S();

    zxa X0();

    gc a();

    f63 b();

    ld9 b2();

    hq3 c();

    v52 c0();

    kx1 d();

    jv5 f();

    i00 g();

    vc6 g0();

    Context getContext();

    ava h();

    fq0 h0();

    mh0 i();

    fda j0();

    t52 m();

    x42 n();

    li7 r();

    f5b t();

    wt6 v0();

    x26 y();
}
