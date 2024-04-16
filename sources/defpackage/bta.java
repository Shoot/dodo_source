package defpackage;

import kotlin.Metadata;
/* compiled from: StackGameRulesVO.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0015\u001a\u00020\u0004\u0012\u0006\u0010\u0019\u001a\u00020\u0004¢\u0006\u0004\b\u001b\u0010\u001cJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR \u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0015\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0019\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018¨\u0006\u001d"}, d2 = {"Lbta;", "", "", "toString", "", "hashCode", "other", "", "equals", "", "maxCoinsReward", "D", "getMaxCoinsReward", "()D", "", "pointsPerCoin", "F", "getPointsPerCoin", "()F", "getPointsPerCoin$annotations", "()V", "pointsRatio", "I", "getPointsRatio", "()I", "coinsRatio", "getCoinsRatio", "<init>", "(DFII)V", "loyalty_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: bta  reason: default package */
/* loaded from: classes2.dex */
public final class bta {
    private final int coinsRatio;
    private final double maxCoinsReward;
    private final float pointsPerCoin;
    private final int pointsRatio;

    public bta(double d, float f, int i, int i2) {
        this.maxCoinsReward = d;
        this.pointsPerCoin = f;
        this.pointsRatio = i;
        this.coinsRatio = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bta)) {
            return false;
        }
        bta btaVar = (bta) obj;
        if (Double.compare(this.maxCoinsReward, btaVar.maxCoinsReward) == 0 && Float.compare(this.pointsPerCoin, btaVar.pointsPerCoin) == 0 && this.pointsRatio == btaVar.pointsRatio && this.coinsRatio == btaVar.coinsRatio) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((nkb.a(this.maxCoinsReward) * 31) + Float.floatToIntBits(this.pointsPerCoin)) * 31) + this.pointsRatio) * 31) + this.coinsRatio;
    }

    public String toString() {
        double d = this.maxCoinsReward;
        float f = this.pointsPerCoin;
        int i = this.pointsRatio;
        int i2 = this.coinsRatio;
        return "StackGameRulesVO(maxCoinsReward=" + d + ", pointsPerCoin=" + f + ", pointsRatio=" + i + ", coinsRatio=" + i2 + ")";
    }
}
