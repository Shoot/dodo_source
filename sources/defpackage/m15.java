package defpackage;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.android.applicationstate.AppStateManager;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.yh5;
import defpackage.zh5;
import java.util.List;
import kotlin.Metadata;
import ru.dodopizza.app.R;
/* compiled from: InfrastructureModule.kt */
@Metadata(d1 = {"\u0000\u0080\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bZ\u0010[J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\u0005\u001a\u00020\u0004H\u0007J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0007J\u0018\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0007J\b\u0010\u0015\u001a\u00020\u0014H\u0007J\u0018\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0017H\u0007J\u0018\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0017H\u0016J\u0018\u0010!\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0007J\b\u0010#\u001a\u00020\"H\u0007J\u0010\u0010&\u001a\u00020\u001c2\u0006\u0010%\u001a\u00020$H\u0017J\u0010\u0010(\u001a\u00020'2\u0006\u0010\u000b\u001a\u00020\nH\u0007J\u0010\u0010,\u001a\u00020+2\u0006\u0010*\u001a\u00020)H\u0007J\u0010\u00100\u001a\u00020/2\u0006\u0010.\u001a\u00020-H\u0007J\u0018\u00104\u001a\u00020-2\u0006\u00101\u001a\u00020+2\u0006\u00103\u001a\u000202H\u0007J\u0010\u00106\u001a\u0002022\u0006\u0010%\u001a\u000205H\u0007J\u001a\u0010<\u001a\u00020;2\b\b\u0001\u00108\u001a\u0002072\u0006\u0010:\u001a\u000209H\u0007J\u0010\u0010?\u001a\u0002092\u0006\u0010>\u001a\u00020=H\u0007J \u0010F\u001a\u00020\u000e2\u0006\u0010A\u001a\u00020@2\u0006\u0010C\u001a\u00020B2\u0006\u0010E\u001a\u00020DH\u0007J \u0010G\u001a\u00020\u000e2\u0006\u0010A\u001a\u00020@2\u0006\u0010C\u001a\u00020B2\u0006\u0010E\u001a\u00020DH\u0016J\u0010\u0010H\u001a\u00020@2\u0006\u0010E\u001a\u00020DH\u0007J\u0010\u0010I\u001a\u00020@2\u0006\u0010E\u001a\u00020DH\u0016J\u0010\u0010L\u001a\u00020B2\u0006\u0010K\u001a\u00020JH\u0007J\u0010\u0010N\u001a\u00020M2\u0006\u0010K\u001a\u00020JH\u0007J\u0010\u0010Q\u001a\u00020J2\u0006\u0010P\u001a\u00020OH\u0007J\u0010\u0010S\u001a\u00020R2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\u0010\u0010U\u001a\u00020T2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\b\u0010W\u001a\u00020VH\u0007J\b\u0010Y\u001a\u00020XH\u0007¨\u0006\\"}, d2 = {"Lm15;", "", "Lkx1;", "o", "Ley7;", Image.TYPE_SMALL, "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lwo1;", "j", "Ljv5;", "localityService", "Lxv3;", "l", "Lld9;", "remoteConfigService", "Lzh5$a;", "kustoFeaturesDataProviderFactory", "Lyh5$b;", "q", "Lsgb;", "y", "timeRounder", "Lida;", "serverDeltaTimeRepository", "Lf5b;", "x", c.a, "Lwc;", "factory", "Lhq3;", "featureService", "Lgc;", DateTokenConverter.CONVERTER_KEY, "Lcz3;", Image.TYPE_MEDIUM, "Lxc;", "impl", e.a, "Lnh5;", "p", "Lci8;", "preferencesAssetsDataSource", "Lwl5;", "r", "Li32;", "currentLocaleProvider", "Lih;", "f", "languageService", "Ljo;", "appResourceLocalesFactory", "k", "Lko;", "g", "Lqx1;", "coroutineScope", "Lhp;", "appStateProvider", "Lan;", "i", "Lcom/dodopizza/android/applicationstate/AppStateManager;", "appStateManager", Image.TYPE_HIGH, "Lzc9;", "remoteConfig", "Lyjb;", "traces", "Lmh0;", "buildInfo", "u", "b", "t", "a", "Lvjb;", "traceFactory", "A", "Lbia;", "v", "Loh5;", "kustoAnalytics", "z", "Lih4;", "n", "Lnka;", "w", "Laub;", "B", "Lj2c;", "C", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: m15  reason: default package */
/* loaded from: classes3.dex */
public class m15 {
    public final yjb A(vjb vjbVar) {
        z65.h(vjbVar, "traceFactory");
        return new zjb(vjbVar);
    }

    public final aub B() {
        return new cub();
    }

    public final j2c C() {
        return new k2c();
    }

    public zc9 a(mh0 mh0Var) {
        z65.h(mh0Var, "buildInfo");
        return new ox3(mh0Var, R.xml.firebase_config);
    }

    public ld9 b(zc9 zc9Var, yjb yjbVar, mh0 mh0Var) {
        z65.h(zc9Var, "remoteConfig");
        z65.h(yjbVar, "traces");
        z65.h(mh0Var, "buildInfo");
        return new md9(zc9Var, mh0Var);
    }

    public f5b c(sgb sgbVar, ida idaVar) {
        z65.h(sgbVar, "timeRounder");
        z65.h(idaVar, "serverDeltaTimeRepository");
        return new g5b(sgbVar, idaVar);
    }

    public final gc d(wc wcVar, hq3 hq3Var) {
        z65.h(wcVar, "factory");
        z65.h(hq3Var, "featureService");
        return wcVar.a(hq3Var);
    }

    public wc e(xc xcVar) {
        z65.h(xcVar, "impl");
        return xcVar;
    }

    public final ih f(i32 i32Var) {
        z65.h(i32Var, "currentLocaleProvider");
        return new ih(i32Var);
    }

    public final jo g(ko koVar) {
        z65.h(koVar, "impl");
        return koVar;
    }

    public final hp h(AppStateManager appStateManager) {
        z65.h(appStateManager, "appStateManager");
        return appStateManager;
    }

    public final an i(qx1 qx1Var, hp hpVar) {
        z65.h(qx1Var, "coroutineScope");
        z65.h(hpVar, "appStateProvider");
        return new an(qx1Var, hpVar);
    }

    public final wo1 j(Context context) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        return new xo1(context, new ap1(new rb0()));
    }

    public final i32 k(wl5 wl5Var, jo joVar) {
        z65.h(wl5Var, "languageService");
        z65.h(joVar, "appResourceLocalesFactory");
        return new j32(wl5Var, joVar);
    }

    public final xv3 l(jv5 jv5Var) {
        z65.h(jv5Var, "localityService");
        return new xv3(jv5Var);
    }

    public final cz3 m() {
        return ez3.a();
    }

    public final ih4 n(Context context) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        return new jh4(context);
    }

    public final kx1 o() {
        return v33.b();
    }

    public final nh5 p(jv5 jv5Var) {
        z65.h(jv5Var, "localityService");
        return new nh5(jv5Var);
    }

    public final yh5.b q(ld9 ld9Var, zh5.a aVar) {
        z65.h(ld9Var, "remoteConfigService");
        z65.h(aVar, "kustoFeaturesDataProviderFactory");
        return new yh5.b(ld9Var, aVar);
    }

    public final wl5 r(ci8 ci8Var) {
        z65.h(ci8Var, "preferencesAssetsDataSource");
        return new xl5(ci8Var, olb.a.a());
    }

    public final ey7 s() {
        return ey7.P2;
    }

    public final zc9 t(mh0 mh0Var) {
        z65.h(mh0Var, "buildInfo");
        return a(mh0Var);
    }

    public final ld9 u(zc9 zc9Var, yjb yjbVar, mh0 mh0Var) {
        z65.h(zc9Var, "remoteConfig");
        z65.h(yjbVar, "traces");
        z65.h(mh0Var, "buildInfo");
        return b(zc9Var, yjbVar, mh0Var);
    }

    public final bia v(vjb vjbVar) {
        z65.h(vjbVar, "traceFactory");
        return new cia(vjbVar);
    }

    public final nka w(Context context) {
        List y0;
        String i0;
        List y02;
        String i02;
        int a;
        int a2;
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        String string = context.getString(R.string.firebase_config);
        z65.g(string, "getString(...)");
        y0 = m0b.y0(string, new String[]{"l"}, false, 0, 6, null);
        i0 = sc1.i0(y0, "", null, null, 0, null, null, 62, null);
        int length = i0.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            String substring = i0.substring(i2, i2 + 2);
            z65.g(substring, "substring(...)");
            a2 = nw0.a(16);
            bArr[i] = (byte) Integer.parseInt(substring, a2);
        }
        String string2 = context.getString(R.string.firebase_examples);
        z65.g(string2, "getString(...)");
        y02 = m0b.y0(string2, new String[]{"l"}, false, 0, 6, null);
        i02 = sc1.i0(y02, "", null, null, 0, null, null, 62, null);
        int length2 = i02.length() / 2;
        byte[] bArr2 = new byte[length2];
        for (int i3 = 0; i3 < length2; i3++) {
            int i4 = i3 * 2;
            String substring2 = i02.substring(i4, i4 + 2);
            z65.g(substring2, "substring(...)");
            a = nw0.a(16);
            bArr2[i3] = (byte) Integer.parseInt(substring2, a);
        }
        return pka.a.a(bArr, new String(bArr2, rw0.b)).a("SHA256withRSA");
    }

    public final f5b x(sgb sgbVar, ida idaVar) {
        z65.h(sgbVar, "timeRounder");
        z65.h(idaVar, "serverDeltaTimeRepository");
        return c(sgbVar, idaVar);
    }

    public final sgb y() {
        return new sda();
    }

    public final vjb z(oh5 oh5Var) {
        List o;
        z65.h(oh5Var, "kustoAnalytics");
        o = kc1.o(new ky3(), new jx5(), new mi5(oh5Var));
        return new zp6(o);
    }
}
