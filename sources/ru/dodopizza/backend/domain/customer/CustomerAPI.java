package ru.dodopizza.backend.domain.customer;

import ch.qos.logback.core.joran.action.Action;
import com.dodopizza.persistence.entity.locality.LocalityEntity;
import com.facebook.flipper.BuildConfig;
import com.inappstory.sdk.network.NetworkHandler;
import java.util.List;
import kotlin.Metadata;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.HTTP;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Query;
import ru.dodopizza.backend.domain.customer.dto.AccountDeletionInfoDto;
import ru.dodopizza.backend.domain.customer.dto.CustomerDto;
import ru.dodopizza.backend.domain.customer.dto.DeleteAddressRequestDto;
import ru.dodopizza.backend.domain.customer.dto.DeleteLocationRequestDto;
import ru.dodopizza.backend.domain.customer.dto.NeedSubscriptionRequestDto;
import ru.dodopizza.backend.domain.customer.dto.OpenSecretActionDto;
import ru.dodopizza.backend.domain.customer.dto.PersonalOfferDto;
import ru.dodopizza.backend.domain.customer.dto.PersonalPromoActionDto;
import ru.dodopizza.backend.domain.customer.dto.SaveClientDeliveryLocationDto;
import ru.dodopizza.backend.domain.customer.dto.SecretCodeRequestDto;
import ru.dodopizza.backend.domain.customer.dto.SetBirthdayRequestDto;
import ru.dodopizza.backend.domain.customer.dto.SetEmailRequestDto;
import ru.dodopizza.backend.domain.customer.dto.SetNameRequestDto;
/* compiled from: CustomerAPI.kt */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H'J\b\u0010\u0004\u001a\u00020\u0003H'J\u001c\u0010\u0005\u001a\f\u0012\u0004\u0012\u00020\u00070\u0006j\u0002`\b2\b\b\u0001\u0010\t\u001a\u00020\nH'J\u001c\u0010\u000b\u001a\f\u0012\u0004\u0012\u00020\u00070\u0006j\u0002`\b2\b\b\u0001\u0010\t\u001a\u00020\fH'J\u001e\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0001\u0010\u000f\u001a\u00020\u00102\b\b\u0001\u0010\u0011\u001a\u00020\u0010H'J\b\u0010\u0012\u001a\u00020\u0003H'J\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u0010H'J\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00142\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u0010H'J\u001c\u0010\u0019\u001a\f\u0012\u0004\u0012\u00020\u00070\u0006j\u0002`\b2\b\b\u0001\u0010\u001a\u001a\u00020\u001bH'J\u0012\u0010\u001c\u001a\u00020\u000e2\b\b\u0001\u0010\u001d\u001a\u00020\u001eH'J\u001c\u0010\u001f\u001a\f\u0012\u0004\u0012\u00020\u00070\u0006j\u0002`\b2\b\b\u0001\u0010 \u001a\u00020!H'J\u001c\u0010\"\u001a\f\u0012\u0004\u0012\u00020\u00070\u0006j\u0002`\b2\b\b\u0001\u0010#\u001a\u00020$H'J\u001c\u0010%\u001a\f\u0012\u0004\u0012\u00020\u00070\u0006j\u0002`\b2\b\b\u0001\u0010&\u001a\u00020'H'J\u001c\u0010(\u001a\f\u0012\u0004\u0012\u00020\u00070\u0006j\u0002`\b2\b\b\u0001\u0010)\u001a\u00020*H'J\u001c\u0010+\u001a\f\u0012\u0004\u0012\u00020\u00070\u0006j\u0002`\b2\b\b\u0001\u0010,\u001a\u00020-H'¨\u0006."}, d2 = {"Lru/dodopizza/backend/domain/customer/CustomerAPI;", "", "cancelDeletion", "Lru/dodopizza/backend/domain/customer/dto/AccountDeletionInfoDto;", "deleteAccount", "deleteCustomerAddress", "Lretrofit2/Response;", "Ljava/lang/Void;", "Lru/dodopizza/backend/client/common/EmptyResponse;", "request", "Lru/dodopizza/backend/domain/customer/dto/DeleteAddressRequestDto;", "deleteCustomerDeliveryLocation", "Lru/dodopizza/backend/domain/customer/dto/DeleteLocationRequestDto;", "getCustomer", "Lru/dodopizza/backend/domain/customer/dto/CustomerDto;", LocalityEntity.FIELD_COUNTRY_CODE, "", "localityId", "getDeletionStatus", "getPersonalOffers", "", "Lru/dodopizza/backend/domain/customer/dto/PersonalOfferDto;", "preferredImageFormat", "getPersonalOffersV2", "Lru/dodopizza/backend/domain/customer/dto/PersonalPromoActionDto;", "openSecretAction", "data", "Lru/dodopizza/backend/domain/customer/dto/OpenSecretActionDto;", "saveClientLocation", "saveClientDeliveryLocation", "Lru/dodopizza/backend/domain/customer/dto/SaveClientDeliveryLocationDto;", "setBirthday", "birthday", "Lru/dodopizza/backend/domain/customer/dto/SetBirthdayRequestDto;", "setEmail", "email", "Lru/dodopizza/backend/domain/customer/dto/SetEmailRequestDto;", "setName", Action.NAME_ATTRIBUTE, "Lru/dodopizza/backend/domain/customer/dto/SetNameRequestDto;", "setNeedSubscription", "needSubscription", "Lru/dodopizza/backend/domain/customer/dto/NeedSubscriptionRequestDto;", "setSecretCode", "code", "Lru/dodopizza/backend/domain/customer/dto/SecretCodeRequestDto;", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface CustomerAPI {
    @PUT("api/v1/client/remove/cancel")
    AccountDeletionInfoDto cancelDeletion();

    @DELETE("api/v1/client")
    AccountDeletionInfoDto deleteAccount();

    @HTTP(hasBody = BuildConfig.IS_INTERNAL_BUILD, method = NetworkHandler.DELETE, path = "/api/v1/client/address")
    Response<Void> deleteCustomerAddress(@Body DeleteAddressRequestDto deleteAddressRequestDto);

    @HTTP(hasBody = BuildConfig.IS_INTERNAL_BUILD, method = NetworkHandler.DELETE, path = "/api/v1/client/location")
    Response<Void> deleteCustomerDeliveryLocation(@Body DeleteLocationRequestDto deleteLocationRequestDto);

    @GET("api/v1/client")
    CustomerDto getCustomer(@Query("CountryCode") String str, @Query("LocalityId") String str2);

    @GET("api/v1/client/remove/status")
    AccountDeletionInfoDto getDeletionStatus();

    @GET("api/v1/client/bonuses")
    List<PersonalOfferDto> getPersonalOffers(@Query("PreferredImageFormat") String str);

    @GET("api/v2/client/bonuses")
    List<PersonalPromoActionDto> getPersonalOffersV2(@Query("PreferredImageFormat") String str);

    @POST("api/v1/personalaction/openSecretAction")
    Response<Void> openSecretAction(@Body OpenSecretActionDto openSecretActionDto);

    @POST("/api/v1/client/location")
    CustomerDto saveClientLocation(@Body SaveClientDeliveryLocationDto saveClientDeliveryLocationDto);

    @POST("/api/v1/client/birthday")
    Response<Void> setBirthday(@Body SetBirthdayRequestDto setBirthdayRequestDto);

    @POST("/api/v1/client/email")
    Response<Void> setEmail(@Body SetEmailRequestDto setEmailRequestDto);

    @POST("/api/v1/client/name")
    Response<Void> setName(@Body SetNameRequestDto setNameRequestDto);

    @POST("/api/v1/client/subscription")
    Response<Void> setNeedSubscription(@Body NeedSubscriptionRequestDto needSubscriptionRequestDto);

    @POST("/api/v1/client/code")
    Response<Void> setSecretCode(@Body SecretCodeRequestDto secretCodeRequestDto);
}
