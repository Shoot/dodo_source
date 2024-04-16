package defpackage;

import com.dodopizza.persistence.entity.cart.EncryptionDataEntity;
import com.dodopizza.persistence.entity.payment.CardEntity;
/* compiled from: com_dodopizza_persistence_entity_cart_DataPaymentEntityRealmProxyInterface.java */
/* renamed from: pfc  reason: default package */
/* loaded from: classes3.dex */
public interface pfc {
    String realmGet$acquirerName();

    String realmGet$authorizeUrl();

    String realmGet$brandName();

    CardEntity realmGet$card();

    Double realmGet$clientNotes();

    EncryptionDataEntity realmGet$encryptionData();

    String realmGet$failureUrl();

    String realmGet$googlePayPaymentRequest();

    String realmGet$integrationType();

    int realmGet$invoiceExpirationInMinutes();

    String realmGet$paymentId();

    int realmGet$paymentMethodType();

    int realmGet$paymentType();

    String realmGet$pizzeriaPaymentKey();

    String realmGet$redirectUrl();

    String realmGet$successUrl();

    void realmSet$acquirerName(String str);

    void realmSet$authorizeUrl(String str);

    void realmSet$brandName(String str);

    void realmSet$card(CardEntity cardEntity);

    void realmSet$clientNotes(Double d);

    void realmSet$encryptionData(EncryptionDataEntity encryptionDataEntity);

    void realmSet$failureUrl(String str);

    void realmSet$googlePayPaymentRequest(String str);

    void realmSet$integrationType(String str);

    void realmSet$invoiceExpirationInMinutes(int i);

    void realmSet$paymentId(String str);

    void realmSet$paymentMethodType(int i);

    void realmSet$paymentType(int i);

    void realmSet$pizzeriaPaymentKey(String str);

    void realmSet$redirectUrl(String str);

    void realmSet$successUrl(String str);
}
