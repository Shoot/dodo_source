package ru.dodopizza.backend.domain.geo;

import im.threads.business.transport.MessageAttributes;
import kotlin.Metadata;
/* compiled from: AddressCatcherRequestDto.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, d2 = {"Lru/dodopizza/backend/domain/geo/UndeliverableAddressField;", "", "formattedAddress", "", MessageAttributes.COORDINATES, "Lru/dodopizza/backend/domain/state/dto/deliverylocation/CoordinatesDto;", "encodedComponents", "(Ljava/lang/String;Lru/dodopizza/backend/domain/state/dto/deliverylocation/CoordinatesDto;Ljava/lang/String;)V", "getCoordinates", "()Lru/dodopizza/backend/domain/state/dto/deliverylocation/CoordinatesDto;", "getEncodedComponents", "()Ljava/lang/String;", "getFormattedAddress", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class UndeliverableAddressField {
    @uca(MessageAttributes.COORDINATES)
    private final ru.dodopizza.backend.domain.state.dto.deliverylocation.CoordinatesDto coordinates;
    @uca("components")
    private final String encodedComponents;
    @uca("formattedAddress")
    private final String formattedAddress;

    public UndeliverableAddressField(String str, ru.dodopizza.backend.domain.state.dto.deliverylocation.CoordinatesDto coordinatesDto, String str2) {
        z65.h(str, "formattedAddress");
        z65.h(coordinatesDto, MessageAttributes.COORDINATES);
        z65.h(str2, "encodedComponents");
        this.formattedAddress = str;
        this.coordinates = coordinatesDto;
        this.encodedComponents = str2;
    }

    public static /* synthetic */ UndeliverableAddressField copy$default(UndeliverableAddressField undeliverableAddressField, String str, ru.dodopizza.backend.domain.state.dto.deliverylocation.CoordinatesDto coordinatesDto, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = undeliverableAddressField.formattedAddress;
        }
        if ((i & 2) != 0) {
            coordinatesDto = undeliverableAddressField.coordinates;
        }
        if ((i & 4) != 0) {
            str2 = undeliverableAddressField.encodedComponents;
        }
        return undeliverableAddressField.copy(str, coordinatesDto, str2);
    }

    public final String component1() {
        return this.formattedAddress;
    }

    public final ru.dodopizza.backend.domain.state.dto.deliverylocation.CoordinatesDto component2() {
        return this.coordinates;
    }

    public final String component3() {
        return this.encodedComponents;
    }

    public final UndeliverableAddressField copy(String str, ru.dodopizza.backend.domain.state.dto.deliverylocation.CoordinatesDto coordinatesDto, String str2) {
        z65.h(str, "formattedAddress");
        z65.h(coordinatesDto, MessageAttributes.COORDINATES);
        z65.h(str2, "encodedComponents");
        return new UndeliverableAddressField(str, coordinatesDto, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UndeliverableAddressField)) {
            return false;
        }
        UndeliverableAddressField undeliverableAddressField = (UndeliverableAddressField) obj;
        if (z65.c(this.formattedAddress, undeliverableAddressField.formattedAddress) && z65.c(this.coordinates, undeliverableAddressField.coordinates) && z65.c(this.encodedComponents, undeliverableAddressField.encodedComponents)) {
            return true;
        }
        return false;
    }

    public final ru.dodopizza.backend.domain.state.dto.deliverylocation.CoordinatesDto getCoordinates() {
        return this.coordinates;
    }

    public final String getEncodedComponents() {
        return this.encodedComponents;
    }

    public final String getFormattedAddress() {
        return this.formattedAddress;
    }

    public int hashCode() {
        return (((this.formattedAddress.hashCode() * 31) + this.coordinates.hashCode()) * 31) + this.encodedComponents.hashCode();
    }

    public String toString() {
        String str = this.formattedAddress;
        ru.dodopizza.backend.domain.state.dto.deliverylocation.CoordinatesDto coordinatesDto = this.coordinates;
        String str2 = this.encodedComponents;
        return "UndeliverableAddressField(formattedAddress=" + str + ", coordinates=" + coordinatesDto + ", encodedComponents=" + str2 + ")";
    }
}
