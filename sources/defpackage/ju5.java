package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.geo.feature.deliveryaddresslist.presentation.d;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.tmb;
import kotlin.Metadata;
import ru.dodopizza.app.domain.country.CountryService;
/* compiled from: LocalityModule.kt */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b(\u0010)J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\b\u0010\u000b\u001a\u00020\nH\u0007J\b\u0010\r\u001a\u00020\fH\u0007J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\fH\u0007J\u0018\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\bH\u0007J \u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0007J \u0010#\u001a\u00020\"2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010!\u001a\u00020 H\u0007J\u0010\u0010'\u001a\u00020&2\u0006\u0010%\u001a\u00020$H\u0007¨\u0006*"}, d2 = {"Lju5;", "", "Ljv5;", "localityService", "Ldt5;", DateTokenConverter.CONVERTER_KEY, "Lty1;", "holder", "Lay1;", "b", "Ljn6;", e.a, "Lmn6;", "f", "provider", "Ltn6;", "g", "Lm28;", "phoneFormatRepository", tmb.c.COUNTRY_JSON_NAME, "Lh48;", "i", "Lt41;", "checkoutDetailsService", "Lqi8;", "preferredOrderLocationService", "Lhq3;", "featureService", "Lcom/dodopizza/geo/feature/deliveryaddresslist/presentation/d;", Image.TYPE_HIGH, "Lru/dodopizza/app/domain/country/CountryService;", "countryService", "Lrt5;", "localityInfoService", "Lps1;", "a", "Luk4;", "impl", "Ltk4;", c.a, "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: ju5  reason: default package */
/* loaded from: classes3.dex */
public final class ju5 {
    public static final ju5 a = new ju5();

    private ju5() {
    }

    public final ps1 a(CountryService countryService, jv5 jv5Var, rt5 rt5Var) {
        z65.h(countryService, "countryService");
        z65.h(jv5Var, "localityService");
        z65.h(rt5Var, "localityInfoService");
        return new qs1(countryService, jv5Var, rt5Var);
    }

    public final ay1 b(ty1 ty1Var) {
        z65.h(ty1Var, "holder");
        return ty1Var.a();
    }

    public final tk4 c(uk4 uk4Var) {
        z65.h(uk4Var, "impl");
        return uk4Var;
    }

    public final dt5 d(jv5 jv5Var) {
        z65.h(jv5Var, "localityService");
        dt5 i = jv5Var.i();
        if (i != null) {
            return i;
        }
        throw new IllegalStateException("Current locality is not available".toString());
    }

    public final jn6 e() {
        return kn6.c;
    }

    public final mn6 f() {
        return nn6.a;
    }

    public final tn6 g(mn6 mn6Var) {
        z65.h(mn6Var, "provider");
        return mn6Var.a();
    }

    public final d h(t41 t41Var, qi8 qi8Var, hq3 hq3Var) {
        z65.h(t41Var, "checkoutDetailsService");
        z65.h(qi8Var, "preferredOrderLocationService");
        z65.h(hq3Var, "featureService");
        return new v77(t41Var, qi8Var, hq3Var);
    }

    public final h48 i(m28 m28Var, ay1 ay1Var) {
        z65.h(m28Var, "phoneFormatRepository");
        z65.h(ay1Var, tmb.c.COUNTRY_JSON_NAME);
        return fr2.a.c(m28Var, new j28(ay1Var.l().getCode(), ay1Var.f()));
    }
}
