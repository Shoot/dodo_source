package defpackage;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import java.util.List;
import kotlin.Metadata;
/* compiled from: MenuCategory.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0004\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0007\u0012\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e¢\u0006\u0004\b$\u0010%J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\fR\u0017\u0010\u0014\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\t\u0010\fR\u0017\u0010\u0019\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0017\u001a\u0004\b\u000e\u0010\u0018R\u0017\u0010\u001d\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\"¨\u0006&"}, d2 = {"Ldd6;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", c.a, "()Ljava/lang/String;", "id", "b", DateTokenConverter.CONVERTER_KEY, Action.NAME_ATTRIBUTE, "I", e.a, "()I", "position", "analyticsName", "Ly33;", "Ly33;", "()Ly33;", "displayType", "f", "Z", "()Z", "showHeroProduct", "", "Lx0b;", "g", "Ljava/util/List;", "()Ljava/util/List;", "subCategories", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ly33;ZLjava/util/List;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: dd6  reason: default package */
/* loaded from: classes4.dex */
public final class dd6 {
    private final String a;
    private final String b;
    private final int c;
    private final String d;
    private final y33 e;
    private final boolean f;
    private final List<x0b> g;

    public dd6(String str, String str2, int i, String str3, y33 y33Var, boolean z, List<x0b> list) {
        z65.h(str, "id");
        z65.h(str2, Action.NAME_ATTRIBUTE);
        z65.h(str3, "analyticsName");
        z65.h(y33Var, "displayType");
        z65.h(list, "subCategories");
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = str3;
        this.e = y33Var;
        this.f = z;
        this.g = list;
    }

    public final String a() {
        return this.d;
    }

    public final y33 b() {
        return this.e;
    }

    public final String c() {
        return this.a;
    }

    public final String d() {
        return this.b;
    }

    public final int e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dd6)) {
            return false;
        }
        dd6 dd6Var = (dd6) obj;
        if (z65.c(this.a, dd6Var.a) && z65.c(this.b, dd6Var.b) && this.c == dd6Var.c && z65.c(this.d, dd6Var.d) && this.e == dd6Var.e && this.f == dd6Var.f && z65.c(this.g, dd6Var.g)) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        return this.f;
    }

    public final List<x0b> g() {
        return this.g;
    }

    public int hashCode() {
        return (((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + a91.a(this.f)) * 31) + this.g.hashCode();
    }

    public String toString() {
        String str = this.a;
        String str2 = this.b;
        int i = this.c;
        String str3 = this.d;
        y33 y33Var = this.e;
        boolean z = this.f;
        List<x0b> list = this.g;
        return "MenuCategory(id=" + str + ", name=" + str2 + ", position=" + i + ", analyticsName=" + str3 + ", displayType=" + y33Var + ", showHeroProduct=" + z + ", subCategories=" + list + ")";
    }
}
