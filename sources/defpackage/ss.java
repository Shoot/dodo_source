package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import java.io.Serializable;
import kotlin.Metadata;
/* compiled from: AssistantEnvironment.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0013\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\u0006\u0010\u001d\u001a\u00020\u001a\u0012\u0006\u0010\"\u001a\u00020\b¢\u0006\u0004\b#\u0010$J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\n\u0010\rR\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u0017\u0010\u0017\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0011\u0010\u0016R\u0017\u0010\u0019\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u000b\u001a\u0004\b\u0018\u0010\rR\u0017\u0010\u001d\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\f\u0010\u001b\u001a\u0004\b\u0014\u0010\u001cR\u0017\u0010\"\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006%"}, d2 = {"Lss;", "Ljava/io/Serializable;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "userFirstName", "b", "menuItemId", c.a, "menuItemName", "Lhn6;", DateTokenConverter.CONVERTER_KEY, "Lhn6;", "()Lhn6;", "menuItemPrice", e.a, "stateId", "Lqd;", "Lqd;", "()Lqd;", "sender", "g", "Z", "i", "()Z", "isHeroProduct", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lhn6;Ljava/lang/String;Lqd;Z)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: ss  reason: default package */
/* loaded from: classes2.dex */
public final class ss implements Serializable {
    private final String a;
    private final String b;
    private final String c;
    private final hn6 d;
    private final String e;
    private final qd f;
    private final boolean g;

    public ss(String str, String str2, String str3, hn6 hn6Var, String str4, qd qdVar, boolean z) {
        z65.h(str2, "menuItemId");
        z65.h(str3, "menuItemName");
        z65.h(hn6Var, "menuItemPrice");
        z65.h(str4, "stateId");
        z65.h(qdVar, "sender");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = hn6Var;
        this.e = str4;
        this.f = qdVar;
        this.g = z;
    }

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.c;
    }

    public final hn6 c() {
        return this.d;
    }

    public final qd d() {
        return this.f;
    }

    public final String e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ss)) {
            return false;
        }
        ss ssVar = (ss) obj;
        if (z65.c(this.a, ssVar.a) && z65.c(this.b, ssVar.b) && z65.c(this.c, ssVar.c) && z65.c(this.d, ssVar.d) && z65.c(this.e, ssVar.e) && z65.c(this.f, ssVar.f) && this.g == ssVar.g) {
            return true;
        }
        return false;
    }

    public final String f() {
        return this.a;
    }

    public int hashCode() {
        int hashCode;
        String str = this.a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return (((((((((((hashCode * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + a91.a(this.g);
    }

    public final boolean i() {
        return this.g;
    }

    public String toString() {
        String str = this.a;
        String str2 = this.b;
        String str3 = this.c;
        hn6 hn6Var = this.d;
        String str4 = this.e;
        qd qdVar = this.f;
        boolean z = this.g;
        return "AssistantEnvironment(userFirstName=" + str + ", menuItemId=" + str2 + ", menuItemName=" + str3 + ", menuItemPrice=" + hn6Var + ", stateId=" + str4 + ", sender=" + qdVar + ", isHeroProduct=" + z + ")";
    }
}
