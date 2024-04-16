package defpackage;

import com.dodopizza.persistence.entity.MoneyType;
/* compiled from: com_dodopizza_persistence_entity_menu_ToppingEntityRealmProxyInterface.java */
/* renamed from: ahc  reason: default package */
/* loaded from: classes3.dex */
public interface ahc {
    boolean realmGet$canAddToVariation();

    String realmGet$id();

    String realmGet$imageUrl();

    boolean realmGet$isInStop();

    String realmGet$name();

    String realmGet$parentUuid();

    MoneyType realmGet$price();

    String realmGet$uuid();

    void realmSet$canAddToVariation(boolean z);

    void realmSet$id(String str);

    void realmSet$imageUrl(String str);

    void realmSet$isInStop(boolean z);

    void realmSet$name(String str);

    void realmSet$parentUuid(String str);

    void realmSet$price(MoneyType moneyType);

    void realmSet$uuid(String str);
}
