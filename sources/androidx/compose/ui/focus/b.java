package androidx.compose.ui.focus;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: FocusDirection.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087@\u0018\u0000 \u00102\u00020\u0001:\u0001\fB\u0014\b\u0000\u0012\u0006\u0010\u000e\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0007J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r\u0088\u0001\u000e\u0092\u0001\u00020\u0005ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/focus/b;", "", "", "n", "(I)Ljava/lang/String;", "", Image.TYPE_MEDIUM, "(I)I", "other", "", "k", "(ILjava/lang/Object;)Z", "a", "I", "value", "j", "b", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class b {
    public static final a b = new a(null);
    private static final int c = j(1);
    private static final int d = j(2);
    private static final int e = j(3);
    private static final int f = j(4);
    private static final int g = j(5);
    private static final int h = j(6);
    private static final int i;
    private static final int j;
    private static final int k;
    private static final int l;
    private final int a;

    /* compiled from: FocusDirection.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0018\u0010\u0014R \u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R \u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R \u0010\t\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006R \u0010\u000b\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006R \u0010\r\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\r\u0010\u0004\u001a\u0004\b\u000e\u0010\u0006R \u0010\u000f\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0004\u001a\u0004\b\u0010\u0010\u0006R)\u0010\u0011\u001a\u00020\u00028GX\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u0011\u0010\u0004\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0012\u0010\u0006R)\u0010\u0015\u001a\u00020\u00028GX\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u0015\u0010\u0004\u0012\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0016\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/focus/b$a;", "", "Landroidx/compose/ui/focus/b;", "Next", "I", com.huawei.hms.push.e.a, "()I", "Previous", "f", "Left", DateTokenConverter.CONVERTER_KEY, "Right", "g", "Up", Image.TYPE_HIGH, "Down", "a", "Enter", "b", "getEnter-dhqQ-8s$annotations", "()V", "Exit", com.huawei.hms.opendevice.c.a, "getExit-dhqQ-8s$annotations", "<init>", "ui_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return b.h;
        }

        public final int b() {
            return b.i;
        }

        public final int c() {
            return b.j;
        }

        public final int d() {
            return b.e;
        }

        public final int e() {
            return b.c;
        }

        public final int f() {
            return b.d;
        }

        public final int g() {
            return b.f;
        }

        public final int h() {
            return b.g;
        }
    }

    static {
        int j2 = j(7);
        i = j2;
        int j3 = j(8);
        j = j3;
        k = j2;
        l = j3;
    }

    private /* synthetic */ b(int i2) {
        this.a = i2;
    }

    public static final /* synthetic */ b i(int i2) {
        return new b(i2);
    }

    public static boolean k(int i2, Object obj) {
        if (!(obj instanceof b) || i2 != ((b) obj).o()) {
            return false;
        }
        return true;
    }

    public static final boolean l(int i2, int i3) {
        if (i2 == i3) {
            return true;
        }
        return false;
    }

    public static String n(int i2) {
        if (l(i2, c)) {
            return "Next";
        }
        if (l(i2, d)) {
            return "Previous";
        }
        if (l(i2, e)) {
            return "Left";
        }
        if (l(i2, f)) {
            return "Right";
        }
        if (l(i2, g)) {
            return "Up";
        }
        if (l(i2, h)) {
            return "Down";
        }
        if (l(i2, i)) {
            return "Enter";
        }
        if (l(i2, j)) {
            return "Exit";
        }
        return "Invalid FocusDirection";
    }

    public boolean equals(Object obj) {
        return k(this.a, obj);
    }

    public int hashCode() {
        return m(this.a);
    }

    public final /* synthetic */ int o() {
        return this.a;
    }

    public String toString() {
        return n(this.a);
    }

    public static int j(int i2) {
        return i2;
    }

    public static int m(int i2) {
        return i2;
    }
}
