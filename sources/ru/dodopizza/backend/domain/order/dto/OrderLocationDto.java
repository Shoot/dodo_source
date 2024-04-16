package ru.dodopizza.backend.domain.order.dto;

import kotlin.Metadata;
/* compiled from: OrderLocationDto.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lru/dodopizza/backend/domain/order/dto/OrderLocationDto;", "", "lat", "", "lon", "(DD)V", "getLat", "()D", "getLon", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OrderLocationDto {
    @uca("lat")
    private final double lat;
    @uca("lon")
    private final double lon;

    public OrderLocationDto(double d, double d2) {
        this.lat = d;
        this.lon = d2;
    }

    public static /* synthetic */ OrderLocationDto copy$default(OrderLocationDto orderLocationDto, double d, double d2, int i, Object obj) {
        if ((i & 1) != 0) {
            d = orderLocationDto.lat;
        }
        if ((i & 2) != 0) {
            d2 = orderLocationDto.lon;
        }
        return orderLocationDto.copy(d, d2);
    }

    public final double component1() {
        return this.lat;
    }

    public final double component2() {
        return this.lon;
    }

    public final OrderLocationDto copy(double d, double d2) {
        return new OrderLocationDto(d, d2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderLocationDto)) {
            return false;
        }
        OrderLocationDto orderLocationDto = (OrderLocationDto) obj;
        if (Double.compare(this.lat, orderLocationDto.lat) == 0 && Double.compare(this.lon, orderLocationDto.lon) == 0) {
            return true;
        }
        return false;
    }

    public final double getLat() {
        return this.lat;
    }

    public final double getLon() {
        return this.lon;
    }

    public int hashCode() {
        return (nkb.a(this.lat) * 31) + nkb.a(this.lon);
    }

    public String toString() {
        double d = this.lat;
        double d2 = this.lon;
        return "OrderLocationDto(lat=" + d + ", lon=" + d2 + ")";
    }
}
