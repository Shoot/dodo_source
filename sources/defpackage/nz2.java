package defpackage;

import com.dodopizza.persistence.entity.locality.LocalityEntity;
import kotlin.Metadata;
import ru.dodopizza.app.domain.country.CountryService;
import ru.dodopizza.backend.domain.geo.GeoApi;
import ru.dodopizza.backend.domain.geo.SelectedAddressDataDto;
/* compiled from: DeliveryLocationSuggestionsService.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0016R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lnz2;", "Lmz2;", "", "addressId", "sessionId", LocalityEntity.FIELD_COUNTRY_CODE, "Lp9a;", "a", "Lru/dodopizza/backend/domain/geo/GeoApi;", "Lru/dodopizza/backend/domain/geo/GeoApi;", "geoApi", "Lru/dodopizza/app/domain/country/CountryService;", "b", "Lru/dodopizza/app/domain/country/CountryService;", "countryService", "<init>", "(Lru/dodopizza/backend/domain/geo/GeoApi;Lru/dodopizza/app/domain/country/CountryService;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: nz2  reason: default package */
/* loaded from: classes4.dex */
public final class nz2 implements mz2 {
    private final GeoApi a;
    private final CountryService b;

    public nz2(GeoApi geoApi, CountryService countryService) {
        z65.h(geoApi, "geoApi");
        z65.h(countryService, "countryService");
        this.a = geoApi;
        this.b = countryService;
    }

    @Override // defpackage.mz2
    public p9a a(String str, String str2, String str3) {
        z65.h(str, "addressId");
        z65.h(str2, "sessionId");
        z65.h(str3, LocalityEntity.FIELD_COUNTRY_CODE);
        SelectedAddressDataDto select = this.a.select(str, str2, str3, this.b.h(str3));
        return new p9a(select.getLocalityId(), select.getPizzeriaId(), new qw1(select.getCoordinates().getLat(), select.getCoordinates().getLon()), select.getComponents(), select.getFormattedAddress(), select.getIncompleteAddress());
    }
}
