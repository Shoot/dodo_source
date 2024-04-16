package ru.dodopizza.backend.domain.cart.dto;

import kotlin.Metadata;
import ru.dodopizza.backend.domain.order.dto.DataOrderDto;
import ru.dodopizza.backend.domain.state.dto.StateDto;
/* compiled from: OrderResponseDto.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lru/dodopizza/backend/domain/cart/dto/OrderResponseDto;", "", "state", "Lru/dodopizza/backend/domain/state/dto/StateDto;", "createdOrder", "Lru/dodopizza/backend/domain/order/dto/DataOrderDto;", "(Lru/dodopizza/backend/domain/state/dto/StateDto;Lru/dodopizza/backend/domain/order/dto/DataOrderDto;)V", "getCreatedOrder", "()Lru/dodopizza/backend/domain/order/dto/DataOrderDto;", "getState", "()Lru/dodopizza/backend/domain/state/dto/StateDto;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OrderResponseDto {
    @uca("createdOrder")
    private final DataOrderDto createdOrder;
    @uca("state")
    private final StateDto state;

    public OrderResponseDto(StateDto stateDto, DataOrderDto dataOrderDto) {
        z65.h(stateDto, "state");
        this.state = stateDto;
        this.createdOrder = dataOrderDto;
    }

    public static /* synthetic */ OrderResponseDto copy$default(OrderResponseDto orderResponseDto, StateDto stateDto, DataOrderDto dataOrderDto, int i, Object obj) {
        if ((i & 1) != 0) {
            stateDto = orderResponseDto.state;
        }
        if ((i & 2) != 0) {
            dataOrderDto = orderResponseDto.createdOrder;
        }
        return orderResponseDto.copy(stateDto, dataOrderDto);
    }

    public final StateDto component1() {
        return this.state;
    }

    public final DataOrderDto component2() {
        return this.createdOrder;
    }

    public final OrderResponseDto copy(StateDto stateDto, DataOrderDto dataOrderDto) {
        z65.h(stateDto, "state");
        return new OrderResponseDto(stateDto, dataOrderDto);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderResponseDto)) {
            return false;
        }
        OrderResponseDto orderResponseDto = (OrderResponseDto) obj;
        if (z65.c(this.state, orderResponseDto.state) && z65.c(this.createdOrder, orderResponseDto.createdOrder)) {
            return true;
        }
        return false;
    }

    public final DataOrderDto getCreatedOrder() {
        return this.createdOrder;
    }

    public final StateDto getState() {
        return this.state;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.state.hashCode() * 31;
        DataOrderDto dataOrderDto = this.createdOrder;
        if (dataOrderDto == null) {
            hashCode = 0;
        } else {
            hashCode = dataOrderDto.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public String toString() {
        StateDto stateDto = this.state;
        DataOrderDto dataOrderDto = this.createdOrder;
        return "OrderResponseDto(state=" + stateDto + ", createdOrder=" + dataOrderDto + ")";
    }
}
