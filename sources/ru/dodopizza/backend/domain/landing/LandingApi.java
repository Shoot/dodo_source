package ru.dodopizza.backend.domain.landing;

import com.dodopizza.persistence.entity.locality.LocalityEntity;
import kotlin.Metadata;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Path;
import ru.dodopizza.backend.domain.landing.dto.LandingSMSRequestDto;
/* compiled from: LandingApi.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\tH'J\u001c\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\f\u001a\u00020\u00072\b\b\u0001\u0010\u0006\u001a\u00020\u0007H'¨\u0006\r"}, d2 = {"Lru/dodopizza/backend/domain/landing/LandingApi;", "", "confirmCode", "Lretrofit2/Response;", "Ljava/lang/Void;", "Lru/dodopizza/backend/client/common/EmptyResponse;", LocalityEntity.FIELD_COUNTRY_CODE, "", "landingSmsRequest", "Lru/dodopizza/backend/domain/landing/dto/LandingSMSRequestDto;", "getLandingInfo", "Lru/dodopizza/backend/domain/landing/LandingDto;", "localityId", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface LandingApi {
    @POST("/api/v1/landing/confirmation")
    Response<Void> confirmCode(@Header("CountryCode") String str, @Body LandingSMSRequestDto landingSMSRequestDto);

    @GET("/api/v1/locality/{id}/landing")
    LandingDto getLandingInfo(@Path("id") String str, @Header("CountryCode") String str2);
}
