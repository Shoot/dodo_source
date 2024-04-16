package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import java.util.List;
import kotlin.Metadata;
/* compiled from: SectionV5.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u001b\u0010\u001cJ7\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001J\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\t\u0010\f\u001a\u00020\bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a¨\u0006\u001d"}, d2 = {"Lz2a;", "", "", "code", "title", "", "Ly2a;", "items", "", "index", "a", "toString", "hashCode", "other", "", "equals", "Ljava/lang/String;", c.a, "()Ljava/lang/String;", "b", "f", "Ljava/util/List;", e.a, "()Ljava/util/List;", DateTokenConverter.CONVERTER_KEY, "I", "()I", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;I)V", "common"}, k = 1, mv = {1, 9, 0})
/* renamed from: z2a  reason: default package */
/* loaded from: classes.dex */
public final class z2a {
    private final String a;
    private final String b;
    private final List<y2a> c;
    private final int d;

    public z2a(String str, String str2, List<y2a> list, int i) {
        z65.h(str, "code");
        z65.h(str2, "title");
        z65.h(list, "items");
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ z2a b(z2a z2aVar, String str, String str2, List list, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = z2aVar.a;
        }
        if ((i2 & 2) != 0) {
            str2 = z2aVar.b;
        }
        if ((i2 & 4) != 0) {
            list = z2aVar.c;
        }
        if ((i2 & 8) != 0) {
            i = z2aVar.d;
        }
        return z2aVar.a(str, str2, list, i);
    }

    public final z2a a(String str, String str2, List<y2a> list, int i) {
        z65.h(str, "code");
        z65.h(str2, "title");
        z65.h(list, "items");
        return new z2a(str, str2, list, i);
    }

    public final String c() {
        return this.a;
    }

    public final int d() {
        return this.d;
    }

    public final List<y2a> e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z2a)) {
            return false;
        }
        z2a z2aVar = (z2a) obj;
        if (z65.c(this.a, z2aVar.a) && z65.c(this.b, z2aVar.b) && z65.c(this.c, z2aVar.c) && this.d == z2aVar.d) {
            return true;
        }
        return false;
    }

    public final String f() {
        return this.b;
    }

    public int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d;
    }

    public String toString() {
        String str = this.a;
        String str2 = this.b;
        List<y2a> list = this.c;
        int i = this.d;
        return "SectionV5(code=" + str + ", title=" + str2 + ", items=" + list + ", index=" + i + ")";
    }
}
