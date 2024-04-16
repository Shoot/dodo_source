package com.dodopizza.order.domain.halves;

import kotlin.Metadata;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
/* compiled from: ProductTagsApi.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H'¨\u0006\b"}, d2 = {"Lcom/dodopizza/order/domain/halves/ProductTagsApi;", "", "", "countryId", "", "cultures", "Lpm8;", "getTags", "order_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public interface ProductTagsApi {
    @GET("api/v1/countries/{id}/tags")
    pm8 getTags(@Path("id") int i, @Query("cultures") String str);
}
