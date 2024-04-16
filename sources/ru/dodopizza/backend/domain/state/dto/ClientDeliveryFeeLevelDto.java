package ru.dodopizza.backend.domain.state.dto;

import kotlin.Metadata;
/* compiled from: DynamicDeliveryDto.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0016"}, d2 = {"Lru/dodopizza/backend/domain/state/dto/ClientDeliveryFeeLevelDto;", "", "min", "", "max", "fee", "(DDD)V", "getFee", "()D", "getMax", "getMin", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ClientDeliveryFeeLevelDto {
    @uca("fee")
    private final double fee;
    @uca("max")
    private final double max;
    @uca("min")
    private final double min;

    public ClientDeliveryFeeLevelDto(double d, double d2, double d3) {
        this.min = d;
        this.max = d2;
        this.fee = d3;
    }

    public static /* synthetic */ ClientDeliveryFeeLevelDto copy$default(ClientDeliveryFeeLevelDto clientDeliveryFeeLevelDto, double d, double d2, double d3, int i, Object obj) {
        if ((i & 1) != 0) {
            d = clientDeliveryFeeLevelDto.min;
        }
        double d4 = d;
        if ((i & 2) != 0) {
            d2 = clientDeliveryFeeLevelDto.max;
        }
        double d5 = d2;
        if ((i & 4) != 0) {
            d3 = clientDeliveryFeeLevelDto.fee;
        }
        return clientDeliveryFeeLevelDto.copy(d4, d5, d3);
    }

    public final double component1() {
        return this.min;
    }

    public final double component2() {
        return this.max;
    }

    public final double component3() {
        return this.fee;
    }

    public final ClientDeliveryFeeLevelDto copy(double d, double d2, double d3) {
        return new ClientDeliveryFeeLevelDto(d, d2, d3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClientDeliveryFeeLevelDto)) {
            return false;
        }
        ClientDeliveryFeeLevelDto clientDeliveryFeeLevelDto = (ClientDeliveryFeeLevelDto) obj;
        if (Double.compare(this.min, clientDeliveryFeeLevelDto.min) == 0 && Double.compare(this.max, clientDeliveryFeeLevelDto.max) == 0 && Double.compare(this.fee, clientDeliveryFeeLevelDto.fee) == 0) {
            return true;
        }
        return false;
    }

    public final double getFee() {
        return this.fee;
    }

    public final double getMax() {
        return this.max;
    }

    public final double getMin() {
        return this.min;
    }

    public int hashCode() {
        return (((nkb.a(this.min) * 31) + nkb.a(this.max)) * 31) + nkb.a(this.fee);
    }

    public String toString() {
        double d = this.min;
        double d2 = this.max;
        double d3 = this.fee;
        return "ClientDeliveryFeeLevelDto(min=" + d + ", max=" + d2 + ", fee=" + d3 + ")";
    }
}
