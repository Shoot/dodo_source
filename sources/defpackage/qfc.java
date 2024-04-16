package defpackage;

import com.dodopizza.persistence.entity.BonusActionEntity;
import com.dodopizza.persistence.entity.cart.AppliedInfoEntity;
/* compiled from: com_dodopizza_persistence_entity_cart_DataPromoCodeEntityRealmProxyInterface.java */
/* renamed from: qfc  reason: default package */
/* loaded from: classes3.dex */
public interface qfc {
    AppliedInfoEntity realmGet$appliedInfo();

    BonusActionEntity realmGet$bonusAction();

    String realmGet$description();

    String realmGet$promoCode();

    int realmGet$status();

    void realmSet$appliedInfo(AppliedInfoEntity appliedInfoEntity);

    void realmSet$bonusAction(BonusActionEntity bonusActionEntity);

    void realmSet$description(String str);

    void realmSet$promoCode(String str);

    void realmSet$status(int i);
}
