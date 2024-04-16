package defpackage;

import ch.qos.logback.core.CoreConstants;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: TextGeometricTransform.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\nB\u001b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\t\u0012\b\b\u0002\u0010\u0010\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0010\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\f\u0010\u000b\u001a\u0004\b\u000f\u0010\r¨\u0006\u0013"}, d2 = {"Lgbb;", "", "other", "", "equals", "", "hashCode", "", "toString", "", "a", "F", "b", "()F", "scaleX", c.a, "skewX", "<init>", "(FF)V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: gbb  reason: default package */
/* loaded from: classes.dex */
public final class gbb {
    public static final a c = new a(null);
    private static final gbb d = new gbb(1.0f, 0.0f);
    private final float a;
    private final float b;

    /* compiled from: TextGeometricTransform.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\bR \u0010\u0003\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lgbb$a;", "", "Lgbb;", "None", "Lgbb;", "a", "()Lgbb;", "getNone$ui_text_release$annotations", "()V", "<init>", "ui-text_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: gbb$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final gbb a() {
            return gbb.d;
        }
    }

    public gbb() {
        this(0.0f, 0.0f, 3, null);
    }

    public final float b() {
        return this.a;
    }

    public final float c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gbb)) {
            return false;
        }
        gbb gbbVar = (gbb) obj;
        if (this.a == gbbVar.a && this.b == gbbVar.b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b);
    }

    public String toString() {
        return "TextGeometricTransform(scaleX=" + this.a + ", skewX=" + this.b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public gbb(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public /* synthetic */ gbb(float f, float f2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 1.0f : f, (i & 2) != 0 ? 0.0f : f2);
    }
}
