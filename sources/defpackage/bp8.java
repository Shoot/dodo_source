package defpackage;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.h;
/* compiled from: SemanticsProperties.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\nB'\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\u000f\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0005¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\u000f8\u0006¢\u0006\f\n\u0004\b\f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0017\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Lbp8;", "", "other", "", "equals", "", "hashCode", "", "toString", "", "a", "F", "b", "()F", "current", "Lca1;", "Lca1;", c.a, "()Lca1;", "range", "I", DateTokenConverter.CONVERTER_KEY, "()I", "steps", "<init>", "(FLca1;I)V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: bp8  reason: default package */
/* loaded from: classes.dex */
public final class bp8 {
    public static final a d = new a(null);
    private static final bp8 e;
    private final float a;
    private final ca1<Float> b;
    private final int c;

    /* compiled from: SemanticsProperties.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lbp8$a;", "", "Lbp8;", "Indeterminate", "Lbp8;", "a", "()Lbp8;", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: bp8$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final bp8 a() {
            return bp8.e;
        }
    }

    static {
        ca1 b;
        b = h.b(0.0f, 0.0f);
        e = new bp8(0.0f, b, 0, 4, null);
    }

    public bp8(float f, ca1<Float> ca1Var, int i) {
        z65.h(ca1Var, "range");
        this.a = f;
        this.b = ca1Var;
        this.c = i;
        if (!(!Float.isNaN(f))) {
            throw new IllegalArgumentException("current must not be NaN".toString());
        }
    }

    public final float b() {
        return this.a;
    }

    public final ca1<Float> c() {
        return this.b;
    }

    public final int d() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bp8)) {
            return false;
        }
        bp8 bp8Var = (bp8) obj;
        if (this.a == bp8Var.a && z65.c(this.b, bp8Var.b) && this.c == bp8Var.c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((Float.floatToIntBits(this.a) * 31) + this.b.hashCode()) * 31) + this.c;
    }

    public String toString() {
        return "ProgressBarRangeInfo(current=" + this.a + ", range=" + this.b + ", steps=" + this.c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public /* synthetic */ bp8(float f, ca1 ca1Var, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, ca1Var, (i2 & 4) != 0 ? 0 : i);
    }
}
