package ru.dodopizza.backend.domain.geo;

import kotlin.Metadata;
/* compiled from: AddressCatcherRequestDto.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lru/dodopizza/backend/domain/geo/AddressCatcherRequestDto;", "", "deliveryLocation", "Lru/dodopizza/backend/domain/geo/UndeliverableAddressField;", "clientPhone", "", "(Lru/dodopizza/backend/domain/geo/UndeliverableAddressField;Ljava/lang/String;)V", "getClientPhone", "()Ljava/lang/String;", "getDeliveryLocation", "()Lru/dodopizza/backend/domain/geo/UndeliverableAddressField;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AddressCatcherRequestDto {
    @uca("clientPhone")
    private final String clientPhone;
    @uca("deliveryLocation")
    private final UndeliverableAddressField deliveryLocation;

    public AddressCatcherRequestDto(UndeliverableAddressField undeliverableAddressField, String str) {
        z65.h(undeliverableAddressField, "deliveryLocation");
        z65.h(str, "clientPhone");
        this.deliveryLocation = undeliverableAddressField;
        this.clientPhone = str;
    }

    public static /* synthetic */ AddressCatcherRequestDto copy$default(AddressCatcherRequestDto addressCatcherRequestDto, UndeliverableAddressField undeliverableAddressField, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            undeliverableAddressField = addressCatcherRequestDto.deliveryLocation;
        }
        if ((i & 2) != 0) {
            str = addressCatcherRequestDto.clientPhone;
        }
        return addressCatcherRequestDto.copy(undeliverableAddressField, str);
    }

    public final UndeliverableAddressField component1() {
        return this.deliveryLocation;
    }

    public final String component2() {
        return this.clientPhone;
    }

    public final AddressCatcherRequestDto copy(UndeliverableAddressField undeliverableAddressField, String str) {
        z65.h(undeliverableAddressField, "deliveryLocation");
        z65.h(str, "clientPhone");
        return new AddressCatcherRequestDto(undeliverableAddressField, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddressCatcherRequestDto)) {
            return false;
        }
        AddressCatcherRequestDto addressCatcherRequestDto = (AddressCatcherRequestDto) obj;
        if (z65.c(this.deliveryLocation, addressCatcherRequestDto.deliveryLocation) && z65.c(this.clientPhone, addressCatcherRequestDto.clientPhone)) {
            return true;
        }
        return false;
    }

    public final String getClientPhone() {
        return this.clientPhone;
    }

    public final UndeliverableAddressField getDeliveryLocation() {
        return this.deliveryLocation;
    }

    public int hashCode() {
        return (this.deliveryLocation.hashCode() * 31) + this.clientPhone.hashCode();
    }

    public String toString() {
        UndeliverableAddressField undeliverableAddressField = this.deliveryLocation;
        String str = this.clientPhone;
        return "AddressCatcherRequestDto(deliveryLocation=" + undeliverableAddressField + ", clientPhone=" + str + ")";
    }
}
