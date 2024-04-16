package ru.dodopizza.backend.domain.pizzeria.dto;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: CoordinatesDto.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lru/dodopizza/backend/domain/pizzeria/dto/CoordinatesDto;", "", "lat", "", "lon", "(DD)V", "getLat", "()D", "setLat", "(D)V", "getLon", "setLon", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CoordinatesDto {
    @uca("lat")
    private double lat;
    @uca("lon")
    private double lon;

    public CoordinatesDto() {
        this(0.0d, 0.0d, 3, null);
    }

    public static /* synthetic */ CoordinatesDto copy$default(CoordinatesDto coordinatesDto, double d, double d2, int i, Object obj) {
        if ((i & 1) != 0) {
            d = coordinatesDto.lat;
        }
        if ((i & 2) != 0) {
            d2 = coordinatesDto.lon;
        }
        return coordinatesDto.copy(d, d2);
    }

    public final double component1() {
        return this.lat;
    }

    public final double component2() {
        return this.lon;
    }

    public final CoordinatesDto copy(double d, double d2) {
        return new CoordinatesDto(d, d2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CoordinatesDto)) {
            return false;
        }
        CoordinatesDto coordinatesDto = (CoordinatesDto) obj;
        if (Double.compare(this.lat, coordinatesDto.lat) == 0 && Double.compare(this.lon, coordinatesDto.lon) == 0) {
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

    public final void setLat(double d) {
        this.lat = d;
    }

    public final void setLon(double d) {
        this.lon = d;
    }

    public String toString() {
        double d = this.lat;
        double d2 = this.lon;
        return "CoordinatesDto(lat=" + d + ", lon=" + d2 + ")";
    }

    public CoordinatesDto(double d, double d2) {
        this.lat = d;
        this.lon = d2;
    }

    public /* synthetic */ CoordinatesDto(double d, double d2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0d : d, (i & 2) != 0 ? 0.0d : d2);
    }
}
