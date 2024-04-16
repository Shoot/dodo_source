package ru.dodopizza.app.domain.country;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.locality.LocalityEntity;
import com.google.gson.reflect.TypeToken;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.dodopizza.backend.domain.country.CountryApi;
import ru.dodopizza.backend.domain.country.dto.CountriesDto;
import ru.dodopizza.backend.domain.country.dto.CountryDto;
import ru.dodopizza.backend.domain.country.dto.FeatureDto;
/* compiled from: CountryService.kt */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0001\bBG\b\u0007\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013\u0012\u0006\u0010\u0019\u001a\u00020\u0017\u0012\u0006\u0010\u001c\u001a\u00020\u001a\u0012\u0006\u0010 \u001a\u00020\u001d\u0012\u0006\u0010#\u001a\u00020!\u0012\u0006\u0010&\u001a\u00020$\u0012\u0006\u0010)\u001a\u00020'¢\u0006\u0004\b0\u00101J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\u0006\u0010\u0006\u001a\u00020\u0005J\u0014\u0010\u000b\u001a\u00020\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007J\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u000e\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0005J\u000e\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0005J\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00072\u0006\u0010\u000e\u001a\u00020\u0005R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010#\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\"R\u0014\u0010&\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010%R\u0014\u0010)\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010(R\u001c\u0010-\u001a\n +*\u0004\u0018\u00010*0*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010,R\u001c\u0010/\u001a\n +*\u0004\u0018\u00010\u00140\u00148BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010.¨\u00062"}, d2 = {"Lru/dodopizza/app/domain/country/CountryService;", "", "", "Lay1;", "f", "", "baseUrl", "", "a", "countries", "", "i", "g", "b", LocalityEntity.FIELD_COUNTRY_CODE, c.a, Image.TYPE_HIGH, "Lbq3;", e.a, "Las8;", "Lru/dodopizza/backend/domain/country/CountryApi;", "Las8;", "countryApiProvider", "Lby1;", "Lby1;", "countryApiFactory", "Lry1;", "Lry1;", "countryRepository", "Lc63;", DateTokenConverter.CONVERTER_KEY, "Lc63;", "dodoResources", "Liy1;", "Liy1;", "dtoConverter", "Lly1;", "Lly1;", "countryFilter", "Lmh0;", "Lmh0;", "buildInfo", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "Lorg/slf4j/Logger;", "logger", "()Lru/dodopizza/backend/domain/country/CountryApi;", "countryApi", "<init>", "(Las8;Lby1;Lry1;Lc63;Liy1;Lly1;Lmh0;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class CountryService {
    public static final a i = new a(null);
    private final as8<CountryApi> a;
    private final by1 b;
    private final ry1 c;
    private final c63 d;
    private final iy1 e;
    private final ly1 f;
    private final mh0 g;
    private final Logger h;

    /* compiled from: CountryService.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lru/dodopizza/app/domain/country/CountryService$a;", "", "", "DEFAULT_COUNTRIES_RESOURCE_NAME", "Ljava/lang/String;", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public CountryService(as8<CountryApi> as8Var, by1 by1Var, ry1 ry1Var, c63 c63Var, iy1 iy1Var, ly1 ly1Var, mh0 mh0Var) {
        z65.h(as8Var, "countryApiProvider");
        z65.h(by1Var, "countryApiFactory");
        z65.h(ry1Var, "countryRepository");
        z65.h(c63Var, "dodoResources");
        z65.h(iy1Var, "dtoConverter");
        z65.h(ly1Var, "countryFilter");
        z65.h(mh0Var, "buildInfo");
        this.a = as8Var;
        this.b = by1Var;
        this.c = ry1Var;
        this.d = c63Var;
        this.e = iy1Var;
        this.f = ly1Var;
        this.g = mh0Var;
        this.h = LoggerFactory.getLogger("CountryService");
    }

    private final CountryApi d() {
        return this.a.get();
    }

    private final Collection<ay1> f() {
        int w;
        c63 c63Var = this.d;
        Type type = new TypeToken<Collection<? extends CountryDto>>() { // from class: ru.dodopizza.app.domain.country.CountryService$getDefaultCountryList$1
        }.getType();
        z65.g(type, "getType(...)");
        Iterable<CountryDto> iterable = (Iterable) c63Var.a("countries", type);
        iy1 iy1Var = this.e;
        w = lc1.w(iterable, 10);
        ArrayList arrayList = new ArrayList(w);
        for (CountryDto countryDto : iterable) {
            arrayList.add(iy1Var.a(countryDto));
        }
        return arrayList;
    }

    public final List<ay1> a(String str) {
        int w;
        z65.h(str, "baseUrl");
        CountriesDto<CountryDto> countries = this.b.a(str).getCountries("ru-RU");
        iy1 iy1Var = this.e;
        w = lc1.w(countries, 10);
        ArrayList arrayList = new ArrayList(w);
        for (CountryDto countryDto : countries) {
            arrayList.add(iy1Var.a(countryDto));
        }
        return arrayList;
    }

    public final synchronized Collection<ay1> b() {
        try {
            Collection<ay1> b = this.c.b();
            if (!b.isEmpty()) {
                return b;
            }
            Collection<ay1> f = f();
            if (f.isEmpty()) {
                this.h.error("The default countries list is empty");
            }
            this.c.e(f);
            return f;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final ay1 c(String str) {
        Object obj;
        z65.h(str, LocalityEntity.FIELD_COUNTRY_CODE);
        Iterator<T> it = b().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (z65.c(((ay1) obj).getCode(), str)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (ay1) mh5.b(obj, "Country with code " + str + " not found");
    }

    public final List<bq3> e(String str) {
        z65.h(str, LocalityEntity.FIELD_COUNTRY_CODE);
        String a2 = this.g.a();
        String h = this.g.h();
        String e = this.g.e();
        ArrayList arrayList = new ArrayList();
        for (FeatureDto featureDto : d().getCountryFeatures(str, a2, h, e)) {
            bq3 a3 = bq3.c.a(featureDto.getCode());
            if (a3 != null) {
                arrayList.add(a3);
            }
        }
        return arrayList;
    }

    public final Collection<ay1> g() {
        return this.f.a(b());
    }

    public final String h(String str) {
        z65.h(str, LocalityEntity.FIELD_COUNTRY_CODE);
        try {
            return c(str).c();
        } catch (Exception e) {
            this.h.warn("Failed to get Language", (Throwable) e);
            return "ru-RU";
        }
    }

    public final void i(List<ay1> list) {
        z65.h(list, "countries");
        this.c.e(list);
    }
}
