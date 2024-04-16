package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.menu.ShoppingInfoEntity;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
/* compiled from: MenuPersonalPriceInfo.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u000e\u0012\u0006\u0010\u0015\u001a\u00020\u000e\u0012\u0006\u0010\u0019\u001a\u00020\u0004\u0012\u0006\u0010\u001e\u001a\u00020\u001a\u0012\u0006\u0010#\u001a\u00020\u001f\u0012\u0006\u0010$\u001a\u00020\u0004\u0012\u0006\u0010%\u001a\u00020\u0002¢\u0006\u0004\b&\u0010'J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0015\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012R\u0017\u0010\u0019\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u000f\u0010\u0018R\u0017\u0010\u001e\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\t\u0010\u001dR\u0017\u0010#\u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u0016\u0010\"R\u0017\u0010$\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0017\u001a\u0004\b \u0010\u0018R\u0017\u0010%\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\n\u001a\u0004\b\u001b\u0010\f¨\u0006("}, d2 = {"Lvf6;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "g", "()Ljava/lang/String;", ShoppingInfoEntity.FIELD_PRODUCT_ID, "Lhn6;", "b", "Lhn6;", Image.TYPE_HIGH, "()Lhn6;", "rawPrice", c.a, "discountedPrice", DateTokenConverter.CONVERTER_KEY, "I", "()I", "discountPercent", "Lz23;", e.a, "Lz23;", "()Lz23;", "discountMode", "", "f", "J", "()J", "endDateTimeUtc", "priority", "menuCategoryId", "<init>", "(Ljava/lang/String;Lhn6;Lhn6;ILz23;JILjava/lang/String;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: vf6  reason: default package */
/* loaded from: classes4.dex */
public final class vf6 {
    private final String a;
    private final hn6 b;
    private final hn6 c;
    private final int d;
    private final z23 e;
    private final long f;
    private final int g;
    private final String h;

    public vf6(String str, hn6 hn6Var, hn6 hn6Var2, int i, z23 z23Var, long j, int i2, String str2) {
        z65.h(str, ShoppingInfoEntity.FIELD_PRODUCT_ID);
        z65.h(hn6Var, "rawPrice");
        z65.h(hn6Var2, "discountedPrice");
        z65.h(z23Var, "discountMode");
        z65.h(str2, "menuCategoryId");
        this.a = str;
        this.b = hn6Var;
        this.c = hn6Var2;
        this.d = i;
        this.e = z23Var;
        this.f = j;
        this.g = i2;
        this.h = str2;
    }

    public final z23 a() {
        return this.e;
    }

    public final int b() {
        return this.d;
    }

    public final hn6 c() {
        return this.c;
    }

    public final long d() {
        return this.f;
    }

    public final String e() {
        return this.h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vf6)) {
            return false;
        }
        vf6 vf6Var = (vf6) obj;
        if (z65.c(this.a, vf6Var.a) && z65.c(this.b, vf6Var.b) && z65.c(this.c, vf6Var.c) && this.d == vf6Var.d && this.e == vf6Var.e && this.f == vf6Var.f && this.g == vf6Var.g && z65.c(this.h, vf6Var.h)) {
            return true;
        }
        return false;
    }

    public final int f() {
        return this.g;
    }

    public final String g() {
        return this.a;
    }

    public final hn6 h() {
        return this.b;
    }

    public int hashCode() {
        return (((((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d) * 31) + this.e.hashCode()) * 31) + ax1.a(this.f)) * 31) + this.g) * 31) + this.h.hashCode();
    }

    public String toString() {
        String str = this.a;
        hn6 hn6Var = this.b;
        hn6 hn6Var2 = this.c;
        int i = this.d;
        z23 z23Var = this.e;
        long j = this.f;
        int i2 = this.g;
        String str2 = this.h;
        return "MenuPersonalPriceInfo(productId=" + str + ", rawPrice=" + hn6Var + ", discountedPrice=" + hn6Var2 + ", discountPercent=" + i + ", discountMode=" + z23Var + ", endDateTimeUtc=" + j + ", priority=" + i2 + ", menuCategoryId=" + str2 + ")";
    }
}
