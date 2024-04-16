package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
/* compiled from: Discount.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0012\u0012\u0006\u0010\u001b\u001a\u00020\u0017\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b \u0010!J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\n\u001a\u0004\b\u000e\u0010\fR\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\n\u001a\u0004\b\u0010\u0010\fR\u0017\u0010\u0016\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\t\u0010\u0015R\u0017\u0010\u001b\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0013\u0010\u001aR\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u001c8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001d\u001a\u0004\b\u0018\u0010\u001e¨\u0006\""}, d2 = {"Lv23;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "bonusActionId", "f", "title", c.a, "description", "Lhn6;", DateTokenConverter.CONVERTER_KEY, "Lhn6;", "()Lhn6;", "amount", "", e.a, "J", "()J", "loyaltyCoinsUsed", "Ln18;", "Ln18;", "()Ln18;", "personalPriceDiscount", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lhn6;JLn18;)V", "cart"}, k = 1, mv = {1, 9, 0})
/* renamed from: v23  reason: default package */
/* loaded from: classes.dex */
public final class v23 {
    private final String a;
    private final String b;
    private final String c;
    private final hn6 d;
    private final long e;
    private final n18 f;

    public v23(String str, String str2, String str3, hn6 hn6Var, long j, n18 n18Var) {
        z65.h(str, "bonusActionId");
        z65.h(str2, "title");
        z65.h(str3, "description");
        z65.h(hn6Var, "amount");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = hn6Var;
        this.e = j;
        this.f = n18Var;
    }

    public final hn6 a() {
        return this.d;
    }

    public final String b() {
        return this.a;
    }

    public final String c() {
        return this.c;
    }

    public final long d() {
        return this.e;
    }

    public final n18 e() {
        return this.f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v23)) {
            return false;
        }
        v23 v23Var = (v23) obj;
        if (z65.c(this.a, v23Var.a) && z65.c(this.b, v23Var.b) && z65.c(this.c, v23Var.c) && z65.c(this.d, v23Var.d) && this.e == v23Var.e && z65.c(this.f, v23Var.f)) {
            return true;
        }
        return false;
    }

    public final String f() {
        return this.b;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + ax1.a(this.e)) * 31;
        n18 n18Var = this.f;
        if (n18Var == null) {
            hashCode = 0;
        } else {
            hashCode = n18Var.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public String toString() {
        String str = this.a;
        String str2 = this.b;
        String str3 = this.c;
        hn6 hn6Var = this.d;
        long j = this.e;
        n18 n18Var = this.f;
        return "Discount(bonusActionId=" + str + ", title=" + str2 + ", description=" + str3 + ", amount=" + hn6Var + ", loyaltyCoinsUsed=" + j + ", personalPriceDiscount=" + n18Var + ")";
    }
}
