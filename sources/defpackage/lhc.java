package defpackage;

import com.dodopizza.persistence.entity.personalization.DeliveryExperimentEntity;
import com.dodopizza.persistence.entity.personalization.DynamicDeliveryEntity;
import com.dodopizza.persistence.entity.personalization.MenuPersonalPriceInfoEntity;
import com.dodopizza.persistence.entity.personalization.PersonalCategoryEntity;
import com.dodopizza.persistence.entity.personalization.UpsellProductsEntity;
import io.realm.k0;
/* compiled from: com_dodopizza_persistence_entity_personalization_PersonalizationEntityRealmProxyInterface.java */
/* renamed from: lhc  reason: default package */
/* loaded from: classes3.dex */
public interface lhc {
    DeliveryExperimentEntity realmGet$deliveryExperimentInfo();

    DynamicDeliveryEntity realmGet$dynamicDelivery();

    long realmGet$expiredTime();

    String realmGet$id();

    k0<MenuPersonalPriceInfoEntity> realmGet$menuPersonalPricesInfo();

    PersonalCategoryEntity realmGet$personalCategory();

    UpsellProductsEntity realmGet$upsellProducts();

    void realmSet$deliveryExperimentInfo(DeliveryExperimentEntity deliveryExperimentEntity);

    void realmSet$dynamicDelivery(DynamicDeliveryEntity dynamicDeliveryEntity);

    void realmSet$expiredTime(long j);

    void realmSet$id(String str);

    void realmSet$menuPersonalPricesInfo(k0<MenuPersonalPriceInfoEntity> k0Var);

    void realmSet$personalCategory(PersonalCategoryEntity personalCategoryEntity);

    void realmSet$upsellProducts(UpsellProductsEntity upsellProductsEntity);
}
