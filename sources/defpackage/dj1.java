package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
/* compiled from: ComboTemplateSlotProduct.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u001f\u0010 J;\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\bHÆ\u0001J\t\u0010\f\u001a\u00020\u0002HÖ\u0001J\t\u0010\r\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001c\u001a\u0004\b\u0018\u0010\u001e¨\u0006!"}, d2 = {"Ldj1;", "", "", "id", "", "priority", "Lfl8;", "product", "Lhn6;", "price", "extraPrice", "a", "toString", "hashCode", "other", "", "equals", "Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "()Ljava/lang/String;", "b", "I", "f", "()I", c.a, "Lfl8;", "g", "()Lfl8;", "Lhn6;", e.a, "()Lhn6;", "<init>", "(Ljava/lang/String;ILfl8;Lhn6;Lhn6;)V", "common"}, k = 1, mv = {1, 9, 0})
/* renamed from: dj1  reason: default package */
/* loaded from: classes.dex */
public final class dj1 {
    private final String a;
    private final int b;
    private final fl8 c;
    private final hn6 d;
    private final hn6 e;

    public dj1(String str, int i, fl8 fl8Var, hn6 hn6Var, hn6 hn6Var2) {
        z65.h(str, "id");
        z65.h(fl8Var, "product");
        z65.h(hn6Var, "price");
        z65.h(hn6Var2, "extraPrice");
        this.a = str;
        this.b = i;
        this.c = fl8Var;
        this.d = hn6Var;
        this.e = hn6Var2;
    }

    public static /* synthetic */ dj1 b(dj1 dj1Var, String str, int i, fl8 fl8Var, hn6 hn6Var, hn6 hn6Var2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = dj1Var.a;
        }
        if ((i2 & 2) != 0) {
            i = dj1Var.b;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            fl8Var = dj1Var.c;
        }
        fl8 fl8Var2 = fl8Var;
        if ((i2 & 8) != 0) {
            hn6Var = dj1Var.d;
        }
        hn6 hn6Var3 = hn6Var;
        if ((i2 & 16) != 0) {
            hn6Var2 = dj1Var.e;
        }
        return dj1Var.a(str, i3, fl8Var2, hn6Var3, hn6Var2);
    }

    public final dj1 a(String str, int i, fl8 fl8Var, hn6 hn6Var, hn6 hn6Var2) {
        z65.h(str, "id");
        z65.h(fl8Var, "product");
        z65.h(hn6Var, "price");
        z65.h(hn6Var2, "extraPrice");
        return new dj1(str, i, fl8Var, hn6Var, hn6Var2);
    }

    public final hn6 c() {
        return this.e;
    }

    public final String d() {
        return this.a;
    }

    public final hn6 e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dj1)) {
            return false;
        }
        dj1 dj1Var = (dj1) obj;
        if (z65.c(this.a, dj1Var.a) && this.b == dj1Var.b && z65.c(this.c, dj1Var.c) && z65.c(this.d, dj1Var.d) && z65.c(this.e, dj1Var.e)) {
            return true;
        }
        return false;
    }

    public final int f() {
        return this.b;
    }

    public final fl8 g() {
        return this.c;
    }

    public int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.b) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    public String toString() {
        String str = this.a;
        int i = this.b;
        fl8 fl8Var = this.c;
        hn6 hn6Var = this.d;
        hn6 hn6Var2 = this.e;
        return "ComboTemplateSlotProduct(id=" + str + ", priority=" + i + ", product=" + fl8Var + ", price=" + hn6Var + ", extraPrice=" + hn6Var2 + ")";
    }
}
