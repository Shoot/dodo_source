package defpackage;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.List;
import kotlin.Metadata;
/* compiled from: ProductV5.kt */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u008f\u0001\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\u0006\u0010\u001b\u001a\u00020\u0018\u0012\u0006\u0010\u001f\u001a\u00020\u001c\u0012\f\u0010&\u001a\b\u0012\u0004\u0012\u00020!0 \u0012\f\u0010*\u001a\b\u0012\u0004\u0012\u00020'0 \u0012\f\u0010.\u001a\b\u0012\u0004\u0012\u00020+0 \u0012\u0006\u00101\u001a\u00020\u0002\u0012\u0006\u00106\u001a\u000202\u0012\u0006\u0010;\u001a\u000207\u0012\f\u0010?\u001a\b\u0012\u0004\u0012\u00020<0 ¢\u0006\u0004\b@\u0010AJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\fR\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\n\u001a\u0004\b\u0011\u0010\fR\u0017\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0013\u0010\fR\u0017\u0010\u0017\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\n\u001a\u0004\b\u0016\u0010\fR\u0017\u0010\u001b\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0019\u001a\u0004\b\u0015\u0010\u001aR\u0017\u0010\u001f\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001d\u001a\u0004\b\u000e\u0010\u001eR\u001d\u0010&\u001a\b\u0012\u0004\u0012\u00020!0 8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001d\u0010*\u001a\b\u0012\u0004\u0012\u00020'0 8\u0006¢\u0006\f\n\u0004\b(\u0010#\u001a\u0004\b)\u0010%R\u001d\u0010.\u001a\b\u0012\u0004\u0012\u00020+0 8\u0006¢\u0006\f\n\u0004\b,\u0010#\u001a\u0004\b-\u0010%R\u0017\u00101\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b/\u0010\n\u001a\u0004\b0\u0010\fR\u0017\u00106\u001a\u0002028\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b\"\u00105R\u0017\u0010;\u001a\u0002078\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b\t\u0010:R\u001d\u0010?\u001a\b\u0012\u0004\u0012\u00020<0 8\u0006¢\u0006\f\n\u0004\b=\u0010#\u001a\u0004\b>\u0010%¨\u0006B"}, d2 = {"Ltm8;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", c.a, "()Ljava/lang/String;", "id", "b", DateTokenConverter.CONVERTER_KEY, "metaProductId", "getName", Action.NAME_ATTRIBUTE, "f", "size", e.a, "g", "sizeName", "Lhn6;", "Lhn6;", "()Lhn6;", "price", "Lu44;", "Lu44;", "()Lu44;", "foodValue", "", "Ln25;", Image.TYPE_HIGH, "Ljava/util/List;", "getIngredientGroups", "()Ljava/util/List;", "ingredientGroups", "Lno7;", "i", "getPackageGroups", "packageGroups", "Lwv4;", "j", "getImages", "images", "k", "getDescription", "description", "Ldkb;", "l", "Ldkb;", "()Ldkb;", "traits", "Lac;", Image.TYPE_MEDIUM, "Lac;", "()Lac;", "allergyAdvice", "Lv6;", "n", "getAdditionalData", "additionalData", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lhn6;Lu44;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ldkb;Lac;Ljava/util/List;)V", "common"}, k = 1, mv = {1, 9, 0})
/* renamed from: tm8  reason: default package */
/* loaded from: classes.dex */
public final class tm8 {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final hn6 f;
    private final u44 g;
    private final List<n25> h;
    private final List<no7> i;
    private final List<wv4> j;
    private final String k;
    private final dkb l;
    private final ac m;
    private final List<v6> n;

    public tm8(String str, String str2, String str3, String str4, String str5, hn6 hn6Var, u44 u44Var, List<n25> list, List<no7> list2, List<wv4> list3, String str6, dkb dkbVar, ac acVar, List<v6> list4) {
        z65.h(str, "id");
        z65.h(str2, "metaProductId");
        z65.h(str3, Action.NAME_ATTRIBUTE);
        z65.h(str4, "size");
        z65.h(str5, "sizeName");
        z65.h(hn6Var, "price");
        z65.h(u44Var, "foodValue");
        z65.h(list, "ingredientGroups");
        z65.h(list2, "packageGroups");
        z65.h(list3, "images");
        z65.h(str6, "description");
        z65.h(dkbVar, "traits");
        z65.h(acVar, "allergyAdvice");
        z65.h(list4, "additionalData");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = hn6Var;
        this.g = u44Var;
        this.h = list;
        this.i = list2;
        this.j = list3;
        this.k = str6;
        this.l = dkbVar;
        this.m = acVar;
        this.n = list4;
    }

    public final ac a() {
        return this.m;
    }

    public final u44 b() {
        return this.g;
    }

    public final String c() {
        return this.a;
    }

    public final String d() {
        return this.b;
    }

    public final hn6 e() {
        return this.f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tm8)) {
            return false;
        }
        tm8 tm8Var = (tm8) obj;
        if (z65.c(this.a, tm8Var.a) && z65.c(this.b, tm8Var.b) && z65.c(this.c, tm8Var.c) && z65.c(this.d, tm8Var.d) && z65.c(this.e, tm8Var.e) && z65.c(this.f, tm8Var.f) && z65.c(this.g, tm8Var.g) && z65.c(this.h, tm8Var.h) && z65.c(this.i, tm8Var.i) && z65.c(this.j, tm8Var.j) && z65.c(this.k, tm8Var.k) && z65.c(this.l, tm8Var.l) && z65.c(this.m, tm8Var.m) && z65.c(this.n, tm8Var.n)) {
            return true;
        }
        return false;
    }

    public final String f() {
        return this.d;
    }

    public final String g() {
        return this.e;
    }

    public final dkb h() {
        return this.l;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31) + this.i.hashCode()) * 31) + this.j.hashCode()) * 31) + this.k.hashCode()) * 31) + this.l.hashCode()) * 31) + this.m.hashCode()) * 31) + this.n.hashCode();
    }

    public String toString() {
        String str = this.a;
        String str2 = this.b;
        String str3 = this.c;
        String str4 = this.d;
        String str5 = this.e;
        hn6 hn6Var = this.f;
        u44 u44Var = this.g;
        List<n25> list = this.h;
        List<no7> list2 = this.i;
        List<wv4> list3 = this.j;
        String str6 = this.k;
        dkb dkbVar = this.l;
        ac acVar = this.m;
        List<v6> list4 = this.n;
        return "ProductV5(id=" + str + ", metaProductId=" + str2 + ", name=" + str3 + ", size=" + str4 + ", sizeName=" + str5 + ", price=" + hn6Var + ", foodValue=" + u44Var + ", ingredientGroups=" + list + ", packageGroups=" + list2 + ", images=" + list3 + ", description=" + str6 + ", traits=" + dkbVar + ", allergyAdvice=" + acVar + ", additionalData=" + list4 + ")";
    }
}
