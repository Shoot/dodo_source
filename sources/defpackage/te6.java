package defpackage;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import im.threads.business.transport.MessageAttributes;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: MenuItemV5.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u001f\b\u0086\b\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0006\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0006\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0006\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b;\u0010<J¨\u0001\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00062\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00062\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00062\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010\u001b\u001a\u00020\u0002HÖ\u0001J\t\u0010\u001c\u001a\u00020\tHÖ\u0001J\u0013\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b$\u0010\"R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010 \u001a\u0004\b&\u0010\"R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b!\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b(\u0010-\u001a\u0004\b.\u0010/R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b$\u00100\u001a\u0004\b1\u00102R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00068\u0006¢\u0006\f\n\u0004\b1\u0010'\u001a\u0004\b7\u0010)R\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00068\u0006¢\u0006\f\n\u0004\b7\u0010'\u001a\u0004\b8\u0010)R\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00068\u0006¢\u0006\f\n\u0004\b.\u0010'\u001a\u0004\b%\u0010)R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b3\u0010:¨\u0006="}, d2 = {"Lte6;", "", "", "id", Action.NAME_ATTRIBUTE, "description", "", "Lwv4;", "images", "", "maxCountPerOrder", "Lse6;", MessageAttributes.TYPE, "Lhn6;", "price", "Lbt9;", "saleTime", "Lfj1;", "slots", "Ldxb;", "variations", "Lv6;", "additionalData", "Ll18;", "personalPrice", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;Lse6;Lhn6;Lbt9;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ll18;)Lte6;", "toString", "hashCode", "other", "", "equals", "Ljava/lang/String;", e.a, "()Ljava/lang/String;", "b", "g", c.a, DateTokenConverter.CONVERTER_KEY, "Ljava/util/List;", "f", "()Ljava/util/List;", "Ljava/lang/Integer;", "getMaxCountPerOrder", "()Ljava/lang/Integer;", "Lse6;", "k", "()Lse6;", "Lhn6;", "i", "()Lhn6;", Image.TYPE_HIGH, "Lbt9;", "getSaleTime", "()Lbt9;", "j", "l", "Ll18;", "()Ll18;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;Lse6;Lhn6;Lbt9;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ll18;)V", "common"}, k = 1, mv = {1, 9, 0})
/* renamed from: te6  reason: default package */
/* loaded from: classes.dex */
public final class te6 {
    private final String a;
    private final String b;
    private final String c;
    private final List<wv4> d;
    private final Integer e;
    private final se6 f;
    private final hn6 g;
    private final bt9 h;
    private final List<fj1> i;
    private final List<dxb> j;
    private final List<v6> k;
    private final l18 l;

    public te6(String str, String str2, String str3, List<wv4> list, Integer num, se6 se6Var, hn6 hn6Var, bt9 bt9Var, List<fj1> list2, List<dxb> list3, List<v6> list4, l18 l18Var) {
        z65.h(str, "id");
        z65.h(str2, Action.NAME_ATTRIBUTE);
        z65.h(str3, "description");
        z65.h(list, "images");
        z65.h(se6Var, MessageAttributes.TYPE);
        z65.h(list2, "slots");
        z65.h(list3, "variations");
        z65.h(list4, "additionalData");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
        this.e = num;
        this.f = se6Var;
        this.g = hn6Var;
        this.h = bt9Var;
        this.i = list2;
        this.j = list3;
        this.k = list4;
        this.l = l18Var;
    }

    public final te6 a(String str, String str2, String str3, List<wv4> list, Integer num, se6 se6Var, hn6 hn6Var, bt9 bt9Var, List<fj1> list2, List<dxb> list3, List<v6> list4, l18 l18Var) {
        z65.h(str, "id");
        z65.h(str2, Action.NAME_ATTRIBUTE);
        z65.h(str3, "description");
        z65.h(list, "images");
        z65.h(se6Var, MessageAttributes.TYPE);
        z65.h(list2, "slots");
        z65.h(list3, "variations");
        z65.h(list4, "additionalData");
        return new te6(str, str2, str3, list, num, se6Var, hn6Var, bt9Var, list2, list3, list4, l18Var);
    }

    public final List<v6> c() {
        return this.k;
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
        if (!(obj instanceof te6)) {
            return false;
        }
        te6 te6Var = (te6) obj;
        if (z65.c(this.a, te6Var.a) && z65.c(this.b, te6Var.b) && z65.c(this.c, te6Var.c) && z65.c(this.d, te6Var.d) && z65.c(this.e, te6Var.e) && this.f == te6Var.f && z65.c(this.g, te6Var.g) && z65.c(this.h, te6Var.h) && z65.c(this.i, te6Var.i) && z65.c(this.j, te6Var.j) && z65.c(this.k, te6Var.k) && z65.c(this.l, te6Var.l)) {
            return true;
        }
        return false;
    }

    public final List<wv4> f() {
        return this.d;
    }

    public final String g() {
        return this.b;
    }

    public final l18 h() {
        return this.l;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4 = ((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31;
        Integer num = this.e;
        int i = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int hashCode5 = (((hashCode4 + hashCode) * 31) + this.f.hashCode()) * 31;
        hn6 hn6Var = this.g;
        if (hn6Var == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = hn6Var.hashCode();
        }
        int i2 = (hashCode5 + hashCode2) * 31;
        bt9 bt9Var = this.h;
        if (bt9Var == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = bt9Var.hashCode();
        }
        int hashCode6 = (((((((i2 + hashCode3) * 31) + this.i.hashCode()) * 31) + this.j.hashCode()) * 31) + this.k.hashCode()) * 31;
        l18 l18Var = this.l;
        if (l18Var != null) {
            i = l18Var.hashCode();
        }
        return hashCode6 + i;
    }

    public final hn6 i() {
        return this.g;
    }

    public final List<fj1> j() {
        return this.i;
    }

    public final se6 k() {
        return this.f;
    }

    public final List<dxb> l() {
        return this.j;
    }

    public String toString() {
        String str = this.a;
        String str2 = this.b;
        String str3 = this.c;
        List<wv4> list = this.d;
        Integer num = this.e;
        se6 se6Var = this.f;
        hn6 hn6Var = this.g;
        bt9 bt9Var = this.h;
        List<fj1> list2 = this.i;
        List<dxb> list3 = this.j;
        List<v6> list4 = this.k;
        l18 l18Var = this.l;
        return "MenuItemV5(id=" + str + ", name=" + str2 + ", description=" + str3 + ", images=" + list + ", maxCountPerOrder=" + num + ", type=" + se6Var + ", price=" + hn6Var + ", saleTime=" + bt9Var + ", slots=" + list2 + ", variations=" + list3 + ", additionalData=" + list4 + ", personalPrice=" + l18Var + ")";
    }

    public /* synthetic */ te6(String str, String str2, String str3, List list, Integer num, se6 se6Var, hn6 hn6Var, bt9 bt9Var, List list2, List list3, List list4, l18 l18Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, list, num, se6Var, hn6Var, bt9Var, list2, list3, list4, (i & 2048) != 0 ? null : l18Var);
    }
}
