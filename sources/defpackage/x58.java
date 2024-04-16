package defpackage;

import kotlin.Metadata;
/* compiled from: PickupPizzeriaVO.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u000f\u001a\u0004\b\n\u0010\u0010¨\u0006\u0014"}, d2 = {"Lx58;", "", "", "toString", "", "hashCode", "other", "", "equals", "", "a", "F", "b", "()F", "valueInMeters", "Ljava/lang/String;", "()Ljava/lang/String;", "displayValue", "<init>", "(FLjava/lang/String;)V", "geo_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: x58  reason: default package */
/* loaded from: classes2.dex */
public final class x58 {
    private final float a;
    private final String b;

    public x58(float f, String str) {
        z65.h(str, "displayValue");
        this.a = f;
        this.b = str;
    }

    public final String a() {
        return this.b;
    }

    public final float b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x58)) {
            return false;
        }
        x58 x58Var = (x58) obj;
        if (Float.compare(this.a, x58Var.a) == 0 && z65.c(this.b, x58Var.b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (Float.floatToIntBits(this.a) * 31) + this.b.hashCode();
    }

    public String toString() {
        float f = this.a;
        String str = this.b;
        return "PickupDistanceVO(valueInMeters=" + f + ", displayValue=" + str + ")";
    }
}
