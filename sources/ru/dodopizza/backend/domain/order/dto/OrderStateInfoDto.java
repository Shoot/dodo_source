package ru.dodopizza.backend.domain.order.dto;

import kotlin.Metadata;
/* compiled from: OrderStateInfoDto.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lru/dodopizza/backend/domain/order/dto/OrderStateInfoDto;", "", "state", "", "totalBars", "finishedBars", "(III)V", "getFinishedBars", "()I", "getState", "getTotalBars", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OrderStateInfoDto {
    @uca("finishedBars")
    private final int finishedBars;
    @uca("state")
    private final int state;
    @uca("totalBars")
    private final int totalBars;

    public OrderStateInfoDto(int i, int i2, int i3) {
        this.state = i;
        this.totalBars = i2;
        this.finishedBars = i3;
    }

    public static /* synthetic */ OrderStateInfoDto copy$default(OrderStateInfoDto orderStateInfoDto, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = orderStateInfoDto.state;
        }
        if ((i4 & 2) != 0) {
            i2 = orderStateInfoDto.totalBars;
        }
        if ((i4 & 4) != 0) {
            i3 = orderStateInfoDto.finishedBars;
        }
        return orderStateInfoDto.copy(i, i2, i3);
    }

    public final int component1() {
        return this.state;
    }

    public final int component2() {
        return this.totalBars;
    }

    public final int component3() {
        return this.finishedBars;
    }

    public final OrderStateInfoDto copy(int i, int i2, int i3) {
        return new OrderStateInfoDto(i, i2, i3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderStateInfoDto)) {
            return false;
        }
        OrderStateInfoDto orderStateInfoDto = (OrderStateInfoDto) obj;
        if (this.state == orderStateInfoDto.state && this.totalBars == orderStateInfoDto.totalBars && this.finishedBars == orderStateInfoDto.finishedBars) {
            return true;
        }
        return false;
    }

    public final int getFinishedBars() {
        return this.finishedBars;
    }

    public final int getState() {
        return this.state;
    }

    public final int getTotalBars() {
        return this.totalBars;
    }

    public int hashCode() {
        return (((this.state * 31) + this.totalBars) * 31) + this.finishedBars;
    }

    public String toString() {
        int i = this.state;
        int i2 = this.totalBars;
        int i3 = this.finishedBars;
        return "OrderStateInfoDto(state=" + i + ", totalBars=" + i2 + ", finishedBars=" + i3 + ")";
    }
}
