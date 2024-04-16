package defpackage;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import defpackage.tmb;
import kotlin.Metadata;
import ru.dodopizza.app.presentation.profile.ProfilePresenter;
/* compiled from: ProfileModule.kt */
@Metadata(d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b<\u0010=J\u0090\u0001\u0010%\u001a\u00020$2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"H\u0007J\u0010\u0010(\u001a\u00020\u00042\u0006\u0010'\u001a\u00020&H\u0007J\u0010\u0010,\u001a\u00020+2\u0006\u0010*\u001a\u00020)H\u0007J\u0010\u0010-\u001a\u00020)2\u0006\u0010\u0017\u001a\u00020\u0016H\u0007J(\u00107\u001a\u0002062\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u0002002\u0006\u00103\u001a\u0002022\u0006\u00105\u001a\u000204H\u0007J0\u0010;\u001a\u00020:2\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u0002002\u0006\u00103\u001a\u0002022\u0006\u00105\u001a\u0002042\u0006\u00109\u001a\u000208H\u0007¨\u0006>"}, d2 = {"Lxn8;", "", "Lf63;", "router", "Lef4;", "getNumberCanceledOrderInteractor", "Lwg6;", "menuRefreshInteractor", "Ldf4;", "getDataAvailabilityInteractor", "Lk63;", "domainEvents", "Lkn8;", "interactor", "Lzxa;", "storiesInteractor", "Lhq3;", "featureService", "Lf5b;", "systemTimeProvider", "Lih4;", "googlePlatServicesHelper", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lps1;", "contactsInteractor", "Lmh0;", "buildInfo", "Lgc;", "analytics", "Li00;", "authorizationState", "Lzt6;", "nativeChatUnreadMessagesCount", "Lwt6;", "nativeChatStateChecker", "Lru/dodopizza/app/presentation/profile/ProfilePresenter;", c.a, "Lvc6;", "memoryDataSource", "b", "Lro8;", "dataSource", "Lto8;", e.a, DateTokenConverter.CONVERTER_KEY, "Lfq0;", "cartContentService", "Lay1;", tmb.c.COUNTRY_JSON_NAME, "Lava;", "stateProvider", "Ljv5;", "localityService", "Ljv2;", "a", "Lx42;", "customerAddressService", "Lf5a;", "f", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: xn8  reason: default package */
/* loaded from: classes3.dex */
public final class xn8 {
    public static final xn8 a = new xn8();

    private xn8() {
    }

    public final jv2 a(fq0 fq0Var, ay1 ay1Var, ava avaVar, jv5 jv5Var) {
        z65.h(fq0Var, "cartContentService");
        z65.h(ay1Var, tmb.c.COUNTRY_JSON_NAME);
        z65.h(avaVar, "stateProvider");
        z65.h(jv5Var, "localityService");
        return new kv2(fq0Var, ay1Var, avaVar, jv5Var);
    }

    public final ef4 b(vc6 vc6Var) {
        z65.h(vc6Var, "memoryDataSource");
        return new ef4(vc6Var);
    }

    public final ProfilePresenter c(f63 f63Var, ef4 ef4Var, wg6 wg6Var, df4 df4Var, k63 k63Var, kn8 kn8Var, zxa zxaVar, hq3 hq3Var, f5b f5bVar, ih4 ih4Var, Context context, ps1 ps1Var, mh0 mh0Var, gc gcVar, i00 i00Var, zt6 zt6Var, wt6 wt6Var) {
        z65.h(f63Var, "router");
        z65.h(ef4Var, "getNumberCanceledOrderInteractor");
        z65.h(wg6Var, "menuRefreshInteractor");
        z65.h(df4Var, "getDataAvailabilityInteractor");
        z65.h(k63Var, "domainEvents");
        z65.h(kn8Var, "interactor");
        z65.h(zxaVar, "storiesInteractor");
        z65.h(hq3Var, "featureService");
        z65.h(f5bVar, "systemTimeProvider");
        z65.h(ih4Var, "googlePlatServicesHelper");
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        z65.h(ps1Var, "contactsInteractor");
        z65.h(mh0Var, "buildInfo");
        z65.h(gcVar, "analytics");
        z65.h(i00Var, "authorizationState");
        z65.h(zt6Var, "nativeChatUnreadMessagesCount");
        z65.h(wt6Var, "nativeChatStateChecker");
        return new ProfilePresenter(f63Var, ef4Var, wg6Var, df4Var, k63Var, kn8Var, zxaVar, hq3Var, f5bVar, ih4Var, new yo8(context), null, ps1Var, mh0Var, gcVar, i00Var, zt6Var, wt6Var, 2048, null);
    }

    public final ro8 d(Context context) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        return new so8(context);
    }

    public final to8 e(ro8 ro8Var) {
        z65.h(ro8Var, "dataSource");
        return new uo8(ro8Var);
    }

    public final f5a f(fq0 fq0Var, ay1 ay1Var, ava avaVar, jv5 jv5Var, x42 x42Var) {
        z65.h(fq0Var, "cartContentService");
        z65.h(ay1Var, tmb.c.COUNTRY_JSON_NAME);
        z65.h(avaVar, "stateProvider");
        z65.h(jv5Var, "localityService");
        z65.h(x42Var, "customerAddressService");
        return new f5a(fq0Var, ay1Var, avaVar, jv5Var, x42Var);
    }
}
