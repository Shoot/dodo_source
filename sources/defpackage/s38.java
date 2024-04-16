package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
import ru.dodopizza.app.domain.country.CountryService;
import ru.dodopizza.app.presentation.phonenumberlogin.PhoneNumberLoginPresenter;
import ru.dodopizza.app.presentation.phonenumberlogin.a;
import ru.dodopizza.app.presentation.phonenumberlogin.b;
import ru.dodopizza.app.presentation.phonenumberlogin.d;
import ru.dodopizza.app.presentation.phonenumberlogin.e;
/* compiled from: PhoneNumberLoginModule.kt */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b#\u0010$J\b\u0010\u0003\u001a\u00020\u0002H\u0007JR\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0007J8\u0010!\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fH\u0007J\b\u0010\"\u001a\u00020\u001fH\u0007¨\u0006%"}, d2 = {"Ls38;", "", "Lru/dodopizza/app/presentation/phonenumberlogin/a;", "a", "Lf63;", "router", "Lgc;", "analytics", "Lr38;", "interactor", "Lv28;", "phoneInputHandler", "Lru/dodopizza/app/presentation/phonenumberlogin/e;", "phoneNumberRequest", "Lr28;", "phoneHintFeatureChecker", "analyticsSenderMapper", "Lay1;", "currentCountry", "Lhq3;", "featureService", "Lru/dodopizza/app/presentation/phonenumberlogin/PhoneNumberLoginPresenter;", DateTokenConverter.CONVERTER_KEY, "Ldt5;", "currentLocality", "Lrt5;", "localityInfoService", "Lru/dodopizza/app/domain/country/CountryService;", "countryService", "Lg00;", "authorizationService", "Lru/dodopizza/app/presentation/phonenumberlogin/b;", "legalInfoBlockMapper", "b", c.a, "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: s38  reason: default package */
/* loaded from: classes3.dex */
public final class s38 {
    public static final s38 a = new s38();

    private s38() {
    }

    public final a a() {
        return new a();
    }

    public final r38 b(hq3 hq3Var, dt5 dt5Var, rt5 rt5Var, CountryService countryService, g00 g00Var, b bVar) {
        z65.h(hq3Var, "featureService");
        z65.h(dt5Var, "currentLocality");
        z65.h(rt5Var, "localityInfoService");
        z65.h(countryService, "countryService");
        z65.h(g00Var, "authorizationService");
        z65.h(bVar, "legalInfoBlockMapper");
        return new d(hq3Var, countryService, dt5Var, rt5Var, g00Var, bVar, null, 64, null);
    }

    public final b c() {
        return new b();
    }

    public final PhoneNumberLoginPresenter d(f63 f63Var, gc gcVar, r38 r38Var, v28 v28Var, e eVar, r28 r28Var, a aVar, ay1 ay1Var, hq3 hq3Var) {
        z65.h(f63Var, "router");
        z65.h(gcVar, "analytics");
        z65.h(r38Var, "interactor");
        z65.h(v28Var, "phoneInputHandler");
        z65.h(eVar, "phoneNumberRequest");
        z65.h(r28Var, "phoneHintFeatureChecker");
        z65.h(aVar, "analyticsSenderMapper");
        z65.h(ay1Var, "currentCountry");
        z65.h(hq3Var, "featureService");
        return new PhoneNumberLoginPresenter(f63Var, gcVar, r38Var, v28Var, eVar, xi8.a.d("+76661223443"), r28Var, aVar, ay1Var, hq3Var);
    }
}
