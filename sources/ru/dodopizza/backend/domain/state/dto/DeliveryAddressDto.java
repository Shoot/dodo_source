package ru.dodopizza.backend.domain.state.dto;

import com.dodopizza.persistence.entity.address.AddressEntity;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: DeliveryAddressDto.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b'\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u007f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003¢\u0006\u0002\u0010\u000fJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0083\u0001\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u0003HÆ\u0001J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020.HÖ\u0001J\t\u0010/\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u0016\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0011R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0011R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0011¨\u00060"}, d2 = {"Lru/dodopizza/backend/domain/state/dto/DeliveryAddressDto;", "", "id", "", AddressEntity.STREET_ID_FIELD_NAME, "streetName", AddressEntity.HOUSE_NUMBER_FIELD_NAME, "building", AddressEntity.APARTMENT_FIELD_NAME, "entrance", "floor", "intercom", "comment", "addressAlias", "postcode", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAddressAlias", "()Ljava/lang/String;", "getApartment", "getBuilding", "getComment", "getEntrance", "getFloor", "getHouseNumber", "getId", "getIntercom", "getPostcode", "getStreetId", "getStreetName", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DeliveryAddressDto {
    @uca("addressAlias")
    private final String addressAlias;
    @uca(AddressEntity.APARTMENT_FIELD_NAME)
    private final String apartment;
    @uca("building")
    private final String building;
    @uca("comment")
    private final String comment;
    @uca("entrance")
    private final String entrance;
    @uca("floor")
    private final String floor;
    @uca(AddressEntity.HOUSE_NUMBER_FIELD_NAME)
    private final String houseNumber;
    @uca("id")
    private final String id;
    @uca("intercom")
    private final String intercom;
    @uca("postcode")
    private final String postcode;
    @uca(AddressEntity.STREET_ID_FIELD_NAME)
    private final String streetId;
    @uca("fullStreetName")
    private final String streetName;

    public DeliveryAddressDto() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
    }

    public static /* synthetic */ DeliveryAddressDto copy$default(DeliveryAddressDto deliveryAddressDto, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, int i, Object obj) {
        String str13;
        String str14;
        String str15;
        String str16;
        String str17;
        String str18;
        String str19;
        String str20;
        String str21;
        String str22;
        String str23;
        String str24;
        if ((i & 1) != 0) {
            str13 = deliveryAddressDto.id;
        } else {
            str13 = str;
        }
        if ((i & 2) != 0) {
            str14 = deliveryAddressDto.streetId;
        } else {
            str14 = str2;
        }
        if ((i & 4) != 0) {
            str15 = deliveryAddressDto.streetName;
        } else {
            str15 = str3;
        }
        if ((i & 8) != 0) {
            str16 = deliveryAddressDto.houseNumber;
        } else {
            str16 = str4;
        }
        if ((i & 16) != 0) {
            str17 = deliveryAddressDto.building;
        } else {
            str17 = str5;
        }
        if ((i & 32) != 0) {
            str18 = deliveryAddressDto.apartment;
        } else {
            str18 = str6;
        }
        if ((i & 64) != 0) {
            str19 = deliveryAddressDto.entrance;
        } else {
            str19 = str7;
        }
        if ((i & 128) != 0) {
            str20 = deliveryAddressDto.floor;
        } else {
            str20 = str8;
        }
        if ((i & 256) != 0) {
            str21 = deliveryAddressDto.intercom;
        } else {
            str21 = str9;
        }
        if ((i & 512) != 0) {
            str22 = deliveryAddressDto.comment;
        } else {
            str22 = str10;
        }
        if ((i & 1024) != 0) {
            str23 = deliveryAddressDto.addressAlias;
        } else {
            str23 = str11;
        }
        if ((i & 2048) != 0) {
            str24 = deliveryAddressDto.postcode;
        } else {
            str24 = str12;
        }
        return deliveryAddressDto.copy(str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24);
    }

    public final String component1() {
        return this.id;
    }

    public final String component10() {
        return this.comment;
    }

    public final String component11() {
        return this.addressAlias;
    }

    public final String component12() {
        return this.postcode;
    }

    public final String component2() {
        return this.streetId;
    }

    public final String component3() {
        return this.streetName;
    }

    public final String component4() {
        return this.houseNumber;
    }

    public final String component5() {
        return this.building;
    }

    public final String component6() {
        return this.apartment;
    }

    public final String component7() {
        return this.entrance;
    }

    public final String component8() {
        return this.floor;
    }

    public final String component9() {
        return this.intercom;
    }

    public final DeliveryAddressDto copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12) {
        z65.h(str, "id");
        z65.h(str2, AddressEntity.STREET_ID_FIELD_NAME);
        z65.h(str3, "streetName");
        z65.h(str4, AddressEntity.HOUSE_NUMBER_FIELD_NAME);
        z65.h(str5, "building");
        z65.h(str6, AddressEntity.APARTMENT_FIELD_NAME);
        z65.h(str7, "entrance");
        z65.h(str8, "floor");
        z65.h(str10, "comment");
        z65.h(str11, "addressAlias");
        z65.h(str12, "postcode");
        return new DeliveryAddressDto(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeliveryAddressDto)) {
            return false;
        }
        DeliveryAddressDto deliveryAddressDto = (DeliveryAddressDto) obj;
        if (z65.c(this.id, deliveryAddressDto.id) && z65.c(this.streetId, deliveryAddressDto.streetId) && z65.c(this.streetName, deliveryAddressDto.streetName) && z65.c(this.houseNumber, deliveryAddressDto.houseNumber) && z65.c(this.building, deliveryAddressDto.building) && z65.c(this.apartment, deliveryAddressDto.apartment) && z65.c(this.entrance, deliveryAddressDto.entrance) && z65.c(this.floor, deliveryAddressDto.floor) && z65.c(this.intercom, deliveryAddressDto.intercom) && z65.c(this.comment, deliveryAddressDto.comment) && z65.c(this.addressAlias, deliveryAddressDto.addressAlias) && z65.c(this.postcode, deliveryAddressDto.postcode)) {
            return true;
        }
        return false;
    }

    public final String getAddressAlias() {
        return this.addressAlias;
    }

    public final String getApartment() {
        return this.apartment;
    }

    public final String getBuilding() {
        return this.building;
    }

    public final String getComment() {
        return this.comment;
    }

    public final String getEntrance() {
        return this.entrance;
    }

    public final String getFloor() {
        return this.floor;
    }

    public final String getHouseNumber() {
        return this.houseNumber;
    }

    public final String getId() {
        return this.id;
    }

    public final String getIntercom() {
        return this.intercom;
    }

    public final String getPostcode() {
        return this.postcode;
    }

    public final String getStreetId() {
        return this.streetId;
    }

    public final String getStreetName() {
        return this.streetName;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((((((((((((((this.id.hashCode() * 31) + this.streetId.hashCode()) * 31) + this.streetName.hashCode()) * 31) + this.houseNumber.hashCode()) * 31) + this.building.hashCode()) * 31) + this.apartment.hashCode()) * 31) + this.entrance.hashCode()) * 31) + this.floor.hashCode()) * 31;
        String str = this.intercom;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return ((((((hashCode2 + hashCode) * 31) + this.comment.hashCode()) * 31) + this.addressAlias.hashCode()) * 31) + this.postcode.hashCode();
    }

    public String toString() {
        String str = this.id;
        String str2 = this.streetId;
        String str3 = this.streetName;
        String str4 = this.houseNumber;
        String str5 = this.building;
        String str6 = this.apartment;
        String str7 = this.entrance;
        String str8 = this.floor;
        String str9 = this.intercom;
        String str10 = this.comment;
        String str11 = this.addressAlias;
        String str12 = this.postcode;
        return "DeliveryAddressDto(id=" + str + ", streetId=" + str2 + ", streetName=" + str3 + ", houseNumber=" + str4 + ", building=" + str5 + ", apartment=" + str6 + ", entrance=" + str7 + ", floor=" + str8 + ", intercom=" + str9 + ", comment=" + str10 + ", addressAlias=" + str11 + ", postcode=" + str12 + ")";
    }

    public DeliveryAddressDto(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12) {
        z65.h(str, "id");
        z65.h(str2, AddressEntity.STREET_ID_FIELD_NAME);
        z65.h(str3, "streetName");
        z65.h(str4, AddressEntity.HOUSE_NUMBER_FIELD_NAME);
        z65.h(str5, "building");
        z65.h(str6, AddressEntity.APARTMENT_FIELD_NAME);
        z65.h(str7, "entrance");
        z65.h(str8, "floor");
        z65.h(str10, "comment");
        z65.h(str11, "addressAlias");
        z65.h(str12, "postcode");
        this.id = str;
        this.streetId = str2;
        this.streetName = str3;
        this.houseNumber = str4;
        this.building = str5;
        this.apartment = str6;
        this.entrance = str7;
        this.floor = str8;
        this.intercom = str9;
        this.comment = str10;
        this.addressAlias = str11;
        this.postcode = str12;
    }

    public /* synthetic */ DeliveryAddressDto(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) != 0 ? "" : str10, (i & 1024) != 0 ? "" : str11, (i & 2048) == 0 ? str12 : "");
    }
}
