package defpackage;

import com.dodopizza.persistence.entity.MoneyType;
import com.dodopizza.persistence.entity.menu.PersonalPriceEntity;
/* compiled from: com_dodopizza_persistence_entity_menu_ShoppingInfoEntityRealmProxyInterface.java */
/* renamed from: ygc  reason: default package */
/* loaded from: classes3.dex */
public interface ygc {
    String realmGet$externalId();

    String realmGet$id();

    PersonalPriceEntity realmGet$personalPrice();

    MoneyType realmGet$price();

    String realmGet$productId();

    String realmGet$shoppingId();

    void realmSet$externalId(String str);

    void realmSet$id(String str);

    void realmSet$personalPrice(PersonalPriceEntity personalPriceEntity);

    void realmSet$price(MoneyType moneyType);

    void realmSet$productId(String str);

    void realmSet$shoppingId(String str);
}
