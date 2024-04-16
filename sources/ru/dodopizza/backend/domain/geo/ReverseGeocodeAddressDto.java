package ru.dodopizza.backend.domain.geo;

import im.threads.business.transport.MessageAttributes;
import kotlin.Metadata;
/* compiled from: ReverseGeocodeAddressDto.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nR\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006\u0013"}, d2 = {"Lru/dodopizza/backend/domain/geo/ReverseGeocodeAddressDto;", "", "localityId", "", "pizzeriaId", MessageAttributes.COORDINATES, "Lru/dodopizza/backend/domain/geo/CoordinatesDto;", "components", "formattedAddress", "addressLocation", "(Ljava/lang/String;Ljava/lang/String;Lru/dodopizza/backend/domain/geo/CoordinatesDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAddressLocation", "()Ljava/lang/String;", "getComponents", "getCoordinates", "()Lru/dodopizza/backend/domain/geo/CoordinatesDto;", "getFormattedAddress", "getLocalityId", "getPizzeriaId", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ReverseGeocodeAddressDto {
    @uca("addressLocation")
    private final String addressLocation;
    @uca("components")
    private final String components;
    @uca(MessageAttributes.COORDINATES)
    private final CoordinatesDto coordinates;
    @uca("formattedAddress")
    private final String formattedAddress;
    @uca("localityId")
    private final String localityId;
    @uca("pizzeriaId")
    private final String pizzeriaId;

    public ReverseGeocodeAddressDto(String str, String str2, CoordinatesDto coordinatesDto, String str3, String str4, String str5) {
        z65.h(coordinatesDto, MessageAttributes.COORDINATES);
        z65.h(str3, "components");
        z65.h(str4, "formattedAddress");
        z65.h(str5, "addressLocation");
        this.localityId = str;
        this.pizzeriaId = str2;
        this.coordinates = coordinatesDto;
        this.components = str3;
        this.formattedAddress = str4;
        this.addressLocation = str5;
    }

    public final String getAddressLocation() {
        return this.addressLocation;
    }

    public final String getComponents() {
        return this.components;
    }

    public final CoordinatesDto getCoordinates() {
        return this.coordinates;
    }

    public final String getFormattedAddress() {
        return this.formattedAddress;
    }

    public final String getLocalityId() {
        return this.localityId;
    }

    public final String getPizzeriaId() {
        return this.pizzeriaId;
    }
}
