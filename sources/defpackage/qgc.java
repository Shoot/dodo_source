package defpackage;

import com.dodopizza.persistence.entity.menu.ComboTemplateSlotProductEntity;
import io.realm.k0;
/* compiled from: com_dodopizza_persistence_entity_menu_ComboTemplateSlotEntityRealmProxyInterface.java */
/* renamed from: qgc  reason: default package */
/* loaded from: classes3.dex */
public interface qgc {
    String realmGet$defaultProduct();

    String realmGet$externalId();

    String realmGet$id();

    String realmGet$name();

    int realmGet$priority();

    k0<ComboTemplateSlotProductEntity> realmGet$slotProducts();

    void realmSet$defaultProduct(String str);

    void realmSet$externalId(String str);

    void realmSet$id(String str);

    void realmSet$name(String str);

    void realmSet$priority(int i);

    void realmSet$slotProducts(k0<ComboTemplateSlotProductEntity> k0Var);
}
