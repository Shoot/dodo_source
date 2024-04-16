package defpackage;

import com.dodopizza.persistence.entity.locality.LocalityEntity;
import com.huawei.hms.opendevice.c;
import defpackage.uq9;
import kotlin.Metadata;
import retrofit2.HttpException;
import ru.dodopizza.app.domain.country.CountryService;
import ru.dodopizza.backend.domain.authorization.AuthorizationAPI;
import ru.dodopizza.backend.domain.authorization.SendPinCodeRequestDto;
import ru.dodopizza.backend.domain.landing.LandingApi;
import ru.dodopizza.backend.domain.landing.dto.LandingSMSRequestDto;
/* compiled from: LandingSMSInputService.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u0011\u001a\u00020\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0012¢\u0006\u0004\b\u0016\u0010\u0017J \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0016J(\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Ljl5;", "Lil5;", "", "number", LocalityEntity.FIELD_COUNTRY_CODE, "localityId", "", "a", "pinCode", "localityUuid", "Luq9;", "b", "Lru/dodopizza/backend/domain/authorization/AuthorizationAPI;", "Lru/dodopizza/backend/domain/authorization/AuthorizationAPI;", "authorizationAPI", "Lru/dodopizza/backend/domain/landing/LandingApi;", "Lru/dodopizza/backend/domain/landing/LandingApi;", "landingApi", "Lru/dodopizza/app/domain/country/CountryService;", c.a, "Lru/dodopizza/app/domain/country/CountryService;", "countryService", "<init>", "(Lru/dodopizza/backend/domain/authorization/AuthorizationAPI;Lru/dodopizza/backend/domain/landing/LandingApi;Lru/dodopizza/app/domain/country/CountryService;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: jl5  reason: default package */
/* loaded from: classes4.dex */
public final class jl5 implements il5 {
    private final AuthorizationAPI a;
    private final LandingApi b;
    private final CountryService c;

    public jl5(AuthorizationAPI authorizationAPI, LandingApi landingApi, CountryService countryService) {
        z65.h(authorizationAPI, "authorizationAPI");
        z65.h(landingApi, "landingApi");
        z65.h(countryService, "countryService");
        this.a = authorizationAPI;
        this.b = landingApi;
        this.c = countryService;
    }

    @Override // defpackage.il5
    public void a(String str, String str2, String str3) {
        z65.h(str, "number");
        z65.h(str2, LocalityEntity.FIELD_COUNTRY_CODE);
        z65.h(str3, "localityId");
        this.a.sendPinWithLocalityId(new SendPinCodeRequestDto(str), this.c.h(str2), str2, str3);
    }

    @Override // defpackage.il5
    public uq9 b(String str, String str2, String str3, String str4) {
        z65.h(str, LocalityEntity.FIELD_COUNTRY_CODE);
        z65.h(str2, "number");
        z65.h(str3, "pinCode");
        z65.h(str4, "localityUuid");
        try {
            this.b.confirmCode(str, new LandingSMSRequestDto(str2, str3, str4));
            return uq9.b.a;
        } catch (HttpException e) {
            if (e.code() == 400) {
                return uq9.c.a;
            }
            return uq9.a.a;
        }
    }
}
