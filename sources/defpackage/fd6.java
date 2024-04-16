package defpackage;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.qd6;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.dodopizza.app.domain.menu.promo.ProductPromoAction;
/* compiled from: MenuItemVO.kt */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001BÇ\u0001\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0015\u0012\u0006\u0010\u001c\u001a\u00020\u0002\u0012\u0006\u0010\u001f\u001a\u00020\u0002\u0012\u0006\u0010%\u001a\u00020 \u0012\u0006\u0010+\u001a\u00020&\u0012\u0006\u0010.\u001a\u00020\u0002\u0012\u0006\u00103\u001a\u00020\b\u0012\u0006\u00109\u001a\u000204\u0012\f\u0010@\u001a\b\u0012\u0004\u0012\u00020;0:\u0012\u0006\u0010E\u001a\u00020A\u0012\b\u0010K\u001a\u0004\u0018\u00010F\u0012\u0006\u0010P\u001a\u00020\u0004\u0012\n\b\u0002\u0010R\u001a\u0004\u0018\u00010A\u0012\b\b\u0002\u0010U\u001a\u00020\b\u0012\b\b\u0002\u0010[\u001a\u00020V\u0012\u0006\u0010`\u001a\u00020\\\u0012\f\u0010f\u001a\b\u0012\u0004\u0012\u00020b0a\u0012\u0006\u0010k\u001a\u00020g¢\u0006\u0004\bl\u0010mJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u001a\u0010\u000e\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0011\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\rR\u001a\u0010\u0014\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000b\u001a\u0004\b\u0013\u0010\rR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\n\u0010\u0018R\u001a\u0010\u001c\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u000b\u001a\u0004\b\u001b\u0010\rR\u001a\u0010\u001f\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u000b\u001a\u0004\b\u001e\u0010\rR\u001a\u0010%\u001a\u00020 8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010+\u001a\u00020&8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001a\u0010.\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010\u000b\u001a\u0004\b-\u0010\rR\u001a\u00103\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001a\u00109\u001a\u0002048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R \u0010@\u001a\b\u0012\u0004\u0012\u00020;0:8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u001a\u0010E\u001a\u00020A8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\b'\u0010DR\u001c\u0010K\u001a\u0004\u0018\u00010F8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR\u001a\u0010P\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR\u001c\u0010R\u001a\u0004\u0018\u00010A8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b1\u0010C\u001a\u0004\bQ\u0010DR\u001a\u0010U\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bS\u00100\u001a\u0004\bT\u00102R\u001a\u0010[\u001a\u00020V8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\bY\u0010ZR\u0017\u0010`\u001a\u00020\\8\u0006¢\u0006\f\n\u0004\b]\u0010^\u001a\u0004\b\u000f\u0010_R\u001d\u0010f\u001a\b\u0012\u0004\u0012\u00020b0a8\u0006¢\u0006\f\n\u0004\bc\u0010d\u001a\u0004\b\u0012\u0010eR\u001a\u0010k\u001a\u00020g8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bh\u0010i\u001a\u0004\bM\u0010j¨\u0006n"}, d2 = {"Lfd6;", "Lye6;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "x", "()Ljava/lang/String;", "menuItemId", "b", "B", "menuCategoryId", c.a, "getName", Action.NAME_ATTRIBUTE, "Lkm8;", DateTokenConverter.CONVERTER_KEY, "Lkm8;", "()Lkm8;", "size", e.a, "getDescription", "description", "f", "w", "compositeDescription", "Lre6;", "g", "Lre6;", "H", "()Lre6;", "menuItemType", "Lkl8;", Image.TYPE_HIGH, "Lkl8;", "z", "()Lkl8;", "productCategory", "i", "y", "imageUrl", "j", "Z", "p", "()Z", "isStopped", "Lqd6$a;", "k", "Lqd6$a;", "D", "()Lqd6$a;", "addingToCartFromMenu", "", "Lru/dodopizza/app/domain/menu/promo/ProductPromoAction;", "l", "Ljava/util/Collection;", "F", "()Ljava/util/Collection;", "promoActions", "Lhn6;", Image.TYPE_MEDIUM, "Lhn6;", "()Lhn6;", "price", "Ll18;", "n", "Ll18;", "v", "()Ll18;", "personalPrice", "o", "I", "G", "()I", "variationsCount", "A", "rawPrice", "q", "E", "showDiscountBadge", "", "r", "J", "C", "()J", "discountEndTime", "Ldd6;", Image.TYPE_SMALL, "Ldd6;", "()Ldd6;", "menuCategory", "", "Ldh6;", "t", "Ljava/util/List;", "()Ljava/util/List;", "subcategories", "Lhf6;", "u", "Lhf6;", "()Lhf6;", "menuItemVersion", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkm8;Ljava/lang/String;Ljava/lang/String;Lre6;Lkl8;Ljava/lang/String;ZLqd6$a;Ljava/util/Collection;Lhn6;Ll18;ILhn6;ZJLdd6;Ljava/util/List;Lhf6;)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: fd6  reason: default package */
/* loaded from: classes2.dex */
public final class fd6 implements ye6 {
    private final String a;
    private final String b;
    private final String c;
    private final km8 d;
    private final String e;
    private final String f;
    private final re6 g;
    private final kl8 h;
    private final String i;
    private final boolean j;
    private final qd6.a k;
    private final Collection<ProductPromoAction> l;
    private final hn6 m;
    private final l18 n;
    private final int o;
    private final hn6 p;
    private final boolean q;
    private final long r;
    private final dd6 s;
    private final List<dh6> t;
    private final hf6 u;

    public fd6(String str, String str2, String str3, km8 km8Var, String str4, String str5, re6 re6Var, kl8 kl8Var, String str6, boolean z, qd6.a aVar, Collection<ProductPromoAction> collection, hn6 hn6Var, l18 l18Var, int i, hn6 hn6Var2, boolean z2, long j, dd6 dd6Var, List<dh6> list, hf6 hf6Var) {
        z65.h(str, "menuItemId");
        z65.h(str2, "menuCategoryId");
        z65.h(str3, Action.NAME_ATTRIBUTE);
        z65.h(str4, "description");
        z65.h(str5, "compositeDescription");
        z65.h(re6Var, "menuItemType");
        z65.h(kl8Var, "productCategory");
        z65.h(str6, "imageUrl");
        z65.h(aVar, "addingToCartFromMenu");
        z65.h(collection, "promoActions");
        z65.h(hn6Var, "price");
        z65.h(dd6Var, "menuCategory");
        z65.h(list, "subcategories");
        z65.h(hf6Var, "menuItemVersion");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = km8Var;
        this.e = str4;
        this.f = str5;
        this.g = re6Var;
        this.h = kl8Var;
        this.i = str6;
        this.j = z;
        this.k = aVar;
        this.l = collection;
        this.m = hn6Var;
        this.n = l18Var;
        this.o = i;
        this.p = hn6Var2;
        this.q = z2;
        this.r = j;
        this.s = dd6Var;
        this.t = list;
        this.u = hf6Var;
    }

    @Override // defpackage.ye6
    public hn6 A() {
        return this.p;
    }

    @Override // defpackage.ye6
    public String B() {
        return this.b;
    }

    @Override // defpackage.ye6
    public long C() {
        return this.r;
    }

    @Override // defpackage.ye6
    public qd6.a D() {
        return this.k;
    }

    @Override // defpackage.ye6
    public boolean E() {
        return this.q;
    }

    @Override // defpackage.ye6
    public Collection<ProductPromoAction> F() {
        return this.l;
    }

    @Override // defpackage.ye6
    public int G() {
        return this.o;
    }

    @Override // defpackage.ye6
    public re6 H() {
        return this.g;
    }

    @Override // defpackage.ye6
    public hf6 I() {
        return this.u;
    }

    @Override // defpackage.ye6
    public km8 a() {
        return this.d;
    }

    public final dd6 b() {
        return this.s;
    }

    public final List<dh6> c() {
        return this.t;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fd6)) {
            return false;
        }
        fd6 fd6Var = (fd6) obj;
        if (z65.c(this.a, fd6Var.a) && z65.c(this.b, fd6Var.b) && z65.c(this.c, fd6Var.c) && z65.c(this.d, fd6Var.d) && z65.c(this.e, fd6Var.e) && z65.c(this.f, fd6Var.f) && this.g == fd6Var.g && this.h == fd6Var.h && z65.c(this.i, fd6Var.i) && this.j == fd6Var.j && z65.c(this.k, fd6Var.k) && z65.c(this.l, fd6Var.l) && z65.c(this.m, fd6Var.m) && z65.c(this.n, fd6Var.n) && this.o == fd6Var.o && z65.c(this.p, fd6Var.p) && this.q == fd6Var.q && this.r == fd6Var.r && z65.c(this.s, fd6Var.s) && z65.c(this.t, fd6Var.t) && this.u == fd6Var.u) {
            return true;
        }
        return false;
    }

    @Override // defpackage.ye6
    public String getDescription() {
        return this.e;
    }

    @Override // defpackage.ye6
    public String getName() {
        return this.c;
    }

    @Override // defpackage.ye6
    public hn6 h() {
        return this.m;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = ((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31;
        km8 km8Var = this.d;
        int i = 0;
        if (km8Var == null) {
            hashCode = 0;
        } else {
            hashCode = km8Var.hashCode();
        }
        int hashCode4 = (((((((((((((((((((hashCode3 + hashCode) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31) + this.i.hashCode()) * 31) + a91.a(this.j)) * 31) + this.k.hashCode()) * 31) + this.l.hashCode()) * 31) + this.m.hashCode()) * 31;
        l18 l18Var = this.n;
        if (l18Var == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = l18Var.hashCode();
        }
        int i2 = (((hashCode4 + hashCode2) * 31) + this.o) * 31;
        hn6 hn6Var = this.p;
        if (hn6Var != null) {
            i = hn6Var.hashCode();
        }
        return ((((((((((i2 + i) * 31) + a91.a(this.q)) * 31) + ax1.a(this.r)) * 31) + this.s.hashCode()) * 31) + this.t.hashCode()) * 31) + this.u.hashCode();
    }

    @Override // defpackage.ye6
    public boolean p() {
        return this.j;
    }

    public String toString() {
        String str = this.a;
        String str2 = this.b;
        String str3 = this.c;
        km8 km8Var = this.d;
        String str4 = this.e;
        String str5 = this.f;
        re6 re6Var = this.g;
        kl8 kl8Var = this.h;
        String str6 = this.i;
        boolean z = this.j;
        qd6.a aVar = this.k;
        Collection<ProductPromoAction> collection = this.l;
        hn6 hn6Var = this.m;
        l18 l18Var = this.n;
        int i = this.o;
        hn6 hn6Var2 = this.p;
        boolean z2 = this.q;
        long j = this.r;
        dd6 dd6Var = this.s;
        List<dh6> list = this.t;
        hf6 hf6Var = this.u;
        return "MenuCategoryItemVO(menuItemId=" + str + ", menuCategoryId=" + str2 + ", name=" + str3 + ", size=" + km8Var + ", description=" + str4 + ", compositeDescription=" + str5 + ", menuItemType=" + re6Var + ", productCategory=" + kl8Var + ", imageUrl=" + str6 + ", isStopped=" + z + ", addingToCartFromMenu=" + aVar + ", promoActions=" + collection + ", price=" + hn6Var + ", personalPrice=" + l18Var + ", variationsCount=" + i + ", rawPrice=" + hn6Var2 + ", showDiscountBadge=" + z2 + ", discountEndTime=" + j + ", menuCategory=" + dd6Var + ", subcategories=" + list + ", menuItemVersion=" + hf6Var + ")";
    }

    @Override // defpackage.ye6
    public l18 v() {
        return this.n;
    }

    @Override // defpackage.ye6
    public String w() {
        return this.f;
    }

    @Override // defpackage.ye6
    public String x() {
        return this.a;
    }

    @Override // defpackage.ye6
    public String y() {
        return this.i;
    }

    @Override // defpackage.ye6
    public kl8 z() {
        return this.h;
    }

    public /* synthetic */ fd6(String str, String str2, String str3, km8 km8Var, String str4, String str5, re6 re6Var, kl8 kl8Var, String str6, boolean z, qd6.a aVar, Collection collection, hn6 hn6Var, l18 l18Var, int i, hn6 hn6Var2, boolean z2, long j, dd6 dd6Var, List list, hf6 hf6Var, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, km8Var, str4, str5, re6Var, kl8Var, str6, z, aVar, collection, hn6Var, l18Var, i, (i2 & 32768) != 0 ? null : hn6Var2, (i2 & 65536) != 0 ? false : z2, (i2 & 131072) != 0 ? 0L : j, dd6Var, list, hf6Var);
    }
}
