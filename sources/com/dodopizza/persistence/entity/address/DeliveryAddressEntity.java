package com.dodopizza.persistence.entity.address;

import com.dodopizza.persistence.entity.menu.ShoppingInfoEntity;
import io.realm.n0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: DeliveryAddressEntity.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b'\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002Bm\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\"\u001a\u00020\u0003¢\u0006\u0004\b(\u0010)R\"\u0010\u0004\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\n\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0005\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\"\u0010\r\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0005\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\"\u0010\u0010\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0005\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR\"\u0010\u0013\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0005\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\tR\"\u0010\u0016\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0005\u001a\u0004\b\u0017\u0010\u0007\"\u0004\b\u0018\u0010\tR\"\u0010\u0019\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0005\u001a\u0004\b\u001a\u0010\u0007\"\u0004\b\u001b\u0010\tR$\u0010\u001c\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0005\u001a\u0004\b\u001d\u0010\u0007\"\u0004\b\u001e\u0010\tR\"\u0010\u001f\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u0005\u001a\u0004\b \u0010\u0007\"\u0004\b!\u0010\tR\"\u0010\"\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u0005\u001a\u0004\b#\u0010\u0007\"\u0004\b$\u0010\tR$\u0010%\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b%\u0010\u0005\u001a\u0004\b&\u0010\u0007\"\u0004\b'\u0010\t¨\u0006*"}, d2 = {"Lcom/dodopizza/persistence/entity/address/DeliveryAddressEntity;", "Lyi3;", "Lio/realm/n0;", "", ShoppingInfoEntity.FIELD_EXTERNAL_ID, "Ljava/lang/String;", "getExternalId", "()Ljava/lang/String;", "setExternalId", "(Ljava/lang/String;)V", AddressEntity.STREET_ID_FIELD_NAME, "getStreetId", "setStreetId", "streetName", "getStreetName", "setStreetName", AddressEntity.HOUSE_NUMBER_FIELD_NAME, "getHouseNumber", "setHouseNumber", AddressEntity.APARTMENT_FIELD_NAME, "getApartment", "setApartment", "entrance", "getEntrance", "setEntrance", "floor", "getFloor", "setFloor", "intercom", "getIntercom", "setIntercom", "comment", "getComment", "setComment", "addressAlias", "getAddressAlias", "setAddressAlias", "id", "getId", "setId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "persistence_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public class DeliveryAddressEntity extends n0 implements yi3, gfc {
    private String addressAlias;
    private String apartment;
    private String comment;
    private String entrance;
    private String externalId;
    private String floor;
    private String houseNumber;
    private String id;
    private String intercom;
    private String streetId;
    private String streetName;

    public DeliveryAddressEntity() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
        if (this instanceof r89) {
            ((r89) this).b();
        }
    }

    public String getAddressAlias() {
        return realmGet$addressAlias();
    }

    public String getApartment() {
        return realmGet$apartment();
    }

    public String getComment() {
        return realmGet$comment();
    }

    public String getEntrance() {
        return realmGet$entrance();
    }

    public String getExternalId() {
        return realmGet$externalId();
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

    public String getIntercom() {
        return realmGet$intercom();
    }

    public String getStreetId() {
        return realmGet$streetId();
    }

    public String getStreetName() {
        return realmGet$streetName();
    }

    @Override // defpackage.gfc
    public String realmGet$addressAlias() {
        return this.addressAlias;
    }

    @Override // defpackage.gfc
    public String realmGet$apartment() {
        return this.apartment;
    }

    @Override // defpackage.gfc
    public String realmGet$comment() {
        return this.comment;
    }

    @Override // defpackage.gfc
    public String realmGet$entrance() {
        return this.entrance;
    }

    @Override // defpackage.gfc
    public String realmGet$externalId() {
        return this.externalId;
    }

    @Override // defpackage.gfc
    public String realmGet$floor() {
        return this.floor;
    }

    @Override // defpackage.gfc
    public String realmGet$houseNumber() {
        return this.houseNumber;
    }

    @Override // defpackage.gfc
    public String realmGet$id() {
        return this.id;
    }

    @Override // defpackage.gfc
    public String realmGet$intercom() {
        return this.intercom;
    }

    @Override // defpackage.gfc
    public String realmGet$streetId() {
        return this.streetId;
    }

    @Override // defpackage.gfc
    public String realmGet$streetName() {
        return this.streetName;
    }

    @Override // defpackage.gfc
    public void realmSet$addressAlias(String str) {
        this.addressAlias = str;
    }

    @Override // defpackage.gfc
    public void realmSet$apartment(String str) {
        this.apartment = str;
    }

    @Override // defpackage.gfc
    public void realmSet$comment(String str) {
        this.comment = str;
    }

    @Override // defpackage.gfc
    public void realmSet$entrance(String str) {
        this.entrance = str;
    }

    @Override // defpackage.gfc
    public void realmSet$externalId(String str) {
        this.externalId = str;
    }

    @Override // defpackage.gfc
    public void realmSet$floor(String str) {
        this.floor = str;
    }

    @Override // defpackage.gfc
    public void realmSet$houseNumber(String str) {
        this.houseNumber = str;
    }

    @Override // defpackage.gfc
    public void realmSet$id(String str) {
        this.id = str;
    }

    @Override // defpackage.gfc
    public void realmSet$intercom(String str) {
        this.intercom = str;
    }

    @Override // defpackage.gfc
    public void realmSet$streetId(String str) {
        this.streetId = str;
    }

    @Override // defpackage.gfc
    public void realmSet$streetName(String str) {
        this.streetName = str;
    }

    public void setAddressAlias(String str) {
        z65.h(str, "<set-?>");
        realmSet$addressAlias(str);
    }

    public void setApartment(String str) {
        z65.h(str, "<set-?>");
        realmSet$apartment(str);
    }

    public void setComment(String str) {
        z65.h(str, "<set-?>");
        realmSet$comment(str);
    }

    public void setEntrance(String str) {
        z65.h(str, "<set-?>");
        realmSet$entrance(str);
    }

    public void setExternalId(String str) {
        z65.h(str, "<set-?>");
        realmSet$externalId(str);
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

    public void setIntercom(String str) {
        realmSet$intercom(str);
    }

    public void setStreetId(String str) {
        z65.h(str, "<set-?>");
        realmSet$streetId(str);
    }

    public void setStreetName(String str) {
        z65.h(str, "<set-?>");
        realmSet$streetName(str);
    }

    public /* synthetic */ DeliveryAddressEntity(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) == 0 ? str10 : "");
        if (this instanceof r89) {
            ((r89) this).b();
        }
    }

    public DeliveryAddressEntity(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        z65.h(str, ShoppingInfoEntity.FIELD_EXTERNAL_ID);
        z65.h(str2, AddressEntity.STREET_ID_FIELD_NAME);
        z65.h(str3, "streetName");
        z65.h(str4, AddressEntity.HOUSE_NUMBER_FIELD_NAME);
        z65.h(str5, AddressEntity.APARTMENT_FIELD_NAME);
        z65.h(str6, "entrance");
        z65.h(str7, "floor");
        z65.h(str9, "comment");
        z65.h(str10, "addressAlias");
        if (this instanceof r89) {
            ((r89) this).b();
        }
        realmSet$externalId(str);
        realmSet$streetId(str2);
        realmSet$streetName(str3);
        realmSet$houseNumber(str4);
        realmSet$apartment(str5);
        realmSet$entrance(str6);
        realmSet$floor(str7);
        realmSet$intercom(str8);
        realmSet$comment(str9);
        realmSet$addressAlias(str10);
    }
}
