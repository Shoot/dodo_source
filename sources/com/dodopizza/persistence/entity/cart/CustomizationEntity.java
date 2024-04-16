package com.dodopizza.persistence.entity.cart;

import io.realm.k0;
import io.realm.n0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: CustomizationEntity.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002B3\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\n¢\u0006\u0004\b\u0016\u0010\u0017R$\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR(\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R(\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\r\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011¨\u0006\u0018"}, d2 = {"Lcom/dodopizza/persistence/entity/cart/CustomizationEntity;", "Lyi3;", "Lio/realm/n0;", "", "id", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "Lio/realm/k0;", "Lcom/dodopizza/persistence/entity/cart/AddedIngredientEntity;", "addedIngredients", "Lio/realm/k0;", "getAddedIngredients", "()Lio/realm/k0;", "setAddedIngredients", "(Lio/realm/k0;)V", "Lcom/dodopizza/persistence/entity/cart/RemovedIngredientEntity;", "removedIngredients", "getRemovedIngredients", "setRemovedIngredients", "<init>", "(Ljava/lang/String;Lio/realm/k0;Lio/realm/k0;)V", "persistence_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public class CustomizationEntity extends n0 implements yi3, ofc {
    private k0<AddedIngredientEntity> addedIngredients;
    private String id;
    private k0<RemovedIngredientEntity> removedIngredients;

    public CustomizationEntity() {
        this(null, null, null, 7, null);
        if (this instanceof r89) {
            ((r89) this).b();
        }
    }

    public k0<AddedIngredientEntity> getAddedIngredients() {
        return realmGet$addedIngredients();
    }

    @Override // defpackage.yi3
    public String getId() {
        return realmGet$id();
    }

    public k0<RemovedIngredientEntity> getRemovedIngredients() {
        return realmGet$removedIngredients();
    }

    @Override // defpackage.ofc
    public k0 realmGet$addedIngredients() {
        return this.addedIngredients;
    }

    @Override // defpackage.ofc
    public String realmGet$id() {
        return this.id;
    }

    @Override // defpackage.ofc
    public k0 realmGet$removedIngredients() {
        return this.removedIngredients;
    }

    @Override // defpackage.ofc
    public void realmSet$addedIngredients(k0 k0Var) {
        this.addedIngredients = k0Var;
    }

    @Override // defpackage.ofc
    public void realmSet$id(String str) {
        this.id = str;
    }

    @Override // defpackage.ofc
    public void realmSet$removedIngredients(k0 k0Var) {
        this.removedIngredients = k0Var;
    }

    public void setAddedIngredients(k0<AddedIngredientEntity> k0Var) {
        z65.h(k0Var, "<set-?>");
        realmSet$addedIngredients(k0Var);
    }

    @Override // defpackage.yi3
    public void setId(String str) {
        realmSet$id(str);
    }

    public void setRemovedIngredients(k0<RemovedIngredientEntity> k0Var) {
        z65.h(k0Var, "<set-?>");
        realmSet$removedIngredients(k0Var);
    }

    public /* synthetic */ CustomizationEntity(String str, k0 k0Var, k0 k0Var2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? new k0() : k0Var, (i & 4) != 0 ? new k0() : k0Var2);
        if (this instanceof r89) {
            ((r89) this).b();
        }
    }

    public CustomizationEntity(String str, k0<AddedIngredientEntity> k0Var, k0<RemovedIngredientEntity> k0Var2) {
        z65.h(k0Var, "addedIngredients");
        z65.h(k0Var2, "removedIngredients");
        if (this instanceof r89) {
            ((r89) this).b();
        }
        realmSet$id(str);
        realmSet$addedIngredients(k0Var);
        realmSet$removedIngredients(k0Var2);
    }
}
