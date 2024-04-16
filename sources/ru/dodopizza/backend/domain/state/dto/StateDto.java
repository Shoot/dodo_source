package ru.dodopizza.backend.domain.state.dto;

import com.dodopizza.persistence.entity.UpsaleStateEntity;
import com.dodopizza.persistence.entity.locality.LocalityEntity;
import java.util.List;
import kotlin.Metadata;
import ru.dodopizza.backend.domain.state.dto.cart.CartDto;
import ru.dodopizza.backend.domain.state.dto.deliverylocation.ClientDeliveryLocationDto;
import ru.dodopizza.backend.domain.state.dto.payment.PaymentDataDto;
import ru.dodopizza.backend.domain.state.dto.payment.PaymentMethodDto;
import ru.dodopizza.backend.domain.state.dto.personalization.PersonalizationDto;
import ru.dodopizza.backend.domain.state.dto.tax.TaxPayerDto;
/* compiled from: StateDto.kt */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\\\b\u0086\b\u0018\u00002\u00020\u0001Bé\u0002\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013\u0012\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0013\u0012\b\b\u0002\u0010\u0017\u001a\u00020\r\u0012\b\b\u0002\u0010\u0018\u001a\u00020\r\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u001a\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u001a\u0012\b\b\u0002\u0010\u001c\u001a\u00020\t\u0012\b\b\u0002\u0010\u001d\u001a\u00020\r\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f\u0012\u000e\b\u0002\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u0013\u0012\b\b\u0002\u0010\"\u001a\u00020\r\u0012\b\b\u0002\u0010#\u001a\u00020\t\u0012\b\b\u0002\u0010$\u001a\u00020%\u0012\b\b\u0002\u0010&\u001a\u00020\r\u0012\b\b\u0002\u0010'\u001a\u00020(\u0012\b\b\u0002\u0010)\u001a\u00020*\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010-\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010/\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u000101\u0012\b\b\u0002\u00102\u001a\u00020\t\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u000104¢\u0006\u0002\u00105J\t\u0010j\u001a\u00020\u0003HÆ\u0003J\u000b\u0010k\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000f\u0010l\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013HÆ\u0003J\u000f\u0010m\u001a\b\u0012\u0004\u0012\u00020\u00160\u0013HÆ\u0003J\t\u0010n\u001a\u00020\rHÆ\u0003J\t\u0010o\u001a\u00020\rHÆ\u0003J\t\u0010p\u001a\u00020\u001aHÆ\u0003J\t\u0010q\u001a\u00020\u001aHÆ\u0003J\t\u0010r\u001a\u00020\tHÆ\u0003J\t\u0010s\u001a\u00020\rHÆ\u0003J\u000b\u0010t\u001a\u0004\u0018\u00010\u001fHÆ\u0003J\t\u0010u\u001a\u00020\u0003HÆ\u0003J\u000f\u0010v\u001a\b\u0012\u0004\u0012\u00020!0\u0013HÆ\u0003J\t\u0010w\u001a\u00020\rHÆ\u0003J\t\u0010x\u001a\u00020\tHÆ\u0003J\t\u0010y\u001a\u00020%HÆ\u0003J\t\u0010z\u001a\u00020\rHÆ\u0003J\t\u0010{\u001a\u00020(HÆ\u0003J\t\u0010|\u001a\u00020*HÆ\u0003J\u0010\u0010}\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010bJ\u000b\u0010~\u001a\u0004\u0018\u00010-HÆ\u0003J\u000b\u0010\u007f\u001a\u0004\u0018\u00010/HÆ\u0003J\u0011\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010KJ\f\u0010\u0081\u0001\u001a\u0004\u0018\u000101HÆ\u0003J\n\u0010\u0082\u0001\u001a\u00020\tHÆ\u0003J\f\u0010\u0083\u0001\u001a\u0004\u0018\u000104HÆ\u0003J\n\u0010\u0084\u0001\u001a\u00020\u0007HÆ\u0003J\n\u0010\u0085\u0001\u001a\u00020\tHÆ\u0003J\n\u0010\u0086\u0001\u001a\u00020\tHÆ\u0003J\n\u0010\u0087\u0001\u001a\u00020\tHÆ\u0003J\n\u0010\u0088\u0001\u001a\u00020\rHÆ\u0003J\f\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u000fHÆ\u0003Jô\u0002\u0010\u008a\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00132\b\b\u0002\u0010\u0017\u001a\u00020\r2\b\b\u0002\u0010\u0018\u001a\u00020\r2\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\t2\b\b\u0002\u0010\u001d\u001a\u00020\r2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u000e\b\u0002\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u00132\b\b\u0002\u0010\"\u001a\u00020\r2\b\b\u0002\u0010#\u001a\u00020\t2\b\b\u0002\u0010$\u001a\u00020%2\b\b\u0002\u0010&\u001a\u00020\r2\b\b\u0002\u0010'\u001a\u00020(2\b\b\u0002\u0010)\u001a\u00020*2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010-2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010/2\n\b\u0002\u00100\u001a\u0004\u0018\u0001012\b\b\u0002\u00102\u001a\u00020\t2\n\b\u0002\u00103\u001a\u0004\u0018\u000104HÆ\u0001¢\u0006\u0003\u0010\u008b\u0001J\u0015\u0010\u008c\u0001\u001a\u00020\u00032\t\u0010\u008d\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\n\u0010\u008e\u0001\u001a\u00020\tHÖ\u0001J\n\u0010\u008f\u0001\u001a\u00020\rHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u001c\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b>\u0010?R\u0016\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b@\u0010=R\u0016\u0010\u000b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bA\u0010=R\u0016\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bB\u0010CR\u0018\u00100\u001a\u0004\u0018\u0001018\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bD\u0010ER\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bF\u0010GR\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bH\u0010IR\u0016\u0010\u001c\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010=R\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010L\u001a\u0004\b\u0005\u0010KR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u00107R\u0016\u0010\u0017\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bM\u0010CR\u0016\u0010\u0018\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bN\u0010CR\u0016\u0010\u0019\u001a\u00020\u001a8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bO\u0010PR\u0016\u0010\u001b\u001a\u00020\u001a8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010PR\u0016\u0010\u001d\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bR\u0010CR\u0018\u00103\u001a\u0004\u0018\u0001048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bS\u0010TR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bU\u0010VR\u001c\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u00138\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bW\u0010IR\u0018\u0010.\u001a\u0004\u0018\u00010/8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bX\u0010YR\u0016\u00102\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bZ\u0010=R\u0016\u0010\"\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b[\u0010CR\u0018\u0010,\u001a\u0004\u0018\u00010-8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\\\u0010]R\u0016\u0010#\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b^\u0010=R\u0016\u0010'\u001a\u00020(8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b_\u0010`R\u001a\u0010+\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010c\u001a\u0004\ba\u0010bR\u0016\u0010)\u001a\u00020*8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bd\u0010eR\u0016\u0010$\u001a\u00020%8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bf\u0010gR\u001c\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00138\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bh\u0010IR\u0016\u0010&\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bi\u0010C¨\u0006\u0090\u0001"}, d2 = {"Lru/dodopizza/backend/domain/state/dto/StateDto;", "", "canCheckout", "", "isWorkload", "isTakeaway", "cart", "Lru/dodopizza/backend/domain/state/dto/cart/CartDto;", "cartError", "", LocalityEntity.FIELD_COUNTRY_CODE, "currentOrderType", "deferredOrderDateTime", "", "deliveryAddress", "Lru/dodopizza/backend/domain/state/dto/DeliveryAddressDto;", "clientDeliveryLocation", "Lru/dodopizza/backend/domain/state/dto/deliverylocation/ClientDeliveryLocationDto;", "errors", "", "Lru/dodopizza/backend/domain/state/dto/ErrorDto;", "warnings", "Lru/dodopizza/backend/domain/state/dto/WarningDto;", "languageCode", "localityId", "minDeliveryPrice", "", "minDeliveryPriceCustomized", "expectedMinutesToReceiveForASAP", "orderPizzeriaId", "payment", "Lru/dodopizza/backend/domain/state/dto/payment/PaymentDataDto;", "paymentMethods", "Lru/dodopizza/backend/domain/state/dto/payment/PaymentMethodDto;", "placedOrderId", "step", "upsale", "Lru/dodopizza/backend/domain/state/dto/UpsaleDto;", UpsaleStateEntity.FIELD_NAME_WORKFLOW_ID, "stopLists", "Lru/dodopizza/backend/domain/state/dto/StopListsDto;", "taxpayer", "Lru/dodopizza/backend/domain/state/dto/tax/TaxPayerDto;", "tableNumber", "prizoteka", "Lru/dodopizza/backend/domain/state/dto/PrizotekaDto;", "personalization", "Lru/dodopizza/backend/domain/state/dto/personalization/PersonalizationDto;", "delivery", "Lru/dodopizza/backend/domain/state/dto/DeliveryFeeLevelsDto;", "pizzeriaAverageServiceTimeMinutes", "packageInfo", "Lru/dodopizza/backend/domain/state/dto/PackageInfoDto;", "(ZZLjava/lang/Boolean;Lru/dodopizza/backend/domain/state/dto/cart/CartDto;IIILjava/lang/String;Lru/dodopizza/backend/domain/state/dto/DeliveryAddressDto;Lru/dodopizza/backend/domain/state/dto/deliverylocation/ClientDeliveryLocationDto;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;DDILjava/lang/String;Lru/dodopizza/backend/domain/state/dto/payment/PaymentDataDto;Ljava/util/List;Ljava/lang/String;ILru/dodopizza/backend/domain/state/dto/UpsaleDto;Ljava/lang/String;Lru/dodopizza/backend/domain/state/dto/StopListsDto;Lru/dodopizza/backend/domain/state/dto/tax/TaxPayerDto;Ljava/lang/Integer;Lru/dodopizza/backend/domain/state/dto/PrizotekaDto;Lru/dodopizza/backend/domain/state/dto/personalization/PersonalizationDto;Lru/dodopizza/backend/domain/state/dto/DeliveryFeeLevelsDto;ILru/dodopizza/backend/domain/state/dto/PackageInfoDto;)V", "getCanCheckout", "()Z", "getCart", "()Lru/dodopizza/backend/domain/state/dto/cart/CartDto;", "getCartError$annotations", "()V", "getCartError", "()I", "getClientDeliveryLocation", "()Lru/dodopizza/backend/domain/state/dto/deliverylocation/ClientDeliveryLocationDto;", "getCountryCode", "getCurrentOrderType", "getDeferredOrderDateTime", "()Ljava/lang/String;", "getDelivery", "()Lru/dodopizza/backend/domain/state/dto/DeliveryFeeLevelsDto;", "getDeliveryAddress", "()Lru/dodopizza/backend/domain/state/dto/DeliveryAddressDto;", "getErrors", "()Ljava/util/List;", "getExpectedMinutesToReceiveForASAP", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getLanguageCode", "getLocalityId", "getMinDeliveryPrice", "()D", "getMinDeliveryPriceCustomized", "getOrderPizzeriaId", "getPackageInfo", "()Lru/dodopizza/backend/domain/state/dto/PackageInfoDto;", "getPayment", "()Lru/dodopizza/backend/domain/state/dto/payment/PaymentDataDto;", "getPaymentMethods", "getPersonalization", "()Lru/dodopizza/backend/domain/state/dto/personalization/PersonalizationDto;", "getPizzeriaAverageServiceTimeMinutes", "getPlacedOrderId", "getPrizoteka", "()Lru/dodopizza/backend/domain/state/dto/PrizotekaDto;", "getStep", "getStopLists", "()Lru/dodopizza/backend/domain/state/dto/StopListsDto;", "getTableNumber", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTaxpayer", "()Lru/dodopizza/backend/domain/state/dto/tax/TaxPayerDto;", "getUpsale", "()Lru/dodopizza/backend/domain/state/dto/UpsaleDto;", "getWarnings", "getWorkflowId", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(ZZLjava/lang/Boolean;Lru/dodopizza/backend/domain/state/dto/cart/CartDto;IIILjava/lang/String;Lru/dodopizza/backend/domain/state/dto/DeliveryAddressDto;Lru/dodopizza/backend/domain/state/dto/deliverylocation/ClientDeliveryLocationDto;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;DDILjava/lang/String;Lru/dodopizza/backend/domain/state/dto/payment/PaymentDataDto;Ljava/util/List;Ljava/lang/String;ILru/dodopizza/backend/domain/state/dto/UpsaleDto;Ljava/lang/String;Lru/dodopizza/backend/domain/state/dto/StopListsDto;Lru/dodopizza/backend/domain/state/dto/tax/TaxPayerDto;Ljava/lang/Integer;Lru/dodopizza/backend/domain/state/dto/PrizotekaDto;Lru/dodopizza/backend/domain/state/dto/personalization/PersonalizationDto;Lru/dodopizza/backend/domain/state/dto/DeliveryFeeLevelsDto;ILru/dodopizza/backend/domain/state/dto/PackageInfoDto;)Lru/dodopizza/backend/domain/state/dto/StateDto;", "equals", "other", "hashCode", "toString", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class StateDto {
    @uca("canCheckout")
    private final boolean canCheckout;
    @uca("cart")
    private final CartDto cart;
    @uca("cartError")
    private final int cartError;
    @uca("clientDeliveryLocation")
    private final ClientDeliveryLocationDto clientDeliveryLocation;
    @uca(LocalityEntity.FIELD_COUNTRY_CODE)
    private final int countryCode;
    @uca("currentOrderType")
    private final int currentOrderType;
    @uca("deferredOrderDateTime")
    private final String deferredOrderDateTime;
    @uca("delivery")
    private final DeliveryFeeLevelsDto delivery;
    @uca("deliveryAddress")
    private final DeliveryAddressDto deliveryAddress;
    @uca("errors")
    private final List<ErrorDto> errors;
    @uca("expectedMinutesToReceiveForAsap")
    private final int expectedMinutesToReceiveForASAP;
    @uca("isTakeaway")
    private final Boolean isTakeaway;
    @uca("overloadMode")
    private final boolean isWorkload;
    @uca("languageCode")
    private final String languageCode;
    @uca("localityId")
    private final String localityId;
    @uca("minDeliveryPrice")
    private final double minDeliveryPrice;
    @uca("minDeliveryPriceCustomized")
    private final double minDeliveryPriceCustomized;
    @uca("orderPizzeriaId")
    private final String orderPizzeriaId;
    @uca("package")
    private final PackageInfoDto packageInfo;
    @uca("payment")
    private final PaymentDataDto payment;
    @uca("paymentMethods")
    private final List<PaymentMethodDto> paymentMethods;
    @uca("personalization")
    private final PersonalizationDto personalization;
    @uca("pizzeriaAverageServiceTimeMinutes")
    private final int pizzeriaAverageServiceTimeMinutes;
    @uca("placedOrderId")
    private final String placedOrderId;
    @uca("niceBonus")
    private final PrizotekaDto prizoteka;
    @uca("step")
    private final int step;
    @uca("stopLists")
    private final StopListsDto stopLists;
    @uca("tableNumber")
    private final Integer tableNumber;
    @uca("taxpayer")
    private final TaxPayerDto taxpayer;
    @uca("upsale")
    private final UpsaleDto upsale;
    @uca("warnings")
    private final List<WarningDto> warnings;
    @uca(UpsaleStateEntity.FIELD_NAME_WORKFLOW_ID)
    private final String workflowId;

    public StateDto() {
        this(false, false, null, null, 0, 0, 0, null, null, null, null, null, null, null, 0.0d, 0.0d, 0, null, null, null, null, 0, null, null, null, null, null, null, null, null, 0, null, -1, null);
    }

    public final boolean component1() {
        return this.canCheckout;
    }

    public final ClientDeliveryLocationDto component10() {
        return this.clientDeliveryLocation;
    }

    public final List<ErrorDto> component11() {
        return this.errors;
    }

    public final List<WarningDto> component12() {
        return this.warnings;
    }

    public final String component13() {
        return this.languageCode;
    }

    public final String component14() {
        return this.localityId;
    }

    public final double component15() {
        return this.minDeliveryPrice;
    }

    public final double component16() {
        return this.minDeliveryPriceCustomized;
    }

    public final int component17() {
        return this.expectedMinutesToReceiveForASAP;
    }

    public final String component18() {
        return this.orderPizzeriaId;
    }

    public final PaymentDataDto component19() {
        return this.payment;
    }

    public final boolean component2() {
        return this.isWorkload;
    }

    public final List<PaymentMethodDto> component20() {
        return this.paymentMethods;
    }

    public final String component21() {
        return this.placedOrderId;
    }

    public final int component22() {
        return this.step;
    }

    public final UpsaleDto component23() {
        return this.upsale;
    }

    public final String component24() {
        return this.workflowId;
    }

    public final StopListsDto component25() {
        return this.stopLists;
    }

    public final TaxPayerDto component26() {
        return this.taxpayer;
    }

    public final Integer component27() {
        return this.tableNumber;
    }

    public final PrizotekaDto component28() {
        return this.prizoteka;
    }

    public final PersonalizationDto component29() {
        return this.personalization;
    }

    public final Boolean component3() {
        return this.isTakeaway;
    }

    public final DeliveryFeeLevelsDto component30() {
        return this.delivery;
    }

    public final int component31() {
        return this.pizzeriaAverageServiceTimeMinutes;
    }

    public final PackageInfoDto component32() {
        return this.packageInfo;
    }

    public final CartDto component4() {
        return this.cart;
    }

    public final int component5() {
        return this.cartError;
    }

    public final int component6() {
        return this.countryCode;
    }

    public final int component7() {
        return this.currentOrderType;
    }

    public final String component8() {
        return this.deferredOrderDateTime;
    }

    public final DeliveryAddressDto component9() {
        return this.deliveryAddress;
    }

    public final StateDto copy(boolean z, boolean z2, Boolean bool, CartDto cartDto, int i, int i2, int i3, String str, DeliveryAddressDto deliveryAddressDto, ClientDeliveryLocationDto clientDeliveryLocationDto, List<ErrorDto> list, List<WarningDto> list2, String str2, String str3, double d, double d2, int i4, String str4, PaymentDataDto paymentDataDto, List<PaymentMethodDto> list3, String str5, int i5, UpsaleDto upsaleDto, String str6, StopListsDto stopListsDto, TaxPayerDto taxPayerDto, Integer num, PrizotekaDto prizotekaDto, PersonalizationDto personalizationDto, DeliveryFeeLevelsDto deliveryFeeLevelsDto, int i6, PackageInfoDto packageInfoDto) {
        z65.h(cartDto, "cart");
        z65.h(str, "deferredOrderDateTime");
        z65.h(list, "errors");
        z65.h(list2, "warnings");
        z65.h(str2, "languageCode");
        z65.h(str3, "localityId");
        z65.h(str4, "orderPizzeriaId");
        z65.h(list3, "paymentMethods");
        z65.h(str5, "placedOrderId");
        z65.h(upsaleDto, "upsale");
        z65.h(str6, UpsaleStateEntity.FIELD_NAME_WORKFLOW_ID);
        z65.h(stopListsDto, "stopLists");
        z65.h(taxPayerDto, "taxpayer");
        return new StateDto(z, z2, bool, cartDto, i, i2, i3, str, deliveryAddressDto, clientDeliveryLocationDto, list, list2, str2, str3, d, d2, i4, str4, paymentDataDto, list3, str5, i5, upsaleDto, str6, stopListsDto, taxPayerDto, num, prizotekaDto, personalizationDto, deliveryFeeLevelsDto, i6, packageInfoDto);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StateDto)) {
            return false;
        }
        StateDto stateDto = (StateDto) obj;
        if (this.canCheckout == stateDto.canCheckout && this.isWorkload == stateDto.isWorkload && z65.c(this.isTakeaway, stateDto.isTakeaway) && z65.c(this.cart, stateDto.cart) && this.cartError == stateDto.cartError && this.countryCode == stateDto.countryCode && this.currentOrderType == stateDto.currentOrderType && z65.c(this.deferredOrderDateTime, stateDto.deferredOrderDateTime) && z65.c(this.deliveryAddress, stateDto.deliveryAddress) && z65.c(this.clientDeliveryLocation, stateDto.clientDeliveryLocation) && z65.c(this.errors, stateDto.errors) && z65.c(this.warnings, stateDto.warnings) && z65.c(this.languageCode, stateDto.languageCode) && z65.c(this.localityId, stateDto.localityId) && Double.compare(this.minDeliveryPrice, stateDto.minDeliveryPrice) == 0 && Double.compare(this.minDeliveryPriceCustomized, stateDto.minDeliveryPriceCustomized) == 0 && this.expectedMinutesToReceiveForASAP == stateDto.expectedMinutesToReceiveForASAP && z65.c(this.orderPizzeriaId, stateDto.orderPizzeriaId) && z65.c(this.payment, stateDto.payment) && z65.c(this.paymentMethods, stateDto.paymentMethods) && z65.c(this.placedOrderId, stateDto.placedOrderId) && this.step == stateDto.step && z65.c(this.upsale, stateDto.upsale) && z65.c(this.workflowId, stateDto.workflowId) && z65.c(this.stopLists, stateDto.stopLists) && z65.c(this.taxpayer, stateDto.taxpayer) && z65.c(this.tableNumber, stateDto.tableNumber) && z65.c(this.prizoteka, stateDto.prizoteka) && z65.c(this.personalization, stateDto.personalization) && z65.c(this.delivery, stateDto.delivery) && this.pizzeriaAverageServiceTimeMinutes == stateDto.pizzeriaAverageServiceTimeMinutes && z65.c(this.packageInfo, stateDto.packageInfo)) {
            return true;
        }
        return false;
    }

    public final boolean getCanCheckout() {
        return this.canCheckout;
    }

    public final CartDto getCart() {
        return this.cart;
    }

    public final int getCartError() {
        return this.cartError;
    }

    public final ClientDeliveryLocationDto getClientDeliveryLocation() {
        return this.clientDeliveryLocation;
    }

    public final int getCountryCode() {
        return this.countryCode;
    }

    public final int getCurrentOrderType() {
        return this.currentOrderType;
    }

    public final String getDeferredOrderDateTime() {
        return this.deferredOrderDateTime;
    }

    public final DeliveryFeeLevelsDto getDelivery() {
        return this.delivery;
    }

    public final DeliveryAddressDto getDeliveryAddress() {
        return this.deliveryAddress;
    }

    public final List<ErrorDto> getErrors() {
        return this.errors;
    }

    public final int getExpectedMinutesToReceiveForASAP() {
        return this.expectedMinutesToReceiveForASAP;
    }

    public final String getLanguageCode() {
        return this.languageCode;
    }

    public final String getLocalityId() {
        return this.localityId;
    }

    public final double getMinDeliveryPrice() {
        return this.minDeliveryPrice;
    }

    public final double getMinDeliveryPriceCustomized() {
        return this.minDeliveryPriceCustomized;
    }

    public final String getOrderPizzeriaId() {
        return this.orderPizzeriaId;
    }

    public final PackageInfoDto getPackageInfo() {
        return this.packageInfo;
    }

    public final PaymentDataDto getPayment() {
        return this.payment;
    }

    public final List<PaymentMethodDto> getPaymentMethods() {
        return this.paymentMethods;
    }

    public final PersonalizationDto getPersonalization() {
        return this.personalization;
    }

    public final int getPizzeriaAverageServiceTimeMinutes() {
        return this.pizzeriaAverageServiceTimeMinutes;
    }

    public final String getPlacedOrderId() {
        return this.placedOrderId;
    }

    public final PrizotekaDto getPrizoteka() {
        return this.prizoteka;
    }

    public final int getStep() {
        return this.step;
    }

    public final StopListsDto getStopLists() {
        return this.stopLists;
    }

    public final Integer getTableNumber() {
        return this.tableNumber;
    }

    public final TaxPayerDto getTaxpayer() {
        return this.taxpayer;
    }

    public final UpsaleDto getUpsale() {
        return this.upsale;
    }

    public final List<WarningDto> getWarnings() {
        return this.warnings;
    }

    public final String getWorkflowId() {
        return this.workflowId;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int a = ((a91.a(this.canCheckout) * 31) + a91.a(this.isWorkload)) * 31;
        Boolean bool = this.isTakeaway;
        int i = 0;
        if (bool == null) {
            hashCode = 0;
        } else {
            hashCode = bool.hashCode();
        }
        int hashCode9 = (((((((((((a + hashCode) * 31) + this.cart.hashCode()) * 31) + this.cartError) * 31) + this.countryCode) * 31) + this.currentOrderType) * 31) + this.deferredOrderDateTime.hashCode()) * 31;
        DeliveryAddressDto deliveryAddressDto = this.deliveryAddress;
        if (deliveryAddressDto == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = deliveryAddressDto.hashCode();
        }
        int i2 = (hashCode9 + hashCode2) * 31;
        ClientDeliveryLocationDto clientDeliveryLocationDto = this.clientDeliveryLocation;
        if (clientDeliveryLocationDto == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = clientDeliveryLocationDto.hashCode();
        }
        int hashCode10 = (((((((((((((((((i2 + hashCode3) * 31) + this.errors.hashCode()) * 31) + this.warnings.hashCode()) * 31) + this.languageCode.hashCode()) * 31) + this.localityId.hashCode()) * 31) + nkb.a(this.minDeliveryPrice)) * 31) + nkb.a(this.minDeliveryPriceCustomized)) * 31) + this.expectedMinutesToReceiveForASAP) * 31) + this.orderPizzeriaId.hashCode()) * 31;
        PaymentDataDto paymentDataDto = this.payment;
        if (paymentDataDto == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = paymentDataDto.hashCode();
        }
        int hashCode11 = (((((((((((((((hashCode10 + hashCode4) * 31) + this.paymentMethods.hashCode()) * 31) + this.placedOrderId.hashCode()) * 31) + this.step) * 31) + this.upsale.hashCode()) * 31) + this.workflowId.hashCode()) * 31) + this.stopLists.hashCode()) * 31) + this.taxpayer.hashCode()) * 31;
        Integer num = this.tableNumber;
        if (num == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = num.hashCode();
        }
        int i3 = (hashCode11 + hashCode5) * 31;
        PrizotekaDto prizotekaDto = this.prizoteka;
        if (prizotekaDto == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = prizotekaDto.hashCode();
        }
        int i4 = (i3 + hashCode6) * 31;
        PersonalizationDto personalizationDto = this.personalization;
        if (personalizationDto == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = personalizationDto.hashCode();
        }
        int i5 = (i4 + hashCode7) * 31;
        DeliveryFeeLevelsDto deliveryFeeLevelsDto = this.delivery;
        if (deliveryFeeLevelsDto == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = deliveryFeeLevelsDto.hashCode();
        }
        int i6 = (((i5 + hashCode8) * 31) + this.pizzeriaAverageServiceTimeMinutes) * 31;
        PackageInfoDto packageInfoDto = this.packageInfo;
        if (packageInfoDto != null) {
            i = packageInfoDto.hashCode();
        }
        return i6 + i;
    }

    public final Boolean isTakeaway() {
        return this.isTakeaway;
    }

    public final boolean isWorkload() {
        return this.isWorkload;
    }

    public String toString() {
        boolean z = this.canCheckout;
        boolean z2 = this.isWorkload;
        Boolean bool = this.isTakeaway;
        CartDto cartDto = this.cart;
        int i = this.cartError;
        int i2 = this.countryCode;
        int i3 = this.currentOrderType;
        String str = this.deferredOrderDateTime;
        DeliveryAddressDto deliveryAddressDto = this.deliveryAddress;
        ClientDeliveryLocationDto clientDeliveryLocationDto = this.clientDeliveryLocation;
        List<ErrorDto> list = this.errors;
        List<WarningDto> list2 = this.warnings;
        String str2 = this.languageCode;
        String str3 = this.localityId;
        double d = this.minDeliveryPrice;
        double d2 = this.minDeliveryPriceCustomized;
        int i4 = this.expectedMinutesToReceiveForASAP;
        String str4 = this.orderPizzeriaId;
        PaymentDataDto paymentDataDto = this.payment;
        List<PaymentMethodDto> list3 = this.paymentMethods;
        String str5 = this.placedOrderId;
        int i5 = this.step;
        UpsaleDto upsaleDto = this.upsale;
        String str6 = this.workflowId;
        StopListsDto stopListsDto = this.stopLists;
        TaxPayerDto taxPayerDto = this.taxpayer;
        Integer num = this.tableNumber;
        PrizotekaDto prizotekaDto = this.prizoteka;
        PersonalizationDto personalizationDto = this.personalization;
        DeliveryFeeLevelsDto deliveryFeeLevelsDto = this.delivery;
        int i6 = this.pizzeriaAverageServiceTimeMinutes;
        PackageInfoDto packageInfoDto = this.packageInfo;
        return "StateDto(canCheckout=" + z + ", isWorkload=" + z2 + ", isTakeaway=" + bool + ", cart=" + cartDto + ", cartError=" + i + ", countryCode=" + i2 + ", currentOrderType=" + i3 + ", deferredOrderDateTime=" + str + ", deliveryAddress=" + deliveryAddressDto + ", clientDeliveryLocation=" + clientDeliveryLocationDto + ", errors=" + list + ", warnings=" + list2 + ", languageCode=" + str2 + ", localityId=" + str3 + ", minDeliveryPrice=" + d + ", minDeliveryPriceCustomized=" + d2 + ", expectedMinutesToReceiveForASAP=" + i4 + ", orderPizzeriaId=" + str4 + ", payment=" + paymentDataDto + ", paymentMethods=" + list3 + ", placedOrderId=" + str5 + ", step=" + i5 + ", upsale=" + upsaleDto + ", workflowId=" + str6 + ", stopLists=" + stopListsDto + ", taxpayer=" + taxPayerDto + ", tableNumber=" + num + ", prizoteka=" + prizotekaDto + ", personalization=" + personalizationDto + ", delivery=" + deliveryFeeLevelsDto + ", pizzeriaAverageServiceTimeMinutes=" + i6 + ", packageInfo=" + packageInfoDto + ")";
    }

    public StateDto(boolean z, boolean z2, Boolean bool, CartDto cartDto, int i, int i2, int i3, String str, DeliveryAddressDto deliveryAddressDto, ClientDeliveryLocationDto clientDeliveryLocationDto, List<ErrorDto> list, List<WarningDto> list2, String str2, String str3, double d, double d2, int i4, String str4, PaymentDataDto paymentDataDto, List<PaymentMethodDto> list3, String str5, int i5, UpsaleDto upsaleDto, String str6, StopListsDto stopListsDto, TaxPayerDto taxPayerDto, Integer num, PrizotekaDto prizotekaDto, PersonalizationDto personalizationDto, DeliveryFeeLevelsDto deliveryFeeLevelsDto, int i6, PackageInfoDto packageInfoDto) {
        z65.h(cartDto, "cart");
        z65.h(str, "deferredOrderDateTime");
        z65.h(list, "errors");
        z65.h(list2, "warnings");
        z65.h(str2, "languageCode");
        z65.h(str3, "localityId");
        z65.h(str4, "orderPizzeriaId");
        z65.h(list3, "paymentMethods");
        z65.h(str5, "placedOrderId");
        z65.h(upsaleDto, "upsale");
        z65.h(str6, UpsaleStateEntity.FIELD_NAME_WORKFLOW_ID);
        z65.h(stopListsDto, "stopLists");
        z65.h(taxPayerDto, "taxpayer");
        this.canCheckout = z;
        this.isWorkload = z2;
        this.isTakeaway = bool;
        this.cart = cartDto;
        this.cartError = i;
        this.countryCode = i2;
        this.currentOrderType = i3;
        this.deferredOrderDateTime = str;
        this.deliveryAddress = deliveryAddressDto;
        this.clientDeliveryLocation = clientDeliveryLocationDto;
        this.errors = list;
        this.warnings = list2;
        this.languageCode = str2;
        this.localityId = str3;
        this.minDeliveryPrice = d;
        this.minDeliveryPriceCustomized = d2;
        this.expectedMinutesToReceiveForASAP = i4;
        this.orderPizzeriaId = str4;
        this.payment = paymentDataDto;
        this.paymentMethods = list3;
        this.placedOrderId = str5;
        this.step = i5;
        this.upsale = upsaleDto;
        this.workflowId = str6;
        this.stopLists = stopListsDto;
        this.taxpayer = taxPayerDto;
        this.tableNumber = num;
        this.prizoteka = prizotekaDto;
        this.personalization = personalizationDto;
        this.delivery = deliveryFeeLevelsDto;
        this.pizzeriaAverageServiceTimeMinutes = i6;
        this.packageInfo = packageInfoDto;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [kotlin.jvm.internal.DefaultConstructorMarker, java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ StateDto(boolean r37, boolean r38, java.lang.Boolean r39, ru.dodopizza.backend.domain.state.dto.cart.CartDto r40, int r41, int r42, int r43, java.lang.String r44, ru.dodopizza.backend.domain.state.dto.DeliveryAddressDto r45, ru.dodopizza.backend.domain.state.dto.deliverylocation.ClientDeliveryLocationDto r46, java.util.List r47, java.util.List r48, java.lang.String r49, java.lang.String r50, double r51, double r53, int r55, java.lang.String r56, ru.dodopizza.backend.domain.state.dto.payment.PaymentDataDto r57, java.util.List r58, java.lang.String r59, int r60, ru.dodopizza.backend.domain.state.dto.UpsaleDto r61, java.lang.String r62, ru.dodopizza.backend.domain.state.dto.StopListsDto r63, ru.dodopizza.backend.domain.state.dto.tax.TaxPayerDto r64, java.lang.Integer r65, ru.dodopizza.backend.domain.state.dto.PrizotekaDto r66, ru.dodopizza.backend.domain.state.dto.personalization.PersonalizationDto r67, ru.dodopizza.backend.domain.state.dto.DeliveryFeeLevelsDto r68, int r69, ru.dodopizza.backend.domain.state.dto.PackageInfoDto r70, int r71, kotlin.jvm.internal.DefaultConstructorMarker r72) {
        /*
            Method dump skipped, instructions count: 435
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.dodopizza.backend.domain.state.dto.StateDto.<init>(boolean, boolean, java.lang.Boolean, ru.dodopizza.backend.domain.state.dto.cart.CartDto, int, int, int, java.lang.String, ru.dodopizza.backend.domain.state.dto.DeliveryAddressDto, ru.dodopizza.backend.domain.state.dto.deliverylocation.ClientDeliveryLocationDto, java.util.List, java.util.List, java.lang.String, java.lang.String, double, double, int, java.lang.String, ru.dodopizza.backend.domain.state.dto.payment.PaymentDataDto, java.util.List, java.lang.String, int, ru.dodopizza.backend.domain.state.dto.UpsaleDto, java.lang.String, ru.dodopizza.backend.domain.state.dto.StopListsDto, ru.dodopizza.backend.domain.state.dto.tax.TaxPayerDto, java.lang.Integer, ru.dodopizza.backend.domain.state.dto.PrizotekaDto, ru.dodopizza.backend.domain.state.dto.personalization.PersonalizationDto, ru.dodopizza.backend.domain.state.dto.DeliveryFeeLevelsDto, int, ru.dodopizza.backend.domain.state.dto.PackageInfoDto, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public static /* synthetic */ void getCartError$annotations() {
    }
}
