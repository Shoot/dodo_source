package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
/* compiled from: LoyaltyProductsData.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u000e\u0012\u0006\u0010\u0018\u001a\u00020\u0013\u0012\u0006\u0010\u001a\u001a\u00020\u000e\u0012\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b\u0012\u0006\u0010#\u001a\u00020\b\u0012\b\u0010)\u001a\u0004\u0018\u00010$¢\u0006\u0004\b*\u0010+J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u0017\u0010\u0012\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R\u0017\u0010\u0018\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u001a\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0010\u001a\u0004\b\u0019\u0010\u0011R\u001d\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001fR\u0017\u0010#\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0016\u0010!\u001a\u0004\b\u0014\u0010\"R\u0019\u0010)\u001a\u0004\u0018\u00010$8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(¨\u0006,"}, d2 = {"Lh26;", "Ljava/io/Serializable;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "categoryName", "", "b", "D", "()D", "categoryPrice", "Lhn6;", c.a, "Lhn6;", "f", "()Lhn6;", "minimalLegalPrice", DateTokenConverter.CONVERTER_KEY, "loyaltyActualBalance", "", "Ly16;", e.a, "Ljava/util/List;", "()Ljava/util/List;", "loyaltyCategoryProducts", "Z", "()Z", "hasGift", "Lrba;", "g", "Lrba;", "i", "()Lrba;", "sender", "<init>", "(Ljava/lang/String;DLhn6;DLjava/util/List;ZLrba;)V", "loyalty_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: h26  reason: default package */
/* loaded from: classes2.dex */
public final class h26 implements Serializable {
    private final String a;
    private final double b;
    private final hn6 c;
    private final double d;
    private final List<y16> e;
    private final boolean f;
    private final rba g;

    public h26(String str, double d, hn6 hn6Var, double d2, List<y16> list, boolean z, rba rbaVar) {
        z65.h(str, "categoryName");
        z65.h(hn6Var, "minimalLegalPrice");
        z65.h(list, "loyaltyCategoryProducts");
        this.a = str;
        this.b = d;
        this.c = hn6Var;
        this.d = d2;
        this.e = list;
        this.f = z;
        this.g = rbaVar;
    }

    public final String a() {
        return this.a;
    }

    public final double b() {
        return this.b;
    }

    public final boolean c() {
        return this.f;
    }

    public final double d() {
        return this.d;
    }

    public final List<y16> e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h26)) {
            return false;
        }
        h26 h26Var = (h26) obj;
        if (z65.c(this.a, h26Var.a) && Double.compare(this.b, h26Var.b) == 0 && z65.c(this.c, h26Var.c) && Double.compare(this.d, h26Var.d) == 0 && z65.c(this.e, h26Var.e) && this.f == h26Var.f && this.g == h26Var.g) {
            return true;
        }
        return false;
    }

    public final hn6 f() {
        return this.c;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((((((((((this.a.hashCode() * 31) + nkb.a(this.b)) * 31) + this.c.hashCode()) * 31) + nkb.a(this.d)) * 31) + this.e.hashCode()) * 31) + a91.a(this.f)) * 31;
        rba rbaVar = this.g;
        if (rbaVar == null) {
            hashCode = 0;
        } else {
            hashCode = rbaVar.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final rba i() {
        return this.g;
    }

    public String toString() {
        String str = this.a;
        double d = this.b;
        hn6 hn6Var = this.c;
        double d2 = this.d;
        List<y16> list = this.e;
        boolean z = this.f;
        rba rbaVar = this.g;
        return "LoyaltyProductsData(categoryName=" + str + ", categoryPrice=" + d + ", minimalLegalPrice=" + hn6Var + ", loyaltyActualBalance=" + d2 + ", loyaltyCategoryProducts=" + list + ", hasGift=" + z + ", sender=" + rbaVar + ")";
    }
}
