package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: OrderItemCustomization.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u0000 \r2\u00020\u0001:\u0001\u000bB1\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\t\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\t¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\t8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u0012\u0010\u000eR\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\t8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u0018"}, d2 = {"Lzf7;", "", "", "toString", "", "hashCode", "other", "", "equals", "", "Lcg7;", "a", "Ljava/util/List;", DateTokenConverter.CONVERTER_KEY, "()Ljava/util/List;", "removedIngredients", "Lbg7;", "b", c.a, "pizzaHalves", "Ldg7;", "addedToppings", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: zf7  reason: default package */
/* loaded from: classes4.dex */
public final class zf7 {
    public static final a d = new a(null);
    private static final zf7 e;
    private final List<cg7> a;
    private final List<bg7> b;
    private final List<dg7> c;

    /* compiled from: OrderItemCustomization.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lzf7$a;", "", "Lzf7;", "EMPTY", "Lzf7;", "a", "()Lzf7;", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: zf7$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final zf7 a() {
            return zf7.e;
        }
    }

    static {
        List l;
        List l2;
        List l3;
        l = kc1.l();
        l2 = kc1.l();
        l3 = kc1.l();
        e = new zf7(l, l2, l3);
    }

    public zf7(List<cg7> list, List<bg7> list2, List<dg7> list3) {
        z65.h(list, "removedIngredients");
        z65.h(list2, "pizzaHalves");
        z65.h(list3, "addedToppings");
        this.a = list;
        this.b = list2;
        this.c = list3;
    }

    public final List<dg7> b() {
        return this.c;
    }

    public final List<bg7> c() {
        return this.b;
    }

    public final List<cg7> d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zf7)) {
            return false;
        }
        zf7 zf7Var = (zf7) obj;
        if (z65.c(this.a, zf7Var.a) && z65.c(this.b, zf7Var.b) && z65.c(this.c, zf7Var.c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public String toString() {
        List<cg7> list = this.a;
        List<bg7> list2 = this.b;
        List<dg7> list3 = this.c;
        return "OrderItemCustomization(removedIngredients=" + list + ", pizzaHalves=" + list2 + ", addedToppings=" + list3 + ")";
    }
}
