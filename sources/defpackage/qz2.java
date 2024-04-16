package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: DeliveryPrice.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010$\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\t\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0018\u0012\u0006\u0010 \u001a\u00020\u0007\u0012\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020!¢\u0006\u0004\b&\u0010'J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0010\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\n\u0010\rR\u0017\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0017\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u0017\u0010\u001c\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0011\u0010\u001bR\u0017\u0010 \u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0019\u0010\u001fR#\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020!8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\u000f\u0010$¨\u0006("}, d2 = {"Lqz2;", "", "", "toString", "", "hashCode", "other", "", "equals", "Lhn6;", "a", "Lhn6;", DateTokenConverter.CONVERTER_KEY, "()Lhn6;", "minDeliveryPrice", "b", "customisedMinDeliveryPrice", c.a, "Ljava/lang/String;", "getExperimentId", "()Ljava/lang/String;", "experimentId", "getExperimentGroup", "experimentGroup", "", e.a, "J", "()J", "expiredTime", "f", "Z", "()Z", "isPriceUpdate", "", "g", "Ljava/util/Map;", "()Ljava/util/Map;", "experimentAdditionalData", "<init>", "(Lhn6;Lhn6;Ljava/lang/String;Ljava/lang/String;JZLjava/util/Map;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: qz2  reason: default package */
/* loaded from: classes4.dex */
public final class qz2 {
    private final hn6 a;
    private final hn6 b;
    private final String c;
    private final String d;
    private final long e;
    private final boolean f;
    private final Map<String, String> g;

    public qz2(hn6 hn6Var, hn6 hn6Var2, String str, String str2, long j, boolean z, Map<String, String> map) {
        z65.h(hn6Var, "minDeliveryPrice");
        z65.h(hn6Var2, "customisedMinDeliveryPrice");
        z65.h(str, "experimentId");
        z65.h(str2, "experimentGroup");
        z65.h(map, "experimentAdditionalData");
        this.a = hn6Var;
        this.b = hn6Var2;
        this.c = str;
        this.d = str2;
        this.e = j;
        this.f = z;
        this.g = map;
    }

    public final hn6 a() {
        return this.b;
    }

    public final Map<String, String> b() {
        return this.g;
    }

    public final long c() {
        return this.e;
    }

    public final hn6 d() {
        return this.a;
    }

    public final boolean e() {
        return this.f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qz2)) {
            return false;
        }
        qz2 qz2Var = (qz2) obj;
        if (z65.c(this.a, qz2Var.a) && z65.c(this.b, qz2Var.b) && z65.c(this.c, qz2Var.c) && z65.c(this.d, qz2Var.d) && this.e == qz2Var.e && this.f == qz2Var.f && z65.c(this.g, qz2Var.g)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + ax1.a(this.e)) * 31) + a91.a(this.f)) * 31) + this.g.hashCode();
    }

    public String toString() {
        hn6 hn6Var = this.a;
        hn6 hn6Var2 = this.b;
        String str = this.c;
        String str2 = this.d;
        long j = this.e;
        boolean z = this.f;
        Map<String, String> map = this.g;
        return "DeliveryPrice(minDeliveryPrice=" + hn6Var + ", customisedMinDeliveryPrice=" + hn6Var2 + ", experimentId=" + str + ", experimentGroup=" + str2 + ", expiredTime=" + j + ", isPriceUpdate=" + z + ", experimentAdditionalData=" + map + ")";
    }

    public /* synthetic */ qz2(hn6 hn6Var, hn6 hn6Var2, String str, String str2, long j, boolean z, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(hn6Var, hn6Var2, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? -1L : j, z, map);
    }
}
