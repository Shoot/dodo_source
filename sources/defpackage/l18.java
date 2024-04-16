package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.menu.ShoppingInfoEntity;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
/* compiled from: PersonalPrice.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u000e\u0012\u0006\u0010\u0016\u001a\u00020\u0004\u0012\u0006\u0010\u001b\u001a\u00020\u0017\u0012\u0006\u0010\u001f\u001a\u00020\u001c¢\u0006\u0004\b \u0010!J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0016\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0014\u001a\u0004\b\u000f\u0010\u0015R\u0017\u0010\u001b\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\t\u0010\u001aR\u0017\u0010\u001f\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001d\u001a\u0004\b\u0018\u0010\u001e¨\u0006\""}, d2 = {"Ll18;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", e.a, "()Ljava/lang/String;", ShoppingInfoEntity.FIELD_PRODUCT_ID, "Lhn6;", "b", "Lhn6;", c.a, "()Lhn6;", "discountedPrice", "I", "()I", "discountPercent", "Lz23;", DateTokenConverter.CONVERTER_KEY, "Lz23;", "()Lz23;", "discountMode", "", "J", "()J", "endDateTimeUtc", "<init>", "(Ljava/lang/String;Lhn6;ILz23;J)V", "common"}, k = 1, mv = {1, 9, 0})
/* renamed from: l18  reason: default package */
/* loaded from: classes.dex */
public final class l18 {
    private final String a;
    private final hn6 b;
    private final int c;
    private final z23 d;
    private final long e;

    public l18(String str, hn6 hn6Var, int i, z23 z23Var, long j) {
        z65.h(str, ShoppingInfoEntity.FIELD_PRODUCT_ID);
        z65.h(hn6Var, "discountedPrice");
        z65.h(z23Var, "discountMode");
        this.a = str;
        this.b = hn6Var;
        this.c = i;
        this.d = z23Var;
        this.e = j;
    }

    public final z23 a() {
        return this.d;
    }

    public final int b() {
        return this.c;
    }

    public final hn6 c() {
        return this.b;
    }

    public final long d() {
        return this.e;
    }

    public final String e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l18)) {
            return false;
        }
        l18 l18Var = (l18) obj;
        if (z65.c(this.a, l18Var.a) && z65.c(this.b, l18Var.b) && this.c == l18Var.c && this.d == l18Var.d && this.e == l18Var.e) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c) * 31) + this.d.hashCode()) * 31) + ax1.a(this.e);
    }

    public String toString() {
        String str = this.a;
        hn6 hn6Var = this.b;
        int i = this.c;
        z23 z23Var = this.d;
        long j = this.e;
        return "PersonalPrice(productId=" + str + ", discountedPrice=" + hn6Var + ", discountPercent=" + i + ", discountMode=" + z23Var + ", endDateTimeUtc=" + j + ")";
    }
}
