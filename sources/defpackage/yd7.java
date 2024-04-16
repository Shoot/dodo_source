package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* compiled from: OrderGameRules.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u0015\u001a\u00020\u000f\u0012\u0006\u0010\u0019\u001a\u00020\u0004\u0012\u0006\u0010\u001a\u001a\u00020\u0004¢\u0006\u0004\b\u001b\u0010\u001cJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR \u0010\u0015\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010\u0010\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0019\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001a\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\n\u0010\u0018¨\u0006\u001d"}, d2 = {"Lyd7;", "", "", "toString", "", "hashCode", "other", "", "equals", "", "a", "D", "b", "()D", "maxCoinsReward", "", "F", c.a, "()F", "getPointsPerCoin$annotations", "()V", "pointsPerCoin", "I", DateTokenConverter.CONVERTER_KEY, "()I", "pointsRatio", "coinsRatio", "<init>", "(DFII)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: yd7  reason: default package */
/* loaded from: classes4.dex */
public final class yd7 {
    private final double a;
    private final float b;
    private final int c;
    private final int d;

    public yd7(double d, float f, int i, int i2) {
        this.a = d;
        this.b = f;
        this.c = i;
        this.d = i2;
    }

    public final int a() {
        return this.d;
    }

    public final double b() {
        return this.a;
    }

    public final float c() {
        return this.b;
    }

    public final int d() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yd7)) {
            return false;
        }
        yd7 yd7Var = (yd7) obj;
        if (Double.compare(this.a, yd7Var.a) == 0 && Float.compare(this.b, yd7Var.b) == 0 && this.c == yd7Var.c && this.d == yd7Var.d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((nkb.a(this.a) * 31) + Float.floatToIntBits(this.b)) * 31) + this.c) * 31) + this.d;
    }

    public String toString() {
        double d = this.a;
        float f = this.b;
        int i = this.c;
        int i2 = this.d;
        return "OrderGameRules(maxCoinsReward=" + d + ", pointsPerCoin=" + f + ", pointsRatio=" + i + ", coinsRatio=" + i2 + ")";
    }
}
