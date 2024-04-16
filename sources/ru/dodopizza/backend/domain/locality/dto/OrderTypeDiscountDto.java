package ru.dodopizza.backend.domain.locality.dto;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: OrderTypeDiscountDto.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003J5\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0006HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u0019"}, d2 = {"Lru/dodopizza/backend/domain/locality/dto/OrderTypeDiscountDto;", "", "carryout", "", "restaurant", "carryoutText", "", "restaurantText", "(IILjava/lang/String;Ljava/lang/String;)V", "getCarryout", "()I", "getCarryoutText", "()Ljava/lang/String;", "getRestaurant", "getRestaurantText", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OrderTypeDiscountDto {
    @uca("carryout")
    private final int carryout;
    @uca("carryoutText")
    private final String carryoutText;
    @uca("restaurant")
    private final int restaurant;
    @uca("restaurantText")
    private final String restaurantText;

    public OrderTypeDiscountDto(int i, int i2, String str, String str2) {
        this.carryout = i;
        this.restaurant = i2;
        this.carryoutText = str;
        this.restaurantText = str2;
    }

    public static /* synthetic */ OrderTypeDiscountDto copy$default(OrderTypeDiscountDto orderTypeDiscountDto, int i, int i2, String str, String str2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = orderTypeDiscountDto.carryout;
        }
        if ((i3 & 2) != 0) {
            i2 = orderTypeDiscountDto.restaurant;
        }
        if ((i3 & 4) != 0) {
            str = orderTypeDiscountDto.carryoutText;
        }
        if ((i3 & 8) != 0) {
            str2 = orderTypeDiscountDto.restaurantText;
        }
        return orderTypeDiscountDto.copy(i, i2, str, str2);
    }

    public final int component1() {
        return this.carryout;
    }

    public final int component2() {
        return this.restaurant;
    }

    public final String component3() {
        return this.carryoutText;
    }

    public final String component4() {
        return this.restaurantText;
    }

    public final OrderTypeDiscountDto copy(int i, int i2, String str, String str2) {
        return new OrderTypeDiscountDto(i, i2, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderTypeDiscountDto)) {
            return false;
        }
        OrderTypeDiscountDto orderTypeDiscountDto = (OrderTypeDiscountDto) obj;
        if (this.carryout == orderTypeDiscountDto.carryout && this.restaurant == orderTypeDiscountDto.restaurant && z65.c(this.carryoutText, orderTypeDiscountDto.carryoutText) && z65.c(this.restaurantText, orderTypeDiscountDto.restaurantText)) {
            return true;
        }
        return false;
    }

    public final int getCarryout() {
        return this.carryout;
    }

    public final String getCarryoutText() {
        return this.carryoutText;
    }

    public final int getRestaurant() {
        return this.restaurant;
    }

    public final String getRestaurantText() {
        return this.restaurantText;
    }

    public int hashCode() {
        int hashCode;
        int i = ((this.carryout * 31) + this.restaurant) * 31;
        String str = this.carryoutText;
        int i2 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i3 = (i + hashCode) * 31;
        String str2 = this.restaurantText;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return i3 + i2;
    }

    public String toString() {
        int i = this.carryout;
        int i2 = this.restaurant;
        String str = this.carryoutText;
        String str2 = this.restaurantText;
        return "OrderTypeDiscountDto(carryout=" + i + ", restaurant=" + i2 + ", carryoutText=" + str + ", restaurantText=" + str2 + ")";
    }

    public /* synthetic */ OrderTypeDiscountDto(int i, int i2, String str, String str2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, (i3 & 4) != 0 ? null : str, (i3 & 8) != 0 ? null : str2);
    }
}
