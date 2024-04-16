package ru.dodopizza.app.domain;

import com.dodopizza.persistence.entity.address.AddressEntity;
import com.dodopizza.persistence.entity.locality.LocalityEntity;
import kotlin.Metadata;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;
import ru.dodopizza.app.data.dto.request.FeedbackBody;
import ru.dodopizza.app.data.dto.request.StateRequest;
import ru.dodopizza.app.data.dto.response.CheckApiResponse;
import ru.dodopizza.app.data.dto.response.CheckAvailabilityResponse;
import ru.dodopizza.backend.domain.address.dto.HouseAutoResultDto;
import ru.dodopizza.backend.domain.address.dto.StreetAutoResultDto;
import ru.dodopizza.backend.domain.state.dto.DeliveryAddressDto;
import ru.dodopizza.backend.domain.state.dto.StateDto;
/* compiled from: DodopizzaApi.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'J\u0012\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0007\u001a\u00020\u0006H'J&\u0010\u0010\u001a\u00020\u000f2\b\b\u0001\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\f\u001a\u00020\n2\b\b\u0001\u0010\u000e\u001a\u00020\rH'J0\u0010\u0014\u001a\u00020\u00132\b\b\u0001\u0010\u0011\u001a\u00020\n2\b\b\u0001\u0010\u0012\u001a\u00020\n2\b\b\u0001\u0010\f\u001a\u00020\n2\b\b\u0001\u0010\u000e\u001a\u00020\rH'J\u0012\u0010\u0015\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'J\u0012\u0010\u0018\u001a\u00020\u00172\b\b\u0001\u0010\u0016\u001a\u00020\nH'J\b\u0010\u001a\u001a\u00020\u0019H'J\u0012\u0010\u001d\u001a\u00020\b2\b\b\u0001\u0010\u001c\u001a\u00020\u001bH'¨\u0006\u001e"}, d2 = {"Lru/dodopizza/app/domain/DodopizzaApi;", "", "Lru/dodopizza/app/data/dto/request/StateRequest;", "stateRequest", "Lru/dodopizza/backend/domain/state/dto/StateDto;", "setAddress", "Lru/dodopizza/backend/domain/state/dto/DeliveryAddressDto;", "deliveryAddress", "Lkk9;", "subscribeOpenDeliveryAddress", "", "streetNamePart", "localityId", "", LocalityEntity.FIELD_COUNTRY_CODE, "Lru/dodopizza/backend/domain/address/dto/StreetAutoResultDto;", "streetAutoComplete", "houseNumberPart", AddressEntity.STREET_ID_FIELD_NAME, "Lru/dodopizza/backend/domain/address/dto/HouseAutoResultDto;", "houseAutoComplete", "actualize", "apiVersion", "Lru/dodopizza/app/data/dto/response/CheckApiResponse;", "checkApi", "Lru/dodopizza/app/data/dto/response/CheckAvailabilityResponse;", "checkAvailability", "Lru/dodopizza/app/data/dto/request/FeedbackBody;", "feedbackBody", "sendFeedback", "base_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public interface DodopizzaApi {
    @POST("/api/v1/state/actualize")
    StateDto actualize(@Body StateRequest stateRequest);

    @GET("/api/check")
    CheckApiResponse checkApi(@Query("version") String str);

    @GET("/api/availability")
    CheckAvailabilityResponse checkAvailability();

    @GET("/api/v1/house")
    HouseAutoResultDto houseAutoComplete(@Query("houseNumberPart") String str, @Query("streetId") String str2, @Query("LocalityId") String str3, @Query("CountryCode") int i);

    @POST("/api/v1/client/feedback")
    kk9 sendFeedback(@Body FeedbackBody feedbackBody);

    @POST("/api/v1/address")
    StateDto setAddress(@Body StateRequest stateRequest);

    @GET("/api/v1/street")
    StreetAutoResultDto streetAutoComplete(@Query("streetNamePart") String str, @Query("LocalityId") String str2, @Query("CountryCode") int i);

    @POST("/api/v1/address/subscription")
    kk9 subscribeOpenDeliveryAddress(@Body DeliveryAddressDto deliveryAddressDto);
}
