package defpackage;

import com.huawei.hms.opendevice.c;
import java.util.Collection;
import kotlin.Metadata;
/* compiled from: PromotionProductsVO.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\u0012\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u0017\u0010\u0012\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R\u0017\u0010\u0017\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Lnq8;", "", "", "toString", "", "hashCode", "other", "", "equals", "", "Lmq8;", "a", "Ljava/util/Collection;", "()Ljava/util/Collection;", "products", "b", "Z", "()Z", "isRestaurant", c.a, "I", "getPersonalDiscountCount", "()I", "personalDiscountCount", "<init>", "(Ljava/util/Collection;ZI)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: nq8  reason: default package */
/* loaded from: classes2.dex */
public final class nq8 {
    private final Collection<mq8> a;
    private final boolean b;
    private final int c;

    /* JADX WARN: Multi-variable type inference failed */
    public nq8(Collection<? extends mq8> collection, boolean z, int i) {
        z65.h(collection, "products");
        this.a = collection;
        this.b = z;
        this.c = i;
    }

    public final Collection<mq8> a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nq8)) {
            return false;
        }
        nq8 nq8Var = (nq8) obj;
        if (z65.c(this.a, nq8Var.a) && this.b == nq8Var.b && this.c == nq8Var.c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + a91.a(this.b)) * 31) + this.c;
    }

    public String toString() {
        Collection<mq8> collection = this.a;
        boolean z = this.b;
        int i = this.c;
        return "PromotionProductsVO(products=" + collection + ", isRestaurant=" + z + ", personalDiscountCount=" + i + ")";
    }
}
