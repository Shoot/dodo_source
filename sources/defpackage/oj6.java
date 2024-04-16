package defpackage;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
/* compiled from: MindboxCredentials.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016J1\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001J\t\u0010\b\u001a\u00020\u0002HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000e\u001a\u0004\b\u0013\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u000e\u001a\u0004\b\u0014\u0010\u0010¨\u0006\u0017"}, d2 = {"Loj6;", "", "", "baseUrl", "endpointId", Action.KEY_ATTRIBUTE, "brand", "a", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", c.a, "()Ljava/lang/String;", "b", e.a, "f", DateTokenConverter.CONVERTER_KEY, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "mindbox_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: oj6  reason: default package */
/* loaded from: classes4.dex */
public final class oj6 {
    private final String a;
    private final String b;
    private final String c;
    private final String d;

    public oj6(String str, String str2, String str3, String str4) {
        z65.h(str, "baseUrl");
        z65.h(str2, "endpointId");
        z65.h(str3, Action.KEY_ATTRIBUTE);
        z65.h(str4, "brand");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public static /* synthetic */ oj6 b(oj6 oj6Var, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = oj6Var.a;
        }
        if ((i & 2) != 0) {
            str2 = oj6Var.b;
        }
        if ((i & 4) != 0) {
            str3 = oj6Var.c;
        }
        if ((i & 8) != 0) {
            str4 = oj6Var.d;
        }
        return oj6Var.a(str, str2, str3, str4);
    }

    public final oj6 a(String str, String str2, String str3, String str4) {
        z65.h(str, "baseUrl");
        z65.h(str2, "endpointId");
        z65.h(str3, Action.KEY_ATTRIBUTE);
        z65.h(str4, "brand");
        return new oj6(str, str2, str3, str4);
    }

    public final String c() {
        return this.a;
    }

    public final String d() {
        return this.d;
    }

    public final String e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oj6)) {
            return false;
        }
        oj6 oj6Var = (oj6) obj;
        if (z65.c(this.a, oj6Var.a) && z65.c(this.b, oj6Var.b) && z65.c(this.c, oj6Var.c) && z65.c(this.d, oj6Var.d)) {
            return true;
        }
        return false;
    }

    public final String f() {
        return this.c;
    }

    public int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        String str = this.a;
        String str2 = this.b;
        String str3 = this.c;
        String str4 = this.d;
        return "MindboxCredentials(baseUrl=" + str + ", endpointId=" + str2 + ", key=" + str3 + ", brand=" + str4 + ")";
    }
}
