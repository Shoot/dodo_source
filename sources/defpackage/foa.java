package defpackage;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
/* compiled from: SnackInfoVO.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001Bo\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0018\u001a\u00020\u0013\u0012\u0006\u0010\u001e\u001a\u00020\u0019\u0012\u0006\u0010 \u001a\u00020\u0002\u0012\u0006\u0010!\u001a\u00020\u0002\u0012\u0006\u0010%\u001a\u00020\"\u0012\u0006\u0010)\u001a\u00020\u0007\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010,\u001a\u00020\u0007\u0012\b\b\u0002\u00100\u001a\u00020-¢\u0006\u0004\b1\u00102J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\fR\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0011\u0010\fR\u0017\u0010\u0018\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u001e\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010 \u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\n\u001a\u0004\b\t\u0010\fR\u0017\u0010!\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\n\u001a\u0004\b\u000e\u0010\fR\u0017\u0010%\u001a\u00020\"8\u0006¢\u0006\f\n\u0004\b\u000b\u0010#\u001a\u0004\b\u001a\u0010$R\u0017\u0010)\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0016\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010+\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b*\u0010\u0015\u001a\u0004\b*\u0010\u0017R\u0017\u0010,\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010&\u001a\u0004\b\u001f\u0010(R\u0017\u00100\u001a\u00020-8\u0006¢\u0006\f\n\u0004\b'\u0010.\u001a\u0004\b\u0014\u0010/¨\u00063"}, d2 = {"Lfoa;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", Image.TYPE_HIGH, "()Ljava/lang/String;", Action.NAME_ATTRIBUTE, "b", c.a, "description", "g", "imageUrl", "Lhn6;", DateTokenConverter.CONVERTER_KEY, "Lhn6;", "i", "()Lhn6;", "price", "Lkm8;", e.a, "Lkm8;", "k", "()Lkm8;", "size", "f", "allergens", "allergensCanContain", "Lrl8;", "Lrl8;", "()Lrl8;", "foodValue", "Z", "l", "()Z", "isStopped", "j", "rawPrice", "hasDiscount", "", "J", "()J", "discountEndTime", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lhn6;Lkm8;Ljava/lang/String;Ljava/lang/String;Lrl8;ZLhn6;ZJ)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: foa  reason: default package */
/* loaded from: classes4.dex */
public final class foa {
    private final String a;
    private final String b;
    private final String c;
    private final hn6 d;
    private final km8 e;
    private final String f;
    private final String g;
    private final rl8 h;
    private final boolean i;
    private final hn6 j;
    private final boolean k;
    private final long l;

    public foa(String str, String str2, String str3, hn6 hn6Var, km8 km8Var, String str4, String str5, rl8 rl8Var, boolean z, hn6 hn6Var2, boolean z2, long j) {
        z65.h(str, Action.NAME_ATTRIBUTE);
        z65.h(str2, "description");
        z65.h(str3, "imageUrl");
        z65.h(hn6Var, "price");
        z65.h(km8Var, "size");
        z65.h(str4, "allergens");
        z65.h(str5, "allergensCanContain");
        z65.h(rl8Var, "foodValue");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = hn6Var;
        this.e = km8Var;
        this.f = str4;
        this.g = str5;
        this.h = rl8Var;
        this.i = z;
        this.j = hn6Var2;
        this.k = z2;
        this.l = j;
    }

    public final String a() {
        return this.f;
    }

    public final String b() {
        return this.g;
    }

    public final String c() {
        return this.b;
    }

    public final long d() {
        return this.l;
    }

    public final rl8 e() {
        return this.h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof foa)) {
            return false;
        }
        foa foaVar = (foa) obj;
        if (z65.c(this.a, foaVar.a) && z65.c(this.b, foaVar.b) && z65.c(this.c, foaVar.c) && z65.c(this.d, foaVar.d) && z65.c(this.e, foaVar.e) && z65.c(this.f, foaVar.f) && z65.c(this.g, foaVar.g) && z65.c(this.h, foaVar.h) && this.i == foaVar.i && z65.c(this.j, foaVar.j) && this.k == foaVar.k && this.l == foaVar.l) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        return this.k;
    }

    public final String g() {
        return this.c;
    }

    public final String h() {
        return this.a;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((((((((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31) + a91.a(this.i)) * 31;
        hn6 hn6Var = this.j;
        if (hn6Var == null) {
            hashCode = 0;
        } else {
            hashCode = hn6Var.hashCode();
        }
        return ((((hashCode2 + hashCode) * 31) + a91.a(this.k)) * 31) + ax1.a(this.l);
    }

    public final hn6 i() {
        return this.d;
    }

    public final hn6 j() {
        return this.j;
    }

    public final km8 k() {
        return this.e;
    }

    public final boolean l() {
        return this.i;
    }

    public String toString() {
        String str = this.a;
        String str2 = this.b;
        String str3 = this.c;
        hn6 hn6Var = this.d;
        km8 km8Var = this.e;
        String str4 = this.f;
        String str5 = this.g;
        rl8 rl8Var = this.h;
        boolean z = this.i;
        hn6 hn6Var2 = this.j;
        boolean z2 = this.k;
        long j = this.l;
        return "SnackInfoVO(name=" + str + ", description=" + str2 + ", imageUrl=" + str3 + ", price=" + hn6Var + ", size=" + km8Var + ", allergens=" + str4 + ", allergensCanContain=" + str5 + ", foodValue=" + rl8Var + ", isStopped=" + z + ", rawPrice=" + hn6Var2 + ", hasDiscount=" + z2 + ", discountEndTime=" + j + ")";
    }
}
