package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import java.io.Serializable;
import kotlin.Metadata;
/* compiled from: CheckoutState.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b(\u0010)JO\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\fHÆ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001c\u0010\u0017R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0015\u001a\u0004\b\u001d\u0010\u0017R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b!\u0010'¨\u0006*"}, d2 = {"Lin6;", "Ljava/io/Serializable;", "Lhn6;", "totalPrice", "Lfx2;", "deliveryFee", "rawPrice", "", "itemsCount", "discount", "", "showMoneyDetails", "Lcj6;", "minDeliveryPriceInfo", "a", "", "toString", "hashCode", "", "other", "equals", "Lhn6;", "k", "()Lhn6;", "b", "Lfx2;", c.a, "()Lfx2;", "i", DateTokenConverter.CONVERTER_KEY, "I", e.a, "()I", "f", "Z", "j", "()Z", "g", "Lcj6;", "()Lcj6;", "<init>", "(Lhn6;Lfx2;Lhn6;ILhn6;ZLcj6;)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: in6  reason: default package */
/* loaded from: classes4.dex */
public final class in6 implements Serializable {
    private final hn6 a;
    private final fx2 b;
    private final hn6 c;
    private final int d;
    private final hn6 e;
    private final boolean f;
    private final cj6 g;

    public in6(hn6 hn6Var, fx2 fx2Var, hn6 hn6Var2, int i, hn6 hn6Var3, boolean z, cj6 cj6Var) {
        z65.h(hn6Var, "totalPrice");
        z65.h(fx2Var, "deliveryFee");
        z65.h(hn6Var2, "rawPrice");
        z65.h(hn6Var3, "discount");
        z65.h(cj6Var, "minDeliveryPriceInfo");
        this.a = hn6Var;
        this.b = fx2Var;
        this.c = hn6Var2;
        this.d = i;
        this.e = hn6Var3;
        this.f = z;
        this.g = cj6Var;
    }

    public static /* synthetic */ in6 b(in6 in6Var, hn6 hn6Var, fx2 fx2Var, hn6 hn6Var2, int i, hn6 hn6Var3, boolean z, cj6 cj6Var, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            hn6Var = in6Var.a;
        }
        if ((i2 & 2) != 0) {
            fx2Var = in6Var.b;
        }
        fx2 fx2Var2 = fx2Var;
        if ((i2 & 4) != 0) {
            hn6Var2 = in6Var.c;
        }
        hn6 hn6Var4 = hn6Var2;
        if ((i2 & 8) != 0) {
            i = in6Var.d;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            hn6Var3 = in6Var.e;
        }
        hn6 hn6Var5 = hn6Var3;
        if ((i2 & 32) != 0) {
            z = in6Var.f;
        }
        boolean z2 = z;
        if ((i2 & 64) != 0) {
            cj6Var = in6Var.g;
        }
        return in6Var.a(hn6Var, fx2Var2, hn6Var4, i3, hn6Var5, z2, cj6Var);
    }

    public final in6 a(hn6 hn6Var, fx2 fx2Var, hn6 hn6Var2, int i, hn6 hn6Var3, boolean z, cj6 cj6Var) {
        z65.h(hn6Var, "totalPrice");
        z65.h(fx2Var, "deliveryFee");
        z65.h(hn6Var2, "rawPrice");
        z65.h(hn6Var3, "discount");
        z65.h(cj6Var, "minDeliveryPriceInfo");
        return new in6(hn6Var, fx2Var, hn6Var2, i, hn6Var3, z, cj6Var);
    }

    public final fx2 c() {
        return this.b;
    }

    public final hn6 d() {
        return this.e;
    }

    public final int e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof in6)) {
            return false;
        }
        in6 in6Var = (in6) obj;
        if (z65.c(this.a, in6Var.a) && z65.c(this.b, in6Var.b) && z65.c(this.c, in6Var.c) && this.d == in6Var.d && z65.c(this.e, in6Var.e) && this.f == in6Var.f && z65.c(this.g, in6Var.g)) {
            return true;
        }
        return false;
    }

    public final cj6 f() {
        return this.g;
    }

    public int hashCode() {
        return (((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d) * 31) + this.e.hashCode()) * 31) + a91.a(this.f)) * 31) + this.g.hashCode();
    }

    public final hn6 i() {
        return this.c;
    }

    public final boolean j() {
        return this.f;
    }

    public final hn6 k() {
        return this.a;
    }

    public String toString() {
        hn6 hn6Var = this.a;
        fx2 fx2Var = this.b;
        hn6 hn6Var2 = this.c;
        int i = this.d;
        hn6 hn6Var3 = this.e;
        boolean z = this.f;
        cj6 cj6Var = this.g;
        return "MoneyDetails(totalPrice=" + hn6Var + ", deliveryFee=" + fx2Var + ", rawPrice=" + hn6Var2 + ", itemsCount=" + i + ", discount=" + hn6Var3 + ", showMoneyDetails=" + z + ", minDeliveryPriceInfo=" + cj6Var + ")";
    }
}
