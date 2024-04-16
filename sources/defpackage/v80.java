package defpackage;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: BaselineShift.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\t\b\u0087@\u0018\u0000 \u00142\u00020\u0001:\u0001\rB\u0012\u0012\u0006\u0010\u0011\u001a\u00020\fø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\u0088\u0001\u0011\u0092\u0001\u00020\fø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Lv80;", "", "", "g", "(F)Ljava/lang/String;", "", "f", "(F)I", "other", "", DateTokenConverter.CONVERTER_KEY, "(FLjava/lang/Object;)Z", "", "a", "F", "getMultiplier", "()F", "multiplier", c.a, "(F)F", "b", "ui-text_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: v80  reason: default package */
/* loaded from: classes.dex */
public final class v80 {
    public static final a b = new a(null);
    private static final float c = c(0.5f);
    private static final float d = c(-0.5f);
    private static final float e = c(0.0f);
    private final float a;

    /* compiled from: BaselineShift.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\bR)\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\n"}, d2 = {"Lv80$a;", "", "Lv80;", "None", "F", "a", "()F", "getNone-y9eOQZs$annotations", "()V", "<init>", "ui-text_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: v80$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final float a() {
            return v80.e;
        }
    }

    private /* synthetic */ v80(float f) {
        this.a = f;
    }

    public static final /* synthetic */ v80 b(float f) {
        return new v80(f);
    }

    public static boolean d(float f, Object obj) {
        if (!(obj instanceof v80) || Float.compare(f, ((v80) obj).h()) != 0) {
            return false;
        }
        return true;
    }

    public static final boolean e(float f, float f2) {
        if (Float.compare(f, f2) == 0) {
            return true;
        }
        return false;
    }

    public static int f(float f) {
        return Float.floatToIntBits(f);
    }

    public static String g(float f) {
        return "BaselineShift(multiplier=" + f + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public boolean equals(Object obj) {
        return d(this.a, obj);
    }

    public final /* synthetic */ float h() {
        return this.a;
    }

    public int hashCode() {
        return f(this.a);
    }

    public String toString() {
        return g(this.a);
    }

    public static float c(float f) {
        return f;
    }
}
