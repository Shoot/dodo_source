package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: ComboSlotVO.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0018\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b&\u0010'JQ\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001J\t\u0010\u000f\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0013\u001a\u00020\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\"R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0019\u0010!\u001a\u0004\b#\u0010\"R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u0015\u0010$\u001a\u0004\b\u001b\u0010%¨\u0006("}, d2 = {"Lfi1;", "", "Lfl8;", "selectedProduct", "Lhn6;", "price", "extraPrice", "", "variationInfo", "", "inStop", "isCustomizable", "Ly89;", "customReceipt", "a", "toString", "", "hashCode", "other", "equals", "Lfl8;", "g", "()Lfl8;", "b", "Lhn6;", "f", "()Lhn6;", c.a, DateTokenConverter.CONVERTER_KEY, "Ljava/lang/String;", Image.TYPE_HIGH, "()Ljava/lang/String;", e.a, "Z", "()Z", "i", "Ly89;", "()Ly89;", "<init>", "(Lfl8;Lhn6;Lhn6;Ljava/lang/String;ZZLy89;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: fi1 */
/* loaded from: classes4.dex */
public final class fi1 {
    private final fl8 a;
    private final hn6 b;
    private final hn6 c;
    private final String d;
    private final boolean e;
    private final boolean f;
    private final y89 g;

    public fi1(fl8 fl8Var, hn6 hn6Var, hn6 hn6Var2, String str, boolean z, boolean z2, y89 y89Var) {
        z65.h(fl8Var, "selectedProduct");
        z65.h(hn6Var, "price");
        z65.h(hn6Var2, "extraPrice");
        z65.h(str, "variationInfo");
        this.a = fl8Var;
        this.b = hn6Var;
        this.c = hn6Var2;
        this.d = str;
        this.e = z;
        this.f = z2;
        this.g = y89Var;
    }

    public static /* synthetic */ fi1 b(fi1 fi1Var, fl8 fl8Var, hn6 hn6Var, hn6 hn6Var2, String str, boolean z, boolean z2, y89 y89Var, int i, Object obj) {
        if ((i & 1) != 0) {
            fl8Var = fi1Var.a;
        }
        if ((i & 2) != 0) {
            hn6Var = fi1Var.b;
        }
        hn6 hn6Var3 = hn6Var;
        if ((i & 4) != 0) {
            hn6Var2 = fi1Var.c;
        }
        hn6 hn6Var4 = hn6Var2;
        if ((i & 8) != 0) {
            str = fi1Var.d;
        }
        String str2 = str;
        if ((i & 16) != 0) {
            z = fi1Var.e;
        }
        boolean z3 = z;
        if ((i & 32) != 0) {
            z2 = fi1Var.f;
        }
        boolean z4 = z2;
        if ((i & 64) != 0) {
            y89Var = fi1Var.g;
        }
        return fi1Var.a(fl8Var, hn6Var3, hn6Var4, str2, z3, z4, y89Var);
    }

    public final fi1 a(fl8 fl8Var, hn6 hn6Var, hn6 hn6Var2, String str, boolean z, boolean z2, y89 y89Var) {
        z65.h(fl8Var, "selectedProduct");
        z65.h(hn6Var, "price");
        z65.h(hn6Var2, "extraPrice");
        z65.h(str, "variationInfo");
        return new fi1(fl8Var, hn6Var, hn6Var2, str, z, z2, y89Var);
    }

    public final y89 c() {
        return this.g;
    }

    public final hn6 d() {
        return this.c;
    }

    public final boolean e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fi1)) {
            return false;
        }
        fi1 fi1Var = (fi1) obj;
        if (z65.c(this.a, fi1Var.a) && z65.c(this.b, fi1Var.b) && z65.c(this.c, fi1Var.c) && z65.c(this.d, fi1Var.d) && this.e == fi1Var.e && this.f == fi1Var.f && z65.c(this.g, fi1Var.g)) {
            return true;
        }
        return false;
    }

    public final hn6 f() {
        return this.b;
    }

    public final fl8 g() {
        return this.a;
    }

    public final String h() {
        return this.d;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + a91.a(this.e)) * 31) + a91.a(this.f)) * 31;
        y89 y89Var = this.g;
        if (y89Var == null) {
            hashCode = 0;
        } else {
            hashCode = y89Var.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final boolean i() {
        return this.f;
    }

    public String toString() {
        fl8 fl8Var = this.a;
        hn6 hn6Var = this.b;
        hn6 hn6Var2 = this.c;
        String str = this.d;
        boolean z = this.e;
        boolean z2 = this.f;
        y89 y89Var = this.g;
        return "ComboSlotVO(selectedProduct=" + fl8Var + ", price=" + hn6Var + ", extraPrice=" + hn6Var2 + ", variationInfo=" + str + ", inStop=" + z + ", isCustomizable=" + z2 + ", customReceipt=" + y89Var + ")";
    }

    public /* synthetic */ fi1(fl8 fl8Var, hn6 hn6Var, hn6 hn6Var2, String str, boolean z, boolean z2, y89 y89Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(fl8Var, hn6Var, hn6Var2, str, (i & 16) != 0 ? false : z, (i & 32) != 0 ? false : z2, (i & 64) != 0 ? null : y89Var);
    }
}
