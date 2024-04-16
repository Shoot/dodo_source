package defpackage;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.Collection;
import kotlin.Metadata;
/* compiled from: VariableProductCardVO.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B}\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0011\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a\u0012\u0006\u0010!\u001a\u00020\u0002\u0012\u0006\u0010&\u001a\u00020\"\u0012\b\u0010(\u001a\u0004\u0018\u00010\"\u0012\f\u0010+\u001a\b\u0012\u0004\u0012\u00020)0\u001a\u0012\u0006\u00100\u001a\u00020,\u0012\u0006\u00103\u001a\u00020\u0007\u0012\u0006\u00104\u001a\u00020\u0007¢\u0006\u0004\b5\u00106J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\fR\u0017\u0010\u0016\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0017\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\n\u001a\u0004\b\t\u0010\fR\u0017\u0010\u0019\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\n\u001a\u0004\b\u000e\u0010\fR\u001d\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010!\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\n\u001a\u0004\b\u0012\u0010\fR\u0017\u0010&\u001a\u00020\"8\u0006¢\u0006\f\n\u0004\b\u001d\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010(\u001a\u0004\u0018\u00010\"8\u0006¢\u0006\f\n\u0004\b\u000f\u0010#\u001a\u0004\b'\u0010%R\u001d\u0010+\u001a\b\u0012\u0004\u0012\u00020)0\u001a8\u0006¢\u0006\f\n\u0004\b$\u0010\u001c\u001a\u0004\b*\u0010\u001eR\u0017\u00100\u001a\u00020,8\u0006¢\u0006\f\n\u0004\b'\u0010-\u001a\u0004\b.\u0010/R\u0017\u00103\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b*\u00101\u001a\u0004\b \u00102R\u0017\u00104\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b.\u00101\u001a\u0004\b\u0018\u00102¨\u00067"}, d2 = {"Laxb;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "imageUrl", "b", "i", Action.NAME_ATTRIBUTE, "Lrl8;", c.a, "Lrl8;", DateTokenConverter.CONVERTER_KEY, "()Lrl8;", "foodValue", "allergens", e.a, "allergensCanContain", "", "Lul8;", "Ljava/util/Collection;", Image.TYPE_HIGH, "()Ljava/util/Collection;", "ingredients", "g", "description", "Lhn6;", "Lhn6;", "j", "()Lhn6;", "price", "k", "rawPrice", "Lejb;", "l", "toppings", "Lexb;", "Lexb;", Image.TYPE_MEDIUM, "()Lexb;", "variation", "Z", "()Z", "inStop", "hasDiscount", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lrl8;Ljava/lang/String;Ljava/lang/String;Ljava/util/Collection;Ljava/lang/String;Lhn6;Lhn6;Ljava/util/Collection;Lexb;ZZ)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: axb  reason: default package */
/* loaded from: classes4.dex */
public final class axb {
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
    private final exb k;
    private final boolean l;
    private final boolean m;

    public axb(String str, String str2, rl8 rl8Var, String str3, String str4, Collection<ul8> collection, String str5, hn6 hn6Var, hn6 hn6Var2, Collection<ejb> collection2, exb exbVar, boolean z, boolean z2) {
        z65.h(str, "imageUrl");
        z65.h(str2, Action.NAME_ATTRIBUTE);
        z65.h(rl8Var, "foodValue");
        z65.h(str3, "allergens");
        z65.h(str4, "allergensCanContain");
        z65.h(collection, "ingredients");
        z65.h(str5, "description");
        z65.h(hn6Var, "price");
        z65.h(collection2, "toppings");
        z65.h(exbVar, "variation");
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
        this.k = exbVar;
        this.l = z;
        this.m = z2;
    }

    public final String a() {
        return this.d;
    }

    public final String b() {
        return this.e;
    }

    public final String c() {
        return this.g;
    }

    public final rl8 d() {
        return this.c;
    }

    public final boolean e() {
        return this.m;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof axb)) {
            return false;
        }
        axb axbVar = (axb) obj;
        if (z65.c(this.a, axbVar.a) && z65.c(this.b, axbVar.b) && z65.c(this.c, axbVar.c) && z65.c(this.d, axbVar.d) && z65.c(this.e, axbVar.e) && z65.c(this.f, axbVar.f) && z65.c(this.g, axbVar.g) && z65.c(this.h, axbVar.h) && z65.c(this.i, axbVar.i) && z65.c(this.j, axbVar.j) && z65.c(this.k, axbVar.k) && this.l == axbVar.l && this.m == axbVar.m) {
            return true;
        }
        return false;
    }

    public final String f() {
        return this.a;
    }

    public final boolean g() {
        return this.l;
    }

    public final Collection<ul8> h() {
        return this.f;
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
        return ((((((((hashCode2 + hashCode) * 31) + this.j.hashCode()) * 31) + this.k.hashCode()) * 31) + a91.a(this.l)) * 31) + a91.a(this.m);
    }

    public final String i() {
        return this.b;
    }

    public final hn6 j() {
        return this.h;
    }

    public final hn6 k() {
        return this.i;
    }

    public final Collection<ejb> l() {
        return this.j;
    }

    public final exb m() {
        return this.k;
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
        exb exbVar = this.k;
        boolean z = this.l;
        boolean z2 = this.m;
        return "VariableProductCardVO(imageUrl=" + str + ", name=" + str2 + ", foodValue=" + rl8Var + ", allergens=" + str3 + ", allergensCanContain=" + str4 + ", ingredients=" + collection + ", description=" + str5 + ", price=" + hn6Var + ", rawPrice=" + hn6Var2 + ", toppings=" + collection2 + ", variation=" + exbVar + ", inStop=" + z + ", hasDiscount=" + z2 + ")";
    }
}
