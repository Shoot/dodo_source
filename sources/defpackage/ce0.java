package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import java.io.Serializable;
import kotlin.Metadata;
/* compiled from: BonusAction.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ;\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0011\u001a\u0004\b\u0018\u0010\u0013R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u001a¨\u0006\u001d"}, d2 = {"Lce0;", "Ljava/io/Serializable;", "", "id", "title", "description", "imageUrl", "Lxp;", "applyAction", "a", "toString", "", "hashCode", "", "other", "", "equals", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "b", "f", c.a, DateTokenConverter.CONVERTER_KEY, e.a, "Lxp;", "()Lxp;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lxp;)V", "common"}, k = 1, mv = {1, 9, 0})
/* renamed from: ce0  reason: default package */
/* loaded from: classes.dex */
public final class ce0 implements Serializable {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final xp e;

    public ce0(String str, String str2, String str3, String str4, xp xpVar) {
        z65.h(str, "id");
        z65.h(str2, "title");
        z65.h(str3, "description");
        z65.h(str4, "imageUrl");
        z65.h(xpVar, "applyAction");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = xpVar;
    }

    public static /* synthetic */ ce0 b(ce0 ce0Var, String str, String str2, String str3, String str4, xp xpVar, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ce0Var.a;
        }
        if ((i & 2) != 0) {
            str2 = ce0Var.b;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = ce0Var.c;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = ce0Var.d;
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            xpVar = ce0Var.e;
        }
        return ce0Var.a(str, str5, str6, str7, xpVar);
    }

    public final ce0 a(String str, String str2, String str3, String str4, xp xpVar) {
        z65.h(str, "id");
        z65.h(str2, "title");
        z65.h(str3, "description");
        z65.h(str4, "imageUrl");
        z65.h(xpVar, "applyAction");
        return new ce0(str, str2, str3, str4, xpVar);
    }

    public final xp c() {
        return this.e;
    }

    public final String d() {
        return this.c;
    }

    public final String e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ce0)) {
            return false;
        }
        ce0 ce0Var = (ce0) obj;
        if (z65.c(this.a, ce0Var.a) && z65.c(this.b, ce0Var.b) && z65.c(this.c, ce0Var.c) && z65.c(this.d, ce0Var.d) && z65.c(this.e, ce0Var.e)) {
            return true;
        }
        return false;
    }

    public final String f() {
        return this.b;
    }

    public final String getId() {
        return this.a;
    }

    public int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    public String toString() {
        String str = this.a;
        String str2 = this.b;
        String str3 = this.c;
        String str4 = this.d;
        xp xpVar = this.e;
        return "BonusAction(id=" + str + ", title=" + str2 + ", description=" + str3 + ", imageUrl=" + str4 + ", applyAction=" + xpVar + ")";
    }
}
