package ru.dodopizza.backend.domain.menu;

import com.dodopizza.persistence.entity.locality.LocalityEntity;
import kotlin.Metadata;
import retrofit2.http.GET;
import retrofit2.http.Query;
import ru.dodopizza.backend.domain.menu.dto.BuyMoreDto;
/* compiled from: BuyMoreAPI.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J<\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0001\u0010\u0007\u001a\u00020\u00052\b\b\u0001\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\u0005H'¨\u0006\u000b"}, d2 = {"Lru/dodopizza/backend/domain/menu/BuyMoreAPI;", "", "getBuyMoreList", "Lru/dodopizza/backend/domain/menu/dto/BuyMoreDto;", "shoppingItemId", "", "pizzeriaId", "localityId", "orderType", "", LocalityEntity.FIELD_COUNTRY_CODE, "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface BuyMoreAPI {
    @GET("/api/v1/upsellForShoppingItem")
    BuyMoreDto getBuyMoreList(@Query("ShoppingItemId") String str, @Query("PizzeriaId") String str2, @Query("LocalityId") String str3, @Query("OrderType") int i, @Query("CountryCode") String str4);
}
