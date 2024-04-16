package ru.dodopizza.backend.domain.state.dto.payment;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.dodopizza.backend.domain.state.dto.payment.googlepay.GooglePayPaymentDataDto;
/* compiled from: PaymentDataDto.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b/\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BË\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0019J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u00106\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0011HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010>\u001a\u00020\u0007HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010@\u001a\u00020\u0007HÆ\u0003J\t\u0010A\u001a\u00020\u0007HÆ\u0003J\u0010\u0010B\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010 J\u000b\u0010C\u001a\u0004\u0018\u00010\u000eHÆ\u0003JÔ\u0001\u0010D\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010EJ\u0013\u0010F\u001a\u00020G2\b\u0010H\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010I\u001a\u00020\u0007HÖ\u0001J\t\u0010J\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010!\u001a\u0004\b\u001f\u0010 R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001bR\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001bR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001bR\u0016\u0010\n\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010)R\u0016\u0010\t\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010)R\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b-\u0010.\u001a\u0004\b/\u0010\u001bR$\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\u001bR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\u001b¨\u0006K"}, d2 = {"Lru/dodopizza/backend/domain/state/dto/payment/PaymentDataDto;", "", "acquirerName", "", "authorizeUrl", "failureUrl", "invoiceExpirationInMinutes", "", "paymentId", "paymentType", "paymentMethodType", "clientNotes", "", "card", "Lru/dodopizza/backend/domain/state/dto/payment/CardDto;", "pizzeriaPaymentKey", "providerData", "", "redirectUrl", "successUrl", "encryptionDataDto", "Lru/dodopizza/backend/domain/state/dto/payment/EncryptionDataDto;", "googlePayPaymentData", "Lru/dodopizza/backend/domain/state/dto/payment/googlepay/GooglePayPaymentDataDto;", "integrationType", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;IILjava/lang/Double;Lru/dodopizza/backend/domain/state/dto/payment/CardDto;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Lru/dodopizza/backend/domain/state/dto/payment/EncryptionDataDto;Lru/dodopizza/backend/domain/state/dto/payment/googlepay/GooglePayPaymentDataDto;Ljava/lang/String;)V", "getAcquirerName", "()Ljava/lang/String;", "getAuthorizeUrl", "getCard", "()Lru/dodopizza/backend/domain/state/dto/payment/CardDto;", "getClientNotes", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getEncryptionDataDto", "()Lru/dodopizza/backend/domain/state/dto/payment/EncryptionDataDto;", "getFailureUrl", "getGooglePayPaymentData", "()Lru/dodopizza/backend/domain/state/dto/payment/googlepay/GooglePayPaymentDataDto;", "getIntegrationType", "getInvoiceExpirationInMinutes", "()I", "getPaymentId", "getPaymentMethodType", "getPaymentType", "getPizzeriaPaymentKey$annotations", "()V", "getPizzeriaPaymentKey", "getProviderData", "()Ljava/util/Map;", "getRedirectUrl", "getSuccessUrl", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;IILjava/lang/Double;Lru/dodopizza/backend/domain/state/dto/payment/CardDto;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Lru/dodopizza/backend/domain/state/dto/payment/EncryptionDataDto;Lru/dodopizza/backend/domain/state/dto/payment/googlepay/GooglePayPaymentDataDto;Ljava/lang/String;)Lru/dodopizza/backend/domain/state/dto/payment/PaymentDataDto;", "equals", "", "other", "hashCode", "toString", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PaymentDataDto {
    @uca("acquirerName")
    private final String acquirerName;
    @uca("authorizeUrl")
    private final String authorizeUrl;
    @uca("card")
    private final CardDto card;
    @uca("clientNote")
    private final Double clientNotes;
    @uca("encryptionData")
    private final EncryptionDataDto encryptionDataDto;
    @uca("failureUrl")
    private final String failureUrl;
    @uca("googlePayPaymentData")
    private final GooglePayPaymentDataDto googlePayPaymentData;
    @uca("integrationType")
    private final String integrationType;
    @uca("invoiceExpirationInMinutes")
    private final int invoiceExpirationInMinutes;
    @uca("paymentId")
    private final String paymentId;
    @uca("paymentTypeV2")
    private final int paymentMethodType;
    @uca("paymentType")
    private final int paymentType;
    @uca("pizzeriaPaymentKey")
    private final String pizzeriaPaymentKey;
    @uca("providerData")
    private final Map<String, String> providerData;
    @uca("redirectUrl")
    private final String redirectUrl;
    @uca("successUrl")
    private final String successUrl;

    public PaymentDataDto() {
        this(null, null, null, 0, null, 0, 0, null, null, null, null, null, null, null, null, null, 65535, null);
    }

    public final String component1() {
        return this.acquirerName;
    }

    public final String component10() {
        return this.pizzeriaPaymentKey;
    }

    public final Map<String, String> component11() {
        return this.providerData;
    }

    public final String component12() {
        return this.redirectUrl;
    }

    public final String component13() {
        return this.successUrl;
    }

    public final EncryptionDataDto component14() {
        return this.encryptionDataDto;
    }

    public final GooglePayPaymentDataDto component15() {
        return this.googlePayPaymentData;
    }

    public final String component16() {
        return this.integrationType;
    }

    public final String component2() {
        return this.authorizeUrl;
    }

    public final String component3() {
        return this.failureUrl;
    }

    public final int component4() {
        return this.invoiceExpirationInMinutes;
    }

    public final String component5() {
        return this.paymentId;
    }

    public final int component6() {
        return this.paymentType;
    }

    public final int component7() {
        return this.paymentMethodType;
    }

    public final Double component8() {
        return this.clientNotes;
    }

    public final CardDto component9() {
        return this.card;
    }

    public final PaymentDataDto copy(String str, String str2, String str3, int i, String str4, int i2, int i3, Double d, CardDto cardDto, String str5, Map<String, String> map, String str6, String str7, EncryptionDataDto encryptionDataDto, GooglePayPaymentDataDto googlePayPaymentDataDto, String str8) {
        return new PaymentDataDto(str, str2, str3, i, str4, i2, i3, d, cardDto, str5, map, str6, str7, encryptionDataDto, googlePayPaymentDataDto, str8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentDataDto)) {
            return false;
        }
        PaymentDataDto paymentDataDto = (PaymentDataDto) obj;
        if (z65.c(this.acquirerName, paymentDataDto.acquirerName) && z65.c(this.authorizeUrl, paymentDataDto.authorizeUrl) && z65.c(this.failureUrl, paymentDataDto.failureUrl) && this.invoiceExpirationInMinutes == paymentDataDto.invoiceExpirationInMinutes && z65.c(this.paymentId, paymentDataDto.paymentId) && this.paymentType == paymentDataDto.paymentType && this.paymentMethodType == paymentDataDto.paymentMethodType && z65.c(this.clientNotes, paymentDataDto.clientNotes) && z65.c(this.card, paymentDataDto.card) && z65.c(this.pizzeriaPaymentKey, paymentDataDto.pizzeriaPaymentKey) && z65.c(this.providerData, paymentDataDto.providerData) && z65.c(this.redirectUrl, paymentDataDto.redirectUrl) && z65.c(this.successUrl, paymentDataDto.successUrl) && z65.c(this.encryptionDataDto, paymentDataDto.encryptionDataDto) && z65.c(this.googlePayPaymentData, paymentDataDto.googlePayPaymentData) && z65.c(this.integrationType, paymentDataDto.integrationType)) {
            return true;
        }
        return false;
    }

    public final String getAcquirerName() {
        return this.acquirerName;
    }

    public final String getAuthorizeUrl() {
        return this.authorizeUrl;
    }

    public final CardDto getCard() {
        return this.card;
    }

    public final Double getClientNotes() {
        return this.clientNotes;
    }

    public final EncryptionDataDto getEncryptionDataDto() {
        return this.encryptionDataDto;
    }

    public final String getFailureUrl() {
        return this.failureUrl;
    }

    public final GooglePayPaymentDataDto getGooglePayPaymentData() {
        return this.googlePayPaymentData;
    }

    public final String getIntegrationType() {
        return this.integrationType;
    }

    public final int getInvoiceExpirationInMinutes() {
        return this.invoiceExpirationInMinutes;
    }

    public final String getPaymentId() {
        return this.paymentId;
    }

    public final int getPaymentMethodType() {
        return this.paymentMethodType;
    }

    public final int getPaymentType() {
        return this.paymentType;
    }

    public final String getPizzeriaPaymentKey() {
        return this.pizzeriaPaymentKey;
    }

    public final Map<String, String> getProviderData() {
        return this.providerData;
    }

    public final String getRedirectUrl() {
        return this.redirectUrl;
    }

    public final String getSuccessUrl() {
        return this.successUrl;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9;
        int hashCode10;
        int hashCode11;
        int hashCode12;
        String str = this.acquirerName;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        String str2 = this.authorizeUrl;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str3 = this.failureUrl;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i4 = (((i3 + hashCode3) * 31) + this.invoiceExpirationInMinutes) * 31;
        String str4 = this.paymentId;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i5 = (((((i4 + hashCode4) * 31) + this.paymentType) * 31) + this.paymentMethodType) * 31;
        Double d = this.clientNotes;
        if (d == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = d.hashCode();
        }
        int i6 = (i5 + hashCode5) * 31;
        CardDto cardDto = this.card;
        if (cardDto == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = cardDto.hashCode();
        }
        int i7 = (i6 + hashCode6) * 31;
        String str5 = this.pizzeriaPaymentKey;
        if (str5 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str5.hashCode();
        }
        int i8 = (i7 + hashCode7) * 31;
        Map<String, String> map = this.providerData;
        if (map == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = map.hashCode();
        }
        int i9 = (i8 + hashCode8) * 31;
        String str6 = this.redirectUrl;
        if (str6 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = str6.hashCode();
        }
        int i10 = (i9 + hashCode9) * 31;
        String str7 = this.successUrl;
        if (str7 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = str7.hashCode();
        }
        int i11 = (i10 + hashCode10) * 31;
        EncryptionDataDto encryptionDataDto = this.encryptionDataDto;
        if (encryptionDataDto == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = encryptionDataDto.hashCode();
        }
        int i12 = (i11 + hashCode11) * 31;
        GooglePayPaymentDataDto googlePayPaymentDataDto = this.googlePayPaymentData;
        if (googlePayPaymentDataDto == null) {
            hashCode12 = 0;
        } else {
            hashCode12 = googlePayPaymentDataDto.hashCode();
        }
        int i13 = (i12 + hashCode12) * 31;
        String str8 = this.integrationType;
        if (str8 != null) {
            i = str8.hashCode();
        }
        return i13 + i;
    }

    public String toString() {
        String str = this.acquirerName;
        String str2 = this.authorizeUrl;
        String str3 = this.failureUrl;
        int i = this.invoiceExpirationInMinutes;
        String str4 = this.paymentId;
        int i2 = this.paymentType;
        int i3 = this.paymentMethodType;
        Double d = this.clientNotes;
        CardDto cardDto = this.card;
        String str5 = this.pizzeriaPaymentKey;
        Map<String, String> map = this.providerData;
        String str6 = this.redirectUrl;
        String str7 = this.successUrl;
        EncryptionDataDto encryptionDataDto = this.encryptionDataDto;
        GooglePayPaymentDataDto googlePayPaymentDataDto = this.googlePayPaymentData;
        String str8 = this.integrationType;
        return "PaymentDataDto(acquirerName=" + str + ", authorizeUrl=" + str2 + ", failureUrl=" + str3 + ", invoiceExpirationInMinutes=" + i + ", paymentId=" + str4 + ", paymentType=" + i2 + ", paymentMethodType=" + i3 + ", clientNotes=" + d + ", card=" + cardDto + ", pizzeriaPaymentKey=" + str5 + ", providerData=" + map + ", redirectUrl=" + str6 + ", successUrl=" + str7 + ", encryptionDataDto=" + encryptionDataDto + ", googlePayPaymentData=" + googlePayPaymentDataDto + ", integrationType=" + str8 + ")";
    }

    public PaymentDataDto(String str, String str2, String str3, int i, String str4, int i2, int i3, Double d, CardDto cardDto, String str5, Map<String, String> map, String str6, String str7, EncryptionDataDto encryptionDataDto, GooglePayPaymentDataDto googlePayPaymentDataDto, String str8) {
        this.acquirerName = str;
        this.authorizeUrl = str2;
        this.failureUrl = str3;
        this.invoiceExpirationInMinutes = i;
        this.paymentId = str4;
        this.paymentType = i2;
        this.paymentMethodType = i3;
        this.clientNotes = d;
        this.card = cardDto;
        this.pizzeriaPaymentKey = str5;
        this.providerData = map;
        this.redirectUrl = str6;
        this.successUrl = str7;
        this.encryptionDataDto = encryptionDataDto;
        this.googlePayPaymentData = googlePayPaymentDataDto;
        this.integrationType = str8;
    }

    public /* synthetic */ PaymentDataDto(String str, String str2, String str3, int i, String str4, int i2, int i3, Double d, CardDto cardDto, String str5, Map map, String str6, String str7, EncryptionDataDto encryptionDataDto, GooglePayPaymentDataDto googlePayPaymentDataDto, String str8, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? null : str, (i4 & 2) != 0 ? null : str2, (i4 & 4) != 0 ? null : str3, (i4 & 8) != 0 ? 0 : i, (i4 & 16) != 0 ? null : str4, (i4 & 32) != 0 ? 0 : i2, (i4 & 64) == 0 ? i3 : 0, (i4 & 128) != 0 ? null : d, (i4 & 256) != 0 ? null : cardDto, (i4 & 512) != 0 ? null : str5, (i4 & 1024) != 0 ? null : map, (i4 & 2048) != 0 ? null : str6, (i4 & 4096) != 0 ? null : str7, (i4 & 8192) != 0 ? null : encryptionDataDto, (i4 & 16384) != 0 ? null : googlePayPaymentDataDto, (i4 & 32768) != 0 ? null : str8);
    }

    public static /* synthetic */ void getPizzeriaPaymentKey$annotations() {
    }
}
