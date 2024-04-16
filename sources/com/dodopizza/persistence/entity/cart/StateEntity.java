package com.dodopizza.persistence.entity.cart;

import com.dodopizza.persistence.entity.DeliveryFeeLevelsEntity;
import com.dodopizza.persistence.entity.PackageInfoEntity;
import com.dodopizza.persistence.entity.RealmString;
import com.dodopizza.persistence.entity.StateErrorEntity;
import com.dodopizza.persistence.entity.StateWarningEntity;
import com.dodopizza.persistence.entity.UpsaleStateEntity;
import com.dodopizza.persistence.entity.address.DeliveryAddressEntity;
import com.dodopizza.persistence.entity.deliverylocation.ClientDeliveryLocationEntity;
import com.dodopizza.persistence.entity.locality.LocalityEntity;
import com.dodopizza.persistence.entity.payment.PaymentMethodEntity;
import com.dodopizza.persistence.entity.personalization.PersonalizationEntity;
import com.dodopizza.persistence.entity.prizoteka.PrizotekaEntity;
import io.realm.k0;
import io.realm.n0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: StateEntity.kt */
@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0006\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0017\u0018\u0000 °\u00012\u00020\u0001:\u0002°\u0001B\u009d\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010.\u001a\u00020-\u0012\b\b\u0002\u00104\u001a\u00020-\u0012\b\b\u0002\u00107\u001a\u00020\u000f\u0012\n\b\u0002\u0010>\u001a\u0004\u0018\u00010=\u0012\n\b\u0002\u0010E\u001a\u0004\u0018\u00010D\u0012\n\b\u0002\u0010K\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010N\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010Q\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010T\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010Y\u001a\b\u0012\u0004\u0012\u00020X0W\u0012\u000e\b\u0002\u0010_\u001a\b\u0012\u0004\u0012\u00020X0W\u0012\n\b\u0002\u0010c\u001a\u0004\u0018\u00010b\u0012\u000e\b\u0002\u0010j\u001a\b\u0012\u0004\u0012\u00020i0W\u0012\u000e\b\u0002\u0010n\u001a\b\u0012\u0004\u0012\u00020m0W\u0012\n\b\u0002\u0010r\u001a\u0004\u0018\u00010q\u0012\u000e\b\u0002\u0010z\u001a\b\u0012\u0004\u0012\u00020y0x\u0012\u000b\b\u0002\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u0004\u0012\u000b\b\u0002\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u0002\u0012\u000b\b\u0002\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u000f\u0012\f\b\u0002\u0010\u008c\u0001\u001a\u0005\u0018\u00010\u008b\u0001\u0012\f\b\u0002\u0010\u0093\u0001\u001a\u0005\u0018\u00010\u0092\u0001\u0012\f\b\u0002\u0010\u009a\u0001\u001a\u0005\u0018\u00010\u0099\u0001\u0012\t\b\u0002\u0010 \u0001\u001a\u00020\u000f\u0012\f\b\u0002\u0010¤\u0001\u001a\u0005\u0018\u00010£\u0001¢\u0006\u0006\b\u00ad\u0001\u0010®\u0001B-\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010*\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010N\u001a\u00020\u000f\u0012\u0006\u0010T\u001a\u00020\u0002¢\u0006\u0006\b\u00ad\u0001\u0010¯\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\"\u0010\u0006\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\f\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0007\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000bR$\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u0016\u001a\u00020\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0007\u001a\u0004\b\u001c\u0010\t\"\u0004\b\u001d\u0010\u000bR$\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R*\u0010%\u001a\u0004\u0018\u00010\u000f8\u0016@\u0016X\u0097\u000e¢\u0006\u0018\n\u0004\b%\u0010\u0011\u0012\u0004\b(\u0010)\u001a\u0004\b&\u0010\u0013\"\u0004\b'\u0010\u0015R$\u0010*\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b*\u0010\u0007\u001a\u0004\b+\u0010\t\"\u0004\b,\u0010\u000bR\"\u0010.\u001a\u00020-8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\"\u00104\u001a\u00020-8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b4\u0010/\u001a\u0004\b5\u00101\"\u0004\b6\u00103R\"\u00107\u001a\u00020\u000f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R$\u0010>\u001a\u0004\u0018\u00010=8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR$\u0010E\u001a\u0004\u0018\u00010D8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR$\u0010K\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bK\u0010\u0007\u001a\u0004\bL\u0010\t\"\u0004\bM\u0010\u000bR$\u0010N\u001a\u0004\u0018\u00010\u000f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bN\u0010\u0011\u001a\u0004\bO\u0010\u0013\"\u0004\bP\u0010\u0015R$\u0010Q\u001a\u0004\u0018\u00010\u000f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bQ\u0010\u0011\u001a\u0004\bR\u0010\u0013\"\u0004\bS\u0010\u0015R$\u0010T\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bT\u0010\u0007\u001a\u0004\bU\u0010\t\"\u0004\bV\u0010\u000bR(\u0010Y\u001a\b\u0012\u0004\u0012\u00020X0W8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R(\u0010_\u001a\b\u0012\u0004\u0012\u00020X0W8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b_\u0010Z\u001a\u0004\b`\u0010\\\"\u0004\ba\u0010^R$\u0010c\u001a\u0004\u0018\u00010b8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bc\u0010d\u001a\u0004\be\u0010f\"\u0004\bg\u0010hR(\u0010j\u001a\b\u0012\u0004\u0012\u00020i0W8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bj\u0010Z\u001a\u0004\bk\u0010\\\"\u0004\bl\u0010^R(\u0010n\u001a\b\u0012\u0004\u0012\u00020m0W8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bn\u0010Z\u001a\u0004\bo\u0010\\\"\u0004\bp\u0010^R$\u0010r\u001a\u0004\u0018\u00010q8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\br\u0010s\u001a\u0004\bt\u0010u\"\u0004\bv\u0010wR(\u0010z\u001a\b\u0012\u0004\u0012\u00020y0x8\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\bz\u0010{\u001a\u0004\b|\u0010}\"\u0004\b~\u0010\u007fR+\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0006\b\u0080\u0001\u0010\u0081\u0001\u001a\u0006\b\u0080\u0001\u0010\u0082\u0001\"\u0006\b\u0083\u0001\u0010\u0084\u0001R(\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0015\n\u0005\b\u0085\u0001\u0010\u0007\u001a\u0005\b\u0086\u0001\u0010\t\"\u0005\b\u0087\u0001\u0010\u000bR(\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u000f8\u0016@\u0016X\u0096\u000e¢\u0006\u0015\n\u0005\b\u0088\u0001\u0010\u0011\u001a\u0005\b\u0089\u0001\u0010\u0013\"\u0005\b\u008a\u0001\u0010\u0015R,\u0010\u008c\u0001\u001a\u0005\u0018\u00010\u008b\u00018\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0006\b\u008c\u0001\u0010\u008d\u0001\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001\"\u0006\b\u0090\u0001\u0010\u0091\u0001R,\u0010\u0093\u0001\u001a\u0005\u0018\u00010\u0092\u00018\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0006\b\u0093\u0001\u0010\u0094\u0001\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001\"\u0006\b\u0097\u0001\u0010\u0098\u0001R,\u0010\u009a\u0001\u001a\u0005\u0018\u00010\u0099\u00018\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0006\b\u009a\u0001\u0010\u009b\u0001\u001a\u0006\b\u009c\u0001\u0010\u009d\u0001\"\u0006\b\u009e\u0001\u0010\u009f\u0001R&\u0010 \u0001\u001a\u00020\u000f8\u0016@\u0016X\u0096\u000e¢\u0006\u0015\n\u0005\b \u0001\u00108\u001a\u0005\b¡\u0001\u0010:\"\u0005\b¢\u0001\u0010<R,\u0010¤\u0001\u001a\u0005\u0018\u00010£\u00018\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0006\b¤\u0001\u0010¥\u0001\u001a\u0006\b¦\u0001\u0010§\u0001\"\u0006\b¨\u0001\u0010©\u0001R\u0018\u0010«\u0001\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bª\u0001\u0010\tR\u0016\u0010¬\u0001\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b¬\u0001\u0010\u0018¨\u0006±\u0001"}, d2 = {"Lcom/dodopizza/persistence/entity/cart/StateEntity;", "Lio/realm/n0;", "", "toString", "", "hasProductInStop", UpsaleStateEntity.FIELD_NAME_WORKFLOW_ID, "Ljava/lang/String;", "getWorkflowId", "()Ljava/lang/String;", "setWorkflowId", "(Ljava/lang/String;)V", "placedOrderId", "getPlacedOrderId", "setPlacedOrderId", "", "step", "Ljava/lang/Integer;", "getStep", "()Ljava/lang/Integer;", "setStep", "(Ljava/lang/Integer;)V", "isWorkload", "Z", "()Z", "setWorkload", "(Z)V", "orderPizzeriaId", "getOrderPizzeriaId", "setOrderPizzeriaId", "Lcom/dodopizza/persistence/entity/cart/CartEntity;", "cart", "Lcom/dodopizza/persistence/entity/cart/CartEntity;", "getCart", "()Lcom/dodopizza/persistence/entity/cart/CartEntity;", "setCart", "(Lcom/dodopizza/persistence/entity/cart/CartEntity;)V", "cartError", "getCartError", "setCartError", "getCartError$annotations", "()V", "localityId", "getLocalityId", "setLocalityId", "", "minDeliveryPrice", "D", "getMinDeliveryPrice", "()D", "setMinDeliveryPrice", "(D)V", "minDeliveryPriceCustomized", "getMinDeliveryPriceCustomized", "setMinDeliveryPriceCustomized", "expectedMinutesToReceiveForASAP", "I", "getExpectedMinutesToReceiveForASAP", "()I", "setExpectedMinutesToReceiveForASAP", "(I)V", "Lcom/dodopizza/persistence/entity/address/DeliveryAddressEntity;", "deliveryAddressEntity", "Lcom/dodopizza/persistence/entity/address/DeliveryAddressEntity;", "getDeliveryAddressEntity", "()Lcom/dodopizza/persistence/entity/address/DeliveryAddressEntity;", "setDeliveryAddressEntity", "(Lcom/dodopizza/persistence/entity/address/DeliveryAddressEntity;)V", "Lcom/dodopizza/persistence/entity/deliverylocation/ClientDeliveryLocationEntity;", "clientDeliveryLocationEntity", "Lcom/dodopizza/persistence/entity/deliverylocation/ClientDeliveryLocationEntity;", "getClientDeliveryLocationEntity", "()Lcom/dodopizza/persistence/entity/deliverylocation/ClientDeliveryLocationEntity;", "setClientDeliveryLocationEntity", "(Lcom/dodopizza/persistence/entity/deliverylocation/ClientDeliveryLocationEntity;)V", "deferredOrderTime", "getDeferredOrderTime", "setDeferredOrderTime", LocalityEntity.FIELD_COUNTRY_CODE, "getCountryCode", "setCountryCode", "currentOrderType", "getCurrentOrderType", "setCurrentOrderType", "languageCode", "getLanguageCode", "setLanguageCode", "Lio/realm/k0;", "Lcom/dodopizza/persistence/entity/RealmString;", "productIdsStopList", "Lio/realm/k0;", "getProductIdsStopList", "()Lio/realm/k0;", "setProductIdsStopList", "(Lio/realm/k0;)V", "toppingIdsStopList", "getToppingIdsStopList", "setToppingIdsStopList", "Lcom/dodopizza/persistence/entity/cart/DataPaymentEntity;", "dataPayment", "Lcom/dodopizza/persistence/entity/cart/DataPaymentEntity;", "getDataPayment", "()Lcom/dodopizza/persistence/entity/cart/DataPaymentEntity;", "setDataPayment", "(Lcom/dodopizza/persistence/entity/cart/DataPaymentEntity;)V", "Lcom/dodopizza/persistence/entity/StateErrorEntity;", "errors", "getErrors", "setErrors", "Lcom/dodopizza/persistence/entity/StateWarningEntity;", "warnings", "getWarnings", "setWarnings", "Lcom/dodopizza/persistence/entity/cart/UpsaleEntity;", "upsale", "Lcom/dodopizza/persistence/entity/cart/UpsaleEntity;", "getUpsale", "()Lcom/dodopizza/persistence/entity/cart/UpsaleEntity;", "setUpsale", "(Lcom/dodopizza/persistence/entity/cart/UpsaleEntity;)V", "", "Lcom/dodopizza/persistence/entity/payment/PaymentMethodEntity;", "paymentMethods", "Ljava/util/List;", "getPaymentMethods", "()Ljava/util/List;", "setPaymentMethods", "(Ljava/util/List;)V", "isTakeaway", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "setTakeaway", "(Ljava/lang/Boolean;)V", "taxPayerId", "getTaxPayerId", "setTaxPayerId", "tableNumber", "getTableNumber", "setTableNumber", "Lcom/dodopizza/persistence/entity/prizoteka/PrizotekaEntity;", "prizoteka", "Lcom/dodopizza/persistence/entity/prizoteka/PrizotekaEntity;", "getPrizoteka", "()Lcom/dodopizza/persistence/entity/prizoteka/PrizotekaEntity;", "setPrizoteka", "(Lcom/dodopizza/persistence/entity/prizoteka/PrizotekaEntity;)V", "Lcom/dodopizza/persistence/entity/personalization/PersonalizationEntity;", "personalization", "Lcom/dodopizza/persistence/entity/personalization/PersonalizationEntity;", "getPersonalization", "()Lcom/dodopizza/persistence/entity/personalization/PersonalizationEntity;", "setPersonalization", "(Lcom/dodopizza/persistence/entity/personalization/PersonalizationEntity;)V", "Lcom/dodopizza/persistence/entity/DeliveryFeeLevelsEntity;", "delivery", "Lcom/dodopizza/persistence/entity/DeliveryFeeLevelsEntity;", "getDelivery", "()Lcom/dodopizza/persistence/entity/DeliveryFeeLevelsEntity;", "setDelivery", "(Lcom/dodopizza/persistence/entity/DeliveryFeeLevelsEntity;)V", "pizzeriaAverageServiceTimeMinutes", "getPizzeriaAverageServiceTimeMinutes", "setPizzeriaAverageServiceTimeMinutes", "Lcom/dodopizza/persistence/entity/PackageInfoEntity;", "packageInfo", "Lcom/dodopizza/persistence/entity/PackageInfoEntity;", "getPackageInfo", "()Lcom/dodopizza/persistence/entity/PackageInfoEntity;", "setPackageInfo", "(Lcom/dodopizza/persistence/entity/PackageInfoEntity;)V", "getSelectedPizzeriaId", "selectedPizzeriaId", "isEmpty", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ZLjava/lang/String;Lcom/dodopizza/persistence/entity/cart/CartEntity;Ljava/lang/Integer;Ljava/lang/String;DDILcom/dodopizza/persistence/entity/address/DeliveryAddressEntity;Lcom/dodopizza/persistence/entity/deliverylocation/ClientDeliveryLocationEntity;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Lio/realm/k0;Lio/realm/k0;Lcom/dodopizza/persistence/entity/cart/DataPaymentEntity;Lio/realm/k0;Lio/realm/k0;Lcom/dodopizza/persistence/entity/cart/UpsaleEntity;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Lcom/dodopizza/persistence/entity/prizoteka/PrizotekaEntity;Lcom/dodopizza/persistence/entity/personalization/PersonalizationEntity;Lcom/dodopizza/persistence/entity/DeliveryFeeLevelsEntity;ILcom/dodopizza/persistence/entity/PackageInfoEntity;)V", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "Companion", "persistence_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public class StateEntity extends n0 implements zfc {
    public static final Companion Companion = new Companion(null);
    private static final StateEntity DEFAULT = new StateEntity(null, null, null, false, null, null, null, "", 0.0d, 0.0d, 0, null, null, null, 0, null, "", null, null, null, null, null, null, null, null, null, null, null, null, null, 0, null, -82049, null);
    private CartEntity cart;
    private Integer cartError;
    private ClientDeliveryLocationEntity clientDeliveryLocationEntity;
    private Integer countryCode;
    private Integer currentOrderType;
    private DataPaymentEntity dataPayment;
    private String deferredOrderTime;
    private DeliveryFeeLevelsEntity delivery;
    private DeliveryAddressEntity deliveryAddressEntity;
    private k0<StateErrorEntity> errors;
    private int expectedMinutesToReceiveForASAP;
    private Boolean isTakeaway;
    private boolean isWorkload;
    private String languageCode;
    private String localityId;
    private double minDeliveryPrice;
    private double minDeliveryPriceCustomized;
    private String orderPizzeriaId;
    private PackageInfoEntity packageInfo;
    private List<? extends PaymentMethodEntity> paymentMethods;
    private PersonalizationEntity personalization;
    private int pizzeriaAverageServiceTimeMinutes;
    private String placedOrderId;
    private PrizotekaEntity prizoteka;
    private k0<RealmString> productIdsStopList;
    private Integer step;
    private Integer tableNumber;
    private String taxPayerId;
    private k0<RealmString> toppingIdsStopList;
    private UpsaleEntity upsale;
    private k0<StateWarningEntity> warnings;
    private String workflowId;

    /* compiled from: StateEntity.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dodopizza/persistence/entity/cart/StateEntity$Companion;", "", "()V", "DEFAULT", "Lcom/dodopizza/persistence/entity/cart/StateEntity;", "getDEFAULT", "()Lcom/dodopizza/persistence/entity/cart/StateEntity;", "persistence_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final StateEntity getDEFAULT() {
            return StateEntity.DEFAULT;
        }
    }

    public StateEntity() {
        this(null, null, null, false, null, null, null, null, 0.0d, 0.0d, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, null, -1, null);
        if (this instanceof r89) {
            ((r89) this).b();
        }
    }

    public CartEntity getCart() {
        return realmGet$cart();
    }

    public Integer getCartError() {
        return realmGet$cartError();
    }

    public ClientDeliveryLocationEntity getClientDeliveryLocationEntity() {
        return realmGet$clientDeliveryLocationEntity();
    }

    public Integer getCountryCode() {
        return realmGet$countryCode();
    }

    public Integer getCurrentOrderType() {
        return realmGet$currentOrderType();
    }

    public DataPaymentEntity getDataPayment() {
        return realmGet$dataPayment();
    }

    public String getDeferredOrderTime() {
        return realmGet$deferredOrderTime();
    }

    public DeliveryFeeLevelsEntity getDelivery() {
        return realmGet$delivery();
    }

    public DeliveryAddressEntity getDeliveryAddressEntity() {
        return realmGet$deliveryAddressEntity();
    }

    public k0<StateErrorEntity> getErrors() {
        return realmGet$errors();
    }

    public int getExpectedMinutesToReceiveForASAP() {
        return realmGet$expectedMinutesToReceiveForASAP();
    }

    public String getLanguageCode() {
        return realmGet$languageCode();
    }

    public String getLocalityId() {
        return realmGet$localityId();
    }

    public double getMinDeliveryPrice() {
        return realmGet$minDeliveryPrice();
    }

    public double getMinDeliveryPriceCustomized() {
        return realmGet$minDeliveryPriceCustomized();
    }

    public String getOrderPizzeriaId() {
        return realmGet$orderPizzeriaId();
    }

    public PackageInfoEntity getPackageInfo() {
        return realmGet$packageInfo();
    }

    public List<PaymentMethodEntity> getPaymentMethods() {
        return this.paymentMethods;
    }

    public PersonalizationEntity getPersonalization() {
        return realmGet$personalization();
    }

    public int getPizzeriaAverageServiceTimeMinutes() {
        return realmGet$pizzeriaAverageServiceTimeMinutes();
    }

    public String getPlacedOrderId() {
        return realmGet$placedOrderId();
    }

    public PrizotekaEntity getPrizoteka() {
        return realmGet$prizoteka();
    }

    public k0<RealmString> getProductIdsStopList() {
        return realmGet$productIdsStopList();
    }

    public String getSelectedPizzeriaId() {
        return getOrderPizzeriaId();
    }

    public Integer getStep() {
        return realmGet$step();
    }

    public Integer getTableNumber() {
        return realmGet$tableNumber();
    }

    public String getTaxPayerId() {
        return realmGet$taxPayerId();
    }

    public k0<RealmString> getToppingIdsStopList() {
        return realmGet$toppingIdsStopList();
    }

    public UpsaleEntity getUpsale() {
        return realmGet$upsale();
    }

    public k0<StateWarningEntity> getWarnings() {
        return realmGet$warnings();
    }

    public String getWorkflowId() {
        return realmGet$workflowId();
    }

    public boolean hasProductInStop() {
        CartEntity cart = getCart();
        if (cart != null) {
            return cart.hasProductsInStop();
        }
        return false;
    }

    public boolean isEmpty() {
        if (getWorkflowId().length() == 0) {
            return true;
        }
        return false;
    }

    public Boolean isTakeaway() {
        return realmGet$isTakeaway();
    }

    public boolean isWorkload() {
        return realmGet$isWorkload();
    }

    @Override // defpackage.zfc
    public CartEntity realmGet$cart() {
        return this.cart;
    }

    @Override // defpackage.zfc
    public Integer realmGet$cartError() {
        return this.cartError;
    }

    @Override // defpackage.zfc
    public ClientDeliveryLocationEntity realmGet$clientDeliveryLocationEntity() {
        return this.clientDeliveryLocationEntity;
    }

    @Override // defpackage.zfc
    public Integer realmGet$countryCode() {
        return this.countryCode;
    }

    @Override // defpackage.zfc
    public Integer realmGet$currentOrderType() {
        return this.currentOrderType;
    }

    @Override // defpackage.zfc
    public DataPaymentEntity realmGet$dataPayment() {
        return this.dataPayment;
    }

    @Override // defpackage.zfc
    public String realmGet$deferredOrderTime() {
        return this.deferredOrderTime;
    }

    @Override // defpackage.zfc
    public DeliveryFeeLevelsEntity realmGet$delivery() {
        return this.delivery;
    }

    @Override // defpackage.zfc
    public DeliveryAddressEntity realmGet$deliveryAddressEntity() {
        return this.deliveryAddressEntity;
    }

    @Override // defpackage.zfc
    public k0 realmGet$errors() {
        return this.errors;
    }

    @Override // defpackage.zfc
    public int realmGet$expectedMinutesToReceiveForASAP() {
        return this.expectedMinutesToReceiveForASAP;
    }

    @Override // defpackage.zfc
    public Boolean realmGet$isTakeaway() {
        return this.isTakeaway;
    }

    @Override // defpackage.zfc
    public boolean realmGet$isWorkload() {
        return this.isWorkload;
    }

    @Override // defpackage.zfc
    public String realmGet$languageCode() {
        return this.languageCode;
    }

    @Override // defpackage.zfc
    public String realmGet$localityId() {
        return this.localityId;
    }

    @Override // defpackage.zfc
    public double realmGet$minDeliveryPrice() {
        return this.minDeliveryPrice;
    }

    @Override // defpackage.zfc
    public double realmGet$minDeliveryPriceCustomized() {
        return this.minDeliveryPriceCustomized;
    }

    @Override // defpackage.zfc
    public String realmGet$orderPizzeriaId() {
        return this.orderPizzeriaId;
    }

    @Override // defpackage.zfc
    public PackageInfoEntity realmGet$packageInfo() {
        return this.packageInfo;
    }

    @Override // defpackage.zfc
    public PersonalizationEntity realmGet$personalization() {
        return this.personalization;
    }

    @Override // defpackage.zfc
    public int realmGet$pizzeriaAverageServiceTimeMinutes() {
        return this.pizzeriaAverageServiceTimeMinutes;
    }

    @Override // defpackage.zfc
    public String realmGet$placedOrderId() {
        return this.placedOrderId;
    }

    @Override // defpackage.zfc
    public PrizotekaEntity realmGet$prizoteka() {
        return this.prizoteka;
    }

    @Override // defpackage.zfc
    public k0 realmGet$productIdsStopList() {
        return this.productIdsStopList;
    }

    @Override // defpackage.zfc
    public Integer realmGet$step() {
        return this.step;
    }

    @Override // defpackage.zfc
    public Integer realmGet$tableNumber() {
        return this.tableNumber;
    }

    @Override // defpackage.zfc
    public String realmGet$taxPayerId() {
        return this.taxPayerId;
    }

    @Override // defpackage.zfc
    public k0 realmGet$toppingIdsStopList() {
        return this.toppingIdsStopList;
    }

    @Override // defpackage.zfc
    public UpsaleEntity realmGet$upsale() {
        return this.upsale;
    }

    @Override // defpackage.zfc
    public k0 realmGet$warnings() {
        return this.warnings;
    }

    @Override // defpackage.zfc
    public String realmGet$workflowId() {
        return this.workflowId;
    }

    @Override // defpackage.zfc
    public void realmSet$cart(CartEntity cartEntity) {
        this.cart = cartEntity;
    }

    @Override // defpackage.zfc
    public void realmSet$cartError(Integer num) {
        this.cartError = num;
    }

    @Override // defpackage.zfc
    public void realmSet$clientDeliveryLocationEntity(ClientDeliveryLocationEntity clientDeliveryLocationEntity) {
        this.clientDeliveryLocationEntity = clientDeliveryLocationEntity;
    }

    @Override // defpackage.zfc
    public void realmSet$countryCode(Integer num) {
        this.countryCode = num;
    }

    @Override // defpackage.zfc
    public void realmSet$currentOrderType(Integer num) {
        this.currentOrderType = num;
    }

    @Override // defpackage.zfc
    public void realmSet$dataPayment(DataPaymentEntity dataPaymentEntity) {
        this.dataPayment = dataPaymentEntity;
    }

    @Override // defpackage.zfc
    public void realmSet$deferredOrderTime(String str) {
        this.deferredOrderTime = str;
    }

    @Override // defpackage.zfc
    public void realmSet$delivery(DeliveryFeeLevelsEntity deliveryFeeLevelsEntity) {
        this.delivery = deliveryFeeLevelsEntity;
    }

    @Override // defpackage.zfc
    public void realmSet$deliveryAddressEntity(DeliveryAddressEntity deliveryAddressEntity) {
        this.deliveryAddressEntity = deliveryAddressEntity;
    }

    @Override // defpackage.zfc
    public void realmSet$errors(k0 k0Var) {
        this.errors = k0Var;
    }

    @Override // defpackage.zfc
    public void realmSet$expectedMinutesToReceiveForASAP(int i) {
        this.expectedMinutesToReceiveForASAP = i;
    }

    @Override // defpackage.zfc
    public void realmSet$isTakeaway(Boolean bool) {
        this.isTakeaway = bool;
    }

    @Override // defpackage.zfc
    public void realmSet$isWorkload(boolean z) {
        this.isWorkload = z;
    }

    @Override // defpackage.zfc
    public void realmSet$languageCode(String str) {
        this.languageCode = str;
    }

    @Override // defpackage.zfc
    public void realmSet$localityId(String str) {
        this.localityId = str;
    }

    @Override // defpackage.zfc
    public void realmSet$minDeliveryPrice(double d) {
        this.minDeliveryPrice = d;
    }

    @Override // defpackage.zfc
    public void realmSet$minDeliveryPriceCustomized(double d) {
        this.minDeliveryPriceCustomized = d;
    }

    @Override // defpackage.zfc
    public void realmSet$orderPizzeriaId(String str) {
        this.orderPizzeriaId = str;
    }

    @Override // defpackage.zfc
    public void realmSet$packageInfo(PackageInfoEntity packageInfoEntity) {
        this.packageInfo = packageInfoEntity;
    }

    @Override // defpackage.zfc
    public void realmSet$personalization(PersonalizationEntity personalizationEntity) {
        this.personalization = personalizationEntity;
    }

    @Override // defpackage.zfc
    public void realmSet$pizzeriaAverageServiceTimeMinutes(int i) {
        this.pizzeriaAverageServiceTimeMinutes = i;
    }

    @Override // defpackage.zfc
    public void realmSet$placedOrderId(String str) {
        this.placedOrderId = str;
    }

    @Override // defpackage.zfc
    public void realmSet$prizoteka(PrizotekaEntity prizotekaEntity) {
        this.prizoteka = prizotekaEntity;
    }

    @Override // defpackage.zfc
    public void realmSet$productIdsStopList(k0 k0Var) {
        this.productIdsStopList = k0Var;
    }

    @Override // defpackage.zfc
    public void realmSet$step(Integer num) {
        this.step = num;
    }

    @Override // defpackage.zfc
    public void realmSet$tableNumber(Integer num) {
        this.tableNumber = num;
    }

    @Override // defpackage.zfc
    public void realmSet$taxPayerId(String str) {
        this.taxPayerId = str;
    }

    @Override // defpackage.zfc
    public void realmSet$toppingIdsStopList(k0 k0Var) {
        this.toppingIdsStopList = k0Var;
    }

    @Override // defpackage.zfc
    public void realmSet$upsale(UpsaleEntity upsaleEntity) {
        this.upsale = upsaleEntity;
    }

    @Override // defpackage.zfc
    public void realmSet$warnings(k0 k0Var) {
        this.warnings = k0Var;
    }

    @Override // defpackage.zfc
    public void realmSet$workflowId(String str) {
        this.workflowId = str;
    }

    public void setCart(CartEntity cartEntity) {
        realmSet$cart(cartEntity);
    }

    public void setCartError(Integer num) {
        realmSet$cartError(num);
    }

    public void setClientDeliveryLocationEntity(ClientDeliveryLocationEntity clientDeliveryLocationEntity) {
        realmSet$clientDeliveryLocationEntity(clientDeliveryLocationEntity);
    }

    public void setCountryCode(Integer num) {
        realmSet$countryCode(num);
    }

    public void setCurrentOrderType(Integer num) {
        realmSet$currentOrderType(num);
    }

    public void setDataPayment(DataPaymentEntity dataPaymentEntity) {
        realmSet$dataPayment(dataPaymentEntity);
    }

    public void setDeferredOrderTime(String str) {
        realmSet$deferredOrderTime(str);
    }

    public void setDelivery(DeliveryFeeLevelsEntity deliveryFeeLevelsEntity) {
        realmSet$delivery(deliveryFeeLevelsEntity);
    }

    public void setDeliveryAddressEntity(DeliveryAddressEntity deliveryAddressEntity) {
        realmSet$deliveryAddressEntity(deliveryAddressEntity);
    }

    public void setErrors(k0<StateErrorEntity> k0Var) {
        z65.h(k0Var, "<set-?>");
        realmSet$errors(k0Var);
    }

    public void setExpectedMinutesToReceiveForASAP(int i) {
        realmSet$expectedMinutesToReceiveForASAP(i);
    }

    public void setLanguageCode(String str) {
        realmSet$languageCode(str);
    }

    public void setLocalityId(String str) {
        realmSet$localityId(str);
    }

    public void setMinDeliveryPrice(double d) {
        realmSet$minDeliveryPrice(d);
    }

    public void setMinDeliveryPriceCustomized(double d) {
        realmSet$minDeliveryPriceCustomized(d);
    }

    public void setOrderPizzeriaId(String str) {
        realmSet$orderPizzeriaId(str);
    }

    public void setPackageInfo(PackageInfoEntity packageInfoEntity) {
        realmSet$packageInfo(packageInfoEntity);
    }

    public void setPaymentMethods(List<? extends PaymentMethodEntity> list) {
        z65.h(list, "<set-?>");
        this.paymentMethods = list;
    }

    public void setPersonalization(PersonalizationEntity personalizationEntity) {
        realmSet$personalization(personalizationEntity);
    }

    public void setPizzeriaAverageServiceTimeMinutes(int i) {
        realmSet$pizzeriaAverageServiceTimeMinutes(i);
    }

    public void setPlacedOrderId(String str) {
        realmSet$placedOrderId(str);
    }

    public void setPrizoteka(PrizotekaEntity prizotekaEntity) {
        realmSet$prizoteka(prizotekaEntity);
    }

    public void setProductIdsStopList(k0<RealmString> k0Var) {
        z65.h(k0Var, "<set-?>");
        realmSet$productIdsStopList(k0Var);
    }

    public void setStep(Integer num) {
        realmSet$step(num);
    }

    public void setTableNumber(Integer num) {
        realmSet$tableNumber(num);
    }

    public void setTakeaway(Boolean bool) {
        realmSet$isTakeaway(bool);
    }

    public void setTaxPayerId(String str) {
        realmSet$taxPayerId(str);
    }

    public void setToppingIdsStopList(k0<RealmString> k0Var) {
        z65.h(k0Var, "<set-?>");
        realmSet$toppingIdsStopList(k0Var);
    }

    public void setUpsale(UpsaleEntity upsaleEntity) {
        realmSet$upsale(upsaleEntity);
    }

    public void setWarnings(k0<StateWarningEntity> k0Var) {
        z65.h(k0Var, "<set-?>");
        realmSet$warnings(k0Var);
    }

    public void setWorkflowId(String str) {
        z65.h(str, "<set-?>");
        realmSet$workflowId(str);
    }

    public void setWorkload(boolean z) {
        realmSet$isWorkload(z);
    }

    public String toString() {
        Integer num;
        k0<CartItemEntity> cartItems;
        int size;
        String localityId = getLocalityId();
        if (getCart() == null) {
            size = 0;
        } else {
            CartEntity cart = getCart();
            if (cart != null && (cartItems = cart.getCartItems()) != null) {
                size = cartItems.size();
            } else {
                num = null;
                return localityId + ", " + num;
            }
        }
        num = Integer.valueOf(size);
        return localityId + ", " + num;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r64v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r65v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r65v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r66v0, types: [com.dodopizza.persistence.entity.prizoteka.PrizotekaEntity] */
    /* JADX WARN: Type inference failed for: r66v1, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r67v0, types: [com.dodopizza.persistence.entity.personalization.PersonalizationEntity] */
    /* JADX WARN: Type inference failed for: r67v1, types: [com.dodopizza.persistence.entity.prizoteka.PrizotekaEntity] */
    /* JADX WARN: Type inference failed for: r68v0, types: [com.dodopizza.persistence.entity.DeliveryFeeLevelsEntity] */
    /* JADX WARN: Type inference failed for: r68v1, types: [com.dodopizza.persistence.entity.personalization.PersonalizationEntity] */
    /* JADX WARN: Type inference failed for: r69v1, types: [com.dodopizza.persistence.entity.DeliveryFeeLevelsEntity] */
    /* JADX WARN: Type inference failed for: r70v0, types: [com.dodopizza.persistence.entity.PackageInfoEntity] */
    /* JADX WARN: Type inference failed for: r71v1, types: [com.dodopizza.persistence.entity.PackageInfoEntity] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ StateEntity(java.lang.String r37, java.lang.String r38, java.lang.Integer r39, boolean r40, java.lang.String r41, com.dodopizza.persistence.entity.cart.CartEntity r42, java.lang.Integer r43, java.lang.String r44, double r45, double r47, int r49, com.dodopizza.persistence.entity.address.DeliveryAddressEntity r50, com.dodopizza.persistence.entity.deliverylocation.ClientDeliveryLocationEntity r51, java.lang.String r52, java.lang.Integer r53, java.lang.Integer r54, java.lang.String r55, io.realm.k0 r56, io.realm.k0 r57, com.dodopizza.persistence.entity.cart.DataPaymentEntity r58, io.realm.k0 r59, io.realm.k0 r60, com.dodopizza.persistence.entity.cart.UpsaleEntity r61, java.util.List r62, java.lang.Boolean r63, java.lang.String r64, java.lang.Integer r65, com.dodopizza.persistence.entity.prizoteka.PrizotekaEntity r66, com.dodopizza.persistence.entity.personalization.PersonalizationEntity r67, com.dodopizza.persistence.entity.DeliveryFeeLevelsEntity r68, int r69, com.dodopizza.persistence.entity.PackageInfoEntity r70, int r71, kotlin.jvm.internal.DefaultConstructorMarker r72) {
        /*
            Method dump skipped, instructions count: 497
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dodopizza.persistence.entity.cart.StateEntity.<init>(java.lang.String, java.lang.String, java.lang.Integer, boolean, java.lang.String, com.dodopizza.persistence.entity.cart.CartEntity, java.lang.Integer, java.lang.String, double, double, int, com.dodopizza.persistence.entity.address.DeliveryAddressEntity, com.dodopizza.persistence.entity.deliverylocation.ClientDeliveryLocationEntity, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String, io.realm.k0, io.realm.k0, com.dodopizza.persistence.entity.cart.DataPaymentEntity, io.realm.k0, io.realm.k0, com.dodopizza.persistence.entity.cart.UpsaleEntity, java.util.List, java.lang.Boolean, java.lang.String, java.lang.Integer, com.dodopizza.persistence.entity.prizoteka.PrizotekaEntity, com.dodopizza.persistence.entity.personalization.PersonalizationEntity, com.dodopizza.persistence.entity.DeliveryFeeLevelsEntity, int, com.dodopizza.persistence.entity.PackageInfoEntity, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public StateEntity(String str, String str2, Integer num, boolean z, String str3, CartEntity cartEntity, Integer num2, String str4, double d, double d2, int i, DeliveryAddressEntity deliveryAddressEntity, ClientDeliveryLocationEntity clientDeliveryLocationEntity, String str5, Integer num3, Integer num4, String str6, k0<RealmString> k0Var, k0<RealmString> k0Var2, DataPaymentEntity dataPaymentEntity, k0<StateErrorEntity> k0Var3, k0<StateWarningEntity> k0Var4, UpsaleEntity upsaleEntity, List<? extends PaymentMethodEntity> list, Boolean bool, String str7, Integer num5, PrizotekaEntity prizotekaEntity, PersonalizationEntity personalizationEntity, DeliveryFeeLevelsEntity deliveryFeeLevelsEntity, int i2, PackageInfoEntity packageInfoEntity) {
        z65.h(str, UpsaleStateEntity.FIELD_NAME_WORKFLOW_ID);
        z65.h(k0Var, "productIdsStopList");
        z65.h(k0Var2, "toppingIdsStopList");
        z65.h(k0Var3, "errors");
        z65.h(k0Var4, "warnings");
        z65.h(list, "paymentMethods");
        if (this instanceof r89) {
            ((r89) this).b();
        }
        realmSet$workflowId(str);
        realmSet$placedOrderId(str2);
        realmSet$step(num);
        realmSet$isWorkload(z);
        realmSet$orderPizzeriaId(str3);
        realmSet$cart(cartEntity);
        realmSet$cartError(num2);
        realmSet$localityId(str4);
        realmSet$minDeliveryPrice(d);
        realmSet$minDeliveryPriceCustomized(d2);
        realmSet$expectedMinutesToReceiveForASAP(i);
        realmSet$deliveryAddressEntity(deliveryAddressEntity);
        realmSet$clientDeliveryLocationEntity(clientDeliveryLocationEntity);
        realmSet$deferredOrderTime(str5);
        realmSet$countryCode(num3);
        realmSet$currentOrderType(num4);
        realmSet$languageCode(str6);
        realmSet$productIdsStopList(k0Var);
        realmSet$toppingIdsStopList(k0Var2);
        realmSet$dataPayment(dataPaymentEntity);
        realmSet$errors(k0Var3);
        realmSet$warnings(k0Var4);
        realmSet$upsale(upsaleEntity);
        this.paymentMethods = list;
        realmSet$isTakeaway(bool);
        realmSet$taxPayerId(str7);
        realmSet$tableNumber(num5);
        realmSet$prizoteka(prizotekaEntity);
        realmSet$personalization(personalizationEntity);
        realmSet$delivery(deliveryFeeLevelsEntity);
        realmSet$pizzeriaAverageServiceTimeMinutes(i2);
        realmSet$packageInfo(packageInfoEntity);
    }

    public static /* synthetic */ void getCartError$annotations() {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StateEntity(String str, String str2, int i, String str3) {
        this(null, null, null, false, null, null, null, null, 0.0d, 0.0d, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, null, -1, null);
        z65.h(str, UpsaleStateEntity.FIELD_NAME_WORKFLOW_ID);
        z65.h(str3, "languageCode");
        if (this instanceof r89) {
            ((r89) this).b();
        }
        setWorkflowId(str);
        setLocalityId(str2);
        setCountryCode(Integer.valueOf(i));
        setLanguageCode(str3);
    }
}
