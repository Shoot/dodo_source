package com.dodopizza.order.domain.assistant;

import kotlin.Metadata;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;
/* compiled from: AssistantApi.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'J\u0012\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0007\u001a\u00020\u0006H'¨\u0006\n"}, d2 = {"Lcom/dodopizza/order/domain/assistant/AssistantApi;", "", "", "stateId", "Lvv;", "getSettings", "Lmt;", "request", "Ltt;", "generate", "order_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public interface AssistantApi {
    @POST("api/v1/assistant/products/generate")
    tt generate(@Body mt mtVar);

    @GET("api/v1/assistant/products/settings")
    vv getSettings(@Query("stateId") String str);
}
