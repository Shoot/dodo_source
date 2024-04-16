package com.dodopizza.orderhistory.domain.check;

import java.util.List;
import kotlin.Metadata;
import retrofit2.http.GET;
import retrofit2.http.Path;
/* compiled from: CheckApi.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¨\u0006\u0007"}, d2 = {"Lcom/dodopizza/orderhistory/domain/check/CheckApi;", "", "", "orderId", "", "Le31;", "getChecks", "orderhistory_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public interface CheckApi {
    @GET("/api/v3/order/{orderId}/receipts")
    List<e31> getChecks(@Path("orderId") String str);
}
