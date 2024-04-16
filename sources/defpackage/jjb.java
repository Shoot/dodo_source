package defpackage;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
/* compiled from: ToppingVO.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0012\u0012\u0006\u0010\u0019\u001a\u00020\u0007\u0012\u0006\u0010\u001d\u001a\u00020\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000e\u0010\fR\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\n\u001a\u0004\b\u0010\u0010\fR\u0017\u0010\u0016\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0019\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0017\u001a\u0004\b\t\u0010\u0018R\"\u0010\u001d\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001a\u0010\u0018\"\u0004\b\u001b\u0010\u001c¨\u0006 "}, d2 = {"Ljjb;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "()Ljava/lang/String;", "parentId", "b", "imageUrl", c.a, Action.NAME_ATTRIBUTE, "Lhn6;", "Lhn6;", e.a, "()Lhn6;", "price", "Z", "()Z", "canAddToVariation", "f", "g", "(Z)V", "isAdded", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lhn6;ZZ)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: jjb  reason: default package */
/* loaded from: classes4.dex */
public final class jjb {
    private final String a;
    private final String b;
    private final String c;
    private final hn6 d;
    private final boolean e;
    private boolean f;

    public jjb(String str, String str2, String str3, hn6 hn6Var, boolean z, boolean z2) {
        z65.h(str, "parentId");
        z65.h(str2, "imageUrl");
        z65.h(str3, Action.NAME_ATTRIBUTE);
        z65.h(hn6Var, "price");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = hn6Var;
        this.e = z;
        this.f = z2;
    }

    public final boolean a() {
        return this.e;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public final String d() {
        return this.a;
    }

    public final hn6 e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jjb)) {
            return false;
        }
        jjb jjbVar = (jjb) obj;
        if (z65.c(this.a, jjbVar.a) && z65.c(this.b, jjbVar.b) && z65.c(this.c, jjbVar.c) && z65.c(this.d, jjbVar.d) && this.e == jjbVar.e && this.f == jjbVar.f) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        return this.f;
    }

    public final void g(boolean z) {
        this.f = z;
    }

    public int hashCode() {
        return (((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + a91.a(this.e)) * 31) + a91.a(this.f);
    }

    public String toString() {
        String str = this.a;
        String str2 = this.b;
        String str3 = this.c;
        hn6 hn6Var = this.d;
        boolean z = this.e;
        boolean z2 = this.f;
        return "ToppingVO(parentId=" + str + ", imageUrl=" + str2 + ", name=" + str3 + ", price=" + hn6Var + ", canAddToVariation=" + z + ", isAdded=" + z2 + ")";
    }
}
