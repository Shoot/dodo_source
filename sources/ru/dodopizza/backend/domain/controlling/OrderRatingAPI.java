package ru.dodopizza.backend.domain.controlling;

import kotlin.Metadata;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import ru.dodopizza.backend.domain.controlling.dto.CreateOrderRatingDto;
import ru.dodopizza.backend.domain.controlling.dto.RatingTagsCollectionDto;
import ru.dodopizza.backend.domain.controlling.dto.TipsOptionDto;
import ru.dodopizza.backend.domain.controlling.dto.UuidDto;
/* compiled from: OrderRatingAPI.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H'J\u0012\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H'J\u0012\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\u000bH'¨\u0006\f"}, d2 = {"Lru/dodopizza/backend/domain/controlling/OrderRatingAPI;", "", "getTags", "Lru/dodopizza/backend/domain/controlling/dto/RatingTagsCollectionDto;", "getTipsOptions", "Lru/dodopizza/backend/domain/controlling/dto/TipsOptionDto;", "orderId", "", "sendOrderRating", "Lru/dodopizza/backend/domain/controlling/dto/UuidDto;", "createOrderRaitingDto", "Lru/dodopizza/backend/domain/controlling/dto/CreateOrderRatingDto;", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface OrderRatingAPI {
    @GET("api/v2/order/feedback/tags")
    RatingTagsCollectionDto getTags();

    @GET("api/v2/order/{orderId}/tips")
    TipsOptionDto getTipsOptions(@Path("orderId") String str);

    @POST("api/v1/order/feedback")
    UuidDto sendOrderRating(@Body CreateOrderRatingDto createOrderRatingDto);
}
