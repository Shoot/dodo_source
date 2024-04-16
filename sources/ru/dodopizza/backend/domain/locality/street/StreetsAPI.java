package ru.dodopizza.backend.domain.locality.street;

import com.dodopizza.persistence.entity.locality.LocalityEntity;
import java.util.List;
import kotlin.Metadata;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Path;
/* compiled from: StreetsAPI.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0006H'¨\u0006\b"}, d2 = {"Lru/dodopizza/backend/domain/locality/street/StreetsAPI;", "", "getStreetsByPostcode", "", "Lru/dodopizza/backend/domain/locality/street/StreetSuggestionDto;", "postcode", "", LocalityEntity.FIELD_COUNTRY_CODE, "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface StreetsAPI {
    @GET("api/v1/localities/postcode/streets/{postcode}")
    List<StreetSuggestionDto> getStreetsByPostcode(@Path("postcode") String str, @Header("CountryCode") String str2);
}
