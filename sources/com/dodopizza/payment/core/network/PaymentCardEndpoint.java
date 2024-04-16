package com.dodopizza.payment.core.network;

import com.dodopizza.payment.core.network.dto.DeletePaymentCardRequestDto;
import com.dodopizza.payment.core.network.dto.PaymentCardResponseDto;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.Unit;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;
/* compiled from: PaymentCardEndpoint.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'J\u0018\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\b\b\u0001\u0010\t\u001a\u00020\bH'¨\u0006\u000b"}, d2 = {"Lcom/dodopizza/payment/core/network/PaymentCardEndpoint;", "", "", "provider", "Loz3;", "", "Lcom/dodopizza/payment/core/network/dto/PaymentCardResponseDto;", "getCards", "Lcom/dodopizza/payment/core/network/dto/DeletePaymentCardRequestDto;", "deleteCard", "", "payment-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public interface PaymentCardEndpoint {
    @POST("/Pay/Cards/V1/DeleteCard")
    oz3<Unit> deleteCard(@Body DeletePaymentCardRequestDto deletePaymentCardRequestDto);

    @GET("/Pay/Cards/V1/GetCards")
    oz3<Collection<PaymentCardResponseDto>> getCards(@Query("providerName") String str);
}
