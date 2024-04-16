package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: SelectionMapPizzeriaVOData.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u001a\u0010\u001bJ1\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Ljaa;", "", "Ld88;", "selectedPizzeria", "", "pizzerias", "Lov5;", "userLocation", "a", "", "toString", "", "hashCode", "other", "", "equals", "Ld88;", DateTokenConverter.CONVERTER_KEY, "()Ld88;", "b", "Ljava/util/Collection;", c.a, "()Ljava/util/Collection;", "Lov5;", e.a, "()Lov5;", "<init>", "(Ld88;Ljava/util/Collection;Lov5;)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: jaa  reason: default package */
/* loaded from: classes2.dex */
public final class jaa {
    private final d88 a;
    private final Collection<d88> b;
    private final ov5 c;

    public jaa(d88 d88Var, Collection<d88> collection, ov5 ov5Var) {
        z65.h(collection, "pizzerias");
        this.a = d88Var;
        this.b = collection;
        this.c = ov5Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ jaa b(jaa jaaVar, d88 d88Var, Collection collection, ov5 ov5Var, int i, Object obj) {
        if ((i & 1) != 0) {
            d88Var = jaaVar.a;
        }
        if ((i & 2) != 0) {
            collection = jaaVar.b;
        }
        if ((i & 4) != 0) {
            ov5Var = jaaVar.c;
        }
        return jaaVar.a(d88Var, collection, ov5Var);
    }

    public final jaa a(d88 d88Var, Collection<d88> collection, ov5 ov5Var) {
        z65.h(collection, "pizzerias");
        return new jaa(d88Var, collection, ov5Var);
    }

    public final Collection<d88> c() {
        return this.b;
    }

    public final d88 d() {
        return this.a;
    }

    public final ov5 e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jaa)) {
            return false;
        }
        jaa jaaVar = (jaa) obj;
        if (z65.c(this.a, jaaVar.a) && z65.c(this.b, jaaVar.b) && z65.c(this.c, jaaVar.c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        d88 d88Var = this.a;
        int i = 0;
        if (d88Var == null) {
            hashCode = 0;
        } else {
            hashCode = d88Var.hashCode();
        }
        int hashCode2 = ((hashCode * 31) + this.b.hashCode()) * 31;
        ov5 ov5Var = this.c;
        if (ov5Var != null) {
            i = ov5Var.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        d88 d88Var = this.a;
        Collection<d88> collection = this.b;
        ov5 ov5Var = this.c;
        return "SelectionMapPizzeriaVOData(selectedPizzeria=" + d88Var + ", pizzerias=" + collection + ", userLocation=" + ov5Var + ")";
    }

    public /* synthetic */ jaa(d88 d88Var, Collection collection, ov5 ov5Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(d88Var, collection, (i & 4) != 0 ? null : ov5Var);
    }
}
