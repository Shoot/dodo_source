package ru.dodopizza.backend.domain.state.dto.payment;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.dodopizza.backend.domain.state.dto.payment.googlepay.GooglePayInitDataDto;
/* compiled from: PaymentMethodDto.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001d\b\u0086\b\u0018\u00002\u00020\u0001Bk\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\rHÆ\u0003J\t\u0010&\u001a\u00020\u000fHÆ\u0003Jo\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fHÆ\u0001J\u0013\u0010(\u001a\u00020\u000f2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020\u0003HÖ\u0001J\t\u0010+\u001a\u00020\u0007HÖ\u0001R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0016\u0010\u000e\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u001aR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001c¨\u0006,"}, d2 = {"Lru/dodopizza/backend/domain/state/dto/payment/PaymentMethodDto;", "", "paymentType", "", "card", "Lru/dodopizza/backend/domain/state/dto/payment/CardDto;", "acquirerName", "", "brandName", "integrationType", "id", "priority", "googlePayInitData", "Lru/dodopizza/backend/domain/state/dto/payment/googlepay/GooglePayInitDataDto;", "isRedirectSaveCardEnabled", "", "(ILru/dodopizza/backend/domain/state/dto/payment/CardDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILru/dodopizza/backend/domain/state/dto/payment/googlepay/GooglePayInitDataDto;Z)V", "getAcquirerName", "()Ljava/lang/String;", "getBrandName", "getCard", "()Lru/dodopizza/backend/domain/state/dto/payment/CardDto;", "getGooglePayInitData", "()Lru/dodopizza/backend/domain/state/dto/payment/googlepay/GooglePayInitDataDto;", "getId", "getIntegrationType", "()Z", "getPaymentType", "()I", "getPriority", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PaymentMethodDto {
    @uca("acquirerName")
    private final String acquirerName;
    @uca("brandName")
    private final String brandName;
    @uca("card")
    private final CardDto card;
    @uca("googlePayInitData")
    private final GooglePayInitDataDto googlePayInitData;
    @uca("paymentMethodId")
    private final String id;
    @uca("integrationType")
    private final String integrationType;
    @uca("isRedirectSaveCardEnabled")
    private final boolean isRedirectSaveCardEnabled;
    @uca("paymentType")
    private final int paymentType;
    @uca("priority")
    private final int priority;

    public PaymentMethodDto() {
        this(0, null, null, null, null, null, 0, null, false, 511, null);
    }

    public static /* synthetic */ PaymentMethodDto copy$default(PaymentMethodDto paymentMethodDto, int i, CardDto cardDto, String str, String str2, String str3, String str4, int i2, GooglePayInitDataDto googlePayInitDataDto, boolean z, int i3, Object obj) {
        int i4;
        CardDto cardDto2;
        String str5;
        String str6;
        String str7;
        String str8;
        int i5;
        GooglePayInitDataDto googlePayInitDataDto2;
        boolean z2;
        if ((i3 & 1) != 0) {
            i4 = paymentMethodDto.paymentType;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            cardDto2 = paymentMethodDto.card;
        } else {
            cardDto2 = cardDto;
        }
        if ((i3 & 4) != 0) {
            str5 = paymentMethodDto.acquirerName;
        } else {
            str5 = str;
        }
        if ((i3 & 8) != 0) {
            str6 = paymentMethodDto.brandName;
        } else {
            str6 = str2;
        }
        if ((i3 & 16) != 0) {
            str7 = paymentMethodDto.integrationType;
        } else {
            str7 = str3;
        }
        if ((i3 & 32) != 0) {
            str8 = paymentMethodDto.id;
        } else {
            str8 = str4;
        }
        if ((i3 & 64) != 0) {
            i5 = paymentMethodDto.priority;
        } else {
            i5 = i2;
        }
        if ((i3 & 128) != 0) {
            googlePayInitDataDto2 = paymentMethodDto.googlePayInitData;
        } else {
            googlePayInitDataDto2 = googlePayInitDataDto;
        }
        if ((i3 & 256) != 0) {
            z2 = paymentMethodDto.isRedirectSaveCardEnabled;
        } else {
            z2 = z;
        }
        return paymentMethodDto.copy(i4, cardDto2, str5, str6, str7, str8, i5, googlePayInitDataDto2, z2);
    }

    public final int component1() {
        return this.paymentType;
    }

    public final CardDto component2() {
        return this.card;
    }

    public final String component3() {
        return this.acquirerName;
    }

    public final String component4() {
        return this.brandName;
    }

    public final String component5() {
        return this.integrationType;
    }

    public final String component6() {
        return this.id;
    }

    public final int component7() {
        return this.priority;
    }

    public final GooglePayInitDataDto component8() {
        return this.googlePayInitData;
    }

    public final boolean component9() {
        return this.isRedirectSaveCardEnabled;
    }

    public final PaymentMethodDto copy(int i, CardDto cardDto, String str, String str2, String str3, String str4, int i2, GooglePayInitDataDto googlePayInitDataDto, boolean z) {
        return new PaymentMethodDto(i, cardDto, str, str2, str3, str4, i2, googlePayInitDataDto, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentMethodDto)) {
            return false;
        }
        PaymentMethodDto paymentMethodDto = (PaymentMethodDto) obj;
        if (this.paymentType == paymentMethodDto.paymentType && z65.c(this.card, paymentMethodDto.card) && z65.c(this.acquirerName, paymentMethodDto.acquirerName) && z65.c(this.brandName, paymentMethodDto.brandName) && z65.c(this.integrationType, paymentMethodDto.integrationType) && z65.c(this.id, paymentMethodDto.id) && this.priority == paymentMethodDto.priority && z65.c(this.googlePayInitData, paymentMethodDto.googlePayInitData) && this.isRedirectSaveCardEnabled == paymentMethodDto.isRedirectSaveCardEnabled) {
            return true;
        }
        return false;
    }

    public final String getAcquirerName() {
        return this.acquirerName;
    }

    public final String getBrandName() {
        return this.brandName;
    }

    public final CardDto getCard() {
        return this.card;
    }

    public final GooglePayInitDataDto getGooglePayInitData() {
        return this.googlePayInitData;
    }

    public final String getId() {
        return this.id;
    }

    public final String getIntegrationType() {
        return this.integrationType;
    }

    public final int getPaymentType() {
        return this.paymentType;
    }

    public final int getPriority() {
        return this.priority;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int i = this.paymentType * 31;
        CardDto cardDto = this.card;
        int i2 = 0;
        if (cardDto == null) {
            hashCode = 0;
        } else {
            hashCode = cardDto.hashCode();
        }
        int i3 = (i + hashCode) * 31;
        String str = this.acquirerName;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i4 = (i3 + hashCode2) * 31;
        String str2 = this.brandName;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i5 = (i4 + hashCode3) * 31;
        String str3 = this.integrationType;
        if (str3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str3.hashCode();
        }
        int i6 = (i5 + hashCode4) * 31;
        String str4 = this.id;
        if (str4 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str4.hashCode();
        }
        int i7 = (((i6 + hashCode5) * 31) + this.priority) * 31;
        GooglePayInitDataDto googlePayInitDataDto = this.googlePayInitData;
        if (googlePayInitDataDto != null) {
            i2 = googlePayInitDataDto.hashCode();
        }
        return ((i7 + i2) * 31) + a91.a(this.isRedirectSaveCardEnabled);
    }

    public final boolean isRedirectSaveCardEnabled() {
        return this.isRedirectSaveCardEnabled;
    }

    public String toString() {
        int i = this.paymentType;
        CardDto cardDto = this.card;
        String str = this.acquirerName;
        String str2 = this.brandName;
        String str3 = this.integrationType;
        String str4 = this.id;
        int i2 = this.priority;
        GooglePayInitDataDto googlePayInitDataDto = this.googlePayInitData;
        boolean z = this.isRedirectSaveCardEnabled;
        return "PaymentMethodDto(paymentType=" + i + ", card=" + cardDto + ", acquirerName=" + str + ", brandName=" + str2 + ", integrationType=" + str3 + ", id=" + str4 + ", priority=" + i2 + ", googlePayInitData=" + googlePayInitDataDto + ", isRedirectSaveCardEnabled=" + z + ")";
    }

    public PaymentMethodDto(int i, CardDto cardDto, String str, String str2, String str3, String str4, int i2, GooglePayInitDataDto googlePayInitDataDto, boolean z) {
        this.paymentType = i;
        this.card = cardDto;
        this.acquirerName = str;
        this.brandName = str2;
        this.integrationType = str3;
        this.id = str4;
        this.priority = i2;
        this.googlePayInitData = googlePayInitDataDto;
        this.isRedirectSaveCardEnabled = z;
    }

    public /* synthetic */ PaymentMethodDto(int i, CardDto cardDto, String str, String str2, String str3, String str4, int i2, GooglePayInitDataDto googlePayInitDataDto, boolean z, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? null : cardDto, (i3 & 4) != 0 ? null : str, (i3 & 8) != 0 ? null : str2, (i3 & 16) != 0 ? null : str3, (i3 & 32) != 0 ? null : str4, (i3 & 64) != 0 ? 0 : i2, (i3 & 128) == 0 ? googlePayInitDataDto : null, (i3 & 256) == 0 ? z : false);
    }
}
