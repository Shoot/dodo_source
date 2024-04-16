package ru.dodopizza.backend.domain.country;

import com.dodopizza.persistence.entity.locality.LocalityEntity;
import java.util.List;
import kotlin.Metadata;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Query;
import ru.dodopizza.backend.domain.country.dto.CountriesDto;
import ru.dodopizza.backend.domain.country.dto.CountryDto;
import ru.dodopizza.backend.domain.country.dto.FeatureDto;
import ru.dodopizza.backend.domain.country.dto.addressformat.AddressDetailsFieldDesignDto;
/* compiled from: CountryApi.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005H'J\u0012\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\u0005H'J\u0012\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\t\u001a\u00020\u0005H'J6\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u000f\u001a\u00020\u00052\b\b\u0001\u0010\u0010\u001a\u00020\u00052\b\b\u0001\u0010\u0011\u001a\u00020\u0005H'¨\u0006\u0012"}, d2 = {"Lru/dodopizza/backend/domain/country/CountryApi;", "", "getAddressDetailsFieldsDesign", "Lru/dodopizza/backend/domain/country/dto/addressformat/AddressDetailsFieldDesignDto;", LocalityEntity.FIELD_COUNTRY_CODE, "", "languageCode", "getCountries", "Lru/dodopizza/backend/domain/country/dto/CountriesDto;", "language", "getCountry", "Lru/dodopizza/backend/domain/country/dto/CountryDto;", "getCountryFeatures", "", "Lru/dodopizza/backend/domain/country/dto/FeatureDto;", "apiVersion", "clientVersion", "clientApp", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface CountryApi {

    /* compiled from: CountryApi.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ AddressDetailsFieldDesignDto getAddressDetailsFieldsDesign$default(CountryApi countryApi, String str, String str2, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    str2 = null;
                }
                return countryApi.getAddressDetailsFieldsDesign(str, str2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAddressDetailsFieldsDesign");
        }
    }

    @GET("/api/v2/address/form")
    AddressDetailsFieldDesignDto getAddressDetailsFieldsDesign(@Header("CountryCode") String str, @Header("LanguageCode") String str2);

    @GET("api/v1/countries")
    CountriesDto getCountries(@Query("languageCode") String str);

    @GET("api/v1/countries/{id}")
    CountryDto getCountry(@Query("languageCode") String str);

    @GET("api/v1/feature")
    List<FeatureDto> getCountryFeatures(@Query("Country") String str, @Query("apiVersion") String str2, @Query("clientVersion") String str3, @Query("clientApp") String str4);
}
