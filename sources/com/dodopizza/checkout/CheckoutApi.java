package com.dodopizza.checkout;

import com.dodopizza.checkout.model.TokenizeRequestDto;
import kotlin.Metadata;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;
/* compiled from: CheckoutApi.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'¨\u0006\u0007"}, d2 = {"Lcom/dodopizza/checkout/CheckoutApi;", "", "createToken", "", "publicKey", "tokenizeRequestDto", "Lcom/dodopizza/checkout/model/TokenizeRequestDto;", "checkout_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
public interface CheckoutApi {
    @POST("/tokens")
    String createToken(@Header("Authorization") String str, @Body TokenizeRequestDto tokenizeRequestDto);
}
