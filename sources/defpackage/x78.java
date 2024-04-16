package defpackage;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.Collection;
import kotlin.Metadata;
/* compiled from: PizzaProductCardVO.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B\u0085\u0001\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0011\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019\u0012\u0006\u0010!\u001a\u00020\u0002\u0012\u0006\u0010&\u001a\u00020\"\u0012\b\u0010(\u001a\u0004\u0018\u00010\"\u0012\f\u0010+\u001a\b\u0012\u0004\u0012\u00020)0\u0019\u0012\u0006\u00100\u001a\u00020,\u0012\u0006\u00102\u001a\u00020\u0002\u0012\u0006\u00105\u001a\u00020\u0007\u0012\u0006\u00107\u001a\u00020\u0007¢\u0006\u0004\b8\u00109J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\fR\u0017\u0010\u0015\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0017\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\n\u001a\u0004\b\t\u0010\fR\u0017\u0010\u0018\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\n\u001a\u0004\b\u000e\u0010\fR\u001d\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010!\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\n\u001a\u0004\b \u0010\fR\u0017\u0010&\u001a\u00020\"8\u0006¢\u0006\f\n\u0004\b\u000f\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010(\u001a\u0004\u0018\u00010\"8\u0006¢\u0006\f\n\u0004\b$\u0010#\u001a\u0004\b'\u0010%R\u001d\u0010+\u001a\b\u0012\u0004\u0012\u00020)0\u00198\u0006¢\u0006\f\n\u0004\b'\u0010\u001c\u001a\u0004\b*\u0010\u001eR\u0017\u00100\u001a\u00020,8\u0006¢\u0006\f\n\u0004\b*\u0010-\u001a\u0004\b.\u0010/R\u0017\u00102\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b.\u0010\n\u001a\u0004\b1\u0010\fR\u0017\u00105\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b1\u00103\u001a\u0004\b\u001b\u00104R\u0017\u00107\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b6\u00103\u001a\u0004\b\u0016\u00104¨\u0006:"}, d2 = {"Lx78;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", e.a, "()Ljava/lang/String;", "imageUrl", "b", Image.TYPE_HIGH, Action.NAME_ATTRIBUTE, "Lrl8;", c.a, "Lrl8;", "()Lrl8;", "foodValue", DateTokenConverter.CONVERTER_KEY, "allergens", "allergensCanContain", "", "Lul8;", "f", "Ljava/util/Collection;", "g", "()Ljava/util/Collection;", "ingredients", "getDescription", "description", "Lhn6;", "Lhn6;", "i", "()Lhn6;", "price", "j", "rawPrice", "Lejb;", "k", "toppings", "Lfxb;", "Lfxb;", "l", "()Lfxb;", "variation", Image.TYPE_MEDIUM, "variationInfo", "Z", "()Z", "inStop", "n", "hasDiscount", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lrl8;Ljava/lang/String;Ljava/lang/String;Ljava/util/Collection;Ljava/lang/String;Lhn6;Lhn6;Ljava/util/Collection;Lfxb;Ljava/lang/String;ZZ)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: x78  reason: default package */
/* loaded from: classes2.dex */
public final class x78 {
    private final String a;
    private final String b;
    private final rl8 c;
    private final String d;
    private final String e;
    private final Collection<ul8> f;
    private final String g;
    private final hn6 h;
    private final hn6 i;
    private final Collection<ejb> j;
    private final fxb k;
    private final String l;
    private final boolean m;
    private final boolean n;

    public x78(String str, String str2, rl8 rl8Var, String str3, String str4, Collection<ul8> collection, String str5, hn6 hn6Var, hn6 hn6Var2, Collection<ejb> collection2, fxb fxbVar, String str6, boolean z, boolean z2) {
        z65.h(str, "imageUrl");
        z65.h(str2, Action.NAME_ATTRIBUTE);
        z65.h(rl8Var, "foodValue");
        z65.h(str3, "allergens");
        z65.h(str4, "allergensCanContain");
        z65.h(collection, "ingredients");
        z65.h(str5, "description");
        z65.h(hn6Var, "price");
        z65.h(collection2, "toppings");
        z65.h(fxbVar, "variation");
        z65.h(str6, "variationInfo");
        this.a = str;
        this.b = str2;
        this.c = rl8Var;
        this.d = str3;
        this.e = str4;
        this.f = collection;
        this.g = str5;
        this.h = hn6Var;
        this.i = hn6Var2;
        this.j = collection2;
        this.k = fxbVar;
        this.l = str6;
        this.m = z;
        this.n = z2;
    }

    public final String a() {
        return this.d;
    }

    public final String b() {
        return this.e;
    }

    public final rl8 c() {
        return this.c;
    }

    public final boolean d() {
        return this.n;
    }

    public final String e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x78)) {
            return false;
        }
        x78 x78Var = (x78) obj;
        if (z65.c(this.a, x78Var.a) && z65.c(this.b, x78Var.b) && z65.c(this.c, x78Var.c) && z65.c(this.d, x78Var.d) && z65.c(this.e, x78Var.e) && z65.c(this.f, x78Var.f) && z65.c(this.g, x78Var.g) && z65.c(this.h, x78Var.h) && z65.c(this.i, x78Var.i) && z65.c(this.j, x78Var.j) && z65.c(this.k, x78Var.k) && z65.c(this.l, x78Var.l) && this.m == x78Var.m && this.n == x78Var.n) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        return this.m;
    }

    public final Collection<ul8> g() {
        return this.f;
    }

    public final String h() {
        return this.b;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((((((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31;
        hn6 hn6Var = this.i;
        if (hn6Var == null) {
            hashCode = 0;
        } else {
            hashCode = hn6Var.hashCode();
        }
        return ((((((((((hashCode2 + hashCode) * 31) + this.j.hashCode()) * 31) + this.k.hashCode()) * 31) + this.l.hashCode()) * 31) + a91.a(this.m)) * 31) + a91.a(this.n);
    }

    public final hn6 i() {
        return this.h;
    }

    public final hn6 j() {
        return this.i;
    }

    public final Collection<ejb> k() {
        return this.j;
    }

    public final fxb l() {
        return this.k;
    }

    public final String m() {
        return this.l;
    }

    public String toString() {
        String str = this.a;
        String str2 = this.b;
        rl8 rl8Var = this.c;
        String str3 = this.d;
        String str4 = this.e;
        Collection<ul8> collection = this.f;
        String str5 = this.g;
        hn6 hn6Var = this.h;
        hn6 hn6Var2 = this.i;
        Collection<ejb> collection2 = this.j;
        fxb fxbVar = this.k;
        String str6 = this.l;
        boolean z = this.m;
        boolean z2 = this.n;
        return "PizzaProductCardVO(imageUrl=" + str + ", name=" + str2 + ", foodValue=" + rl8Var + ", allergens=" + str3 + ", allergensCanContain=" + str4 + ", ingredients=" + collection + ", description=" + str5 + ", price=" + hn6Var + ", rawPrice=" + hn6Var2 + ", toppings=" + collection2 + ", variation=" + fxbVar + ", variationInfo=" + str6 + ", inStop=" + z + ", hasDiscount=" + z2 + ")";
    }
}
