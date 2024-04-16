package ru.dodopizza.backend.domain.customer.dto;

import kotlin.Metadata;
import ru.dodopizza.backend.domain.state.dto.deliverylocation.DeliveryLocationDto;
/* compiled from: SaveClientDeliveryLocationDto.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lru/dodopizza/backend/domain/customer/dto/SaveClientDeliveryLocationDto;", "", "id", "", "deliveryLocation", "Lru/dodopizza/backend/domain/state/dto/deliverylocation/DeliveryLocationDto;", "(Ljava/lang/String;Lru/dodopizza/backend/domain/state/dto/deliverylocation/DeliveryLocationDto;)V", "getDeliveryLocation", "()Lru/dodopizza/backend/domain/state/dto/deliverylocation/DeliveryLocationDto;", "getId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SaveClientDeliveryLocationDto {
    @uca("deliveryLocation")
    private final DeliveryLocationDto deliveryLocation;
    @uca("id")
    private final String id;

    public SaveClientDeliveryLocationDto(String str, DeliveryLocationDto deliveryLocationDto) {
        z65.h(str, "id");
        z65.h(deliveryLocationDto, "deliveryLocation");
        this.id = str;
        this.deliveryLocation = deliveryLocationDto;
    }

    public static /* synthetic */ SaveClientDeliveryLocationDto copy$default(SaveClientDeliveryLocationDto saveClientDeliveryLocationDto, String str, DeliveryLocationDto deliveryLocationDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = saveClientDeliveryLocationDto.id;
        }
        if ((i & 2) != 0) {
            deliveryLocationDto = saveClientDeliveryLocationDto.deliveryLocation;
        }
        return saveClientDeliveryLocationDto.copy(str, deliveryLocationDto);
    }

    public final String component1() {
        return this.id;
    }

    public final DeliveryLocationDto component2() {
        return this.deliveryLocation;
    }

    public final SaveClientDeliveryLocationDto copy(String str, DeliveryLocationDto deliveryLocationDto) {
        z65.h(str, "id");
        z65.h(deliveryLocationDto, "deliveryLocation");
        return new SaveClientDeliveryLocationDto(str, deliveryLocationDto);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SaveClientDeliveryLocationDto)) {
            return false;
        }
        SaveClientDeliveryLocationDto saveClientDeliveryLocationDto = (SaveClientDeliveryLocationDto) obj;
        if (z65.c(this.id, saveClientDeliveryLocationDto.id) && z65.c(this.deliveryLocation, saveClientDeliveryLocationDto.deliveryLocation)) {
            return true;
        }
        return false;
    }

    public final DeliveryLocationDto getDeliveryLocation() {
        return this.deliveryLocation;
    }

    public final String getId() {
        return this.id;
    }

    public int hashCode() {
        return (this.id.hashCode() * 31) + this.deliveryLocation.hashCode();
    }

    public String toString() {
        String str = this.id;
        DeliveryLocationDto deliveryLocationDto = this.deliveryLocation;
        return "SaveClientDeliveryLocationDto(id=" + str + ", deliveryLocation=" + deliveryLocationDto + ")";
    }
}
