package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: ImeAction.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087@\u0018\u0000 \u00102\u00020\u0001:\u0001\fB\u0014\b\u0000\u0012\u0006\u0010\u000e\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0007J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r\u0088\u0001\u000e\u0092\u0001\u00020\u0005ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Lqw4;", "", "", "n", "(I)Ljava/lang/String;", "", Image.TYPE_MEDIUM, "(I)I", "other", "", "k", "(ILjava/lang/Object;)Z", "a", "I", "value", "j", "b", "ui-text_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: qw4  reason: default package */
/* loaded from: classes.dex */
public final class qw4 {
    public static final a b = new a(null);
    private static final int c = j(1);
    private static final int d = j(0);
    private static final int e = j(2);
    private static final int f = j(3);
    private static final int g = j(4);
    private static final int h = j(5);
    private static final int i = j(6);
    private static final int j = j(7);
    private final int a;

    /* compiled from: ImeAction.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001e\u0010\bR)\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R)\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u0012\u0004\b\u000b\u0010\b\u001a\u0004\b\n\u0010\u0006R)\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\f\u0010\u0004\u0012\u0004\b\u000e\u0010\b\u001a\u0004\b\r\u0010\u0006R)\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\u0004\u0012\u0004\b\u0011\u0010\b\u001a\u0004\b\u0010\u0010\u0006R)\u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010\u0004\u0012\u0004\b\u0014\u0010\b\u001a\u0004\b\u0013\u0010\u0006R)\u0010\u0015\u001a\u00020\u00028\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u0015\u0010\u0004\u0012\u0004\b\u0017\u0010\b\u001a\u0004\b\u0016\u0010\u0006R)\u0010\u0018\u001a\u00020\u00028\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u0018\u0010\u0004\u0012\u0004\b\u001a\u0010\b\u001a\u0004\b\u0019\u0010\u0006R)\u0010\u001b\u001a\u00020\u00028\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010\u0004\u0012\u0004\b\u001d\u0010\b\u001a\u0004\b\u001c\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001f"}, d2 = {"Lqw4$a;", "", "Lqw4;", "Default", "I", "a", "()I", "getDefault-eUduSuo$annotations", "()V", "None", e.a, "getNone-eUduSuo$annotations", "Go", c.a, "getGo-eUduSuo$annotations", "Search", "g", "getSearch-eUduSuo$annotations", "Send", Image.TYPE_HIGH, "getSend-eUduSuo$annotations", "Previous", "f", "getPrevious-eUduSuo$annotations", "Next", DateTokenConverter.CONVERTER_KEY, "getNext-eUduSuo$annotations", "Done", "b", "getDone-eUduSuo$annotations", "<init>", "ui-text_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: qw4$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return qw4.c;
        }

        public final int b() {
            return qw4.j;
        }

        public final int c() {
            return qw4.e;
        }

        public final int d() {
            return qw4.i;
        }

        public final int e() {
            return qw4.d;
        }

        public final int f() {
            return qw4.h;
        }

        public final int g() {
            return qw4.f;
        }

        public final int h() {
            return qw4.g;
        }
    }

    private /* synthetic */ qw4(int i2) {
        this.a = i2;
    }

    public static final /* synthetic */ qw4 i(int i2) {
        return new qw4(i2);
    }

    public static boolean k(int i2, Object obj) {
        if (!(obj instanceof qw4) || i2 != ((qw4) obj).o()) {
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
        if (l(i2, d)) {
            return "None";
        }
        if (l(i2, c)) {
            return "Default";
        }
        if (l(i2, e)) {
            return "Go";
        }
        if (l(i2, f)) {
            return "Search";
        }
        if (l(i2, g)) {
            return "Send";
        }
        if (l(i2, h)) {
            return "Previous";
        }
        if (l(i2, i)) {
            return "Next";
        }
        if (l(i2, j)) {
            return "Done";
        }
        return "Invalid";
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
