package ru.dodopizza.backend.domain.payment;

import com.dodopizza.persistence.entity.UpsaleStateEntity;
import kotlin.Metadata;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import ru.dodopizza.backend.domain.payment.dto.Confirm3dsRequestDto;
import ru.dodopizza.backend.domain.payment.dto.app2app.PayByApp2AppRequestDto;
import ru.dodopizza.backend.domain.payment.dto.app2app.PayByApp2AppResponseDto;
import ru.dodopizza.backend.domain.payment.dto.sber.PayBySberPayRequestDto;
import ru.dodopizza.backend.domain.payment.dto.sber.PayBySberPayResponseDto;
import ru.dodopizza.backend.domain.payment.dto.sbp.SbpRequestDto;
import ru.dodopizza.backend.domain.payment.dto.sbp.SbpUrlResponseDto;
import ru.dodopizza.backend.domain.payment.dto.v2.PayByNewCardRequestDto;
import ru.dodopizza.backend.domain.payment.dto.v2.PayBySavedCardRequestDto;
import ru.dodopizza.backend.domain.payment.dto.v2.PaymentStatusResponseDto;
/* compiled from: PaymentAPI.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\tH'J\u001c\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\f\u001a\u00020\u0007H'J\u001c\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\u000f\u001a\u00020\u0010H'J&\u0010\u0011\u001a\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\u000f\u001a\u00020\u0012H'J&\u0010\u0013\u001a\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\u000f\u001a\u00020\u0014H'J\u001c\u0010\u0015\u001a\u00020\u00162\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\u000f\u001a\u00020\u0017H'J\u001c\u0010\u0018\u001a\u00020\u00192\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\u001a\u001a\u00020\u001bH'¨\u0006\u001c"}, d2 = {"Lru/dodopizza/backend/domain/payment/PaymentAPI;", "", "confirm3ds", "Lretrofit2/Response;", "Ljava/lang/Void;", "Lru/dodopizza/backend/client/common/EmptyResponse;", "paymentId", "", "confirm3dsRequestDto", "Lru/dodopizza/backend/domain/payment/dto/Confirm3dsRequestDto;", "getPaymentStatus", "Lru/dodopizza/backend/domain/payment/dto/v2/PaymentStatusResponseDto;", UpsaleStateEntity.FIELD_NAME_WORKFLOW_ID, "payByApp2App", "Lru/dodopizza/backend/domain/payment/dto/app2app/PayByApp2AppResponseDto;", "request", "Lru/dodopizza/backend/domain/payment/dto/app2app/PayByApp2AppRequestDto;", "payByNewCard", "Lru/dodopizza/backend/domain/payment/dto/v2/PayByNewCardRequestDto;", "payBySavedCard", "Lru/dodopizza/backend/domain/payment/dto/v2/PayBySavedCardRequestDto;", "payBySberPay", "Lru/dodopizza/backend/domain/payment/dto/sber/PayBySberPayResponseDto;", "Lru/dodopizza/backend/domain/payment/dto/sber/PayBySberPayRequestDto;", "payBySbp", "Lru/dodopizza/backend/domain/payment/dto/sbp/SbpUrlResponseDto;", "sbpRequestDto", "Lru/dodopizza/backend/domain/payment/dto/sbp/SbpRequestDto;", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface PaymentAPI {
    @POST("/api/v1/payments/{paymentId}/finish3ds")
    Response<Void> confirm3ds(@Path("paymentId") String str, @Body Confirm3dsRequestDto confirm3dsRequestDto);

    @GET("/api/v1/payments/{paymentId}/status")
    PaymentStatusResponseDto getPaymentStatus(@Path("paymentId") String str, @Query("WorkflowId") String str2);

    @POST("/api/v1/payments/{paymentId}/payByApp2App")
    PayByApp2AppResponseDto payByApp2App(@Path("paymentId") String str, @Body PayByApp2AppRequestDto payByApp2AppRequestDto);

    @POST("/api/v1/payments/{paymentId}/asyncPayByNewCard")
    Response<Void> payByNewCard(@Path("paymentId") String str, @Body PayByNewCardRequestDto payByNewCardRequestDto);

    @POST("/api/v1/payments/{paymentId}/asyncPayBySavedCard")
    Response<Void> payBySavedCard(@Path("paymentId") String str, @Body PayBySavedCardRequestDto payBySavedCardRequestDto);

    @POST("/api/v1/payments/{paymentId}/asyncPayBySberPay")
    PayBySberPayResponseDto payBySberPay(@Path("paymentId") String str, @Body PayBySberPayRequestDto payBySberPayRequestDto);

    @POST("api/v1/payments/{paymentId}/asyncPayBySbp")
    SbpUrlResponseDto payBySbp(@Path("paymentId") String str, @Body SbpRequestDto sbpRequestDto);
}
