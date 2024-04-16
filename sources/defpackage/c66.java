package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: MapBounds.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u0000 \u00122\u00020\u0001:\u0002\u000e\u0005B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0012\u0010\u0011¨\u0006\u0015"}, d2 = {"Lc66;", "Ljava/io/Serializable;", "Lc66$b;", "upperLeftCorner", "lowerRightCorner", "b", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Lc66$b;", DateTokenConverter.CONVERTER_KEY, "()Lc66$b;", c.a, "<init>", "(Lc66$b;Lc66$b;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: c66  reason: default package */
/* loaded from: classes4.dex */
public final class c66 implements Serializable {
    public static final a c = new a(null);
    private static final b d;
    private static final b e;
    private static final c66 f;
    private final b a;
    private final b b;

    /* compiled from: MapBounds.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\r"}, d2 = {"Lc66$a;", "", "Lc66;", "britainMapBounds", "Lc66;", "a", "()Lc66;", "Lc66$b;", "BRITAIN_LOWER_RIGHT", "Lc66$b;", "BRITAIN_UPPER_LEFT", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: c66$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final c66 a() {
            return c66.f;
        }
    }

    /* compiled from: MapBounds.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u0014"}, d2 = {"Lc66$b;", "Ljava/io/Serializable;", "", "lat", "lon", "a", "", "toString", "", "hashCode", "", "other", "", "equals", "D", "b", "()D", c.a, "<init>", "(DD)V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: c66$b */
    /* loaded from: classes4.dex */
    public static final class b implements Serializable {
        private final double a;
        private final double b;

        public b(double d, double d2) {
            this.a = d;
            this.b = d2;
        }

        public final b a(double d, double d2) {
            return new b(d, d2);
        }

        public final double b() {
            return this.a;
        }

        public final double c() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (Double.compare(this.a, bVar.a) == 0 && Double.compare(this.b, bVar.b) == 0) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (nkb.a(this.a) * 31) + nkb.a(this.b);
        }

        public String toString() {
            double d = this.a;
            double d2 = this.b;
            return "Coordinates(lat=" + d + ", lon=" + d2 + ")";
        }
    }

    static {
        b bVar = new b(59.664366052968816d, -8.630877211689949d);
        d = bVar;
        b bVar2 = new b(49.63014115665455d, 2.2586915642023087d);
        e = bVar2;
        f = new c66(bVar, bVar2);
    }

    public c66(b bVar, b bVar2) {
        z65.h(bVar, "upperLeftCorner");
        z65.h(bVar2, "lowerRightCorner");
        this.a = bVar;
        this.b = bVar2;
    }

    public final c66 b(b bVar, b bVar2) {
        z65.h(bVar, "upperLeftCorner");
        z65.h(bVar2, "lowerRightCorner");
        return new c66(bVar, bVar2);
    }

    public final b c() {
        return this.b;
    }

    public final b d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c66)) {
            return false;
        }
        c66 c66Var = (c66) obj;
        if (z65.c(this.a, c66Var.a) && z65.c(this.b, c66Var.b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        b bVar = this.a;
        b bVar2 = this.b;
        return "MapBounds(upperLeftCorner=" + bVar + ", lowerRightCorner=" + bVar2 + ")";
    }
}
