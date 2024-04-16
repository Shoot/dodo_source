package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import im.threads.business.transport.MessageAttributes;
import java.util.List;
import kotlin.Metadata;
/* compiled from: PackageInfo.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\nB'\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\u000f\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\u000f8\u0006¢\u0006\f\n\u0004\b\f\u0010\u0010\u001a\u0004\b\n\u0010\u0011R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u001a"}, d2 = {"Loo7;", "", "", "toString", "", "hashCode", "other", "", "equals", "Lxo7;", "a", "Lxo7;", "b", "()Lxo7;", MessageAttributes.TYPE, "", "Ljava/util/List;", "()Ljava/util/List;", "availableTypes", "Loo7$a;", c.a, "Loo7$a;", "()Loo7$a;", "widgetData", "<init>", "(Lxo7;Ljava/util/List;Loo7$a;)V", "common"}, k = 1, mv = {1, 9, 0})
/* renamed from: oo7  reason: default package */
/* loaded from: classes.dex */
public final class oo7 {
    private final xo7 a;
    private final List<xo7> b;
    private final a c;

    /* compiled from: PackageInfo.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\fR\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0011\u0010\fR\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\n\u001a\u0004\b\t\u0010\fR\u0017\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\n\u001a\u0004\b\u000e\u0010\f¨\u0006\u0017"}, d2 = {"Loo7$a;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", e.a, "()Ljava/lang/String;", "title", "b", c.a, "description", DateTokenConverter.CONVERTER_KEY, "switcherTitle", "actionTitle", "actionUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "common"}, k = 1, mv = {1, 9, 0})
    /* renamed from: oo7$a */
    /* loaded from: classes.dex */
    public static final class a {
        private final String a;
        private final String b;
        private final String c;
        private final String d;
        private final String e;

        public a(String str, String str2, String str3, String str4, String str5) {
            boolean y;
            boolean y2;
            boolean y3;
            boolean y4;
            boolean y5;
            z65.h(str, "title");
            z65.h(str2, "description");
            z65.h(str3, "switcherTitle");
            z65.h(str4, "actionTitle");
            z65.h(str5, "actionUrl");
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = str5;
            y = l0b.y(str);
            if (!y) {
                y2 = l0b.y(str2);
                if (!y2) {
                    y3 = l0b.y(str3);
                    if (!y3) {
                        y4 = l0b.y(str4);
                        if (!y4) {
                            y5 = l0b.y(str5);
                            if (!y5) {
                                return;
                            }
                            throw new IllegalArgumentException("Failed requirement.".toString());
                        }
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        public final String a() {
            return this.d;
        }

        public final String b() {
            return this.e;
        }

        public final String c() {
            return this.b;
        }

        public final String d() {
            return this.c;
        }

        public final String e() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (z65.c(this.a, aVar.a) && z65.c(this.b, aVar.b) && z65.c(this.c, aVar.c) && z65.c(this.d, aVar.d) && z65.c(this.e, aVar.e)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
        }

        public String toString() {
            String str = this.a;
            String str2 = this.b;
            String str3 = this.c;
            String str4 = this.d;
            String str5 = this.e;
            return "WidgetData(title=" + str + ", description=" + str2 + ", switcherTitle=" + str3 + ", actionTitle=" + str4 + ", actionUrl=" + str5 + ")";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public oo7(xo7 xo7Var, List<? extends xo7> list, a aVar) {
        z65.h(xo7Var, MessageAttributes.TYPE);
        z65.h(list, "availableTypes");
        this.a = xo7Var;
        this.b = list;
        this.c = aVar;
    }

    public final List<xo7> a() {
        return this.b;
    }

    public final xo7 b() {
        return this.a;
    }

    public final a c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oo7)) {
            return false;
        }
        oo7 oo7Var = (oo7) obj;
        if (this.a == oo7Var.a && z65.c(this.b, oo7Var.b) && z65.c(this.c, oo7Var.c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((this.a.hashCode() * 31) + this.b.hashCode()) * 31;
        a aVar = this.c;
        if (aVar == null) {
            hashCode = 0;
        } else {
            hashCode = aVar.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public String toString() {
        xo7 xo7Var = this.a;
        List<xo7> list = this.b;
        a aVar = this.c;
        return "PackageInfo(type=" + xo7Var + ", availableTypes=" + list + ", widgetData=" + aVar + ")";
    }
}
