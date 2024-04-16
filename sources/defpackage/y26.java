package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.ka9;
import defpackage.xl6;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.dodopizza.app.domain.country.CountryService;
import ru.dodopizza.backend.domain.loyalty.LoyaltyApi;
import ru.dodopizza.backend.domain.loyalty.dto.LoyaltyMenuDto;
import ru.dodopizza.backend.domain.loyalty.dto.LoyaltyProductCategoryDto;
import ru.dodopizza.backend.domain.loyalty.dto.LoyaltyProductDto;
import ru.dodopizza.backend.domain.loyalty.dto.coinsexpirations.CoinExpirationDto;
import ru.dodopizza.backend.domain.loyalty.dto.coinsexpirations.CoinsExpirationsInfoDto;
import ru.dodopizza.backend.domain.loyalty.dto.history.LoyaltyOperationDto;
import ru.dodopizza.backend.domain.loyalty.dto.mission.LoyaltyMissionAcceptRequestDto;
import ru.dodopizza.backend.domain.loyalty.dto.mission.LoyaltyMissionAnswerRequestDto;
import ru.dodopizza.backend.domain.loyalty.dto.mission.LoyaltyMissionDto;
import ru.dodopizza.backend.domain.loyalty.dto.mission.LoyaltyMissionStatusDto;
import ru.dodopizza.backend.domain.loyalty.dto.mission.LoyaltyMissionsInfoDto;
import ru.dodopizza.backend.domain.loyalty.dto.ordergame.OrderGameErrorDto;
import ru.dodopizza.backend.domain.loyalty.dto.ordergame.OrderGameParamsDto;
import ru.dodopizza.backend.domain.loyalty.dto.ordergame.OrderGameRewardRequest;
import ru.dodopizza.backend.domain.loyalty.dto.referralsystem.ReferralCodeAnswerDto;
import ru.dodopizza.backend.domain.loyalty.dto.referralsystem.ReferralCodeErrorDto;
import ru.dodopizza.backend.domain.loyalty.dto.referralsystem.ReferrerInfoDto;
import ru.dodopizza.backend.domain.loyalty.dto.referralsystem.ReferrerRewardDto;
import ru.dodopizza.backend.domain.loyalty.dto.referralsystem.SendReferralCodeRequest;
import ru.dodopizza.backend.domain.loyalty.dto.referralsystem.history.ReferrerHistoryOperationDto;
/* compiled from: LoyaltyService.kt */
@Metadata(d1 = {"\u0000Ö\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 72\u00020\u0001:\u0001)BI\b\u0007\u0012\u0006\u0010;\u001a\u000209\u0012\u0006\u0010>\u001a\u00020<\u0012\u0006\u0010A\u001a\u00020?\u0012\u0006\u0010D\u001a\u00020B\u0012\u0006\u0010G\u001a\u00020E\u0012\u0006\u0010J\u001a\u00020H\u0012\u0006\u0010M\u001a\u00020K\u0012\u0006\u0010P\u001a\u00020N¢\u0006\u0004\bQ\u0010RJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u0002J\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u0004H\u0002J\u0018\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\u0010\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u0014H\u0002J\u0010\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0003\u001a\u00020\u0017H\u0002J\u001a\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001aH\u0016J\u001a\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001aH\u0016J\b\u0010 \u001a\u00020\u001fH\u0016J\u001a\u0010#\u001a\u0004\u0018\u00010\r2\u0006\u0010!\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020\u001aH\u0016J\u0012\u0010$\u001a\u0004\u0018\u00010\r2\u0006\u0010!\u001a\u00020\u001aH\u0016J\u0016\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00150'2\u0006\u0010&\u001a\u00020%H\u0016J\b\u0010)\u001a\u00020\u0018H\u0016J\b\u0010*\u001a\u00020\u0006H\u0016J\u000e\u0010,\u001a\b\u0012\u0004\u0012\u00020+0'H\u0016J\b\u0010-\u001a\u00020\u0004H\u0016J\u0010\u00100\u001a\u00020/2\u0006\u0010.\u001a\u00020\u001aH\u0016J\u0010\u00103\u001a\u0002022\u0006\u00101\u001a\u00020\u001aH\u0016J%\u00107\u001a\u0002062\u0006\u00101\u001a\u00020\u001a2\u0006\u00105\u001a\u000204H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b7\u00108R\u0014\u0010;\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010:R\u0014\u0010>\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010=R\u0014\u0010A\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010@R\u0014\u0010D\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010CR\u0014\u0010G\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010FR\u0014\u0010J\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010IR\u0014\u0010M\u001a\u00020K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010LR\u0014\u0010P\u001a\u00020N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010O\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006S"}, d2 = {"Ly26;", "Lx26;", "Lru/dodopizza/backend/domain/loyalty/dto/referralsystem/ReferrerInfoDto;", "dto", "", "isEnterCodeAvailable", "Lac9;", "o", "Lru/dodopizza/backend/domain/loyalty/dto/LoyaltyMenuDto;", "isTransparentImageUrlEnabled", "Lt06;", "k", "Lru/dodopizza/backend/domain/loyalty/dto/mission/LoyaltyMissionDto;", "Lx06;", "l", "Lru/dodopizza/backend/domain/loyalty/dto/mission/LoyaltyMissionStatusDto;", "Lxl6;", "missionType", "Lwl6;", "n", "Lru/dodopizza/backend/domain/loyalty/dto/history/LoyaltyOperationDto;", "Lo06;", Image.TYPE_MEDIUM, "Lru/dodopizza/backend/domain/loyalty/dto/coinsexpirations/CoinsExpirationsInfoDto;", "Lab1;", "j", "", "localityId", "pizzeriaId", Image.TYPE_HIGH, "f", "Lt16;", "getLoyaltyMissionsInfo", "missionId", "userAnswer", "g", c.a, "", "alreadyLoadedCount", "", e.a, "a", "getReferrerInfo", "Lra9;", "getReferrerHistory", "getEnterCodeAvailability", "code", "Lja9;", DateTokenConverter.CONVERTER_KEY, "activeOrderId", "Lwd7;", "b", "", "rewardAmount", "Lxd7;", "i", "(Ljava/lang/String;D)Ljava/lang/String;", "Ldt5;", "Ldt5;", "currentLocality", "Lru/dodopizza/app/domain/country/CountryService;", "Lru/dodopizza/app/domain/country/CountryService;", "countryService", "Lru/dodopizza/backend/domain/loyalty/LoyaltyApi;", "Lru/dodopizza/backend/domain/loyalty/LoyaltyApi;", "loyaltyApi", "Lv06;", "Lv06;", "loyaltyMenuRepository", "Lu16;", "Lu16;", "loyaltyMissionsRepository", "Lbb1;", "Lbb1;", "expirationsRepository", "Ltb9;", "Ltb9;", "referralSystemRepository", "Lhq3;", "Lhq3;", "featureService", "<init>", "(Ldt5;Lru/dodopizza/app/domain/country/CountryService;Lru/dodopizza/backend/domain/loyalty/LoyaltyApi;Lv06;Lu16;Lbb1;Ltb9;Lhq3;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: y26  reason: default package */
/* loaded from: classes4.dex */
public final class y26 implements x26 {
    private static final a i = new a(null);
    private final dt5 a;
    private final CountryService b;
    private final LoyaltyApi c;
    private final v06 d;
    private final u16 e;
    private final bb1 f;
    private final tb9 g;
    private final hq3 h;

    /* compiled from: LoyaltyService.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Ly26$a;", "", "", "DEFAULT_LOAD_COUNT", "I", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: y26$a */
    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public y26(dt5 dt5Var, CountryService countryService, LoyaltyApi loyaltyApi, v06 v06Var, u16 u16Var, bb1 bb1Var, tb9 tb9Var, hq3 hq3Var) {
        z65.h(dt5Var, "currentLocality");
        z65.h(countryService, "countryService");
        z65.h(loyaltyApi, "loyaltyApi");
        z65.h(v06Var, "loyaltyMenuRepository");
        z65.h(u16Var, "loyaltyMissionsRepository");
        z65.h(bb1Var, "expirationsRepository");
        z65.h(tb9Var, "referralSystemRepository");
        z65.h(hq3Var, "featureService");
        this.a = dt5Var;
        this.b = countryService;
        this.c = loyaltyApi;
        this.d = v06Var;
        this.e = u16Var;
        this.f = bb1Var;
        this.g = tb9Var;
        this.h = hq3Var;
    }

    private final ab1 j(CoinsExpirationsInfoDto coinsExpirationsInfoDto) {
        int w;
        int expirationPeriodInDays = coinsExpirationsInfoDto.getExpirationPeriodInDays();
        int extraExpirationPeriodInDays = coinsExpirationsInfoDto.getExtraExpirationPeriodInDays();
        List<CoinExpirationDto> coinsExpirations = coinsExpirationsInfoDto.getCoinsExpirations();
        w = lc1.w(coinsExpirations, 10);
        ArrayList arrayList = new ArrayList(w);
        for (CoinExpirationDto coinExpirationDto : coinsExpirations) {
            arrayList.add(new wa1(coinExpirationDto.getExpirationDateTimeUtc(), coinExpirationDto.getExpirationAmount()));
        }
        return new ab1(expirationPeriodInDays, extraExpirationPeriodInDays, arrayList);
    }

    private final t06 k(LoyaltyMenuDto loyaltyMenuDto, boolean z) {
        int w;
        int w2;
        hn6 b = kn6.c.b(loyaltyMenuDto.getMinimalLegalPrice());
        String loyaltyGuideURL = loyaltyMenuDto.getLoyaltyGuideURL();
        if (loyaltyGuideURL == null) {
            loyaltyGuideURL = "";
        }
        List<LoyaltyProductCategoryDto> categories = loyaltyMenuDto.getCategories();
        w = lc1.w(categories, 10);
        ArrayList arrayList = new ArrayList(w);
        for (LoyaltyProductCategoryDto loyaltyProductCategoryDto : categories) {
            String id = loyaltyProductCategoryDto.getId();
            String name = loyaltyProductCategoryDto.getName();
            tl8 b2 = ug6.b(loyaltyProductCategoryDto.getImage(), z);
            double price = loyaltyProductCategoryDto.getPrice();
            List<LoyaltyProductDto> products = loyaltyProductCategoryDto.getProducts();
            w2 = lc1.w(products, 10);
            ArrayList arrayList2 = new ArrayList(w2);
            for (LoyaltyProductDto loyaltyProductDto : products) {
                String productId = loyaltyProductDto.getProductId();
                String shoppingId = loyaltyProductDto.getShoppingId();
                String name2 = loyaltyProductDto.getName();
                String description = loyaltyProductDto.getDescription();
                if (description == null) {
                    description = "";
                }
                arrayList2.add(new y16(productId, shoppingId, name2, description, ug6.b(loyaltyProductDto.getImage(), z)));
            }
            arrayList.add(new a26(id, name, b2, price, arrayList2));
        }
        return new t06(b, loyaltyGuideURL, arrayList);
    }

    private final x06 l(LoyaltyMissionDto loyaltyMissionDto, boolean z) {
        xl6 bVar;
        if (loyaltyMissionDto.getType() == 1) {
            bVar = xl6.a.a;
        } else {
            bVar = new xl6.b(loyaltyMissionDto.getAnswerMaxLimit(), loyaltyMissionDto.getAnswerMinLength());
        }
        xl6 xl6Var = bVar;
        return new x06(loyaltyMissionDto.getId(), ug6.a(loyaltyMissionDto.getImage(), z), loyaltyMissionDto.getRewardAmount(), loyaltyMissionDto.getTitle(), loyaltyMissionDto.getDescription(), xl6Var, n(loyaltyMissionDto.getStatus(), xl6Var), loyaltyMissionDto.getEndDateTimeUtc());
    }

    private final o06 m(LoyaltyOperationDto loyaltyOperationDto) {
        gb7 gb7Var;
        eb7 eb7Var;
        int type = loyaltyOperationDto.getType();
        if (type != 1) {
            if (type != 2) {
                if (type == 3) {
                    gb7Var = gb7.c;
                } else {
                    throw new IllegalStateException("Not permitted value".toString());
                }
            } else {
                gb7Var = gb7.b;
            }
        } else {
            gb7Var = gb7.a;
        }
        gb7 gb7Var2 = gb7Var;
        int type2 = loyaltyOperationDto.getSource().getType();
        if (type2 != 1) {
            if (type2 != 2) {
                if (type2 != 3) {
                    if (type2 != 4) {
                        eb7Var = eb7.a;
                    } else {
                        eb7Var = eb7.e;
                    }
                } else {
                    eb7Var = eb7.d;
                }
            } else {
                eb7Var = eb7.c;
            }
        } else {
            eb7Var = eb7.b;
        }
        return new o06(gb7Var2, new q06(eb7Var, loyaltyOperationDto.getSource().getDescription()), (long) loyaltyOperationDto.getAmount(), loyaltyOperationDto.getDate(), loyaltyOperationDto.getExpirationDate(), loyaltyOperationDto.isExtraCashBack());
    }

    private final wl6 n(LoyaltyMissionStatusDto loyaltyMissionStatusDto, xl6 xl6Var) {
        wl6 zxbVar;
        int statusType = loyaltyMissionStatusDto.getStatusType();
        if (statusType != 1) {
            String str = "";
            if (statusType != 2) {
                if (statusType != 3) {
                    if (statusType != 4) {
                        if (statusType != 5) {
                            return gf4.a;
                        }
                        int intValue = ((Number) mh5.c(loyaltyMissionStatusDto.getCurrentProgress(), 0)).intValue();
                        int intValue2 = ((Number) mh5.c(loyaltyMissionStatusDto.getTotalProgress(), 0)).intValue();
                        String moderatorResponse = loyaltyMissionStatusDto.getModeratorResponse();
                        if (moderatorResponse != null) {
                            str = moderatorResponse;
                        }
                        zxbVar = new dp8(intValue, intValue2, str);
                    } else {
                        String moderatorResponse2 = loyaltyMissionStatusDto.getModeratorResponse();
                        if (moderatorResponse2 != null) {
                            str = moderatorResponse2;
                        }
                        zxbVar = new zl9(str);
                    }
                } else if (xl6Var instanceof xl6.a) {
                    zxbVar = new tl1(((Number) mh5.c(loyaltyMissionStatusDto.getTotalProgress(), 0)).intValue());
                } else {
                    String moderatorResponse3 = loyaltyMissionStatusDto.getModeratorResponse();
                    if (moderatorResponse3 == null) {
                        moderatorResponse3 = "";
                    }
                    String currentUserAnswer = loyaltyMissionStatusDto.getCurrentUserAnswer();
                    if (currentUserAnswer != null) {
                        str = currentUserAnswer;
                    }
                    zxbVar = new ul1(moderatorResponse3, str);
                }
            } else {
                String moderatorResponse4 = loyaltyMissionStatusDto.getModeratorResponse();
                if (moderatorResponse4 == null) {
                    moderatorResponse4 = "";
                }
                String currentUserAnswer2 = loyaltyMissionStatusDto.getCurrentUserAnswer();
                if (currentUserAnswer2 != null) {
                    str = currentUserAnswer2;
                }
                zxbVar = new zxb(moderatorResponse4, str);
            }
            return zxbVar;
        }
        return gf4.a;
    }

    private final ac9 o(ReferrerInfoDto referrerInfoDto, boolean z) {
        return new ac9(referrerInfoDto.getReferralCode(), referrerInfoDto.getTotalCoinsEarned(), referrerInfoDto.getTotalInvitedFriend(), referrerInfoDto.getReferrerReward(), referrerInfoDto.getReferrerRewardDescription(), referrerInfoDto.getReferralGift(), referrerInfoDto.getReferralGiftDescription(), referrerInfoDto.getInviteLink(), referrerInfoDto.getInviteMessage(), z, referrerInfoDto.getMaxReferrals());
    }

    @Override // defpackage.x26
    public synchronized ab1 a() {
        ab1 a2;
        a2 = this.f.a();
        if (a2 == null) {
            a2 = j(this.c.getExpirationsInfo(this.a.a()));
            this.f.b(a2);
        }
        return a2;
    }

    @Override // defpackage.x26
    public synchronized wd7 b(String str) {
        OrderGameParamsDto activeOrderGameParams;
        String gameUrl;
        boolean isGameAvailable;
        h81 h81Var;
        h81 h81Var2;
        try {
            z65.h(str, "activeOrderId");
            activeOrderGameParams = this.c.getActiveOrderGameParams(str);
            gameUrl = activeOrderGameParams.getGameUrl();
            isGameAvailable = activeOrderGameParams.isGameAvailable();
            if (activeOrderGameParams.isRewardClaimed()) {
                String claimedRewardOrderId = activeOrderGameParams.getClaimedRewardOrderId();
                z65.e(claimedRewardOrderId);
                Double claimedRewardAmount = activeOrderGameParams.getClaimedRewardAmount();
                z65.e(claimedRewardAmount);
                h81Var = new h81(claimedRewardOrderId, claimedRewardAmount.doubleValue());
            } else {
                h81Var = null;
            }
            h81Var2 = h81Var;
        } catch (Throwable th) {
            throw th;
        }
        return new wd7(gameUrl, isGameAvailable, h81Var2, new yd7(activeOrderGameParams.getRules().getMaxCoinsReward(), activeOrderGameParams.getRules().getPointsPerCoin(), activeOrderGameParams.getRules().getPointsRatio(), activeOrderGameParams.getRules().getCoinsRatio()), new ssa(activeOrderGameParams.getAnimations().getClaimRewardAnimation().getLightThemeUrl(), activeOrderGameParams.getAnimations().getMaxRewardReachedAnimation().getLightThemeUrl()), activeOrderGameParams.getSettings(), ht4.a.a());
    }

    @Override // defpackage.x26
    public synchronized x06 c(String str) {
        Object obj;
        try {
            z65.h(str, "missionId");
            this.c.acceptMission(new LoyaltyMissionAcceptRequestDto(str, true));
            this.e.clear();
            Iterator<T> it = getLoyaltyMissionsInfo().b().iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (z65.c(((x06) obj).getId(), str)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return (x06) obj;
    }

    @Override // defpackage.x26
    public synchronized ja9 d(String str) {
        Integer num;
        String valueOf;
        String str2;
        String str3;
        ja9 kk3Var;
        Double d;
        try {
            z65.h(str, "code");
            ReferralCodeAnswerDto sendReferralCode = this.c.sendReferralCode(new SendReferralCodeRequest(str));
            Integer num2 = null;
            if (sendReferralCode.getApplyingError() == null) {
                jb9 a2 = jb9.b.a(((Number) mh5.c(sendReferralCode.getPromoTypes(), 0)).intValue());
                int intValue = ((Number) mh5.c(sendReferralCode.getCountryId(), 0)).intValue();
                ReferrerRewardDto referrerReward = sendReferralCode.getReferrerReward();
                if (referrerReward != null) {
                    d = Double.valueOf(referrerReward.getCoinsAmount());
                } else {
                    d = null;
                }
                double doubleValue = ((Number) mh5.c(d, Double.valueOf(0.0d))).doubleValue();
                ReferrerRewardDto referrerReward2 = sendReferralCode.getReferrerReward();
                if (referrerReward2 != null) {
                    num2 = Integer.valueOf(referrerReward2.getExpirationInDays());
                }
                kk3Var = new s1b(a2, intValue, doubleValue, ((Number) mh5.c(num2, 0)).intValue());
            } else {
                try {
                    CountryService countryService = this.b;
                    Integer countryId = sendReferralCode.getCountryId();
                    z65.e(countryId);
                    valueOf = countryService.c(String.valueOf(countryId.intValue())).getName();
                } catch (Exception unused) {
                    Integer countryId2 = sendReferralCode.getCountryId();
                    if (countryId2 != null) {
                        num = (Integer) mh5.c(countryId2, 0);
                    } else {
                        num = null;
                    }
                    valueOf = String.valueOf(num);
                }
                ReferralCodeErrorDto applyingError = sendReferralCode.getApplyingError();
                if (applyingError != null) {
                    str2 = applyingError.getErrorMessage();
                } else {
                    str2 = null;
                }
                if (str2 == null) {
                    str2 = "";
                }
                ReferralCodeErrorDto applyingError2 = sendReferralCode.getApplyingError();
                if (applyingError2 != null) {
                    str3 = applyingError2.getErrorDescription();
                } else {
                    str3 = null;
                }
                if (str3 == null) {
                    str3 = "";
                }
                ka9.a aVar = ka9.b;
                ReferralCodeErrorDto applyingError3 = sendReferralCode.getApplyingError();
                if (applyingError3 != null) {
                    num2 = Integer.valueOf(applyingError3.getErrorCode());
                }
                kk3Var = new kk3(valueOf, str2, str3, aVar.a(((Number) mh5.c(num2, 0)).intValue()));
            }
        } catch (Throwable th) {
            throw th;
        }
        return kk3Var;
    }

    @Override // defpackage.x26
    public synchronized List<o06> e(int i2) {
        ArrayList arrayList;
        int w;
        List<LoyaltyOperationDto> operations = this.c.getHistory(10, i2).getOperations();
        w = lc1.w(operations, 10);
        arrayList = new ArrayList(w);
        for (LoyaltyOperationDto loyaltyOperationDto : operations) {
            arrayList.add(m(loyaltyOperationDto));
        }
        return arrayList;
    }

    @Override // defpackage.x26
    public synchronized t06 f(String str, String str2) {
        t06 b;
        z65.h(str, "localityId");
        b = this.d.b();
        if (b == null) {
            b = k(LoyaltyApi.DefaultImpls.getCarryoutLoyaltyMenu$default(this.c, str, str2, null, 4, null), this.h.a(bq3.j6));
            this.d.c(b);
        }
        return b;
    }

    @Override // defpackage.x26
    public synchronized x06 g(String str, String str2) {
        Object obj;
        try {
            z65.h(str, "missionId");
            z65.h(str2, "userAnswer");
            this.c.sendUserAnswer(new LoyaltyMissionAnswerRequestDto(str, str2));
            this.e.clear();
            Iterator<T> it = getLoyaltyMissionsInfo().b().iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (z65.c(((x06) obj).getId(), str)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return (x06) obj;
    }

    @Override // defpackage.x26
    public synchronized boolean getEnterCodeAvailability() {
        boolean isEnterCodeAvailable;
        try {
            Boolean b = this.g.b();
            if (b != null) {
                isEnterCodeAvailable = b.booleanValue();
            } else {
                isEnterCodeAvailable = this.c.getEnterCodeAvailability().isEnterCodeAvailable();
                this.g.c(isEnterCodeAvailable);
            }
        } catch (Throwable th) {
            throw th;
        }
        return isEnterCodeAvailable;
    }

    @Override // defpackage.x26
    public synchronized t16 getLoyaltyMissionsInfo() {
        t16 a2;
        int w;
        try {
            a2 = this.e.a();
            if (a2 == null) {
                LoyaltyMissionsInfoDto loyaltyMissionsInfo = this.c.getLoyaltyMissionsInfo();
                boolean a3 = this.h.a(bq3.j6);
                String aboutMissionUrl = loyaltyMissionsInfo.getAboutMissionUrl();
                List<LoyaltyMissionDto> missions = loyaltyMissionsInfo.getMissions();
                w = lc1.w(missions, 10);
                ArrayList arrayList = new ArrayList(w);
                for (LoyaltyMissionDto loyaltyMissionDto : missions) {
                    arrayList.add(l(loyaltyMissionDto, a3));
                }
                a2 = new t16(aboutMissionUrl, arrayList);
                this.e.b(a2);
            }
        } catch (Throwable th) {
            throw th;
        }
        return a2;
    }

    @Override // defpackage.x26
    public synchronized List<ra9> getReferrerHistory() {
        ArrayList arrayList;
        int w;
        List<ReferrerHistoryOperationDto> operations = this.c.getReferrerHistory().getOperations();
        w = lc1.w(operations, 10);
        arrayList = new ArrayList(w);
        for (ReferrerHistoryOperationDto referrerHistoryOperationDto : operations) {
            arrayList.add(new ra9((long) referrerHistoryOperationDto.getEarnedCoinsAmount(), referrerHistoryOperationDto.getOperationDateTimeUtc()));
        }
        return arrayList;
    }

    @Override // defpackage.x26
    public synchronized ac9 getReferrerInfo() {
        return o(this.c.getReferrerInfo(), getEnterCodeAvailability());
    }

    @Override // defpackage.x26
    public synchronized t06 h(String str, String str2) {
        t06 a2;
        z65.h(str, "localityId");
        a2 = this.d.a();
        if (a2 == null) {
            a2 = k(LoyaltyApi.DefaultImpls.getDeliveryLoyaltyMenu$default(this.c, str, str2, null, 4, null), this.h.a(bq3.j6));
            this.d.d(a2);
        }
        return a2;
    }

    @Override // defpackage.x26
    public synchronized String i(String str, double d) {
        String str2;
        try {
            z65.h(str, "activeOrderId");
            OrderGameErrorDto error = this.c.receiveReward(new OrderGameRewardRequest(str, d)).getError();
            if (error != null) {
                str2 = error.getMessage();
            } else {
                str2 = null;
            }
        } catch (Throwable th) {
            throw th;
        }
        return xd7.b(str2);
    }
}
