package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: SelectPizzeriaVOData.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u001f\u0010 J;\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Lo8a;", "", "Ld88;", "selectedPizzeria", "", "pizzerias", "Lc8a;", "defaultSelectMode", "Lov5;", "userLocation", "a", "", "toString", "", "hashCode", "other", "", "equals", "Ld88;", e.a, "()Ld88;", "b", "Ljava/util/Collection;", DateTokenConverter.CONVERTER_KEY, "()Ljava/util/Collection;", c.a, "Lc8a;", "()Lc8a;", "Lov5;", "f", "()Lov5;", "<init>", "(Ld88;Ljava/util/Collection;Lc8a;Lov5;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: o8a  reason: default package */
/* loaded from: classes4.dex */
public final class o8a {
    private final d88 a;
    private final Collection<d88> b;
    private final c8a c;
    private final ov5 d;

    public o8a(d88 d88Var, Collection<d88> collection, c8a c8aVar, ov5 ov5Var) {
        z65.h(collection, "pizzerias");
        z65.h(c8aVar, "defaultSelectMode");
        this.a = d88Var;
        this.b = collection;
        this.c = c8aVar;
        this.d = ov5Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ o8a b(o8a o8aVar, d88 d88Var, Collection collection, c8a c8aVar, ov5 ov5Var, int i, Object obj) {
        if ((i & 1) != 0) {
            d88Var = o8aVar.a;
        }
        if ((i & 2) != 0) {
            collection = o8aVar.b;
        }
        if ((i & 4) != 0) {
            c8aVar = o8aVar.c;
        }
        if ((i & 8) != 0) {
            ov5Var = o8aVar.d;
        }
        return o8aVar.a(d88Var, collection, c8aVar, ov5Var);
    }

    public final o8a a(d88 d88Var, Collection<d88> collection, c8a c8aVar, ov5 ov5Var) {
        z65.h(collection, "pizzerias");
        z65.h(c8aVar, "defaultSelectMode");
        return new o8a(d88Var, collection, c8aVar, ov5Var);
    }

    public final c8a c() {
        return this.c;
    }

    public final Collection<d88> d() {
        return this.b;
    }

    public final d88 e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o8a)) {
            return false;
        }
        o8a o8aVar = (o8a) obj;
        if (z65.c(this.a, o8aVar.a) && z65.c(this.b, o8aVar.b) && this.c == o8aVar.c && z65.c(this.d, o8aVar.d)) {
            return true;
        }
        return false;
    }

    public final ov5 f() {
        return this.d;
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
        int hashCode2 = ((((hashCode * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31;
        ov5 ov5Var = this.d;
        if (ov5Var != null) {
            i = ov5Var.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        d88 d88Var = this.a;
        Collection<d88> collection = this.b;
        c8a c8aVar = this.c;
        ov5 ov5Var = this.d;
        return "SelectPizzeriaVOData(selectedPizzeria=" + d88Var + ", pizzerias=" + collection + ", defaultSelectMode=" + c8aVar + ", userLocation=" + ov5Var + ")";
    }

    public /* synthetic */ o8a(d88 d88Var, Collection collection, c8a c8aVar, ov5 ov5Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(d88Var, collection, c8aVar, (i & 8) != 0 ? null : ov5Var);
    }
}
