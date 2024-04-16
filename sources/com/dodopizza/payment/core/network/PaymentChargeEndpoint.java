package com.dodopizza.payment.core.network;

import com.dodopizza.payment.core.network.dto.CreatePaymentRequestDto;
import com.dodopizza.payment.core.network.dto.CreatePaymentResponseDto;
import com.dodopizza.payment.core.network.dto.PayByCardIdRequestDto;
import com.dodopizza.payment.core.network.dto.PayByCardResponseDto;
import com.dodopizza.payment.core.network.dto.PayByCryptogramRequestDto;
import com.dodopizza.payment.core.network.dto.PayBySberPayRequestDto;
import com.dodopizza.payment.core.network.dto.PaymentStatusDto;
import com.dodopizza.payment.core.network.dto.SberPayResponseDto;
import kotlin.Metadata;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;
/* compiled from: PaymentChargeEndpoint.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'J\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\b\u001a\u00020\u0007H'J\u0018\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\b\u001a\u00020\u000bH'J\u0018\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00042\b\b\u0001\u0010\u000e\u001a\u00020\rH'J\"\u0010\u0014\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00120\u0011j\u0002`\u00130\u00042\b\b\u0001\u0010\b\u001a\u00020\u0007H'J\"\u0010\u0015\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00120\u0011j\u0002`\u00130\u00042\b\b\u0001\u0010\b\u001a\u00020\u000bH'J\u0018\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00042\b\b\u0001\u0010\u0017\u001a\u00020\u0016H'J\u0018\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00042\b\b\u0001\u0010\u000e\u001a\u00020\rH'¨\u0006\u001b"}, d2 = {"Lcom/dodopizza/payment/core/network/PaymentChargeEndpoint;", "", "Lcom/dodopizza/payment/core/network/dto/CreatePaymentRequestDto;", "paymentRequest", "Loz3;", "Lcom/dodopizza/payment/core/network/dto/CreatePaymentResponseDto;", "createPayment", "Lcom/dodopizza/payment/core/network/dto/PayByCryptogramRequestDto;", "chargeRequest", "Lcom/dodopizza/payment/core/network/dto/PayByCardResponseDto;", "payByToken", "Lcom/dodopizza/payment/core/network/dto/PayByCardIdRequestDto;", "payBaySavedCard", "", "paymentId", "Lcom/dodopizza/payment/core/network/dto/PaymentStatusDto;", "getPayment", "Lretrofit2/Response;", "Ljava/lang/Void;", "Lcom/dodopizza/payment/core/domain/flow/EmptyResponse;", "asyncPayByToken", "asyncPayBaySavedCard", "Lcom/dodopizza/payment/core/network/dto/PayBySberPayRequestDto;", "payBySberPayRequestDto", "Lcom/dodopizza/payment/core/network/dto/SberPayResponseDto;", "asyncPayBaySberPay", "getAsyncPayment", "payment-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public interface PaymentChargeEndpoint {
    @POST("/Pay/Payments/V2/AsyncPayBySavedCard")
    oz3<Response<Void>> asyncPayBaySavedCard(@Body PayByCardIdRequestDto payByCardIdRequestDto);

    @POST("/Pay/Payments/V2/AsyncPayBySberPay")
    oz3<SberPayResponseDto> asyncPayBaySberPay(@Body PayBySberPayRequestDto payBySberPayRequestDto);

    @POST("/Pay/Payments/V2/AsyncPayByNewCard")
    oz3<Response<Void>> asyncPayByToken(@Body PayByCryptogramRequestDto payByCryptogramRequestDto);

    @POST("/Pay/Payments/V1/CreatePayment")
    oz3<CreatePaymentResponseDto> createPayment(@Body CreatePaymentRequestDto createPaymentRequestDto);

    @GET("/Pay/Payments/V2/GetPayment")
    oz3<PaymentStatusDto> getAsyncPayment(@Query("paymentId") String str);

    @GET("/Pay/Payments/V1/GetPayment")
    oz3<PaymentStatusDto> getPayment(@Query("paymentId") String str);

    @POST("/Pay/Payments/V1/PayBySavedCard")
    oz3<PayByCardResponseDto> payBaySavedCard(@Body PayByCardIdRequestDto payByCardIdRequestDto);

    @POST("/Pay/Payments/V1/PayByNewCard")
    oz3<PayByCardResponseDto> payByToken(@Body PayByCryptogramRequestDto payByCryptogramRequestDto);
}
