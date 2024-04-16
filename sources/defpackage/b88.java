package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
/* compiled from: PizzaSlotVO.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0086\b\u0018\u00002\u00020\u0001Ba\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b,\u0010-Jo\u0010\u0011\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\t2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÆ\u0001J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0013\u001a\u00020\nHÖ\u0001J\u0013\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\t8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b#\u0010%R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00028\u0006¢\u0006\f\n\u0004\b&\u0010\u0018\u001a\u0004\b&\u0010\u001aR\u0017\u0010\u000e\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b!\u0010\u001c\u001a\u0004\b'\u0010\u001eR$\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010(\u001a\u0004\b\u001f\u0010)\"\u0004\b*\u0010+¨\u0006."}, d2 = {"Lb88;", "Lx89;", "", "Lm78;", "products", "", "slotSelectedProductId", "", "productIdsStopList", "", "", "doughControlNames", "Lhn6;", "extraPrice", "slotId", "Ly89;", "customReceipt", "b", "toString", "hashCode", "", "other", "", "equals", "Ljava/util/List;", Image.TYPE_HIGH, "()Ljava/util/List;", c.a, "Ljava/lang/String;", "j", "()Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "Ljava/util/Collection;", "g", "()Ljava/util/Collection;", e.a, "Ljava/util/Map;", "()Ljava/util/Map;", "f", "i", "Ly89;", "()Ly89;", "a", "(Ly89;)V", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/util/Collection;Ljava/util/Map;Ljava/util/List;Ljava/lang/String;Ly89;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: b88  reason: default package */
/* loaded from: classes4.dex */
public final class b88 extends x89 {
    private final List<m78> b;
    private final String c;
    private final Collection<String> d;
    private final Map<Integer, String> e;
    private final List<hn6> f;
    private final String g;
    private y89 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b88(List<m78> list, String str, Collection<String> collection, Map<Integer, String> map, List<hn6> list2, String str2, y89 y89Var) {
        super(y89Var);
        z65.h(list, "products");
        z65.h(str, "slotSelectedProductId");
        z65.h(collection, "productIdsStopList");
        z65.h(map, "doughControlNames");
        z65.h(list2, "extraPrice");
        z65.h(str2, "slotId");
        this.b = list;
        this.c = str;
        this.d = collection;
        this.e = map;
        this.f = list2;
        this.g = str2;
        this.h = y89Var;
    }

    public static /* synthetic */ b88 c(b88 b88Var, List list, String str, Collection collection, Map map, List list2, String str2, y89 y89Var, int i, Object obj) {
        List<m78> list3 = list;
        if ((i & 1) != 0) {
            list3 = b88Var.b;
        }
        if ((i & 2) != 0) {
            str = b88Var.c;
        }
        String str3 = str;
        Collection<String> collection2 = collection;
        if ((i & 4) != 0) {
            collection2 = b88Var.d;
        }
        Collection collection3 = collection2;
        Map<Integer, String> map2 = map;
        if ((i & 8) != 0) {
            map2 = b88Var.e;
        }
        Map map3 = map2;
        List<hn6> list4 = list2;
        if ((i & 16) != 0) {
            list4 = b88Var.f;
        }
        List list5 = list4;
        if ((i & 32) != 0) {
            str2 = b88Var.g;
        }
        String str4 = str2;
        if ((i & 64) != 0) {
            y89Var = b88Var.h;
        }
        return b88Var.b(list3, str3, collection3, map3, list5, str4, y89Var);
    }

    @Override // defpackage.x89
    public void a(y89 y89Var) {
        this.h = y89Var;
    }

    public final b88 b(List<m78> list, String str, Collection<String> collection, Map<Integer, String> map, List<hn6> list2, String str2, y89 y89Var) {
        z65.h(list, "products");
        z65.h(str, "slotSelectedProductId");
        z65.h(collection, "productIdsStopList");
        z65.h(map, "doughControlNames");
        z65.h(list2, "extraPrice");
        z65.h(str2, "slotId");
        return new b88(list, str, collection, map, list2, str2, y89Var);
    }

    public y89 d() {
        return this.h;
    }

    public final Map<Integer, String> e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b88)) {
            return false;
        }
        b88 b88Var = (b88) obj;
        if (z65.c(this.b, b88Var.b) && z65.c(this.c, b88Var.c) && z65.c(this.d, b88Var.d) && z65.c(this.e, b88Var.e) && z65.c(this.f, b88Var.f) && z65.c(this.g, b88Var.g) && z65.c(this.h, b88Var.h)) {
            return true;
        }
        return false;
    }

    public final List<hn6> f() {
        return this.f;
    }

    public final Collection<String> g() {
        return this.d;
    }

    public final List<m78> h() {
        return this.b;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((((((((((this.b.hashCode() * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31;
        y89 y89Var = this.h;
        if (y89Var == null) {
            hashCode = 0;
        } else {
            hashCode = y89Var.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String i() {
        return this.g;
    }

    public final String j() {
        return this.c;
    }

    public String toString() {
        List<m78> list = this.b;
        String str = this.c;
        Collection<String> collection = this.d;
        Map<Integer, String> map = this.e;
        List<hn6> list2 = this.f;
        String str2 = this.g;
        y89 y89Var = this.h;
        return "PizzaSlotVO(products=" + list + ", slotSelectedProductId=" + str + ", productIdsStopList=" + collection + ", doughControlNames=" + map + ", extraPrice=" + list2 + ", slotId=" + str2 + ", customReceipt=" + y89Var + ")";
    }
}
