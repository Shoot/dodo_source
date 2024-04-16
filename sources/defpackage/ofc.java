package defpackage;

import com.dodopizza.persistence.entity.cart.AddedIngredientEntity;
import com.dodopizza.persistence.entity.cart.RemovedIngredientEntity;
import io.realm.k0;
/* compiled from: com_dodopizza_persistence_entity_cart_CustomizationEntityRealmProxyInterface.java */
/* renamed from: ofc  reason: default package */
/* loaded from: classes3.dex */
public interface ofc {
    k0<AddedIngredientEntity> realmGet$addedIngredients();

    String realmGet$id();

    k0<RemovedIngredientEntity> realmGet$removedIngredients();

    void realmSet$addedIngredients(k0<AddedIngredientEntity> k0Var);

    void realmSet$id(String str);

    void realmSet$removedIngredients(k0<RemovedIngredientEntity> k0Var);
}
