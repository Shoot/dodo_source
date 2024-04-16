package ru.dodopizza.backend.domain.state.dto.deliverylocation;

import im.threads.business.transport.MessageAttributes;
import java.util.Map;
import kotlin.Metadata;
/* compiled from: SetDeliveryLocationDto.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u0017\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J?\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R$\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000f¨\u0006\u001c"}, d2 = {"Lru/dodopizza/backend/domain/state/dto/deliverylocation/SetDeliveryLocationDto;", "", "formattedAddress", "", "additions", "", MessageAttributes.COORDINATES, "Lru/dodopizza/backend/domain/state/dto/deliverylocation/CoordinatesDto;", "encodedComponents", "(Ljava/lang/String;Ljava/util/Map;Lru/dodopizza/backend/domain/state/dto/deliverylocation/CoordinatesDto;Ljava/lang/String;)V", "getAdditions", "()Ljava/util/Map;", "getCoordinates", "()Lru/dodopizza/backend/domain/state/dto/deliverylocation/CoordinatesDto;", "getEncodedComponents", "()Ljava/lang/String;", "getFormattedAddress", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SetDeliveryLocationDto {
    @uca("additions")
    private final Map<String, String> additions;
    @uca(MessageAttributes.COORDINATES)
    private final CoordinatesDto coordinates;
    @uca("components")
    private final String encodedComponents;
    @uca("formattedAddress")
    private final String formattedAddress;

    public SetDeliveryLocationDto(String str, Map<String, String> map, CoordinatesDto coordinatesDto, String str2) {
        z65.h(str, "formattedAddress");
        z65.h(coordinatesDto, MessageAttributes.COORDINATES);
        z65.h(str2, "encodedComponents");
        this.formattedAddress = str;
        this.additions = map;
        this.coordinates = coordinatesDto;
        this.encodedComponents = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SetDeliveryLocationDto copy$default(SetDeliveryLocationDto setDeliveryLocationDto, String str, Map map, CoordinatesDto coordinatesDto, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = setDeliveryLocationDto.formattedAddress;
        }
        if ((i & 2) != 0) {
            map = setDeliveryLocationDto.additions;
        }
        if ((i & 4) != 0) {
            coordinatesDto = setDeliveryLocationDto.coordinates;
        }
        if ((i & 8) != 0) {
            str2 = setDeliveryLocationDto.encodedComponents;
        }
        return setDeliveryLocationDto.copy(str, map, coordinatesDto, str2);
    }

    public final String component1() {
        return this.formattedAddress;
    }

    public final Map<String, String> component2() {
        return this.additions;
    }

    public final CoordinatesDto component3() {
        return this.coordinates;
    }

    public final String component4() {
        return this.encodedComponents;
    }

    public final SetDeliveryLocationDto copy(String str, Map<String, String> map, CoordinatesDto coordinatesDto, String str2) {
        z65.h(str, "formattedAddress");
        z65.h(coordinatesDto, MessageAttributes.COORDINATES);
        z65.h(str2, "encodedComponents");
        return new SetDeliveryLocationDto(str, map, coordinatesDto, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SetDeliveryLocationDto)) {
            return false;
        }
        SetDeliveryLocationDto setDeliveryLocationDto = (SetDeliveryLocationDto) obj;
        if (z65.c(this.formattedAddress, setDeliveryLocationDto.formattedAddress) && z65.c(this.additions, setDeliveryLocationDto.additions) && z65.c(this.coordinates, setDeliveryLocationDto.coordinates) && z65.c(this.encodedComponents, setDeliveryLocationDto.encodedComponents)) {
            return true;
        }
        return false;
    }

    public final Map<String, String> getAdditions() {
        return this.additions;
    }

    public final CoordinatesDto getCoordinates() {
        return this.coordinates;
    }

    public final String getEncodedComponents() {
        return this.encodedComponents;
    }

    public final String getFormattedAddress() {
        return this.formattedAddress;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.formattedAddress.hashCode() * 31;
        Map<String, String> map = this.additions;
        if (map == null) {
            hashCode = 0;
        } else {
            hashCode = map.hashCode();
        }
        return ((((hashCode2 + hashCode) * 31) + this.coordinates.hashCode()) * 31) + this.encodedComponents.hashCode();
    }

    public String toString() {
        String str = this.formattedAddress;
        Map<String, String> map = this.additions;
        CoordinatesDto coordinatesDto = this.coordinates;
        String str2 = this.encodedComponents;
        return "SetDeliveryLocationDto(formattedAddress=" + str + ", additions=" + map + ", coordinates=" + coordinatesDto + ", encodedComponents=" + str2 + ")";
    }
}
