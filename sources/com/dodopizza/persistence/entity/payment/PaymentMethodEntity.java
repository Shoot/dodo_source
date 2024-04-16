package com.dodopizza.persistence.entity.payment;

import io.realm.n0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: PaymentMethodEntity.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002Bm\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\b\b\u0002\u0010!\u001a\u00020\n\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$\u0012\b\b\u0002\u0010,\u001a\u00020+¢\u0006\u0004\b1\u00102R$\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\u000b\u001a\u00020\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R$\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0005\u001a\u0004\b\u0012\u0010\u0007\"\u0004\b\u0013\u0010\tR$\u0010\u0014\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0005\u001a\u0004\b\u0015\u0010\u0007\"\u0004\b\u0016\u0010\tR$\u0010\u0017\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0005\u001a\u0004\b\u0018\u0010\u0007\"\u0004\b\u0019\u0010\tR$\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010!\u001a\u00020\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b!\u0010\f\u001a\u0004\b\"\u0010\u000e\"\u0004\b#\u0010\u0010R$\u0010%\u001a\u0004\u0018\u00010$8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u0010,\u001a\u00020+8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b,\u0010.\"\u0004\b/\u00100¨\u00063"}, d2 = {"Lcom/dodopizza/persistence/entity/payment/PaymentMethodEntity;", "Lyi3;", "Lio/realm/n0;", "", "id", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "", "paymentType", "I", "getPaymentType", "()I", "setPaymentType", "(I)V", "acquirerName", "getAcquirerName", "setAcquirerName", "brandName", "getBrandName", "setBrandName", "integrationType", "getIntegrationType", "setIntegrationType", "Lcom/dodopizza/persistence/entity/payment/CardEntity;", "card", "Lcom/dodopizza/persistence/entity/payment/CardEntity;", "getCard", "()Lcom/dodopizza/persistence/entity/payment/CardEntity;", "setCard", "(Lcom/dodopizza/persistence/entity/payment/CardEntity;)V", "priority", "getPriority", "setPriority", "Lcom/dodopizza/persistence/entity/payment/GooglePayInitDataEntity;", "googlePayInitData", "Lcom/dodopizza/persistence/entity/payment/GooglePayInitDataEntity;", "getGooglePayInitData", "()Lcom/dodopizza/persistence/entity/payment/GooglePayInitDataEntity;", "setGooglePayInitData", "(Lcom/dodopizza/persistence/entity/payment/GooglePayInitDataEntity;)V", "", "isRedirectSaveCardEnabled", "Z", "()Z", "setRedirectSaveCardEnabled", "(Z)V", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/dodopizza/persistence/entity/payment/CardEntity;ILcom/dodopizza/persistence/entity/payment/GooglePayInitDataEntity;Z)V", "persistence_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public class PaymentMethodEntity extends n0 implements yi3, fhc {
    private String acquirerName;
    private String brandName;
    private CardEntity card;
    private GooglePayInitDataEntity googlePayInitData;
    private String id;
    private String integrationType;
    private boolean isRedirectSaveCardEnabled;
    private int paymentType;
    private int priority;

    public PaymentMethodEntity() {
        this(null, 0, null, null, null, null, 0, null, false, 511, null);
        if (this instanceof r89) {
            ((r89) this).b();
        }
    }

    public String getAcquirerName() {
        return realmGet$acquirerName();
    }

    public String getBrandName() {
        return realmGet$brandName();
    }

    public CardEntity getCard() {
        return realmGet$card();
    }

    public GooglePayInitDataEntity getGooglePayInitData() {
        return realmGet$googlePayInitData();
    }

    @Override // defpackage.yi3
    public String getId() {
        return realmGet$id();
    }

    public String getIntegrationType() {
        return realmGet$integrationType();
    }

    public int getPaymentType() {
        return realmGet$paymentType();
    }

    public int getPriority() {
        return realmGet$priority();
    }

    public boolean isRedirectSaveCardEnabled() {
        return realmGet$isRedirectSaveCardEnabled();
    }

    @Override // defpackage.fhc
    public String realmGet$acquirerName() {
        return this.acquirerName;
    }

    @Override // defpackage.fhc
    public String realmGet$brandName() {
        return this.brandName;
    }

    @Override // defpackage.fhc
    public CardEntity realmGet$card() {
        return this.card;
    }

    @Override // defpackage.fhc
    public GooglePayInitDataEntity realmGet$googlePayInitData() {
        return this.googlePayInitData;
    }

    @Override // defpackage.fhc
    public String realmGet$id() {
        return this.id;
    }

    @Override // defpackage.fhc
    public String realmGet$integrationType() {
        return this.integrationType;
    }

    @Override // defpackage.fhc
    public boolean realmGet$isRedirectSaveCardEnabled() {
        return this.isRedirectSaveCardEnabled;
    }

    @Override // defpackage.fhc
    public int realmGet$paymentType() {
        return this.paymentType;
    }

    @Override // defpackage.fhc
    public int realmGet$priority() {
        return this.priority;
    }

    @Override // defpackage.fhc
    public void realmSet$acquirerName(String str) {
        this.acquirerName = str;
    }

    @Override // defpackage.fhc
    public void realmSet$brandName(String str) {
        this.brandName = str;
    }

    @Override // defpackage.fhc
    public void realmSet$card(CardEntity cardEntity) {
        this.card = cardEntity;
    }

    @Override // defpackage.fhc
    public void realmSet$googlePayInitData(GooglePayInitDataEntity googlePayInitDataEntity) {
        this.googlePayInitData = googlePayInitDataEntity;
    }

    @Override // defpackage.fhc
    public void realmSet$id(String str) {
        this.id = str;
    }

    @Override // defpackage.fhc
    public void realmSet$integrationType(String str) {
        this.integrationType = str;
    }

    @Override // defpackage.fhc
    public void realmSet$isRedirectSaveCardEnabled(boolean z) {
        this.isRedirectSaveCardEnabled = z;
    }

    @Override // defpackage.fhc
    public void realmSet$paymentType(int i) {
        this.paymentType = i;
    }

    @Override // defpackage.fhc
    public void realmSet$priority(int i) {
        this.priority = i;
    }

    public void setAcquirerName(String str) {
        realmSet$acquirerName(str);
    }

    public void setBrandName(String str) {
        realmSet$brandName(str);
    }

    public void setCard(CardEntity cardEntity) {
        realmSet$card(cardEntity);
    }

    public void setGooglePayInitData(GooglePayInitDataEntity googlePayInitDataEntity) {
        realmSet$googlePayInitData(googlePayInitDataEntity);
    }

    @Override // defpackage.yi3
    public void setId(String str) {
        realmSet$id(str);
    }

    public void setIntegrationType(String str) {
        realmSet$integrationType(str);
    }

    public void setPaymentType(int i) {
        realmSet$paymentType(i);
    }

    public void setPriority(int i) {
        realmSet$priority(i);
    }

    public void setRedirectSaveCardEnabled(boolean z) {
        realmSet$isRedirectSaveCardEnabled(z);
    }

    public /* synthetic */ PaymentMethodEntity(String str, int i, String str2, String str3, String str4, CardEntity cardEntity, int i2, GooglePayInitDataEntity googlePayInitDataEntity, boolean z, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? null : str, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? null : str2, (i3 & 8) != 0 ? null : str3, (i3 & 16) != 0 ? null : str4, (i3 & 32) != 0 ? null : cardEntity, (i3 & 64) != 0 ? 0 : i2, (i3 & 128) == 0 ? googlePayInitDataEntity : null, (i3 & 256) == 0 ? z : false);
        if (this instanceof r89) {
            ((r89) this).b();
        }
    }

    public PaymentMethodEntity(String str, int i, String str2, String str3, String str4, CardEntity cardEntity, int i2, GooglePayInitDataEntity googlePayInitDataEntity, boolean z) {
        if (this instanceof r89) {
            ((r89) this).b();
        }
        realmSet$id(str);
        realmSet$paymentType(i);
        realmSet$acquirerName(str2);
        realmSet$brandName(str3);
        realmSet$integrationType(str4);
        realmSet$card(cardEntity);
        realmSet$priority(i2);
        realmSet$googlePayInitData(googlePayInitDataEntity);
        realmSet$isRedirectSaveCardEnabled(z);
    }
}
