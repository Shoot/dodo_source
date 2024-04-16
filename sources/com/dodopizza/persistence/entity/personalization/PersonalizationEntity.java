package com.dodopizza.persistence.entity.personalization;

import io.realm.k0;
import io.realm.n0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: PersonalizationEntity.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\t\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002BQ\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\b\b\u0002\u0010!\u001a\u00020 \u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'¢\u0006\u0004\b5\u00106R(\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR$\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R$\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010!\u001a\u00020 8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R$\u0010(\u001a\u0004\u0018\u00010'8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R$\u0010/\u001a\u0004\u0018\u00010.8\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104¨\u00067"}, d2 = {"Lcom/dodopizza/persistence/entity/personalization/PersonalizationEntity;", "Lyi3;", "Lio/realm/n0;", "Lio/realm/k0;", "Lcom/dodopizza/persistence/entity/personalization/MenuPersonalPriceInfoEntity;", "menuPersonalPricesInfo", "Lio/realm/k0;", "getMenuPersonalPricesInfo", "()Lio/realm/k0;", "setMenuPersonalPricesInfo", "(Lio/realm/k0;)V", "Lcom/dodopizza/persistence/entity/personalization/PersonalCategoryEntity;", "personalCategory", "Lcom/dodopizza/persistence/entity/personalization/PersonalCategoryEntity;", "getPersonalCategory", "()Lcom/dodopizza/persistence/entity/personalization/PersonalCategoryEntity;", "setPersonalCategory", "(Lcom/dodopizza/persistence/entity/personalization/PersonalCategoryEntity;)V", "Lcom/dodopizza/persistence/entity/personalization/UpsellProductsEntity;", "upsellProducts", "Lcom/dodopizza/persistence/entity/personalization/UpsellProductsEntity;", "getUpsellProducts", "()Lcom/dodopizza/persistence/entity/personalization/UpsellProductsEntity;", "setUpsellProducts", "(Lcom/dodopizza/persistence/entity/personalization/UpsellProductsEntity;)V", "Lcom/dodopizza/persistence/entity/personalization/DeliveryExperimentEntity;", "deliveryExperimentInfo", "Lcom/dodopizza/persistence/entity/personalization/DeliveryExperimentEntity;", "getDeliveryExperimentInfo", "()Lcom/dodopizza/persistence/entity/personalization/DeliveryExperimentEntity;", "setDeliveryExperimentInfo", "(Lcom/dodopizza/persistence/entity/personalization/DeliveryExperimentEntity;)V", "", "expiredTime", "J", "getExpiredTime", "()J", "setExpiredTime", "(J)V", "Lcom/dodopizza/persistence/entity/personalization/DynamicDeliveryEntity;", "dynamicDelivery", "Lcom/dodopizza/persistence/entity/personalization/DynamicDeliveryEntity;", "getDynamicDelivery", "()Lcom/dodopizza/persistence/entity/personalization/DynamicDeliveryEntity;", "setDynamicDelivery", "(Lcom/dodopizza/persistence/entity/personalization/DynamicDeliveryEntity;)V", "", "id", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "<init>", "(Lio/realm/k0;Lcom/dodopizza/persistence/entity/personalization/PersonalCategoryEntity;Lcom/dodopizza/persistence/entity/personalization/UpsellProductsEntity;Lcom/dodopizza/persistence/entity/personalization/DeliveryExperimentEntity;JLcom/dodopizza/persistence/entity/personalization/DynamicDeliveryEntity;)V", "persistence_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public class PersonalizationEntity extends n0 implements yi3, lhc {
    private DeliveryExperimentEntity deliveryExperimentInfo;
    private DynamicDeliveryEntity dynamicDelivery;
    private long expiredTime;
    private String id;
    private k0<MenuPersonalPriceInfoEntity> menuPersonalPricesInfo;
    private PersonalCategoryEntity personalCategory;
    private UpsellProductsEntity upsellProducts;

    public PersonalizationEntity() {
        this(null, null, null, null, 0L, null, 63, null);
        if (this instanceof r89) {
            ((r89) this).b();
        }
    }

    public DeliveryExperimentEntity getDeliveryExperimentInfo() {
        return realmGet$deliveryExperimentInfo();
    }

    public DynamicDeliveryEntity getDynamicDelivery() {
        return realmGet$dynamicDelivery();
    }

    public long getExpiredTime() {
        return realmGet$expiredTime();
    }

    @Override // defpackage.yi3
    public String getId() {
        return realmGet$id();
    }

    public k0<MenuPersonalPriceInfoEntity> getMenuPersonalPricesInfo() {
        return realmGet$menuPersonalPricesInfo();
    }

    public PersonalCategoryEntity getPersonalCategory() {
        return realmGet$personalCategory();
    }

    public UpsellProductsEntity getUpsellProducts() {
        return realmGet$upsellProducts();
    }

    @Override // defpackage.lhc
    public DeliveryExperimentEntity realmGet$deliveryExperimentInfo() {
        return this.deliveryExperimentInfo;
    }

    @Override // defpackage.lhc
    public DynamicDeliveryEntity realmGet$dynamicDelivery() {
        return this.dynamicDelivery;
    }

    @Override // defpackage.lhc
    public long realmGet$expiredTime() {
        return this.expiredTime;
    }

    @Override // defpackage.lhc
    public String realmGet$id() {
        return this.id;
    }

    @Override // defpackage.lhc
    public k0 realmGet$menuPersonalPricesInfo() {
        return this.menuPersonalPricesInfo;
    }

    @Override // defpackage.lhc
    public PersonalCategoryEntity realmGet$personalCategory() {
        return this.personalCategory;
    }

    @Override // defpackage.lhc
    public UpsellProductsEntity realmGet$upsellProducts() {
        return this.upsellProducts;
    }

    @Override // defpackage.lhc
    public void realmSet$deliveryExperimentInfo(DeliveryExperimentEntity deliveryExperimentEntity) {
        this.deliveryExperimentInfo = deliveryExperimentEntity;
    }

    @Override // defpackage.lhc
    public void realmSet$dynamicDelivery(DynamicDeliveryEntity dynamicDeliveryEntity) {
        this.dynamicDelivery = dynamicDeliveryEntity;
    }

    @Override // defpackage.lhc
    public void realmSet$expiredTime(long j) {
        this.expiredTime = j;
    }

    @Override // defpackage.lhc
    public void realmSet$id(String str) {
        this.id = str;
    }

    @Override // defpackage.lhc
    public void realmSet$menuPersonalPricesInfo(k0 k0Var) {
        this.menuPersonalPricesInfo = k0Var;
    }

    @Override // defpackage.lhc
    public void realmSet$personalCategory(PersonalCategoryEntity personalCategoryEntity) {
        this.personalCategory = personalCategoryEntity;
    }

    @Override // defpackage.lhc
    public void realmSet$upsellProducts(UpsellProductsEntity upsellProductsEntity) {
        this.upsellProducts = upsellProductsEntity;
    }

    public void setDeliveryExperimentInfo(DeliveryExperimentEntity deliveryExperimentEntity) {
        realmSet$deliveryExperimentInfo(deliveryExperimentEntity);
    }

    public void setDynamicDelivery(DynamicDeliveryEntity dynamicDeliveryEntity) {
        realmSet$dynamicDelivery(dynamicDeliveryEntity);
    }

    public void setExpiredTime(long j) {
        realmSet$expiredTime(j);
    }

    @Override // defpackage.yi3
    public void setId(String str) {
        realmSet$id(str);
    }

    public void setMenuPersonalPricesInfo(k0<MenuPersonalPriceInfoEntity> k0Var) {
        z65.h(k0Var, "<set-?>");
        realmSet$menuPersonalPricesInfo(k0Var);
    }

    public void setPersonalCategory(PersonalCategoryEntity personalCategoryEntity) {
        realmSet$personalCategory(personalCategoryEntity);
    }

    public void setUpsellProducts(UpsellProductsEntity upsellProductsEntity) {
        realmSet$upsellProducts(upsellProductsEntity);
    }

    public /* synthetic */ PersonalizationEntity(k0 k0Var, PersonalCategoryEntity personalCategoryEntity, UpsellProductsEntity upsellProductsEntity, DeliveryExperimentEntity deliveryExperimentEntity, long j, DynamicDeliveryEntity dynamicDeliveryEntity, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new k0() : k0Var, (i & 2) != 0 ? null : personalCategoryEntity, (i & 4) != 0 ? new UpsellProductsEntity(null, 1, null) : upsellProductsEntity, (i & 8) != 0 ? null : deliveryExperimentEntity, (i & 16) != 0 ? 0L : j, (i & 32) == 0 ? dynamicDeliveryEntity : null);
        if (this instanceof r89) {
            ((r89) this).b();
        }
    }

    public PersonalizationEntity(k0<MenuPersonalPriceInfoEntity> k0Var, PersonalCategoryEntity personalCategoryEntity, UpsellProductsEntity upsellProductsEntity, DeliveryExperimentEntity deliveryExperimentEntity, long j, DynamicDeliveryEntity dynamicDeliveryEntity) {
        z65.h(k0Var, "menuPersonalPricesInfo");
        if (this instanceof r89) {
            ((r89) this).b();
        }
        realmSet$menuPersonalPricesInfo(k0Var);
        realmSet$personalCategory(personalCategoryEntity);
        realmSet$upsellProducts(upsellProductsEntity);
        realmSet$deliveryExperimentInfo(deliveryExperimentEntity);
        realmSet$expiredTime(j);
        realmSet$dynamicDelivery(dynamicDeliveryEntity);
    }
}
