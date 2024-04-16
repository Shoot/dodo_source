package ru.dodopizza.backend.domain.payment;

import kotlin.Metadata;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Path;
import ru.dodopizza.backend.domain.payment.dto.Confirm3dsRequestDto;
import ru.dodopizza.backend.domain.payment.dto.Confirm3dsResponseDto;
import ru.dodopizza.backend.domain.payment.dto.PayBySavedCardRequestDto;
import ru.dodopizza.backend.domain.payment.dto.PayByTokenRequestDto;
/* compiled from: PaymentAPIOld.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\tH'J\u001e\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\f\u001a\u00020\rH'J\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\u000f\u001a\u00020\u0010H'¨\u0006\u0011"}, d2 = {"Lru/dodopizza/backend/domain/payment/PaymentAPIOld;", "", "confirm3ds", "Lretrofit2/Response;", "Ljava/lang/Void;", "Lru/dodopizza/backend/client/common/EmptyResponse;", "paymentId", "", "confirm3dsRequestDto", "Lru/dodopizza/backend/domain/payment/dto/Confirm3dsRequestDto;", "payBySavedCard", "Lru/dodopizza/backend/domain/payment/dto/Confirm3dsResponseDto;", "payBySavedCardRequestDto", "Lru/dodopizza/backend/domain/payment/dto/PayBySavedCardRequestDto;", "payByToken", "payByTokenRequestDto", "Lru/dodopizza/backend/domain/payment/dto/PayByTokenRequestDto;", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface PaymentAPIOld {
    @POST("/api/v1/payments/{paymentId}/finish3ds")
    Response<Void> confirm3ds(@Path("paymentId") String str, @Body Confirm3dsRequestDto confirm3dsRequestDto);

    @POST("/api/v1/payments/{paymentId}/paybysavedcard")
    Confirm3dsResponseDto payBySavedCard(@Path("paymentId") String str, @Body PayBySavedCardRequestDto payBySavedCardRequestDto);

    @POST("/api/v1/payments/{paymentId}/paybytoken")
    Confirm3dsResponseDto payByToken(@Path("paymentId") String str, @Body PayByTokenRequestDto payByTokenRequestDto);
}
