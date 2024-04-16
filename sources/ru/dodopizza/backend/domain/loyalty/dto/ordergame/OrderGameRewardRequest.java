package ru.dodopizza.backend.domain.loyalty.dto.ordergame;

import kotlin.Metadata;
/* compiled from: OrderGameRewardRequest.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lru/dodopizza/backend/domain/loyalty/dto/ordergame/OrderGameRewardRequest;", "", "orderId", "", "rewardAmount", "", "(Ljava/lang/String;D)V", "getOrderId", "()Ljava/lang/String;", "getRewardAmount", "()D", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OrderGameRewardRequest {
    @uca("orderId")
    private final String orderId;
    @uca("rewardAmount")
    private final double rewardAmount;

    public OrderGameRewardRequest(String str, double d) {
        z65.h(str, "orderId");
        this.orderId = str;
        this.rewardAmount = d;
    }

    public static /* synthetic */ OrderGameRewardRequest copy$default(OrderGameRewardRequest orderGameRewardRequest, String str, double d, int i, Object obj) {
        if ((i & 1) != 0) {
            str = orderGameRewardRequest.orderId;
        }
        if ((i & 2) != 0) {
            d = orderGameRewardRequest.rewardAmount;
        }
        return orderGameRewardRequest.copy(str, d);
    }

    public final String component1() {
        return this.orderId;
    }

    public final double component2() {
        return this.rewardAmount;
    }

    public final OrderGameRewardRequest copy(String str, double d) {
        z65.h(str, "orderId");
        return new OrderGameRewardRequest(str, d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderGameRewardRequest)) {
            return false;
        }
        OrderGameRewardRequest orderGameRewardRequest = (OrderGameRewardRequest) obj;
        if (z65.c(this.orderId, orderGameRewardRequest.orderId) && Double.compare(this.rewardAmount, orderGameRewardRequest.rewardAmount) == 0) {
            return true;
        }
        return false;
    }

    public final String getOrderId() {
        return this.orderId;
    }

    public final double getRewardAmount() {
        return this.rewardAmount;
    }

    public int hashCode() {
        return (this.orderId.hashCode() * 31) + nkb.a(this.rewardAmount);
    }

    public String toString() {
        String str = this.orderId;
        double d = this.rewardAmount;
        return "OrderGameRewardRequest(orderId=" + str + ", rewardAmount=" + d + ")";
    }
}
