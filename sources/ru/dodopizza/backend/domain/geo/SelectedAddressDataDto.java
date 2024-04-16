package ru.dodopizza.backend.domain.geo;

import im.threads.business.transport.MessageAttributes;
import kotlin.Metadata;
/* compiled from: SelectedAddressDataDto.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\nHÆ\u0003JI\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\n2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\r¨\u0006!"}, d2 = {"Lru/dodopizza/backend/domain/geo/SelectedAddressDataDto;", "", "localityId", "", "pizzeriaId", MessageAttributes.COORDINATES, "Lru/dodopizza/backend/domain/geo/CoordinatesDto;", "components", "formattedAddress", "incompleteAddress", "", "(Ljava/lang/String;Ljava/lang/String;Lru/dodopizza/backend/domain/geo/CoordinatesDto;Ljava/lang/String;Ljava/lang/String;Z)V", "getComponents", "()Ljava/lang/String;", "getCoordinates", "()Lru/dodopizza/backend/domain/geo/CoordinatesDto;", "getFormattedAddress", "getIncompleteAddress", "()Z", "getLocalityId", "getPizzeriaId", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SelectedAddressDataDto {
    @uca("components")
    private final String components;
    @uca(MessageAttributes.COORDINATES)
    private final CoordinatesDto coordinates;
    @uca("formattedAddress")
    private final String formattedAddress;
    @uca("incompleteAddress")
    private final boolean incompleteAddress;
    @uca("localityId")
    private final String localityId;
    @uca("pizzeriaId")
    private final String pizzeriaId;

    public SelectedAddressDataDto(String str, String str2, CoordinatesDto coordinatesDto, String str3, String str4, boolean z) {
        z65.h(coordinatesDto, MessageAttributes.COORDINATES);
        z65.h(str3, "components");
        z65.h(str4, "formattedAddress");
        this.localityId = str;
        this.pizzeriaId = str2;
        this.coordinates = coordinatesDto;
        this.components = str3;
        this.formattedAddress = str4;
        this.incompleteAddress = z;
    }

    public static /* synthetic */ SelectedAddressDataDto copy$default(SelectedAddressDataDto selectedAddressDataDto, String str, String str2, CoordinatesDto coordinatesDto, String str3, String str4, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = selectedAddressDataDto.localityId;
        }
        if ((i & 2) != 0) {
            str2 = selectedAddressDataDto.pizzeriaId;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            coordinatesDto = selectedAddressDataDto.coordinates;
        }
        CoordinatesDto coordinatesDto2 = coordinatesDto;
        if ((i & 8) != 0) {
            str3 = selectedAddressDataDto.components;
        }
        String str6 = str3;
        if ((i & 16) != 0) {
            str4 = selectedAddressDataDto.formattedAddress;
        }
        String str7 = str4;
        if ((i & 32) != 0) {
            z = selectedAddressDataDto.incompleteAddress;
        }
        return selectedAddressDataDto.copy(str, str5, coordinatesDto2, str6, str7, z);
    }

    public final String component1() {
        return this.localityId;
    }

    public final String component2() {
        return this.pizzeriaId;
    }

    public final CoordinatesDto component3() {
        return this.coordinates;
    }

    public final String component4() {
        return this.components;
    }

    public final String component5() {
        return this.formattedAddress;
    }

    public final boolean component6() {
        return this.incompleteAddress;
    }

    public final SelectedAddressDataDto copy(String str, String str2, CoordinatesDto coordinatesDto, String str3, String str4, boolean z) {
        z65.h(coordinatesDto, MessageAttributes.COORDINATES);
        z65.h(str3, "components");
        z65.h(str4, "formattedAddress");
        return new SelectedAddressDataDto(str, str2, coordinatesDto, str3, str4, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectedAddressDataDto)) {
            return false;
        }
        SelectedAddressDataDto selectedAddressDataDto = (SelectedAddressDataDto) obj;
        if (z65.c(this.localityId, selectedAddressDataDto.localityId) && z65.c(this.pizzeriaId, selectedAddressDataDto.pizzeriaId) && z65.c(this.coordinates, selectedAddressDataDto.coordinates) && z65.c(this.components, selectedAddressDataDto.components) && z65.c(this.formattedAddress, selectedAddressDataDto.formattedAddress) && this.incompleteAddress == selectedAddressDataDto.incompleteAddress) {
            return true;
        }
        return false;
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

    public final boolean getIncompleteAddress() {
        return this.incompleteAddress;
    }

    public final String getLocalityId() {
        return this.localityId;
    }

    public final String getPizzeriaId() {
        return this.pizzeriaId;
    }

    public int hashCode() {
        int hashCode;
        String str = this.localityId;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        String str2 = this.pizzeriaId;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((((((((i2 + i) * 31) + this.coordinates.hashCode()) * 31) + this.components.hashCode()) * 31) + this.formattedAddress.hashCode()) * 31) + a91.a(this.incompleteAddress);
    }

    public String toString() {
        String str = this.localityId;
        String str2 = this.pizzeriaId;
        CoordinatesDto coordinatesDto = this.coordinates;
        String str3 = this.components;
        String str4 = this.formattedAddress;
        boolean z = this.incompleteAddress;
        return "SelectedAddressDataDto(localityId=" + str + ", pizzeriaId=" + str2 + ", coordinates=" + coordinatesDto + ", components=" + str3 + ", formattedAddress=" + str4 + ", incompleteAddress=" + z + ")";
    }
}
