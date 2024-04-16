package com.dodopizza.persistence.entity.menu;

import com.dodopizza.persistence.entity.MoneyType;
import io.realm.n0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: ShoppingInfoEntity.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0016\u0018\u0000 #2\u00020\u00012\u00020\u0002:\u0001#B?\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0003¢\u0006\u0004\b!\u0010\"R$\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR$\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0011\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0005\u001a\u0004\b\u0012\u0010\u0007\"\u0004\b\u0013\u0010\tR$\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\u001b\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0005\u001a\u0004\b\u001c\u0010\u0007\"\u0004\b\u001d\u0010\tR$\u0010\u001e\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0005\u001a\u0004\b\u001f\u0010\u0007\"\u0004\b \u0010\t¨\u0006$"}, d2 = {"Lcom/dodopizza/persistence/entity/menu/ShoppingInfoEntity;", "Lyi3;", "Lio/realm/n0;", "", ShoppingInfoEntity.FIELD_EXTERNAL_ID, "Ljava/lang/String;", "getExternalId", "()Ljava/lang/String;", "setExternalId", "(Ljava/lang/String;)V", "Lcom/dodopizza/persistence/entity/MoneyType;", "price", "Lcom/dodopizza/persistence/entity/MoneyType;", "getPrice", "()Lcom/dodopizza/persistence/entity/MoneyType;", "setPrice", "(Lcom/dodopizza/persistence/entity/MoneyType;)V", ShoppingInfoEntity.FIELD_PRODUCT_ID, "getProductId", "setProductId", "Lcom/dodopizza/persistence/entity/menu/PersonalPriceEntity;", "personalPrice", "Lcom/dodopizza/persistence/entity/menu/PersonalPriceEntity;", "getPersonalPrice", "()Lcom/dodopizza/persistence/entity/menu/PersonalPriceEntity;", "setPersonalPrice", "(Lcom/dodopizza/persistence/entity/menu/PersonalPriceEntity;)V", ShoppingInfoEntity.FIELD_SHOPPING_ID, "getShoppingId", "setShoppingId", "id", "getId", "setId", "<init>", "(Ljava/lang/String;Lcom/dodopizza/persistence/entity/MoneyType;Ljava/lang/String;Lcom/dodopizza/persistence/entity/menu/PersonalPriceEntity;Ljava/lang/String;)V", "Companion", "persistence_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public class ShoppingInfoEntity extends n0 implements yi3, ygc {
    public static final Companion Companion = new Companion(null);
    public static final String FIELD_EXTERNAL_ID = "externalId";
    public static final String FIELD_PRODUCT_ID = "productId";
    public static final String FIELD_SHOPPING_ID = "shoppingId";
    private String externalId;
    private String id;
    private PersonalPriceEntity personalPrice;
    private MoneyType price;
    private String productId;
    private String shoppingId;

    /* compiled from: ShoppingInfoEntity.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/dodopizza/persistence/entity/menu/ShoppingInfoEntity$Companion;", "", "()V", "FIELD_EXTERNAL_ID", "", "FIELD_PRODUCT_ID", "FIELD_SHOPPING_ID", "persistence_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public ShoppingInfoEntity() {
        this(null, null, null, null, null, 31, null);
        if (this instanceof r89) {
            ((r89) this).b();
        }
    }

    public String getExternalId() {
        return realmGet$externalId();
    }

    @Override // defpackage.yi3
    public String getId() {
        return realmGet$id();
    }

    public PersonalPriceEntity getPersonalPrice() {
        return realmGet$personalPrice();
    }

    public MoneyType getPrice() {
        return realmGet$price();
    }

    public String getProductId() {
        return realmGet$productId();
    }

    public String getShoppingId() {
        return realmGet$shoppingId();
    }

    @Override // defpackage.ygc
    public String realmGet$externalId() {
        return this.externalId;
    }

    @Override // defpackage.ygc
    public String realmGet$id() {
        return this.id;
    }

    @Override // defpackage.ygc
    public PersonalPriceEntity realmGet$personalPrice() {
        return this.personalPrice;
    }

    @Override // defpackage.ygc
    public MoneyType realmGet$price() {
        return this.price;
    }

    @Override // defpackage.ygc
    public String realmGet$productId() {
        return this.productId;
    }

    @Override // defpackage.ygc
    public String realmGet$shoppingId() {
        return this.shoppingId;
    }

    @Override // defpackage.ygc
    public void realmSet$externalId(String str) {
        this.externalId = str;
    }

    @Override // defpackage.ygc
    public void realmSet$id(String str) {
        this.id = str;
    }

    @Override // defpackage.ygc
    public void realmSet$personalPrice(PersonalPriceEntity personalPriceEntity) {
        this.personalPrice = personalPriceEntity;
    }

    @Override // defpackage.ygc
    public void realmSet$price(MoneyType moneyType) {
        this.price = moneyType;
    }

    @Override // defpackage.ygc
    public void realmSet$productId(String str) {
        this.productId = str;
    }

    @Override // defpackage.ygc
    public void realmSet$shoppingId(String str) {
        this.shoppingId = str;
    }

    public void setExternalId(String str) {
        realmSet$externalId(str);
    }

    @Override // defpackage.yi3
    public void setId(String str) {
        realmSet$id(str);
    }

    public void setPersonalPrice(PersonalPriceEntity personalPriceEntity) {
        realmSet$personalPrice(personalPriceEntity);
    }

    public void setPrice(MoneyType moneyType) {
        realmSet$price(moneyType);
    }

    public void setProductId(String str) {
        z65.h(str, "<set-?>");
        realmSet$productId(str);
    }

    public void setShoppingId(String str) {
        z65.h(str, "<set-?>");
        realmSet$shoppingId(str);
    }

    public /* synthetic */ ShoppingInfoEntity(String str, MoneyType moneyType, String str2, PersonalPriceEntity personalPriceEntity, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : moneyType, (i & 4) != 0 ? "" : str2, (i & 8) == 0 ? personalPriceEntity : null, (i & 16) != 0 ? "" : str3);
        if (this instanceof r89) {
            ((r89) this).b();
        }
    }

    public ShoppingInfoEntity(String str, MoneyType moneyType, String str2, PersonalPriceEntity personalPriceEntity, String str3) {
        z65.h(str2, FIELD_PRODUCT_ID);
        z65.h(str3, FIELD_SHOPPING_ID);
        if (this instanceof r89) {
            ((r89) this).b();
        }
        realmSet$externalId(str);
        realmSet$price(moneyType);
        realmSet$productId(str2);
        realmSet$personalPrice(personalPriceEntity);
        realmSet$shoppingId(str3);
    }
}
