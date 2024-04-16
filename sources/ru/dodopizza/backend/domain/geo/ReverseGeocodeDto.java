package ru.dodopizza.backend.domain.geo;

import kotlin.Metadata;
/* compiled from: ReverseGeocodeAddressDto.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/dodopizza/backend/domain/geo/ReverseGeocodeDto;", "", "address", "Lru/dodopizza/backend/domain/geo/ReverseGeocodeAddressDto;", "(Lru/dodopizza/backend/domain/geo/ReverseGeocodeAddressDto;)V", "getAddress", "()Lru/dodopizza/backend/domain/geo/ReverseGeocodeAddressDto;", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ReverseGeocodeDto {
    @uca("address")
    private final ReverseGeocodeAddressDto address;

    public ReverseGeocodeDto(ReverseGeocodeAddressDto reverseGeocodeAddressDto) {
        this.address = reverseGeocodeAddressDto;
    }

    public final ReverseGeocodeAddressDto getAddress() {
        return this.address;
    }
}
