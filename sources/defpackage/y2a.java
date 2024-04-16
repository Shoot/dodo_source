package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import im.threads.business.transport.MessageAttributes;
import java.util.List;
import kotlin.Metadata;
/* compiled from: SectionItemV5.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b$\u0010%JE\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0010\u001a\u00020\bHÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\"\u001a\u0004\b\u001b\u0010#¨\u0006&"}, d2 = {"Ly2a;", "", "Lx2a;", MessageAttributes.TYPE, "Lte6;", "menuItem", "Lo1b;", "subSection", "", "index", "", "Lv6;", "additionalData", "a", "", "toString", "hashCode", "other", "", "equals", "Lx2a;", "getType", "()Lx2a;", "b", "Lte6;", e.a, "()Lte6;", c.a, "Lo1b;", "getSubSection", "()Lo1b;", DateTokenConverter.CONVERTER_KEY, "I", "()I", "Ljava/util/List;", "()Ljava/util/List;", "<init>", "(Lx2a;Lte6;Lo1b;ILjava/util/List;)V", "common"}, k = 1, mv = {1, 9, 0})
/* renamed from: y2a  reason: default package */
/* loaded from: classes.dex */
public final class y2a {
    private final x2a a;
    private final te6 b;
    private final o1b c;
    private final int d;
    private final List<v6> e;

    public y2a(x2a x2aVar, te6 te6Var, o1b o1bVar, int i, List<v6> list) {
        z65.h(x2aVar, MessageAttributes.TYPE);
        z65.h(list, "additionalData");
        this.a = x2aVar;
        this.b = te6Var;
        this.c = o1bVar;
        this.d = i;
        this.e = list;
    }

    public static /* synthetic */ y2a b(y2a y2aVar, x2a x2aVar, te6 te6Var, o1b o1bVar, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            x2aVar = y2aVar.a;
        }
        if ((i2 & 2) != 0) {
            te6Var = y2aVar.b;
        }
        te6 te6Var2 = te6Var;
        if ((i2 & 4) != 0) {
            o1bVar = y2aVar.c;
        }
        o1b o1bVar2 = o1bVar;
        if ((i2 & 8) != 0) {
            i = y2aVar.d;
        }
        int i3 = i;
        List<v6> list2 = list;
        if ((i2 & 16) != 0) {
            list2 = y2aVar.e;
        }
        return y2aVar.a(x2aVar, te6Var2, o1bVar2, i3, list2);
    }

    public final y2a a(x2a x2aVar, te6 te6Var, o1b o1bVar, int i, List<v6> list) {
        z65.h(x2aVar, MessageAttributes.TYPE);
        z65.h(list, "additionalData");
        return new y2a(x2aVar, te6Var, o1bVar, i, list);
    }

    public final List<v6> c() {
        return this.e;
    }

    public final int d() {
        return this.d;
    }

    public final te6 e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y2a)) {
            return false;
        }
        y2a y2aVar = (y2a) obj;
        if (this.a == y2aVar.a && z65.c(this.b, y2aVar.b) && z65.c(this.c, y2aVar.c) && this.d == y2aVar.d && z65.c(this.e, y2aVar.e)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        te6 te6Var = this.b;
        int i = 0;
        if (te6Var == null) {
            hashCode = 0;
        } else {
            hashCode = te6Var.hashCode();
        }
        int i2 = (hashCode2 + hashCode) * 31;
        o1b o1bVar = this.c;
        if (o1bVar != null) {
            i = o1bVar.hashCode();
        }
        return ((((i2 + i) * 31) + this.d) * 31) + this.e.hashCode();
    }

    public String toString() {
        x2a x2aVar = this.a;
        te6 te6Var = this.b;
        o1b o1bVar = this.c;
        int i = this.d;
        List<v6> list = this.e;
        return "SectionItemV5(type=" + x2aVar + ", menuItem=" + te6Var + ", subSection=" + o1bVar + ", index=" + i + ", additionalData=" + list + ")";
    }
}
