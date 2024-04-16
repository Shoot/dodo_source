package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
/* compiled from: PizzaCardVO.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u001e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\u0014\u001a\u00020\n\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015\u0012\u0006\u0010 \u001a\u00020\u001c\u0012\u0006\u0010#\u001a\u00020\u0007\u0012\u0006\u0010'\u001a\u00020$¢\u0006\u0004\b(\u0010)J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0014\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u000b\u0010\u0018R\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0017\u001a\u0004\b\u001a\u0010\u0018R\u0017\u0010 \u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001fR\u0017\u0010#\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\r\u0010!\u001a\u0004\b\u0016\u0010\"R\u0017\u0010'\u001a\u00020$8\u0006¢\u0006\f\n\u0004\b\u001a\u0010%\u001a\u0004\b\u0010\u0010&¨\u0006*"}, d2 = {"Ly68;", "", "", "toString", "", "hashCode", "other", "", "equals", "", "Lx78;", "a", "Ljava/util/List;", "f", "()Ljava/util/List;", "pizzas", "b", "Lx78;", DateTokenConverter.CONVERTER_KEY, "()Lx78;", "initialVariation", "", c.a, "Ljava/util/Collection;", "()Ljava/util/Collection;", "addedToppingsIds", "g", "removedIngredientsIds", "Lb78;", e.a, "Lb78;", "()Lb78;", "pizzaConcept", "Z", "()Z", "hasDiscount", "", "J", "()J", "discountEndTime", "<init>", "(Ljava/util/List;Lx78;Ljava/util/Collection;Ljava/util/Collection;Lb78;ZJ)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: y68  reason: default package */
/* loaded from: classes2.dex */
public final class y68 {
    private final List<x78> a;
    private final x78 b;
    private final Collection<String> c;
    private final Collection<String> d;
    private final b78 e;
    private final boolean f;
    private final long g;

    public y68(List<x78> list, x78 x78Var, Collection<String> collection, Collection<String> collection2, b78 b78Var, boolean z, long j) {
        z65.h(list, "pizzas");
        z65.h(x78Var, "initialVariation");
        z65.h(collection, "addedToppingsIds");
        z65.h(collection2, "removedIngredientsIds");
        z65.h(b78Var, "pizzaConcept");
        this.a = list;
        this.b = x78Var;
        this.c = collection;
        this.d = collection2;
        this.e = b78Var;
        this.f = z;
        this.g = j;
    }

    public final Collection<String> a() {
        return this.c;
    }

    public final long b() {
        return this.g;
    }

    public final boolean c() {
        return this.f;
    }

    public final x78 d() {
        return this.b;
    }

    public final b78 e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y68)) {
            return false;
        }
        y68 y68Var = (y68) obj;
        if (z65.c(this.a, y68Var.a) && z65.c(this.b, y68Var.b) && z65.c(this.c, y68Var.c) && z65.c(this.d, y68Var.d) && this.e == y68Var.e && this.f == y68Var.f && this.g == y68Var.g) {
            return true;
        }
        return false;
    }

    public final List<x78> f() {
        return this.a;
    }

    public final Collection<String> g() {
        return this.d;
    }

    public int hashCode() {
        return (((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + a91.a(this.f)) * 31) + ax1.a(this.g);
    }

    public String toString() {
        List<x78> list = this.a;
        x78 x78Var = this.b;
        Collection<String> collection = this.c;
        Collection<String> collection2 = this.d;
        b78 b78Var = this.e;
        boolean z = this.f;
        long j = this.g;
        return "PizzaCardVO(pizzas=" + list + ", initialVariation=" + x78Var + ", addedToppingsIds=" + collection + ", removedIngredientsIds=" + collection2 + ", pizzaConcept=" + b78Var + ", hasDiscount=" + z + ", discountEndTime=" + j + ")";
    }
}
