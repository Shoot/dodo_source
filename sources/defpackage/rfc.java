package defpackage;

import com.dodopizza.persistence.entity.cart.PersonalPriceDiscountEntity;
/* compiled from: com_dodopizza_persistence_entity_cart_DiscountEntityRealmProxyInterface.java */
/* renamed from: rfc  reason: default package */
/* loaded from: classes3.dex */
public interface rfc {
    double realmGet$amount();

    String realmGet$bonusActionId();

    String realmGet$description();

    String realmGet$id();

    long realmGet$loyaltyCoinsUsed();

    PersonalPriceDiscountEntity realmGet$personalPriceDiscount();

    String realmGet$title();

    void realmSet$amount(double d);

    void realmSet$bonusActionId(String str);

    void realmSet$description(String str);

    void realmSet$id(String str);

    void realmSet$loyaltyCoinsUsed(long j);

    void realmSet$personalPriceDiscount(PersonalPriceDiscountEntity personalPriceDiscountEntity);

    void realmSet$title(String str);
}
