package defpackage;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.List;
import kotlin.Metadata;
/* compiled from: ComboInfoVO.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0017\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b&\u0010'J_\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\t2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\tHÆ\u0001J\t\u0010\u0010\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0011HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\t2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u001a\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u001e\u0010\u0017R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001f\u001a\u0004\b \u0010!R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\"\u0010$R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b%\u0010!¨\u0006("}, d2 = {"Ljh1;", "", "", Action.NAME_ATTRIBUTE, "description", "imageUrl", "Lhn6;", "price", "weight", "", "isStopped", "", "Lfi1;", "slots", "isComboCustomize", "a", "toString", "", "hashCode", "other", "equals", "Ljava/lang/String;", e.a, "()Ljava/lang/String;", "b", c.a, DateTokenConverter.CONVERTER_KEY, "Lhn6;", "f", "()Lhn6;", Image.TYPE_HIGH, "Z", "j", "()Z", "g", "Ljava/util/List;", "()Ljava/util/List;", "i", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lhn6;Ljava/lang/String;ZLjava/util/List;Z)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: jh1  reason: default package */
/* loaded from: classes4.dex */
public final class jh1 {
    private final String a;
    private final String b;
    private final String c;
    private final hn6 d;
    private final String e;
    private final boolean f;
    private final List<fi1> g;
    private final boolean h;

    public jh1(String str, String str2, String str3, hn6 hn6Var, String str4, boolean z, List<fi1> list, boolean z2) {
        z65.h(str, Action.NAME_ATTRIBUTE);
        z65.h(str2, "description");
        z65.h(str3, "imageUrl");
        z65.h(hn6Var, "price");
        z65.h(str4, "weight");
        z65.h(list, "slots");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = hn6Var;
        this.e = str4;
        this.f = z;
        this.g = list;
        this.h = z2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ jh1 b(jh1 jh1Var, String str, String str2, String str3, hn6 hn6Var, String str4, boolean z, List list, boolean z2, int i, Object obj) {
        String str5;
        String str6;
        String str7;
        hn6 hn6Var2;
        String str8;
        boolean z3;
        List<fi1> list2;
        boolean z4;
        if ((i & 1) != 0) {
            str5 = jh1Var.a;
        } else {
            str5 = str;
        }
        if ((i & 2) != 0) {
            str6 = jh1Var.b;
        } else {
            str6 = str2;
        }
        if ((i & 4) != 0) {
            str7 = jh1Var.c;
        } else {
            str7 = str3;
        }
        if ((i & 8) != 0) {
            hn6Var2 = jh1Var.d;
        } else {
            hn6Var2 = hn6Var;
        }
        if ((i & 16) != 0) {
            str8 = jh1Var.e;
        } else {
            str8 = str4;
        }
        if ((i & 32) != 0) {
            z3 = jh1Var.f;
        } else {
            z3 = z;
        }
        if ((i & 64) != 0) {
            list2 = jh1Var.g;
        } else {
            list2 = list;
        }
        if ((i & 128) != 0) {
            z4 = jh1Var.h;
        } else {
            z4 = z2;
        }
        return jh1Var.a(str5, str6, str7, hn6Var2, str8, z3, list2, z4);
    }

    public final jh1 a(String str, String str2, String str3, hn6 hn6Var, String str4, boolean z, List<fi1> list, boolean z2) {
        z65.h(str, Action.NAME_ATTRIBUTE);
        z65.h(str2, "description");
        z65.h(str3, "imageUrl");
        z65.h(hn6Var, "price");
        z65.h(str4, "weight");
        z65.h(list, "slots");
        return new jh1(str, str2, str3, hn6Var, str4, z, list, z2);
    }

    public final String c() {
        return this.b;
    }

    public final String d() {
        return this.c;
    }

    public final String e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jh1)) {
            return false;
        }
        jh1 jh1Var = (jh1) obj;
        if (z65.c(this.a, jh1Var.a) && z65.c(this.b, jh1Var.b) && z65.c(this.c, jh1Var.c) && z65.c(this.d, jh1Var.d) && z65.c(this.e, jh1Var.e) && this.f == jh1Var.f && z65.c(this.g, jh1Var.g) && this.h == jh1Var.h) {
            return true;
        }
        return false;
    }

    public final hn6 f() {
        return this.d;
    }

    public final List<fi1> g() {
        return this.g;
    }

    public final String h() {
        return this.e;
    }

    public int hashCode() {
        return (((((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + a91.a(this.f)) * 31) + this.g.hashCode()) * 31) + a91.a(this.h);
    }

    public final boolean i() {
        return this.h;
    }

    public final boolean j() {
        return this.f;
    }

    public String toString() {
        String str = this.a;
        String str2 = this.b;
        String str3 = this.c;
        hn6 hn6Var = this.d;
        String str4 = this.e;
        boolean z = this.f;
        List<fi1> list = this.g;
        boolean z2 = this.h;
        return "ComboInfoVO(name=" + str + ", description=" + str2 + ", imageUrl=" + str3 + ", price=" + hn6Var + ", weight=" + str4 + ", isStopped=" + z + ", slots=" + list + ", isComboCustomize=" + z2 + ")";
    }
}
