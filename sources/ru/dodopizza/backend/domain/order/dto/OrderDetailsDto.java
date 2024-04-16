package ru.dodopizza.backend.domain.order.dto;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: OrderDetailsDto.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nR\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/dodopizza/backend/domain/order/dto/OrderDetailsDto;", "", "deliveryInfo", "Lru/dodopizza/backend/domain/order/dto/DeliveryInfoDto;", "paymentInfo", "Lru/dodopizza/backend/domain/order/dto/PaymentInfoDto;", "clientName", "", "browserInfo", "Lru/dodopizza/backend/domain/order/dto/BrowserInfoDto;", "(Lru/dodopizza/backend/domain/order/dto/DeliveryInfoDto;Lru/dodopizza/backend/domain/order/dto/PaymentInfoDto;Ljava/lang/String;Lru/dodopizza/backend/domain/order/dto/BrowserInfoDto;)V", "getBrowserInfo", "()Lru/dodopizza/backend/domain/order/dto/BrowserInfoDto;", "getClientName", "()Ljava/lang/String;", "getDeliveryInfo", "()Lru/dodopizza/backend/domain/order/dto/DeliveryInfoDto;", "getPaymentInfo", "()Lru/dodopizza/backend/domain/order/dto/PaymentInfoDto;", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OrderDetailsDto {
    @uca("browserInfo")
    private final BrowserInfoDto browserInfo;
    @uca("clientName")
    private final String clientName;
    @uca("deliveryInfo")
    private final DeliveryInfoDto deliveryInfo;
    @uca("paymentInfo")
    private final PaymentInfoDto paymentInfo;

    public OrderDetailsDto(DeliveryInfoDto deliveryInfoDto, PaymentInfoDto paymentInfoDto, String str, BrowserInfoDto browserInfoDto) {
        z65.h(deliveryInfoDto, "deliveryInfo");
        z65.h(paymentInfoDto, "paymentInfo");
        z65.h(str, "clientName");
        this.deliveryInfo = deliveryInfoDto;
        this.paymentInfo = paymentInfoDto;
        this.clientName = str;
        this.browserInfo = browserInfoDto;
    }

    public final BrowserInfoDto getBrowserInfo() {
        return this.browserInfo;
    }

    public final String getClientName() {
        return this.clientName;
    }

    public final DeliveryInfoDto getDeliveryInfo() {
        return this.deliveryInfo;
    }

    public final PaymentInfoDto getPaymentInfo() {
        return this.paymentInfo;
    }

    public /* synthetic */ OrderDetailsDto(DeliveryInfoDto deliveryInfoDto, PaymentInfoDto paymentInfoDto, String str, BrowserInfoDto browserInfoDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(deliveryInfoDto, paymentInfoDto, str, (i & 8) != 0 ? null : browserInfoDto);
    }
}
