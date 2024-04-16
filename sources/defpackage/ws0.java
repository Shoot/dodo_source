package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
/* compiled from: CashChargeVO.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ1\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lws0;", "", "Lhn6;", "orderAmount", "note", "", "rawNote", "", "isPrefixCurrencySymbol", "a", "toString", "", "hashCode", "other", "equals", "Lhn6;", DateTokenConverter.CONVERTER_KEY, "()Lhn6;", "b", c.a, "Ljava/lang/String;", e.a, "()Ljava/lang/String;", "Z", "f", "()Z", "<init>", "(Lhn6;Lhn6;Ljava/lang/String;Z)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: ws0  reason: default package */
/* loaded from: classes4.dex */
public final class ws0 {
    private final hn6 a;
    private final hn6 b;
    private final String c;
    private final boolean d;

    public ws0(hn6 hn6Var, hn6 hn6Var2, String str, boolean z) {
        z65.h(hn6Var, "orderAmount");
        z65.h(hn6Var2, "note");
        z65.h(str, "rawNote");
        this.a = hn6Var;
        this.b = hn6Var2;
        this.c = str;
        this.d = z;
    }

    public static /* synthetic */ ws0 b(ws0 ws0Var, hn6 hn6Var, hn6 hn6Var2, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            hn6Var = ws0Var.a;
        }
        if ((i & 2) != 0) {
            hn6Var2 = ws0Var.b;
        }
        if ((i & 4) != 0) {
            str = ws0Var.c;
        }
        if ((i & 8) != 0) {
            z = ws0Var.d;
        }
        return ws0Var.a(hn6Var, hn6Var2, str, z);
    }

    public final ws0 a(hn6 hn6Var, hn6 hn6Var2, String str, boolean z) {
        z65.h(hn6Var, "orderAmount");
        z65.h(hn6Var2, "note");
        z65.h(str, "rawNote");
        return new ws0(hn6Var, hn6Var2, str, z);
    }

    public final hn6 c() {
        return this.b;
    }

    public final hn6 d() {
        return this.a;
    }

    public final String e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ws0)) {
            return false;
        }
        ws0 ws0Var = (ws0) obj;
        if (z65.c(this.a, ws0Var.a) && z65.c(this.b, ws0Var.b) && z65.c(this.c, ws0Var.c) && this.d == ws0Var.d) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        return this.d;
    }

    public int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + a91.a(this.d);
    }

    public String toString() {
        hn6 hn6Var = this.a;
        hn6 hn6Var2 = this.b;
        String str = this.c;
        boolean z = this.d;
        return "CashChargeVO(orderAmount=" + hn6Var + ", note=" + hn6Var2 + ", rawNote=" + str + ", isPrefixCurrencySymbol=" + z + ")";
    }
}
