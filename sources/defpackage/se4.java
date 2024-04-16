package defpackage;

import com.dodopizza.persistence.entity.locality.LocalityEntity;
import im.threads.business.transport.MessageAttributes;
import kotlin.Metadata;
import ru.dodopizza.backend.domain.geo.GeoApi;
import ru.dodopizza.backend.domain.geo.ReverseGeocodeAddressDto;
/* compiled from: GeocodeService.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\"\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016J\u001a\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0014\u0010\f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u000b¨\u0006\u000f"}, d2 = {"Lse4;", "Lre4;", "Lqw1;", MessageAttributes.COORDINATES, "", LocalityEntity.FIELD_COUNTRY_CODE, "languageCode", "Ldm9;", "a", "b", "Lru/dodopizza/backend/domain/geo/GeoApi;", "Lru/dodopizza/backend/domain/geo/GeoApi;", "geoApi", "<init>", "(Lru/dodopizza/backend/domain/geo/GeoApi;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: se4  reason: default package */
/* loaded from: classes4.dex */
public final class se4 implements re4 {
    private final GeoApi a;

    public se4(GeoApi geoApi) {
        z65.h(geoApi, "geoApi");
        this.a = geoApi;
    }

    @Override // defpackage.re4
    public dm9 a(qw1 qw1Var, String str, String str2) {
        z65.h(qw1Var, MessageAttributes.COORDINATES);
        z65.h(str, LocalityEntity.FIELD_COUNTRY_CODE);
        z65.h(str2, "languageCode");
        ReverseGeocodeAddressDto address = this.a.reverseGeocode(qw1Var.b(), qw1Var.c(), str, str2).getAddress();
        if (address != null) {
            return new dm9(address.getLocalityId(), address.getPizzeriaId(), qw1Var, address.getComponents(), address.getFormattedAddress(), address.getAddressLocation());
        }
        return null;
    }

    @Override // defpackage.re4
    public String b(qw1 qw1Var, String str) {
        z65.h(qw1Var, MessageAttributes.COORDINATES);
        z65.h(str, LocalityEntity.FIELD_COUNTRY_CODE);
        return this.a.localityByCoords(qw1Var.b(), qw1Var.c(), str).getLocalityId();
    }
}
