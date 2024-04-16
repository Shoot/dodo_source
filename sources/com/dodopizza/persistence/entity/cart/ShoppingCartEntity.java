package com.dodopizza.persistence.entity.cart;

import io.realm.k0;
import io.realm.n0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: ShoppingCartEntity.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0006\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002B\u008d\u0001\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\n\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0016\u0012\b\b\u0002\u0010!\u001a\u00020 \u0012\b\b\u0002\u0010'\u001a\u00020 \u0012\b\b\u0002\u0010*\u001a\u00020 \u0012\b\b\u0002\u0010-\u001a\u00020 \u0012\b\b\u0002\u00100\u001a\u00020 \u0012\b\b\u0002\u00104\u001a\u000203\u0012\b\b\u0002\u00109\u001a\u00020\u0016¢\u0006\u0004\b<\u0010=R$\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR(\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R(\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\r\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011R\"\u0010\u0017\u001a\u00020\u00168\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010\u001d\u001a\u00020\u00168\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001a\"\u0004\b\u001f\u0010\u001cR\"\u0010!\u001a\u00020 8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010'\u001a\u00020 8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b'\u0010\"\u001a\u0004\b(\u0010$\"\u0004\b)\u0010&R\"\u0010*\u001a\u00020 8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b*\u0010\"\u001a\u0004\b+\u0010$\"\u0004\b,\u0010&R\"\u0010-\u001a\u00020 8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b-\u0010\"\u001a\u0004\b.\u0010$\"\u0004\b/\u0010&R\"\u00100\u001a\u00020 8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b0\u0010\"\u001a\u0004\b1\u0010$\"\u0004\b2\u0010&R\"\u00104\u001a\u0002038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b4\u00106\"\u0004\b7\u00108R\"\u00109\u001a\u00020\u00168\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b9\u0010\u0018\u001a\u0004\b:\u0010\u001a\"\u0004\b;\u0010\u001c¨\u0006>"}, d2 = {"Lcom/dodopizza/persistence/entity/cart/ShoppingCartEntity;", "Lyi3;", "Lio/realm/n0;", "", "id", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "Lio/realm/k0;", "Lcom/dodopizza/persistence/entity/cart/CartItemEntity;", "items", "Lio/realm/k0;", "getItems", "()Lio/realm/k0;", "setItems", "(Lio/realm/k0;)V", "Lcom/dodopizza/persistence/entity/cart/AppliedBonusActionEntity;", "appliedBonusActions", "getAppliedBonusActions", "setAppliedBonusActions", "", "saucesCount", "I", "getSaucesCount", "()I", "setSaucesCount", "(I)V", "freeSaucesCount", "getFreeSaucesCount", "setFreeSaucesCount", "", "saucesCost", "D", "getSaucesCost", "()D", "setSaucesCost", "(D)V", "rawPrice", "getRawPrice", "setRawPrice", "rawPriceWithoutGoods", "getRawPriceWithoutGoods", "setRawPriceWithoutGoods", "discount", "getDiscount", "setDiscount", "total", "getTotal", "setTotal", "", "isReadyToCheckout", "Z", "()Z", "setReadyToCheckout", "(Z)V", "orderType", "getOrderType", "setOrderType", "<init>", "(Ljava/lang/String;Lio/realm/k0;Lio/realm/k0;IIDDDDDZI)V", "persistence_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public class ShoppingCartEntity extends n0 implements yi3, yfc {
    private k0<AppliedBonusActionEntity> appliedBonusActions;
    private double discount;
    private int freeSaucesCount;
    private String id;
    private boolean isReadyToCheckout;
    private k0<CartItemEntity> items;
    private int orderType;
    private double rawPrice;
    private double rawPriceWithoutGoods;
    private double saucesCost;
    private int saucesCount;
    private double total;

    public ShoppingCartEntity() {
        this(null, null, null, 0, 0, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, false, 0, 4095, null);
        if (this instanceof r89) {
            ((r89) this).b();
        }
    }

    public k0<AppliedBonusActionEntity> getAppliedBonusActions() {
        return realmGet$appliedBonusActions();
    }

    public double getDiscount() {
        return realmGet$discount();
    }

    public int getFreeSaucesCount() {
        return realmGet$freeSaucesCount();
    }

    @Override // defpackage.yi3
    public String getId() {
        return realmGet$id();
    }

    public k0<CartItemEntity> getItems() {
        return realmGet$items();
    }

    public int getOrderType() {
        return realmGet$orderType();
    }

    public double getRawPrice() {
        return realmGet$rawPrice();
    }

    public double getRawPriceWithoutGoods() {
        return realmGet$rawPriceWithoutGoods();
    }

    public double getSaucesCost() {
        return realmGet$saucesCost();
    }

    public int getSaucesCount() {
        return realmGet$saucesCount();
    }

    public double getTotal() {
        return realmGet$total();
    }

    public boolean isReadyToCheckout() {
        return realmGet$isReadyToCheckout();
    }

    @Override // defpackage.yfc
    public k0 realmGet$appliedBonusActions() {
        return this.appliedBonusActions;
    }

    @Override // defpackage.yfc
    public double realmGet$discount() {
        return this.discount;
    }

    @Override // defpackage.yfc
    public int realmGet$freeSaucesCount() {
        return this.freeSaucesCount;
    }

    @Override // defpackage.yfc
    public String realmGet$id() {
        return this.id;
    }

    @Override // defpackage.yfc
    public boolean realmGet$isReadyToCheckout() {
        return this.isReadyToCheckout;
    }

    @Override // defpackage.yfc
    public k0 realmGet$items() {
        return this.items;
    }

    @Override // defpackage.yfc
    public int realmGet$orderType() {
        return this.orderType;
    }

    @Override // defpackage.yfc
    public double realmGet$rawPrice() {
        return this.rawPrice;
    }

    @Override // defpackage.yfc
    public double realmGet$rawPriceWithoutGoods() {
        return this.rawPriceWithoutGoods;
    }

    @Override // defpackage.yfc
    public double realmGet$saucesCost() {
        return this.saucesCost;
    }

    @Override // defpackage.yfc
    public int realmGet$saucesCount() {
        return this.saucesCount;
    }

    @Override // defpackage.yfc
    public double realmGet$total() {
        return this.total;
    }

    @Override // defpackage.yfc
    public void realmSet$appliedBonusActions(k0 k0Var) {
        this.appliedBonusActions = k0Var;
    }

    @Override // defpackage.yfc
    public void realmSet$discount(double d) {
        this.discount = d;
    }

    @Override // defpackage.yfc
    public void realmSet$freeSaucesCount(int i) {
        this.freeSaucesCount = i;
    }

    @Override // defpackage.yfc
    public void realmSet$id(String str) {
        this.id = str;
    }

    @Override // defpackage.yfc
    public void realmSet$isReadyToCheckout(boolean z) {
        this.isReadyToCheckout = z;
    }

    @Override // defpackage.yfc
    public void realmSet$items(k0 k0Var) {
        this.items = k0Var;
    }

    @Override // defpackage.yfc
    public void realmSet$orderType(int i) {
        this.orderType = i;
    }

    @Override // defpackage.yfc
    public void realmSet$rawPrice(double d) {
        this.rawPrice = d;
    }

    @Override // defpackage.yfc
    public void realmSet$rawPriceWithoutGoods(double d) {
        this.rawPriceWithoutGoods = d;
    }

    @Override // defpackage.yfc
    public void realmSet$saucesCost(double d) {
        this.saucesCost = d;
    }

    @Override // defpackage.yfc
    public void realmSet$saucesCount(int i) {
        this.saucesCount = i;
    }

    @Override // defpackage.yfc
    public void realmSet$total(double d) {
        this.total = d;
    }

    public void setAppliedBonusActions(k0<AppliedBonusActionEntity> k0Var) {
        z65.h(k0Var, "<set-?>");
        realmSet$appliedBonusActions(k0Var);
    }

    public void setDiscount(double d) {
        realmSet$discount(d);
    }

    public void setFreeSaucesCount(int i) {
        realmSet$freeSaucesCount(i);
    }

    @Override // defpackage.yi3
    public void setId(String str) {
        realmSet$id(str);
    }

    public void setItems(k0<CartItemEntity> k0Var) {
        z65.h(k0Var, "<set-?>");
        realmSet$items(k0Var);
    }

    public void setOrderType(int i) {
        realmSet$orderType(i);
    }

    public void setRawPrice(double d) {
        realmSet$rawPrice(d);
    }

    public void setRawPriceWithoutGoods(double d) {
        realmSet$rawPriceWithoutGoods(d);
    }

    public void setReadyToCheckout(boolean z) {
        realmSet$isReadyToCheckout(z);
    }

    public void setSaucesCost(double d) {
        realmSet$saucesCost(d);
    }

    public void setSaucesCount(int i) {
        realmSet$saucesCount(i);
    }

    public void setTotal(double d) {
        realmSet$total(d);
    }

    public /* synthetic */ ShoppingCartEntity(String str, k0 k0Var, k0 k0Var2, int i, int i2, double d, double d2, double d3, double d4, double d5, boolean z, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? null : str, (i4 & 2) != 0 ? new k0() : k0Var, (i4 & 4) != 0 ? new k0() : k0Var2, (i4 & 8) != 0 ? 0 : i, (i4 & 16) != 0 ? 0 : i2, (i4 & 32) != 0 ? 0.0d : d, (i4 & 64) != 0 ? 0.0d : d2, (i4 & 128) != 0 ? 0.0d : d3, (i4 & 256) != 0 ? 0.0d : d4, (i4 & 512) == 0 ? d5 : 0.0d, (i4 & 1024) != 0 ? false : z, (i4 & 2048) == 0 ? i3 : 0);
        if (this instanceof r89) {
            ((r89) this).b();
        }
    }

    public ShoppingCartEntity(String str, k0<CartItemEntity> k0Var, k0<AppliedBonusActionEntity> k0Var2, int i, int i2, double d, double d2, double d3, double d4, double d5, boolean z, int i3) {
        z65.h(k0Var, "items");
        z65.h(k0Var2, "appliedBonusActions");
        if (this instanceof r89) {
            ((r89) this).b();
        }
        realmSet$id(str);
        realmSet$items(k0Var);
        realmSet$appliedBonusActions(k0Var2);
        realmSet$saucesCount(i);
        realmSet$freeSaucesCount(i2);
        realmSet$saucesCost(d);
        realmSet$rawPrice(d2);
        realmSet$rawPriceWithoutGoods(d3);
        realmSet$discount(d4);
        realmSet$total(d5);
        realmSet$isReadyToCheckout(z);
        realmSet$orderType(i3);
    }
}
