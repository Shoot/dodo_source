package ru.dodopizza.backend.domain.state.dto.cart.bonuses;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.dodopizza.backend.domain.bonus.dto.BonusActionDto;
/* compiled from: PromoCodeDto.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\tHÆ\u0003J5\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\tHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0007HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, d2 = {"Lru/dodopizza/backend/domain/state/dto/cart/bonuses/PromoCodeDto;", "", "appliedInfo", "Lru/dodopizza/backend/domain/state/dto/cart/bonuses/AppliedInfoDto;", "bonusAction", "Lru/dodopizza/backend/domain/bonus/dto/BonusActionDto;", "promoCode", "", "status", "", "(Lru/dodopizza/backend/domain/state/dto/cart/bonuses/AppliedInfoDto;Lru/dodopizza/backend/domain/bonus/dto/BonusActionDto;Ljava/lang/String;I)V", "getAppliedInfo", "()Lru/dodopizza/backend/domain/state/dto/cart/bonuses/AppliedInfoDto;", "getBonusAction", "()Lru/dodopizza/backend/domain/bonus/dto/BonusActionDto;", "getPromoCode", "()Ljava/lang/String;", "getStatus", "()I", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PromoCodeDto {
    @uca("appliedInfo")
    private final AppliedInfoDto appliedInfo;
    @uca("bonusAction")
    private final BonusActionDto bonusAction;
    @uca("promoCode")
    private final String promoCode;
    @uca("status")
    private final int status;

    public PromoCodeDto() {
        this(null, null, null, 0, 15, null);
    }

    public static /* synthetic */ PromoCodeDto copy$default(PromoCodeDto promoCodeDto, AppliedInfoDto appliedInfoDto, BonusActionDto bonusActionDto, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            appliedInfoDto = promoCodeDto.appliedInfo;
        }
        if ((i2 & 2) != 0) {
            bonusActionDto = promoCodeDto.bonusAction;
        }
        if ((i2 & 4) != 0) {
            str = promoCodeDto.promoCode;
        }
        if ((i2 & 8) != 0) {
            i = promoCodeDto.status;
        }
        return promoCodeDto.copy(appliedInfoDto, bonusActionDto, str, i);
    }

    public final AppliedInfoDto component1() {
        return this.appliedInfo;
    }

    public final BonusActionDto component2() {
        return this.bonusAction;
    }

    public final String component3() {
        return this.promoCode;
    }

    public final int component4() {
        return this.status;
    }

    public final PromoCodeDto copy(AppliedInfoDto appliedInfoDto, BonusActionDto bonusActionDto, String str, int i) {
        z65.h(str, "promoCode");
        return new PromoCodeDto(appliedInfoDto, bonusActionDto, str, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PromoCodeDto)) {
            return false;
        }
        PromoCodeDto promoCodeDto = (PromoCodeDto) obj;
        if (z65.c(this.appliedInfo, promoCodeDto.appliedInfo) && z65.c(this.bonusAction, promoCodeDto.bonusAction) && z65.c(this.promoCode, promoCodeDto.promoCode) && this.status == promoCodeDto.status) {
            return true;
        }
        return false;
    }

    public final AppliedInfoDto getAppliedInfo() {
        return this.appliedInfo;
    }

    public final BonusActionDto getBonusAction() {
        return this.bonusAction;
    }

    public final String getPromoCode() {
        return this.promoCode;
    }

    public final int getStatus() {
        return this.status;
    }

    public int hashCode() {
        int hashCode;
        AppliedInfoDto appliedInfoDto = this.appliedInfo;
        int i = 0;
        if (appliedInfoDto == null) {
            hashCode = 0;
        } else {
            hashCode = appliedInfoDto.hashCode();
        }
        int i2 = hashCode * 31;
        BonusActionDto bonusActionDto = this.bonusAction;
        if (bonusActionDto != null) {
            i = bonusActionDto.hashCode();
        }
        return ((((i2 + i) * 31) + this.promoCode.hashCode()) * 31) + this.status;
    }

    public String toString() {
        AppliedInfoDto appliedInfoDto = this.appliedInfo;
        BonusActionDto bonusActionDto = this.bonusAction;
        String str = this.promoCode;
        int i = this.status;
        return "PromoCodeDto(appliedInfo=" + appliedInfoDto + ", bonusAction=" + bonusActionDto + ", promoCode=" + str + ", status=" + i + ")";
    }

    public PromoCodeDto(AppliedInfoDto appliedInfoDto, BonusActionDto bonusActionDto, String str, int i) {
        z65.h(str, "promoCode");
        this.appliedInfo = appliedInfoDto;
        this.bonusAction = bonusActionDto;
        this.promoCode = str;
        this.status = i;
    }

    public /* synthetic */ PromoCodeDto(AppliedInfoDto appliedInfoDto, BonusActionDto bonusActionDto, String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : appliedInfoDto, (i2 & 2) != 0 ? null : bonusActionDto, (i2 & 4) != 0 ? "" : str, (i2 & 8) != 0 ? 0 : i);
    }
}
