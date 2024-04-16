package defpackage;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.Collection;
import kotlin.Metadata;
/* compiled from: CartComboSlotProductVO.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001Bu\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0018\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010'\u001a\u00020\u0007\u0012\f\u0010-\u001a\b\u0012\u0004\u0012\u00020)0(\u0012\f\u0010/\u001a\b\u0012\u0004\u0012\u00020)0(¢\u0006\u0004\b0\u00101J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\fR\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0011\u0010\fR\u0017\u0010\u0017\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\t\u0010\u0016R\u0017\u0010\u001c\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0014\u0010\u001bR\u0019\u0010!\u001a\u0004\u0018\u00010\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u0019\u0010 R\u0019\u0010#\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\n\u001a\u0004\b\u000e\u0010\fR\u0017\u0010'\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b$\u0010&R\u001d\u0010-\u001a\b\u0012\u0004\u0012\u00020)0(8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b\u001e\u0010,R\u001d\u0010/\u001a\b\u0012\u0004\u0012\u00020)0(8\u0006¢\u0006\f\n\u0004\b.\u0010+\u001a\u0004\b\"\u0010,¨\u00062"}, d2 = {"Leq0;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "id", "b", c.a, Action.NAME_ATTRIBUTE, "getImageUrl", "imageUrl", "Lkl8;", DateTokenConverter.CONVERTER_KEY, "Lkl8;", "()Lkl8;", "category", "Lhn6;", e.a, "Lhn6;", "()Lhn6;", "price", "Lkm8;", "f", "Lkm8;", "()Lkm8;", "productSize", "g", "doughDescription", Image.TYPE_HIGH, "Z", "()Z", "isInStop", "", "Lxq0;", "i", "Ljava/util/Collection;", "()Ljava/util/Collection;", "removedIngredients", "j", "toppings", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkl8;Lhn6;Lkm8;Ljava/lang/String;ZLjava/util/Collection;Ljava/util/Collection;)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: eq0  reason: default package */
/* loaded from: classes2.dex */
public final class eq0 {
    private final String a;
    private final String b;
    private final String c;
    private final kl8 d;
    private final hn6 e;
    private final km8 f;
    private final String g;
    private final boolean h;
    private final Collection<xq0> i;
    private final Collection<xq0> j;

    public eq0(String str, String str2, String str3, kl8 kl8Var, hn6 hn6Var, km8 km8Var, String str4, boolean z, Collection<xq0> collection, Collection<xq0> collection2) {
        z65.h(str, "id");
        z65.h(str2, Action.NAME_ATTRIBUTE);
        z65.h(str3, "imageUrl");
        z65.h(kl8Var, "category");
        z65.h(hn6Var, "price");
        z65.h(collection, "removedIngredients");
        z65.h(collection2, "toppings");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = kl8Var;
        this.e = hn6Var;
        this.f = km8Var;
        this.g = str4;
        this.h = z;
        this.i = collection;
        this.j = collection2;
    }

    public final kl8 a() {
        return this.d;
    }

    public final String b() {
        return this.g;
    }

    public final String c() {
        return this.b;
    }

    public final hn6 d() {
        return this.e;
    }

    public final km8 e() {
        return this.f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eq0)) {
            return false;
        }
        eq0 eq0Var = (eq0) obj;
        if (z65.c(this.a, eq0Var.a) && z65.c(this.b, eq0Var.b) && z65.c(this.c, eq0Var.c) && this.d == eq0Var.d && z65.c(this.e, eq0Var.e) && z65.c(this.f, eq0Var.f) && z65.c(this.g, eq0Var.g) && this.h == eq0Var.h && z65.c(this.i, eq0Var.i) && z65.c(this.j, eq0Var.j)) {
            return true;
        }
        return false;
    }

    public final Collection<xq0> f() {
        return this.i;
    }

    public final Collection<xq0> g() {
        return this.j;
    }

    public final boolean h() {
        return this.h;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31;
        km8 km8Var = this.f;
        int i = 0;
        if (km8Var == null) {
            hashCode = 0;
        } else {
            hashCode = km8Var.hashCode();
        }
        int i2 = (hashCode2 + hashCode) * 31;
        String str = this.g;
        if (str != null) {
            i = str.hashCode();
        }
        return ((((((i2 + i) * 31) + a91.a(this.h)) * 31) + this.i.hashCode()) * 31) + this.j.hashCode();
    }

    public String toString() {
        String str = this.a;
        String str2 = this.b;
        String str3 = this.c;
        kl8 kl8Var = this.d;
        hn6 hn6Var = this.e;
        km8 km8Var = this.f;
        String str4 = this.g;
        boolean z = this.h;
        Collection<xq0> collection = this.i;
        Collection<xq0> collection2 = this.j;
        return "CartComboSlotProductVO(id=" + str + ", name=" + str2 + ", imageUrl=" + str3 + ", category=" + kl8Var + ", price=" + hn6Var + ", productSize=" + km8Var + ", doughDescription=" + str4 + ", isInStop=" + z + ", removedIngredients=" + collection + ", toppings=" + collection2 + ")";
    }
}
