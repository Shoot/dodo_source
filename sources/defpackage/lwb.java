package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
/* compiled from: VariableCardVO.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u001e\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001BI\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\u0014\u001a\u00020\n\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015\u0012\u0006\u0010\u001e\u001a\u00020\u0007\u0012\u0006\u0010\"\u001a\u00020\u001f¢\u0006\u0004\b#\u0010$J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0014\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u000b\u0010\u0018R\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0017\u001a\u0004\b\u001a\u0010\u0018R\u0017\u0010\u001e\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u0016\u0010\u001dR\u0017\u0010\"\u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\b\r\u0010 \u001a\u0004\b\u0010\u0010!¨\u0006%"}, d2 = {"Llwb;", "", "", "toString", "", "hashCode", "other", "", "equals", "", "Laxb;", "a", "Ljava/util/List;", "f", "()Ljava/util/List;", "variables", "b", "Laxb;", DateTokenConverter.CONVERTER_KEY, "()Laxb;", "initialVariation", "", c.a, "Ljava/util/Collection;", "()Ljava/util/Collection;", "addedToppingsIds", e.a, "removedIngredientsIds", "Z", "()Z", "hasDiscount", "", "J", "()J", "discountEndTime", "<init>", "(Ljava/util/List;Laxb;Ljava/util/Collection;Ljava/util/Collection;ZJ)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: lwb  reason: default package */
/* loaded from: classes4.dex */
public final class lwb {
    private final List<axb> a;
    private final axb b;
    private final Collection<String> c;
    private final Collection<String> d;
    private final boolean e;
    private final long f;

    public lwb(List<axb> list, axb axbVar, Collection<String> collection, Collection<String> collection2, boolean z, long j) {
        z65.h(list, "variables");
        z65.h(axbVar, "initialVariation");
        z65.h(collection, "addedToppingsIds");
        z65.h(collection2, "removedIngredientsIds");
        this.a = list;
        this.b = axbVar;
        this.c = collection;
        this.d = collection2;
        this.e = z;
        this.f = j;
    }

    public final Collection<String> a() {
        return this.c;
    }

    public final long b() {
        return this.f;
    }

    public final boolean c() {
        return this.e;
    }

    public final axb d() {
        return this.b;
    }

    public final Collection<String> e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lwb)) {
            return false;
        }
        lwb lwbVar = (lwb) obj;
        if (z65.c(this.a, lwbVar.a) && z65.c(this.b, lwbVar.b) && z65.c(this.c, lwbVar.c) && z65.c(this.d, lwbVar.d) && this.e == lwbVar.e && this.f == lwbVar.f) {
            return true;
        }
        return false;
    }

    public final List<axb> f() {
        return this.a;
    }

    public int hashCode() {
        return (((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + a91.a(this.e)) * 31) + ax1.a(this.f);
    }

    public String toString() {
        List<axb> list = this.a;
        axb axbVar = this.b;
        Collection<String> collection = this.c;
        Collection<String> collection2 = this.d;
        boolean z = this.e;
        long j = this.f;
        return "VariableCardVO(variables=" + list + ", initialVariation=" + axbVar + ", addedToppingsIds=" + collection + ", removedIngredientsIds=" + collection2 + ", hasDiscount=" + z + ", discountEndTime=" + j + ")";
    }
}
