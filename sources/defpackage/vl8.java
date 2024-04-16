package defpackage;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import java.io.Serializable;
import kotlin.Metadata;
/* compiled from: ProductIngredientVO.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\b\u0012\b\b\u0002\u0010\u0016\u001a\u00020\b¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\fR\u0017\u0010\u0014\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0017\u0010\u0016\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u000e\u0010\u0013¨\u0006\u0019"}, d2 = {"Lvl8;", "Ljava/io/Serializable;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "parentId", "b", "getName", Action.NAME_ATTRIBUTE, c.a, "Z", "()Z", "isRemoved", DateTokenConverter.CONVERTER_KEY, "isRemovable", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZZ)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: vl8  reason: default package */
/* loaded from: classes2.dex */
public final class vl8 implements Serializable {
    private final String a;
    private final String b;
    private final boolean c;
    private final boolean d;

    public vl8(String str, String str2, boolean z, boolean z2) {
        z65.h(str, "parentId");
        z65.h(str2, Action.NAME_ATTRIBUTE);
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = z2;
    }

    public final String a() {
        return this.a;
    }

    public final boolean b() {
        return this.d;
    }

    public final boolean c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vl8)) {
            return false;
        }
        vl8 vl8Var = (vl8) obj;
        if (z65.c(this.a, vl8Var.a) && z65.c(this.b, vl8Var.b) && this.c == vl8Var.c && this.d == vl8Var.d) {
            return true;
        }
        return false;
    }

    public final String getName() {
        return this.b;
    }

    public int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + a91.a(this.c)) * 31) + a91.a(this.d);
    }

    public String toString() {
        String str = this.a;
        String str2 = this.b;
        boolean z = this.c;
        boolean z2 = this.d;
        return "ProductIngredientVO(parentId=" + str + ", name=" + str2 + ", isRemoved=" + z + ", isRemovable=" + z2 + ")";
    }
}
