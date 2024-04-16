package defpackage;

import ch.qos.logback.core.CoreConstants;
import com.huawei.hms.opendevice.c;
import defpackage.gb;
import kotlin.Metadata;
/* compiled from: Alignment.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\b\u0013B\u0017\u0012\u0006\u0010\u0017\u001a\u00020\u0012\u0012\u0006\u0010\u001a\u001a\u00020\u0012¢\u0006\u0004\b\u001b\u0010\u001cJ-\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003R\u0017\u0010\u0017\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u001a\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0019\u0010\u0016\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"Lab0;", "Lgb;", "Lw55;", "size", "space", "Lqm5;", "layoutDirection", "Ls55;", "a", "(JJLqm5;)J", "", "toString", "", "hashCode", "", "other", "", "equals", "", "b", "F", "getHorizontalBias", "()F", "horizontalBias", c.a, "getVerticalBias", "verticalBias", "<init>", "(FF)V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: ab0  reason: default package */
/* loaded from: classes.dex */
public final class ab0 implements gb {
    private final float b;
    private final float c;

    /* compiled from: Alignment.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J \u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003R\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0010¨\u0006\u0014"}, d2 = {"Lab0$a;", "Lgb$b;", "", "size", "space", "Lqm5;", "layoutDirection", "a", "", "toString", "hashCode", "", "other", "", "equals", "", "F", "bias", "<init>", "(F)V", "ui_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: ab0$a */
    /* loaded from: classes.dex */
    public static final class a implements gb.b {
        private final float a;

        public a(float f) {
            this.a = f;
        }

        @Override // defpackage.gb.b
        public int a(int i, int i2, qm5 qm5Var) {
            float f;
            int c;
            z65.h(qm5Var, "layoutDirection");
            float f2 = (i2 - i) / 2.0f;
            if (qm5Var == qm5.Ltr) {
                f = this.a;
            } else {
                f = (-1) * this.a;
            }
            c = la6.c(f2 * (1 + f));
            return c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof a) && Float.compare(this.a, ((a) obj).a) == 0) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return Float.floatToIntBits(this.a);
        }

        public String toString() {
            return "Horizontal(bias=" + this.a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    /* compiled from: Alignment.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\b\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000e¨\u0006\u0012"}, d2 = {"Lab0$b;", "Lgb$c;", "", "size", "space", "a", "", "toString", "hashCode", "", "other", "", "equals", "", "F", "bias", "<init>", "(F)V", "ui_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: ab0$b */
    /* loaded from: classes.dex */
    public static final class b implements gb.c {
        private final float a;

        public b(float f) {
            this.a = f;
        }

        @Override // defpackage.gb.c
        public int a(int i, int i2) {
            int c;
            c = la6.c(((i2 - i) / 2.0f) * (1 + this.a));
            return c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof b) && Float.compare(this.a, ((b) obj).a) == 0) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return Float.floatToIntBits(this.a);
        }

        public String toString() {
            return "Vertical(bias=" + this.a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    public ab0(float f, float f2) {
        this.b = f;
        this.c = f2;
    }

    @Override // defpackage.gb
    public long a(long j, long j2, qm5 qm5Var) {
        float f;
        int c;
        int c2;
        z65.h(qm5Var, "layoutDirection");
        float g = (w55.g(j2) - w55.g(j)) / 2.0f;
        float f2 = (w55.f(j2) - w55.f(j)) / 2.0f;
        if (qm5Var == qm5.Ltr) {
            f = this.b;
        } else {
            f = (-1) * this.b;
        }
        float f3 = 1;
        c = la6.c(g * (f + f3));
        c2 = la6.c(f2 * (f3 + this.c));
        return t55.a(c, c2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ab0)) {
            return false;
        }
        ab0 ab0Var = (ab0) obj;
        if (Float.compare(this.b, ab0Var.b) == 0 && Float.compare(this.c, ab0Var.c) == 0) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (Float.floatToIntBits(this.b) * 31) + Float.floatToIntBits(this.c);
    }

    public String toString() {
        return "BiasAlignment(horizontalBias=" + this.b + ", verticalBias=" + this.c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
