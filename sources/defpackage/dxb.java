package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import java.util.List;
import kotlin.Metadata;
/* compiled from: VariationV5.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u0012\u001a\u00020\u0004\u0012\u0006\u0010\u0015\u001a\u00020\u0007\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017¢\u0006\u0004\b\u001e\u0010\u001fJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u0017\u0010\u0012\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0015\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006 "}, d2 = {"Ldxb;", "", "", "toString", "", "hashCode", "other", "", "equals", "Ltm8;", "a", "Ltm8;", "()Ltm8;", "product", "b", "I", "getIndex", "()I", "index", c.a, "Z", "isDefault", "()Z", "", "Lv6;", DateTokenConverter.CONVERTER_KEY, "Ljava/util/List;", "getAdditionalData", "()Ljava/util/List;", "additionalData", "<init>", "(Ltm8;IZLjava/util/List;)V", "common"}, k = 1, mv = {1, 9, 0})
/* renamed from: dxb  reason: default package */
/* loaded from: classes.dex */
public final class dxb {
    private final tm8 a;
    private final int b;
    private final boolean c;
    private final List<v6> d;

    public dxb(tm8 tm8Var, int i, boolean z, List<v6> list) {
        z65.h(tm8Var, "product");
        z65.h(list, "additionalData");
        this.a = tm8Var;
        this.b = i;
        this.c = z;
        this.d = list;
    }

    public final tm8 a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dxb)) {
            return false;
        }
        dxb dxbVar = (dxb) obj;
        if (z65.c(this.a, dxbVar.a) && this.b == dxbVar.b && this.c == dxbVar.c && z65.c(this.d, dxbVar.d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b) * 31) + a91.a(this.c)) * 31) + this.d.hashCode();
    }

    public String toString() {
        tm8 tm8Var = this.a;
        int i = this.b;
        boolean z = this.c;
        List<v6> list = this.d;
        return "VariationV5(product=" + tm8Var + ", index=" + i + ", isDefault=" + z + ", additionalData=" + list + ")";
    }
}
