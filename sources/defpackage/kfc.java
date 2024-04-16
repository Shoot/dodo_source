package defpackage;

import com.dodopizza.persistence.entity.ImageEntity;
import com.dodopizza.persistence.entity.cart.CustomizationEntity;
/* compiled from: com_dodopizza_persistence_entity_cart_CartComboSlotProductEntityRealmProxyInterface.java */
/* renamed from: kfc  reason: default package */
/* loaded from: classes3.dex */
public interface kfc {
    String realmGet$category();

    CustomizationEntity realmGet$customization();

    int realmGet$dough();

    String realmGet$doughTypeName();

    String realmGet$externalId();

    String realmGet$id();

    ImageEntity realmGet$image();

    boolean realmGet$isInStop();

    String realmGet$name();

    double realmGet$price();

    int realmGet$size();

    String realmGet$sizeGroupName();

    void realmSet$category(String str);

    void realmSet$customization(CustomizationEntity customizationEntity);

    void realmSet$dough(int i);

    void realmSet$doughTypeName(String str);

    void realmSet$externalId(String str);

    void realmSet$id(String str);

    void realmSet$image(ImageEntity imageEntity);

    void realmSet$isInStop(boolean z);

    void realmSet$name(String str);

    void realmSet$price(double d);

    void realmSet$size(int i);

    void realmSet$sizeGroupName(String str);
}
