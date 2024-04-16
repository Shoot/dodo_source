package ru.dodopizza.backend.domain.geo;

import com.dodopizza.persistence.entity.locality.LocalityEntity;
import com.facebook.flipper.plugins.databases.DatabaseDriver;
import kotlin.Metadata;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Query;
/* compiled from: GeoApi.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001JO\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\b\u0001\u0010\b\u001a\u00020\u00022\b\b\u0001\u0010\t\u001a\u00020\u0002H'¢\u0006\u0004\b\u000b\u0010\fJ0\u0010\u000f\u001a\u00020\u000e2\b\b\u0001\u0010\r\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\b\u001a\u00020\u00022\b\b\u0001\u0010\t\u001a\u00020\u0002H'J0\u0010\u0011\u001a\u00020\u00102\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0007\u001a\u00020\u00052\b\b\u0001\u0010\b\u001a\u00020\u00022\b\b\u0001\u0010\t\u001a\u00020\u0002H'J\u0012\u0010\u0014\u001a\u00020\u00132\b\b\u0001\u0010\b\u001a\u00020\u0012H'J&\u0010\u0016\u001a\u00020\u00152\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0007\u001a\u00020\u00052\b\b\u0001\u0010\b\u001a\u00020\u0002H'J\u001c\u0010\u001a\u001a\u00020\u00192\b\b\u0001\u0010\b\u001a\u00020\u00022\b\b\u0001\u0010\u0018\u001a\u00020\u0017H'¨\u0006\u001b"}, d2 = {"Lru/dodopizza/backend/domain/geo/GeoApi;", "", "", "input", "sessionId", "", "lat", "lon", LocalityEntity.FIELD_COUNTRY_CODE, "languageCode", "Lru/dodopizza/backend/domain/geo/SuggestionListDto;", "getSuggestions", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;)Lru/dodopizza/backend/domain/geo/SuggestionListDto;", "addressId", "Lru/dodopizza/backend/domain/geo/SelectedAddressDataDto;", DatabaseDriver.DatabaseExecuteSqlResponse.TYPE_SELECT, "Lru/dodopizza/backend/domain/geo/ReverseGeocodeDto;", "reverseGeocode", "", "Lru/dodopizza/backend/domain/geo/AddressDetailsFieldListDto;", "getAddressDetailsFields", "Lru/dodopizza/backend/domain/geo/LocalityByCoordsDto;", "localityByCoords", "Lru/dodopizza/backend/domain/geo/AddressCatcherRequestDto;", "request", "Lkk9;", "subscribeAddressForUpdates", "backend"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public interface GeoApi {
    @GET("/api/v1/address/form")
    AddressDetailsFieldListDto getAddressDetailsFields(@Query("country") int i);

    @GET("/api/v3/address/autocomplete")
    SuggestionListDto getSuggestions(@Query("input") String str, @Query("sessionId") String str2, @Query("lat") Double d, @Query("lon") Double d2, @Header("countryCode") String str3, @Header("LanguageCode") String str4);

    @GET("/api/v3/address/locality-by-coords")
    LocalityByCoordsDto localityByCoords(@Query("lat") double d, @Query("lon") double d2, @Header("countryCode") String str);

    @GET("/api/v3/address/reverse-geocode")
    ReverseGeocodeDto reverseGeocode(@Query("lat") double d, @Query("lon") double d2, @Header("CountryCode") String str, @Header("LanguageCode") String str2);

    @GET("/api/v3/address/select")
    SelectedAddressDataDto select(@Query("addressId") String str, @Query("sessionId") String str2, @Header("CountryCode") String str3, @Header("LanguageCode") String str4);

    @POST("/api/v3/address/subscription")
    kk9 subscribeAddressForUpdates(@Header("countryCode") String str, @Body AddressCatcherRequestDto addressCatcherRequestDto);
}
