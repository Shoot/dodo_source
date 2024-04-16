package ru.dodopizza.backend.domain.state.dto.deliverylocation;

import kotlin.Metadata;
/* compiled from: ClientDeliveryLocationDto.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000eJ.\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lru/dodopizza/backend/domain/state/dto/deliverylocation/ClientDeliveryLocationDto;", "", "id", "", "deliveryLocation", "Lru/dodopizza/backend/domain/state/dto/deliverylocation/DeliveryLocationDto;", "requiresAdditions", "", "(Ljava/lang/String;Lru/dodopizza/backend/domain/state/dto/deliverylocation/DeliveryLocationDto;Ljava/lang/Boolean;)V", "getDeliveryLocation", "()Lru/dodopizza/backend/domain/state/dto/deliverylocation/DeliveryLocationDto;", "getId", "()Ljava/lang/String;", "getRequiresAdditions", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Lru/dodopizza/backend/domain/state/dto/deliverylocation/DeliveryLocationDto;Ljava/lang/Boolean;)Lru/dodopizza/backend/domain/state/dto/deliverylocation/ClientDeliveryLocationDto;", "equals", "other", "hashCode", "", "toString", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ClientDeliveryLocationDto {
    @uca("deliveryLocation")
    private final DeliveryLocationDto deliveryLocation;
    @uca("id")
    private final String id;
    @uca("requiresAdditions")
    private final Boolean requiresAdditions;

    public ClientDeliveryLocationDto(String str, DeliveryLocationDto deliveryLocationDto, Boolean bool) {
        z65.h(str, "id");
        z65.h(deliveryLocationDto, "deliveryLocation");
        this.id = str;
        this.deliveryLocation = deliveryLocationDto;
        this.requiresAdditions = bool;
    }

    public static /* synthetic */ ClientDeliveryLocationDto copy$default(ClientDeliveryLocationDto clientDeliveryLocationDto, String str, DeliveryLocationDto deliveryLocationDto, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = clientDeliveryLocationDto.id;
        }
        if ((i & 2) != 0) {
            deliveryLocationDto = clientDeliveryLocationDto.deliveryLocation;
        }
        if ((i & 4) != 0) {
            bool = clientDeliveryLocationDto.requiresAdditions;
        }
        return clientDeliveryLocationDto.copy(str, deliveryLocationDto, bool);
    }

    public final String component1() {
        return this.id;
    }

    public final DeliveryLocationDto component2() {
        return this.deliveryLocation;
    }

    public final Boolean component3() {
        return this.requiresAdditions;
    }

    public final ClientDeliveryLocationDto copy(String str, DeliveryLocationDto deliveryLocationDto, Boolean bool) {
        z65.h(str, "id");
        z65.h(deliveryLocationDto, "deliveryLocation");
        return new ClientDeliveryLocationDto(str, deliveryLocationDto, bool);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClientDeliveryLocationDto)) {
            return false;
        }
        ClientDeliveryLocationDto clientDeliveryLocationDto = (ClientDeliveryLocationDto) obj;
        if (z65.c(this.id, clientDeliveryLocationDto.id) && z65.c(this.deliveryLocation, clientDeliveryLocationDto.deliveryLocation) && z65.c(this.requiresAdditions, clientDeliveryLocationDto.requiresAdditions)) {
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

    public final Boolean getRequiresAdditions() {
        return this.requiresAdditions;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((this.id.hashCode() * 31) + this.deliveryLocation.hashCode()) * 31;
        Boolean bool = this.requiresAdditions;
        if (bool == null) {
            hashCode = 0;
        } else {
            hashCode = bool.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public String toString() {
        String str = this.id;
        DeliveryLocationDto deliveryLocationDto = this.deliveryLocation;
        Boolean bool = this.requiresAdditions;
        return "ClientDeliveryLocationDto(id=" + str + ", deliveryLocation=" + deliveryLocationDto + ", requiresAdditions=" + bool + ")";
    }
}
