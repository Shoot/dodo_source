package com.dodopizza.persistence.entity.cart;

import com.inappstory.sdk.stories.ui.widgets.readerscreen.generated.ElementGenerator;
import io.realm.n0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: PizzaHalvesEntity.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\t\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0014\u0010\u0015R$\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR$\u0010\n\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0005\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR$\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/dodopizza/persistence/entity/cart/PizzaHalvesEntity;", "Lyi3;", "Lio/realm/n0;", "Lcom/dodopizza/persistence/entity/cart/CartProductEntity;", ElementGenerator.TEXT_ALIGN_LEFT, "Lcom/dodopizza/persistence/entity/cart/CartProductEntity;", "getLeft", "()Lcom/dodopizza/persistence/entity/cart/CartProductEntity;", "setLeft", "(Lcom/dodopizza/persistence/entity/cart/CartProductEntity;)V", ElementGenerator.TEXT_ALIGN_RIGHT, "getRight", "setRight", "", "id", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "<init>", "(Lcom/dodopizza/persistence/entity/cart/CartProductEntity;Lcom/dodopizza/persistence/entity/cart/CartProductEntity;)V", "persistence_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public class PizzaHalvesEntity extends n0 implements yi3, vfc {
    private String id;
    private CartProductEntity left;
    private CartProductEntity right;

    public PizzaHalvesEntity() {
        this(null, null, 3, null);
        if (this instanceof r89) {
            ((r89) this).b();
        }
    }

    @Override // defpackage.yi3
    public String getId() {
        return realmGet$id();
    }

    public CartProductEntity getLeft() {
        return realmGet$left();
    }

    public CartProductEntity getRight() {
        return realmGet$right();
    }

    @Override // defpackage.vfc
    public String realmGet$id() {
        return this.id;
    }

    @Override // defpackage.vfc
    public CartProductEntity realmGet$left() {
        return this.left;
    }

    @Override // defpackage.vfc
    public CartProductEntity realmGet$right() {
        return this.right;
    }

    @Override // defpackage.vfc
    public void realmSet$id(String str) {
        this.id = str;
    }

    @Override // defpackage.vfc
    public void realmSet$left(CartProductEntity cartProductEntity) {
        this.left = cartProductEntity;
    }

    @Override // defpackage.vfc
    public void realmSet$right(CartProductEntity cartProductEntity) {
        this.right = cartProductEntity;
    }

    @Override // defpackage.yi3
    public void setId(String str) {
        realmSet$id(str);
    }

    public void setLeft(CartProductEntity cartProductEntity) {
        realmSet$left(cartProductEntity);
    }

    public void setRight(CartProductEntity cartProductEntity) {
        realmSet$right(cartProductEntity);
    }

    public /* synthetic */ PizzaHalvesEntity(CartProductEntity cartProductEntity, CartProductEntity cartProductEntity2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : cartProductEntity, (i & 2) != 0 ? null : cartProductEntity2);
        if (this instanceof r89) {
            ((r89) this).b();
        }
    }

    public PizzaHalvesEntity(CartProductEntity cartProductEntity, CartProductEntity cartProductEntity2) {
        if (this instanceof r89) {
            ((r89) this).b();
        }
        realmSet$left(cartProductEntity);
        realmSet$right(cartProductEntity2);
    }
}
