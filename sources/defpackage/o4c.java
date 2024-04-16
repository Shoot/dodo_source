package defpackage;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.Collection;
import kotlin.Metadata;
/* compiled from: WholePizzaCartProductVO.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B}\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0012\u0012\u0006\u0010\u001b\u001a\u00020\u0004\u0012\u0006\u0010\u001e\u001a\u00020\u0004\u0012\u0006\u0010!\u001a\u00020\b\u0012\u0006\u0010%\u001a\u00020\"\u0012\u0006\u0010&\u001a\u00020\u0002\u0012\u0006\u0010(\u001a\u00020\b\u0012\b\u0010-\u001a\u0004\u0018\u00010)\u0012\f\u00103\u001a\b\u0012\u0004\u0012\u00020/0.\u0012\f\u00105\u001a\b\u0012\u0004\u0012\u00020/0.\u0012\u0006\u00106\u001a\u00020\b¢\u0006\u0004\b7\u00108J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u001a\u0010\u000e\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0011\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\rR\u001a\u0010\u0017\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001b\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\n\u0010\u001aR\u001a\u0010\u001e\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001aR\u001a\u0010!\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u001f\u001a\u0004\b\u000f\u0010 R\u001a\u0010%\u001a\u00020\"8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010#\u001a\u0004\b\u0013\u0010$R\u001a\u0010&\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\u000b\u001a\u0004\b\u001c\u0010\rR\u001a\u0010(\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u001f\u001a\u0004\b'\u0010 R\u001c\u0010-\u001a\u0004\u0018\u00010)8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b\u0018\u0010,R\u001d\u00103\u001a\b\u0012\u0004\u0012\u00020/0.8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b*\u00102R\u001d\u00105\u001a\b\u0012\u0004\u0012\u00020/0.8\u0006¢\u0006\f\n\u0004\b4\u00101\u001a\u0004\b0\u00102R\u0017\u00106\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b'\u0010\u001f\u001a\u0004\b4\u0010 ¨\u00069"}, d2 = {"Lo4c;", "La78;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", Image.TYPE_HIGH, "()Ljava/lang/String;", Action.NAME_ATTRIBUTE, "b", "f", "imageUrl", "Lhn6;", c.a, "Lhn6;", "i", "()Lhn6;", "price", DateTokenConverter.CONVERTER_KEY, "I", "()I", "count", e.a, "g", "maxCount", "Z", "()Z", "isInStop", "Lnq0;", "Lnq0;", "()Lnq0;", "cartItem", "doughDescription", Image.TYPE_MEDIUM, "isGift", "Lv23;", "j", "Lv23;", "()Lv23;", "discount", "", "Lxq0;", "k", "Ljava/util/Collection;", "()Ljava/util/Collection;", "removedIngredients", "l", "toppings", "isEditable", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lhn6;IIZLnq0;Ljava/lang/String;ZLv23;Ljava/util/Collection;Ljava/util/Collection;Z)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: o4c  reason: default package */
/* loaded from: classes2.dex */
public final class o4c extends a78 {
    private final String a;
    private final String b;
    private final hn6 c;
    private final int d;
    private final int e;
    private final boolean f;
    private final nq0 g;
    private final String h;
    private final boolean i;
    private final v23 j;
    private final Collection<xq0> k;
    private final Collection<xq0> l;
    private final boolean m;

    public o4c(String str, String str2, hn6 hn6Var, int i, int i2, boolean z, nq0 nq0Var, String str3, boolean z2, v23 v23Var, Collection<xq0> collection, Collection<xq0> collection2, boolean z3) {
        z65.h(str, Action.NAME_ATTRIBUTE);
        z65.h(str2, "imageUrl");
        z65.h(hn6Var, "price");
        z65.h(nq0Var, "cartItem");
        z65.h(str3, "doughDescription");
        z65.h(collection, "removedIngredients");
        z65.h(collection2, "toppings");
        this.a = str;
        this.b = str2;
        this.c = hn6Var;
        this.d = i;
        this.e = i2;
        this.f = z;
        this.g = nq0Var;
        this.h = str3;
        this.i = z2;
        this.j = v23Var;
        this.k = collection;
        this.l = collection2;
        this.m = z3;
    }

    @Override // defpackage.or0
    public int a() {
        return this.d;
    }

    @Override // defpackage.or0
    public boolean b() {
        return this.f;
    }

    public nq0 c() {
        return this.g;
    }

    public v23 d() {
        return this.j;
    }

    public String e() {
        return this.h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o4c)) {
            return false;
        }
        o4c o4cVar = (o4c) obj;
        if (z65.c(this.a, o4cVar.a) && z65.c(this.b, o4cVar.b) && z65.c(this.c, o4cVar.c) && this.d == o4cVar.d && this.e == o4cVar.e && this.f == o4cVar.f && z65.c(this.g, o4cVar.g) && z65.c(this.h, o4cVar.h) && this.i == o4cVar.i && z65.c(this.j, o4cVar.j) && z65.c(this.k, o4cVar.k) && z65.c(this.l, o4cVar.l) && this.m == o4cVar.m) {
            return true;
        }
        return false;
    }

    public String f() {
        return this.b;
    }

    public int g() {
        return this.e;
    }

    public String h() {
        return this.a;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((((((((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d) * 31) + this.e) * 31) + a91.a(this.f)) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31) + a91.a(this.i)) * 31;
        v23 v23Var = this.j;
        if (v23Var == null) {
            hashCode = 0;
        } else {
            hashCode = v23Var.hashCode();
        }
        return ((((((hashCode2 + hashCode) * 31) + this.k.hashCode()) * 31) + this.l.hashCode()) * 31) + a91.a(this.m);
    }

    public hn6 i() {
        return this.c;
    }

    public final Collection<xq0> j() {
        return this.k;
    }

    public final Collection<xq0> k() {
        return this.l;
    }

    public final boolean l() {
        return this.m;
    }

    public boolean m() {
        return this.i;
    }

    public String toString() {
        String str = this.a;
        String str2 = this.b;
        hn6 hn6Var = this.c;
        int i = this.d;
        int i2 = this.e;
        boolean z = this.f;
        nq0 nq0Var = this.g;
        String str3 = this.h;
        boolean z2 = this.i;
        v23 v23Var = this.j;
        Collection<xq0> collection = this.k;
        Collection<xq0> collection2 = this.l;
        boolean z3 = this.m;
        return "WholePizzaCartProductVO(name=" + str + ", imageUrl=" + str2 + ", price=" + hn6Var + ", count=" + i + ", maxCount=" + i2 + ", isInStop=" + z + ", cartItem=" + nq0Var + ", doughDescription=" + str3 + ", isGift=" + z2 + ", discount=" + v23Var + ", removedIngredients=" + collection + ", toppings=" + collection2 + ", isEditable=" + z3 + ")";
    }
}
