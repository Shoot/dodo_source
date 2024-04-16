package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
/* compiled from: SimpleProductSlotVO.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0019\b\u0086\b\u0018\u00002\u00020\u0001BW\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0002\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b+\u0010,Jc\u0010\u0010\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00022\b\b\u0002\u0010\r\u001a\u00020\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÆ\u0001J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0012HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\t2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u0017\u001a\u0004\b\"\u0010\u0019R\u0017\u0010\r\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b&\u0010\u001dR$\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010'\u001a\u0004\b\u001e\u0010(\"\u0004\b)\u0010*¨\u0006-"}, d2 = {"Lqla;", "Lx89;", "", "Lfl8;", "products", "", "slotSelectedProductId", "", "productIdsStopList", "", "inStop", "Lhn6;", "extraPrice", "slotId", "Ly89;", "customReceipt", "b", "toString", "", "hashCode", "", "other", "equals", "Ljava/util/List;", Image.TYPE_HIGH, "()Ljava/util/List;", c.a, "Ljava/lang/String;", "j", "()Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "Ljava/util/Collection;", "g", "()Ljava/util/Collection;", e.a, "Z", "f", "()Z", "i", "Ly89;", "()Ly89;", "a", "(Ly89;)V", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/util/Collection;ZLjava/util/List;Ljava/lang/String;Ly89;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: qla  reason: default package */
/* loaded from: classes4.dex */
public final class qla extends x89 {
    private final List<fl8> b;
    private final String c;
    private final Collection<String> d;
    private final boolean e;
    private final List<hn6> f;
    private final String g;
    private y89 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public qla(List<? extends fl8> list, String str, Collection<String> collection, boolean z, List<hn6> list2, String str2, y89 y89Var) {
        super(y89Var);
        z65.h(list, "products");
        z65.h(str, "slotSelectedProductId");
        z65.h(collection, "productIdsStopList");
        z65.h(list2, "extraPrice");
        z65.h(str2, "slotId");
        this.b = list;
        this.c = str;
        this.d = collection;
        this.e = z;
        this.f = list2;
        this.g = str2;
        this.h = y89Var;
    }

    public static /* synthetic */ qla c(qla qlaVar, List list, String str, Collection collection, boolean z, List list2, String str2, y89 y89Var, int i, Object obj) {
        List<fl8> list3 = list;
        if ((i & 1) != 0) {
            list3 = qlaVar.b;
        }
        if ((i & 2) != 0) {
            str = qlaVar.c;
        }
        String str3 = str;
        Collection<String> collection2 = collection;
        if ((i & 4) != 0) {
            collection2 = qlaVar.d;
        }
        Collection collection3 = collection2;
        if ((i & 8) != 0) {
            z = qlaVar.e;
        }
        boolean z2 = z;
        List<hn6> list4 = list2;
        if ((i & 16) != 0) {
            list4 = qlaVar.f;
        }
        List list5 = list4;
        if ((i & 32) != 0) {
            str2 = qlaVar.g;
        }
        String str4 = str2;
        if ((i & 64) != 0) {
            y89Var = qlaVar.h;
        }
        return qlaVar.b(list3, str3, collection3, z2, list5, str4, y89Var);
    }

    @Override // defpackage.x89
    public void a(y89 y89Var) {
        this.h = y89Var;
    }

    public final qla b(List<? extends fl8> list, String str, Collection<String> collection, boolean z, List<hn6> list2, String str2, y89 y89Var) {
        z65.h(list, "products");
        z65.h(str, "slotSelectedProductId");
        z65.h(collection, "productIdsStopList");
        z65.h(list2, "extraPrice");
        z65.h(str2, "slotId");
        return new qla(list, str, collection, z, list2, str2, y89Var);
    }

    public y89 d() {
        return this.h;
    }

    public final List<hn6> e() {
        return this.f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qla)) {
            return false;
        }
        qla qlaVar = (qla) obj;
        if (z65.c(this.b, qlaVar.b) && z65.c(this.c, qlaVar.c) && z65.c(this.d, qlaVar.d) && this.e == qlaVar.e && z65.c(this.f, qlaVar.f) && z65.c(this.g, qlaVar.g) && z65.c(this.h, qlaVar.h)) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        return this.e;
    }

    public final Collection<String> g() {
        return this.d;
    }

    public final List<fl8> h() {
        return this.b;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((((((((((this.b.hashCode() * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + a91.a(this.e)) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31;
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
        List<fl8> list = this.b;
        String str = this.c;
        Collection<String> collection = this.d;
        boolean z = this.e;
        List<hn6> list2 = this.f;
        String str2 = this.g;
        y89 y89Var = this.h;
        return "SimpleProductSlotVO(products=" + list + ", slotSelectedProductId=" + str + ", productIdsStopList=" + collection + ", inStop=" + z + ", extraPrice=" + list2 + ", slotId=" + str2 + ", customReceipt=" + y89Var + ")";
    }
}
