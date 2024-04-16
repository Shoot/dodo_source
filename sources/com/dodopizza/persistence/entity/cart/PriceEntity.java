package com.dodopizza.persistence.entity.cart;

import io.realm.n0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: PriceEntity.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b$\b\u0016\u0018\u00002\u00020\u0001Bk\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0002\u0012\b\b\u0002\u0010!\u001a\u00020\u0002¢\u0006\u0004\b$\u0010%R\"\u0010\u0003\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\t\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\"\u0010\f\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0004\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\"\u0010\u000f\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0004\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\"\u0010\u0012\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0004\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\"\u0010\u0015\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0004\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\"\u0010\u0018\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0004\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\"\u0010\u001b\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0004\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\bR\"\u0010\u001e\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0004\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\bR\"\u0010!\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b!\u0010\u0004\u001a\u0004\b\"\u0010\u0006\"\u0004\b#\u0010\b¨\u0006&"}, d2 = {"Lcom/dodopizza/persistence/entity/cart/PriceEntity;", "Lio/realm/n0;", "", "total", "D", "getTotal", "()D", "setTotal", "(D)V", "subtotal", "getSubtotal", "setSubtotal", "rawPrice", "getRawPrice", "setRawPrice", "rawPriceWithoutGoods", "getRawPriceWithoutGoods", "setRawPriceWithoutGoods", "minOrderPriceForDelivery", "getMinOrderPriceForDelivery", "setMinOrderPriceForDelivery", "sauces", "getSauces", "setSauces", "dodoRubles", "getDodoRubles", "setDodoRubles", "totalDiscount", "getTotalDiscount", "setTotalDiscount", "deliveryFee", "getDeliveryFee", "setDeliveryFee", "loyaltyRewardSum", "getLoyaltyRewardSum", "setLoyaltyRewardSum", "<init>", "(DDDDDDDDDD)V", "persistence_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public class PriceEntity extends n0 implements wfc {
    private double deliveryFee;
    private double dodoRubles;
    private double loyaltyRewardSum;
    private double minOrderPriceForDelivery;
    private double rawPrice;
    private double rawPriceWithoutGoods;
    private double sauces;
    private double subtotal;
    private double total;
    private double totalDiscount;

    public PriceEntity() {
        this(0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 1023, null);
        if (this instanceof r89) {
            ((r89) this).b();
        }
    }

    public double getDeliveryFee() {
        return realmGet$deliveryFee();
    }

    public double getDodoRubles() {
        return realmGet$dodoRubles();
    }

    public double getLoyaltyRewardSum() {
        return realmGet$loyaltyRewardSum();
    }

    public double getMinOrderPriceForDelivery() {
        return realmGet$minOrderPriceForDelivery();
    }

    public double getRawPrice() {
        return realmGet$rawPrice();
    }

    public double getRawPriceWithoutGoods() {
        return realmGet$rawPriceWithoutGoods();
    }

    public double getSauces() {
        return realmGet$sauces();
    }

    public double getSubtotal() {
        return realmGet$subtotal();
    }

    public double getTotal() {
        return realmGet$total();
    }

    public double getTotalDiscount() {
        return realmGet$totalDiscount();
    }

    @Override // defpackage.wfc
    public double realmGet$deliveryFee() {
        return this.deliveryFee;
    }

    @Override // defpackage.wfc
    public double realmGet$dodoRubles() {
        return this.dodoRubles;
    }

    @Override // defpackage.wfc
    public double realmGet$loyaltyRewardSum() {
        return this.loyaltyRewardSum;
    }

    @Override // defpackage.wfc
    public double realmGet$minOrderPriceForDelivery() {
        return this.minOrderPriceForDelivery;
    }

    @Override // defpackage.wfc
    public double realmGet$rawPrice() {
        return this.rawPrice;
    }

    @Override // defpackage.wfc
    public double realmGet$rawPriceWithoutGoods() {
        return this.rawPriceWithoutGoods;
    }

    @Override // defpackage.wfc
    public double realmGet$sauces() {
        return this.sauces;
    }

    @Override // defpackage.wfc
    public double realmGet$subtotal() {
        return this.subtotal;
    }

    @Override // defpackage.wfc
    public double realmGet$total() {
        return this.total;
    }

    @Override // defpackage.wfc
    public double realmGet$totalDiscount() {
        return this.totalDiscount;
    }

    @Override // defpackage.wfc
    public void realmSet$deliveryFee(double d) {
        this.deliveryFee = d;
    }

    @Override // defpackage.wfc
    public void realmSet$dodoRubles(double d) {
        this.dodoRubles = d;
    }

    @Override // defpackage.wfc
    public void realmSet$loyaltyRewardSum(double d) {
        this.loyaltyRewardSum = d;
    }

    @Override // defpackage.wfc
    public void realmSet$minOrderPriceForDelivery(double d) {
        this.minOrderPriceForDelivery = d;
    }

    @Override // defpackage.wfc
    public void realmSet$rawPrice(double d) {
        this.rawPrice = d;
    }

    @Override // defpackage.wfc
    public void realmSet$rawPriceWithoutGoods(double d) {
        this.rawPriceWithoutGoods = d;
    }

    @Override // defpackage.wfc
    public void realmSet$sauces(double d) {
        this.sauces = d;
    }

    @Override // defpackage.wfc
    public void realmSet$subtotal(double d) {
        this.subtotal = d;
    }

    @Override // defpackage.wfc
    public void realmSet$total(double d) {
        this.total = d;
    }

    @Override // defpackage.wfc
    public void realmSet$totalDiscount(double d) {
        this.totalDiscount = d;
    }

    public void setDeliveryFee(double d) {
        realmSet$deliveryFee(d);
    }

    public void setDodoRubles(double d) {
        realmSet$dodoRubles(d);
    }

    public void setLoyaltyRewardSum(double d) {
        realmSet$loyaltyRewardSum(d);
    }

    public void setMinOrderPriceForDelivery(double d) {
        realmSet$minOrderPriceForDelivery(d);
    }

    public void setRawPrice(double d) {
        realmSet$rawPrice(d);
    }

    public void setRawPriceWithoutGoods(double d) {
        realmSet$rawPriceWithoutGoods(d);
    }

    public void setSauces(double d) {
        realmSet$sauces(d);
    }

    public void setSubtotal(double d) {
        realmSet$subtotal(d);
    }

    public void setTotal(double d) {
        realmSet$total(d);
    }

    public void setTotalDiscount(double d) {
        realmSet$totalDiscount(d);
    }

    public /* synthetic */ PriceEntity(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, double d10, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0d : d, (i & 2) != 0 ? 0.0d : d2, (i & 4) != 0 ? 0.0d : d3, (i & 8) != 0 ? 0.0d : d4, (i & 16) != 0 ? 0.0d : d5, (i & 32) != 0 ? 0.0d : d6, (i & 64) != 0 ? 0.0d : d7, (i & 128) != 0 ? 0.0d : d8, (i & 256) != 0 ? 0.0d : d9, (i & 512) == 0 ? d10 : 0.0d);
        if (this instanceof r89) {
            ((r89) this).b();
        }
    }

    public PriceEntity(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, double d10) {
        if (this instanceof r89) {
            ((r89) this).b();
        }
        realmSet$total(d);
        realmSet$subtotal(d2);
        realmSet$rawPrice(d3);
        realmSet$rawPriceWithoutGoods(d4);
        realmSet$minOrderPriceForDelivery(d5);
        realmSet$sauces(d6);
        realmSet$dodoRubles(d7);
        realmSet$totalDiscount(d8);
        realmSet$deliveryFee(d9);
        realmSet$loyaltyRewardSum(d10);
    }
}
