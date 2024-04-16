package defpackage;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.List;
import kotlin.Metadata;
/* compiled from: ComboCartProductVO.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0012\u0012\u0006\u0010\u001a\u001a\u00020\u0004\u0012\u0006\u0010\u001c\u001a\u00020\u0004\u0012\u0006\u0010\u001f\u001a\u00020\b\u0012\b\u0010$\u001a\u0004\u0018\u00010 \u0012\u0006\u0010)\u001a\u00020%\u0012\f\u0010/\u001a\b\u0012\u0004\u0012\u00020+0*\u0012\u0006\u00101\u001a\u00020\b¢\u0006\u0004\b2\u00103J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u001a\u0010\u000e\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0011\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\rR\u001a\u0010\u0017\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001a\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0018\u001a\u0004\b\n\u0010\u0019R\u001a\u0010\u001c\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001b\u0010\u0019R\u001a\u0010\u001f\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\u001d\u001a\u0004\b\u000f\u0010\u001eR\u001c\u0010$\u001a\u0004\u0018\u00010 8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010)\u001a\u00020%8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b\u0013\u0010(R\u001d\u0010/\u001a\b\u0012\u0004\u0012\u00020+0*8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b&\u0010.R\u0017\u00101\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b0\u0010\u001d\u001a\u0004\b,\u0010\u001e¨\u00064"}, d2 = {"Lvg1;", "Lor0;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "f", "()Ljava/lang/String;", Action.NAME_ATTRIBUTE, "b", DateTokenConverter.CONVERTER_KEY, "imageUrl", "Lhn6;", c.a, "Lhn6;", "g", "()Lhn6;", "price", "I", "()I", "count", e.a, "maxCount", "Z", "()Z", "isInStop", "Lv23;", "Lv23;", "getDiscount", "()Lv23;", "discount", "Lnq0;", Image.TYPE_HIGH, "Lnq0;", "()Lnq0;", "cartItem", "", "Leq0;", "i", "Ljava/util/List;", "()Ljava/util/List;", "products", "j", "isEditable", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lhn6;IIZLv23;Lnq0;Ljava/util/List;Z)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: vg1  reason: default package */
/* loaded from: classes2.dex */
public final class vg1 extends or0 {
    private final String a;
    private final String b;
    private final hn6 c;
    private final int d;
    private final int e;
    private final boolean f;
    private final v23 g;
    private final nq0 h;
    private final List<eq0> i;
    private final boolean j;

    public vg1(String str, String str2, hn6 hn6Var, int i, int i2, boolean z, v23 v23Var, nq0 nq0Var, List<eq0> list, boolean z2) {
        z65.h(str, Action.NAME_ATTRIBUTE);
        z65.h(str2, "imageUrl");
        z65.h(hn6Var, "price");
        z65.h(nq0Var, "cartItem");
        z65.h(list, "products");
        this.a = str;
        this.b = str2;
        this.c = hn6Var;
        this.d = i;
        this.e = i2;
        this.f = z;
        this.g = v23Var;
        this.h = nq0Var;
        this.i = list;
        this.j = z2;
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
        return this.h;
    }

    public String d() {
        return this.b;
    }

    public int e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vg1)) {
            return false;
        }
        vg1 vg1Var = (vg1) obj;
        if (z65.c(this.a, vg1Var.a) && z65.c(this.b, vg1Var.b) && z65.c(this.c, vg1Var.c) && this.d == vg1Var.d && this.e == vg1Var.e && this.f == vg1Var.f && z65.c(this.g, vg1Var.g) && z65.c(this.h, vg1Var.h) && z65.c(this.i, vg1Var.i) && this.j == vg1Var.j) {
            return true;
        }
        return false;
    }

    public String f() {
        return this.a;
    }

    public hn6 g() {
        return this.c;
    }

    public final List<eq0> h() {
        return this.i;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d) * 31) + this.e) * 31) + a91.a(this.f)) * 31;
        v23 v23Var = this.g;
        if (v23Var == null) {
            hashCode = 0;
        } else {
            hashCode = v23Var.hashCode();
        }
        return ((((((hashCode2 + hashCode) * 31) + this.h.hashCode()) * 31) + this.i.hashCode()) * 31) + a91.a(this.j);
    }

    public final boolean i() {
        return this.j;
    }

    public String toString() {
        String str = this.a;
        String str2 = this.b;
        hn6 hn6Var = this.c;
        int i = this.d;
        int i2 = this.e;
        boolean z = this.f;
        v23 v23Var = this.g;
        nq0 nq0Var = this.h;
        List<eq0> list = this.i;
        boolean z2 = this.j;
        return "ComboCartProductVO(name=" + str + ", imageUrl=" + str2 + ", price=" + hn6Var + ", count=" + i + ", maxCount=" + i2 + ", isInStop=" + z + ", discount=" + v23Var + ", cartItem=" + nq0Var + ", products=" + list + ", isEditable=" + z2 + ")";
    }
}
