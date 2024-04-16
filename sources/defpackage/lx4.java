package defpackage;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
/* compiled from: InAppConfig.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001BH\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00100\t\u0012\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\tø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00100\t8\u0006¢\u0006\f\n\u0004\b\r\u0010\f\u001a\u0004\b\u0011\u0010\u000eR&\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00138\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\u0011\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\t8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\f\u001a\u0004\b\u000b\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, d2 = {"Llx4;", "", "", "toString", "", "hashCode", "other", "", "equals", "", "Lfx4;", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "inApps", "Luw5;", c.a, "monitoring", "", "Lab7;", "Lfb7;", "Ljava/util/Map;", DateTokenConverter.CONVERTER_KEY, "()Ljava/util/Map;", "operations", "Lj;", "abtests", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/List;)V", "sdk_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: lx4  reason: default package */
/* loaded from: classes.dex */
public final class lx4 {
    private final List<fx4> a;
    private final List<uw5> b;
    private final Map<ab7, fb7> c;
    private final List<j> d;

    public lx4(List<fx4> list, List<uw5> list2, Map<ab7, fb7> map, List<j> list3) {
        z65.h(list, "inApps");
        z65.h(list2, "monitoring");
        z65.h(map, "operations");
        z65.h(list3, "abtests");
        this.a = list;
        this.b = list2;
        this.c = map;
        this.d = list3;
    }

    public final List<j> a() {
        return this.d;
    }

    public final List<fx4> b() {
        return this.a;
    }

    public final List<uw5> c() {
        return this.b;
    }

    public final Map<ab7, fb7> d() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lx4)) {
            return false;
        }
        lx4 lx4Var = (lx4) obj;
        if (z65.c(this.a, lx4Var.a) && z65.c(this.b, lx4Var.b) && z65.c(this.c, lx4Var.c) && z65.c(this.d, lx4Var.d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "InAppConfig(inApps=" + this.a + ", monitoring=" + this.b + ", operations=" + this.c + ", abtests=" + this.d + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
