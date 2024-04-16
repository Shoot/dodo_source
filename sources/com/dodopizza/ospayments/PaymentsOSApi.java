package com.dodopizza.ospayments;

import com.dodopizza.ospayments.model.CreateTokenDto;
import com.dodopizza.ospayments.model.CreateTokenResponseDto;
import kotlin.Metadata;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;
/* compiled from: PaymentsOSApi.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H'¨\u0006\b"}, d2 = {"Lcom/dodopizza/ospayments/PaymentsOSApi;", "", "createToken", "Lcom/dodopizza/ospayments/model/CreateTokenResponseDto;", "publicKey", "", "createTokenDto", "Lcom/dodopizza/ospayments/model/CreateTokenDto;", "ospayments_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public interface PaymentsOSApi {
    @POST("tokens")
    CreateTokenResponseDto createToken(@Header("public_key") String str, @Body CreateTokenDto createTokenDto);
}
