package defpackage;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import java.util.List;
import kotlin.Metadata;
/* compiled from: LoyaltyProductCategoryVO.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0012\u0012\u0006\u0010\u001a\u001a\u00020\u0017\u0012\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b\u0012\u0006\u0010$\u001a\u00020\u0007¢\u0006\u0004\b%\u0010&J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\u000bR\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\n\u001a\u0004\b\r\u0010\u000bR\u0017\u0010\u0016\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u001a\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0018\u001a\u0004\b\u0010\u0010\u0019R\u001d\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001fR\u0017\u0010$\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010#¨\u0006'"}, d2 = {"Lb26;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "id", "b", DateTokenConverter.CONVERTER_KEY, Action.NAME_ATTRIBUTE, c.a, "imageUrl", "", "D", e.a, "()D", "price", "Lhn6;", "Lhn6;", "()Lhn6;", "minLegalPrice", "", "Ly16;", "f", "Ljava/util/List;", "()Ljava/util/List;", "products", "g", "Z", "()Z", "isPurchaseAvailable", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLhn6;Ljava/util/List;Z)V", "loyalty_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: b26  reason: default package */
/* loaded from: classes2.dex */
public final class b26 {
    private final String a;
    private final String b;
    private final String c;
    private final double d;
    private final hn6 e;
    private final List<y16> f;
    private final boolean g;

    public b26(String str, String str2, String str3, double d, hn6 hn6Var, List<y16> list, boolean z) {
        z65.h(str, "id");
        z65.h(str2, Action.NAME_ATTRIBUTE);
        z65.h(str3, "imageUrl");
        z65.h(hn6Var, "minLegalPrice");
        z65.h(list, "products");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = d;
        this.e = hn6Var;
        this.f = list;
        this.g = z;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.c;
    }

    public final hn6 c() {
        return this.e;
    }

    public final String d() {
        return this.b;
    }

    public final double e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b26)) {
            return false;
        }
        b26 b26Var = (b26) obj;
        if (z65.c(this.a, b26Var.a) && z65.c(this.b, b26Var.b) && z65.c(this.c, b26Var.c) && Double.compare(this.d, b26Var.d) == 0 && z65.c(this.e, b26Var.e) && z65.c(this.f, b26Var.f) && this.g == b26Var.g) {
            return true;
        }
        return false;
    }

    public final List<y16> f() {
        return this.f;
    }

    public final boolean g() {
        return this.g;
    }

    public int hashCode() {
        return (((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + nkb.a(this.d)) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + a91.a(this.g);
    }

    public String toString() {
        String str = this.a;
        String str2 = this.b;
        String str3 = this.c;
        double d = this.d;
        hn6 hn6Var = this.e;
        List<y16> list = this.f;
        boolean z = this.g;
        return "LoyaltyProductCategoryVO(id=" + str + ", name=" + str2 + ", imageUrl=" + str3 + ", price=" + d + ", minLegalPrice=" + hn6Var + ", products=" + list + ", isPurchaseAvailable=" + z + ")";
    }
}
