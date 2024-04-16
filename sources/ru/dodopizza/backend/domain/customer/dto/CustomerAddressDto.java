package ru.dodopizza.backend.domain.customer.dto;

import com.dodopizza.persistence.entity.address.AddressEntity;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: CustomerAddressDto.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001c\u0018\u00002\u00020\u0001B\u009d\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0010R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0012R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0012R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0012R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0012¨\u0006\u001f"}, d2 = {"Lru/dodopizza/backend/domain/customer/dto/CustomerAddressDto;", "", "id", "", "addressAlias", AddressEntity.STREET_ID_FIELD_NAME, "streetName", "shortStreetName", AddressEntity.HOUSE_NUMBER_FIELD_NAME, "building", AddressEntity.APARTMENT_FIELD_NAME, "entrance", "floor", "intercom", "comment", "postalcode", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAddressAlias", "()Ljava/lang/String;", "getApartment", "getBuilding", "getComment", "getEntrance", "getFloor", "getHouseNumber", "getId", "getIntercom", "getPostalcode", "getShortStreetName", "getStreetId", "getStreetName", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CustomerAddressDto {
    @uca("addressAlias")
    @mn3
    private final String addressAlias;
    @uca(AddressEntity.APARTMENT_FIELD_NAME)
    @mn3
    private final String apartment;
    @uca("building")
    @mn3
    private final String building;
    @uca("comment")
    @mn3
    private final String comment;
    @uca("entrance")
    @mn3
    private final String entrance;
    @uca("floor")
    @mn3
    private final String floor;
    @uca(AddressEntity.HOUSE_NUMBER_FIELD_NAME)
    @mn3
    private final String houseNumber;
    @uca("id")
    @mn3
    private final String id;
    @uca("intercom")
    @mn3
    private final String intercom;
    @uca("postalcode")
    @mn3
    private final String postalcode;
    @uca("shortStreetName")
    @mn3
    private final String shortStreetName;
    @uca(AddressEntity.STREET_ID_FIELD_NAME)
    @mn3
    private final String streetId;
    @uca("fullStreetName")
    @mn3
    private final String streetName;

    public CustomerAddressDto(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13) {
        z65.h(str, "id");
        this.id = str;
        this.addressAlias = str2;
        this.streetId = str3;
        this.streetName = str4;
        this.shortStreetName = str5;
        this.houseNumber = str6;
        this.building = str7;
        this.apartment = str8;
        this.entrance = str9;
        this.floor = str10;
        this.intercom = str11;
        this.comment = str12;
        this.postalcode = str13;
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

    public final String getPostalcode() {
        return this.postalcode;
    }

    public final String getShortStreetName() {
        return this.shortStreetName;
    }

    public final String getStreetId() {
        return this.streetId;
    }

    public final String getStreetName() {
        return this.streetName;
    }

    public /* synthetic */ CustomerAddressDto(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? null : str10, (i & 1024) != 0 ? null : str11, (i & 2048) != 0 ? null : str12, (i & 4096) == 0 ? str13 : null);
    }
}
