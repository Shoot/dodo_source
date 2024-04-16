package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: Placeholder.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0087@\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0014\b\u0000\u0012\u0006\u0010\b\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0004\b\t\u0010\u0007J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u0088\u0001\b\u0092\u0001\u00020\u0005ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"Lob8;", "", "", "k", "(I)Ljava/lang/String;", "", "j", "(I)I", "value", Image.TYPE_HIGH, "a", "ui-text_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: ob8  reason: default package */
/* loaded from: classes.dex */
public final class ob8 {
    public static final a a = new a(null);
    private static final int b = h(1);
    private static final int c = h(2);
    private static final int d = h(3);
    private static final int e = h(4);
    private static final int f = h(5);
    private static final int g = h(6);
    private static final int h = h(7);

    /* compiled from: Placeholder.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014R \u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R \u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R \u0010\t\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006R \u0010\u000b\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006R \u0010\r\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\r\u0010\u0004\u001a\u0004\b\u000e\u0010\u0006R \u0010\u000f\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0004\u001a\u0004\b\u0010\u0010\u0006R \u0010\u0011\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0004\u001a\u0004\b\u0012\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0015"}, d2 = {"Lob8$a;", "", "Lob8;", "AboveBaseline", "I", "a", "()I", "Top", "g", "Bottom", "b", "Center", c.a, "TextTop", "f", "TextBottom", DateTokenConverter.CONVERTER_KEY, "TextCenter", e.a, "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: ob8$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return ob8.b;
        }

        public final int b() {
            return ob8.d;
        }

        public final int c() {
            return ob8.e;
        }

        public final int d() {
            return ob8.g;
        }

        public final int e() {
            return ob8.h;
        }

        public final int f() {
            return ob8.f;
        }

        public final int g() {
            return ob8.c;
        }
    }

    public static final boolean i(int i, int i2) {
        if (i == i2) {
            return true;
        }
        return false;
    }

    public static String k(int i) {
        if (i(i, b)) {
            return "AboveBaseline";
        }
        if (i(i, c)) {
            return "Top";
        }
        if (i(i, d)) {
            return "Bottom";
        }
        if (i(i, e)) {
            return "Center";
        }
        if (i(i, f)) {
            return "TextTop";
        }
        if (i(i, g)) {
            return "TextBottom";
        }
        if (i(i, h)) {
            return "TextCenter";
        }
        return "Invalid";
    }

    public static int h(int i) {
        return i;
    }

    public static int j(int i) {
        return i;
    }
}
