package defpackage;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: DrawScope.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000  2\u00020\u0001:\u0001\u000bB>\u0012\b\b\u0002\u0010\u000f\u001a\u00020\n\u0012\b\b\u0002\u0010\u0012\u001a\u00020\n\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0017\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001aø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\bH\u0016R\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0012\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0011\u0010\u000eR \u0010\u0016\u001a\u00020\u00138\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0014\u001a\u0004\b\u000b\u0010\u0015R \u0010\u0019\u001a\u00020\u00178\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0010\u0010\u0015R\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u001a8\u0006¢\u0006\f\n\u0004\b\r\u0010\u001b\u001a\u0004\b\u0018\u0010\u001c\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006!"}, d2 = {"Lp0b;", "Lz73;", "", "other", "", "equals", "", "hashCode", "", "toString", "", "a", "F", e.a, "()F", "width", "b", c.a, "miter", "Lq0b;", "I", "()I", "cap", "Ls0b;", DateTokenConverter.CONVERTER_KEY, "join", "Lrr7;", "Lrr7;", "()Lrr7;", "pathEffect", "<init>", "(FFIILrr7;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "f", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: p0b  reason: default package */
/* loaded from: classes.dex */
public final class p0b extends z73 {
    public static final a f = new a(null);
    private static final int g = q0b.b.a();
    private static final int h = s0b.b.b();
    private final float a;
    private final float b;
    private final int c;
    private final int d;
    private final rr7 e;

    /* compiled from: DrawScope.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Lp0b$a;", "", "", "DefaultMiter", "F", "HairlineWidth", "<init>", "()V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: p0b$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ p0b(float f2, float f3, int i, int i2, rr7 rr7Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(f2, f3, i, i2, rr7Var);
    }

    public final int a() {
        return this.c;
    }

    public final int b() {
        return this.d;
    }

    public final float c() {
        return this.b;
    }

    public final rr7 d() {
        return this.e;
    }

    public final float e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0b)) {
            return false;
        }
        p0b p0bVar = (p0b) obj;
        if (this.a == p0bVar.a && this.b == p0bVar.b && q0b.g(this.c, p0bVar.c) && s0b.g(this.d, p0bVar.d) && z65.c(this.e, p0bVar.e)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int floatToIntBits = ((((((Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b)) * 31) + q0b.h(this.c)) * 31) + s0b.h(this.d)) * 31;
        rr7 rr7Var = this.e;
        if (rr7Var != null) {
            i = rr7Var.hashCode();
        } else {
            i = 0;
        }
        return floatToIntBits + i;
    }

    public String toString() {
        return "Stroke(width=" + this.a + ", miter=" + this.b + ", cap=" + ((Object) q0b.i(this.c)) + ", join=" + ((Object) s0b.i(this.d)) + ", pathEffect=" + this.e + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public /* synthetic */ p0b(float f2, float f3, int i, int i2, rr7 rr7Var, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0.0f : f2, (i3 & 2) != 0 ? 4.0f : f3, (i3 & 4) != 0 ? g : i, (i3 & 8) != 0 ? h : i2, (i3 & 16) != 0 ? null : rr7Var, null);
    }

    private p0b(float f2, float f3, int i, int i2, rr7 rr7Var) {
        super(null);
        this.a = f2;
        this.b = f3;
        this.c = i;
        this.d = i2;
        this.e = rr7Var;
    }
}
