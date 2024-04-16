package ru.dodopizza.backend.domain.state;

import kotlin.Metadata;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.POST;
import retrofit2.http.Query;
import ru.dodopizza.backend.domain.state.dto.SetAddressRequestDto;
import ru.dodopizza.backend.domain.state.dto.SetDeferredTimeRequestDto;
import ru.dodopizza.backend.domain.state.dto.SetDeliveryRequest;
import ru.dodopizza.backend.domain.state.dto.SetDeliveryTableNumberRequestDto;
import ru.dodopizza.backend.domain.state.dto.SetPackageTypeRequestDto;
import ru.dodopizza.backend.domain.state.dto.SetPizzeriaRequestDto;
import ru.dodopizza.backend.domain.state.dto.SetPromoActionRequestDto;
import ru.dodopizza.backend.domain.state.dto.SetPromoCodeRequestDto;
import ru.dodopizza.backend.domain.state.dto.SetRestaurantPizzeriaRequestDto;
import ru.dodopizza.backend.domain.state.dto.SetTakeawayRequestDto;
import ru.dodopizza.backend.domain.state.dto.StateDto;
import ru.dodopizza.backend.domain.state.dto.deliverylocation.SetClientDeliveryLocationDto;
import ru.dodopizza.backend.domain.state.dto.deliverylocation.SetDeliveryLocationDetailsDto;
import ru.dodopizza.backend.domain.state.dto.payment.PaymentMethodRequestDto;
import ru.dodopizza.backend.domain.state.dto.tax.SetTaxPayerIdDto;
/* compiled from: WorkflowApi.kt */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H'J\u0012\u0010\u0006\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H'J\u0012\u0010\u0007\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H'J\u0012\u0010\b\u001a\u00020\u00032\b\b\u0001\u0010\t\u001a\u00020\nH'J\u0012\u0010\u000b\u001a\u00020\u00032\b\b\u0001\u0010\t\u001a\u00020\fH'J\u0012\u0010\r\u001a\u00020\u00032\b\b\u0001\u0010\t\u001a\u00020\u000eH'J\u0012\u0010\u000f\u001a\u00020\u00032\b\b\u0001\u0010\t\u001a\u00020\u0010H'J\u0012\u0010\u0011\u001a\u00020\u00032\b\b\u0001\u0010\t\u001a\u00020\u0012H'J\u0012\u0010\u0013\u001a\u00020\u00032\b\b\u0001\u0010\t\u001a\u00020\u0014H'J\u0012\u0010\u0015\u001a\u00020\u00032\b\b\u0001\u0010\t\u001a\u00020\u0016H'J\u0012\u0010\u0017\u001a\u00020\u00032\b\b\u0001\u0010\t\u001a\u00020\u0018H'J\u0012\u0010\u0019\u001a\u00020\u00032\b\b\u0001\u0010\t\u001a\u00020\u001aH'J\u0012\u0010\u001b\u001a\u00020\u00032\b\b\u0001\u0010\t\u001a\u00020\u001cH'J\u0012\u0010\u001d\u001a\u00020\u00032\b\b\u0001\u0010\t\u001a\u00020\u001eH'J\u0012\u0010\u001f\u001a\u00020\u00032\b\b\u0001\u0010\t\u001a\u00020 H'J\u0012\u0010!\u001a\u00020\u00032\b\b\u0001\u0010\t\u001a\u00020\"H'J\u0012\u0010#\u001a\u00020\u00032\b\b\u0001\u0010\t\u001a\u00020$H'¨\u0006%"}, d2 = {"Lru/dodopizza/backend/domain/state/WorkflowApi;", "", "deleteDeliveryLocation", "Lru/dodopizza/backend/domain/state/dto/StateDto;", "stateId", "", "deletePromoAction", "resetPromoCode", "setAddress", "request", "Lru/dodopizza/backend/domain/state/dto/SetAddressRequestDto;", "setDeferredTime", "Lru/dodopizza/backend/domain/state/dto/SetDeferredTimeRequestDto;", "setDelivery", "Lru/dodopizza/backend/domain/state/dto/SetDeliveryRequest;", "setDeliveryLocation", "Lru/dodopizza/backend/domain/state/dto/deliverylocation/SetClientDeliveryLocationDto;", "setDeliveryLocationDetails", "Lru/dodopizza/backend/domain/state/dto/deliverylocation/SetDeliveryLocationDetailsDto;", "setDeliveryTableNumber", "Lru/dodopizza/backend/domain/state/dto/SetDeliveryTableNumberRequestDto;", "setPackageType", "Lru/dodopizza/backend/domain/state/dto/SetPackageTypeRequestDto;", "setPaymentMethod", "Lru/dodopizza/backend/domain/state/dto/payment/PaymentMethodRequestDto;", "setPersonalAction", "Lru/dodopizza/backend/domain/state/dto/SetPromoActionRequestDto;", "setPizzeria", "Lru/dodopizza/backend/domain/state/dto/SetPizzeriaRequestDto;", "setPromoCode", "Lru/dodopizza/backend/domain/state/dto/SetPromoCodeRequestDto;", "setRestaurantPizzeria", "Lru/dodopizza/backend/domain/state/dto/SetRestaurantPizzeriaRequestDto;", "setTakeaway", "Lru/dodopizza/backend/domain/state/dto/SetTakeawayRequestDto;", "setTaxPayerId", "Lru/dodopizza/backend/domain/state/dto/tax/SetTaxPayerIdDto;", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface WorkflowApi {
    @DELETE("/api/v3/address")
    StateDto deleteDeliveryLocation(@Query("stateId") String str);

    @DELETE("/api/v1/personalaction")
    StateDto deletePromoAction(@Query("stateId") String str);

    @DELETE("/api/v1/promo")
    StateDto resetPromoCode(@Query("stateId") String str);

    @POST("api/v2/address")
    StateDto setAddress(@Body SetAddressRequestDto setAddressRequestDto);

    @POST("api/v2/deferredtime")
    StateDto setDeferredTime(@Body SetDeferredTimeRequestDto setDeferredTimeRequestDto);

    @POST("api/v2/ordertype/delivery/withoutaddress")
    StateDto setDelivery(@Body SetDeliveryRequest setDeliveryRequest);

    @POST("/api/v3/address")
    StateDto setDeliveryLocation(@Body SetClientDeliveryLocationDto setClientDeliveryLocationDto);

    @POST("/api/v3/address/additions")
    StateDto setDeliveryLocationDetails(@Body SetDeliveryLocationDetailsDto setDeliveryLocationDetailsDto);

    @POST("api/v1/order/tabledelivery")
    StateDto setDeliveryTableNumber(@Body SetDeliveryTableNumberRequestDto setDeliveryTableNumberRequestDto);

    @POST("/api/v1/order/package")
    StateDto setPackageType(@Body SetPackageTypeRequestDto setPackageTypeRequestDto);

    @POST("api/v1/payments/method")
    StateDto setPaymentMethod(@Body PaymentMethodRequestDto paymentMethodRequestDto);

    @POST("/api/v1/personalaction")
    StateDto setPersonalAction(@Body SetPromoActionRequestDto setPromoActionRequestDto);

    @POST("api/v2/pizzeria/carryout")
    StateDto setPizzeria(@Body SetPizzeriaRequestDto setPizzeriaRequestDto);

    @POST("/api/v1/promo")
    StateDto setPromoCode(@Body SetPromoCodeRequestDto setPromoCodeRequestDto);

    @POST("api/v1/pizzeria/restaurant")
    StateDto setRestaurantPizzeria(@Body SetRestaurantPizzeriaRequestDto setRestaurantPizzeriaRequestDto);

    @POST("api/v1/order/takeaway")
    StateDto setTakeaway(@Body SetTakeawayRequestDto setTakeawayRequestDto);

    @POST("/api/v1/taxpayer")
    StateDto setTaxPayerId(@Body SetTaxPayerIdDto setTaxPayerIdDto);
}
