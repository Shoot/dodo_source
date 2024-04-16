package defpackage;

import com.dodopizza.persistence.entity.payment.CardEntity;
import com.dodopizza.persistence.entity.payment.GooglePayInitDataEntity;
/* compiled from: com_dodopizza_persistence_entity_payment_PaymentMethodEntityRealmProxyInterface.java */
/* renamed from: fhc  reason: default package */
/* loaded from: classes3.dex */
public interface fhc {
    String realmGet$acquirerName();

    String realmGet$brandName();

    CardEntity realmGet$card();

    GooglePayInitDataEntity realmGet$googlePayInitData();

    String realmGet$id();

    String realmGet$integrationType();

    boolean realmGet$isRedirectSaveCardEnabled();

    int realmGet$paymentType();

    int realmGet$priority();

    void realmSet$acquirerName(String str);

    void realmSet$brandName(String str);

    void realmSet$card(CardEntity cardEntity);

    void realmSet$googlePayInitData(GooglePayInitDataEntity googlePayInitDataEntity);

    void realmSet$id(String str);

    void realmSet$integrationType(String str);

    void realmSet$isRedirectSaveCardEnabled(boolean z);

    void realmSet$paymentType(int i);

    void realmSet$priority(int i);
}
