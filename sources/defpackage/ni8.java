package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import java.io.Serializable;
import kotlin.Metadata;
/* compiled from: PreferredOrderLocation.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0018\u0010\u0019J-\u0010\u0007\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016¨\u0006\u001a"}, d2 = {"Lni8;", "Ljava/io/Serializable;", "Lou2;", "deliverablePlace", "Ld88;", "pizzeria", "restaurantPizzeria", "a", "", "toString", "", "hashCode", "", "other", "", "equals", "Lou2;", c.a, "()Lou2;", "b", "Ld88;", "getPizzeria", "()Ld88;", DateTokenConverter.CONVERTER_KEY, "<init>", "(Lou2;Ld88;Ld88;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: ni8  reason: default package */
/* loaded from: classes4.dex */
public final class ni8 implements Serializable {
    private final ou2 a;
    private final d88 b;
    private final d88 c;

    public ni8(ou2 ou2Var, d88 d88Var, d88 d88Var2) {
        this.a = ou2Var;
        this.b = d88Var;
        this.c = d88Var2;
    }

    public static /* synthetic */ ni8 b(ni8 ni8Var, ou2 ou2Var, d88 d88Var, d88 d88Var2, int i, Object obj) {
        if ((i & 1) != 0) {
            ou2Var = ni8Var.a;
        }
        if ((i & 2) != 0) {
            d88Var = ni8Var.b;
        }
        if ((i & 4) != 0) {
            d88Var2 = ni8Var.c;
        }
        return ni8Var.a(ou2Var, d88Var, d88Var2);
    }

    public final ni8 a(ou2 ou2Var, d88 d88Var, d88 d88Var2) {
        return new ni8(ou2Var, d88Var, d88Var2);
    }

    public final ou2 c() {
        return this.a;
    }

    public final d88 d() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ni8)) {
            return false;
        }
        ni8 ni8Var = (ni8) obj;
        if (z65.c(this.a, ni8Var.a) && z65.c(this.b, ni8Var.b) && z65.c(this.c, ni8Var.c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        ou2 ou2Var = this.a;
        int i = 0;
        if (ou2Var == null) {
            hashCode = 0;
        } else {
            hashCode = ou2Var.hashCode();
        }
        int i2 = hashCode * 31;
        d88 d88Var = this.b;
        if (d88Var == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = d88Var.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        d88 d88Var2 = this.c;
        if (d88Var2 != null) {
            i = d88Var2.hashCode();
        }
        return i3 + i;
    }

    public String toString() {
        ou2 ou2Var = this.a;
        d88 d88Var = this.b;
        d88 d88Var2 = this.c;
        return "PreferredOrderLocation(deliverablePlace=" + ou2Var + ", pizzeria=" + d88Var + ", restaurantPizzeria=" + d88Var2 + ")";
    }
}
