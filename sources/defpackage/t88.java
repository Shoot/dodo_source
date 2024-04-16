package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import java.io.Serializable;
import kotlin.Metadata;
/* compiled from: PizzeriaInfo.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\u0006\u0010\u0018\u001a\u00020\u0014\u0012\u0006\u0010\u001d\u001a\u00020\b\u0012\b\b\u0002\u0010\u001f\u001a\u00020\b\u0012\b\b\u0002\u0010 \u001a\u00020\b¢\u0006\u0004\b!\u0010\"J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0013\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\r\u0010\u0011\u001a\u0004\b\u000b\u0010\u0012R\u0017\u0010\u0018\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0017\u0010\u001d\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u001f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u0017\u0010 \u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001a\u001a\u0004\b\u0019\u0010\u001c¨\u0006#"}, d2 = {"Lt88;", "Ljava/io/Serializable;", "", "toString", "", "hashCode", "", "other", "", "equals", "Ld88;", "a", "Ld88;", "b", "()Ld88;", "pizzeria", "Ljb7;", "Ljb7;", "()Ljb7;", "operationalType", "Lhn3;", c.a, "Lhn3;", "()Lhn3;", "pizzeriaType", DateTokenConverter.CONVERTER_KEY, "Z", "f", "()Z", "isShortStreetNameEnabled", e.a, "isSelectedFromMap", "isNearestPizzeria", "<init>", "(Ld88;Ljb7;Lhn3;ZZZ)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: t88  reason: default package */
/* loaded from: classes2.dex */
public final class t88 implements Serializable {
    private final d88 a;
    private final jb7 b;
    private final hn3 c;
    private final boolean d;
    private final boolean e;
    private final boolean f;

    public t88(d88 d88Var, jb7 jb7Var, hn3 hn3Var, boolean z, boolean z2, boolean z3) {
        z65.h(d88Var, "pizzeria");
        z65.h(jb7Var, "operationalType");
        z65.h(hn3Var, "pizzeriaType");
        this.a = d88Var;
        this.b = jb7Var;
        this.c = hn3Var;
        this.d = z;
        this.e = z2;
        this.f = z3;
    }

    public final jb7 a() {
        return this.b;
    }

    public final d88 b() {
        return this.a;
    }

    public final hn3 c() {
        return this.c;
    }

    public final boolean d() {
        return this.f;
    }

    public final boolean e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t88)) {
            return false;
        }
        t88 t88Var = (t88) obj;
        if (z65.c(this.a, t88Var.a) && this.b == t88Var.b && this.c == t88Var.c && this.d == t88Var.d && this.e == t88Var.e && this.f == t88Var.f) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        return this.d;
    }

    public int hashCode() {
        return (((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + a91.a(this.d)) * 31) + a91.a(this.e)) * 31) + a91.a(this.f);
    }

    public String toString() {
        d88 d88Var = this.a;
        jb7 jb7Var = this.b;
        hn3 hn3Var = this.c;
        boolean z = this.d;
        boolean z2 = this.e;
        boolean z3 = this.f;
        return "PizzeriaInfo(pizzeria=" + d88Var + ", operationalType=" + jb7Var + ", pizzeriaType=" + hn3Var + ", isShortStreetNameEnabled=" + z + ", isSelectedFromMap=" + z2 + ", isNearestPizzeria=" + z3 + ")";
    }
}
