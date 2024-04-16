package com.dodopizza.persistence.entity.cart;

import com.dodopizza.persistence.entity.payment.CardEntity;
import io.realm.n0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: DataPaymentEntity.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010$\n\u0002\b\u0010\b\u0017\u0018\u0000 Q2\u00020\u0001:\u0001QBË\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u0010\u001a\u00020\t\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\b\b\u0002\u0010!\u001a\u00020\u0002\u0012\b\b\u0002\u0010$\u001a\u00020\u0002\u0012\b\b\u0002\u0010'\u001a\u00020\u0002\u0012\b\b\u0002\u0010*\u001a\u00020\t\u0012\b\b\u0002\u0010-\u001a\u00020\u0002\u0012\b\b\u0002\u00100\u001a\u00020\u0002\u0012\b\b\u0002\u00103\u001a\u00020\u0002\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u000106\u0012\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010C\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010B\u0012\n\b\u0002\u0010I\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010L\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\bO\u0010PR\"\u0010\u0003\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\u00020\t8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0010\u001a\u00020\t8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR$\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R$\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010!\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b!\u0010\u0004\u001a\u0004\b\"\u0010\u0006\"\u0004\b#\u0010\bR\"\u0010$\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b$\u0010\u0004\u001a\u0004\b%\u0010\u0006\"\u0004\b&\u0010\bR\"\u0010'\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b'\u0010\u0004\u001a\u0004\b(\u0010\u0006\"\u0004\b)\u0010\bR\"\u0010*\u001a\u00020\t8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b*\u0010\u000b\u001a\u0004\b+\u0010\r\"\u0004\b,\u0010\u000fR\"\u0010-\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b-\u0010\u0004\u001a\u0004\b.\u0010\u0006\"\u0004\b/\u0010\bR\"\u00100\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b0\u0010\u0004\u001a\u0004\b1\u0010\u0006\"\u0004\b2\u0010\bR\"\u00103\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b3\u0010\u0004\u001a\u0004\b4\u0010\u0006\"\u0004\b5\u0010\bR$\u00107\u001a\u0004\u0018\u0001068\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R*\u0010=\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0097\u000e¢\u0006\u0018\n\u0004\b=\u0010\u0004\u0012\u0004\b@\u0010A\u001a\u0004\b>\u0010\u0006\"\u0004\b?\u0010\bR0\u0010C\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010B8\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR$\u0010I\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bI\u0010\u0004\u001a\u0004\bJ\u0010\u0006\"\u0004\bK\u0010\bR$\u0010L\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bL\u0010\u0004\u001a\u0004\bM\u0010\u0006\"\u0004\bN\u0010\b¨\u0006R"}, d2 = {"Lcom/dodopizza/persistence/entity/cart/DataPaymentEntity;", "Lio/realm/n0;", "", "paymentId", "Ljava/lang/String;", "getPaymentId", "()Ljava/lang/String;", "setPaymentId", "(Ljava/lang/String;)V", "", "paymentType", "I", "getPaymentType", "()I", "setPaymentType", "(I)V", "paymentMethodType", "getPaymentMethodType", "setPaymentMethodType", "", "clientNotes", "Ljava/lang/Double;", "getClientNotes", "()Ljava/lang/Double;", "setClientNotes", "(Ljava/lang/Double;)V", "Lcom/dodopizza/persistence/entity/payment/CardEntity;", "card", "Lcom/dodopizza/persistence/entity/payment/CardEntity;", "getCard", "()Lcom/dodopizza/persistence/entity/payment/CardEntity;", "setCard", "(Lcom/dodopizza/persistence/entity/payment/CardEntity;)V", "redirectUrl", "getRedirectUrl", "setRedirectUrl", "successUrl", "getSuccessUrl", "setSuccessUrl", "failureUrl", "getFailureUrl", "setFailureUrl", "invoiceExpirationInMinutes", "getInvoiceExpirationInMinutes", "setInvoiceExpirationInMinutes", "authorizeUrl", "getAuthorizeUrl", "setAuthorizeUrl", "acquirerName", "getAcquirerName", "setAcquirerName", "brandName", "getBrandName", "setBrandName", "Lcom/dodopizza/persistence/entity/cart/EncryptionDataEntity;", "encryptionData", "Lcom/dodopizza/persistence/entity/cart/EncryptionDataEntity;", "getEncryptionData", "()Lcom/dodopizza/persistence/entity/cart/EncryptionDataEntity;", "setEncryptionData", "(Lcom/dodopizza/persistence/entity/cart/EncryptionDataEntity;)V", "pizzeriaPaymentKey", "getPizzeriaPaymentKey", "setPizzeriaPaymentKey", "getPizzeriaPaymentKey$annotations", "()V", "", "providerData", "Ljava/util/Map;", "getProviderData", "()Ljava/util/Map;", "setProviderData", "(Ljava/util/Map;)V", "googlePayPaymentRequest", "getGooglePayPaymentRequest", "setGooglePayPaymentRequest", "integrationType", "getIntegrationType", "setIntegrationType", "<init>", "(Ljava/lang/String;IILjava/lang/Double;Lcom/dodopizza/persistence/entity/payment/CardEntity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/dodopizza/persistence/entity/cart/EncryptionDataEntity;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V", "Companion", "persistence_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public class DataPaymentEntity extends n0 implements pfc {
    public static final Companion Companion = new Companion(null);
    public static final int PAYMENT_TYPE_NOTHING = 0;
    private String acquirerName;
    private String authorizeUrl;
    private String brandName;
    private CardEntity card;
    private Double clientNotes;
    private EncryptionDataEntity encryptionData;
    private String failureUrl;
    private String googlePayPaymentRequest;
    private String integrationType;
    private int invoiceExpirationInMinutes;
    private String paymentId;
    private int paymentMethodType;
    private int paymentType;
    private String pizzeriaPaymentKey;
    private Map<String, String> providerData;
    private String redirectUrl;
    private String successUrl;

    /* compiled from: DataPaymentEntity.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/dodopizza/persistence/entity/cart/DataPaymentEntity$Companion;", "", "()V", "PAYMENT_TYPE_NOTHING", "", "persistence_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public DataPaymentEntity() {
        this(null, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, 131071, null);
        if (this instanceof r89) {
            ((r89) this).b();
        }
    }

    public String getAcquirerName() {
        return realmGet$acquirerName();
    }

    public String getAuthorizeUrl() {
        return realmGet$authorizeUrl();
    }

    public String getBrandName() {
        return realmGet$brandName();
    }

    public CardEntity getCard() {
        return realmGet$card();
    }

    public Double getClientNotes() {
        return realmGet$clientNotes();
    }

    public EncryptionDataEntity getEncryptionData() {
        return realmGet$encryptionData();
    }

    public String getFailureUrl() {
        return realmGet$failureUrl();
    }

    public String getGooglePayPaymentRequest() {
        return realmGet$googlePayPaymentRequest();
    }

    public String getIntegrationType() {
        return realmGet$integrationType();
    }

    public int getInvoiceExpirationInMinutes() {
        return realmGet$invoiceExpirationInMinutes();
    }

    public String getPaymentId() {
        return realmGet$paymentId();
    }

    public int getPaymentMethodType() {
        return realmGet$paymentMethodType();
    }

    public int getPaymentType() {
        return realmGet$paymentType();
    }

    public String getPizzeriaPaymentKey() {
        return realmGet$pizzeriaPaymentKey();
    }

    public Map<String, String> getProviderData() {
        return this.providerData;
    }

    public String getRedirectUrl() {
        return realmGet$redirectUrl();
    }

    public String getSuccessUrl() {
        return realmGet$successUrl();
    }

    @Override // defpackage.pfc
    public String realmGet$acquirerName() {
        return this.acquirerName;
    }

    @Override // defpackage.pfc
    public String realmGet$authorizeUrl() {
        return this.authorizeUrl;
    }

    @Override // defpackage.pfc
    public String realmGet$brandName() {
        return this.brandName;
    }

    @Override // defpackage.pfc
    public CardEntity realmGet$card() {
        return this.card;
    }

    @Override // defpackage.pfc
    public Double realmGet$clientNotes() {
        return this.clientNotes;
    }

    @Override // defpackage.pfc
    public EncryptionDataEntity realmGet$encryptionData() {
        return this.encryptionData;
    }

    @Override // defpackage.pfc
    public String realmGet$failureUrl() {
        return this.failureUrl;
    }

    @Override // defpackage.pfc
    public String realmGet$googlePayPaymentRequest() {
        return this.googlePayPaymentRequest;
    }

    @Override // defpackage.pfc
    public String realmGet$integrationType() {
        return this.integrationType;
    }

    @Override // defpackage.pfc
    public int realmGet$invoiceExpirationInMinutes() {
        return this.invoiceExpirationInMinutes;
    }

    @Override // defpackage.pfc
    public String realmGet$paymentId() {
        return this.paymentId;
    }

    @Override // defpackage.pfc
    public int realmGet$paymentMethodType() {
        return this.paymentMethodType;
    }

    @Override // defpackage.pfc
    public int realmGet$paymentType() {
        return this.paymentType;
    }

    @Override // defpackage.pfc
    public String realmGet$pizzeriaPaymentKey() {
        return this.pizzeriaPaymentKey;
    }

    @Override // defpackage.pfc
    public String realmGet$redirectUrl() {
        return this.redirectUrl;
    }

    @Override // defpackage.pfc
    public String realmGet$successUrl() {
        return this.successUrl;
    }

    @Override // defpackage.pfc
    public void realmSet$acquirerName(String str) {
        this.acquirerName = str;
    }

    @Override // defpackage.pfc
    public void realmSet$authorizeUrl(String str) {
        this.authorizeUrl = str;
    }

    @Override // defpackage.pfc
    public void realmSet$brandName(String str) {
        this.brandName = str;
    }

    @Override // defpackage.pfc
    public void realmSet$card(CardEntity cardEntity) {
        this.card = cardEntity;
    }

    @Override // defpackage.pfc
    public void realmSet$clientNotes(Double d) {
        this.clientNotes = d;
    }

    @Override // defpackage.pfc
    public void realmSet$encryptionData(EncryptionDataEntity encryptionDataEntity) {
        this.encryptionData = encryptionDataEntity;
    }

    @Override // defpackage.pfc
    public void realmSet$failureUrl(String str) {
        this.failureUrl = str;
    }

    @Override // defpackage.pfc
    public void realmSet$googlePayPaymentRequest(String str) {
        this.googlePayPaymentRequest = str;
    }

    @Override // defpackage.pfc
    public void realmSet$integrationType(String str) {
        this.integrationType = str;
    }

    @Override // defpackage.pfc
    public void realmSet$invoiceExpirationInMinutes(int i) {
        this.invoiceExpirationInMinutes = i;
    }

    @Override // defpackage.pfc
    public void realmSet$paymentId(String str) {
        this.paymentId = str;
    }

    @Override // defpackage.pfc
    public void realmSet$paymentMethodType(int i) {
        this.paymentMethodType = i;
    }

    @Override // defpackage.pfc
    public void realmSet$paymentType(int i) {
        this.paymentType = i;
    }

    @Override // defpackage.pfc
    public void realmSet$pizzeriaPaymentKey(String str) {
        this.pizzeriaPaymentKey = str;
    }

    @Override // defpackage.pfc
    public void realmSet$redirectUrl(String str) {
        this.redirectUrl = str;
    }

    @Override // defpackage.pfc
    public void realmSet$successUrl(String str) {
        this.successUrl = str;
    }

    public void setAcquirerName(String str) {
        z65.h(str, "<set-?>");
        realmSet$acquirerName(str);
    }

    public void setAuthorizeUrl(String str) {
        z65.h(str, "<set-?>");
        realmSet$authorizeUrl(str);
    }

    public void setBrandName(String str) {
        z65.h(str, "<set-?>");
        realmSet$brandName(str);
    }

    public void setCard(CardEntity cardEntity) {
        realmSet$card(cardEntity);
    }

    public void setClientNotes(Double d) {
        realmSet$clientNotes(d);
    }

    public void setEncryptionData(EncryptionDataEntity encryptionDataEntity) {
        realmSet$encryptionData(encryptionDataEntity);
    }

    public void setFailureUrl(String str) {
        z65.h(str, "<set-?>");
        realmSet$failureUrl(str);
    }

    public void setGooglePayPaymentRequest(String str) {
        realmSet$googlePayPaymentRequest(str);
    }

    public void setIntegrationType(String str) {
        realmSet$integrationType(str);
    }

    public void setInvoiceExpirationInMinutes(int i) {
        realmSet$invoiceExpirationInMinutes(i);
    }

    public void setPaymentId(String str) {
        z65.h(str, "<set-?>");
        realmSet$paymentId(str);
    }

    public void setPaymentMethodType(int i) {
        realmSet$paymentMethodType(i);
    }

    public void setPaymentType(int i) {
        realmSet$paymentType(i);
    }

    public void setPizzeriaPaymentKey(String str) {
        realmSet$pizzeriaPaymentKey(str);
    }

    public void setProviderData(Map<String, String> map) {
        this.providerData = map;
    }

    public void setRedirectUrl(String str) {
        z65.h(str, "<set-?>");
        realmSet$redirectUrl(str);
    }

    public void setSuccessUrl(String str) {
        z65.h(str, "<set-?>");
        realmSet$successUrl(str);
    }

    public /* synthetic */ DataPaymentEntity(String str, int i, int i2, Double d, CardEntity cardEntity, String str2, String str3, String str4, int i3, String str5, String str6, String str7, EncryptionDataEntity encryptionDataEntity, String str8, Map map, String str9, String str10, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? "" : str, (i4 & 2) != 0 ? 0 : i, (i4 & 4) != 0 ? 0 : i2, (i4 & 8) != 0 ? null : d, (i4 & 16) != 0 ? null : cardEntity, (i4 & 32) != 0 ? "" : str2, (i4 & 64) != 0 ? "" : str3, (i4 & 128) != 0 ? "" : str4, (i4 & 256) == 0 ? i3 : 0, (i4 & 512) != 0 ? "" : str5, (i4 & 1024) != 0 ? "" : str6, (i4 & 2048) == 0 ? str7 : "", (i4 & 4096) != 0 ? null : encryptionDataEntity, (i4 & 8192) != 0 ? null : str8, (i4 & 16384) != 0 ? null : map, (i4 & 32768) != 0 ? null : str9, (i4 & 65536) != 0 ? null : str10);
        if (this instanceof r89) {
            ((r89) this).b();
        }
    }

    public DataPaymentEntity(String str, int i, int i2, Double d, CardEntity cardEntity, String str2, String str3, String str4, int i3, String str5, String str6, String str7, EncryptionDataEntity encryptionDataEntity, String str8, Map<String, String> map, String str9, String str10) {
        z65.h(str, "paymentId");
        z65.h(str2, "redirectUrl");
        z65.h(str3, "successUrl");
        z65.h(str4, "failureUrl");
        z65.h(str5, "authorizeUrl");
        z65.h(str6, "acquirerName");
        z65.h(str7, "brandName");
        if (this instanceof r89) {
            ((r89) this).b();
        }
        realmSet$paymentId(str);
        realmSet$paymentType(i);
        realmSet$paymentMethodType(i2);
        realmSet$clientNotes(d);
        realmSet$card(cardEntity);
        realmSet$redirectUrl(str2);
        realmSet$successUrl(str3);
        realmSet$failureUrl(str4);
        realmSet$invoiceExpirationInMinutes(i3);
        realmSet$authorizeUrl(str5);
        realmSet$acquirerName(str6);
        realmSet$brandName(str7);
        realmSet$encryptionData(encryptionDataEntity);
        realmSet$pizzeriaPaymentKey(str8);
        this.providerData = map;
        realmSet$googlePayPaymentRequest(str9);
        realmSet$integrationType(str10);
    }

    public static /* synthetic */ void getPizzeriaPaymentKey$annotations() {
    }
}
