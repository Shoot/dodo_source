package defpackage;

import com.huawei.hms.opendevice.c;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: ReceiptVO.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u0000 \r2\u00020\u0001:\u0001\u000bB'\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\t¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001f\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001f\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u0015"}, d2 = {"Ly89;", "", "", "toString", "", "hashCode", "other", "", "equals", "", "Lul8;", "a", "Ljava/util/Collection;", c.a, "()Ljava/util/Collection;", "removedIngredients", "Lejb;", "b", "addedToppings", "<init>", "(Ljava/util/Collection;Ljava/util/Collection;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: y89  reason: default package */
/* loaded from: classes4.dex */
public final class y89 {
    public static final a c = new a(null);
    private static final y89 d;
    private final Collection<ul8> a;
    private final Collection<ejb> b;

    /* compiled from: ReceiptVO.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Ly89$a;", "", "Ly89;", "EMPTY", "Ly89;", "a", "()Ly89;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: y89$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final y89 a() {
            return y89.d;
        }
    }

    static {
        List l;
        List l2;
        l = kc1.l();
        l2 = kc1.l();
        d = new y89(l, l2);
    }

    public y89(Collection<ul8> collection, Collection<ejb> collection2) {
        this.a = collection;
        this.b = collection2;
    }

    public final Collection<ejb> b() {
        return this.b;
    }

    public final Collection<ul8> c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y89)) {
            return false;
        }
        y89 y89Var = (y89) obj;
        if (z65.c(this.a, y89Var.a) && z65.c(this.b, y89Var.b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        Collection<ul8> collection = this.a;
        int i = 0;
        if (collection == null) {
            hashCode = 0;
        } else {
            hashCode = collection.hashCode();
        }
        int i2 = hashCode * 31;
        Collection<ejb> collection2 = this.b;
        if (collection2 != null) {
            i = collection2.hashCode();
        }
        return i2 + i;
    }

    public String toString() {
        Collection<ul8> collection = this.a;
        Collection<ejb> collection2 = this.b;
        return "ReceiptVO(removedIngredients=" + collection + ", addedToppings=" + collection2 + ")";
    }
}
