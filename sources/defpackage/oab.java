package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: TextDirection.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087@\u0018\u0000 \u00102\u00020\u0001:\u0001\fB\u0014\b\u0000\u0012\u0006\u0010\u000e\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0007J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r\u0088\u0001\u000e\u0092\u0001\u00020\u0005ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Loab;", "", "", "k", "(I)Ljava/lang/String;", "", "j", "(I)I", "other", "", Image.TYPE_HIGH, "(ILjava/lang/Object;)Z", "a", "I", "value", "g", "b", "ui-text_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: oab  reason: default package */
/* loaded from: classes.dex */
public final class oab {
    public static final a b = new a(null);
    private static final int c = g(1);
    private static final int d = g(2);
    private static final int e = g(3);
    private static final int f = g(4);
    private static final int g = g(5);
    private final int a;

    /* compiled from: TextDirection.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010R \u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R \u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R \u0010\t\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006R \u0010\u000b\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006R \u0010\r\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\r\u0010\u0004\u001a\u0004\b\u000e\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0011"}, d2 = {"Loab$a;", "", "Loab;", "Ltr", "I", DateTokenConverter.CONVERTER_KEY, "()I", "Rtl", e.a, "Content", "a", "ContentOrLtr", "b", "ContentOrRtl", c.a, "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: oab$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return oab.e;
        }

        public final int b() {
            return oab.f;
        }

        public final int c() {
            return oab.g;
        }

        public final int d() {
            return oab.c;
        }

        public final int e() {
            return oab.d;
        }
    }

    private /* synthetic */ oab(int i) {
        this.a = i;
    }

    public static final /* synthetic */ oab f(int i) {
        return new oab(i);
    }

    public static boolean h(int i, Object obj) {
        if (!(obj instanceof oab) || i != ((oab) obj).l()) {
            return false;
        }
        return true;
    }

    public static final boolean i(int i, int i2) {
        if (i == i2) {
            return true;
        }
        return false;
    }

    public static String k(int i) {
        if (i(i, c)) {
            return "Ltr";
        }
        if (i(i, d)) {
            return "Rtl";
        }
        if (i(i, e)) {
            return "Content";
        }
        if (i(i, f)) {
            return "ContentOrLtr";
        }
        if (i(i, g)) {
            return "ContentOrRtl";
        }
        return "Invalid";
    }

    public boolean equals(Object obj) {
        return h(this.a, obj);
    }

    public int hashCode() {
        return j(this.a);
    }

    public final /* synthetic */ int l() {
        return this.a;
    }

    public String toString() {
        return k(this.a);
    }

    public static int g(int i) {
        return i;
    }

    public static int j(int i) {
        return i;
    }
}
