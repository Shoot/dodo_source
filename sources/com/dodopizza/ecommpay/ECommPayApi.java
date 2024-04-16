package com.dodopizza.ecommpay;

import com.dodopizza.ecommpay.model.TokenizeRequestDto;
import com.dodopizza.ecommpay.model.TokenizeResponseDto;
import kotlin.Metadata;
import retrofit2.http.Body;
import retrofit2.http.POST;
/* compiled from: ECommPayApi.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H'¨\u0006\u0006"}, d2 = {"Lcom/dodopizza/ecommpay/ECommPayApi;", "", "createToken", "Lcom/dodopizza/ecommpay/model/TokenizeResponseDto;", "tokenizeRequestDto", "Lcom/dodopizza/ecommpay/model/TokenizeRequestDto;", "ecommpaypayments_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
public interface ECommPayApi {
    @POST("/v2/customer/card/checkout/tokenize")
    TokenizeResponseDto createToken(@Body TokenizeRequestDto tokenizeRequestDto);
}
