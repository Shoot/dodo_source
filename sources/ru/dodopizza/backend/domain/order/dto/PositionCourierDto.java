package ru.dodopizza.backend.domain.order.dto;

import kotlin.Metadata;
/* compiled from: PositionCourierDto.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000eJ0\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000e¨\u0006\u001b"}, d2 = {"Lru/dodopizza/backend/domain/order/dto/PositionCourierDto;", "", "orderId", "", "location", "Lru/dodopizza/backend/domain/order/dto/LocationDto;", "updateIntervalSeconds", "", "(Ljava/lang/String;Lru/dodopizza/backend/domain/order/dto/LocationDto;Ljava/lang/Long;)V", "getLocation", "()Lru/dodopizza/backend/domain/order/dto/LocationDto;", "getOrderId", "()Ljava/lang/String;", "getUpdateIntervalSeconds", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Lru/dodopizza/backend/domain/order/dto/LocationDto;Ljava/lang/Long;)Lru/dodopizza/backend/domain/order/dto/PositionCourierDto;", "equals", "", "other", "hashCode", "", "toString", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PositionCourierDto {
    @uca("location")
    private final LocationDto location;
    @uca("orderId")
    private final String orderId;
    @uca("updateIntervalSeconds")
    private final Long updateIntervalSeconds;

    public PositionCourierDto(String str, LocationDto locationDto, Long l) {
        z65.h(str, "orderId");
        this.orderId = str;
        this.location = locationDto;
        this.updateIntervalSeconds = l;
    }

    public static /* synthetic */ PositionCourierDto copy$default(PositionCourierDto positionCourierDto, String str, LocationDto locationDto, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            str = positionCourierDto.orderId;
        }
        if ((i & 2) != 0) {
            locationDto = positionCourierDto.location;
        }
        if ((i & 4) != 0) {
            l = positionCourierDto.updateIntervalSeconds;
        }
        return positionCourierDto.copy(str, locationDto, l);
    }

    public final String component1() {
        return this.orderId;
    }

    public final LocationDto component2() {
        return this.location;
    }

    public final Long component3() {
        return this.updateIntervalSeconds;
    }

    public final PositionCourierDto copy(String str, LocationDto locationDto, Long l) {
        z65.h(str, "orderId");
        return new PositionCourierDto(str, locationDto, l);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PositionCourierDto)) {
            return false;
        }
        PositionCourierDto positionCourierDto = (PositionCourierDto) obj;
        if (z65.c(this.orderId, positionCourierDto.orderId) && z65.c(this.location, positionCourierDto.location) && z65.c(this.updateIntervalSeconds, positionCourierDto.updateIntervalSeconds)) {
            return true;
        }
        return false;
    }

    public final LocationDto getLocation() {
        return this.location;
    }

    public final String getOrderId() {
        return this.orderId;
    }

    public final Long getUpdateIntervalSeconds() {
        return this.updateIntervalSeconds;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.orderId.hashCode() * 31;
        LocationDto locationDto = this.location;
        int i = 0;
        if (locationDto == null) {
            hashCode = 0;
        } else {
            hashCode = locationDto.hashCode();
        }
        int i2 = (hashCode2 + hashCode) * 31;
        Long l = this.updateIntervalSeconds;
        if (l != null) {
            i = l.hashCode();
        }
        return i2 + i;
    }

    public String toString() {
        String str = this.orderId;
        LocationDto locationDto = this.location;
        Long l = this.updateIntervalSeconds;
        return "PositionCourierDto(orderId=" + str + ", location=" + locationDto + ", updateIntervalSeconds=" + l + ")";
    }
}
