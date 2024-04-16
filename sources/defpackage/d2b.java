package defpackage;

import defpackage.c2b;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import ru.dodopizza.app.domain.country.CountryService;
import ru.dodopizza.backend.domain.geo.GeoApi;
import ru.dodopizza.backend.domain.geo.SuggestionDto;
/* compiled from: SuggestionService.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\bR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Ld2b;", "Lc2b;", "Lc2b$b;", "request", "", "Lw1b;", "a", "Lru/dodopizza/backend/domain/geo/GeoApi;", "Lru/dodopizza/backend/domain/geo/GeoApi;", "geoApi", "Lru/dodopizza/app/domain/country/CountryService;", "b", "Lru/dodopizza/app/domain/country/CountryService;", "countryService", "<init>", "(Lru/dodopizza/backend/domain/geo/GeoApi;Lru/dodopizza/app/domain/country/CountryService;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: d2b  reason: default package */
/* loaded from: classes4.dex */
public final class d2b implements c2b {
    private final GeoApi a;
    private final CountryService b;

    public d2b(GeoApi geoApi, CountryService countryService) {
        z65.h(geoApi, "geoApi");
        z65.h(countryService, "countryService");
        this.a = geoApi;
        this.b = countryService;
    }

    @Override // defpackage.c2b
    public List<w1b> a(c2b.b bVar) {
        Double d;
        List<w1b> l;
        int w;
        z65.h(bVar, "request");
        GeoApi geoApi = this.a;
        String c = bVar.c();
        String d2 = bVar.d();
        c2b.a a = bVar.a();
        Double d3 = null;
        if (a != null) {
            d = Double.valueOf(a.a());
        } else {
            d = null;
        }
        c2b.a a2 = bVar.a();
        if (a2 != null) {
            d3 = Double.valueOf(a2.b());
        }
        List<SuggestionDto> suggestions = geoApi.getSuggestions(c, d2, d, d3, bVar.b(), this.b.h(bVar.b())).getSuggestions();
        if (suggestions == null) {
            l = kc1.l();
            return l;
        }
        List<SuggestionDto> list = suggestions;
        w = lc1.w(list, 10);
        ArrayList arrayList = new ArrayList(w);
        for (SuggestionDto suggestionDto : list) {
            arrayList.add(new w1b(suggestionDto.getAddress(), suggestionDto.getAddressId(), suggestionDto.getMainText(), suggestionDto.getSecondaryText(), suggestionDto.getDistanceToUser()));
        }
        return arrayList;
    }
}
