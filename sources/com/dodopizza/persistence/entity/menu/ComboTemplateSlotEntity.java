package com.dodopizza.persistence.entity.menu;

import ch.qos.logback.core.joran.action.Action;
import io.realm.k0;
import io.realm.n0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: ComboTemplateSlotEntity.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002BC\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017¢\u0006\u0004\b\"\u0010#R$\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\n\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0005\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\"\u0010\u000e\u001a\u00020\r8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R$\u0010\u0014\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0005\u001a\u0004\b\u0015\u0010\u0007\"\u0004\b\u0016\u0010\tR(\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR$\u0010\u001f\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u0005\u001a\u0004\b \u0010\u0007\"\u0004\b!\u0010\t¨\u0006$"}, d2 = {"Lcom/dodopizza/persistence/entity/menu/ComboTemplateSlotEntity;", "Lyi3;", "Lio/realm/n0;", "", ShoppingInfoEntity.FIELD_EXTERNAL_ID, "Ljava/lang/String;", "getExternalId", "()Ljava/lang/String;", "setExternalId", "(Ljava/lang/String;)V", Action.NAME_ATTRIBUTE, "getName", "setName", "", "priority", "I", "getPriority", "()I", "setPriority", "(I)V", "defaultProduct", "getDefaultProduct", "setDefaultProduct", "Lio/realm/k0;", "Lcom/dodopizza/persistence/entity/menu/ComboTemplateSlotProductEntity;", "slotProducts", "Lio/realm/k0;", "getSlotProducts", "()Lio/realm/k0;", "setSlotProducts", "(Lio/realm/k0;)V", "id", "getId", "setId", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lio/realm/k0;)V", "persistence_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public class ComboTemplateSlotEntity extends n0 implements yi3, qgc {
    private String defaultProduct;
    private String externalId;
    private String id;
    private String name;
    private int priority;
    private k0<ComboTemplateSlotProductEntity> slotProducts;

    public ComboTemplateSlotEntity() {
        this(null, null, 0, null, null, 31, null);
        if (this instanceof r89) {
            ((r89) this).b();
        }
    }

    public String getDefaultProduct() {
        return realmGet$defaultProduct();
    }

    public String getExternalId() {
        return realmGet$externalId();
    }

    @Override // defpackage.yi3
    public String getId() {
        return realmGet$id();
    }

    public String getName() {
        return realmGet$name();
    }

    public int getPriority() {
        return realmGet$priority();
    }

    public k0<ComboTemplateSlotProductEntity> getSlotProducts() {
        return realmGet$slotProducts();
    }

    @Override // defpackage.qgc
    public String realmGet$defaultProduct() {
        return this.defaultProduct;
    }

    @Override // defpackage.qgc
    public String realmGet$externalId() {
        return this.externalId;
    }

    @Override // defpackage.qgc
    public String realmGet$id() {
        return this.id;
    }

    @Override // defpackage.qgc
    public String realmGet$name() {
        return this.name;
    }

    @Override // defpackage.qgc
    public int realmGet$priority() {
        return this.priority;
    }

    @Override // defpackage.qgc
    public k0 realmGet$slotProducts() {
        return this.slotProducts;
    }

    @Override // defpackage.qgc
    public void realmSet$defaultProduct(String str) {
        this.defaultProduct = str;
    }

    @Override // defpackage.qgc
    public void realmSet$externalId(String str) {
        this.externalId = str;
    }

    @Override // defpackage.qgc
    public void realmSet$id(String str) {
        this.id = str;
    }

    @Override // defpackage.qgc
    public void realmSet$name(String str) {
        this.name = str;
    }

    @Override // defpackage.qgc
    public void realmSet$priority(int i) {
        this.priority = i;
    }

    @Override // defpackage.qgc
    public void realmSet$slotProducts(k0 k0Var) {
        this.slotProducts = k0Var;
    }

    public void setDefaultProduct(String str) {
        realmSet$defaultProduct(str);
    }

    public void setExternalId(String str) {
        realmSet$externalId(str);
    }

    @Override // defpackage.yi3
    public void setId(String str) {
        realmSet$id(str);
    }

    public void setName(String str) {
        z65.h(str, "<set-?>");
        realmSet$name(str);
    }

    public void setPriority(int i) {
        realmSet$priority(i);
    }

    public void setSlotProducts(k0<ComboTemplateSlotProductEntity> k0Var) {
        z65.h(k0Var, "<set-?>");
        realmSet$slotProducts(k0Var);
    }

    public /* synthetic */ ComboTemplateSlotEntity(String str, String str2, int i, String str3, k0 k0Var, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? 0 : i, (i2 & 8) == 0 ? str3 : "", (i2 & 16) != 0 ? new k0() : k0Var);
        if (this instanceof r89) {
            ((r89) this).b();
        }
    }

    public ComboTemplateSlotEntity(String str, String str2, int i, String str3, k0<ComboTemplateSlotProductEntity> k0Var) {
        z65.h(str2, Action.NAME_ATTRIBUTE);
        z65.h(k0Var, "slotProducts");
        if (this instanceof r89) {
            ((r89) this).b();
        }
        realmSet$externalId(str);
        realmSet$name(str2);
        realmSet$priority(i);
        realmSet$defaultProduct(str3);
        realmSet$slotProducts(k0Var);
    }
}
