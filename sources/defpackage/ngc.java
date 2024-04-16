package defpackage;

import com.dodopizza.persistence.entity.locality.LegalInformationEntity;
import com.dodopizza.persistence.entity.locality.OrderTypeDiscountEntity;
import com.dodopizza.persistence.entity.locality.SocialNetworkInfoEntity;
import io.realm.k0;
/* compiled from: com_dodopizza_persistence_entity_locality_LocalityInfoEntityRealmProxyInterface.java */
/* renamed from: ngc  reason: default package */
/* loaded from: classes3.dex */
public interface ngc {
    String realmGet$callCenterPhone();

    String realmGet$countryCode();

    String realmGet$id();

    boolean realmGet$isLanding();

    k0<LegalInformationEntity> realmGet$legalInformationList();

    String realmGet$localityId();

    String realmGet$localityUuid();

    String realmGet$mapUrl();

    OrderTypeDiscountEntity realmGet$orderTypeDiscount();

    k0<SocialNetworkInfoEntity> realmGet$socialNetworksList();

    String realmGet$userAgreementTitle();

    String realmGet$userAgreementUrl();

    void realmSet$callCenterPhone(String str);

    void realmSet$countryCode(String str);

    void realmSet$id(String str);

    void realmSet$isLanding(boolean z);

    void realmSet$legalInformationList(k0<LegalInformationEntity> k0Var);

    void realmSet$localityId(String str);

    void realmSet$localityUuid(String str);

    void realmSet$mapUrl(String str);

    void realmSet$orderTypeDiscount(OrderTypeDiscountEntity orderTypeDiscountEntity);

    void realmSet$socialNetworksList(k0<SocialNetworkInfoEntity> k0Var);

    void realmSet$userAgreementTitle(String str);

    void realmSet$userAgreementUrl(String str);
}
