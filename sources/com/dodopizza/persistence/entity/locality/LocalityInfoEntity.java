package com.dodopizza.persistence.entity.locality;

import io.realm.k0;
import io.realm.n0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: LocalityInfoEntity.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002B\u008f\u0001\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c\u0012\u000e\b\u0002\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u001c\u0012\b\b\u0002\u0010(\u001a\u00020\u0003\u0012\b\b\u0002\u0010,\u001a\u00020+\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u000101¢\u0006\u0004\b8\u00109R$\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\n\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0005\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\"\u0010\r\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0005\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\"\u0010\u0010\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0005\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR\"\u0010\u0013\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0005\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\tR\"\u0010\u0016\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0005\u001a\u0004\b\u0017\u0010\u0007\"\u0004\b\u0018\u0010\tR\"\u0010\u0019\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0005\u001a\u0004\b\u001a\u0010\u0007\"\u0004\b\u001b\u0010\tR(\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R(\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u001c8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b%\u0010\u001f\u001a\u0004\b&\u0010!\"\u0004\b'\u0010#R\"\u0010(\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b(\u0010\u0005\u001a\u0004\b)\u0010\u0007\"\u0004\b*\u0010\tR\"\u0010,\u001a\u00020+8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b,\u0010.\"\u0004\b/\u00100R$\u00102\u001a\u0004\u0018\u0001018\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107¨\u0006:"}, d2 = {"Lcom/dodopizza/persistence/entity/locality/LocalityInfoEntity;", "Lyi3;", "Lio/realm/n0;", "", "id", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "localityId", "getLocalityId", "setLocalityId", "localityUuid", "getLocalityUuid", "setLocalityUuid", LocalityEntity.FIELD_COUNTRY_CODE, "getCountryCode", "setCountryCode", "mapUrl", "getMapUrl", "setMapUrl", "userAgreementUrl", "getUserAgreementUrl", "setUserAgreementUrl", "userAgreementTitle", "getUserAgreementTitle", "setUserAgreementTitle", "Lio/realm/k0;", "Lcom/dodopizza/persistence/entity/locality/LegalInformationEntity;", "legalInformationList", "Lio/realm/k0;", "getLegalInformationList", "()Lio/realm/k0;", "setLegalInformationList", "(Lio/realm/k0;)V", "Lcom/dodopizza/persistence/entity/locality/SocialNetworkInfoEntity;", "socialNetworksList", "getSocialNetworksList", "setSocialNetworksList", "callCenterPhone", "getCallCenterPhone", "setCallCenterPhone", "", "isLanding", "Z", "()Z", "setLanding", "(Z)V", "Lcom/dodopizza/persistence/entity/locality/OrderTypeDiscountEntity;", "orderTypeDiscount", "Lcom/dodopizza/persistence/entity/locality/OrderTypeDiscountEntity;", "getOrderTypeDiscount", "()Lcom/dodopizza/persistence/entity/locality/OrderTypeDiscountEntity;", "setOrderTypeDiscount", "(Lcom/dodopizza/persistence/entity/locality/OrderTypeDiscountEntity;)V", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/realm/k0;Lio/realm/k0;Ljava/lang/String;ZLcom/dodopizza/persistence/entity/locality/OrderTypeDiscountEntity;)V", "persistence_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public class LocalityInfoEntity extends n0 implements yi3, ngc {
    private String callCenterPhone;
    private String countryCode;
    private String id;
    private boolean isLanding;
    private k0<LegalInformationEntity> legalInformationList;
    private String localityId;
    private String localityUuid;
    private String mapUrl;
    private OrderTypeDiscountEntity orderTypeDiscount;
    private k0<SocialNetworkInfoEntity> socialNetworksList;
    private String userAgreementTitle;
    private String userAgreementUrl;

    public LocalityInfoEntity() {
        this(null, null, null, null, null, null, null, null, null, null, false, null, 4095, null);
        if (this instanceof r89) {
            ((r89) this).b();
        }
    }

    public String getCallCenterPhone() {
        return realmGet$callCenterPhone();
    }

    public String getCountryCode() {
        return realmGet$countryCode();
    }

    @Override // defpackage.yi3
    public String getId() {
        return realmGet$id();
    }

    public k0<LegalInformationEntity> getLegalInformationList() {
        return realmGet$legalInformationList();
    }

    public String getLocalityId() {
        return realmGet$localityId();
    }

    public String getLocalityUuid() {
        return realmGet$localityUuid();
    }

    public String getMapUrl() {
        return realmGet$mapUrl();
    }

    public OrderTypeDiscountEntity getOrderTypeDiscount() {
        return realmGet$orderTypeDiscount();
    }

    public k0<SocialNetworkInfoEntity> getSocialNetworksList() {
        return realmGet$socialNetworksList();
    }

    public String getUserAgreementTitle() {
        return realmGet$userAgreementTitle();
    }

    public String getUserAgreementUrl() {
        return realmGet$userAgreementUrl();
    }

    public boolean isLanding() {
        return realmGet$isLanding();
    }

    @Override // defpackage.ngc
    public String realmGet$callCenterPhone() {
        return this.callCenterPhone;
    }

    @Override // defpackage.ngc
    public String realmGet$countryCode() {
        return this.countryCode;
    }

    @Override // defpackage.ngc
    public String realmGet$id() {
        return this.id;
    }

    @Override // defpackage.ngc
    public boolean realmGet$isLanding() {
        return this.isLanding;
    }

    @Override // defpackage.ngc
    public k0 realmGet$legalInformationList() {
        return this.legalInformationList;
    }

    @Override // defpackage.ngc
    public String realmGet$localityId() {
        return this.localityId;
    }

    @Override // defpackage.ngc
    public String realmGet$localityUuid() {
        return this.localityUuid;
    }

    @Override // defpackage.ngc
    public String realmGet$mapUrl() {
        return this.mapUrl;
    }

    @Override // defpackage.ngc
    public OrderTypeDiscountEntity realmGet$orderTypeDiscount() {
        return this.orderTypeDiscount;
    }

    @Override // defpackage.ngc
    public k0 realmGet$socialNetworksList() {
        return this.socialNetworksList;
    }

    @Override // defpackage.ngc
    public String realmGet$userAgreementTitle() {
        return this.userAgreementTitle;
    }

    @Override // defpackage.ngc
    public String realmGet$userAgreementUrl() {
        return this.userAgreementUrl;
    }

    @Override // defpackage.ngc
    public void realmSet$callCenterPhone(String str) {
        this.callCenterPhone = str;
    }

    @Override // defpackage.ngc
    public void realmSet$countryCode(String str) {
        this.countryCode = str;
    }

    @Override // defpackage.ngc
    public void realmSet$id(String str) {
        this.id = str;
    }

    @Override // defpackage.ngc
    public void realmSet$isLanding(boolean z) {
        this.isLanding = z;
    }

    @Override // defpackage.ngc
    public void realmSet$legalInformationList(k0 k0Var) {
        this.legalInformationList = k0Var;
    }

    @Override // defpackage.ngc
    public void realmSet$localityId(String str) {
        this.localityId = str;
    }

    @Override // defpackage.ngc
    public void realmSet$localityUuid(String str) {
        this.localityUuid = str;
    }

    @Override // defpackage.ngc
    public void realmSet$mapUrl(String str) {
        this.mapUrl = str;
    }

    @Override // defpackage.ngc
    public void realmSet$orderTypeDiscount(OrderTypeDiscountEntity orderTypeDiscountEntity) {
        this.orderTypeDiscount = orderTypeDiscountEntity;
    }

    @Override // defpackage.ngc
    public void realmSet$socialNetworksList(k0 k0Var) {
        this.socialNetworksList = k0Var;
    }

    @Override // defpackage.ngc
    public void realmSet$userAgreementTitle(String str) {
        this.userAgreementTitle = str;
    }

    @Override // defpackage.ngc
    public void realmSet$userAgreementUrl(String str) {
        this.userAgreementUrl = str;
    }

    public void setCallCenterPhone(String str) {
        z65.h(str, "<set-?>");
        realmSet$callCenterPhone(str);
    }

    public void setCountryCode(String str) {
        z65.h(str, "<set-?>");
        realmSet$countryCode(str);
    }

    @Override // defpackage.yi3
    public void setId(String str) {
        realmSet$id(str);
    }

    public void setLanding(boolean z) {
        realmSet$isLanding(z);
    }

    public void setLegalInformationList(k0<LegalInformationEntity> k0Var) {
        z65.h(k0Var, "<set-?>");
        realmSet$legalInformationList(k0Var);
    }

    public void setLocalityId(String str) {
        z65.h(str, "<set-?>");
        realmSet$localityId(str);
    }

    public void setLocalityUuid(String str) {
        z65.h(str, "<set-?>");
        realmSet$localityUuid(str);
    }

    public void setMapUrl(String str) {
        z65.h(str, "<set-?>");
        realmSet$mapUrl(str);
    }

    public void setOrderTypeDiscount(OrderTypeDiscountEntity orderTypeDiscountEntity) {
        realmSet$orderTypeDiscount(orderTypeDiscountEntity);
    }

    public void setSocialNetworksList(k0<SocialNetworkInfoEntity> k0Var) {
        z65.h(k0Var, "<set-?>");
        realmSet$socialNetworksList(k0Var);
    }

    public void setUserAgreementTitle(String str) {
        z65.h(str, "<set-?>");
        realmSet$userAgreementTitle(str);
    }

    public void setUserAgreementUrl(String str) {
        z65.h(str, "<set-?>");
        realmSet$userAgreementUrl(str);
    }

    public /* synthetic */ LocalityInfoEntity(String str, String str2, String str3, String str4, String str5, String str6, String str7, k0 k0Var, k0 k0Var2, String str8, boolean z, OrderTypeDiscountEntity orderTypeDiscountEntity, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? new k0() : k0Var, (i & 256) != 0 ? new k0() : k0Var2, (i & 512) == 0 ? str8 : "", (i & 1024) != 0 ? false : z, (i & 2048) != 0 ? new OrderTypeDiscountEntity(0, 0, null, null, 15, null) : orderTypeDiscountEntity);
        if (this instanceof r89) {
            ((r89) this).b();
        }
    }

    public LocalityInfoEntity(String str, String str2, String str3, String str4, String str5, String str6, String str7, k0<LegalInformationEntity> k0Var, k0<SocialNetworkInfoEntity> k0Var2, String str8, boolean z, OrderTypeDiscountEntity orderTypeDiscountEntity) {
        z65.h(str2, "localityId");
        z65.h(str3, "localityUuid");
        z65.h(str4, LocalityEntity.FIELD_COUNTRY_CODE);
        z65.h(str5, "mapUrl");
        z65.h(str6, "userAgreementUrl");
        z65.h(str7, "userAgreementTitle");
        z65.h(k0Var, "legalInformationList");
        z65.h(k0Var2, "socialNetworksList");
        z65.h(str8, "callCenterPhone");
        if (this instanceof r89) {
            ((r89) this).b();
        }
        realmSet$id(str);
        realmSet$localityId(str2);
        realmSet$localityUuid(str3);
        realmSet$countryCode(str4);
        realmSet$mapUrl(str5);
        realmSet$userAgreementUrl(str6);
        realmSet$userAgreementTitle(str7);
        realmSet$legalInformationList(k0Var);
        realmSet$socialNetworksList(k0Var2);
        realmSet$callCenterPhone(str8);
        realmSet$isLanding(z);
        realmSet$orderTypeDiscount(orderTypeDiscountEntity);
    }
}
