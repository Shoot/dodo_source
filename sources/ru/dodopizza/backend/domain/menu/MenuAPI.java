package ru.dodopizza.backend.domain.menu;

import com.dodopizza.persistence.entity.locality.LocalityEntity;
import im.threads.business.transport.MessageAttributes;
import kotlin.Metadata;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import ru.dodopizza.backend.domain.menu.dto.FavoriteDto;
import ru.dodopizza.backend.domain.menu.dto.HotAndReadyDto;
import ru.dodopizza.backend.domain.menu.dto.MenuDto;
import ru.dodopizza.backend.domain.menu.dtov5.HotAndReadyDtoV5;
import ru.dodopizza.backend.domain.menu.dtov5.MenuDtoV5;
/* compiled from: MenuAPI.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H'J\u001c\u0010\b\u001a\u00020\u00032\b\b\u0001\u0010\t\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H'J\u001c\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\t\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H'J\u001c\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\t\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H'J2\u0010\u000e\u001a\u00020\u000f2\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\u0010\u001a\u00020\u00112\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0005H'J<\u0010\u0013\u001a\u00020\u000f2\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\t\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\u0010\u001a\u00020\u00112\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0005H'J\u001c\u0010\u0014\u001a\u00020\u00152\b\b\u0001\u0010\t\u001a\u00020\u00052\b\b\u0001\u0010\u0016\u001a\u00020\u0005H'J2\u0010\u0017\u001a\u00020\u000f2\b\b\u0001\u0010\t\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\u0010\u001a\u00020\u00112\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0005H'J\u001c\u0010\u0018\u001a\u00020\u00032\b\b\u0001\u0010\t\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H'¨\u0006\u0019"}, d2 = {"Lru/dodopizza/backend/domain/menu/MenuAPI;", "", "getDeliveryMenuByLocalityV5", "Lru/dodopizza/backend/domain/menu/dtov5/MenuDtoV5;", "localityId", "", LocalityEntity.FIELD_COUNTRY_CODE, "", "getDeliveryMenuByPizzeriaV5", "pizzeriaId", "getHotAndReady", "Lru/dodopizza/backend/domain/menu/dto/HotAndReadyDto;", "getHotAndReadyV5", "Lru/dodopizza/backend/domain/menu/dtov5/HotAndReadyDtoV5;", "getMenuByLocalityV4", "Lru/dodopizza/backend/domain/menu/dto/MenuDto;", "withMetaProducts", "", "preferredImageFormat", "getMenuByPizzeriaV4", "getRestaurantFavorites", "Lru/dodopizza/backend/domain/menu/dto/FavoriteDto;", MessageAttributes.CLIENT_ID, "getRestaurantMenuByPizzeriaV4", "getRestaurantMenuByPizzeriaV5", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface MenuAPI {
    @GET("api/v5/menu/delivery/countries/{countryCode}/localities/{localityId}")
    MenuDtoV5 getDeliveryMenuByLocalityV5(@Path("localityId") String str, @Path("countryCode") int i);

    @GET("api/v5/menu/delivery/countries/{countryCode}/pizzerias/{pizzeriaId}")
    MenuDtoV5 getDeliveryMenuByPizzeriaV5(@Path("pizzeriaId") String str, @Path("countryCode") int i);

    @GET("api/v2/hotandready")
    HotAndReadyDto getHotAndReady(@Query("PizzeriaId") String str, @Query("CountryCode") int i);

    @GET("api/v3/hotandready/countries/{countryCode}/pizzerias/{pizzeriaId}")
    HotAndReadyDtoV5 getHotAndReadyV5(@Path("pizzeriaId") String str, @Path("countryCode") int i);

    @GET("api/v4/menu/delivery/{countryCode}/{localityId}")
    MenuDto getMenuByLocalityV4(@Path("localityId") String str, @Path("countryCode") int i, @Query("withMetaProducts") boolean z, @Query("PreferredImageFormat") String str2);

    @GET("api/v4/menu/delivery/{countryCode}/{localityId}/{pizzeriaId}")
    MenuDto getMenuByPizzeriaV4(@Path("localityId") String str, @Path("pizzeriaId") String str2, @Path("countryCode") int i, @Query("withMetaProducts") boolean z, @Query("PreferredImageFormat") String str3);

    @GET("api/v1/favorites/restaurant")
    FavoriteDto getRestaurantFavorites(@Query("PizzeriaId") String str, @Query("ClientId") String str2);

    @GET("api/v4/menu/restaurant/{countryCode}/{pizzeriaId}")
    MenuDto getRestaurantMenuByPizzeriaV4(@Path("pizzeriaId") String str, @Path("countryCode") int i, @Query("withMetaProducts") boolean z, @Query("PreferredImageFormat") String str2);

    @GET("api/v5/menu/dinein/countries/{countryCode}/pizzerias/{pizzeriaId}")
    MenuDtoV5 getRestaurantMenuByPizzeriaV5(@Path("pizzeriaId") String str, @Path("countryCode") int i);
}
