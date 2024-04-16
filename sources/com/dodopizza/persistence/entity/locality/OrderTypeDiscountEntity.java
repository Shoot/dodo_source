package com.dodopizza.persistence.entity.locality;

import io.realm.n0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: OrderTypeDiscountEntity.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B/\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0014\u001a\u00020\r¢\u0006\u0004\b\u001a\u0010\u001bR\"\u0010\u0004\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\n\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0005\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\"\u0010\u000e\u001a\u00020\r8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0014\u001a\u00020\r8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013R$\u0010\u0017\u001a\u0004\u0018\u00010\r8\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u000f\u001a\u0004\b\u0018\u0010\u0011\"\u0004\b\u0019\u0010\u0013¨\u0006\u001c"}, d2 = {"Lcom/dodopizza/persistence/entity/locality/OrderTypeDiscountEntity;", "Lyi3;", "Lio/realm/n0;", "", "carryout", "I", "getCarryout", "()I", "setCarryout", "(I)V", "restaurant", "getRestaurant", "setRestaurant", "", "carryoutText", "Ljava/lang/String;", "getCarryoutText", "()Ljava/lang/String;", "setCarryoutText", "(Ljava/lang/String;)V", "restaurantText", "getRestaurantText", "setRestaurantText", "id", "getId", "setId", "<init>", "(IILjava/lang/String;Ljava/lang/String;)V", "persistence_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public class OrderTypeDiscountEntity extends n0 implements yi3, ogc {
    private int carryout;
    private String carryoutText;
    private String id;
    private int restaurant;
    private String restaurantText;

    public OrderTypeDiscountEntity() {
        this(0, 0, null, null, 15, null);
        if (this instanceof r89) {
            ((r89) this).b();
        }
    }

    public int getCarryout() {
        return realmGet$carryout();
    }

    public String getCarryoutText() {
        return realmGet$carryoutText();
    }

    @Override // defpackage.yi3
    public String getId() {
        return realmGet$id();
    }

    public int getRestaurant() {
        return realmGet$restaurant();
    }

    public String getRestaurantText() {
        return realmGet$restaurantText();
    }

    @Override // defpackage.ogc
    public int realmGet$carryout() {
        return this.carryout;
    }

    @Override // defpackage.ogc
    public String realmGet$carryoutText() {
        return this.carryoutText;
    }

    @Override // defpackage.ogc
    public String realmGet$id() {
        return this.id;
    }

    @Override // defpackage.ogc
    public int realmGet$restaurant() {
        return this.restaurant;
    }

    @Override // defpackage.ogc
    public String realmGet$restaurantText() {
        return this.restaurantText;
    }

    @Override // defpackage.ogc
    public void realmSet$carryout(int i) {
        this.carryout = i;
    }

    @Override // defpackage.ogc
    public void realmSet$carryoutText(String str) {
        this.carryoutText = str;
    }

    @Override // defpackage.ogc
    public void realmSet$id(String str) {
        this.id = str;
    }

    @Override // defpackage.ogc
    public void realmSet$restaurant(int i) {
        this.restaurant = i;
    }

    @Override // defpackage.ogc
    public void realmSet$restaurantText(String str) {
        this.restaurantText = str;
    }

    public void setCarryout(int i) {
        realmSet$carryout(i);
    }

    public void setCarryoutText(String str) {
        z65.h(str, "<set-?>");
        realmSet$carryoutText(str);
    }

    @Override // defpackage.yi3
    public void setId(String str) {
        realmSet$id(str);
    }

    public void setRestaurant(int i) {
        realmSet$restaurant(i);
    }

    public void setRestaurantText(String str) {
        z65.h(str, "<set-?>");
        realmSet$restaurantText(str);
    }

    public /* synthetic */ OrderTypeDiscountEntity(int i, int i2, String str, String str2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? "" : str, (i3 & 8) != 0 ? "" : str2);
        if (this instanceof r89) {
            ((r89) this).b();
        }
    }

    public OrderTypeDiscountEntity(int i, int i2, String str, String str2) {
        z65.h(str, "carryoutText");
        z65.h(str2, "restaurantText");
        if (this instanceof r89) {
            ((r89) this).b();
        }
        realmSet$carryout(i);
        realmSet$restaurant(i2);
        realmSet$carryoutText(str);
        realmSet$restaurantText(str2);
    }
}
