package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
/* compiled from: OrderGameParams.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0007\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0013\u0012\u0006\u0010\u001c\u001a\u00020\u0018\u0012\u0006\u0010 \u001a\u00020\u001d\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010%\u001a\u00020\u0002¢\u0006\u0004\b&\u0010'J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0012\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u000e\u0010\u0016R\u0017\u0010\u001c\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010 \u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001e\u001a\u0004\b\t\u0010\u001fR\u0019\u0010$\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010#R\u0017\u0010%\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\n\u001a\u0004\b\u0014\u0010\f¨\u0006("}, d2 = {"Lwd7;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "()Ljava/lang/String;", "gameUrl", "b", "Z", "g", "()Z", "isGameAvailable", "Lh81;", c.a, "Lh81;", "()Lh81;", "claimedReward", "Lyd7;", "Lyd7;", e.a, "()Lyd7;", "rules", "Lssa;", "Lssa;", "()Lssa;", "animations", "f", "Ljava/lang/Object;", "()Ljava/lang/Object;", "settings", "gameSessionUuid", "<init>", "(Ljava/lang/String;ZLh81;Lyd7;Lssa;Ljava/lang/Object;Ljava/lang/String;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: wd7  reason: default package */
/* loaded from: classes4.dex */
public final class wd7 {
    private final String a;
    private final boolean b;
    private final h81 c;
    private final yd7 d;
    private final ssa e;
    private final Object f;
    private final String g;

    public wd7(String str, boolean z, h81 h81Var, yd7 yd7Var, ssa ssaVar, Object obj, String str2) {
        z65.h(str, "gameUrl");
        z65.h(yd7Var, "rules");
        z65.h(ssaVar, "animations");
        z65.h(str2, "gameSessionUuid");
        this.a = str;
        this.b = z;
        this.c = h81Var;
        this.d = yd7Var;
        this.e = ssaVar;
        this.f = obj;
        this.g = str2;
    }

    public final ssa a() {
        return this.e;
    }

    public final h81 b() {
        return this.c;
    }

    public final String c() {
        return this.g;
    }

    public final String d() {
        return this.a;
    }

    public final yd7 e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wd7)) {
            return false;
        }
        wd7 wd7Var = (wd7) obj;
        if (z65.c(this.a, wd7Var.a) && this.b == wd7Var.b && z65.c(this.c, wd7Var.c) && z65.c(this.d, wd7Var.d) && z65.c(this.e, wd7Var.e) && z65.c(this.f, wd7Var.f) && z65.c(this.g, wd7Var.g)) {
            return true;
        }
        return false;
    }

    public final Object f() {
        return this.f;
    }

    public final boolean g() {
        return this.b;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((this.a.hashCode() * 31) + a91.a(this.b)) * 31;
        h81 h81Var = this.c;
        int i = 0;
        if (h81Var == null) {
            hashCode = 0;
        } else {
            hashCode = h81Var.hashCode();
        }
        int hashCode3 = (((((hashCode2 + hashCode) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31;
        Object obj = this.f;
        if (obj != null) {
            i = obj.hashCode();
        }
        return ((hashCode3 + i) * 31) + this.g.hashCode();
    }

    public String toString() {
        String str = this.a;
        boolean z = this.b;
        h81 h81Var = this.c;
        yd7 yd7Var = this.d;
        ssa ssaVar = this.e;
        Object obj = this.f;
        String str2 = this.g;
        return "OrderGameParams(gameUrl=" + str + ", isGameAvailable=" + z + ", claimedReward=" + h81Var + ", rules=" + yd7Var + ", animations=" + ssaVar + ", settings=" + obj + ", gameSessionUuid=" + str2 + ")";
    }
}
