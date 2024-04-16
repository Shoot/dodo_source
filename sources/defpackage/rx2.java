package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import java.io.Serializable;
import kotlin.Metadata;
/* compiled from: DeliveryLocationDetailsFragmentData.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\u0006\u0010\u0017\u001a\u00020\b\u0012\u0006\u0010\u0019\u001a\u00020\b\u0012\u0006\u0010\u001b\u001a\u00020\b\u0012\u0006\u0010\u001d\u001a\u00020\b\u0012\u0006\u0010\"\u001a\u00020\u001e¢\u0006\u0004\b#\u0010$J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0012\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\f\u0010\u0010\u001a\u0004\b\n\u0010\u0011R\u0017\u0010\u0017\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0019\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u0017\u0010\u001b\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016R\u0017\u0010\u001d\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0014\u001a\u0004\b\u001c\u0010\u0016R\u0017\u0010\"\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u0013\u0010!¨\u0006%"}, d2 = {"Lrx2;", "Ljava/io/Serializable;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "I", "b", "()I", "resultId", "Le91;", "Le91;", "()Le91;", "clientDeliveryLocation", c.a, "Z", DateTokenConverter.CONVERTER_KEY, "()Z", "showDeleteButton", e.a, "showSuggestionsButton", "i", "isEmptyCart", "f", "isAddressSelected", "Lck1;", "g", "Lck1;", "()Lck1;", "sender", "<init>", "(ILe91;ZZZZLck1;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: rx2  reason: default package */
/* loaded from: classes4.dex */
public final class rx2 implements Serializable {
    private final int a;
    private final e91 b;
    private final boolean c;
    private final boolean d;
    private final boolean e;
    private final boolean f;
    private final ck1 g;

    public rx2(int i, e91 e91Var, boolean z, boolean z2, boolean z3, boolean z4, ck1 ck1Var) {
        z65.h(e91Var, "clientDeliveryLocation");
        z65.h(ck1Var, "sender");
        this.a = i;
        this.b = e91Var;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = ck1Var;
    }

    public final e91 a() {
        return this.b;
    }

    public final int b() {
        return this.a;
    }

    public final ck1 c() {
        return this.g;
    }

    public final boolean d() {
        return this.c;
    }

    public final boolean e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rx2)) {
            return false;
        }
        rx2 rx2Var = (rx2) obj;
        if (this.a == rx2Var.a && z65.c(this.b, rx2Var.b) && this.c == rx2Var.c && this.d == rx2Var.d && this.e == rx2Var.e && this.f == rx2Var.f && this.g == rx2Var.g) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        return this.f;
    }

    public int hashCode() {
        return (((((((((((this.a * 31) + this.b.hashCode()) * 31) + a91.a(this.c)) * 31) + a91.a(this.d)) * 31) + a91.a(this.e)) * 31) + a91.a(this.f)) * 31) + this.g.hashCode();
    }

    public final boolean i() {
        return this.e;
    }

    public String toString() {
        int i = this.a;
        e91 e91Var = this.b;
        boolean z = this.c;
        boolean z2 = this.d;
        boolean z3 = this.e;
        boolean z4 = this.f;
        ck1 ck1Var = this.g;
        return "DeliveryLocationDetailsFragmentData(resultId=" + i + ", clientDeliveryLocation=" + e91Var + ", showDeleteButton=" + z + ", showSuggestionsButton=" + z2 + ", isEmptyCart=" + z3 + ", isAddressSelected=" + z4 + ", sender=" + ck1Var + ")";
    }
}
