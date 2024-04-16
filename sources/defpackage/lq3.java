package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: DeliveryFee.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\b\u0018\u0000 \u00142\u00020\u0001:\u0001\nB\u001f\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\t\u0012\u0006\u0010\u0011\u001a\u00020\t¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0010\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u0017\u0010\u0011\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\f\u0010\u000b\u001a\u0004\b\n\u0010\r¨\u0006\u0015"}, d2 = {"Llq3;", "", "", "toString", "", "hashCode", "other", "", "equals", "Lhn6;", "a", "Lhn6;", c.a, "()Lhn6;", "minCartCost", "b", "maxCartCost", "deliveryFeeCost", "<init>", "(Lhn6;Lhn6;Lhn6;)V", DateTokenConverter.CONVERTER_KEY, "cart"}, k = 1, mv = {1, 9, 0})
/* renamed from: lq3  reason: default package */
/* loaded from: classes.dex */
public final class lq3 {
    public static final a d = new a(null);
    private static final List<lq3> e;
    private static final lq3 f;
    private final hn6 a;
    private final hn6 b;
    private final hn6 c;

    /* compiled from: DeliveryFee.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Llq3$a;", "", "<init>", "()V", "cart"}, k = 1, mv = {1, 9, 0})
    /* renamed from: lq3$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        List<lq3> o;
        o = kc1.o(new lq3(new hn6(151.0d, "RUB"), new hn6(2000.0d, "RUB"), new hn6(0.0d, "RUB")), new lq3(new hn6(101.0d, "RUB"), new hn6(150.0d, "RUB"), new hn6(25.0d, "RUB")), new lq3(new hn6(51.0d, "RUB"), new hn6(100.0d, "RUB"), new hn6(35.0d, "RUB")), new lq3(new hn6(0.0d, "RUB"), new hn6(50.0d, "RUB"), new hn6(45.0d, "RUB")));
        e = o;
        f = new lq3(new hn6(50.0d, "RUB"), new hn6(100.0d, "RUB"), new hn6(15.0d, "RUB"));
    }

    public lq3(hn6 hn6Var, hn6 hn6Var2, hn6 hn6Var3) {
        z65.h(hn6Var, "minCartCost");
        z65.h(hn6Var2, "maxCartCost");
        z65.h(hn6Var3, "deliveryFeeCost");
        this.a = hn6Var;
        this.b = hn6Var2;
        this.c = hn6Var3;
    }

    public final hn6 a() {
        return this.c;
    }

    public final hn6 b() {
        return this.b;
    }

    public final hn6 c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lq3)) {
            return false;
        }
        lq3 lq3Var = (lq3) obj;
        if (z65.c(this.a, lq3Var.a) && z65.c(this.b, lq3Var.b) && z65.c(this.c, lq3Var.c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public String toString() {
        hn6 hn6Var = this.a;
        hn6 hn6Var2 = this.b;
        hn6 hn6Var3 = this.c;
        return "FeeLevelVO(minCartCost=" + hn6Var + ", maxCartCost=" + hn6Var2 + ", deliveryFeeCost=" + hn6Var3 + ")";
    }
}
