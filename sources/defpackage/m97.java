package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.onboarding.feature.chooseordertype.presentation.a;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.i97;
import kotlin.Metadata;
/* compiled from: OnboardingModule.kt */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b%\u0010&J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0002H\u0007J\b\u0010\t\u001a\u00020\bH\u0007J \u0010\u0010\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0007J\u0010\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0007J\u001a\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\b\b\u0001\u0010\u0017\u001a\u00020\fH\u0007J\u0012\u0010\u001c\u001a\u00020\u001b2\b\b\u0001\u0010\u001a\u001a\u00020\u0002H\u0007J\"\u0010!\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u00062\b\b\u0001\u0010\u0017\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u001eH\u0007R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010#¨\u0006'"}, d2 = {"Lm97;", "", "Lf63;", "g", "externalRouter", "onboardingRouter", "Lyo9;", Image.TYPE_HIGH, "Ldv6;", "f", "Lh97;", "onboardingData", "Lhq3;", "globalFeatureService", "Liq3;", "onboardingFeatureService", e.a, "Lvz4;", "impl", "Lfq3;", DateTokenConverter.CONVERTER_KEY, "Lwc;", "factory", "featureService", "Lgc;", "a", "router", "Ljz2;", c.a, "routersContainer", "Lih4;", "googlePlayServicesHelper", "Lcom/dodopizza/onboarding/feature/chooseordertype/presentation/a;", "b", "Lr71;", "Lr71;", "cicerone", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: m97  reason: default package */
/* loaded from: classes3.dex */
public final class m97 {
    public static final m97 a = new m97();
    private static final r71<f63> b = r71.b.a(new f63());

    private m97() {
    }

    public final gc a(wc wcVar, hq3 hq3Var) {
        z65.h(wcVar, "factory");
        z65.h(hq3Var, "featureService");
        return wcVar.a(hq3Var);
    }

    public final a b(yo9 yo9Var, hq3 hq3Var, ih4 ih4Var) {
        z65.h(yo9Var, "routersContainer");
        z65.h(hq3Var, "featureService");
        z65.h(ih4Var, "googlePlayServicesHelper");
        return new e71(yo9Var.a(), yo9Var.b(), hq3Var, ih4Var);
    }

    public final jz2 c(f63 f63Var) {
        z65.h(f63Var, "router");
        return new kz2(f63Var);
    }

    public final fq3 d(vz4 vz4Var) {
        z65.h(vz4Var, "impl");
        return vz4Var;
    }

    public final hq3 e(h97 h97Var, hq3 hq3Var, iq3 iq3Var) {
        z65.h(h97Var, "onboardingData");
        z65.h(hq3Var, "globalFeatureService");
        z65.h(iq3Var, "onboardingFeatureService");
        i97 d = h97Var.d();
        if (!(d instanceof i97.c) || ((i97.c) d).c() != ha4.b) {
            return iq3Var;
        }
        return hq3Var;
    }

    public final dv6 f() {
        return b.a();
    }

    public final f63 g() {
        return b.b();
    }

    public final yo9 h(f63 f63Var, f63 f63Var2) {
        z65.h(f63Var, "externalRouter");
        z65.h(f63Var2, "onboardingRouter");
        return new yo9(f63Var, f63Var2);
    }
}
