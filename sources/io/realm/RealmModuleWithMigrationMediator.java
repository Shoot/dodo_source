package io.realm;

import com.dodopizza.persistence.entity.BonusActionEntity;
import com.dodopizza.persistence.entity.CacheTimestampEntity;
import com.dodopizza.persistence.entity.ClientDeliveryFeeLevelEntity;
import com.dodopizza.persistence.entity.CountryEntity;
import com.dodopizza.persistence.entity.DeliveryFeeLevelsEntity;
import com.dodopizza.persistence.entity.ImageEntity;
import com.dodopizza.persistence.entity.MoneyType;
import com.dodopizza.persistence.entity.PackageInfoEntity;
import com.dodopizza.persistence.entity.PackageWidgetDataEntity;
import com.dodopizza.persistence.entity.PaymentEntity;
import com.dodopizza.persistence.entity.RealmInteger;
import com.dodopizza.persistence.entity.RealmString;
import com.dodopizza.persistence.entity.ServerDeltaTimeEntity;
import com.dodopizza.persistence.entity.StateErrorEntity;
import com.dodopizza.persistence.entity.StateWarningEntity;
import com.dodopizza.persistence.entity.UpsaleStateEntity;
import com.dodopizza.persistence.entity.address.AddressEntity;
import com.dodopizza.persistence.entity.address.DeliveryAddressEntity;
import com.dodopizza.persistence.entity.cart.AddedIngredientEntity;
import com.dodopizza.persistence.entity.cart.AppliedBonusActionEntity;
import com.dodopizza.persistence.entity.cart.AppliedInfoEntity;
import com.dodopizza.persistence.entity.cart.CartComboSlotProductEntity;
import com.dodopizza.persistence.entity.cart.CartEntity;
import com.dodopizza.persistence.entity.cart.CartItemEntity;
import com.dodopizza.persistence.entity.cart.CartProductEntity;
import com.dodopizza.persistence.entity.cart.CustomizationEntity;
import com.dodopizza.persistence.entity.cart.DataPaymentEntity;
import com.dodopizza.persistence.entity.cart.DataPromoCodeEntity;
import com.dodopizza.persistence.entity.cart.DiscountEntity;
import com.dodopizza.persistence.entity.cart.EncryptionDataEntity;
import com.dodopizza.persistence.entity.cart.PersonalPriceDiscountEntity;
import com.dodopizza.persistence.entity.cart.PersonalPromoActionEntity;
import com.dodopizza.persistence.entity.cart.PizzaHalvesEntity;
import com.dodopizza.persistence.entity.cart.PriceEntity;
import com.dodopizza.persistence.entity.cart.RemovedIngredientEntity;
import com.dodopizza.persistence.entity.cart.ShoppingCartEntity;
import com.dodopizza.persistence.entity.cart.StateEntity;
import com.dodopizza.persistence.entity.cart.UpsaleEntity;
import com.dodopizza.persistence.entity.cart.UpsaleMeasureInfoEntity;
import com.dodopizza.persistence.entity.cart.UpsaleProductEntity;
import com.dodopizza.persistence.entity.cart.UpsaleSizeDetailsEntity;
import com.dodopizza.persistence.entity.cart.queue.CartQueueItemEntity;
import com.dodopizza.persistence.entity.deliverylocation.AddressAdditionEntity;
import com.dodopizza.persistence.entity.deliverylocation.ClientDeliveryLocationEntity;
import com.dodopizza.persistence.entity.deliverylocation.ClientDeliveryLocationProfileEntity;
import com.dodopizza.persistence.entity.deliverylocation.CoordinatesEntity;
import com.dodopizza.persistence.entity.deliverylocation.DeliveryLocationEntity;
import com.dodopizza.persistence.entity.locality.FeatureEntity;
import com.dodopizza.persistence.entity.locality.LegalInformationEntity;
import com.dodopizza.persistence.entity.locality.LocalityEntity;
import com.dodopizza.persistence.entity.locality.LocalityInfoEntity;
import com.dodopizza.persistence.entity.locality.OrderTypeDiscountEntity;
import com.dodopizza.persistence.entity.locality.SocialNetworkInfoEntity;
import com.dodopizza.persistence.entity.menu.ComboTemplateSlotEntity;
import com.dodopizza.persistence.entity.menu.ComboTemplateSlotProductEntity;
import com.dodopizza.persistence.entity.menu.DoughTypeEntity;
import com.dodopizza.persistence.entity.menu.MenuItemEntity;
import com.dodopizza.persistence.entity.menu.PersonalPriceEntity;
import com.dodopizza.persistence.entity.menu.ProductEntity;
import com.dodopizza.persistence.entity.menu.ProductIngredientEntity;
import com.dodopizza.persistence.entity.menu.PromoActionEntity;
import com.dodopizza.persistence.entity.menu.ShoppingInfoEntity;
import com.dodopizza.persistence.entity.menu.SizeGroupEntity;
import com.dodopizza.persistence.entity.menu.ToppingEntity;
import com.dodopizza.persistence.entity.orderrating.RatingEntity;
import com.dodopizza.persistence.entity.orderrating.RatingPhotoEntity;
import com.dodopizza.persistence.entity.payment.CardEntity;
import com.dodopizza.persistence.entity.payment.GooglePayInitDataEntity;
import com.dodopizza.persistence.entity.payment.PaymentMethodEntity;
import com.dodopizza.persistence.entity.personalization.DeliveryExperimentEntity;
import com.dodopizza.persistence.entity.personalization.DynamicDeliveryEntity;
import com.dodopizza.persistence.entity.personalization.MapEntry;
import com.dodopizza.persistence.entity.personalization.MenuPersonalPriceInfoEntity;
import com.dodopizza.persistence.entity.personalization.PersonalCategoryEntity;
import com.dodopizza.persistence.entity.personalization.PersonalizationEntity;
import com.dodopizza.persistence.entity.personalization.UpsellProductsEntity;
import com.dodopizza.persistence.entity.prizoteka.PrizotekaEntity;
import com.dodopizza.persistence.entity.prizoteka.PrizotekaLevelEntity;
import defpackage.r89;
import io.realm.a;
import io.realm.annotations.RealmModule;
import io.realm.com_dodopizza_persistence_entity_BonusActionEntityRealmProxy;
import io.realm.com_dodopizza_persistence_entity_CacheTimestampEntityRealmProxy;
import io.realm.com_dodopizza_persistence_entity_ClientDeliveryFeeLevelEntityRealmProxy;
import io.realm.com_dodopizza_persistence_entity_CountryEntityRealmProxy;
import io.realm.com_dodopizza_persistence_entity_DeliveryFeeLevelsEntityRealmProxy;
import io.realm.com_dodopizza_persistence_entity_ImageEntityRealmProxy;
import io.realm.com_dodopizza_persistence_entity_MoneyTypeRealmProxy;
import io.realm.com_dodopizza_persistence_entity_PackageInfoEntityRealmProxy;
import io.realm.com_dodopizza_persistence_entity_PackageWidgetDataEntityRealmProxy;
import io.realm.com_dodopizza_persistence_entity_PaymentEntityRealmProxy;
import io.realm.com_dodopizza_persistence_entity_RealmIntegerRealmProxy;
import io.realm.com_dodopizza_persistence_entity_RealmStringRealmProxy;
import io.realm.com_dodopizza_persistence_entity_ServerDeltaTimeEntityRealmProxy;
import io.realm.com_dodopizza_persistence_entity_StateErrorEntityRealmProxy;
import io.realm.com_dodopizza_persistence_entity_StateWarningEntityRealmProxy;
import io.realm.com_dodopizza_persistence_entity_UpsaleStateEntityRealmProxy;
import io.realm.com_dodopizza_persistence_entity_address_AddressEntityRealmProxy;
import io.realm.com_dodopizza_persistence_entity_address_DeliveryAddressEntityRealmProxy;
import io.realm.com_dodopizza_persistence_entity_cart_AddedIngredientEntityRealmProxy;
import io.realm.com_dodopizza_persistence_entity_cart_AppliedBonusActionEntityRealmProxy;
import io.realm.com_dodopizza_persistence_entity_cart_AppliedInfoEntityRealmProxy;
import io.realm.com_dodopizza_persistence_entity_cart_CartComboSlotProductEntityRealmProxy;
import io.realm.com_dodopizza_persistence_entity_cart_CartEntityRealmProxy;
import io.realm.com_dodopizza_persistence_entity_cart_CartItemEntityRealmProxy;
import io.realm.com_dodopizza_persistence_entity_cart_CartProductEntityRealmProxy;
import io.realm.com_dodopizza_persistence_entity_cart_CustomizationEntityRealmProxy;
import io.realm.com_dodopizza_persistence_entity_cart_DataPaymentEntityRealmProxy;
import io.realm.com_dodopizza_persistence_entity_cart_DataPromoCodeEntityRealmProxy;
import io.realm.com_dodopizza_persistence_entity_cart_DiscountEntityRealmProxy;
import io.realm.com_dodopizza_persistence_entity_cart_EncryptionDataEntityRealmProxy;
import io.realm.com_dodopizza_persistence_entity_cart_PersonalPriceDiscountEntityRealmProxy;
import io.realm.com_dodopizza_persistence_entity_cart_PersonalPromoActionEntityRealmProxy;
import io.realm.com_dodopizza_persistence_entity_cart_PizzaHalvesEntityRealmProxy;
import io.realm.com_dodopizza_persistence_entity_cart_PriceEntityRealmProxy;
import io.realm.com_dodopizza_persistence_entity_cart_RemovedIngredientEntityRealmProxy;
import io.realm.com_dodopizza_persistence_entity_cart_ShoppingCartEntityRealmProxy;
import io.realm.com_dodopizza_persistence_entity_cart_StateEntityRealmProxy;
import io.realm.com_dodopizza_persistence_entity_cart_UpsaleEntityRealmProxy;
import io.realm.com_dodopizza_persistence_entity_cart_UpsaleMeasureInfoEntityRealmProxy;
import io.realm.com_dodopizza_persistence_entity_cart_UpsaleProductEntityRealmProxy;
import io.realm.com_dodopizza_persistence_entity_cart_UpsaleSizeDetailsEntityRealmProxy;
import io.realm.com_dodopizza_persistence_entity_cart_queue_CartQueueItemEntityRealmProxy;
import io.realm.com_dodopizza_persistence_entity_deliverylocation_AddressAdditionEntityRealmProxy;
import io.realm.com_dodopizza_persistence_entity_deliverylocation_ClientDeliveryLocationEntityRealmProxy;
import io.realm.com_dodopizza_persistence_entity_deliverylocation_ClientDeliveryLocationProfileEntityRealmProxy;
import io.realm.com_dodopizza_persistence_entity_deliverylocation_CoordinatesEntityRealmProxy;
import io.realm.com_dodopizza_persistence_entity_deliverylocation_DeliveryLocationEntityRealmProxy;
import io.realm.com_dodopizza_persistence_entity_locality_FeatureEntityRealmProxy;
import io.realm.com_dodopizza_persistence_entity_locality_LegalInformationEntityRealmProxy;
import io.realm.com_dodopizza_persistence_entity_locality_LocalityEntityRealmProxy;
import io.realm.com_dodopizza_persistence_entity_locality_LocalityInfoEntityRealmProxy;
import io.realm.com_dodopizza_persistence_entity_locality_OrderTypeDiscountEntityRealmProxy;
import io.realm.com_dodopizza_persistence_entity_locality_SocialNetworkInfoEntityRealmProxy;
import io.realm.com_dodopizza_persistence_entity_menu_ComboTemplateSlotEntityRealmProxy;
import io.realm.com_dodopizza_persistence_entity_menu_ComboTemplateSlotProductEntityRealmProxy;
import io.realm.com_dodopizza_persistence_entity_menu_DoughTypeEntityRealmProxy;
import io.realm.com_dodopizza_persistence_entity_menu_MenuItemEntityRealmProxy;
import io.realm.com_dodopizza_persistence_entity_menu_PersonalPriceEntityRealmProxy;
import io.realm.com_dodopizza_persistence_entity_menu_ProductEntityRealmProxy;
import io.realm.com_dodopizza_persistence_entity_menu_ProductIngredientEntityRealmProxy;
import io.realm.com_dodopizza_persistence_entity_menu_PromoActionEntityRealmProxy;
import io.realm.com_dodopizza_persistence_entity_menu_ShoppingInfoEntityRealmProxy;
import io.realm.com_dodopizza_persistence_entity_menu_SizeGroupEntityRealmProxy;
import io.realm.com_dodopizza_persistence_entity_menu_ToppingEntityRealmProxy;
import io.realm.com_dodopizza_persistence_entity_orderrating_RatingEntityRealmProxy;
import io.realm.com_dodopizza_persistence_entity_orderrating_RatingPhotoEntityRealmProxy;
import io.realm.com_dodopizza_persistence_entity_payment_CardEntityRealmProxy;
import io.realm.com_dodopizza_persistence_entity_payment_GooglePayInitDataEntityRealmProxy;
import io.realm.com_dodopizza_persistence_entity_payment_PaymentMethodEntityRealmProxy;
import io.realm.com_dodopizza_persistence_entity_personalization_DeliveryExperimentEntityRealmProxy;
import io.realm.com_dodopizza_persistence_entity_personalization_DynamicDeliveryEntityRealmProxy;
import io.realm.com_dodopizza_persistence_entity_personalization_MapEntryRealmProxy;
import io.realm.com_dodopizza_persistence_entity_personalization_MenuPersonalPriceInfoEntityRealmProxy;
import io.realm.com_dodopizza_persistence_entity_personalization_PersonalCategoryEntityRealmProxy;
import io.realm.com_dodopizza_persistence_entity_personalization_PersonalizationEntityRealmProxy;
import io.realm.com_dodopizza_persistence_entity_personalization_UpsellProductsEntityRealmProxy;
import io.realm.com_dodopizza_persistence_entity_prizoteka_PrizotekaEntityRealmProxy;
import io.realm.com_dodopizza_persistence_entity_prizoteka_PrizotekaLevelEntityRealmProxy;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
@RealmModule
/* loaded from: classes3.dex */
class RealmModuleWithMigrationMediator extends t89 {
    private static final Set<Class<? extends o89>> a;

    static {
        HashSet hashSet = new HashSet(78);
        hashSet.add(PrizotekaLevelEntity.class);
        hashSet.add(PrizotekaEntity.class);
        hashSet.add(UpsellProductsEntity.class);
        hashSet.add(PersonalizationEntity.class);
        hashSet.add(PersonalCategoryEntity.class);
        hashSet.add(MenuPersonalPriceInfoEntity.class);
        hashSet.add(MapEntry.class);
        hashSet.add(DynamicDeliveryEntity.class);
        hashSet.add(DeliveryExperimentEntity.class);
        hashSet.add(PaymentMethodEntity.class);
        hashSet.add(GooglePayInitDataEntity.class);
        hashSet.add(CardEntity.class);
        hashSet.add(RatingPhotoEntity.class);
        hashSet.add(RatingEntity.class);
        hashSet.add(ToppingEntity.class);
        hashSet.add(SizeGroupEntity.class);
        hashSet.add(ShoppingInfoEntity.class);
        hashSet.add(PromoActionEntity.class);
        hashSet.add(ProductIngredientEntity.class);
        hashSet.add(ProductEntity.class);
        hashSet.add(PersonalPriceEntity.class);
        hashSet.add(MenuItemEntity.class);
        hashSet.add(DoughTypeEntity.class);
        hashSet.add(ComboTemplateSlotProductEntity.class);
        hashSet.add(ComboTemplateSlotEntity.class);
        hashSet.add(SocialNetworkInfoEntity.class);
        hashSet.add(OrderTypeDiscountEntity.class);
        hashSet.add(LocalityInfoEntity.class);
        hashSet.add(LocalityEntity.class);
        hashSet.add(LegalInformationEntity.class);
        hashSet.add(FeatureEntity.class);
        hashSet.add(DeliveryLocationEntity.class);
        hashSet.add(CoordinatesEntity.class);
        hashSet.add(ClientDeliveryLocationProfileEntity.class);
        hashSet.add(ClientDeliveryLocationEntity.class);
        hashSet.add(AddressAdditionEntity.class);
        hashSet.add(CartQueueItemEntity.class);
        hashSet.add(UpsaleSizeDetailsEntity.class);
        hashSet.add(UpsaleProductEntity.class);
        hashSet.add(UpsaleMeasureInfoEntity.class);
        hashSet.add(UpsaleEntity.class);
        hashSet.add(StateEntity.class);
        hashSet.add(ShoppingCartEntity.class);
        hashSet.add(RemovedIngredientEntity.class);
        hashSet.add(PriceEntity.class);
        hashSet.add(PizzaHalvesEntity.class);
        hashSet.add(PersonalPromoActionEntity.class);
        hashSet.add(PersonalPriceDiscountEntity.class);
        hashSet.add(EncryptionDataEntity.class);
        hashSet.add(DiscountEntity.class);
        hashSet.add(DataPromoCodeEntity.class);
        hashSet.add(DataPaymentEntity.class);
        hashSet.add(CustomizationEntity.class);
        hashSet.add(CartProductEntity.class);
        hashSet.add(CartItemEntity.class);
        hashSet.add(CartEntity.class);
        hashSet.add(CartComboSlotProductEntity.class);
        hashSet.add(AppliedInfoEntity.class);
        hashSet.add(AppliedBonusActionEntity.class);
        hashSet.add(AddedIngredientEntity.class);
        hashSet.add(DeliveryAddressEntity.class);
        hashSet.add(AddressEntity.class);
        hashSet.add(UpsaleStateEntity.class);
        hashSet.add(StateWarningEntity.class);
        hashSet.add(StateErrorEntity.class);
        hashSet.add(ServerDeltaTimeEntity.class);
        hashSet.add(RealmString.class);
        hashSet.add(RealmInteger.class);
        hashSet.add(PaymentEntity.class);
        hashSet.add(PackageWidgetDataEntity.class);
        hashSet.add(PackageInfoEntity.class);
        hashSet.add(MoneyType.class);
        hashSet.add(ImageEntity.class);
        hashSet.add(DeliveryFeeLevelsEntity.class);
        hashSet.add(CountryEntity.class);
        hashSet.add(ClientDeliveryFeeLevelEntity.class);
        hashSet.add(CacheTimestampEntity.class);
        hashSet.add(BonusActionEntity.class);
        a = Collections.unmodifiableSet(hashSet);
    }

    RealmModuleWithMigrationMediator() {
    }

    @Override // defpackage.t89
    public <E extends o89> E c(d0 d0Var, E e, boolean z, Map<o89, r89> map, Set<ex4> set) {
        Class<?> superclass = e instanceof r89 ? e.getClass().getSuperclass() : e.getClass();
        if (superclass.equals(PrizotekaLevelEntity.class)) {
            return (E) superclass.cast(com_dodopizza_persistence_entity_prizoteka_PrizotekaLevelEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_prizoteka_PrizotekaLevelEntityRealmProxy.a) d0Var.u().e(PrizotekaLevelEntity.class), (PrizotekaLevelEntity) e, z, map, set));
        }
        if (superclass.equals(PrizotekaEntity.class)) {
            return (E) superclass.cast(com_dodopizza_persistence_entity_prizoteka_PrizotekaEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_prizoteka_PrizotekaEntityRealmProxy.a) d0Var.u().e(PrizotekaEntity.class), (PrizotekaEntity) e, z, map, set));
        }
        if (superclass.equals(UpsellProductsEntity.class)) {
            return (E) superclass.cast(com_dodopizza_persistence_entity_personalization_UpsellProductsEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_personalization_UpsellProductsEntityRealmProxy.a) d0Var.u().e(UpsellProductsEntity.class), (UpsellProductsEntity) e, z, map, set));
        }
        if (superclass.equals(PersonalizationEntity.class)) {
            return (E) superclass.cast(com_dodopizza_persistence_entity_personalization_PersonalizationEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_personalization_PersonalizationEntityRealmProxy.a) d0Var.u().e(PersonalizationEntity.class), (PersonalizationEntity) e, z, map, set));
        }
        if (superclass.equals(PersonalCategoryEntity.class)) {
            return (E) superclass.cast(com_dodopizza_persistence_entity_personalization_PersonalCategoryEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_personalization_PersonalCategoryEntityRealmProxy.a) d0Var.u().e(PersonalCategoryEntity.class), (PersonalCategoryEntity) e, z, map, set));
        }
        if (superclass.equals(MenuPersonalPriceInfoEntity.class)) {
            return (E) superclass.cast(com_dodopizza_persistence_entity_personalization_MenuPersonalPriceInfoEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_personalization_MenuPersonalPriceInfoEntityRealmProxy.a) d0Var.u().e(MenuPersonalPriceInfoEntity.class), (MenuPersonalPriceInfoEntity) e, z, map, set));
        }
        if (superclass.equals(MapEntry.class)) {
            return (E) superclass.cast(com_dodopizza_persistence_entity_personalization_MapEntryRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_personalization_MapEntryRealmProxy.a) d0Var.u().e(MapEntry.class), (MapEntry) e, z, map, set));
        }
        if (superclass.equals(DynamicDeliveryEntity.class)) {
            return (E) superclass.cast(com_dodopizza_persistence_entity_personalization_DynamicDeliveryEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_personalization_DynamicDeliveryEntityRealmProxy.a) d0Var.u().e(DynamicDeliveryEntity.class), (DynamicDeliveryEntity) e, z, map, set));
        }
        if (superclass.equals(DeliveryExperimentEntity.class)) {
            return (E) superclass.cast(com_dodopizza_persistence_entity_personalization_DeliveryExperimentEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_personalization_DeliveryExperimentEntityRealmProxy.a) d0Var.u().e(DeliveryExperimentEntity.class), (DeliveryExperimentEntity) e, z, map, set));
        }
        if (superclass.equals(PaymentMethodEntity.class)) {
            return (E) superclass.cast(com_dodopizza_persistence_entity_payment_PaymentMethodEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_payment_PaymentMethodEntityRealmProxy.a) d0Var.u().e(PaymentMethodEntity.class), (PaymentMethodEntity) e, z, map, set));
        }
        if (superclass.equals(GooglePayInitDataEntity.class)) {
            return (E) superclass.cast(com_dodopizza_persistence_entity_payment_GooglePayInitDataEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_payment_GooglePayInitDataEntityRealmProxy.a) d0Var.u().e(GooglePayInitDataEntity.class), (GooglePayInitDataEntity) e, z, map, set));
        }
        if (superclass.equals(CardEntity.class)) {
            return (E) superclass.cast(com_dodopizza_persistence_entity_payment_CardEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_payment_CardEntityRealmProxy.a) d0Var.u().e(CardEntity.class), (CardEntity) e, z, map, set));
        }
        if (superclass.equals(RatingPhotoEntity.class)) {
            return (E) superclass.cast(com_dodopizza_persistence_entity_orderrating_RatingPhotoEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_orderrating_RatingPhotoEntityRealmProxy.a) d0Var.u().e(RatingPhotoEntity.class), (RatingPhotoEntity) e, z, map, set));
        }
        if (superclass.equals(RatingEntity.class)) {
            return (E) superclass.cast(com_dodopizza_persistence_entity_orderrating_RatingEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_orderrating_RatingEntityRealmProxy.a) d0Var.u().e(RatingEntity.class), (RatingEntity) e, z, map, set));
        }
        if (superclass.equals(ToppingEntity.class)) {
            return (E) superclass.cast(com_dodopizza_persistence_entity_menu_ToppingEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_menu_ToppingEntityRealmProxy.a) d0Var.u().e(ToppingEntity.class), (ToppingEntity) e, z, map, set));
        }
        if (superclass.equals(SizeGroupEntity.class)) {
            return (E) superclass.cast(com_dodopizza_persistence_entity_menu_SizeGroupEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_menu_SizeGroupEntityRealmProxy.a) d0Var.u().e(SizeGroupEntity.class), (SizeGroupEntity) e, z, map, set));
        }
        if (superclass.equals(ShoppingInfoEntity.class)) {
            return (E) superclass.cast(com_dodopizza_persistence_entity_menu_ShoppingInfoEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_menu_ShoppingInfoEntityRealmProxy.a) d0Var.u().e(ShoppingInfoEntity.class), (ShoppingInfoEntity) e, z, map, set));
        }
        if (superclass.equals(PromoActionEntity.class)) {
            return (E) superclass.cast(com_dodopizza_persistence_entity_menu_PromoActionEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_menu_PromoActionEntityRealmProxy.a) d0Var.u().e(PromoActionEntity.class), (PromoActionEntity) e, z, map, set));
        }
        if (superclass.equals(ProductIngredientEntity.class)) {
            return (E) superclass.cast(com_dodopizza_persistence_entity_menu_ProductIngredientEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_menu_ProductIngredientEntityRealmProxy.a) d0Var.u().e(ProductIngredientEntity.class), (ProductIngredientEntity) e, z, map, set));
        }
        if (superclass.equals(ProductEntity.class)) {
            return (E) superclass.cast(com_dodopizza_persistence_entity_menu_ProductEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_menu_ProductEntityRealmProxy.a) d0Var.u().e(ProductEntity.class), (ProductEntity) e, z, map, set));
        }
        if (superclass.equals(PersonalPriceEntity.class)) {
            return (E) superclass.cast(com_dodopizza_persistence_entity_menu_PersonalPriceEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_menu_PersonalPriceEntityRealmProxy.a) d0Var.u().e(PersonalPriceEntity.class), (PersonalPriceEntity) e, z, map, set));
        }
        if (superclass.equals(MenuItemEntity.class)) {
            return (E) superclass.cast(com_dodopizza_persistence_entity_menu_MenuItemEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_menu_MenuItemEntityRealmProxy.a) d0Var.u().e(MenuItemEntity.class), (MenuItemEntity) e, z, map, set));
        }
        if (superclass.equals(DoughTypeEntity.class)) {
            return (E) superclass.cast(com_dodopizza_persistence_entity_menu_DoughTypeEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_menu_DoughTypeEntityRealmProxy.a) d0Var.u().e(DoughTypeEntity.class), (DoughTypeEntity) e, z, map, set));
        }
        if (superclass.equals(ComboTemplateSlotProductEntity.class)) {
            return (E) superclass.cast(com_dodopizza_persistence_entity_menu_ComboTemplateSlotProductEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_menu_ComboTemplateSlotProductEntityRealmProxy.a) d0Var.u().e(ComboTemplateSlotProductEntity.class), (ComboTemplateSlotProductEntity) e, z, map, set));
        }
        if (superclass.equals(ComboTemplateSlotEntity.class)) {
            return (E) superclass.cast(com_dodopizza_persistence_entity_menu_ComboTemplateSlotEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_menu_ComboTemplateSlotEntityRealmProxy.a) d0Var.u().e(ComboTemplateSlotEntity.class), (ComboTemplateSlotEntity) e, z, map, set));
        }
        if (superclass.equals(SocialNetworkInfoEntity.class)) {
            return (E) superclass.cast(com_dodopizza_persistence_entity_locality_SocialNetworkInfoEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_locality_SocialNetworkInfoEntityRealmProxy.a) d0Var.u().e(SocialNetworkInfoEntity.class), (SocialNetworkInfoEntity) e, z, map, set));
        }
        if (superclass.equals(OrderTypeDiscountEntity.class)) {
            return (E) superclass.cast(com_dodopizza_persistence_entity_locality_OrderTypeDiscountEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_locality_OrderTypeDiscountEntityRealmProxy.a) d0Var.u().e(OrderTypeDiscountEntity.class), (OrderTypeDiscountEntity) e, z, map, set));
        }
        if (superclass.equals(LocalityInfoEntity.class)) {
            return (E) superclass.cast(com_dodopizza_persistence_entity_locality_LocalityInfoEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_locality_LocalityInfoEntityRealmProxy.a) d0Var.u().e(LocalityInfoEntity.class), (LocalityInfoEntity) e, z, map, set));
        }
        if (superclass.equals(LocalityEntity.class)) {
            return (E) superclass.cast(com_dodopizza_persistence_entity_locality_LocalityEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_locality_LocalityEntityRealmProxy.a) d0Var.u().e(LocalityEntity.class), (LocalityEntity) e, z, map, set));
        }
        if (superclass.equals(LegalInformationEntity.class)) {
            return (E) superclass.cast(com_dodopizza_persistence_entity_locality_LegalInformationEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_locality_LegalInformationEntityRealmProxy.a) d0Var.u().e(LegalInformationEntity.class), (LegalInformationEntity) e, z, map, set));
        }
        if (superclass.equals(FeatureEntity.class)) {
            return (E) superclass.cast(com_dodopizza_persistence_entity_locality_FeatureEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_locality_FeatureEntityRealmProxy.a) d0Var.u().e(FeatureEntity.class), (FeatureEntity) e, z, map, set));
        }
        if (superclass.equals(DeliveryLocationEntity.class)) {
            return (E) superclass.cast(com_dodopizza_persistence_entity_deliverylocation_DeliveryLocationEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_deliverylocation_DeliveryLocationEntityRealmProxy.a) d0Var.u().e(DeliveryLocationEntity.class), (DeliveryLocationEntity) e, z, map, set));
        }
        if (superclass.equals(CoordinatesEntity.class)) {
            return (E) superclass.cast(com_dodopizza_persistence_entity_deliverylocation_CoordinatesEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_deliverylocation_CoordinatesEntityRealmProxy.a) d0Var.u().e(CoordinatesEntity.class), (CoordinatesEntity) e, z, map, set));
        }
        if (superclass.equals(ClientDeliveryLocationProfileEntity.class)) {
            return (E) superclass.cast(com_dodopizza_persistence_entity_deliverylocation_ClientDeliveryLocationProfileEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_deliverylocation_ClientDeliveryLocationProfileEntityRealmProxy.a) d0Var.u().e(ClientDeliveryLocationProfileEntity.class), (ClientDeliveryLocationProfileEntity) e, z, map, set));
        }
        if (superclass.equals(ClientDeliveryLocationEntity.class)) {
            return (E) superclass.cast(com_dodopizza_persistence_entity_deliverylocation_ClientDeliveryLocationEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_deliverylocation_ClientDeliveryLocationEntityRealmProxy.a) d0Var.u().e(ClientDeliveryLocationEntity.class), (ClientDeliveryLocationEntity) e, z, map, set));
        }
        if (superclass.equals(AddressAdditionEntity.class)) {
            return (E) superclass.cast(com_dodopizza_persistence_entity_deliverylocation_AddressAdditionEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_deliverylocation_AddressAdditionEntityRealmProxy.a) d0Var.u().e(AddressAdditionEntity.class), (AddressAdditionEntity) e, z, map, set));
        }
        if (superclass.equals(CartQueueItemEntity.class)) {
            return (E) superclass.cast(com_dodopizza_persistence_entity_cart_queue_CartQueueItemEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_cart_queue_CartQueueItemEntityRealmProxy.a) d0Var.u().e(CartQueueItemEntity.class), (CartQueueItemEntity) e, z, map, set));
        }
        if (superclass.equals(UpsaleSizeDetailsEntity.class)) {
            return (E) superclass.cast(com_dodopizza_persistence_entity_cart_UpsaleSizeDetailsEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_cart_UpsaleSizeDetailsEntityRealmProxy.a) d0Var.u().e(UpsaleSizeDetailsEntity.class), (UpsaleSizeDetailsEntity) e, z, map, set));
        }
        if (superclass.equals(UpsaleProductEntity.class)) {
            return (E) superclass.cast(com_dodopizza_persistence_entity_cart_UpsaleProductEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_cart_UpsaleProductEntityRealmProxy.a) d0Var.u().e(UpsaleProductEntity.class), (UpsaleProductEntity) e, z, map, set));
        }
        if (superclass.equals(UpsaleMeasureInfoEntity.class)) {
            return (E) superclass.cast(com_dodopizza_persistence_entity_cart_UpsaleMeasureInfoEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_cart_UpsaleMeasureInfoEntityRealmProxy.a) d0Var.u().e(UpsaleMeasureInfoEntity.class), (UpsaleMeasureInfoEntity) e, z, map, set));
        }
        if (superclass.equals(UpsaleEntity.class)) {
            return (E) superclass.cast(com_dodopizza_persistence_entity_cart_UpsaleEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_cart_UpsaleEntityRealmProxy.a) d0Var.u().e(UpsaleEntity.class), (UpsaleEntity) e, z, map, set));
        }
        if (superclass.equals(StateEntity.class)) {
            return (E) superclass.cast(com_dodopizza_persistence_entity_cart_StateEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_cart_StateEntityRealmProxy.a) d0Var.u().e(StateEntity.class), (StateEntity) e, z, map, set));
        }
        if (superclass.equals(ShoppingCartEntity.class)) {
            return (E) superclass.cast(com_dodopizza_persistence_entity_cart_ShoppingCartEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_cart_ShoppingCartEntityRealmProxy.a) d0Var.u().e(ShoppingCartEntity.class), (ShoppingCartEntity) e, z, map, set));
        }
        if (superclass.equals(RemovedIngredientEntity.class)) {
            return (E) superclass.cast(com_dodopizza_persistence_entity_cart_RemovedIngredientEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_cart_RemovedIngredientEntityRealmProxy.a) d0Var.u().e(RemovedIngredientEntity.class), (RemovedIngredientEntity) e, z, map, set));
        }
        if (superclass.equals(PriceEntity.class)) {
            return (E) superclass.cast(com_dodopizza_persistence_entity_cart_PriceEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_cart_PriceEntityRealmProxy.a) d0Var.u().e(PriceEntity.class), (PriceEntity) e, z, map, set));
        }
        if (superclass.equals(PizzaHalvesEntity.class)) {
            return (E) superclass.cast(com_dodopizza_persistence_entity_cart_PizzaHalvesEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_cart_PizzaHalvesEntityRealmProxy.a) d0Var.u().e(PizzaHalvesEntity.class), (PizzaHalvesEntity) e, z, map, set));
        }
        if (superclass.equals(PersonalPromoActionEntity.class)) {
            return (E) superclass.cast(com_dodopizza_persistence_entity_cart_PersonalPromoActionEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_cart_PersonalPromoActionEntityRealmProxy.a) d0Var.u().e(PersonalPromoActionEntity.class), (PersonalPromoActionEntity) e, z, map, set));
        }
        if (superclass.equals(PersonalPriceDiscountEntity.class)) {
            return (E) superclass.cast(com_dodopizza_persistence_entity_cart_PersonalPriceDiscountEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_cart_PersonalPriceDiscountEntityRealmProxy.a) d0Var.u().e(PersonalPriceDiscountEntity.class), (PersonalPriceDiscountEntity) e, z, map, set));
        }
        if (superclass.equals(EncryptionDataEntity.class)) {
            return (E) superclass.cast(com_dodopizza_persistence_entity_cart_EncryptionDataEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_cart_EncryptionDataEntityRealmProxy.a) d0Var.u().e(EncryptionDataEntity.class), (EncryptionDataEntity) e, z, map, set));
        }
        if (superclass.equals(DiscountEntity.class)) {
            return (E) superclass.cast(com_dodopizza_persistence_entity_cart_DiscountEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_cart_DiscountEntityRealmProxy.a) d0Var.u().e(DiscountEntity.class), (DiscountEntity) e, z, map, set));
        }
        if (superclass.equals(DataPromoCodeEntity.class)) {
            return (E) superclass.cast(com_dodopizza_persistence_entity_cart_DataPromoCodeEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_cart_DataPromoCodeEntityRealmProxy.a) d0Var.u().e(DataPromoCodeEntity.class), (DataPromoCodeEntity) e, z, map, set));
        }
        if (superclass.equals(DataPaymentEntity.class)) {
            return (E) superclass.cast(com_dodopizza_persistence_entity_cart_DataPaymentEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_cart_DataPaymentEntityRealmProxy.a) d0Var.u().e(DataPaymentEntity.class), (DataPaymentEntity) e, z, map, set));
        }
        if (superclass.equals(CustomizationEntity.class)) {
            return (E) superclass.cast(com_dodopizza_persistence_entity_cart_CustomizationEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_cart_CustomizationEntityRealmProxy.a) d0Var.u().e(CustomizationEntity.class), (CustomizationEntity) e, z, map, set));
        }
        if (superclass.equals(CartProductEntity.class)) {
            return (E) superclass.cast(com_dodopizza_persistence_entity_cart_CartProductEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_cart_CartProductEntityRealmProxy.a) d0Var.u().e(CartProductEntity.class), (CartProductEntity) e, z, map, set));
        }
        if (superclass.equals(CartItemEntity.class)) {
            return (E) superclass.cast(com_dodopizza_persistence_entity_cart_CartItemEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_cart_CartItemEntityRealmProxy.a) d0Var.u().e(CartItemEntity.class), (CartItemEntity) e, z, map, set));
        }
        if (superclass.equals(CartEntity.class)) {
            return (E) superclass.cast(com_dodopizza_persistence_entity_cart_CartEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_cart_CartEntityRealmProxy.a) d0Var.u().e(CartEntity.class), (CartEntity) e, z, map, set));
        }
        if (superclass.equals(CartComboSlotProductEntity.class)) {
            return (E) superclass.cast(com_dodopizza_persistence_entity_cart_CartComboSlotProductEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_cart_CartComboSlotProductEntityRealmProxy.a) d0Var.u().e(CartComboSlotProductEntity.class), (CartComboSlotProductEntity) e, z, map, set));
        }
        if (superclass.equals(AppliedInfoEntity.class)) {
            return (E) superclass.cast(com_dodopizza_persistence_entity_cart_AppliedInfoEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_cart_AppliedInfoEntityRealmProxy.a) d0Var.u().e(AppliedInfoEntity.class), (AppliedInfoEntity) e, z, map, set));
        }
        if (superclass.equals(AppliedBonusActionEntity.class)) {
            return (E) superclass.cast(com_dodopizza_persistence_entity_cart_AppliedBonusActionEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_cart_AppliedBonusActionEntityRealmProxy.a) d0Var.u().e(AppliedBonusActionEntity.class), (AppliedBonusActionEntity) e, z, map, set));
        }
        if (superclass.equals(AddedIngredientEntity.class)) {
            return (E) superclass.cast(com_dodopizza_persistence_entity_cart_AddedIngredientEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_cart_AddedIngredientEntityRealmProxy.a) d0Var.u().e(AddedIngredientEntity.class), (AddedIngredientEntity) e, z, map, set));
        }
        if (superclass.equals(DeliveryAddressEntity.class)) {
            return (E) superclass.cast(com_dodopizza_persistence_entity_address_DeliveryAddressEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_address_DeliveryAddressEntityRealmProxy.a) d0Var.u().e(DeliveryAddressEntity.class), (DeliveryAddressEntity) e, z, map, set));
        }
        if (superclass.equals(AddressEntity.class)) {
            return (E) superclass.cast(com_dodopizza_persistence_entity_address_AddressEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_address_AddressEntityRealmProxy.a) d0Var.u().e(AddressEntity.class), (AddressEntity) e, z, map, set));
        }
        if (superclass.equals(UpsaleStateEntity.class)) {
            return (E) superclass.cast(com_dodopizza_persistence_entity_UpsaleStateEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_UpsaleStateEntityRealmProxy.a) d0Var.u().e(UpsaleStateEntity.class), (UpsaleStateEntity) e, z, map, set));
        }
        if (superclass.equals(StateWarningEntity.class)) {
            return (E) superclass.cast(com_dodopizza_persistence_entity_StateWarningEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_StateWarningEntityRealmProxy.a) d0Var.u().e(StateWarningEntity.class), (StateWarningEntity) e, z, map, set));
        }
        if (superclass.equals(StateErrorEntity.class)) {
            return (E) superclass.cast(com_dodopizza_persistence_entity_StateErrorEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_StateErrorEntityRealmProxy.a) d0Var.u().e(StateErrorEntity.class), (StateErrorEntity) e, z, map, set));
        }
        if (superclass.equals(ServerDeltaTimeEntity.class)) {
            return (E) superclass.cast(com_dodopizza_persistence_entity_ServerDeltaTimeEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_ServerDeltaTimeEntityRealmProxy.a) d0Var.u().e(ServerDeltaTimeEntity.class), (ServerDeltaTimeEntity) e, z, map, set));
        }
        if (superclass.equals(RealmString.class)) {
            return (E) superclass.cast(com_dodopizza_persistence_entity_RealmStringRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_RealmStringRealmProxy.a) d0Var.u().e(RealmString.class), (RealmString) e, z, map, set));
        }
        if (superclass.equals(RealmInteger.class)) {
            return (E) superclass.cast(com_dodopizza_persistence_entity_RealmIntegerRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_RealmIntegerRealmProxy.a) d0Var.u().e(RealmInteger.class), (RealmInteger) e, z, map, set));
        }
        if (superclass.equals(PaymentEntity.class)) {
            return (E) superclass.cast(com_dodopizza_persistence_entity_PaymentEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_PaymentEntityRealmProxy.a) d0Var.u().e(PaymentEntity.class), (PaymentEntity) e, z, map, set));
        }
        if (superclass.equals(PackageWidgetDataEntity.class)) {
            return (E) superclass.cast(com_dodopizza_persistence_entity_PackageWidgetDataEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_PackageWidgetDataEntityRealmProxy.a) d0Var.u().e(PackageWidgetDataEntity.class), (PackageWidgetDataEntity) e, z, map, set));
        }
        if (superclass.equals(PackageInfoEntity.class)) {
            return (E) superclass.cast(com_dodopizza_persistence_entity_PackageInfoEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_PackageInfoEntityRealmProxy.a) d0Var.u().e(PackageInfoEntity.class), (PackageInfoEntity) e, z, map, set));
        }
        if (superclass.equals(MoneyType.class)) {
            return (E) superclass.cast(com_dodopizza_persistence_entity_MoneyTypeRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_MoneyTypeRealmProxy.a) d0Var.u().e(MoneyType.class), (MoneyType) e, z, map, set));
        }
        if (superclass.equals(ImageEntity.class)) {
            return (E) superclass.cast(com_dodopizza_persistence_entity_ImageEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_ImageEntityRealmProxy.a) d0Var.u().e(ImageEntity.class), (ImageEntity) e, z, map, set));
        }
        if (superclass.equals(DeliveryFeeLevelsEntity.class)) {
            return (E) superclass.cast(com_dodopizza_persistence_entity_DeliveryFeeLevelsEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_DeliveryFeeLevelsEntityRealmProxy.a) d0Var.u().e(DeliveryFeeLevelsEntity.class), (DeliveryFeeLevelsEntity) e, z, map, set));
        }
        if (superclass.equals(CountryEntity.class)) {
            return (E) superclass.cast(com_dodopizza_persistence_entity_CountryEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_CountryEntityRealmProxy.a) d0Var.u().e(CountryEntity.class), (CountryEntity) e, z, map, set));
        }
        if (superclass.equals(ClientDeliveryFeeLevelEntity.class)) {
            return (E) superclass.cast(com_dodopizza_persistence_entity_ClientDeliveryFeeLevelEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_ClientDeliveryFeeLevelEntityRealmProxy.a) d0Var.u().e(ClientDeliveryFeeLevelEntity.class), (ClientDeliveryFeeLevelEntity) e, z, map, set));
        }
        if (superclass.equals(CacheTimestampEntity.class)) {
            return (E) superclass.cast(com_dodopizza_persistence_entity_CacheTimestampEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_CacheTimestampEntityRealmProxy.a) d0Var.u().e(CacheTimestampEntity.class), (CacheTimestampEntity) e, z, map, set));
        }
        if (superclass.equals(BonusActionEntity.class)) {
            return (E) superclass.cast(com_dodopizza_persistence_entity_BonusActionEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_BonusActionEntityRealmProxy.a) d0Var.u().e(BonusActionEntity.class), (BonusActionEntity) e, z, map, set));
        }
        throw t89.i(superclass);
    }

    @Override // defpackage.t89
    public sf1 d(Class<? extends o89> cls, OsSchemaInfo osSchemaInfo) {
        t89.a(cls);
        if (cls.equals(PrizotekaLevelEntity.class)) {
            return com_dodopizza_persistence_entity_prizoteka_PrizotekaLevelEntityRealmProxy.e(osSchemaInfo);
        }
        if (cls.equals(PrizotekaEntity.class)) {
            return com_dodopizza_persistence_entity_prizoteka_PrizotekaEntityRealmProxy.e(osSchemaInfo);
        }
        if (cls.equals(UpsellProductsEntity.class)) {
            return com_dodopizza_persistence_entity_personalization_UpsellProductsEntityRealmProxy.e(osSchemaInfo);
        }
        if (cls.equals(PersonalizationEntity.class)) {
            return com_dodopizza_persistence_entity_personalization_PersonalizationEntityRealmProxy.e(osSchemaInfo);
        }
        if (cls.equals(PersonalCategoryEntity.class)) {
            return com_dodopizza_persistence_entity_personalization_PersonalCategoryEntityRealmProxy.e(osSchemaInfo);
        }
        if (cls.equals(MenuPersonalPriceInfoEntity.class)) {
            return com_dodopizza_persistence_entity_personalization_MenuPersonalPriceInfoEntityRealmProxy.e(osSchemaInfo);
        }
        if (cls.equals(MapEntry.class)) {
            return com_dodopizza_persistence_entity_personalization_MapEntryRealmProxy.e(osSchemaInfo);
        }
        if (cls.equals(DynamicDeliveryEntity.class)) {
            return com_dodopizza_persistence_entity_personalization_DynamicDeliveryEntityRealmProxy.e(osSchemaInfo);
        }
        if (cls.equals(DeliveryExperimentEntity.class)) {
            return com_dodopizza_persistence_entity_personalization_DeliveryExperimentEntityRealmProxy.e(osSchemaInfo);
        }
        if (cls.equals(PaymentMethodEntity.class)) {
            return com_dodopizza_persistence_entity_payment_PaymentMethodEntityRealmProxy.e(osSchemaInfo);
        }
        if (cls.equals(GooglePayInitDataEntity.class)) {
            return com_dodopizza_persistence_entity_payment_GooglePayInitDataEntityRealmProxy.e(osSchemaInfo);
        }
        if (cls.equals(CardEntity.class)) {
            return com_dodopizza_persistence_entity_payment_CardEntityRealmProxy.e(osSchemaInfo);
        }
        if (cls.equals(RatingPhotoEntity.class)) {
            return com_dodopizza_persistence_entity_orderrating_RatingPhotoEntityRealmProxy.e(osSchemaInfo);
        }
        if (cls.equals(RatingEntity.class)) {
            return com_dodopizza_persistence_entity_orderrating_RatingEntityRealmProxy.e(osSchemaInfo);
        }
        if (cls.equals(ToppingEntity.class)) {
            return com_dodopizza_persistence_entity_menu_ToppingEntityRealmProxy.e(osSchemaInfo);
        }
        if (cls.equals(SizeGroupEntity.class)) {
            return com_dodopizza_persistence_entity_menu_SizeGroupEntityRealmProxy.e(osSchemaInfo);
        }
        if (cls.equals(ShoppingInfoEntity.class)) {
            return com_dodopizza_persistence_entity_menu_ShoppingInfoEntityRealmProxy.e(osSchemaInfo);
        }
        if (cls.equals(PromoActionEntity.class)) {
            return com_dodopizza_persistence_entity_menu_PromoActionEntityRealmProxy.e(osSchemaInfo);
        }
        if (cls.equals(ProductIngredientEntity.class)) {
            return com_dodopizza_persistence_entity_menu_ProductIngredientEntityRealmProxy.e(osSchemaInfo);
        }
        if (cls.equals(ProductEntity.class)) {
            return com_dodopizza_persistence_entity_menu_ProductEntityRealmProxy.e(osSchemaInfo);
        }
        if (cls.equals(PersonalPriceEntity.class)) {
            return com_dodopizza_persistence_entity_menu_PersonalPriceEntityRealmProxy.e(osSchemaInfo);
        }
        if (cls.equals(MenuItemEntity.class)) {
            return com_dodopizza_persistence_entity_menu_MenuItemEntityRealmProxy.e(osSchemaInfo);
        }
        if (cls.equals(DoughTypeEntity.class)) {
            return com_dodopizza_persistence_entity_menu_DoughTypeEntityRealmProxy.e(osSchemaInfo);
        }
        if (cls.equals(ComboTemplateSlotProductEntity.class)) {
            return com_dodopizza_persistence_entity_menu_ComboTemplateSlotProductEntityRealmProxy.e(osSchemaInfo);
        }
        if (cls.equals(ComboTemplateSlotEntity.class)) {
            return com_dodopizza_persistence_entity_menu_ComboTemplateSlotEntityRealmProxy.e(osSchemaInfo);
        }
        if (cls.equals(SocialNetworkInfoEntity.class)) {
            return com_dodopizza_persistence_entity_locality_SocialNetworkInfoEntityRealmProxy.e(osSchemaInfo);
        }
        if (cls.equals(OrderTypeDiscountEntity.class)) {
            return com_dodopizza_persistence_entity_locality_OrderTypeDiscountEntityRealmProxy.e(osSchemaInfo);
        }
        if (cls.equals(LocalityInfoEntity.class)) {
            return com_dodopizza_persistence_entity_locality_LocalityInfoEntityRealmProxy.e(osSchemaInfo);
        }
        if (cls.equals(LocalityEntity.class)) {
            return com_dodopizza_persistence_entity_locality_LocalityEntityRealmProxy.e(osSchemaInfo);
        }
        if (cls.equals(LegalInformationEntity.class)) {
            return com_dodopizza_persistence_entity_locality_LegalInformationEntityRealmProxy.e(osSchemaInfo);
        }
        if (cls.equals(FeatureEntity.class)) {
            return com_dodopizza_persistence_entity_locality_FeatureEntityRealmProxy.e(osSchemaInfo);
        }
        if (cls.equals(DeliveryLocationEntity.class)) {
            return com_dodopizza_persistence_entity_deliverylocation_DeliveryLocationEntityRealmProxy.e(osSchemaInfo);
        }
        if (cls.equals(CoordinatesEntity.class)) {
            return com_dodopizza_persistence_entity_deliverylocation_CoordinatesEntityRealmProxy.e(osSchemaInfo);
        }
        if (cls.equals(ClientDeliveryLocationProfileEntity.class)) {
            return com_dodopizza_persistence_entity_deliverylocation_ClientDeliveryLocationProfileEntityRealmProxy.e(osSchemaInfo);
        }
        if (cls.equals(ClientDeliveryLocationEntity.class)) {
            return com_dodopizza_persistence_entity_deliverylocation_ClientDeliveryLocationEntityRealmProxy.e(osSchemaInfo);
        }
        if (cls.equals(AddressAdditionEntity.class)) {
            return com_dodopizza_persistence_entity_deliverylocation_AddressAdditionEntityRealmProxy.e(osSchemaInfo);
        }
        if (cls.equals(CartQueueItemEntity.class)) {
            return com_dodopizza_persistence_entity_cart_queue_CartQueueItemEntityRealmProxy.e(osSchemaInfo);
        }
        if (cls.equals(UpsaleSizeDetailsEntity.class)) {
            return com_dodopizza_persistence_entity_cart_UpsaleSizeDetailsEntityRealmProxy.e(osSchemaInfo);
        }
        if (cls.equals(UpsaleProductEntity.class)) {
            return com_dodopizza_persistence_entity_cart_UpsaleProductEntityRealmProxy.e(osSchemaInfo);
        }
        if (cls.equals(UpsaleMeasureInfoEntity.class)) {
            return com_dodopizza_persistence_entity_cart_UpsaleMeasureInfoEntityRealmProxy.e(osSchemaInfo);
        }
        if (cls.equals(UpsaleEntity.class)) {
            return com_dodopizza_persistence_entity_cart_UpsaleEntityRealmProxy.e(osSchemaInfo);
        }
        if (cls.equals(StateEntity.class)) {
            return com_dodopizza_persistence_entity_cart_StateEntityRealmProxy.e(osSchemaInfo);
        }
        if (cls.equals(ShoppingCartEntity.class)) {
            return com_dodopizza_persistence_entity_cart_ShoppingCartEntityRealmProxy.e(osSchemaInfo);
        }
        if (cls.equals(RemovedIngredientEntity.class)) {
            return com_dodopizza_persistence_entity_cart_RemovedIngredientEntityRealmProxy.e(osSchemaInfo);
        }
        if (cls.equals(PriceEntity.class)) {
            return com_dodopizza_persistence_entity_cart_PriceEntityRealmProxy.e(osSchemaInfo);
        }
        if (cls.equals(PizzaHalvesEntity.class)) {
            return com_dodopizza_persistence_entity_cart_PizzaHalvesEntityRealmProxy.e(osSchemaInfo);
        }
        if (cls.equals(PersonalPromoActionEntity.class)) {
            return com_dodopizza_persistence_entity_cart_PersonalPromoActionEntityRealmProxy.e(osSchemaInfo);
        }
        if (cls.equals(PersonalPriceDiscountEntity.class)) {
            return com_dodopizza_persistence_entity_cart_PersonalPriceDiscountEntityRealmProxy.e(osSchemaInfo);
        }
        if (cls.equals(EncryptionDataEntity.class)) {
            return com_dodopizza_persistence_entity_cart_EncryptionDataEntityRealmProxy.e(osSchemaInfo);
        }
        if (cls.equals(DiscountEntity.class)) {
            return com_dodopizza_persistence_entity_cart_DiscountEntityRealmProxy.e(osSchemaInfo);
        }
        if (cls.equals(DataPromoCodeEntity.class)) {
            return com_dodopizza_persistence_entity_cart_DataPromoCodeEntityRealmProxy.e(osSchemaInfo);
        }
        if (cls.equals(DataPaymentEntity.class)) {
            return com_dodopizza_persistence_entity_cart_DataPaymentEntityRealmProxy.e(osSchemaInfo);
        }
        if (cls.equals(CustomizationEntity.class)) {
            return com_dodopizza_persistence_entity_cart_CustomizationEntityRealmProxy.e(osSchemaInfo);
        }
        if (cls.equals(CartProductEntity.class)) {
            return com_dodopizza_persistence_entity_cart_CartProductEntityRealmProxy.e(osSchemaInfo);
        }
        if (cls.equals(CartItemEntity.class)) {
            return com_dodopizza_persistence_entity_cart_CartItemEntityRealmProxy.e(osSchemaInfo);
        }
        if (cls.equals(CartEntity.class)) {
            return com_dodopizza_persistence_entity_cart_CartEntityRealmProxy.e(osSchemaInfo);
        }
        if (cls.equals(CartComboSlotProductEntity.class)) {
            return com_dodopizza_persistence_entity_cart_CartComboSlotProductEntityRealmProxy.e(osSchemaInfo);
        }
        if (cls.equals(AppliedInfoEntity.class)) {
            return com_dodopizza_persistence_entity_cart_AppliedInfoEntityRealmProxy.e(osSchemaInfo);
        }
        if (cls.equals(AppliedBonusActionEntity.class)) {
            return com_dodopizza_persistence_entity_cart_AppliedBonusActionEntityRealmProxy.e(osSchemaInfo);
        }
        if (cls.equals(AddedIngredientEntity.class)) {
            return com_dodopizza_persistence_entity_cart_AddedIngredientEntityRealmProxy.e(osSchemaInfo);
        }
        if (cls.equals(DeliveryAddressEntity.class)) {
            return com_dodopizza_persistence_entity_address_DeliveryAddressEntityRealmProxy.e(osSchemaInfo);
        }
        if (cls.equals(AddressEntity.class)) {
            return com_dodopizza_persistence_entity_address_AddressEntityRealmProxy.e(osSchemaInfo);
        }
        if (cls.equals(UpsaleStateEntity.class)) {
            return com_dodopizza_persistence_entity_UpsaleStateEntityRealmProxy.e(osSchemaInfo);
        }
        if (cls.equals(StateWarningEntity.class)) {
            return com_dodopizza_persistence_entity_StateWarningEntityRealmProxy.e(osSchemaInfo);
        }
        if (cls.equals(StateErrorEntity.class)) {
            return com_dodopizza_persistence_entity_StateErrorEntityRealmProxy.e(osSchemaInfo);
        }
        if (cls.equals(ServerDeltaTimeEntity.class)) {
            return com_dodopizza_persistence_entity_ServerDeltaTimeEntityRealmProxy.e(osSchemaInfo);
        }
        if (cls.equals(RealmString.class)) {
            return com_dodopizza_persistence_entity_RealmStringRealmProxy.e(osSchemaInfo);
        }
        if (cls.equals(RealmInteger.class)) {
            return com_dodopizza_persistence_entity_RealmIntegerRealmProxy.e(osSchemaInfo);
        }
        if (cls.equals(PaymentEntity.class)) {
            return com_dodopizza_persistence_entity_PaymentEntityRealmProxy.e(osSchemaInfo);
        }
        if (cls.equals(PackageWidgetDataEntity.class)) {
            return com_dodopizza_persistence_entity_PackageWidgetDataEntityRealmProxy.e(osSchemaInfo);
        }
        if (cls.equals(PackageInfoEntity.class)) {
            return com_dodopizza_persistence_entity_PackageInfoEntityRealmProxy.e(osSchemaInfo);
        }
        if (cls.equals(MoneyType.class)) {
            return com_dodopizza_persistence_entity_MoneyTypeRealmProxy.e(osSchemaInfo);
        }
        if (cls.equals(ImageEntity.class)) {
            return com_dodopizza_persistence_entity_ImageEntityRealmProxy.e(osSchemaInfo);
        }
        if (cls.equals(DeliveryFeeLevelsEntity.class)) {
            return com_dodopizza_persistence_entity_DeliveryFeeLevelsEntityRealmProxy.e(osSchemaInfo);
        }
        if (cls.equals(CountryEntity.class)) {
            return com_dodopizza_persistence_entity_CountryEntityRealmProxy.e(osSchemaInfo);
        }
        if (cls.equals(ClientDeliveryFeeLevelEntity.class)) {
            return com_dodopizza_persistence_entity_ClientDeliveryFeeLevelEntityRealmProxy.e(osSchemaInfo);
        }
        if (cls.equals(CacheTimestampEntity.class)) {
            return com_dodopizza_persistence_entity_CacheTimestampEntityRealmProxy.e(osSchemaInfo);
        }
        if (cls.equals(BonusActionEntity.class)) {
            return com_dodopizza_persistence_entity_BonusActionEntityRealmProxy.e(osSchemaInfo);
        }
        throw t89.i(cls);
    }

    @Override // defpackage.t89
    public <E extends o89> E e(E e, int i, Map<o89, r89.a<o89>> map) {
        Class<? super Object> superclass = e.getClass().getSuperclass();
        if (superclass.equals(PrizotekaLevelEntity.class)) {
            return (E) superclass.cast(com_dodopizza_persistence_entity_prizoteka_PrizotekaLevelEntityRealmProxy.f((PrizotekaLevelEntity) e, 0, i, map));
        }
        if (superclass.equals(PrizotekaEntity.class)) {
            return (E) superclass.cast(com_dodopizza_persistence_entity_prizoteka_PrizotekaEntityRealmProxy.f((PrizotekaEntity) e, 0, i, map));
        }
        if (superclass.equals(UpsellProductsEntity.class)) {
            return (E) superclass.cast(com_dodopizza_persistence_entity_personalization_UpsellProductsEntityRealmProxy.f((UpsellProductsEntity) e, 0, i, map));
        }
        if (superclass.equals(PersonalizationEntity.class)) {
            return (E) superclass.cast(com_dodopizza_persistence_entity_personalization_PersonalizationEntityRealmProxy.f((PersonalizationEntity) e, 0, i, map));
        }
        if (superclass.equals(PersonalCategoryEntity.class)) {
            return (E) superclass.cast(com_dodopizza_persistence_entity_personalization_PersonalCategoryEntityRealmProxy.f((PersonalCategoryEntity) e, 0, i, map));
        }
        if (superclass.equals(MenuPersonalPriceInfoEntity.class)) {
            return (E) superclass.cast(com_dodopizza_persistence_entity_personalization_MenuPersonalPriceInfoEntityRealmProxy.f((MenuPersonalPriceInfoEntity) e, 0, i, map));
        }
        if (superclass.equals(MapEntry.class)) {
            return (E) superclass.cast(com_dodopizza_persistence_entity_personalization_MapEntryRealmProxy.f((MapEntry) e, 0, i, map));
        }
        if (superclass.equals(DynamicDeliveryEntity.class)) {
            return (E) superclass.cast(com_dodopizza_persistence_entity_personalization_DynamicDeliveryEntityRealmProxy.f((DynamicDeliveryEntity) e, 0, i, map));
        }
        if (superclass.equals(DeliveryExperimentEntity.class)) {
            return (E) superclass.cast(com_dodopizza_persistence_entity_personalization_DeliveryExperimentEntityRealmProxy.f((DeliveryExperimentEntity) e, 0, i, map));
        }
        if (superclass.equals(PaymentMethodEntity.class)) {
            return (E) superclass.cast(com_dodopizza_persistence_entity_payment_PaymentMethodEntityRealmProxy.f((PaymentMethodEntity) e, 0, i, map));
        }
        if (superclass.equals(GooglePayInitDataEntity.class)) {
            return (E) superclass.cast(com_dodopizza_persistence_entity_payment_GooglePayInitDataEntityRealmProxy.f((GooglePayInitDataEntity) e, 0, i, map));
        }
        if (superclass.equals(CardEntity.class)) {
            return (E) superclass.cast(com_dodopizza_persistence_entity_payment_CardEntityRealmProxy.f((CardEntity) e, 0, i, map));
        }
        if (superclass.equals(RatingPhotoEntity.class)) {
            return (E) superclass.cast(com_dodopizza_persistence_entity_orderrating_RatingPhotoEntityRealmProxy.f((RatingPhotoEntity) e, 0, i, map));
        }
        if (superclass.equals(RatingEntity.class)) {
            return (E) superclass.cast(com_dodopizza_persistence_entity_orderrating_RatingEntityRealmProxy.f((RatingEntity) e, 0, i, map));
        }
        if (superclass.equals(ToppingEntity.class)) {
            return (E) superclass.cast(com_dodopizza_persistence_entity_menu_ToppingEntityRealmProxy.f((ToppingEntity) e, 0, i, map));
        }
        if (superclass.equals(SizeGroupEntity.class)) {
            return (E) superclass.cast(com_dodopizza_persistence_entity_menu_SizeGroupEntityRealmProxy.f((SizeGroupEntity) e, 0, i, map));
        }
        if (superclass.equals(ShoppingInfoEntity.class)) {
            return (E) superclass.cast(com_dodopizza_persistence_entity_menu_ShoppingInfoEntityRealmProxy.f((ShoppingInfoEntity) e, 0, i, map));
        }
        if (superclass.equals(PromoActionEntity.class)) {
            return (E) superclass.cast(com_dodopizza_persistence_entity_menu_PromoActionEntityRealmProxy.f((PromoActionEntity) e, 0, i, map));
        }
        if (superclass.equals(ProductIngredientEntity.class)) {
            return (E) superclass.cast(com_dodopizza_persistence_entity_menu_ProductIngredientEntityRealmProxy.f((ProductIngredientEntity) e, 0, i, map));
        }
        if (superclass.equals(ProductEntity.class)) {
            return (E) superclass.cast(com_dodopizza_persistence_entity_menu_ProductEntityRealmProxy.f((ProductEntity) e, 0, i, map));
        }
        if (superclass.equals(PersonalPriceEntity.class)) {
            return (E) superclass.cast(com_dodopizza_persistence_entity_menu_PersonalPriceEntityRealmProxy.f((PersonalPriceEntity) e, 0, i, map));
        }
        if (superclass.equals(MenuItemEntity.class)) {
            return (E) superclass.cast(com_dodopizza_persistence_entity_menu_MenuItemEntityRealmProxy.f((MenuItemEntity) e, 0, i, map));
        }
        if (superclass.equals(DoughTypeEntity.class)) {
            return (E) superclass.cast(com_dodopizza_persistence_entity_menu_DoughTypeEntityRealmProxy.f((DoughTypeEntity) e, 0, i, map));
        }
        if (superclass.equals(ComboTemplateSlotProductEntity.class)) {
            return (E) superclass.cast(com_dodopizza_persistence_entity_menu_ComboTemplateSlotProductEntityRealmProxy.f((ComboTemplateSlotProductEntity) e, 0, i, map));
        }
        if (superclass.equals(ComboTemplateSlotEntity.class)) {
            return (E) superclass.cast(com_dodopizza_persistence_entity_menu_ComboTemplateSlotEntityRealmProxy.f((ComboTemplateSlotEntity) e, 0, i, map));
        }
        if (superclass.equals(SocialNetworkInfoEntity.class)) {
            return (E) superclass.cast(com_dodopizza_persistence_entity_locality_SocialNetworkInfoEntityRealmProxy.f((SocialNetworkInfoEntity) e, 0, i, map));
        }
        if (superclass.equals(OrderTypeDiscountEntity.class)) {
            return (E) superclass.cast(com_dodopizza_persistence_entity_locality_OrderTypeDiscountEntityRealmProxy.f((OrderTypeDiscountEntity) e, 0, i, map));
        }
        if (superclass.equals(LocalityInfoEntity.class)) {
            return (E) superclass.cast(com_dodopizza_persistence_entity_locality_LocalityInfoEntityRealmProxy.f((LocalityInfoEntity) e, 0, i, map));
        }
        if (superclass.equals(LocalityEntity.class)) {
            return (E) superclass.cast(com_dodopizza_persistence_entity_locality_LocalityEntityRealmProxy.f((LocalityEntity) e, 0, i, map));
        }
        if (superclass.equals(LegalInformationEntity.class)) {
            return (E) superclass.cast(com_dodopizza_persistence_entity_locality_LegalInformationEntityRealmProxy.f((LegalInformationEntity) e, 0, i, map));
        }
        if (superclass.equals(FeatureEntity.class)) {
            return (E) superclass.cast(com_dodopizza_persistence_entity_locality_FeatureEntityRealmProxy.f((FeatureEntity) e, 0, i, map));
        }
        if (superclass.equals(DeliveryLocationEntity.class)) {
            return (E) superclass.cast(com_dodopizza_persistence_entity_deliverylocation_DeliveryLocationEntityRealmProxy.f((DeliveryLocationEntity) e, 0, i, map));
        }
        if (superclass.equals(CoordinatesEntity.class)) {
            return (E) superclass.cast(com_dodopizza_persistence_entity_deliverylocation_CoordinatesEntityRealmProxy.f((CoordinatesEntity) e, 0, i, map));
        }
        if (superclass.equals(ClientDeliveryLocationProfileEntity.class)) {
            return (E) superclass.cast(com_dodopizza_persistence_entity_deliverylocation_ClientDeliveryLocationProfileEntityRealmProxy.f((ClientDeliveryLocationProfileEntity) e, 0, i, map));
        }
        if (superclass.equals(ClientDeliveryLocationEntity.class)) {
            return (E) superclass.cast(com_dodopizza_persistence_entity_deliverylocation_ClientDeliveryLocationEntityRealmProxy.f((ClientDeliveryLocationEntity) e, 0, i, map));
        }
        if (superclass.equals(AddressAdditionEntity.class)) {
            return (E) superclass.cast(com_dodopizza_persistence_entity_deliverylocation_AddressAdditionEntityRealmProxy.f((AddressAdditionEntity) e, 0, i, map));
        }
        if (superclass.equals(CartQueueItemEntity.class)) {
            return (E) superclass.cast(com_dodopizza_persistence_entity_cart_queue_CartQueueItemEntityRealmProxy.f((CartQueueItemEntity) e, 0, i, map));
        }
        if (superclass.equals(UpsaleSizeDetailsEntity.class)) {
            return (E) superclass.cast(com_dodopizza_persistence_entity_cart_UpsaleSizeDetailsEntityRealmProxy.f((UpsaleSizeDetailsEntity) e, 0, i, map));
        }
        if (superclass.equals(UpsaleProductEntity.class)) {
            return (E) superclass.cast(com_dodopizza_persistence_entity_cart_UpsaleProductEntityRealmProxy.f((UpsaleProductEntity) e, 0, i, map));
        }
        if (superclass.equals(UpsaleMeasureInfoEntity.class)) {
            return (E) superclass.cast(com_dodopizza_persistence_entity_cart_UpsaleMeasureInfoEntityRealmProxy.f((UpsaleMeasureInfoEntity) e, 0, i, map));
        }
        if (superclass.equals(UpsaleEntity.class)) {
            return (E) superclass.cast(com_dodopizza_persistence_entity_cart_UpsaleEntityRealmProxy.f((UpsaleEntity) e, 0, i, map));
        }
        if (superclass.equals(StateEntity.class)) {
            return (E) superclass.cast(com_dodopizza_persistence_entity_cart_StateEntityRealmProxy.f((StateEntity) e, 0, i, map));
        }
        if (superclass.equals(ShoppingCartEntity.class)) {
            return (E) superclass.cast(com_dodopizza_persistence_entity_cart_ShoppingCartEntityRealmProxy.f((ShoppingCartEntity) e, 0, i, map));
        }
        if (superclass.equals(RemovedIngredientEntity.class)) {
            return (E) superclass.cast(com_dodopizza_persistence_entity_cart_RemovedIngredientEntityRealmProxy.f((RemovedIngredientEntity) e, 0, i, map));
        }
        if (superclass.equals(PriceEntity.class)) {
            return (E) superclass.cast(com_dodopizza_persistence_entity_cart_PriceEntityRealmProxy.f((PriceEntity) e, 0, i, map));
        }
        if (superclass.equals(PizzaHalvesEntity.class)) {
            return (E) superclass.cast(com_dodopizza_persistence_entity_cart_PizzaHalvesEntityRealmProxy.f((PizzaHalvesEntity) e, 0, i, map));
        }
        if (superclass.equals(PersonalPromoActionEntity.class)) {
            return (E) superclass.cast(com_dodopizza_persistence_entity_cart_PersonalPromoActionEntityRealmProxy.f((PersonalPromoActionEntity) e, 0, i, map));
        }
        if (superclass.equals(PersonalPriceDiscountEntity.class)) {
            return (E) superclass.cast(com_dodopizza_persistence_entity_cart_PersonalPriceDiscountEntityRealmProxy.f((PersonalPriceDiscountEntity) e, 0, i, map));
        }
        if (superclass.equals(EncryptionDataEntity.class)) {
            return (E) superclass.cast(com_dodopizza_persistence_entity_cart_EncryptionDataEntityRealmProxy.f((EncryptionDataEntity) e, 0, i, map));
        }
        if (superclass.equals(DiscountEntity.class)) {
            return (E) superclass.cast(com_dodopizza_persistence_entity_cart_DiscountEntityRealmProxy.f((DiscountEntity) e, 0, i, map));
        }
        if (superclass.equals(DataPromoCodeEntity.class)) {
            return (E) superclass.cast(com_dodopizza_persistence_entity_cart_DataPromoCodeEntityRealmProxy.f((DataPromoCodeEntity) e, 0, i, map));
        }
        if (superclass.equals(DataPaymentEntity.class)) {
            return (E) superclass.cast(com_dodopizza_persistence_entity_cart_DataPaymentEntityRealmProxy.f((DataPaymentEntity) e, 0, i, map));
        }
        if (superclass.equals(CustomizationEntity.class)) {
            return (E) superclass.cast(com_dodopizza_persistence_entity_cart_CustomizationEntityRealmProxy.f((CustomizationEntity) e, 0, i, map));
        }
        if (superclass.equals(CartProductEntity.class)) {
            return (E) superclass.cast(com_dodopizza_persistence_entity_cart_CartProductEntityRealmProxy.f((CartProductEntity) e, 0, i, map));
        }
        if (superclass.equals(CartItemEntity.class)) {
            return (E) superclass.cast(com_dodopizza_persistence_entity_cart_CartItemEntityRealmProxy.f((CartItemEntity) e, 0, i, map));
        }
        if (superclass.equals(CartEntity.class)) {
            return (E) superclass.cast(com_dodopizza_persistence_entity_cart_CartEntityRealmProxy.f((CartEntity) e, 0, i, map));
        }
        if (superclass.equals(CartComboSlotProductEntity.class)) {
            return (E) superclass.cast(com_dodopizza_persistence_entity_cart_CartComboSlotProductEntityRealmProxy.f((CartComboSlotProductEntity) e, 0, i, map));
        }
        if (superclass.equals(AppliedInfoEntity.class)) {
            return (E) superclass.cast(com_dodopizza_persistence_entity_cart_AppliedInfoEntityRealmProxy.f((AppliedInfoEntity) e, 0, i, map));
        }
        if (superclass.equals(AppliedBonusActionEntity.class)) {
            return (E) superclass.cast(com_dodopizza_persistence_entity_cart_AppliedBonusActionEntityRealmProxy.f((AppliedBonusActionEntity) e, 0, i, map));
        }
        if (superclass.equals(AddedIngredientEntity.class)) {
            return (E) superclass.cast(com_dodopizza_persistence_entity_cart_AddedIngredientEntityRealmProxy.f((AddedIngredientEntity) e, 0, i, map));
        }
        if (superclass.equals(DeliveryAddressEntity.class)) {
            return (E) superclass.cast(com_dodopizza_persistence_entity_address_DeliveryAddressEntityRealmProxy.f((DeliveryAddressEntity) e, 0, i, map));
        }
        if (superclass.equals(AddressEntity.class)) {
            return (E) superclass.cast(com_dodopizza_persistence_entity_address_AddressEntityRealmProxy.f((AddressEntity) e, 0, i, map));
        }
        if (superclass.equals(UpsaleStateEntity.class)) {
            return (E) superclass.cast(com_dodopizza_persistence_entity_UpsaleStateEntityRealmProxy.f((UpsaleStateEntity) e, 0, i, map));
        }
        if (superclass.equals(StateWarningEntity.class)) {
            return (E) superclass.cast(com_dodopizza_persistence_entity_StateWarningEntityRealmProxy.f((StateWarningEntity) e, 0, i, map));
        }
        if (superclass.equals(StateErrorEntity.class)) {
            return (E) superclass.cast(com_dodopizza_persistence_entity_StateErrorEntityRealmProxy.f((StateErrorEntity) e, 0, i, map));
        }
        if (superclass.equals(ServerDeltaTimeEntity.class)) {
            return (E) superclass.cast(com_dodopizza_persistence_entity_ServerDeltaTimeEntityRealmProxy.f((ServerDeltaTimeEntity) e, 0, i, map));
        }
        if (superclass.equals(RealmString.class)) {
            return (E) superclass.cast(com_dodopizza_persistence_entity_RealmStringRealmProxy.f((RealmString) e, 0, i, map));
        }
        if (superclass.equals(RealmInteger.class)) {
            return (E) superclass.cast(com_dodopizza_persistence_entity_RealmIntegerRealmProxy.f((RealmInteger) e, 0, i, map));
        }
        if (superclass.equals(PaymentEntity.class)) {
            return (E) superclass.cast(com_dodopizza_persistence_entity_PaymentEntityRealmProxy.f((PaymentEntity) e, 0, i, map));
        }
        if (superclass.equals(PackageWidgetDataEntity.class)) {
            return (E) superclass.cast(com_dodopizza_persistence_entity_PackageWidgetDataEntityRealmProxy.f((PackageWidgetDataEntity) e, 0, i, map));
        }
        if (superclass.equals(PackageInfoEntity.class)) {
            return (E) superclass.cast(com_dodopizza_persistence_entity_PackageInfoEntityRealmProxy.f((PackageInfoEntity) e, 0, i, map));
        }
        if (superclass.equals(MoneyType.class)) {
            return (E) superclass.cast(com_dodopizza_persistence_entity_MoneyTypeRealmProxy.f((MoneyType) e, 0, i, map));
        }
        if (superclass.equals(ImageEntity.class)) {
            return (E) superclass.cast(com_dodopizza_persistence_entity_ImageEntityRealmProxy.f((ImageEntity) e, 0, i, map));
        }
        if (superclass.equals(DeliveryFeeLevelsEntity.class)) {
            return (E) superclass.cast(com_dodopizza_persistence_entity_DeliveryFeeLevelsEntityRealmProxy.f((DeliveryFeeLevelsEntity) e, 0, i, map));
        }
        if (superclass.equals(CountryEntity.class)) {
            return (E) superclass.cast(com_dodopizza_persistence_entity_CountryEntityRealmProxy.f((CountryEntity) e, 0, i, map));
        }
        if (superclass.equals(ClientDeliveryFeeLevelEntity.class)) {
            return (E) superclass.cast(com_dodopizza_persistence_entity_ClientDeliveryFeeLevelEntityRealmProxy.f((ClientDeliveryFeeLevelEntity) e, 0, i, map));
        }
        if (superclass.equals(CacheTimestampEntity.class)) {
            return (E) superclass.cast(com_dodopizza_persistence_entity_CacheTimestampEntityRealmProxy.f((CacheTimestampEntity) e, 0, i, map));
        }
        if (superclass.equals(BonusActionEntity.class)) {
            return (E) superclass.cast(com_dodopizza_persistence_entity_BonusActionEntityRealmProxy.f((BonusActionEntity) e, 0, i, map));
        }
        throw t89.i(superclass);
    }

    @Override // defpackage.t89
    public Class<? extends o89> g(String str) {
        t89.b(str);
        if (str.equals("PrizotekaLevelEntity")) {
            return PrizotekaLevelEntity.class;
        }
        if (str.equals("PrizotekaEntity")) {
            return PrizotekaEntity.class;
        }
        if (str.equals("UpsellProductsEntity")) {
            return UpsellProductsEntity.class;
        }
        if (str.equals("PersonalizationEntity")) {
            return PersonalizationEntity.class;
        }
        if (str.equals("PersonalCategoryEntity")) {
            return PersonalCategoryEntity.class;
        }
        if (str.equals("MenuPersonalPriceInfoEntity")) {
            return MenuPersonalPriceInfoEntity.class;
        }
        if (str.equals("MapEntry")) {
            return MapEntry.class;
        }
        if (str.equals("DynamicDeliveryEntity")) {
            return DynamicDeliveryEntity.class;
        }
        if (str.equals("DeliveryExperimentEntity")) {
            return DeliveryExperimentEntity.class;
        }
        if (str.equals("PaymentMethodEntity")) {
            return PaymentMethodEntity.class;
        }
        if (str.equals("GooglePayInitDataEntity")) {
            return GooglePayInitDataEntity.class;
        }
        if (str.equals("CardEntity")) {
            return CardEntity.class;
        }
        if (str.equals("RatingPhotoEntity")) {
            return RatingPhotoEntity.class;
        }
        if (str.equals("RatingEntity")) {
            return RatingEntity.class;
        }
        if (str.equals("ToppingEntity")) {
            return ToppingEntity.class;
        }
        if (str.equals("SizeGroupEntity")) {
            return SizeGroupEntity.class;
        }
        if (str.equals("ShoppingInfoEntity")) {
            return ShoppingInfoEntity.class;
        }
        if (str.equals("PromoActionEntity")) {
            return PromoActionEntity.class;
        }
        if (str.equals("ProductIngredientEntity")) {
            return ProductIngredientEntity.class;
        }
        if (str.equals("ProductEntity")) {
            return ProductEntity.class;
        }
        if (str.equals("PersonalPriceEntity")) {
            return PersonalPriceEntity.class;
        }
        if (str.equals("MenuItemEntity")) {
            return MenuItemEntity.class;
        }
        if (str.equals("DoughTypeEntity")) {
            return DoughTypeEntity.class;
        }
        if (str.equals("ComboTemplateSlotProductEntity")) {
            return ComboTemplateSlotProductEntity.class;
        }
        if (str.equals("ComboTemplateSlotEntity")) {
            return ComboTemplateSlotEntity.class;
        }
        if (str.equals("SocialNetworkInfoEntity")) {
            return SocialNetworkInfoEntity.class;
        }
        if (str.equals("OrderTypeDiscountEntity")) {
            return OrderTypeDiscountEntity.class;
        }
        if (str.equals("LocalityInfoEntity")) {
            return LocalityInfoEntity.class;
        }
        if (str.equals("LocalityEntity")) {
            return LocalityEntity.class;
        }
        if (str.equals("LegalInformationEntity")) {
            return LegalInformationEntity.class;
        }
        if (str.equals("FeatureEntity")) {
            return FeatureEntity.class;
        }
        if (str.equals("DeliveryLocationEntity")) {
            return DeliveryLocationEntity.class;
        }
        if (str.equals("CoordinatesEntity")) {
            return CoordinatesEntity.class;
        }
        if (str.equals("ClientDeliveryLocationProfileEntity")) {
            return ClientDeliveryLocationProfileEntity.class;
        }
        if (str.equals("ClientDeliveryLocationEntity")) {
            return ClientDeliveryLocationEntity.class;
        }
        if (str.equals("AddressAdditionEntity")) {
            return AddressAdditionEntity.class;
        }
        if (str.equals("CartQueueItemEntity")) {
            return CartQueueItemEntity.class;
        }
        if (str.equals("UpsaleSizeDetailsEntity")) {
            return UpsaleSizeDetailsEntity.class;
        }
        if (str.equals("UpsaleProductEntity")) {
            return UpsaleProductEntity.class;
        }
        if (str.equals("UpsaleMeasureInfoEntity")) {
            return UpsaleMeasureInfoEntity.class;
        }
        if (str.equals("UpsaleEntity")) {
            return UpsaleEntity.class;
        }
        if (str.equals("StateEntity")) {
            return StateEntity.class;
        }
        if (str.equals("ShoppingCartEntity")) {
            return ShoppingCartEntity.class;
        }
        if (str.equals("RemovedIngredientEntity")) {
            return RemovedIngredientEntity.class;
        }
        if (str.equals("PriceEntity")) {
            return PriceEntity.class;
        }
        if (str.equals("PizzaHalvesEntity")) {
            return PizzaHalvesEntity.class;
        }
        if (str.equals("PersonalPromoActionEntity")) {
            return PersonalPromoActionEntity.class;
        }
        if (str.equals("PersonalPriceDiscountEntity")) {
            return PersonalPriceDiscountEntity.class;
        }
        if (str.equals("EncryptionDataEntity")) {
            return EncryptionDataEntity.class;
        }
        if (str.equals("DiscountEntity")) {
            return DiscountEntity.class;
        }
        if (str.equals("DataPromoCodeEntity")) {
            return DataPromoCodeEntity.class;
        }
        if (str.equals("DataPaymentEntity")) {
            return DataPaymentEntity.class;
        }
        if (str.equals("CustomizationEntity")) {
            return CustomizationEntity.class;
        }
        if (str.equals("CartProductEntity")) {
            return CartProductEntity.class;
        }
        if (str.equals("CartItemEntity")) {
            return CartItemEntity.class;
        }
        if (str.equals("CartEntity")) {
            return CartEntity.class;
        }
        if (str.equals("CartComboSlotProductEntity")) {
            return CartComboSlotProductEntity.class;
        }
        if (str.equals("AppliedInfoEntity")) {
            return AppliedInfoEntity.class;
        }
        if (str.equals("AppliedBonusActionEntity")) {
            return AppliedBonusActionEntity.class;
        }
        if (str.equals("AddedIngredientEntity")) {
            return AddedIngredientEntity.class;
        }
        if (str.equals("DeliveryAddressEntity")) {
            return DeliveryAddressEntity.class;
        }
        if (str.equals("AddressEntity")) {
            return AddressEntity.class;
        }
        if (str.equals("UpsaleStateEntity")) {
            return UpsaleStateEntity.class;
        }
        if (str.equals("StateWarningEntity")) {
            return StateWarningEntity.class;
        }
        if (str.equals("StateErrorEntity")) {
            return StateErrorEntity.class;
        }
        if (str.equals("ServerDeltaTimeEntity")) {
            return ServerDeltaTimeEntity.class;
        }
        if (str.equals("RealmString")) {
            return RealmString.class;
        }
        if (str.equals("RealmInteger")) {
            return RealmInteger.class;
        }
        if (str.equals("PaymentEntity")) {
            return PaymentEntity.class;
        }
        if (str.equals("PackageWidgetDataEntity")) {
            return PackageWidgetDataEntity.class;
        }
        if (str.equals("PackageInfoEntity")) {
            return PackageInfoEntity.class;
        }
        if (str.equals("MoneyType")) {
            return MoneyType.class;
        }
        if (str.equals("ImageEntity")) {
            return ImageEntity.class;
        }
        if (str.equals("DeliveryFeeLevelsEntity")) {
            return DeliveryFeeLevelsEntity.class;
        }
        if (str.equals("CountryEntity")) {
            return CountryEntity.class;
        }
        if (str.equals("ClientDeliveryFeeLevelEntity")) {
            return ClientDeliveryFeeLevelEntity.class;
        }
        if (str.equals("CacheTimestampEntity")) {
            return CacheTimestampEntity.class;
        }
        if (str.equals("BonusActionEntity")) {
            return BonusActionEntity.class;
        }
        throw t89.j(str);
    }

    @Override // defpackage.t89
    public Map<Class<? extends o89>, OsObjectSchemaInfo> h() {
        HashMap hashMap = new HashMap(78);
        hashMap.put(PrizotekaLevelEntity.class, com_dodopizza_persistence_entity_prizoteka_PrizotekaLevelEntityRealmProxy.h());
        hashMap.put(PrizotekaEntity.class, com_dodopizza_persistence_entity_prizoteka_PrizotekaEntityRealmProxy.h());
        hashMap.put(UpsellProductsEntity.class, com_dodopizza_persistence_entity_personalization_UpsellProductsEntityRealmProxy.h());
        hashMap.put(PersonalizationEntity.class, com_dodopizza_persistence_entity_personalization_PersonalizationEntityRealmProxy.h());
        hashMap.put(PersonalCategoryEntity.class, com_dodopizza_persistence_entity_personalization_PersonalCategoryEntityRealmProxy.h());
        hashMap.put(MenuPersonalPriceInfoEntity.class, com_dodopizza_persistence_entity_personalization_MenuPersonalPriceInfoEntityRealmProxy.h());
        hashMap.put(MapEntry.class, com_dodopizza_persistence_entity_personalization_MapEntryRealmProxy.h());
        hashMap.put(DynamicDeliveryEntity.class, com_dodopizza_persistence_entity_personalization_DynamicDeliveryEntityRealmProxy.h());
        hashMap.put(DeliveryExperimentEntity.class, com_dodopizza_persistence_entity_personalization_DeliveryExperimentEntityRealmProxy.h());
        hashMap.put(PaymentMethodEntity.class, com_dodopizza_persistence_entity_payment_PaymentMethodEntityRealmProxy.h());
        hashMap.put(GooglePayInitDataEntity.class, com_dodopizza_persistence_entity_payment_GooglePayInitDataEntityRealmProxy.h());
        hashMap.put(CardEntity.class, com_dodopizza_persistence_entity_payment_CardEntityRealmProxy.h());
        hashMap.put(RatingPhotoEntity.class, com_dodopizza_persistence_entity_orderrating_RatingPhotoEntityRealmProxy.h());
        hashMap.put(RatingEntity.class, com_dodopizza_persistence_entity_orderrating_RatingEntityRealmProxy.h());
        hashMap.put(ToppingEntity.class, com_dodopizza_persistence_entity_menu_ToppingEntityRealmProxy.h());
        hashMap.put(SizeGroupEntity.class, com_dodopizza_persistence_entity_menu_SizeGroupEntityRealmProxy.h());
        hashMap.put(ShoppingInfoEntity.class, com_dodopizza_persistence_entity_menu_ShoppingInfoEntityRealmProxy.h());
        hashMap.put(PromoActionEntity.class, com_dodopizza_persistence_entity_menu_PromoActionEntityRealmProxy.h());
        hashMap.put(ProductIngredientEntity.class, com_dodopizza_persistence_entity_menu_ProductIngredientEntityRealmProxy.h());
        hashMap.put(ProductEntity.class, com_dodopizza_persistence_entity_menu_ProductEntityRealmProxy.h());
        hashMap.put(PersonalPriceEntity.class, com_dodopizza_persistence_entity_menu_PersonalPriceEntityRealmProxy.h());
        hashMap.put(MenuItemEntity.class, com_dodopizza_persistence_entity_menu_MenuItemEntityRealmProxy.h());
        hashMap.put(DoughTypeEntity.class, com_dodopizza_persistence_entity_menu_DoughTypeEntityRealmProxy.h());
        hashMap.put(ComboTemplateSlotProductEntity.class, com_dodopizza_persistence_entity_menu_ComboTemplateSlotProductEntityRealmProxy.h());
        hashMap.put(ComboTemplateSlotEntity.class, com_dodopizza_persistence_entity_menu_ComboTemplateSlotEntityRealmProxy.h());
        hashMap.put(SocialNetworkInfoEntity.class, com_dodopizza_persistence_entity_locality_SocialNetworkInfoEntityRealmProxy.h());
        hashMap.put(OrderTypeDiscountEntity.class, com_dodopizza_persistence_entity_locality_OrderTypeDiscountEntityRealmProxy.h());
        hashMap.put(LocalityInfoEntity.class, com_dodopizza_persistence_entity_locality_LocalityInfoEntityRealmProxy.h());
        hashMap.put(LocalityEntity.class, com_dodopizza_persistence_entity_locality_LocalityEntityRealmProxy.h());
        hashMap.put(LegalInformationEntity.class, com_dodopizza_persistence_entity_locality_LegalInformationEntityRealmProxy.h());
        hashMap.put(FeatureEntity.class, com_dodopizza_persistence_entity_locality_FeatureEntityRealmProxy.h());
        hashMap.put(DeliveryLocationEntity.class, com_dodopizza_persistence_entity_deliverylocation_DeliveryLocationEntityRealmProxy.h());
        hashMap.put(CoordinatesEntity.class, com_dodopizza_persistence_entity_deliverylocation_CoordinatesEntityRealmProxy.h());
        hashMap.put(ClientDeliveryLocationProfileEntity.class, com_dodopizza_persistence_entity_deliverylocation_ClientDeliveryLocationProfileEntityRealmProxy.h());
        hashMap.put(ClientDeliveryLocationEntity.class, com_dodopizza_persistence_entity_deliverylocation_ClientDeliveryLocationEntityRealmProxy.h());
        hashMap.put(AddressAdditionEntity.class, com_dodopizza_persistence_entity_deliverylocation_AddressAdditionEntityRealmProxy.h());
        hashMap.put(CartQueueItemEntity.class, com_dodopizza_persistence_entity_cart_queue_CartQueueItemEntityRealmProxy.h());
        hashMap.put(UpsaleSizeDetailsEntity.class, com_dodopizza_persistence_entity_cart_UpsaleSizeDetailsEntityRealmProxy.h());
        hashMap.put(UpsaleProductEntity.class, com_dodopizza_persistence_entity_cart_UpsaleProductEntityRealmProxy.h());
        hashMap.put(UpsaleMeasureInfoEntity.class, com_dodopizza_persistence_entity_cart_UpsaleMeasureInfoEntityRealmProxy.h());
        hashMap.put(UpsaleEntity.class, com_dodopizza_persistence_entity_cart_UpsaleEntityRealmProxy.h());
        hashMap.put(StateEntity.class, com_dodopizza_persistence_entity_cart_StateEntityRealmProxy.h());
        hashMap.put(ShoppingCartEntity.class, com_dodopizza_persistence_entity_cart_ShoppingCartEntityRealmProxy.h());
        hashMap.put(RemovedIngredientEntity.class, com_dodopizza_persistence_entity_cart_RemovedIngredientEntityRealmProxy.h());
        hashMap.put(PriceEntity.class, com_dodopizza_persistence_entity_cart_PriceEntityRealmProxy.h());
        hashMap.put(PizzaHalvesEntity.class, com_dodopizza_persistence_entity_cart_PizzaHalvesEntityRealmProxy.h());
        hashMap.put(PersonalPromoActionEntity.class, com_dodopizza_persistence_entity_cart_PersonalPromoActionEntityRealmProxy.h());
        hashMap.put(PersonalPriceDiscountEntity.class, com_dodopizza_persistence_entity_cart_PersonalPriceDiscountEntityRealmProxy.h());
        hashMap.put(EncryptionDataEntity.class, com_dodopizza_persistence_entity_cart_EncryptionDataEntityRealmProxy.h());
        hashMap.put(DiscountEntity.class, com_dodopizza_persistence_entity_cart_DiscountEntityRealmProxy.h());
        hashMap.put(DataPromoCodeEntity.class, com_dodopizza_persistence_entity_cart_DataPromoCodeEntityRealmProxy.h());
        hashMap.put(DataPaymentEntity.class, com_dodopizza_persistence_entity_cart_DataPaymentEntityRealmProxy.h());
        hashMap.put(CustomizationEntity.class, com_dodopizza_persistence_entity_cart_CustomizationEntityRealmProxy.h());
        hashMap.put(CartProductEntity.class, com_dodopizza_persistence_entity_cart_CartProductEntityRealmProxy.h());
        hashMap.put(CartItemEntity.class, com_dodopizza_persistence_entity_cart_CartItemEntityRealmProxy.h());
        hashMap.put(CartEntity.class, com_dodopizza_persistence_entity_cart_CartEntityRealmProxy.h());
        hashMap.put(CartComboSlotProductEntity.class, com_dodopizza_persistence_entity_cart_CartComboSlotProductEntityRealmProxy.h());
        hashMap.put(AppliedInfoEntity.class, com_dodopizza_persistence_entity_cart_AppliedInfoEntityRealmProxy.h());
        hashMap.put(AppliedBonusActionEntity.class, com_dodopizza_persistence_entity_cart_AppliedBonusActionEntityRealmProxy.h());
        hashMap.put(AddedIngredientEntity.class, com_dodopizza_persistence_entity_cart_AddedIngredientEntityRealmProxy.h());
        hashMap.put(DeliveryAddressEntity.class, com_dodopizza_persistence_entity_address_DeliveryAddressEntityRealmProxy.h());
        hashMap.put(AddressEntity.class, com_dodopizza_persistence_entity_address_AddressEntityRealmProxy.h());
        hashMap.put(UpsaleStateEntity.class, com_dodopizza_persistence_entity_UpsaleStateEntityRealmProxy.h());
        hashMap.put(StateWarningEntity.class, com_dodopizza_persistence_entity_StateWarningEntityRealmProxy.h());
        hashMap.put(StateErrorEntity.class, com_dodopizza_persistence_entity_StateErrorEntityRealmProxy.h());
        hashMap.put(ServerDeltaTimeEntity.class, com_dodopizza_persistence_entity_ServerDeltaTimeEntityRealmProxy.h());
        hashMap.put(RealmString.class, com_dodopizza_persistence_entity_RealmStringRealmProxy.h());
        hashMap.put(RealmInteger.class, com_dodopizza_persistence_entity_RealmIntegerRealmProxy.h());
        hashMap.put(PaymentEntity.class, com_dodopizza_persistence_entity_PaymentEntityRealmProxy.h());
        hashMap.put(PackageWidgetDataEntity.class, com_dodopizza_persistence_entity_PackageWidgetDataEntityRealmProxy.h());
        hashMap.put(PackageInfoEntity.class, com_dodopizza_persistence_entity_PackageInfoEntityRealmProxy.h());
        hashMap.put(MoneyType.class, com_dodopizza_persistence_entity_MoneyTypeRealmProxy.h());
        hashMap.put(ImageEntity.class, com_dodopizza_persistence_entity_ImageEntityRealmProxy.h());
        hashMap.put(DeliveryFeeLevelsEntity.class, com_dodopizza_persistence_entity_DeliveryFeeLevelsEntityRealmProxy.h());
        hashMap.put(CountryEntity.class, com_dodopizza_persistence_entity_CountryEntityRealmProxy.h());
        hashMap.put(ClientDeliveryFeeLevelEntity.class, com_dodopizza_persistence_entity_ClientDeliveryFeeLevelEntityRealmProxy.h());
        hashMap.put(CacheTimestampEntity.class, com_dodopizza_persistence_entity_CacheTimestampEntityRealmProxy.h());
        hashMap.put(BonusActionEntity.class, com_dodopizza_persistence_entity_BonusActionEntityRealmProxy.h());
        return hashMap;
    }

    @Override // defpackage.t89
    public Set<Class<? extends o89>> k() {
        return a;
    }

    @Override // defpackage.t89
    public String n(Class<? extends o89> cls) {
        t89.a(cls);
        if (cls.equals(PrizotekaLevelEntity.class)) {
            return "PrizotekaLevelEntity";
        }
        if (cls.equals(PrizotekaEntity.class)) {
            return "PrizotekaEntity";
        }
        if (cls.equals(UpsellProductsEntity.class)) {
            return "UpsellProductsEntity";
        }
        if (cls.equals(PersonalizationEntity.class)) {
            return "PersonalizationEntity";
        }
        if (cls.equals(PersonalCategoryEntity.class)) {
            return "PersonalCategoryEntity";
        }
        if (cls.equals(MenuPersonalPriceInfoEntity.class)) {
            return "MenuPersonalPriceInfoEntity";
        }
        if (cls.equals(MapEntry.class)) {
            return "MapEntry";
        }
        if (cls.equals(DynamicDeliveryEntity.class)) {
            return "DynamicDeliveryEntity";
        }
        if (cls.equals(DeliveryExperimentEntity.class)) {
            return "DeliveryExperimentEntity";
        }
        if (cls.equals(PaymentMethodEntity.class)) {
            return "PaymentMethodEntity";
        }
        if (cls.equals(GooglePayInitDataEntity.class)) {
            return "GooglePayInitDataEntity";
        }
        if (cls.equals(CardEntity.class)) {
            return "CardEntity";
        }
        if (cls.equals(RatingPhotoEntity.class)) {
            return "RatingPhotoEntity";
        }
        if (cls.equals(RatingEntity.class)) {
            return "RatingEntity";
        }
        if (cls.equals(ToppingEntity.class)) {
            return "ToppingEntity";
        }
        if (cls.equals(SizeGroupEntity.class)) {
            return "SizeGroupEntity";
        }
        if (cls.equals(ShoppingInfoEntity.class)) {
            return "ShoppingInfoEntity";
        }
        if (cls.equals(PromoActionEntity.class)) {
            return "PromoActionEntity";
        }
        if (cls.equals(ProductIngredientEntity.class)) {
            return "ProductIngredientEntity";
        }
        if (cls.equals(ProductEntity.class)) {
            return "ProductEntity";
        }
        if (cls.equals(PersonalPriceEntity.class)) {
            return "PersonalPriceEntity";
        }
        if (cls.equals(MenuItemEntity.class)) {
            return "MenuItemEntity";
        }
        if (cls.equals(DoughTypeEntity.class)) {
            return "DoughTypeEntity";
        }
        if (cls.equals(ComboTemplateSlotProductEntity.class)) {
            return "ComboTemplateSlotProductEntity";
        }
        if (cls.equals(ComboTemplateSlotEntity.class)) {
            return "ComboTemplateSlotEntity";
        }
        if (cls.equals(SocialNetworkInfoEntity.class)) {
            return "SocialNetworkInfoEntity";
        }
        if (cls.equals(OrderTypeDiscountEntity.class)) {
            return "OrderTypeDiscountEntity";
        }
        if (cls.equals(LocalityInfoEntity.class)) {
            return "LocalityInfoEntity";
        }
        if (cls.equals(LocalityEntity.class)) {
            return "LocalityEntity";
        }
        if (cls.equals(LegalInformationEntity.class)) {
            return "LegalInformationEntity";
        }
        if (cls.equals(FeatureEntity.class)) {
            return "FeatureEntity";
        }
        if (cls.equals(DeliveryLocationEntity.class)) {
            return "DeliveryLocationEntity";
        }
        if (cls.equals(CoordinatesEntity.class)) {
            return "CoordinatesEntity";
        }
        if (cls.equals(ClientDeliveryLocationProfileEntity.class)) {
            return "ClientDeliveryLocationProfileEntity";
        }
        if (cls.equals(ClientDeliveryLocationEntity.class)) {
            return "ClientDeliveryLocationEntity";
        }
        if (cls.equals(AddressAdditionEntity.class)) {
            return "AddressAdditionEntity";
        }
        if (cls.equals(CartQueueItemEntity.class)) {
            return "CartQueueItemEntity";
        }
        if (cls.equals(UpsaleSizeDetailsEntity.class)) {
            return "UpsaleSizeDetailsEntity";
        }
        if (cls.equals(UpsaleProductEntity.class)) {
            return "UpsaleProductEntity";
        }
        if (cls.equals(UpsaleMeasureInfoEntity.class)) {
            return "UpsaleMeasureInfoEntity";
        }
        if (cls.equals(UpsaleEntity.class)) {
            return "UpsaleEntity";
        }
        if (cls.equals(StateEntity.class)) {
            return "StateEntity";
        }
        if (cls.equals(ShoppingCartEntity.class)) {
            return "ShoppingCartEntity";
        }
        if (cls.equals(RemovedIngredientEntity.class)) {
            return "RemovedIngredientEntity";
        }
        if (cls.equals(PriceEntity.class)) {
            return "PriceEntity";
        }
        if (cls.equals(PizzaHalvesEntity.class)) {
            return "PizzaHalvesEntity";
        }
        if (cls.equals(PersonalPromoActionEntity.class)) {
            return "PersonalPromoActionEntity";
        }
        if (cls.equals(PersonalPriceDiscountEntity.class)) {
            return "PersonalPriceDiscountEntity";
        }
        if (cls.equals(EncryptionDataEntity.class)) {
            return "EncryptionDataEntity";
        }
        if (cls.equals(DiscountEntity.class)) {
            return "DiscountEntity";
        }
        if (cls.equals(DataPromoCodeEntity.class)) {
            return "DataPromoCodeEntity";
        }
        if (cls.equals(DataPaymentEntity.class)) {
            return "DataPaymentEntity";
        }
        if (cls.equals(CustomizationEntity.class)) {
            return "CustomizationEntity";
        }
        if (cls.equals(CartProductEntity.class)) {
            return "CartProductEntity";
        }
        if (cls.equals(CartItemEntity.class)) {
            return "CartItemEntity";
        }
        if (cls.equals(CartEntity.class)) {
            return "CartEntity";
        }
        if (cls.equals(CartComboSlotProductEntity.class)) {
            return "CartComboSlotProductEntity";
        }
        if (cls.equals(AppliedInfoEntity.class)) {
            return "AppliedInfoEntity";
        }
        if (cls.equals(AppliedBonusActionEntity.class)) {
            return "AppliedBonusActionEntity";
        }
        if (cls.equals(AddedIngredientEntity.class)) {
            return "AddedIngredientEntity";
        }
        if (cls.equals(DeliveryAddressEntity.class)) {
            return "DeliveryAddressEntity";
        }
        if (cls.equals(AddressEntity.class)) {
            return "AddressEntity";
        }
        if (cls.equals(UpsaleStateEntity.class)) {
            return "UpsaleStateEntity";
        }
        if (cls.equals(StateWarningEntity.class)) {
            return "StateWarningEntity";
        }
        if (cls.equals(StateErrorEntity.class)) {
            return "StateErrorEntity";
        }
        if (cls.equals(ServerDeltaTimeEntity.class)) {
            return "ServerDeltaTimeEntity";
        }
        if (cls.equals(RealmString.class)) {
            return "RealmString";
        }
        if (cls.equals(RealmInteger.class)) {
            return "RealmInteger";
        }
        if (cls.equals(PaymentEntity.class)) {
            return "PaymentEntity";
        }
        if (cls.equals(PackageWidgetDataEntity.class)) {
            return "PackageWidgetDataEntity";
        }
        if (cls.equals(PackageInfoEntity.class)) {
            return "PackageInfoEntity";
        }
        if (cls.equals(MoneyType.class)) {
            return "MoneyType";
        }
        if (cls.equals(ImageEntity.class)) {
            return "ImageEntity";
        }
        if (cls.equals(DeliveryFeeLevelsEntity.class)) {
            return "DeliveryFeeLevelsEntity";
        }
        if (cls.equals(CountryEntity.class)) {
            return "CountryEntity";
        }
        if (cls.equals(ClientDeliveryFeeLevelEntity.class)) {
            return "ClientDeliveryFeeLevelEntity";
        }
        if (cls.equals(CacheTimestampEntity.class)) {
            return "CacheTimestampEntity";
        }
        if (cls.equals(BonusActionEntity.class)) {
            return "BonusActionEntity";
        }
        throw t89.i(cls);
    }

    @Override // defpackage.t89
    public boolean p(Class<? extends o89> cls) {
        if (!PrizotekaLevelEntity.class.isAssignableFrom(cls) && !PrizotekaEntity.class.isAssignableFrom(cls) && !UpsellProductsEntity.class.isAssignableFrom(cls) && !PersonalizationEntity.class.isAssignableFrom(cls) && !PersonalCategoryEntity.class.isAssignableFrom(cls) && !MenuPersonalPriceInfoEntity.class.isAssignableFrom(cls) && !DynamicDeliveryEntity.class.isAssignableFrom(cls) && !DeliveryExperimentEntity.class.isAssignableFrom(cls) && !PaymentMethodEntity.class.isAssignableFrom(cls) && !GooglePayInitDataEntity.class.isAssignableFrom(cls) && !RatingPhotoEntity.class.isAssignableFrom(cls) && !RatingEntity.class.isAssignableFrom(cls) && !ToppingEntity.class.isAssignableFrom(cls) && !SizeGroupEntity.class.isAssignableFrom(cls) && !ShoppingInfoEntity.class.isAssignableFrom(cls) && !PromoActionEntity.class.isAssignableFrom(cls) && !ProductIngredientEntity.class.isAssignableFrom(cls) && !ProductEntity.class.isAssignableFrom(cls) && !PersonalPriceEntity.class.isAssignableFrom(cls) && !MenuItemEntity.class.isAssignableFrom(cls) && !DoughTypeEntity.class.isAssignableFrom(cls) && !ComboTemplateSlotProductEntity.class.isAssignableFrom(cls) && !ComboTemplateSlotEntity.class.isAssignableFrom(cls) && !SocialNetworkInfoEntity.class.isAssignableFrom(cls) && !OrderTypeDiscountEntity.class.isAssignableFrom(cls) && !LocalityInfoEntity.class.isAssignableFrom(cls) && !LocalityEntity.class.isAssignableFrom(cls) && !LegalInformationEntity.class.isAssignableFrom(cls) && !DeliveryLocationEntity.class.isAssignableFrom(cls) && !CoordinatesEntity.class.isAssignableFrom(cls) && !ClientDeliveryLocationProfileEntity.class.isAssignableFrom(cls) && !ClientDeliveryLocationEntity.class.isAssignableFrom(cls) && !AddressAdditionEntity.class.isAssignableFrom(cls) && !CartQueueItemEntity.class.isAssignableFrom(cls) && !UpsaleSizeDetailsEntity.class.isAssignableFrom(cls) && !UpsaleProductEntity.class.isAssignableFrom(cls) && !UpsaleMeasureInfoEntity.class.isAssignableFrom(cls) && !UpsaleEntity.class.isAssignableFrom(cls) && !StateEntity.class.isAssignableFrom(cls) && !ShoppingCartEntity.class.isAssignableFrom(cls) && !RemovedIngredientEntity.class.isAssignableFrom(cls) && !PizzaHalvesEntity.class.isAssignableFrom(cls) && !PersonalPriceDiscountEntity.class.isAssignableFrom(cls) && !EncryptionDataEntity.class.isAssignableFrom(cls) && !DiscountEntity.class.isAssignableFrom(cls) && !CustomizationEntity.class.isAssignableFrom(cls) && !CartProductEntity.class.isAssignableFrom(cls) && !CartItemEntity.class.isAssignableFrom(cls) && !CartComboSlotProductEntity.class.isAssignableFrom(cls) && !AppliedInfoEntity.class.isAssignableFrom(cls) && !AppliedBonusActionEntity.class.isAssignableFrom(cls) && !AddedIngredientEntity.class.isAssignableFrom(cls) && !DeliveryAddressEntity.class.isAssignableFrom(cls) && !AddressEntity.class.isAssignableFrom(cls) && !UpsaleStateEntity.class.isAssignableFrom(cls) && !StateWarningEntity.class.isAssignableFrom(cls) && !StateErrorEntity.class.isAssignableFrom(cls) && !ServerDeltaTimeEntity.class.isAssignableFrom(cls) && !PaymentEntity.class.isAssignableFrom(cls) && !DeliveryFeeLevelsEntity.class.isAssignableFrom(cls) && !CountryEntity.class.isAssignableFrom(cls) && !ClientDeliveryFeeLevelEntity.class.isAssignableFrom(cls) && !CacheTimestampEntity.class.isAssignableFrom(cls) && !BonusActionEntity.class.isAssignableFrom(cls)) {
            return false;
        }
        return true;
    }

    @Override // defpackage.t89
    public long q(d0 d0Var, o89 o89Var, Map<o89, Long> map) {
        Class<?> superclass = o89Var instanceof r89 ? o89Var.getClass().getSuperclass() : o89Var.getClass();
        if (superclass.equals(PrizotekaLevelEntity.class)) {
            return com_dodopizza_persistence_entity_prizoteka_PrizotekaLevelEntityRealmProxy.i(d0Var, (PrizotekaLevelEntity) o89Var, map);
        }
        if (superclass.equals(PrizotekaEntity.class)) {
            return com_dodopizza_persistence_entity_prizoteka_PrizotekaEntityRealmProxy.i(d0Var, (PrizotekaEntity) o89Var, map);
        }
        if (superclass.equals(UpsellProductsEntity.class)) {
            return com_dodopizza_persistence_entity_personalization_UpsellProductsEntityRealmProxy.i(d0Var, (UpsellProductsEntity) o89Var, map);
        }
        if (superclass.equals(PersonalizationEntity.class)) {
            return com_dodopizza_persistence_entity_personalization_PersonalizationEntityRealmProxy.i(d0Var, (PersonalizationEntity) o89Var, map);
        }
        if (superclass.equals(PersonalCategoryEntity.class)) {
            return com_dodopizza_persistence_entity_personalization_PersonalCategoryEntityRealmProxy.i(d0Var, (PersonalCategoryEntity) o89Var, map);
        }
        if (superclass.equals(MenuPersonalPriceInfoEntity.class)) {
            return com_dodopizza_persistence_entity_personalization_MenuPersonalPriceInfoEntityRealmProxy.i(d0Var, (MenuPersonalPriceInfoEntity) o89Var, map);
        }
        if (superclass.equals(MapEntry.class)) {
            return com_dodopizza_persistence_entity_personalization_MapEntryRealmProxy.i(d0Var, (MapEntry) o89Var, map);
        }
        if (superclass.equals(DynamicDeliveryEntity.class)) {
            return com_dodopizza_persistence_entity_personalization_DynamicDeliveryEntityRealmProxy.i(d0Var, (DynamicDeliveryEntity) o89Var, map);
        }
        if (superclass.equals(DeliveryExperimentEntity.class)) {
            return com_dodopizza_persistence_entity_personalization_DeliveryExperimentEntityRealmProxy.i(d0Var, (DeliveryExperimentEntity) o89Var, map);
        }
        if (superclass.equals(PaymentMethodEntity.class)) {
            return com_dodopizza_persistence_entity_payment_PaymentMethodEntityRealmProxy.i(d0Var, (PaymentMethodEntity) o89Var, map);
        }
        if (superclass.equals(GooglePayInitDataEntity.class)) {
            return com_dodopizza_persistence_entity_payment_GooglePayInitDataEntityRealmProxy.i(d0Var, (GooglePayInitDataEntity) o89Var, map);
        }
        if (superclass.equals(CardEntity.class)) {
            return com_dodopizza_persistence_entity_payment_CardEntityRealmProxy.i(d0Var, (CardEntity) o89Var, map);
        }
        if (superclass.equals(RatingPhotoEntity.class)) {
            return com_dodopizza_persistence_entity_orderrating_RatingPhotoEntityRealmProxy.i(d0Var, (RatingPhotoEntity) o89Var, map);
        }
        if (superclass.equals(RatingEntity.class)) {
            return com_dodopizza_persistence_entity_orderrating_RatingEntityRealmProxy.i(d0Var, (RatingEntity) o89Var, map);
        }
        if (superclass.equals(ToppingEntity.class)) {
            return com_dodopizza_persistence_entity_menu_ToppingEntityRealmProxy.i(d0Var, (ToppingEntity) o89Var, map);
        }
        if (superclass.equals(SizeGroupEntity.class)) {
            return com_dodopizza_persistence_entity_menu_SizeGroupEntityRealmProxy.i(d0Var, (SizeGroupEntity) o89Var, map);
        }
        if (superclass.equals(ShoppingInfoEntity.class)) {
            return com_dodopizza_persistence_entity_menu_ShoppingInfoEntityRealmProxy.i(d0Var, (ShoppingInfoEntity) o89Var, map);
        }
        if (superclass.equals(PromoActionEntity.class)) {
            return com_dodopizza_persistence_entity_menu_PromoActionEntityRealmProxy.i(d0Var, (PromoActionEntity) o89Var, map);
        }
        if (superclass.equals(ProductIngredientEntity.class)) {
            return com_dodopizza_persistence_entity_menu_ProductIngredientEntityRealmProxy.i(d0Var, (ProductIngredientEntity) o89Var, map);
        }
        if (superclass.equals(ProductEntity.class)) {
            return com_dodopizza_persistence_entity_menu_ProductEntityRealmProxy.i(d0Var, (ProductEntity) o89Var, map);
        }
        if (superclass.equals(PersonalPriceEntity.class)) {
            return com_dodopizza_persistence_entity_menu_PersonalPriceEntityRealmProxy.i(d0Var, (PersonalPriceEntity) o89Var, map);
        }
        if (superclass.equals(MenuItemEntity.class)) {
            return com_dodopizza_persistence_entity_menu_MenuItemEntityRealmProxy.i(d0Var, (MenuItemEntity) o89Var, map);
        }
        if (superclass.equals(DoughTypeEntity.class)) {
            return com_dodopizza_persistence_entity_menu_DoughTypeEntityRealmProxy.i(d0Var, (DoughTypeEntity) o89Var, map);
        }
        if (superclass.equals(ComboTemplateSlotProductEntity.class)) {
            return com_dodopizza_persistence_entity_menu_ComboTemplateSlotProductEntityRealmProxy.i(d0Var, (ComboTemplateSlotProductEntity) o89Var, map);
        }
        if (superclass.equals(ComboTemplateSlotEntity.class)) {
            return com_dodopizza_persistence_entity_menu_ComboTemplateSlotEntityRealmProxy.i(d0Var, (ComboTemplateSlotEntity) o89Var, map);
        }
        if (superclass.equals(SocialNetworkInfoEntity.class)) {
            return com_dodopizza_persistence_entity_locality_SocialNetworkInfoEntityRealmProxy.i(d0Var, (SocialNetworkInfoEntity) o89Var, map);
        }
        if (superclass.equals(OrderTypeDiscountEntity.class)) {
            return com_dodopizza_persistence_entity_locality_OrderTypeDiscountEntityRealmProxy.i(d0Var, (OrderTypeDiscountEntity) o89Var, map);
        }
        if (superclass.equals(LocalityInfoEntity.class)) {
            return com_dodopizza_persistence_entity_locality_LocalityInfoEntityRealmProxy.i(d0Var, (LocalityInfoEntity) o89Var, map);
        }
        if (superclass.equals(LocalityEntity.class)) {
            return com_dodopizza_persistence_entity_locality_LocalityEntityRealmProxy.i(d0Var, (LocalityEntity) o89Var, map);
        }
        if (superclass.equals(LegalInformationEntity.class)) {
            return com_dodopizza_persistence_entity_locality_LegalInformationEntityRealmProxy.i(d0Var, (LegalInformationEntity) o89Var, map);
        }
        if (superclass.equals(FeatureEntity.class)) {
            return com_dodopizza_persistence_entity_locality_FeatureEntityRealmProxy.i(d0Var, (FeatureEntity) o89Var, map);
        }
        if (superclass.equals(DeliveryLocationEntity.class)) {
            return com_dodopizza_persistence_entity_deliverylocation_DeliveryLocationEntityRealmProxy.i(d0Var, (DeliveryLocationEntity) o89Var, map);
        }
        if (superclass.equals(CoordinatesEntity.class)) {
            return com_dodopizza_persistence_entity_deliverylocation_CoordinatesEntityRealmProxy.i(d0Var, (CoordinatesEntity) o89Var, map);
        }
        if (superclass.equals(ClientDeliveryLocationProfileEntity.class)) {
            return com_dodopizza_persistence_entity_deliverylocation_ClientDeliveryLocationProfileEntityRealmProxy.i(d0Var, (ClientDeliveryLocationProfileEntity) o89Var, map);
        }
        if (superclass.equals(ClientDeliveryLocationEntity.class)) {
            return com_dodopizza_persistence_entity_deliverylocation_ClientDeliveryLocationEntityRealmProxy.i(d0Var, (ClientDeliveryLocationEntity) o89Var, map);
        }
        if (superclass.equals(AddressAdditionEntity.class)) {
            return com_dodopizza_persistence_entity_deliverylocation_AddressAdditionEntityRealmProxy.i(d0Var, (AddressAdditionEntity) o89Var, map);
        }
        if (superclass.equals(CartQueueItemEntity.class)) {
            return com_dodopizza_persistence_entity_cart_queue_CartQueueItemEntityRealmProxy.i(d0Var, (CartQueueItemEntity) o89Var, map);
        }
        if (superclass.equals(UpsaleSizeDetailsEntity.class)) {
            return com_dodopizza_persistence_entity_cart_UpsaleSizeDetailsEntityRealmProxy.i(d0Var, (UpsaleSizeDetailsEntity) o89Var, map);
        }
        if (superclass.equals(UpsaleProductEntity.class)) {
            return com_dodopizza_persistence_entity_cart_UpsaleProductEntityRealmProxy.i(d0Var, (UpsaleProductEntity) o89Var, map);
        }
        if (superclass.equals(UpsaleMeasureInfoEntity.class)) {
            return com_dodopizza_persistence_entity_cart_UpsaleMeasureInfoEntityRealmProxy.i(d0Var, (UpsaleMeasureInfoEntity) o89Var, map);
        }
        if (superclass.equals(UpsaleEntity.class)) {
            return com_dodopizza_persistence_entity_cart_UpsaleEntityRealmProxy.i(d0Var, (UpsaleEntity) o89Var, map);
        }
        if (superclass.equals(StateEntity.class)) {
            return com_dodopizza_persistence_entity_cart_StateEntityRealmProxy.i(d0Var, (StateEntity) o89Var, map);
        }
        if (superclass.equals(ShoppingCartEntity.class)) {
            return com_dodopizza_persistence_entity_cart_ShoppingCartEntityRealmProxy.i(d0Var, (ShoppingCartEntity) o89Var, map);
        }
        if (superclass.equals(RemovedIngredientEntity.class)) {
            return com_dodopizza_persistence_entity_cart_RemovedIngredientEntityRealmProxy.i(d0Var, (RemovedIngredientEntity) o89Var, map);
        }
        if (superclass.equals(PriceEntity.class)) {
            return com_dodopizza_persistence_entity_cart_PriceEntityRealmProxy.i(d0Var, (PriceEntity) o89Var, map);
        }
        if (superclass.equals(PizzaHalvesEntity.class)) {
            return com_dodopizza_persistence_entity_cart_PizzaHalvesEntityRealmProxy.i(d0Var, (PizzaHalvesEntity) o89Var, map);
        }
        if (superclass.equals(PersonalPromoActionEntity.class)) {
            return com_dodopizza_persistence_entity_cart_PersonalPromoActionEntityRealmProxy.i(d0Var, (PersonalPromoActionEntity) o89Var, map);
        }
        if (superclass.equals(PersonalPriceDiscountEntity.class)) {
            return com_dodopizza_persistence_entity_cart_PersonalPriceDiscountEntityRealmProxy.i(d0Var, (PersonalPriceDiscountEntity) o89Var, map);
        }
        if (superclass.equals(EncryptionDataEntity.class)) {
            return com_dodopizza_persistence_entity_cart_EncryptionDataEntityRealmProxy.i(d0Var, (EncryptionDataEntity) o89Var, map);
        }
        if (superclass.equals(DiscountEntity.class)) {
            return com_dodopizza_persistence_entity_cart_DiscountEntityRealmProxy.i(d0Var, (DiscountEntity) o89Var, map);
        }
        if (superclass.equals(DataPromoCodeEntity.class)) {
            return com_dodopizza_persistence_entity_cart_DataPromoCodeEntityRealmProxy.i(d0Var, (DataPromoCodeEntity) o89Var, map);
        }
        if (superclass.equals(DataPaymentEntity.class)) {
            return com_dodopizza_persistence_entity_cart_DataPaymentEntityRealmProxy.i(d0Var, (DataPaymentEntity) o89Var, map);
        }
        if (superclass.equals(CustomizationEntity.class)) {
            return com_dodopizza_persistence_entity_cart_CustomizationEntityRealmProxy.i(d0Var, (CustomizationEntity) o89Var, map);
        }
        if (superclass.equals(CartProductEntity.class)) {
            return com_dodopizza_persistence_entity_cart_CartProductEntityRealmProxy.i(d0Var, (CartProductEntity) o89Var, map);
        }
        if (superclass.equals(CartItemEntity.class)) {
            return com_dodopizza_persistence_entity_cart_CartItemEntityRealmProxy.i(d0Var, (CartItemEntity) o89Var, map);
        }
        if (superclass.equals(CartEntity.class)) {
            return com_dodopizza_persistence_entity_cart_CartEntityRealmProxy.i(d0Var, (CartEntity) o89Var, map);
        }
        if (superclass.equals(CartComboSlotProductEntity.class)) {
            return com_dodopizza_persistence_entity_cart_CartComboSlotProductEntityRealmProxy.i(d0Var, (CartComboSlotProductEntity) o89Var, map);
        }
        if (superclass.equals(AppliedInfoEntity.class)) {
            return com_dodopizza_persistence_entity_cart_AppliedInfoEntityRealmProxy.i(d0Var, (AppliedInfoEntity) o89Var, map);
        }
        if (superclass.equals(AppliedBonusActionEntity.class)) {
            return com_dodopizza_persistence_entity_cart_AppliedBonusActionEntityRealmProxy.i(d0Var, (AppliedBonusActionEntity) o89Var, map);
        }
        if (superclass.equals(AddedIngredientEntity.class)) {
            return com_dodopizza_persistence_entity_cart_AddedIngredientEntityRealmProxy.i(d0Var, (AddedIngredientEntity) o89Var, map);
        }
        if (superclass.equals(DeliveryAddressEntity.class)) {
            return com_dodopizza_persistence_entity_address_DeliveryAddressEntityRealmProxy.i(d0Var, (DeliveryAddressEntity) o89Var, map);
        }
        if (superclass.equals(AddressEntity.class)) {
            return com_dodopizza_persistence_entity_address_AddressEntityRealmProxy.i(d0Var, (AddressEntity) o89Var, map);
        }
        if (superclass.equals(UpsaleStateEntity.class)) {
            return com_dodopizza_persistence_entity_UpsaleStateEntityRealmProxy.i(d0Var, (UpsaleStateEntity) o89Var, map);
        }
        if (superclass.equals(StateWarningEntity.class)) {
            return com_dodopizza_persistence_entity_StateWarningEntityRealmProxy.i(d0Var, (StateWarningEntity) o89Var, map);
        }
        if (superclass.equals(StateErrorEntity.class)) {
            return com_dodopizza_persistence_entity_StateErrorEntityRealmProxy.i(d0Var, (StateErrorEntity) o89Var, map);
        }
        if (superclass.equals(ServerDeltaTimeEntity.class)) {
            return com_dodopizza_persistence_entity_ServerDeltaTimeEntityRealmProxy.i(d0Var, (ServerDeltaTimeEntity) o89Var, map);
        }
        if (superclass.equals(RealmString.class)) {
            return com_dodopizza_persistence_entity_RealmStringRealmProxy.i(d0Var, (RealmString) o89Var, map);
        }
        if (superclass.equals(RealmInteger.class)) {
            return com_dodopizza_persistence_entity_RealmIntegerRealmProxy.i(d0Var, (RealmInteger) o89Var, map);
        }
        if (superclass.equals(PaymentEntity.class)) {
            return com_dodopizza_persistence_entity_PaymentEntityRealmProxy.i(d0Var, (PaymentEntity) o89Var, map);
        }
        if (superclass.equals(PackageWidgetDataEntity.class)) {
            return com_dodopizza_persistence_entity_PackageWidgetDataEntityRealmProxy.i(d0Var, (PackageWidgetDataEntity) o89Var, map);
        }
        if (superclass.equals(PackageInfoEntity.class)) {
            return com_dodopizza_persistence_entity_PackageInfoEntityRealmProxy.i(d0Var, (PackageInfoEntity) o89Var, map);
        }
        if (superclass.equals(MoneyType.class)) {
            return com_dodopizza_persistence_entity_MoneyTypeRealmProxy.i(d0Var, (MoneyType) o89Var, map);
        }
        if (superclass.equals(ImageEntity.class)) {
            return com_dodopizza_persistence_entity_ImageEntityRealmProxy.i(d0Var, (ImageEntity) o89Var, map);
        }
        if (superclass.equals(DeliveryFeeLevelsEntity.class)) {
            return com_dodopizza_persistence_entity_DeliveryFeeLevelsEntityRealmProxy.i(d0Var, (DeliveryFeeLevelsEntity) o89Var, map);
        }
        if (superclass.equals(CountryEntity.class)) {
            return com_dodopizza_persistence_entity_CountryEntityRealmProxy.i(d0Var, (CountryEntity) o89Var, map);
        }
        if (superclass.equals(ClientDeliveryFeeLevelEntity.class)) {
            return com_dodopizza_persistence_entity_ClientDeliveryFeeLevelEntityRealmProxy.i(d0Var, (ClientDeliveryFeeLevelEntity) o89Var, map);
        }
        if (superclass.equals(CacheTimestampEntity.class)) {
            return com_dodopizza_persistence_entity_CacheTimestampEntityRealmProxy.i(d0Var, (CacheTimestampEntity) o89Var, map);
        }
        if (superclass.equals(BonusActionEntity.class)) {
            return com_dodopizza_persistence_entity_BonusActionEntityRealmProxy.i(d0Var, (BonusActionEntity) o89Var, map);
        }
        throw t89.i(superclass);
    }

    @Override // defpackage.t89
    public <E extends o89> boolean r(Class<E> cls) {
        if (cls.equals(PrizotekaLevelEntity.class) || cls.equals(PrizotekaEntity.class) || cls.equals(UpsellProductsEntity.class) || cls.equals(PersonalizationEntity.class) || cls.equals(PersonalCategoryEntity.class) || cls.equals(MenuPersonalPriceInfoEntity.class) || cls.equals(MapEntry.class) || cls.equals(DynamicDeliveryEntity.class) || cls.equals(DeliveryExperimentEntity.class) || cls.equals(PaymentMethodEntity.class) || cls.equals(GooglePayInitDataEntity.class) || cls.equals(CardEntity.class) || cls.equals(RatingPhotoEntity.class) || cls.equals(RatingEntity.class) || cls.equals(ToppingEntity.class) || cls.equals(SizeGroupEntity.class) || cls.equals(ShoppingInfoEntity.class) || cls.equals(PromoActionEntity.class) || cls.equals(ProductIngredientEntity.class) || cls.equals(ProductEntity.class) || cls.equals(PersonalPriceEntity.class) || cls.equals(MenuItemEntity.class) || cls.equals(DoughTypeEntity.class) || cls.equals(ComboTemplateSlotProductEntity.class) || cls.equals(ComboTemplateSlotEntity.class) || cls.equals(SocialNetworkInfoEntity.class) || cls.equals(OrderTypeDiscountEntity.class) || cls.equals(LocalityInfoEntity.class) || cls.equals(LocalityEntity.class) || cls.equals(LegalInformationEntity.class) || cls.equals(FeatureEntity.class) || cls.equals(DeliveryLocationEntity.class) || cls.equals(CoordinatesEntity.class) || cls.equals(ClientDeliveryLocationProfileEntity.class) || cls.equals(ClientDeliveryLocationEntity.class) || cls.equals(AddressAdditionEntity.class) || cls.equals(CartQueueItemEntity.class) || cls.equals(UpsaleSizeDetailsEntity.class) || cls.equals(UpsaleProductEntity.class) || cls.equals(UpsaleMeasureInfoEntity.class) || cls.equals(UpsaleEntity.class) || cls.equals(StateEntity.class) || cls.equals(ShoppingCartEntity.class) || cls.equals(RemovedIngredientEntity.class) || cls.equals(PriceEntity.class) || cls.equals(PizzaHalvesEntity.class) || cls.equals(PersonalPromoActionEntity.class) || cls.equals(PersonalPriceDiscountEntity.class) || cls.equals(EncryptionDataEntity.class) || cls.equals(DiscountEntity.class) || cls.equals(DataPromoCodeEntity.class) || cls.equals(DataPaymentEntity.class) || cls.equals(CustomizationEntity.class) || cls.equals(CartProductEntity.class) || cls.equals(CartItemEntity.class) || cls.equals(CartEntity.class) || cls.equals(CartComboSlotProductEntity.class) || cls.equals(AppliedInfoEntity.class) || cls.equals(AppliedBonusActionEntity.class) || cls.equals(AddedIngredientEntity.class) || cls.equals(DeliveryAddressEntity.class) || cls.equals(AddressEntity.class) || cls.equals(UpsaleStateEntity.class) || cls.equals(StateWarningEntity.class) || cls.equals(StateErrorEntity.class) || cls.equals(ServerDeltaTimeEntity.class) || cls.equals(RealmString.class) || cls.equals(RealmInteger.class) || cls.equals(PaymentEntity.class) || cls.equals(PackageWidgetDataEntity.class) || cls.equals(PackageInfoEntity.class) || cls.equals(MoneyType.class) || cls.equals(ImageEntity.class) || cls.equals(DeliveryFeeLevelsEntity.class) || cls.equals(CountryEntity.class) || cls.equals(ClientDeliveryFeeLevelEntity.class) || cls.equals(CacheTimestampEntity.class) || cls.equals(BonusActionEntity.class)) {
            return false;
        }
        throw t89.i(cls);
    }

    @Override // defpackage.t89
    public <E extends o89> E s(Class<E> cls, Object obj, fp9 fp9Var, sf1 sf1Var, boolean z, List<String> list) {
        a.c cVar = a.k.get();
        try {
            cVar.g((a) obj, fp9Var, sf1Var, z, list);
            t89.a(cls);
            if (cls.equals(PrizotekaLevelEntity.class)) {
                return cls.cast(new com_dodopizza_persistence_entity_prizoteka_PrizotekaLevelEntityRealmProxy());
            }
            if (cls.equals(PrizotekaEntity.class)) {
                return cls.cast(new com_dodopizza_persistence_entity_prizoteka_PrizotekaEntityRealmProxy());
            }
            if (cls.equals(UpsellProductsEntity.class)) {
                return cls.cast(new com_dodopizza_persistence_entity_personalization_UpsellProductsEntityRealmProxy());
            }
            if (cls.equals(PersonalizationEntity.class)) {
                return cls.cast(new com_dodopizza_persistence_entity_personalization_PersonalizationEntityRealmProxy());
            }
            if (cls.equals(PersonalCategoryEntity.class)) {
                return cls.cast(new com_dodopizza_persistence_entity_personalization_PersonalCategoryEntityRealmProxy());
            }
            if (cls.equals(MenuPersonalPriceInfoEntity.class)) {
                return cls.cast(new com_dodopizza_persistence_entity_personalization_MenuPersonalPriceInfoEntityRealmProxy());
            }
            if (cls.equals(MapEntry.class)) {
                return cls.cast(new com_dodopizza_persistence_entity_personalization_MapEntryRealmProxy());
            }
            if (cls.equals(DynamicDeliveryEntity.class)) {
                return cls.cast(new com_dodopizza_persistence_entity_personalization_DynamicDeliveryEntityRealmProxy());
            }
            if (cls.equals(DeliveryExperimentEntity.class)) {
                return cls.cast(new com_dodopizza_persistence_entity_personalization_DeliveryExperimentEntityRealmProxy());
            }
            if (cls.equals(PaymentMethodEntity.class)) {
                return cls.cast(new com_dodopizza_persistence_entity_payment_PaymentMethodEntityRealmProxy());
            }
            if (cls.equals(GooglePayInitDataEntity.class)) {
                return cls.cast(new com_dodopizza_persistence_entity_payment_GooglePayInitDataEntityRealmProxy());
            }
            if (cls.equals(CardEntity.class)) {
                return cls.cast(new com_dodopizza_persistence_entity_payment_CardEntityRealmProxy());
            }
            if (cls.equals(RatingPhotoEntity.class)) {
                return cls.cast(new com_dodopizza_persistence_entity_orderrating_RatingPhotoEntityRealmProxy());
            }
            if (cls.equals(RatingEntity.class)) {
                return cls.cast(new com_dodopizza_persistence_entity_orderrating_RatingEntityRealmProxy());
            }
            if (cls.equals(ToppingEntity.class)) {
                return cls.cast(new com_dodopizza_persistence_entity_menu_ToppingEntityRealmProxy());
            }
            if (cls.equals(SizeGroupEntity.class)) {
                return cls.cast(new com_dodopizza_persistence_entity_menu_SizeGroupEntityRealmProxy());
            }
            if (cls.equals(ShoppingInfoEntity.class)) {
                return cls.cast(new com_dodopizza_persistence_entity_menu_ShoppingInfoEntityRealmProxy());
            }
            if (cls.equals(PromoActionEntity.class)) {
                return cls.cast(new com_dodopizza_persistence_entity_menu_PromoActionEntityRealmProxy());
            }
            if (cls.equals(ProductIngredientEntity.class)) {
                return cls.cast(new com_dodopizza_persistence_entity_menu_ProductIngredientEntityRealmProxy());
            }
            if (cls.equals(ProductEntity.class)) {
                return cls.cast(new com_dodopizza_persistence_entity_menu_ProductEntityRealmProxy());
            }
            if (cls.equals(PersonalPriceEntity.class)) {
                return cls.cast(new com_dodopizza_persistence_entity_menu_PersonalPriceEntityRealmProxy());
            }
            if (cls.equals(MenuItemEntity.class)) {
                return cls.cast(new com_dodopizza_persistence_entity_menu_MenuItemEntityRealmProxy());
            }
            if (cls.equals(DoughTypeEntity.class)) {
                return cls.cast(new com_dodopizza_persistence_entity_menu_DoughTypeEntityRealmProxy());
            }
            if (cls.equals(ComboTemplateSlotProductEntity.class)) {
                return cls.cast(new com_dodopizza_persistence_entity_menu_ComboTemplateSlotProductEntityRealmProxy());
            }
            if (cls.equals(ComboTemplateSlotEntity.class)) {
                return cls.cast(new com_dodopizza_persistence_entity_menu_ComboTemplateSlotEntityRealmProxy());
            }
            if (cls.equals(SocialNetworkInfoEntity.class)) {
                return cls.cast(new com_dodopizza_persistence_entity_locality_SocialNetworkInfoEntityRealmProxy());
            }
            if (cls.equals(OrderTypeDiscountEntity.class)) {
                return cls.cast(new com_dodopizza_persistence_entity_locality_OrderTypeDiscountEntityRealmProxy());
            }
            if (cls.equals(LocalityInfoEntity.class)) {
                return cls.cast(new com_dodopizza_persistence_entity_locality_LocalityInfoEntityRealmProxy());
            }
            if (cls.equals(LocalityEntity.class)) {
                return cls.cast(new com_dodopizza_persistence_entity_locality_LocalityEntityRealmProxy());
            }
            if (cls.equals(LegalInformationEntity.class)) {
                return cls.cast(new com_dodopizza_persistence_entity_locality_LegalInformationEntityRealmProxy());
            }
            if (cls.equals(FeatureEntity.class)) {
                return cls.cast(new com_dodopizza_persistence_entity_locality_FeatureEntityRealmProxy());
            }
            if (cls.equals(DeliveryLocationEntity.class)) {
                return cls.cast(new com_dodopizza_persistence_entity_deliverylocation_DeliveryLocationEntityRealmProxy());
            }
            if (cls.equals(CoordinatesEntity.class)) {
                return cls.cast(new com_dodopizza_persistence_entity_deliverylocation_CoordinatesEntityRealmProxy());
            }
            if (cls.equals(ClientDeliveryLocationProfileEntity.class)) {
                return cls.cast(new com_dodopizza_persistence_entity_deliverylocation_ClientDeliveryLocationProfileEntityRealmProxy());
            }
            if (cls.equals(ClientDeliveryLocationEntity.class)) {
                return cls.cast(new com_dodopizza_persistence_entity_deliverylocation_ClientDeliveryLocationEntityRealmProxy());
            }
            if (cls.equals(AddressAdditionEntity.class)) {
                return cls.cast(new com_dodopizza_persistence_entity_deliverylocation_AddressAdditionEntityRealmProxy());
            }
            if (cls.equals(CartQueueItemEntity.class)) {
                return cls.cast(new com_dodopizza_persistence_entity_cart_queue_CartQueueItemEntityRealmProxy());
            }
            if (cls.equals(UpsaleSizeDetailsEntity.class)) {
                return cls.cast(new com_dodopizza_persistence_entity_cart_UpsaleSizeDetailsEntityRealmProxy());
            }
            if (cls.equals(UpsaleProductEntity.class)) {
                return cls.cast(new com_dodopizza_persistence_entity_cart_UpsaleProductEntityRealmProxy());
            }
            if (cls.equals(UpsaleMeasureInfoEntity.class)) {
                return cls.cast(new com_dodopizza_persistence_entity_cart_UpsaleMeasureInfoEntityRealmProxy());
            }
            if (cls.equals(UpsaleEntity.class)) {
                return cls.cast(new com_dodopizza_persistence_entity_cart_UpsaleEntityRealmProxy());
            }
            if (cls.equals(StateEntity.class)) {
                return cls.cast(new com_dodopizza_persistence_entity_cart_StateEntityRealmProxy());
            }
            if (cls.equals(ShoppingCartEntity.class)) {
                return cls.cast(new com_dodopizza_persistence_entity_cart_ShoppingCartEntityRealmProxy());
            }
            if (cls.equals(RemovedIngredientEntity.class)) {
                return cls.cast(new com_dodopizza_persistence_entity_cart_RemovedIngredientEntityRealmProxy());
            }
            if (cls.equals(PriceEntity.class)) {
                return cls.cast(new com_dodopizza_persistence_entity_cart_PriceEntityRealmProxy());
            }
            if (cls.equals(PizzaHalvesEntity.class)) {
                return cls.cast(new com_dodopizza_persistence_entity_cart_PizzaHalvesEntityRealmProxy());
            }
            if (cls.equals(PersonalPromoActionEntity.class)) {
                return cls.cast(new com_dodopizza_persistence_entity_cart_PersonalPromoActionEntityRealmProxy());
            }
            if (cls.equals(PersonalPriceDiscountEntity.class)) {
                return cls.cast(new com_dodopizza_persistence_entity_cart_PersonalPriceDiscountEntityRealmProxy());
            }
            if (cls.equals(EncryptionDataEntity.class)) {
                return cls.cast(new com_dodopizza_persistence_entity_cart_EncryptionDataEntityRealmProxy());
            }
            if (cls.equals(DiscountEntity.class)) {
                return cls.cast(new com_dodopizza_persistence_entity_cart_DiscountEntityRealmProxy());
            }
            if (cls.equals(DataPromoCodeEntity.class)) {
                return cls.cast(new com_dodopizza_persistence_entity_cart_DataPromoCodeEntityRealmProxy());
            }
            if (cls.equals(DataPaymentEntity.class)) {
                return cls.cast(new com_dodopizza_persistence_entity_cart_DataPaymentEntityRealmProxy());
            }
            if (cls.equals(CustomizationEntity.class)) {
                return cls.cast(new com_dodopizza_persistence_entity_cart_CustomizationEntityRealmProxy());
            }
            if (cls.equals(CartProductEntity.class)) {
                return cls.cast(new com_dodopizza_persistence_entity_cart_CartProductEntityRealmProxy());
            }
            if (cls.equals(CartItemEntity.class)) {
                return cls.cast(new com_dodopizza_persistence_entity_cart_CartItemEntityRealmProxy());
            }
            if (cls.equals(CartEntity.class)) {
                return cls.cast(new com_dodopizza_persistence_entity_cart_CartEntityRealmProxy());
            }
            if (cls.equals(CartComboSlotProductEntity.class)) {
                return cls.cast(new com_dodopizza_persistence_entity_cart_CartComboSlotProductEntityRealmProxy());
            }
            if (cls.equals(AppliedInfoEntity.class)) {
                return cls.cast(new com_dodopizza_persistence_entity_cart_AppliedInfoEntityRealmProxy());
            }
            if (cls.equals(AppliedBonusActionEntity.class)) {
                return cls.cast(new com_dodopizza_persistence_entity_cart_AppliedBonusActionEntityRealmProxy());
            }
            if (cls.equals(AddedIngredientEntity.class)) {
                return cls.cast(new com_dodopizza_persistence_entity_cart_AddedIngredientEntityRealmProxy());
            }
            if (cls.equals(DeliveryAddressEntity.class)) {
                return cls.cast(new com_dodopizza_persistence_entity_address_DeliveryAddressEntityRealmProxy());
            }
            if (cls.equals(AddressEntity.class)) {
                return cls.cast(new com_dodopizza_persistence_entity_address_AddressEntityRealmProxy());
            }
            if (cls.equals(UpsaleStateEntity.class)) {
                return cls.cast(new com_dodopizza_persistence_entity_UpsaleStateEntityRealmProxy());
            }
            if (cls.equals(StateWarningEntity.class)) {
                return cls.cast(new com_dodopizza_persistence_entity_StateWarningEntityRealmProxy());
            }
            if (cls.equals(StateErrorEntity.class)) {
                return cls.cast(new com_dodopizza_persistence_entity_StateErrorEntityRealmProxy());
            }
            if (cls.equals(ServerDeltaTimeEntity.class)) {
                return cls.cast(new com_dodopizza_persistence_entity_ServerDeltaTimeEntityRealmProxy());
            }
            if (cls.equals(RealmString.class)) {
                return cls.cast(new com_dodopizza_persistence_entity_RealmStringRealmProxy());
            }
            if (cls.equals(RealmInteger.class)) {
                return cls.cast(new com_dodopizza_persistence_entity_RealmIntegerRealmProxy());
            }
            if (cls.equals(PaymentEntity.class)) {
                return cls.cast(new com_dodopizza_persistence_entity_PaymentEntityRealmProxy());
            }
            if (cls.equals(PackageWidgetDataEntity.class)) {
                return cls.cast(new com_dodopizza_persistence_entity_PackageWidgetDataEntityRealmProxy());
            }
            if (cls.equals(PackageInfoEntity.class)) {
                return cls.cast(new com_dodopizza_persistence_entity_PackageInfoEntityRealmProxy());
            }
            if (cls.equals(MoneyType.class)) {
                return cls.cast(new com_dodopizza_persistence_entity_MoneyTypeRealmProxy());
            }
            if (cls.equals(ImageEntity.class)) {
                return cls.cast(new com_dodopizza_persistence_entity_ImageEntityRealmProxy());
            }
            if (cls.equals(DeliveryFeeLevelsEntity.class)) {
                return cls.cast(new com_dodopizza_persistence_entity_DeliveryFeeLevelsEntityRealmProxy());
            }
            if (cls.equals(CountryEntity.class)) {
                return cls.cast(new com_dodopizza_persistence_entity_CountryEntityRealmProxy());
            }
            if (cls.equals(ClientDeliveryFeeLevelEntity.class)) {
                return cls.cast(new com_dodopizza_persistence_entity_ClientDeliveryFeeLevelEntityRealmProxy());
            }
            if (cls.equals(CacheTimestampEntity.class)) {
                return cls.cast(new com_dodopizza_persistence_entity_CacheTimestampEntityRealmProxy());
            }
            if (cls.equals(BonusActionEntity.class)) {
                return cls.cast(new com_dodopizza_persistence_entity_BonusActionEntityRealmProxy());
            }
            throw t89.i(cls);
        } finally {
            cVar.a();
        }
    }

    @Override // defpackage.t89
    public boolean t() {
        return true;
    }

    @Override // defpackage.t89
    public <E extends o89> void u(d0 d0Var, E e, E e2, Map<o89, r89> map, Set<ex4> set) {
        Class<? super Object> superclass = e2.getClass().getSuperclass();
        if (!superclass.equals(PrizotekaLevelEntity.class)) {
            if (!superclass.equals(PrizotekaEntity.class)) {
                if (!superclass.equals(UpsellProductsEntity.class)) {
                    if (!superclass.equals(PersonalizationEntity.class)) {
                        if (!superclass.equals(PersonalCategoryEntity.class)) {
                            if (!superclass.equals(MenuPersonalPriceInfoEntity.class)) {
                                if (!superclass.equals(MapEntry.class)) {
                                    if (!superclass.equals(DynamicDeliveryEntity.class)) {
                                        if (!superclass.equals(DeliveryExperimentEntity.class)) {
                                            if (!superclass.equals(PaymentMethodEntity.class)) {
                                                if (!superclass.equals(GooglePayInitDataEntity.class)) {
                                                    if (!superclass.equals(CardEntity.class)) {
                                                        if (!superclass.equals(RatingPhotoEntity.class)) {
                                                            if (!superclass.equals(RatingEntity.class)) {
                                                                if (!superclass.equals(ToppingEntity.class)) {
                                                                    if (!superclass.equals(SizeGroupEntity.class)) {
                                                                        if (!superclass.equals(ShoppingInfoEntity.class)) {
                                                                            if (!superclass.equals(PromoActionEntity.class)) {
                                                                                if (!superclass.equals(ProductIngredientEntity.class)) {
                                                                                    if (!superclass.equals(ProductEntity.class)) {
                                                                                        if (!superclass.equals(PersonalPriceEntity.class)) {
                                                                                            if (!superclass.equals(MenuItemEntity.class)) {
                                                                                                if (!superclass.equals(DoughTypeEntity.class)) {
                                                                                                    if (!superclass.equals(ComboTemplateSlotProductEntity.class)) {
                                                                                                        if (!superclass.equals(ComboTemplateSlotEntity.class)) {
                                                                                                            if (!superclass.equals(SocialNetworkInfoEntity.class)) {
                                                                                                                if (!superclass.equals(OrderTypeDiscountEntity.class)) {
                                                                                                                    if (!superclass.equals(LocalityInfoEntity.class)) {
                                                                                                                        if (!superclass.equals(LocalityEntity.class)) {
                                                                                                                            if (!superclass.equals(LegalInformationEntity.class)) {
                                                                                                                                if (!superclass.equals(FeatureEntity.class)) {
                                                                                                                                    if (!superclass.equals(DeliveryLocationEntity.class)) {
                                                                                                                                        if (!superclass.equals(CoordinatesEntity.class)) {
                                                                                                                                            if (!superclass.equals(ClientDeliveryLocationProfileEntity.class)) {
                                                                                                                                                if (!superclass.equals(ClientDeliveryLocationEntity.class)) {
                                                                                                                                                    if (!superclass.equals(AddressAdditionEntity.class)) {
                                                                                                                                                        if (!superclass.equals(CartQueueItemEntity.class)) {
                                                                                                                                                            if (!superclass.equals(UpsaleSizeDetailsEntity.class)) {
                                                                                                                                                                if (!superclass.equals(UpsaleProductEntity.class)) {
                                                                                                                                                                    if (!superclass.equals(UpsaleMeasureInfoEntity.class)) {
                                                                                                                                                                        if (!superclass.equals(UpsaleEntity.class)) {
                                                                                                                                                                            if (!superclass.equals(StateEntity.class)) {
                                                                                                                                                                                if (!superclass.equals(ShoppingCartEntity.class)) {
                                                                                                                                                                                    if (!superclass.equals(RemovedIngredientEntity.class)) {
                                                                                                                                                                                        if (!superclass.equals(PriceEntity.class)) {
                                                                                                                                                                                            if (!superclass.equals(PizzaHalvesEntity.class)) {
                                                                                                                                                                                                if (!superclass.equals(PersonalPromoActionEntity.class)) {
                                                                                                                                                                                                    if (!superclass.equals(PersonalPriceDiscountEntity.class)) {
                                                                                                                                                                                                        if (!superclass.equals(EncryptionDataEntity.class)) {
                                                                                                                                                                                                            if (!superclass.equals(DiscountEntity.class)) {
                                                                                                                                                                                                                if (!superclass.equals(DataPromoCodeEntity.class)) {
                                                                                                                                                                                                                    if (!superclass.equals(DataPaymentEntity.class)) {
                                                                                                                                                                                                                        if (!superclass.equals(CustomizationEntity.class)) {
                                                                                                                                                                                                                            if (!superclass.equals(CartProductEntity.class)) {
                                                                                                                                                                                                                                if (!superclass.equals(CartItemEntity.class)) {
                                                                                                                                                                                                                                    if (!superclass.equals(CartEntity.class)) {
                                                                                                                                                                                                                                        if (!superclass.equals(CartComboSlotProductEntity.class)) {
                                                                                                                                                                                                                                            if (!superclass.equals(AppliedInfoEntity.class)) {
                                                                                                                                                                                                                                                if (!superclass.equals(AppliedBonusActionEntity.class)) {
                                                                                                                                                                                                                                                    if (!superclass.equals(AddedIngredientEntity.class)) {
                                                                                                                                                                                                                                                        if (!superclass.equals(DeliveryAddressEntity.class)) {
                                                                                                                                                                                                                                                            if (!superclass.equals(AddressEntity.class)) {
                                                                                                                                                                                                                                                                if (!superclass.equals(UpsaleStateEntity.class)) {
                                                                                                                                                                                                                                                                    if (!superclass.equals(StateWarningEntity.class)) {
                                                                                                                                                                                                                                                                        if (!superclass.equals(StateErrorEntity.class)) {
                                                                                                                                                                                                                                                                            if (!superclass.equals(ServerDeltaTimeEntity.class)) {
                                                                                                                                                                                                                                                                                if (!superclass.equals(RealmString.class)) {
                                                                                                                                                                                                                                                                                    if (!superclass.equals(RealmInteger.class)) {
                                                                                                                                                                                                                                                                                        if (!superclass.equals(PaymentEntity.class)) {
                                                                                                                                                                                                                                                                                            if (!superclass.equals(PackageWidgetDataEntity.class)) {
                                                                                                                                                                                                                                                                                                if (!superclass.equals(PackageInfoEntity.class)) {
                                                                                                                                                                                                                                                                                                    if (!superclass.equals(MoneyType.class)) {
                                                                                                                                                                                                                                                                                                        if (!superclass.equals(ImageEntity.class)) {
                                                                                                                                                                                                                                                                                                            if (!superclass.equals(DeliveryFeeLevelsEntity.class)) {
                                                                                                                                                                                                                                                                                                                if (!superclass.equals(CountryEntity.class)) {
                                                                                                                                                                                                                                                                                                                    if (!superclass.equals(ClientDeliveryFeeLevelEntity.class)) {
                                                                                                                                                                                                                                                                                                                        if (!superclass.equals(CacheTimestampEntity.class)) {
                                                                                                                                                                                                                                                                                                                            if (superclass.equals(BonusActionEntity.class)) {
                                                                                                                                                                                                                                                                                                                                throw t89.l("com.dodopizza.persistence.entity.BonusActionEntity");
                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                            throw t89.i(superclass);
                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                        throw t89.l("com.dodopizza.persistence.entity.CacheTimestampEntity");
                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                    throw t89.l("com.dodopizza.persistence.entity.ClientDeliveryFeeLevelEntity");
                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                throw t89.l("com.dodopizza.persistence.entity.CountryEntity");
                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                            throw t89.l("com.dodopizza.persistence.entity.DeliveryFeeLevelsEntity");
                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                        throw t89.l("com.dodopizza.persistence.entity.ImageEntity");
                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                    throw t89.l("com.dodopizza.persistence.entity.MoneyType");
                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                throw t89.l("com.dodopizza.persistence.entity.PackageInfoEntity");
                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                            throw t89.l("com.dodopizza.persistence.entity.PackageWidgetDataEntity");
                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                        throw t89.l("com.dodopizza.persistence.entity.PaymentEntity");
                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                    throw t89.l("com.dodopizza.persistence.entity.RealmInteger");
                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                throw t89.l("com.dodopizza.persistence.entity.RealmString");
                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                            throw t89.l("com.dodopizza.persistence.entity.ServerDeltaTimeEntity");
                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                        throw t89.l("com.dodopizza.persistence.entity.StateErrorEntity");
                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                    throw t89.l("com.dodopizza.persistence.entity.StateWarningEntity");
                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                throw t89.l("com.dodopizza.persistence.entity.UpsaleStateEntity");
                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                            throw t89.l("com.dodopizza.persistence.entity.address.AddressEntity");
                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                        throw t89.l("com.dodopizza.persistence.entity.address.DeliveryAddressEntity");
                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                    throw t89.l("com.dodopizza.persistence.entity.cart.AddedIngredientEntity");
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                throw t89.l("com.dodopizza.persistence.entity.cart.AppliedBonusActionEntity");
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                            throw t89.l("com.dodopizza.persistence.entity.cart.AppliedInfoEntity");
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                        throw t89.l("com.dodopizza.persistence.entity.cart.CartComboSlotProductEntity");
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                    throw t89.l("com.dodopizza.persistence.entity.cart.CartEntity");
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                throw t89.l("com.dodopizza.persistence.entity.cart.CartItemEntity");
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            throw t89.l("com.dodopizza.persistence.entity.cart.CartProductEntity");
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                        throw t89.l("com.dodopizza.persistence.entity.cart.CustomizationEntity");
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    throw t89.l("com.dodopizza.persistence.entity.cart.DataPaymentEntity");
                                                                                                                                                                                                                }
                                                                                                                                                                                                                throw t89.l("com.dodopizza.persistence.entity.cart.DataPromoCodeEntity");
                                                                                                                                                                                                            }
                                                                                                                                                                                                            throw t89.l("com.dodopizza.persistence.entity.cart.DiscountEntity");
                                                                                                                                                                                                        }
                                                                                                                                                                                                        throw t89.l("com.dodopizza.persistence.entity.cart.EncryptionDataEntity");
                                                                                                                                                                                                    }
                                                                                                                                                                                                    throw t89.l("com.dodopizza.persistence.entity.cart.PersonalPriceDiscountEntity");
                                                                                                                                                                                                }
                                                                                                                                                                                                throw t89.l("com.dodopizza.persistence.entity.cart.PersonalPromoActionEntity");
                                                                                                                                                                                            }
                                                                                                                                                                                            throw t89.l("com.dodopizza.persistence.entity.cart.PizzaHalvesEntity");
                                                                                                                                                                                        }
                                                                                                                                                                                        throw t89.l("com.dodopizza.persistence.entity.cart.PriceEntity");
                                                                                                                                                                                    }
                                                                                                                                                                                    throw t89.l("com.dodopizza.persistence.entity.cart.RemovedIngredientEntity");
                                                                                                                                                                                }
                                                                                                                                                                                throw t89.l("com.dodopizza.persistence.entity.cart.ShoppingCartEntity");
                                                                                                                                                                            }
                                                                                                                                                                            throw t89.l("com.dodopizza.persistence.entity.cart.StateEntity");
                                                                                                                                                                        }
                                                                                                                                                                        throw t89.l("com.dodopizza.persistence.entity.cart.UpsaleEntity");
                                                                                                                                                                    }
                                                                                                                                                                    throw t89.l("com.dodopizza.persistence.entity.cart.UpsaleMeasureInfoEntity");
                                                                                                                                                                }
                                                                                                                                                                throw t89.l("com.dodopizza.persistence.entity.cart.UpsaleProductEntity");
                                                                                                                                                            }
                                                                                                                                                            throw t89.l("com.dodopizza.persistence.entity.cart.UpsaleSizeDetailsEntity");
                                                                                                                                                        }
                                                                                                                                                        throw t89.l("com.dodopizza.persistence.entity.cart.queue.CartQueueItemEntity");
                                                                                                                                                    }
                                                                                                                                                    throw t89.l("com.dodopizza.persistence.entity.deliverylocation.AddressAdditionEntity");
                                                                                                                                                }
                                                                                                                                                throw t89.l("com.dodopizza.persistence.entity.deliverylocation.ClientDeliveryLocationEntity");
                                                                                                                                            }
                                                                                                                                            throw t89.l("com.dodopizza.persistence.entity.deliverylocation.ClientDeliveryLocationProfileEntity");
                                                                                                                                        }
                                                                                                                                        throw t89.l("com.dodopizza.persistence.entity.deliverylocation.CoordinatesEntity");
                                                                                                                                    }
                                                                                                                                    throw t89.l("com.dodopizza.persistence.entity.deliverylocation.DeliveryLocationEntity");
                                                                                                                                }
                                                                                                                                throw t89.l("com.dodopizza.persistence.entity.locality.FeatureEntity");
                                                                                                                            }
                                                                                                                            throw t89.l("com.dodopizza.persistence.entity.locality.LegalInformationEntity");
                                                                                                                        }
                                                                                                                        throw t89.l("com.dodopizza.persistence.entity.locality.LocalityEntity");
                                                                                                                    }
                                                                                                                    throw t89.l("com.dodopizza.persistence.entity.locality.LocalityInfoEntity");
                                                                                                                }
                                                                                                                throw t89.l("com.dodopizza.persistence.entity.locality.OrderTypeDiscountEntity");
                                                                                                            }
                                                                                                            throw t89.l("com.dodopizza.persistence.entity.locality.SocialNetworkInfoEntity");
                                                                                                        }
                                                                                                        throw t89.l("com.dodopizza.persistence.entity.menu.ComboTemplateSlotEntity");
                                                                                                    }
                                                                                                    throw t89.l("com.dodopizza.persistence.entity.menu.ComboTemplateSlotProductEntity");
                                                                                                }
                                                                                                throw t89.l("com.dodopizza.persistence.entity.menu.DoughTypeEntity");
                                                                                            }
                                                                                            throw t89.l("com.dodopizza.persistence.entity.menu.MenuItemEntity");
                                                                                        }
                                                                                        throw t89.l("com.dodopizza.persistence.entity.menu.PersonalPriceEntity");
                                                                                    }
                                                                                    throw t89.l("com.dodopizza.persistence.entity.menu.ProductEntity");
                                                                                }
                                                                                throw t89.l("com.dodopizza.persistence.entity.menu.ProductIngredientEntity");
                                                                            }
                                                                            throw t89.l("com.dodopizza.persistence.entity.menu.PromoActionEntity");
                                                                        }
                                                                        throw t89.l("com.dodopizza.persistence.entity.menu.ShoppingInfoEntity");
                                                                    }
                                                                    throw t89.l("com.dodopizza.persistence.entity.menu.SizeGroupEntity");
                                                                }
                                                                throw t89.l("com.dodopizza.persistence.entity.menu.ToppingEntity");
                                                            }
                                                            throw t89.l("com.dodopizza.persistence.entity.orderrating.RatingEntity");
                                                        }
                                                        throw t89.l("com.dodopizza.persistence.entity.orderrating.RatingPhotoEntity");
                                                    }
                                                    throw t89.l("com.dodopizza.persistence.entity.payment.CardEntity");
                                                }
                                                throw t89.l("com.dodopizza.persistence.entity.payment.GooglePayInitDataEntity");
                                            }
                                            throw t89.l("com.dodopizza.persistence.entity.payment.PaymentMethodEntity");
                                        }
                                        throw t89.l("com.dodopizza.persistence.entity.personalization.DeliveryExperimentEntity");
                                    }
                                    throw t89.l("com.dodopizza.persistence.entity.personalization.DynamicDeliveryEntity");
                                }
                                throw t89.l("com.dodopizza.persistence.entity.personalization.MapEntry");
                            }
                            throw t89.l("com.dodopizza.persistence.entity.personalization.MenuPersonalPriceInfoEntity");
                        }
                        throw t89.l("com.dodopizza.persistence.entity.personalization.PersonalCategoryEntity");
                    }
                    throw t89.l("com.dodopizza.persistence.entity.personalization.PersonalizationEntity");
                }
                throw t89.l("com.dodopizza.persistence.entity.personalization.UpsellProductsEntity");
            }
            throw t89.l("com.dodopizza.persistence.entity.prizoteka.PrizotekaEntity");
        }
        throw t89.l("com.dodopizza.persistence.entity.prizoteka.PrizotekaLevelEntity");
    }
}
