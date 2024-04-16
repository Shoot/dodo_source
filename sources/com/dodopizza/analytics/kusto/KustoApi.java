package com.dodopizza.analytics.kusto;

import com.dodopizza.kustoworker.KustoStorage;
import java.util.Map;
import kotlin.Metadata;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;
/* compiled from: KustoApi.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J$\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002H'¨\u0006\b"}, d2 = {"Lcom/dodopizza/analytics/kusto/KustoApi;", "", "", "", KustoStorage.KustoTable.COLUMN_SOURCE, "Lretrofit2/Call;", "Lkk9;", "sendEventSource", "analytics-kusto_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public interface KustoApi {
    @POST("/api/events")
    Call<kk9> sendEventSource(@Body Map<String, Object> map);
}
