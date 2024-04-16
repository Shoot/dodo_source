package ru.dodopizza.backend.domain.controlling;

import kotlin.Metadata;
import retrofit2.http.Body;
import retrofit2.http.POST;
import ru.dodopizza.backend.domain.controlling.dto.MysteryShopperCheckupDto;
import ru.dodopizza.backend.domain.controlling.dto.MysteryShopperCheckupRequestDto;
/* compiled from: MysteryShopperCheckupApi.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H'¨\u0006\u0006"}, d2 = {"Lru/dodopizza/backend/domain/controlling/MysteryShopperCheckupApi;", "", "getMysteryShopperCheckup", "Lru/dodopizza/backend/domain/controlling/dto/MysteryShopperCheckupDto;", "requestDto", "Lru/dodopizza/backend/domain/controlling/dto/MysteryShopperCheckupRequestDto;", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface MysteryShopperCheckupApi {
    @POST("api/v2/mysteryshoppercheckup")
    MysteryShopperCheckupDto getMysteryShopperCheckup(@Body MysteryShopperCheckupRequestDto mysteryShopperCheckupRequestDto);
}
