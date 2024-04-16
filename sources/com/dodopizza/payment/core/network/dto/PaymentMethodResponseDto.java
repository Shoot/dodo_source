package com.dodopizza.payment.core.network.dto;

import ch.qos.logback.core.CoreConstants;
import java.util.Map;
import kotlin.Metadata;
/* compiled from: PaymentMethodResponseDto.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010\u001e\u001a\u00020\fHÆ\u0003J]\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010 \u001a\u00020\f2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011¨\u0006%"}, d2 = {"Lcom/dodopizza/payment/core/network/dto/PaymentMethodResponseDto;", "", "id", "", "providerName", "providerCode", "providerData", "", "paymentType", "card", "Lcom/dodopizza/payment/core/network/dto/SavedCardDto;", "isDefault", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Lcom/dodopizza/payment/core/network/dto/SavedCardDto;Z)V", "getCard", "()Lcom/dodopizza/payment/core/network/dto/SavedCardDto;", "getId", "()Ljava/lang/String;", "()Z", "getPaymentType", "getProviderCode", "getProviderData", "()Ljava/util/Map;", "getProviderName", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "payment-core_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class PaymentMethodResponseDto {
    private final SavedCardDto card;
    private final String id;
    private final boolean isDefault;
    private final String paymentType;
    private final String providerCode;
    private final Map<String, String> providerData;
    private final String providerName;

    public PaymentMethodResponseDto(String str, String str2, String str3, Map<String, String> map, String str4, SavedCardDto savedCardDto, boolean z) {
        z65.h(str, "id");
        z65.h(str2, "providerName");
        z65.h(str3, "providerCode");
        z65.h(map, "providerData");
        z65.h(str4, "paymentType");
        this.id = str;
        this.providerName = str2;
        this.providerCode = str3;
        this.providerData = map;
        this.paymentType = str4;
        this.card = savedCardDto;
        this.isDefault = z;
    }

    public static /* synthetic */ PaymentMethodResponseDto copy$default(PaymentMethodResponseDto paymentMethodResponseDto, String str, String str2, String str3, Map map, String str4, SavedCardDto savedCardDto, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = paymentMethodResponseDto.id;
        }
        if ((i & 2) != 0) {
            str2 = paymentMethodResponseDto.providerName;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = paymentMethodResponseDto.providerCode;
        }
        String str6 = str3;
        Map<String, String> map2 = map;
        if ((i & 8) != 0) {
            map2 = paymentMethodResponseDto.providerData;
        }
        Map map3 = map2;
        if ((i & 16) != 0) {
            str4 = paymentMethodResponseDto.paymentType;
        }
        String str7 = str4;
        if ((i & 32) != 0) {
            savedCardDto = paymentMethodResponseDto.card;
        }
        SavedCardDto savedCardDto2 = savedCardDto;
        if ((i & 64) != 0) {
            z = paymentMethodResponseDto.isDefault;
        }
        return paymentMethodResponseDto.copy(str, str5, str6, map3, str7, savedCardDto2, z);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.providerName;
    }

    public final String component3() {
        return this.providerCode;
    }

    public final Map<String, String> component4() {
        return this.providerData;
    }

    public final String component5() {
        return this.paymentType;
    }

    public final SavedCardDto component6() {
        return this.card;
    }

    public final boolean component7() {
        return this.isDefault;
    }

    public final PaymentMethodResponseDto copy(String str, String str2, String str3, Map<String, String> map, String str4, SavedCardDto savedCardDto, boolean z) {
        z65.h(str, "id");
        z65.h(str2, "providerName");
        z65.h(str3, "providerCode");
        z65.h(map, "providerData");
        z65.h(str4, "paymentType");
        return new PaymentMethodResponseDto(str, str2, str3, map, str4, savedCardDto, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentMethodResponseDto)) {
            return false;
        }
        PaymentMethodResponseDto paymentMethodResponseDto = (PaymentMethodResponseDto) obj;
        if (z65.c(this.id, paymentMethodResponseDto.id) && z65.c(this.providerName, paymentMethodResponseDto.providerName) && z65.c(this.providerCode, paymentMethodResponseDto.providerCode) && z65.c(this.providerData, paymentMethodResponseDto.providerData) && z65.c(this.paymentType, paymentMethodResponseDto.paymentType) && z65.c(this.card, paymentMethodResponseDto.card) && this.isDefault == paymentMethodResponseDto.isDefault) {
            return true;
        }
        return false;
    }

    public final SavedCardDto getCard() {
        return this.card;
    }

    public final String getId() {
        return this.id;
    }

    public final String getPaymentType() {
        return this.paymentType;
    }

    public final String getProviderCode() {
        return this.providerCode;
    }

    public final Map<String, String> getProviderData() {
        return this.providerData;
    }

    public final String getProviderName() {
        return this.providerName;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode;
        int hashCode2 = ((((((((this.id.hashCode() * 31) + this.providerName.hashCode()) * 31) + this.providerCode.hashCode()) * 31) + this.providerData.hashCode()) * 31) + this.paymentType.hashCode()) * 31;
        SavedCardDto savedCardDto = this.card;
        if (savedCardDto == null) {
            hashCode = 0;
        } else {
            hashCode = savedCardDto.hashCode();
        }
        int i = (hashCode2 + hashCode) * 31;
        boolean z = this.isDefault;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        return i + i2;
    }

    public final boolean isDefault() {
        return this.isDefault;
    }

    public String toString() {
        return "PaymentMethodResponseDto(id=" + this.id + ", providerName=" + this.providerName + ", providerCode=" + this.providerCode + ", providerData=" + this.providerData + ", paymentType=" + this.paymentType + ", card=" + this.card + ", isDefault=" + this.isDefault + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
