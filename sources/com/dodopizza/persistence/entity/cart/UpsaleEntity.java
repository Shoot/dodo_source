package com.dodopizza.persistence.entity.cart;

import io.realm.k0;
import io.realm.n0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: UpsaleEntity.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\b\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0012\u0010\nR(\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR$\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/dodopizza/persistence/entity/cart/UpsaleEntity;", "Lyi3;", "Lio/realm/n0;", "Lio/realm/k0;", "Lcom/dodopizza/persistence/entity/cart/UpsaleProductEntity;", "products", "Lio/realm/k0;", "getProducts", "()Lio/realm/k0;", "setProducts", "(Lio/realm/k0;)V", "", "id", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "<init>", "persistence_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public class UpsaleEntity extends n0 implements yi3, agc {
    private String id;
    private k0<UpsaleProductEntity> products;

    public UpsaleEntity() {
        this(null, 1, null);
        if (this instanceof r89) {
            ((r89) this).b();
        }
    }

    @Override // defpackage.yi3
    public String getId() {
        return realmGet$id();
    }

    public k0<UpsaleProductEntity> getProducts() {
        return realmGet$products();
    }

    @Override // defpackage.agc
    public String realmGet$id() {
        return this.id;
    }

    @Override // defpackage.agc
    public k0 realmGet$products() {
        return this.products;
    }

    @Override // defpackage.agc
    public void realmSet$id(String str) {
        this.id = str;
    }

    @Override // defpackage.agc
    public void realmSet$products(k0 k0Var) {
        this.products = k0Var;
    }

    @Override // defpackage.yi3
    public void setId(String str) {
        realmSet$id(str);
    }

    public void setProducts(k0<UpsaleProductEntity> k0Var) {
        z65.h(k0Var, "<set-?>");
        realmSet$products(k0Var);
    }

    public /* synthetic */ UpsaleEntity(k0 k0Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new k0() : k0Var);
        if (this instanceof r89) {
            ((r89) this).b();
        }
    }

    public UpsaleEntity(k0<UpsaleProductEntity> k0Var) {
        z65.h(k0Var, "products");
        if (this instanceof r89) {
            ((r89) this).b();
        }
        realmSet$products(k0Var);
    }
}
