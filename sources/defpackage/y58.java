package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* compiled from: PickupLocation.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0004\u0012\u0006\u0010\u0018\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\t\u0010\b\u001a\u00020\u0002HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\f\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0014\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0018\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, d2 = {"Ly58;", "", "", "a", "Ldt5;", "b", "", c.a, "toString", "", "hashCode", "other", "equals", "Ljava/lang/String;", "getPizzeriaId", "()Ljava/lang/String;", "pizzeriaId", "Ldt5;", DateTokenConverter.CONVERTER_KEY, "()Ldt5;", "locality", "Z", "getPizzeriaHasRestaurantOperationalType", "()Z", "pizzeriaHasRestaurantOperationalType", "<init>", "(Ljava/lang/String;Ldt5;Z)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: y58  reason: default package */
/* loaded from: classes4.dex */
public final class y58 {
    private final String a;
    private final dt5 b;
    private final boolean c;

    public y58(String str, dt5 dt5Var, boolean z) {
        z65.h(str, "pizzeriaId");
        z65.h(dt5Var, "locality");
        this.a = str;
        this.b = dt5Var;
        this.c = z;
    }

    public final String a() {
        return this.a;
    }

    public final dt5 b() {
        return this.b;
    }

    public final boolean c() {
        return this.c;
    }

    public final dt5 d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y58)) {
            return false;
        }
        y58 y58Var = (y58) obj;
        if (z65.c(this.a, y58Var.a) && z65.c(this.b, y58Var.b) && this.c == y58Var.c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + a91.a(this.c);
    }

    public String toString() {
        String str = this.a;
        dt5 dt5Var = this.b;
        boolean z = this.c;
        return "PickupLocation(pizzeriaId=" + str + ", locality=" + dt5Var + ", pizzeriaHasRestaurantOperationalType=" + z + ")";
    }
}
