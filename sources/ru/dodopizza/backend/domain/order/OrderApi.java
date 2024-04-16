package ru.dodopizza.backend.domain.order;

import com.facebook.flipper.BuildConfig;
import com.inappstory.sdk.network.NetworkHandler;
import java.util.List;
import kotlin.Metadata;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.HTTP;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import ru.dodopizza.backend.domain.cart.dto.OrderResponseDto;
import ru.dodopizza.backend.domain.order.dto.CancelOrderRequest;
import ru.dodopizza.backend.domain.order.dto.CancelOrderResponseDto;
import ru.dodopizza.backend.domain.order.dto.CreateOrderRequestDto;
import ru.dodopizza.backend.domain.order.dto.DataOrderDto;
import ru.dodopizza.backend.domain.order.dto.PositionCourierDto;
import ru.dodopizza.backend.domain.order.dto.RepeatOrderDto;
/* compiled from: OrderApi.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H'J\u0012\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\tH'J\u0012\u0010\n\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\tH'J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH'J\u0012\u0010\u000e\u001a\u00020\u00072\b\b\u0001\u0010\u000f\u001a\u00020\u0010H'J\u001e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\f2\u000e\b\u0001\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\fH'J\u0012\u0010\u0014\u001a\u00020\u00072\b\b\u0001\u0010\u0015\u001a\u00020\u0016H'¨\u0006\u0017"}, d2 = {"Lru/dodopizza/backend/domain/order/OrderApi;", "", "cancelOrder", "Lru/dodopizza/backend/domain/order/dto/CancelOrderResponseDto;", "cancelOrderRequest", "Lru/dodopizza/backend/domain/order/dto/CancelOrderRequest;", "createOrder", "Lru/dodopizza/backend/domain/cart/dto/OrderResponseDto;", "createOrderRequest", "Lru/dodopizza/backend/domain/order/dto/CreateOrderRequestDto;", "createOrderV5", "getActiveOrders", "", "Lru/dodopizza/backend/domain/order/dto/DataOrderDto;", "getPayedOrder", "stateId", "", "getPositionCourier", "Lru/dodopizza/backend/domain/order/dto/PositionCourierDto;", "orderId", "repeatOrder", "repeatOrderDto", "Lru/dodopizza/backend/domain/order/dto/RepeatOrderDto;", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface OrderApi {
    @HTTP(hasBody = BuildConfig.IS_INTERNAL_BUILD, method = NetworkHandler.DELETE, path = "/api/v1/order")
    CancelOrderResponseDto cancelOrder(@Body CancelOrderRequest cancelOrderRequest);

    @POST("/api/v3/order")
    OrderResponseDto createOrder(@Body CreateOrderRequestDto createOrderRequestDto);

    @POST("/api/v5/order")
    OrderResponseDto createOrderV5(@Body CreateOrderRequestDto createOrderRequestDto);

    @GET("/api/v1/order")
    List<DataOrderDto> getActiveOrders();

    @GET("api/v1/state/{stateId}")
    OrderResponseDto getPayedOrder(@Path("stateId") String str);

    @GET("/api/v1/order/courierlocation")
    List<PositionCourierDto> getPositionCourier(@Query("orderId") List<String> list);

    @POST("/api/v1/order/repeat")
    OrderResponseDto repeatOrder(@Body RepeatOrderDto repeatOrderDto);
}
