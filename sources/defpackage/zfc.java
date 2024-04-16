package defpackage;

import com.dodopizza.persistence.entity.DeliveryFeeLevelsEntity;
import com.dodopizza.persistence.entity.PackageInfoEntity;
import com.dodopizza.persistence.entity.RealmString;
import com.dodopizza.persistence.entity.StateErrorEntity;
import com.dodopizza.persistence.entity.StateWarningEntity;
import com.dodopizza.persistence.entity.address.DeliveryAddressEntity;
import com.dodopizza.persistence.entity.cart.CartEntity;
import com.dodopizza.persistence.entity.cart.DataPaymentEntity;
import com.dodopizza.persistence.entity.cart.UpsaleEntity;
import com.dodopizza.persistence.entity.deliverylocation.ClientDeliveryLocationEntity;
import com.dodopizza.persistence.entity.personalization.PersonalizationEntity;
import com.dodopizza.persistence.entity.prizoteka.PrizotekaEntity;
import io.realm.k0;
/* compiled from: com_dodopizza_persistence_entity_cart_StateEntityRealmProxyInterface.java */
/* renamed from: zfc  reason: default package */
/* loaded from: classes3.dex */
public interface zfc {
    CartEntity realmGet$cart();

    Integer realmGet$cartError();

    ClientDeliveryLocationEntity realmGet$clientDeliveryLocationEntity();

    Integer realmGet$countryCode();

    Integer realmGet$currentOrderType();

    DataPaymentEntity realmGet$dataPayment();

    String realmGet$deferredOrderTime();

    DeliveryFeeLevelsEntity realmGet$delivery();

    DeliveryAddressEntity realmGet$deliveryAddressEntity();

    k0<StateErrorEntity> realmGet$errors();

    int realmGet$expectedMinutesToReceiveForASAP();

    Boolean realmGet$isTakeaway();

    boolean realmGet$isWorkload();

    String realmGet$languageCode();

    String realmGet$localityId();

    double realmGet$minDeliveryPrice();

    double realmGet$minDeliveryPriceCustomized();

    String realmGet$orderPizzeriaId();

    PackageInfoEntity realmGet$packageInfo();

    PersonalizationEntity realmGet$personalization();

    int realmGet$pizzeriaAverageServiceTimeMinutes();

    String realmGet$placedOrderId();

    PrizotekaEntity realmGet$prizoteka();

    k0<RealmString> realmGet$productIdsStopList();

    Integer realmGet$step();

    Integer realmGet$tableNumber();

    String realmGet$taxPayerId();

    k0<RealmString> realmGet$toppingIdsStopList();

    UpsaleEntity realmGet$upsale();

    k0<StateWarningEntity> realmGet$warnings();

    String realmGet$workflowId();

    void realmSet$cart(CartEntity cartEntity);

    void realmSet$cartError(Integer num);

    void realmSet$clientDeliveryLocationEntity(ClientDeliveryLocationEntity clientDeliveryLocationEntity);

    void realmSet$countryCode(Integer num);

    void realmSet$currentOrderType(Integer num);

    void realmSet$dataPayment(DataPaymentEntity dataPaymentEntity);

    void realmSet$deferredOrderTime(String str);

    void realmSet$delivery(DeliveryFeeLevelsEntity deliveryFeeLevelsEntity);

    void realmSet$deliveryAddressEntity(DeliveryAddressEntity deliveryAddressEntity);

    void realmSet$errors(k0<StateErrorEntity> k0Var);

    void realmSet$expectedMinutesToReceiveForASAP(int i);

    void realmSet$isTakeaway(Boolean bool);

    void realmSet$isWorkload(boolean z);

    void realmSet$languageCode(String str);

    void realmSet$localityId(String str);

    void realmSet$minDeliveryPrice(double d);

    void realmSet$minDeliveryPriceCustomized(double d);

    void realmSet$orderPizzeriaId(String str);

    void realmSet$packageInfo(PackageInfoEntity packageInfoEntity);

    void realmSet$personalization(PersonalizationEntity personalizationEntity);

    void realmSet$pizzeriaAverageServiceTimeMinutes(int i);

    void realmSet$placedOrderId(String str);

    void realmSet$prizoteka(PrizotekaEntity prizotekaEntity);

    void realmSet$productIdsStopList(k0<RealmString> k0Var);

    void realmSet$step(Integer num);

    void realmSet$tableNumber(Integer num);

    void realmSet$taxPayerId(String str);

    void realmSet$toppingIdsStopList(k0<RealmString> k0Var);

    void realmSet$upsale(UpsaleEntity upsaleEntity);

    void realmSet$warnings(k0<StateWarningEntity> k0Var);

    void realmSet$workflowId(String str);
}
