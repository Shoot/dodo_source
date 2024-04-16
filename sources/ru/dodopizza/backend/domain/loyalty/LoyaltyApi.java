package ru.dodopizza.backend.domain.loyalty;

import com.dodopizza.persistence.entity.locality.LocalityEntity;
import kotlin.Metadata;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;
import ru.dodopizza.backend.domain.loyalty.dto.LoyaltyMenuDto;
import ru.dodopizza.backend.domain.loyalty.dto.coinsexpirations.CoinsExpirationsInfoDto;
import ru.dodopizza.backend.domain.loyalty.dto.history.LoyaltyHistoryDto;
import ru.dodopizza.backend.domain.loyalty.dto.mission.LoyaltyMissionAcceptRequestDto;
import ru.dodopizza.backend.domain.loyalty.dto.mission.LoyaltyMissionAnswerRequestDto;
import ru.dodopizza.backend.domain.loyalty.dto.mission.LoyaltyMissionsInfoDto;
import ru.dodopizza.backend.domain.loyalty.dto.ordergame.OrderGameParamsDto;
import ru.dodopizza.backend.domain.loyalty.dto.ordergame.OrderGameRewardDto;
import ru.dodopizza.backend.domain.loyalty.dto.ordergame.OrderGameRewardRequest;
import ru.dodopizza.backend.domain.loyalty.dto.referralsystem.EnterCodeAvailabilityDto;
import ru.dodopizza.backend.domain.loyalty.dto.referralsystem.ReferralCodeAnswerDto;
import ru.dodopizza.backend.domain.loyalty.dto.referralsystem.ReferrerInfoDto;
import ru.dodopizza.backend.domain.loyalty.dto.referralsystem.SendReferralCodeRequest;
import ru.dodopizza.backend.domain.loyalty.dto.referralsystem.history.ReferrerHistoryDto;
/* compiled from: LoyaltyApi.kt */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H'J\u0012\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\u000bH'J(\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u000e\u001a\u00020\u000b2\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\b\b\u0003\u0010\u0010\u001a\u00020\u000bH'J(\u0010\u0011\u001a\u00020\r2\b\b\u0001\u0010\u000e\u001a\u00020\u000b2\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\b\b\u0003\u0010\u0010\u001a\u00020\u000bH'J\b\u0010\u0012\u001a\u00020\u0013H'J\u0012\u0010\u0014\u001a\u00020\u00152\b\b\u0001\u0010\u0016\u001a\u00020\u000bH'J\u001c\u0010\u0017\u001a\u00020\u00182\b\b\u0001\u0010\u0019\u001a\u00020\u001a2\b\b\u0001\u0010\u001b\u001a\u00020\u001aH'J\b\u0010\u001c\u001a\u00020\u001dH'J\b\u0010\u001e\u001a\u00020\u001fH'J\b\u0010 \u001a\u00020!H'J\u0012\u0010\"\u001a\u00020#2\b\b\u0001\u0010$\u001a\u00020%H'J\u0012\u0010&\u001a\u00020'2\b\b\u0001\u0010(\u001a\u00020)H'J\u001c\u0010*\u001a\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u00052\b\b\u0001\u0010\u0006\u001a\u00020+H'¨\u0006,"}, d2 = {"Lru/dodopizza/backend/domain/loyalty/LoyaltyApi;", "", "acceptMission", "Lretrofit2/Response;", "Ljava/lang/Void;", "Lru/dodopizza/backend/client/common/EmptyResponse;", "requestDto", "Lru/dodopizza/backend/domain/loyalty/dto/mission/LoyaltyMissionAcceptRequestDto;", "getActiveOrderGameParams", "Lru/dodopizza/backend/domain/loyalty/dto/ordergame/OrderGameParamsDto;", "orderId", "", "getCarryoutLoyaltyMenu", "Lru/dodopizza/backend/domain/loyalty/dto/LoyaltyMenuDto;", "localityId", "pizzeriaId", "preferredImageFormat", "getDeliveryLoyaltyMenu", "getEnterCodeAvailability", "Lru/dodopizza/backend/domain/loyalty/dto/referralsystem/EnterCodeAvailabilityDto;", "getExpirationsInfo", "Lru/dodopizza/backend/domain/loyalty/dto/coinsexpirations/CoinsExpirationsInfoDto;", LocalityEntity.FIELD_COUNTRY_CODE, "getHistory", "Lru/dodopizza/backend/domain/loyalty/dto/history/LoyaltyHistoryDto;", "takeCount", "", "skipCount", "getLoyaltyMissionsInfo", "Lru/dodopizza/backend/domain/loyalty/dto/mission/LoyaltyMissionsInfoDto;", "getReferrerHistory", "Lru/dodopizza/backend/domain/loyalty/dto/referralsystem/history/ReferrerHistoryDto;", "getReferrerInfo", "Lru/dodopizza/backend/domain/loyalty/dto/referralsystem/ReferrerInfoDto;", "receiveReward", "Lru/dodopizza/backend/domain/loyalty/dto/ordergame/OrderGameRewardDto;", "rewardRequest", "Lru/dodopizza/backend/domain/loyalty/dto/ordergame/OrderGameRewardRequest;", "sendReferralCode", "Lru/dodopizza/backend/domain/loyalty/dto/referralsystem/ReferralCodeAnswerDto;", "code", "Lru/dodopizza/backend/domain/loyalty/dto/referralsystem/SendReferralCodeRequest;", "sendUserAnswer", "Lru/dodopizza/backend/domain/loyalty/dto/mission/LoyaltyMissionAnswerRequestDto;", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface LoyaltyApi {

    /* compiled from: LoyaltyApi.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ LoyaltyMenuDto getCarryoutLoyaltyMenu$default(LoyaltyApi loyaltyApi, String str, String str2, String str3, int i, Object obj) {
            if (obj == null) {
                if ((i & 4) != 0) {
                    str3 = "webp";
                }
                return loyaltyApi.getCarryoutLoyaltyMenu(str, str2, str3);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCarryoutLoyaltyMenu");
        }

        public static /* synthetic */ LoyaltyMenuDto getDeliveryLoyaltyMenu$default(LoyaltyApi loyaltyApi, String str, String str2, String str3, int i, Object obj) {
            if (obj == null) {
                if ((i & 4) != 0) {
                    str3 = "webp";
                }
                return loyaltyApi.getDeliveryLoyaltyMenu(str, str2, str3);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getDeliveryLoyaltyMenu");
        }
    }

    @POST("api/v1/missions")
    Response<Void> acceptMission(@Body LoyaltyMissionAcceptRequestDto loyaltyMissionAcceptRequestDto);

    @GET("api/v1/activeordergame")
    OrderGameParamsDto getActiveOrderGameParams(@Query("orderId") String str);

    @GET("api/v1/loyalty/menu/restaurant")
    LoyaltyMenuDto getCarryoutLoyaltyMenu(@Query("LocalityId") String str, @Query("PizzeriaId") String str2, @Query("PreferredImageFormat") String str3);

    @GET("api/v1/loyalty/menu/delivery")
    LoyaltyMenuDto getDeliveryLoyaltyMenu(@Query("LocalityId") String str, @Query("PizzeriaId") String str2, @Query("PreferredImageFormat") String str3);

    @GET("/api/v1/referralprogram/code/availability")
    EnterCodeAvailabilityDto getEnterCodeAvailability();

    @GET("api/v1/loyalty/coins/expirations")
    CoinsExpirationsInfoDto getExpirationsInfo(@Query("countryCode") String str);

    @GET("api/v1/loyalty/coins/history")
    LoyaltyHistoryDto getHistory(@Query("take") int i, @Query("skip") int i2);

    @GET("api/v1/missions")
    LoyaltyMissionsInfoDto getLoyaltyMissionsInfo();

    @GET("/api/v1/referrers/history")
    ReferrerHistoryDto getReferrerHistory();

    @GET("/api/v1/referrers/info")
    ReferrerInfoDto getReferrerInfo();

    @POST("api/v1/activeordergame/reward")
    OrderGameRewardDto receiveReward(@Body OrderGameRewardRequest orderGameRewardRequest);

    @POST("/api/v1/referralprogram/code")
    ReferralCodeAnswerDto sendReferralCode(@Body SendReferralCodeRequest sendReferralCodeRequest);

    @POST("api/v1/missions/perform")
    Response<Void> sendUserAnswer(@Body LoyaltyMissionAnswerRequestDto loyaltyMissionAnswerRequestDto);
}
