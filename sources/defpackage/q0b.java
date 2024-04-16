package defpackage;

import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: StrokeCap.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087@\u0018\u0000 \u00102\u00020\u0001:\u0001\fB\u0014\b\u0000\u0012\u0006\u0010\u000e\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0007J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r\u0088\u0001\u000e\u0092\u0001\u00020\u0005ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Lq0b;", "", "", "i", "(I)Ljava/lang/String;", "", Image.TYPE_HIGH, "(I)I", "other", "", "f", "(ILjava/lang/Object;)Z", "a", "I", "value", e.a, "b", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: q0b  reason: default package */
/* loaded from: classes.dex */
public final class q0b {
    public static final a b = new a(null);
    private static final int c = e(0);
    private static final int d = e(1);
    private static final int e = e(2);
    private final int a;

    /* compiled from: StrokeCap.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fR \u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R \u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R \u0010\t\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\r"}, d2 = {"Lq0b$a;", "", "Lq0b;", "Butt", "I", "a", "()I", "Round", "b", "Square", c.a, "<init>", "()V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: q0b$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return q0b.c;
        }

        public final int b() {
            return q0b.d;
        }

        public final int c() {
            return q0b.e;
        }
    }

    private /* synthetic */ q0b(int i) {
        this.a = i;
    }

    public static final /* synthetic */ q0b d(int i) {
        return new q0b(i);
    }

    public static boolean f(int i, Object obj) {
        if (!(obj instanceof q0b) || i != ((q0b) obj).j()) {
            return false;
        }
        return true;
    }

    public static final boolean g(int i, int i2) {
        if (i == i2) {
            return true;
        }
        return false;
    }

    public static String i(int i) {
        if (g(i, c)) {
            return "Butt";
        }
        if (g(i, d)) {
            return "Round";
        }
        if (g(i, e)) {
            return "Square";
        }
        return "Unknown";
    }

    public boolean equals(Object obj) {
        return f(this.a, obj);
    }

    public int hashCode() {
        return h(this.a);
    }

    public final /* synthetic */ int j() {
        return this.a;
    }

    public String toString() {
        return i(this.a);
    }

    public static int e(int i) {
        return i;
    }

    public static int h(int i) {
        return i;
    }
}
