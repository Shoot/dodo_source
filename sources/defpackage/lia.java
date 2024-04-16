package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: ShoppingCart.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b*\b\u0086\b\u0018\u0000 %2\u00020\u0001:\u0001\u0017Bm\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0014\u001a\u00020\n\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b=\u0010>J\u0006\u0010\u0003\u001a\u00020\u0002J\u0087\u0001\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\n2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\n2\b\b\u0002\u0010\u0016\u001a\u00020\u0015HÆ\u0001J\t\u0010\u0018\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u001b\u001a\u00020\u00152\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b+\u0010(\u001a\u0004\b,\u0010*R\u0017\u0010\r\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b!\u0010(\u001a\u0004\b-\u0010*R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b.\u0010(\u001a\u0004\b/\u0010*R\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b/\u0010(\u001a\u0004\b'\u0010*R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b,\u00100\u001a\u0004\b.\u00101R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b-\u00102\u001a\u0004\b#\u00103R\u0017\u0010\u0014\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b4\u0010(\u001a\u0004\b5\u0010*R\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b)\u00106\u001a\u0004\b7\u00108R\u0017\u00109\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068F¢\u0006\u0006\u001a\u0004\b+\u0010\"R\u0011\u0010;\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b:\u00108R\u0017\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068F¢\u0006\u0006\u001a\u0004\b4\u0010\"¨\u0006?"}, d2 = {"Llia;", "", "", "o", "", "id", "", "Lnq0;", "items", "saucesCount", "Lhn6;", "saucesCost", "rawPrice", "rawPriceWithoutGoods", "minOrderPriceForDelivery", "discount", "", "loyaltyRewardSum", "Ldx2;", "deliveryFee", "total", "", "isReadyToCheckout", "a", "toString", "hashCode", "other", "equals", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "b", "Ljava/util/List;", "f", "()Ljava/util/List;", com.huawei.hms.opendevice.c.a, "I", Image.TYPE_MEDIUM, "()I", DateTokenConverter.CONVERTER_KEY, "Lhn6;", "l", "()Lhn6;", e.a, "i", "j", "g", Image.TYPE_HIGH, "D", "()D", "Ldx2;", "()Ldx2;", "k", "n", "Z", "q", "()Z", "goods", "p", "isEmptyCart", "sauces", "<init>", "(Ljava/lang/String;Ljava/util/List;ILhn6;Lhn6;Lhn6;Lhn6;Lhn6;DLdx2;Lhn6;Z)V", "cart"}, k = 1, mv = {1, 9, 0})
/* renamed from: lia  reason: default package */
/* loaded from: classes.dex */
public final class lia {
    public static final a m = new a(null);
    private final String a;
    private final List<nq0> b;
    private final int c;
    private final hn6 d;
    private final hn6 e;
    private final hn6 f;
    private final hn6 g;
    private final hn6 h;
    private final double i;
    private final dx2 j;
    private final hn6 k;
    private final boolean l;

    /* compiled from: ShoppingCart.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0006"}, d2 = {"Llia$a;", "", "Llia;", "a", "<init>", "()V", "cart"}, k = 1, mv = {1, 9, 0})
    /* renamed from: lia$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final lia a() {
            List l;
            l = kc1.l();
            return new lia("", l, 0, kn6.f(), kn6.f(), kn6.f(), kn6.f(), kn6.f(), 0.0d, new dx2(kn6.f(), null, null, 6, null), kn6.f(), false);
        }
    }

    /* compiled from: Comparisons.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: lia$b */
    /* loaded from: classes.dex */
    public static final class b<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int d;
            d = mk1.d(Integer.valueOf(((nq0) t).s()), Integer.valueOf(((nq0) t2).s()));
            return d;
        }
    }

    /* compiled from: Comparisons.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: lia$c */
    /* loaded from: classes.dex */
    public static final class c<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int d;
            d = mk1.d(Integer.valueOf(((nq0) t).s()), Integer.valueOf(((nq0) t2).s()));
            return d;
        }
    }

    public lia(String str, List<nq0> list, int i, hn6 hn6Var, hn6 hn6Var2, hn6 hn6Var3, hn6 hn6Var4, hn6 hn6Var5, double d, dx2 dx2Var, hn6 hn6Var6, boolean z) {
        z65.h(str, "id");
        z65.h(list, "items");
        z65.h(hn6Var, "saucesCost");
        z65.h(hn6Var2, "rawPrice");
        z65.h(hn6Var3, "rawPriceWithoutGoods");
        z65.h(hn6Var4, "minOrderPriceForDelivery");
        z65.h(hn6Var5, "discount");
        z65.h(dx2Var, "deliveryFee");
        z65.h(hn6Var6, "total");
        this.a = str;
        this.b = list;
        this.c = i;
        this.d = hn6Var;
        this.e = hn6Var2;
        this.f = hn6Var3;
        this.g = hn6Var4;
        this.h = hn6Var5;
        this.i = d;
        this.j = dx2Var;
        this.k = hn6Var6;
        this.l = z;
    }

    public final lia a(String str, List<nq0> list, int i, hn6 hn6Var, hn6 hn6Var2, hn6 hn6Var3, hn6 hn6Var4, hn6 hn6Var5, double d, dx2 dx2Var, hn6 hn6Var6, boolean z) {
        z65.h(str, "id");
        z65.h(list, "items");
        z65.h(hn6Var, "saucesCost");
        z65.h(hn6Var2, "rawPrice");
        z65.h(hn6Var3, "rawPriceWithoutGoods");
        z65.h(hn6Var4, "minOrderPriceForDelivery");
        z65.h(hn6Var5, "discount");
        z65.h(dx2Var, "deliveryFee");
        z65.h(hn6Var6, "total");
        return new lia(str, list, i, hn6Var, hn6Var2, hn6Var3, hn6Var4, hn6Var5, d, dx2Var, hn6Var6, z);
    }

    public final dx2 c() {
        return this.j;
    }

    public final hn6 d() {
        return this.h;
    }

    public final List<nq0> e() {
        List<nq0> y0;
        y0 = sc1.y0(this.b, new b());
        return y0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lia)) {
            return false;
        }
        lia liaVar = (lia) obj;
        if (z65.c(this.a, liaVar.a) && z65.c(this.b, liaVar.b) && this.c == liaVar.c && z65.c(this.d, liaVar.d) && z65.c(this.e, liaVar.e) && z65.c(this.f, liaVar.f) && z65.c(this.g, liaVar.g) && z65.c(this.h, liaVar.h) && Double.compare(this.i, liaVar.i) == 0 && z65.c(this.j, liaVar.j) && z65.c(this.k, liaVar.k) && this.l == liaVar.l) {
            return true;
        }
        return false;
    }

    public final List<nq0> f() {
        return this.b;
    }

    public final double g() {
        return this.i;
    }

    public final hn6 h() {
        return this.g;
    }

    public int hashCode() {
        return (((((((((((((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31) + nkb.a(this.i)) * 31) + this.j.hashCode()) * 31) + this.k.hashCode()) * 31) + a91.a(this.l);
    }

    public final hn6 i() {
        return this.e;
    }

    public final hn6 j() {
        return this.f;
    }

    public final List<nq0> k() {
        List<nq0> y0;
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.b) {
            if (((nq0) obj).H()) {
                arrayList.add(obj);
            }
        }
        y0 = sc1.y0(arrayList, new c());
        return y0;
    }

    public final hn6 l() {
        return this.d;
    }

    public final int m() {
        return this.c;
    }

    public final hn6 n() {
        return this.k;
    }

    public final int o() {
        int i = 0;
        for (nq0 nq0Var : this.b) {
            i += nq0Var.d();
        }
        return i;
    }

    public final boolean p() {
        return e().isEmpty();
    }

    public final boolean q() {
        return this.l;
    }

    public String toString() {
        String str = this.a;
        List<nq0> list = this.b;
        int i = this.c;
        hn6 hn6Var = this.d;
        hn6 hn6Var2 = this.e;
        hn6 hn6Var3 = this.f;
        hn6 hn6Var4 = this.g;
        hn6 hn6Var5 = this.h;
        double d = this.i;
        dx2 dx2Var = this.j;
        hn6 hn6Var6 = this.k;
        boolean z = this.l;
        return "ShoppingCart(id=" + str + ", items=" + list + ", saucesCount=" + i + ", saucesCost=" + hn6Var + ", rawPrice=" + hn6Var2 + ", rawPriceWithoutGoods=" + hn6Var3 + ", minOrderPriceForDelivery=" + hn6Var4 + ", discount=" + hn6Var5 + ", loyaltyRewardSum=" + d + ", deliveryFee=" + dx2Var + ", total=" + hn6Var6 + ", isReadyToCheckout=" + z + ")";
    }
}
