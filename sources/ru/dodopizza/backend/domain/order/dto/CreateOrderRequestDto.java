package ru.dodopizza.backend.domain.order.dto;

import kotlin.Metadata;
/* compiled from: CreateOrderRequestDto.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/dodopizza/backend/domain/order/dto/CreateOrderRequestDto;", "", "stateId", "", "orderDetails", "Lru/dodopizza/backend/domain/order/dto/OrderDetailsDto;", "orderPersonalization", "Lru/dodopizza/backend/domain/order/dto/OrderPersonalization;", "(Ljava/lang/String;Lru/dodopizza/backend/domain/order/dto/OrderDetailsDto;Lru/dodopizza/backend/domain/order/dto/OrderPersonalization;)V", "getOrderDetails", "()Lru/dodopizza/backend/domain/order/dto/OrderDetailsDto;", "getOrderPersonalization", "()Lru/dodopizza/backend/domain/order/dto/OrderPersonalization;", "getStateId", "()Ljava/lang/String;", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CreateOrderRequestDto {
    @uca("orderDetails")
    private final OrderDetailsDto orderDetails;
    @uca("orderPersonalization")
    private final OrderPersonalization orderPersonalization;
    @uca("stateId")
    private final String stateId;

    public CreateOrderRequestDto(String str, OrderDetailsDto orderDetailsDto, OrderPersonalization orderPersonalization) {
        z65.h(str, "stateId");
        z65.h(orderDetailsDto, "orderDetails");
        z65.h(orderPersonalization, "orderPersonalization");
        this.stateId = str;
        this.orderDetails = orderDetailsDto;
        this.orderPersonalization = orderPersonalization;
    }

    public final OrderDetailsDto getOrderDetails() {
        return this.orderDetails;
    }

    public final OrderPersonalization getOrderPersonalization() {
        return this.orderPersonalization;
    }

    public final String getStateId() {
        return this.stateId;
    }
}
