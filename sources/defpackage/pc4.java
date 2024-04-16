package defpackage;

import im.threads.business.transport.MessageAttributes;
import kotlin.Metadata;
/* compiled from: GameSettingsVO.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0007\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b \u0010!J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\fR\u0017\u0010\u000f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0018\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006\""}, d2 = {"Lpc4;", "", "", "toString", "", "hashCode", "other", "", "equals", MessageAttributes.CLIENT_ID, "Ljava/lang/String;", "getClientId", "()Ljava/lang/String;", "orderId", "getOrderId", "isRewardClaimed", "Z", "()Z", "", "rewardedCoins", "Ljava/lang/Double;", "getRewardedCoins", "()Ljava/lang/Double;", "Lbta;", "rules", "Lbta;", "getRules", "()Lbta;", "settings", "Ljava/lang/Object;", "getSettings", "()Ljava/lang/Object;", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Double;Lbta;Ljava/lang/Object;)V", "loyalty_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: pc4  reason: default package */
/* loaded from: classes2.dex */
public final class pc4 {
    private final String clientId;
    private final boolean isRewardClaimed;
    private final String orderId;
    private final Double rewardedCoins;
    private final bta rules;
    private final Object settings;

    public pc4(String str, String str2, boolean z, Double d, bta btaVar, Object obj) {
        z65.h(str, MessageAttributes.CLIENT_ID);
        z65.h(str2, "orderId");
        z65.h(btaVar, "rules");
        this.clientId = str;
        this.orderId = str2;
        this.isRewardClaimed = z;
        this.rewardedCoins = d;
        this.rules = btaVar;
        this.settings = obj;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pc4)) {
            return false;
        }
        pc4 pc4Var = (pc4) obj;
        if (z65.c(this.clientId, pc4Var.clientId) && z65.c(this.orderId, pc4Var.orderId) && this.isRewardClaimed == pc4Var.isRewardClaimed && z65.c(this.rewardedCoins, pc4Var.rewardedCoins) && z65.c(this.rules, pc4Var.rules) && z65.c(this.settings, pc4Var.settings)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((((this.clientId.hashCode() * 31) + this.orderId.hashCode()) * 31) + a91.a(this.isRewardClaimed)) * 31;
        Double d = this.rewardedCoins;
        int i = 0;
        if (d == null) {
            hashCode = 0;
        } else {
            hashCode = d.hashCode();
        }
        int hashCode3 = (((hashCode2 + hashCode) * 31) + this.rules.hashCode()) * 31;
        Object obj = this.settings;
        if (obj != null) {
            i = obj.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        String str = this.clientId;
        String str2 = this.orderId;
        boolean z = this.isRewardClaimed;
        Double d = this.rewardedCoins;
        bta btaVar = this.rules;
        Object obj = this.settings;
        return "GameSettingsVO(clientId=" + str + ", orderId=" + str2 + ", isRewardClaimed=" + z + ", rewardedCoins=" + d + ", rules=" + btaVar + ", settings=" + obj + ")";
    }
}
