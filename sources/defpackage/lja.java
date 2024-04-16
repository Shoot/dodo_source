package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.List;
import kotlin.Metadata;
/* compiled from: ShoppingCartVO.kt */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0099\u0001\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u000e\u0012\u0006\u0010\u001e\u001a\u00020\u0019\u0012\u0006\u0010 \u001a\u00020\u0019\u0012\u0006\u0010%\u001a\u00020!\u0012\u0006\u0010)\u001a\u00020&\u0012\u0006\u0010+\u001a\u00020\u0019\u0012\u0006\u0010-\u001a\u00020\u0019\u0012\u0006\u00101\u001a\u00020.\u0012\u0006\u00103\u001a\u00020\u0019\u0012\u0006\u00105\u001a\u00020\u0004\u0012\u0006\u00109\u001a\u000206\u0012\u0006\u0010=\u001a\u00020\u0007\u0012\u0006\u0010?\u001a\u00020\u0007\u0012\f\u0010A\u001a\b\u0012\u0004\u0012\u00020@0\u000e¢\u0006\u0004\bB\u0010CJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u000e8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013R\u0017\u0010\u001e\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010 \u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b\u0016\u0010\u001dR\u0017\u0010%\u001a\u00020!8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\u001a\u0010$R\u0017\u0010)\u001a\u00020&8\u0006¢\u0006\f\n\u0004\b\u0012\u0010'\u001a\u0004\b\t\u0010(R\u0017\u0010+\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001b\u001a\u0004\b*\u0010\u001dR\u0017\u0010-\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b,\u0010\u001b\u001a\u0004\b,\u0010\u001dR\u0017\u00101\u001a\u00020.8\u0006¢\u0006\f\n\u0004\b\u0017\u0010/\u001a\u0004\b\u001f\u00100R\u0017\u00103\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b2\u0010\u001b\u001a\u0004\b2\u0010\u001dR\u0017\u00105\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b4\u0010\n\u001a\u0004\b4\u0010\fR\u0017\u00109\u001a\u0002068\u0006¢\u0006\f\n\u0004\b*\u00107\u001a\u0004\b\"\u00108R\u0017\u0010=\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u000b\u0010:\u001a\u0004\b;\u0010<R\u0017\u0010?\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b>\u0010:\u001a\u0004\b>\u0010<R\u001d\u0010A\u001a\b\u0012\u0004\u0012\u00020@0\u000e8\u0006¢\u0006\f\n\u0004\b;\u0010\u0011\u001a\u0004\b\u0010\u0010\u0013¨\u0006D"}, d2 = {"Llja;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "I", "n", "()I", "totalCount", "", "Lor0;", "b", "Ljava/util/List;", "g", "()Ljava/util/List;", "productVOs", "Lnq0;", c.a, "j", "sauces", "Lhn6;", DateTokenConverter.CONVERTER_KEY, "Lhn6;", Image.TYPE_HIGH, "()Lhn6;", "rawPrice", e.a, "discount", "", "f", "J", "()J", "loyaltyRewardSum", "Lgx2;", "Lgx2;", "()Lgx2;", "deliveryFee", Image.TYPE_MEDIUM, "total", "i", "rawPriceWithoutGoods", "Lcj6;", "Lcj6;", "()Lcj6;", "minDeliveryPriceInfo", "k", "saucesCost", "l", "saucesCount", "Ljk7;", "Ljk7;", "()Ljk7;", "orderType", "Z", "p", "()Z", "isReadyToCheckout", "o", "isEmpty", "Llq3;", "deliveryFeeLevels", "<init>", "(ILjava/util/List;Ljava/util/List;Lhn6;Lhn6;JLgx2;Lhn6;Lhn6;Lcj6;Lhn6;ILjk7;ZZLjava/util/List;)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: lja  reason: default package */
/* loaded from: classes2.dex */
public final class lja {
    private final int a;
    private final List<or0> b;
    private final List<nq0> c;
    private final hn6 d;
    private final hn6 e;
    private final long f;
    private final gx2 g;
    private final hn6 h;
    private final hn6 i;
    private final cj6 j;
    private final hn6 k;
    private final int l;
    private final jk7 m;
    private final boolean n;
    private final boolean o;
    private final List<lq3> p;

    /* JADX WARN: Multi-variable type inference failed */
    public lja(int i, List<? extends or0> list, List<nq0> list2, hn6 hn6Var, hn6 hn6Var2, long j, gx2 gx2Var, hn6 hn6Var3, hn6 hn6Var4, cj6 cj6Var, hn6 hn6Var5, int i2, jk7 jk7Var, boolean z, boolean z2, List<lq3> list3) {
        z65.h(list, "productVOs");
        z65.h(list2, "sauces");
        z65.h(hn6Var, "rawPrice");
        z65.h(hn6Var2, "discount");
        z65.h(gx2Var, "deliveryFee");
        z65.h(hn6Var3, "total");
        z65.h(hn6Var4, "rawPriceWithoutGoods");
        z65.h(cj6Var, "minDeliveryPriceInfo");
        z65.h(hn6Var5, "saucesCost");
        z65.h(jk7Var, "orderType");
        z65.h(list3, "deliveryFeeLevels");
        this.a = i;
        this.b = list;
        this.c = list2;
        this.d = hn6Var;
        this.e = hn6Var2;
        this.f = j;
        this.g = gx2Var;
        this.h = hn6Var3;
        this.i = hn6Var4;
        this.j = cj6Var;
        this.k = hn6Var5;
        this.l = i2;
        this.m = jk7Var;
        this.n = z;
        this.o = z2;
        this.p = list3;
    }

    public final gx2 a() {
        return this.g;
    }

    public final List<lq3> b() {
        return this.p;
    }

    public final hn6 c() {
        return this.e;
    }

    public final long d() {
        return this.f;
    }

    public final cj6 e() {
        return this.j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lja)) {
            return false;
        }
        lja ljaVar = (lja) obj;
        if (this.a == ljaVar.a && z65.c(this.b, ljaVar.b) && z65.c(this.c, ljaVar.c) && z65.c(this.d, ljaVar.d) && z65.c(this.e, ljaVar.e) && this.f == ljaVar.f && z65.c(this.g, ljaVar.g) && z65.c(this.h, ljaVar.h) && z65.c(this.i, ljaVar.i) && z65.c(this.j, ljaVar.j) && z65.c(this.k, ljaVar.k) && this.l == ljaVar.l && this.m == ljaVar.m && this.n == ljaVar.n && this.o == ljaVar.o && z65.c(this.p, ljaVar.p)) {
            return true;
        }
        return false;
    }

    public final jk7 f() {
        return this.m;
    }

    public final List<or0> g() {
        return this.b;
    }

    public final hn6 h() {
        return this.d;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((this.a * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + ax1.a(this.f)) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31) + this.i.hashCode()) * 31) + this.j.hashCode()) * 31) + this.k.hashCode()) * 31) + this.l) * 31) + this.m.hashCode()) * 31) + a91.a(this.n)) * 31) + a91.a(this.o)) * 31) + this.p.hashCode();
    }

    public final hn6 i() {
        return this.i;
    }

    public final List<nq0> j() {
        return this.c;
    }

    public final hn6 k() {
        return this.k;
    }

    public final int l() {
        return this.l;
    }

    public final hn6 m() {
        return this.h;
    }

    public final int n() {
        return this.a;
    }

    public final boolean o() {
        return this.o;
    }

    public final boolean p() {
        return this.n;
    }

    public String toString() {
        int i = this.a;
        List<or0> list = this.b;
        List<nq0> list2 = this.c;
        hn6 hn6Var = this.d;
        hn6 hn6Var2 = this.e;
        long j = this.f;
        gx2 gx2Var = this.g;
        hn6 hn6Var3 = this.h;
        hn6 hn6Var4 = this.i;
        cj6 cj6Var = this.j;
        hn6 hn6Var5 = this.k;
        int i2 = this.l;
        jk7 jk7Var = this.m;
        boolean z = this.n;
        boolean z2 = this.o;
        List<lq3> list3 = this.p;
        return "ShoppingCartVO(totalCount=" + i + ", productVOs=" + list + ", sauces=" + list2 + ", rawPrice=" + hn6Var + ", discount=" + hn6Var2 + ", loyaltyRewardSum=" + j + ", deliveryFee=" + gx2Var + ", total=" + hn6Var3 + ", rawPriceWithoutGoods=" + hn6Var4 + ", minDeliveryPriceInfo=" + cj6Var + ", saucesCost=" + hn6Var5 + ", saucesCount=" + i2 + ", orderType=" + jk7Var + ", isReadyToCheckout=" + z + ", isEmpty=" + z2 + ", deliveryFeeLevels=" + list3 + ")";
    }
}
