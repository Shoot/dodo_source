package defpackage;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: LineBreak.android.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087@\u0018\u0000 \u001b2\u00020\u0001:\u0004\f\u001b\u001a\u0018B$\b\u0016\u0012\u0006\u0010\u0011\u001a\u00020\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0012\u0012\u0006\u0010\u0017\u001a\u00020\u0015ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019B\u0014\b\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0007J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u0011\u001a\u00020\u000f8Fø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0007R\u001a\u0010\u0014\u001a\u00020\u00128Fø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0007R\u001a\u0010\u0017\u001a\u00020\u00158Fø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0007\u0088\u0001\u000e\u0092\u0001\u00020\u0005ø\u0001\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001c"}, d2 = {"Lvp5;", "", "", "j", "(I)Ljava/lang/String;", "", "i", "(I)I", "other", "", e.a, "(ILjava/lang/Object;)Z", "a", "I", "mask", "Lvp5$b;", "f", "strategy", "Lvp5$c;", "g", "strictness", "Lvp5$d;", Image.TYPE_HIGH, "wordBreak", DateTokenConverter.CONVERTER_KEY, "(III)I", com.huawei.hms.opendevice.c.a, "b", "ui-text_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: vp5  reason: default package */
/* loaded from: classes.dex */
public final class vp5 {
    public static final a b = new a(null);
    private static final int c;
    private static final int d;
    private static final int e;
    private final int a;

    /* compiled from: LineBreak.android.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR \u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\t"}, d2 = {"Lvp5$a;", "", "Lvp5;", "Simple", "I", "a", "()I", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: vp5$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return vp5.c;
        }
    }

    static {
        b.a aVar = b.b;
        int c2 = aVar.c();
        c.a aVar2 = c.b;
        int c3 = aVar2.c();
        d.a aVar3 = d.b;
        c = d(c2, c3, aVar3.a());
        d = d(aVar.a(), aVar2.b(), aVar3.b());
        e = d(aVar.b(), aVar2.d(), aVar3.a());
    }

    private /* synthetic */ vp5(int i) {
        this.a = i;
    }

    public static final /* synthetic */ vp5 b(int i) {
        return new vp5(i);
    }

    public static int d(int i, int i2, int i3) {
        int e2;
        e2 = wp5.e(i, i2, i3);
        return c(e2);
    }

    public static boolean e(int i, Object obj) {
        if (!(obj instanceof vp5) || i != ((vp5) obj).k()) {
            return false;
        }
        return true;
    }

    public static final int f(int i) {
        int f;
        f = wp5.f(i);
        return b.e(f);
    }

    public static final int g(int i) {
        int g;
        g = wp5.g(i);
        return c.f(g);
    }

    public static final int h(int i) {
        int h;
        h = wp5.h(i);
        return d.d(h);
    }

    public static String j(int i) {
        return "LineBreak(strategy=" + ((Object) b.i(f(i))) + ", strictness=" + ((Object) c.j(g(i))) + ", wordBreak=" + ((Object) d.h(h(i))) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public boolean equals(Object obj) {
        return e(this.a, obj);
    }

    public int hashCode() {
        return i(this.a);
    }

    public final /* synthetic */ int k() {
        return this.a;
    }

    public String toString() {
        return j(this.a);
    }

    /* compiled from: LineBreak.android.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087@\u0018\u0000 \u00102\u00020\u0001:\u0001\fB\u0014\b\u0000\u0012\u0006\u0010\u000e\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0007J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r\u0088\u0001\u000e\u0092\u0001\u00020\u0005ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Lvp5$b;", "", "", "i", "(I)Ljava/lang/String;", "", Image.TYPE_HIGH, "(I)I", "other", "", "f", "(ILjava/lang/Object;)Z", "a", "I", "value", e.a, "b", "ui-text_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: vp5$b */
    /* loaded from: classes.dex */
    public static final class b {
        public static final a b = new a(null);
        private static final int c = e(1);
        private static final int d = e(2);
        private static final int e = e(3);
        private final int a;

        /* compiled from: LineBreak.android.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fR \u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R \u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R \u0010\t\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\r"}, d2 = {"Lvp5$b$a;", "", "Lvp5$b;", "Simple", "I", com.huawei.hms.opendevice.c.a, "()I", "HighQuality", "b", "Balanced", "a", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
        /* renamed from: vp5$b$a */
        /* loaded from: classes.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final int a() {
                return b.e;
            }

            public final int b() {
                return b.d;
            }

            public final int c() {
                return b.c;
            }
        }

        private /* synthetic */ b(int i) {
            this.a = i;
        }

        public static final /* synthetic */ b d(int i) {
            return new b(i);
        }

        public static boolean f(int i, Object obj) {
            if (!(obj instanceof b) || i != ((b) obj).j()) {
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
                return "Strategy.Simple";
            }
            if (g(i, d)) {
                return "Strategy.HighQuality";
            }
            if (g(i, e)) {
                return "Strategy.Balanced";
            }
            return "Invalid";
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

    /* compiled from: LineBreak.android.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087@\u0018\u0000 \u00102\u00020\u0001:\u0001\fB\u0014\b\u0000\u0012\u0006\u0010\u000e\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0007J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r\u0088\u0001\u000e\u0092\u0001\u00020\u0005ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Lvp5$c;", "", "", "j", "(I)Ljava/lang/String;", "", "i", "(I)I", "other", "", "g", "(ILjava/lang/Object;)Z", "a", "I", "value", "f", "b", "ui-text_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: vp5$c */
    /* loaded from: classes.dex */
    public static final class c {
        public static final a b = new a(null);
        private static final int c = f(1);
        private static final int d = f(2);
        private static final int e = f(3);
        private static final int f = f(4);
        private final int a;

        /* compiled from: LineBreak.android.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eR \u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R \u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R \u0010\t\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006R \u0010\u000b\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000f"}, d2 = {"Lvp5$c$a;", "", "Lvp5$c;", "Default", "I", "a", "()I", "Loose", "b", "Normal", com.huawei.hms.opendevice.c.a, "Strict", DateTokenConverter.CONVERTER_KEY, "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
        /* renamed from: vp5$c$a */
        /* loaded from: classes.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final int a() {
                return c.c;
            }

            public final int b() {
                return c.d;
            }

            public final int c() {
                return c.e;
            }

            public final int d() {
                return c.f;
            }
        }

        private /* synthetic */ c(int i) {
            this.a = i;
        }

        public static final /* synthetic */ c e(int i) {
            return new c(i);
        }

        public static boolean g(int i, Object obj) {
            if (!(obj instanceof c) || i != ((c) obj).k()) {
                return false;
            }
            return true;
        }

        public static final boolean h(int i, int i2) {
            if (i == i2) {
                return true;
            }
            return false;
        }

        public static String j(int i) {
            if (h(i, c)) {
                return "Strictness.None";
            }
            if (h(i, d)) {
                return "Strictness.Loose";
            }
            if (h(i, e)) {
                return "Strictness.Normal";
            }
            if (h(i, f)) {
                return "Strictness.Strict";
            }
            return "Invalid";
        }

        public boolean equals(Object obj) {
            return g(this.a, obj);
        }

        public int hashCode() {
            return i(this.a);
        }

        public final /* synthetic */ int k() {
            return this.a;
        }

        public String toString() {
            return j(this.a);
        }

        public static int f(int i) {
            return i;
        }

        public static int i(int i) {
            return i;
        }
    }

    /* compiled from: LineBreak.android.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087@\u0018\u0000 \u00102\u00020\u0001:\u0001\fB\u0014\b\u0000\u0012\u0006\u0010\u000e\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0007J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r\u0088\u0001\u000e\u0092\u0001\u00020\u0005ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Lvp5$d;", "", "", Image.TYPE_HIGH, "(I)Ljava/lang/String;", "", "g", "(I)I", "other", "", e.a, "(ILjava/lang/Object;)Z", "a", "I", "value", DateTokenConverter.CONVERTER_KEY, "b", "ui-text_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: vp5$d */
    /* loaded from: classes.dex */
    public static final class d {
        public static final a b = new a(null);
        private static final int c = d(1);
        private static final int d = d(2);
        private final int a;

        /* compiled from: LineBreak.android.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR \u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R \u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000b"}, d2 = {"Lvp5$d$a;", "", "Lvp5$d;", "Default", "I", "a", "()I", "Phrase", "b", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
        /* renamed from: vp5$d$a */
        /* loaded from: classes.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final int a() {
                return d.c;
            }

            public final int b() {
                return d.d;
            }
        }

        private /* synthetic */ d(int i) {
            this.a = i;
        }

        public static final /* synthetic */ d c(int i) {
            return new d(i);
        }

        public static boolean e(int i, Object obj) {
            if (!(obj instanceof d) || i != ((d) obj).i()) {
                return false;
            }
            return true;
        }

        public static final boolean f(int i, int i2) {
            if (i == i2) {
                return true;
            }
            return false;
        }

        public static String h(int i) {
            if (f(i, c)) {
                return "WordBreak.None";
            }
            if (f(i, d)) {
                return "WordBreak.Phrase";
            }
            return "Invalid";
        }

        public boolean equals(Object obj) {
            return e(this.a, obj);
        }

        public int hashCode() {
            return g(this.a);
        }

        public final /* synthetic */ int i() {
            return this.a;
        }

        public String toString() {
            return h(this.a);
        }

        public static int d(int i) {
            return i;
        }

        public static int g(int i) {
            return i;
        }
    }

    private static int c(int i) {
        return i;
    }

    public static int i(int i) {
        return i;
    }
}
