package ru.dodopizza.backend.domain.bonus;

import java.util.List;
import kotlin.Metadata;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;
import ru.dodopizza.backend.domain.bonus.dto.BonusActionDto;
import ru.dodopizza.backend.domain.bonus.dto.EasyBonusRequestDto;
/* compiled from: EasyBonusApi.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H'J\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\b\b\u0001\u0010\b\u001a\u00020\tH'¨\u0006\n"}, d2 = {"Lru/dodopizza/backend/domain/bonus/EasyBonusApi;", "", "applyEasyBonusAction", "Lru/dodopizza/backend/domain/bonus/dto/BonusActionDto;", "request", "Lru/dodopizza/backend/domain/bonus/dto/EasyBonusRequestDto;", "getEasyBonusActions", "", "stateId", "", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface EasyBonusApi {
    @POST("api/v1/easyBonus")
    BonusActionDto applyEasyBonusAction(@Body EasyBonusRequestDto easyBonusRequestDto);

    @GET("api/v1/easyBonus")
    List<BonusActionDto> getEasyBonusActions(@Query("stateId") String str);
}
