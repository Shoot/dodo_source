package ru.dodopizza.backend.domain.state.dto.cart;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: PriceDto.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b$\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001Bk\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\rJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0012J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003Jt\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010&J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020+HÖ\u0001J\t\u0010,\u001a\u00020-HÖ\u0001R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u001a\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000fR\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000fR\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u000fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u000f¨\u0006."}, d2 = {"Lru/dodopizza/backend/domain/state/dto/cart/PriceDto;", "", "totalDiscount", "", "dodoRubles", "rawPrice", "rawPriceWithoutGoods", "minOrderPriceForDelivery", "sauces", "subtotal", "total", "deliveryFee", "loyaltyRewardSum", "(DDDDDDDDDLjava/lang/Double;)V", "getDeliveryFee", "()D", "getDodoRubles", "getLoyaltyRewardSum", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getMinOrderPriceForDelivery", "getRawPrice", "getRawPriceWithoutGoods", "getSauces", "getSubtotal", "getTotal", "getTotalDiscount", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(DDDDDDDDDLjava/lang/Double;)Lru/dodopizza/backend/domain/state/dto/cart/PriceDto;", "equals", "", "other", "hashCode", "", "toString", "", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PriceDto {
    @uca("deliveryFee")
    private final double deliveryFee;
    @uca("dodoRubles")
    private final double dodoRubles;
    @uca("loyaltyProgramCoinsRewarded")
    private final Double loyaltyRewardSum;
    @uca("minOrderPriceForDelivery")
    private final double minOrderPriceForDelivery;
    @uca("rawPrice")
    private final double rawPrice;
    @uca("rawPriceWithoutGoods")
    private final double rawPriceWithoutGoods;
    @uca("sauces")
    private final double sauces;
    @uca("subtotal")
    private final double subtotal;
    @uca("total")
    private final double total;
    @uca("totalDiscount")
    private final double totalDiscount;

    public PriceDto() {
        this(0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, null, 1023, null);
    }

    public static /* synthetic */ PriceDto copy$default(PriceDto priceDto, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, Double d10, int i, Object obj) {
        double d11;
        double d12;
        double d13;
        double d14;
        double d15;
        double d16;
        double d17;
        double d18;
        double d19;
        Double d20;
        if ((i & 1) != 0) {
            d11 = priceDto.totalDiscount;
        } else {
            d11 = d;
        }
        if ((i & 2) != 0) {
            d12 = priceDto.dodoRubles;
        } else {
            d12 = d2;
        }
        if ((i & 4) != 0) {
            d13 = priceDto.rawPrice;
        } else {
            d13 = d3;
        }
        if ((i & 8) != 0) {
            d14 = priceDto.rawPriceWithoutGoods;
        } else {
            d14 = d4;
        }
        if ((i & 16) != 0) {
            d15 = priceDto.minOrderPriceForDelivery;
        } else {
            d15 = d5;
        }
        if ((i & 32) != 0) {
            d16 = priceDto.sauces;
        } else {
            d16 = d6;
        }
        if ((i & 64) != 0) {
            d17 = priceDto.subtotal;
        } else {
            d17 = d7;
        }
        double d21 = d17;
        if ((i & 128) != 0) {
            d18 = priceDto.total;
        } else {
            d18 = d8;
        }
        double d22 = d18;
        if ((i & 256) != 0) {
            d19 = priceDto.deliveryFee;
        } else {
            d19 = d9;
        }
        if ((i & 512) != 0) {
            d20 = priceDto.loyaltyRewardSum;
        } else {
            d20 = d10;
        }
        return priceDto.copy(d11, d12, d13, d14, d15, d16, d21, d22, d19, d20);
    }

    public final double component1() {
        return this.totalDiscount;
    }

    public final Double component10() {
        return this.loyaltyRewardSum;
    }

    public final double component2() {
        return this.dodoRubles;
    }

    public final double component3() {
        return this.rawPrice;
    }

    public final double component4() {
        return this.rawPriceWithoutGoods;
    }

    public final double component5() {
        return this.minOrderPriceForDelivery;
    }

    public final double component6() {
        return this.sauces;
    }

    public final double component7() {
        return this.subtotal;
    }

    public final double component8() {
        return this.total;
    }

    public final double component9() {
        return this.deliveryFee;
    }

    public final PriceDto copy(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, Double d10) {
        return new PriceDto(d, d2, d3, d4, d5, d6, d7, d8, d9, d10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PriceDto)) {
            return false;
        }
        PriceDto priceDto = (PriceDto) obj;
        if (Double.compare(this.totalDiscount, priceDto.totalDiscount) == 0 && Double.compare(this.dodoRubles, priceDto.dodoRubles) == 0 && Double.compare(this.rawPrice, priceDto.rawPrice) == 0 && Double.compare(this.rawPriceWithoutGoods, priceDto.rawPriceWithoutGoods) == 0 && Double.compare(this.minOrderPriceForDelivery, priceDto.minOrderPriceForDelivery) == 0 && Double.compare(this.sauces, priceDto.sauces) == 0 && Double.compare(this.subtotal, priceDto.subtotal) == 0 && Double.compare(this.total, priceDto.total) == 0 && Double.compare(this.deliveryFee, priceDto.deliveryFee) == 0 && z65.c(this.loyaltyRewardSum, priceDto.loyaltyRewardSum)) {
            return true;
        }
        return false;
    }

    public final double getDeliveryFee() {
        return this.deliveryFee;
    }

    public final double getDodoRubles() {
        return this.dodoRubles;
    }

    public final Double getLoyaltyRewardSum() {
        return this.loyaltyRewardSum;
    }

    public final double getMinOrderPriceForDelivery() {
        return this.minOrderPriceForDelivery;
    }

    public final double getRawPrice() {
        return this.rawPrice;
    }

    public final double getRawPriceWithoutGoods() {
        return this.rawPriceWithoutGoods;
    }

    public final double getSauces() {
        return this.sauces;
    }

    public final double getSubtotal() {
        return this.subtotal;
    }

    public final double getTotal() {
        return this.total;
    }

    public final double getTotalDiscount() {
        return this.totalDiscount;
    }

    public int hashCode() {
        int hashCode;
        int a = ((((((((((((((((nkb.a(this.totalDiscount) * 31) + nkb.a(this.dodoRubles)) * 31) + nkb.a(this.rawPrice)) * 31) + nkb.a(this.rawPriceWithoutGoods)) * 31) + nkb.a(this.minOrderPriceForDelivery)) * 31) + nkb.a(this.sauces)) * 31) + nkb.a(this.subtotal)) * 31) + nkb.a(this.total)) * 31) + nkb.a(this.deliveryFee)) * 31;
        Double d = this.loyaltyRewardSum;
        if (d == null) {
            hashCode = 0;
        } else {
            hashCode = d.hashCode();
        }
        return a + hashCode;
    }

    public String toString() {
        double d = this.totalDiscount;
        double d2 = this.dodoRubles;
        double d3 = this.rawPrice;
        double d4 = this.rawPriceWithoutGoods;
        double d5 = this.minOrderPriceForDelivery;
        double d6 = this.sauces;
        double d7 = this.subtotal;
        double d8 = this.total;
        double d9 = this.deliveryFee;
        Double d10 = this.loyaltyRewardSum;
        return "PriceDto(totalDiscount=" + d + ", dodoRubles=" + d2 + ", rawPrice=" + d3 + ", rawPriceWithoutGoods=" + d4 + ", minOrderPriceForDelivery=" + d5 + ", sauces=" + d6 + ", subtotal=" + d7 + ", total=" + d8 + ", deliveryFee=" + d9 + ", loyaltyRewardSum=" + d10 + ")";
    }

    public PriceDto(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, Double d10) {
        this.totalDiscount = d;
        this.dodoRubles = d2;
        this.rawPrice = d3;
        this.rawPriceWithoutGoods = d4;
        this.minOrderPriceForDelivery = d5;
        this.sauces = d6;
        this.subtotal = d7;
        this.total = d8;
        this.deliveryFee = d9;
        this.loyaltyRewardSum = d10;
    }

    public /* synthetic */ PriceDto(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, Double d10, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0d : d, (i & 2) != 0 ? 0.0d : d2, (i & 4) != 0 ? 0.0d : d3, (i & 8) != 0 ? 0.0d : d4, (i & 16) != 0 ? 0.0d : d5, (i & 32) != 0 ? 0.0d : d6, (i & 64) != 0 ? 0.0d : d7, (i & 128) != 0 ? 0.0d : d8, (i & 256) != 0 ? 0.0d : d9, (i & 512) != 0 ? Double.valueOf(0.0d) : d10);
    }
}
