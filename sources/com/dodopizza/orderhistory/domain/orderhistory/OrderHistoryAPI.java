package com.dodopizza.orderhistory.domain.orderhistory;

import java.util.List;
import kotlin.Metadata;
import retrofit2.http.GET;
/* compiled from: OrderHistoryAPI.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'¨\u0006\u0005"}, d2 = {"Lcom/dodopizza/orderhistory/domain/orderhistory/OrderHistoryAPI;", "", "", "Lxe7;", "getHistory", "orderhistory_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public interface OrderHistoryAPI {
    @GET("api/v1/order/history")
    List<xe7> getHistory();
}
