package defpackage;

import com.dodopizza.persistence.entity.ImageEntity;
import com.dodopizza.persistence.entity.cart.UpsaleSizeDetailsEntity;
/* compiled from: com_dodopizza_persistence_entity_cart_UpsaleProductEntityRealmProxyInterface.java */
/* renamed from: cgc  reason: default package */
/* loaded from: classes3.dex */
public interface cgc {
    Integer realmGet$category();

    String realmGet$id();

    ImageEntity realmGet$image();

    String realmGet$name();

    int realmGet$orderInCart();

    double realmGet$price();

    UpsaleSizeDetailsEntity realmGet$promotingSizeDetailsEntity();

    String realmGet$upsaleProductId();

    void realmSet$category(Integer num);

    void realmSet$id(String str);

    void realmSet$image(ImageEntity imageEntity);

    void realmSet$name(String str);

    void realmSet$orderInCart(int i);

    void realmSet$price(double d);

    void realmSet$promotingSizeDetailsEntity(UpsaleSizeDetailsEntity upsaleSizeDetailsEntity);

    void realmSet$upsaleProductId(String str);
}
