package com.dodopizza.persistence.entity.address;

import io.realm.n0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: AddressEntity.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b.\b\u0017\u0018\u0000 02\u00020\u00012\u00020\u0002:\u00010B\u008b\u0001\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\"\u001a\u00020\u0003\u0012\b\b\u0002\u0010%\u001a\u00020\u0003\u0012\b\b\u0002\u0010(\u001a\u00020\u0003\u0012\b\b\u0002\u0010+\u001a\u00020\u0003¢\u0006\u0004\b.\u0010/R$\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\n\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0005\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\"\u0010\r\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0005\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\"\u0010\u0010\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0005\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR\"\u0010\u0013\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0005\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\tR\"\u0010\u0016\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0005\u001a\u0004\b\u0017\u0010\u0007\"\u0004\b\u0018\u0010\tR\"\u0010\u0019\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0005\u001a\u0004\b\u001a\u0010\u0007\"\u0004\b\u001b\u0010\tR\"\u0010\u001c\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0005\u001a\u0004\b\u001d\u0010\u0007\"\u0004\b\u001e\u0010\tR\"\u0010\u001f\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u0005\u001a\u0004\b \u0010\u0007\"\u0004\b!\u0010\tR\"\u0010\"\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u0005\u001a\u0004\b#\u0010\u0007\"\u0004\b$\u0010\tR\"\u0010%\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b%\u0010\u0005\u001a\u0004\b&\u0010\u0007\"\u0004\b'\u0010\tR\"\u0010(\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b(\u0010\u0005\u001a\u0004\b)\u0010\u0007\"\u0004\b*\u0010\tR\"\u0010+\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b+\u0010\u0005\u001a\u0004\b,\u0010\u0007\"\u0004\b-\u0010\t¨\u00061"}, d2 = {"Lcom/dodopizza/persistence/entity/address/AddressEntity;", "Lyi3;", "Lio/realm/n0;", "", "id", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "addressName", "getAddressName", "setAddressName", AddressEntity.STREET_ID_FIELD_NAME, "getStreetId", "setStreetId", "streetName", "getStreetName", "setStreetName", "shortStreetName", "getShortStreetName", "setShortStreetName", AddressEntity.HOUSE_NUMBER_FIELD_NAME, "getHouseNumber", "setHouseNumber", "building", "getBuilding", "setBuilding", AddressEntity.APARTMENT_FIELD_NAME, "getApartment", "setApartment", "entrance", "getEntrance", "setEntrance", "floor", "getFloor", "setFloor", "intercome", "getIntercome", "setIntercome", "comment", "getComment", "setComment", "postalcode", "getPostalcode", "setPostalcode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Companion", "persistence_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public class AddressEntity extends n0 implements yi3, ffc {
    public static final String APARTMENT_FIELD_NAME = "apartment";
    public static final Companion Companion = new Companion(null);
    public static final String HOUSE_NUMBER_FIELD_NAME = "houseNumber";
    public static final String STREET_ID_FIELD_NAME = "streetId";
    private String addressName;
    private String apartment;
    private String building;
    private String comment;
    private String entrance;
    private String floor;
    private String houseNumber;
    private String id;
    private String intercome;
    private String postalcode;
    private String shortStreetName;
    private String streetId;
    private String streetName;

    /* compiled from: AddressEntity.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/dodopizza/persistence/entity/address/AddressEntity$Companion;", "", "()V", "APARTMENT_FIELD_NAME", "", "HOUSE_NUMBER_FIELD_NAME", "STREET_ID_FIELD_NAME", "persistence_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public AddressEntity() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
        if (this instanceof r89) {
            ((r89) this).b();
        }
    }

    public String getAddressName() {
        return realmGet$addressName();
    }

    public String getApartment() {
        return realmGet$apartment();
    }

    public String getBuilding() {
        return realmGet$building();
    }

    public String getComment() {
        return realmGet$comment();
    }

    public String getEntrance() {
        return realmGet$entrance();
    }

    public String getFloor() {
        return realmGet$floor();
    }

    public String getHouseNumber() {
        return realmGet$houseNumber();
    }

    @Override // defpackage.yi3
    public String getId() {
        return realmGet$id();
    }

    public String getIntercome() {
        return realmGet$intercome();
    }

    public String getPostalcode() {
        return realmGet$postalcode();
    }

    public String getShortStreetName() {
        return realmGet$shortStreetName();
    }

    public String getStreetId() {
        return realmGet$streetId();
    }

    public String getStreetName() {
        return realmGet$streetName();
    }

    @Override // defpackage.ffc
    public String realmGet$addressName() {
        return this.addressName;
    }

    @Override // defpackage.ffc
    public String realmGet$apartment() {
        return this.apartment;
    }

    @Override // defpackage.ffc
    public String realmGet$building() {
        return this.building;
    }

    @Override // defpackage.ffc
    public String realmGet$comment() {
        return this.comment;
    }

    @Override // defpackage.ffc
    public String realmGet$entrance() {
        return this.entrance;
    }

    @Override // defpackage.ffc
    public String realmGet$floor() {
        return this.floor;
    }

    @Override // defpackage.ffc
    public String realmGet$houseNumber() {
        return this.houseNumber;
    }

    @Override // defpackage.ffc
    public String realmGet$id() {
        return this.id;
    }

    @Override // defpackage.ffc
    public String realmGet$intercome() {
        return this.intercome;
    }

    @Override // defpackage.ffc
    public String realmGet$postalcode() {
        return this.postalcode;
    }

    @Override // defpackage.ffc
    public String realmGet$shortStreetName() {
        return this.shortStreetName;
    }

    @Override // defpackage.ffc
    public String realmGet$streetId() {
        return this.streetId;
    }

    @Override // defpackage.ffc
    public String realmGet$streetName() {
        return this.streetName;
    }

    @Override // defpackage.ffc
    public void realmSet$addressName(String str) {
        this.addressName = str;
    }

    @Override // defpackage.ffc
    public void realmSet$apartment(String str) {
        this.apartment = str;
    }

    @Override // defpackage.ffc
    public void realmSet$building(String str) {
        this.building = str;
    }

    @Override // defpackage.ffc
    public void realmSet$comment(String str) {
        this.comment = str;
    }

    @Override // defpackage.ffc
    public void realmSet$entrance(String str) {
        this.entrance = str;
    }

    @Override // defpackage.ffc
    public void realmSet$floor(String str) {
        this.floor = str;
    }

    @Override // defpackage.ffc
    public void realmSet$houseNumber(String str) {
        this.houseNumber = str;
    }

    @Override // defpackage.ffc
    public void realmSet$id(String str) {
        this.id = str;
    }

    @Override // defpackage.ffc
    public void realmSet$intercome(String str) {
        this.intercome = str;
    }

    @Override // defpackage.ffc
    public void realmSet$postalcode(String str) {
        this.postalcode = str;
    }

    @Override // defpackage.ffc
    public void realmSet$shortStreetName(String str) {
        this.shortStreetName = str;
    }

    @Override // defpackage.ffc
    public void realmSet$streetId(String str) {
        this.streetId = str;
    }

    @Override // defpackage.ffc
    public void realmSet$streetName(String str) {
        this.streetName = str;
    }

    public void setAddressName(String str) {
        z65.h(str, "<set-?>");
        realmSet$addressName(str);
    }

    public void setApartment(String str) {
        z65.h(str, "<set-?>");
        realmSet$apartment(str);
    }

    public void setBuilding(String str) {
        z65.h(str, "<set-?>");
        realmSet$building(str);
    }

    public void setComment(String str) {
        z65.h(str, "<set-?>");
        realmSet$comment(str);
    }

    public void setEntrance(String str) {
        z65.h(str, "<set-?>");
        realmSet$entrance(str);
    }

    public void setFloor(String str) {
        z65.h(str, "<set-?>");
        realmSet$floor(str);
    }

    public void setHouseNumber(String str) {
        z65.h(str, "<set-?>");
        realmSet$houseNumber(str);
    }

    @Override // defpackage.yi3
    public void setId(String str) {
        realmSet$id(str);
    }

    public void setIntercome(String str) {
        z65.h(str, "<set-?>");
        realmSet$intercome(str);
    }

    public void setPostalcode(String str) {
        z65.h(str, "<set-?>");
        realmSet$postalcode(str);
    }

    public void setShortStreetName(String str) {
        z65.h(str, "<set-?>");
        realmSet$shortStreetName(str);
    }

    public void setStreetId(String str) {
        z65.h(str, "<set-?>");
        realmSet$streetId(str);
    }

    public void setStreetName(String str) {
        z65.h(str, "<set-?>");
        realmSet$streetName(str);
    }

    public /* synthetic */ AddressEntity(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) != 0 ? "" : str10, (i & 1024) != 0 ? "" : str11, (i & 2048) != 0 ? "" : str12, (i & 4096) == 0 ? str13 : "");
        if (this instanceof r89) {
            ((r89) this).b();
        }
    }

    public AddressEntity(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13) {
        z65.h(str2, "addressName");
        z65.h(str3, STREET_ID_FIELD_NAME);
        z65.h(str4, "streetName");
        z65.h(str5, "shortStreetName");
        z65.h(str6, HOUSE_NUMBER_FIELD_NAME);
        z65.h(str7, "building");
        z65.h(str8, APARTMENT_FIELD_NAME);
        z65.h(str9, "entrance");
        z65.h(str10, "floor");
        z65.h(str11, "intercome");
        z65.h(str12, "comment");
        z65.h(str13, "postalcode");
        if (this instanceof r89) {
            ((r89) this).b();
        }
        realmSet$id(str);
        realmSet$addressName(str2);
        realmSet$streetId(str3);
        realmSet$streetName(str4);
        realmSet$shortStreetName(str5);
        realmSet$houseNumber(str6);
        realmSet$building(str7);
        realmSet$apartment(str8);
        realmSet$entrance(str9);
        realmSet$floor(str10);
        realmSet$intercome(str11);
        realmSet$comment(str12);
        realmSet$postalcode(str13);
    }
}
