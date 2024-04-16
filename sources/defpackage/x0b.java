package defpackage;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
/* compiled from: SubCategory.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0004\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u001a\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0007¢\u0006\u0004\b\u001f\u0010 J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\n\u001a\u0004\b\u000e\u0010\fR\u0017\u0010\u0013\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\n\u001a\u0004\b\t\u0010\fR\u0017\u0010\u001a\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001e\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0016\u0010\u001d¨\u0006!"}, d2 = {"Lx0b;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "id", c.a, Action.NAME_ATTRIBUTE, "I", DateTokenConverter.CONVERTER_KEY, "()I", "position", "analyticsName", "Ly33;", e.a, "Ly33;", "getDisplayType", "()Ly33;", "displayType", "f", "Z", "()Z", "showHeroProduct", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ly33;Z)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: x0b  reason: default package */
/* loaded from: classes4.dex */
public final class x0b {
    private final String a;
    private final String b;
    private final int c;
    private final String d;
    private final y33 e;
    private final boolean f;

    public x0b(String str, String str2, int i, String str3, y33 y33Var, boolean z) {
        z65.h(str, "id");
        z65.h(str2, Action.NAME_ATTRIBUTE);
        z65.h(str3, "analyticsName");
        z65.h(y33Var, "displayType");
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = str3;
        this.e = y33Var;
        this.f = z;
    }

    public final String a() {
        return this.d;
    }

    public final String b() {
        return this.a;
    }

    public final String c() {
        return this.b;
    }

    public final int d() {
        return this.c;
    }

    public final boolean e() {
        return this.f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x0b)) {
            return false;
        }
        x0b x0bVar = (x0b) obj;
        if (z65.c(this.a, x0bVar.a) && z65.c(this.b, x0bVar.b) && this.c == x0bVar.c && z65.c(this.d, x0bVar.d) && this.e == x0bVar.e && this.f == x0bVar.f) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + a91.a(this.f);
    }

    public String toString() {
        String str = this.a;
        String str2 = this.b;
        int i = this.c;
        String str3 = this.d;
        y33 y33Var = this.e;
        boolean z = this.f;
        return "SubCategory(id=" + str + ", name=" + str2 + ", position=" + i + ", analyticsName=" + str3 + ", displayType=" + y33Var + ", showHeroProduct=" + z + ")";
    }
}
