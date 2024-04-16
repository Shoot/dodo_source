package ru.dodopizza.backend.domain.loyalty.dto.ordergame;

import kotlin.Metadata;
/* compiled from: OrderGameRulesDto.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J1\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0016\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000b¨\u0006\u001e"}, d2 = {"Lru/dodopizza/backend/domain/loyalty/dto/ordergame/OrderGameRulesDto;", "", "maxCoinsReward", "", "pointsPerCoin", "", "pointsRatio", "", "coinsRatio", "(DFII)V", "getCoinsRatio", "()I", "getMaxCoinsReward", "()D", "getPointsPerCoin$annotations", "()V", "getPointsPerCoin", "()F", "getPointsRatio", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OrderGameRulesDto {
    @uca("coinsRatio")
    private final int coinsRatio;
    @uca("maxCoinsReward")
    private final double maxCoinsReward;
    @uca("pointsPerCoin")
    private final float pointsPerCoin;
    @uca("pointsRatio")
    private final int pointsRatio;

    public OrderGameRulesDto(double d, float f, int i, int i2) {
        this.maxCoinsReward = d;
        this.pointsPerCoin = f;
        this.pointsRatio = i;
        this.coinsRatio = i2;
    }

    public static /* synthetic */ OrderGameRulesDto copy$default(OrderGameRulesDto orderGameRulesDto, double d, float f, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            d = orderGameRulesDto.maxCoinsReward;
        }
        double d2 = d;
        if ((i3 & 2) != 0) {
            f = orderGameRulesDto.pointsPerCoin;
        }
        float f2 = f;
        if ((i3 & 4) != 0) {
            i = orderGameRulesDto.pointsRatio;
        }
        int i4 = i;
        if ((i3 & 8) != 0) {
            i2 = orderGameRulesDto.coinsRatio;
        }
        return orderGameRulesDto.copy(d2, f2, i4, i2);
    }

    public final double component1() {
        return this.maxCoinsReward;
    }

    public final float component2() {
        return this.pointsPerCoin;
    }

    public final int component3() {
        return this.pointsRatio;
    }

    public final int component4() {
        return this.coinsRatio;
    }

    public final OrderGameRulesDto copy(double d, float f, int i, int i2) {
        return new OrderGameRulesDto(d, f, i, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderGameRulesDto)) {
            return false;
        }
        OrderGameRulesDto orderGameRulesDto = (OrderGameRulesDto) obj;
        if (Double.compare(this.maxCoinsReward, orderGameRulesDto.maxCoinsReward) == 0 && Float.compare(this.pointsPerCoin, orderGameRulesDto.pointsPerCoin) == 0 && this.pointsRatio == orderGameRulesDto.pointsRatio && this.coinsRatio == orderGameRulesDto.coinsRatio) {
            return true;
        }
        return false;
    }

    public final int getCoinsRatio() {
        return this.coinsRatio;
    }

    public final double getMaxCoinsReward() {
        return this.maxCoinsReward;
    }

    public final float getPointsPerCoin() {
        return this.pointsPerCoin;
    }

    public final int getPointsRatio() {
        return this.pointsRatio;
    }

    public int hashCode() {
        return (((((nkb.a(this.maxCoinsReward) * 31) + Float.floatToIntBits(this.pointsPerCoin)) * 31) + this.pointsRatio) * 31) + this.coinsRatio;
    }

    public String toString() {
        double d = this.maxCoinsReward;
        float f = this.pointsPerCoin;
        int i = this.pointsRatio;
        int i2 = this.coinsRatio;
        return "OrderGameRulesDto(maxCoinsReward=" + d + ", pointsPerCoin=" + f + ", pointsRatio=" + i + ", coinsRatio=" + i2 + ")";
    }

    public static /* synthetic */ void getPointsPerCoin$annotations() {
    }
}
