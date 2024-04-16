package ru.dodopizza.backend.domain.state.dto.personalization;

import java.util.Collection;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: PersonalizationDto.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B[\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0017\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u000eHÆ\u0003Ja\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\u000bHÖ\u0001R\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R$\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006)"}, d2 = {"Lru/dodopizza/backend/domain/state/dto/personalization/PersonalizationDto;", "", "personalCategory", "Lru/dodopizza/backend/domain/state/dto/personalization/PersonalCategoryDto;", "menuPersonalPricesInfo", "", "Lru/dodopizza/backend/domain/state/dto/personalization/MenuPersonalPriceInfoDto;", "upsellProducts", "Lru/dodopizza/backend/domain/state/dto/personalization/UpsellProducts;", "minDeliveryPrice", "", "", "minDeliveryPriceExpiresAtUtc", "dynamicDelivery", "Lru/dodopizza/backend/domain/state/dto/personalization/DynamicDeliveryDto;", "(Lru/dodopizza/backend/domain/state/dto/personalization/PersonalCategoryDto;Ljava/util/Collection;Lru/dodopizza/backend/domain/state/dto/personalization/UpsellProducts;Ljava/util/Map;Ljava/lang/String;Lru/dodopizza/backend/domain/state/dto/personalization/DynamicDeliveryDto;)V", "getDynamicDelivery", "()Lru/dodopizza/backend/domain/state/dto/personalization/DynamicDeliveryDto;", "getMenuPersonalPricesInfo", "()Ljava/util/Collection;", "getMinDeliveryPrice", "()Ljava/util/Map;", "getMinDeliveryPriceExpiresAtUtc", "()Ljava/lang/String;", "getPersonalCategory", "()Lru/dodopizza/backend/domain/state/dto/personalization/PersonalCategoryDto;", "getUpsellProducts", "()Lru/dodopizza/backend/domain/state/dto/personalization/UpsellProducts;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PersonalizationDto {
    @uca("dynamicDelivery")
    private final DynamicDeliveryDto dynamicDelivery;
    @uca("prices")
    private final Collection<MenuPersonalPriceInfoDto> menuPersonalPricesInfo;
    @uca("minDeliveryPrice")
    private final Map<String, String> minDeliveryPrice;
    @uca("minDeliveryPriceExpiresAtUtc")
    private final String minDeliveryPriceExpiresAtUtc;
    @uca("category")
    private final PersonalCategoryDto personalCategory;
    @uca("upsellProducts")
    private final UpsellProducts upsellProducts;

    public PersonalizationDto(PersonalCategoryDto personalCategoryDto, Collection<MenuPersonalPriceInfoDto> collection, UpsellProducts upsellProducts, Map<String, String> map, String str, DynamicDeliveryDto dynamicDeliveryDto) {
        z65.h(collection, "menuPersonalPricesInfo");
        this.personalCategory = personalCategoryDto;
        this.menuPersonalPricesInfo = collection;
        this.upsellProducts = upsellProducts;
        this.minDeliveryPrice = map;
        this.minDeliveryPriceExpiresAtUtc = str;
        this.dynamicDelivery = dynamicDeliveryDto;
    }

    public static /* synthetic */ PersonalizationDto copy$default(PersonalizationDto personalizationDto, PersonalCategoryDto personalCategoryDto, Collection collection, UpsellProducts upsellProducts, Map map, String str, DynamicDeliveryDto dynamicDeliveryDto, int i, Object obj) {
        if ((i & 1) != 0) {
            personalCategoryDto = personalizationDto.personalCategory;
        }
        Collection<MenuPersonalPriceInfoDto> collection2 = collection;
        if ((i & 2) != 0) {
            collection2 = personalizationDto.menuPersonalPricesInfo;
        }
        Collection collection3 = collection2;
        if ((i & 4) != 0) {
            upsellProducts = personalizationDto.upsellProducts;
        }
        UpsellProducts upsellProducts2 = upsellProducts;
        Map<String, String> map2 = map;
        if ((i & 8) != 0) {
            map2 = personalizationDto.minDeliveryPrice;
        }
        Map map3 = map2;
        if ((i & 16) != 0) {
            str = personalizationDto.minDeliveryPriceExpiresAtUtc;
        }
        String str2 = str;
        if ((i & 32) != 0) {
            dynamicDeliveryDto = personalizationDto.dynamicDelivery;
        }
        return personalizationDto.copy(personalCategoryDto, collection3, upsellProducts2, map3, str2, dynamicDeliveryDto);
    }

    public final PersonalCategoryDto component1() {
        return this.personalCategory;
    }

    public final Collection<MenuPersonalPriceInfoDto> component2() {
        return this.menuPersonalPricesInfo;
    }

    public final UpsellProducts component3() {
        return this.upsellProducts;
    }

    public final Map<String, String> component4() {
        return this.minDeliveryPrice;
    }

    public final String component5() {
        return this.minDeliveryPriceExpiresAtUtc;
    }

    public final DynamicDeliveryDto component6() {
        return this.dynamicDelivery;
    }

    public final PersonalizationDto copy(PersonalCategoryDto personalCategoryDto, Collection<MenuPersonalPriceInfoDto> collection, UpsellProducts upsellProducts, Map<String, String> map, String str, DynamicDeliveryDto dynamicDeliveryDto) {
        z65.h(collection, "menuPersonalPricesInfo");
        return new PersonalizationDto(personalCategoryDto, collection, upsellProducts, map, str, dynamicDeliveryDto);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PersonalizationDto)) {
            return false;
        }
        PersonalizationDto personalizationDto = (PersonalizationDto) obj;
        if (z65.c(this.personalCategory, personalizationDto.personalCategory) && z65.c(this.menuPersonalPricesInfo, personalizationDto.menuPersonalPricesInfo) && z65.c(this.upsellProducts, personalizationDto.upsellProducts) && z65.c(this.minDeliveryPrice, personalizationDto.minDeliveryPrice) && z65.c(this.minDeliveryPriceExpiresAtUtc, personalizationDto.minDeliveryPriceExpiresAtUtc) && z65.c(this.dynamicDelivery, personalizationDto.dynamicDelivery)) {
            return true;
        }
        return false;
    }

    public final DynamicDeliveryDto getDynamicDelivery() {
        return this.dynamicDelivery;
    }

    public final Collection<MenuPersonalPriceInfoDto> getMenuPersonalPricesInfo() {
        return this.menuPersonalPricesInfo;
    }

    public final Map<String, String> getMinDeliveryPrice() {
        return this.minDeliveryPrice;
    }

    public final String getMinDeliveryPriceExpiresAtUtc() {
        return this.minDeliveryPriceExpiresAtUtc;
    }

    public final PersonalCategoryDto getPersonalCategory() {
        return this.personalCategory;
    }

    public final UpsellProducts getUpsellProducts() {
        return this.upsellProducts;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        PersonalCategoryDto personalCategoryDto = this.personalCategory;
        int i = 0;
        if (personalCategoryDto == null) {
            hashCode = 0;
        } else {
            hashCode = personalCategoryDto.hashCode();
        }
        int hashCode5 = ((hashCode * 31) + this.menuPersonalPricesInfo.hashCode()) * 31;
        UpsellProducts upsellProducts = this.upsellProducts;
        if (upsellProducts == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = upsellProducts.hashCode();
        }
        int i2 = (hashCode5 + hashCode2) * 31;
        Map<String, String> map = this.minDeliveryPrice;
        if (map == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = map.hashCode();
        }
        int i3 = (i2 + hashCode3) * 31;
        String str = this.minDeliveryPriceExpiresAtUtc;
        if (str == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str.hashCode();
        }
        int i4 = (i3 + hashCode4) * 31;
        DynamicDeliveryDto dynamicDeliveryDto = this.dynamicDelivery;
        if (dynamicDeliveryDto != null) {
            i = dynamicDeliveryDto.hashCode();
        }
        return i4 + i;
    }

    public String toString() {
        PersonalCategoryDto personalCategoryDto = this.personalCategory;
        Collection<MenuPersonalPriceInfoDto> collection = this.menuPersonalPricesInfo;
        UpsellProducts upsellProducts = this.upsellProducts;
        Map<String, String> map = this.minDeliveryPrice;
        String str = this.minDeliveryPriceExpiresAtUtc;
        DynamicDeliveryDto dynamicDeliveryDto = this.dynamicDelivery;
        return "PersonalizationDto(personalCategory=" + personalCategoryDto + ", menuPersonalPricesInfo=" + collection + ", upsellProducts=" + upsellProducts + ", minDeliveryPrice=" + map + ", minDeliveryPriceExpiresAtUtc=" + str + ", dynamicDelivery=" + dynamicDeliveryDto + ")";
    }

    public /* synthetic */ PersonalizationDto(PersonalCategoryDto personalCategoryDto, Collection collection, UpsellProducts upsellProducts, Map map, String str, DynamicDeliveryDto dynamicDeliveryDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : personalCategoryDto, collection, (i & 4) != 0 ? null : upsellProducts, (i & 8) != 0 ? null : map, (i & 16) != 0 ? null : str, (i & 32) != 0 ? null : dynamicDeliveryDto);
    }
}
