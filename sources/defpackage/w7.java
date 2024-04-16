package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: AddressFieldsVO.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001J\t\u0010\b\u001a\u00020\u0002HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lw7;", "", "", "mainFieldTitle", "", "Ld7;", "detailsFields", "a", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "()Ljava/lang/String;", "b", "Ljava/util/List;", c.a, "()Ljava/util/List;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "geo_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: w7  reason: default package */
/* loaded from: classes2.dex */
public final class w7 {
    private final String a;
    private final List<d7> b;

    public w7() {
        this(null, null, 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ w7 b(w7 w7Var, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = w7Var.a;
        }
        if ((i & 2) != 0) {
            list = w7Var.b;
        }
        return w7Var.a(str, list);
    }

    public final w7 a(String str, List<d7> list) {
        z65.h(str, "mainFieldTitle");
        z65.h(list, "detailsFields");
        return new w7(str, list);
    }

    public final List<d7> c() {
        return this.b;
    }

    public final String d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w7)) {
            return false;
        }
        w7 w7Var = (w7) obj;
        if (z65.c(this.a, w7Var.a) && z65.c(this.b, w7Var.b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        String str = this.a;
        List<d7> list = this.b;
        return "AddressFieldsVO(mainFieldTitle=" + str + ", detailsFields=" + list + ")";
    }

    public w7(String str, List<d7> list) {
        z65.h(str, "mainFieldTitle");
        z65.h(list, "detailsFields");
        this.a = str;
        this.b = list;
    }

    public /* synthetic */ w7(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? kc1.l() : list);
    }
}
