package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import java.util.List;
import kotlin.Metadata;
/* compiled from: SubsectionV5.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u0011¢\u0006\u0004\b\u001c\u0010\u001dJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\fR\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u00118\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016¨\u0006\u001e"}, d2 = {"Lo1b;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getCode", "()Ljava/lang/String;", "code", "b", "getTitle", "title", "", "Ly2a;", c.a, "Ljava/util/List;", "getItems", "()Ljava/util/List;", "items", "Lv6;", DateTokenConverter.CONVERTER_KEY, "getAdditionalData", "additionalData", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "common"}, k = 1, mv = {1, 9, 0})
/* renamed from: o1b  reason: default package */
/* loaded from: classes.dex */
public final class o1b {
    private final String a;
    private final String b;
    private final List<y2a> c;
    private final List<v6> d;

    public o1b(String str, String str2, List<y2a> list, List<v6> list2) {
        z65.h(str, "code");
        z65.h(str2, "title");
        z65.h(list, "items");
        z65.h(list2, "additionalData");
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = list2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o1b)) {
            return false;
        }
        o1b o1bVar = (o1b) obj;
        if (z65.c(this.a, o1bVar.a) && z65.c(this.b, o1bVar.b) && z65.c(this.c, o1bVar.c) && z65.c(this.d, o1bVar.d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        String str = this.a;
        String str2 = this.b;
        List<y2a> list = this.c;
        List<v6> list2 = this.d;
        return "SubsectionV5(code=" + str + ", title=" + str2 + ", items=" + list + ", additionalData=" + list2 + ")";
    }
}
