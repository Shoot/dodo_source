package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: TextAlign.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087@\u0018\u0000 \u00102\u00020\u0001:\u0001\fB\u0014\b\u0000\u0012\u0006\u0010\u000e\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0007J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r\u0088\u0001\u000e\u0092\u0001\u00020\u0005ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Li9b;", "", "", "l", "(I)Ljava/lang/String;", "", "k", "(I)I", "other", "", "i", "(ILjava/lang/Object;)Z", "a", "I", "value", Image.TYPE_HIGH, "b", "ui-text_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: i9b  reason: default package */
/* loaded from: classes.dex */
public final class i9b {
    public static final a b = new a(null);
    private static final int c = h(1);
    private static final int d = h(2);
    private static final int e = h(3);
    private static final int f = h(4);
    private static final int g = h(5);
    private static final int h = h(6);
    private final int a;

    /* compiled from: TextAlign.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012R \u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R \u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R \u0010\t\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006R \u0010\u000b\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006R \u0010\r\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\r\u0010\u0004\u001a\u0004\b\u000e\u0010\u0006R \u0010\u000f\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0004\u001a\u0004\b\u0010\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0013"}, d2 = {"Li9b$a;", "", "Li9b;", "Left", "I", DateTokenConverter.CONVERTER_KEY, "()I", "Right", e.a, "Center", "a", "Justify", c.a, "Start", "f", "End", "b", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: i9b$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return i9b.e;
        }

        public final int b() {
            return i9b.h;
        }

        public final int c() {
            return i9b.f;
        }

        public final int d() {
            return i9b.c;
        }

        public final int e() {
            return i9b.d;
        }

        public final int f() {
            return i9b.g;
        }
    }

    private /* synthetic */ i9b(int i) {
        this.a = i;
    }

    public static final /* synthetic */ i9b g(int i) {
        return new i9b(i);
    }

    public static boolean i(int i, Object obj) {
        if (!(obj instanceof i9b) || i != ((i9b) obj).m()) {
            return false;
        }
        return true;
    }

    public static final boolean j(int i, int i2) {
        if (i == i2) {
            return true;
        }
        return false;
    }

    public static String l(int i) {
        if (j(i, c)) {
            return "Left";
        }
        if (j(i, d)) {
            return "Right";
        }
        if (j(i, e)) {
            return "Center";
        }
        if (j(i, f)) {
            return "Justify";
        }
        if (j(i, g)) {
            return "Start";
        }
        if (j(i, h)) {
            return "End";
        }
        return "Invalid";
    }

    public boolean equals(Object obj) {
        return i(this.a, obj);
    }

    public int hashCode() {
        return k(this.a);
    }

    public final /* synthetic */ int m() {
        return this.a;
    }

    public String toString() {
        return l(this.a);
    }

    public static int h(int i) {
        return i;
    }

    public static int k(int i) {
        return i;
    }
}
