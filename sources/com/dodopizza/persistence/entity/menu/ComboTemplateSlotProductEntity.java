package com.dodopizza.persistence.entity.menu;

import com.dodopizza.persistence.entity.MoneyType;
import io.realm.n0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: ComboTemplateSlotProductEntity.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002BA\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b!\u0010\"R$\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR$\u0010\n\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0005\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\"\u0010\u000e\u001a\u00020\r8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R$\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010\u001b\u001a\u0004\u0018\u00010\u00148\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001aR$\u0010\u001e\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0005\u001a\u0004\b\u001f\u0010\u0007\"\u0004\b \u0010\t¨\u0006#"}, d2 = {"Lcom/dodopizza/persistence/entity/menu/ComboTemplateSlotProductEntity;", "Lyi3;", "Lio/realm/n0;", "", ShoppingInfoEntity.FIELD_EXTERNAL_ID, "Ljava/lang/String;", "getExternalId", "()Ljava/lang/String;", "setExternalId", "(Ljava/lang/String;)V", ShoppingInfoEntity.FIELD_PRODUCT_ID, "getProductId", "setProductId", "", "priority", "I", "getPriority", "()I", "setPriority", "(I)V", "Lcom/dodopizza/persistence/entity/MoneyType;", "price", "Lcom/dodopizza/persistence/entity/MoneyType;", "getPrice", "()Lcom/dodopizza/persistence/entity/MoneyType;", "setPrice", "(Lcom/dodopizza/persistence/entity/MoneyType;)V", "extraPrice", "getExtraPrice", "setExtraPrice", "id", "getId", "setId", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILcom/dodopizza/persistence/entity/MoneyType;Lcom/dodopizza/persistence/entity/MoneyType;)V", "persistence_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public class ComboTemplateSlotProductEntity extends n0 implements yi3, rgc {
    private String externalId;
    private MoneyType extraPrice;
    private String id;
    private MoneyType price;
    private int priority;
    private String productId;

    public ComboTemplateSlotProductEntity() {
        this(null, null, 0, null, null, 31, null);
        if (this instanceof r89) {
            ((r89) this).b();
        }
    }

    public String getExternalId() {
        return realmGet$externalId();
    }

    public MoneyType getExtraPrice() {
        return realmGet$extraPrice();
    }

    @Override // defpackage.yi3
    public String getId() {
        return realmGet$id();
    }

    public MoneyType getPrice() {
        return realmGet$price();
    }

    public int getPriority() {
        return realmGet$priority();
    }

    public String getProductId() {
        return realmGet$productId();
    }

    @Override // defpackage.rgc
    public String realmGet$externalId() {
        return this.externalId;
    }

    @Override // defpackage.rgc
    public MoneyType realmGet$extraPrice() {
        return this.extraPrice;
    }

    @Override // defpackage.rgc
    public String realmGet$id() {
        return this.id;
    }

    @Override // defpackage.rgc
    public MoneyType realmGet$price() {
        return this.price;
    }

    @Override // defpackage.rgc
    public int realmGet$priority() {
        return this.priority;
    }

    @Override // defpackage.rgc
    public String realmGet$productId() {
        return this.productId;
    }

    @Override // defpackage.rgc
    public void realmSet$externalId(String str) {
        this.externalId = str;
    }

    @Override // defpackage.rgc
    public void realmSet$extraPrice(MoneyType moneyType) {
        this.extraPrice = moneyType;
    }

    @Override // defpackage.rgc
    public void realmSet$id(String str) {
        this.id = str;
    }

    @Override // defpackage.rgc
    public void realmSet$price(MoneyType moneyType) {
        this.price = moneyType;
    }

    @Override // defpackage.rgc
    public void realmSet$priority(int i) {
        this.priority = i;
    }

    @Override // defpackage.rgc
    public void realmSet$productId(String str) {
        this.productId = str;
    }

    public void setExternalId(String str) {
        realmSet$externalId(str);
    }

    public void setExtraPrice(MoneyType moneyType) {
        realmSet$extraPrice(moneyType);
    }

    @Override // defpackage.yi3
    public void setId(String str) {
        realmSet$id(str);
    }

    public void setPrice(MoneyType moneyType) {
        realmSet$price(moneyType);
    }

    public void setPriority(int i) {
        realmSet$priority(i);
    }

    public void setProductId(String str) {
        realmSet$productId(str);
    }

    public /* synthetic */ ComboTemplateSlotProductEntity(String str, String str2, int i, MoneyType moneyType, MoneyType moneyType2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? null : moneyType, (i2 & 16) != 0 ? null : moneyType2);
        if (this instanceof r89) {
            ((r89) this).b();
        }
    }

    public ComboTemplateSlotProductEntity(String str, String str2, int i, MoneyType moneyType, MoneyType moneyType2) {
        if (this instanceof r89) {
            ((r89) this).b();
        }
        realmSet$externalId(str);
        realmSet$productId(str2);
        realmSet$priority(i);
        realmSet$price(moneyType);
        realmSet$extraPrice(moneyType2);
    }
}
