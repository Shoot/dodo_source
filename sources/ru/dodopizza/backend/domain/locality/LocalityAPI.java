package ru.dodopizza.backend.domain.locality;

import com.dodopizza.persistence.entity.locality.LocalityEntity;
import java.util.List;
import kotlin.Metadata;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Path;
import retrofit2.http.Query;
import ru.dodopizza.backend.domain.country.dto.FeatureDto;
import ru.dodopizza.backend.domain.locality.dto.LocalitiesDto;
import ru.dodopizza.backend.domain.locality.dto.LocalityInfoDtoV3;
/* compiled from: LocalityAPI.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H'J@\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\t\u001a\u00020\u00052\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\n\u001a\u00020\u00052\b\b\u0001\u0010\u000b\u001a\u00020\u00052\b\b\u0001\u0010\f\u001a\u00020\u0005H'J\u001c\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\u000f\u001a\u00020\u00052\b\b\u0001\u0010\u0004\u001a\u00020\u0005H'¨\u0006\u0010"}, d2 = {"Lru/dodopizza/backend/domain/locality/LocalityAPI;", "", "getLocalitiesIds", "Lru/dodopizza/backend/domain/locality/dto/LocalitiesDto;", LocalityEntity.FIELD_COUNTRY_CODE, "", "getLocalityFeatures", "", "Lru/dodopizza/backend/domain/country/dto/FeatureDto;", "id", "apiVersion", "clientVersion", "clientApp", "getLocalityInfoV3", "Lru/dodopizza/backend/domain/locality/dto/LocalityInfoDtoV3;", "localityId", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface LocalityAPI {
    @GET("/api/v3/localities")
    LocalitiesDto getLocalitiesIds(@Header("CountryCode") String str);

    @GET("api/v1/feature/locality/{localityUUId}")
    List<FeatureDto> getLocalityFeatures(@Path("localityUUId") String str, @Query("country") String str2, @Query("apiVersion") String str3, @Query("clientVersion") String str4, @Query("clientApp") String str5);

    @GET("api/v3/countries/{countryCode}/localities/{localityId}")
    LocalityInfoDtoV3 getLocalityInfoV3(@Path("localityId") String str, @Path("countryCode") String str2);
}
