package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.activeorder.feature.orderdetails.presentation.a;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import im.threads.business.transport.MessageAttributes;
import java.util.List;
import kotlin.Metadata;
/* compiled from: OrderDetailsVO.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0083\u0001\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u0013\u001a\u00020\u000e\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\u0006\u0010\u001c\u001a\u00020\u0007\u0012\u0006\u0010!\u001a\u00020\u001d\u0012\u0006\u0010'\u001a\u00020\"\u0012\u0006\u0010(\u001a\u00020\"\u0012\f\u0010.\u001a\b\u0012\u0004\u0012\u00020*0)\u0012\f\u00101\u001a\b\u0012\u0004\u0012\u00020/0)\u0012\u0006\u00103\u001a\u00020\u0004\u0012\u0006\u00105\u001a\u00020\u0004\u0012\u0006\u00106\u001a\u00020\u000e\u0012\u0006\u00107\u001a\u00020\u0007\u0012\u0006\u0010;\u001a\u000208¢\u0006\u0004\b<\u0010=J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0017\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\t\u0010\u0016R\u0017\u0010\u001c\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010!\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010'\u001a\u00020\"8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010(\u001a\u00020\"8\u0006¢\u0006\f\n\u0004\b%\u0010$\u001a\u0004\b#\u0010&R\u001d\u0010.\u001a\b\u0012\u0004\u0012\u00020*0)8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b\u0018\u0010-R\u001d\u00101\u001a\b\u0012\u0004\u0012\u00020/0)8\u0006¢\u0006\f\n\u0004\b0\u0010,\u001a\u0004\b+\u0010-R\u0017\u00103\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b2\u0010\n\u001a\u0004\b2\u0010\fR\u0017\u00105\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b4\u0010\n\u001a\u0004\b\u0014\u0010\fR\u0017\u00106\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0010\u001a\u0004\b0\u0010\u0012R\u0017\u00107\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0019\u001a\u0004\b4\u0010\u001bR\u0017\u0010;\u001a\u0002088\u0006¢\u0006\f\n\u0004\b\u001a\u00109\u001a\u0004\b\u000f\u0010:¨\u0006>"}, d2 = {"Lld7;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "I", e.a, "()I", "number", "Lhn6;", "b", "Lhn6;", "l", "()Lhn6;", "totalPrice", c.a, "Ljava/lang/String;", "()Ljava/lang/String;", "address", DateTokenConverter.CONVERTER_KEY, "Z", "n", "()Z", "isDeferredOrder", "Ljk7;", "Ljk7;", Image.TYPE_MEDIUM, "()Ljk7;", MessageAttributes.TYPE, "", "f", "J", "g", "()J", "orderStartDeliveryTimeLocal", "orderEndTimeLocal", "", "Lhd7;", Image.TYPE_HIGH, "Ljava/util/List;", "()Ljava/util/List;", "items", "Ljd7;", "i", "sauces", "j", "saucesCount", "k", "freeSaucesCount", "saucesCost", "showExactDeliveryTime", "Lcom/dodopizza/activeorder/feature/orderdetails/presentation/a;", "Lcom/dodopizza/activeorder/feature/orderdetails/presentation/a;", "()Lcom/dodopizza/activeorder/feature/orderdetails/presentation/a;", "deliveryFee", "<init>", "(ILhn6;Ljava/lang/String;ZLjk7;JJLjava/util/List;Ljava/util/List;IILhn6;ZLcom/dodopizza/activeorder/feature/orderdetails/presentation/a;)V", "activeorder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: ld7  reason: default package */
/* loaded from: classes.dex */
public final class ld7 {
    private final int a;
    private final hn6 b;
    private final String c;
    private final boolean d;
    private final jk7 e;
    private final long f;
    private final long g;
    private final List<hd7> h;
    private final List<jd7> i;
    private final int j;
    private final int k;
    private final hn6 l;
    private final boolean m;
    private final a n;

    public ld7(int i, hn6 hn6Var, String str, boolean z, jk7 jk7Var, long j, long j2, List<hd7> list, List<jd7> list2, int i2, int i3, hn6 hn6Var2, boolean z2, a aVar) {
        z65.h(hn6Var, "totalPrice");
        z65.h(str, "address");
        z65.h(jk7Var, MessageAttributes.TYPE);
        z65.h(list, "items");
        z65.h(list2, "sauces");
        z65.h(hn6Var2, "saucesCost");
        z65.h(aVar, "deliveryFee");
        this.a = i;
        this.b = hn6Var;
        this.c = str;
        this.d = z;
        this.e = jk7Var;
        this.f = j;
        this.g = j2;
        this.h = list;
        this.i = list2;
        this.j = i2;
        this.k = i3;
        this.l = hn6Var2;
        this.m = z2;
        this.n = aVar;
    }

    public final String a() {
        return this.c;
    }

    public final a b() {
        return this.n;
    }

    public final int c() {
        return this.k;
    }

    public final List<hd7> d() {
        return this.h;
    }

    public final int e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ld7)) {
            return false;
        }
        ld7 ld7Var = (ld7) obj;
        if (this.a == ld7Var.a && z65.c(this.b, ld7Var.b) && z65.c(this.c, ld7Var.c) && this.d == ld7Var.d && this.e == ld7Var.e && this.f == ld7Var.f && this.g == ld7Var.g && z65.c(this.h, ld7Var.h) && z65.c(this.i, ld7Var.i) && this.j == ld7Var.j && this.k == ld7Var.k && z65.c(this.l, ld7Var.l) && this.m == ld7Var.m && z65.c(this.n, ld7Var.n)) {
            return true;
        }
        return false;
    }

    public final long f() {
        return this.g;
    }

    public final long g() {
        return this.f;
    }

    public final List<jd7> h() {
        return this.i;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((this.a * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + a91.a(this.d)) * 31) + this.e.hashCode()) * 31) + ax1.a(this.f)) * 31) + ax1.a(this.g)) * 31) + this.h.hashCode()) * 31) + this.i.hashCode()) * 31) + this.j) * 31) + this.k) * 31) + this.l.hashCode()) * 31) + a91.a(this.m)) * 31) + this.n.hashCode();
    }

    public final hn6 i() {
        return this.l;
    }

    public final int j() {
        return this.j;
    }

    public final boolean k() {
        return this.m;
    }

    public final hn6 l() {
        return this.b;
    }

    public final jk7 m() {
        return this.e;
    }

    public final boolean n() {
        return this.d;
    }

    public String toString() {
        int i = this.a;
        hn6 hn6Var = this.b;
        String str = this.c;
        boolean z = this.d;
        jk7 jk7Var = this.e;
        long j = this.f;
        long j2 = this.g;
        List<hd7> list = this.h;
        List<jd7> list2 = this.i;
        int i2 = this.j;
        int i3 = this.k;
        hn6 hn6Var2 = this.l;
        boolean z2 = this.m;
        a aVar = this.n;
        return "OrderDetailsVO(number=" + i + ", totalPrice=" + hn6Var + ", address=" + str + ", isDeferredOrder=" + z + ", type=" + jk7Var + ", orderStartDeliveryTimeLocal=" + j + ", orderEndTimeLocal=" + j2 + ", items=" + list + ", sauces=" + list2 + ", saucesCount=" + i2 + ", freeSaucesCount=" + i3 + ", saucesCost=" + hn6Var2 + ", showExactDeliveryTime=" + z2 + ", deliveryFee=" + aVar + ")";
    }
}
